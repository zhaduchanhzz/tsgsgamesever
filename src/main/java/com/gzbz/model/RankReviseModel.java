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
   file = "rankRevise"
)
public class RankReviseModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private String id;
   @ModelColumnAnno
   private String rankKey;
   @ModelColumnAnno
   private int playerId;
   @ModelColumnAnno
   private int score;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, Map<Integer, Integer>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RankReviseModel model = (RankReviseModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.rankKey, (v) -> new HashMap())).put(model.playerId, model.score);
      }

      pool.putMap("customRankRevise", tempHashMap);
   }

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.checkModify();
      this.id = id;
   }

   public String getRankKey() {
      return this.rankKey;
   }

   public void setRankKey(String rankKey) {
      this.checkModify();
      this.rankKey = rankKey;
   }

   public int getPlayerId() {
      return this.playerId;
   }

   public void setPlayerId(int playerId) {
      this.checkModify();
      this.playerId = playerId;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }
}
