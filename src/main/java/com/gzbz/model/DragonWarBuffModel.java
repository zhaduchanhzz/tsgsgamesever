package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonWarBuff"
)
public class DragonWarBuffModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "目标类型"
   )
   private int target;
   @ModelColumnAnno(
      comment = "skill表id"
   )
   private int skillId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1,
      comment = "开场buff"
   )
   private ArrayList<PropertyModel> buffs = new ArrayList();
   @ModelColumnAnno(
      comment = "消耗增益点"
   )
   private int consume;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getConsume() {
      return this.consume;
   }

   public void setConsume(int consume) {
      this.checkModify();
      this.consume = consume;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.skillId = skillId;
   }

   public int getTarget() {
      return this.target;
   }

   public void setTarget(int target) {
      this.checkModify();
      this.target = target;
   }

   public ArrayList<PropertyModel> getBuffs() {
      return this.buffs;
   }

   public void setBuffs(ArrayList<PropertyModel> buffs) {
      this.checkModify();
      this.buffs = buffs;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
