package com.gzbz.gamePlayer.guanjia;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.BattleDao;
import com.gzbz.db.BattleTowerDao;
import com.gzbz.db.HouseKeeperDao;
import com.gzbz.db.MinePersonDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.TrailTowerDao;
import com.gzbz.db.UnderPalaceDao;
import com.gzbz.db.bean.HouseKeeperData;
import com.gzbz.db.bean.UnderPalaceData;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.Ladder.LadderPart;
import com.gzbz.gamePlayer.battle.BattleChapterPart;
import com.gzbz.gamePlayer.battle.BattleDailyPart;
import com.gzbz.gamePlayer.battle.BattleHeroTrainingPart;
import com.gzbz.gamePlayer.battle.BattlePart;
import com.gzbz.gamePlayer.battle.BattleTowerPart;
import com.gzbz.gamePlayer.battle.FairylandPart;
import com.gzbz.gamePlayer.battle.TrailTowerPart;
import com.gzbz.gamePlayer.battle.UnderPalacePart;
import com.gzbz.gamePlayer.clickGold.ClickGoldPart;
import com.gzbz.gamePlayer.friend.FriendPart;
import com.gzbz.gamePlayer.heroPart.HeroRecruitmentPart;
import com.gzbz.gamePlayer.peak.PeakBattlePart;
import com.gzbz.gamePlayer.pvp.PvpPart;
import com.gzbz.mine.MineMgr;
import com.gzbz.mine.part.MinePart;
import com.gzbz.model.GuanJiaModel;
import com.gzbz.model.NormalBossModel;
import com.gzbz.model.UnderPalaceModel;
import com.gzbz.model.UnionBuffModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.GuanJiaMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.transport.part.WaterTransportPart;
import com.gzbz.treasureHouse.TreasureHousePart;
import com.gzbz.union.UnionMgr;
import com.gzbz.union.UnionMgrParent;
import com.gzbz.union.part.UnionCopyPart;
import com.gzbz.union.part.UnionDonatePart;
import com.gzbz.war.barbarian.BarbarianPart;
import com.gzbz.worldMgr.WorldBossMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class GuanJiaPart extends PlayerPart {
   public static final short TASK_COMPLETE = 1;
   private boolean isTasking = false;
   private Set<Integer> taskingList = new HashSet();
   private List<ResourceModel> rewardList = new ArrayList();
   private AtomicInteger atomicTaskCount = new AtomicInteger(0);
   private Set<Integer> tasksOfDay = new HashSet();
   private ScheduledFuture<?> taskScheduled;
   private final Queue<GuanJiaMsg.CellInfo> taskQueue = new LinkedList();
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   private WorldBossMgr worldBossMgr;

   public void levelUp(int preLv, int newLv) {
      this.checkTaskStart();
   }

   @MsgHandlerAnno
   public void C2S_GuanJiaInfo_16601(GuanJiaMsg.C2S_GuanJiaInfo_16601 msg, String source) {
      this.sendGuanJinInfo();
   }

   @MsgHandlerAnno
   public void C2S_SelectSystem_16603(GuanJiaMsg.C2S_SelectSystem_16603 msg, String source) {
      this.taskingList.clear();
      List<GuanJiaMsg.CellInfo> taskList = new ArrayList();
      HouseKeeperDao houseKeeperDao = (HouseKeeperDao)this.player.getData("tb_house_keeper", this.player.getPlayerId());
      Set<Integer> tempSet = new HashSet();

      for(GuanJiaMsg.CellInfo cellInfo : msg.getCellInfoList()) {
         if (!tempSet.contains(cellInfo.getId())) {
            HouseKeeperData houseKeeperData = (HouseKeeperData)houseKeeperDao.houseKeeperDatas.get(cellInfo.getId());
            if (houseKeeperData != null && houseKeeperData.state != 1) {
               tempSet.add(cellInfo.getId());
               this.taskingList.add(cellInfo.getId());
               taskList.add(cellInfo);
               houseKeeperData.options.clear();
               houseKeeperData.options.addAll(cellInfo.getMisc1List());
               houseKeeperData.isActive = true;
               houseKeeperData.setIsMark(true);
            }
         }
      }

      if (0 == taskList.size()) {
         this.logger.info("专属管家 - 所选任务都已经完成 playerId:{}", this.player.getPlayerId());
      } else {
         this.atomicTaskCount.set(taskList.size());
         this.isTasking = true;
         this.taskQueue.clear();
         this.taskQueue.addAll(taskList);
         this.cancelTaskScheduled();
         this.taskScheduled = this.scheduleEx(0L, 150L, "scheduleFunc", new Object[0]);
      }
   }

   @MsgHandlerAnno
   public void C2S_CompleteInfo_16609(GuanJiaMsg.C2S_CompleteInfo_16609 msg, String source) {
      HouseKeeperDao houseKeeperDao = (HouseKeeperDao)this.player.getData("tb_house_keeper", this.player.getPlayerId());
      GuanJiaMsg.S2C_CompleteInfo_16610.Builder builder = GuanJiaMsg.S2C_CompleteInfo_16610.newBuilder();

      for(Map.Entry<Integer, HouseKeeperData> entry : houseKeeperDao.houseKeeperDatas.entrySet()) {
         HouseKeeperData houseKeeperData = (HouseKeeperData)entry.getValue();
         if (houseKeeperData.isActive && houseKeeperData.state == 1) {
            GuanJiaMsg.CompleteInfo.Builder completeInfo = GuanJiaMsg.CompleteInfo.newBuilder();
            completeInfo.setId((Integer)entry.getKey());
            completeInfo.setHurtValue(houseKeeperData.hurtValue);

            for(ResourceModel reward : houseKeeperData.rewards) {
               completeInfo.addRewards(reward.builder());
            }

            builder.addInfo(completeInfo);
         }
      }

      this.player.sendMsg(builder.build());
   }

   private void sendTaskReward() {
      this.atomicTaskCount.set(0);
      this.isTasking = false;
      this.rewardList.clear();
      this.taskingList.clear();
   }

   public void sendGuanJinInfo() {
      if (!this.player.isSystemOpen(3580)) {
         this.player.failure(21);
      } else {
         GuanJiaMsg.S2C_GuanJiaInfo_16602.Builder builder = GuanJiaMsg.S2C_GuanJiaInfo_16602.newBuilder();
         List<GuanJiaMsg.CellInfo> taskInfo = this.getTaskInfo();

         for(GuanJiaMsg.CellInfo cellInfo : taskInfo) {
            this.tasksOfDay.add(cellInfo.getId());
         }

         builder.addAllCellInfo(taskInfo);
         this.player.sendMsg(builder.build());
      }
   }

   private List<GuanJiaMsg.CellInfo> getTaskInfo() {
      int openServerDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;
      int playerLv = this.player.getPublicDao().lv;
      List<GuanJiaMsg.CellInfo> cellInfoList = new ArrayList();
      Map<Integer, GuanJiaModel> modelMap = ApplicationContextProvider.<Integer, GuanJiaModel>getModelPoolMap("spGuanJia");

      for(Map.Entry<Integer, GuanJiaModel> entry : modelMap.entrySet()) {
         GuanJiaModel model = (GuanJiaModel)entry.getValue();
         if (this.player.isSystemOpen(model.getId()) && playerLv >= model.getShowLvRequest() && openServerDay >= model.getShowDaysRequest() && this.preCondition(model.getId())) {
            HouseKeeperData houseKeeperData = this.getHouseKeeperData(model.getId());
            if (houseKeeperData.state != 1 || houseKeeperData.isActive) {
               GuanJiaMsg.CellInfo.Builder cellInfo = GuanJiaMsg.CellInfo.newBuilder();
               cellInfo.setId(model.getId());
               cellInfo.addAllMisc1(houseKeeperData.options);
               cellInfo.setCount("");
               cellInfo.setState(houseKeeperData.state);
               cellInfo.setMark(houseKeeperData.isMark ? 1 : 0);
               cellInfoList.add(cellInfo.build());
            }
         }
      }

      return cellInfoList;
   }

   private boolean preCondition(int systemId) {
      if (systemId == 2001) {
         MineMgr mineMgr = (MineMgr)ApplicationContextProvider.getContext().getBean(MineMgr.class);
         MinePersonDao minePersonDao = (MinePersonDao)mineMgr.getGameCachePool().getData("tb_mine_person", new Object[]{this.player.getPlayerId()});
         return minePersonDao.having;
      } else if (systemId == 2130) {
         int trialToweClock = ApplicationContextProvider.getConfigInt("trialToweClock", 400);
         BattleTowerDao battleTowerDao = (BattleTowerDao)this.player.getData("tb_battle_tower", this.player.getPlayerId());
         if (battleTowerDao.towerId >= trialToweClock) {
            TrailTowerDao towerDao = (TrailTowerDao)this.player.getData("tb_trail_tower", this.player.getPlayerId());
            return towerDao.totalStar > 0;
         } else {
            return false;
         }
      } else if (systemId == 1980) {
         BarbarianPart barbarianPart = (BarbarianPart)this.player.getMgrPart(BarbarianPart.class);
         if (this.player.isSystemOpen(1980) && barbarianPart.isNeedSysOpen()) {
            int openBossId = this.worldBossMgr.getOpenBoss();
            if (openBossId <= 0) {
               return false;
            } else {
               NormalBossModel normalBossModel = (NormalBossModel)ApplicationContextProvider.getModelPoolEntity("normalBoss", openBossId);
               return this.worldBossMgr.isOpen(normalBossModel.getBossType());
            }
         } else {
            return false;
         }
      } else {
         if (systemId == 3013) {
            if (DateUtil.isDayOfWeek(1) && DateUtil.cHour() >= 23) {
               return false;
            }
         } else if (systemId == 2880) {
            UnderPalaceDao dao = (UnderPalaceDao)this.player.getData("tb_player_under_Palace", this.player.getPlayerId());
            if (!dao.palaceInfo.containsKey(1)) {
               return false;
            }

            UnderPalaceModel model = (UnderPalaceModel)this.player.getGameModelPool().getEntity("underPalace", ((UnderPalaceData)dao.palaceInfo.get(1)).stageId);
            if (model == null || model.getStageNum() == 1) {
               return false;
            }
         } else if (systemId == 1471 || systemId == 1460 || systemId == 1470) {
            PlayerPublicDao playerPublicDao = this.player.getPublicDao();
            if (playerPublicDao.unionId <= 0) {
               return false;
            }

            UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
            UnionMgr unionMgr = unionMgrParent.getUnionMgr(playerPublicDao.unionId);
            if (unionMgr == null) {
               return false;
            }

            if (systemId == 1471) {
               if (unionMgr.getUnion().finishActivate) {
                  return false;
               }

               UnionBuffModel buffModel = (UnionBuffModel)ApplicationContextProvider.getModelPoolEntity("unionBuff", unionMgr.getUnion().copyBuffLv);
               if (buffModel == null) {
                  return false;
               }

               if (unionMgr.getUnion().copyBuffTime < System.currentTimeMillis()) {
                  return true;
               }

               UnionBuffModel nextBuffModel = (UnionBuffModel)ApplicationContextProvider.getModelPoolEntity("unionBuff", unionMgr.getUnion().copyBuffLv + 1);
               return nextBuffModel != null;
            }
         }

         return true;
      }
   }

   public void checkState(int systemId, List<ResourceModel> rewards) {
      Map<Integer, GuanJiaModel> modelMap = ApplicationContextProvider.<Integer, GuanJiaModel>getModelPoolMap("spGuanJia");
      if (modelMap.containsKey(systemId)) {
         HouseKeeperDao houseKeeperDao = (HouseKeeperDao)this.player.getData("tb_house_keeper", this.player.getPlayerId());
         HouseKeeperData houseKeeperData = this.getHouseKeeperData(systemId);
         houseKeeperData.state = 1;
         houseKeeperDao.updateOp();
         if (this.isTasking) {
            if (!CollectionUtils.isEmpty(rewards)) {
               this.rewardList.addAll(rewards);

               for(ResourceModel reward : rewards) {
                  if (reward.getType() != 3) {
                     ResourceModel.addResourceToList(houseKeeperData.rewards, reward);
                  } else {
                     houseKeeperData.rewards.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
                  }
               }
            }

            if (this.taskingList.contains(systemId)) {
               GuanJiaMsg.S2C_Complete_16608.Builder builder = GuanJiaMsg.S2C_Complete_16608.newBuilder();
               GuanJiaMsg.CompleteInfo.Builder completeInfo = GuanJiaMsg.CompleteInfo.newBuilder();
               completeInfo.setId(systemId);
               completeInfo.setHurtValue(houseKeeperData.hurtValue);

               for(ResourceModel reward : houseKeeperData.rewards) {
                  completeInfo.addRewards(reward.builder());
               }

               builder.setInfo(completeInfo.build());
               this.player.sendMsg(builder.build());
               this.taskingList.remove(systemId);
               if (this.atomicTaskCount.decrementAndGet() == 0) {
                  this.sendTaskReward();
               }
            }
         }

      }
   }

   public void checkTaskStart() {
      if (this.player.isSystemOpen(3580)) {
         boolean bChange = false;
         List<GuanJiaMsg.CellInfo> taskInfo = this.getTaskInfo();

         for(GuanJiaMsg.CellInfo cellInfo : taskInfo) {
            if (!this.tasksOfDay.contains(cellInfo.getId())) {
               bChange = true;
               this.tasksOfDay.add(cellInfo.getId());
            }
         }

         if (bChange) {
            GuanJiaMsg.S2C_GuanJiaInfo_16602.Builder builder = GuanJiaMsg.S2C_GuanJiaInfo_16602.newBuilder();
            builder.addAllCellInfo(taskInfo);
            this.player.sendMsg(builder.build());
         }

      }
   }

   public void loginHandle() {
      this.isTasking = false;
      this.rewardList.clear();
   }

   public void resetDaily() {
      this.isTasking = false;
      this.rewardList.clear();
      HouseKeeperDao houseKeeperDao = (HouseKeeperDao)this.player.getData("tb_house_keeper", this.player.getPlayerId());

      for(HouseKeeperData houseKeeperData : houseKeeperDao.houseKeeperDatas.values()) {
         houseKeeperData.reset();
      }

      houseKeeperDao.updateOp();
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      BattleDao battleDao = battlePart.getBattleDao(1250);
      if (battleDao != null) {
         this.checkState(1250, (List)null);
      }

   }

   public void gmTest(String string) {
      String[] orders = string.split(",");
      switch (orders[0]) {
         case "clearmark":
            this.gmClearMark(Integer.parseInt(orders[1]));
            break;
         case "clearmisc":
            this.gmClearMisc();
      }

   }

   private void dailyBattle(int systemId, String strOption) {
      String[] optionArr = strOption.split("\\|");
      List<Integer> optionList = new ArrayList();

      for(String type : optionArr) {
         optionList.add(Integer.parseInt(type));
      }

      if (optionList.size() <= 1 || !optionList.contains(0) && !optionList.contains(-1)) {
         BattleDailyPart battleDailyPart = (BattleDailyPart)this.player.getMgrPart(BattleDailyPart.class);
         battleDailyPart.guanJiaOperate(systemId, optionList);
      } else {
         this.checkState(systemId, (List)null);
      }
   }

   private HouseKeeperData getHouseKeeperData(int systemId) {
      HouseKeeperDao houseKeeperDao = (HouseKeeperDao)this.player.getData("tb_house_keeper", this.player.getPlayerId());
      HouseKeeperData houseKeeperData = (HouseKeeperData)houseKeeperDao.houseKeeperDatas.get(systemId);
      if (houseKeeperData == null) {
         houseKeeperData = new HouseKeeperData();
         houseKeeperData.systemId = systemId;
         houseKeeperDao.houseKeeperDatas.put(systemId, houseKeeperData);
         houseKeeperDao.updateOp();
      }

      return houseKeeperData;
   }

   public void gmClearMark(int systemId) {
      HouseKeeperDao houseKeeperDao = (HouseKeeperDao)this.player.getData("tb_house_keeper", this.player.getPlayerId());
      if (systemId == 0) {
         for(HouseKeeperData houseKeeperData : houseKeeperDao.houseKeeperDatas.values()) {
            houseKeeperData.setIsMark(false);
         }
      } else {
         HouseKeeperData houseKeeperData = (HouseKeeperData)houseKeeperDao.houseKeeperDatas.get(systemId);
         if (houseKeeperData != null) {
            houseKeeperData.setIsMark(false);
         }
      }

      houseKeeperDao.updateOp();
      this.sendGuanJinInfo();
   }

   public void gmClearMisc() {
      HouseKeeperDao houseKeeperDao = (HouseKeeperDao)this.player.getData("tb_house_keeper", this.player.getPlayerId());

      for(HouseKeeperData houseKeeperData : houseKeeperDao.houseKeeperDatas.values()) {
         houseKeeperData.options.clear();
      }

      houseKeeperDao.updateOp();
      this.sendGuanJinInfo();
   }

   public void cancelTaskScheduled() {
      if (this.taskScheduled != null) {
         this.taskScheduled.cancel(false);
         this.taskScheduled = null;
      }

   }

   @TaskMethod
   public void scheduleFunc() {
      GuanJiaMsg.CellInfo cellInfo = (GuanJiaMsg.CellInfo)this.taskQueue.poll();
      if (cellInfo == null) {
         this.cancelTaskScheduled();
      } else {
         this.executeTask(cellInfo);
      }
   }

   private void executeTask(GuanJiaMsg.CellInfo cellInfo) {
      int systemId = cellInfo.getId();
      GuanJiaModel model = (GuanJiaModel)ApplicationContextProvider.getModelPoolEntity("spGuanJia", systemId);
      if (model != null) {
         if (systemId == 1460) {
            UnionDonatePart unionDonatePart = (UnionDonatePart)this.player.getMgrPart(UnionDonatePart.class);
            unionDonatePart.pushTaskEx("guanJiaOperate", new Object[]{systemId, Integer.parseInt(cellInfo.getCount())});
         } else if (systemId == 1470) {
            UnionCopyPart unionCopyPart = (UnionCopyPart)this.player.getMgrPart(UnionCopyPart.class);
            unionCopyPart.pushTaskEx("guanJiaOperate", new Object[]{systemId, Integer.parseInt(cellInfo.getCount())});
         } else if (systemId == 1471) {
            UnionCopyPart unionCopyPart = (UnionCopyPart)this.player.getMgrPart(UnionCopyPart.class);
            unionCopyPart.guanJiaOperateBuff(systemId, Integer.parseInt(cellInfo.getCount()));
         } else {
            try {
               switch (systemId) {
                  case 1012:
                     ClickGoldPart clickGoldPart = (ClickGoldPart)this.player.getMgrPart(ClickGoldPart.class);
                     clickGoldPart.guanJiaOperate(systemId, Integer.parseInt(cellInfo.getCount()));
                     break;
                  case 1020:
                     FriendPart friendPart = (FriendPart)this.player.getMgrPart(FriendPart.class);
                     friendPart.guanJiaOperate(systemId);
                     break;
                  case 1110:
                     PvpPart pvpPart = (PvpPart)this.player.getMgrPart(PvpPart.class);
                     pvpPart.guanJiaOperate(systemId);
                     break;
                  case 1111:
                     PvpPart pvpPart1 = (PvpPart)this.player.getMgrPart(PvpPart.class);
                     pvpPart1.guanJiaOperateThumbsUp(systemId);
                     break;
                  case 1130:
                     BattleTowerPart battleTowerPart = (BattleTowerPart)this.player.getMgrPart(BattleTowerPart.class);
                     battleTowerPart.guanJiaOperate(systemId, Integer.parseInt(cellInfo.getCount()));
                     break;
                  case 1191:
                     TreasureHousePart treasureHousePart = (TreasureHousePart)this.player.getMgrPart(TreasureHousePart.class);
                     treasureHousePart.guanJiaOperate(systemId);
                     break;
                  case 1240:
                     this.dailyBattle(systemId, cellInfo.getCount());
                     break;
                  case 1250:
                     BattleHeroTrainingPart battleHeroTrainingPart = (BattleHeroTrainingPart)this.player.getMgrPart(BattleHeroTrainingPart.class);
                     battleHeroTrainingPart.guanJiaOperate(systemId);
                     break;
                  case 1640:
                     HeroRecruitmentPart heroRecruitmentPart = (HeroRecruitmentPart)this.player.getMgrPart(HeroRecruitmentPart.class);
                     heroRecruitmentPart.guanJiaOperate(systemId, Integer.parseInt(cellInfo.getCount()));
                     break;
                  case 1980:
                     BarbarianPart barbarianPart = (BarbarianPart)this.player.getMgrPart(BarbarianPart.class);
                     barbarianPart.guanJiaOperate(systemId, Integer.parseInt(cellInfo.getCount()));
                     break;
                  case 1994:
                     WaterTransportPart waterTransportPart = (WaterTransportPart)this.player.getMgrPart(WaterTransportPart.class);
                     waterTransportPart.guanJiaOperate(systemId, Integer.parseInt(cellInfo.getCount()));
                     break;
                  case 2001:
                     MinePart minePart = (MinePart)this.player.getMgrPart(MinePart.class);
                     minePart.guanJiaOperate(systemId);
                     break;
                  case 2011:
                     LadderPart ladderPart = (LadderPart)this.player.getMgrPart(LadderPart.class);
                     ladderPart.guanJiaOperate(systemId);
                     break;
                  case 2043:
                     PeakBattlePart peakBattlePart = (PeakBattlePart)this.player.getMgrPart(PeakBattlePart.class);
                     peakBattlePart.guanJiaOperate(systemId);
                     break;
                  case 2092:
                     BattleChapterPart battleChapterPart = (BattleChapterPart)this.player.getMgrPart(BattleChapterPart.class);
                     battleChapterPart.guanJiaOperate(systemId, Integer.parseInt(cellInfo.getCount()));
                     break;
                  case 2130:
                     TrailTowerPart trailTowerPart = (TrailTowerPart)this.player.getMgrPart(TrailTowerPart.class);
                     trailTowerPart.guanJiaOperate(systemId, Integer.parseInt(cellInfo.getCount()));
                     break;
                  case 2880:
                     UnderPalacePart underPalacePart = (UnderPalacePart)this.player.getMgrPart(UnderPalacePart.class);
                     underPalacePart.guanJiaOperate(systemId);
                     break;
                  case 3012:
                     FairylandPart fairylandExplore = (FairylandPart)this.player.getMgrPart(FairylandPart.class);
                     fairylandExplore.guanJiaOperateExplore(systemId, Integer.parseInt(cellInfo.getCount()));
                     break;
                  case 3013:
                     FairylandPart fairylandPart = (FairylandPart)this.player.getMgrPart(FairylandPart.class);
                     fairylandPart.guanJiaOperate(systemId);
               }
            } catch (Exception var22) {
               this.checkState(systemId, (List)null);
            }
         }

      }
   }
}
