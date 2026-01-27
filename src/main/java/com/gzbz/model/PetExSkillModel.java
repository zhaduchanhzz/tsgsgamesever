package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.Map;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "petExSkill"
)
public class PetExSkillModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "技能id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "技能类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "itemId",
      comment = "关联道具id"
   )
   private int itemId;
   @ModelColumnAnno(
      columnName = "name",
      comment = "技能名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "skillId",
      comment = "关联被动技能Id"
   )
   private int skillId;
   @ModelColumnAnno(
      columnName = "icon",
      comment = "技能图标"
   )
   private int icon;
   @ModelColumnAnno(
      columnName = "quality",
      comment = "技能品质"
   )
   private int quality;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "技能加成属性"
   )
   private Map<Integer, PropertyModel> skillProperty = new HashMap();
   @ModelColumnAnno(
      columnName = "detail",
      comment = "技能描述"
   )
   private String detail;
   @ModelColumnAnno(
      columnName = "power",
      comment = "战力"
   )
   private int power;
   @ModelColumnAnno(
      columnName = "needLevel",
      comment = "学习所需等级条件"
   )
   private int needLevel;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public Map<Integer, PropertyModel> getSkillProperty() {
      return this.skillProperty;
   }

   public void setSkillProperty(Map<Integer, PropertyModel> skillProperty) {
      this.checkModify();
      this.skillProperty = skillProperty;
   }

   public String getDetail() {
      return this.detail;
   }

   public void setDetail(String detail) {
      this.checkModify();
      this.detail = detail;
   }

   public int getPower() {
      return this.power;
   }

   public void setPower(int power) {
      this.checkModify();
      this.power = power;
   }

   public int getNeedLevel() {
      return this.needLevel;
   }

   public void setNeedLevel(int needLevel) {
      this.checkModify();
      this.needLevel = needLevel;
   }
}
