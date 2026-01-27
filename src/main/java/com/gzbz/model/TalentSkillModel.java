package com.gzbz.model;

import com.gzbz.model.fun.ValListFun;
import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "talentSkill"
)
public class TalentSkillModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "武将ID"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "潜能等级"
   )
   private int level;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ValListFun.class,
      count = 9,
      comment = "技能"
   )
   private Map<Integer, ValListFun> skills = new HashMap();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public Map<Integer, ValListFun> getSkills() {
      return this.skills;
   }

   public void setSkills(Map<Integer, ValListFun> skills) {
      this.checkModify();
      this.skills = skills;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, TalentSkillModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TalentSkillModel model = (TalentSkillModel)entry.getValue();
         ((TreeMap)tempMap.computeIfAbsent(model.heroId, (v) -> new TreeMap())).put(model.level, model);
      }

      pool.putMap("customTalentSkill", tempMap);
   }
}
