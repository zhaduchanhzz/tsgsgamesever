package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warriorSignet"
)
public class WarriorSignetModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "将印名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "备注描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "升级类型1合2升0无"
   )
   private int upGradeType;
   @ModelColumnAnno(
      comment = "图标"
   )
   private int icon;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = KeyValFun.class,
      count = 2,
      comment = "技能数量与概率"
   )
   private List<KeyValFun> skillNum = new ArrayList();
   @ModelColumnAnno(
      comment = "单技能组"
   )
   private int skill1_1;
   @ModelColumnAnno(
      comment = "双技能组1"
   )
   private int skill2_1;
   @ModelColumnAnno(
      comment = "双技能组2"
   )
   private int skill2_2;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "合成锁定技能消耗"
   )
   private Map<Integer, ResourceModel> skillComLock = new HashMap();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "合成属性锁定消耗"
   )
   private Map<Integer, ResourceModel> propertylock = new HashMap();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "重铸锁定技能消耗"
   )
   private Map<Integer, ResourceModel> skillRecastLock = new HashMap();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "重铸属性锁定消耗"
   )
   private Map<Integer, ResourceModel> propertyRecastlock = new HashMap();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "属性库"
   )
   private List<Integer> propertyLib = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "重铸消耗"
   )
   private List<ResourceModel> recastCost = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "精炼消耗"
   )
   private List<ResourceModel> refineCost = new ArrayList();
   @ModelColumnAnno(
      comment = "幸运重铸技能组1"
   )
   private int luckSkill1_1;
   @ModelColumnAnno(
      comment = "幸运重铸技能组2_1"
   )
   private int luckSkill2_1;
   @ModelColumnAnno(
      comment = "幸运重铸技能组2_2"
   )
   private int luckSkill2_2;
   @ModelColumnAnno(
      comment = "幸运重铸额外消耗重铸次数"
   )
   private int luckRecastCost;
   @ModelColumnAnno(
      comment = "兑换消耗Type"
   )
   private int buyCostWarriorType;
   @ModelColumnAnno(
      comment = "兑换消耗id"
   )
   private int buyCostWarriorId;
   @ModelColumnAnno(
      comment = "兑换消耗数量"
   )
   private int buyCostWarriorNum;
   @ModelColumnAnno(
      comment = "分解获得Type"
   )
   private int discomposeType;
   @ModelColumnAnno(
      comment = "分解获得id"
   )
   private int discomposeId;
   @ModelColumnAnno(
      comment = "分解获得数量"
   )
   private int discomposeNum;
   @ModelColumnAnno(
      comment = "是否能重铸锁定"
   )
   private int lockRecastjudge;
   @ModelColumnAnno(
      comment = "高级合成判断"
   )
   private int combatJudge;
   @ModelColumnAnno(
      comment = "定制消耗Id(部分定制)"
   )
   private int customizedId;
   @ModelColumnAnno(
      comment = "定制消耗(完整定制)"
   )
   private int customizedWholeId;
   @ModelColumnAnno(
      comment = "专属武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "基础属性"
   )
   private List<Integer> baseAttr = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "专属属性"
   )
   private List<Integer> zhuanshuAttr = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "技能id"
   )
   private List<Integer> skillId = new ArrayList();
   @ModelColumnAnno(
      comment = "是否可升品"
   )
   private int canImprove;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "升品消耗道具"
   )
   private List<ResourceModel> improve = new ArrayList();
   @ModelColumnAnno(
      comment = "升品后将印id"
   )
   private int improveResult;
   @ModelColumnAnno(
      comment = "回溯将印id"
   )
   private int backtrackId;

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

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getUpGradeType() {
      return this.upGradeType;
   }

   public void setUpGradeType(int upGradeType) {
      this.checkModify();
      this.upGradeType = upGradeType;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public List<KeyValFun> getSkillNum() {
      return this.skillNum;
   }

   public void setSkillNum(List<KeyValFun> skillNum) {
      this.checkModify();
      this.skillNum = skillNum;
   }

   public int getSkill1_1() {
      return this.skill1_1;
   }

   public void setSkill1_1(int skill1_1) {
      this.checkModify();
      this.skill1_1 = skill1_1;
   }

   public int getSkill2_1() {
      return this.skill2_1;
   }

   public void setSkill2_1(int skill2_1) {
      this.checkModify();
      this.skill2_1 = skill2_1;
   }

   public int getSkill2_2() {
      return this.skill2_2;
   }

   public void setSkill2_2(int skill2_2) {
      this.checkModify();
      this.skill2_2 = skill2_2;
   }

   public Map<Integer, ResourceModel> getSkillComLock() {
      return this.skillComLock;
   }

   public Map<Integer, ResourceModel> getSkillRecastLock() {
      return this.skillRecastLock;
   }

   public Map<Integer, ResourceModel> getPropertyRecastlock() {
      return this.propertyRecastlock;
   }

   public List<Integer> getPropertyLib() {
      return this.propertyLib;
   }

   public void setPropertyLib(List<Integer> propertyLib) {
      this.checkModify();
      this.propertyLib = propertyLib;
   }

   public List<ResourceModel> getRecastCost() {
      return this.recastCost;
   }

   public void setRecastCost(List<ResourceModel> recastCost) {
      this.checkModify();
      this.recastCost = recastCost;
   }

   public List<ResourceModel> getRefineCost() {
      return this.refineCost;
   }

   public void setRefineCost(List<ResourceModel> refineCost) {
      this.checkModify();
      this.refineCost = refineCost;
   }

   public int getLuckSkill1_1() {
      return this.luckSkill1_1;
   }

   public void setLuckSkill1_1(int luckSkill1_1) {
      this.checkModify();
      this.luckSkill1_1 = luckSkill1_1;
   }

   public int getLuckSkill2_1() {
      return this.luckSkill2_1;
   }

   public void setLuckSkill2_1(int luckSkill2_1) {
      this.checkModify();
      this.luckSkill2_1 = luckSkill2_1;
   }

   public int getLuckSkill2_2() {
      return this.luckSkill2_2;
   }

   public void setLuckSkill2_2(int luckSkill2_2) {
      this.checkModify();
      this.luckSkill2_2 = luckSkill2_2;
   }

   public int getLuckRecastCost() {
      return this.luckRecastCost;
   }

   public void setLuckRecastCost(int luckRecastCost) {
      this.checkModify();
      this.luckRecastCost = luckRecastCost;
   }

   public int getBuyCostWarriorType() {
      return this.buyCostWarriorType;
   }

   public void setBuyCostWarriorType(int buyCostWarriorType) {
      this.checkModify();
      this.buyCostWarriorType = buyCostWarriorType;
   }

   public int getBuyCostWarriorId() {
      return this.buyCostWarriorId;
   }

   public void setBuyCostWarriorId(int buyCostWarriorId) {
      this.checkModify();
      this.buyCostWarriorId = buyCostWarriorId;
   }

   public int getBuyCostWarriorNum() {
      return this.buyCostWarriorNum;
   }

   public void setBuyCostWarriorNum(int buyCostWarriorNum) {
      this.checkModify();
      this.buyCostWarriorNum = buyCostWarriorNum;
   }

   public int getDiscomposeType() {
      return this.discomposeType;
   }

   public void setDiscomposeType(int discomposeType) {
      this.checkModify();
      this.discomposeType = discomposeType;
   }

   public int getDiscomposeId() {
      return this.discomposeId;
   }

   public void setDiscomposeId(int discomposeId) {
      this.checkModify();
      this.discomposeId = discomposeId;
   }

   public int getDiscomposeNum() {
      return this.discomposeNum;
   }

   public void setDiscomposeNum(int discomposeNum) {
      this.checkModify();
      this.discomposeNum = discomposeNum;
   }

   public void setSkillComLock(Map<Integer, ResourceModel> skillComLock) {
      this.checkModify();
      this.skillComLock = skillComLock;
   }

   public Map<Integer, ResourceModel> getPropertylock() {
      return this.propertylock;
   }

   public void setPropertylock(Map<Integer, ResourceModel> propertylock) {
      this.checkModify();
      this.propertylock = propertylock;
   }

   public void setSkillRecastLock(Map<Integer, ResourceModel> skillRecastLock) {
      this.checkModify();
      this.skillRecastLock = skillRecastLock;
   }

   public void setPropertyRecastlock(Map<Integer, ResourceModel> propertyRecastlock) {
      this.checkModify();
      this.propertyRecastlock = propertyRecastlock;
   }

   public int getLockRecastjudge() {
      return this.lockRecastjudge;
   }

   public void setLockRecastjudge(int lockRecastjudge) {
      this.checkModify();
      this.lockRecastjudge = lockRecastjudge;
   }

   public int getCombatJudge() {
      return this.combatJudge;
   }

   public void setCombatJudge(int combatJudge) {
      this.checkModify();
      this.combatJudge = combatJudge;
   }

   public int getCustomizedId() {
      return this.customizedId;
   }

   public void setCustomizedId(int customizedId) {
      this.checkModify();
      this.customizedId = customizedId;
   }

   public int getCustomizedWholeId() {
      return this.customizedWholeId;
   }

   public void setCustomizedWholeId(int customizedWholeId) {
      this.checkModify();
      this.customizedWholeId = customizedWholeId;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public List<Integer> getBaseAttr() {
      return this.baseAttr;
   }

   public void setBaseAttr(List<Integer> baseAttr) {
      this.checkModify();
      this.baseAttr = baseAttr;
   }

   public List<Integer> getZhuanshuAttr() {
      return this.zhuanshuAttr;
   }

   public void setZhuanshuAttr(List<Integer> zhuanshuAttr) {
      this.checkModify();
      this.zhuanshuAttr = zhuanshuAttr;
   }

   public List<Integer> getSkillId() {
      return this.skillId;
   }

   public void setSkillId(List<Integer> skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public int getCanImprove() {
      return this.canImprove;
   }

   public void setCanImprove(int canImprove) {
      this.checkModify();
      this.canImprove = canImprove;
   }

   public List<ResourceModel> getImprove() {
      return this.improve;
   }

   public void setImprove(List<ResourceModel> improve) {
      this.checkModify();
      this.improve = improve;
   }

   public int getImproveResult() {
      return this.improveResult;
   }

   public void setImproveResult(int improveResult) {
      this.checkModify();
      this.improveResult = improveResult;
   }

   public int getBacktrackId() {
      return this.backtrackId;
   }

   public void setBacktrackId(int backtrackId) {
      this.checkModify();
      this.backtrackId = backtrackId;
   }
}
