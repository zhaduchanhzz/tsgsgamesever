package com.gzbz.task;

import allMgr.PartAnnotation;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.countryWar.CountryWarPart;
import com.gzbz.db.CountryWarDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.CountryWarTaskModel;
import com.gzbz.model.fun.TaskTargetItem;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.AbstractTaskPart;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class CountryWarTaskPart extends AbstractTaskPart {
   @Autowired
   ConfigManager configManager;

   public void resetDaily() {
      List<Integer> countryWarOpenDateList = this.configManager.getIntList("countryWarOpenDate");
      if (!countryWarOpenDateList.isEmpty() && countryWarOpenDateList.size() >= 2) {
         long currentTime = System.currentTimeMillis();
         int day = DateUtil.dayInMonth();
         if (day >= (Integer)countryWarOpenDateList.get(0) && day <= (Integer)countryWarOpenDateList.get(1)) {
            CountryWarPart countryWarPart = (CountryWarPart)this.player.getMgrPart(CountryWarPart.class);
            CountryWarDao countryWarDao = countryWarPart.getCountryWarDao();
            if (countryWarDao != null) {
               this.reset(1);
               long startTime = countryWarPart.getCountryWarDao().startTime;
               int days = DateUtil.difftimeDay(new Timestamp(startTime));
               countryWarDao.dailyEndTime = DateUtil.getSomeDayEndTime(currentTime);
               int round = days / 5;
               if (round != 0 && currentTime >= countryWarDao.fiveEndTime) {
                  this.reset(2);
                  long endDay = countryWarDao.startTime + 86400000L * (long)round * 5L + 345600000L;
                  countryWarDao.fiveEndTime = DateUtil.getSomeDayEndTime(endDay);
               }

               int endDay = this.configManager.getIntDefault("countryWarSeasonEndDay", 26);
               long endTime = DateUtil.dayOfMonthEndTime(endDay);
               if (countryWarDao.seasonEndTime != endTime) {
                  countryWarDao.seasonEndTime = endTime;
               }

               countryWarDao.updateOp();
            }
         }
      }
   }

   public void sendTaskList(int type) {
   }

   public void trigger() {
      if (this.player.isSystemOpen(2020)) {
         Map<Integer, CountryWarTaskModel> countryWarTaskModelMap = this.player.getGameModelPool().getMap("countryWarTask");

         for(Map.Entry<Integer, CountryWarTaskModel> entry : countryWarTaskModelMap.entrySet()) {
            super.createTask((Integer)entry.getKey());
         }

      }
   }

   public void commit(int taskId) {
      CountryWarTaskModel model = (CountryWarTaskModel)ApplicationContextProvider.getModelPool().getEntity("countryWarTask", taskId);
      if (model == null) {
         this.player.failure(0);
      } else {
         TaskData taskData = this.getTask(taskId);
         if (taskData == null) {
            this.player.failure(0);
         } else {
            if (this.checkCommit(taskId)) {
               this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 3, 300, taskId, 0, "");
               taskData.finish();
            }

            this.sendCommitTaskResult(taskId, (long)taskData.cpTime);
         }
      }
   }

   public void sendTaskList(List<TaskData> taskDataList) {
      CountryWarPart countryWarPart = (CountryWarPart)this.player.getMgrPart(CountryWarPart.class);
      countryWarPart.updateTask(taskDataList);
   }

   protected GeneratedMessageV3 buildTask(TaskData taskData) {
      return null;
   }

   public TaskDefine.TaskModule getModule() {
      return TaskDefine.TaskModule.MODULE_COUNTRY_WAR;
   }

   protected void sendCommitTaskResult(int taskId, long completeTime) {
      CountryWarPart countryWarPart = (CountryWarPart)this.player.getMgrPart(CountryWarPart.class);
      countryWarPart.takeSuccess(taskId);
   }

   public TaskTargetItem getTargetItem(int taskId) {
      CountryWarTaskModel model = (CountryWarTaskModel)ApplicationContextProvider.getModelPool().getEntity("countryWarTask", taskId);
      return model != null && model.getTargets() != null ? (TaskTargetItem)model.getTargets().get(0) : null;
   }

   private void reset(int taskType) {
      Map<Integer, CountryWarTaskModel> countryWarTaskModelMap = ApplicationContextProvider.getModelPool().getMap("countryWarTask");
      Map<Integer, TaskData> tasks = this.getTasksMap();

      for(Map.Entry<Integer, TaskData> taskDaoEntry : tasks.entrySet()) {
         TaskData taskData = (TaskData)taskDaoEntry.getValue();
         if (!countryWarTaskModelMap.containsKey(taskData.id)) {
            taskData.delete();
         } else {
            CountryWarTaskModel model = (CountryWarTaskModel)ApplicationContextProvider.getModelPool().getEntity("countryWarTask", taskData.id);
            if (model == null || model.getType() == taskType) {
               taskData.delete();
            }
         }
      }

      this.trigger();
   }

   public void deleteTask() {
      Map<Integer, TaskData> tasks = this.getTasksMap();

      for(Map.Entry<Integer, TaskData> taskDaoEntry : tasks.entrySet()) {
         ((TaskData)taskDaoEntry.getValue()).delete();
      }

   }

   public void resetAllTask() {
      this.deleteTask();
      this.reset(1);
      this.reset(2);
      this.reset(3);
      this.reset(4);
   }

   public void levelUp(int preLv, int newLv) {
      this.trigger();
   }
}
