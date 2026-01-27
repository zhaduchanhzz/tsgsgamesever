package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FengmoBuff"
)
public class FengmoBuffModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "阶段buff"
   )
   private List<Integer> buffId = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "增益buff"
   )
   private List<Integer> buffId2 = new ArrayList();
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "数量"
   )
   private int value;
   @ModelColumnAnno(
      columnName = "item",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private ArrayList<ResourceModel> item = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getBuffId() {
      return this.buffId;
   }

   public void setBuffId(List<Integer> buffId) {
      this.checkModify();
      this.buffId = buffId;
   }

   public List<Integer> getBuffId2() {
      return this.buffId2;
   }

   public void setBuffId2(List<Integer> buffId2) {
      this.checkModify();
      this.buffId2 = buffId2;
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

   public int getValue() {
      return this.value;
   }

   public void setValue(int value) {
      this.checkModify();
      this.value = value;
   }

   public ArrayList<ResourceModel> getItem() {
      return this.item;
   }

   public void setItem(ArrayList<ResourceModel> item) {
      this.checkModify();
      this.item = item;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }
}
