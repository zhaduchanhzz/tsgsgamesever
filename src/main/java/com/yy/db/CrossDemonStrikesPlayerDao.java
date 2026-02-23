package com.yy.db;

import com.gzbz.demonStrikes.bean.DemonStrikesRankData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_demon_strikes_player",
   resultType = 2,
   selectKey = {"group"},
   mapKey = {"playerId"}
)
public class CrossDemonStrikesPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int group;
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "阵型",
      columnType = "BLOB"
   )
   public byte[] arraying;
   @DBColumnAnno(
      comment = "被调遣冷却时间"
   )
   public int transferCd;
   @DBColumnAnno(
      comment = "阵型里面的战力"
   )
   public long power;
   @DBColumnAnno(
      comment = "曾经占领城池",
      columnType = "TEXT",
      loadFun = "loadOccupyCities",
      saveFun = "saveOccupyCities"
   )
   public Set<Integer> occupyCities = new HashSet();
   @DBColumnAnno(
      comment = "排行数据type->value",
      columnType = "TEXT",
      loadFun = "loadRankData",
      saveFun = "saveRankData"
   )
   public Map<Integer, DemonStrikesRankData> rankData = new HashMap();
   @DBColumnAnno(
      comment = "本期已领城池奖励累计份数cityId->num",
      columnType = "TEXT",
      loadFun = "loadCityReward",
      saveFun = "saveCityReward"
   )
   public Map<Integer, Integer> cityReward = new HashMap();
   @DBColumnAnno(
      comment = "本期累计已领随机奖励id->累积份数",
      columnType = "TEXT",
      loadFun = "loadRandomReward",
      saveFun = "saveRandomReward"
   )
   public Map<Integer, Integer> randomReward = new HashMap();

   public void loadOccupyCities(String data) {
      this.occupyCities = JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveOccupyCities() {
      return JsonUtil.beanToJson(this.occupyCities);
   }

   public void loadRankData(String data) {
      this.rankData = JsonUtil.jsonToMap(data, Integer.class, DemonStrikesRankData.class);
   }

   public String saveRankData() {
      return JsonUtil.beanToJson(this.rankData);
   }

   public void loadCityReward(String data) {
      this.cityReward = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveCityReward() {
      return JsonUtil.beanToJson(this.cityReward);
   }

   public void loadRandomReward(String data) {
      this.randomReward = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveRandomReward() {
      return JsonUtil.beanToJson(this.randomReward);
   }
}
