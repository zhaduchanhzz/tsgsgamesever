package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "fengmoDuplicatechance"
)
public class FengmoDuplicateChanceModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "阶段"
   )
   private int openCondition;
   @ModelColumnAnno(
      comment = "最低战力"
   )
   private int warPowerLow;
   @ModelColumnAnno(
      comment = "最高战力"
   )
   private int warPowerMax;
   @ModelColumnAnno(
      comment = "副本刷出",
      columnName = "duplicate",
      columnConvertType = 4,
      subCls = KeyValFun.class,
      count = 6
   )
   private List<KeyValFun> duplicate = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getWarPowerLow() {
      return this.warPowerLow;
   }

   public void setWarPowerLow(int warPowerLow) {
      this.checkModify();
      this.warPowerLow = warPowerLow;
   }

   public int getWarPowerMax() {
      return this.warPowerMax;
   }

   public void setWarPowerMax(int warPowerMax) {
      this.checkModify();
      this.warPowerMax = warPowerMax;
   }

   public List<KeyValFun> getDuplicate() {
      return this.duplicate;
   }

   public void setDuplicate(List<KeyValFun> duplicate) {
      this.checkModify();
      this.duplicate = duplicate;
   }

   public int getOpenCondition() {
      return this.openCondition;
   }

   public void setOpenCondition(int openCondition) {
      this.checkModify();
      this.openCondition = openCondition;
   }
}
