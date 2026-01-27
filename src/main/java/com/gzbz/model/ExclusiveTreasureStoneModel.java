package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
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
   file = "exclusiveTreasureStone"
)
public class ExclusiveTreasureStoneModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "加成属性类型"
   )
   private int proType;
   @ModelColumnAnno(
      comment = "加成方式"
   )
   private int proWay;
   @ModelColumnAnno(
      comment = "加成值"
   )
   private int proValue;
   @ModelColumnAnno(
      comment = "转换花费元宝数"
   )
   private int changeCost;
   @ModelColumnAnno(
      columnName = "composeConsume",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "合成消耗"
   )
   private ArrayList<ResourceModel> composeConsume = new ArrayList();
   @ModelColumnAnno(
      columnName = "decomposeGain",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "分解获得"
   )
   private ArrayList<ResourceModel> decomposeGain = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getProType() {
      return this.proType;
   }

   public void setProType(int proType) {
      this.checkModify();
      this.proType = proType;
   }

   public int getProWay() {
      return this.proWay;
   }

   public void setProWay(int proWay) {
      this.checkModify();
      this.proWay = proWay;
   }

   public int getProValue() {
      return this.proValue;
   }

   public void setProValue(int proValue) {
      this.checkModify();
      this.proValue = proValue;
   }

   public ArrayList<ResourceModel> getComposeConsume() {
      return this.composeConsume;
   }

   public void setComposeConsume(ArrayList<ResourceModel> composeConsume) {
      this.checkModify();
      this.composeConsume = composeConsume;
   }

   public ArrayList<ResourceModel> getDecomposeGain() {
      return this.decomposeGain;
   }

   public void setDecomposeGain(ArrayList<ResourceModel> decomposeGain) {
      this.checkModify();
      this.decomposeGain = decomposeGain;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<ExclusiveTreasureStoneModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ExclusiveTreasureStoneModel model = (ExclusiveTreasureStoneModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.quality, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customExclusiveTreasureStone", tempHashMap);
   }

   public int getChangeCost() {
      return this.changeCost;
   }

   public void setChangeCost(int changeCost) {
      this.checkModify();
      this.changeCost = changeCost;
   }
}
