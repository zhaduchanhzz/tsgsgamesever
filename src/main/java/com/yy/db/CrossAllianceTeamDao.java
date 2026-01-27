package com.yy.db;

import com.gzbz.robot.RobotData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_alliance",
   dbType = 2,
   resultType = 2,
   selectKey = {"group"},
   mapKey = {"teamId"}
)
public class CrossAllianceTeamDao extends DBDao implements Cloneable {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      isPrimary = true,
      comment = "队伍id"
   )
   public int teamId;
   @DBColumnAnno(
      comment = "队长"
   )
   public int captain;
   @DBColumnAnno(
      comment = "队伍名称"
   )
   public String teamName;
   @DBColumnAnno(
      comment = "队伍战力"
   )
   public long power;
   @DBColumnAnno(
      comment = "队员阵型",
      columnType = "LONGTEXT",
      loadFun = "loadPlayerArraying",
      saveFun = "savePlayerArraying"
   )
   public Map<Integer, byte[]> playerArraying = new HashMap();
   @DBColumnAnno(
      comment = "排序playerId->isHide(0否/1是)",
      loadFun = "loadTeamArraying",
      saveFun = "saveTeamArraying"
   )
   public LinkedHashMap<Integer, Boolean> teamArraying = new LinkedHashMap();
   @DBColumnAnno(
      comment = "所属服务器ID"
   )
   public int server;
   @DBColumnAnno(
      comment = "是否已发放排行奖励"
   )
   public boolean isReward = false;
   @DBColumnAnno(
      comment = "创建队伍时间"
   )
   public int createTime = 0;
   @DBColumnAnno(
      comment = "队伍中的机器人",
      loadFun = "loadRobots",
      saveFun = "saveRobots",
      columnType = "LONGTEXT"
   )
   public Map<Integer, RobotData> robots = new HashMap();

   public void loadTeamArraying(String str) {
      this.teamArraying = (LinkedHashMap)JsonUtil.jsonToMap(str, Integer.class, Boolean.class, LinkedHashMap.class);
   }

   public String saveTeamArraying() {
      return JsonUtil.beanToJson(this.teamArraying);
   }

   public void loadPlayerArraying(String str) {
      this.playerArraying = JsonUtil.jsonToMap(str, Integer.class, byte[].class);
   }

   public String savePlayerArraying() {
      return JsonUtil.beanToJson(this.playerArraying);
   }

   public void loadRobots(String data) {
      this.robots = JsonUtil.jsonToMap(data, Integer.class, RobotData.class);
   }

   public String saveRobots() {
      return JsonUtil.beanToJson(this.robots);
   }

   public CrossAllianceTeamDao clone() {
      try {
         return (CrossAllianceTeamDao)super.clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
         return null;
      }
   }
}
