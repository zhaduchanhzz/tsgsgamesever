package com.gzbz.db;

import com.gzbz.rank.bean.HeroRankData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.LinkedHashMap;
import java.util.Map;

@DBTableAnno(
   name = "tb_hero_nation_rank",
   resultType = 5,
   mapKey = {"nation"}
)
public class HeroNationRankDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "阵营"
   )
   public int nation;
   @DBColumnAnno(
      comment = "阵营武将战力排行",
      columnType = "LONGTEXT",
      loadFun = "loadRank",
      saveFun = "saveRank"
   )
   public LinkedHashMap<Integer, HeroRankData> rankDataMap = new LinkedHashMap();

   public void loadRank(String data) {
      this.rankDataMap.clear();

      for(String map : data.split("#")) {
         String[] entry = map.split("=");
         int playerId = Integer.parseInt(entry[0]);
         String[] value = entry[1].split("\\|");
         HeroRankData heroRankData = new HeroRankData();
         heroRankData.code = Integer.parseInt(value[0]);
         heroRankData.id = Integer.parseInt(value[1]);
         heroRankData.star = Integer.parseInt(value[2]);
         heroRankData.lv = Integer.parseInt(value[3]);
         heroRankData.score = Long.parseLong(value[4]);
         if (value.length > 5) {
            heroRankData.starMapTotalLv = Integer.parseInt(value[5]);
         }

         heroRankData.value = playerId;
         this.rankDataMap.put(playerId, heroRankData);
      }

   }

   public String saveRank() {
      StringBuilder stringBuilder = new StringBuilder();

      for(Map.Entry<Integer, HeroRankData> entry : this.rankDataMap.entrySet()) {
         int playerId = (Integer)entry.getKey();
         stringBuilder.append(playerId).append("=");
         HeroRankData heroRankData = (HeroRankData)entry.getValue();
         stringBuilder.append(heroRankData.code).append("|");
         stringBuilder.append(heroRankData.id).append("|");
         stringBuilder.append(heroRankData.star).append("|");
         stringBuilder.append(heroRankData.lv).append("|");
         stringBuilder.append(heroRankData.score).append("|");
         stringBuilder.append(heroRankData.starMapTotalLv).append("#");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
