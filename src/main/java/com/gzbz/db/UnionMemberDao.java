package com.gzbz.db;

import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.BattleMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_union_member",
   resultType = 2,
   selectKey = {"unionId"},
   mapKey = {"playerId"}
)
public class UnionMemberDao extends DBDao {
   @DBColumnAnno(
      columnName = "unionId",
      isPrimary = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "position",
      comment = "职位"
   )
   public int position;
   @DBColumnAnno(
      columnName = "copyChallengeBuyCount",
      comment = "副本关卡已购买挑战次数"
   )
   public int copyChallengeBuyCount;
   @DBColumnAnno(
      columnName = "copyDamage",
      columnType = "TEXT",
      loadFun = "loadCopyDamage",
      saveFun = "saveCopyDamage",
      comment = "关卡伤害"
   )
   public Map<Integer, Long> copyDamage = new HashMap();
   @DBColumnAnno(
      columnName = "redPacketNum",
      comment = "总共发红包数量"
   )
   public int redPacketNum = 0;
   @DBColumnAnno(
      columnName = "redPacketTotal",
      comment = "总共发红包价值"
   )
   public long redPacketTotal = 0L;
   @DBColumnAnno(
      columnName = "redPacketGave",
      columnType = "varchar",
      loadFun = "loadRedPacketGave",
      saveFun = "saveRedPacketGave",
      comment = "已发红包type->count"
   )
   public Map<Integer, Integer> redPacketGave = new HashMap();
   @DBColumnAnno(
      columnName = "redPacketGot",
      columnType = "TEXT",
      loadFun = "loadRedPacketGot",
      saveFun = "saveRedPacketGot",
      comment = "已领红包id"
   )
   public Set<Integer> redPacketGot = new HashSet();
   @DBColumnAnno(
      columnName = "worships",
      columnType = "varchar",
      loadFun = "loadWorships",
      saveFun = "saveWorships",
      comment = "已膜拜副本排行的玩家"
   )
   public Set<Integer> worships = new HashSet();
   @DBColumnAnno(
      columnName = "joinTime",
      comment = "加入时间"
   )
   public long joinTime;
   @DBColumnAnno(
      columnName = "warChallengeCount",
      comment = "军团争霸已挑战次数"
   )
   public int warChallengeCount = 0;
   @DBColumnAnno(
      columnName = "warStar",
      comment = "军团争霸星数"
   )
   public int warStar = 0;
   @DBColumnAnno(
      columnName = "warRecord",
      comment = "军团争霸战绩"
   )
   public int warRecord = 0;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "最后一场副本战斗结果"
   )
   public byte[] lastCopyBattle;
   @DBColumnAnno(
      columnName = "copyLastDamage",
      comment = "最后一场副本伤害"
   )
   public long copyLastDamage;
   @DBColumnAnno(
      columnType = "TEXT",
      columnName = "warBox",
      comment = "领取的军团争霸宝箱内容",
      loadFun = "loadWarBox",
      saveFun = "saveWarBox"
   )
   public List<ResourceModel> warBox = new ArrayList();
   @DBColumnAnno(
      columnName = "contribution",
      comment = "加入军团后累计贡献"
   )
   public int contribution = 0;
   @DBColumnAnno(
      columnName = "copyLastAttackHp",
      comment = "造成最后一场副本血量"
   )
   public long copyLastAttackHp = 0L;
   @DBColumnAnno(
      columnName = "todayMailCount",
      comment = "今日已发邮件次数"
   )
   public int todayMailCount = 0;

   public void loadCopyDamage(String data) {
      String[] selectionCopyDamageArr = data.split("\u0001");

      for(String copyDamage : selectionCopyDamageArr) {
         String[] copyDamageArr = copyDamage.split(":");
         this.copyDamage.put(Integer.parseInt(copyDamageArr[0]), Long.parseLong(copyDamageArr[1]));
      }

   }

   public String saveCopyDamage() {
      StringBuilder sb = new StringBuilder();
      this.copyDamage.forEach((key, value) -> sb.append(key).append(":").append(value).append("\u0001"));
      if (sb.length() > 0) {
         sb.deleteCharAt(sb.length() - 1);
      }

      return sb.toString();
   }

   public void loadWorships(String data) {
      this.worships = JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveWorships() {
      return JsonUtil.beanToJson(this.worships);
   }

   public void loadRedPacketGave(String data) {
      this.redPacketGave = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveRedPacketGave() {
      return JsonUtil.beanToJson(this.redPacketGave);
   }

   public void loadRedPacketGot(String data) {
      this.redPacketGot = JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveRedPacketGot() {
      return JsonUtil.beanToJson(this.redPacketGot);
   }

   public BattleMsg.S2C_Battle_Result getLastCopyBattle() {
      if (this.lastCopyBattle != null && this.lastCopyBattle.length > 0) {
         try {
            return BattleMsg.S2C_Battle_Result.parseFrom(this.lastCopyBattle);
         } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
         }
      }

      return null;
   }

   public void loadWarBox(String data) {
      this.warBox = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveWarBox() {
      return JsonUtil.beanToJson(this.warBox);
   }
}
