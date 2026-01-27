package com.gzbz.gameCache;

import cache.CachePool;
import cache.CustomCacheData;
import cache.CustomCachePoolAnno;
import com.gzbz.db.TaskDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

@CustomCachePoolAnno(
   tbName = "tb_task"
)
public class TaskCustomCache extends CustomCacheData<TaskDao> {
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final Map<Short, Map<Integer, TaskData>> tasks = new ConcurrentHashMap();
   private TaskDao taskDao;

   public void add(TaskData taskData) {
      ((Map)this.tasks.computeIfAbsent(taskData.module, (v) -> new ConcurrentHashMap())).put(taskData.id, taskData);
      this.updateOp();
   }

   public void delete(TaskData taskData) {
      if (taskData != null) {
         short module = taskData.module;
         Map<Integer, TaskData> moduleTasksMap = (Map)this.tasks.get(module);
         if (moduleTasksMap != null) {
            moduleTasksMap.remove(taskData.id);
            if (moduleTasksMap.isEmpty()) {
               this.tasks.remove(module);
            }

            this.updateOp();
         }
      }
   }

   public void delete(TaskDefine.TaskModule module) {
      this.tasks.remove(module.moduleId);
      this.updateOp();
   }

   public Map<Integer, TaskData> getMap(TaskDefine.TaskModule module) {
      return (Map)this.tasks.getOrDefault(module.moduleId, new ConcurrentHashMap());
   }

   public TaskData getTask(TaskDefine.TaskModule module, int taskId) {
      Map<Integer, TaskData> taskDataMap = this.getMap(module);
      TaskData taskData = (TaskData)taskDataMap.get(taskId);
      if (taskData == null) {
         this.logger.error("任务{}不存在", taskId);
      }

      return taskData;
   }

   public void updateOp() {
      this.taskDao.updateOp();
   }

   public void load(CachePool pool, List<TaskDao> list, Object... arg) {
      if (list.size() == 0) {
         this.taskDao = new TaskDao();
         this.taskDao.playerId = (Integer)arg[0];
         this.taskDao.insertOp();
      } else {
         this.taskDao = (TaskDao)list.get(0);
         this.loadTasks();
         this.loadTasksData();
         if (this.taskDao.tasksData == null || this.taskDao.tasksData.length == 0 && !this.tasks.isEmpty()) {
            this.saveTasksData();
            this.taskDao.tasks = null;
            this.updateOp();
         }

         this.taskDao.tasksData = null;
      }
   }

   public List<TaskDao> save() {
      List<TaskDao> taskDaoList = new ArrayList();
      TaskDao taskDao = new TaskDao();
      taskDao.playerId = this.taskDao.playerId;
      taskDao.tasksData = this.saveTasksData();
      switch (this.taskDao.getOp()) {
         case 1:
            taskDao.insertOp();
            break;
         case 2:
            taskDao.updateOp();
            break;
         default:
            taskDao.noneOp();
      }

      taskDaoList.add(taskDao);
      this.taskDao.noneOp();
      return taskDaoList;
   }

   public void unload(CachePool pool) {
      this.tasks.clear();
   }

   private void loadTasks() {
      try {
         String tasksStr = this.taskDao.tasks;
         if (StringUtils.isEmpty(tasksStr)) {
            return;
         }

         String[] taskModuleArr = tasksStr.split("#");
         short module = 0;

         for(String taskModuleStr : taskModuleArr) {
            if (!StringUtils.isEmpty(taskModuleStr)) {
               if (taskModuleStr.startsWith("module")) {
                  String[] moduleArr = taskModuleStr.split("=");
                  module = Short.parseShort(moduleArr[1]);
               } else if (module > 0) {
                  String[] taskStrArr = taskModuleStr.split("\u0001");

                  for(String taskStr : taskStrArr) {
                     if (!StringUtils.isEmpty(taskStr)) {
                        TaskData taskData = new TaskData();
                        String[] allTaskFieldArr = taskStr.split("_");

                        for(String taskFieldStr : allTaskFieldArr) {
                           String[] taskFieldArr = taskFieldStr.split("=");

                           try {
                              Field field = taskData.getClass().getField(taskFieldArr[0]);
                              field.setInt(taskData, Integer.parseInt(taskFieldArr[1]));
                           } catch (Exception var21) {
                           }
                        }

                        taskData.module = module;
                        taskData.player = this.taskDao.playerId;
                        this.add(taskData);
                     }
                  }
               }
            }
         }
      } catch (Exception e) {
         this.logger.error("解析任务数据出错:{}", e.getMessage(), e);
      }

   }

   private void loadTasksData() {
      if (this.taskDao.tasksData != null && this.taskDao.tasksData.length != 0) {
         int taskCount = this.taskDao.tasksData.length / 11 / 4;
         ByteBuffer byteBuffer = ByteBuffer.wrap(this.taskDao.tasksData);

         for(int i = 0; i < taskCount; ++i) {
            TaskData taskData = new TaskData();
            taskData.module = (short)byteBuffer.getInt();
            taskData.player = byteBuffer.getInt();
            taskData.id = byteBuffer.getInt();
            taskData.tVal = byteBuffer.getInt();
            taskData.count = (short)byteBuffer.getInt();
            taskData.state = (byte)byteBuffer.getInt();
            taskData.acTime = byteBuffer.getInt();
            taskData.cpTime = byteBuffer.getInt();
            taskData.ctTime = byteBuffer.getInt();
            byteBuffer.getInt();
            byteBuffer.getInt();
            this.add(taskData);
         }

      }
   }

   private byte[] saveTasksData() {
      int taskCount = this.tasks.values().stream().mapToInt(Map::size).sum();
      ByteBuffer byteBuffer = ByteBuffer.allocate(11 * taskCount * 4);

      for(Map<Integer, TaskData> taskDataMap : this.tasks.values()) {
         for(TaskData taskData : taskDataMap.values()) {
            byteBuffer.putInt(taskData.module);
            byteBuffer.putInt(taskData.player);
            byteBuffer.putInt(taskData.id);
            byteBuffer.putInt(taskData.tVal);
            byteBuffer.putInt(taskData.count);
            byteBuffer.putInt(taskData.state);
            byteBuffer.putInt(taskData.acTime);
            byteBuffer.putInt(taskData.cpTime);
            byteBuffer.putInt(taskData.ctTime);
            byteBuffer.putInt(0);
            byteBuffer.putInt(0);
         }
      }

      return byteBuffer.array();
   }

   private void saveTasks() {
      StringBuilder stringBuilder = new StringBuilder();

      try {
         for(Map.Entry<Short, Map<Integer, TaskData>> taskEntry : this.tasks.entrySet()) {
            stringBuilder.append("#module=").append(taskEntry.getKey()).append("#");

            for(TaskData taskData : ((Map)taskEntry.getValue()).values()) {
               for(Field field : taskData.getClass().getFields()) {
                  if (!field.getName().contains("module") && !field.getName().contains("player")) {
                     stringBuilder.append(field.getName()).append("=").append(field.getInt(taskData)).append("_");
                  }
               }

               stringBuilder.deleteCharAt(stringBuilder.length() - 1);
               stringBuilder.append("\u0001");
            }

            if (!((Map)taskEntry.getValue()).isEmpty()) {
               stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
         }
      } catch (Exception e) {
         this.logger.error("组装任务数据出错:{}", e.getMessage(), e);
      }

      this.taskDao.tasks = stringBuilder.toString();
   }
}
