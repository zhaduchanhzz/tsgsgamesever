package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "fengmoFixedBuff"
)
public class FengmoFixedBuffModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "效果类型"
   )
   private int reasultType;
   @ModelColumnAnno(
      comment = "属性id"
   )
   private int proId;
   @ModelColumnAnno(
      comment = "加成方式"
   )
   private int way;
   @ModelColumnAnno(
      comment = "加成数值"
   )
   private int value;
   @ModelColumnAnno(
      comment = "加成副本类型"
   )
   private int DuplicateType;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getReasultType() {
      return this.reasultType;
   }

   public void setReasultType(int reasultType) {
      this.checkModify();
      this.reasultType = reasultType;
   }

   public int getValue() {
      return this.value;
   }

   public void setValue(int value) {
      this.checkModify();
      this.value = value;
   }

   public int getDuplicateType() {
      return this.DuplicateType;
   }

   public void setDuplicateType(int duplicateType) {
      this.checkModify();
      this.DuplicateType = duplicateType;
   }

   public int getProId() {
      return this.proId;
   }

   public void setProId(int proId) {
      this.checkModify();
      this.proId = proId;
   }

   public int getWay() {
      return this.way;
   }

   public void setWay(int way) {
      this.checkModify();
      this.way = way;
   }
}
