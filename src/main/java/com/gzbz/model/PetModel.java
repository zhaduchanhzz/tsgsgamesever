package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "pet"
)
public class PetModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "神兽id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "神兽名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "quality",
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      columnName = "type",
      comment = "职业类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "levelMax",
      comment = "神兽等级上限"
   )
   private int levelMax;
   @ModelColumnAnno(
      columnName = "atkGrowUpMix",
      comment = "攻击资质最小区间"
   )
   private int atkGrowUpMix;
   @ModelColumnAnno(
      columnName = "atkGrowUpMax",
      comment = "攻击资质最大区间"
   )
   private int atkGrowUpMax;
   @ModelColumnAnno(
      columnName = "hpGrowUpMix",
      comment = "生命资质最小区间"
   )
   private int hpGrowUpMix;
   @ModelColumnAnno(
      columnName = "hpGrowUpMax",
      comment = "生命资质最大区间"
   )
   private int hpGrowUpMax;
   @ModelColumnAnno(
      columnName = "atkGrowUpAdd",
      comment = "每点攻击资质加成"
   )
   private int atkGrowUpAdd;
   @ModelColumnAnno(
      columnName = "hpGrowUpAdd",
      comment = "每点生命资质加成"
   )
   private int hpGrowUpAdd;
   @ModelColumnAnno(
      columnName = "baseAtk",
      comment = "基础攻击"
   )
   private int baseAtk;
   @ModelColumnAnno(
      columnName = "baseHp",
      comment = "基础生命"
   )
   private int baseHp;
   @ModelColumnAnno(
      columnName = "atkLevelUp",
      comment = "每级攻击成长"
   )
   private int atkLevelUp;
   @ModelColumnAnno(
      columnName = "hpLevelUp",
      comment = "每级生命成长"
   )
   private int hpLevelUp;
   @ModelColumnAnno(
      columnName = "exclusiveSkillId",
      comment = "专属技能id"
   )
   private int exclusiveSkillId;
   @ModelColumnAnno(
      columnName = "activeSkillId",
      comment = "主动技能id"
   )
   private int activeSkillId;
   @ModelColumnAnno(
      columnName = "petUpStarId",
      comment = "升星数据id"
   )
   private int petUpStarId;
   @ModelColumnAnno(
      columnName = "petFlyid",
      comment = "飞升数据id"
   )
   private int petFlyid;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "分解获得材料类型"
   )
   private List<ResourceModel> resolveItem = new ArrayList();

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

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getAtkGrowUpMix() {
      return this.atkGrowUpMix;
   }

   public void setAtkGrowUpMix(int atkGrowUpMix) {
      this.checkModify();
      this.atkGrowUpMix = atkGrowUpMix;
   }

   public int getAtkGrowUpMax() {
      return this.atkGrowUpMax;
   }

   public void setAtkGrowUpMax(int atkGrowUpMax) {
      this.checkModify();
      this.atkGrowUpMax = atkGrowUpMax;
   }

   public int getHpGrowUpMix() {
      return this.hpGrowUpMix;
   }

   public void setHpGrowUpMix(int hpGrowUpMix) {
      this.checkModify();
      this.hpGrowUpMix = hpGrowUpMix;
   }

   public int getHpGrowUpMax() {
      return this.hpGrowUpMax;
   }

   public void setHpGrowUpMax(int hpGrowUpMax) {
      this.checkModify();
      this.hpGrowUpMax = hpGrowUpMax;
   }

   public int getAtkGrowUpAdd() {
      return this.atkGrowUpAdd;
   }

   public void setAtkGrowUpAdd(int atkGrowUpAdd) {
      this.checkModify();
      this.atkGrowUpAdd = atkGrowUpAdd;
   }

   public int getHpGrowUpAdd() {
      return this.hpGrowUpAdd;
   }

   public void setHpGrowUpAdd(int hpGrowUpAdd) {
      this.checkModify();
      this.hpGrowUpAdd = hpGrowUpAdd;
   }

   public int getBaseAtk() {
      return this.baseAtk;
   }

   public void setBaseAtk(int baseAtk) {
      this.checkModify();
      this.baseAtk = baseAtk;
   }

   public int getBaseHp() {
      return this.baseHp;
   }

   public void setBaseHp(int baseHp) {
      this.checkModify();
      this.baseHp = baseHp;
   }

   public int getAtkLevelUp() {
      return this.atkLevelUp;
   }

   public void setAtkLevelUp(int atkLevelUp) {
      this.checkModify();
      this.atkLevelUp = atkLevelUp;
   }

   public int getHpLevelUp() {
      return this.hpLevelUp;
   }

   public void setHpLevelUp(int hpLevelUp) {
      this.checkModify();
      this.hpLevelUp = hpLevelUp;
   }

   public int getExclusiveSkillId() {
      return this.exclusiveSkillId;
   }

   public void setExclusiveSkillId(int exclusiveSkillId) {
      this.checkModify();
      this.exclusiveSkillId = exclusiveSkillId;
   }

   public int getActiveSkillId() {
      return this.activeSkillId;
   }

   public void setActiveSkillId(int activeSkillId) {
      this.checkModify();
      this.activeSkillId = activeSkillId;
   }

   public int getPetUpStarId() {
      return this.petUpStarId;
   }

   public void setPetUpStarId(int petUpStarId) {
      this.checkModify();
      this.petUpStarId = petUpStarId;
   }

   public List<ResourceModel> getResolveItem() {
      return this.resolveItem;
   }

   public void setResolveItem(List<ResourceModel> resolveItem) {
      this.checkModify();
      this.resolveItem = resolveItem;
   }

   public int getPetFlyid() {
      return this.petFlyid;
   }

   public void setPetFlyid(int petFlyid) {
      this.checkModify();
      this.petFlyid = petFlyid;
   }

   public int getLevelMax() {
      return this.levelMax;
   }

   public void setLevelMax(int levelMax) {
      this.checkModify();
      this.levelMax = levelMax;
   }
}
