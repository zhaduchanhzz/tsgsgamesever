package com.gzbz.task.base;

import allMgr.PartAnnotation;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class GlobalTaskPart extends PlayerPart {
   public static final Map<Short, Map<Integer, Map<Integer, Set<Integer>>>> TRIGGERS = new ConcurrentHashMap();

   public static void initTriggers() {
      TRIGGERS.clear();
      Set<String> set = new HashSet();

      for(TaskDefine.TaskModule taskModule : TaskDefine.TaskModule.values()) {
         if (!set.contains(taskModule.excelName)) {
            Map<Integer, BaseModel> taskModelMap = ApplicationContextProvider.<Integer, BaseModel>getModelPoolMap(taskModule.excelName);
            if (taskModelMap != null) {
               for(BaseModel baseModel : taskModelMap.values()) {
                  baseModel.reloadTaskTrigger();
               }

               set.add(taskModule.excelName);
            }
         }
      }

   }

   public void triggerTask(int type, int target, long opValue, int op) {
      List<TaskData> notifyModuleTasks = new ArrayList();

      label56:
      for(AbstractTaskPart taskPart : this.player.getMgrParts(AbstractTaskPart.class)) {
         TaskDefine.TaskModule module = taskPart.getModule();
         Map<Integer, Set<Integer>> moduleTaskTypeMap = (Map)MapUtil.getOrDefault((Map)MapUtil.getOrDefault(TRIGGERS, module.moduleId, ConcurrentHashMap.class), type, ConcurrentHashMap.class);
         Iterator var11 = moduleTaskTypeMap.entrySet().iterator();

         while(true) {
            Map.Entry<Integer, Set<Integer>> moduleTaskTypeEntry;
            while(true) {
               if (!var11.hasNext()) {
                  if (!notifyModuleTasks.isEmpty()) {
                     taskPart.sendTaskList(notifyModuleTasks);
                     notifyModuleTasks.clear();
                  }
                  continue label56;
               }

               moduleTaskTypeEntry = (Map.Entry)var11.next();
               int targetId = (Integer)moduleTaskTypeEntry.getKey();
               if (op == 2) {
                  if (targetId < target) {
                     continue;
                  }
               } else if (op == 3) {
                  if (targetId > target) {
                     continue;
                  }
               } else if (targetId != target) {
                  continue;
               }
               break;
            }

            for(Integer taskId : (Set)moduleTaskTypeEntry.getValue()) {
               TaskData taskData = taskPart.getTask(taskId);
               if (taskData != null && taskData.state == CommonMsg.TaskState.STATE_DOING.getNumber() && this.handleTaskProcess(taskPart, taskData, op, opValue)) {
                  notifyModuleTasks.add(taskData);
               }
            }
         }
      }

   }

   public boolean handleTaskProcess(AbstractTaskPart taskPart, TaskData taskData, int op, long opValue) {
      TaskTargetItem taskTargetItem = taskPart.getTargetItem(taskData.id);
      if (taskTargetItem != null && taskTargetItem.getTargetType() > 0) {
         int curValue = taskData.tVal;
         int newValue = this.opValue(op, opValue, curValue, taskTargetItem);
         if (newValue != curValue) {
            taskData.tVal = newValue;
            taskData.updateOp();
            taskPart.checkComplete(taskData);
            return true;
         } else {
            return taskPart.checkComplete(taskData);
         }
      } else {
         return false;
      }
   }

   private int opValue(int op, long opValue, int currentValue, TaskTargetItem taskTargetItem) {
      switch (op) {
         case -1:
            if (opValue > 0L && (opValue < (long)currentValue || currentValue == 0) && opValue <= (long)taskTargetItem.getTargetValue()) {
               return taskTargetItem.getTargetValue();
            }
            break;
         case 0:
            if (opValue > (long)currentValue) {
               return (int)Math.min(opValue, (long)taskTargetItem.getTargetValue());
            }
            break;
         case 1:
         case 2:
         case 3:
            return (int)Math.min((long)currentValue + opValue, (long)taskTargetItem.getTargetValue());
         default:
            throw new RuntimeException("非法请求,不存在的操作:" + op);
      }

      return currentValue;
   }

   public int getLoginPriority() {
      return 2;
   }

   public void loginHandle() {
      for(AbstractTaskPart abstractTaskPart : this.player.getMgrParts(AbstractTaskPart.class)) {
         for(TaskData taskData : abstractTaskPart.getTasksMap().values()) {
            TaskTargetItem taskTargetItem = abstractTaskPart.getTargetItem(taskData.id);
            if (taskTargetItem == null) {
               this.logger.error("无法找到{}模块的任务{}的触发条件,移除任务", abstractTaskPart.getModule(), taskData.id);
               taskData.delete();
            } else if (taskData.state <= 1) {
               if (taskData.state == 0) {
                  taskData.state = 1;
                  taskData.updateOp();
               }

               if (taskData.state == 1) {
                  abstractTaskPart.initTaskProcess(taskData);
               }
            }
         }
      }

   }

   public boolean loginHandleAsync() {
      return true;
   }

   public void resetHour() {
      int cHour = DateUtil.cHour();
      if (cHour > 0) {
         this.player.triggerTask(619, 0, 1L, 1);
      }

   }

   public void resetDaily() {
      List<AbstractTaskPart> taskParts = this.player.<AbstractTaskPart>getMgrParts(AbstractTaskPart.class);
      Map<Integer, AbstractTaskPart> taskPartMap = new HashMap();

      for(AbstractTaskPart taskPart : taskParts) {
         taskPartMap.put(Integer.valueOf(taskPart.getModule().moduleId), taskPart);
      }

      for(Map.Entry<Short, Map<Integer, Map<Integer, Set<Integer>>>> entry_1 : TRIGGERS.entrySet()) {
         int module = (Short)entry_1.getKey();
         if (taskPartMap.containsKey(module)) {
            AbstractTaskPart abstractTaskPart = (AbstractTaskPart)taskPartMap.get(module);
            Map<Integer, Set<Integer>> targetTaskMap = (Map)MapUtil.getOrDefault((Map)entry_1.getValue(), 619, ConcurrentHashMap.class);
            if (!targetTaskMap.isEmpty()) {
               List<TaskData> notifyTasks = new ArrayList();

               for(Set<Integer> taskIds : targetTaskMap.values()) {
                  for(int taskId : taskIds) {
                     TaskData taskData = abstractTaskPart.getTask(taskId);
                     if (taskData != null) {
                        taskData.tVal = 0;
                        taskData.updateOp();
                        notifyTasks.add(taskData);
                     }
                  }
               }

               abstractTaskPart.sendTaskList(notifyTasks);
            }
         }
      }

   }
}
