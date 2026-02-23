package com.gzbz.task;

import allMgr.PartAnnotation;
import com.gzbz.db.DuelDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.duel.DuelMgr;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.WuDaoTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.DuelBattleMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import com.gzbz.task.base.GlobalTaskPart;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.MiscUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DuelTaskPart extends AbstractTaskPart {
   public void trigger() {
      DuelMgr duelMgr = (DuelMgr)ApplicationContextProvider.getContext().getBean(DuelMgr.class);
      if (!duelMgr.isInvalid()) {
         int difDay = DateUtil.difftimeDay(new Timestamp(duelMgr.getStartTime()));
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         Map<Integer, Map<Integer, WuDaoTaskModel>> wuDaoTaskModelMap = ApplicationContextProvider.<Integer, Map<Integer, WuDaoTaskModel>>getModelPoolMap("customWudaoTask");
         List<TaskGroupData> taskGroupDataList = new ArrayList();
         Iterator var7 = wuDaoTaskModelMap.entrySet().iterator();

         while(true) {
            Map.Entry<Integer, Map<Integer, WuDaoTaskModel>> entry;
            int groupId;
            int endTime;
            int dayNum;
            while(true) {
               if (!var7.hasNext()) {
                  this.sendSeasonTask(taskGroupDataList);
                  return;
               }

               entry = (Map.Entry)var7.next();
               groupId = (Integer)entry.getKey();
               if (groupId == 1) {
                  endTime = DateUtil.getIntTime(DateUtil.getSomeDayEndTime(System.currentTimeMillis()));
                  dayNum = difDay + 1;
                  break;
               }

               if (groupId == 2) {
                  int week = difDay / 7 + 1;
                  endTime = DateUtil.getIntTime(DateUtil.getSomeDayEndTime(duelMgr.getStartTime() + (long)(week * 7 - 1) * 86400000L));
                  endTime = Math.min(endTime, DateUtil.getIntTime(duelMgr.getEndTime()));
                  dayNum = week;
                  break;
               }

               if (groupId == 3) {
                  endTime = DateUtil.getIntTime(duelMgr.getEndTime());
                  dayNum = 0;
                  break;
               }
            }

            TaskGroupData taskGroupData = (TaskGroupData)duelDao.taskGroupData.get(groupId);
            if (taskGroupData == null || taskGroupData.end < curTime) {
               taskGroupData = new TaskGroupData();
               taskGroupData.group = groupId;
               taskGroupData.end = endTime;
               duelDao.taskGroupData.put(entry.getKey(), taskGroupData);
               duelDao.updateOp();
               taskGroupDataList.add(taskGroupData);

               for(WuDaoTaskModel wuDaoTaskModel : (entry.getValue()).values()) {
                  TaskData taskData = this.getTask(wuDaoTaskModel.getId());
                  if (taskData != null) {
                     taskData.delete();
                  }
               }
            }

            for(WuDaoTaskModel wuDaoTaskModel : (entry.getValue()).values()) {
               if (wuDaoTaskModel.getDay() == dayNum) {
                  this.createTask(wuDaoTaskModel.getId());
               }
            }
         }
      }
   }

   public boolean checkComplete(TaskData taskData) {
      if (!super.checkComplete(taskData)) {
         return false;
      } else {
         WuDaoTaskModel wuDaoTaskModel = (WuDaoTaskModel)ApplicationContextProvider.getModelPoolEntity("wudaoTask", taskData.id);
         if (wuDaoTaskModel == null) {
            return false;
         } else {
            if (wuDaoTaskModel.getType() == 4) {
               taskData.finish();
            }

            return true;
         }
      }
   }

   public void commit(int taskId) {
      if (this.checkCommit(taskId)) {
         TaskData taskData = this.getTask(taskId);
         taskData.finish();
         WuDaoTaskModel wuDaoTaskModel = (WuDaoTaskModel)ApplicationContextProvider.getModelPoolEntity("wudaoTask", taskId);
         if (wuDaoTaskModel != null && wuDaoTaskModel.getType() != 4) {
            DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
            duelDao.point += wuDaoTaskModel.getPower();
            duelDao.updateOp();
            this.player.addResource(wuDaoTaskModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 76, 7603, taskId, 0, "");
         }
      }

      this.sendCommitTaskResult(taskId, 0L);
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      if (taskDataList != null && !taskDataList.isEmpty()) {
         DuelBattleMsg.S2C_TaskNotify_4506.Builder msg = DuelBattleMsg.S2C_TaskNotify_4506.newBuilder();

         for(TaskData taskData : taskDataList) {
            WuDaoTaskModel wuDaoTaskModel = (WuDaoTaskModel)ApplicationContextProvider.getModelPoolEntity("wudaoTask", taskData.id);
            if (wuDaoTaskModel != null) {
               msg.addTask(taskData.toBuilder());
            }
         }

         this.player.sendMsg(msg.build());
      }
   }

   protected CommonMsg.Task buildTask(TaskData taskData) {
      if (taskData == null) {
         return null;
      } else {
         CommonMsg.Task.Builder taskBuilder = CommonMsg.Task.newBuilder();
         taskBuilder.setTaskId(taskData.id);
         taskBuilder.setState(CommonMsg.TaskState.forNumber(taskData.state));
         taskBuilder.setTaskNum(taskData.tVal);
         return taskBuilder.build();
      }
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_DUEL;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      DuelBattleMsg.S2C_TaskCommit_4508.Builder msg = DuelBattleMsg.S2C_TaskCommit_4508.newBuilder();
      msg.setTaskId(taskId);
      msg.setPoint(duelDao.point);
      this.player.sendMsg(msg.build());
   }

   public TaskTargetItem getTargetItem(int taskId) {
      WuDaoTaskModel wuDaoTaskModel = (WuDaoTaskModel)ApplicationContextProvider.getModelPoolEntity("wudaoTask", taskId);
      return wuDaoTaskModel == null ? null : new TaskTargetItem(wuDaoTaskModel.getTargetType(), wuDaoTaskModel.getTargetId(), wuDaoTaskModel.getTargetValue());
   }

   public void sendSeasonTask(List<TaskGroupData> taskGroupData) {
      if (taskGroupData != null && !taskGroupData.isEmpty()) {
         Map<Integer, Map<Integer, WuDaoTaskModel>> wuDaoTaskModelMap = ApplicationContextProvider.<Integer, Map<Integer, WuDaoTaskModel>>getModelPoolMap("customWudaoTask");
         DuelBattleMsg.S2C_SeasonTask_4504.Builder msg = DuelBattleMsg.S2C_SeasonTask_4504.newBuilder();

         for(TaskGroupData groupData : taskGroupData) {
            CommonMsg.TaskGroup.Builder builder = groupData.buildMsg();
            Map<Integer, WuDaoTaskModel> groupTaskMap = (Map)wuDaoTaskModelMap.get(groupData.group);
            if (groupTaskMap != null) {
               for(int taskId : groupTaskMap.keySet()) {
                  TaskData taskData = this.getTask(taskId);
                  if (taskData != null) {
                     builder.addTask(taskData.toBuilder());
                  }
               }
            }

            msg.addTaskGroup(builder);
         }

         DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
         msg.setPoint(duelDao.point);
         msg.addAllGotBox(duelDao.taskBoxReward);
         this.player.sendMsg(msg.build());
      }
   }

   public void createShopTask() {
      DuelDao duelDao = (DuelDao)this.player.getData("tb_duel", this.player.getPlayerId());
      Map<Integer, Map<Integer, WuDaoTaskModel>> wuDaoTaskModelMap = ApplicationContextProvider.<Integer, Map<Integer, WuDaoTaskModel>>getModelPoolMap("customWudaoTask");
      if (wuDaoTaskModelMap != null && wuDaoTaskModelMap.containsKey(4)) {
         boolean updateFlag = false;
         TaskGroupData taskGroupData = (TaskGroupData)duelDao.taskGroupData.get(4);
         if (taskGroupData == null) {
            updateFlag = true;
            taskGroupData = new TaskGroupData();
            taskGroupData.group = 4;
            duelDao.taskGroupData.put(4, taskGroupData);
            duelDao.updateOp();
         }

         for(WuDaoTaskModel taskModel : (wuDaoTaskModelMap.get(4)).values()) {
            TaskData taskData = this.getTask(taskModel.getId());
            if (taskData == null) {
               updateFlag = true;
               taskData = this.createTask(taskModel.getId());
               long opValue = -1L;
               long historyHighRankKey = MiscUtil.comboInteger(1, taskModel.getTargetId());
               long historyCommonRankKey = MiscUtil.comboInteger(2, taskModel.getTargetId());
               Integer highRank = (Integer)duelDao.stageRank.get(historyHighRankKey);
               Integer commonRank = (Integer)duelDao.stageRank.get(historyCommonRankKey);
               switch (taskModel.getTargetType()) {
                  case 628:
                     if (highRank != null) {
                        opValue = (long)highRank;
                     }

                     if (commonRank != null && (highRank == null || opValue > (long)commonRank)) {
                        opValue = (long)commonRank;
                     }
                     break;
                  case 629:
                     if (highRank != null) {
                        opValue = (long)highRank;
                     }
                     break;
                  case 630:
                     if (commonRank != null) {
                        opValue = (long)commonRank;
                     }
               }

               if (opValue != -1L) {
                  GlobalTaskPart globalTaskPart = (GlobalTaskPart)this.player.getMgrPart(GlobalTaskPart.class);
                  globalTaskPart.handleTaskProcess(this, taskData, -1, opValue);
               }
            }
         }

         if (updateFlag) {
            List<TaskGroupData> taskGroupDataList = new ArrayList();
            taskGroupDataList.add(taskGroupData);
            this.sendSeasonTask(taskGroupDataList);
         }

      }
   }
}
