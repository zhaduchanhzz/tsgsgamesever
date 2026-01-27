package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "skinActivityFlopAward"
)
public class SkinActivityFlopAwardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "round",
      comment = "轮次"
   )
   private int round;
   @ModelColumnAnno(
      columnName = "flopTimes",
      comment = "每轮翻牌次数"
   )
   private int flopTimes;
   @ModelColumnAnno(
      columnName = "libId",
      comment = "奖励库Id"
   )
   private int libId;
   @ModelColumnAnno(
      columnName = "LuckyAwardRate",
      comment = "可能翻到幸运大奖的概率"
   )
   private int LuckyAwardRate;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRound() {
      return this.round;
   }

   public void setRound(int round) {
      this.checkModify();
      this.round = round;
   }

   public int getFlopTimes() {
      return this.flopTimes;
   }

   public void setFlopTimes(int flopTimes) {
      this.checkModify();
      this.flopTimes = flopTimes;
   }

   public int getLibId() {
      return this.libId;
   }

   public void setLibId(int libId) {
      this.checkModify();
      this.libId = libId;
   }

   public int getLuckyAwardRate() {
      return this.LuckyAwardRate;
   }

   public void setLuckyAwardRate(int luckyAwardRate) {
      this.checkModify();
      this.LuckyAwardRate = luckyAwardRate;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, SkinActivityFlopAwardModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SkinActivityFlopAwardModel model = (SkinActivityFlopAwardModel)entry.getValue();
         if (tempMap.containsKey(model.getRound())) {
            ((Map)tempMap.get(model.getRound())).put(model.getFlopTimes(), model);
         } else {
            Map<Integer, SkinActivityFlopAwardModel> subMap = new HashMap();
            subMap.put(model.getFlopTimes(), model);
            tempMap.put(model.getRound(), subMap);
         }
      }

      pool.putMap("customSkinActivityFlopAward", tempMap);
   }
}
