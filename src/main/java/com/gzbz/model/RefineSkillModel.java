package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "RefineSkill"
)
public class RefineSkillModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "refineLevel"
   )
   private int refineLevel;
   @ModelColumnAnno(
      comment = "参数",
      columnConvertType = 4,
      subCls = Integer.class,
      count = 3
   )
   private List<Integer> skills = new ArrayList();

   public int getRefineLevel() {
      return this.refineLevel;
   }

   public void setRefineLevel(int refineLevel) {
      this.checkModify();
      this.refineLevel = refineLevel;
   }

   public List<Integer> getSkills() {
      return this.skills;
   }

   public void setSkills(List<Integer> skills) {
      this.checkModify();
      this.skills = skills;
   }
}
