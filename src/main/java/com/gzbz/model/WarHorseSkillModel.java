package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHorseSkill"
)
public class WarHorseSkillModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "技能id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "icon",
      comment = "技能图标"
   )
   private int icon;
   @ModelColumnAnno(
      columnName = "name",
      comment = "技能名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "type",
      comment = "技能类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "quality",
      comment = "技能品质"
   )
   private int quality;
   @ModelColumnAnno(
      columnName = "lv",
      comment = "技能等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "property",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "技能加成"
   )
   private List<PropertyModel> property = new ArrayList();
   @ModelColumnAnno(
      columnName = "weight",
      comment = "技能刷出权重"
   )
   private int weight;
   @ModelColumnAnno(
      columnName = "power",
      comment = "战力"
   )
   private int power;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
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

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public List<PropertyModel> getProperty() {
      return this.property;
   }

   public void setProperty(List<PropertyModel> property) {
      this.checkModify();
      this.property = property;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getPower() {
      return this.power;
   }

   public void setPower(int power) {
      this.checkModify();
      this.power = power;
   }
}
