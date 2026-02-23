package com.yy.db;

import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_cross_supreme_pvp_zone",
   dbType = 2,
   resultType = 5,
   mapKey = {"group"}
)
public class CrossSupremePvpZoneDao extends CrossPvpZoneBaseDao {
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "队伍",
      loadFun = "loadTeamMap",
      saveFun = "saveTeamMap"
   )
   public TreeMap<Integer, Set<Integer>> teamMap = new TreeMap();

   public void loadTeamMap(String string) {
      if (!StringUtils.isEmpty(string)) {
         String[] split = string.split("\\|");

         for(String data : split) {
            String[] arr = data.split(":");
            String[] playerIds = arr[1].split(",");
            Set<Integer> playerSet = new HashSet();

            for(String playerId : playerIds) {
               playerSet.add(Integer.parseInt(playerId));
            }

            this.teamMap.put(Integer.parseInt(arr[0]), playerSet);
         }

      }
   }

   public String saveTeamMap() {
      if (this.teamMap.isEmpty()) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(Map.Entry<Integer, Set<Integer>> entry : this.teamMap.entrySet()) {
            Set<Integer> playerIds = entry.getValue();
            if (!playerIds.isEmpty()) {
               stringBuilder.append(entry.getKey()).append(":");

               for(Integer playerId : playerIds) {
                  stringBuilder.append(playerId).append(",");
               }

               stringBuilder.deleteCharAt(stringBuilder.length() - 1);
               stringBuilder.append("|");
            }
         }

         if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }

         return stringBuilder.toString();
      }
   }
}
