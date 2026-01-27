package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "underPalaceBuff"
)
public class UnderPalaceBuffModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "库id"
   )
   private int labId;
   @ModelColumnAnno(
      comment = "激活技能id",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> skilleffectId = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLabId() {
      return this.labId;
   }

   public void setLabId(int labId) {
      this.checkModify();
      this.labId = labId;
   }

   public List<Integer> getSkilleffectId() {
      return this.skilleffectId;
   }

   public void setSkilleffectId(List<Integer> skilleffectId) {
      this.checkModify();
      this.skilleffectId = skilleffectId;
   }
}
