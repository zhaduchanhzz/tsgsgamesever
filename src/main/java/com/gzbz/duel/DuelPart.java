package com.gzbz.duel;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.google.protobuf.ByteString;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.DuelDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.MonarchDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.worldBean.DuelData;
import com.gzbz.duel.bean.DuelJadeData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroPalacePart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.DuelGambleModel;
import com.gzbz.model.DuelYuJueModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.PrestigeTaskModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.WuDaoBattleModel;
import com.gzbz.model.WuDaoCentreAwardModel;
import com.gzbz.model.WuDaoDateModel;
import com.gzbz.model.WuDaoSelectPointModel;
import com.gzbz.model.WuDaoTaskBoxModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossDuelMsg;
import com.gzbz.protobuf.DuelBattleMsg;
import com.gzbz.protobuf.DuelExtraMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.DuelTaskPart;
import com.gzbz.task.PrestigeTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import debug.Debug;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.ComparatorUtil;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import misc.RandomUtil;
import net.CrossSubscribeMsg;
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
public class DuelPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(DuelPart.class);
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private DuelMgr duelMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private ConfigManager configManager;
   public static final Set<Integer> IN_SYSTEM_PLAYER = new HashSet();

   @MsgHandlerAnno
   public void C2S_DuelInfo_4501(DuelBattleMsg.C2S_DuelInfo_4501 msg, String source) {
      this.sendDuelMainInfo();
   }

   @MsgHandlerAnno
   public void C2S_MyGuessList_16754(DuelExtraMsg.C2S_MyGuessList_16754 msg, String source) {
      DuelExtraMsg.C2S_MyGuessList_16754.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_EnterDuel_4585(DuelBattleMsg.C2S_EnterDuel_4585 msg, String source) {
      if (!this.isInvalid()) {
         if (msg.getIsExit()) {
            IN_SYSTEM_PLAYER.remove(this.player.getPlayerId());
         } else {
            DuelBattleMsg.C2S_EnterDuel_4585.Builder notifyBuilder = msg.toBuilder();
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), notifyBuilder.build());
            IN_SYSTEM_PLAYER.add(this.player.getPlayerId());
            int settleStage = this.duelMgr.getLastSettleStage();
            if (settleStage != 0) {
               DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
               if (!duelDao.showRankStage.contains(settleStage)) {
                  CrossDuelMsg.S2CR_EnterDuel_15714.Builder builder = CrossDuelMsg.S2CR_EnterDuel_15714.newBuilder();
                  builder.setStage(settleStage);
                  this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_StageSettleInfo_15715(CrossDuelMsg.CR2S_StageSettleInfo_15715 msg, CrossSubscribeMsg subscribeMsg) {
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      WorldDao<DuelData> worldDao = this.worldMgr.<DuelData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_DUEL);
      if (((DuelData)worldDao.jsonData).playerZone.containsKey(this.player.getPlayerId())) {
         long historyRankKey = MiscUtil.comboInteger((Integer)((DuelData)worldDao.jsonData).playerZone.get(this.player.getPlayerId()), msg.getStage());
         if (msg.getRank() > 0 && (Integer)MapUtil.getOrDefault(duelDao.stageRank, historyRankKey, Integer.MAX_VALUE) > msg.getRank()) {
            duelDao.stageRank.put(historyRankKey, msg.getRank());
            duelDao.updateOp();
         }

         this.player.triggerTask(628, msg.getStage(), (long)msg.getRank(), -1);
         if ((Integer)((DuelData)worldDao.jsonData).playerZone.get(this.player.getPlayerId()) == 1) {
            this.player.triggerTask(629, msg.getStage(), (long)msg.getRank(), -1);
            if (msg.getStage() == 6 && msg.getRank() == 1 && !DateUtil.isSameMonth(duelDao.championData.time, System.currentTimeMillis())) {
               if (duelDao.championData.time > 0L) {
                  Calendar calendar = Calendar.getInstance();
                  calendar.set(5, 1);
                  calendar.add(2, -1);
                  if (!DateUtil.isSameMonth(duelDao.championData.time, calendar.getTimeInMillis())) {
                     duelDao.championData.count = 0;
                  }
               }

               duelDao.championData.time = System.currentTimeMillis();
               ++duelDao.championData.count;
               duelDao.updateOp();
            }
         } else if ((Integer)((DuelData)worldDao.jsonData).playerZone.get(this.player.getPlayerId()) == 2) {
            this.player.triggerTask(630, msg.getStage(), (long)msg.getRank(), -1);
         }
      }

      if (IN_SYSTEM_PLAYER.contains(this.player.getPlayerId())) {
         duelDao.showRankStage.add(msg.getStage());
         duelDao.updateOp();
         DuelBattleMsg.S2C_StageSettleInfo_4586.Builder resp = DuelBattleMsg.S2C_StageSettleInfo_4586.newBuilder();
         resp.setRank(msg.getRank());
         resp.setStage(msg.getStage());
         resp.addAllTopThree(msg.getTopThreeList());
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_SeasonTask_4503(DuelBattleMsg.C2S_SeasonTask_4503 msg, String source) {
      if (this.player.isSystemOpen(3190)) {
         DuelTaskPart duelTaskPart = (DuelTaskPart)this.player.getMgrPart(DuelTaskPart.class);
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         duelTaskPart.sendSeasonTask(new ArrayList(duelDao.taskGroupData.values()));
      }
   }

   @MsgHandlerAnno
   public void C2S_TaskCommit_4507(DuelBattleMsg.C2S_TaskCommit_4507 msg, String source) {
      if (this.isInvalid()) {
         this.player.failure(21);
      } else {
         DuelTaskPart duelTaskPart = (DuelTaskPart)this.player.getMgrPart(DuelTaskPart.class);
         duelTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_TaskBoxReward_4509(DuelBattleMsg.C2S_TaskBoxReward_4509 msg, String source) {
      if (this.isInvalid()) {
         this.player.failure(21);
      } else {
         WuDaoTaskBoxModel wuDaoTaskBoxModel = (WuDaoTaskBoxModel)ApplicationContextProvider.getModelPoolEntity("wudaoTaskBox", msg.getBoxId());
         if (wuDaoTaskBoxModel == null) {
            this.player.failure(0);
         } else {
            DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
            if (duelDao.taskBoxReward.contains(msg.getBoxId())) {
               this.player.failure(24);
            } else if (duelDao.point < wuDaoTaskBoxModel.getPower()) {
               this.player.failure(36);
            } else {
               duelDao.taskBoxReward.add(msg.getBoxId());
               duelDao.updateOp();
               this.player.addResource(wuDaoTaskBoxModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 76, 7604, msg.getBoxId(), 0, "");
               DuelBattleMsg.S2C_TaskBoxReward_4510.Builder resp = DuelBattleMsg.S2C_TaskBoxReward_4510.newBuilder();
               resp.setBoxId(msg.getBoxId());
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DuelHistory_4511(DuelBattleMsg.C2S_DuelHistory_4511 msg, String source) {
      if (this.player.isSystemOpen(3190) && this.duelMgr.getStartTime() > 0L && this.duelMgr.getEndTime() > 0L && this.duelMgr.getSeason() > 0) {
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         CrossDuelMsg.S2CR_DuelHistory_15704.Builder reqMsg = CrossDuelMsg.S2CR_DuelHistory_15704.newBuilder();
         reqMsg.addAllTodayLike(duelDao.todayHistoryLike);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), reqMsg.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DuelHistoryLike_4513(DuelBattleMsg.C2S_DuelHistoryLike_4513 msg, String source) {
      if (this.player.isSystemOpen(3190) && this.duelMgr.getStartTime() > 0L && this.duelMgr.getEndTime() > 0L && this.duelMgr.getSeason() > 0) {
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         long seasonPlayer = MiscUtil.comboInteger(msg.getSeason(), msg.getPlayerId());
         if (duelDao.todayHistoryLike.size() < ApplicationContextProvider.getConfigInt("wudaoLikeNum", 0) && !duelDao.todayHistoryLike.contains(seasonPlayer)) {
            CrossDuelMsg.S2CR_DuelHistoryLike_15705.Builder reqMsg = CrossDuelMsg.S2CR_DuelHistoryLike_15705.newBuilder();
            reqMsg.setPlayerId(msg.getPlayerId());
            reqMsg.setSeason(msg.getSeason());
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), reqMsg.build());
         } else {
            this.player.failure(51);
         }
      } else {
         this.player.failure(21);
      }
   }

   @MsgHandlerAnno
   public void S2C_DuelHistoryLike_4514(DuelBattleMsg.S2C_DuelHistoryLike_4514 msg, CrossSubscribeMsg crossSubscribeMsg) {
      long seasonPlayer = MiscUtil.comboInteger(msg.getSeason(), msg.getPlayerId());
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      if (duelDao.todayHistoryLike.size() < ApplicationContextProvider.getConfigInt("wudaoLikeNum", 0) && !duelDao.todayHistoryLike.contains(seasonPlayer)) {
         duelDao.todayHistoryLike.add(seasonPlayer);
         duelDao.updateOp();
         this.player.addResource(ResourceModel.buildResource(ApplicationContextProvider.getConfigString("wudaoLikeAward", "")), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 76, 7608, 0, 0, "");
         DuelBattleMsg.S2C_DuelHistoryLike_4514.Builder resp = msg.toBuilder();
         resp.setTodayLike(duelDao.todayHistoryLike.size());
         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DuelTopWorshipList_4515(DuelBattleMsg.C2S_DuelTopWorshipList_4515 msg, String source) {
      if (!this.isInvalid()) {
         if (this.duelMgr.getStage() == 4 || this.duelMgr.getStage() == 7) {
            DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
            CrossDuelMsg.S2CR_DuelTopWorshipList_15706.Builder reqMsg = CrossDuelMsg.S2CR_DuelTopWorshipList_15706.newBuilder();
            reqMsg.addAllTodayLike(duelDao.todayWorshipLike);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), reqMsg.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DuelTopWorship_4517(DuelBattleMsg.C2S_DuelTopWorship_4517 msg, String source) {
      if (this.isInvalid()) {
         this.player.failure(21);
      } else if (this.duelMgr.getStage() == 4 || this.duelMgr.getStage() == 7) {
         long groupZone = MiscUtil.comboInteger(msg.getGroup(), msg.getZone());
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         if (duelDao.todayWorshipLike.size() < ApplicationContextProvider.getConfigInt("wudaoRankLikeNum", 0) && !duelDao.todayWorshipLike.contains(groupZone)) {
            CrossDuelMsg.S2CR_DuelTopWorship_15707.Builder reqMsg = CrossDuelMsg.S2CR_DuelTopWorship_15707.newBuilder();
            reqMsg.setGroup(msg.getGroup());
            reqMsg.setZone(msg.getZone());
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), reqMsg.build());
         } else {
            this.player.failure(51);
         }
      }
   }

   @MsgHandlerAnno
   public void S2C_DuelTopWorship_4518(DuelBattleMsg.S2C_DuelTopWorship_4518 msg, CrossSubscribeMsg crossSubscribeMsg) {
      long groupZone = MiscUtil.comboInteger(msg.getGroup(), msg.getZone());
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      if (duelDao.todayWorshipLike.size() < ApplicationContextProvider.getConfigInt("wudaoRankLikeNum", 0) && !duelDao.todayWorshipLike.contains(groupZone)) {
         duelDao.todayWorshipLike.add(groupZone);
         duelDao.updateOp();
         this.player.addResource(ResourceModel.buildResource(ApplicationContextProvider.getConfigString("wudaoRankLikeAward", "")), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 76, 7608, 0, 0, "");
         DuelBattleMsg.S2C_DuelTopWorship_4518.Builder resp = msg.toBuilder();
         resp.setTodayLike(duelDao.todayWorshipLike.size());
         this.player.sendMsg(resp.build());
         this.player.triggerTask(635, 0, 1L, 1);
      }
   }

   @MsgHandlerAnno
   public void C2S_DuelBossInfo_4523(DuelBattleMsg.C2S_DuelBossInfo_4523 msg, String source) {
      this.sendBossInfo();
      this.sendBossRecord();
   }

   @MsgHandlerAnno
   public void C2S_DuelBossBuyTimes_4527(DuelBattleMsg.C2S_DuelBossBuyTimes_4527 msg, String source) {
      if (this.isBossInvalid()) {
         this.player.failure(8007);
      } else {
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         int buyTimes = ApplicationContextProvider.getConfigInt("wudaoSection1buy", 0);
         if (duelDao.buyTimes >= buyTimes) {
            this.player.failure(25);
         } else {
            List<ResourceModel> resourceModels = ResourceModel.buildResources(ApplicationContextProvider.getConfigString("wudaoSection1spend", "1|9|50,1|9|100"));
            ResourceModel resourceModel;
            if (duelDao.buyTimes + 1 > resourceModels.size()) {
               resourceModel = (ResourceModel)resourceModels.get(resourceModels.size() - 1);
            } else {
               resourceModel = (ResourceModel)resourceModels.get(duelDao.buyTimes);
            }

            if (!this.player.checkResourceNum(resourceModel)) {
               this.player.failure(31);
            } else {
               this.player.delResource(resourceModel, 76, 7605, duelDao.buyTimes, 0, "");
               ++duelDao.buyTimes;
               duelDao.updateOp();
               DuelBattleMsg.S2C_DuelBossBuyTimes_4528.Builder resp = DuelBattleMsg.S2C_DuelBossBuyTimes_4528.newBuilder();
               resp.setBuyTimes(duelDao.buyTimes);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DuelBossSwap_16729(DuelExtraMsg.C2S_DuelBossSwap_16729 msg, String source) {
      if (this.isBossInvalid()) {
         this.player.failure(8007);
      } else {
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         int freeTimes = ApplicationContextProvider.getConfigInt("wudaoSection1challenge", 0);
         if (duelDao.fightTimes >= duelDao.buyTimes + freeTimes) {
            this.player.failure(41);
         } else if (duelDao.todayMaxDamage <= 0L) {
            this.player.failure(32001);
         } else {
            duelDao.damage = duelDao.todayMaxDamage;
            duelDao.totalDamage += duelDao.damage;
            ++duelDao.fightTimes;
            duelDao.updateOp();
            TreeMap<Integer, WuDaoBattleModel> wuDaoBattleModelMap = new TreeMap(ApplicationContextProvider.getModelPoolMap("wudaoBattle"));
            WuDaoBattleModel damageRewardModel = (WuDaoBattleModel)wuDaoBattleModelMap.firstEntry().getValue();

            for(WuDaoBattleModel wuDaoBattleModel : wuDaoBattleModelMap.values()) {
               if (duelDao.damage < (long)wuDaoBattleModel.getMin()) {
                  break;
               }

               damageRewardModel = wuDaoBattleModel;
            }

            this.player.addResource(damageRewardModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 76, 7601, 0, 0, "扫荡");
            this.rankMgr.updateRank(RankDefine.RankModule.DUEL_BOSS, duelDao.totalDamage, this.player.getPlayerId());
            DuelExtraMsg.S2C_DuelBossSwap_16730.Builder resp = DuelExtraMsg.S2C_DuelBossSwap_16730.newBuilder();
            resp.setFightTimes(duelDao.fightTimes);
            resp.setRank(this.rankMgr.getRank(RankDefine.RankModule.DUEL_BOSS, this.player.getPlayerId()));
            resp.setTotalDamage(duelDao.totalDamage);
            List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.DUEL_BOSS, 1);
            if (rankDataList != null && !rankDataList.isEmpty()) {
               RankData rankData = (RankData)rankDataList.get(0);
               GamePlayer topPlayer = this.worldMgr.getPlayerById(rankData.value);
               if (topPlayer != null) {
                  PlayerPublicDao playerPublicDao = topPlayer.getPublicDao();
                  DuelBattleMsg.TopDamage.Builder topDamage = DuelBattleMsg.TopDamage.newBuilder();
                  topDamage.setDamageSum(rankData.score);
                  topDamage.setPlayerId(rankData.value);
                  topDamage.setPlayerName(playerPublicDao.playerName);
                  resp.setTop(topDamage);
               }
            }

            this.player.sendMsg(resp.build());
            this.player.triggerTask(627, 0, 1L, 1);
            this.duelMgr.pushTaskEx("addBossRecord", new Object[]{duelDao.damage, duelDao.totalDamage, this.player.getPlayerId(), this.player.getPublicDao().playerName});
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_PointFightList_4531(DuelBattleMsg.C2S_PointFightList_4531 msg, String source) {
      DuelBattleMsg.C2S_PointFightList_4531.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TheMostHero_4533(DuelBattleMsg.C2S_TheMostHero_4533 msg, String source) {
      DuelBattleMsg.C2S_TheMostHero_4533.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_PointFightGuess_4535(DuelBattleMsg.C2S_PointFightGuess_4535 msg, String source) {
      DuelBattleMsg.C2S_PointFightGuess_4535.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_PointGuess_4537(DuelBattleMsg.C2S_PointGuess_4537 msg, String source) {
      int wagerInx = msg.getWagerInx();
      int zone = msg.getZone();
      if (this.checkGuessResource(wagerInx, zone)) {
         DuelBattleMsg.C2S_PointGuess_4537.Builder builder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_CancelPointGuess_4539(DuelBattleMsg.C2S_CancelPointGuess_4539 msg, String source) {
   }

   public boolean checkGuessResource(int wagerInx, int zone) {
      DuelGambleModel model = (DuelGambleModel)this.player.getGameModelPool().getEntity("wudaoGamble", wagerInx);
      if (model == null) {
         return false;
      } else if (!this.player.checkResourceNum(model.getItemstype(), model.getItemsid(), model.getItemsvalue())) {
         logger.info("下注资源不足！");
         if (model.getType() == 1) {
            this.player.failure(76003);
         } else {
            this.player.failure(76002);
         }

         return false;
      } else {
         return true;
      }
   }

   @MsgHandlerAnno
   public void S2S_NotifyDelResource_15731(CrossDuelMsg.S2S_NotifyDelResource_15731 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DuelGambleModel model = (DuelGambleModel)this.player.getGameModelPool().getEntity("wudaoGamble", msg.getWagerInx());
      if (model == null) {
         logger.error("竞猜数据有问题！");
      } else {
         this.player.delResource(model.getItemstype(), model.getItemsid(), (long)model.getItemsvalue(), 76, 7606, 0, 0, "");
         this.player.triggerTask(626, 0, 1L, 1);
      }
   }

   @MsgHandlerAnno
   public void C2S_DuelRankInfo_16737(DuelExtraMsg.C2S_DuelRankInfo_16737 msg, String source) {
      DuelExtraMsg.C2S_DuelRankInfo_16737.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_DuelPassRankInfo_16739(DuelExtraMsg.C2S_DuelPassRankInfo_16739 msg, String source) {
      DuelExtraMsg.C2S_DuelPassRankInfo_16739.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2C_DuelRecordInfo_4590(DuelBattleMsg.S2C_DuelRecordInfo_4590 msg, String source) {
      DuelBattleMsg.S2C_DuelRecordInfo_4590.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FightList_16758(DuelExtraMsg.C2S_FightList_16758 msg, String source) {
      DuelExtraMsg.C2S_FightList_16758.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FightList_16760(DuelExtraMsg.C2S_FightList_16760 msg, String source) {
      DuelExtraMsg.C2S_FightList_16760.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_PointUI_16731(DuelExtraMsg.C2S_PointUI_16731 msg, String source) {
      DuelExtraMsg.C2S_PointUI_16731.Builder builder = msg.toBuilder();
      this.duelMgr.pushTaskEx("enterUi", new Object[]{this.player.getPlayerId(), 1, msg.getType()});
   }

   @MsgHandlerAnno
   public void C2S_PassUI_16732(DuelExtraMsg.C2S_PassUI_16732 msg, String source) {
      DuelExtraMsg.C2S_PassUI_16732.Builder builder = msg.toBuilder();
      this.duelMgr.pushTaskEx("enterUi", new Object[]{this.player.getPlayerId(), 2, msg.getType()});
   }

   @MsgHandlerAnno
   public void C2S_GuessUI_16733(DuelExtraMsg.C2S_GuessUI_16733 msg, String source) {
      DuelExtraMsg.C2S_GuessUI_16733.Builder builder = msg.toBuilder();
      this.duelMgr.pushTaskEx("enterUi", new Object[]{this.player.getPlayerId(), 3, msg.getType()});
   }

   @MsgHandlerAnno
   public void S2S_SendGuessAward_15732(CrossDuelMsg.S2S_SendGuessAward_15732 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("收到跨服发送的 竞猜奖励邮件：{}---{}", msg.getWagerInx(), msg.getAwardTypesList());
      DuelGambleModel model = (DuelGambleModel)this.player.getGameModelPool().getEntity("wudaoGamble", msg.getWagerInx());
      if (model != null) {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);

         for(Integer awardId : msg.getAwardTypesList()) {
            int rewardType = 0;
            if (awardId == 1) {
               rewardType = model.getAward1();
               this.player.triggerTask(631, 0, 1L, 1);
            } else {
               rewardType = model.getAward2();
            }

            CentreAwardModel rewardModel = this.getCentreAwardModel(rewardType, 1L);
            int logReason = 7606;
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardModel.getItems(), 604800000L, 76, logReason);
         }

      }
   }

   @MsgHandlerAnno
   public void S2S_SendRankAward_15730(CrossDuelMsg.S2S_SendRankAward_15730 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.checkServerDay()) {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel rewardModel = this.getCentreAwardModel(msg.getAwardId(), (long)msg.getRank());
         int logReason = 7607;
         String format = MessageFormat.format(rewardModel.getDesc(), msg.getRank());
         List<ResourceModel> awardList = new ArrayList();
         awardList.addAll(rewardModel.getItems());
         if (msg.hasType() && msg.getType() > 0) {
            int rank = msg.getRank();
            DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
            Map<Integer, WuDaoCentreAwardModel> modelMap = this.player.getGameModelPool().getMap("wudaoCentreAwardid");

            for(WuDaoCentreAwardModel model : modelMap.values()) {
               if (model.getSeason() == msg.getType() && model.getMinRank() <= rank && model.getMaxRank() >= rank) {
                  awardList.addAll(model.getItem());
                  break;
               }
            }
         }

         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), format, awardList, 604800000L, 76, logReason);
         if (msg.hasMedal() && msg.getMedal() > 0) {
            this.player.addResource(2, msg.getMedal(), 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 76, 7612, 0, 0, "");
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_PointFightList_16701(DuelExtraMsg.C2S_PointFightList_16701 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_PointFightGuess_16705(DuelExtraMsg.C2S_PointFightGuess_16705 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_PointGuess_16707(DuelExtraMsg.C2S_PointGuess_16707 msg, String source) {
      int wagerInx = msg.getWagerInx();
      int zone = msg.getZone();
      if (this.checkGuessResource(wagerInx, zone)) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }
   }

   @MsgHandlerAnno
   public void C2S_CancelPointGuess_16709(DuelExtraMsg.C2S_CancelPointGuess_16709 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_PassBattle_16715(DuelExtraMsg.C2S_PassBattle_16715 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_PassGuessInfo_16717(DuelExtraMsg.C2S_PassGuessInfo_16717 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_MyPassBattle_16719(DuelExtraMsg.C2S_MyPassBattle_16719 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_PassGuess_16721(DuelExtraMsg.C2S_PassGuess_16721 msg, String source) {
      int wagerInx = msg.getWagerInx();
      int zone = msg.getZone();
      if (this.checkGuessResource(wagerInx, zone)) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
      }
   }

   @MsgHandlerAnno
   public void C2S_CancelPassGuess_16723(DuelExtraMsg.C2S_CancelPassGuess_16723 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_FightBack_16735(DuelExtraMsg.C2S_FightBack_16735 msg, String source) {
      if (!this.isInvalid()) {
         if (Debug.isDebug || this.duelMgr.getStage() == 4 || this.duelMgr.getStage() == 7) {
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DuelRecordInfo_4589(DuelBattleMsg.C2S_DuelRecordInfo_4589 msg, String source) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   @MsgHandlerAnno
   public void C2S_Maneuver_16741(DuelExtraMsg.C2S_Maneuver_16741 msg, String source) {
      if (!this.isInvalid()) {
         if (Debug.isDebug || this.duelMgr.getStage() == 4 || this.duelMgr.getStage() == 7) {
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ManeuverMatch_16743(DuelExtraMsg.C2S_ManeuverMatch_16743 msg, String source) {
      if (!this.isInvalid()) {
         if (Debug.isDebug || this.duelMgr.getStage() == 4 || this.duelMgr.getStage() == 7) {
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ManeuverFight_16745(DuelExtraMsg.C2S_ManeuverFight_16745 msg, String source) {
      if (!this.isInvalid()) {
         if (Debug.isDebug || this.duelMgr.getStage() == 4 || this.duelMgr.getStage() == 7) {
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
         }
      }
   }

   @MsgHandlerAnno
   public void S2C_ManeuverFight_16746(DuelExtraMsg.S2C_ManeuverFight_16746 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.player.sendMsg(msg);
      this.player.triggerTask(633, 0, 1L, 1);
   }

   private CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel value : rewardMap.values()) {
         if ((long)value.getMinRank() <= rank && (long)value.getMaxRank() >= rank) {
            rewardModel = value;
         }
      }

      if (rewardModel == null) {
         rewardModel = (CentreAwardModel)rewardMap.lastEntry().getValue();
      }

      return rewardModel;
   }

   public void gmOp(int op) {
      if (op == 1) {
         logger.info("GM命令发送排行榜数据给跨服");
         this.duelMgr.settleBoss(true);
      } else if (op == 2) {
         this.rankMgr.removeRanks(RankDefine.RankModule.DUEL_BOSS);
      } else if (op == 3) {
         Map<Integer, WuDaoSelectPointModel> wuDaoSelectPointModelMap = ApplicationContextProvider.<Integer, WuDaoSelectPointModel>getModelPoolMap("wudaoSelectPoint");
         Set<Integer> challengePlayers = new HashSet();
         int maxUploadSize = wuDaoSelectPointModelMap.size();
         List<RankData> list = this.duelMgr.getDamageRanks(wuDaoSelectPointModelMap.size());
         Iterator<RankData> iterator = list.iterator();

         while(iterator.hasNext()) {
            RankData rankData = (RankData)iterator.next();
            GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
            if (gamePlayer != null && !gamePlayer.isRobot()) {
               challengePlayers.add(rankData.value);
            } else {
               iterator.remove();
            }
         }

         int needAutoJoin = maxUploadSize - challengePlayers.size();
         if (needAutoJoin > 0) {
            for(RankData rankData : this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, maxUploadSize)) {
               if (!challengePlayers.contains(rankData.value)) {
                  GamePlayer gamePlayer = this.worldMgr.getPlayerById(rankData.value);
                  if (gamePlayer != null && !gamePlayer.isRobot()) {
                     gamePlayer.pushPartTaskEx(DuelPart.class, "gmBossRank", new Object[0]);
                     --needAutoJoin;
                     if (needAutoJoin <= 0) {
                        break;
                     }
                  }
               }
            }
         }
      } else if (op == 4) {
         this.enterZoneCheckArraying();
      } else if (op >= 10) {
         CrossDuelMsg.S2S_sendGm_4599.Builder builder = CrossDuelMsg.S2S_sendGm_4599.newBuilder();
         builder.setGmOp(op);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @TaskMethod
   public void gmBossRank() {
      if (this.checkUploadArraying()) {
         this.rankMgr.updateRank(RankDefine.RankModule.DUEL_BOSS, (long)RandomUtil.randInt(100000, 100000000), this.player.getPlayerId());
      }
   }

   public boolean checkServerDay() {
      int day = this.configManager.getIntDefault("wudaoOpenInletDay", 45);
      long dayStartTime = DateUtil.getSomeDayBeginTime(this.worldMgr.getOpenServerTime());
      int realDay = DateUtil.difftimeDay(new Timestamp(dayStartTime)) + 1;
      return realDay >= day;
   }

   @TaskMethod
   public void sendDuelMainInfo() {
      if (this.player.isSystemOpen(3190)) {
         if (this.checkServerDay()) {
            if (this.duelMgr.isGroup || this.duelMgr.getStageStatus() != 1) {
               HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
               boolean isHaveArraying_1 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DUEL_1);
               boolean isHaveArraying_2 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DUEL_2);
               boolean isHaveArraying_3 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DUEL_3);
               if (isHaveArraying_1 && isHaveArraying_2 && isHaveArraying_3) {
                  this.checkUploadArraying();
               }

               DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
               if (!this.duelMgr.isInvalid() && (duelDao.startTime != this.duelMgr.getStartTime() || duelDao.season != this.duelMgr.getSeason())) {
                  this.player.uploadCrossPlayer();
                  duelDao.startTime = this.duelMgr.getStartTime();
                  duelDao.season = this.duelMgr.getSeason();
                  duelDao.fightTimes = 0;
                  duelDao.buyTimes = 0;
                  duelDao.damage = 0L;
                  duelDao.totalDamage = 0L;
                  duelDao.todayMaxDamage = 0L;
                  duelDao.point = 0;
                  duelDao.taskBoxReward.clear();
                  duelDao.showRankStage.clear();
                  duelDao.taskGroupData.remove(1);
                  duelDao.taskGroupData.remove(2);
                  duelDao.taskGroupData.remove(3);
                  duelDao.updateOp();
                  PlayerDao playerDao = this.player.getPlayerDao();
                  if (DateUtil.isSameDay(playerDao.updateTime)) {
                     DuelTaskPart duelTaskPart = (DuelTaskPart)this.player.getMgrPart(DuelTaskPart.class);
                     duelTaskPart.trigger();
                  }

                  PrestigeTaskPart prestigeTaskPart = (PrestigeTaskPart)this.player.getMgrPart(PrestigeTaskPart.class);
                  int prestigeTask = ApplicationContextProvider.getConfigInt("wudaoSpecialPrestige", 195730);
                  TaskData taskData = prestigeTaskPart.getTask(prestigeTask);
                  if (taskData != null) {
                     PrestigeTaskModel prestigeTaskModel = (PrestigeTaskModel)ApplicationContextProvider.getModelPoolEntity("prestigetask", prestigeTask);
                     if (prestigeTaskModel != null) {
                        MonarchDao monarchDao = (MonarchDao)this.player.getData("tb_player_monarch", this.player.getPlayerId());
                        if (taskData.state < 3 || !monarchDao.prestiges.containsKey(prestigeTaskModel.getPrestigeid())) {
                           taskData.state = 1;
                           taskData.tVal = 0;
                           taskData.updateOp();
                        }
                     }
                  }

                  isHaveArraying_1 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DUEL_1);
                  isHaveArraying_2 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DUEL_2);
                  isHaveArraying_3 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DUEL_3);
                  if (isHaveArraying_1 && isHaveArraying_2 && isHaveArraying_3) {
                     this.uploadArraying();
                  }
               }

               this.player.sendMsg(this.duelMgr.buildInfoMsg(this.player.getPlayerId()).build());
            }
         }
      }
   }

   public void sendBossInfo() {
      if (this.player.isSystemOpen(3190)) {
         int freeFightTimes = ApplicationContextProvider.getConfigInt("wudaoSection1challenge", 0);
         int buyTimes = ApplicationContextProvider.getConfigInt("wudaoSection1buy", 0);
         int fightTimes = freeFightTimes + buyTimes;
         int rank = 0;
         long damage = 0L;
         long totalDamage = 0L;
         long todayMaxDamage = 0L;
         DuelBattleMsg.S2C_DuelBossInfo_4524.Builder resp = DuelBattleMsg.S2C_DuelBossInfo_4524.newBuilder();
         if (!this.isInvalid()) {
            DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
            fightTimes = duelDao.fightTimes;
            buyTimes = duelDao.buyTimes;
            damage = duelDao.damage;
            totalDamage = duelDao.totalDamage;
            todayMaxDamage = duelDao.todayMaxDamage;
            rank = this.rankMgr.getRank(RankDefine.RankModule.DUEL_BOSS, this.player.getPlayerId());
            List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.DUEL_BOSS, 1);
            if (rankDataList != null && !rankDataList.isEmpty()) {
               RankData rankData = (RankData)rankDataList.get(0);
               GamePlayer topPlayer = this.worldMgr.getPlayerById(rankData.value);
               if (topPlayer != null) {
                  PlayerPublicDao playerPublicDao = topPlayer.getPublicDao();
                  DuelBattleMsg.TopDamage.Builder topDamage = DuelBattleMsg.TopDamage.newBuilder();
                  topDamage.setDamageSum(rankData.score);
                  topDamage.setPlayerId(rankData.value);
                  topDamage.setPlayerName(playerPublicDao.playerName);
                  resp.setTop(topDamage);
               }
            }
         }

         resp.setFightTimes(fightTimes);
         resp.setBuyTimes(buyTimes);
         resp.setRank(rank);
         resp.setDamage(damage);
         resp.setTotalDamage(totalDamage);
         resp.setTodayMaxDamage(todayMaxDamage);
         this.player.sendMsg(resp.build());
      }
   }

   private void sendBossRecord() {
      if (this.player.isSystemOpen(3190)) {
         DuelBattleMsg.S2C_DuelBossRecordAll_4525.Builder msg = DuelBattleMsg.S2C_DuelBossRecordAll_4525.newBuilder();
         msg.addAllRecord(this.duelMgr.getBossRecordMsgList(0));
         msg.addAllMyRecord(this.duelMgr.getBossRecordMsgList(this.player.getPlayerId()));
         this.player.sendMsg(msg.build());
      }
   }

   public int enterChallengeBoss(BattleDao battleDao) {
      if (this.isBossInvalid()) {
         return 8007;
      } else if (this.checkIsNeedArraying()) {
         return 4125;
      } else {
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         int freeTimes = ApplicationContextProvider.getConfigInt("wudaoSection1challenge", 0);
         if (duelDao.fightTimes >= duelDao.buyTimes + freeTimes) {
            return 41;
         } else {
            int bossBattleId = ApplicationContextProvider.getConfigInt("wudaoSection1battle", 0);
            BattlePKTeam bossTeam = new BattlePKTeam(bossBattleId);
            battleDao.scene.addPKTeam((byte)1, bossTeam);
            battleDao.scene.setMaxRound((byte)ApplicationContextProvider.getConfigInt("wudaoSelectBattleNum", 17));
            return 1;
         }
      }
   }

   public void afterChallengeBoss(BattleDao battleDao) {
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      int rateDamage = ApplicationContextProvider.getConfigInt("wudaoSelectPoint", 13000);
      long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
      damage = Math.max(damage / (long)rateDamage, 1L);
      duelDao.damage = damage;
      ++duelDao.fightTimes;
      BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
      if (damage > 0L) {
         if (damage > duelDao.todayMaxDamage) {
            duelDao.todayMaxDamage = damage;
         }

         duelDao.totalDamage += damage;
         this.rankMgr.updateRank(RankDefine.RankModule.DUEL_BOSS, duelDao.totalDamage, this.player.getPlayerId());
         TreeMap<Integer, WuDaoBattleModel> wuDaoBattleModelMap = new TreeMap(ApplicationContextProvider.getModelPoolMap("wudaoBattle"));
         WuDaoBattleModel damageRewardModel = (WuDaoBattleModel)wuDaoBattleModelMap.firstEntry().getValue();

         for(WuDaoBattleModel wuDaoBattleModel : wuDaoBattleModelMap.values()) {
            if (damage < (long)wuDaoBattleModel.getMin()) {
               break;
            }

            damageRewardModel = wuDaoBattleModel;
         }

         List<ResourceModel> rewards = new ArrayList();

         for(ResourceModel resourceModel : damageRewardModel.getItems()) {
            resourceModel.addResourceToList(rewards);
         }

         for(ResourceModel resourceModel : rewards) {
            result.addAwardItems(resourceModel.builder());
         }

         battleDao.rewards.addAll(rewards);
      }

      duelDao.updateOp();
      result.setResult(0);
      battleDao.scene.getBattleMsg().setResult(result);
      this.sendBossInfo();
      this.duelMgr.pushTaskEx("addBossRecord", new Object[]{damage, duelDao.totalDamage, this.player.getPlayerId(), this.player.getPublicDao().playerName});
      this.player.triggerTask(627, 0, 1L, 1);
   }

   public void endChallengeBoss(BattleDao battleDao) {
      if (!battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 76, 7601, battleDao.modelId, 0, "");
      }

   }

   private boolean isInvalid() {
      return !this.player.isSystemOpen(3190) || this.duelMgr.isInvalid();
   }

   private boolean isBossInvalid() {
      return !this.player.isSystemOpen(3190) || this.duelMgr.isBossInvalid();
   }

   private boolean checkIsNeedArraying() {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      List<Integer> heroCodeList = heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_DUEL_1);
      if (heroCodeList.isEmpty()) {
         return true;
      } else {
         heroCodeList = heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_DUEL_2);
         if (heroCodeList.isEmpty()) {
            return true;
         } else {
            heroCodeList = heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_DUEL_3);
            return heroCodeList.isEmpty();
         }
      }
   }

   @TaskMethod
   public void checkAndUploadBossRank(int rank) {
      if (this.checkUploadArraying()) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), this.player.toUploadCrossPlayerBuilder().build());
         this.uploadArraying();
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         int serialChampion = 0;
         if (duelDao.championData.time > 0L) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, -calendar.get(5));
            if (DateUtil.isSameMonth(duelDao.championData.time, calendar.getTimeInMillis())) {
               serialChampion = duelDao.championData.count;
            }
         }

         this.duelMgr.pushTaskEx("uploadBossRank", new Object[]{this.player, rank, serialChampion});
      }
   }

   private boolean checkUploadArraying() {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      Map<Integer, HeroDao> heroDaoMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      boolean isHaveArraying_1 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DUEL_1);
      boolean isHaveArraying_2 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DUEL_2);
      boolean isHaveArraying_3 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DUEL_3);
      if (isHaveArraying_1 && isHaveArraying_2 && isHaveArraying_3 && !heroArrayingPart.multipleArrayingHadSameHero(3190)) {
         return true;
      } else {
         HeroArrayingDao duelArrayingDao1 = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DUEL_1);
         if (duelArrayingDao1 != null) {
            duelArrayingDao1.soulHeroCode = 0;
            duelArrayingDao1.elements.clear();
            duelArrayingDao1.updateOp();
         }

         HeroArrayingDao duelArrayingDao2 = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DUEL_2);
         if (duelArrayingDao2 != null) {
            duelArrayingDao2.soulHeroCode = 0;
            duelArrayingDao2.elements.clear();
            duelArrayingDao2.updateOp();
         }

         HeroArrayingDao duelArrayingDao3 = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DUEL_3);
         if (duelArrayingDao3 != null) {
            duelArrayingDao3.soulHeroCode = 0;
            duelArrayingDao3.elements.clear();
            duelArrayingDao3.updateOp();
         }

         List<Integer> usedHeroIdList = new ArrayList(heroArrayingPart.getArrayingHeroIds(CommonMsg.HeroState.HERO_STATE_ARRAYING));
         List<HeroDao> heroDaoList = new ArrayList(heroDaoMap.values());
         heroDaoList.sort(ComparatorUtil.createComparatorByFiled(HeroDao.class, "combatPower"));
         List<HeroDao> lessHeroDaoList = new ArrayList();
         HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);

         for(int i = heroDaoList.size() - 1; i >= 0; --i) {
            HeroDao heroDao = (HeroDao)heroDaoList.get(i);
            if (!usedHeroIdList.contains(heroDao.id) && heroPalacePart.checkPalaceHero(heroDao)) {
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
               if (heroModel != null && (heroModel.getNation() != 10 || heroDao.inheritNation > 0) && (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK || heroDao.linkCode != 0) && heroDao.invalidTime <= 0) {
                  lessHeroDaoList.add(heroDao);
                  usedHeroIdList.add(heroDao.id);
               }
            }
         }

         boolean isSuc = false;
         if (lessHeroDaoList.size() < 2) {
            logger.error("【武道大会】玩家{}上报布阵失败,武将不足", this.player.getPublicDao().playerName);
         } else {
            int everyArrayNum = Math.min(lessHeroDaoList.size() / 2, 5);
            List<HeroDao> twoArrayingHeroList = new ArrayList(lessHeroDaoList.subList(0, everyArrayNum));
            List<HeroDao> threeArrayingHeroList = new ArrayList(lessHeroDaoList.subList(everyArrayNum, everyArrayNum * 2));
            heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_DUEL_1);
            this.saveArraying(CommonMsg.HeroState.HERO_STATE_DUEL_2, twoArrayingHeroList);
            this.saveArraying(CommonMsg.HeroState.HERO_STATE_DUEL_3, threeArrayingHeroList);
            isSuc = true;
         }

         if (this.player.isLogin()) {
            heroArrayingPart.sendArrayingListToClient();
         }

         return isSuc;
      }
   }

   private boolean checkArrayingSameHero(CommonMsg.HeroState arrayingType, List<Integer> usedHeroIdList) {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);

      for(int arrayingHeroId : heroArrayingPart.getArrayingHeroIds(arrayingType)) {
         if (usedHeroIdList.contains(arrayingHeroId)) {
            return true;
         }

         usedHeroIdList.add(arrayingHeroId);
      }

      return false;
   }

   private void saveArraying(CommonMsg.HeroState arrayingType, List<HeroDao> heroDaoList) {
      List<HeroMsg.ArrayingInfo> arrayingList = new ArrayList();
      int postion = 0;

      for(HeroDao heroDao : heroDaoList) {
         if (postion > 4) {
            break;
         }

         HeroMsg.ArrayingInfo.Builder builder = HeroMsg.ArrayingInfo.newBuilder();
         builder.setPosition(postion);
         builder.setCode(heroDao.code);
         builder.setCodeType(CommonMsg.CodeType.CODE_HERO);
         arrayingList.add(builder.build());
         ++postion;
      }

      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      heroArrayingPart.saveHeroArraying(arrayingType, arrayingList);
   }

   @MsgHandlerAnno
   public void C2S_PeakRedPacketList_16748(DuelExtraMsg.C2S_PeakRedPacketList_16748 msg, String source) {
      if (this.checkServerDay()) {
         DuelExtraMsg.C2S_PeakRedPacketList_16748.Builder builder = msg.toBuilder();
         builder.setLev(this.player.getPublicDao().lv);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_ReceiveRedPacket_16750(DuelExtraMsg.C2S_ReceiveRedPacket_16750 msg, String source) {
      DuelExtraMsg.C2S_ReceiveRedPacket_16750.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2C_NotifyReceiveRedPacket_16756(DuelExtraMsg.S2C_NotifyReceiveRedPacket_16756 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int num = msg.getPropNum();
      this.player.addResource(1, PlayerDefine.PLAYER_GOLD, num, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 76, 7610, 0, 0, "");
   }

   public void uploadArraying() {
      if (this.checkUploadArraying()) {
         this.uploadArraying(CommonMsg.HeroState.HERO_STATE_DUEL_1);
         this.uploadArraying(CommonMsg.HeroState.HERO_STATE_DUEL_2);
         this.uploadArraying(CommonMsg.HeroState.HERO_STATE_DUEL_3);
      }
   }

   private void uploadArraying(CommonMsg.HeroState arrayingType) {
      ArrayingMirror arrayingMirror = this.player.getPlayerArraying(arrayingType);
      if (arrayingMirror != null && arrayingMirror.arrayingElementsMap != null && !arrayingMirror.arrayingElementsMap.isEmpty()) {
         CrossDuelMsg.S2S_sendArraying_15734.Builder sendArraying = CrossDuelMsg.S2S_sendArraying_15734.newBuilder();
         sendArraying.setArrayingType(arrayingType);
         byte[] bytes = arrayingMirror.toByteArray();
         sendArraying.setArraying(ByteString.copyFrom(bytes));
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), sendArraying.build());
      }

   }

   public void logoutHandle() {
      if (this.player.isSystemOpen(3190)) {
         this.duelMgr.pushTaskEx("enterUi", new Object[]{this.player.getPlayerId(), 1, 2});
         this.duelMgr.pushTaskEx("enterUi", new Object[]{this.player.getPlayerId(), 2, 2});
         this.duelMgr.pushTaskEx("enterUi", new Object[]{this.player.getPlayerId(), 3, 2});
      }
   }

   public void levelUp(int preLv, int newLv) {
      if (this.player.isSystemOpen(3190)) {
         SystemFunctionModel model = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 3190);
         if (model.getOpenLevel() == newLv) {
            DuelTaskPart duelTaskPart = (DuelTaskPart)this.player.getMgrPart(DuelTaskPart.class);
            duelTaskPart.createShopTask();
            this.sendDuelMainInfo();
         }
      }
   }

   public void loginHandle() {
      if (this.player.isSystemOpen(3190)) {
         DuelTaskPart duelTaskPart = (DuelTaskPart)this.player.getMgrPart(DuelTaskPart.class);
         duelTaskPart.createShopTask();
         duelTaskPart.trigger();
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         if (duelDao.season == 0 && !this.isInvalid() && this.duelMgr.getStartTime() == duelDao.startTime) {
            duelDao.season = this.duelMgr.getSeason();
            duelDao.updateOp();
         }

         if (this.checkServerDay()) {
            DuelExtraMsg.S2C_LoginCheckRedPacket_16757.Builder builder = DuelExtraMsg.S2C_LoginCheckRedPacket_16757.newBuilder();
            builder.setLv(this.player.getPublicDao().lv);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            if (this.checkNotifyPassGuess(duelDao)) {
               DuelExtraMsg.S2C_NotifyPassGuessBegin_16762.Builder notifyBuilder = DuelExtraMsg.S2C_NotifyPassGuessBegin_16762.newBuilder();
               notifyBuilder.setIsNotify(true);
               this.player.sendMsg(notifyBuilder.build());
            }

            this.checkJadeTime();
         }
      }
   }

   public void resetDaily() {
      if (this.player.isSystemOpen(3190)) {
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         duelDao.todayMaxDamage = 0L;
         duelDao.fightTimes = 0;
         duelDao.buyTimes = 0;
         duelDao.notifyGuess = 0;
         duelDao.todayHistoryLike.clear();
         duelDao.todayWorshipLike.clear();
         duelDao.updateOp();
         this.sendBossInfo();
         DuelTaskPart duelTaskPart = (DuelTaskPart)this.player.getMgrPart(DuelTaskPart.class);
         duelTaskPart.trigger();
         this.checkJadeTime();
      }
   }

   public boolean checkCanUploadArraying() {
      if (this.duelMgr.getStage() != 3 && this.duelMgr.getStage() != 6) {
         return true;
      } else {
         LocalDateTime nowTime = LocalDateTime.now();
         LocalDateTime startTime_1 = LocalDateTime.now();
         LocalDateTime endTime_1 = LocalDateTime.now();
         String[] timeArr = ApplicationContextProvider.getConfigString("wudaoArrayLimitTime", "10:30|12:31,18:30|20:31").split(",");
         String[] timeArr_1 = timeArr[0].split("\\|");
         String[] startTimeArr_1 = timeArr_1[0].split(":");
         startTime_1 = startTime_1.withHour(Integer.parseInt(startTimeArr_1[0])).withMinute(Integer.parseInt(startTimeArr_1[1])).withSecond(0).withNano(0);
         String[] endTimeArr_1 = timeArr_1[1].split(":");
         endTime_1 = endTime_1.withHour(Integer.parseInt(endTimeArr_1[0])).withMinute(Integer.parseInt(endTimeArr_1[1])).withSecond(0).withNano(0);
         if (nowTime.isAfter(startTime_1) && nowTime.isBefore(endTime_1)) {
            return false;
         } else {
            LocalDateTime startTime_2 = LocalDateTime.now();
            LocalDateTime endTime_2 = LocalDateTime.now();
            String[] timeArr_2 = timeArr[1].split("\\|");
            String[] startTimeArr_2 = timeArr_2[0].split(":");
            startTime_2 = startTime_2.withHour(Integer.parseInt(startTimeArr_2[0])).withMinute(Integer.parseInt(startTimeArr_2[1])).withSecond(0).withNano(0);
            String[] endTimeArr_2 = timeArr_2[1].split(":");
            endTime_2 = endTime_2.withHour(Integer.parseInt(endTimeArr_2[0])).withMinute(Integer.parseInt(endTimeArr_2[1])).withSecond(0).withNano(0);
            return !nowTime.isAfter(startTime_2) || !nowTime.isBefore(endTime_2);
         }
      }
   }

   @TaskMethod
   public void enterZoneCheckArraying() {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      ArrayingMirror arrayingMirrorByType1 = heroArrayingPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_DUEL_1);
      ArrayingMirror arrayingMirrorByType2 = heroArrayingPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_DUEL_2);
      ArrayingMirror arrayingMirrorByType3 = heroArrayingPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_DUEL_3);
      if (arrayingMirrorByType1.power <= arrayingMirrorByType2.power || arrayingMirrorByType1.power <= arrayingMirrorByType3.power) {
         if (arrayingMirrorByType2.power > arrayingMirrorByType3.power) {
            heroArrayingPart.saveHeroArraying(CommonMsg.HeroState.HERO_STATE_DUEL_1, arrayingMirrorByType2);
            heroArrayingPart.saveHeroArraying(CommonMsg.HeroState.HERO_STATE_DUEL_2, arrayingMirrorByType1);
         } else {
            heroArrayingPart.saveHeroArraying(CommonMsg.HeroState.HERO_STATE_DUEL_1, arrayingMirrorByType3);
            heroArrayingPart.saveHeroArraying(CommonMsg.HeroState.HERO_STATE_DUEL_3, arrayingMirrorByType1);
         }

         this.uploadArraying();
         if (this.player.isLogin()) {
            heroArrayingPart.sendArrayingListToClient();
         }

         int mailId = ApplicationContextProvider.getConfigInt("wudaoChangeMail", 0);
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", mailId);
         if (centreAwardModel != null) {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), (List)null, 604800000L, 76, 7611);
         }
      }
   }

   public boolean checkNotifyPassGuess(DuelDao duelDao) {
      if (this.duelMgr.getStage() != 6) {
         return false;
      } else {
         LocalDateTime nowDateTime = LocalDateTime.now();
         String duelPassGuessTime = this.configManager.getStrByDefault("biwutaotaisaitime", "18:00|20:15");
         String[] guessTime = duelPassGuessTime.split("\\|");
         String firstTime = guessTime[0];
         int firstHour = Integer.parseInt(firstTime.split(":")[0]);
         int firstMinute = Integer.parseInt(firstTime.split(":")[1]);
         String endTime = guessTime[1];
         int endHour = Integer.parseInt(endTime.split(":")[0]);
         int endMinute = Integer.parseInt(endTime.split(":")[1]);
         if ((nowDateTime.getHour() > firstHour || nowDateTime.getHour() == firstHour && nowDateTime.getMinute() >= firstMinute) && (nowDateTime.getHour() < endHour || nowDateTime.getHour() == endHour && nowDateTime.getMinute() < endMinute) && duelDao.notifyGuess < 1) {
            duelDao.notifyGuess = 1;
            duelDao.updateOp();
            return true;
         } else {
            return false;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_JadeInfo_16773(DuelExtraMsg.C2S_JadeInfo_16773 msg, String source) {
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      DuelExtraMsg.S2C_JadeInfo_16774.Builder builder = DuelExtraMsg.S2C_JadeInfo_16774.newBuilder();
      boolean flag = false;

      for(DuelJadeData data : duelDao.tempJadeData) {
         if (data.endTime < DateUtil.getIntTime(System.currentTimeMillis())) {
            data.isEnd = true;
            flag = true;
         }

         builder.addInfo(this.buildJade(data));
      }

      if (flag) {
         duelDao.updateOp();
      }

      builder.setCurSeason(duelDao.season == 0 ? this.duelMgr.getSeason() : duelDao.season);
      this.player.sendMsg(builder.build());
      if (flag) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODULE_DUEL_JADE);
      }

   }

   public void checkJadeTime() {
      if (this.player.isSystemOpen(3190)) {
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         boolean flag = false;

         for(DuelJadeData data : duelDao.tempJadeData) {
            if (!data.isEnd && data.endTime < DateUtil.getIntTime(System.currentTimeMillis())) {
               data.isEnd = true;
               flag = true;
            }
         }

         if (flag) {
            duelDao.updateOp();
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODULE_DUEL_JADE);
         }

      }
   }

   public DuelExtraMsg.JadeData buildJade(DuelJadeData data) {
      DuelExtraMsg.JadeData.Builder info = DuelExtraMsg.JadeData.newBuilder();
      info.setJadeId(data.id);
      info.setEndTime(data.endTime);
      info.setSeason(data.season);
      return info.build();
   }

   @MsgHandlerAnno
   public void C2S_ActivationJade_16771(DuelExtraMsg.C2S_ActivationJade_16771 msg, String source) {
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.itemBag.getItemByCode(msg.getJadeId());
      if (itemBase == null) {
         logger.info("itemCode={}", msg.getJadeId());
      } else {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
         if (itemModel != null) {
            DuelYuJueModel model = (DuelYuJueModel)this.player.getGameModelPool().getEntity("wudaoYujue", itemModel.getUseFuncId());
            if (model != null) {
               if (model.getItemId() != itemBase.id) {
                  logger.error("玉珏激活道具不一致，消耗道具{}---，需要道具{}", itemBase.id, model.getItemId());
               } else if (this.duelMgr.getEndTime() != 0L || this.duelMgr.getStartTime() != 0L) {
                  DuelJadeData jadeData = new DuelJadeData();
                  jadeData.isActive = true;
                  jadeData.id = model.getId();
                  jadeData.season = model.getSeason();
                  jadeData.isEnd = true;
                  jadeData.endTime = 0;
                  logger.info("激活玉珏当前赛季结束时间：{}--- 当前时间：{}--{}", new Object[]{DateUtil.getIntTime(this.duelMgr.getEndTime()), DateUtil.getIntTime(System.currentTimeMillis()), this.player.getPlayerId()});
                  if (model.getSeason() == this.duelMgr.getSeason()) {
                     jadeData.endTime = DateUtil.getIntTime(WuDaoDateModel.getNextSeasonSettleTime());
                     jadeData.isEnd = false;
                  } else if (this.duelMgr.getSeason() - model.getSeason() == 1) {
                     int endTime = DateUtil.getIntTime(this.duelMgr.getEndTime()) - 86400 - 10800 - 2700;
                     if (endTime > DateUtil.getIntTime(System.currentTimeMillis())) {
                        jadeData.endTime = endTime;
                        jadeData.isEnd = false;
                     }
                  }

                  duelDao.tempJadeData.add(jadeData);
                  duelDao.updateOp();
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  itemBagPart.deleteItemByCode(msg.getJadeId(), 1, 76, 7613, 0, 0, "");
                  this.player.senditemUpdateMsg();
                  DuelExtraMsg.S2C_ActivationJade_16772.Builder builder = DuelExtraMsg.S2C_ActivationJade_16772.newBuilder();
                  builder.setInfo(this.buildJade(jadeData));
                  this.player.sendMsg(builder.build());
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODULE_DUEL_JADE);
               }
            }
         }
      }
   }

   public List<Integer> getJadeList() {
      List<Integer> list = new ArrayList();
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      Map<Integer, DuelYuJueModel> modelMap = this.player.getGameModelPool().getMap("wudaoYujue");

      for(DuelJadeData jadeData : duelDao.tempJadeData) {
         if (modelMap.containsKey(jadeData.id) && jadeData.isActive) {
            list.add(jadeData.id);
         }
      }

      return list;
   }

   public List<PropertyModel> getJadePro() {
      List<PropertyModel> proList = new ArrayList();
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      Map<Integer, DuelYuJueModel> modelMap = this.player.getGameModelPool().getMap("wudaoYujue");

      for(DuelJadeData jadeData : duelDao.tempJadeData) {
         if (modelMap.containsKey(jadeData.id) && jadeData.isActive) {
            DuelYuJueModel model = (DuelYuJueModel)modelMap.get(jadeData.id);
            proList.addAll(model.getPro());
            if (!jadeData.isEnd) {
               proList.addAll(model.getLimitPro());
            }
         }
      }

      return proList;
   }
}
