package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "leaderPalaceSkillConsume"
)
public class LeaderPalaceSkillConsumeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "技能ID"
   )
   private int baseSkillId;
   @ModelColumnAnno(
      comment = "技能原始武将"
   )
   private int baseHeroId;
   @ModelColumnAnno(
      comment = "技能等级"
   )
   private int lv;
   @ModelColumnAnno(
      comment = "技能位置"
   )
   private int index;
   @ModelColumnAnno(
      comment = "技能职业"
   )
   private int job;
   @ModelColumnAnno(
      comment = "下一级技能"
   )
   private int next;
   @ModelColumnAnno(
      columnName = "heros",
      columnConvertType = 1,
      subCls = KeyValFun.class,
      count = 2,
      comment = "英雄消耗"
   )
   private List<KeyValFun> heros = new ArrayList();
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "物品消耗"
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnName = "talentSkills",
      columnConvertType = 4,
      subCls = String.class,
      count = 2,
      comment = "天赋技能"
   )
   private List<String> talentSkills = new ArrayList();

   public int getBaseHeroId() {
      return this.baseHeroId;
   }

   public void setBaseHeroId(int baseHeroId) {
      this.checkModify();
      this.baseHeroId = baseHeroId;
   }

   public int getBaseSkillId() {
      return this.baseSkillId;
   }

   public void setBaseSkillId(int baseSkillId) {
      this.checkModify();
      this.baseSkillId = baseSkillId;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getIndex() {
      return this.index;
   }

   public void setIndex(int index) {
      this.checkModify();
      this.index = index;
   }

   public int getJob() {
      return this.job;
   }

   public void setJob(int job) {
      this.checkModify();
      this.job = job;
   }

   public int getNext() {
      return this.next;
   }

   public void setNext(int next) {
      this.checkModify();
      this.next = next;
   }

   public List<KeyValFun> getHeros() {
      return this.heros;
   }

   public void setHeros(List<KeyValFun> heros) {
      this.checkModify();
      this.heros = heros;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public List<String> getTalentSkills() {
      return this.talentSkills;
   }

   public void setTalentSkills(List<String> talentSkills) {
      this.checkModify();
      this.talentSkills = talentSkills;
   }
}
