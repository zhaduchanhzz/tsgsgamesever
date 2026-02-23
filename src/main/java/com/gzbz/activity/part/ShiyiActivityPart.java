package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ShiyiRewardActivityDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShiyiRewardGroupModel;
import com.gzbz.model.ShiyiRewardModel;
import com.gzbz.model.ShiyiSpecialOfferModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ShiyiActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import misc.DateUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ShiyiActivityPart extends AbstractActivityPart {
   @Autowired
   WorldMgr worldMgr;

   public void sendInfo() {
      ShiyiActivityMsg.S2C_ActivityInfo_16902.Builder builder = ShiyiActivityMsg.S2C_ActivityInfo_16902.newBuilder();
      ActivityInfo activityInfo = this.getServerActivityInfo();
      builder.setStartTime(activityInfo == null ? 0 : activityInfo.start);
      builder.setEndTime(activityInfo == null ? 0 : activityInfo.end);
      this.player.sendMsg(builder.build());
      this.sendShiyiRewardTotalInfo(true);
   }

   public int getActivityType() {
      return 53;
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         ShiyiRewardActivityDao shiyiRewardActivityDao = this.getShiyiRewardActivityDao(false);
         shiyiRewardActivityDao.shiyiBuyTimes = 0;
         shiyiRewardActivityDao.nowRewardList.clear();
         this.replenishRewardList(shiyiRewardActivityDao.nowRewardList);
         shiyiRewardActivityDao.updateOp();
         this.sendShiyiRewardTotalInfo(false);
      }
   }

   public void rotateReset(int oldActivityId) {
      ShiyiRewardActivityDao shiyiRewardActivityDao = this.getShiyiRewardActivityDao(false);
      shiyiRewardActivityDao.shiyiBuyTimes = 0;
      shiyiRewardActivityDao.nowRewardList.clear();
      shiyiRewardActivityDao.updateOp();
   }

   public List<ShiyiRewardModel> getShiyiRewardModelByGroup(int group) {
      List<ShiyiRewardModel> shiyiRewardModelList = (List)this.player.getGameModelPool().getEntity("shiyiRewardCustom", group);
      return shiyiRewardModelList;
   }

   public ShiyiRewardModel getShiyiRewardModelById(int id) {
      ShiyiRewardModel shiyiRewardModel = (ShiyiRewardModel)this.player.getGameModelPool().getEntity("shiyiReward", id);
      return shiyiRewardModel;
   }

   public ShiyiSpecialOfferModel getShiyiSpecialOfferModelByMoney(int money) {
      Map<Integer, ShiyiSpecialOfferModel> shiyiSpecialOfferModelMap = this.player.getGameModelPool().getMap("shiyiSpecialOffer");
      Collection<ShiyiSpecialOfferModel> values = shiyiSpecialOfferModelMap.values();

      for(ShiyiSpecialOfferModel shiyiSpecialOfferModel : (List<ShiyiSpecialOfferModel>)values.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).collect(Collectors.toList())) {
         int lowMoney = shiyiSpecialOfferModel.getLowMoney();
         int maxMoney = shiyiSpecialOfferModel.getMaxMoney();
         if (maxMoney != -1) {
            if (money >= lowMoney && money <= maxMoney) {
               return shiyiSpecialOfferModel;
            }
         } else if (money >= lowMoney) {
            return shiyiSpecialOfferModel;
         }
      }

      return null;
   }

   public ShiyiRewardGroupModel getNowShiyiRewardGroupModel() {
      int serverOpenDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;
      Map<Integer, ShiyiRewardGroupModel> shiyiRewardGroupModelMap = this.player.getGameModelPool().getMap("shiyiRewardGroup");
      Collection<ShiyiRewardGroupModel> values = shiyiRewardGroupModelMap.values();

      for(ShiyiRewardGroupModel shiyiRewardGroupModel : values.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).collect(Collectors.toList())) {
         int earlyTime = shiyiRewardGroupModel.getEarlyTime();
         int laterTime = shiyiRewardGroupModel.getLaterTime();
         if (laterTime != -1) {
            if (serverOpenDay >= earlyTime && serverOpenDay <= laterTime) {
               return shiyiRewardGroupModel;
            }
         } else if (serverOpenDay >= earlyTime) {
            return shiyiRewardGroupModel;
         }
      }

      return null;
   }

   public List<ShiyiRewardModel> getNowShiyiRewardModelList() {
      ShiyiRewardGroupModel nowShiyiRewardGroupModel = this.getNowShiyiRewardGroupModel();
      if (null == nowShiyiRewardGroupModel) {
         return null;
      } else {
         List<ShiyiRewardModel> shiyiRewardModelByGroup = this.getShiyiRewardModelByGroup(nowShiyiRewardGroupModel.getRewardGroup());
         return shiyiRewardModelByGroup;
      }
   }

   public ShiyiRewardActivityDao getShiyiRewardActivityDao(boolean addRewardList) {
      ShiyiRewardActivityDao dao = (ShiyiRewardActivityDao)this.player.getData("tb_shiyi_reward_activity", this.player.getPlayerId());
      if (addRewardList) {
         this.replenishRewardList(dao.nowRewardList);
         dao.updateOp();
      }

      return dao;
   }

   public void replenishRewardList(Set<Integer> rewardList) {
      if (rewardList == null) {
         rewardList = new HashSet();
      }

      List<ShiyiRewardModel> nowShiyiRewardModelList = this.getNowShiyiRewardModelList();
      if (nowShiyiRewardModelList != null && nowShiyiRewardModelList.size() > 0) {
         List<Integer> nowShiyiRewardIdList = (List)nowShiyiRewardModelList.stream().map(ShiyiRewardModel::getId).collect(Collectors.toList());
         int shiyiArticleNum = ApplicationContextProvider.getConfigInt("shiyiArticleNum", 10);
         int cut = shiyiArticleNum - rewardList.size();
         if (cut > 0) {
            nowShiyiRewardIdList.removeAll(rewardList);
            if (nowShiyiRewardIdList.size() > 0) {
               if (nowShiyiRewardIdList.size() <= cut) {
                  rewardList.addAll(nowShiyiRewardIdList);
               } else {
                  for(Integer index : RandomUtil.getRandomSetByRange(0, nowShiyiRewardIdList.size(), cut)) {
                     rewardList.add(nowShiyiRewardIdList.get(index));
                  }

               }
            }
         }
      }
   }

   public void sendShiyiRewardTotalInfo(boolean addRewardList) {
      ShiyiRewardActivityDao shiyiRewardActivityDao = this.getShiyiRewardActivityDao(addRewardList);
      ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.Builder builder = ShiyiActivityMsg.S2C_ShiyiRewardTotalInfo_16904.newBuilder();
      builder.addAllRewardId(shiyiRewardActivityDao.nowRewardList);
      int surplusTimes = ApplicationContextProvider.getConfigInt("shiyiBalance", 50) - shiyiRewardActivityDao.shiyiBuyTimes;
      builder.setSurplusTimes(surplusTimes > 0 ? surplusTimes : 0);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ShiyiRewardTotalInfo_16903(ShiyiActivityMsg.C2S_ShiyiRewardTotalInfo_16903 msg, String source) {
      this.sendShiyiRewardTotalInfo(true);
   }

   @MsgHandlerAnno
   public boolean C2S_SubmitBag_16905(ShiyiActivityMsg.C2S_SubmitBag_16905 msg, String source) {
      List<Integer> rewardIdList = msg.getRewardIdList();
      if (rewardIdList != null && rewardIdList.size() > 0) {
         rewardIdList = (List)rewardIdList.stream().distinct().collect(Collectors.toList());
         ShiyiRewardActivityDao shiyiRewardActivityDao = this.getShiyiRewardActivityDao(false);
         if (!shiyiRewardActivityDao.nowRewardList.containsAll(rewardIdList)) {
            return this.player.failure(61214);
         } else {
            boolean shiyiBuyTimesNotEnough = false;
            int surplusTimes = ApplicationContextProvider.getConfigInt("shiyiBalance", 50) - shiyiRewardActivityDao.shiyiBuyTimes;
            if (surplusTimes <= 0) {
               return this.player.failure(61215);
            } else {
               if (rewardIdList.size() > surplusTimes) {
                  rewardIdList = rewardIdList.subList(0, surplusTimes);
                  shiyiBuyTimesNotEnough = true;
               }

               int vip_lv = this.player.getPlayerDao().vip_lv;
               int type = 0;
               int id = 0;
               int num = 0;
               List<ResourceModel> itemList = new ArrayList();

               for(Integer rewardId : rewardIdList) {
                  ShiyiRewardModel shiyiRewardModel = this.getShiyiRewardModelById(rewardId);
                  if (shiyiRewardModel == null || vip_lv < shiyiRewardModel.getVip()) {
                     return this.player.failure(58111);
                  }

                  for(ResourceModel resourceModel : shiyiRewardModel.getItem()) {
                     itemList.add(resourceModel);
                  }

                  for(ResourceModel resourceModel : shiyiRewardModel.getBuyArticle()) {
                     type = resourceModel.getType();
                     id = resourceModel.getId();
                     num += resourceModel.getValue();
                  }
               }

               ShiyiSpecialOfferModel shiyiSpecialOfferModelByMoney = this.getShiyiSpecialOfferModelByMoney(num);
               if (null != shiyiSpecialOfferModelByMoney) {
                  num -= shiyiSpecialOfferModelByMoney.getDiscount();
               }

               if (!this.player.checkResourceNum(type, id, num)) {
                  return this.player.failure(18);
               } else {
                  this.player.addResource(itemList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 80, 8001, 0, 0, "");
                  this.player.delResource(type, id, (long)num, 80, 8002, 0, 0, "");
                  shiyiRewardActivityDao.nowRewardList.removeAll(rewardIdList);
                  this.replenishRewardList(shiyiRewardActivityDao.nowRewardList);
                  shiyiRewardActivityDao.shiyiBuyTimes += rewardIdList.size();
                  shiyiRewardActivityDao.updateOp();
                  this.sendShiyiRewardTotalInfo(false);
                  if (shiyiBuyTimesNotEnough) {
                     this.player.failure(61215);
                  }

                  return true;
               }
            }
         }
      } else {
         return this.player.failure(61213);
      }
   }
}
