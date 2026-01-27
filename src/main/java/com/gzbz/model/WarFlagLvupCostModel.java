package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "countryWarFlagLvupCost"
)
public class WarFlagLvupCostModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "lv"
   )
   private int lv;
   @ModelColumnAnno(
      comment = "nextlv"
   )
   private int nextlv;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "升级消耗"
   )
   private List<ResourceModel> lvUpCost = new ArrayList();
   @ModelColumnAnno(
      comment = "激活随机属性数量"
   )
   private int hotRandomPropertyNum;

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getNextlv() {
      return this.nextlv;
   }

   public void setNextlv(int nextlv) {
      this.checkModify();
      this.nextlv = nextlv;
   }

   public List<ResourceModel> getLvUpCost() {
      return this.lvUpCost;
   }

   public void setLvUpCost(List<ResourceModel> lvUpCost) {
      this.checkModify();
      this.lvUpCost = lvUpCost;
   }

   public int getHotRandomPropertyNum() {
      return this.hotRandomPropertyNum;
   }

   public void setHotRandomPropertyNum(int hotRandomPropertyNum) {
      this.checkModify();
      this.hotRandomPropertyNum = hotRandomPropertyNum;
   }
}
