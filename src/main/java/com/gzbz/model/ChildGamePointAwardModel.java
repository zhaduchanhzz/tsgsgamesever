package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ChildGamePointAward"
)
public class ChildGamePointAwardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnName = "PointStart",
      comment = "积分范围最小值"
   )
   private int pointStart;
   @ModelColumnAnno(
      columnName = "PointEnd",
      comment = "积分范围最大值"
   )
   private int pointEnd;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
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

   public int getPointStart() {
      return this.pointStart;
   }

   public void setPointStart(int pointStart) {
      this.checkModify();
      this.pointStart = pointStart;
   }

   public int getPointEnd() {
      return this.pointEnd;
   }

   public void setPointEnd(int pointEnd) {
      this.checkModify();
      this.pointEnd = pointEnd;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
