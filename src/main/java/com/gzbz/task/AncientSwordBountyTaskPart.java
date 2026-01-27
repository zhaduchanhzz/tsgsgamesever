package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.AncientSwordDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.AncientSwordBountyTaskModel;
import com.gzbz.model.AncientSwordMonthAwardModel;
import com.gzbz.protobuf.AncientSwordMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractFunctionTaskPart;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class AncientSwordBountyTaskPart extends AbstractFunctionTaskPart {
   protected int rewardReason() {
      return 14701;
   }

   protected int getActivityType() {
      return 106;
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      AncientSwordDao dao = (AncientSwordDao)this.player.getData("tb_ancient_sword", this.player.getPlayerId());
      AncientSwordMsg.S2C_AncientSwordCommitTask_24608.Builder builder = AncientSwordMsg.S2C_AncientSwordCommitTask_24608.newBuilder();
      builder.addAllBuffId(dao.buffs);
      builder.setActiveValue(dao.activeValue);
      builder.addAllTask(this.buildTasks(taskDataList, true));
      this.player.sendMsg(builder.build());
   }

   public boolean commitTask(int taskId, boolean isSend) {
      TaskData taskData = this.getTask(taskId);
      if (taskData == null) {
         return false;
      } else if (taskData.state != CommonMsg.TaskState.STATE_COMPLETE.getNumber()) {
         return false;
      } else if (super.commitTask(taskId, isSend)) {
         AncientSwordBountyTaskModel taskModel = (AncientSwordBountyTaskModel)this.player.getGameModelPool().getEntity(this.getModule().excelName, taskId);
         AncientSwordDao dao = (AncientSwordDao)this.player.getData("tb_ancient_sword", this.player.getPlayerId());
         if (taskModel.getBuffId() != 0) {
            dao.buffs.add(taskModel.getBuffId());
         }

         int oldAct = dao.activeValue;
         dao.activeValue += taskModel.getActive();
         dao.updateOp();
         int newAct = dao.activeValue;
         String[] logStr = new String[3];
         logStr[0] = "剑冢-悬赏任务";
         logStr[1] = "完成任务id: " + taskId;
         logStr[2] = "活跃 +" + taskModel.getActive();
         this.player.getOperationMgr().addExtraLog(this.player, 16, logStr);
         Map<Integer, AncientSwordMonthAwardModel> map = ApplicationContextProvider.<Integer, AncientSwordMonthAwardModel>getModelPoolMap("AncientSwordMonthAward");
         int oldMax = 0;
         int newMax = 0;

         for(AncientSwordMonthAwardModel value : map.values()) {
            if (oldAct >= value.getActive()) {
               oldMax = Math.max(oldMax, value.getActive());
            }

            if (newAct >= value.getActive()) {
               newMax = Math.max(newMax, value.getActive());
            }
         }

         if (newMax > oldMax) {
            logStr[0] = "剑冢-活跃度";
            logStr[1] = "活跃度: " + newMax;
            logStr[2] = "活跃度: " + newMax;
            this.player.getOperationMgr().addExtraLog(this.player, 16, logStr);
         }

         this.sendTaskList((List)null);
         return false;
      } else {
         return true;
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_ANCIENT_SWORD_BOUNTY;
   }
}
