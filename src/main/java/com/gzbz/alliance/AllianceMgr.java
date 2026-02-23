package com.gzbz.alliance;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import cn.hutool.core.collection.ConcurrentHashSet;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.alliance.part.AlliancePart;
import com.gzbz.battle.BattleArraying;
import com.gzbz.db.AllianceRecordDao;
import com.gzbz.db.AllianceTeamDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.TeamBattleVsRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.AllianceMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossAllianceMsg;
import com.gzbz.protobuf.RankMsg;
import com.gzbz.robot.RobotData;
import com.gzbz.robot.bean.MonsterMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.ComparatorUtil;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@MgrAnno
@Component
public class AllianceMgr extends GameMgr {
   private static final Logger LOGGER = LoggerFactory.getLogger(AllianceMgr.class);
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private MailWorldMgr mailWorldMgr;
   public final Map<Integer, Integer> playerTeamMap = new ConcurrentHashMap();
   public final Map<Integer, Set<Integer>> playerInviteTeamMap = new ConcurrentHashMap();
   public final Map<Integer, Set<Integer>> playerApplyTeamMap = new ConcurrentHashMap();
   public int status;
   public int endTime;

   protected void init() throws Exception {
   }

   public void initData() {
      this.pushTaskEx("allianceInitData", new Object[0]);
   }

   @TaskMethod
   public void allianceInitData() {
      Map<Integer, AllianceTeamDao> allianceTeamDaoMap = this.getAllianceTeamMap();

      for(AllianceTeamDao allianceTeamDao : allianceTeamDaoMap.values()) {
         for(int playerId : allianceTeamDao.players.keySet()) {
            this.playerTeamMap.put(playerId, allianceTeamDao.teamId);
         }

         for(int playerId : allianceTeamDao.invitePlayers) {
            ((Set)MapUtil.computeIfAbsent(this.playerInviteTeamMap, playerId, ConcurrentHashSet.class)).add(allianceTeamDao.teamId);
         }

         for(int playerId : allianceTeamDao.applyPlayers) {
            ((Set)MapUtil.computeIfAbsent(this.playerApplyTeamMap, playerId, ConcurrentHashSet.class)).add(allianceTeamDao.teamId);
         }
      }

   }

