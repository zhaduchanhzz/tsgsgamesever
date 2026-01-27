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
   file = "DragonVeinAttriGroupA"
)
public class DragonVeinAttriGroupAModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "基础属性池"
   )
   private int group;
   @ModelColumnAnno(
      comment = "等级区间下限"
   )
   private int levelDown;
   @ModelColumnAnno(
      comment = "等级区间上限"
   )
   private int levelUP;
   @ModelColumnAnno(
      comment = "基础属性"
   )
   private int addProsType;
   @ModelColumnAnno(
      comment = "职业类型"
   )
   private int addProsHeroType;
   @ModelColumnAnno(
      comment = "计算方式"
   )
   private int addProsWay;
   @ModelColumnAnno(
      comment = "基础属性值"
   )
   private int addProsNum;
   @ModelColumnAnno(
      comment = "基础属性值"
   )
   private int addProsFactor;
   @ModelColumnAnno(
      comment = "波动范围下限"
   )
   private int waveDown;
   @ModelColumnAnno(
      comment = "波动范围上限"
   )
   private int waveUp;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<DragonVeinAttriGroupAModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         DragonVeinAttriGroupAModel model = (DragonVeinAttriGroupAModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getGroup(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customDragonVeinAttriGroupA", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.group = group;
   }

   public int getLevelDown() {
      return this.levelDown;
   }

   public void setLevelDown(int levelDown) {
      this.levelDown = levelDown;
   }

   public int getLevelUP() {
      return this.levelUP;
   }

   public void setLevelUP(int levelUP) {
      this.levelUP = levelUP;
   }

   public int getAddProsType() {
      return this.addProsType;
   }

   public void setAddProsType(int addProsType) {
      this.addProsType = addProsType;
   }

   public int getAddProsHeroType() {
      return this.addProsHeroType;
   }

   public void setAddProsHeroType(int addProsHeroType) {
      this.addProsHeroType = addProsHeroType;
   }

   public int getAddProsWay() {
      return this.addProsWay;
   }

   public void setAddProsWay(int addProsWay) {
      this.addProsWay = addProsWay;
   }

   public int getAddProsNum() {
      return this.addProsNum;
   }

   public void setAddProsNum(int addProsNum) {
      this.addProsNum = addProsNum;
   }

   public int getAddProsFactor() {
      return this.addProsFactor;
   }

   public void setAddProsFactor(int addProsFactor) {
      this.addProsFactor = addProsFactor;
   }

   public int getWaveDown() {
      return this.waveDown;
   }

   public void setWaveDown(int waveDown) {
      this.waveDown = waveDown;
   }

   public int getWaveUp() {
      return this.waveUp;
   }

   public void setWaveUp(int waveUp) {
      this.waveUp = waveUp;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }
}
