package com.gzbz.db;

import com.gzbz.robot.RobotData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_alliance_team",
   resultType = 5,
   mapKey = {"teamId"}
)
public class AllianceTeamDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "队伍ID"
   )
   public int teamId;
   @DBColumnAnno(
      comment = "队长ID"
   )
   public int captain;
   @DBColumnAnno(
      comment = "队伍名"
   )
   public String name;
   @DBColumnAnno(
      comment = "入队最低战力配置下标"
   )
   public int minPower;
   @DBColumnAnno(
      comment = "入队最低等级配置下标"
   )
   public int minLevel;
   @DBColumnAnno(
      comment = "是否需要审核"
   )
   public boolean needVerify;
   @DBColumnAnno(
      comment = "队伍中的玩家,排序playerId->isHide(0否/1是)",
      loadFun = "loadPlayers",
      saveFun = "savePlayers"
   )
   public LinkedHashMap<Integer, Boolean> players = new LinkedHashMap();
   @DBColumnAnno(
      comment = "邀请的玩家",
      loadFun = "loadInvitePlayers",
      saveFun = "saveInvitePlayers",
      columnType = "TEXT"
   )
   public Set<Integer> invitePlayers = new HashSet();
   @DBColumnAnno(
      comment = "申请的玩家",
      loadFun = "loadApplyPlayers",
      saveFun = "saveApplyPlayers",
      columnType = "TEXT"
   )
   public Set<Integer> applyPlayers = new HashSet();
   @DBColumnAnno(
      comment = "是否已经报名"
   )
   public boolean isSign = false;
   @DBColumnAnno(
      comment = "已挑战次数+剩余挑战次数"
   )
   public long challengeCount = -1L;
   @DBColumnAnno(
      comment = "挑战次数恢复时间"
   )
   public int recoverTime;
   @DBColumnAnno(
      comment = "已领奖励playerId+rewards",
      loadFun = "loadRewards",
      saveFun = "saveRewards"
   )
   public Map<Integer, Integer> rewards = new HashMap();
   @DBColumnAnno(
      comment = "是否战斗中"
   )
   public boolean fighting;
   @DBColumnAnno(
      comment = "所属服务器"
   )
   public int server;
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

   public void loadPlayers(String str) {
      this.players = (LinkedHashMap)JsonUtil.jsonToMap(str, Integer.class, Boolean.class, LinkedHashMap.class);
   }

   public String savePlayers() {
      return JsonUtil.beanToJson(this.players);
   }

   public void loadInvitePlayers(String str) {
      this.invitePlayers = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveInvitePlayers() {
      return JsonUtil.beanToJson(this.invitePlayers);
   }

   public void loadApplyPlayers(String str) {
      this.applyPlayers = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveApplyPlayers() {
      return JsonUtil.beanToJson(this.applyPlayers);
   }

   public void loadRewards(String str) {
      this.rewards = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveRewards() {
      return JsonUtil.beanToJson(this.rewards);
   }

   public void loadRobots(String data) {
      this.robots = JsonUtil.jsonToMap(data, Integer.class, RobotData.class);
   }

   public String saveRobots() {
      return JsonUtil.beanToJson(this.robots);
   }
}
