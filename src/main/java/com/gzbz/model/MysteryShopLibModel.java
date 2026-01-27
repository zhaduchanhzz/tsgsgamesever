package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "mysteryShopLib"
)
public class MysteryShopLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "主id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "比重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "开始等级"
   )
   private int levelBegin;
   @ModelColumnAnno(
      comment = "限制等级(不包含)"
   )
   private int levelLimit;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getLevelBegin() {
      return this.levelBegin;
   }

   public void setLevelBegin(int levelBegin) {
      this.checkModify();
      this.levelBegin = levelBegin;
   }

   public int getLevelLimit() {
      return this.levelLimit;
   }

   public void setLevelLimit(int levelLimit) {
      this.checkModify();
      this.levelLimit = levelLimit;
   }
}
