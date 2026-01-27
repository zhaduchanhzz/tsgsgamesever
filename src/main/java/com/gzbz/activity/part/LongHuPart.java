package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.mergeActivity.part.AbstractMergeActivityPart;
import com.gzbz.model.ActivityShopModel;
import com.gzbz.model.LongHuTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.LongHuMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.LongHuTaskPart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LongHuPart extends AbstractMergeActivityPart {
   public static final int TASK_TIME_TYPE_DAILY = 1;
   public static final int TASK_TIME_TYPE_LI_YU = 2;

   public int getMergeSubActivityType() {
      return 8002;
   }

   public void joinSubActivity() {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_LONG_HU);
      LongHuTaskPart longHuTaskPart = (LongHuTaskPart)this.player.getMgrPart(LongHuTaskPart.class);
      longHuTaskPart.trigger();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.setForever(33, 0);
   }

   public void endSubActivity() {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_LONG_HU);
      this.clearShopBuItem();
   }

   public void resetDaily() {
      if (this.isInSubActivityTime()) {
         if (this.getSeverActivityDay() != 1) {
            if (!this.inServerActDropTime()) {
               TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
               taskCustomCache.delete(TaskDefine.TaskModule.MODULE_LONG_HU);
            } else {
               LongHuTaskPart longHuTaskPart = (LongHuTaskPart)this.player.getMgrPart(LongHuTaskPart.class);
               longHuTaskPart.trigger();
            }
         }
      }
   }

   public boolean inServerActDropTime() {
      if (!this.isInSubActivityTime()) {
         return false;
      } else {
         return this.getSubActivityDropTime() > System.currentTimeMillis();
      }
   }

   public void loginHandle() {
   }

   @MsgHandlerAnno
   public void C2S_LongHu_19021(LongHuMsg.C2S_LongHu_19021 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      int startTime = 0;
      int endTime = 0;
      int dropTime = 0;
      if (this.isJoiningSubActivity()) {
         startTime = DateUtil.getIntTime(this.getSubActivityOpenTime());
         endTime = DateUtil.getIntTime(this.getSubActivityEndTime());
         dropTime = DateUtil.getIntTime(this.getSubActivityDropTime());
      }

      LongHuMsg.S2C_LongHu_19022.Builder builder = LongHuMsg.S2C_LongHu_19022.newBuilder();
      builder.setStartTime(startTime);
      builder.setEndTime(endTime);
      builder.setDropTime(dropTime);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LongHuDailyTask_19001(LongHuMsg.C2S_LongHuDailyTask_19001 msg, String source) {
      LongHuMsg.S2C_LongHuDailyTask_19002.Builder resp = LongHuMsg.S2C_LongHuDailyTask_19002.newBuilder();
      resp.addAllTask(this.getTaskListMsg(1));
      resp.setActDay(this.getSeverActivityDay());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      resp.setAlreadyBuy((Integer)playerResetCustomCache.getForeverNum(33, 0));
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_LongHuLiYuTask_19003(LongHuMsg.C2S_LongHuLiYuTask_19003 msg, String source) {
      LongHuMsg.S2C_LongHuLiYuTask_19004.Builder resp = LongHuMsg.S2C_LongHuLiYuTask_19004.newBuilder();
      resp.addAllTask(this.getTaskListMsg(2));
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_LongHuTaskCommit_19007(LongHuMsg.C2S_LongHuTaskCommit_19007 msg, String source) {
      if (!this.isInSubActivityTime()) {
         this.player.failure(8007);
      } else {
         LongHuTaskPart longHuTaskPart = (LongHuTaskPart)this.player.getMgrPart(LongHuTaskPart.class);
         longHuTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_LongHuBuyIntegral_19009(LongHuMsg.C2S_LongHuBuyIntegral_19009 msg, String source) {
      if (this.isInSubActivityTime()) {
         if (msg.getNum() > 0) {
            String[] buyConfig = ApplicationContextProvider.getConfigString("LonghuPoint", "2|1249|1,1|9|10,1500").split(",");
            ResourceModel feeRes = ResourceModel.buildResource(buyConfig[1]);
            if (!ResourceModel.checkTotalNumError(feeRes.getValue(), msg.getNum())) {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               int integralTotalBuy = (Integer)playerResetCustomCache.getForeverNum(33, 0);
               if (msg.getNum() + integralTotalBuy > Integer.parseInt(buyConfig[2])) {
                  this.player.failure(25);
               } else {
                  feeRes.setValue(feeRes.getValue() * msg.getNum());
                  if (!this.player.checkResourceNum(feeRes)) {
                     this.player.failure(4);
                  } else {
                     ResourceModel addRes = ResourceModel.buildResource(buyConfig[0]);
                     if (!ResourceModel.checkTotalNumError(addRes.getValue(), msg.getNum())) {
                        addRes.setValue(addRes.getValue() * msg.getNum());
                        this.player.delResource(feeRes, 82, 8226, msg.getNum(), 0, "");
                        this.player.addResource(addRes, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 8226, msg.getNum(), 0, "");
                        playerResetCustomCache.setForever(33, integralTotalBuy + msg.getNum());
                        LongHuMsg.S2C_LongHuBuyIntegral_19010.Builder resp = LongHuMsg.S2C_LongHuBuyIntegral_19010.newBuilder();
                        resp.setNum(msg.getNum());
                        resp.setAlreadyBuy((Integer)playerResetCustomCache.getForeverNum(33, 0));
                        this.player.sendMsg(resp.build());
                     }
                  }
               }
            }
         }
      }
   }

   private List<CommonMsg.Task> getTaskListMsg(int taskTimeType) {
      List<CommonMsg.Task> builderList = new ArrayList();
      LongHuTaskPart longHuTaskPart = (LongHuTaskPart)this.player.getMgrPart(LongHuTaskPart.class);

      for(TaskData taskData : longHuTaskPart.getTasksMap().values()) {
         LongHuTaskModel longHuTaskModel = (LongHuTaskModel)ApplicationContextProvider.getModelPoolEntity("LonghuTask", taskData.id);
         if (longHuTaskModel != null && longHuTaskModel.getTime() == taskTimeType) {
            builderList.add(taskData.toBuilder().build());
         }
      }

      return builderList;
   }

   public void clearShopBuItem() {
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      Iterator<Map.Entry<Integer, Integer>> iterator = playerActivityDao.shopItems.entrySet().iterator();

      while(iterator.hasNext()) {
         Map.Entry<Integer, Integer> buyItem = (Map.Entry)iterator.next();
         ActivityShopModel activityShopModel = (ActivityShopModel)ApplicationContextProvider.getModelPoolEntity("activityShop", (Integer)buyItem.getKey());
         if (activityShopModel == null || activityShopModel.getActivityType() == 8002) {
            iterator.remove();
            playerActivityDao.updateOp();
         }
      }

   }
}
