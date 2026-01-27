package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.HeroRecruitmentRecord;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_hero_recruitment",
   selectKey = {"playerId"}
)
public class HeroRecruitmentDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadRecordJson",
      saveFun = "saveRecordJson"
   )
   public Map<Integer, List<HeroRecruitmentRecord>> recordMap = new HashMap();

   public void loadRecordJson(String data) {
      Map<Integer, String> jsonToMap = JsonUtil.jsonToMap(data, Integer.class, String.class, HashMap.class);

      for(Map.Entry<Integer, String> entry : jsonToMap.entrySet()) {
         List<HeroRecruitmentRecord> list = JsonUtil.jsonToList((String)entry.getValue(), HeroRecruitmentRecord.class);
         if (list != null) {
            this.recordMap.put(entry.getKey(), new LinkedList(list));
         }
      }

   }

   public String saveRecordJson() {
      return JSON.toJSONString(this.recordMap);
   }
}
