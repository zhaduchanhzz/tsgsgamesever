package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "starSelectSkill"
)
public class StarSelectSkillModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "属性组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "印痕名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "职业限制",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> typeLimit = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Set<Integer>> typeLimit_starSkills = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         StarSelectSkillModel value = (StarSelectSkillModel)entry.getValue();
         List<Integer> typeLimitList = value.getTypeLimit();
         if (typeLimitList != null && !typeLimitList.isEmpty()) {
            for(Integer typeLimit : typeLimitList) {
               (typeLimit_starSkills.computeIfAbsent(typeLimit, (k) -> new HashSet())).add(value.getGroup());
            }
         }
      }

      pool.putMap("customStarSelectSkill", typeLimit_starSkills);
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public List<Integer> getTypeLimit() {
      return this.typeLimit;
   }

   public void setTypeLimit(List<Integer> typeLimit) {
      this.checkModify();
      this.typeLimit = typeLimit;
   }
}
