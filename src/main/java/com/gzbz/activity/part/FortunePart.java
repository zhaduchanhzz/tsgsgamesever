package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ActivityFortuneDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.FortuneRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.FortuneMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.task.ActivityFortuneTaskPart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
public class FortunePart extends AbstractActivityPart {
   private static Logger logger = LoggerFactory.getLogger(FortunePart.class);
   public static final int TASK_TYPE_DAILY = 1;
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_ActivityInfo_23701(FortuneMsg.C2S_ActivityInfo_23701 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.sendInfo();
      }
   }

   public void sendInfo() {
      ActivityFortuneDao fortuneDao = this.getFortuneDao();
      FortuneMsg.S2C_ActivityInfo_23702.Builder builder = FortuneMsg.S2C_ActivityInfo_23702.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllPointReward(fortuneDao.pointReward);
      builder.setRechargeTotal(fortuneDao.rechargePoint);
      this.player.sendMsg(builder.build());
   }

   public void notifyRechargePoint() {
      FortuneMsg.S2C_NotifyRechargePoint_23710.Builder builder = FortuneMsg.S2C_NotifyRechargePoint_23710.newBuilder();
      ActivityFortuneDao fortuneDao = this.getFortuneDao();
      builder.setRechargeTotal(fortuneDao.rechargePoint);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ReceivePointReward_23703(FortuneMsg.C2S_ReceivePointReward_23703 msg, String source) {
      Map<Integer, FortuneRewardModel> modelMap = this.getRewardModelMp();
      if (modelMap.containsKey(msg.getId())) {
         FortuneRewardModel model = (FortuneRewardModel)modelMap.get(msg.getId());
         long pointNum = this.getPointNum();
         if (pointNum < (long)model.getPoint()) {
            this.player.failure(76407);
         } else {
            ActivityFortuneDao fortuneDao = this.getFortuneDao();
            if (fortuneDao.pointReward.contains(model.getId())) {
               this.player.failure(76406);
            } else {
               this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 7, 702, 0, 0, "");
               fortuneDao.pointReward.add(msg.getId());
               fortuneDao.updateOp();
               FortuneMsg.S2C_ReceivePointReward_23704.Builder builder = FortuneMsg.S2C_ReceivePointReward_23704.newBuilder();
               builder.addAllPointReward(fortuneDao.pointReward);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public long getPointNum() {
      String pointItem = this.configManager.getStrByDefault("hongYunItem", "1|78");
      String[] item = pointItem.split("\\|");
      long pointNum = this.player.getResourceNum(Integer.parseInt(item[0]), Integer.parseInt(item[1]));
      return pointNum;
   }

   public Map<Integer, FortuneRewardModel> getRewardModelMp() {
      int openDay = this.getActivityOpenDay();
      Map<Integer, FortuneRewardModel> resultMap = new HashMap();
      Map<Integer, FortuneRewardModel> modelMap = this.player.getGameModelPool().getMap("hongYunReward");

      for(FortuneRewardModel model : modelMap.values()) {
         if (model.getDateEnd() == -1) {
            if (openDay >= model.getDateStart()) {
               resultMap.put(model.getId(), model);
            }
         } else if (openDay >= model.getDateStart() && openDay <= model.getDateEnd()) {
            resultMap.put(model.getId(), model);
         }
      }

      return resultMap;
   }

   public void activityRecharge(int money) {
      this.rechargeHandle(money, false);
   }

   public void rechargeHandle(int money, Boolean isLogin) {
      int addMoney = this.calcAndReturnAddMoney(money);
      ActivityFortuneDao fortuneDao = this.getFortuneDao();
      fortuneDao.rechargeTotal += addMoney;
      fortuneDao.updateOp();
      if (isLogin) {
         this.addRechargePoint(addMoney, (List)null);
      }

   }

   public void addRechargePoint(int money, List<ResourceModel> resourceModels) {
      if (!this.isServerActivityInvalid()) {
         try {
            ActivityFortuneDao fortuneDao = this.getFortuneDao();
            int addMoney = this.calcAndReturnAddMoney(money);
            String pointCalc = this.configManager.getStrByDefault("hongYunPoint", "10:1");
            String[] calc = pointCalc.split(":");
            int addPoint = addMoney / Integer.parseInt(calc[0]) * Integer.parseInt(calc[1]);
            int pointLimit = this.configManager.getIntDefault("hongYunLimit", 2000);
            if (fortuneDao.rechargePoint + addPoint >= pointLimit) {
               addPoint = pointLimit - fortuneDao.rechargePoint;
            }

            String pointItem = this.configManager.getStrByDefault("hongYunItem", "1|78");
            String[] item = pointItem.split("\\|");
            if (addPoint > 0) {
               fortuneDao.rechargePoint += addPoint;
               fortuneDao.updateOp();
               this.notifyRechargePoint();
               if (resourceModels == null) {
                  this.player.addResource(Integer.parseInt(item[0]), Integer.parseInt(item[1]), addPoint, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 137, 13703, 0, 0, "");
               } else {
                  resourceModels.add(new ResourceModel(Integer.parseInt(item[0]), Integer.parseInt(item[1]), addPoint));
               }
            }
         } catch (Exception var11) {
            logger.error("发送充值鸿运福禄积分错误:{}", money);
         }

      }
   }

   public ActivityFortuneDao getFortuneDao() {
      ActivityFortuneDao activityFortuneDao = (ActivityFortuneDao)this.player.getData("tb_activity_fortune", this.player.getPlayerId());
      return activityFortuneDao;
   }

   public int getActivityType() {
      return 98;
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         ActivityFortuneTaskPart taskPart = (ActivityFortuneTaskPart)this.player.getMgrPart(ActivityFortuneTaskPart.class);
         taskPart.resetTask(1);
      }
   }

   public void rotateReset(int oldActivityId) {
      ActivityFortuneTaskPart taskPart = (ActivityFortuneTaskPart)this.player.getMgrPart(ActivityFortuneTaskPart.class);
      taskPart.trigger();
      this.clearActivityGift(24);
      ActivityFortuneDao fortuneDao = this.getFortuneDao();
      if (!fortuneDao.calcRecharge) {
         this.rechargeHandle(0, true);
         fortuneDao.calcRecharge = true;
         fortuneDao.updateOp();
      }

   }

   public void activityEnd(int oldActivityId) {
      ActivityFortuneDao fortuneDao = this.getFortuneDao();
      this.sendPointReward(fortuneDao);
      fortuneDao.rechargeTotal = 0;
      fortuneDao.rechargePoint = 0;
      fortuneDao.pointReward.clear();
      fortuneDao.calcRecharge = false;
      fortuneDao.updateOp();
      String pointItem = this.configManager.getStrByDefault("hongYunItem", "1|78");
      String[] item = pointItem.split("\\|");
      this.player.delResourceAllNum(Integer.parseInt(item[0]), Integer.parseInt(item[1]), this.getActivityLogModule(), 13704, 0, 0, "");
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_FORTUNE);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   public int getActivityLogModule() {
      return 137;
   }

   public void sendPointReward(ActivityFortuneDao fortuneDao) {
      Map<Integer, FortuneRewardModel> modelMap = this.getRewardModelMp();
      List<ResourceModel> rewardList = new ArrayList();
      long pointNum = this.getPointNum();

      for(FortuneRewardModel rewardModel : modelMap.values()) {
         if (!fortuneDao.pointReward.contains(rewardModel.getId()) && (long)rewardModel.getPoint() <= pointNum) {
            for(ResourceModel reward : rewardModel.getRewards()) {
               reward.addResourceToList(rewardList);
            }
         }
      }

      if (!rewardList.isEmpty()) {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel awardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_FORTUNE_POINT_REWARD, 0L);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, awardModel.getTitle(), awardModel.getDesc(), rewardList, 604800000L, 137, 13702);
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "鸿运福禄", "未领取任务奖励-" + awardModel.getDesc(), "任务奖励-" + awardModel.getDesc(), 0, 0, 1);
      }

   }

   private CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel awardModel : rewardMap.values()) {
         if ((long)awardModel.getMinRank() <= rank && (long)awardModel.getMaxRank() >= rank) {
            rewardModel = awardModel;
            break;
         }
      }

      if (rewardModel == null) {
         rewardModel = (CentreAwardModel)rewardMap.lastEntry().getValue();
      }

      return rewardModel;
   }
}
