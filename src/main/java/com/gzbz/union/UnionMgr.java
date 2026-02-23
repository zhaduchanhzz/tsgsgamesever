package com.gzbz.union;

import allMgr.MgrAnno;
import cn.hutool.core.util.NumberUtil;
import com.github.luben.zstd.Zstd;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionApplyDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionLog;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.db.UnionRedPacketGetDao;
import com.gzbz.db.UnionRedPacketGiveDao;
import com.gzbz.db.UnionWarAttackLogDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.UnionTechnologyPlaceData;
import com.gzbz.gameDefine.ClientTrackingEnum;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.gamePlayer.tracking.ClientTrackingPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.RechargeModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.ShopUnionWarLvModel;
import com.gzbz.model.UnionAddNumberModel;
import com.gzbz.model.UnionCopyModel;
import com.gzbz.model.UnionHeadModel;
import com.gzbz.model.UnionLogModel;
import com.gzbz.model.UnionModel;
import com.gzbz.model.UnionRedPacketModel;
import com.gzbz.model.UnionTecModel;
import com.gzbz.model.UnionTecPlaceModel;
import com.gzbz.model.UnionWarActivityModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.CrossUnionWarMsg;
import com.gzbz.protobuf.UnionExtendMsg;
import com.gzbz.protobuf.UnionMsg;
import com.gzbz.protobuf.UnionWarMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.redis.GameRedisTool;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.UnionTaskPart;
import com.gzbz.task.UnionWarTaskPart;
import com.gzbz.union.bean.PlayerUnionExtend;
import com.gzbz.union.bean.UnionRedPacketRank;
import com.gzbz.union.bean.UnionWarAgainstData;
import com.gzbz.union.bean.UnionWarRankData;
import com.gzbz.union.bean.UnionWarStrongholdData;
import com.gzbz.union.part.UnionTechnologyPart;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import misc.CalculateUtil;
import misc.DateUtil;
import misc.MiscUtil;
import org.redisson.api.RScoredSortedSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import proto.SerializingUtil;

@Scope("prototype")
@Component
@MgrAnno
public class UnionMgr {
   private static final Logger log = LoggerFactory.getLogger(UnionMgr.class);
   private UnionDao unionDao;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private UnionMgrParent unionMgrParent;
   @Autowired
   private ChatMgr chatMgr;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private CrossNettyClient crossNettyClient;
   private LinkedHashMap<Integer, UnionRedPacketRank> redPacketRank = new LinkedHashMap();
   public LinkedHashMap<Integer, UnionWarRankData> warRank = new LinkedHashMap();
   private int warBoxSize = 0;
   private int warBoxId = 0;
   public boolean warIsMatch = false;
   private UnionWarAgainstData unionWarSignData = null;
   private Map<Integer, Long> activeMember = null;

   public void initData() {
      if (this.unionDao != null && this.unionDao.unionId > 0) {
         Map<Integer, UnionRedPacketGiveDao> unionRedPacketGiveDaoMap = this.getUnionRedPackets();
         unionRedPacketGiveDaoMap.keySet().forEach(this::getGotRedPacketRecord);
         this.getAttackLogs();
         this.getUnionLogList();
         this.getUnionAllApply();

         for(UnionMemberDao memberDao : this.getUnionMembers().values()) {
            if (memberDao.playerId >= 20000) {
               GamePlayer gamePlayer = this.getGamePlayer(memberDao.playerId);
               if (gamePlayer == null) {
                  log.error("军团成员:{}玩家信息不存在,移除军团成员", memberDao.playerId);
                  this.removeMember(memberDao);
               } else {
                  PlayerPublicDao publicDao = gamePlayer.getPublicDao();
                  if (publicDao.unionId == 0) {
                     gamePlayer.pushTask(() -> {
                        PlayerDao playerDao = gamePlayer.getPlayerDao();
                        playerDao.unionId = this.unionDao.unionId;
                        playerDao.updateOp();
                        log.error("军团成员【{}】,名称:【{}】,军团id为0,设置为军团【{}】,军团名:【{}】", new Object[]{memberDao.playerId, playerDao.playerName, this.unionDao.unionId, this.unionDao.unionName});
                     });
                  } else if (publicDao.unionId != memberDao.unionId) {
                     this.removeMember(memberDao);
                     log.error("军团成员【{}】,名称:【{}】,不在军团【{}】,军团名:【{}】,移除成员信息,当前所在军团:【{}】", new Object[]{memberDao.playerId, publicDao.playerName, this.unionDao.unionId, this.unionDao.unionName, publicDao.unionId});
                  } else {
                     if (memberDao.warStar > 0) {
                        this.warRank.put(memberDao.playerId, new UnionWarRankData(memberDao.warStar, memberDao.warRecord, publicDao.playerId, publicDao.playerName, publicDao.head, publicDao.lv));
                     }

                     if (memberDao.redPacketNum > 0) {
                        this.redPacketRank.put(memberDao.playerId, new UnionRedPacketRank(publicDao.playerName, memberDao.redPacketNum, memberDao.redPacketTotal));
                     }
                  }
               }
            }
         }

         this.sortedRedPacketRank();
         this.sortedWarRank();
         UnionCopyModel unionCopyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", this.unionDao.copyId);
         if (unionCopyModel != null) {
            long hp = unionCopyModel.getCopyMasterHp();
            if (this.unionDao.masterHp > hp) {
               this.unionDao.masterHp = hp;
               this.unionDao.updateOp();
            } else if (this.unionDao.masterHp <= 0L) {
               UnionCopyModel nextCopyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", unionCopyModel.getNextId());
               if (nextCopyModel == null) {
                  nextCopyModel = unionCopyModel;
               }

               this.unionDao.masterHp = nextCopyModel.getCopyMasterHp();
               this.unionDao.copyChallenge.clear();
               this.unionDao.copyId = nextCopyModel.getId();
               this.unionDao.updateOp();
               log.info("军团【{}】副本【{}】已通关,设置为下一关【{}】", new Object[]{this.unionDao.unionId, unionCopyModel.getId(), nextCopyModel.getId()});
            }
         }

         Map<Integer, UnionHeadModel> unionHeadModelMap = ApplicationContextProvider.<Integer, UnionHeadModel>getModelPoolMap("unionHead");
         if (unionHeadModelMap != null) {
            this.checkHeadUnlock(0, 0);
            this.checkHeadUnlock(101, 0);
            int unionHead = MiscUtil.getHiParam(this.unionDao.head);
            if (!unionHeadModelMap.containsKey(unionHead)) {
               TreeSet<Integer> unionHeadIds = new TreeSet(unionHeadModelMap.keySet());
               this.unionDao.head = MiscUtil.comboInteger((Integer)unionHeadIds.first(), 0);
               this.unionDao.updateOp();
            }
         }

      }
   }

   public void hourReset() {
      for(UnionRedPacketGiveDao giveDao : this.getUnionRedPackets().values()) {
         if (giveDao.giveTime + 86400000L <= System.currentTimeMillis()) {
            this.removeGiveRedPacket(giveDao);
         }
      }

   }

   public void dailyReset() {
      this.unionDao.recruitCount = 0;
      this.unionDao.donateProgress = 0;
      this.unionDao.memberTodayContribution.clear();
      this.unionDao.todayCopyChallenge = 0;
      this.unionDao.modifyDeclarationCount = 0;
      this.unionDao.finishActivate = false;
      this.unionDao.updateOp();
      this.sendUnion((GamePlayer)null);
   }

   public void updateCombatPower() {
      this.rankMgr.updateRank(RankDefine.RankModule.UNION_COMBAT_POWER, this.getCombatPower(), this.unionDao.unionId);
   }

   public long getCombatPower() {
      long totalCombatPower = 0L;

      for(UnionMemberDao unionMemberDao : this.getUnionMembers().values()) {
         totalCombatPower += this.getCombatPower(unionMemberDao.playerId);
      }

      return totalCombatPower;
   }

