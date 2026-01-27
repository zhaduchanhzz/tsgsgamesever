package com.gzbz.db;

import com.gzbz.gamePlayer.playerBag.bean.ExclusiveResetData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_player_exclusive_treasure",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ExclusiveTreasureDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已解锁的英雄",
      columnType = "TEXT",
      loadFun = "loadRise",
      saveFun = "saveRise"
   )
   public Set<Integer> heroIds = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadData",
      saveFun = "saveData",
      comment = "重置前数据"
   )
   public Map<Integer, ExclusiveResetData> resetData = new HashMap();

   public void loadRise(String data) {
      this.heroIds = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveRise() {
      return JsonUtil.beanToJson(this.heroIds);
   }

   public void loadData(String str) {
      this.resetData = JsonUtil.jsonToMap(str, Integer.class, ExclusiveResetData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.resetData);
   }
}