   @MsgHandlerAnno
   public void CR2S_ServerInit_11807(CrossAllianceMsg.CR2S_ServerInit_11807 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.status = msg.getStatus();
      this.endTime = msg.getEndTime();
      if (this.status != 0 && this.endTime != 0) {
         log.info("【合纵连横】整个赛季开始时间【{}】,赛季结束时间【{}】", DateUtil.transferLongToDate((long)msg.getSeasonStartTime() * 1000L), DateUtil.transferLongToDate((long)msg.getSeasonEndTime() * 1000L));
         Map<Integer, AllianceTeamDao> allianceTeamDaoMap = this.getAllianceTeamMap();
         if (!msg.getIsGm()) {
            for(AllianceTeamDao teamDao : allianceTeamDaoMap.values()) {
               if (teamDao.createTime != 0 && (teamDao.createTime < msg.getSeasonStartTime() || teamDao.createTime > msg.getSeasonEndTime())) {
                  for(int playerId : teamDao.players.keySet()) {
                     this.playerTeamMap.remove(playerId);
                  }

                  log.error("合纵连横队伍【{}】不是当期队伍,创建队伍时间【{}】,移除该队伍", teamDao.name, DateUtil.transferLongToDate((long)teamDao.createTime * 1000L));
                  this.gameCachePool.deleteDao(teamDao, false);
               }
            }
         }

         switch (this.status) {
            case 1:
               LOGGER.info("【合纵连横】进入休赛期,赛期结束时间:{}", DateUtil.transferLongToDate((long)this.endTime * 1000L));
               this.playerTeamMap.clear();
               this.playerInviteTeamMap.clear();
               this.playerApplyTeamMap.clear();
               this.gameCachePool.deleteAll("tb_alliance_record");
               this.gameCachePool.deleteAll("tb_alliance_team");
               break;
            case 2:
               LOGGER.info("【合纵连横】进入结盟期,赛期结束时间:{}", DateUtil.transferLongToDate((long)this.endTime * 1000L));
               break;
            case 3:
               LOGGER.info("【合纵连横】进入比赛期,赛期结束时间:{}", DateUtil.transferLongToDate((long)this.endTime * 1000L));
               this.pushTask(() -> {
                  int initIntegral = ApplicationContextProvider.getConfigInt("teamBattle1stScore", 1000);

                  for(AllianceTeamDao allianceTeamDao : allianceTeamDaoMap.values()) {
                     if (!allianceTeamDao.isSign) {
                        GamePlayer captainPlayer = this.worldMgr.getPlayerById(allianceTeamDao.captain);
                        if (captainPlayer != null) {
                           this.sign(captainPlayer, allianceTeamDao, false, initIntegral);
                        }
                     }
                  }

               });
               break;
            case 4:
               LOGGER.info("【合纵连横】进入结算期,积分排行奖励,赛期结束时间:{}", DateUtil.transferLongToDate((long)this.endTime * 1000L));
               break;
            case 5:
               Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               CentreAwardModel centreAwardModel = (CentreAwardModel)((TreeMap)centreAwardMap.get(CentreAwardModel.TYPE_ALLIANCE_FIGHT)).lastEntry().getValue();
               LOGGER.info("【合纵连横】进入展示期,结算战斗次数奖励,赛期结束时间:{}", DateUtil.transferLongToDate((long)this.endTime * 1000L));
               Map<Integer, TeamBattleVsRewardModel> teamBattleVsRewardModelMap = ApplicationContextProvider.<Integer, TeamBattleVsRewardModel>getModelPoolMap("teamBattleVsReward");
               List<TeamBattleVsRewardModel> teamBattleVsRewardModels = new ArrayList(teamBattleVsRewardModelMap.values());
               Collections.sort(teamBattleVsRewardModels, ComparatorUtil.createComparatorByMethod(TeamBattleVsRewardModel.class, "getChallengeTime"));
               Map<String, Map<Integer, String>> offlineRewardMap = new HashMap();

               for(AllianceTeamDao allianceTeamDao : allianceTeamDaoMap.values()) {
                  for(Integer playerId : allianceTeamDao.players.keySet()) {
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                     if (gamePlayer != null) {
                        StringBuilder rewardKey = new StringBuilder();
                        List<ResourceModel> resourceModelList = new ArrayList();

                        for(TeamBattleVsRewardModel teamBattleVsRewardModel : teamBattleVsRewardModels) {
                           if (teamBattleVsRewardModel.getChallengeTime() > MiscUtil.getHiParam(allianceTeamDao.challengeCount)) {
                              break;
                           }

                           int rewards = (Integer)MapUtil.getOrDefault(allianceTeamDao.rewards, playerId, 0);
                           if (rewards <= 0 || !MiscUtil.existBit((long)rewards, teamBattleVsRewardModel.getId())) {
                              allianceTeamDao.rewards.put(playerId, MiscUtil.setBit(rewards, teamBattleVsRewardModel.getId()));
                              rewardKey.append(teamBattleVsRewardModel.getId()).append("-");

                              for(ResourceModel resourceModel : teamBattleVsRewardModel.getReward()) {
                                 resourceModel.addResourceToList(resourceModelList);
                              }
                           }
                        }

                        if (gamePlayer.isLogin()) {
                           if (!resourceModelList.isEmpty()) {
                              String format = MessageFormat.format(centreAwardModel.getDesc(), MiscUtil.getHiParam(allianceTeamDao.challengeCount));
                              MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                              mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, resourceModelList, 604800000L, 51, 5101});
                           }
                        } else if (rewardKey.length() != 0) {
                           ((Map)MapUtil.computeIfAbsent(offlineRewardMap, rewardKey.deleteCharAt(rewardKey.length() - 1).toString(), HashMap.class)).put(playerId, String.valueOf(MiscUtil.getHiParam(allianceTeamDao.challengeCount)));
                        }
                     }
                  }

                  allianceTeamDao.updateOp();
               }

               for(Map.Entry<String, Map<Integer, String>> entry : offlineRewardMap.entrySet()) {
                  List<ResourceModel> resourceModelList = new ArrayList();
                  String[] rewardKeyArr = ((String)entry.getKey()).split("-");

                  for(String rewardKeyStr : rewardKeyArr) {
                     TeamBattleVsRewardModel teamBattleVsRewardModel = (TeamBattleVsRewardModel)ApplicationContextProvider.getModelPoolEntity("teamBattleVsReward", Integer.parseInt(rewardKeyStr));

                     for(ResourceModel resourceModel : teamBattleVsRewardModel.getReward()) {
                        resourceModel.addResourceToList(resourceModelList);
                     }
                  }

                  this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModelList, (Map)entry.getValue(), 604800000L, 51, 5101, 0);
               }
               break;
            default:
               LOGGER.error("【合纵连横】未知赛期!!,结束时间:{}", DateUtil.transferLongToDate((long)this.endTime * 1000L));
         }

         AllianceMsg.S2C_StatusChangeNotify_11656.Builder notifyMsg = AllianceMsg.S2C_StatusChangeNotify_11656.newBuilder();
         OnLineMgr onLineMgr = (OnLineMgr)ApplicationContextProvider.getContext().getBean(OnLineMgr.class);
         onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notifyMsg.build()});
      }
   }

   @MsgHandlerAnno
   public void CR2S_AllianceSign_11802(CrossAllianceMsg.CR2S_AllianceSign_11802 msg, CrossSubscribeMsg crossSubscribeMsg) {
      AllianceTeamDao allianceTeamDao = this.getAllianceTeam(msg.getTeamId());
      if (allianceTeamDao != null) {
         allianceTeamDao.isSign = !msg.getIsCancel();
         allianceTeamDao.challengeCount = MiscUtil.comboInteger(0, (Integer)this.configManager.getIntList("fightNum").get(0));
         allianceTeamDao.updateOp();
         this.sendAllianceInfo(allianceTeamDao.players.keySet());
      }
   }

   @MsgHandlerAnno
   public void CR2S_TeamBeChallenge_11813(CrossAllianceMsg.CR2S_TeamBeChallenge_11813 msg, CrossSubscribeMsg crossSubscribeMsg) {
      AllianceTeamDao allianceTeamDao = this.getAllianceTeam(msg.getTeamId());
      if (allianceTeamDao != null) {
         AllianceMsg.TeamBattleRecordInfo teamBattleRecordInfo = msg.getRecordInfo();
         Map<Integer, AllianceRecordDao> allianceRecordMap = this.getAllianceRecordMap(allianceTeamDao.teamId);
         if (!allianceRecordMap.containsKey(teamBattleRecordInfo.getGroupId())) {
            this.addRecord(allianceTeamDao, teamBattleRecordInfo);
            this.sendChallengeResult(allianceTeamDao, allianceTeamDao.teamId, msg.getIntegral(), msg.getRank());
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_RankReward_11816(CrossAllianceMsg.CR2S_RankReward_11816 msg, CrossSubscribeMsg crossSubscribeMsg) {
      Map<Integer, RankMsg.RankData> rankDataMap = new HashMap();

      for(RankMsg.RankData rankData : msg.getRanksList()) {
         rankDataMap.put(rankData.getPlayerId(), rankData);
      }

      List<Integer> teamList = new ArrayList();
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> allianceRankMap = (TreeMap)centreAwardMap.get(CentreAwardModel.TYPE_ALLIANCE_RANK);

      for(CentreAwardModel centreAwardModel : allianceRankMap.values()) {
         Map<Integer, String> offlinePlayerRewardMap = new HashMap();
         Iterator<Map.Entry<Integer, RankMsg.RankData>> iterator = rankDataMap.entrySet().iterator();

         while(iterator.hasNext()) {
            RankMsg.RankData rankData = (RankMsg.RankData)((Map.Entry)iterator.next()).getValue();
            if (centreAwardModel.getMinRank() <= rankData.getRank() && centreAwardModel.getMaxRank() >= rankData.getRank()) {
               AllianceTeamDao allianceTeamDao = this.getAllianceTeam(rankData.getPlayerId());
               if (allianceTeamDao != null) {
                  for(Integer playerId : allianceTeamDao.players.keySet()) {
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                     if (gamePlayer != null && !gamePlayer.isRobot()) {
                        if (gamePlayer.isLogin()) {
                           MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                           String format = MessageFormat.format(centreAwardModel.getDesc(), rankData.getRank());
                           mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, centreAwardModel.getItems(), 604800000L, 51, 5102});
                        } else {
                           offlinePlayerRewardMap.put(playerId, String.valueOf(rankData.getRank()));
                        }

                        gamePlayer.getOperationMgr().addReceiveAwardNewLog(gamePlayer, 17, 0, centreAwardModel.getTitle(), String.valueOf(centreAwardModel.getId()), "-", 0, 0, 0);
                     }
                  }
               }

               teamList.add(rankData.getPlayerId());
               iterator.remove();
            }
         }

         if (!offlinePlayerRewardMap.isEmpty()) {
            this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), offlinePlayerRewardMap, 604800000L, 51, 5102, 0);
         }
      }

      if (msg.getNormal()) {
         CrossAllianceMsg.S2CR_RankReward_11817.Builder resp = CrossAllianceMsg.S2CR_RankReward_11817.newBuilder();
         resp.addAllTeamIds(teamList);
         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, resp.build());
      }

   }

   @MsgHandlerAnno
   public void CR2S_CreateRobot_11818(CrossAllianceMsg.CR2S_CreateRobot_11818 msg, CrossSubscribeMsg crossSubscribeMsg) {
      String[] robotScoreArr = ApplicationContextProvider.getConfigString("robotCount", "").split(",");

      for(String robotScore : robotScoreArr) {
         String[] scoreCountArr = robotScore.split("\\|");
         int score = Integer.parseInt(scoreCountArr[0]);
         int count = Integer.parseInt(scoreCountArr[1]);
         this.addRobot((GamePlayer)null, count, score);
      }

      log.info("收到跨服创建机器人通知");
   }

   public AllianceTeamDao createTeam(GamePlayer captainPlayer, String teamName, int powerLimit, int levelLimit, boolean verify) {
      if (this.status != 2 && this.status != 3) {
         captainPlayer.failure(51011);
         return null;
      } else {
         AllianceTeamDao allianceTeamDao = this.insertTeam(captainPlayer.getPlayerId(), teamName, powerLimit, levelLimit, verify);
         this.joinTeam(captainPlayer, allianceTeamDao);
         return allianceTeamDao;
      }
   }

   private AllianceTeamDao insertTeam(int captainId, String teamName, int powerLimit, int levelLimit, boolean verify) {
      AllianceTeamDao allianceTeamDao = new AllianceTeamDao();
      allianceTeamDao.captain = captainId;
      allianceTeamDao.name = teamName;
      allianceTeamDao.minPower = powerLimit;
      allianceTeamDao.minLevel = levelLimit;
      allianceTeamDao.needVerify = verify;
      allianceTeamDao.server = this.worldMgr.GAME_SERVER_ID;
      allianceTeamDao.createTime = DateUtil.getIntTime(System.currentTimeMillis());
      this.gameCachePool.insertDao(allianceTeamDao, true);
      return allianceTeamDao;
   }

   public boolean modifyTeam(GamePlayer captainPlayer, AllianceTeamDao allianceTeamDao, String teamName, int powerLimit, int levelLimit, boolean verify) {
      if (this.status != 2 && this.status != 3) {
         captainPlayer.failure(51011);
         return false;
      } else {
         allianceTeamDao.name = teamName;
         allianceTeamDao.minPower = powerLimit;
         allianceTeamDao.minLevel = levelLimit;
         allianceTeamDao.needVerify = verify;
         allianceTeamDao.updateOp();
         if (allianceTeamDao.isSign) {
            CrossAllianceMsg.S2CR_TeamNameChange_11819.Builder crossMsg = CrossAllianceMsg.S2CR_TeamNameChange_11819.newBuilder();
            crossMsg.setTeamId(allianceTeamDao.teamId);
            crossMsg.setTeamName(allianceTeamDao.name);
            this.crossNettyClient.sendCross(allianceTeamDao.server, 0, crossMsg.build());
         }

         return true;
      }
   }

   private boolean apply(GamePlayer applyPlayer, AllianceTeamDao allianceTeamDao) {
      if (!allianceTeamDao.needVerify) {
         int result = this.joinTeam(applyPlayer, allianceTeamDao);
         if (result != 1) {
            return applyPlayer.failure(result);
         }
      } else {
         allianceTeamDao.applyPlayers.add(applyPlayer.getPlayerId());
         ((Set)MapUtil.computeIfAbsent(this.playerApplyTeamMap, applyPlayer.getPlayerId(), ConcurrentHashSet.class)).add(allianceTeamDao.teamId);
         GamePlayer captainPlayer = this.worldMgr.getOnlinePlayer(allianceTeamDao.captain);
         if (captainPlayer != null) {
            AllianceMsg.S2C_TeamApplyNotify_11652.Builder notifyMsg = AllianceMsg.S2C_TeamApplyNotify_11652.newBuilder();
            notifyMsg.setApplyPlayer(applyPlayer.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_ARRAYING));
            captainPlayer.sendMsg(notifyMsg.build());
         }
      }

      allianceTeamDao.updateOp();
      return true;
   }

   public boolean handleApply(boolean isAgree, GamePlayer captainPlayer, GamePlayer applyPlayer, AllianceTeamDao allianceTeamDao) {
      if (isAgree) {
         int result = this.joinTeam(applyPlayer, allianceTeamDao);
         if (result != 1) {
            return captainPlayer.failure(result);
         }
      } else {
         allianceTeamDao.applyPlayers.remove(applyPlayer.getPlayerId());
         allianceTeamDao.invitePlayers.remove(applyPlayer.getPlayerId());
         ((Set)MapUtil.getOrDefault(this.playerApplyTeamMap, applyPlayer.getPlayerId(), ConcurrentHashSet.class)).remove(allianceTeamDao.teamId);
         allianceTeamDao.updateOp();
      }

      return true;
   }

   @TaskMethod
   public int joinTeam(GamePlayer joinPlayer, AllianceTeamDao allianceTeamDao) {
      if (this.status != 2 && this.status != 3) {
         return 51011;
      } else if (allianceTeamDao.players.size() >= 3) {
         return 51005;
      } else if (this.playerTeamMap.containsKey(joinPlayer.getPlayerId())) {
         return 51002;
      } else {
         this.playerInviteTeamMap.remove(joinPlayer.getPlayerId());
         this.playerTeamMap.put(joinPlayer.getPlayerId(), allianceTeamDao.teamId);
         this.playerApplyTeamMap.remove(joinPlayer.getPlayerId());
         allianceTeamDao.players.put(joinPlayer.getPlayerId(), false);
         if (allianceTeamDao.players.size() >= 3) {
            for(int playerId : allianceTeamDao.invitePlayers) {
               ((Set)MapUtil.getOrDefault(this.playerInviteTeamMap, playerId, ConcurrentHashSet.class)).remove(allianceTeamDao.teamId);
            }

            allianceTeamDao.invitePlayers.clear();
            allianceTeamDao.applyPlayers.clear();
         }

         allianceTeamDao.updateOp();

         for(AllianceTeamDao team : this.getAllianceTeamMap().values()) {
            boolean updateFlag = false;
            if (team.applyPlayers.contains(joinPlayer.getPlayerId())) {
               team.applyPlayers.remove(joinPlayer.getPlayerId());
               updateFlag = true;
            }

            if (team.invitePlayers.contains(joinPlayer.getPlayerId())) {
               team.invitePlayers.remove(joinPlayer.getPlayerId());
               updateFlag = true;
            }

            if (updateFlag) {
               team.updateOp();
            }
         }

         this.sendAllianceInfo(allianceTeamDao.players.keySet());
         return 1;
      }
   }

   public boolean kickOut(GamePlayer captainPlayer, GamePlayer beKickOutPlayer, AllianceTeamDao allianceTeamDao) {
      if (allianceTeamDao.isSign) {
         captainPlayer.failure(51012);
         return false;
      } else {
         return this.exitTeam(beKickOutPlayer, allianceTeamDao);
      }
   }

   private boolean exitTeam(GamePlayer exitPlayer, AllianceTeamDao allianceTeamDao) {
      if (allianceTeamDao.isSign) {
         exitPlayer.failure(51012);
         return false;
      } else {
         Set<Integer> players = new HashSet(allianceTeamDao.players.keySet());
         this.playerTeamMap.remove(exitPlayer.getPlayerId());
         allianceTeamDao.players.remove(exitPlayer.getPlayerId());
         if (exitPlayer.getPlayerId() == allianceTeamDao.captain) {
            if (allianceTeamDao.players.isEmpty()) {
               Iterator<Map.Entry<Integer, Set<Integer>>> iterator = this.playerInviteTeamMap.entrySet().iterator();

               while(iterator.hasNext()) {
                  Map.Entry<Integer, Set<Integer>> entry = (Map.Entry)iterator.next();
                  ((Set)entry.getValue()).remove(allianceTeamDao.teamId);
                  if (((Set)entry.getValue()).isEmpty()) {
                     iterator.remove();
                  }
               }

               this.gameCachePool.deleteDao(allianceTeamDao, false);
            } else if (allianceTeamDao.players.size() == 1) {
               Iterator var12 = allianceTeamDao.players.keySet().iterator();
               if (var12.hasNext()) {
                  int playerId = (Integer)var12.next();
                  allianceTeamDao.captain = playerId;
                  allianceTeamDao.updateOp();
               }
            } else {
               int biggerPowerPlayer = 0;
               long biggerPower = 0L;

               for(int playerId : allianceTeamDao.players.keySet()) {
                  GamePlayer player = this.worldMgr.getPlayerById(playerId);
                  long power = player.getPlayerCombatPower();
                  if (power > biggerPower) {
                     biggerPower = power;
                     biggerPowerPlayer = playerId;
                  }
               }

               if (biggerPowerPlayer > 0) {
                  allianceTeamDao.captain = biggerPowerPlayer;
                  allianceTeamDao.updateOp();
               }
            }
         }

         this.sendAllianceInfo(players);
         return true;
      }
   }

   @TaskMethod
   public void invite(GamePlayer invitePlayer, AllianceTeamDao allianceTeamDao) {
      if (allianceTeamDao.players.size() < 3) {
         ((Set)MapUtil.computeIfAbsent(this.playerInviteTeamMap, invitePlayer.getPlayerId(), ConcurrentHashSet.class)).add(allianceTeamDao.teamId);
         allianceTeamDao.invitePlayers.add(invitePlayer.getPlayerId());
         allianceTeamDao.updateOp();
         if (invitePlayer.isLogin()) {
            AllianceMsg.S2C_TeamInviteNotify_11654.Builder notifyMsg = AllianceMsg.S2C_TeamInviteNotify_11654.newBuilder();
            notifyMsg.setInviteTeam(this.buildTeamMsg(allianceTeamDao));
            invitePlayer.sendMsg(notifyMsg.build());
         }

      }
   }

   private boolean sign(GamePlayer captainPlayer, AllianceTeamDao allianceTeamDao, boolean isCancel, int integral) {
      if (this.status != 2 && this.status != 3) {
         captainPlayer.failure(51011);
         return false;
      } else if (this.status == 2 && allianceTeamDao.players.size() != 3) {
         captainPlayer.failure(51013);
         return false;
      } else {
         CrossAllianceMsg.S2CR_AllianceSign_11801.Builder msg = CrossAllianceMsg.S2CR_AllianceSign_11801.newBuilder();
         long power = 0L;
         long captainPower = 0L;
         if (!isCancel) {
            if (allianceTeamDao.isSign) {
               captainPlayer.failure(51015);
               return false;
            }

            for(Integer playerId : allianceTeamDao.players.keySet()) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
               if (gamePlayer != null) {
                  CrossAllianceMsg.SignArrayingInfo.Builder arrayingData = CrossAllianceMsg.SignArrayingInfo.newBuilder();
                  if (!gamePlayer.isRobot()) {
                     gamePlayer.uploadCrossPlayer();
                  } else {
                     PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
                     AllianceMsg.TeamPlayerInfo.Builder robotInfo = AllianceMsg.TeamPlayerInfo.newBuilder();
                     robotInfo.setMonarchId(playerPublicDao.monarchId);
                     robotInfo.setPlayerName(playerPublicDao.playerName);
                     robotInfo.setPower(playerPublicDao.combat_power);
                     robotInfo.setHeadFrame(playerPublicDao.headFrame);
                     robotInfo.setLevel(playerPublicDao.lv);
                     robotInfo.setPlayerId(playerPublicDao.playerId);
                     robotInfo.setHead(playerPublicDao.head);
                     arrayingData.setRobot(robotInfo);
                  }

                  ArrayingMirror arrayingMirror = gamePlayer.getPlayerArraying(BattleArraying.ALLIANCE.getArrayingType());
                  if (arrayingMirror != null) {
                     if (playerId == captainPlayer.getPlayerId()) {
                        captainPower = arrayingMirror.power;
                     }

                     power += arrayingMirror.power;
                     arrayingData.setArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
                     arrayingData.setPlayerId(playerId);
                     arrayingData.setIsHide((Boolean)allianceTeamDao.players.get(playerId));
                     msg.addArrayingList(arrayingData);
                  }
               }
            }

            if (power <= 0L) {
               captainPlayer.failure(0);
               return false;
            }

            int playerCount = allianceTeamDao.players.size();
            if (playerCount < 3) {
               MonsterMgr monsterMgr = (MonsterMgr)ApplicationContextProvider.getContext().getBean(MonsterMgr.class);
               WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

               for(int i = 0; i < 3 - playerCount; ++i) {
                  RobotData robotData = monsterMgr.getRobotData(Math.max(10000L, captainPower / 10L), Math.max(20000L, captainPower / 9L), worldMgr.getWorldLv());
                  robotData.player = i + 1;
                  allianceTeamDao.robots.put(robotData.player, robotData);
                  allianceTeamDao.players.put(robotData.player, false);
                  CrossAllianceMsg.SignArrayingInfo.Builder arrayingData = CrossAllianceMsg.SignArrayingInfo.newBuilder();
                  arrayingData.setArrayingData(ByteString.copyFrom(((ArrayingMirror)robotData.parseArrayingMirror().get(0)).toByteArray()));
                  arrayingData.setPlayerId(robotData.player);
                  arrayingData.setIsHide(false);
                  AllianceMsg.TeamPlayerInfo.Builder robotInfo = AllianceMsg.TeamPlayerInfo.newBuilder();
                  robotInfo.setMonarchId(robotData.monarchId);
                  robotInfo.setPlayerName(robotData.name);
                  robotInfo.setPower((long)robotData.power);
                  robotInfo.setHeadFrame(robotData.headFrame);
                  robotInfo.setLevel(robotData.lv);
                  robotInfo.setPlayerId(robotData.player);
                  robotInfo.setHead(robotData.head);
                  arrayingData.setRobot(robotInfo);
                  msg.addArrayingList(arrayingData);
                  power += (long)robotData.power;
               }

               for(int playerId : allianceTeamDao.invitePlayers) {
                  ((Set)MapUtil.getOrDefault(this.playerInviteTeamMap, playerId, ConcurrentHashSet.class)).remove(allianceTeamDao.teamId);
               }

               allianceTeamDao.invitePlayers.clear();
               allianceTeamDao.applyPlayers.clear();
               allianceTeamDao.updateOp();
               this.sendAllianceInfo(allianceTeamDao.players.keySet());
            }
         }

         msg.setIntegral(integral);
         msg.setIsCancel(isCancel);
         msg.setPower(power);
         msg.setTeamId(allianceTeamDao.teamId);
         msg.setCaptain(allianceTeamDao.captain);
         msg.setTeamName(allianceTeamDao.name);
         this.crossNettyClient.sendCross(allianceTeamDao.server, captainPlayer.getPlayerId(), msg.build());
         return true;
      }
   }

   private void getCrossTeamInfo(int playerId, int teamId) {
      CrossAllianceMsg.S2CR_AllianceTeamInfo_11804.Builder msg = CrossAllianceMsg.S2CR_AllianceTeamInfo_11804.newBuilder();
      msg.setTeamId(teamId);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, playerId, msg.build());
   }

   @TaskMethod
   public void sendAllianceInfo(GamePlayer player) {
      AllianceMsg.S2C_AllianceMain_11602.Builder resp = AllianceMsg.S2C_AllianceMain_11602.newBuilder();
      resp.setStatus(this.status);
      resp.setEndTime(this.endTime);
      resp.setIsSign(false);
      resp.setChallengeCount(0);
      resp.setRecoverTime(0);
      resp.setFightNum(0);
      int teamId = (Integer)MapUtil.getOrDefault(this.playerTeamMap, player.getPlayerId(), 0);
      if (this.status != 1) {
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao != null) {
            if (allianceTeamDao.isSign) {
               CrossAllianceMsg.S2CR_TeamInfo_11814.Builder msg = CrossAllianceMsg.S2CR_TeamInfo_11814.newBuilder();
               msg.setTeamId(allianceTeamDao.teamId);
               this.crossNettyClient.sendCross(allianceTeamDao.server, player.getPlayerId(), msg.build());
               return;
            }

            if (this.status == 3) {
               this.checkChallengeCountRecover(allianceTeamDao);
            }

            AllianceMsg.TeamInfo teamBuilder = this.buildTeamMsg(allianceTeamDao);
            resp.setMyTeam(teamBuilder);
            resp.setIsSign(allianceTeamDao.isSign);
            resp.setChallengeCount(MiscUtil.getLowParam(allianceTeamDao.challengeCount));
            resp.setRecoverTime(allianceTeamDao.recoverTime);
            resp.setFightNum(MiscUtil.getHiParam(allianceTeamDao.challengeCount));
            int rewards = (Integer)MapUtil.getOrDefault(allianceTeamDao.rewards, player.getPlayerId(), 0);
            resp.addAllGotRewards(MiscUtil.getBitPos((long)rewards));
         }
      }

      player.sendMsg(resp.build());
   }

   public void checkChallengeCountRecover(AllianceTeamDao allianceTeamDao) {
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      int recoverTime = this.configManager.getIntDefault("recoverTime", 7200);
      List<Integer> fightNum = this.configManager.getIntList("fightNum");
      if (allianceTeamDao.challengeCount == -1L) {
         allianceTeamDao.challengeCount = MiscUtil.comboInteger(0, (Integer)fightNum.get(0));
         allianceTeamDao.updateOp();
      }

      int challengeCount = MiscUtil.getLowParam(allianceTeamDao.challengeCount);
      int totalChallengeCount = MiscUtil.getHiParam(allianceTeamDao.challengeCount);
      if (challengeCount < (Integer)fightNum.get(1)) {
         if (allianceTeamDao.recoverTime == 0) {
            allianceTeamDao.recoverTime = curTime + recoverTime;
         } else {
            while(allianceTeamDao.recoverTime < curTime && challengeCount < (Integer)fightNum.get(1)) {
               allianceTeamDao.recoverTime += recoverTime;
               ++challengeCount;
            }

            if (challengeCount >= (Integer)fightNum.get(1)) {
               allianceTeamDao.recoverTime = 0;
            }

            allianceTeamDao.challengeCount = MiscUtil.comboInteger(totalChallengeCount, challengeCount);
         }
      } else {
         allianceTeamDao.recoverTime = 0;
      }

      allianceTeamDao.updateOp();
   }

   public AllianceMsg.TeamInfo buildTeamMsg(int teamId) {
      return this.buildTeamMsg(this.getAllianceTeam(teamId));
   }

   public AllianceMsg.TeamInfo buildTeamMsg(AllianceTeamDao allianceTeamDao) {
      if (allianceTeamDao == null) {
         return null;
      } else {
         AllianceMsg.TeamInfo.Builder teamBuilder = AllianceMsg.TeamInfo.newBuilder();
         teamBuilder.setCaptain(allianceTeamDao.captain);
         teamBuilder.setRank(0);
         teamBuilder.setServer(allianceTeamDao.server);
         teamBuilder.setTeamName(allianceTeamDao.name);
         teamBuilder.setIntegral(1000);
         teamBuilder.setPowerLimit(allianceTeamDao.minPower);
         teamBuilder.setLevelLimit(allianceTeamDao.minLevel);
         teamBuilder.setVerify(allianceTeamDao.needVerify);
         long totalPower = 0L;

         for(int playerId : allianceTeamDao.players.keySet()) {
            AllianceMsg.TeamPlayerInfo.Builder playerInfo = AllianceMsg.TeamPlayerInfo.newBuilder();
            playerInfo.setIsHide((Boolean)allianceTeamDao.players.get(playerId));
            ArrayingMirror arrayingMirror;
            if (allianceTeamDao.robots.containsKey(playerId)) {
               RobotData robotData = (RobotData)allianceTeamDao.robots.get(playerId);
               playerInfo.setPlayerId(robotData.player);
               playerInfo.setPlayerName(robotData.name);
               playerInfo.setLevel(robotData.lv);
               playerInfo.setHead(robotData.head);
               playerInfo.setHeadFrame(robotData.headFrame);
               arrayingMirror = (ArrayingMirror)robotData.parseArrayingMirror().get(0);
            } else {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
               if (gamePlayer == null) {
                  continue;
               }

               PlayerPublicDao playerDao = gamePlayer.getPublicDao();
               playerInfo.setPlayerId(playerId);
               playerInfo.setPlayerName(playerDao.playerName);
               playerInfo.setLevel(playerDao.lv);
               playerInfo.setHead(playerDao.head);
               playerInfo.setHeadFrame(playerDao.headFrame);
               arrayingMirror = gamePlayer.getPlayerArraying(BattleArraying.ALLIANCE.getArrayingType());
            }

            playerInfo.setArraying(arrayingMirror.toPlayerArrayingInfo());
            playerInfo.setPower(arrayingMirror.power);
            totalPower += arrayingMirror.power;
            teamBuilder.addPlayerList(playerInfo);
         }

         teamBuilder.setPower(totalPower);
         teamBuilder.setTeamId(allianceTeamDao.teamId);
         return teamBuilder.build();
      }
   }

   public void requestCrossInit() {
      CrossAllianceMsg.S2CR_ServerInit_11806.Builder msg = CrossAllianceMsg.S2CR_ServerInit_11806.newBuilder();
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, msg.build());
   }

   public void requestRank(int player, int teamId) {
      CrossAllianceMsg.S2CR_AllianceRank_11805.Builder msg = CrossAllianceMsg.S2CR_AllianceRank_11805.newBuilder();
      msg.setTeamId(teamId);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, player, msg.build());
   }

   private void requestChallengeTeamList(GamePlayer gamePlayer, AllianceTeamDao allianceTeamDao) {
      CrossAllianceMsg.S2CR_AllianceChallengeTeams_11803.Builder msg = CrossAllianceMsg.S2CR_AllianceChallengeTeams_11803.newBuilder();
      msg.setTeamId(allianceTeamDao.teamId);
      this.crossNettyClient.sendCross(allianceTeamDao.server, gamePlayer.getPlayerId(), msg.build());
   }

   @TaskMethod
   public void allianceUploadArraying(GamePlayer player) {
      if (this.status == 3) {
         ArrayingMirror arrayingMirror = player.getPlayerArraying(BattleArraying.ALLIANCE.getArrayingType());
         if (this.playerTeamMap.containsKey(arrayingMirror.playerId)) {
            AllianceTeamDao allianceTeamDao = this.getAllianceTeam((Integer)this.playerTeamMap.get(arrayingMirror.playerId));
            if (allianceTeamDao != null) {
               CrossAllianceMsg.S2CR_UploadArraying_11820.Builder msg = CrossAllianceMsg.S2CR_UploadArraying_11820.newBuilder();
               msg.setTeamId(allianceTeamDao.teamId);
               msg.setArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
               this.crossNettyClient.sendCross(allianceTeamDao.server, arrayingMirror.playerId, msg.build());
            }
         }
      }
   }

   public List<AllianceTeamDao> getAllianceTeams(String teamName) {
      Map<Integer, AllianceTeamDao> allianceTeamDaoMap = this.getAllianceTeamMap();
      List<AllianceTeamDao> results = new ArrayList();
      if (!StringUtils.isEmpty(teamName)) {
         for(AllianceTeamDao allianceTeamDao : allianceTeamDaoMap.values()) {
            if (allianceTeamDao.name.contains(teamName)) {
               results.add(allianceTeamDao);
            }
         }
      } else {
         results.addAll(allianceTeamDaoMap.values());
      }

      return results;
   }

   public AllianceTeamDao getAllianceTeam(int teamId) {
      Map<Integer, AllianceTeamDao> allianceTeamDaoMap = this.getAllianceTeamMap();
      return (AllianceTeamDao)allianceTeamDaoMap.get(teamId);
   }

   public boolean checkAllianceTeamIsExit(String teamName, int checkTeamId) {
      Map<Integer, AllianceTeamDao> allianceTeamDaoMap = this.getAllianceTeamMap();
      if (allianceTeamDaoMap.isEmpty()) {
         return false;
      } else {
         for(AllianceTeamDao allianceTeamDao : allianceTeamDaoMap.values()) {
            if (allianceTeamDao.name.toLowerCase().equals(teamName.toLowerCase()) && allianceTeamDao.teamId != checkTeamId) {
               return true;
            }
         }

         return false;
      }
   }

   private void crossTeamArrayingSave(List<AllianceMsg.TeamPlayerHideInfo> teamPlayerHideInfoList, AllianceTeamDao allianceTeamDao) {
      CrossAllianceMsg.S2CR_TeamArrayingSave_11808.Builder msg = CrossAllianceMsg.S2CR_TeamArrayingSave_11808.newBuilder();
      msg.setTeamId(allianceTeamDao.teamId);
      msg.addAllPlayerList(teamPlayerHideInfoList);
      this.crossNettyClient.sendCross(allianceTeamDao.server, allianceTeamDao.captain, msg.build());
   }

   public void enterChallenge(int playerId, int challengeTeamId, boolean isSkip, AllianceTeamDao allianceTeamDao) {
      CrossAllianceMsg.S2CR_TeamChallenge_11810.Builder msg = CrossAllianceMsg.S2CR_TeamChallenge_11810.newBuilder();
      msg.setTeamId(allianceTeamDao.teamId);
      msg.setChallengeTeamId(challengeTeamId);
      msg.setIsSkip(isSkip);

      for(int teamPlayerId : allianceTeamDao.players.keySet()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById(teamPlayerId);
         if (gamePlayer != null) {
            gamePlayer.uploadCrossPlayer();
         }
      }

      TreeMap<Integer, AllianceRecordDao> allianceRecordDao = new TreeMap(this.getAllianceRecordMap(allianceTeamDao.teamId));
      msg.setGroupId(allianceRecordDao.isEmpty() ? 1 : (Integer)allianceRecordDao.lastKey() + 1);
      this.crossNettyClient.sendCross(allianceTeamDao.server, playerId, msg.build());
   }

   public void nextChallenge(BattleDao battleDao, AllianceTeamDao allianceTeamDao, int recordId) {
      CrossAllianceMsg.S2CR_TeamChallenge_11810.Builder msg = CrossAllianceMsg.S2CR_TeamChallenge_11810.newBuilder();
      msg.setTeamId(allianceTeamDao.teamId);
      msg.setChallengeTeamId((Integer)battleDao.params.get(0));
      msg.setIsSkip(battleDao.isSkip);
      if (battleDao.scene.getBattleMsg() == null) {
         LOGGER.error("战斗-->{}进入【合纵连横】第{}波战斗,配置ID:{},战斗ID:{},战斗消息不存在", new Object[]{battleDao.playerId, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
      } else {
         int groupId = battleDao.scene.getBattleMsg().getSetId();
         msg.setGroupId(groupId);
         TreeMap<Integer, AllianceRecordDao> allianceRecordDao = new TreeMap(this.getAllianceRecordMap(allianceTeamDao.teamId));
         if (!allianceRecordDao.containsKey(groupId)) {
            LOGGER.error("战斗-->{}进入【合纵连横】第{}波战斗,配置ID:{},战斗ID:{},战斗录像不存在", new Object[]{battleDao.playerId, battleDao.scene.getWave(), battleDao.modelId, battleDao.scene.getBattleId()});
         } else {
            msg.setRecordId(recordId);
            this.crossNettyClient.sendCross(allianceTeamDao.server, battleDao.playerId, msg.build());
         }
      }
   }

   public void gmChangeStatus(GamePlayer player, int status) {
      List<Integer> params = new ArrayList();
      params.add(status);
      this.crossGm(player, "changeStatus", params);
   }

   public void gmSetChallengeCount(GamePlayer player, int count) {
      int teamId = (Integer)MapUtil.getOrDefault(this.playerTeamMap, player.getPlayerId(), 0);
      AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
      if (allianceTeamDao != null) {
         allianceTeamDao.challengeCount = MiscUtil.comboInteger(MiscUtil.getHiParam(allianceTeamDao.challengeCount), count);
         allianceTeamDao.updateOp();
         this.checkChallengeCountRecover(allianceTeamDao);
         this.sendAllianceInfo(player);
      }
   }

   public void gmSetTeamIntegral(GamePlayer player, int integral) {
      Integer teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
      if (teamId == null) {
         player.failure(51003);
      } else {
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao != null && allianceTeamDao.isSign) {
            List<Integer> params = new ArrayList();
            params.add(teamId);
            params.add(integral);
            this.crossGm(player, "setIntegral", params);
         } else {
            player.failure(51017);
         }
      }
   }

   public void addRobot(GamePlayer player, int count, int integral) {
      List<GamePlayer> robotPlayers = new ArrayList();
      if (player == null) {
         for(GamePlayer robot : this.worldMgr.getAllPlayer()) {
            if (robot.isRobot() && !this.playerTeamMap.containsKey(robot.getPlayerId())) {
               PlayerDao playerDao = robot.getPlayerDao();
               if (playerDao.type == 5) {
                  robotPlayers.add(robot);
               }
            }
         }
      } else {
         for(GamePlayer robot : this.worldMgr.getAllPlayer()) {
            if (robot.isRobot() && !this.playerTeamMap.containsKey(robot.getPlayerId())) {
               robotPlayers.add(robot);
            }
         }
      }

      for(int teamIndex = 0; teamIndex < count; ++teamIndex) {
         if (robotPlayers.size() < 3) {
            if (player != null) {
               player.failure(0);
            }

            LOGGER.warn("合纵连横进入比赛期,创建机器人数量不足以创建");
            return;
         }

         GamePlayer captainRobot = (GamePlayer)robotPlayers.remove(0);
         PlayerPublicDao captainRobotDao = captainRobot.getPublicDao();
         AllianceTeamDao allianceTeamDao = this.createTeam(captainRobot, captainRobotDao.playerName, 0, 0, false);
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)captainRobot.getMgrPart(HeroArrayingPart.class);
         if (heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_ALLIANCE).isEmpty()) {
            heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_ALLIANCE);
         }

         for(int robotIndex = 0; robotIndex < 2; ++robotIndex) {
            GamePlayer joinRobot = (GamePlayer)robotPlayers.remove(0);
            this.joinTeam(joinRobot, allianceTeamDao);
            heroArrayingPart = (HeroArrayingPart)joinRobot.getMgrPart(HeroArrayingPart.class);
            if (heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_ALLIANCE).isEmpty()) {
               heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_ALLIANCE);
            }
         }

         this.sign(captainRobot, allianceTeamDao, false, integral);
      }

   }

   public void addRandomTeam(GamePlayer player, int count) {
      List<GamePlayer> players = new ArrayList();

      for(GamePlayer gamePlayer : this.worldMgr.getAllPlayer()) {
         if (!gamePlayer.isRobot() && !this.playerTeamMap.containsKey(gamePlayer.getPlayerId())) {
            PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
            if (!StringUtils.isEmpty(playerPublicDao.playerName) && playerPublicDao.lv >= 50) {
               players.add(gamePlayer);
            }
         }
      }

      for(int teamIndex = 0; teamIndex < count; ++teamIndex) {
         if (players.size() < 3) {
            if (player != null) {
               player.failure(0);
            }

            LOGGER.warn("合纵连横进入比赛期,创建队伍数量不足以创建");
            return;
         }

         GamePlayer captainPlayer = (GamePlayer)players.remove(0);
         PlayerPublicDao captainPlayerDao = captainPlayer.getPublicDao();
         AllianceTeamDao allianceTeamDao = this.createTeam(captainPlayer, captainPlayerDao.playerName, 0, 0, false);
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)captainPlayer.getMgrPart(HeroArrayingPart.class);
         if (heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_ALLIANCE).isEmpty()) {
            heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_ALLIANCE);
         }

         for(int robotIndex = 0; robotIndex < 2; ++robotIndex) {
            GamePlayer joinPlayer = (GamePlayer)players.remove(0);
            this.joinTeam(joinPlayer, allianceTeamDao);
            heroArrayingPart = (HeroArrayingPart)joinPlayer.getMgrPart(HeroArrayingPart.class);
            if (heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_ALLIANCE).isEmpty()) {
               heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_ALLIANCE);
            }
         }

         this.sign(captainPlayer, allianceTeamDao, false, 1000);
      }

   }

   public void randomChallenge() {
      List<AllianceTeamDao> allianceTeamDaoList = new ArrayList(this.getAllianceTeamMap().values());

      for(int i = 0; i < allianceTeamDaoList.size() / 2; ++i) {
         AllianceTeamDao challengeTeam = (AllianceTeamDao)allianceTeamDaoList.get(i);
         AllianceTeamDao beChallengeTeam = (AllianceTeamDao)allianceTeamDaoList.get(i);
         GamePlayer captainPlayer = this.worldMgr.getPlayerById(challengeTeam.captain);
         if (captainPlayer != null) {
            BattlePart battlePart = (BattlePart)captainPlayer.getMgrPart(BattlePart.class);
            BattleMsg.C2S_BattleBegin_6107.Builder builder = BattleMsg.C2S_BattleBegin_6107.newBuilder();
            builder.setType(2030);
            builder.addParams(beChallengeTeam.teamId);
            builder.setIsSkip(true);
            battlePart.begin(builder.build(), "");
         }
      }

   }

   public void gmClearRobot() {
      for(AllianceTeamDao allianceTeamDao : this.getAllianceTeamMap().values()) {
         boolean robotTeam = false;
         Set<Integer> players = allianceTeamDao.players.keySet();

         for(int playerId : players) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            if (gamePlayer != null && gamePlayer.isRobot()) {
               robotTeam = true;
               break;
            }
         }

         if (robotTeam) {
            GamePlayer captainRobot = this.worldMgr.getPlayerById(allianceTeamDao.captain);
            allianceTeamDao.isSign = false;
            allianceTeamDao.updateOp();
            this.sign(captainRobot, allianceTeamDao, true, 0);

            for(int playerId : players) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
               this.exitTeam(gamePlayer, allianceTeamDao);
            }
         }
      }

   }

   private void crossGm(GamePlayer player, String cmd, List<Integer> params) {
      CrossAllianceMsg.S2CR_AllianceGm_11812.Builder msg = CrossAllianceMsg.S2CR_AllianceGm_11812.newBuilder();
      msg.setCmd(cmd);
      msg.addAllParams(params);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, player.getPlayerId(), msg.build());
   }

   public void sendAllianceInfo(Set<Integer> players) {
      for(int playerId : players) {
         GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(playerId);
         if (gamePlayer != null) {
            this.sendAllianceInfo(gamePlayer);
         }
      }

   }

   public void sendChallengeResult(AllianceTeamDao allianceTeamDao, int teamId, int integral, int rank) {
      AllianceMsg.S2C_TeamChallenge_11650.Builder msg = AllianceMsg.S2C_TeamChallenge_11650.newBuilder();
      msg.setIntegral(integral);
      msg.setRank(rank);
      msg.setTeamId(teamId);
      msg.setChallengeCount(MiscUtil.getLowParam(allianceTeamDao.challengeCount));
      msg.setRecoverTime(allianceTeamDao.recoverTime);
      msg.setFightNum(MiscUtil.getHiParam(allianceTeamDao.challengeCount));

      for(int playerId : allianceTeamDao.players.keySet()) {
         GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(playerId);
         if (gamePlayer != null) {
            gamePlayer.sendMsg(msg.build());
         }
      }

   }

   public void addRecord(AllianceTeamDao allianceTeamDao, AllianceMsg.TeamBattleRecordInfo teamBattleRecordInfo) {
      AllianceRecordDao allianceRecordDao = new AllianceRecordDao();
      allianceRecordDao.teamId = allianceTeamDao.teamId;
      allianceRecordDao.recordTime = teamBattleRecordInfo.getRecordTime();
      allianceRecordDao.recordId = teamBattleRecordInfo.getRecordId();
      allianceRecordDao.groupId = teamBattleRecordInfo.getGroupId();
      if (!teamBattleRecordInfo.getTeamInfoListList().isEmpty()) {
         allianceRecordDao.leftTeam = teamBattleRecordInfo.getTeamInfoList(0).toByteArray();
         if (teamBattleRecordInfo.getTeamInfoListList().size() > 1) {
            allianceRecordDao.rightTeam = teamBattleRecordInfo.getTeamInfoList(1).toByteArray();
         }
      }

      this.gameCachePool.insertDao(allianceRecordDao);
      AllianceMsg.S2C_ChallengeRecord_11648.Builder msg = AllianceMsg.S2C_ChallengeRecord_11648.newBuilder();
      msg.setRecord(teamBattleRecordInfo);

      for(int playerId : allianceTeamDao.players.keySet()) {
         GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(playerId);
         if (gamePlayer != null) {
            gamePlayer.sendMsg(msg.build());
         }
      }

      Map<Integer, AllianceRecordDao> allianceRecordDaoMap = new TreeMap(this.getAllianceRecordMap(allianceTeamDao.teamId));
      if (allianceRecordDaoMap.size() > 10) {
         int index = allianceRecordDaoMap.size();

         for(AllianceRecordDao deleteRecordDao : allianceRecordDaoMap.values()) {
            this.gameCachePool.deleteDao(deleteRecordDao, false);
            --index;
            if (index <= 10) {
               break;
            }
         }
      }

   }

   public Map<Integer, AllianceRecordDao> getAllianceRecordMap(int team) {
      return this.gameCachePool.getMap("tb_alliance_record", new Object[]{team});
   }

   private Map<Integer, AllianceTeamDao> getAllianceTeamMap() {
      return this.gameCachePool.getAllTableByMap("tb_alliance_team");
   }

   private AllianceTeamDao getPlayerTeam(GamePlayer player) {
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(51003);
         return null;
      } else {
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam((Integer)this.playerTeamMap.get(player.getPlayerId()));
         if (allianceTeamDao == null) {
            player.failure(51003);
            return null;
         } else {
            return allianceTeamDao;
         }
      }
   }

   private AllianceTeamDao checkCaptain(GamePlayer player) {
      AllianceTeamDao allianceTeamDao = this.getPlayerTeam(player);
      if (allianceTeamDao == null) {
         return null;
      } else if (allianceTeamDao.captain != player.getPlayerId()) {
         player.failure(51004);
         return null;
      } else {
         return allianceTeamDao;
      }
   }

   @TaskMethod
   public void allianceReqCreateTeam(GamePlayer player, String teamName, int powerLimit, int levelLimit, boolean verify) {
      if (this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(51002);
      } else if (this.checkAllianceTeamIsExit(teamName, 0)) {
         player.failure(51001);
      } else {
         AllianceTeamDao allianceTeamDao = this.createTeam(player, teamName, powerLimit, levelLimit, verify);
         if (allianceTeamDao == null) {
            player.failure(0);
         } else {
            AllianceMsg.S2C_CreateTeam_11608.Builder resp = AllianceMsg.S2C_CreateTeam_11608.newBuilder();
            resp.setMyTeam(this.buildTeamMsg(allianceTeamDao));
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void allianceReqModifyTeam(GamePlayer player, String teamName, int powerLimit, int levelLimit, boolean verify) {
      AllianceTeamDao allianceTeamDao = this.checkCaptain(player);
      if (allianceTeamDao != null) {
         if (this.checkAllianceTeamIsExit(teamName, allianceTeamDao.teamId)) {
            player.failure(51001);
         } else if (this.modifyTeam(player, allianceTeamDao, teamName, powerLimit, levelLimit, verify)) {
            AllianceMsg.S2C_ModifyTeam_11610.Builder resp = AllianceMsg.S2C_ModifyTeam_11610.newBuilder();
            resp.setTeamName(teamName);
            resp.setPowerLimit(powerLimit);
            resp.setLevelLimit(levelLimit);
            resp.setVerify(verify);
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void allianceReqApplyList(GamePlayer player) {
      AllianceTeamDao allianceTeamDao = this.checkCaptain(player);
      if (allianceTeamDao != null) {
         AllianceMsg.S2C_TeamApplyList_11612.Builder resp = AllianceMsg.S2C_TeamApplyList_11612.newBuilder();

         for(int playerId : allianceTeamDao.applyPlayers) {
            GamePlayer applyPlayer = this.worldMgr.getPlayerById(playerId);
            if (applyPlayer != null) {
               resp.addApplyPlayerList(applyPlayer.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_ARRAYING));
            }
         }

         player.sendMsg(resp.build());
      }
   }

   @TaskMethod
   public void allianceReqInvitePlayerList(GamePlayer player, String playerName) {
      AllianceTeamDao allianceTeamDao = this.checkCaptain(player);
      if (allianceTeamDao != null) {
         AllianceMsg.S2C_TeamInvitePlayerList_11614.Builder resp = AllianceMsg.S2C_TeamInvitePlayerList_11614.newBuilder();

         for(GamePlayer gamePlayer : this.worldMgr.getOnlinePlayer()) {
            if (gamePlayer.getPlayerId() != player.getPlayerId() && gamePlayer.isSystemOpen(2030) && !this.playerTeamMap.containsKey(gamePlayer.getPlayerId())) {
               PlayerDao playerDao = gamePlayer.getPlayerDao();
               if (!StringUtils.isEmpty(playerDao.playerName)) {
                  if (!StringUtils.isEmpty(playerName)) {
                     resp.setPlayerName(playerName);
                     if (!playerDao.playerName.contains(playerName)) {
                        continue;
                     }
                  }

                  resp.addInvitePlayerList(gamePlayer.toPlayerInfo(CommonMsg.HeroState.HERO_STATE_ARRAYING));
               }
            }
         }

         resp.addAllInvitedPlayerIds(allianceTeamDao.invitePlayers);
         player.sendMsg(resp.build());
      }
   }

   @TaskMethod
   public void allianceReqOpApply(GamePlayer player, int applyPlayerId, boolean isAgree) {
      AllianceTeamDao allianceTeamDao = this.checkCaptain(player);
      if (allianceTeamDao != null) {
         if (allianceTeamDao.players.size() >= 3) {
            allianceTeamDao.invitePlayers.clear();
            allianceTeamDao.applyPlayers.clear();
            allianceTeamDao.updateOp();
            player.failure(51005);
         } else {
            GamePlayer applyPlayer = this.worldMgr.getPlayerById(applyPlayerId);
            if (applyPlayer == null) {
               player.failure(17);
            } else if (!applyPlayer.isSystemOpen(2030)) {
               player.failure(51006);
            } else if (isAgree && this.playerTeamMap.containsKey(applyPlayer.getPlayerId())) {
               player.failure(51010);
            } else if (this.handleApply(isAgree, player, applyPlayer, allianceTeamDao)) {
               AllianceMsg.S2C_CaptainApplyOp_11616.Builder resp = AllianceMsg.S2C_CaptainApplyOp_11616.newBuilder();
               resp.setIsAgree(isAgree);
               resp.setPlayerId(applyPlayer.getPlayerId());
               player.sendMsg(resp.build());
            }
         }
      }
   }

   @TaskMethod
   public void allianceReqInvitePlayer(GamePlayer player, int invitePlayerId) {
      AllianceTeamDao allianceTeamDao = this.checkCaptain(player);
      if (allianceTeamDao != null) {
         GamePlayer invitePlayer = this.worldMgr.getPlayerById(invitePlayerId);
         if (invitePlayer == null) {
            player.failure(17);
         } else if (!invitePlayer.isSystemOpen(2030)) {
            player.failure(51006);
         } else if (this.playerTeamMap.containsKey(invitePlayer.getPlayerId())) {
            player.failure(51010);
         } else if (this.status != 2 && this.status != 3) {
            player.failure(51011);
         } else {
            invitePlayer.pushPartTaskEx(AlliancePart.class, "checkInvite", new Object[]{allianceTeamDao});
            AllianceMsg.S2C_CaptainInvite_11618.Builder resp = AllianceMsg.S2C_CaptainInvite_11618.newBuilder();
            resp.setPlayerId(invitePlayerId);
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void allianceReqApply(GamePlayer player, int lv, long power, int teamId) {
      if (this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.failure(51002);
      } else {
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao == null) {
            player.failure(51007);
         } else if (allianceTeamDao.players.size() >= 3) {
            player.failure(51005);
         } else {
            List<Integer> lvLimitList = this.configManager.getIntList("teamLevelLimit");
            List<Integer> powerLimitList = this.configManager.getIntList("teamPowerLimit");
            if (lv < (Integer)lvLimitList.get(allianceTeamDao.minLevel)) {
               player.failure(51009);
            } else if (power < (long)(Integer)powerLimitList.get(allianceTeamDao.minPower)) {
               player.failure(51008);
            } else if (this.apply(player, allianceTeamDao)) {
               AllianceMsg.S2C_TeamApply_11620.Builder resp = AllianceMsg.S2C_TeamApply_11620.newBuilder();
               resp.setTeamId(teamId);
               player.sendMsg(resp.build());
            }
         }
      }
   }

   @TaskMethod
   public void allianceReqAgreeInvite(GamePlayer player, int teamId, boolean isAgree) {
      AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
      if (allianceTeamDao == null) {
         player.failure(51007);
      } else {
         if (!isAgree) {
            allianceTeamDao.applyPlayers.remove(player.getPlayerId());
            allianceTeamDao.invitePlayers.remove(player.getPlayerId());
            ((Set)MapUtil.getOrDefault(this.playerInviteTeamMap, player.getPlayerId(), ConcurrentHashSet.class)).remove(allianceTeamDao.teamId);
            ((Set)MapUtil.getOrDefault(this.playerApplyTeamMap, player.getPlayerId(), ConcurrentHashSet.class)).remove(allianceTeamDao.teamId);
            allianceTeamDao.updateOp();
         } else {
            int result = this.joinTeam(player, allianceTeamDao);
            if (result != 1) {
               player.failure(result);
               return;
            }
         }

         AllianceMsg.S2C_TeamAgreeInvite_11622.Builder resp = AllianceMsg.S2C_TeamAgreeInvite_11622.newBuilder();
         resp.setTeamId(teamId);
         resp.setIsAgree(isAgree);
         player.sendMsg(resp.build());
      }
   }

   @TaskMethod
   public void allianceReqExitTeam(GamePlayer player) {
      AllianceTeamDao allianceTeamDao = this.getPlayerTeam(player);
      if (allianceTeamDao != null) {
         if (this.exitTeam(player, allianceTeamDao)) {
            GamePlayer captainPlayer = this.worldMgr.getOnlinePlayer(allianceTeamDao.captain);
            if (captainPlayer != null) {
               captainPlayer.failure(51024);
            }

            AllianceMsg.S2C_TeamExit_11624.Builder resp = AllianceMsg.S2C_TeamExit_11624.newBuilder();
            resp.setTeamId(allianceTeamDao.teamId);
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void allianceReqKickOut(GamePlayer player, int beKickOutPlayerId) {
      AllianceTeamDao allianceTeamDao = this.checkCaptain(player);
      if (allianceTeamDao != null) {
         GamePlayer beKickOutPlayer = this.worldMgr.getPlayerById(beKickOutPlayerId);
         if (beKickOutPlayer == null) {
            player.failure(17);
         } else if (!allianceTeamDao.players.containsKey(beKickOutPlayer.getPlayerId())) {
            player.failure(51021);
         } else if (this.kickOut(player, beKickOutPlayer, allianceTeamDao)) {
            beKickOutPlayer.failure(51023);
            AllianceMsg.S2C_TeamKickOut_11626.Builder resp = AllianceMsg.S2C_TeamKickOut_11626.newBuilder();
            resp.setPlayerId(beKickOutPlayerId);
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void allianceReqSign(GamePlayer player, boolean isCancel) {
      AllianceTeamDao allianceTeamDao = this.checkCaptain(player);
      if (allianceTeamDao != null) {
         int initIntegral = ApplicationContextProvider.getConfigInt("teamBattle1stScore", 1000);
         if (this.sign(player, allianceTeamDao, isCancel, initIntegral)) {
            AllianceMsg.S2C_TeamSign_11628.Builder resp = AllianceMsg.S2C_TeamSign_11628.newBuilder();
            resp.setIsCancel(isCancel);
            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void allianceReqChallengeList(GamePlayer player) {
      AllianceTeamDao allianceTeamDao = this.getPlayerTeam(player);
      if (allianceTeamDao != null) {
         if (!allianceTeamDao.isSign) {
            player.failure(51017);
         } else {
            this.requestChallengeTeamList(player, allianceTeamDao);
         }
      }
   }

   @TaskMethod
   public void allianceReqTeamInfo(GamePlayer player, int teamId) {
      AllianceTeamDao allianceTeamDao = this.getPlayerTeam(player);
      if (allianceTeamDao != null) {
         if (!allianceTeamDao.isSign) {
            player.failure(51017);
         } else {
            this.getCrossTeamInfo(player.getPlayerId(), teamId);
         }
      }
   }

   @TaskMethod
   public void allianceReqSaveArraying(GamePlayer player, List<AllianceMsg.TeamPlayerHideInfo> playerHideInfos) {
      AllianceTeamDao allianceTeamDao = this.checkCaptain(player);
      if (allianceTeamDao != null) {
         if (playerHideInfos.size() != allianceTeamDao.players.size()) {
            player.failure(0);
         } else {
            LinkedHashMap<Integer, Boolean> teamPlayerMap = new LinkedHashMap();

            for(AllianceMsg.TeamPlayerHideInfo teamPlayerHideInfo : playerHideInfos) {
               if (!allianceTeamDao.players.containsKey(teamPlayerHideInfo.getPlayerId())) {
                  player.failure(51021);
                  return;
               }

               teamPlayerMap.put(teamPlayerHideInfo.getPlayerId(), teamPlayerHideInfo.getIsHide());
            }

            allianceTeamDao.players = teamPlayerMap;
            allianceTeamDao.updateOp();
            if (allianceTeamDao.isSign) {
               this.crossTeamArrayingSave(playerHideInfos, allianceTeamDao);
            } else {
               AllianceMsg.S2C_TeamArrayingSave_11636.Builder resp = AllianceMsg.S2C_TeamArrayingSave_11636.newBuilder();
               resp.addAllPlayerList(playerHideInfos);
               player.sendMsg(resp.build());
            }
         }
      }
   }

   @TaskMethod
   public void allianceReqClearInvite(GamePlayer player) {
      for(int teamId : MapUtil.getOrDefault(this.playerInviteTeamMap, player.getPlayerId(), ConcurrentHashSet.class)) {
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao != null) {
            allianceTeamDao.invitePlayers.remove(player.getPlayerId());
            allianceTeamDao.updateOp();
         }
      }

      this.playerInviteTeamMap.remove(player.getPlayerId());
      AllianceMsg.S2C_TeamInviteClear_11638.Builder resp = AllianceMsg.S2C_TeamInviteClear_11638.newBuilder();
      player.sendMsg(resp.build());
   }

   @TaskMethod
   public void allianceReqClearApplyList(GamePlayer player) {
      AllianceTeamDao allianceTeamDao = this.checkCaptain(player);
      if (allianceTeamDao != null) {
         allianceTeamDao.applyPlayers.clear();
         allianceTeamDao.updateOp();

         for(Set<Integer> applyTeams : this.playerApplyTeamMap.values()) {
            applyTeams.remove(allianceTeamDao.teamId);
         }

         AllianceMsg.S2C_TeamApplyClear_11640.Builder resp = AllianceMsg.S2C_TeamApplyClear_11640.newBuilder();
         player.sendMsg(resp.build());
      }
   }

   @TaskMethod
   public void allianceReqChallengeCountRecover(GamePlayer player) {
      if (this.playerTeamMap.containsKey(player.getPlayerId())) {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao != null) {
            if (allianceTeamDao.captain == player.getPlayerId()) {
               this.checkChallengeCountRecover(allianceTeamDao);
               AllianceMsg.S2C_ChallengeCountRecover_11642.Builder resp = AllianceMsg.S2C_ChallengeCountRecover_11642.newBuilder();
               resp.setChallengeCount(MiscUtil.getLowParam(allianceTeamDao.challengeCount));
               resp.setRecoverTime(allianceTeamDao.recoverTime);

               for(int playerId : allianceTeamDao.players.keySet()) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                  if (gamePlayer != null) {
                     gamePlayer.sendMsg(resp.build());
                  }
               }

            }
         }
      }
   }

   @TaskMethod
   public void allianceReqChallengeReward(GamePlayer player, int rewardId) {
      TeamBattleVsRewardModel teamBattleVsRewardModel = (TeamBattleVsRewardModel)ApplicationContextProvider.getModelPoolEntity("teamBattleVsReward", rewardId);
      if (teamBattleVsRewardModel == null) {
         player.failure(0);
      } else {
         AllianceTeamDao allianceTeamDao = this.getPlayerTeam(player);
         if (allianceTeamDao != null) {
            int rewards = (Integer)MapUtil.getOrDefault(allianceTeamDao.rewards, player.getPlayerId(), 0);
            if (MiscUtil.existBit((long)rewards, rewardId)) {
               player.failure(24);
            } else {
               int totalChallengeCount = MiscUtil.getHiParam(allianceTeamDao.challengeCount);
               if (totalChallengeCount < teamBattleVsRewardModel.getChallengeTime()) {
                  player.failure(41);
               } else {
                  allianceTeamDao.rewards.put(player.getPlayerId(), MiscUtil.setBit(rewards, rewardId));
                  allianceTeamDao.updateOp();
                  AlliancePart alliancePart = (AlliancePart)player.getMgrPart(AlliancePart.class);
                  alliancePart.pushTaskEx("alliancePartChallengeReward", new Object[]{teamBattleVsRewardModel});
               }
            }
         }
      }
   }

   @TaskMethod
   public void allianceReqOverBattle(int playerId) {
      if (this.playerTeamMap.containsKey(playerId)) {
         int teamId = (Integer)this.playerTeamMap.get(playerId);
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao != null) {
            allianceTeamDao.fighting = false;
            allianceTeamDao.updateOp();
         }
      }
   }

   @TaskMethod
   public void allianceRespChallengeReturn(GamePlayer player, int teamId, int integral, int rank, AllianceMsg.TeamBattleRecordInfo teamBattleRecordInfo) {
      AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
      BattlePart battlePart = (BattlePart)player.getMgrPart(BattlePart.class);
      if (allianceTeamDao == null) {
         battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, true, 51007});
      } else {
         try {
            int challengeCount = MiscUtil.getLowParam(allianceTeamDao.challengeCount);
            int totalChallengeCount = MiscUtil.getHiParam(allianceTeamDao.challengeCount);
            allianceTeamDao.challengeCount = MiscUtil.comboInteger(totalChallengeCount + 1, challengeCount - 1);
            allianceTeamDao.fighting = false;
            allianceTeamDao.updateOp();
            this.checkChallengeCountRecover(allianceTeamDao);
            this.sendChallengeResult(allianceTeamDao, allianceTeamDao.teamId, integral, rank);
            Map<Integer, AllianceRecordDao> allianceRecordMap = this.getAllianceRecordMap(teamId);
            if (!allianceRecordMap.containsKey(teamBattleRecordInfo.getGroupId())) {
               this.addRecord(allianceTeamDao, teamBattleRecordInfo);
            }

            for(Integer playerId : allianceTeamDao.players.keySet()) {
               if (playerId != player.getPlayerId()) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                  if (gamePlayer != null) {
                     gamePlayer.pushTaskEx("triggerTask", new Object[]{362, 0, 1, 1});
                  }
               }
            }
         } catch (Exception e) {
            e.printStackTrace();
            battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, true, 0});
         }

      }
   }

   @TaskMethod
   public void allianceReqChallengeRecords(GamePlayer player) {
      AllianceMsg.S2C_ChallengeRecords_11646.Builder resp = AllianceMsg.S2C_ChallengeRecords_11646.newBuilder();
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.sendMsg(resp.build());
      } else {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao == null) {
            player.sendMsg(resp.build());
         } else {
            for(AllianceRecordDao allianceRecordDao : this.getAllianceRecordMap(teamId).values()) {
               try {
                  AllianceMsg.TeamBattleRecordInfo.Builder recordInfo = AllianceMsg.TeamBattleRecordInfo.newBuilder();
                  recordInfo.setGroupId(allianceRecordDao.groupId);
                  recordInfo.setRecordId(allianceRecordDao.recordId);
                  recordInfo.addTeamInfoList(BattleMsg.S2C_Team_Info.parseFrom(allianceRecordDao.leftTeam));
                  recordInfo.addTeamInfoList(BattleMsg.S2C_Team_Info.parseFrom(allianceRecordDao.rightTeam));
                  recordInfo.setRecordTime(allianceRecordDao.recordTime);
                  resp.addRecordList(recordInfo);
               } catch (InvalidProtocolBufferException e) {
                  log.error("合纵连横:错误的挑战记录,{}", e.getMessage(), e);
               }
            }

            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void allianceRespCrossTeamInfo(GamePlayer player, CrossAllianceMsg.CR2S_TeamInfo_11815 msg) {
      AllianceMsg.S2C_AllianceMain_11602.Builder resp = AllianceMsg.S2C_AllianceMain_11602.newBuilder();
      resp.setStatus(this.status);
      resp.setEndTime(this.endTime);
      resp.setIsSign(false);
      resp.setChallengeCount(0);
      resp.setRecoverTime(0);
      resp.setFightNum(0);
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         player.sendMsg(resp.build());
      } else {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao == null) {
            player.sendMsg(resp.build());
         } else {
            this.checkChallengeCountRecover(allianceTeamDao);
            resp.setChallengeCount(MiscUtil.getLowParam(allianceTeamDao.challengeCount));
            resp.setRecoverTime(allianceTeamDao.recoverTime);
            resp.setFightNum(MiscUtil.getHiParam(allianceTeamDao.challengeCount));
            int rewards = (Integer)MapUtil.getOrDefault(allianceTeamDao.rewards, player.getPlayerId(), 0);
            resp.addAllGotRewards(MiscUtil.getBitPos((long)rewards));
            if (msg.hasTeamInfo()) {
               AllianceMsg.TeamInfo.Builder teamBuilder = msg.getTeamInfo().toBuilder();
               long totalPower = 0L;

               for(Integer playerId : allianceTeamDao.players.keySet()) {
                  AllianceMsg.TeamPlayerInfo.Builder playerInfo = AllianceMsg.TeamPlayerInfo.newBuilder();
                  playerInfo.setIsHide((Boolean)allianceTeamDao.players.get(playerId));
                  ArrayingMirror arrayingMirror;
                  if (allianceTeamDao.robots.containsKey(playerId)) {
                     RobotData robotData = (RobotData)allianceTeamDao.robots.get(playerId);
                     playerInfo.setPlayerId(playerId);
                     playerInfo.setPlayerName(robotData.name);
                     playerInfo.setLevel(robotData.lv);
                     playerInfo.setHead(robotData.head);
                     playerInfo.setHeadFrame(robotData.headFrame);
                     arrayingMirror = (ArrayingMirror)robotData.parseArrayingMirror().get(0);
                  } else {
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                     if (gamePlayer == null) {
                        continue;
                     }

                     PlayerPublicDao playerDao = gamePlayer.getPublicDao();
                     playerInfo.setPlayerId(playerDao.playerId);
                     playerInfo.setPlayerName(playerDao.playerName);
                     playerInfo.setLevel(playerDao.lv);
                     playerInfo.setHead(playerDao.head);
                     playerInfo.setHeadFrame(playerDao.headFrame);
                     arrayingMirror = gamePlayer.getPlayerArraying(BattleArraying.ALLIANCE.getArrayingType());
                  }

                  playerInfo.setArraying(arrayingMirror.toPlayerArrayingInfo());
                  playerInfo.setPower(arrayingMirror.power);
                  totalPower += arrayingMirror.power;
                  teamBuilder.addPlayerList(playerInfo);
               }

               teamBuilder.setPower(totalPower);
               resp.setMyTeam(teamBuilder);
               resp.setIsSign(true);
            }

            player.sendMsg(resp.build());
         }
      }
   }

   @TaskMethod
   public void allianceReqEnterBattle(GamePlayer player, int challengeTeamId, boolean isSkip) {
      BattlePart battlePart = (BattlePart)player.getMgrPart(BattlePart.class);
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, true, 51003});
      } else {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao == null) {
            battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, true, 51003});
         } else {
            if (allianceTeamDao.captain != player.getPlayerId()) {
               GamePlayer captainPlayer = this.worldMgr.getOnlinePlayer(allianceTeamDao.captain);
               int memberFightable = ApplicationContextProvider.getConfigInt("memberFightable", 0);
               int challengeCount = MiscUtil.getLowParam(allianceTeamDao.challengeCount);
               if (captainPlayer != null || challengeCount < memberFightable) {
                  battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, true, 51004});
                  return;
               }
            }

            if (!allianceTeamDao.isSign) {
               battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, true, 51017});
            } else if (this.status != 3) {
               battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, true, 51014});
            } else {
               int challengeCount = MiscUtil.getLowParam(allianceTeamDao.challengeCount);
               if (challengeCount <= 0) {
                  battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, true, 51018});
               } else if (allianceTeamDao.fighting) {
                  player.failure(45);
               } else {
                  allianceTeamDao.fighting = true;
                  allianceTeamDao.updateOp();

                  try {
                     this.enterChallenge(player.getPlayerId(), challengeTeamId, isSkip, allianceTeamDao);
                  } catch (Exception e) {
                     e.printStackTrace();
                     battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, true, 0});
                  }

               }
            }
         }
      }
   }

   @TaskMethod
   public void allianceReqNextBattle(GamePlayer player, BattleDao battleDao) {
      BattlePart battlePart = (BattlePart)player.getMgrPart(BattlePart.class);
      if (!this.playerTeamMap.containsKey(player.getPlayerId())) {
         battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, false, 44});
      } else {
         int teamId = (Integer)this.playerTeamMap.get(player.getPlayerId());
         AllianceTeamDao allianceTeamDao = this.getAllianceTeam(teamId);
         if (allianceTeamDao == null) {
            battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, false, 44});
         } else {
            Map<Integer, AllianceRecordDao> allianceRecordDaoMap = this.getAllianceRecordMap(teamId);
            int groupId = battleDao.scene.getBattleMsg().getSetId();
            if (!allianceRecordDaoMap.containsKey(groupId)) {
               battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, false, 44});
            } else if (battleDao.scene.getBattleMsg().getIsEnd()) {
               battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, false, 44});
            } else {
               try {
                  this.nextChallenge(battleDao, allianceTeamDao, battleDao.scene.getBattleMsg().getResult().getNextRecordId());
               } catch (Exception e) {
                  e.printStackTrace();
                  battlePart.pushTaskEx("sendBattleResult", new Object[]{2030, false, 44});
               }

            }
         }
      }
   }
}
