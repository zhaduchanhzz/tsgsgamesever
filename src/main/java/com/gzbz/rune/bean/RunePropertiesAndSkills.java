package com.gzbz.rune.bean;

import com.gzbz.model.fun.PropertyModel;
import java.io.Serializable;
import java.util.List;

public class RunePropertiesAndSkills implements Serializable {
   private List<PropertyModel> propertyModelList;
   private List<Integer> skillList;
   private int skill4SuitModelId;

   public RunePropertiesAndSkills(List<PropertyModel> propertyModelList, List<Integer> skillList, int skill4SuitModelId) {
      this.propertyModelList = propertyModelList;
      this.skillList = skillList;
      this.skill4SuitModelId = skill4SuitModelId;
   }

   public List<PropertyModel> getPropertyModelList() {
      return this.propertyModelList;
   }

   public void setPropertyModelList(List<PropertyModel> propertyModelList) {
      this.propertyModelList = propertyModelList;
   }

   public List<Integer> getSkillList() {
      return this.skillList;
   }

   public void setSkillList(List<Integer> skillList) {
      this.skillList = skillList;
   }

   public int getSkill4SuitModelId() {
      return this.skill4SuitModelId;
   }

   public void setSkill4SuitModelId(int skill4SuitModelId) {
      this.skill4SuitModelId = skill4SuitModelId;
   }
}
