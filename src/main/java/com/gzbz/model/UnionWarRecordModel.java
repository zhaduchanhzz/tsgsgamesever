package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionWarRecord"
)
public class UnionWarRecordModel extends BaseModel {
   @ModelColumnAnno(
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "战略点位置"
   )
   private int rank;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      count = 3,
      comment = "难度战绩"
   )
   private List<Integer> records = new ArrayList();
   @ModelColumnAnno(
      comment = "废墟战绩"
   )
   private int ashe;
   @ModelColumnAnno(
      comment = "挑战失败战绩"
   )
   private int defeatRecords;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "挑战胜利奖励"
   )
   private List<ResourceModel> awards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "挑战失败奖励"
   )
   private List<ResourceModel> failAward = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRank() {
      return this.rank;
   }

   public void setRank(int rank) {
      this.checkModify();
      this.rank = rank;
   }

   public List<Integer> getRecords() {
      return this.records;
   }

   public void setRecords(List<Integer> records) {
      this.checkModify();
      this.records = records;
   }

   public int getAshe() {
      return this.ashe;
   }

   public void setAshe(int ashe) {
      this.checkModify();
      this.ashe = ashe;
   }

   public List<ResourceModel> getAwards() {
      return this.awards;
   }

   public void setAwards(List<ResourceModel> awards) {
      this.checkModify();
      this.awards = awards;
   }

   public List<ResourceModel> getFailAward() {
      return this.failAward;
   }

   public void setFailAward(List<ResourceModel> failAward) {
      this.checkModify();
      this.failAward = failAward;
   }

   public int getDefeatRecords() {
      return this.defeatRecords;
   }

   public void setDefeatRecords(int defeatRecords) {
      this.checkModify();
      this.defeatRecords = defeatRecords;
   }
}
