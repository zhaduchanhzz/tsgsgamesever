package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_union",
   resultType = 5
)
public class UnionDao extends DBDao {
   @DBColumnAnno(
      columnName = "unionId",
      isPrimary = true,
      isAutoInc = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      columnName = "unionName",
      comment = "军团名"
   )
   public String unionName;
   @DBColumnAnno(
      columnName = "leaderId",
      comment = "团长玩家id"
   )
   public int leaderId;
   @DBColumnAnno(
      columnName = "level",
      comment = "军团等级"
   )
   public int level;
   @DBColumnAnno(
      columnName = "exp",
      comment = "军团经验值"
   )
   public int exp;
   @DBColumnAnno(
      columnName = "recruitCount",
      comment = "军团每日已招募次数"
   )
   public int recruitCount;
   @DBColumnAnno(
      columnName = "copyBuffLv",
      comment = "军团副本buff等级"
   )
   public int copyBuffLv;
   @DBColumnAnno(
      columnName = "copyBuffTime",
      comment = "军团副本buff结束时间"
   )
   public long copyBuffTime;
   @DBColumnAnno(
      columnName = "donateProgress",
      comment = "军团捐献进度"
   )
   public int donateProgress;
   @DBColumnAnno(
      columnName = "declaration",
      columnType = "TEXT",
      comment = "军团宣言"
   )
   public String declaration = "";
   @DBColumnAnno(
      columnName = "verify",
      comment = "申请军团是否需要审核"
   )
   public boolean verify;
   @DBColumnAnno(
      columnName = "verifyLevel",
      comment = "申请军团要求等级"
   )
   public int verifyLevel;
   @DBColumnAnno(
      columnName = "copyId",
      comment = "当前副本ID"
   )
   public int copyId;
   @DBColumnAnno(
      columnName = "masterHp",
      comment = "当前关卡怪物血量"
   )
   public long masterHp;
   @DBColumnAnno(
      columnName = "massCDTime",
      comment = "集结号角CD结束时间"
   )
   public long massCDTime;
   @DBColumnAnno(
      columnName = "createTime",
      comment = "军团成立时间"
   )
   public long createTime;
   @DBColumnAnno(
      columnType = "TEXT",
      columnName = "copyChallenge",
      comment = "当前副本关卡挑战记录",
      loadFun = "loadCopyChallenge",
      saveFun = "saveCopyChallenge"
   )
   public Map<Integer, Integer> copyChallenge = new HashMap();
   @DBColumnAnno(
      columnName = "serverId",
      comment = "所属服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      columnType = "TEXT",
      columnName = "warBoxes",
      comment = "已被领取的军团争霸宝箱 player->position",
      loadFun = "loadWarBoxes",
      saveFun = "saveWarBoxes"
   )
   public Map<Integer, Integer> warBoxes = new HashMap();
   @DBColumnAnno(
      columnName = "warShopExp",
      comment = "军团争霸商店经验"
   )
   public int warShopExp;
   @DBColumnAnno(
      columnName = "warShopLv",
      comment = "军团争霸商店等级"
   )
   public int warShopLv;
   @DBColumnAnno(
      columnName = "warBuffLv",
      comment = "军团争霸buff等级"
   )
   public int warBuffLv;
   @DBColumnAnno(
      columnType = "TEXT",
      columnName = "warStronghold",
      comment = "战略点挑战成功记录 position->star",
      loadFun = "loadWarStrongholds",
      saveFun = "saveWarStrongholds"
   )
   public Map<Integer, List<Integer>> warStrongholds = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      columnName = "memberTodayContribution",
      comment = "成员今日贡献",
      loadFun = "loadMemberTodayContribution",
      saveFun = "saveMemberTodayContribution"
   )
   public Map<Integer, Integer> memberTodayContribution = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      columnName = "warStrongholdFighting",
      comment = "当前挑战中战略点position->playerId",
      loadFun = "loadWarStrongholdFighting",
      saveFun = "saveWarStrongholdFighting"
   )
   public Map<Integer, Integer> warStrongholdFighting = new HashMap();
   @DBColumnAnno(
      columnName = "warWin",
      comment = "最后一次军团争霸是否胜利"
   )
   public boolean warWin = false;
   @DBColumnAnno(
      comment = "军团争霸是否已结算"
   )
   public boolean warSettle = false;
   @DBColumnAnno(
      comment = "今日所有成员副本挑战次数"
   )
   public int todayCopyChallenge;
   @DBColumnAnno(
      comment = "今日已修改宣言次数"
   )
   public int modifyDeclarationCount;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "拥有的头像id->失效时间",
      loadFun = "loadHasHead",
      saveFun = "saveHasHead"
   )
   public Map<Integer, Integer> hasHead = new HashMap();
   @DBColumnAnno(
      comment = "当前头像+最后更换时间",
      isNotNull = true
   )
   public long head;
   @DBColumnAnno(
      comment = "当前军团拓展人数id"
   )
   public int curUnionAddNumberId;
   @DBColumnAnno(
      comment = "申请军团战力要求"
   )
   public int verifyPower;
   @DBColumnAnno(
      comment = "任意成员激活敌将攻击buff"
   )
   public boolean finishActivate;
   @DBColumnAnno(
      comment = "军团宣言修改开关(0-开启，1-禁止)"
   )
   public int modifySwitch = 0;

   public void loadCopyChallenge(String data) {
      this.copyChallenge = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveCopyChallenge() {
      return JsonUtil.beanToJson(this.copyChallenge);
   }

   public void loadWarBoxes(String columnData) {
      this.warBoxes = JsonUtil.jsonToMap(columnData, Integer.class, Integer.class);
   }

   public String saveWarBoxes() {
      return JsonUtil.beanToJson(this.warBoxes);
   }

   public void loadWarStrongholds(String columnData) {
      String[] dataArr = columnData.split("\u0001");

      for(String dataStr : dataArr) {
         String[] mapItemArr = dataStr.split("=");
         List<Integer> starList = new ArrayList();
         String[] starItemArr = mapItemArr[1].split(",");

         for(String starItem : starItemArr) {
            starList.add(Integer.parseInt(starItem));
         }

         this.warStrongholds.put(Integer.parseInt(mapItemArr[0]), starList);
      }

   }

   public String saveWarStrongholds() {
      StringBuilder stringBuilder = new StringBuilder();
      this.warStrongholds.forEach((key, value) -> {
         stringBuilder.append(key).append("=");
         value.forEach((star) -> stringBuilder.append(star).append(","));
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         stringBuilder.append("\u0001");
      });
      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public void loadMemberTodayContribution(String columnData) {
      this.memberTodayContribution = JsonUtil.jsonToMap(columnData, Integer.class, Integer.class);
   }

   public String saveMemberTodayContribution() {
      return JsonUtil.beanToJson(this.memberTodayContribution);
   }

   public void loadWarStrongholdFighting(String data) {
      this.warStrongholdFighting = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveWarStrongholdFighting() {
      return JsonUtil.beanToJson(this.warStrongholdFighting);
   }

   public int getWarStrongholdCurrentStar(int position) {
      return ((List)this.warStrongholds.getOrDefault(position, new ArrayList())).stream().mapToInt((value) -> (int) value).sum();
   }

   public int getWarStrongholdCurrentStar() {
      int star = 0;

      for(Integer position : this.warStrongholds.keySet()) {
         star += this.getWarStrongholdCurrentStar(position);
      }

      return star;
   }

   public int getWarStrongholdChallengeCount(int position) {
      return (int)((List)this.warStrongholds.getOrDefault(position, new ArrayList())).stream().filter((value) -> (int)value == 0).count();
   }

   public void loadHasHead(String data) {
      this.hasHead = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveHasHead() {
      return JsonUtil.beanToJson(this.hasHead);
   }
}
