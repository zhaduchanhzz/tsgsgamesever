package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "MysticSkill"
)
public class MagicSkillModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奇谋名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "是否不可获得"
   )
   private int cantGot;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "初始星级"
   )
   private int star;
   @ModelColumnAnno(
      columnName = "skillid",
      comment = "初始技能"
   )
   private int skillId;
   @ModelColumnAnno(
      columnName = "skilltype",
      comment = "技能类型"
   )
   private int skillType;
   @ModelColumnAnno(
      comment = "上一级id"
   )
   private int lastId;
   @ModelColumnAnno(
      comment = "下一级id"
   )
   private int nextId;
   @ModelColumnAnno(
      columnName = "starup",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "升星消耗"
   )
   private List<ResourceModel> starUp = new ArrayList();
   @ModelColumnAnno(
      columnName = "break",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "分解获得"
   )
   private List<ResourceModel> breakCost = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "增加的属性",
      columnName = "propertys"
   )
   private List<PropertyModel> properties = new ArrayList();
   @ModelColumnAnno(
      comment = "战力提升"
   )
   private int powerUp;
   @ModelColumnAnno(
      comment = "是否可以重置"
   )
   private int canReset;
   @ModelColumnAnno(
      columnName = "resetCost",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> resetCosts = new ArrayList();
   @ModelColumnAnno(
      columnName = "resetReturn",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> resetReturn = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, List<MagicSkillModel>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         MagicSkillModel model = (MagicSkillModel)entry.getValue();
         ((List)((TreeMap)tempHashMap.computeIfAbsent(model.quality, (v) -> new TreeMap())).computeIfAbsent(model.star, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customMysticSkill", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public int getSkillType() {
      return this.skillType;
   }

   public void setSkillType(int skillType) {
      this.checkModify();
      this.skillType = skillType;
   }

   public int getLastId() {
      return this.lastId;
   }

   public void setLastId(int lastId) {
      this.checkModify();
      this.lastId = lastId;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public List<ResourceModel> getStarUp() {
      return this.starUp;
   }

   public void setStarUp(List<ResourceModel> starUp) {
      this.checkModify();
      this.starUp = starUp;
   }

   public List<ResourceModel> getBreakCost() {
      return this.breakCost;
   }

   public void setBreakCost(List<ResourceModel> breakCost) {
      this.checkModify();
      this.breakCost = breakCost;
   }

   public List<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }

   public int getCantGot() {
      return this.cantGot;
   }

   public void setCantGot(int cantGot) {
      this.checkModify();
      this.cantGot = cantGot;
   }

   public int getPowerUp() {
      return this.powerUp;
   }

   public void setPowerUp(int powerUp) {
      this.checkModify();
      this.powerUp = powerUp;
   }

   public boolean getCanReset() {
      return this.canReset == 1;
   }

   public List<ResourceModel> getResetCosts() {
      return this.resetCosts;
   }

   public List<ResourceModel> getResetReturn() {
      return this.resetReturn;
   }
}
