package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroRestraint"
)
public class HeroRestraintModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "阵营ID"
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 4,
      subCls = Integer.class,
      comment = "技能效果id"
   )
   private ArrayList<Integer> skillEffect = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public ArrayList<Integer> getSkillEffect() {
      return this.skillEffect;
   }

   public void setSkillEffect(ArrayList<Integer> skillEffect) {
      this.skillEffect = skillEffect;
   }
}
