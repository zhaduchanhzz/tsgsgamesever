package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "skillKingTalent"
)
public class SkillKingTalentModel extends BaseModel {
   @ModelColumnAnno(
      comment = "天赋技能ID",
      isPrimaty = true
   )
   private int skillId;
   @ModelColumnAnno(
      comment = "heroId"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "type"
   )
   private int type;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 3,
      comment = "开场buff"
   )
   private ArrayList<PropertyModel> buffs = new ArrayList();

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public ArrayList<PropertyModel> getBuffs() {
      return this.buffs;
   }

   public void setBuffs(ArrayList<PropertyModel> buffs) {
      this.checkModify();
      this.buffs = buffs;
   }
}
