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
   name = "tb_luck_draw",
   resultType = 0,
   selectKey = {"playerId"}
)
public class LuckDrawDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "抽取轮次"
   )
   public int drawRound;
   @DBColumnAnno(
      comment = "抽取次数"
   )
   public int step;
   @DBColumnAnno(
      comment = "抽取武将",
      columnType = "TEXT",
      loadFun = "loadHeros",
      saveFun = "saveHeros"
   )
   public Map<Integer, List> heros = new HashMap();
   @DBColumnAnno(
      comment = "本轮领取",
      loadFun = "loadTakeIds",
      saveFun = "saveTakeIds"
   )
   public List<Integer> takedIds = new ArrayList();

   public void loadHeros(String data) {
      this.heros = JsonUtil.jsonToMap(data, Integer.class, List.class);
   }

   public String saveHeros() {
      return JsonUtil.beanToJson(this.heros);
   }

   public void loadTakeIds(String data) {
      this.takedIds = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveTakeIds() {
      return JsonUtil.beanToJson(this.takedIds);
   }
}
