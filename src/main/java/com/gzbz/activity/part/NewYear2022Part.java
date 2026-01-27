package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.NewYear2022TaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.NewYear2022Msg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.NewYear2022TaskPart;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class NewYear2022Part extends AbstractActivityPart {
   public static final int TASK_TIME_TYPE_DAILY = 1;
   public static final int TASK_TIME_TYPE_LI_YU = 2;

   public void sendInfo() {
   }

   public int getActivityType() {
      return 65;
   }

   public void rotateReset(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_NEW_YEAR_2022);
      NewYear2022TaskPart newYear2022TaskPart = (NewYear2022TaskPart)this.player.getMgrPart(NewYear2022TaskPart.class);
      newYear2022TaskPart.trigger();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.setForever(15, 0);
   }

   public void activityEnd(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_NEW_YEAR_2022);
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         if (this.getSeverActivityDay() != 1) {
            if (!this.inServerActDropTime()) {
               TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
               taskCustomCache.delete(TaskDefine.TaskModule.MODULE_NEW_YEAR_2022);
            } else {
               NewYear2022TaskPart newYear2022TaskPart = (NewYear2022TaskPart)this.player.getMgrPart(NewYear2022TaskPart.class);
               newYear2022TaskPart.trigger();
            }
         }
      }
   }

   public void loginHandle() {
   }

   @MsgHandlerAnno
   public void C2S_NewYearDailyTask_18001(NewYear2022Msg.C2S_NewYearDailyTask_18001 msg, String source) {
      NewYear2022Msg.S2C_NewYearDailyTask_18002.Builder resp = NewYear2022Msg.S2C_NewYearDailyTask_18002.newBuilder();
      resp.addAllTask(this.getTaskListMsg(1));
      resp.setActDay(this.getSeverActivityDay());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      resp.setAlreadyBuy((Integer)playerResetCustomCache.getForeverNum(15, 0));
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_NewYearLiYuTask_18003(NewYear2022Msg.C2S_NewYearLiYuTask_18003 msg, String source) {
      NewYear2022Msg.S2C_NewYearLiYuTask_18004.Builder resp = NewYear2022Msg.S2C_NewYearLiYuTask_18004.newBuilder();
      resp.addAllTask(this.getTaskListMsg(2));
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_NewYearTaskCommit_18007(NewYear2022Msg.C2S_NewYearTaskCommit_18007 msg, String source) {
      if (!this.inServerActDropTime()) {
         this.player.failure(8007);
      } else {
         NewYear2022TaskPart newYear2022TaskPart = (NewYear2022TaskPart)this.player.getMgrPart(NewYear2022TaskPart.class);
         newYear2022TaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_NewYearBuyIntegral_18009(NewYear2022Msg.C2S_NewYearBuyIntegral_18009 msg, String source) {
      if (!this.inServerActDropTime()) {
         if (msg.getNum() > 0) {
            String[] buyConfig = ApplicationContextProvider.getConfigString("xinChunPoint", "2|1217|1,1|9|10,1500").split(",");
            ResourceModel feeRes = ResourceModel.buildResource(buyConfig[1]);
            if (!ResourceModel.checkTotalNumError(feeRes.getValue(), msg.getNum())) {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               int integralTotalBuy = (Integer)playerResetCustomCache.getForeverNum(15, 0);
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
                        this.player.delResource(feeRes, 82, 8220, msg.getNum(), 0, "");
                        this.player.addResource(addRes, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 82, 8220, msg.getNum(), 0, "");
                        playerResetCustomCache.setForever(15, integralTotalBuy + msg.getNum());
                        NewYear2022Msg.S2C_NewYearBuyIntegral_18010.Builder resp = NewYear2022Msg.S2C_NewYearBuyIntegral_18010.newBuilder();
                        resp.setNum(msg.getNum());
                        resp.setAlreadyBuy((Integer)playerResetCustomCache.getForeverNum(15, 0));
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
      NewYear2022TaskPart newYear2022TaskPart = (NewYear2022TaskPart)this.player.getMgrPart(NewYear2022TaskPart.class);

      for(TaskData taskData : newYear2022TaskPart.getTasksMap().values()) {
         NewYear2022TaskModel newYear2022TaskModel = (NewYear2022TaskModel)ApplicationContextProvider.getModelPoolEntity("xinChunTask", taskData.id);
         if (newYear2022TaskModel != null && newYear2022TaskModel.getTime() == taskTimeType) {
            builderList.add(taskData.toBuilder().build());
         }
      }

      return builderList;
   }
}
