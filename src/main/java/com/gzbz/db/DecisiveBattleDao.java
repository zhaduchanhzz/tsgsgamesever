package com.gzbz.db;

import com.gzbz.activity.bean.decisiveBattle.DecisiveBattleRecord;
import com.gzbz.activity.bean.decisiveBattle.DecisiveHeroInfo;
import com.gzbz.activity.bean.decisiveBattle.DecisivePlayerData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_decisive_battle",
   resultType = 0,
   selectKey = {"playerId"}
)
public class DecisiveBattleDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "我的信息",
      columnType = "LONGTEXT",
      loadFun = "loadMyData",
      saveFun = "saveMyData"
   )
   public DecisivePlayerData myData = new DecisivePlayerData();
   @DBColumnAnno(
      comment = "英雄信息",
      columnType = "LONGTEXT",
      loadFun = "loadHeroData",
      saveFun = "saveHeroData"
   )
   public Map<Integer, DecisiveHeroInfo> heroMap = new HashMap();
   @DBColumnAnno(
      comment = "挑战记录",
      columnType = "LONGTEXT",
      loadFun = "loadRecord",
      saveFun = "saveRecord"
   )
   public Map<Integer, List<DecisiveBattleRecord>> record = new HashMap();
   @DBColumnAnno(
      comment = "降段英雄信息备份",
      columnType = "LONGTEXT",
      loadFun = "loadTempHeroData",
      saveFun = "saveTempHeroData"
   )
   public Map<Integer, DecisiveHeroInfo> tempHeroMap = new HashMap();
   @DBColumnAnno(
      comment = "选中buff阵营表Id"
   )
   public int targetBuffNationId;

   public void loadTempHeroData(String data) {
      this.tempHeroMap = JsonUtil.jsonToMap(data, Integer.class, DecisiveHeroInfo.class, HashMap.class);
   }

   public String saveTempHeroData() {
      return JsonUtil.beanToJson(this.tempHeroMap);
   }

   public void loadHeroData(String data) {
      this.heroMap = JsonUtil.jsonToMap(data, Integer.class, DecisiveHeroInfo.class, HashMap.class);
   }

   public String saveHeroData() {
      return JsonUtil.beanToJson(this.heroMap);
   }

   public void loadMyData(String data) {
      this.myData = (DecisivePlayerData)JsonUtil.jsonToBean(data, DecisivePlayerData.class);
   }

   public String saveMyData() {
      return JsonUtil.beanToJson(this.myData);
   }

   public void loadRecord(String str) {
      Map<Integer, String> map = JsonUtil.jsonToMap(str, Integer.class, String.class);

      for(Map.Entry<Integer, String> entry : map.entrySet()) {
         ArrayList<DecisiveBattleRecord> list = (ArrayList)JsonUtil.jsonToList((String)entry.getValue(), DecisiveBattleRecord.class);
         this.record.put(entry.getKey(), list);
      }

   }

   public String saveRecord() {
      return JsonUtil.beanToJson(this.record);
   }
}
