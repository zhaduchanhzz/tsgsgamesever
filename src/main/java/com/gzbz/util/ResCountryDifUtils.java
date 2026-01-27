package com.gzbz.util;

import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.Objects;

public class ResCountryDifUtils {
   public static int goldAdditionForJp(int resourceType, int resourceId, int resourceVal) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (!"jp".equals(worldMgr.country)) {
         return resourceVal;
      } else if (resourceType == 1 && resourceId == PlayerDefine.PLAYER_GOLD) {
         int addPricePercent = ApplicationContextProvider.getConfigInt("Moneyconsumption_jp", 30);
         return resourceVal * (100 + addPricePercent) / 100;
      } else {
         return resourceVal;
      }
   }

   public static boolean checkCharLengthByCountry(String str, String configName, int defaultMin, int defaultMax) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (worldMgr.country.equals("en") && !GamePlayer.isValidNameForEN(str)) {
         return false;
      } else {
         String lengthConfigStr = ApplicationContextProvider.getConfigString(configName, "");
         String[] lengthConfigArr = lengthConfigStr.split(",");
         int[] defaultLength = new int[]{defaultMin, defaultMax};

         for(String area_min_maxStr : lengthConfigArr) {
            String[] area_minMax = area_min_maxStr.split(":");
            if (area_minMax.length == 2) {
               String configCountry = area_minMax[0];
               String[] min_max = area_minMax[1].split("\\|");
               if (min_max.length == 2) {
                  int min = Integer.parseInt(min_max[0]);
                  int max = Integer.parseInt(min_max[1]);
                  if (Objects.equals(configCountry, "cn")) {
                     defaultLength[0] = min;
                     defaultLength[1] = max;
                     if (Objects.equals(worldMgr.country, "cn")) {
                        break;
                     }
                  } else if (Objects.equals(worldMgr.country, configCountry)) {
                     defaultLength[0] = min;
                     defaultLength[1] = max;
                     break;
                  }
               }
            }
         }

         return str.length() >= defaultLength[0] && str.length() <= defaultLength[1];
      }
   }
}
