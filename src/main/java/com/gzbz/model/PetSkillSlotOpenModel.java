package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "petSkillSlotOpen"
)
public class PetSkillSlotOpenModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "petSkillNum",
      isPrimaty = true,
      comment = "材料神兽技能数"
   )
   private int petSkillNum;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "skillOdds",
      subCls = Integer.class,
      count = 5,
      comment = "转换技能概率"
   )
   private Map<Integer, Integer> skillOdds = new TreeMap();
   @ModelColumnAnno(
      columnName = "SkillSlotOpenOdd",
      comment = "技能槽位拓展额外概率"
   )
   private int SkillSlotOpenOdd;

   public int getPetSkillNum() {
      return this.petSkillNum;
   }

   public void setPetSkillNum(int petSkillNum) {
      this.checkModify();
      this.petSkillNum = petSkillNum;
   }

   public Map<Integer, Integer> getSkillOdds() {
      return this.skillOdds;
   }

   public void setSkillOdds(Map<Integer, Integer> skillOdds) {
      this.checkModify();
      this.skillOdds = skillOdds;
   }

   public int getSkillSlotOpenOdd() {
      return this.SkillSlotOpenOdd;
   }

   public void setSkillSlotOpenOdd(int skillSlotOpenOdd) {
      this.checkModify();
      this.SkillSlotOpenOdd = skillSlotOpenOdd;
   }
}
