package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "equipExtraSix"
)
public class EquipExtraSixModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "评分"
   )
   private int score;
   @ModelColumnAnno(
      comment = "基础装备",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> baseEquip = new ArrayList();
   @ModelColumnAnno(
      comment = "锻造消耗",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3
   )
   private List<ResourceModel> cost = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }

   public List<Integer> getBaseEquip() {
      return this.baseEquip;
   }

   public void setBaseEquip(List<Integer> baseEquip) {
      this.checkModify();
      this.baseEquip = baseEquip;
   }

   public List<ResourceModel> getCost() {
      return this.cost;
   }

   public void setCost(List<ResourceModel> cost) {
      this.checkModify();
      this.cost = cost;
   }
}
