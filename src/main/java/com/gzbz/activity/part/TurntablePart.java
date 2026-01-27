package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.TurntableDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.TurntableActivityTaskModel;
import com.gzbz.model.TurntableRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TurntableMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.TurntableTaskPart;
import com.gzbz.util.TempUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TurntablePart extends AbstractActivityPart {
   @Autowired
   private ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_TurntableMain_23801(TurntableMsg.C2S_TurntableMain_23801 msg, String source) {
      this.sendInfo();
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         TurntableDao dao = this.getDao();
         TurntableMsg.S2C_TurntableMain_23802.Builder builder = TurntableMsg.S2C_TurntableMain_23802.newBuilder();
         builder.setMaxRound(dao.maxRound);
         builder.addAllDrawData(dao.buildDrawData());
         TurntableTaskPart taskPart = (TurntableTaskPart)this.player.getMgrPart(TurntableTaskPart.class);
         builder.addAllTaskList(taskPart.getTasks((List)null));
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_TurntableCommitTask_23803(TurntableMsg.C2S_TurntableCommitTask_23803 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         TurntableTaskPart taskPart = (TurntableTaskPart)this.player.getMgrPart(TurntableTaskPart.class);
         taskPart.commit(msg.getTaskId());
         taskPart.sendTaskList((List)null);
      }
   }

   @MsgHandlerAnno
   public void C2S_TurntableDraw_23805(TurntableMsg.C2S_TurntableDraw_23805 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ResourceModel consume = ResourceModel.buildResource(this.configManager.getStrByDefault("krTurntableItem", "2|4991|1"));
         if (!this.player.checkResourceNum(consume)) {
            this.player.failure(3);
         } else {
            TurntableDao dao = this.getDao();
            String preConfig = this.configManager.getStrByDefault("krTurntableTime", "8|8|8");
            String[] split = preConfig.split("\\|");
            List<Integer> list = (List)dao.drawRewardMap.get(msg.getDrawRound() - 1);
            if (msg.getDrawRound() <= 1 || !CollectionUtils.isEmpty(list) && list.size() >= Integer.parseInt(split[msg.getDrawRound() - 2])) {
               List<Integer> rewards = (List)dao.drawRewardMap.computeIfAbsent(msg.getDrawRound(), (k) -> new ArrayList());
               Map<Integer, TurntableRewardModel> map = ApplicationContextProvider.<Integer, TurntableRewardModel>getModelPoolMap("krTurntableDraw");
               Map<TurntableRewardModel, Integer> weightMap = new HashMap();

               for(TurntableRewardModel model : map.values()) {
                  if (model.getWheel() == msg.getDrawRound() && model.getTime() <= rewards.size() && (model.getType() != 1 || !rewards.contains(model.getId()))) {
                     weightMap.put(model, model.getWeight());
                  }
               }

               TurntableRewardModel model = (TurntableRewardModel)TempUtil.getOneForMap(weightMap);
               if (model == null) {
                  this.player.failure(6);
               } else {
                  this.player.delResource(consume, 139, 13903, 0, 0, "");
                  this.player.addResource(model.getItem(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 139, 13902, 0, 0, "");
                  rewards.add(model.getId());
                  dao.updateOp();
                  this.player.sendMsg(TurntableMsg.S2C_TurntableDraw_23806.newBuilder().setReward(model.getId()).build());
                  if (dao.maxRound == msg.getDrawRound() && dao.maxRound <= split.length && rewards.size() >= Integer.parseInt(split[dao.maxRound - 1])) {
                     ++dao.maxRound;
                     dao.updateOp();
                     this.sendInfo();
                  }

               }
            } else {
               this.player.failure(6);
            }
         }
      }
   }

   public int getActivityType() {
      return 100;
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         this.sendEverydayTaskReward();
      }
   }

   private void sendEverydayTaskReward() {
      TurntableTaskPart taskPart = (TurntableTaskPart)this.player.getMgrPart(TurntableTaskPart.class);
      ArrayList<ResourceModel> reissueList = new ArrayList();

      for(TaskData taskData : taskPart.getTasksMap().values()) {
         TurntableActivityTaskModel taskModel = (TurntableActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("krTurntableTask", taskData.id);
         if (taskModel != null) {
            if (taskData.state == CommonMsg.TaskState.STATE_COMPLETE.getNumber()) {
               ResourceModel.addResourceToList(reissueList, taskModel.getRewards());
               taskData.state = (byte)CommonMsg.TaskState.STATE_FINISH.getNumber();
            }

            if (taskModel.getTime() == 1) {
               taskPart.resetTask(taskData);
            }
         }
      }

      if (!CollectionUtils.isEmpty(reissueList)) {
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel awardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.TYPE_TURNTABLE_TASK_REWARD);
         if (awardModel != null) {
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, awardModel.getTitle(), awardModel.getDesc(), reissueList, 604800000L, 139, 13904);
         }
      }

      taskPart.sendTaskList((List)null);
   }

   public void activityEnd(int oldActivityId) {
      this.sendEverydayTaskReward();
      this.getDao().clear();
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_ACT_TURNTABLE);
   }

   public TurntableDao getDao() {
      return (TurntableDao)this.player.getData("tb_activity_turntable", this.player.getPlayerId());
   }

   public void gmOp(String order) {
      String[] split = order.split(",");
      switch (split[0]) {
         case "t1":
            this.C2S_TurntableMain_23801((TurntableMsg.C2S_TurntableMain_23801)null, (String)null);
            break;
         case "t2":
            int taskId = Integer.parseInt(split[1]);
            this.C2S_TurntableCommitTask_23803(TurntableMsg.C2S_TurntableCommitTask_23803.newBuilder().setTaskId(taskId).build(), (String)null);
            break;
         case "t3":
            int round = Integer.parseInt(split[1]);
            this.C2S_TurntableDraw_23805(TurntableMsg.C2S_TurntableDraw_23805.newBuilder().setDrawRound(round).build(), (String)null);
            break;
         case "clean":
            TurntableDao dao = this.getDao();
            dao.clear();
            break;
         default:
            this.player.failure(0);
      }

      this.sendInfo();
      this.player.failure(1);
   }
}
