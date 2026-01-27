package com.gzbz.gamePlayer.playerBag;

import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.AideLevelModel;
import com.gzbz.model.ItemModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Map;
import java.util.TreeMap;

public class HeroAideItem extends ItemBase {
   public int aideId;

   public void init(int code, int num, ItemModel itemModel, GamePlayer gamePlayer) {
      super.init(code, num, itemModel, gamePlayer);
      this.resetData();
   }

   public void resetData() {
      Map<Integer, TreeMap<Integer, AideLevelModel>> aideMap = ApplicationContextProvider.<Integer, TreeMap<Integer, AideLevelModel>>getModelPoolMap("customAideLevel");
      if (aideMap != null && !aideMap.isEmpty() && aideMap.containsKey(this.id) && !((TreeMap)aideMap.get(this.id)).isEmpty()) {
         this.aideId = (Integer)((TreeMap)aideMap.get(this.id)).firstKey();
      }

   }

   public void decode(String data) {
      String[] strs = data.split(",");
      this.code = Integer.parseInt(strs[0]);
      this.id = Integer.parseInt(strs[1]);
      this.num = Integer.parseInt(strs[2]);
      this.enableTime = Integer.parseInt(strs[3]);
      this.aideId = Integer.parseInt(strs[4]);
   }

   public String encode() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.code);
      stringBuilder.append(",");
      stringBuilder.append(this.id);
      stringBuilder.append(",");
      stringBuilder.append(this.num);
      stringBuilder.append(",");
      stringBuilder.append(this.enableTime);
      stringBuilder.append(",");
      stringBuilder.append(this.aideId);
      return stringBuilder.toString();
   }
}
