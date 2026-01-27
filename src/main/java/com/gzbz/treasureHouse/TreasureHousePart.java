package com.gzbz.treasureHouse;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.RuneLotteryDao;
import com.gzbz.db.WarHorseDao;
import com.gzbz.db.WarNorthDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.horse.WarHorseMgr;
import com.gzbz.gamePlayer.horse.WarHorsePart;
import com.gzbz.gamePlayer.playerBag.RuneStonePart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.FormationGemGetModel;
import com.gzbz.model.FormationGemModel;
import com.gzbz.model.RuneLotteryModel;
import com.gzbz.model.SacrificeModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.WarHorseStableModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RuneMsg;
import com.gzbz.protobuf.RuneStoneMsg;
import com.gzbz.protobuf.TreasureHouseMsg;
import com.gzbz.protobuf.WarHorseMsg;
import com.gzbz.protobuf.WarNorthMsg;
import com.gzbz.rune.RuneMgr;
import com.gzbz.rune.part.RunePart;
import com.gzbz.runeStone.RuneStoneMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.war.north.WarNorthMgr;
import com.gzbz.war.north.WarNorthPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TreasureHousePart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_AllFreeReward_15001(TreasureHouseMsg.C2S_AllFreeReward_15001 msg, String source) {
      this.allFreeReward(false);
   }

   private void allFreeReward(boolean isFromGuanJia) {
      Map<Integer, SystemFunctionModel> systemFunctionModelMap = ApplicationContextProvider.<Integer, SystemFunctionModel>getModelPoolMap("systemFunction");
      PlayerMsg.ShowType showType = isFromGuanJia ? PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW : PlayerMsg.ShowType.SHOW_TYPE_COMMON;
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      List<ResourceModel> rewardModels = new ArrayList();
      List<ResourceModel> ornamentSacrificeLogResources = new ArrayList();
      WarNorthDao ornamentResult = this.ornamentFree(rewardModels, ornamentSacrificeLogResources);
      List<ResourceModel> runeLotteryLogResources = new ArrayList();
      RuneLotteryDao runeLotteryResult = null;
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)systemFunctionModelMap.get(5000);
      if (systemFunctionModel != null && systemFunctionModel.getIsShield() == 0) {
         runeLotteryResult = this.runeLotteryFree(rewardModels, runeLotteryLogResources);
      }

      FormationGemModel runeStoneResult = null;
      systemFunctionModel = (SystemFunctionModel)systemFunctionModelMap.get(2890);
      if (systemFunctionModel != null && systemFunctionModel.getIsShield() == 0) {
         runeStoneResult = this.runeStoneFree(rewardModels);
      }

      List<ResourceModel> warHorseSacrificeLogResources = new ArrayList();
      WarHorseDao warHorseResult = null;
      systemFunctionModel = (SystemFunctionModel)systemFunctionModelMap.get(3101);
      if (systemFunctionModel != null && systemFunctionModel.getIsShield() == 0) {
         warHorseResult = this.warHorseFree(rewardModels, warHorseSacrificeLogResources);
      }

      if (ornamentResult == null && runeStoneResult == null && warHorseResult == null && runeLotteryResult == null) {
         if (isFromGuanJia) {
            guanJiaPart.checkState(1191, (List)null);
         } else {
            this.player.failure(52);
         }

      } else {
         if (!rewardModels.isEmpty()) {
            this.player.addResource(rewardModels, showType, 75, 7501, 0, 0, "");
         }

         TreasureHouseMsg.S2C_AllFreeReward_15002.Builder resp = TreasureHouseMsg.S2C_AllFreeReward_15002.newBuilder();
         this.player.sendMsg(resp.build());
         this.ornamentAfterReward(ornamentResult, ornamentSacrificeLogResources);
         this.runeLotteryAfterReward(runeLotteryResult, runeLotteryLogResources);
         this.runeStoneAfterReward(runeStoneResult);
         this.warHorseAfterReward(warHorseResult, warHorseSacrificeLogResources);
         guanJiaPart.checkState(1191, rewardModels);
      }
   }

   private RuneLotteryDao runeLotteryFree(List<ResourceModel> resourceModels, List<ResourceModel> runeLotteryLogResources) {
      if (!this.player.isSystemOpen(5000)) {
         return null;
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int dailyCount = (Integer)playerResetCustomCache.getDailyNum(41, 0);
         if ((float)(dailyCount + 1) > ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
            return null;
         } else {
            RunePart runePart = (RunePart)this.player.getMgrPart(RunePart.class);
            RuneLotteryDao runeLotteryDao = (RuneLotteryDao)this.player.getData("tb_rune_lottery", this.player.getPlayerId());
            int freeCount = ApplicationContextProvider.getConfigInt("RunelotteryFreeNum", 1);
            if (runeLotteryDao.lotteryFreeCount >= freeCount) {
               return null;
            } else {
               RuneLotteryDao runeLotteryParam = new RuneLotteryDao();
               runeLotteryParam.lotteryFreeCount = runeLotteryDao.lotteryFreeCount;
               runeLotteryParam.lotteryCount = runeLotteryDao.lotteryCount;
               runeLotteryParam.lotteryPoint = runeLotteryDao.lotteryPoint;

               for(runeLotteryParam.firstGot = runeLotteryDao.firstGot; runeLotteryParam.lotteryFreeCount < freeCount; ++runeLotteryParam.lotteryFreeCount) {
                  RuneLotteryModel runeLotteryModel = (RuneLotteryModel)ApplicationContextProvider.getModelPoolEntity("RuneLottery", 1);
                  if (runeLotteryModel != null) {
                     List<ResourceModel> prizeList = new ArrayList();
                     runeLotteryParam.lotteryCount = runePart.runeLottery(prizeList, runeLotteryModel, runeLotteryParam.lotteryCount, runeLotteryParam.firstGot);
                     runeLotteryParam.lotteryPoint += runeLotteryModel.getExReward();
                     runeLotteryLogResources.addAll(prizeList);
                     resourceModels.addAll(prizeList);
                     resourceModels.addAll(runeLotteryModel.getRewards());
                  }
               }

               return runeLotteryParam;
            }
         }
      }
   }

   private void runeLotteryAfterReward(RuneLotteryDao runeLotteryParam, List<ResourceModel> runeLotteryLogResources) {
      if (runeLotteryParam != null) {
         RuneLotteryDao runeLotteryDao = (RuneLotteryDao)this.player.getData("tb_rune_lottery", this.player.getPlayerId());
         int useFree = runeLotteryParam.lotteryFreeCount - runeLotteryDao.lotteryFreeCount;
         if (useFree > 0) {
            runeLotteryDao.lotteryPoint = runeLotteryParam.lotteryPoint;
            runeLotteryDao.lotteryCount = runeLotteryParam.lotteryCount;
            runeLotteryDao.lotteryFreeCount = runeLotteryParam.lotteryFreeCount;
            runeLotteryDao.firstGot = true;
            runeLotteryDao.updateOp();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            playerResetCustomCache.addDailyReset(41, 1);
            RunePart runePart = (RunePart)this.player.getMgrPart(RunePart.class);
            runePart.lotteryTriggerTask(useFree);
            RuneMgr runeMgr = (RuneMgr)ApplicationContextProvider.getContext().getBean(RuneMgr.class);
            PlayerDao playerDao = this.player.getPlayerDao();
            runeMgr.pushTask(() -> runeMgr.addRuneLotteryRecordList(runeLotteryLogResources, playerDao.playerId, playerDao.playerName));
            RuneMsg.S2C_RuneLottery_20304.Builder resp = RuneMsg.S2C_RuneLottery_20304.newBuilder();
            resp.setType(1);
            resp.setRuneLotteryCount(runeLotteryDao.lotteryCount);
            resp.setDailyRuneLotteryCount((Integer)playerResetCustomCache.getDailyNum(41, 0));
            this.player.sendMsg(resp.build());
         }
      }
   }

   private WarNorthDao ornamentFree(List<ResourceModel> resourceModels, List<ResourceModel> sacrificeLogResources) {
      if (!this.player.isSystemOpen(1990)) {
         return null;
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int dailyCount = (Integer)playerResetCustomCache.getDailyNum(17, 0);
         if ((float)(dailyCount + 1) > ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
            return null;
         } else {
            WarNorthPart warNorthPart = (WarNorthPart)this.player.getMgrPart(WarNorthPart.class);
            WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
            int freeCount = ApplicationContextProvider.getConfigInt("sacrificeFreeNum", 0);
            if (warNorthDao.sacrificeFreeCount >= freeCount) {
               return null;
            } else {
               WarNorthDao warNorthParam = new WarNorthDao();
               warNorthParam.sacrificeFreeCount = warNorthDao.sacrificeFreeCount;
               warNorthParam.sacrificeCount = warNorthDao.sacrificeCount;
               warNorthParam.sacrificePoint = warNorthDao.sacrificePoint;

               for(warNorthParam.firstGot = warNorthDao.firstGot; warNorthParam.sacrificeFreeCount < freeCount; ++warNorthParam.sacrificeFreeCount) {
                  SacrificeModel sacrificeModel = (SacrificeModel)ApplicationContextProvider.getModelPoolEntity("sacrifice", 1);
                  if (sacrificeModel != null) {
                     List<ResourceModel> prizeList = new ArrayList();
                     warNorthParam.sacrificeCount = warNorthPart.sacrifice(prizeList, sacrificeModel, warNorthParam.sacrificeCount, warNorthParam.firstGot);
                     warNorthParam.sacrificePoint += sacrificeModel.getExReward();
                     sacrificeLogResources.addAll(prizeList);
                     resourceModels.addAll(prizeList);
                     resourceModels.addAll(sacrificeModel.getRewards());
                  }
               }

               return warNorthParam;
            }
         }
      }
   }

   private void ornamentAfterReward(WarNorthDao warNorthParam, List<ResourceModel> sacrificeLogResources) {
      if (warNorthParam != null) {
         WarNorthDao warNorthDao = (WarNorthDao)this.player.getData("tb_war_north", this.player.getPlayerId());
         int useFree = warNorthParam.sacrificeFreeCount - warNorthDao.sacrificeFreeCount;
         if (useFree > 0) {
            warNorthDao.sacrificePoint = warNorthParam.sacrificePoint;
            warNorthDao.sacrificeCount = warNorthParam.sacrificeCount;
            warNorthDao.sacrificeFreeCount = warNorthParam.sacrificeFreeCount;
            warNorthDao.firstGot = true;
            warNorthDao.updateOp();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            playerResetCustomCache.addDailyReset(17, 1);
            this.player.triggerTask(359, 0, (long)useFree, 1);
            WarNorthMgr warNorthMgr = (WarNorthMgr)ApplicationContextProvider.getContext().getBean(WarNorthMgr.class);
            PlayerDao playerDao = this.player.getPlayerDao();
            warNorthMgr.pushTask(() -> warNorthMgr.addSacrificeRecords(sacrificeLogResources, playerDao.playerId, playerDao.playerName));
            WarNorthMsg.S2C_WarNorthDoSacrifice_11014.Builder resp = WarNorthMsg.S2C_WarNorthDoSacrifice_11014.newBuilder();
            resp.setType(1);
            resp.setSacrificeCount(warNorthDao.sacrificeCount);
            resp.setDailySacrificeCount((Integer)playerResetCustomCache.getDailyNum(17, 0));
            this.player.sendMsg(resp.build());
         }
      }
   }

   private FormationGemModel runeStoneFree(List<ResourceModel> resourceModels) {
      if (!this.player.isSystemOpen(2070)) {
         return null;
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int lastNum = (Integer)playerResetCustomCache.getDailyNum(19, 0);
         if ((float)(lastNum + 1) > ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
            return null;
         } else {
            FormationGemGetModel model = (FormationGemGetModel)this.player.getGameModelPool().getEntity("formationGemGet", 1);
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            if (playerExtend.runeStone > 0) {
               return null;
            } else {
               RuneStonePart runeStonePart = (RuneStonePart)this.player.getMgrPart(RuneStonePart.class);
               FormationGemModel gemModel = runeStonePart.getGemModel(model);
               if (Objects.isNull(gemModel)) {
                  return null;
               } else {
                  resourceModels.add(new ResourceModel(2, gemModel.getId(), 1));
                  return gemModel;
               }
            }
         }
      }
   }

   private void runeStoneAfterReward(FormationGemModel gemModel) {
      if (gemModel != null) {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         playerExtend.runeStone = 1;
         this.player.updatePlayerExtend(13);
         this.player.notifyPlayerData(PlayerDefine.PLAYER_RUNE_STONE, 1);
         if (gemModel.getQuality() == 5) {
            PlayerDao playerDao = this.player.getPlayerDao();
            List<ResourceModel> sacrificeLogResources = new ArrayList();
            sacrificeLogResources.add(new ResourceModel(2, gemModel.getId(), 1));
            RuneStoneMgr runeStoneMgr = (RuneStoneMgr)ApplicationContextProvider.getContext().getBean(RuneStoneMgr.class);
            runeStoneMgr.pushTaskEx("addRuneRecords", new Object[]{sacrificeLogResources, playerDao.playerId, playerDao.playerName});
         }

         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         playerResetCustomCache.addDailyReset(19, 1);
         RuneStoneMsg.S2C_RuneStoneRecruitment_5410.Builder builder = RuneStoneMsg.S2C_RuneStoneRecruitment_5410.newBuilder();
         builder.setType(1);
         builder.setRecruitNum((Integer)playerResetCustomCache.getDailyNum(19, 0));
         this.player.sendMsg(builder.build());
      }
   }

   private WarHorseDao warHorseFree(List<ResourceModel> resourceModels, List<ResourceModel> sacrificeLogResources) {
      if (!this.player.isSystemOpen(3002)) {
         return null;
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int dailyCount = (Integer)playerResetCustomCache.getDailyNum(18, 0);
         if ((float)(dailyCount + 1) > ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
            return null;
         } else {
            WarHorsePart warHorsePart = (WarHorsePart)this.player.getMgrPart(WarHorsePart.class);
            WarHorseDao warHorseDao = (WarHorseDao)this.player.getData("tb_war_horse", this.player.getPlayerId());
            int freeCount = ApplicationContextProvider.getConfigInt("warHorseFreeNum", 0);
            if (warHorseDao.sacrificeFreeCount >= freeCount) {
               return null;
            } else {
               WarHorseDao warHorseParam = new WarHorseDao();
               warHorseParam.sacrificeFreeCount = warHorseDao.sacrificeFreeCount;
               warHorseParam.sacrificeCount = warHorseDao.sacrificeCount;

               for(warHorseParam.sacrificePoint = warHorseDao.sacrificePoint; warHorseParam.sacrificeFreeCount < freeCount; ++warHorseParam.sacrificeFreeCount) {
                  WarHorseStableModel warHorseStableModel = (WarHorseStableModel)ApplicationContextProvider.getModelPoolEntity("warHorseStable", 1);
                  if (warHorseStableModel != null) {
                     List<ResourceModel> prizeList = new ArrayList();
                     warHorseParam.sacrificeCount = warHorsePart.sacrifice(prizeList, warHorseStableModel, warHorseParam.sacrificeCount);
                     warHorseParam.sacrificePoint += warHorseStableModel.getExReward();
                     sacrificeLogResources.addAll(prizeList);
                     resourceModels.addAll(prizeList);
                     resourceModels.addAll(warHorseStableModel.getRewards());
                  }
               }

               return warHorseParam;
            }
         }
      }
   }

   private void warHorseAfterReward(WarHorseDao warHorseParam, List<ResourceModel> sacrificeLogResources) {
      if (warHorseParam != null) {
         WarHorseDao warHorseDao = (WarHorseDao)this.player.getData("tb_war_horse", this.player.getPlayerId());
         int useFree = warHorseParam.sacrificeFreeCount - warHorseDao.sacrificeFreeCount;
         if (useFree > 0) {
            warHorseDao.sacrificePoint = warHorseParam.sacrificePoint;
            warHorseDao.sacrificeCount = warHorseParam.sacrificeCount;
            warHorseDao.sacrificeFreeCount = warHorseParam.sacrificeFreeCount;
            warHorseDao.updateOp();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            playerResetCustomCache.addDailyReset(18, 1);
            this.player.triggerTask(359, 0, (long)useFree, 1);
            WarHorseMgr warHorseMgr = (WarHorseMgr)ApplicationContextProvider.getContext().getBean(WarHorseMgr.class);
            PlayerDao playerDao = this.player.getPlayerDao();
            warHorseMgr.pushTask(() -> warHorseMgr.addSacrificeRecords(sacrificeLogResources, playerDao.playerId, playerDao.playerName));
            WarHorseMsg.S2C_DoSacrifice_13844.Builder builder = WarHorseMsg.S2C_DoSacrifice_13844.newBuilder();
            builder.setType(1);
            builder.setSacrificeCount(warHorseDao.sacrificeCount);
            builder.setDailySacrificeCount((Integer)playerResetCustomCache.getDailyNum(18, 0));
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void guanJiaOperate(int systemId) {
      this.allFreeReward(true);
   }
}
