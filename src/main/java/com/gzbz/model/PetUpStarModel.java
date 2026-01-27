package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "petUpStar"
)
public class PetUpStarModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "升星规则ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "nextId",
      comment = "下一星级id"
   )
   private int nextId;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "star",
      comment = "神兽星级"
   )
   private int star;
   @ModelColumnAnno(
      columnName = "needFlyLevel",
      comment = "飞升等级要求"
   )
   private int needFlyLevel;
   @ModelColumnAnno(
      columnName = "levelMax",
      comment = "神兽等级上限"
   )
   private int levelMax;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "升星材料"
   )
   private List<ResourceModel> needItemsFun = new ArrayList();
   @ModelColumnAnno(
      columnName = "hpAward",
      comment = "升星生命固定奖励"
   )
   private int hpAward;
   @ModelColumnAnno(
      columnName = "atkAward",
      comment = "升星攻击固定奖励"
   )
   private int atkAward;
   @ModelColumnAnno(
      columnName = "armatureId",
      comment = "神兽模型资源"
   )
   private int armatureId;
   @ModelColumnAnno(
      columnName = "skillId",
      comment = "专属技能id"
   )
   private int skillId;
   @ModelColumnAnno(
      columnName = "proportion",
      comment = "主动技能id"
   )
   private int proportion;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "分解返还"
   )
   private List<ResourceModel> retrieve = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getNeedFlyLevel() {
      return this.needFlyLevel;
   }

   public void setNeedFlyLevel(int needFlyLevel) {
      this.checkModify();
      this.needFlyLevel = needFlyLevel;
   }

   public int getLevelMax() {
      return this.levelMax;
   }

   public void setLevelMax(int levelMax) {
      this.checkModify();
      this.levelMax = levelMax;
   }

   public List<ResourceModel> getNeedItemsFun() {
      return this.needItemsFun;
   }

   public void setNeedItemsFun(List<ResourceModel> needItemsFun) {
      this.checkModify();
      this.needItemsFun = needItemsFun;
   }

   public int getHpAward() {
      return this.hpAward;
   }

   public void setHpAward(int hpAward) {
      this.checkModify();
      this.hpAward = hpAward;
   }

   public int getAtkAward() {
      return this.atkAward;
   }

   public void setAtkAward(int atkAward) {
      this.checkModify();
      this.atkAward = atkAward;
   }

   public int getArmatureId() {
      return this.armatureId;
   }

   public void setArmatureId(int armatureId) {
      this.checkModify();
      this.armatureId = armatureId;
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public int getProportion() {
      return this.proportion;
   }

   public void setProportion(int proportion) {
      this.checkModify();
      this.proportion = proportion;
   }

   public List<ResourceModel> getRetrieve() {
      return this.retrieve;
   }

   public void setRetrieve(List<ResourceModel> retrieve) {
      this.checkModify();
      this.retrieve = retrieve;
   }
}
