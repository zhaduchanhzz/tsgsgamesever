package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "starSkill"
)
public class StarSkillModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "技能组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "阵营分类"
   )
   private int classify;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> base = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, StarSkillModel> allMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         StarSkillModel value = (StarSkillModel)entry.getValue();
         String key = value.getGroup() + "_" + value.getClassify() + "_" + value.getLevel();
         allMap.put(key, value);
      }

      pool.putMap("customStarSkill", allMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public int getClassify() {
      return this.classify;
   }

   public void setClassify(int classify) {
      this.checkModify();
      this.classify = classify;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public ArrayList<PropertyModel> getBase() {
      return this.base;
   }

   public void setBase(ArrayList<PropertyModel> base) {
      this.checkModify();
      this.base = base;
   }
}
