package com.gzbz.megerWar;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.gzbz.db.MergeWarInfoDao;
import com.gzbz.db.MergeWarUnionDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.UnionMemberDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.mail.MailWorldMgr;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.megerWar.bean.MergeWarOpenData;
import com.gzbz.megerWar.part.MergeWarGamePart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.HeFuBattleConfigModel;
import com.gzbz.model.HeFuStageModel;
import com.gzbz.model.HefuPointRewardModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CrossCoreWarMsg;
import com.gzbz.protobuf.MergeWarBossMsg;
import com.gzbz.protobuf.MergeWarGameMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RankMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@MgrAnno
public class CoreWarMgr extends GameMgr {
   @Autowired
   public WorldMgr worldMgr;
   @Autowired
   private OnLineMgr onLineMgr;
   public Set<Integer> onWarPlayerSet = new HashSet();
   @Autowired
   UnionMgrParent unionMgrParent;
   @Autowired
   private MailWorldMgr mailWorldMgr;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;
   public Set<Integer> onBossPlayerSet = new HashSet();
   private MergeWarOpenData nextMergeWarOpenData = null;

   public void dailyReset(long curTime) {
      logger.warn("【双城之战】每日检测 serverId:{}", this.worldMgr.GAME_SERVER_ID);
      String strDate = DateUtil.transferLongToDate(curTime);
      MergeWarInfoDao dao = this.getMergeWarInfoDao();
      if (dao.isOpening) {
         log.info("【{}】-【双城之战】开启中，不再检测  serverId:{} type:{} stage:{} subState:{} firstOpenTime:{} secondOpenTime:{} endTime:{} openEntrance:{}", new Object[]{strDate, this.worldMgr.GAME_SERVER_ID, dao.type, dao.stage, dao.subState, dao.firstOpenTime, dao.secondOpenTime, dao.endTime, dao.openEntrance});
      } else {
         if (!dao.openEntrance) {
            this.checkOpenEntrance();
         }

         if (this.checkSystemOpenState(curTime)) {
            ;
         }
      }
   }

   public int getSubState() {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      return !mergeWarInfoDao.isOpening ? 0 : mergeWarInfoDao.subState;
   }

   @TaskMethod
   public void doJob() {
      this.checkState();
   }

