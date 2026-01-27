package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "StampExtraProperty"
)
public class StampExtraPropertyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "组id"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "属性id"
   )
   private int propertyId;
   @ModelColumnAnno(
      comment = "属性类型"
   )
   private int propertyType;
   @ModelColumnAnno(
      comment = "属性值最小值"
   )
   private int propertyValueMin;
   @ModelColumnAnno(
      comment = "属性值最大值"
   )
   private int propertyValueMax;
   @ModelColumnAnno(
      comment = "属性计算方式"
   )
   private int propertyWay;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "单次洗炼提升类型"
   )
   private int clearType;
   @ModelColumnAnno(
      comment = "单次洗练提升数值"
   )
   private String clearNum;
   @ModelColumnAnno(
      comment = "对应星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "最大洗炼次数"
   )
   private int clearMaxTime;
   @ModelColumnAnno(
      comment = "进阶后id"
   )
   private int nextid;
   @ModelColumnAnno(
      comment = "洗炼后新id"
   )
   private int LockFreshId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public int getPropertyId() {
      return this.propertyId;
   }

   public void setPropertyId(int propertyId) {
      this.checkModify();
      this.propertyId = propertyId;
   }

   public int getPropertyType() {
      return this.propertyType;
   }

   public void setPropertyType(int propertyType) {
      this.checkModify();
      this.propertyType = propertyType;
   }

   public int getPropertyValueMin() {
      return this.propertyValueMin;
   }

   public void setPropertyValueMin(int propertyValueMin) {
      this.checkModify();
      this.propertyValueMin = propertyValueMin;
   }

   public int getPropertyValueMax() {
      return this.propertyValueMax;
   }

   public void setPropertyValueMax(int propertyValueMax) {
      this.checkModify();
      this.propertyValueMax = propertyValueMax;
   }

   public int getPropertyWay() {
      return this.propertyWay;
   }

   public void setPropertyWay(int propertyWay) {
      this.checkModify();
      this.propertyWay = propertyWay;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getClearType() {
      return this.clearType;
   }

   public void setClearType(int clearType) {
      this.checkModify();
      this.clearType = clearType;
   }

   public String getClearNum() {
      return this.clearNum;
   }

   public void setClearNum(String clearNum) {
      this.checkModify();
      this.clearNum = clearNum;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.star = star;
   }

   public int getClearMaxTime() {
      return this.clearMaxTime;
   }

   public void setClearMaxTime(int clearMaxTime) {
      this.clearMaxTime = clearMaxTime;
   }

   public int getNextid() {
      return this.nextid;
   }

   public void setNextid(int nextid) {
      this.nextid = nextid;
   }

   public int getLockFreshId() {
      return this.LockFreshId;
   }

   public void setLockFreshId(int lockFreshId) {
      this.LockFreshId = lockFreshId;
   }
}
