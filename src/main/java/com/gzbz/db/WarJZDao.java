package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.WarJZData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_war_jz"
)
public class WarJZDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家code"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "今日已挑战次数"
   )
   public int warNum;
   @DBColumnAnno(
      comment = "今日已购买次数"
   )
   public int buyNum;
   @DBColumnAnno(
      comment = "通关总数"
   )
   public int allPass;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadMapJson",
      saveFun = "saveMapJson",
      comment = "阵营战绩"
   )
   public Map<Integer, WarJZData> warDataMap = new HashMap();
   @DBColumnAnno(
      comment = "是否周六刷新过"
   )
   public boolean isRefresh;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadPassJson",
      saveFun = "savePassJson",
      comment = "阵营通关"
   )
   public Map<Integer, Boolean> passMap = new HashMap();

   public void loadMapJson(String data) {
      this.warDataMap = JsonUtil.jsonToMap(data, Integer.class, WarJZData.class);
   }

   public String saveMapJson() {
      return JSON.toJSONString(this.warDataMap);
   }

   public void loadPassJson(String data) {
      this.passMap = JsonUtil.jsonToMap(data, Integer.class, Boolean.class);
   }

   public String savePassJson() {
      return JSON.toJSONString(this.passMap);
   }

   public void resetDaily() {
      this.buyNum = 0;
      this.warNum = 0;
      this.updateOp();
   }

   public void resetWeek() {
      this.warDataMap.clear();
      this.allPass = 0;
      this.isRefresh = false;
      this.updateOp();
   }

   public void resetSaturday() {
      this.warDataMap.clear();
      this.isRefresh = false;
      this.updateOp();
   }
}
