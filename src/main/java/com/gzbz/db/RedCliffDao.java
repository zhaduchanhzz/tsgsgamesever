package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.war.redcliff.RedCliffEvent;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_red_cliff"
)
public class RedCliffDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "status",
      comment = "报名状态"
   )
   public int status;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadEvent",
      saveFun = "saveEvent",
      comment = "事件记录"
   )
   public Map<Integer, RedCliffEvent> event = new HashMap();

   public void loadEvent(String data) {
      this.event = JsonUtil.jsonToMap(data, Integer.class, RedCliffEvent.class);
   }

   public String saveEvent() {
      return JSON.toJSONString(this.event);
   }
}
