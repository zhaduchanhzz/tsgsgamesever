package com.gzbz.activity.part;

import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseAddUpRechargeModel;
import com.gzbz.model.manager.BaseConRechargeModel;
import com.gzbz.protobuf.AddUpAndConRechargeMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import jodd.util.StringUtil;
import misc.DateUtil;
import org.apache.commons.lang3.StringUtils;

public abstract class AddUpAndConRechargeActivityPart extends AbstractActivityPart {
   public abstract AddUpAndConBaseDao getDao();

   public abstract int getActivityLogModule();

   public abstract int getAddUpLogReason();

   public abstract int getAddUpMail();

   public abstract String getAddUpExcelName();

   public abstract int getConLogReason();

   public abstract int getConMail();

   public abstract String getConExcelName();

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.addUpRechargeHandle(0, true);
         this.conRechargeHandle(0, true);
      }
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         this.isAddUpStageChange();
         this.dailyResetCon();
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.addUpRechargeHandle(0, false);
         this.conRechargeHandle(0, false);
         this.checkAddUpIdListChange();
         this.checkConIdListChange();
         if (StringUtils.isNotBlank(this.getAddUpExcelName())) {
            this.S2C_SendAddUpRechargeRewardInfo();
         }

         if (StringUtils.isNotBlank(this.getConExcelName())) {
            this.S2C_SendConRewardInfo();
         }

      }
   }

   public void activityEnd(int oldActivityId) {
      this.addUpActivityEnd();
      this.conActivityEnd();
   }

   public void activityRecharge(int money) {
      if (!this.isServerActivityInvalid()) {
         this.addUpRechargeHandle(money, true);
         this.conRechargeHandle(money, true);
      }
   }

   public void S2C_SendAddUpRechargeRewardInfo() {
      if (!StringUtils.isBlank(this.getAddUpExcelName())) {
         AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.Builder builder = AddUpAndConRechargeMsg.S2C_AddUpInfo_18602.newBuilder();
         AddUpAndConBaseDao dao = this.getDao();
         builder.setActivityType(this.getActivityType());
         builder.addAllGotRewards(dao.addUpGotRewards);
         builder.setStageRecharge(dao.stageRechargeMoney);
         builder.setStageEndTime(this.getAddUpRechargeStageEndTime());
         builder.setStage(dao.stage);
         builder.setOpenDay(this.getActivityOpenDay());
         this.player.sendMsg(builder.build());
      }
   }

   public long getAddUpRechargeStageEndTime() {
      List<BaseAddUpRechargeModel> addUpModelByStage = this.getAddUpModelByStage(this.getNowAddUpStage());
      if (null != addUpModelByStage && addUpModelByStage.size() > 0) {
         BaseAddUpRechargeModel model = (BaseAddUpRechargeModel)addUpModelByStage.get(0);
         int stageEnd = model.getStageEnd();
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long startTime = (long)activityInfo.start * 1000L;
         long result = startTime + (long)stageEnd * 86400000L;
         return result;
      } else {
         return 0L;
      }
   }

   public List<BaseAddUpRechargeModel> getAddUpModelByStage(int stage) {
      List<BaseAddUpRechargeModel> modelList = new ArrayList();
      if (StringUtils.isBlank(this.getAddUpExcelName())) {
         return modelList;
      } else {
         int activityStartDay = this.getActivityOpenDay();
         Map<Integer, BaseAddUpRechargeModel> stageModelMap = this.player.getGameModelPool().getMap(this.getAddUpExcelName());
         if (null != stageModelMap && stageModelMap.size() > 0) {
            for(BaseAddUpRechargeModel model : stageModelMap.values()) {
               if (model.getStage() == stage) {
                  if (model.getDateEnd() == -1) {
                     if (activityStartDay >= model.getDateStart()) {
                        modelList.add(model);
                     }
                  } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd()) {
                     modelList.add(model);
                  }
               }
            }

            if (modelList.size() <= 0) {
               this.logger.info("活动id:{} 活动的{}阶段的累充配置表为空，请检查配置表", this.getActivityType(), stage);
            }

            return modelList;
         } else {
            this.logger.info("活动id:{} 活动的{}阶段的累充配置表为空，请检查配置表", this.getActivityType(), stage);
            return modelList;
         }
      }
   }

   public BaseAddUpRechargeModel getAddUpModel(int id) {
      if (StringUtils.isBlank(this.getAddUpExcelName())) {
         return null;
      } else {
         BaseAddUpRechargeModel addUpRechargeModel = (BaseAddUpRechargeModel)this.player.getGameModelPool().getEntity(this.getAddUpExcelName(), id);
         return addUpRechargeModel;
      }
   }

   public boolean isAddUpStageChange() {
      this.checkAddUpIdListChange();
      int nowStage = this.getNowAddUpStage();
      AddUpAndConBaseDao dao = this.getDao();
      if (nowStage != dao.stage) {
         this.sendAddUpNotReceiveRewardMail();
         dao.stage = nowStage;
         dao.stageRechargeMoney = 0;
         dao.updateOp();
         this.S2C_SendAddUpRechargeRewardInfo();
         return true;
      } else {
         return false;
      }
   }

   public int getNowAddUpStage() {
      int state = 1;
      if (StringUtils.isBlank(this.getAddUpExcelName())) {
         return state;
      } else {
         Map<Integer, BaseAddUpRechargeModel> allMap = this.player.getGameModelPool().getMap(this.getAddUpExcelName());
         if (allMap != null && allMap.size() > 0) {
            int activityStartDay = this.getActivityOpenDay();
            int severActivityDay = this.getSeverActivityDay();
            if (severActivityDay <= 0) {
               return state;
            }

            for(BaseAddUpRechargeModel model : allMap.values()) {
               if (model.getStage() > state) {
                  state = model.getStage();
               }

               if (model.getDateEnd() == -1) {
                  if (activityStartDay >= model.getDateStart() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
                     return model.getStage();
                  }
               } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
                  return model.getStage();
               }
            }
         }

         return state;
      }
   }

   public void addUpRechargeHandle(int money, boolean sendMsg) {
      int addMoney = this.calcAndReturnAddMoney(money);
      this.isAddUpStageChange();
      AddUpAndConBaseDao dao = this.getDao();
      dao.stageRechargeMoney += addMoney;
      dao.updateOp();
      if (sendMsg) {
         this.S2C_SendAddUpRechargeRewardInfo();
      }

   }

   public void sendAddUpNotReceiveRewardMail() {
      if (this.getAddUpMail() <= 0) {
         this.logger.info("活动Id {} 的累充活动结束邮件没有配置", this.getActivityType());
      } else {
         AddUpAndConBaseDao dao = this.getDao();
         List<BaseAddUpRechargeModel> modelList = this.getAddUpModelByStage(dao.stage);
         if (null != modelList && modelList.size() > 0) {
            List<Integer> notReceiveIdList = new ArrayList();
            List<ResourceModel> notReceiveRewardList = new ArrayList();

            for(BaseAddUpRechargeModel model : modelList) {
               Integer rewardId = model.getId();
               if (this.checkUnlockAddUp(rewardId) && !dao.addUpGotRewards.contains(rewardId) && model.getRewards().size() > 0) {
                  notReceiveIdList.add(rewardId);
                  notReceiveRewardList.addAll(model.getRewards());
               }
            }

            if (notReceiveRewardList.size() > 0) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(this.getAddUpMail());
               if (centreAwardMap != null && centreAwardMap.size() > 0) {
                  CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, this.getActivityLogModule(), this.getAddUpLogReason());
               }
            }

            if (notReceiveIdList.size() > 0) {
               dao.addUpGotRewards.addAll(notReceiveIdList);
               dao.updateOp();
            }
         }

      }
   }

   public void addUpActivityEnd() {
      this.checkAddUpIdListChange();
      this.sendAddUpNotReceiveRewardMail();
      AddUpAndConBaseDao dao = this.getDao();
      dao.stage = 1;
      dao.stageRechargeMoney = 0;
      dao.addUpGotRewards.clear();
      dao.updateOp();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   public boolean checkAddUpRewardStage(int id) {
      BaseAddUpRechargeModel model = this.getAddUpModel(id);
      if (null == model) {
         return false;
      } else {
         int activityStartDay = this.getActivityOpenDay();
         AddUpAndConBaseDao dao = this.getDao();
         if (model.getDateEnd() == -1) {
            if (activityStartDay >= model.getDateStart() && dao.stage == model.getStage()) {
               return true;
            }
         } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && dao.stage == model.getStage()) {
            return true;
         }

         return false;
      }
   }

   public boolean checkUnlockAddUp(int id) {
      BaseAddUpRechargeModel addUpRechargeModel = this.getAddUpModel(id);
      if (null == addUpRechargeModel) {
         return false;
      } else {
         AddUpAndConBaseDao dao = this.getDao();
         return dao.stageRechargeMoney >= addUpRechargeModel.getRechargeNum();
      }
   }

   public boolean C2S_ReceiveAddUpReward(int rewardId) {
      this.isAddUpStageChange();
      AddUpAndConBaseDao dao = this.getDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (addUpGotRewards.contains(rewardId)) {
         return this.player.failure(76030);
      } else {
         BaseAddUpRechargeModel model = this.getAddUpModel(rewardId);
         if (null == model) {
            return this.player.failure(37);
         } else if (!this.checkAddUpRewardStage(rewardId)) {
            this.logger.info("领取的奖励id:{} 不是本阶段奖励,本阶段是activityStartDay:{},severActivityDay:{}", new Object[]{rewardId, this.getActivityOpenDay(), this.getSeverActivityDay()});
            return this.player.failure(61224);
         } else if (!this.checkUnlockAddUp(rewardId)) {
            return this.player.failure(76031);
         } else {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), this.getAddUpLogReason(), 0, 0, "");
            dao.addUpGotRewards.add(rewardId);
            dao.updateOp();
            this.S2C_SendAddUpRechargeRewardInfo();
            return true;
         }
      }
   }

   public void S2C_SendConRewardInfo() {
      if (!StringUtils.isBlank(this.getConExcelName())) {
         AddUpAndConRechargeMsg.S2C_ConInfo_18605.Builder builder = AddUpAndConRechargeMsg.S2C_ConInfo_18605.newBuilder();
         AddUpAndConBaseDao dao = this.getDao();
         builder.setActivityType(this.getActivityType());
         builder.setUnlockStageNum(this.getNowUnlockStageNum());
         builder.addAllCanReceiveRewardIds(this.getAllCanReceiveRewardIds());
         builder.addAllHasReceiveRewardIds(dao.hasReceiveRewardIds);
         builder.addAllNextUnlockReceiveReward(this.getNextUnlockReceiveRewardList());
         this.player.sendMsg(builder.build());
      }
   }

   public void dailyResetCon() {
      AddUpAndConBaseDao dao = this.getDao();
      dao.nowRechargeMoney = 0;
      dao.rechargeCut = 0;
      dao.updateOp();
      this.S2C_SendConRewardInfo();
   }

   public List<BaseConRechargeModel> getConModelList() {
      List<BaseConRechargeModel> modelList = new ArrayList();
      if (StringUtils.isBlank(this.getConExcelName())) {
         return modelList;
      } else {
         Map<Integer, BaseConRechargeModel> all = this.player.getGameModelPool().getMap(this.getConExcelName());
         if (null != all && all.size() > 0) {
            Collection<BaseConRechargeModel> values = all.values();
            int activityStartDay = this.getActivityOpenDay();

            for(BaseConRechargeModel model : values) {
               if (model.getDateEnd() == -1) {
                  if (activityStartDay >= model.getDateStart()) {
                     modelList.add(model);
                  }
               } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd()) {
                  modelList.add(model);
               }
            }

            return modelList;
         } else {
            return modelList;
         }
      }
   }

   public int getNowUnlockStageNum() {
      int severActivityDay = super.getSeverActivityDay();
      List<BaseConRechargeModel> modelList = this.getConModelList();
      if (null != modelList && modelList.size() > 0) {
         int maxStageNum = 1;

         for(BaseConRechargeModel model : modelList) {
            if (model.getStageNum() > maxStageNum) {
               maxStageNum = model.getStageNum();
            }
         }

         return maxStageNum <= severActivityDay ? maxStageNum : severActivityDay;
      } else {
         return 1;
      }
   }

   public void conRechargeHandle(int money, boolean sendMsg) {
      if (!StringUtils.isBlank(this.getConExcelName())) {
         AddUpAndConBaseDao dao = this.getDao();
         if (dao.nowRechargeMoney == -1) {
            PlayerDao playerDao = this.player.getPlayerDao();
            int dailyRecharge = 0;
            if (DateUtil.isSameDay(playerDao.updateTime)) {
               PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
               dailyRecharge = playerRechargeDao.dailyRecharge;
            }

            dao.nowRechargeMoney = dailyRecharge;
         } else {
            dao.nowRechargeMoney += money;
         }

         dao.updateOp();
         BaseConRechargeModel prepareUnlockLow = this.getPrepareUnlockConModel(false);
         if (null != prepareUnlockLow) {
            int unlockCondition = dao.nowRechargeMoney - dao.rechargeCut;
            if (unlockCondition >= prepareUnlockLow.getRechargeNum()) {
               dao.canReceiveLowRewardIds.add(prepareUnlockLow.getId());
               dao.rechargeCut = dao.nowRechargeMoney;
               dao.updateOp();
            }
         }

         BaseConRechargeModel prepareUnlockHigh = this.getPrepareUnlockConModel(true);
         if (null != prepareUnlockHigh) {
            int nowRechargeMoney = dao.nowRechargeMoney;
            if (nowRechargeMoney >= prepareUnlockHigh.getRechargeNum()) {
               dao.canReceiveHighRewardIds.add(prepareUnlockHigh.getId());
               dao.nowRechargeMoney = 0;
               dao.rechargeCut = 0;
               dao.updateOp();
            }
         }

         if (sendMsg) {
            this.S2C_SendConRewardInfo();
         }

      }
   }

   public BaseConRechargeModel getPrepareUnlockConModel(boolean isHighRechargeGear) {
      AddUpAndConBaseDao dao = this.getDao();
      int nowUnlockStageNum = this.getNowUnlockStageNum();
      Set<Integer> canReceiveRewardIds = isHighRechargeGear ? dao.canReceiveHighRewardIds : dao.canReceiveLowRewardIds;
      if (canReceiveRewardIds.size() <= 0) {
         return this.getConModelByStageNum(1, isHighRechargeGear);
      } else {
         int maxCanReceiveRewardId = 0;

         for(Integer canReceiveRewardId : canReceiveRewardIds) {
            if (canReceiveRewardId > maxCanReceiveRewardId) {
               maxCanReceiveRewardId = canReceiveRewardId;
            }
         }

         BaseConRechargeModel model = this.getConModelById(maxCanReceiveRewardId);
         if (null == model) {
            return null;
         } else {
            int nextStageNum = model.getStageNum() + 1;
            if (nextStageNum > nowUnlockStageNum) {
               return null;
            } else {
               return this.getConModelByStageNum(nextStageNum, isHighRechargeGear);
            }
         }
      }
   }

   public void conActivityEnd() {
      this.checkConIdListChange();
      this.sendConNotReceiveRewardMail();
      AddUpAndConBaseDao dao = this.getDao();
      dao.nowRechargeMoney = -1;
      dao.rechargeCut = 0;
      dao.canReceiveLowRewardIds.clear();
      dao.canReceiveHighRewardIds.clear();
      dao.hasReceiveRewardIds.clear();
      dao.updateOp();
   }

   public void sendConNotReceiveRewardMail() {
      if (this.getConMail() <= 0) {
         this.logger.info("活动Id {} 的连充活动结束邮件没有配置", this.getActivityType());
      } else {
         Set<Integer> allCanReceiveRewardIds = this.getAllCanReceiveRewardIds();
         List<ResourceModel> notReceiveRewardList = new ArrayList();
         if (allCanReceiveRewardIds.size() > 0) {
            for(Integer canReceiveRewardId : allCanReceiveRewardIds) {
               BaseConRechargeModel model = this.getConModelById(canReceiveRewardId);
               if (null != model && model.getRewards().size() > 0) {
                  notReceiveRewardList.addAll(model.getRewards());
               }
            }
         }

         if (notReceiveRewardList.size() > 0) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(this.getConMail());
            if (centreAwardMap != null && centreAwardMap.size() > 0) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, this.getActivityLogModule(), this.getConLogReason());
            }
         }

      }
   }

   public Set<Integer> getAllCanReceiveRewardIds() {
      Set<Integer> canReceiveRewardIds = new HashSet();
      AddUpAndConBaseDao dao = this.getDao();
      canReceiveRewardIds.addAll(dao.canReceiveLowRewardIds);
      canReceiveRewardIds.addAll(dao.canReceiveHighRewardIds);
      if (dao.hasReceiveRewardIds.size() > 0) {
         canReceiveRewardIds.removeAll(dao.hasReceiveRewardIds);
      }

      return canReceiveRewardIds;
   }

   public List<AddUpAndConRechargeMsg.NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
      List<AddUpAndConRechargeMsg.NextUnlockReceiveReward> nextUnlockReceiveRewardList = new ArrayList();
      AddUpAndConBaseDao dao = this.getDao();
      BaseConRechargeModel lowBaseConRechargeModel = this.getPrepareUnlockConModel(false);
      if (null != lowBaseConRechargeModel) {
         AddUpAndConRechargeMsg.NextUnlockReceiveReward.Builder lowReceiveReward = AddUpAndConRechargeMsg.NextUnlockReceiveReward.newBuilder();
         lowReceiveReward.setRewardId(lowBaseConRechargeModel.getId());
         double unlockCondition = (double)(dao.nowRechargeMoney - dao.rechargeCut);
         double progress = unlockCondition / (double)lowBaseConRechargeModel.getRechargeNum() * (double)100.0F;
         lowReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(lowReceiveReward.build());
      }

      BaseConRechargeModel highBaseConRechargeModel = this.getPrepareUnlockConModel(true);
      if (null != highBaseConRechargeModel) {
         AddUpAndConRechargeMsg.NextUnlockReceiveReward.Builder highReceiveReward = AddUpAndConRechargeMsg.NextUnlockReceiveReward.newBuilder();
         highReceiveReward.setRewardId(highBaseConRechargeModel.getId());
         double nowRechargeMoney = (double)dao.nowRechargeMoney;
         double progress = nowRechargeMoney / (double)highBaseConRechargeModel.getRechargeNum() * (double)100.0F;
         highReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(highReceiveReward.build());
      }

      return nextUnlockReceiveRewardList;
   }

   public BaseConRechargeModel getConModelByStageNum(int stageNum, boolean isHighRechargeGear) {
      int rechargeGear = isHighRechargeGear ? 2 : 1;

      for(BaseConRechargeModel model : this.getConModelList()) {
         if (model.getStageNum() == stageNum && model.getRechargeGear() == rechargeGear) {
            return model;
         }
      }

      return null;
   }

   public BaseConRechargeModel getConModelById(int id) {
      if (StringUtils.isBlank(this.getConExcelName())) {
         return null;
      } else {
         BaseConRechargeModel model = (BaseConRechargeModel)this.player.getGameModelPool().getEntity(this.getConExcelName(), id);
         return model;
      }
   }

   public boolean C2S_ReceiveConReward(int rewardId) {
      AddUpAndConBaseDao dao = this.getDao();
      BaseConRechargeModel model = this.getConModelById(rewardId);
      if (null == model) {
         return this.player.failure(76031);
      } else if (!this.getAllCanReceiveRewardIds().contains(rewardId)) {
         return this.player.failure(76031);
      } else if (dao.hasReceiveRewardIds.contains(rewardId)) {
         return this.player.failure(76030);
      } else {
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), this.getConLogReason(), 0, 0, "");
         dao.hasReceiveRewardIds.add(rewardId);
         dao.updateOp();
         this.S2C_SendConRewardInfo();
         return true;
      }
   }

   public void checkAddUpIdListChange() {
      AddUpAndConBaseDao dao = this.getDao();
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (!StringUtil.isBlank(this.getAddUpExcelName()) && !addUpGotRewards.isEmpty()) {
         Map<Integer, BaseAddUpRechargeModel> stageModelMap = this.player.getGameModelPool().getMap(this.getAddUpExcelName());
         if (null != stageModelMap && stageModelMap.size() > 0) {
            int activityOpenDay = this.getActivityOpenDay();
            List<BaseAddUpRechargeModel> addUpRechargeModelList = new ArrayList();
            Set<Integer> addUpIdSet = new HashSet();

            for(BaseAddUpRechargeModel model : stageModelMap.values()) {
               if (model.getDateEnd() == -1) {
                  if (activityOpenDay >= model.getDateStart()) {
                     addUpIdSet.add(model.getId());
                     addUpRechargeModelList.add(model);
                  }
               } else if (activityOpenDay >= model.getDateStart() && activityOpenDay <= model.getDateEnd()) {
                  addUpIdSet.add(model.getId());
                  addUpRechargeModelList.add(model);
               }
            }

            if (addUpIdSet.size() <= 0) {
               this.logger.info("活动id:{} 累充配置表为空，请检查配置表", this.getActivityType());
            } else {
               int nowAddUpStage = this.getNowAddUpStage();
               if (addUpIdSet.containsAll(addUpGotRewards) && dao.stage > nowAddUpStage || !addUpIdSet.containsAll(addUpGotRewards)) {
                  Set<Integer> newAddUpGotRewards = new HashSet();

                  for(int id : addUpGotRewards) {
                     BaseAddUpRechargeModel addUpModel = this.getAddUpModel(id);
                     if (null != addUpModel) {
                        int modelStage = addUpModel.getStage();
                        int modelRechargeNum = addUpModel.getRechargeNum();
                        if (modelStage > nowAddUpStage) {
                           if (dao.stage == modelStage) {
                              for(BaseAddUpRechargeModel addUpRechargeModel : addUpRechargeModelList) {
                                 if (addUpRechargeModel.getStage() == nowAddUpStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                    newAddUpGotRewards.add(addUpRechargeModel.getId());
                                    break;
                                 }
                              }
                           }
                        } else {
                           for(BaseAddUpRechargeModel addUpRechargeModel : addUpRechargeModelList) {
                              if (addUpRechargeModel.getStage() == modelStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                 newAddUpGotRewards.add(addUpRechargeModel.getId());
                                 break;
                              }
                           }
                        }
                     }
                  }

                  if (dao.stage > nowAddUpStage) {
                     dao.stage = nowAddUpStage;
                  }

                  dao.addUpGotRewards.clear();
                  dao.addUpGotRewards.addAll(newAddUpGotRewards);
                  dao.updateOp();
               }

            }
         } else {
            this.logger.info("活动id:{} 累充配置表为空，请检查配置表", this.getActivityType());
         }
      }
   }

   public void checkConIdListChange() {
      if (!StringUtil.isBlank(this.getConExcelName())) {
         List<BaseConRechargeModel> conModelList = this.getConModelList();
         if (conModelList != null && conModelList.size() > 0) {
            Set<Integer> conIdSet = new HashSet();

            for(BaseConRechargeModel model : conModelList) {
               conIdSet.add(model.getId());
            }

            AddUpAndConBaseDao dao = this.getDao();
            this.replaceConRewardIds(dao.canReceiveLowRewardIds, conIdSet, conModelList);
            this.replaceConRewardIds(dao.canReceiveHighRewardIds, conIdSet, conModelList);
            this.replaceConRewardIds(dao.hasReceiveRewardIds, conIdSet, conModelList);
            dao.updateOp();
         } else {
            this.logger.info("活动id:{} 连充配置表为空，请检查配置表", this.getActivityType());
         }
      }
   }

   private void replaceConRewardIds(Set<Integer> daoRewardIds, Set<Integer> conIdSet, List<BaseConRechargeModel> conModelList) {
      if (!daoRewardIds.isEmpty() && !conIdSet.containsAll(daoRewardIds)) {
         Set<Integer> newHasReceiveRewardIds = new HashSet();

         for(Integer rewardId : daoRewardIds) {
            BaseConRechargeModel conModelById = this.getConModelById(rewardId);
            if (null != conModelById) {
               int stageNum = conModelById.getStageNum();
               int rechargeGear = conModelById.getRechargeGear();

               for(BaseConRechargeModel model : conModelList) {
                  if (stageNum == model.getStageNum() && rechargeGear == model.getRechargeGear()) {
                     newHasReceiveRewardIds.add(model.getId());
                     break;
                  }
               }
            }
         }

         daoRewardIds.clear();
         daoRewardIds.addAll(newHasReceiveRewardIds);
      }

   }
}
