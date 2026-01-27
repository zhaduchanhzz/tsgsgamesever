package com.yy.db;

import com.gzbz.db.bean.DragonPlayerData;
import com.gzbz.db.bean.DragonTeamData;
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
   name = "tb_cross_dragon_team",
   dbType = 2,
   resultType = 2,
   mapKey = {"teamId"},
   selectKey = {"group"}
)
public class CrossDragonTeamDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "队伍ID"
   )
   public int teamId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "group"
   )
   public int group;
   @DBColumnAnno(
      comment = "队长ID"
   )
   public int captain;
   @DBColumnAnno(
      comment = "队伍名"
   )
   public String name;
   @DBColumnAnno(
      comment = "龙脉阶段"
   )
   public int dragonStage;
   @DBColumnAnno(
      comment = "入队最低战力配置下标"
   )
   public long minPower;
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
      saveFun = "savePlayers",
      columnType = "LONGTEXT"
   )
   public LinkedHashMap<Integer, DragonPlayerData> players = new LinkedHashMap();
   @DBColumnAnno(
      comment = "队伍中的阵容",
      loadFun = "loadArraying",
      saveFun = "saveArraying",
      columnType = "LONGTEXT"
   )
   public Map<Integer, DragonTeamData> arraying = new HashMap();
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
      comment = "是否战斗中"
   )
   public boolean fighting;
   @DBColumnAnno(
      comment = "创建队伍时间"
   )
   public int createTime = 0;
   @DBColumnAnno(
      columnType = "MEDIUMBLOB",
      comment = "战斗结果"
   )
   public byte[] battleMsg;

   public void loadPlayers(String str) {
      this.players = (LinkedHashMap)JsonUtil.jsonToMap(str, Integer.class, DragonPlayerData.class, LinkedHashMap.class);
   }

   public String savePlayers() {
      return JsonUtil.beanToJson(this.players);
   }

   public void loadArraying(String str) {
      this.arraying = JsonUtil.jsonToMap(str, Integer.class, DragonTeamData.class, HashMap.class);
   }

   public String saveArraying() {
      return JsonUtil.beanToJson(this.arraying);
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
}
