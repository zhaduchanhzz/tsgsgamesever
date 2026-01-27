package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "StampSet"
)
public class StampSetModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "套装名称"
   )
   private String setName;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "套装一技能"
   )
   private List<Integer> setSkillId;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "各星级二技能"
   )
   private List<Integer> spSkillId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getSetName() {
      return this.setName;
   }

   public void setSetName(String setName) {
      this.checkModify();
      this.setName = setName;
   }

   public List<Integer> getSetSkillId() {
      return this.setSkillId;
   }

   public void setSetSkillId(List<Integer> setSkillId) {
      this.setSkillId = setSkillId;
   }

   public List<Integer> getSpSkillId() {
      return this.spSkillId;
   }

   public void setSpSkillId(List<Integer> spSkillId) {
      this.spSkillId = spSkillId;
   }
}
