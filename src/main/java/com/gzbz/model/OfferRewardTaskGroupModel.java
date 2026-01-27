package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "offerTaskGroup"
)
public class OfferRewardTaskGroupModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "战力下限"
   )
   private int warPowerLow;
   @ModelColumnAnno(
      comment = "战力上限"
   )
   private int warPowerMax;
   @ModelColumnAnno(
      comment = "刷出概率",
      columnConvertType = 1,
      subCls = KeyValFun.class,
      count = 13
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
}
