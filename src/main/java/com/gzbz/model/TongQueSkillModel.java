package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "TongQueSkill"
)
public class TongQueSkillModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "skillId",
      isPrimaty = true,
      comment = "技能id"
   )
   private int skillId;
   @ModelColumnAnno(
      columnName = "beautyId",
      comment = "美人id"
   )
   private int beautyId;
   @ModelColumnAnno(
      columnName = "lv",
      comment = "技能等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "nextSkill",
      comment = "下一技能"
   )
   private int nextSkill;
   @ModelColumnAnno(
      columnName = "costs",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "道具消耗"
   )
   private List<ResourceModel> costs = new ArrayList();
   @ModelColumnAnno(
      columnName = "lvLimit",
      comment = "幽会等级限制"
   )
   private int lvLimit;
   @ModelColumnAnno(
      columnName = "assistantSkill",
      comment = "副美人技能"
   )
   private int assistantSkill;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<TongQueSkillModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TongQueSkillModel model = (TongQueSkillModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.beautyId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customTongQueSkill", tempHashMap);
      ConcurrentHashMap<Integer, TongQueSkillModel> assistSkillHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TongQueSkillModel model = (TongQueSkillModel)entry.getValue();
         assistSkillHashMap.put(model.assistantSkill, model);
      }

      pool.putMap("customTongqueAssistSkill", assistSkillHashMap);
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public int getBeautyId() {
      return this.beautyId;
   }

   public void setBeautyId(int beautyId) {
      this.checkModify();
      this.beautyId = beautyId;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getNextSkill() {
      return this.nextSkill;
   }

   public void setNextSkill(int nextSkill) {
      this.checkModify();
      this.nextSkill = nextSkill;
   }

   public List<ResourceModel> getCosts() {
      return this.costs;
   }

   public void setCosts(List<ResourceModel> costs) {
      this.checkModify();
      this.costs = costs;
   }

   public int getLvLimit() {
      return this.lvLimit;
   }

   public void setLvLimit(int lvLimit) {
      this.checkModify();
      this.lvLimit = lvLimit;
   }

   public int getAssistantSkill() {
      return this.assistantSkill;
   }

   public void setAssistantSkill(int assistantSkill) {
      this.checkModify();
      this.assistantSkill = assistantSkill;
   }
}
