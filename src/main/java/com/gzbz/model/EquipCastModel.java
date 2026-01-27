package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
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
   file = "equipCast"
)
public class EquipCastModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "equipType",
      comment = "装备类型"
   )
   private int equipType;
   @ModelColumnAnno(
      columnName = "castLv",
      comment = "铸魂等级"
   )
   private int castLv;
   @ModelColumnAnno(
      columnName = "unlock",
      comment = "解锁消耗"
   )
   private String unlock;
   @ModelColumnAnno(
      columnName = "equipQuiltyLimit",
      comment = "装备品质限制"
   )
   private int equipQuiltyLimit;
   @ModelColumnAnno(
      columnName = "equipStarLimit",
      comment = "装备星级限制"
   )
   private int equipStarLimit;
   @ModelColumnAnno(
      columnName = "effects",
      columnConvertType = 1,
      count = 3,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private List<PropertyModel> effects = new ArrayList();
   @ModelColumnAnno(
      columnName = "consumes",
      columnConvertType = 1,
      count = 2,
      subCls = ResourceModel.class,
      comment = "物品类型"
   )
   private List<ResourceModel> consumes = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, EquipCastModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         EquipCastModel model = (EquipCastModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.equipType, (v) -> new ConcurrentHashMap())).put(model.castLv, model);
      }

      pool.putMap("customEquipCast", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getEquipType() {
      return this.equipType;
   }

   public void setEquipType(int equipType) {
      this.checkModify();
      this.equipType = equipType;
   }

   public int getCastLv() {
      return this.castLv;
   }

   public void setCastLv(int castLv) {
      this.checkModify();
      this.castLv = castLv;
   }

   public String getUnlock() {
      return this.unlock;
   }

   public void setUnlock(String unlock) {
      this.checkModify();
      this.unlock = unlock;
   }

   public int getEquipQuiltyLimit() {
      return this.equipQuiltyLimit;
   }

   public void setEquipQuiltyLimit(int equipQuiltyLimit) {
      this.checkModify();
      this.equipQuiltyLimit = equipQuiltyLimit;
   }

   public int getEquipStarLimit() {
      return this.equipStarLimit;
   }

   public void setEquipStarLimit(int equipStarLimit) {
      this.checkModify();
      this.equipStarLimit = equipStarLimit;
   }

   public List<PropertyModel> getEffects() {
      return this.effects;
   }

   public void setEffects(List<PropertyModel> effects) {
      this.checkModify();
      this.effects = effects;
   }

   public List<ResourceModel> getConsumes() {
      return this.consumes;
   }

   public void setConsumes(List<ResourceModel> consumes) {
      this.checkModify();
      this.consumes = consumes;
   }
}
