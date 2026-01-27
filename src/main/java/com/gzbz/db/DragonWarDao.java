package com.gzbz.db;

import com.gzbz.db.bean.DragonWarData;
import com.gzbz.protobuf.DragonWarMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_dragon_war",
   resultType = 0,
   selectKey = {"playerId"}
)
public class DragonWarDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家code"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "当前层"
   )
   public int curStage;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadPos",
      saveFun = "savePos",
      comment = "助阵上阵位置"
   )
   public Map<Integer, Integer> supportPos = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHero",
      saveFun = "saveHero",
      comment = "助阵英雄上阵"
   )
   public Map<Integer, Integer> supportHero = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadSelectHero",
      saveFun = "saveSelectHero",
      comment = "助阵英雄选择"
   )
   public Map<DragonWarMsg.SupportType, Integer> supportSelect = new HashMap();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadData",
      saveFun = "saveData",
      comment = "关卡数据"
   )
   public Map<Integer, DragonWarData> warData = new HashMap();
   @DBColumnAnno(
      comment = "是否合服"
   )
   public boolean isMerge = false;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadHistoryData",
      saveFun = "saveHistoryData",
      comment = "历史通关数据"
   )
   public Map<Integer, DragonWarData> historyRecord = new HashMap();

   public void loadHistoryData(String str) {
      this.historyRecord = JsonUtil.jsonToMap(str, Integer.class, DragonWarData.class, HashMap.class);
   }

   public String saveHistoryData() {
      return JsonUtil.beanToJson(this.historyRecord);
   }

   public void loadPos(String data) {
      this.supportPos = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String savePos() {
      return JsonUtil.object2String(this.supportPos);
   }

   public void loadSelectHero(String data) {
      this.supportSelect = JsonUtil.jsonToMap(data, DragonWarMsg.SupportType.class, Integer.class);
   }

   public String saveSelectHero() {
      return JsonUtil.object2String(this.supportSelect);
   }

   public void loadHero(String data) {
      this.supportHero = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveHero() {
      return JsonUtil.object2String(this.supportHero);
   }

   public void loadData(String str) {
      this.warData = JsonUtil.jsonToMap(str, Integer.class, DragonWarData.class, HashMap.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.warData);
   }
}
