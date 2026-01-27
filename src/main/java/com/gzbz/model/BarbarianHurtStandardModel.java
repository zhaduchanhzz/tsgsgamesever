package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "barbarianHurtStandard"
)
public class BarbarianHurtStandardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "Type",
      comment = "奖励类型"
   )
   private int Type;
   @ModelColumnAnno(
      columnName = "lowerLimit",
      comment = "伤害下限"
   )
   private int lowerLimit;
   @ModelColumnAnno(
      columnName = "higherLimit",
      comment = "伤害上限"
   )
   private int higherLimit;
   @ModelColumnAnno(
      columnName = "award",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "奖励"
   )
   private List<ResourceModel> award = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.Type;
   }

   public void setType(int type) {
      this.Type = type;
   }

   public int getLowerLimit() {
      return this.lowerLimit;
   }

   public void setLowerLimit(int lowerLimit) {
      this.checkModify();
      this.lowerLimit = lowerLimit;
   }

   public int getHigherLimit() {
      return this.higherLimit;
   }

   public void setHigherLimit(int higherLimit) {
      this.checkModify();
      this.higherLimit = higherLimit;
   }

   public List<ResourceModel> getAward() {
      return this.award;
   }

   public void setAward(List<ResourceModel> award) {
      this.checkModify();
      this.award = award;
   }
}
