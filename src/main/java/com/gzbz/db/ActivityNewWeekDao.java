package com.gzbz.db;

import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import com.gzbz.db.bean.TaskGroupData;
import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_activity_new_week",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityNewWeekDao extends AddUpAndConBaseDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "琉璃宝鉴等级"
   )
   public int treasureLv;
   @DBColumnAnno(
      comment = "通行证任务数据",
      columnType = "LONGTEXT",
      loadFun = "loadTreasureTaskGroup",
      saveFun = "saveTreasureTaskGroup"
   )
   public Map<Integer, TaskGroupData> treasureTaskGroup = new HashMap();

   public void loadTreasureTaskGroup(String data) {
      this.treasureTaskGroup = new HashMap();
      if (!StringUtils.isEmpty(data)) {
         String[] split = data.split("\\|");

         for(String str : split) {
            String[] arr = str.split("_");
            TaskGroupData taskGroupData = new TaskGroupData(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            this.treasureTaskGroup.put(taskGroupData.group, taskGroupData);
         }
      }

   }

   public String saveTreasureTaskGroup() {
      StringBuilder stringBuilder = new StringBuilder();

      for(TaskGroupData taskGroupData : this.treasureTaskGroup.values()) {
         stringBuilder.append(taskGroupData.group).append("_").append(taskGroupData.end).append("|");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
