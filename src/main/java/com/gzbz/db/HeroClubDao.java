package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.HeroClubRecord;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_hero_club",
   selectKey = {"playerId"}
)
public class HeroClubDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id",
      index = 0
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadDrawJson",
      saveFun = "saveDrawJson"
   )
   public List<HeroClubRecord> drawRecord = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadExchangeJson",
      saveFun = "saveExchangeJson"
   )
   public List<HeroClubRecord> exchangeRecord = new ArrayList();

   public void loadDrawJson(String data) {
      this.drawRecord = JsonUtil.jsonToList(data, HeroClubRecord.class);
   }

   public String saveDrawJson() {
      return JSON.toJSONString(this.drawRecord);
   }

   public void loadExchangeJson(String data) {
      this.exchangeRecord = JsonUtil.jsonToList(data, HeroClubRecord.class);
   }

   public String saveExchangeJson() {
      return JSON.toJSONString(this.exchangeRecord);
   }
}
