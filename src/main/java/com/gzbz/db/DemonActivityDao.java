package com.gzbz.db;

import com.gzbz.demon.bean.DemonBossData;
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
   name = "tb_demon_activity",
   resultType = 0,
   selectKey = {"playerId"}
)
public class DemonActivityDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已挑战次数副本"
   )
   public int fightNum;
   @DBColumnAnno(
      comment = "已购买挑战次数副本"
   )
   public int buyFightNum;
   @DBColumnAnno(
      comment = "随机英雄次数"
   )
   public int randHeroNum;
   @DBColumnAnno(
      comment = "boss已挑战次数"
   )
   public int bossFightNum;
   @DBColumnAnno(
      comment = "已刷新副本次数"
   )
   public int refreshCopyNum;
   @DBColumnAnno(
      comment = "是否发放支援武将奖励"
   )
   public int randAward;
   @DBColumnAnno(
      comment = "副本刷新机制值"
   )
   public int refreshFlag;
   @DBColumnAnno(
      comment = "已选择的buff"
   )
   public int buff;
   @DBColumnAnno(
      comment = "玩家最大封魔积分"
   )
   public int maxPoint;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadTask",
      saveFun = "saveTask",
      comment = "已领取奖励的任务id"
   )
   public List<Integer> receiveTask = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadRule",
      saveFun = "saveRule",
      comment = "随机取英雄规则"
   )
   public List<Integer> randRule = new ArrayList();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadExist",
      saveFun = "saveExist",
      comment = "已随机过的英雄"
   )
   public List<Long> randExist = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadBox",
      saveFun = "saveBox",
      comment = "已领取的宝箱"
   )
   public List<Integer> receiveBox = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadCopyIds",
      saveFun = "saveCopyIds",
      comment = "刷出的副本id"
   )
   public List<Integer> copyIds = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadFightCopys",
      saveFun = "saveFightCopys",
      comment = "已挑战的副本id"
   )
   public List<Integer> fightCopys = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadJoinHero",
      saveFun = "saveJoinHero",
      comment = "放入武将池的英雄"
   )
   public List<byte[]> joinHero = new ArrayList();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadRandHero",
      saveFun = "saveRandHero",
      comment = "武将池中随机出的英雄列表"
   )
   public List<DemonBossData> randHero = new ArrayList();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadHitHero",
      saveFun = "saveHitHero",
      comment = "被选中布阵的武将列表"
   )
   public List<DemonBossData> hitHero = new ArrayList();
   @DBColumnAnno(
      comment = "队伍中的阵容",
      loadFun = "loadArraying",
      saveFun = "saveArraying",
      columnType = "LONGTEXT"
   )
   public Map<Integer, DemonBossData> arraying = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadBuffAward",
      saveFun = "saveBuffAward",
      comment = "已领取的buff奖励"
   )
   public Set<Integer> buffAward = new HashSet();
   @DBColumnAnno(
      comment = "总轮数"
   )
   public int wheel = 1;
   @DBColumnAnno(
      comment = "本轮已抽取次数"
   )
   public int drawTimes;
   @DBColumnAnno(
      comment = "总抽取次数"
   )
   public int totalDrawTimes;
   @DBColumnAnno(
      comment = "当前奖池",
      columnType = "TEXT",
      loadFun = "loadJackpot",
      saveFun = "saveJackpot"
   )
   public List<Integer> jackpot = new ArrayList();
   @DBColumnAnno(
      comment = "所选取的心仪奖池",
      columnType = "TEXT",
      loadFun = "loadEnjoyIds",
      saveFun = "saveEnjoyIds"
   )
   public List<Integer> enjoyIds = new ArrayList();
   @DBColumnAnno(
      comment = "已领取的次数奖励",
      columnType = "TEXT",
      loadFun = "loadTimeRewards",
      saveFun = "saveTimeRewards"
   )
   public Set<Integer> timeRewards = new HashSet();
   @DBColumnAnno(
      comment = "当日重置次数"
   )
   public int refreshReward;
   @DBColumnAnno(
      comment = "记录",
      columnType = "TEXT",
      loadFun = "loadRecord",
      saveFun = "saveRecord"
   )
   public List<String> records = new ArrayList();
   @DBColumnAnno(
      comment = "已获得的天字令宝箱个数"
   )
   public int tianBoxCount;
   @DBColumnAnno(
      comment = "天命已抽取奖励",
      columnType = "TEXT",
      loadFun = "loadDestinyDrawed",
      saveFun = "saveDestinyDrawed"
   )
   public Set<Integer> destinyDrawed = new HashSet();
   @DBColumnAnno(
      comment = "是否已领取天命宝箱"
   )
   public boolean destinyBox;
   @DBColumnAnno(
      comment = "活动期间获得的活跃度"
   )
   public int active;
   @DBColumnAnno(
      comment = "选择的魂武将code"
   )
   public int soulHeroCode;

   public void loadArraying(String str) {
      this.arraying = JsonUtil.jsonToMap(str, Integer.class, DemonBossData.class, HashMap.class);
   }

   public String saveArraying() {
      return JsonUtil.beanToJson(this.arraying);
   }

   public void loadRandHero(String data) {
      this.randHero = JsonUtil.jsonToList(data, DemonBossData.class);
   }

   public String saveRandHero() {
      return JsonUtil.listToJson(this.randHero);
   }

   public void loadHitHero(String data) {
      this.hitHero = JsonUtil.jsonToList(data, DemonBossData.class);
   }

   public String saveHitHero() {
      return JsonUtil.listToJson(this.hitHero);
   }

   public void loadJoinHero(String data) {
      this.joinHero = JsonUtil.jsonToList(data, byte[].class);
   }

   public String saveJoinHero() {
      return JsonUtil.listToJson(this.joinHero);
   }

   public void loadCopyIds(String data) {
      this.copyIds = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveCopyIds() {
      return JsonUtil.listToJson(this.copyIds);
   }

   public void loadBox(String data) {
      this.receiveBox = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveBox() {
      return JsonUtil.listToJson(this.receiveBox);
   }

   public void loadJackpot(String str) {
      this.jackpot = JsonUtil.jsonToList(str, Integer.class);
   }

   public String saveJackpot() {
      return JsonUtil.beanToJson(this.jackpot);
   }

   public void loadTimeRewards(String str) {
      this.timeRewards = JsonUtil.jsonToBean(str, Set.class);
   }

   public String saveTimeRewards() {
      return JsonUtil.beanToJson(this.timeRewards);
   }

   public void loadRecord(String str) {
      this.records = JsonUtil.jsonToList(str, String.class);
   }

   public String saveRecord() {
      return JsonUtil.beanToJson(this.records);
   }

   public void loadDestinyDrawed(String str) {
      this.destinyDrawed = JsonUtil.jsonToBean(str, Set.class);
   }

   public String saveDestinyDrawed() {
      return JsonUtil.beanToJson(this.destinyDrawed);
   }

   public void loadBuffAward(String str) {
      this.buffAward = JsonUtil.jsonToBean(str, Set.class);
   }

   public String saveBuffAward() {
      return JsonUtil.beanToJson(this.buffAward);
   }

   public void loadRule(String data) {
      this.randRule = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveRule() {
      return JsonUtil.listToJson(this.randRule);
   }

   public void loadExist(String data) {
      this.randExist = JsonUtil.jsonToList(data, Long.class);
   }

   public String saveExist() {
      return JsonUtil.listToJson(this.randExist);
   }

   public void loadTask(String data) {
      this.receiveTask = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveTask() {
      return JsonUtil.listToJson(this.receiveTask);
   }

   public void loadFightCopys(String data) {
      this.fightCopys = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveFightCopys() {
      return JsonUtil.listToJson(this.fightCopys);
   }

   public void loadEnjoyIds(String str) {
      this.jackpot = JsonUtil.jsonToList(str, Integer.class);
   }

   public String saveEnjoyIds() {
      return JsonUtil.beanToJson(this.jackpot);
   }
}
