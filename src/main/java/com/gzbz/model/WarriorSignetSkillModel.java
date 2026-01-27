package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warriorSignetSkill"
)
public class WarriorSignetSkillModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "power",
      comment = "战力/评分"
   )
   private int power;
   @ModelColumnAnno(
      columnName = "showType",
      comment = "类别"
   )
   private int showType;
   @ModelColumnAnno(
      columnName = "isRate",
      comment = "是否稀有"
   )
   private int isRate;
   @ModelColumnAnno(
      columnName = "icon",
      comment = "技能图标"
   )
   private int icon;
   @ModelColumnAnno(
      columnName = "lv",
      comment = "技能等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "baseSkill",
      comment = "初始技能"
   )
   private int baseSkill;
   @ModelColumnAnno(
      columnName = "type",
      comment = "技能类型"
   )
   private int type;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "effects",
      subCls = Integer.class,
      count = 5,
      comment = "效果"
   )
   private Map<Integer, Integer> effects = new TreeMap();
   @ModelColumnAnno(
      columnName = "lastId",
      comment = "上一级id"
   )
   private int lastId;
   @ModelColumnAnno(
      columnName = "nextId",
      comment = "下一级id"
   )
   private int nextId;
   @ModelColumnAnno(
      columnName = "learnItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "学习消耗"
   )
   private List<ResourceModel> learnItems = new ArrayList();
   @ModelColumnAnno(
      columnName = "upItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "升级消耗"
   )
   private List<ResourceModel> upItems = new ArrayList();
   @ModelColumnAnno(
      columnName = "forgetItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "遗忘消耗"
   )
   private List<ResourceModel> forgetItems = new ArrayList();
   @ModelColumnAnno(
      columnName = "desr",
      comment = "技能说明"
   )
   private String desr;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getPower() {
      return this.power;
   }

   public void setPower(int power) {
      this.checkModify();
      this.power = power;
   }

   public int getShowType() {
      return this.showType;
   }

   public void setShowType(int showType) {
      this.checkModify();
      this.showType = showType;
   }

   public int getIsRate() {
      return this.isRate;
   }

   public void setIsRate(int isRate) {
      this.checkModify();
      this.isRate = isRate;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getBaseSkill() {
      return this.baseSkill;
   }

   public void setBaseSkill(int baseSkill) {
      this.checkModify();
      this.baseSkill = baseSkill;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getLastId() {
      return this.lastId;
   }

   public void setLastId(int lastId) {
      this.checkModify();
      this.lastId = lastId;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public List<ResourceModel> getLearnItems() {
      return this.learnItems;
   }

   public void setLearnItems(List<ResourceModel> learnItems) {
      this.checkModify();
      this.learnItems = learnItems;
   }

   public List<ResourceModel> getUpItems() {
      return this.upItems;
   }

   public void setUpItems(List<ResourceModel> upItems) {
      this.checkModify();
      this.upItems = upItems;
   }

   public List<ResourceModel> getForgetItems() {
      return this.forgetItems;
   }

   public void setForgetItems(List<ResourceModel> forgetItems) {
      this.checkModify();
      this.forgetItems = forgetItems;
   }

   public String getDesr() {
      return this.desr;
   }

   public void setDesr(String desr) {
      this.checkModify();
      this.desr = desr;
   }

   public Map<Integer, Integer> getEffects() {
      return this.effects;
   }

   public void setEffects(Map<Integer, Integer> effects) {
      this.checkModify();
      this.effects = effects;
   }
}
