package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivitySpecialTaskPart;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SpecialTaskActivityPart extends AbstractActivityPart {
   @MsgHandlerAnno
   public void C2S_SpecialTaskActivity_6741(ActivityMsg.C2S_SpecialTaskActivity_6741 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_SpecialTaskCommitTask_6753(ActivityMsg.C2S_SpecialTaskCommitTask_6753 msg, String source) {
      int taskId = msg.getTaskId();
      ActivitySpecialTaskPart activitySpecialTaskPart = (ActivitySpecialTaskPart)this.player.getMgrPart(ActivitySpecialTaskPart.class);
      activitySpecialTaskPart.commit(taskId);
   }

   public void addPoint(int activityId, int point) {
      if (this.isActivityTime(activityId) && point > 0) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         playerActivityDao.specialTaskPoint += point;
         playerActivityDao.updateOp();
         RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
         rankPart.updateRank(RankDefine.RankModule.ACTIVITY_POINT, (long)playerActivityDao.specialTaskPoint, false, this.getActivityType() + ":" + this.getPlayerActivityId());
      }

   }

   public void sendInfo() {
      ActivitySpecialTaskPart activitySpecialTaskPart = (ActivitySpecialTaskPart)this.player.getMgrPart(ActivitySpecialTaskPart.class);
      activitySpecialTaskPart.sendInfo();
   }

   public int getActivityType() {
      return 2;
   }

   public void rotateReset(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACTIVITY_SPECIAL);
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.specialTaskPoint = 0;
      playerActivityDao.updateOp();
      ActivitySpecialTaskPart activitySpecialTaskPart = (ActivitySpecialTaskPart)this.player.getMgrPart(ActivitySpecialTaskPart.class);
      activitySpecialTaskPart.trigger();
   }

   public boolean isActivityTime(int activityId) {
      return activityId == this.getPlayerActivityId();
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      if (!mainOpen) {
         List<ResourceModel> resourceModels = new ArrayList();
         ActivitySpecialTaskPart activitySpecialTaskPart = (ActivitySpecialTaskPart)this.player.getMgrPart(ActivitySpecialTaskPart.class);

         for(TaskData taskData : activitySpecialTaskPart.getTasksMap().values()) {
            if (taskData.state != 3) {
               SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", taskData.id);
               if (sevenDaysTaskModel != null) {
                  for(ResourceModel reward : sevenDaysTaskModel.getRewards()) {
                     reward.addResourceToList(resourceModels);
                  }

                  taskData.finish();
               }
            }
         }

         int mailType = 0;
         switch (this.getPlayerActivityId()) {
            case 1150:
               mailType = CentreAwardModel.TYPE_MERGE_CUT_ACT_REWARD;
               break;
            case 1170:
               mailType = CentreAwardModel.TYPE_MERGE_QIYU_ACT_REWARD;
               break;
            case 1190:
               mailType = CentreAwardModel.TYPE_MERGE_FAST_ACT_REWARD;
               break;
            case 1210:
               mailType = CentreAwardModel.TYPE_MERGE_GOLD_ACT_REWARD;
               break;
            case 1211:
               mailType = CentreAwardModel.TYPE_MERGE_HL_ACT_REWARD;
         }

         this.sendMergeMail(mailType, resourceModels);
      }
   }
}
