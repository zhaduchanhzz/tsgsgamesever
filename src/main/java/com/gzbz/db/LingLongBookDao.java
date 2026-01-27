package com.gzbz.db;

import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import com.gzbz.db.bean.TaskGroupData;
import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_ling_long_book",
   resultType = 0,
   selectKey = {"playerId"}
)
public class LingLongBookDao extends AddUpAndConBaseDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "玲珑宝典等级"
   )
   public int level;
   @DBColumnAnno(
      comment = "通行证任务数据",
      columnType = "LONGTEXT",
      loadFun = "loadTaskGroup",
      saveFun = "saveTaskGroup"
   )
   public Map<Integer, TaskGroupData> taskGroup = new HashMap();

   public void loadTaskGroup(String data) {
      this.taskGroup = new HashMap();
      if (!StringUtils.isEmpty(data)) {
         String[] split = data.split("\\|");

         for(String str : split) {
            String[] arr = str.split("_");
            TaskGroupData taskGroupData = new TaskGroupData(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            this.taskGroup.put(taskGroupData.group, taskGroupData);
         }
      }

   }

   public String saveTaskGroup() {
      StringBuilder stringBuilder = new StringBuilder();

      for(TaskGroupData taskGroupData : this.taskGroup.values()) {
         stringBuilder.append(taskGroupData.group).append("_").append(taskGroupData.end).append("|");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