   private long getCombatPower(int memberId) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(memberId);
      return gamePlayer == null ? 0L : gamePlayer.getPlayerCombatPower();
   }

   public void joinUnion(GamePlayer gamePlayer, boolean isLeader) {
      UnionMemberDao memberDao = new UnionMemberDao();
      memberDao.position = isLeader ? 1 : 3;
      memberDao.playerId = gamePlayer.getPlayerId();
      memberDao.unionId = this.unionDao.unionId;
      memberDao.joinTime = System.currentTimeMillis();
      this.initUnionMemberTechnology(memberDao.playerId);
      PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
      this.unionMgrParent.getGameCachePool().insertDao(memberDao, true);
      gamePlayer.pushTask(() -> {
         PlayerDao playerDao = gamePlayer.getPlayerDao();
         playerDao.unionId = this.unionDao.unionId;
         playerDao.updateOp();
         gamePlayer.notifyPlayerData(PlayerDefine.PLAYER_UNION_ID, playerDao.unionId);
         UnionTaskPart unionTaskPart = (UnionTaskPart)gamePlayer.getMgrPart(UnionTaskPart.class);
         unionTaskPart.trigger();
         UnionWarTaskPart unionWarTaskPart = (UnionWarTaskPart)gamePlayer.getMgrPart(UnionWarTaskPart.class);
         unionWarTaskPart.trigger();
         gamePlayer.triggerTask(202, 0, 1L, 0);
         UnionTechnologyPart unionTechnologyPart = (UnionTechnologyPart)gamePlayer.getMgrPart(UnionTechnologyPart.class);
         unionTechnologyPart.flushTechnology();
         GamePlayer leaderPlayer = this.worldMgr.getPlayerById(this.unionDao.leaderId);
         PlayerPublicDao leaderDao = leaderPlayer.getPublicDao();
         gamePlayer.getOperationMgr().addExtraLog(gamePlayer, 108, this.unionDao.unionName, String.valueOf(this.unionDao.level), String.valueOf(this.getUnionMembers().size()), String.valueOf(leaderDao.playerId), leaderDao.playerName);
         gamePlayer.uploadCrossPlayer();
         ClientTrackingPart clientTrackingPart = (ClientTrackingPart)gamePlayer.getMgrPart(ClientTrackingPart.class);
         clientTrackingPart.clientTrack(ClientTrackingEnum.SP_AF_ACHIEVEMENT_UNLOCKED, ClientTrackingEnum.SP_AF_ACHIEVEMENT_UNLOCKED.name());
         if (this.unionDao.finishActivate) {
            gamePlayer.triggerTask(707, 0, 1L, 1);
         }

      });
      this.addLog(this.unionDao.unionId, 10, playerPublicDao.playerName);
      this.sendUnion(gamePlayer);
      this.updateCombatPower();
      this.broadcastMember(memberDao.playerId);
      LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "JoinTheAlliance");
      String content = MessageFormat.format(languageModel.getValue(), playerPublicDao.playerName);
      this.chatMgr.sendUnionSystem(this.unionDao.unionId, content, 3);
      this.removeUnionApply(gamePlayer.getPlayerId());
   }

   public void unionApply(int playerId) {
      UnionApplyDao unionApplyDao = this.getUnionApply(playerId);
      if (unionApplyDao == null) {
         unionApplyDao = new UnionApplyDao();
         unionApplyDao.playerId = playerId;
         unionApplyDao.unionId = this.unionDao.unionId;
         this.unionMgrParent.getGameCachePool().insertDao(unionApplyDao);
      } else {
         unionApplyDao.applyTime = System.currentTimeMillis();
         unionApplyDao.updateOp();
      }

      this.broadcast(this.buildApplyListMsg(), (List)null);
   }

   public UnionMsg.S2C_UnionApplyList_6920 buildApplyListMsg() {
      UnionMsg.S2C_UnionApplyList_6920.Builder msg = UnionMsg.S2C_UnionApplyList_6920.newBuilder();
      this.getUnionAllApply().values().forEach((unionApplyDao) -> {
         UnionMsg.UnionMember.Builder memberBuilder = this.buildMemberData(unionApplyDao.playerId);
         if (memberBuilder != null) {
            msg.addMembers(memberBuilder);
         }

      });
      return msg.build();
   }

   public Map<Integer, UnionApplyDao> getUnionAllApply() {
      return this.unionMgrParent.getGameCachePool().getMap("tb_union_apply", new Object[]{this.unionDao.unionId});
   }

   public UnionApplyDao getUnionApply(int playerId) {
      return (UnionApplyDao)this.getUnionAllApply().get(playerId);
   }

   public void removeUnionApply(int playerId) {
      UnionApplyDao unionApplyDao = this.getUnionApply(playerId);
      if (unionApplyDao != null) {
         this.unionMgrParent.getGameCachePool().deleteDao(unionApplyDao, false);
      }

      this.broadcast(this.buildApplyListMsg(), (List)null);
   }

   public UnionDao getUnion() {
      return this.unionDao;
   }

   public Map<Integer, UnionMemberDao> getUnionMembers() {
      return this.unionMgrParent.getGameCachePool().getMap("tb_union_member", new Object[]{this.unionDao.unionId});
   }

   public UnionMemberDao getUnionMember(int memberId) {
      return (UnionMemberDao)this.getUnionMembers().get(memberId);
   }

   public void copyDamageRankReward(UnionCopyModel challengeCopyMode) {
      List<Integer> rankLayer = challengeCopyMode.getRankLayer();
      List<Integer> rankCopper = challengeCopyMode.getRankCopper();
      List<Integer> rankContribution = challengeCopyMode.getRankContribution();
      Map<Integer, int[]> rewardMap = new HashMap();

      for(int i = 0; i < rankLayer.size(); ++i) {
         rewardMap.put(rankLayer.get(i), new int[]{(Integer)rankCopper.get(i), (Integer)rankContribution.get(i)});
      }

      Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_UNION_COPY_RANK);
      CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
      this.rankMgr.pushTask(() -> {
         Map<Integer, Double> rankDataMap = new HashMap();
         this.rankMgr.getRanks(RankDefine.RankModule.UNION_COPY, this.getUnionMembers().size(), String.valueOf(this.unionDao.unionId), String.valueOf(challengeCopyMode.getId())).forEach((rankData) -> {
            int finalLayer = (Integer)rankLayer.stream().sorted(Comparator.comparingInt((o) -> o)).filter((layer) -> layer >= rankData.rank).findFirst().get();
            int[] reward = (int[])rewardMap.get(finalLayer);
            if (reward != null) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
               if (gamePlayer != null) {
                  rankDataMap.put(rankData.value, (double)rankData.score);
                  gamePlayer.pushTask(() -> {
                     PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)gamePlayer.getPlayerExtend(9);
                     if (challengeCopyMode.getNextId() <= 0 || !playerUnionExtend.copyRankMap.containsKey(challengeCopyMode.getId())) {
                        String str = rankData.rank + "_" + this.unionDao.unionId + "_" + DateUtil.getIntTime(System.currentTimeMillis());
                        playerUnionExtend.copyRankMap.put(challengeCopyMode.getId(), str);
                        gamePlayer.updatePlayerExtend(9);
                        List<ResourceModel> resourceModelList = new ArrayList();
                        resourceModelList.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, reward[0]));
                        resourceModelList.add(new ResourceModel(1, PlayerDefine.PLAYER_UNION_CONTRIBUTION, reward[1]));
                        MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                        String desc = MessageFormat.format(centreAwardModel.getDesc(), challengeCopyMode.getSectionId(), rankData.rank);
                        mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), desc, resourceModelList, 604800000L, 9, 920);
                        LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
                        logOperationMgr.pushTask(() -> logOperationMgr.addReceiveAwardNewLog(gamePlayer, 17, 0, centreAwardModel.getTitle(), String.valueOf(centreAwardModel.getId()), "-", 0, 0, 0));
                     }

                  });
               }
            }

         });
         if (challengeCopyMode.getNextId() <= 0) {
            String rankKey = this.rankMgr.getRedisKey(RankDefine.RankModule.UNION_COPY, String.valueOf(this.unionDao.unionId), String.valueOf(challengeCopyMode.getId()), "prev");
            GameRedisTool gameRedisTool = (GameRedisTool)ApplicationContextProvider.getContext().getBean(GameRedisTool.class);
            RScoredSortedSet<Integer> rScoredSortedSet = gameRedisTool.getClient().getScoredSortedSet(rankKey);
            rScoredSortedSet.delete();
            rScoredSortedSet.addAll(rankDataMap);
            rankKey = this.rankMgr.getRedisKey(RankDefine.RankModule.UNION_COPY, String.valueOf(this.unionDao.unionId), String.valueOf(challengeCopyMode.getId()));
            rScoredSortedSet = gameRedisTool.getClient().getScoredSortedSet(rankKey);
            rScoredSortedSet.delete();
         }

      });

      for(UnionMemberDao unionMemberDao : this.getUnionMembers().values()) {
         if (challengeCopyMode.getNextId() <= 0) {
            unionMemberDao.copyDamage.remove(challengeCopyMode.getId());
         }

         unionMemberDao.copyLastDamage = 0L;
         unionMemberDao.copyLastAttackHp = 0L;
         unionMemberDao.updateOp();
      }

   }

   public void sendUnion(GamePlayer gamePlayer) {
      UnionMsg.S2C_UnionNotify_6904.Builder msg = UnionMsg.S2C_UnionNotify_6904.newBuilder();
      UnionMsg.UnionData unionData = this.buildUnionData();
      if (unionData != null) {
         msg.setUnion(unionData);
         if (gamePlayer != null) {
            gamePlayer.sendMsg(msg.build());
         } else {
            this.broadcast(msg.build(), (List)null);
         }

      }
   }

   public int giveRedPacket(UnionRedPacketModel unionRedPacketModel, PlayerDao playerDao) {
      UnionRedPacketGiveDao unionRedPacketGiveDao = new UnionRedPacketGiveDao();
      unionRedPacketGiveDao.unionId = playerDao.unionId;
      unionRedPacketGiveDao.playerId = playerDao.playerId;
      unionRedPacketGiveDao.redPacketItemNum = unionRedPacketModel.getRedPacketItemNum();
      unionRedPacketGiveDao.redPacketNum = unionRedPacketModel.getRedPacketNum();
      unionRedPacketGiveDao.redPacketId = unionRedPacketModel.getId();
      unionRedPacketGiveDao.position = this.getUnionMember(playerDao.playerId).position;
      this.unionMgrParent.getGameCachePool().insertDao(unionRedPacketGiveDao, true);
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", unionRedPacketModel.getGiftId());
      int money;
      if (shopLimitModel.getPriceType() == 0) {
         money = shopLimitModel.getPrice();
      } else {
         RechargeModel rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("rechargePrice", shopLimitModel.getPriceType());
         if (rechargeModel == null) {
            throw new RuntimeException("发红包失败,错误的价格类型");
         }

         money = rechargeModel.getMoney();
      }

      this.redPacketRank.computeIfAbsent(playerDao.playerId, (v) -> new UnionRedPacketRank(playerDao.playerName));
      UnionRedPacketRank var10000 = (UnionRedPacketRank)this.redPacketRank.get(playerDao.playerId);
      var10000.money += (long)money;
      ++((UnionRedPacketRank)this.redPacketRank.get(playerDao.playerId)).num;
      this.addLog(this.unionDao.unionId, 16, playerDao.playerName, unionRedPacketModel.getDesTip());
      this.notifyRedPacket(unionRedPacketGiveDao);
      return money;
   }

   public void notifyRedPacket(UnionRedPacketGiveDao unionRedPacketGiveDao) {
      UnionMsg.S2C_UnionRedPacketNotify_6990.Builder msg = UnionMsg.S2C_UnionRedPacketNotify_6990.newBuilder();
      msg.setRedPacket(this.buildRedPacket(unionRedPacketGiveDao));
      this.broadcast(msg.build(), (List)null);
   }

   public void recordGotRedPacket(int redPacketId, int money, int playerId) {
      UnionRedPacketGetDao unionRedPacketGetDao = new UnionRedPacketGetDao();
      unionRedPacketGetDao.money = money;
      unionRedPacketGetDao.playerId = playerId;
      unionRedPacketGetDao.redPacketGiveId = redPacketId;
      unionRedPacketGetDao.position = this.getUnionMember(playerId).position;
      this.unionMgrParent.getGameCachePool().insertDao(unionRedPacketGetDao);
   }

   public Map<Integer, UnionRedPacketGetDao> getGotRedPacketRecord(int redPacketId) {
      return this.unionMgrParent.getGameCachePool().getMap("tb_union_red_packet_get", new Object[]{redPacketId});
   }

   public Map<Integer, UnionRedPacketGiveDao> getUnionRedPackets() {
      return this.unionMgrParent.getGameCachePool().getMap("tb_union_red_packet_give", new Object[]{this.unionDao.unionId});
   }

   public UnionRedPacketGiveDao getRedPacket(int id) {
      return (UnionRedPacketGiveDao)this.getUnionRedPackets().get(id);
   }

   public Map<Integer, UnionRedPacketRank> getUnionRedPacketRank() {
      this.sortedRedPacketRank();
      return this.redPacketRank;
   }

   public UnionMsg.UnionMember.Builder buildMemberData(int playerId) {
      GamePlayer memberGamePlayer = this.getGamePlayer(playerId);
      if (memberGamePlayer != null) {
         UnionMemberDao memberDao = this.getUnionMember(playerId);
         PlayerPublicDao publicDao = memberGamePlayer.getPublicDao();
         UnionMsg.UnionMember.Builder memberBuilder = UnionMsg.UnionMember.newBuilder();
         memberBuilder.setPlayerId(memberGamePlayer.getPlayerId());
         memberBuilder.setPlayerName(publicDao.playerName);
         memberBuilder.setLevel(publicDao.lv);
         memberBuilder.setHead(publicDao.head);
         memberBuilder.setHeadFrame(publicDao.headFrame);
         memberBuilder.setPosition(memberDao == null ? 0 : memberDao.position);
         int offlineTime = 0;
         if (publicDao.logoutTime > 0L) {
            offlineTime = DateUtil.getIntTime(System.currentTimeMillis()) - DateUtil.getIntTime(publicDao.logoutTime);
         }

         memberBuilder.setOfflineTime(offlineTime);
         memberBuilder.setActiveLv(publicDao.union_active_lv);
         memberBuilder.setContribution(memberDao == null ? 0 : memberDao.contribution);
         memberBuilder.setTodayContribution((Integer)this.unionDao.memberTodayContribution.getOrDefault(playerId, 0));
         memberBuilder.setPower(memberGamePlayer.getPlayerCombatPower());
         memberBuilder.setFightCount(memberDao == null ? 0 : memberDao.warChallengeCount);
         memberBuilder.setLastDamage(memberDao == null ? 0L : memberDao.copyLastDamage);
         memberBuilder.setTodayMailCount(memberDao == null ? ApplicationContextProvider.getConfigInt("unionMailLimit", 0) : memberDao.todayMailCount);
         memberBuilder.setVipLv(publicDao.vip_lv);
         memberBuilder.setIsShowVip(publicDao.isShowVip);
         return memberBuilder;
      } else {
         return null;
      }
   }

   public UnionMsg.UnionData buildUnionData() {
      UnionMsg.UnionData.Builder data = UnionMsg.UnionData.newBuilder();
      data.setExp(this.unionDao.exp);
      data.setLeaderId(this.unionDao.leaderId);
      GamePlayer gamePlayer = this.getGamePlayer(this.unionDao.leaderId);
      if (gamePlayer == null) {
         log.error("军团{}军团长玩家{}不存在,", this.unionDao.unionId, this.unionDao.leaderId);
         return null;
      } else {
         PlayerPublicDao publicDao = gamePlayer.getPublicDao();
         data.setLeaderName(publicDao.playerName);
         data.setLevel(this.unionDao.level);
         data.setUnionId(this.unionDao.unionId);
         data.setUnionName(this.unionDao.unionName);
         data.setVerify(this.unionDao.verify);
         data.setVerifyLevel(this.unionDao.verifyLevel);
         data.setVerifyPower(this.unionDao.verifyPower);
         data.setMembers(this.getUnionMembers().size());
         if (!StringUtils.isEmpty(this.unionDao.declaration)) {
            data.setDeclaration(this.unionDao.declaration);
         }

         data.setRecruitCount(this.unionDao.recruitCount);
         int unionHead = MiscUtil.getHiParam(this.unionDao.head);
         if (!this.unionDao.hasHead.containsKey(unionHead) || (Integer)this.unionDao.hasHead.get(unionHead) > 0 && (Integer)this.unionDao.hasHead.get(unionHead) <= DateUtil.getIntTime(System.currentTimeMillis())) {
            unionHead = 0;
         }

         data.setHead(unionHead);
         data.setCurUnionAddNumberId(this.unionDao.curUnionAddNumberId);
         return data.build();
      }
   }

   private GamePlayer getGamePlayer(int playerId) {
      return this.worldMgr.getPlayerById(playerId);
   }

   public void sendUnionDonateProgress() {
      UnionMsg.S2C_UnionDonateProcess_6992.Builder msg = UnionMsg.S2C_UnionDonateProcess_6992.newBuilder();
      msg.setDonateProgress(this.unionDao.donateProgress);
      this.broadcast(msg.build(), (List)null);
   }

   public void sendWorshipList(GamePlayer gamePlayer) {
      UnionMsg.S2C_UnionCopyRankWorshipList_6988.Builder msg = UnionMsg.S2C_UnionCopyRankWorshipList_6988.newBuilder();
      this.getUnionMembers().values().forEach((memberDao) -> {
         int count = memberDao.worships.size();
         if (count > 0) {
            UnionMsg.WorshipData.Builder builder = UnionMsg.WorshipData.newBuilder();
            builder.setMemberId(memberDao.playerId);
            builder.setCount(count);
            msg.addWorshipList(builder);
         }

      });
      if (gamePlayer == null) {
         this.broadcast(msg.buildPartial(), (List)null);
      } else {
         gamePlayer.sendMsg(msg.build());
      }

   }

   public void sendUnionCopyInfo() {
      this.broadcast(this.buildUnionCopyMsg().build(), (List)null);
   }

   public UnionMsg.S2C_UnionCopyInfo_6982.Builder buildUnionCopyMsg() {
      UnionMsg.S2C_UnionCopyInfo_6982.Builder msg = UnionMsg.S2C_UnionCopyInfo_6982.newBuilder();
      msg.setHpPercent(this.getCopyHpPercent());
      msg.setBuffTime(DateUtil.getIntTime(this.unionDao.copyBuffTime));
      msg.setCallTime(DateUtil.getIntTime(this.unionDao.massCDTime));
      msg.setBuffLv(this.unionDao.copyBuffLv);
      msg.setLastId(this.unionDao.copyId);
      WorldDao<HashSet<Integer>> worldDao = this.worldMgr.<HashSet<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_UNION_COPY);

      for(int memberId : this.getUnionMembers().keySet()) {
         if (!((HashSet)worldDao.jsonData).contains(memberId)) {
            msg.addTodayNoChallengeMember(memberId);
         }
      }

      return msg;
   }

   public UnionMsg.UnionRedPacket buildRedPacket(UnionRedPacketGiveDao unionRedPacketGiveDao) {
      UnionMsg.UnionRedPacket.Builder builder = UnionMsg.UnionRedPacket.newBuilder();
      builder.setId(unionRedPacketGiveDao.id);
      builder.setNum(unionRedPacketGiveDao.redPacketNum);
      builder.setRedPacketId(unionRedPacketGiveDao.redPacketId);
      builder.setTime(DateUtil.getIntTime(unionRedPacketGiveDao.giveTime + 86400000L));
      builder.setGivePlayer(this.buildUnionRedPacketPlayerData(unionRedPacketGiveDao.playerId, unionRedPacketGiveDao.position));
      this.getGotRedPacketRecord(unionRedPacketGiveDao.id).forEach((key, unionRedPacketGetDao) -> {
         UnionMsg.UnionPickRedPacket.Builder pickBuilder = UnionMsg.UnionPickRedPacket.newBuilder();
         pickBuilder.setTime(DateUtil.getIntTime(unionRedPacketGetDao.getTime));
         pickBuilder.setNum((double)unionRedPacketGetDao.money);
         pickBuilder.setGivePlayer(this.buildUnionRedPacketPlayerData(key, unionRedPacketGetDao.position));
         builder.addPickRedPackets(pickBuilder);
      });
      return builder.build();
   }

   private UnionMsg.UnionRedPacketPlayerData buildUnionRedPacketPlayerData(int playerId, int position) {
      UnionMsg.UnionRedPacketPlayerData.Builder playerBuilder = UnionMsg.UnionRedPacketPlayerData.newBuilder();
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      PlayerPublicDao publicDao = gamePlayer.getPublicDao();
      playerBuilder.setHead(publicDao.head);
      playerBuilder.setHeadFrame(publicDao.headFrame);
      playerBuilder.setLevel(publicDao.lv);
      playerBuilder.setPlayerId(publicDao.playerId);
      playerBuilder.setPosition(position);
      playerBuilder.setPlayerName(publicDao.playerName);
      return playerBuilder.build();
   }

   public void copyPass(UnionCopyModel challengeCopyModel) {
      UnionCopyModel nextCopyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", challengeCopyModel.getNextId());
      if (nextCopyModel == null) {
         nextCopyModel = challengeCopyModel;
      }

      this.unionDao.masterHp = nextCopyModel.getCopyMasterHp();
      this.unionDao.copyChallenge.clear();
      this.unionDao.copyId = nextCopyModel.getId();
      this.broadcastMembers();
      int oldLv = this.unionDao.level;
      this.addExp(challengeCopyModel.getKillUnionExp());
      this.unionDao.updateOp();
      if (oldLv == this.unionDao.level) {
         this.uploadToCross(false, false);
      }

   }

   public void addExp(int exp) {
      UnionModel currentLvModel = (UnionModel)ApplicationContextProvider.getModelPoolEntity("union", this.unionDao.level);
      if (currentLvModel != null) {
         UnionModel nextLvModel = (UnionModel)ApplicationContextProvider.getModelPoolEntity("union", this.unionDao.level + 1);
         if (nextLvModel != null) {
            UnionDao var10000 = this.unionDao;
            var10000.exp += exp;

            int oldLv;
            for(oldLv = this.unionDao.level; nextLvModel != null && currentLvModel.getNeedUnionExp() <= this.unionDao.exp; nextLvModel = (UnionModel)ApplicationContextProvider.getModelPoolEntity("union", currentLvModel.getUnionLevel() + 1)) {
               var10000 = this.unionDao;
               var10000.exp -= currentLvModel.getNeedUnionExp();
               ++this.unionDao.level;
               this.addLog(this.unionDao.unionId, 13, this.unionDao.level);
               currentLvModel = (UnionModel)ApplicationContextProvider.getModelPoolEntity("union", this.unionDao.level);
            }

            this.unionDao.updateOp();
            if (this.unionDao.level > oldLv) {
               this.uploadToCross(false, false);
               this.checkHeadUnlock(101, 0);
            }

         }
      }
   }

   public int getCopyHpPercent() {
      UnionCopyModel copyModel = (UnionCopyModel)ApplicationContextProvider.getModelPoolEntity("unionCopy", this.unionDao.copyId);
      if (copyModel == null) {
         return 0;
      } else {
         long maxHp = copyModel.getCopyMasterHp();
         return CalculateUtil.calPercent(this.unionDao.masterHp, maxHp);
      }
   }

   public void sendMember(GamePlayer player) {
      UnionMsg.S2C_UnionMember_6908.Builder msg = UnionMsg.S2C_UnionMember_6908.newBuilder();
      msg.setMember(this.buildMemberData(player.getPlayerId()));
      player.sendMsg(msg.build());
   }

   public void broadcastMember(int memberId) {
      UnionMsg.S2C_UnionMember_6908.Builder msg = UnionMsg.S2C_UnionMember_6908.newBuilder();
      msg.setMember(this.buildMemberData(memberId));
      this.broadcast(msg.build(), (List)null);
   }

   public void broadcastMembers() {
      this.broadcast(this.buildMembersMsg(), (List)null);
   }

   public UnionMsg.S2C_UnionMemberList_6906 buildMembersMsg() {
      UnionMsg.S2C_UnionMemberList_6906.Builder msg = UnionMsg.S2C_UnionMemberList_6906.newBuilder();
      this.getUnionMembers().keySet().forEach((memberId) -> {
         UnionMsg.UnionMember.Builder memberBuilder = this.buildMemberData(memberId);
         if (memberBuilder != null) {
            msg.addMembers(memberBuilder);
         }

      });
      return msg.build();
   }

   public void clearMembers() {
      this.getUnionMembers().keySet().forEach(this::exitUnion);
   }

   public void exitUnion(int playerId) {
      GamePlayer gamePlayer = this.getGamePlayer(playerId);
      if (gamePlayer != null) {
         UnionMemberDao memberDao = this.getUnionMember(playerId);
         gamePlayer.pushTask(() -> {
            PlayerDao playerDao = gamePlayer.getPlayerDao();
            if (memberDao != null) {
               RankPart rankPart = (RankPart)gamePlayer.getMgrPart(RankPart.class);
               memberDao.copyDamage.keySet().forEach((copyId) -> rankPart.removeRank(RankDefine.RankModule.UNION_COPY, String.valueOf(this.unionDao.unionId), String.valueOf(copyId)));
            } else {
               log.error("玩家【{}】,名称:【{}】,退出军团【{}】,成员信息已不存在,跳过移除成员信息", new Object[]{playerDao.playerId, playerDao.playerName, this.unionDao.unionId});
            }

            if (playerDao.unionId == this.unionDao.unionId) {
               playerDao.unionId = 0;
               playerDao.updateOp();
               gamePlayer.clearPublicUnionId();
            } else {
               log.error("玩家【{}】,名称:【{}】,退出军团【{}】,unionId不等于该军团ID,忽略设置unionId,当前unionId:【{}】", new Object[]{playerDao.playerId, playerDao.playerName, this.unionDao.unionId, playerDao.unionId});
            }

            gamePlayer.notifyPlayerData(PlayerDefine.PLAYER_UNION_ID, playerDao.unionId);
            gamePlayer.uploadCrossPlayer();
            UnionTechnologyPart unionTechnologyPart = (UnionTechnologyPart)gamePlayer.getMgrPart(UnionTechnologyPart.class);
            unionTechnologyPart.flushTechnology();
            this.unionMgrParent.pushTask(() -> {
               this.removeMember(memberDao);
               GamePlayer leaderPlayer = this.worldMgr.getPlayerById(this.unionDao.leaderId);
               PlayerPublicDao leaderDao = leaderPlayer.getPublicDao();
               gamePlayer.getOperationMgr().pushTask(() -> gamePlayer.getOperationMgr().addExtraLog(gamePlayer, 109, this.unionDao.unionName, String.valueOf(this.unionDao.level), String.valueOf(this.getUnionMembers().size()), String.valueOf(leaderDao.playerId), leaderDao.playerName));
            });
         });
      }

   }

   public void removeMember(UnionMemberDao memberDao) {
      if (memberDao != null) {
         this.redPacketRank.remove(memberDao.playerId);
         this.unionDao.memberTodayContribution.remove(memberDao.playerId);
         this.unionDao.updateOp();
         this.unionMgrParent.getGameCachePool().deleteDao(memberDao, true);
         this.updateCombatPower();
      }
   }

   public void initUnionMemberTechnology(int playerId) {
      GamePlayer gamePlayer = this.getGamePlayer(playerId);
      if (gamePlayer != null) {
         PlayerUnionExtend playerUnionExtend = (PlayerUnionExtend)gamePlayer.getPlayerExtend(9);
         if (playerUnionExtend.technology.isEmpty()) {
            Map<Integer, Map<Integer, UnionTecModel>> unionTecModeMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecModel>>getModelPoolMap("customUnionTec");
            unionTecModeMap.keySet().forEach((tecType) -> {
               Map<Integer, UnionTechnologyPlaceData> technologyPlaceDataMap = (Map)playerUnionExtend.technology.computeIfAbsent(tecType, (k) -> new ConcurrentHashMap());
               this.initUnionMemberTechnology(technologyPlaceDataMap);
            });
            gamePlayer.updatePlayerExtend(9);
         }
      }

   }

   public void initUnionMemberTechnology(Map<Integer, UnionTechnologyPlaceData> technologyPlaceDataMap) {
      Map<Integer, Map<Integer, UnionTecPlaceModel>> unionTecPlaceModelMap = ApplicationContextProvider.<Integer, Map<Integer, UnionTecPlaceModel>>getModelPoolMap("customUnionTecPlace");
      unionTecPlaceModelMap.entrySet().forEach((entry) -> {
         int place = (Integer)entry.getKey();
         Map<Integer, UnionTecPlaceModel> unionTecPlaceLevelMap = (Map)entry.getValue();
         UnionTecPlaceModel initModel = (UnionTecPlaceModel)unionTecPlaceLevelMap.get(unionTecPlaceLevelMap.keySet().stream().min(Comparator.comparingInt((key) -> key)).get());
         technologyPlaceDataMap.put(place, new UnionTechnologyPlaceData(initModel.getTecPlace(), initModel.getId(), false));
      });
   }

   public void addLog(int unionId, int logId, Object... args) {
      this.unionMgrParent.pushTask(() -> {
         UnionLog unionLog = new UnionLog();
         unionLog.unionId = unionId;
         unionLog.playerName = "";
         UnionLogModel unionLogModel = (UnionLogModel)ApplicationContextProvider.getModelPoolEntity("unionLog", logId);
         unionLog.desc = MessageFormat.format(unionLogModel.getDesc(), args);
         unionLog.type = logId;
         this.unionMgrParent.getGameCachePool().insertDao(unionLog);
         UnionMsg.S2C_UnionLogs_6970.Builder msg = UnionMsg.S2C_UnionLogs_6970.newBuilder();
         UnionMsg.UnionLog logMsg = this.buildLogMsg(unionLog);
         if (logMsg != null) {
            msg.setIsNotify(true);
            msg.addUnionLogs(logMsg);
         }

         this.broadcast(msg.build(), (List)null);
      });
   }

   public List<UnionLog> getUnionLogList() {
      return this.unionMgrParent.getGameCachePool().getList("tb_union_log", new Object[]{this.unionDao.unionId});
   }

   public void removeUnionLog(UnionLog unionLog) {
      this.unionMgrParent.getGameCachePool().deleteDao(unionLog, false);
   }

   public void checkUnionWarMatch() {
      if (this.activeMember == null && !this.warIsMatch) {
         if (this.unionDao.level >= 2) {
            TreeMap<Integer, UnionWarActivityModel> modelMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customUnionWarActivity", 0);
            if (modelMap != null && !modelMap.isEmpty()) {
               int serverDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime()));
               UnionWarActivityModel unionWarActivityModel = (UnionWarActivityModel)modelMap.get(serverDay);
               if (unionWarActivityModel == null) {
                  unionWarActivityModel = (UnionWarActivityModel)modelMap.lastEntry().getValue();
               }

               this.activeMember = new LinkedHashMap();

               for(UnionMemberDao memberDao : this.getUnionMembers().values()) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById(memberDao.playerId);
                  if (gamePlayer != null) {
                     PlayerPublicDao publicDao = gamePlayer.getPublicDao();
                     if (publicDao.logoutTime <= 0L || System.currentTimeMillis() - publicDao.logoutTime < (long)(unionWarActivityModel.getUnionWarActiveCondition() * 60 * 60 * 1000)) {
                        long memberPower = this.getCombatPower(memberDao.playerId);
                        if (memberPower > 0L) {
                           this.activeMember.put(publicDao.playerId, memberPower);
                        }
                     }
                  }
               }

               if (this.activeMember.size() < unionWarActivityModel.getActivityMember()) {
                  this.unionWarSignData = null;
                  this.activeMember = null;
                  this.warIsMatch = false;
               } else {
                  this.unionWarSignData = new UnionWarAgainstData();
                  this.unionWarSignData.setId(this.unionDao.unionId);
                  this.unionWarSignData.setName(this.unionDao.unionName);
                  this.unionWarSignData.setRank(this.rankMgr.getRank(RankDefine.RankModule.UNION_COMBAT_POWER, this.unionDao.unionId));
                  this.unionWarSignData.setsId(this.unionDao.serverId);
                  this.unionWarSignData.setsName(this.worldMgr.GAME_SERVER_NAME);
                  this.unionWarSignData.setWin(this.unionDao.warWin);
                  this.activeMember = (Map)this.activeMember.entrySet().stream().sorted((o1, o2) -> NumberUtil.compare((Long)o2.getValue(), (Long)o1.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
                  long power = 0L;
                  int index = 0;

                  for(Map.Entry<Integer, Long> memberData : this.activeMember.entrySet()) {
                     UnionWarStrongholdData unionWarStrongholdData = new UnionWarStrongholdData();
                     unionWarStrongholdData.setId((Integer)memberData.getKey());
                     unionWarStrongholdData.setPower((Long)memberData.getValue());
                     Map var10000 = this.unionWarSignData.getStrongholdDataMap();
                     ++index;
                     var10000.put(index, unionWarStrongholdData);
                     power += (Long)memberData.getValue();
                  }

                  this.unionWarSignData.setPower(power);
                  if (this.unionWarSignData.getPower() <= 0L) {
                     this.unionWarSignData = null;
                     this.activeMember = null;
                     this.warIsMatch = false;
                  } else {
                     this.activeMemberSign();
                  }
               }
            } else {
               log.error("军团争霸报名限制配置不存在");
            }
         }
      }
   }

   public void activeMemberSign() {
      if (this.activeMember == null) {
         this.unionWarSignData = null;
         this.warIsMatch = false;
      } else if (this.activeMember.isEmpty()) {
         this.unionWarSign();
      } else {
         int playerId = (Integer)((Map.Entry)this.activeMember.entrySet().iterator().next()).getKey();
         this.activeMember.remove(playerId);
         GamePlayer player = this.worldMgr.getPlayerById(playerId);
         if (player == null) {
            this.activeMemberSign();
         } else {
            player.pushTask(() -> {
               ArrayingMirror arrayingMirror = player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
               PlayerPublicDao publicDao = player.getPublicDao();

               for(UnionWarStrongholdData unionWarStrongholdData : this.unionWarSignData.getStrongholdDataMap().values()) {
                  if (unionWarStrongholdData.getId() == publicDao.playerId) {
                     unionWarStrongholdData.setName(publicDao.playerName);
                     unionWarStrongholdData.setArrayingData(arrayingMirror.toByteArray());
                     unionWarStrongholdData.setId(publicDao.playerId);
                     unionWarStrongholdData.setLv(publicDao.lv);
                     break;
                  }
               }

               this.unionMgrParent.schedule(600L, this::activeMemberSign);
            });
         }
      }
   }

   private void unionWarSign() {
      if (this.unionMgrParent.warStatus == 1 && this.unionWarSignData != null && !this.unionWarSignData.getStrongholdDataMap().isEmpty()) {
         CrossUnionWarMsg.S2CR_UnionWarSign_10101.Builder msg = CrossUnionWarMsg.S2CR_UnionWarSign_10101.newBuilder();
         byte[] data = SerializingUtil.serialize(this.unionWarSignData);
         byte[] compressedData = Zstd.compress(data);
         msg.setUnion(ByteString.copyFrom(compressedData));
         this.crossNettyClient.sendCross(this.unionDao.serverId, this.unionWarSignData.getId(), msg.build());
         log.info("军团【{}】报名,所属【{}组】,报名人数【{}】,压缩后数据长度【{}】", new Object[]{this.unionWarSignData.getName(), this.unionWarSignData.isWin() ? "胜利" : "失败", this.unionWarSignData.getStrongholdDataMap().size(), compressedData.length});
         this.unionWarSignData = null;
         this.activeMember = null;
         this.warIsMatch = true;
      }
   }

   public void unionWarOpen() {
      this.unionWarSignData = null;
      this.activeMember = null;
      this.clearStrongholdFightStatus();
      UnionWarAgainstData myAgainstData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
      this.warIsMatch = myAgainstData != null && myAgainstData.getEnemy() > 0;
   }

   public void unionWarFight() {
      this.unionWarSignData = null;
      this.activeMember = null;
      if (this.unionDao.warSettle) {
         this.unionDao.warSettle = false;
         this.unionDao.updateOp();
      }

   }

   public void unionWarSettle() {
      this.unionWarSignData = null;
      Set<Integer> positionSet = new HashSet(this.unionDao.warStrongholdFighting.keySet());
      this.clearStrongholdFightStatus();
      UnionWarAgainstData myAgainstData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
      if (myAgainstData == null) {
         this.unionDao.warWin = false;
         this.unionDao.updateOp();
         this.warBoxSize = 0;
         this.warBoxId = 0;
      } else {
         UnionWarAgainstData enemyAgainstData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(myAgainstData.getEnemy());
         if (enemyAgainstData == null) {
            this.unionDao.warWin = false;
            this.unionDao.updateOp();
            this.warBoxSize = 0;
            this.warBoxId = 0;
         } else {
            positionSet.forEach((position) -> this.broadcastWarStrongholdData(enemyAgainstData.getId(), position));
            String[] boxArr = this.configManager.getStr("unionWarSettlementBox").split("\\|");
            String[] expArr = this.configManager.getStr("shopUnionWarUnitExp").split("\\|");
            Set<Integer> memberIds = this.getUnionMembers().keySet();
            Set<UnionWarStrongholdData> activeMemberIds = (Set)myAgainstData.getStrongholdDataMap().values().stream().filter((unionWarStrongholdData) -> memberIds.contains(unionWarStrongholdData.getId())).collect(Collectors.toSet());
            this.warBoxSize = activeMemberIds.size();
            int myStar = this.unionDao.getWarStrongholdCurrentStar();
            int enemyStar = myAgainstData.getStrongholdDataMap().values().stream().mapToInt(UnionWarStrongholdData::getMaxStar).sum();
            this.unionDao.warWin = false;
            int index;
            if (myStar > enemyStar) {
               this.unionDao.warWin = true;
               index = 0;
            } else if (myStar == enemyStar) {
               index = 1;
            } else {
               index = 2;
            }

            if (this.warBoxSize > 0) {
               this.warBoxId = Integer.parseInt(boxArr[index].split(":")[1]);
            } else {
               this.warBoxId = 0;
            }

            this.unionDao.updateOp();
            this.broadcastWarBox();
            if (!this.unionDao.warSettle) {
               this.unionDao.warSettle = true;
               this.unionDao.updateOp();
               int shopExp = Integer.parseInt(expArr[index]);
               this.addWarShopExp(shopExp);
               this.warRankReward();
               if (this.unionDao.warWin) {
                  activeMemberIds.forEach((unionWarStrongholdData) -> {
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(unionWarStrongholdData.getId());
                     if (gamePlayer != null) {
                        gamePlayer.pushTask(() -> gamePlayer.triggerTask(507, 0, 1L, 1));
                     }

                  });
               }

               log.info("军团争霸【{} vs {}】结算,【{}:{}】-【{}】", new Object[]{this.unionDao.unionName, enemyAgainstData.getName(), myStar, enemyStar, myStar > enemyStar ? "胜利" : "失败"});
            }
         }
      }
   }

   public void warClose() {
      this.warSettleWhenClose();
      this.activeMember = null;
      this.unionWarSignData = null;
      this.clearStrongholdFightStatus();
      this.warBoxSize = 0;
      this.warBoxId = 0;
      this.unionDao.warBuffLv = 0;
      this.unionDao.warStrongholds.clear();
      this.unionDao.warBoxes.clear();
      this.unionDao.updateOp();
      this.warRank.clear();
      this.warIsMatch = false;

      for(UnionMemberDao unionMemberDao : this.getUnionMembers().values()) {
         if (unionMemberDao.warChallengeCount > 0) {
            unionMemberDao.warStar = 0;
            unionMemberDao.warRecord = 0;
            unionMemberDao.warChallengeCount = 0;
            unionMemberDao.updateOp();
         }

         if (!unionMemberDao.warBox.isEmpty()) {
            unionMemberDao.warBox.clear();
            unionMemberDao.updateOp();
         }
      }

      Map<Object, Object> tbCacheMap = this.unionMgrParent.getGameCachePool().getPoolTable("tb_union_war_attack_log");
      tbCacheMap.remove(this.unionDao.unionId);
      this.broadcastWarStatus();
   }

   private void warSettleWhenClose() {
      UnionWarAgainstData unionWarAgainstData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
      if (unionWarAgainstData != null && this.warBoxId > 0 && this.warBoxSize > 0) {
         TreeMap<Integer, CentreAwardModel> centreAwardModelTreeMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customCentreAward", CentreAwardModel.TYPE_UNION_WAR_BOX_NOT_GET);
         if (centreAwardModelTreeMap != null && !centreAwardModelTreeMap.isEmpty()) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardModelTreeMap.firstEntry().getValue();
            if (centreAwardModel != null) {
               List<ResourceModel> resourceModels = new ArrayList();
               resourceModels.add(new ResourceModel(2, this.warBoxId, 1));

               for(UnionWarStrongholdData unionWarStrongholdData : unionWarAgainstData.getStrongholdDataMap().values()) {
                  if (!this.unionDao.warBoxes.containsKey(unionWarStrongholdData.getId()) && this.getUnionMembers().containsKey(unionWarStrongholdData.getId())) {
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(unionWarStrongholdData.getId());
                     if (gamePlayer != null) {
                        gamePlayer.pushTask(() -> {
                           MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                           mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 9, 930);
                        });
                     }
                  }
               }
            }
         }
      }

   }

   public void unionWarServerMove(List<Integer> activeMembers, boolean isMerge) {
      this.warIsMatch = false;
      this.unionDao.warStrongholdFighting.clear();
      this.unionDao.warWin = false;
      this.warBoxSize = 0;
      this.warBoxId = 0;
      this.warRank.clear();
      this.unionDao.warBuffLv = 0;
      this.unionDao.warStrongholds.clear();
      this.unionDao.warBoxes.clear();
      this.unionDao.updateOp();

      for(UnionWarAttackLogDao unionWarAttackLogDao :this.getAttackLogs()) {
         this.unionMgrParent.getGameCachePool().deleteDao(unionWarAttackLogDao, false);
      }

      Map<Integer, String> playerParams = new HashMap();

      for(int memberId : activeMembers) {
         UnionMemberDao unionMemberDao = this.getUnionMember(memberId);
         if (unionMemberDao != null) {
            playerParams.put(unionMemberDao.playerId, "");
            if (unionMemberDao.warChallengeCount > 0) {
               unionMemberDao.warStar = 0;
               unionMemberDao.warRecord = 0;
               unionMemberDao.warChallengeCount = 0;
               unionMemberDao.updateOp();
            }

            if (!unionMemberDao.warBox.isEmpty()) {
               unionMemberDao.warBox.clear();
               unionMemberDao.updateOp();
            }
         }
      }

      this.unionMgrParent.pushTask(() -> {
         UnionWarAgainstData var10000 = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.remove(this.unionDao.unionId);
      });
      UnionWarMsg.S2C_WarInfo_9704.Builder msg = UnionWarMsg.S2C_WarInfo_9704.newBuilder();
      msg.setStatus(-1);
      this.broadcast(msg.build(), (List)null);
      TreeMap<Integer, CentreAwardModel> centreAwardModelTreeMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customCentreAward", isMerge ? CentreAwardModel.UNION_WAR_MERGE_SERVER : CentreAwardModel.UNION_WAR_SERVER_MOVE);
      if (centreAwardModelTreeMap != null && !centreAwardModelTreeMap.isEmpty()) {
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardModelTreeMap.firstEntry().getValue();
         MailWorldMgr mailWorldMgr = (MailWorldMgr)ApplicationContextProvider.getContext().getBean(MailWorldMgr.class);
         mailWorldMgr.addParamsMailAndSendOnline(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), playerParams, 604800000L, 9, 934, 0);
      }
   }

   public void checkFightingStronghold() {
      Map<Integer, Integer> warStrongholdFighting = new HashMap(this.unionDao.warStrongholdFighting);

      for(Map.Entry<Integer, Integer> entry : warStrongholdFighting.entrySet()) {
         int position = (Integer)entry.getKey();
         int fightingPlayerId = (Integer)entry.getValue();
         GamePlayer fightingPlayer = this.worldMgr.getPlayerById(fightingPlayerId);
         if (fightingPlayer == null) {
            this.warStrongholdNoFight(position, fightingPlayerId);
         } else {
            fightingPlayer.pushTask(() -> {
               if (!fightingPlayer.isLogin()) {
                  BattlePart fightPlayerBattlePart = (BattlePart)fightingPlayer.getMgrPart(BattlePart.class);
                  BattleDao unionWarBattle = fightPlayerBattlePart.getBattleDao(1450);
                  if (unionWarBattle != null) {
                     long passTime = System.currentTimeMillis() - (unionWarBattle.battleTime.getTime() + unionWarBattle.totalTime);
                     if (unionWarBattle.status != 1 && passTime > 0L) {
                        fightPlayerBattlePart.autoEnd(unionWarBattle.type);
                     }
                  }

               }
            });
         }
      }

   }

   public void clearStrongholdFightStatus() {
      if (!this.unionDao.warStrongholdFighting.isEmpty()) {
         this.unionDao.warStrongholdFighting.clear();
         this.unionDao.updateOp();
      }

   }

   public void warStrongholdFight(int position, int playerId) {
      this.unionDao.warStrongholdFighting.put(position, playerId);
      this.unionDao.updateOp();
      UnionWarAgainstData myData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
      if (myData != null) {
         UnionWarAgainstData enemyData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(myData.getEnemy());
         if (enemyData != null) {
            this.broadcastWarStrongholdData(enemyData.getId(), position);
         }
      }
   }

   public void warStrongholdNoFight(int position, int playerId) {
      int fightingPlayerId = (Integer)this.unionDao.warStrongholdFighting.getOrDefault(position, 0);
      if (playerId == fightingPlayerId) {
         log.info("【军团争霸】军团【{}】释放【{}】攻打据点【{}】的战斗状态", new Object[]{this.unionDao.unionName, playerId, position});
         this.unionDao.warStrongholdFighting.remove(position);
         this.unionDao.updateOp();
         if (this.unionMgrParent.warStatus != 3 || !DateUtil.isSameDay((long)this.unionMgrParent.warUpdateTime * 1000L)) {
            return;
         }

         UnionWarAgainstData myData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
         if (myData == null) {
            return;
         }

         UnionWarAgainstData enemyData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(myData.getEnemy());
         if (enemyData == null) {
            return;
         }

         this.broadcastWarStrongholdData(enemyData.getId(), position);
      }

   }

   public void broadcast(GeneratedMessageV3 messageV3, List<Integer> excludePlayers) {
      Set<Integer> sendPlayers = this.getUnionMembers().keySet();
      if (excludePlayers != null && !excludePlayers.isEmpty()) {
         sendPlayers = (Set)sendPlayers.stream().filter((playerId) -> !excludePlayers.contains(playerId)).collect(Collectors.toSet());
      }

      if (!sendPlayers.isEmpty()) {
         sendPlayers.forEach((playerId) -> {
            GamePlayer gamePlayer = this.worldMgr.getOnlinePlayer(playerId);
            if (gamePlayer != null) {
               gamePlayer.sendMsg(messageV3);
            }

         });
      }

   }

   public void broadcastWarBox() {
      this.broadcast(this.buildWarBoxListMsg(), (List)null);
   }

   public UnionWarMsg.S2C_WarBox_9710 buildWarBoxListMsg() {
      UnionWarMsg.S2C_WarBox_9710.Builder build = UnionWarMsg.S2C_WarBox_9710.newBuilder();
      build.setBoxSize(this.getWarBoxSize());
      build.setBoxId(this.getWarBoxId());

      for(Map.Entry<Integer, Integer> entry : this.unionDao.warBoxes.entrySet()) {
         build.addBoxes(this.buildWarBoxData((Integer)entry.getKey(), (Integer)entry.getValue()));
      }

      build.setEndTime(DateUtil.getIntTime(this.unionMgrParent.warBoxEndTime));
      UnionWarAgainstData myAgainstData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
      if (myAgainstData != null) {
         Set<Integer> memberIds = new HashSet(this.getUnionMembers().keySet());
         memberIds.removeIf((memberId) -> myAgainstData.getStrongholdDataMap().values().stream().noneMatch((unionWarStrongholdData) -> unionWarStrongholdData.getId() == memberId));
         build.addAllActiveMember(memberIds);
      }

      return build.build();
   }

   public UnionWarMsg.WarBoxData.Builder buildWarBoxData(int playerId, int position) {
      UnionWarMsg.WarBoxData.Builder builder = UnionWarMsg.WarBoxData.newBuilder();
      builder.setPlayerId(playerId);
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      PlayerPublicDao publicDao = gamePlayer.getPublicDao();
      builder.setPlayerName(publicDao.playerName);
      builder.setPosition(position);
      UnionMemberDao unionMemberDao = this.getUnionMember(playerId);
      if (unionMemberDao != null) {
         unionMemberDao.warBox.forEach((resourceModel) -> builder.addItem(resourceModel.builder()));
      }

      return builder;
   }

   public UnionWarMsg.WarRankData.Builder buildWarRank(UnionWarRankData unionWarRankData) {
      UnionWarMsg.WarRankData.Builder builder = UnionWarMsg.WarRankData.newBuilder();
      builder.setHead(unionWarRankData.getHead());
      builder.setLevel(unionWarRankData.getLevel());
      builder.setRank(unionWarRankData.getRank());
      builder.setRecord(unionWarRankData.getRecord());
      builder.setStar(unionWarRankData.getStar());
      builder.setPlayerName(unionWarRankData.getPlayerName());
      builder.setPlayerId(unionWarRankData.getPlayerId());
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(builder.getPlayerId());
      if (gamePlayer != null) {
         builder.setServerId(gamePlayer.getServerId());
      }

      return builder;
   }

   private void sortedRedPacketRank() {
      this.redPacketRank = (LinkedHashMap)this.redPacketRank.entrySet().stream().sorted((o1, o2) -> NumberUtil.compare(((UnionRedPacketRank)o2.getValue()).money, ((UnionRedPacketRank)o1.getValue()).money)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
   }

   private void broadcastWarRank() {
      if (this.unionMgrParent.warStatus >= 3) {
         UnionWarMsg.S2C_WarRankList_9714.Builder resp = UnionWarMsg.S2C_WarRankList_9714.newBuilder();
         this.warRank.values().forEach((unionWarRank) -> resp.addRanks(this.buildWarRank(unionWarRank)));
         this.broadcast(resp.build(), (List)null);
      }
   }

   private void broadcastWarShop() {
      this.broadcast(this.buildWarShopMsg(), (List)null);
   }

   public UnionWarMsg.S2C_WarBattleShopLv_9730 buildWarShopMsg() {
      UnionWarMsg.S2C_WarBattleShopLv_9730.Builder msg = UnionWarMsg.S2C_WarBattleShopLv_9730.newBuilder();
      msg.setExp(this.unionDao.warShopExp);
      msg.setLv(this.unionDao.warShopLv);
      return msg.build();
   }

   public void updateWarRank(int memberId) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(memberId);
      if (gamePlayer != null) {
         UnionMemberDao memberDao = this.getUnionMember(memberId);
         PlayerPublicDao publicDao = gamePlayer.getPublicDao();
         UnionWarRankData unionWarRankData = (UnionWarRankData)this.warRank.computeIfAbsent(memberId, (v) -> new UnionWarRankData(publicDao.playerId, publicDao.playerName, publicDao.head, publicDao.lv));
         unionWarRankData.setRecord(memberDao.warRecord);
         unionWarRankData.setStar(memberDao.warStar);
         this.sortedWarRank();
         this.broadcastWarRank();
      }
   }

   public void sortedWarRank() {
      AtomicInteger atomicInteger = new AtomicInteger(0);
      this.warRank = (LinkedHashMap)this.warRank.entrySet().stream().sorted((o1, o2) -> ((UnionWarRankData)o2.getValue()).getStar() == ((UnionWarRankData)o1.getValue()).getStar() ? NumberUtil.compare(((UnionWarRankData)o2.getValue()).getRecord(), ((UnionWarRankData)o1.getValue()).getRecord()) : NumberUtil.compare(((UnionWarRankData)o2.getValue()).getStar(), ((UnionWarRankData)o1.getValue()).getStar())).collect(Collectors.toMap(Map.Entry::getKey, (e) -> {
         ((UnionWarRankData)e.getValue()).setRank(atomicInteger.incrementAndGet());
         return (UnionWarRankData)e.getValue();
      }, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
   }

   public UnionMsg.UnionLog buildLogMsg(UnionLog unionLog) {
      UnionLogModel unionLogModel = (UnionLogModel)ApplicationContextProvider.getModelPoolEntity("unionLog", unionLog.type);
      if (unionLogModel == null) {
         return null;
      } else {
         UnionMsg.UnionLog.Builder builder = UnionMsg.UnionLog.newBuilder();
         builder.setCreateTime(DateUtil.getIntTime(unionLog.createTime));
         builder.setType(unionLogModel.getType());
         builder.setContent(unionLog.desc);
         builder.setPlayerName(unionLog.playerName);
         return builder.build();
      }
   }

   public int getWarBoxSize() {
      return this.warBoxSize;
   }

   public int getWarBoxId() {
      return this.warBoxId;
   }

   public void broadcastWarInfo() {
      UnionWarAgainstData left = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
      if (left != null) {
         UnionWarAgainstData right = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(left.getEnemy());
         if (right != null) {
            UnionWarMsg.S2C_WarInfo_9704.Builder msg = UnionWarMsg.S2C_WarInfo_9704.newBuilder();
            msg.setStatus(this.unionMgrParent.warStatus);
            UnionWarMsg.WarAgainstData.Builder builder = UnionWarMsg.WarAgainstData.newBuilder();
            builder.setLeft(this.buildWarAgainstUnionData(left, this.unionDao.getWarStrongholdCurrentStar()));
            int star = left.getStrongholdDataMap().values().stream().mapToInt(UnionWarStrongholdData::getMaxStar).sum();
            builder.setRight(this.buildWarAgainstUnionData(right, star));
            msg.setOurAgainstData(builder);
            if (this.unionMgrParent.warStatus >= 3) {
               right.getStrongholdDataMap().forEach((key, value) -> msg.addMyStrongholdList(this.buildWarStrongholdData(key, value, false)));
               msg.setBuffLv(this.unionDao.warBuffLv);
            }

            this.broadcast(msg.build(), (List)null);
         }
      }
   }

   public void broadcastOurAgainstData() {
      UnionWarAgainstData left = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
      if (left != null) {
         UnionWarAgainstData right = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(left.getEnemy());
         if (right != null) {
            UnionWarMsg.S2C_WarInfo_9704.Builder msg = UnionWarMsg.S2C_WarInfo_9704.newBuilder();
            msg.setStatus(this.unionMgrParent.warStatus);
            UnionWarMsg.WarAgainstData.Builder builder = UnionWarMsg.WarAgainstData.newBuilder();
            builder.setLeft(this.buildWarAgainstUnionData(left, this.unionDao.getWarStrongholdCurrentStar()));
            int star = left.getStrongholdDataMap().values().stream().mapToInt(UnionWarStrongholdData::getMaxStar).sum();
            builder.setRight(this.buildWarAgainstUnionData(right, star));
            msg.setOurAgainstData(builder);
            this.broadcast(msg.build(), (List)null);
         }
      }
   }

   public void broadcastWarStatus() {
      UnionWarMsg.S2C_WarInfo_9704.Builder msg = UnionWarMsg.S2C_WarInfo_9704.newBuilder();
      msg.setStatus(this.unionMgrParent.warStatus);
      this.broadcast(msg.build(), (List)null);
   }

   public void broadcastWarBuff() {
      UnionWarMsg.S2C_WarInfo_9704.Builder msg = UnionWarMsg.S2C_WarInfo_9704.newBuilder();
      UnionWarAgainstData left = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.getUnion().unionId);
      if (left != null) {
         msg.setStatus(this.unionMgrParent.warStatus);
         msg.setBuffLv(this.unionDao.warBuffLv);
         this.broadcast(msg.build(), (List)null);
      }
   }

   public void broadcastWarAgainstData() {
      UnionWarAgainstData left = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
      if (left != null) {
         this.warIsMatch = left.getEnemy() > 0;
         UnionWarMsg.S2C_WarAgainstList_9702.Builder resp = UnionWarMsg.S2C_WarAgainstList_9702.newBuilder();
         Set<Integer> pushIds = new HashSet();
         pushIds.add(left.getId());
         pushIds.add(left.getEnemy());

         for(UnionWarAgainstData againstData : this.unionMgrParent.unionWarAgainstDataMap.values()) {
            if (!pushIds.contains(againstData.getId()) && !pushIds.contains(againstData.getEnemy()) && againstData.getEnemy() > 0) {
               UnionWarAgainstData right = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(againstData.getEnemy());
               if (right != null) {
                  UnionWarMsg.WarAgainstData.Builder builder = UnionWarMsg.WarAgainstData.newBuilder();
                  builder.setLeft(this.buildWarAgainstUnionData(againstData, right.getStar()));
                  builder.setRight(this.buildWarAgainstUnionData(right, againstData.getStar()));
                  resp.addAgainstList(builder);
                  pushIds.add(againstData.getId());
                  pushIds.add(againstData.getEnemy());
               }
            }
         }

         this.broadcast(resp.build(), (List)null);
      }
   }

   public void broadcastWarStrongholdData() {
      UnionWarMsg.S2C_WarInfo_9704.Builder msg = UnionWarMsg.S2C_WarInfo_9704.newBuilder();
      UnionWarAgainstData myData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.getUnion().unionId);
      if (myData != null && myData.getEnemy() > 0) {
         UnionWarAgainstData enemyData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(myData.getEnemy());
         if (enemyData != null) {
            enemyData.getStrongholdDataMap().forEach((key, value) -> msg.addMyStrongholdList(this.buildWarStrongholdData(key, value, false)));
         }

         msg.setStatus(this.unionMgrParent.warStatus);
         this.broadcast(msg.build(), (List)null);
      } else {
         msg.setStatus(-1);
         this.broadcast(msg.build(), (List)null);
      }
   }

   public void broadcastWarStrongholdData(int unionId, int position) {
      UnionWarMsg.S2C_WarStrongholdData_9718.Builder msg = UnionWarMsg.S2C_WarStrongholdData_9718.newBuilder();
      UnionWarAgainstData data = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(unionId);
      if (data != null) {
         UnionWarStrongholdData warStrongholdData = (UnionWarStrongholdData)data.getStrongholdDataMap().get(position);
         if (warStrongholdData != null) {
            msg.setWarStrongholdData(this.buildWarStrongholdData(position, warStrongholdData, unionId == this.getUnion().unionId));
            msg.setPlayerId(warStrongholdData.getId());
            this.broadcast(msg.build(), (List)null);
         }
      }
   }

   public UnionWarMsg.WarAgainstUnionData.Builder buildWarAgainstUnionData(UnionWarAgainstData againstData, int star) {
      UnionWarMsg.WarAgainstUnionData.Builder builder = UnionWarMsg.WarAgainstUnionData.newBuilder();
      builder.setId(againstData.getId());
      builder.setName(againstData.getName());
      builder.setServer(againstData.getsId());
      builder.setRank(againstData.getRank());
      builder.setStar(star);
      return builder;
   }

   public UnionWarMsg.WarStrongholdData.Builder buildWarStrongholdData(int position, UnionWarStrongholdData warStrongholdData, boolean isOur) {
      UnionWarMsg.WarStrongholdData.Builder builder = UnionWarMsg.WarStrongholdData.newBuilder();
      builder.setPosition(position);
      builder.setPlayerId(warStrongholdData.getId());
      builder.setPower(warStrongholdData.getPower());
      builder.setName(warStrongholdData.getName());
      ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(warStrongholdData.getArrayingData());
      if (arrayingMirror != null) {
         arrayingMirror.arrayingElementsMap.values().forEach((arrayingInfoData) -> {
            if (arrayingInfoData.heroAndFriend()) {
               builder.addHero((CommonMsg.HeroInfo)arrayingInfoData.toBuilder());
            }

         });
      }

      int star = 0;
      if (isOur) {
         UnionWarAgainstData left = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
         if (left != null) {
            star = ((UnionWarStrongholdData)left.getStrongholdDataMap().getOrDefault(position, new UnionWarStrongholdData())).getMaxStar();
         }
      } else {
         star = this.unionDao.getWarStrongholdCurrentStar(position);
      }

      builder.setStar(star);
      builder.setChallengeCount(this.unionDao.getWarStrongholdChallengeCount(position));
      builder.setFighting(!isOur && this.unionDao.warStrongholdFighting.containsKey(position));
      return builder;
   }

   public void enterWarBattle(GamePlayer player, BattleMsg.S2C_BattleResult_6102.Builder battleMsg) {
      CrossUnionWarMsg.S2CR_UnionWarBattle_10112.Builder msg = CrossUnionWarMsg.S2CR_UnionWarBattle_10112.newBuilder();
      msg.setBattleMsg(battleMsg);
      this.crossNettyClient.sendCross(this.unionDao.serverId, player.getPlayerId(), msg.build());
   }

   public void addWarAttackLog(UnionWarAttackLogDao warAttackLogData) {
      UnionWarAgainstData warAgainstData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(warAttackLogData.unionId);
      if (warAgainstData != null) {
         CrossUnionWarMsg.S2CR_UnionWarAttackLogUpload_10108.Builder msg = CrossUnionWarMsg.S2CR_UnionWarAttackLogUpload_10108.newBuilder();
         msg.setUnionId(warAgainstData.getEnemy());
         msg.setLogData(ByteString.copyFrom(SerializingUtil.serialize(warAttackLogData)));
         this.crossNettyClient.sendCross(warAgainstData.getsId(), warAttackLogData.unionId, msg.build());
         this.broadcastAttackRecord(warAttackLogData);
         this.broadcastAttackLog(warAttackLogData);
         this.insertWarAttackLog(warAttackLogData);
      }
   }

   public void addWarHoldLog(UnionWarAttackLogDao warAttackLogData) {
      this.insertWarAttackLog(warAttackLogData);
      this.broadcastAttackLog(warAttackLogData);
      this.broadcastAttackRecord(warAttackLogData);
   }

   public void insertWarAttackLog(UnionWarAttackLogDao warAttackLogDao) {
      this.unionMgrParent.getGameCachePool().insertDao(warAttackLogDao, true);
   }

   public List<UnionWarAttackLogDao> getAttackLogs() {
      return this.unionMgrParent.getGameCachePool().getList("tb_union_war_attack_log", new Object[]{this.unionDao.unionId});
   }

   public void sendWarAttackLogs(GamePlayer gamePlayer) {
      UnionWarMsg.S2C_WarAttackLogs_9708.Builder msg = UnionWarMsg.S2C_WarAttackLogs_9708.newBuilder();
      UnionWarAgainstData myData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(this.unionDao.unionId);
      if (myData != null && this.unionMgrParent.warStatus >= 3) {
         UnionWarAgainstData enemyData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.get(myData.getEnemy());
         if (enemyData == null) {
            gamePlayer.sendMsg(msg.build());
         } else {
            this.getAttackLogs().forEach((unionWarAttackLogDao) -> msg.addLogs(this.buildWarAttackLog(unionWarAttackLogDao)));
            gamePlayer.sendMsg(msg.build());
         }
      } else {
         gamePlayer.sendMsg(msg.build());
      }
   }

   public void sendAttackRecords(int size, GamePlayer gamePlayer) {
      UnionWarMsg.S2C_WarBattleRecordList_9720.Builder msg = UnionWarMsg.S2C_WarBattleRecordList_9720.newBuilder();
      msg.setSize(size);
      if (this.unionMgrParent.warStatus >= 3) {
         Map<Integer, List<UnionWarAttackLogDao>> map = new HashMap();
         this.getAttackLogs().stream().filter((warAttackLogDao) -> warAttackLogDao.size == size).forEach((warAttackLogDao) -> ((List)map.computeIfAbsent(warAttackLogDao.holdPlayerId, (v) -> new ArrayList())).add(warAttackLogDao));
         map.forEach((key, value) -> {
            UnionWarMsg.WarStrongholdRecordData.Builder strongholdBuilder = UnionWarMsg.WarStrongholdRecordData.newBuilder();
            strongholdBuilder.setPlayerId(key);
            value.forEach((warAttackLogDao) -> strongholdBuilder.addRecords(this.buildWarBattleRecordDataData(warAttackLogDao)));
            msg.addStronghold(strongholdBuilder);
         });
      }

      gamePlayer.sendMsg(msg.build());
   }

   public void broadcastAttackLog(UnionWarAttackLogDao warAttackLogDao) {
      UnionWarMsg.S2C_WarAttackLogs_9708.Builder msg = UnionWarMsg.S2C_WarAttackLogs_9708.newBuilder();
      msg.addLogs(this.buildWarAttackLog(warAttackLogDao));
      this.broadcast(msg.build(), (List)null);
   }

   public void broadcastAttackRecord(UnionWarAttackLogDao warAttackLogDao) {
      UnionWarMsg.S2C_WarBattleRecord_9722.Builder msg = UnionWarMsg.S2C_WarBattleRecord_9722.newBuilder();
      msg.setPlayerId(warAttackLogDao.holdPlayerId);
      msg.setRecord(this.buildWarBattleRecordDataData(warAttackLogDao));
      this.broadcast(msg.build(), (List)null);
   }

   private UnionWarMsg.WarBattleRecordData.Builder buildWarBattleRecordDataData(UnionWarAttackLogDao warAttackLogDao) {
      UnionWarMsg.WarBattleRecordData.Builder recordBuilder = UnionWarMsg.WarBattleRecordData.newBuilder();
      warAttackLogDao.getArrayingMirror().arrayingElementsMap.values().forEach((arrayingInfoData) -> {
         if (arrayingInfoData.heroAndFriend()) {
            recordBuilder.addHero((CommonMsg.HeroInfo)arrayingInfoData.toBuilder());
         }

      });
      recordBuilder.setTime(DateUtil.getIntTime(warAttackLogDao.time));
      recordBuilder.setStar(warAttackLogDao.star);
      recordBuilder.setPower(warAttackLogDao.power);
      recordBuilder.setRecordId(warAttackLogDao.recordId);
      recordBuilder.setPlayerId(warAttackLogDao.playerId);
      recordBuilder.setPlayerName(warAttackLogDao.playerName);
      recordBuilder.setIsWin(warAttackLogDao.isWin);
      recordBuilder.setServerId(warAttackLogDao.server);
      return recordBuilder;
   }

   private UnionWarMsg.WarAttackLogData.Builder buildWarAttackLog(UnionWarAttackLogDao unionWarAttackLogDao) {
      UnionWarMsg.WarAttackLogData.Builder builder = UnionWarMsg.WarAttackLogData.newBuilder();
      builder.setTime(DateUtil.getIntTime(unionWarAttackLogDao.time));
      builder.setAttackPlayerId(unionWarAttackLogDao.playerId);
      builder.setHoldPlayerId(unionWarAttackLogDao.holdPlayerId);
      builder.setContent(this.buildWarLogContent(unionWarAttackLogDao));
      return builder;
   }

   private String buildWarLogContent(UnionWarAttackLogDao warAttackLogData) {
      Map<Integer, UnionLogModel> unionLogModelMap = ApplicationContextProvider.<Integer, UnionLogModel>getModelPoolMap("unionLog");
      String desc;
      if (warAttackLogData.size == 1) {
         if (warAttackLogData.isWin) {
            if (warAttackLogData.star == 0) {
               desc = MessageFormat.format(((UnionLogModel)unionLogModelMap.get(23)).getDesc(), warAttackLogData.playerName, warAttackLogData.holdPlayerName);
            } else {
               StringBuilder starStr = new StringBuilder();

               for(int i = 1; i <= warAttackLogData.star; ++i) {
                  starStr.append("<img src=\"wj_xingxing1\"/>");
               }

               String unionName = ((UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.getOrDefault(warAttackLogData.unionId, new UnionWarAgainstData())).getName();
               desc = MessageFormat.format(((UnionLogModel)unionLogModelMap.get(17)).getDesc(), warAttackLogData.playerName, warAttackLogData.holdPlayerName, starStr, warAttackLogData.record, unionName, warAttackLogData.total);
            }
         } else if (warAttackLogData.star == 0) {
            desc = MessageFormat.format(((UnionLogModel)unionLogModelMap.get(24)).getDesc(), warAttackLogData.playerName, warAttackLogData.holdPlayerName);
         } else {
            desc = MessageFormat.format(((UnionLogModel)unionLogModelMap.get(20)).getDesc(), warAttackLogData.playerName, warAttackLogData.holdPlayerName, warAttackLogData.record);
         }
      } else if (warAttackLogData.isWin) {
         if (warAttackLogData.star == 0) {
            desc = MessageFormat.format(((UnionLogModel)unionLogModelMap.get(19)).getDesc(), warAttackLogData.playerName, warAttackLogData.holdPlayerName, warAttackLogData.buff);
         } else {
            StringBuilder starStr = new StringBuilder();

            for(int i = 1; i <= warAttackLogData.star; ++i) {
               starStr.append("<img src=\"wj_xingxing1\"/>");
            }

            UnionWarAgainstData unionWarAgainstData = (UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.getOrDefault(warAttackLogData.unionId, new UnionWarAgainstData());
            String unionName = ((UnionWarAgainstData)this.unionMgrParent.unionWarAgainstDataMap.getOrDefault(unionWarAgainstData.getEnemy(), new UnionWarAgainstData())).getName();
            desc = MessageFormat.format(((UnionLogModel)unionLogModelMap.get(18)).getDesc(), warAttackLogData.playerName, warAttackLogData.holdPlayerName, starStr, warAttackLogData.record, unionName, warAttackLogData.total);
         }
      } else if (warAttackLogData.star == 0) {
         desc = MessageFormat.format(((UnionLogModel)unionLogModelMap.get(22)).getDesc(), warAttackLogData.playerName, warAttackLogData.holdPlayerName);
      } else {
         desc = MessageFormat.format(((UnionLogModel)unionLogModelMap.get(21)).getDesc(), warAttackLogData.playerName, warAttackLogData.holdPlayerName, warAttackLogData.record);
      }

      return desc;
   }

   public void addWarShopExp(int exp) {
      UnionDao var10000 = this.unionDao;
      var10000.warShopExp += exp;
      ShopUnionWarLvModel currentLvModel = (ShopUnionWarLvModel)ApplicationContextProvider.getModelPoolEntity("shopUnionWarLv", this.unionDao.warShopLv);
      ShopUnionWarLvModel nextLvModel = (ShopUnionWarLvModel)ApplicationContextProvider.getModelPoolEntity("shopUnionWarLv", currentLvModel.getNextLevel());
      if (nextLvModel != null) {
         while(currentLvModel != null && currentLvModel.getNeedItemNum() <= this.unionDao.warShopExp) {
            var10000 = this.unionDao;
            var10000.warShopExp -= currentLvModel.getNeedItemNum();
            this.unionDao.warShopLv = currentLvModel.getNextLevel();
            currentLvModel = (ShopUnionWarLvModel)ApplicationContextProvider.getModelPoolEntity("shopUnionWarLv", this.unionDao.warShopLv);
         }
      }

      this.unionDao.updateOp();
      this.broadcastWarShop();
   }

   private void warRankReward() {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)centreAwardModelMap.get(CentreAwardModel.TYPE_UNION_WAR);
      this.warRank.values().forEach((unionWarRankData) -> {
         Optional<CentreAwardModel> rankRewardModelOpt = centreAwardMap.values().stream().filter((centreAwardModel) -> unionWarRankData.getRank() >= centreAwardModel.getMinRank() && unionWarRankData.getRank() <= centreAwardModel.getMaxRank()).findFirst();
         if (rankRewardModelOpt.isPresent()) {
            int playerId = unionWarRankData.getPlayerId();
            CentreAwardModel finalAward = (CentreAwardModel)rankRewardModelOpt.get();
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
            if (gamePlayer != null) {
               gamePlayer.pushTask(() -> {
                  MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, finalAward.getTitle(), finalAward.getDesc(), finalAward.getItems(), 604800000L, 5, 516);
               });
            }
         }

      });
   }

   public void recordContribution(int memberId, int contribution) {
      this.unionDao.memberTodayContribution.put(memberId, (Integer)this.unionDao.memberTodayContribution.getOrDefault(memberId, 0) + contribution);
      this.unionDao.updateOp();
      UnionMemberDao unionMemberDao = this.getUnionMember(memberId);
      if (unionMemberDao != null) {
         unionMemberDao.contribution += contribution;
         unionMemberDao.updateOp();
         GamePlayer player = this.getGamePlayer(memberId);
         if (player != null) {
            player.notifyPlayerData(PlayerDefine.PLAYER_HISTORY_CONTRIBUTION, unionMemberDao.contribution);
         }
      }

   }

   public void removeGiveRedPacket(UnionRedPacketGiveDao unionRedPacketGiveDao) {
      for(UnionRedPacketGetDao unionRedPacketGetDao : this.getGotRedPacketRecord(unionRedPacketGiveDao.id).values()) {
         this.unionMgrParent.getGameCachePool().deleteDao(unionRedPacketGetDao, false);
      }

      this.unionMgrParent.getGameCachePool().deleteDao(unionRedPacketGiveDao, true);
   }

   public void setUnionDao(UnionDao unionDao) {
      this.unionDao = unionDao;
   }

   public void uploadToCross(boolean onConnect, boolean dismiss) {
      CrossMsg.S2CR_UnionUpload_4216.Builder msg = CrossMsg.S2CR_UnionUpload_4216.newBuilder();
      msg.setId(this.unionDao.unionId);
      if (!dismiss) {
         msg.setCopyId(this.unionDao.copyId);
         msg.setLv(this.unionDao.level);
         msg.setName(this.unionDao.unionName);
         msg.setServer(this.unionDao.serverId);
         msg.setLeader(this.unionDao.leaderId);
         int unionHead = MiscUtil.getHiParam(this.unionDao.head);
         msg.setHead(unionHead);
      }

      msg.setOnConnect(onConnect);
      msg.setIsDismiss(dismiss);
      this.crossNettyClient.sendCrossNoDest(msg.build(), this.unionDao.serverId);
   }

   public int getMemberCopyTimes() {
      return this.unionDao.todayCopyChallenge;
   }

   public void changeLeaderToMaxPower(int playerId) {
      if (this.unionDao.leaderId == playerId) {
         Map<Integer, UnionMemberDao> unionMemberDaoMap = this.getUnionMembers();
         if (unionMemberDaoMap.size() > 1) {
            UnionMemberDao leaderMemberDao = (UnionMemberDao)unionMemberDaoMap.get(playerId);
            if (leaderMemberDao != null) {
               UnionMemberDao maxPowerMember = null;
               long maxPower = 0L;

               for(UnionMemberDao memberDao : unionMemberDaoMap.values()) {
                  if (memberDao.playerId != playerId) {
                     if (memberDao.position == 1) {
                        memberDao.position = 3;
                        memberDao.updateOp();
                     }

                     GamePlayer memberPlayer = this.worldMgr.getPlayerById(memberDao.playerId);
                     if (memberPlayer != null) {
                        PlayerPublicDao memberPublicDao = memberPlayer.getPublicDao();
                        if (memberPublicDao.banEndTime < System.currentTimeMillis() && memberPublicDao.combat_power > maxPower) {
                           maxPower = memberPlayer.getPlayerCombatPower();
                           maxPowerMember = memberDao;
                        }
                     }
                  }
               }

               if (maxPowerMember != null && maxPower > 0L) {
                  this.changeLeader(leaderMemberDao, maxPowerMember, true);
               }
            }
         }
      }
   }

   public void changeLeader(UnionMemberDao oldLeader, UnionMemberDao newLeader, boolean leaderBan) {
      if (this.unionDao.leaderId == oldLeader.playerId) {
         this.unionDao.leaderId = newLeader.playerId;
         this.unionDao.updateOp();
         oldLeader.position = 3;
         oldLeader.updateOp();
         newLeader.position = 1;
         newLeader.updateOp();
         this.broadcastMember(oldLeader.playerId);
         this.broadcastMember(newLeader.playerId);
         this.sendUnion((GamePlayer)null);
         this.uploadToCross(false, false);
         if (leaderBan) {
            this.sendMail(newLeader.playerId, CentreAwardModel.TYPE_UNION_LEADER_CHANGE_TO_ME_BAN);
            this.sendMail(oldLeader.playerId, CentreAwardModel.TYPE_UNION_LEADER_CANCEL_BAN);
         } else {
            this.sendMail(newLeader.playerId, CentreAwardModel.TYPE_UNION_LEADER_CHANGE_TO_ME);
         }

      }
   }

   public int handleDeputyLeader(GamePlayer beHandlePlayer, GamePlayer doHandlePlayer, boolean grant, boolean isBan) {
      if (beHandlePlayer == null) {
         return 17;
      } else {
         UnionMemberDao beHandleMember = this.getUnionMember(beHandlePlayer.getPlayerId());
         if (beHandleMember == null) {
            return 9035;
         } else {
            PlayerPublicDao beHandlePlayerDao = beHandlePlayer.getPublicDao();
            LanguageModel languageModel;
            int logType;
            int mailType;
            if (grant) {
               UnionModel unionModel = (UnionModel)ApplicationContextProvider.getModelPoolEntity("union", this.getUnion().level);
               if (unionModel == null || this.getDeputyLeaderCount() >= (long)unionModel.getViceLeaderNum()) {
                  return 9008;
               }

               if (beHandleMember.position == 2) {
                  return 9007;
               }

               languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "UnionAppointment");
               logType = 14;
               mailType = CentreAwardModel.TYPE_UNION_DEPUTY_LEADER_GRANT;
               beHandleMember.position = 2;
            } else {
               if (beHandleMember.position != 2) {
                  return 9006;
               }

               languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "RevocationOfAlliancePositions");
               logType = 15;
               if (isBan) {
                  mailType = CentreAwardModel.TYPE_UNION_DEPUTY_LEADER_CANCEL_BAN;
               } else {
                  mailType = CentreAwardModel.TYPE_UNION_DEPUTY_LEADER_CANCEL_GRANT;
               }

               beHandleMember.position = 3;
            }

            beHandleMember.updateOp();
            this.broadcastMember(beHandleMember.playerId);
            if (doHandlePlayer != null && languageModel != null) {
               PlayerPublicDao doHandlePlayerDao = doHandlePlayer.getPublicDao();
               String content = MessageFormat.format(languageModel.getValue(), doHandlePlayerDao.playerName, beHandlePlayerDao.playerName);
               this.chatMgr.sendUnionSystem(this.unionDao.unionId, content, 3);
               this.addLog(this.unionDao.unionId, logType, doHandlePlayerDao.playerName, beHandlePlayerDao.playerName);
            }

            this.sendMail(beHandleMember.playerId, mailType);
            return 1;
         }
      }
   }

   public void sendMail(int playerId, int mailType, String... args) {
      GamePlayer player = this.worldMgr.getPlayerById(playerId);
      if (player != null) {
         player.pushTask(() -> {
            Map<Integer, CentreAwardModel> mailModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customCentreAward", mailType);
            if (mailModelMap != null) {
               for(Map.Entry<Integer, CentreAwardModel> entry : mailModelMap.entrySet()) {
                  MailPart mailPart = (MailPart)player.getMgrPart(MailPart.class);
                  String desc = MessageFormat.format(((CentreAwardModel)entry.getValue()).getDesc(), args);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, ((CentreAwardModel)entry.getValue()).getTitle(), desc, ((CentreAwardModel)entry.getValue()).getItems(), 604800000L, 9, 935);
               }

            }
         });
      }
   }

   private long getDeputyLeaderCount() {
      Map<Integer, UnionMemberDao> memberDaoMap = this.getUnionMembers();
      return memberDaoMap.values().stream().filter((memberDao) -> memberDao.position == 2).count();
   }

   private void checkHeadUnlock(int targetType, int targetId) {
      Map<Long, List<UnionHeadModel>> unionHeadModelMap = ApplicationContextProvider.<Long, List<UnionHeadModel>>getModelPoolMap("customUnionHead");
      long key = MiscUtil.comboInteger(targetType, targetId);
      if (unionHeadModelMap != null && unionHeadModelMap.containsKey(key)) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());

         for(UnionHeadModel unionHeadModel : (List<UnionHeadModel>)unionHeadModelMap.get(key)) {
            if (key != 0L || unionHeadModel.getType() == 1) {
               if (this.unionDao.hasHead.containsKey(unionHeadModel.getId())) {
                  int invalidTime = (Integer)this.unionDao.hasHead.get(unionHeadModel.getId());
                  if (invalidTime == 0 || invalidTime > curTime) {
                     continue;
                  }
               }

               switch (targetType) {
                  case 101:
                     if (unionHeadModel.getTargetValue() > this.unionDao.level) {
                        break;
                     }
                  default:
                     int invalidTime = 0;
                     if (unionHeadModel.getTime() > 0) {
                        invalidTime = curTime + unionHeadModel.getTime();
                     }

                     this.unionDao.hasHead.put(unionHeadModel.getId(), invalidTime);
                     this.unionDao.updateOp();
               }
            }
         }

      }
   }

   public void warFightSettle(int position, int star, UnionWarAgainstData enemyData, int record, ArrayingMirror leftArrayingMirror, BattleScene battleScene, int server) {
      if (this.unionMgrParent.warStatus == 3) {
         if (enemyData != null) {
            if (leftArrayingMirror != null) {
               if (battleScene != null) {
                  BattlePKTeam pkTeam = battleScene.getPKTeam((byte)0);
                  UnionWarStrongholdData warStrongholdData = (UnionWarStrongholdData)enemyData.getStrongholdDataMap().get(position);
                  UnionDao unionDao = this.getUnion();
                  UnionMemberDao unionMemberDao = this.getUnionMember(pkTeam.getBelongId());
                  if (battleScene.getWinForce() == 0) {
                     ((List)unionDao.warStrongholds.computeIfAbsent(position, (v) -> new ArrayList())).add(star);
                     warStrongholdData.setMaxStar(Math.min(unionDao.getWarStrongholdCurrentStar(position), 3));
                     if (star == 0) {
                        ++unionDao.warBuffLv;
                        this.broadcastWarBuff();
                     } else {
                        unionMemberDao.warStar += star;
                        this.broadcastOurAgainstData();
                        if (star == 3) {
                           LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "AllianceBattle");
                           String content = MessageFormat.format(languageModel.getValue(), pkTeam.getBelongName(), enemyData.getName(), warStrongholdData.getName());
                           this.chatMgr.sendUnionSystem(unionDao.unionId, content, 3);
                        }
                     }
                  }

                  unionMemberDao.warRecord += record;
                  unionMemberDao.updateOp();
                  this.updateWarRank(unionMemberDao.playerId);
                  unionDao.updateOp();
                  this.broadcastWarStrongholdData(enemyData.getId(), position);
                  if (battleScene.getBattleMsg() != null) {
                     UnionWarAttackLogDao warAttackLogData = new UnionWarAttackLogDao();
                     warAttackLogData.playerId = pkTeam.getBelongId();
                     warAttackLogData.playerName = pkTeam.getBelongName();
                     warAttackLogData.position = position;
                     warAttackLogData.record = record;
                     warAttackLogData.power = leftArrayingMirror.power;
                     warAttackLogData.star = star;
                     warAttackLogData.isWin = battleScene.getWinForce() == 0;
                     warAttackLogData.arrayingData = leftArrayingMirror.toByteArray();
                     warAttackLogData.total = unionDao.getWarStrongholdCurrentStar();
                     warAttackLogData.recordId = battleScene.getBattleMsg().getResult().getRecordId();
                     warAttackLogData.buff = unionDao.warBuffLv;
                     warAttackLogData.unionId = unionDao.unionId;
                     warAttackLogData.holdPlayerId = warStrongholdData.getId();
                     warAttackLogData.holdPlayerName = warStrongholdData.getName();
                     warAttackLogData.time = battleScene.getStartTime();
                     warAttackLogData.server = server;
                     this.addWarAttackLog(warAttackLogData);
                  }

               }
            }
         }
      }
   }

   public void unionAddNumber(GamePlayer player) {
      int openServerDays = this.worldMgr.getOpenServerDays();
      int unionAddNumOpenTime = this.configManager.getIntDefault("unionAddNumOpenTime", 50);
      if (openServerDays < unionAddNumOpenTime) {
         player.failure(54);
      } else {
         this.unionMgrParent.pushTask(() -> {
            UnionMemberDao unionMemberDao = this.getUnionMember(player.getPlayerId());
            if (null == unionMemberDao) {
               player.failure(23);
            } else if (unionMemberDao.position != 1 && unionMemberDao.position != 2) {
               player.failure(76136);
            } else {
               UnionDao unionDao = this.getUnion();
               int curUnionAddNumberId = unionDao.curUnionAddNumberId;
               UnionAddNumberModel unionAddNumberModel = (UnionAddNumberModel)ApplicationContextProvider.getModelPoolEntity("unionAddNumber", curUnionAddNumberId + 1);
               if (null == unionAddNumberModel) {
                  player.failure(25);
               } else if (unionAddNumberModel.getUnlockCondition() > 0 && !player.isAfterMerge()) {
                  player.failure(9045);
               } else if (!player.checkResourceNum(unionAddNumberModel.getItemType(), unionAddNumberModel.getItemId(), unionAddNumberModel.getItemNum())) {
                  player.failure(31);
               } else {
                  ++unionDao.curUnionAddNumberId;
                  unionDao.updateOp();
                  player.delResource(unionAddNumberModel.getItemType(), unionAddNumberModel.getItemId(), (long)unionAddNumberModel.getItemNum(), 110, 11001, 0, 0, "");
                  this.sendUnionAddNumberInfo(player, player.getPlayerId());
                  Map<Integer, UnionMemberDao> unionMembers = this.getUnionMembers();

                  for(Map.Entry<Integer, UnionMemberDao> playerId_unionMemberDao : unionMembers.entrySet()) {
                     Integer memberId = (Integer)playerId_unionMemberDao.getKey();
                     if (memberId != player.getPlayerId()) {
                        GamePlayer member = this.worldMgr.getPlayerById(memberId);
                        if (null != member && member.isLogin()) {
                           this.sendUnionAddNumberInfo(member, player.getPlayerId());
                        }
                     }
                  }

               }
            }
         });
      }
   }

   public void sendUnionAddNumberInfo(GamePlayer player, int handlePlayerId) {
      UnionExtendMsg.S2C_UnionAddNumber_17506.Builder resp = UnionExtendMsg.S2C_UnionAddNumber_17506.newBuilder();
      resp.setCurUnionAddNumberId(this.getUnion().curUnionAddNumberId);
      resp.setPlayerId(handlePlayerId);
      player.sendMsg(resp.build());
   }

   public void sendMemberLeavl(int playerId) {
      Set<Integer> playerSet = new HashSet();
      playerSet.add(playerId);
      this.sendMemberLeavl(playerSet);
   }

   public void sendMemberLeavl(Set<Integer> playerIds) {
      if (playerIds.size() != 0) {
         UnionMsg.S2C_MemberLeave_6996.Builder builder = UnionMsg.S2C_MemberLeave_6996.newBuilder();
         builder.addAllPlayerId(playerIds);
         this.broadcast(builder.build(), (List)null);
      }
   }
}
