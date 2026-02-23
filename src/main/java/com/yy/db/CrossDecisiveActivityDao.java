package com.yy.db;

import com.gzbz.activity.bean.ActivityInfo;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.MapUtil;

@DBTableAnno(
   name = "tb_cross_decisive_activity"
)
public class CrossDecisiveActivityDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      comment = "服务器活动信息activityType->(server->activityInfo))",
      columnType = "LONGTEXT",
      loadFun = "loadActivities",
      saveFun = "saveActivities"
   )
   public Map<Integer, Map<Integer, ActivityInfo>> activities = new HashMap();

   public void loadActivities(String data) {
      String[] dataArr = data.split(" ");

      for(String activityData : dataArr) {
         String[] activityDataArr = activityData.split("=");
         int activityId = Integer.parseInt(activityDataArr[0]);
         String[] serverActivityDataArr = activityDataArr[1].split("\\|");

         for(String serverActivityData : serverActivityDataArr) {
            String[] fieldArr = serverActivityData.split(":");
            int serverId = Integer.parseInt(fieldArr[0]);
            String[] activityField = fieldArr[1].split("_");
            ActivityInfo activityInfo = new ActivityInfo();
            activityInfo.drop = Integer.parseInt(activityField[0]);
            activityInfo.end = Integer.parseInt(activityField[1]);
            activityInfo.dropping = Boolean.parseBoolean(activityField[2]);
            ((Map)MapUtil.computeIfAbsent(this.activities, activityId, HashMap.class)).put(serverId, activityInfo);
         }
      }

   }

   public String saveActivities() {
      StringBuilder stringBuffer = new StringBuilder();

      for(Map.Entry<Integer, Map<Integer, ActivityInfo>> entry : this.activities.entrySet()) {
         stringBuffer.append(entry.getKey()).append("=");

         for(Map.Entry<Integer, ActivityInfo> subEntry : (entry.getValue()).entrySet()) {
            ActivityInfo activityInfo = (ActivityInfo)subEntry.getValue();
            stringBuffer.append(subEntry.getKey()).append(":");
            stringBuffer.append(activityInfo.drop).append("_");
            stringBuffer.append(activityInfo.end).append("_");
            stringBuffer.append(activityInfo.dropping);
            stringBuffer.append("|");
         }

         stringBuffer.deleteCharAt(stringBuffer.length() - 1);
         stringBuffer.append(" ");
      }

      if (stringBuffer.length() > 0) {
         stringBuffer.deleteCharAt(stringBuffer.length() - 1);
      }

      return stringBuffer.toString();
   }
}
