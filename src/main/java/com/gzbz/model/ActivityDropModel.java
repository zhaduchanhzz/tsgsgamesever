package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "activityDrop"
)
public class ActivityDropModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "活动id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String remark;
   @ModelColumnAnno(
      comment = "属性道具类型"
   )
   private int propertyPropsType;
   @ModelColumnAnno(
      comment = "属性道具id"
   )
   private int propertyPropsId;
   @ModelColumnAnno(
      comment = "使用道具类型"
   )
   private int usePropsType;
   @ModelColumnAnno(
      comment = "使用道具"
   )
   private int useProps;
   @ModelColumnAnno(
      comment = "掉落时间s"
   )
   private int dropTime;
   @ModelColumnAnno(
      comment = "次数限制"
   )
   private int limitDaily;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setRemark(String remark) {
      this.checkModify();
      this.remark = remark;
   }

   public int getPropertyPropsType() {
      return this.propertyPropsType;
   }

   public void setPropertyPropsType(int propertyPropsType) {
      this.checkModify();
      this.propertyPropsType = propertyPropsType;
   }

   public int getPropertyPropsId() {
      return this.propertyPropsId;
   }

   public void setPropertyPropsId(int propertyPropsId) {
      this.checkModify();
      this.propertyPropsId = propertyPropsId;
   }

   public int getUsePropsType() {
      return this.usePropsType;
   }

   public void setUsePropsType(int usePropsType) {
      this.checkModify();
      this.usePropsType = usePropsType;
   }

   public int getUseProps() {
      return this.useProps;
   }

   public void setUseProps(int useProps) {
      this.checkModify();
      this.useProps = useProps;
   }

   public int getDropTime() {
      return this.dropTime;
   }

   public void setDropTime(int dropTime) {
      this.checkModify();
      this.dropTime = dropTime;
   }

   public int getLimitDaily() {
      return this.limitDaily;
   }

   public void setLimitDaily(int limitDaily) {
      this.limitDaily = limitDaily;
   }
}
