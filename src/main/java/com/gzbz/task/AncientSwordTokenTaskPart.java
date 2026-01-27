package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.AncientSwordMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.task.base.AbstractFunctionTaskPart;
import com.gzbz.war.ancientSword.AncientSwordPart;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class AncientSwordTokenTaskPart extends AbstractFunctionTaskPart {
   protected int rewardReason() {
      return 14702;
   }

   protected int getActivityType() {
      return 106;
   }

   public void commit(int taskId) {
      if (this.checkTaskConfig(taskId)) {
         this.logger.error("任务模块{},提交任务{}配置不存在", this.getModule(), taskId);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (this.checkCommit(taskId)) {
            List<ResourceModel> rewards = this.getRewards(taskId);
            if (!CollectionUtils.isEmpty(rewards)) {
               int addIntegral = 0;
               Iterator<ResourceModel> iterator = rewards.iterator();

               while(iterator.hasNext()) {
                  ResourceModel resourceModel = (ResourceModel)iterator.next();
                  if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_ANCIENT_SWORD_POINT) {
                     addIntegral += resourceModel.getValue();
                     iterator.remove();
                  }
               }

               AncientSwordPart ancientSwordPart = (AncientSwordPart)this.player.getMgrPart(AncientSwordPart.class);
               ancientSwordPart.tokenSendReward(0, addIntegral, false);
               if (!CollectionUtils.isEmpty(rewards)) {
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, this.rewardReason(), taskId, 0, "");
               }

               taskData.finish();
            }

            this.sendTaskList((List)null);
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      this.player.sendMsg(AncientSwordMsg.S2C_AncientSwordCommitTask_24614.newBuilder().addAllTask(this.buildTasks(taskDataList, true)).build());
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ANCIENT_SWORD_TOKEN;
   }
}
