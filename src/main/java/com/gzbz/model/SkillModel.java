package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "skill"
)
public class SkillModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "技能id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "lv",
      comment = "技能等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "type",
      comment = "类别"
   )
   private byte type;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "技能功能集合"
   )
   private List<Integer> funcType = new ArrayList();
   @ModelColumnAnno(
      columnName = "force",
      comment = "是否强制释放"
   )
   private byte force;
   @ModelColumnAnno(
      columnName = "startRound",
      comment = "起手回合"
   )
   private byte startRound;
   @ModelColumnAnno(
      columnName = "coolDown",
      comment = "冷却"
   )
   private byte coolDown;
   @ModelColumnAnno(
      columnName = "mainEffect",
      comment = "主效果"
   )
   private int mainEffect;
   @ModelColumnAnno(
      columnName = "skillId",
      comment = "穿戴普通皮肤同时拥有觉醒皮肤的时候，该技能需要改为此技能id"
   )
   private int skillId;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "effects",
      subCls = Integer.class,
      count = 10,
      comment = "技能效果"
   )
   private Map<Integer, Integer> effects = new TreeMap();
   @ModelColumnAnno(
      columnName = "isRate",
      comment = "是否稀有"
   )
   private byte isRate;
   @ModelColumnAnno(
      columnName = "icon",
      comment = "技能图标-请确认是否是数字"
   )
   private int icon;
   @ModelColumnAnno(
      columnName = "forgetReturn",
      comment = "遗忘返还龙魂玉"
   )
   private int forgetReturn;
   @ModelColumnAnno(
      columnName = "forgetCost",
      comment = "遗忘消耗元宝"
   )
   private int forgetCost;
   @ModelColumnAnno(
      columnName = "upCostsoul",
      comment = "升级消耗魂玉id"
   )
   private int upCostsoul;
   @ModelColumnAnno(
      columnName = "upCostsoulNum",
      comment = "升级魂玉数量"
   )
   private int upCostsoulNum;
   @ModelColumnAnno(
      columnName = "upCostsouljade",
      comment = "消耗龙魂玉数量"
   )
   private int upCostsouljade;
   @ModelColumnAnno(
      columnName = "upResult",
      comment = "升级后id"
   )
   private int upResult;
   @ModelColumnAnno(
      columnName = "nextSkillid",
      comment = "下一级别技能id"
   )
   private int nextSkillid;
   @ModelColumnAnno(
      columnName = "replaceSkillRate",
      comment = "替换几率"
   )
   private int replaceSkillRate;
   @ModelColumnAnno(
      columnName = "replaceSkillId",
      comment = "替换技能"
   )
   private int replaceSkillId;
   @ModelColumnAnno(
      columnName = "desr",
      comment = "技能说明"
   )
   private String desr;
   @ModelColumnAnno(
      columnName = "index",
      comment = "技能位置"
   )
   private int index;
   @ModelColumnAnno(
      columnName = "palaceSkill",
      comment = "对应君主府技能"
   )
   private int palaceSkill;
   @ModelColumnAnno(
      columnName = "job",
      comment = "使用武将的职业"
   )
   private int job;
   @ModelColumnAnno(
      columnName = "lastSkillid",
      comment = "上一级技能"
   )
   private int lastSkillid;

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

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public byte getType() {
      return this.type;
   }

   public void setType(byte type) {
      this.checkModify();
      this.type = type;
   }

   public List<Integer> getFuncType() {
      return this.funcType;
   }

   public void setFuncType(List<Integer> funcType) {
      this.checkModify();
      this.funcType = funcType;
   }

   public byte getForce() {
      return this.force;
   }

   public void setForce(byte force) {
      this.checkModify();
      this.force = force;
   }

   public byte getStartRound() {
      return this.startRound;
   }

   public void setStartRound(byte startRound) {
      this.checkModify();
      this.startRound = startRound;
   }

   public byte getCoolDown() {
      return this.coolDown;
   }

   public void setCoolDown(byte coolDown) {
      this.checkModify();
      this.coolDown = coolDown;
   }

   public int getMainEffect() {
      return this.mainEffect;
   }

   public void setMainEffect(int mainEffect) {
      this.checkModify();
      this.mainEffect = mainEffect;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public Map<Integer, Integer> getEffects() {
      return this.effects;
   }

   public void setEffects(Map<Integer, Integer> effects) {
      this.checkModify();
      this.effects = effects;
   }

   public byte getIsRate() {
      return this.isRate;
   }

   public void setIsRate(byte isRate) {
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

   public int getForgetReturn() {
      return this.forgetReturn;
   }

   public void setForgetReturn(int forgetReturn) {
      this.checkModify();
      this.forgetReturn = forgetReturn;
   }

   public int getForgetCost() {
      return this.forgetCost;
   }

   public void setForgetCost(int forgetCost) {
      this.checkModify();
      this.forgetCost = forgetCost;
   }

   public int getUpCostsoul() {
      return this.upCostsoul;
   }

   public void setUpCostsoul(int upCostsoul) {
      this.checkModify();
      this.upCostsoul = upCostsoul;
   }

   public int getUpCostsoulNum() {
      return this.upCostsoulNum;
   }

   public void setUpCostsoulNum(int upCostsoulNum) {
      this.checkModify();
      this.upCostsoulNum = upCostsoulNum;
   }

   public int getUpCostsouljade() {
      return this.upCostsouljade;
   }

   public void setUpCostsouljade(int upCostsouljade) {
      this.checkModify();
      this.upCostsouljade = upCostsouljade;
   }

   public int getUpResult() {
      return this.upResult;
   }

   public void setUpResult(int upResult) {
      this.checkModify();
      this.upResult = upResult;
   }

   public int getNextSkillid() {
      return this.nextSkillid;
   }

   public void setNextSkillid(int nextSkillid) {
      this.checkModify();
      this.nextSkillid = nextSkillid;
   }

   public int getReplaceSkillRate() {
      return this.replaceSkillRate;
   }

   public void setReplaceSkillRate(int replaceSkillRate) {
      this.checkModify();
      this.replaceSkillRate = replaceSkillRate;
   }

   public int getReplaceSkillId() {
      return this.replaceSkillId;
   }

   public void setReplaceSkillId(int replaceSkillId) {
      this.checkModify();
      this.replaceSkillId = replaceSkillId;
   }

   public String getDesr() {
      return this.desr;
   }

   public void setDesr(String desr) {
      this.checkModify();
      this.desr = desr;
   }

   public int getIndex() {
      return this.index;
   }

   public void setIndex(int index) {
      this.checkModify();
      this.index = index;
   }

   public int getPalaceSkill() {
      return this.palaceSkill;
   }

   public void setPalaceSkill(int palaceSkill) {
      this.checkModify();
      this.palaceSkill = palaceSkill;
   }

   public int getJob() {
      return this.job;
   }

   public void setJob(int job) {
      this.checkModify();
      this.job = job;
   }

   public int getLastSkillid() {
      return this.lastSkillid;
   }

   public void setLastSkillid(int lastSkillid) {
      this.checkModify();
      this.lastSkillid = lastSkillid;
   }
}