   public void checkState() {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening) {
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         int rewardOffsetTime = ApplicationContextProvider.getConfigInt("MergeWarGameBossRankRewardOffsetTime", 120);
         if (!mergeWarInfoDao.hadFirstReward && curTime >= mergeWarInfoDao.secondOpenTime + rewardOffsetTime) {
            logger.info("【双城之战】已进入第二阶段，发送第一阶段奖励 serverId:{}", this.worldMgr.GAME_SERVER_ID);
            this.sendBossRankReward();
         }

         if (mergeWarInfoDao.isOpening && curTime >= mergeWarInfoDao.endTime) {
            this.setSubState(16);
            mergeWarInfoDao.isOpening = false;
            mergeWarInfoDao.updateOp();
         }
      }
   }

   public void deleteActivityInfos() {
      logger.warn("【双城之战】删除相关的表，serverId:{}", this.worldMgr.GAME_SERVER_ID);
      this.rankMgr.removeRanks(RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE);
      this.gameCachePool.deleteAll("tb_merge_war_union");
   }

   public MergeWarInfoDao getMergeWarInfoDao() {
      MergeWarInfoDao dao = (MergeWarInfoDao)this.gameCachePool.getData("tb_merge_war_info", new Object[]{4207});
      return dao;
   }

   public Map<Integer, MergeWarUnionDao> getMergeWarUnionDaos() {
      return this.gameCachePool.getAllTableByMap("tb_merge_war_union");
   }

   public MergeWarUnionDao getMergeWarUnionDao(int unionId) {
      Map<Integer, MergeWarUnionDao> map = this.getMergeWarUnionDaos();
      if (!map.containsKey(unionId)) {
         MergeWarUnionDao mergeWarUnionDao = new MergeWarUnionDao();
         mergeWarUnionDao.init(unionId);
         this.gameCachePool.insertDao(mergeWarUnionDao, true);
         return mergeWarUnionDao;
      } else {
         return (MergeWarUnionDao)map.get(unionId);
      }
   }

   public void enterBossGame(GamePlayer player, boolean leave) {
      if (leave) {
         this.onBossPlayerSet.remove(player.getPlayerId());
      } else {
         this.onBossPlayerSet.add(player.getPlayerId());
      }
   }

   public void loginHandle(GamePlayer player) {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening && DateUtil.getIntTime(System.currentTimeMillis()) < mergeWarInfoDao.endTime) {
         MergeWarBossMsg.S2C_ActivityInfo_19408 builder = this.getInfoBuilder();
         player.sendMsg(builder);
      }

   }

   public void recordBossDamage(int playerId, int unionId, long damage) {
      if (unionId != 0) {
         MergeWarUnionDao mergeWarUnionDao = this.getMergeWarUnionDao(unionId);
         ++mergeWarUnionDao.figth;
         ++mergeWarUnionDao.totalFight;
         mergeWarUnionDao.totalDamage += damage;
         long oriValue = (Long)mergeWarUnionDao.damageMap.getOrDefault(playerId, 0L);
         mergeWarUnionDao.damageMap.put(playerId, oriValue + damage);
         mergeWarUnionDao.updateOp();
         long oriTotalDamage = this.rankMgr.getScore(RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE, unionId);
         this.rankMgr.updateRank(RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE, oriTotalDamage + damage, unionId);
         MergeWarBossMsg.S2C_HurtRank_19412.Builder builder = MergeWarBossMsg.S2C_HurtRank_19412.newBuilder();

         for(RankData rankData : this.rankMgr.getRanks(RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE, 3)) {
            RankMsg.RankUnionData.Builder rankUnionMsg = RankMsg.RankUnionData.newBuilder();
            rankUnionMsg.setRank(rankData.rank);
            rankUnionMsg.setScore(rankData.score);
            rankUnionMsg.setUnionId(rankData.value);
            UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(rankData.value);
            if (unionMgr != null) {
               UnionDao unionDao = unionMgr.getUnion();
               rankUnionMsg.setUnionName(unionDao.unionName);
               rankUnionMsg.setLevel(unionDao.level);
               rankUnionMsg.setLeaderId(unionDao.leaderId);
               GamePlayer leadPlayer = this.worldMgr.getPlayerById(unionDao.leaderId);
               rankUnionMsg.setLeaderName(leadPlayer.getPublicDao().playerName);
               rankUnionMsg.setCount(unionMgr.getUnionMembers().size());
               rankUnionMsg.setCurUnionAddNumberId(unionDao.curUnionAddNumberId);
               builder.addRanks(rankUnionMsg);
            }
         }

         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
      }
   }

   public void sendBossRankReward() {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      mergeWarInfoDao.hadFirstReward = true;
      mergeWarInfoDao.updateOp();
      List<RankData> rankList = this.rankMgr.getRanks(RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE, 100);
      int rewardGroup = ApplicationContextProvider.getConfigInt("MergeWarBossRankReward", 2082);
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("customCentreAward", rewardGroup);

      for(CentreAwardModel centreAwardModel : rewardMap.values()) {
         for(int i = 0; i < rankList.size(); ++i) {
            Map<Integer, String> offlinePlayerRewardMap = new HashMap();
            RankData rankData = (RankData)rankList.get(i);
            int rank = rankData.rank;
            if (rank >= centreAwardModel.getMinRank() && rank <= centreAwardModel.getMaxRank()) {
               int unionId = rankData.value;
               MergeWarUnionDao mergeWarUnionDao = this.getMergeWarUnionDao(unionId);
               if (mergeWarUnionDao.awarded) {
                  logger.info("合服争霸 - 已发伤害奖励，直接跳过 unionId:{}", unionId);
               } else {
                  UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(unionId);
                  if (unionMgr == null) {
                     logger.info("合服争霸 - 找不到军团管理器 rank:{} unionId:{}", rank, unionId);
                  } else {
                     mergeWarUnionDao.awarded = true;
                     mergeWarUnionDao.updateOp();
                     Map<Integer, UnionMemberDao> unionMembers = unionMgr.getUnionMembers();

                     for(int playerId : unionMembers.keySet()) {
                        if (mergeWarUnionDao.damageMap.containsKey(playerId)) {
                           GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                           if (gamePlayer != null) {
                              if (gamePlayer.isLogin()) {
                                 MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                                 String format = MessageFormat.format(centreAwardModel.getDesc(), rank);
                                 mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, centreAwardModel.getItems(), 604800000L, 94, 9403});
                              } else {
                                 offlinePlayerRewardMap.put(gamePlayer.getPlayerId(), String.valueOf(rank));
                              }
                           }
                        }
                     }

                     if (offlinePlayerRewardMap.size() > 0) {
                        this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), offlinePlayerRewardMap, 604800000L, 94, 9403, 0);
                     }
                  }
               }
            }
         }
      }

      if (rankList.size() > 0) {
         RankData rankData = (RankData)rankList.get(0);
         logger.warn("serverId:{} unionId:{} damage:{} 获得了第一名", new Object[]{this.worldMgr.GAME_SERVER_ID, rankData.value, rankData.score});
      } else {
         logger.warn("serverId:{} 没有军团参与合服争霸第一阶段", this.worldMgr.GAME_SERVER_ID);
      }

   }

   public void setSubState(int subState) {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      mergeWarInfoDao.subState = subState;
      mergeWarInfoDao.updateOp();
      this.notifyStageChange();
   }

   public void notifyStageChange() {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      MergeWarBossMsg.S2C_UpdateState_19410.Builder builder = MergeWarBossMsg.S2C_UpdateState_19410.newBuilder();
      builder.setStage(mergeWarInfoDao.stage);
      builder.setSubState(mergeWarInfoDao.subState);
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
      logger.info("合服争霸 {}服状态变更 stage:{}  subState:{}", new Object[]{this.worldMgr.GAME_SERVER_ID, mergeWarInfoDao.stage, mergeWarInfoDao.subState});
   }

   protected boolean checkSystemOpenState(long curTime) {
      MergeWarOpenData mergeWarOpenData = this.getLocalNextOpenTime();
      if (mergeWarOpenData == null) {
         return false;
      } else if (DateUtil.isSameDay((long)mergeWarOpenData.openTime * 1000L) && mergeWarOpenData.group > 0) {
         logger.warn("【双城之战】{}服符合配置开启时间：【{}】，发送到跨服，请求同战区开启玩法 group:{}", new Object[]{this.worldMgr.GAME_SERVER_ID, DateUtil.transferLongToDate(curTime), mergeWarOpenData.group});
         this.synchronizeOpen(mergeWarOpenData.group);
         return true;
      } else {
         return false;
      }
   }

   public void createCompeteInfoDao(int type, int modelGroup, int firstOpenTime, int secondOpenTime, int endTime, int stage, int subState, boolean isConnect) {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      if (isConnect && mergeWarInfoDao.firstOpenTime > 0 && mergeWarInfoDao.firstOpenTime == firstOpenTime && mergeWarInfoDao.endTime == endTime) {
         logger.info("【双城之战】跨服通知开启玩法，原本就已开启，同步一下状态");
         mergeWarInfoDao.stage = stage;
         mergeWarInfoDao.subState = subState;
         mergeWarInfoDao.updateOp();
      } else {
         logger.info("【双城之战】跨服通知开启玩法，modelGroup:{} 第一阶段开启时间{}，第二阶段开启时间{}，结束时间{}", new Object[]{modelGroup, DateUtil.transferLongToDate((long)firstOpenTime * 1000L), DateUtil.transferLongToDate((long)secondOpenTime * 1000L), DateUtil.transferLongToDate((long)endTime * 1000L)});
         this.deleteActivityInfos();
         mergeWarInfoDao.systemId = 4207;
         mergeWarInfoDao.type = type;
         mergeWarInfoDao.stage = stage;
         mergeWarInfoDao.subState = subState;
         mergeWarInfoDao.firstOpenTime = firstOpenTime;
         mergeWarInfoDao.secondOpenTime = secondOpenTime;
         mergeWarInfoDao.endTime = endTime;
         mergeWarInfoDao.hadFirstReward = false;
         mergeWarInfoDao.isOpening = true;
         ++mergeWarInfoDao.count;
         mergeWarInfoDao.promoteUnion = 0;
         mergeWarInfoDao.modelGroup = modelGroup;
         mergeWarInfoDao.openEntrance = true;
         mergeWarInfoDao.updateOp();
         MergeWarBossMsg.S2C_ActivityInfo_19408 builder = this.getInfoBuilder();
         this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder});
      }
   }

   public void synchronizeOpen(int modelGroup) {
      logger.info("【双城之战】serverId:{} 开启了双城之战玩法", this.worldMgr.GAME_SERVER_ID);
      CrossCoreWarMsg.S2CR_SynchronizeOpen_21145.Builder builder = CrossCoreWarMsg.S2CR_SynchronizeOpen_21145.newBuilder();
      builder.setModelGroup(modelGroup);
      builder.setOpenTimestamp(DateUtil.getDayStartTimeStamp());
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, builder.build());
   }

   private MergeWarBossMsg.S2C_ActivityInfo_19408 getInfoBuilder() {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      MergeWarBossMsg.S2C_ActivityInfo_19408.Builder builder = MergeWarBossMsg.S2C_ActivityInfo_19408.newBuilder();
      builder.setCreateType(mergeWarInfoDao.type);
      builder.setStage(mergeWarInfoDao.stage);
      builder.setSubState(mergeWarInfoDao.subState);
      builder.setFirstOpenTime(mergeWarInfoDao.firstOpenTime);
      builder.setSecondOpenTime(mergeWarInfoDao.secondOpenTime);
      builder.setEndTime(mergeWarInfoDao.endTime);
      builder.setModelGroup(mergeWarInfoDao.modelGroup);
      return builder.build();
   }

   protected void init() throws Exception {
   }

   @MsgHandlerAnno
   public void CR2S_WarInfo_21102(CrossCoreWarMsg.CR2S_WarInfo_21102 msg, CrossSubscribeMsg crossSubscribeMsg) {
      GamePlayer player = this.worldMgr.getPlayerById(crossSubscribeMsg.destMgrId);
      if (player != null) {
         boolean leave = msg.getLeave();
         if (leave) {
            this.onWarPlayerSet.remove(player.getPlayerId());
         } else {
            this.onWarPlayerSet.add(player.getPlayerId());
            MergeWarGameMsg.S2C_WarInfo_19502 warInfo = msg.getWarInfo();
            player.sendMsg(warInfo);
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_Move_21104(CrossCoreWarMsg.CR2S_Move_21104 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int playerId = msg.getPlayerId();
      List<Integer> gridList = msg.getGridIdList();
      boolean transfer = msg.getTransfer();
      MergeWarGameMsg.S2C_Move_19506.Builder builder = MergeWarGameMsg.S2C_Move_19506.newBuilder();
      builder.setPlayerId(playerId);
      builder.addAllGridId(gridList);
      builder.setTransfer(transfer);
      builder.setServerId(msg.getServerId());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_UpdateBuildingInfo_21110(CrossCoreWarMsg.CR2S_UpdateBuildingInfo_21110 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MergeWarGameMsg.S2C_UpdateBuildingInfo_19524.Builder builder = MergeWarGameMsg.S2C_UpdateBuildingInfo_19524.newBuilder();
      builder.addAllBuildingInfo(msg.getBuildingInfoList());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_ScoreReward_21112(CrossCoreWarMsg.CR2S_ScoreReward_21112 msg, CrossSubscribeMsg crossSubscribeMsg) {
      GamePlayer player = this.worldMgr.getPlayerById(crossSubscribeMsg.destMgrId);
      if (player != null) {
         HefuPointRewardModel model = (HefuPointRewardModel)ApplicationContextProvider.getModelPoolEntity("HefuPointReward", msg.getScoreId());
         player.addResource(model.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 94, 9405, 0, 0, "");
         MergeWarGameMsg.S2C_ScoreReward_19526.Builder builder = MergeWarGameMsg.S2C_ScoreReward_19526.newBuilder();
         builder.setScoreId(msg.getScoreId());
         player.sendMsg(builder.build());
      }

   }

   @MsgHandlerAnno
   public void CR2S_PlayerEnter_21114(CrossCoreWarMsg.CR2S_PlayerEnter_21114 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MergeWarGameMsg.S2C_PlayerEnter_19528.Builder builder = MergeWarGameMsg.S2C_PlayerEnter_19528.newBuilder();
      MergeWarGameMsg.PlayerInfo playerInfo = msg.getPlayerInfo();
      builder.setPlayerInfo(playerInfo);
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_UnionCoreHurt_21116(CrossCoreWarMsg.CR2S_UnionCoreHurt_21116 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MergeWarGameMsg.S2C_UnionCoreHurt_19530.Builder builder = MergeWarGameMsg.S2C_UnionCoreHurt_19530.newBuilder();
      builder.addAllInfo(msg.getInfoList());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_Log_21118(CrossCoreWarMsg.CR2S_Log_21118 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MergeWarGameMsg.S2C_Log_19532 builder = msg.getMsg();
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder});
   }

   @MsgHandlerAnno
   public void CR2S_LogLamp_21120(CrossCoreWarMsg.CR2S_LogLamp_21120 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MergeWarGameMsg.S2C_LogLamp_19534 builder = msg.getMsg();
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder});
   }

   @MsgHandlerAnno
   public void CR2S_SetDestGrid_21122(CrossCoreWarMsg.CR2S_SetDestGrid_21122 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MergeWarGameMsg.S2C_SetDestGrid_19538.Builder builder = MergeWarGameMsg.S2C_SetDestGrid_19538.newBuilder();
      builder.setType(msg.getType());
      builder.addAllGridId(msg.getGridIdList());
      builder.setPlayerId(msg.getPlayerId());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_UnionWarEnd_21126(CrossCoreWarMsg.CR2S_UnionWarEnd_21126 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("【双城之战】跨服发回的数据，第二阶段结束");
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      mergeWarInfoDao.subState = 16;
      mergeWarInfoDao.updateOp();
      MergeWarGameMsg.S2C_UnionWarEnd_19542.Builder builder = MergeWarGameMsg.S2C_UnionWarEnd_19542.newBuilder();
      builder.addAllUnionId(msg.getUnionIdList());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_UpdateState_21130(CrossCoreWarMsg.CR2S_UpdateState_21130 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("【双城之战】跨服发回的数据，状态变更 stage:{} subState:{}", msg.getStage(), msg.getSubState());
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      mergeWarInfoDao.stage = msg.getStage();
      mergeWarInfoDao.subState = msg.getSubState();
      mergeWarInfoDao.updateOp();
      MergeWarBossMsg.S2C_UpdateState_19410.Builder builder = MergeWarBossMsg.S2C_UpdateState_19410.newBuilder();
      builder.setStage(mergeWarInfoDao.stage);
      builder.setSubState(mergeWarInfoDao.subState);
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_PlayerArraying_21134(CrossCoreWarMsg.CR2S_PlayerArraying_21134 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("跨服请求玩家阵容 playerId:{}", msg.getPlayerId());
      GamePlayer player = this.worldMgr.getPlayerById(msg.getPlayerId());
      player.pushTask(() -> {
         MergeWarGamePart mergeWarGamePart = (MergeWarGamePart)player.getMgrPart(MergeWarGamePart.class);
         mergeWarGamePart.sendArrayingToCross();
      });
   }

   @MsgHandlerAnno
   public void CR2S_UpdateProperty_21136(CrossCoreWarMsg.CR2S_UpdateProperty_21136 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MergeWarGameMsg.S2C_UpdateProperty_19518.Builder builder = MergeWarGameMsg.S2C_UpdateProperty_19518.newBuilder();
      builder.addAllData(msg.getDataList());
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   @MsgHandlerAnno
   public void CR2S_TriggerTask_21138(CrossCoreWarMsg.CR2S_TriggerTask_21138 msg, CrossSubscribeMsg crossSubscribeMsg) {
      GamePlayer player = this.worldMgr.getPlayerById(msg.getPlayerId());
      if (player != null) {
         player.pushTask(() -> player.triggerTask(msg.getTargetType(), msg.getTargetX(), msg.getOpValue(), msg.getOpType()));
      }

   }

   @MsgHandlerAnno
   public void CR2S_GameRank_21140(CrossCoreWarMsg.CR2S_GameRank_21140 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int unionId = msg.getUnionId();
      int unionRank = msg.getRank() + 1;
      int chapterId = msg.getChapterId();
      List<RankMsg.RankData> rankList = new ArrayList(msg.getRanksList());
      List<Integer> playerIdsList = new ArrayList();

      for(RankMsg.RankData rankData : rankList) {
         playerIdsList.add(rankData.getPlayerId());
         logger.info("【双城之战】第二阶段军团成员排行 rank:{} playerId:{} damage:{}", new Object[]{rankData.getRank(), rankData.getPlayerId(), rankData.getScore()});
      }

      logger.info("【双城之战】军团排行 serverId:{} chapterId:{} unionId:{} rank:{}", new Object[]{crossSubscribeMsg.destServerId, chapterId, unionId, unionRank});
      int rewardGroup = ApplicationContextProvider.getConfigInt("MergeWarGameRankReward", 2302);
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardModelMap = (TreeMap)centreAwardModelMap.get(rewardGroup);

      for(CentreAwardModel centreAwardModel : rewardModelMap.values()) {
         Map<Integer, String> offlinePlayerRewardMap = new HashMap();
         if (unionRank <= centreAwardModel.getMinRank() && unionRank >= centreAwardModel.getMaxRank()) {
            UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(unionId);
            if (unionMgr == null) {
               logger.info("【双城之战】找不到军团管理器 rank:{} unionId:{}", unionRank, unionId);
            } else {
               Map<Integer, UnionMemberDao> unionMembers = unionMgr.getUnionMembers();

               for(int playerId : unionMembers.keySet()) {
                  if (playerIdsList.contains(playerId)) {
                     GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
                     if (gamePlayer != null) {
                        if (gamePlayer.isLogin()) {
                           MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                           String format = MessageFormat.format(centreAwardModel.getDesc(), unionRank);
                           mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, centreAwardModel.getItems(), 604800000L, 94, 9403});
                        } else {
                           offlinePlayerRewardMap.put(gamePlayer.getPlayerId(), String.valueOf(unionRank));
                        }
                     }
                  }
               }

               if (offlinePlayerRewardMap.size() > 0) {
                  this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), offlinePlayerRewardMap, 604800000L, 94, 9403, 0);
               }
            }
         }
      }

      HeFuBattleConfigModel battleConfigModel = (HeFuBattleConfigModel)ApplicationContextProvider.getModelPoolEntity("HefuBattleConfig", chapterId);
      List<Integer> pointGroup = battleConfigModel.getPointGroup();
      LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(pointGroup.get(unionRank - 1));
      if (!CollectionUtils.isEmpty(rewardMap)) {
         for(CentreAwardModel centreAwardModel : rewardMap.values()) {
            Map<Integer, String> offlinePlayerRewardMap = new HashMap();
            Iterator<RankMsg.RankData> iterator = rankList.iterator();

            while(iterator.hasNext()) {
               RankMsg.RankData rankData = (RankMsg.RankData)iterator.next();
               if (centreAwardModel.getMinRank() <= rankData.getRank() && centreAwardModel.getMaxRank() >= rankData.getRank()) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.getPlayerId());
                  if (gamePlayer != null) {
                     if (gamePlayer.isLogin()) {
                        MailPart mailPart = (MailPart)gamePlayer.getMgrPart(MailPart.class);
                        String format = MessageFormat.format(centreAwardModel.getDesc(), rankData.getRank());
                        mailPart.pushTaskEx("addMailOfEffectTime", new Object[]{MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), format, centreAwardModel.getItems(), 604800000L, 94, 9406});
                     } else {
                        offlinePlayerRewardMap.put(gamePlayer.getPlayerId(), String.valueOf(rankData.getRank()));
                     }

                     logOperationMgr.addReceiveAwardNewLog(gamePlayer, 17, 0, "双城之战", "军团成员积分" + centreAwardModel.getId(), "排名奖励" + centreAwardModel.getId(), 0, 0, 1);
                     iterator.remove();
                  }
               }
            }

            if (!offlinePlayerRewardMap.isEmpty()) {
               this.mailWorldMgr.addParamsMail(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), centreAwardModel.getItems(), offlinePlayerRewardMap, 604800000L, 94, 9406, 0);
            }
         }

      }
   }

   @MsgHandlerAnno
   public void CR2S_PromoteUnion_21144(CrossCoreWarMsg.CR2S_PromoteUnion_21144 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.sendPromoteUnion(true);
   }

   private void sendPromoteUnion(boolean formal) {
      CrossCoreWarMsg.S2CR_PromoteUnion_21143.Builder builder = CrossCoreWarMsg.S2CR_PromoteUnion_21143.newBuilder();
      List<RankData> rankList = this.rankMgr.getRanks(RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE, 1);
      if (rankList.size() > 0) {
         RankData rankData = (RankData)rankList.get(0);
         builder.setUnionId(rankData.value);
         builder.setDamage(rankData.score);
         if (formal) {
            MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
            mergeWarInfoDao.promoteUnion = rankData.value;
            mergeWarInfoDao.updateOp();
            logger.warn("serverId:{} unionId:{} damage:{} 获得了第一名", new Object[]{this.worldMgr.GAME_SERVER_ID, rankData.value, rankData.score});
         }

         this.unionMgrParent.pushTask(() -> {
            UnionMgr unionMgr = this.unionMgrParent.getUnionMgr(rankData.value);
            if (unionMgr != null) {
               unionMgr.uploadToCross(false, false);
            }

         });
      } else {
         builder.setUnionId(0);
         builder.setDamage(0L);
      }

      builder.setFormal(formal);
      this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_SynchronizeOpen_21146(CrossCoreWarMsg.CR2S_SynchronizeOpen_21146 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getIsOpen()) {
         this.createCompeteInfoDao(3, msg.getModelGroup(), msg.getFirstOpenTime(), msg.getSecondOpenTime(), msg.getEndTime(), msg.getStage(), msg.getSubState(), msg.getIsConnect());
      } else {
         this.checkOpenEntrance();
         this.checkSystemOpenState(System.currentTimeMillis());
      }

   }

   @MsgHandlerAnno
   public void CR2S_SendBossReward_21148(CrossCoreWarMsg.CR2S_SendBossReward_21148 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("【双城之战】跨服通知发送第一阶段奖励 serverId:{}", this.worldMgr.GAME_SERVER_ID);
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      if (!mergeWarInfoDao.hadFirstReward) {
         this.sendBossRankReward();
      }

      if (msg.getDeleteData()) {
         this.onWarPlayerSet.clear();
      }

      this.sendPromoteUnion(false);
   }

   @MsgHandlerAnno
   public void CR2S_Termination_21154(CrossCoreWarMsg.CR2S_Termination_21154 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      logger.info("【双城之战】被调整到其他分区， serverId:{}", this.worldMgr.GAME_SERVER_ID);
      if (!mergeWarInfoDao.hadFirstReward) {
         this.sendBossRankReward();
      }

      mergeWarInfoDao.stage = 2;
      mergeWarInfoDao.subState = 16;
      mergeWarInfoDao.firstOpenTime = 0;
      mergeWarInfoDao.secondOpenTime = 0;
      mergeWarInfoDao.endTime = 0;
      mergeWarInfoDao.isOpening = false;
      mergeWarInfoDao.updateOp();
      this.deleteActivityInfos();
      MergeWarBossMsg.S2C_ActivityInfo_19408 builder = this.getInfoBuilder();
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder});
   }

   @MsgHandlerAnno
   public void CR2S_EntranceInfo_21156(CrossCoreWarMsg.CR2S_EntranceInfo_21156 msg, CrossSubscribeMsg crossSubscribeMsg) {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      mergeWarInfoDao.openEntrance = msg.getState();
      mergeWarInfoDao.updateOp();
      MergeWarBossMsg.S2C_EntranceInfo_19424.Builder builder = MergeWarBossMsg.S2C_EntranceInfo_19424.newBuilder();
      builder.setOpenEntrance(mergeWarInfoDao.openEntrance);
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
      logger.info("【双城之战】更改入口状态 serverId:{} openEntrance:{}", this.worldMgr.GAME_SERVER_ID, mergeWarInfoDao.openEntrance);
   }

   @MsgHandlerAnno
   public void CR2S_EarliestOpenDay_21158(CrossCoreWarMsg.CR2S_EarliestOpenDay_21158 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int openDay = msg.getOpenDay();
      this.nextMergeWarOpenData = this.getNextOpenTime(openDay);
      GamePlayer player = this.worldMgr.getPlayerById(crossSubscribeMsg.destMgrId);
      if (player != null) {
         player.pushTask(() -> {
            MergeWarGamePart mergeWarGamePart = (MergeWarGamePart)player.getMgrPart(MergeWarGamePart.class);
            mergeWarGamePart.sendNextTime(this.nextMergeWarOpenData);
         });
      }

   }

   @MsgHandlerAnno
   public void S2C_ChangeMove_19552(MergeWarGameMsg.S2C_ChangeMove_19552 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{msg});
   }

   public void _slaveServerMergeBegin(int mainServerId) throws Exception {
      logger.info("【双城之战】被合服 serverId:{} mainServerId:{}", this.worldMgr.GAME_SERVER_ID, mainServerId);
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening) {
         this.rankMgr.mergeInSlaveRankToMain(mainServerId, 9999, RankDefine.RankModule.MERGE_WAR_BOSS_UNION_DAMAGE);
      }
   }

   public void _mainServerMergeFinish(HashSet<Integer> slaveServerSet) throws Exception {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening) {
         logger.info("【双城之战】合服完成，主服也开启玩法，所以不需做处理 serverId:{}", this.worldMgr.GAME_SERVER_ID);
      } else {
         logger.info("【双城之战】发送从服奖励");
         this.sendBossRankReward();
      }
   }

   public MergeWarOpenData getLocalNextOpenTime() {
      int openServerDays = this.worldMgr.getOpenServerDays();
      return this.getNextOpenTime(openServerDays);
   }

   public MergeWarOpenData getNextOpenTime(int openServerDays) {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening) {
         return null;
      } else {
         MergeWarOpenData mergeWarOpenData = new MergeWarOpenData();
         LocalDateTime nowDateTime = LocalDateTime.now();
         Map<Integer, Map<Integer, HeFuStageModel>> groupModelMap = ApplicationContextProvider.<Integer, Map<Integer, HeFuStageModel>>getModelPoolMap("customHefuStage");
         TreeSet<Integer> groupSet = new TreeSet(groupModelMap.keySet());
         LocalDateTime localDateTime = LocalDateTime.now().withHour(0).withMinute(0).withSecond(0).withNano(0);

         for(int i = 0; i < 12; ++i) {
            for(int group : groupSet) {
               HeFuStageModel tempModel = (HeFuStageModel)((Map)groupModelMap.get(group)).get(1);
               LocalDateTime startDateTime = DateUtil.getWeekInMonth(nowDateTime.plusMonths((long)i), tempModel.getWeek(), DayOfWeek.of(tempModel.getDay()));
               if (localDateTime.isBefore(startDateTime) || localDateTime.equals(startDateTime)) {
                  long tempOpenTime = DateUtil.getMillis(startDateTime);
                  int offsetDay = Math.abs(DateUtil.difftimeDay(new Timestamp(tempOpenTime)));
                  if (tempModel.getServerDay() <= openServerDays + offsetDay) {
                     mergeWarOpenData.group = tempModel.getGroup();
                     mergeWarOpenData.openTime = DateUtil.getIntTime(DateUtil.getMillis(startDateTime));
                     return mergeWarOpenData;
                  }
               }
            }
         }

         return null;
      }
   }

   public void checkOpenEntrance() {
      int openServerDays = this.worldMgr.getOpenServerDays();
      Map<Integer, Map<Integer, HeFuStageModel>> groupModelMap = ApplicationContextProvider.<Integer, Map<Integer, HeFuStageModel>>getModelPoolMap("customHefuStage");

      for(Map<Integer, HeFuStageModel> heFuStageModelMap : groupModelMap.values()) {
         HeFuStageModel heFuStageModel = (HeFuStageModel)heFuStageModelMap.get(1);
         if (openServerDays >= heFuStageModel.getServerDay()) {
            CrossCoreWarMsg.S2CR_EntranceInfo_21155.Builder builder = CrossCoreWarMsg.S2CR_EntranceInfo_21155.newBuilder();
            this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, builder.build());
            break;
         }
      }

   }

   public MergeWarOpenData getNextMergeWarOpenData() {
      return this.nextMergeWarOpenData;
   }

   @MsgHandlerAnno
   public void CR2S_GM_21172(CrossCoreWarMsg.CR2S_GM_21172 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("【双城之战】收到跨服发送的gm命令:{}", msg.getStr());
      switch (msg.getStr()) {
         case "close":
            this.gmClose();
         default:
      }
   }

   public void gmClose() {
      for(GamePlayer player : this.worldMgr.getOnlinePlayer()) {
         player.pushTask(() -> {
         });
      }

      this.deleteActivityInfos();
      this.onWarPlayerSet.clear();
   }

   public void gmAddUnionMember(int unionId, int num) {
      MergeWarInfoDao mergeWarInfoDao = this.getMergeWarInfoDao();
      if (mergeWarInfoDao.isOpening && mergeWarInfoDao.promoteUnion == unionId) {
         UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
         UnionMgr unionMgr = unionMgrParent.getUnionMgr(unionId);
         Map<Integer, UnionMemberDao> unionMemberDaoMap = unionMgr.getUnionMembers();
         List<UnionMemberDao> list = new ArrayList();
         list.addAll(unionMemberDaoMap.values());
         Collections.shuffle(list);

         for(int i = 0; i < num; ++i) {
            UnionMemberDao unionMemberDao = (UnionMemberDao)list.get(i);
            GamePlayer tempPlayer = this.worldMgr.getPlayerById(unionMemberDao.playerId);
            if (tempPlayer != null) {
               logger.info("【双城之战】军团成员进入玩法 playerId:{}", tempPlayer.getPlayerId());
               tempPlayer.pushTask(() -> tempPlayer.uploadCrossPlayer());
               CrossCoreWarMsg.S2CR_WarInfo_21101.Builder builder = CrossCoreWarMsg.S2CR_WarInfo_21101.newBuilder();
               builder.setLeave(false);
               builder.setIsJoin(true);
               this.crossNettyClient.sendCross(tempPlayer.getServerId(), tempPlayer.getPlayerId(), builder.build());
            }
         }

      } else {
         logger.info("【双城之战】玩法未开启，或加入的不是晋级军团成员 isOpen:{} promoteUnionId:{} unionId:{}", new Object[]{mergeWarInfoDao.isOpening, mergeWarInfoDao.promoteUnion, unionId});
      }
   }
}
