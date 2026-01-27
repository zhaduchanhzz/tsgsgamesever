package com.gzbz.gamePlayer.pvp;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import cn.hutool.core.util.NumberUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PvpDao;
import com.gzbz.db.PvpRecordDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.Ladder.LadderPart;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.DuelRankModel;
import com.gzbz.model.DuelRewardModel;
import com.gzbz.model.DuelScheduleModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ProbabilityReward;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.PvpMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PvpPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(PvpPart.class);
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   PvpSeasonMgr pvpSeasonMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   RankMgr rankMgr;
   @Autowired
   private GameDBPool dbPool;
   @Autowired
   private HeroRankMgr heroRankMgr;
   private long checkTime;
   private static String DEL_PLAYER_PVP_RECORD = "DELETE  FROM tb_pvp_record WHERE playerId = ? ";

   public void loginHandle() {
      PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
      if (pvpDao.seasonId != this.pvpSeasonMgr.getPvpSeasonId()) {
         pvpDao.seasonId = this.pvpSeasonMgr.getPvpSeasonId();
         pvpDao.straightWinNum = 0;
         pvpDao.weekFightNum = 0;
         pvpDao.takeAwardIds.clear();
         pvpDao.thumbsUps.clear();
         pvpDao.waitPlayerIds.clear();
         pvpDao.deerThumbsUps.clear();
         pvpDao.updateOp();
      }

      if (this.player.isSystemOpen(1110)) {
         this.pvpSeasonMgr.pushTaskEx("playerLoginCheckEx", new Object[]{this.player.getPlayerId()});
      }

      this.flushFightList(this.isNeedFlush(pvpDao));
      this.checkPvpMaxCode();
   }

   public void logoutHandle() {
      if (!DateUtil.isSameDay(System.currentTimeMillis(), this.checkTime)) {
         WorldMgr var10000 = this.worldMgr;
         if (WorldMgr.serverState.get() != 2) {
            this.delOldRecord();
            this.checkTime = System.currentTimeMillis();
         }
      }
   }

   public boolean isNeedFlush(PvpDao pvpDao) {
      if (pvpDao.waitPlayerIds.isEmpty()) {
         this.logger.error("玩家={}，对战列表为空，需要刷新", this.player.getPlayerId());
         return true;
      } else {
         int num = 0;

         for(Integer waitPlayerId : pvpDao.waitPlayerIds) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(waitPlayerId);
            if (gamePlayer == null) {
               this.logger.error("玩家={}，对战列表的玩家为空={}，需要刷新", this.player.getPlayerId(), waitPlayerId);
               return true;
            }

            ++num;
         }

         if (num < 3) {
            this.logger.error("玩家={}，对战列表数量小于3，size={}，需要刷新", this.player.getPlayerId(), num);
            return true;
         } else {
            return false;
         }
      }
   }

   public void resetDaily() {
      PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
      List<Integer> list = this.pvpSeasonMgr.flushPvpFightList(this.player, pvpDao.firstFlush);
      if (pvpDao.seasonId != this.pvpSeasonMgr.getPvpSeasonId()) {
         pvpDao.seasonId = this.pvpSeasonMgr.getPvpSeasonId();
         pvpDao.straightWinNum = 0;
         pvpDao.weekFightNum = 0;
         pvpDao.takeAwardIds.clear();
         pvpDao.thumbsUps.clear();
         pvpDao.waitPlayerIds.clear();
         pvpDao.waitPlayerIds.addAll(list);
         pvpDao.deerThumbsUps.clear();
         pvpDao.updateOp();
      } else {
         pvpDao.thumbsUps.clear();
         pvpDao.waitPlayerIds.clear();
         pvpDao.waitPlayerIds.addAll(list);
         pvpDao.deerThumbsUps.clear();
         pvpDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenPvpUi_6801(PvpMsg.C2S_OpenPvpUi_6801 msg, String source) {
      if (this.player.isSystemOpen(1110)) {
         this.openUi();
      }
   }

   public void openUi() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int useFreeNum = (Integer)playerResetCustomCache.getDailyNum(111, 0);
      PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
      PvpSeasonMgr pvpSeasonMgr = (PvpSeasonMgr)ApplicationContextProvider.getContext().getBean(PvpSeasonMgr.class);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      pvpSeasonMgr.pushTaskEx("OpenPvpUi", new Object[]{this.player, pvpDao, useFreeNum, playerExtend.iisCompletedPvpSkip()});
   }

   @MsgHandlerAnno
   public void C2S_FlushPvpList_6803(PvpMsg.C2S_FlushPvpList_6803 msg, String source) {
      if (!this.player.isSystemOpen(1110)) {
         this.player.failure(10002);
      } else {
         this.flushFightList(true);
      }
   }

   public int beginBattle(BattleDao battleDao) {
      if (!this.player.isSystemOpen(1110)) {
         return 10002;
      } else {
         PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
         int rightPlayerId = (Integer)battleDao.params.get(0);
         if (!pvpDao.waitPlayerIds.contains(rightPlayerId)) {
            this.logger.info("对战列表不包含该玩家={}，列表={}", rightPlayerId, pvpDao.waitPlayerIds);
            return 61139;
         } else {
            ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
            int freeNum = configManager.getInt("duelFreeTime");
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int dayFightFreeNum = (Integer)playerResetCustomCache.getDailyNum(111, 0);
            boolean isFree = false;
            if (dayFightFreeNum < freeNum) {
               isFree = true;
            } else {
               int tokenItemId = configManager.getIntDefault("pvpTokenItemId", 1005);
               ResourceModel resourceModel = new ResourceModel(2, tokenItemId, 1);
               if (!this.player.checkResourceNum(resourceModel)) {
                  return 10001;
               }

               this.player.delResource(2, tokenItemId, 1L, 10, 1001, 0, 0, "");
            }

            int leftRank = this.rankMgr.getRank(RankDefine.RankModule.PVP, this.player.getPlayerId());
            battleDao.scene.getPkTeams()[0].setPvpRank(leftRank);
            int rightRank = this.rankMgr.getRank(RankDefine.RankModule.PVP, rightPlayerId);
            GamePlayer rightPlayer = this.worldMgr.getPlayerById(rightPlayerId);
            PlayerPublicDao rightPlayerDao = rightPlayer.getPublicDao();
            ArrayingMirror arrayingMirror = rightPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            BattlePKTeam right = new BattlePKTeam(rightPlayer.getPlayerId(), rightPlayerDao.playerName, arrayingMirror, rightPlayerDao.lv, rightPlayerDao.head, rightPlayerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, rightPlayer.isRobot()));
            battleDao.scene.addPKTeam((byte)1, right);
            battleDao.scene.getPkTeams()[1].setPvpRank(rightRank);
            battleDao.scene.setMaxRound((byte)20);
            if (isFree) {
               playerResetCustomCache.addDailyReset(111, 1);
            }

            this.player.triggerTask(104, 0, 1L, 1);
            ++pvpDao.weekFightNum;
            pvpDao.updateOp();
            int pvp_skip_num = configManager.getIntDefault("pvpSkipCondition", 20);
            if (pvpDao.weekFightNum >= pvp_skip_num) {
               PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
               if (!playerExtend.iisCompletedPvpSkip()) {
                  playerExtend.completedPvpSkip();
                  this.player.updatePlayerExtend(13);
               }
            }

            return 1;
         }
      }
   }

   public void afterFight(BattleDao battleDao) {
      List<ResourceModel> rewards = new ArrayList();
      int rightPlayerId = (Integer)battleDao.params.get(0);
      GamePlayer rightPlayer = this.worldMgr.getPlayerById(rightPlayerId);
      int leftChange = 0;
      int rightChange = 0;
      int newLeftScore = 0;
      long leftScore = (long)this.pvpSeasonMgr.getPvpScore(this.player.getPlayerId());
      long rightScore = (long)this.pvpSeasonMgr.getPvpScore(rightPlayerId);
      if (battleDao.scene.getWinForce() == 0) {
         DuelRewardModel duelRewardModel = (DuelRewardModel)this.player.getGameModelPool().getEntity("duelReward", 1);
         ProbabilityReward reward = duelRewardModel.getProbabilityReward();
         ResourceModel resourceModel = new ResourceModel(reward.getType(), reward.getId(), reward.getNum());
         rewards.add(resourceModel);
         DuelRankModel duelRankModel = this.getDuelRankModel(leftScore, rightScore);
         rightChange = duelRankModel.getReducePoints();
         rightScore -= (long)rightChange;
         long delRightChange = 1000L - rightScore;
         if (delRightChange > 0L) {
            rightScore = 1000L;
            rightChange = (int)((long)rightChange - delRightChange);
         }

         this.pvpSeasonMgr.addPvpScore(rightPlayer.getPlayerId(), -rightChange);
         leftChange = duelRankModel.getAddPoints();
         this.pvpSeasonMgr.addPvpScore(this.player.getPlayerId(), leftChange);
         RankPart playerRankPar = (RankPart)this.player.getMgrPart(RankPart.class);
         PvpDao leftPvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
         int newPlayerRank = playerRankPar.getRank(RankDefine.RankModule.PVP);
         int oldPVPMax = leftPvpDao.maxRank;
         if (newPlayerRank < oldPVPMax) {
            leftPvpDao.maxRank = newPlayerRank;
         }

         leftPvpDao.updateOp();
         if (!leftPvpDao.firstFlush) {
            leftPvpDao.firstFlush = true;
            leftPvpDao.updateOp();
         }

         this.flushFightList(true);
      } else {
         newLeftScore = (int)leftScore;
         DuelRewardModel duelRewardModel = (DuelRewardModel)this.player.getGameModelPool().getEntity("duelReward", 2);
         ProbabilityReward reward = duelRewardModel.getProbabilityReward();
         ResourceModel resourceModel = new ResourceModel(reward.getType(), reward.getId(), reward.getNum());
         rewards.add(resourceModel);
      }

      this.addPvpRecord(0, battleDao.scene.getWinForce(), leftChange, rightPlayerId, battleDao.scene.getStartTime(), battleDao.scene.getBattleMsg().getResult().getRecordId());
      rightPlayer.pushPartTaskEx(PvpPart.class, "addPvpRecord", new Object[]{1, battleDao.scene.getWinForce() == 0 ? 1 : 0, -rightChange, battleDao.playerId, battleDao.scene.getStartTime(), battleDao.scene.getBattleMsg().getResult().getRecordId()});
      BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();

      for(ResourceModel reward : rewards) {
         result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(reward.getType()).setId(reward.getId()).setNum(reward.getValue()));
         battleDao.rewards.add(reward);
      }

      battleDao.scene.getBattleMsg().setResult(result);
      BattleMsg.S2C_Battle_PKTeam.Builder leftTeam = battleDao.scene.getBattleMsg().getTeams(0).toBuilder();
      leftTeam.addPlayerInfos(this.player.toPropertyCellForInt32(PlayerDefine.PLAYER_PVP_POINTS, newLeftScore));
      leftTeam.setPvpScoreChange(leftChange);
      battleDao.scene.getBattleMsg().setTeams(0, (BattleMsg.S2C_Battle_PKTeam.Builder)leftTeam);
      BattleMsg.S2C_Battle_PKTeam.Builder rightTeam = battleDao.scene.getBattleMsg().getTeams(1).toBuilder();
      PlayerPublicDao rightPlayerDao = rightPlayer.getPublicDao();
      rightTeam.addPlayerInfos(rightPlayer.toPropertyCellForInt32(PlayerDefine.PLAYER_LV, rightPlayerDao.lv));
      rightTeam.addPlayerInfos(rightPlayer.toPropertyCellForInt32(PlayerDefine.PLAYER_HEAD, rightPlayerDao.head));
      rightTeam.addPlayerInfos(rightPlayer.toPropertyCellForInt32(PlayerDefine.PLAYER_HEADFRAME, rightPlayerDao.headFrame));
      rightTeam.addPlayerInfos(rightPlayer.toPropertyCellForInt32(PlayerDefine.PLAYER_PVP_POINTS, (int)rightScore));
      rightTeam.setPvpScoreChange(-rightChange);
      battleDao.scene.getBattleMsg().setTeams(1, (BattleMsg.S2C_Battle_PKTeam.Builder)rightTeam);
      this.triggerPvpTask(battleDao);
      battleDao.updateOp();
      this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "校场挑战", "1");
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      guanJiaPart.checkState(1110, (List)null);
   }

   public void endBattle(BattleDao battleDao) {
      if (battleDao.rewards != null && !battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 10, 1001, 0, 0, "");
      }

      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int useFreeNum = (Integer)playerResetCustomCache.getDailyNum(111, 0);
      PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      this.pvpSeasonMgr.pushTaskEx("C2S_TakeAwardsResult_6806", new Object[]{this.player, pvpDao.waitPlayerIds, pvpDao.weekFightNum, useFreeNum, playerExtend.iisCompletedPvpSkip()});
      this.player.getOperationMgr().addExtraLog(this.player, 168, pvpDao.weekFightNum + "", battleDao.scene.getWinForce() == 0 ? "胜利" : "失败");
   }

   @MsgHandlerAnno
   public void C2S_PvpRank_6807(PvpMsg.C2S_PvpRank_6807 msg, String source) {
      if (!this.player.isSystemOpen(1110)) {
         this.player.failure(10002);
      } else {
         PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
         this.pvpSeasonMgr.pushTaskEx("pvpRanksToClient", new Object[]{this.player, msg.getType(), pvpDao.thumbsUps});
      }
   }

   @MsgHandlerAnno
   public void C2S_PvpFightRecord_6809(PvpMsg.C2S_PvpFightRecord_6809 msg, String source) {
      if (!this.player.isSystemOpen(1110)) {
         this.player.failure(10002);
      } else {
         Map<Integer, PvpRecordDao> pvpRecordDaoMap = this.player.<Integer, PvpRecordDao>getMap("tb_pvp_record", this.player.getPlayerId());
         PlayerDao playerDao = this.player.getPlayerDao();
         Map<Integer, PvpRecordDao> enableMap = new HashMap();
         if (pvpRecordDaoMap != null) {
            long dayStartTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis());

            for(Map.Entry<Integer, PvpRecordDao> entry : pvpRecordDaoMap.entrySet()) {
               if (((PvpRecordDao)entry.getValue()).fightTime >= dayStartTime) {
                  enableMap.put(entry.getKey(), entry.getValue());
               }
            }
         }

         this.pvpSeasonMgr.pushTaskEx("pvpFightRecordToClient", new Object[]{this.player, enableMap, playerDao});
      }
   }

   @MsgHandlerAnno
   public void C2S_PvpThumbsUp_6811(PvpMsg.C2S_PvpThumbsUp_6811 msg, String source) {
      if (!this.player.isSystemOpen(1110)) {
         this.player.failure(10002);
      } else {
         int beThumbsUpId = msg.getBeThumbsUpId();
         PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
         if (pvpDao.thumbsUps.contains(beThumbsUpId)) {
            this.logger.info("已经点过赞了,ID={}", beThumbsUpId);
            this.player.failure(10004);
         } else if (pvpDao.thumbsUps.size() >= this.configManager.getInt("duelLikeLimit")) {
            this.logger.info("点赞数满了,次数={}", pvpDao.thumbsUps.size());
            this.player.failure(10005);
         } else {
            GamePlayer rightPlayer = this.worldMgr.getPlayerById(beThumbsUpId);
            if (rightPlayer != null) {
               rightPlayer.pushPartTaskEx(PvpPart.class, "addBeThumbsUpNum", new Object[0]);
            }

            pvpDao.thumbsUps.add(beThumbsUpId);
            pvpDao.updateOp();
            int copper = this.configManager.getInt("duelLikeGold");
            this.player.addResource(1, PlayerDefine.PLAYER_COPPER, copper, PlayerMsg.ShowType.SHOW_TYPE_EJECT_THUMBSUP, 10, 1005, 0, 0, "");
            PvpMsg.S2C_PvpThumbsUpResult_6812.Builder result_builder = PvpMsg.S2C_PvpThumbsUpResult_6812.newBuilder();
            result_builder.setResult(1);
            result_builder.setBeThumbsUpId(beThumbsUpId);
            result_builder.setThumbsUpNum(pvpDao.thumbsUps.size());
            this.player.sendMsg(result_builder.build());
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            MapUtil.mapPlusInt(playerExtend.likePlayer, 1110, 1);
            this.player.updatePlayerExtend(13);
            LadderPart ladderPart = (LadderPart)this.player.getMgrPart(LadderPart.class);
            ladderPart.sendPlayerLike();
            GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
            guanJiaPart.checkState(1111, (List)null);
         }
      }
   }

   @TaskMethod
   public void addBeThumbsUpNum() {
      PvpDao rightPvpDao = (PvpDao)this.getPlayer().getData("tb_pvp", this.player.getPlayerId());
      ++rightPvpDao.weekBeThumbsupNum;
      rightPvpDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_ShowPlayerInfo_6813(PvpMsg.C2S_ShowPlayerInfo_6813 msg, String source) {
      this.pvpSeasonMgr.pushTaskEx("showPlayerInfo", new Object[]{this.player, msg.getPlayerId()});
   }

   @MsgHandlerAnno
   public void C2S_TakeFightNumAward_6815(PvpMsg.C2S_TakeFightNumAward_6815 msg, String source) {
      int awardId = msg.getId();
      PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
      if (pvpDao.takeAwardIds.contains(awardId)) {
         this.logger.info("奖励已经领取，ID={}", awardId);
         this.player.failure(10003);
      } else {
         DuelScheduleModel scheduleModel = (DuelScheduleModel)this.player.getGameModelPool().getEntity("duelSchedule", awardId);
         if (scheduleModel == null) {
            this.logger.info("奖励ID无效，ID={}", awardId);
         } else if (pvpDao.weekFightNum < scheduleModel.getFightNum()) {
            this.logger.info("战斗次数不够，战斗次数={}，需要次数={}", pvpDao.weekFightNum, scheduleModel.getFightNum());
         } else {
            this.player.addResource(scheduleModel.getRewardType(), scheduleModel.getRewardId(), scheduleModel.getRewardNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 10, 1004, 0, 0, "");
            pvpDao.takeAwardIds.add(awardId);
            pvpDao.updateOp();
            PvpMsg.S2C_TakeFightNumAward_6816.Builder builder = PvpMsg.S2C_TakeFightNumAward_6816.newBuilder();
            builder.setResult(1);

            for(Integer takeAwardId : pvpDao.takeAwardIds) {
               builder.addTakedIds(takeAwardId);
            }

            this.player.sendMsg(builder.build());
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, 0, "校场", scheduleModel.getFightNum() + "", scheduleModel.getFightNum() + "", 0, 0, 0);
         }
      }
   }

   public void flushFightList(boolean isMustFlush) {
      PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
      if (pvpDao.waitPlayerIds.isEmpty() || isMustFlush) {
         List<Integer> list = this.pvpSeasonMgr.flushPvpFightList(this.player, pvpDao.firstFlush);
         if (list.size() != 3 || list.contains(this.player.getPlayerId())) {
            this.logger.error("玩家{},刷新列表={}", this.player.getPlayerId(), list);
         }

         pvpDao.waitPlayerIds.clear();
         pvpDao.waitPlayerIds.addAll(list);
         pvpDao.updateOp();
         PvpMsg.S2C_FlushPvpListResult_6804.Builder result_builder = PvpMsg.S2C_FlushPvpListResult_6804.newBuilder();

         for(Integer fightPlayerId : list) {
            result_builder.addInfos(this.pvpSeasonMgr.toPvpFihgtPlayerInfo(fightPlayerId));
         }

         this.player.sendMsg(result_builder.build());
      }

   }

   @TaskMethod
   public void addPvpRecord(int type, int win, int rankChange, int fightPlayerId, long fightTime, int recordId) {
      this.player.getMap("tb_pvp_record", this.player.getPlayerId());
      PvpRecordDao pvpRecordDao = new PvpRecordDao();
      pvpRecordDao.playerId = this.player.getPlayerId();
      pvpRecordDao.code = this.player.getUniqueCode(CodeDefine.PVP_RECORD);
      pvpRecordDao.recordId = recordId;
      pvpRecordDao.rankChange = rankChange;
      pvpRecordDao.fightPlayerId = fightPlayerId;
      pvpRecordDao.fightTime = fightTime;
      pvpRecordDao.type = type;
      pvpRecordDao.win = win;
      this.player.insertDao(pvpRecordDao, true);
   }

   public DuelRankModel getDuelRankModel(long attScore, long defScore) {
      double gap;
      if (attScore == 0L) {
         gap = (double)0.0F;
      } else {
         gap = NumberUtil.div((float)defScore, (float)attScore);
      }

      if (gap > 1.32) {
         gap = 1.32;
      } else if (gap < 0.68) {
         gap = 0.68;
      }

      int intGap = (int)(gap * (double)10000.0F);
      Map<Integer, DuelRankModel> map = this.player.getGameModelPool().getMap("duelRank");
      int size = map.size();

      for(int i = 0; i < size; ++i) {
         int key = i + 1;
         if (intGap <= ((DuelRankModel)map.get(key)).getPointsGap()) {
            return (DuelRankModel)map.get(key);
         }
      }

      return (DuelRankModel)map.get(size);
   }

   public void delOldRecord() {
      this.logger.info("校场删除玩家过期对战记录");
      Map<Integer, PvpRecordDao> map = this.player.<Integer, PvpRecordDao>getMap("tb_pvp_record", this.player.getPlayerId());
      if (map != null && !map.isEmpty()) {
         List<PvpRecordDao> needDelList = new ArrayList();
         long dayStartTime = DateUtil.getSomeDayBeginTime(System.currentTimeMillis());

         for(Map.Entry<Integer, PvpRecordDao> entry : map.entrySet()) {
            if (((PvpRecordDao)entry.getValue()).fightTime < dayStartTime) {
               needDelList.add(entry.getValue());
            }
         }

         if (!needDelList.isEmpty()) {
            this.logger.info("玩家={}，删除过去校场对战记录={}", this.player.getPlayerId(), needDelList.size());

            for(PvpRecordDao pvpRecordDao : needDelList) {
               this.player.deleteDao(pvpRecordDao, false);
            }
         }
      }

   }

   public void checkPvpMaxCode() {
      Map<Integer, PvpRecordDao> map = this.player.<Integer, PvpRecordDao>getMap("tb_pvp_record", this.player.getPlayerId());
      if (map != null && !map.isEmpty()) {
         Iterator<PvpRecordDao> iterator = map.values().iterator();
         int maxCode = 0;

         while(iterator.hasNext()) {
            PvpRecordDao pvpRecordDao = (PvpRecordDao)iterator.next();
            if (pvpRecordDao.code > maxCode) {
               maxCode = pvpRecordDao.code;
            }
         }

         this.player.checkUnionCode(CodeDefine.PVP_RECORD, maxCode);
      }

   }

   private void triggerPvpTask(BattleDao battleDao) {
      int rightPlayerId = (Integer)battleDao.params.get(0);
      GamePlayer rightPlayer = this.worldMgr.getPlayerById(rightPlayerId);
      long combatPowerDiff = rightPlayer.getPlayerCombatPower() - this.player.getPlayerCombatPower();
      BattlePKTeam leftPkTeam = battleDao.scene.getPKTeam((byte)0);

      for(Entity entity : leftPkTeam.getEntityMap().values()) {
         this.player.triggerTask(224, 0, entity.getAttackValue(), 0);
         this.player.triggerTask(225, 0, entity.getRecoverHp(), 0);
      }

      if (leftPkTeam.getFriendEntity() != null) {
         this.player.triggerTask(224, 0, leftPkTeam.getFriendEntity().getAttackValue(), 0);
         this.player.triggerTask(225, 0, leftPkTeam.getFriendEntity().getRecoverHp(), 0);
      }

      this.player.triggerTask(223, 0, battleDao.scene.getForceRecordValue((byte)0, 200003), 0);
      if (leftPkTeam.getWeaponEntity() != null) {
         this.player.triggerTask(220, 0, battleDao.scene.getForceRecordValue((byte)0, 200002), 1);
         this.player.triggerTask(226, 0, battleDao.scene.getForceRecordValue((byte)0, 200001), 1);
      }

      this.player.triggerTask(221, 0, battleDao.scene.getForceRecordValue((byte)0, 200005), 0);
      this.player.triggerTask(222, 0, battleDao.scene.getForceRecordValue((byte)0, 200004), 0);
      if (battleDao.scene.getWinForce() == 0) {
         this.player.triggerTask(524, 0, 1L, 1);
         if (combatPowerDiff > 0L) {
            this.player.triggerTask(218, (int)combatPowerDiff, 1L, 3);
            this.player.triggerTask(301, battleDao.scene.getCurTotalRound(), 1L, 2);
            boolean isAllFullBlood = true;

            for(Map.Entry<Byte, Entity> entry : leftPkTeam.getEntityMap().entrySet()) {
               if (((Entity)entry.getValue()).getTeamPos() <= 5 && ((Entity)entry.getValue()).getBaseProperty(99) != ((Entity)entry.getValue()).getBaseProperty(1)) {
                  isAllFullBlood = false;
                  break;
               }
            }

            if (isAllFullBlood) {
               this.player.triggerTask(219, 0, 1L, 1);
            }
         }
      }

   }

   public void levelUp(int preLv, int newLv) {
      SystemFunctionModel model_pvp = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1110);
      int pvpOpenLv = 8;
      if (model_pvp != null) {
         pvpOpenLv = model_pvp.getOpenLevel();
      }

      if (preLv < pvpOpenLv && newLv >= pvpOpenLv) {
         this.pvpSeasonMgr.pushTaskEx("addPvpScore", new Object[]{this.player.getPlayerId(), 1000});
         this.player.notifyPlayerData(PlayerDefine.PLAYER_PVP_POINTS, 1000);
         RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
         rankPart.updateRank(RankDefine.RankModule.PVP, 1000L, false);
      }

   }

   public void guanJiaOperate(int systemId) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int dayFightFreeNum = (Integer)playerResetCustomCache.getDailyNum(111, 0);
      if (dayFightFreeNum != 0) {
         this.logger.error("玩家={}，已经使用过免费次数，不能快速完成，num={}", this.player.getPlayerId(), dayFightFreeNum);
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         int freeNum = configManager.getInt("duelFreeTime");
         playerResetCustomCache.addDailyReset(111, freeNum);
         List<ResourceModel> rewards = new ArrayList();
         DuelRewardModel duelRewardModel = (DuelRewardModel)this.player.getGameModelPool().getEntity("duelReward", 1);
         ProbabilityReward reward = duelRewardModel.getProbabilityReward();
         ResourceModel resourceModel = new ResourceModel(reward.getType(), reward.getId(), reward.getNum() * freeNum);
         rewards.add(resourceModel);
         this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 10, 1006, 0, 0, "");
         int pvpFastDoTaskScore = configManager.getIntDefault("pvpFastDoTaskScore", 10);
         this.pvpSeasonMgr.addPvpScore(this.player.getPlayerId(), pvpFastDoTaskScore * freeNum);
         RankPart playerRankPar = (RankPart)this.player.getMgrPart(RankPart.class);
         PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
         int newPlayerRank = playerRankPar.getRank(RankDefine.RankModule.PVP);
         int oldPVPMax = pvpDao.maxRank;
         if (newPlayerRank < oldPVPMax) {
            pvpDao.maxRank = newPlayerRank;
         }

         pvpDao.weekFightNum += freeNum;
         pvpDao.straightWinNum += freeNum;
         pvpDao.updateOp();
         this.openUi();

         for(int i = 0; i < freeNum; ++i) {
            this.player.triggerTask(104, 0, 1L, 1);
         }

         this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "校场挑战", freeNum + "");
         this.player.getOperationMgr().addExtraLog(this.player, 168, pvpDao.weekFightNum + "", "胜利");
         guanJiaPart.checkState(systemId, rewards);
      }
   }

   public void guanJiaOperateThumbsUp(int systemId) {
      PvpDao pvpDao = (PvpDao)this.player.getData("tb_pvp", this.player.getPlayerId());
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      if (pvpDao.thumbsUps.size() > 0) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         int actualNum = 0;
         int duelLikeLimit = this.configManager.getInt("duelLikeLimit");

         for(RankData rankData : this.rankMgr.getRanks(RankDefine.RankModule.PVP, duelLikeLimit + 1)) {
            int beThumbsUpId = rankData.value;
            if (beThumbsUpId != this.player.getPlayerId()) {
               GamePlayer rightPlayer = this.worldMgr.getPlayerById(beThumbsUpId);
               if (rightPlayer != null) {
                  rightPlayer.pushPartTaskEx(PvpPart.class, "addBeThumbsUpNum", new Object[0]);
               }

               pvpDao.thumbsUps.add(beThumbsUpId);
               pvpDao.updateOp();
               ++actualNum;
               PvpMsg.S2C_PvpThumbsUpResult_6812.Builder result_builder = PvpMsg.S2C_PvpThumbsUpResult_6812.newBuilder();
               result_builder.setResult(1);
               result_builder.setBeThumbsUpId(beThumbsUpId);
               result_builder.setThumbsUpNum(pvpDao.thumbsUps.size());
               this.player.sendMsg(result_builder.build());
               if (actualNum >= duelLikeLimit) {
                  break;
               }
            }
         }

         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         MapUtil.mapPlusInt(playerExtend.likePlayer, 1110, actualNum);
         this.player.updatePlayerExtend(13);
         int copper = this.configManager.getInt("duelLikeGold");
         ResourceModel reward = new ResourceModel(1, PlayerDefine.PLAYER_COPPER, copper * actualNum);
         this.player.addResource(reward, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 10, 1005, 0, 0, "管家");
         LadderPart ladderPart = (LadderPart)this.player.getMgrPart(LadderPart.class);
         ladderPart.sendPlayerLike();
         List<ResourceModel> rewardList = new ArrayList();
         rewardList.add(reward);
         guanJiaPart.checkState(systemId, rewardList);
      }
   }
}
