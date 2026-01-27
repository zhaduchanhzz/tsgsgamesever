package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HuaJiaBeautyConnectNew"
)
public class HuaJiaBeautyConnectNewModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      columnName = "activityId",
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      columnConvertType = 2,
      comment = "组合",
      subCls = Integer.class
   )
   private List<Integer> group = new ArrayList();
   @ModelColumnAnno(
      columnName = "type",
      comment = "奖励类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "typeName",
      comment = "类型名称"
   )
   private String typeName;
   @ModelColumnAnno(
      columnName = "award",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getGroup() {
      return this.group;
   }

   public void setGroup(List<Integer> group) {
      this.checkModify();
      this.group = group;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public String getTypeName() {
      return this.typeName;
   }

   public void setTypeName(String typeName) {
      this.checkModify();
      this.typeName = typeName;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }
}
