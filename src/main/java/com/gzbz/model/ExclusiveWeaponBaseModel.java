package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
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
   file = "ExclusiveWeaponBase"
)
public class ExclusiveWeaponBaseModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "幻武id"
   )
   private int weaponId;
   @ModelColumnAnno(
      comment = "幻武名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "品质名称"
   )
   private String qualityName;
   @ModelColumnAnno(
      comment = "星级上限"
   )
   private int starLimit;
   @ModelColumnAnno(
      comment = "专属武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "升星参数ID"
   )
   private int upStarId;
   @ModelColumnAnno(
      comment = "重置返回权重"
   )
   private int backWeight;
   @ModelColumnAnno(
      comment = "获得时是否锁定"
   )
   private int isLock;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> baseAtt = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "默认每级增加的属性"
   )
   private ArrayList<Integer> perGradeAtt = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<ExclusiveWeaponBaseModel>> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ExclusiveWeaponBaseModel model = (ExclusiveWeaponBaseModel)entry.getValue();
         ((List)allMap.computeIfAbsent(model.getQuality(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customExclusiveWeaponBase", allMap);
   }

   public int getWeaponId() {
      return this.weaponId;
   }

   public void setWeaponId(int weaponId) {
      this.checkModify();
      this.weaponId = weaponId;
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

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public String getQualityName() {
      return this.qualityName;
   }

   public void setQualityName(String qualityName) {
      this.checkModify();
      this.qualityName = qualityName;
   }

   public int getStarLimit() {
      return this.starLimit;
   }

   public void setStarLimit(int starLimit) {
      this.checkModify();
      this.starLimit = starLimit;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getUpStarId() {
      return this.upStarId;
   }

   public void setUpStarId(int upStarId) {
      this.checkModify();
      this.upStarId = upStarId;
   }

   public int getBackWeight() {
      return this.backWeight;
   }

   public void setBackWeight(int backWeight) {
      this.checkModify();
      this.backWeight = backWeight;
   }

   public int getIsLock() {
      return this.isLock;
   }

   public void setIsLock(int isLock) {
      this.checkModify();
      this.isLock = isLock;
   }

   public ArrayList<PropertyModel> getBaseAtt() {
      return this.baseAtt;
   }

   public void setBaseAtt(ArrayList<PropertyModel> baseAtt) {
      this.checkModify();
      this.baseAtt = baseAtt;
   }

   public ArrayList<Integer> getPerGradeAtt() {
      return this.perGradeAtt;
   }

   public void setPerGradeAtt(ArrayList<Integer> perGradeAtt) {
      this.checkModify();
      this.perGradeAtt = perGradeAtt;
   }
}
