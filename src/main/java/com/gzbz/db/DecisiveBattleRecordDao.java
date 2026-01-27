package com.gzbz.db;

import com.gzbz.activity.bean.decisiveBattle.DecisiveRecordData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_decisive_battle_record",
   resultType = 0,
   selectKey = {"step"}
)
public class DecisiveBattleRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "step"
   )
   public int step;
   @DBColumnAnno(
      comment = "英雄记录",
      columnType = "LONGTEXT",
      loadFun = "loadHeroData",
      saveFun = "saveHeroData"
   )
   public Map<Integer, DecisiveRecordData> record = new HashMap();

   public void loadHeroData(String data) {
      this.record = JsonUtil.jsonToMap(data, Integer.class, DecisiveRecordData.class, HashMap.class);
   }

   public String saveHeroData() {
      return JsonUtil.beanToJson(this.record);
   }
}
