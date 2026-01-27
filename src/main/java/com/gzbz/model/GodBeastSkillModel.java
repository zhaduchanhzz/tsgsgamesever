package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceBackModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastSkill"
)
public class GodBeastSkillModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "技能组"
   )
   private int skillGroup;
   @ModelColumnAnno(
      comment = "下一级技能ID"
   )
   private int nextLvSkillID;
   @ModelColumnAnno(
      comment = "上一级的技能ID"
   )
   private int preLvSkillID;
   @ModelColumnAnno(
      comment = "被动技能名"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "备注等级"
   )
   private String descLV;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "技能加成"
   )
   private ArrayList<PropertyModel> property = new ArrayList();
   @ModelColumnAnno(
      comment = "战力评分"
   )
   private int warPowerPoint;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceBackModel.class,
      comment = "学习消耗"
   )
   private ArrayList<ResourceBackModel> cost = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "重置消耗"
   )
   private ArrayList<ResourceModel> reSet = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getSkillGroup() {
      return this.skillGroup;
   }

   public void setSkillGroup(int skillGroup) {
      this.checkModify();
      this.skillGroup = skillGroup;
   }

   public int getNextLvSkillID() {
      return this.nextLvSkillID;
   }

   public void setNextLvSkillID(int nextLvSkillID) {
      this.checkModify();
      this.nextLvSkillID = nextLvSkillID;
   }

   public int getPreLvSkillID() {
      return this.preLvSkillID;
   }

   public void setPreLvSkillID(int preLvSkillID) {
      this.checkModify();
      this.preLvSkillID = preLvSkillID;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public String getDescLV() {
      return this.descLV;
   }

   public void setDescLV(String descLV) {
      this.checkModify();
      this.descLV = descLV;
   }

   public ArrayList<PropertyModel> getProperty() {
      return this.property;
   }

   public void setProperty(ArrayList<PropertyModel> property) {
      this.checkModify();
      this.property = property;
   }

   public int getWarPowerPoint() {
      return this.warPowerPoint;
   }

   public void setWarPowerPoint(int warPowerPoint) {
      this.checkModify();
      this.warPowerPoint = warPowerPoint;
   }

   public ArrayList<ResourceBackModel> getCost() {
      return this.cost;
   }

   public void setCost(ArrayList<ResourceBackModel> cost) {
      this.checkModify();
      this.cost = cost;
   }

   public ArrayList<ResourceModel> getReSet() {
      return this.reSet;
   }

   public void setReSet(ArrayList<ResourceModel> reSet) {
      this.checkModify();
      this.reSet = reSet;
   }
}
