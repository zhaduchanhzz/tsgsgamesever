package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "leaderTacticsSkill"
)
public class LeaderTacticsSkillModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "技能位置"
   )
   private int type;
   @ModelColumnAnno(
      comment = "技能职业"
   )
   private String job;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "职业技能"
   )
   private List<Integer> jobskill = new ArrayList();
   @ModelColumnAnno(
      comment = "阶级"
   )
   private int breach;
   @ModelColumnAnno(
      comment = "学习所需前置天命技ID"
   )
   private int needDestinyId;
   @ModelColumnAnno(
      comment = "学习所需天命技总等级"
   )
   private int needDestinySumLv;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "学习消耗"
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnName = "heros",
      columnConvertType = 1,
      subCls = KeyValFun.class,
      count = 2,
      comment = "英雄消耗"
   )
   private List<KeyValFun> heros = new ArrayList();
   @ModelColumnAnno(
      columnName = "talentSkill",
      columnConvertType = 4,
      subCls = String.class,
      count = 3,
      comment = "天赋技能"
   )
   private List<String> talentSkill = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, LeaderTacticsSkillModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         LeaderTacticsSkillModel model = (LeaderTacticsSkillModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.getBreach(), (v) -> new HashMap())).put(model.getId(), model);
      }

      pool.putMap("customLeaderTacticsSkill", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getJob() {
      return this.job;
   }

   public void setJob(String job) {
      this.checkModify();
      this.job = job;
   }

   public int getBreach() {
      return this.breach;
   }

   public void setBreach(int breach) {
      this.checkModify();
      this.breach = breach;
   }

   public int getNeedDestinyId() {
      return this.needDestinyId;
   }

   public void setNeedDestinyId(int needDestinyId) {
      this.checkModify();
      this.needDestinyId = needDestinyId;
   }

   public int getNeedDestinySumLv() {
      return this.needDestinySumLv;
   }

   public void setNeedDestinySumLv(int needDestinySumLv) {
      this.checkModify();
      this.needDestinySumLv = needDestinySumLv;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public List<KeyValFun> getHeros() {
      return this.heros;
   }

   public void setHeros(List<KeyValFun> heros) {
      this.checkModify();
      this.heros = heros;
   }

   public List<Integer> getJobskill() {
      return this.jobskill;
   }

   public void setJobskill(List<Integer> jobskill) {
      this.checkModify();
      this.jobskill = jobskill;
   }

   public List<String> getTalentSkill() {
      return this.talentSkill;
   }

   public void setTalentSkill(List<String> talentSkill) {
      this.checkModify();
      this.talentSkill = talentSkill;
   }
}
