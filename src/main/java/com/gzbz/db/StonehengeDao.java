package com.gzbz.db;

import com.gzbz.protobuf.StonehengeMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_stonehenge",
   resultType = 0,
   selectKey = {"playerId"}
)
public class StonehengeDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "当前所在房间表序号id"
   )
   public int id = -1;
   @DBColumnAnno(
      comment = "boss所在的房间id"
   )
   public int bossId;
   @DBColumnAnno(
      comment = "当前正在进行的难度(stonehengeType类型表id)"
   )
   public int hardId;
   @DBColumnAnno(
      comment = "已通关的最大难度(stonehengeType类型表id)"
   )
   public int maxHardId;
   @DBColumnAnno(
      comment = "已挑战次数"
   )
   public int time;
   @DBColumnAnno(
      comment = "已经使用的复活次数"
   )
   public int reviveTime;
   @DBColumnAnno(
      comment = "本次是否通关"
   )
   public boolean isPass;
   @DBColumnAnno(
      comment = "本次通关需要消耗次数（周重置前进入副本，需要保持本次次数，不消耗本周的次数）"
   )
   public boolean needTime = true;
   @DBColumnAnno(
      comment = "正在进行的路线类型（周重置前进入副本，需要保持本次路线）"
   )
   public int inType;
   @DBColumnAnno(
      comment = "是否通过了布阵校验（不通过战斗也会拦截）"
   )
   public boolean arrayVerify = true;
   @DBColumnAnno(
      comment = "本周是否已经扫过普通难度"
   )
   public boolean isPassNormal = false;
   @DBColumnAnno(
      comment = "100%通关的最大难度"
   )
   public int maxPassHard = 0;
   @DBColumnAnno(
      comment = "已经完成事件的房间id",
      columnType = "TEXT",
      loadFun = "loadPassIds",
      saveFun = "savePassIds"
   )
   public Set<Integer> passIds = new HashSet();
   @DBColumnAnno(
      comment = "可以移动的房间id",
      columnType = "TEXT",
      loadFun = "loadMoveIds",
      saveFun = "saveMoveIds"
   )
   public Set<Integer> moveIds = new HashSet();
   @DBColumnAnno(
      comment = "获得的奖励id(本功能奖励表的序号)",
      columnType = "TEXT",
      loadFun = "loadAwards",
      saveFun = "saveAwards"
   )
   public List<Integer> awards = new ArrayList();
   @DBColumnAnno(
      comment = "获得的buffId(包括减益buff，对应的是skill表的技能id)",
      columnType = "TEXT",
      loadFun = "loadBuffs",
      saveFun = "saveBuffs"
   )
   public List<Integer> buffs = new ArrayList();
   @DBColumnAnno(
      comment = "临时数据map(保存一些玩家已经确认的房间数据)",
      columnType = "TEXT",
      loadFun = "loadTempMap",
      saveFun = "saveTempMap"
   )
   public Map<Integer, List<Integer>> tempMap = new HashMap();
   @DBColumnAnno(
      comment = "武将血量记录",
      columnType = "TEXT",
      loadFun = "loadHeroHpMap",
      saveFun = "saveHeroHpMap"
   )
   public Map<Integer, HPData> heroHpMap = new HashMap();
   @DBColumnAnno(
      comment = "Map<battleId，Map<位置，敌人>> 多组敌人血量记录",
      columnType = "TEXT",
      loadFun = "loadEnemyHpMap",
      saveFun = "saveEnemyHpMap"
   )
   public Map<Integer, Map<Integer, HPData>> enemyHpMap = new HashMap();
   @DBColumnAnno(
      comment = "Map<房间表序号id，Map<heroCode，pos位置>> 阵营一该房间多组战斗位置",
      columnType = "TEXT",
      loadFun = "loadBattlePosMap1",
      saveFun = "saveBattlePosMap1"
   )
   public Map<Integer, Map<Integer, Byte>> battlePosMap1 = new HashMap();
   @DBColumnAnno(
      comment = "Map<房间表序号id，Map<heroCode，pos位置>> 阵营二该房间多组战斗位置",
      columnType = "TEXT",
      loadFun = "loadBattlePosMap2",
      saveFun = "saveBattlePosMap2"
   )
   public Map<Integer, Map<Integer, Byte>> battlePosMap2 = new HashMap();
   @DBColumnAnno(
      comment = "必选操作(战斗失败附加减益buff，避免玩家强制关闭游戏逃避惩罚)",
      columnType = "TEXT",
      loadFun = "loadDeBuffs",
      saveFun = "saveDeBuffs"
   )
   public List<Integer> deBuffs = new ArrayList();
   @DBColumnAnno(
      comment = "上一轮最高难度的奖励（扫荡用的）",
      columnType = "TEXT",
      loadFun = "loadLastAwards",
      saveFun = "saveLastAwards"
   )
   public List<Integer> lastAwards = new ArrayList();

   public void loadPassIds(String data) {
      this.passIds = DataUtils.stringToIntSet(data);
   }

   public String savePassIds() {
      return DataUtils.intSetToString(this.passIds);
   }

   public void loadMoveIds(String data) {
      this.moveIds = DataUtils.stringToIntSet(data);
   }

   public String saveMoveIds() {
      return DataUtils.intSetToString(this.moveIds);
   }

   public void loadAwards(String data) {
      this.awards = DataUtils.stringToIntList(data);
   }

   public String saveAwards() {
      return DataUtils.intListToString(this.awards);
   }

   public void loadBuffs(String data) {
      this.buffs = DataUtils.stringToIntList(data);
   }

   public String saveBuffs() {
      return DataUtils.intListToString(this.buffs);
   }

   public void loadTempMap(String data) {
      Map<Integer, String> jsonToMap = JsonUtil.jsonToMap(data, Integer.class, String.class, HashMap.class);

      for(Map.Entry<Integer, String> entry : jsonToMap.entrySet()) {
         List<Integer> list = JsonUtil.jsonToList((String)entry.getValue(), Integer.class);
         if (list != null) {
            this.tempMap.put(entry.getKey(), list);
         }
      }

   }

   public String saveTempMap() {
      return JsonUtil.beanToJson(this.tempMap);
   }

   public void loadHeroHpMap(String data) {
      this.heroHpMap = JsonUtil.jsonToMap(data, Integer.class, HPData.class);
   }

   public String saveHeroHpMap() {
      return JsonUtil.object2String(this.heroHpMap);
   }

   public void loadEnemyHpMap(String data) {
      JsonUtil.jsonToMap(data, Integer.class, String.class).forEach((k, v) -> {
         Map var10000 = (Map)this.enemyHpMap.put(k, JsonUtil.jsonToMap(v, Integer.class, HPData.class));
      });
   }

   public String saveEnemyHpMap() {
      return JsonUtil.beanToJson(this.enemyHpMap);
   }

   public void loadBattlePosMap1(String data) {
      JsonUtil.jsonToMap(data, Integer.class, String.class).forEach((k, v) -> {
         Map var10000 = (Map)this.battlePosMap1.put(k, JsonUtil.jsonToMap(v, Integer.class, Byte.class));
      });
   }

   public String saveBattlePosMap1() {
      return JsonUtil.beanToJson(this.battlePosMap1);
   }

   public void loadBattlePosMap2(String data) {
      JsonUtil.jsonToMap(data, Integer.class, String.class).forEach((k, v) -> {
         Map var10000 = (Map)this.battlePosMap2.put(k, JsonUtil.jsonToMap(v, Integer.class, Byte.class));
      });
   }

   public String saveBattlePosMap2() {
      return JsonUtil.beanToJson(this.battlePosMap2);
   }

   public void loadDeBuffs(String data) {
      this.deBuffs = DataUtils.stringToIntList(data);
   }

   public String saveDeBuffs() {
      return DataUtils.intListToString(this.deBuffs);
   }

   public void loadLastAwards(String data) {
      this.lastAwards = DataUtils.stringToIntList(data);
   }

   public String saveLastAwards() {
      return DataUtils.intListToString(this.lastAwards);
   }

   public HPData getHeroHPData(int code) {
      HPData hpData = (HPData)this.heroHpMap.get(code);
      if (hpData == null) {
         hpData = new HPData();
         hpData.code = code;
         this.heroHpMap.put(code, hpData);
      }

      this.updateOp();
      return hpData;
   }

   public void clear() {
      this.id = -1;
      this.hardId = 0;
      this.isPass = false;
      this.reviveTime = 0;
      this.inType = 0;
      this.bossId = 0;
      this.passIds.clear();
      this.moveIds.clear();
      this.awards.clear();
      this.buffs.clear();
      this.tempMap.clear();
      this.heroHpMap.clear();
      this.enemyHpMap.clear();
      this.deBuffs.clear();
      this.battlePosMap1.clear();
      this.battlePosMap2.clear();
      this.arrayVerify = true;
      this.updateOp();
   }

   public static class HPData {
      public int code;
      public int hpPercent = 100;
      public long power;

      public StonehengeMsg.StonehengeHero toBuild() {
         return StonehengeMsg.StonehengeHero.newBuilder().setHeroCode(this.code).setHpPercent(this.hpPercent).setPower(this.power).build();
      }
   }
}
