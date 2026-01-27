package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityComeBackDao;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRecruitmentPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.ChapterModel;
import com.gzbz.model.ComeBackActivityChargeGetModel;
import com.gzbz.model.ComeBackActivityFirstChargeModel;
import com.gzbz.model.ComeBackActivityReturnModel;
import com.gzbz.model.ComeBackActivitySignModel;
import com.gzbz.model.ComeBackActivityTaskBoxModel;
import com.gzbz.model.ComeBackActivityTaskModel;
import com.gzbz.model.ComeBackActivityTenDrawModel;
import com.gzbz.model.HeroEmployeeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ActivityComeBackMsg;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityComeBackTaskPart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import misc.MapUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityComeBackPart extends AbstractActivityPart {
   @Autowired
   ConfigManager configManager;

   public void sendInfo() {
      this.sendActivityInfo();
   }

   public int getActivityType() {
      return 90;
   }

   public void loginHandle() {
      ActivityComeBackDao dao = this.getDao();
      dao.lastCalTime = System.currentTimeMillis();
      dao.loginState = 1;
      dao.updateOp();
   }

   public void logout() {
      ActivityComeBackDao dao = this.getDao();
      dao.loginState = 0;
      dao.updateOp();
   }

   public void rotateReset(int oldActivityId) {
      ActivityComeBackDao dao = this.getDao();
      dao.firstChargeReceiveIds.clear();
      dao.chargeReturnReceiveIds.clear();
      dao.signReceiveIds.clear();
      dao.power = 0;
      dao.powerReceiveIds.clear();
      dao.actTotalOnlineTime = 0L;
      dao.tenDrawUseIds.clear();
      dao.returnDrawTimes = 0;
      dao.returnGoldRecord.clear();
      dao.updateOp();
      this.initPrayTask();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (DateUtil.isSameDay(playerDao.updateTime)) {
         this.initPrayTask();
      }

      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      this.clearActItemAndReturnReward();
   }

   public void activityEnd(int oldActivityId) {
      this.clearActItemAndReturnReward();
   }

   public void clearActItemAndReturnReward() {
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", 75001);
      if (null == itemModel) {
         this.logger.error("item表找不到道具配置 id:{}", 75001);
      } else {
         List<Integer> sell = itemModel.getSell();
         if (sell.size() < 3) {
            this.logger.error("item表配置的sell字段有问题 id:{}", 75001);
         } else {
            Integer resourceType = (Integer)sell.get(0);
            Integer resourceId = (Integer)sell.get(1);
            Integer num = (Integer)sell.get(2);
            long resourceNum = this.player.getResourceNum(2, 75001);
            if (resourceNum > 0L) {
               List<ResourceModel> returnRewardList = new ArrayList();

               for(long i = resourceNum; i > 0L; --i) {
                  ResourceModel returnReward = new ResourceModel(resourceType, resourceId, num);
                  ResourceModel.addResourceToList(returnRewardList, returnReward);
               }

               this.player.delResourceAllNum(2, 75001, 108, 10810, 0, 0, "");
               this.player.addResource(returnRewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 108, 10811, 0, 0, "");
            }
         }
      }
   }

   public void resetDaily() {
   }

   public ActivityComeBackDao getDao() {
      ActivityComeBackDao dao = (ActivityComeBackDao)this.player.getData("tb_activity_come_back", this.player.getPlayerId());
      return dao;
   }

   public void playerActRegHandle() {
      List<ResourceModel> allResource = new ArrayList();
      int comeBackActRegAddLv = this.configManager.getIntDefault("comeBackActRegAddLv", 4);
      PlayerDao playerDao = this.player.getPlayerDao();
      int destLv = playerDao.lv + comeBackActRegAddLv;
      long totalExp = (long)(-playerDao.exp);
      int upgradeGold = 0;
      Map<Integer, UpgradeModel> map = ApplicationContextProvider.<Integer, UpgradeModel>getModelPoolMap("upgrade");
      UpgradeModel upgradeModel = (UpgradeModel)map.get(playerDao.lv);
      if (upgradeModel != null) {
         do {
            upgradeGold += upgradeModel.getLevelUpReward();
            totalExp += (long)upgradeModel.getPlayerExp();
            upgradeModel = (UpgradeModel)map.get(upgradeModel.getLevel() + 1);
         } while(upgradeModel != null && upgradeModel.getLevel() < destLv);

         if (totalExp > 0L) {
            this.player.modifyProperty(PlayerDefine.PLAYER_EXP, (long)((int)totalExp), 108, 10808, 0, 0, "", true);
         }

         allResource.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, upgradeGold));
      }

      int comeBackActPassChapter = this.configManager.getIntDefault("comeBackActPassChapter", 5);
      BattleChapterDao chapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      ChapterModel chapterModel = (ChapterModel)ApplicationContextProvider.getModelPoolEntity("chapter", comeBackActPassChapter);
      if (chapterModel != null) {
         chapterDao.chapterId = comeBackActPassChapter;
         chapterDao.updateOp();
         this.player.triggerTask(401, 0, (long)comeBackActPassChapter, 0);
         this.player.notifyPlayerData(PlayerDefine.PLAYER_CHAPTER_ID, comeBackActPassChapter);
         RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
         rankMgr.pushTask(() -> rankMgr.checkRankReward(this.player.getPlayerId(), 1, (long)comeBackActPassChapter));
      }

      for(int i = comeBackActPassChapter; i > 0; --i) {
         ChapterModel tempChapterModel = (ChapterModel)ApplicationContextProvider.getModelPoolEntity("chapter", i);
         if (null != tempChapterModel) {
            for(ResourceModel passAward : tempChapterModel.getPassAwards()) {
               ResourceModel.addResourceToList(allResource, passAward);
            }
         }
      }

      String comeBackActGetHero = this.configManager.getStrByDefault("comeBackActGetHero", "23403:1:1|23503:2:1|23404:0:0");
      String[] heroId_position_addStrArr = comeBackActGetHero.split("\\|");
      if (null != heroId_position_addStrArr && heroId_position_addStrArr.length > 0) {
         List<ResourceModel> heroResourceList = new ArrayList();
         Map<Integer, Integer> heroId_positionMap = new HashMap();

         for(String heroId_position_addStr : heroId_position_addStrArr) {
            String[] heroId_position_addArr = heroId_position_addStr.split(":");
            int heroId = Integer.parseInt(heroId_position_addArr[0]);
            int position = Integer.parseInt(heroId_position_addArr[1]);
            int isAdd = Integer.parseInt(heroId_position_addArr[2]);
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
            if (null == heroModel) {
               this.logger.error("comeBackActGetHero 配置错误，未找到对应英雄 heroId:{}", heroId);
            } else {
               heroId_positionMap.put(heroId, position);
               if (isAdd != 0) {
                  heroResourceList.add(new ResourceModel(3, heroId, 1));
               }
            }
         }

         this.player.addResource(heroResourceList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 108, 10808, 0, 0, "");
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         playerResetCustomCache.addDailyReset(101, 1);
         playerResetCustomCache.setDailyReset(103, (int)(System.currentTimeMillis() / 1000L));
         playerExtend.completedCommonRecruitmentGuide();
         playerResetCustomCache.addDailyReset(102, 1);
         playerResetCustomCache.setDailyReset(104, (int)(System.currentTimeMillis() / 1000L));
         playerExtend.completedProfessionalRecruitmentGuide();
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         List<HeroMsg.ArrayingInfo> heroArrayingList = new ArrayList();

         for(Map.Entry<Integer, Integer> entry : heroId_positionMap.entrySet()) {
            int heroId = (Integer)entry.getKey();
            int position = (Integer)entry.getValue();
            List<HeroDao> heroDaoList = heroBagPart.getHeroById(heroId);
            if (null != heroDaoList && heroDaoList.size() > 0) {
               HeroDao heroDao = (HeroDao)heroDaoList.get(0);
               HeroMsg.ArrayingInfo.Builder arrayingInfoBuilder = HeroMsg.ArrayingInfo.newBuilder();
               arrayingInfoBuilder.setPosition(position);
               arrayingInfoBuilder.setCodeType(CommonMsg.CodeType.CODE_HERO);
               arrayingInfoBuilder.setCode(heroDao.code);
               arrayingInfoBuilder.setState(0);
               heroArrayingList.add(arrayingInfoBuilder.build());
            } else {
               this.logger.error("英雄没有添加成功 heroId:{}", heroId);
            }
         }

         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         heroArrayingPart.saveHeroArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING, heroArrayingList);
      }

      this.player.addResource(allResource, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 108, 10808, 0, 0, "");
   }

   public void activityRecharge(int money) {
      this.calcAndReturnAddMoney(money);
      this.sendActivityInfo();
   }

   public int getActivityRecharge() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      return (Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, this.getActivityType(), 0);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_21201(ActivityComeBackMsg.C2S_ActivityInfo_21201 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      ActivityComeBackMsg.S2C_ActivityInfo_21202.Builder builder = ActivityComeBackMsg.S2C_ActivityInfo_21202.newBuilder();
      ActivityComeBackDao dao = this.getDao();
      int severActivityDay = this.getSeverActivityDay();
      builder.setServerActivityDay(severActivityDay);
      builder.setChargeAccount(this.getActivityRecharge());
      builder.addAllFirstChargeReceiveIds(dao.firstChargeReceiveIds);
      builder.addAllChargeReturnReceiveIds(dao.chargeReturnReceiveIds);
      builder.addAllSignReceiveIds(dao.signReceiveIds);
      builder.setPower(dao.power);
      builder.addAllPowerReceiveIds(dao.powerReceiveIds);
      builder.setActTotalOnlineTime(this.getActTotalOnlineSecond());
      builder.addAllTenDrawUseIds(dao.tenDrawUseIds);
      builder.setNextTenDrawCountDown(this.getNextTenDrawCountDown());
      ActivityComeBackTaskPart taskPart = (ActivityComeBackTaskPart)this.player.getMgrPart(ActivityComeBackTaskPart.class);

      for(TaskData taskData : taskPart.getTasksMap().values()) {
         ComeBackActivityTaskModel taskModel = (ComeBackActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityTask", taskData.id);
         if (null != taskModel && (taskModel.getType() != 1 || severActivityDay >= taskModel.getDay())) {
            ActivityMsg.TaskData task = taskPart.buildTask(taskData);
            if (task != null) {
               builder.addTask(task);
            }
         }
      }

      builder.setReturnDrawTimes(dao.returnDrawTimes);

      for(Map.Entry<Integer, Integer> entry : dao.returnGoldRecord.entrySet()) {
         CommonMsg.MapDataII.Builder mapDataII = CommonMsg.MapDataII.newBuilder();
         mapDataII.setKey((Integer)entry.getKey());
         mapDataII.setValue((Integer)entry.getValue());
         builder.addReturnGoldRecord(mapDataII);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_FirstChargeReceive_21203(ActivityComeBackMsg.C2S_FirstChargeReceive_21203 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         ComeBackActivityFirstChargeModel firstChargeModel = (ComeBackActivityFirstChargeModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityFirstCharge", msg.getId());
         if (null == firstChargeModel) {
            this.logger.error("ComeBackActivityFirstCharge 缺少配置 id:{}", msg.getId());
            return this.player.failure(37);
         } else {
            ActivityComeBackDao dao = this.getDao();
            if (dao.firstChargeReceiveIds.contains(firstChargeModel.getId())) {
               return this.player.failure(76030);
            } else if (this.getActivityRecharge() < firstChargeModel.getChargeAcount()) {
               return this.player.failure(76031);
            } else {
               dao.firstChargeReceiveIds.add(firstChargeModel.getId());
               dao.updateOp();
               this.player.addResource(firstChargeModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 108, 10801, 0, 0, "");
               ActivityComeBackMsg.S2C_FirstChargeReceive_21204.Builder resp = ActivityComeBackMsg.S2C_FirstChargeReceive_21204.newBuilder();
               resp.addAllReceiveIds(dao.firstChargeReceiveIds);
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ChargeReturnReceive_21205(ActivityComeBackMsg.C2S_ChargeReturnReceive_21205 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         ComeBackActivityChargeGetModel chargeGetModel = (ComeBackActivityChargeGetModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityChargeGet", msg.getId());
         if (null == chargeGetModel) {
            this.logger.error("ComeBackActivityChargeGet 缺少配置 id:{}", msg.getId());
            return this.player.failure(37);
         } else {
            ActivityComeBackDao dao = this.getDao();
            if (dao.chargeReturnReceiveIds.contains(chargeGetModel.getId())) {
               return this.player.failure(76030);
            } else if (this.getActivityRecharge() < chargeGetModel.getChargeAcount()) {
               return this.player.failure(76031);
            } else {
               dao.chargeReturnReceiveIds.add(chargeGetModel.getId());
               dao.updateOp();
               this.player.addResource(chargeGetModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 108, 10802, 0, 0, "");
               ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.Builder resp = ActivityComeBackMsg.S2C_ChargeReturnReceive_21206.newBuilder();
               resp.addAllReceiveIds(dao.chargeReturnReceiveIds);
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_SignReceive_21207(ActivityComeBackMsg.C2S_SignReceive_21207 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         Set<Integer> thisSignReceiveIds = new HashSet();
         List<ResourceModel> signReward = new ArrayList();
         ActivityComeBackDao dao = this.getDao();
         int severActivityDay = this.getSeverActivityDay();
         Map<Integer, ComeBackActivitySignModel> signModelMap = ApplicationContextProvider.<Integer, ComeBackActivitySignModel>getModelPoolMap("comeBackActivitySign");

         for(Map.Entry<Integer, ComeBackActivitySignModel> entry : signModelMap.entrySet()) {
            ComeBackActivitySignModel model = (ComeBackActivitySignModel)entry.getValue();
            if (!dao.signReceiveIds.contains(model.getDay()) && severActivityDay >= model.getDay()) {
               thisSignReceiveIds.add(model.getDay());

               for(ResourceModel reward : model.getRewards()) {
                  ResourceModel.addResourceToList(signReward, reward);
               }
            }
         }

         if (thisSignReceiveIds.size() <= 0) {
            return this.player.failure(76031);
         } else {
            dao.signReceiveIds.addAll(thisSignReceiveIds);
            dao.updateOp();
            this.player.addResource(signReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 108, 10803, 0, 0, "");
            ActivityComeBackMsg.S2C_SignReceive_21208.Builder resp = ActivityComeBackMsg.S2C_SignReceive_21208.newBuilder();
            resp.addAllReceiveIds(dao.signReceiveIds);
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_PowerBoxReceive_21209(ActivityComeBackMsg.C2S_PowerBoxReceive_21209 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         ComeBackActivityTaskBoxModel taskBoxModel = (ComeBackActivityTaskBoxModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityTaskBox", msg.getId());
         if (null == taskBoxModel) {
            this.logger.error("ComeBackActivityTaskBox 缺少配置 id:{}", msg.getId());
            return this.player.failure(37);
         } else {
            ActivityComeBackDao dao = this.getDao();
            if (dao.powerReceiveIds.contains(taskBoxModel.getId())) {
               return this.player.failure(76030);
            } else if (dao.power < taskBoxModel.getPower()) {
               return this.player.failure(76031);
            } else {
               dao.powerReceiveIds.add(taskBoxModel.getId());
               dao.updateOp();
               this.player.addResource(taskBoxModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 108, 10804, 0, 0, "");
               ActivityComeBackMsg.S2C_PowerBoxReceive_21210.Builder resp = ActivityComeBackMsg.S2C_PowerBoxReceive_21210.newBuilder();
               resp.addAllReceiveIds(dao.powerReceiveIds);
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   public void S2C_PowerUpdate_21218() {
      ActivityComeBackDao dao = this.getDao();
      ActivityComeBackMsg.S2C_PowerUpdate_21218.Builder resp = ActivityComeBackMsg.S2C_PowerUpdate_21218.newBuilder();
      resp.setPower(dao.power);
      this.player.sendMsg(resp.build());
   }

   public void initPrayTask() {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_COME_BACK_ACT);
      ActivityComeBackTaskPart comeBackTaskPart = (ActivityComeBackTaskPart)this.player.getMgrPart(ActivityComeBackTaskPart.class);
      comeBackTaskPart.trigger();
   }

   @MsgHandlerAnno
   public boolean C2S_TenDraw_21213(ActivityComeBackMsg.C2S_TenDraw_21213 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         ComeBackActivityTenDrawModel canUseComeBackActivityTenDrawModel = this.getCanUseComeBackActivityTenDrawModel();
         if (null == canUseComeBackActivityTenDrawModel) {
            return this.player.failure(76031);
         } else {
            HeroRecruitmentPart heroRecruitmentPart = (HeroRecruitmentPart)this.player.getMgrPart(HeroRecruitmentPart.class);
            HeroEmployeeModel heroEmployeeModel = (HeroEmployeeModel)this.player.getGameModelPool().getEntity("heroEmployee", 9);
            List<HeroModel> heroModelList = heroRecruitmentPart.getHeroList(HeroMsg.RecruitmentType.INTEGRAL, HeroMsg.NumType.TEN_TIMES, 10, -1, heroEmployeeModel);
            if (null != heroModelList && !heroModelList.isEmpty()) {
               List<ResourceModel> heroResourceList = new ArrayList();
               List<Integer> heroIdList = new ArrayList();

               for(HeroModel heroModel : heroModelList) {
                  heroResourceList.add(new ResourceModel(3, heroModel.getId(), 1));
                  heroIdList.add(heroModel.getId());
               }

               this.player.addResource(heroResourceList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 108, 10806, 0, 0, "");
               ActivityComeBackDao dao = this.getDao();
               dao.tenDrawUseIds.add(canUseComeBackActivityTenDrawModel.getId());
               dao.updateOp();
               ActivityComeBackMsg.S2C_TenDraw_21214.Builder resp = ActivityComeBackMsg.S2C_TenDraw_21214.newBuilder();
               resp.addAllTenDrawUseIds(dao.tenDrawUseIds);
               resp.addAllHeroIds(heroIdList);
               this.player.sendMsg(resp.build());
               return true;
            } else {
               this.logger.error("回归活动十连抽 没有抽到一个英雄？？？");
               return this.player.failure(37);
            }
         }
      }
   }

   public long getNextTenDrawCountDown() {
      ComeBackActivityTenDrawModel prepareUnlockComeBackActivityTenDrawModel = this.getPrepareUnlockComeBackActivityTenDrawModel();
      if (null == prepareUnlockComeBackActivityTenDrawModel) {
         return -1L;
      } else {
         long actTotalOnlineSecond = this.getActTotalOnlineSecond();
         long onlineTimeSecond = (long)prepareUnlockComeBackActivityTenDrawModel.getOnlineTime() * 60L;
         return actTotalOnlineSecond > onlineTimeSecond ? actTotalOnlineSecond - onlineTimeSecond : 0L;
      }
   }

   public ComeBackActivityTenDrawModel getPrepareUnlockComeBackActivityTenDrawModel() {
      Map<Integer, ComeBackActivityTenDrawModel> tenDrawModelMap = ApplicationContextProvider.<Integer, ComeBackActivityTenDrawModel>getModelPoolMap("comeBackActivityTenDraw");
      Set<Integer> allTenDrawIds = new HashSet();
      allTenDrawIds.addAll(tenDrawModelMap.keySet());
      Set<Integer> unlockTenDrawIds = this.getUnlockTenDrawIds();
      allTenDrawIds.removeAll(unlockTenDrawIds);
      return this.getMinOnlineTimeTenDraw(allTenDrawIds);
   }

   public ComeBackActivityTenDrawModel getCanUseComeBackActivityTenDrawModel() {
      Set<Integer> tempAllUnlockTenDrawIds = this.getUnlockTenDrawIds();
      if (null != tempAllUnlockTenDrawIds && !tempAllUnlockTenDrawIds.isEmpty()) {
         ActivityComeBackDao dao = this.getDao();
         Set<Integer> tempTenDrawUseIds = new HashSet();
         tempTenDrawUseIds.addAll(dao.tenDrawUseIds);
         if (tempTenDrawUseIds.containsAll(tempAllUnlockTenDrawIds)) {
            return null;
         } else {
            tempAllUnlockTenDrawIds.removeAll(tempTenDrawUseIds);
            return tempAllUnlockTenDrawIds.size() <= 0 ? null : this.getMinOnlineTimeTenDraw(tempAllUnlockTenDrawIds);
         }
      } else {
         return null;
      }
   }

   public Set<Integer> getUnlockTenDrawIds() {
      Set<Integer> allUnlockTenDrawIds = new HashSet();
      Map<Integer, ComeBackActivityTenDrawModel> tenDrawModelMap = ApplicationContextProvider.<Integer, ComeBackActivityTenDrawModel>getModelPoolMap("comeBackActivityTenDraw");
      long actTotalOnlineMin = this.getActTotalOnlineMin();

      for(Map.Entry<Integer, ComeBackActivityTenDrawModel> entry : tenDrawModelMap.entrySet()) {
         ComeBackActivityTenDrawModel model = (ComeBackActivityTenDrawModel)entry.getValue();
         if (actTotalOnlineMin >= (long)model.getOnlineTime()) {
            allUnlockTenDrawIds.add(model.getId());
         }
      }

      return allUnlockTenDrawIds;
   }

   public ComeBackActivityTenDrawModel getMinOnlineTimeTenDraw(Set<Integer> tenDrawIds) {
      if (null != tenDrawIds && tenDrawIds.size() > 0) {
         ComeBackActivityTenDrawModel tenDrawModel = null;

         for(Integer tempAllUnlockTenDrawId : tenDrawIds) {
            ComeBackActivityTenDrawModel modelPoolEntity = (ComeBackActivityTenDrawModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityTenDraw", tempAllUnlockTenDrawId);
            if (null == tenDrawModel) {
               tenDrawModel = modelPoolEntity;
            } else if (tenDrawModel.getOnlineTime() > modelPoolEntity.getOnlineTime()) {
               tenDrawModel = modelPoolEntity;
            }
         }

         return tenDrawModel;
      } else {
         return null;
      }
   }

   public long getActTotalOnlineSecond() {
      this.calActTotalOnlineTime(System.currentTimeMillis());
      ActivityComeBackDao dao = this.getDao();
      return dao.actTotalOnlineTime;
   }

   public long getActTotalOnlineMin() {
      long actTotalOnlineSecond = this.getActTotalOnlineSecond();
      return actTotalOnlineSecond / 60L;
   }

   public void calActTotalOnlineTime(long calTime) {
      if (!this.isServerActivityInvalid()) {
         ActivityComeBackDao dao = this.getDao();
         if (dao.loginState != 0) {
            long lastCalTime = dao.lastCalTime;
            if (dao.actTotalOnlineTime <= 0L) {
               ActivityMgr activityMgr = (ActivityMgr)ApplicationContextProvider.getContext().getBean(ActivityMgr.class);
               ActivityInfo activityInfo = activityMgr.getActivityInfo(this.getActivityType());
               long actStartSecond = (long)activityInfo.start;
               long lastCalTimeSecond = lastCalTime / 1000L;
               long calSecond = calTime / 1000L;
               long curOnlineSecond = 0L;
               if (lastCalTimeSecond < actStartSecond) {
                  curOnlineSecond = calSecond - actStartSecond;
               } else {
                  curOnlineSecond = calSecond - lastCalTimeSecond;
               }

               dao.actTotalOnlineTime += curOnlineSecond;
            } else {
               long curOnlineSecond = (calTime - lastCalTime) / 1000L;
               dao.actTotalOnlineTime += curOnlineSecond;
            }

            dao.lastCalTime = calTime;
            dao.updateOp();
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ReturnDraw_21215(ActivityComeBackMsg.C2S_ReturnDraw_21215 msg, String source) {
      ActivityComeBackDao dao = this.getDao();
      ComeBackActivityReturnModel returnModel = (ComeBackActivityReturnModel)ApplicationContextProvider.getModelPoolEntity("comeBackActivityReturn", dao.returnDrawTimes + 1);
      if (null == returnModel) {
         return this.player.failure(76134);
      } else if (!this.player.checkResourceNum(returnModel.getUseItem())) {
         return this.player.failure(76135);
      } else {
         int rewardGold = 0;
         if (returnModel.getAreaType() == 1) {
            rewardGold = RandomUtil.randInt(returnModel.getFloorGet(), returnModel.getMaxGet() + 1);
         } else {
            int nowTotalReturnGold = 0;

            for(Map.Entry<Integer, Integer> entry : dao.returnGoldRecord.entrySet()) {
               nowTotalReturnGold += (Integer)entry.getValue();
            }

            rewardGold = returnModel.getAllGet() - nowTotalReturnGold;
            if (rewardGold < 0) {
               return this.player.failure(37);
            }
         }

         ResourceModel resourceModel = new ResourceModel(returnModel.getItemType(), returnModel.getItemId(), rewardGold);
         this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 108, 10807, 0, 0, "");
         this.player.delResource((List)returnModel.getUseItem(), 108, 10809, 0, 0, "");
         ++dao.returnDrawTimes;
         dao.returnGoldRecord.put(returnModel.getTime(), rewardGold);
         dao.updateOp();
         ActivityComeBackMsg.S2C_ReturnDraw_21216.Builder resp = ActivityComeBackMsg.S2C_ReturnDraw_21216.newBuilder();
         resp.setReturnDrawTimes(dao.returnDrawTimes);

         for(Map.Entry<Integer, Integer> entry : dao.returnGoldRecord.entrySet()) {
            CommonMsg.MapDataII.Builder mapDataII = CommonMsg.MapDataII.newBuilder();
            mapDataII.setKey((Integer)entry.getKey());
            mapDataII.setValue((Integer)entry.getValue());
            resp.addReturnGoldRecord(mapDataII);
         }

         this.player.sendMsg(resp.build());
         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_TaskRewardReceive_21217(ActivityComeBackMsg.C2S_TaskRewardReceive_21217 msg, String source) {
      ActivityComeBackTaskPart comeBackTaskPart = (ActivityComeBackTaskPart)this.player.getMgrPart(ActivityComeBackTaskPart.class);
      TaskData taskData = comeBackTaskPart.getTask(msg.getTaskId());
      if (null == taskData) {
         this.logger.error("comeBackActivityTask 未找到任务 taskId:{}", msg.getTaskId());
         return this.player.failure(6);
      } else if (!comeBackTaskPart.checkComplete(taskData)) {
         return this.player.failure(76031);
      } else {
         comeBackTaskPart.commit(msg.getTaskId());
         List<TaskData> taskDataList = new ArrayList();
         taskDataList.add(taskData);
         comeBackTaskPart.sendTaskList(taskDataList);
         return true;
      }
   }
}
