package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastNeiDanGroupSkill"
)
public class GodBeastNeiDanGroupSkillModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "技能id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "技能效果类型"
   )
   private int skillType;
   @ModelColumnAnno(
      comment = "skill表的id"
   )
   private int skillId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private List<PropertyModel> baseAtt = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getSkillType() {
      return this.skillType;
   }

   public void setSkillType(int skillType) {
      this.checkModify();
      this.skillType = skillType;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public List<PropertyModel> getBaseAtt() {
      return this.baseAtt;
   }

   public void setBaseAtt(List<PropertyModel> baseAtt) {
      this.checkModify();
      this.baseAtt = baseAtt;
   }
}
