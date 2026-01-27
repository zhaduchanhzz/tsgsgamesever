package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "expeditonHero"
)
public class ExpeditionHeroModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "组id"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "武将星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ArrayList<ExpeditionHeroModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ExpeditionHeroModel model = (ExpeditionHeroModel)entry.getValue();
         ((ArrayList)tempMap.computeIfAbsent(model.groupId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customExpeditonHero", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
