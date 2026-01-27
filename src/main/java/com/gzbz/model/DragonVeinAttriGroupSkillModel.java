package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DragonVeinAttriGroupSkill"
)
public class DragonVeinAttriGroupSkillModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "技能id"
   )
   private List<Integer> skill = new ArrayList();
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public List<Integer> getSkill() {
      return this.skill;
   }

   public void setSkill(List<Integer> skill) {
      this.skill = skill;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }
}
