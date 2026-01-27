package com.gzbz.godBeast.bean;

import com.gzbz.model.fun.PropertyModel;
import java.util.ArrayList;
import java.util.List;

public class NeiDanSkillAndPro {
   private List<Integer> skillList = new ArrayList();
   private List<PropertyModel> proList = new ArrayList();

   public NeiDanSkillAndPro() {
   }

   public NeiDanSkillAndPro(List<Integer> skillList, List<PropertyModel> proList) {
      this.skillList = skillList;
      this.proList = proList;
   }

   public List<Integer> getSkillList() {
      return this.skillList;
   }

   public void setSkillList(List<Integer> skillList) {
      this.skillList = skillList;
   }

   public List<PropertyModel> getProList() {
      return this.proList;
   }

   public void setProList(List<PropertyModel> proList) {
      this.proList = proList;
   }
}
