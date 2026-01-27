package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "MysticBook"
)
public class MagicBookModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "nextid",
      comment = "下一级id"
   )
   private int nextId;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "阶级"
   )
   private int stage;
   @ModelColumnAnno(
      comment = "奇书名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "特效id"
   )
   private int armatureId;
   @ModelColumnAnno(
      columnName = "lvupCost",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "升级消耗"
   )
   private List<ResourceModel> lvUpCost = new ArrayList();
   @ModelColumnAnno(
      comment = "战力提升"
   )
   private int powerUp;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "增加的属性",
      columnName = "propertys"
   )
   private List<PropertyModel> properties = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getArmatureId() {
      return this.armatureId;
   }

   public void setArmatureId(int armatureId) {
      this.checkModify();
      this.armatureId = armatureId;
   }

   public List<ResourceModel> getLvUpCost() {
      return this.lvUpCost;
   }

   public void setLvUpCost(List<ResourceModel> lvUpCost) {
      this.checkModify();
      this.lvUpCost = lvUpCost;
   }

   public List<PropertyModel> getProperties() {
      return this.properties;
   }

   public void setProperties(List<PropertyModel> properties) {
      this.checkModify();
      this.properties = properties;
   }

   public int getPowerUp() {
      return this.powerUp;
   }

   public void setPowerUp(int powerUp) {
      this.checkModify();
      this.powerUp = powerUp;
   }
}
