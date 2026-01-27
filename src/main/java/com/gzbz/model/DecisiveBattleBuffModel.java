package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveBattleBuff"
)
public class DecisiveBattleBuffModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "buff类型"
   )
   private int buffType;
   @ModelColumnAnno(
      comment = "skill表id"
   )
   private int skiiId;
   @ModelColumnAnno(
      comment = "阵营"
   )
   private int nation;
   @ModelColumnAnno(
      comment = "指定阵营"
   )
   private int designate;
   @ModelColumnAnno(
      comment = "随机权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getBuffType() {
      return this.buffType;
   }

   public void setBuffType(int buffType) {
      this.checkModify();
      this.buffType = buffType;
   }

   public int getSkiiId() {
      return this.skiiId;
   }

   public void setSkiiId(int skiiId) {
      this.checkModify();
      this.skiiId = skiiId;
   }

   public int getDesignate() {
      return this.designate;
   }

   public void setDesignate(int designate) {
      this.checkModify();
      this.designate = designate;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
   }
}
