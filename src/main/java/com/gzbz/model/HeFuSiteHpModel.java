package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "hefuSiteHp"
)
public class HeFuSiteHpModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "据点类型"
   )
   private int buildingType;
   @ModelColumnAnno(
      comment = "人数下限"
   )
   private int peopleLow;
   @ModelColumnAnno(
      comment = "人数上限"
   )
   private int peopleMax;
   @ModelColumnAnno(
      comment = "耐久值"
   )
   private int hp;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<HeFuSiteHpModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeFuSiteHpModel model = (HeFuSiteHpModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getBuildingType(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customHefuSiteHp", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getBuildingType() {
      return this.buildingType;
   }

   public void setBuildingType(int buildingType) {
      this.checkModify();
      this.buildingType = buildingType;
   }

   public int getPeopleLow() {
      return this.peopleLow;
   }

   public void setPeopleLow(int peopleLow) {
      this.checkModify();
      this.peopleLow = peopleLow;
   }

   public int getPeopleMax() {
      return this.peopleMax;
   }

   public void setPeopleMax(int peopleMax) {
      this.checkModify();
      this.peopleMax = peopleMax;
   }

   public int getHp() {
      return this.hp;
   }

   public void setHp(int hp) {
      this.checkModify();
      this.hp = hp;
   }
}
