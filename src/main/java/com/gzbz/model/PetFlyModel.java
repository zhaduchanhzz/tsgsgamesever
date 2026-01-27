package com.gzbz.model;

import com.gzbz.model.fun.NeedItemsFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "petFly"
)
public class PetFlyModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "飞升规则ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "nextId",
      comment = "下一等级id"
   )
   private int nextId;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "needLevel",
      comment = "前置等级要求"
   )
   private int needLevel;
   @ModelColumnAnno(
      columnName = "needStar",
      comment = "前置星级要求"
   )
   private int needStar;
   @ModelColumnAnno(
      columnName = "flyLevel",
      comment = "飞升阶段"
   )
   private int flyLevel;
   @ModelColumnAnno(
      columnName = "atkGrowUp",
      comment = "攻击资质提升"
   )
   private int atkGrowUp;
   @ModelColumnAnno(
      columnName = "hpGrowUp",
      comment = "生命资质提升"
   )
   private int hpGrowUp;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "材料"
   )
   private List<ResourceModel> needItemsFun = new ArrayList();
   @ModelColumnAnno(
      columnName = "needPetFun",
      columnConvertType = 1,
      subCls = NeedItemsFun.class,
      count = 3,
      comment = "神兽材料"
   )
   private Map<Integer, NeedItemsFun> needPetFun = new HashMap();
   @ModelColumnAnno(
      columnName = "hpFlyAward",
      comment = "飞升生命固定奖励"
   )
   private int hpFlyAward;
   @ModelColumnAnno(
      columnName = "atkFlyAward",
      comment = "飞升攻击固定奖励"
   )
   private int atkFlyAward;
   @ModelColumnAnno(
      columnName = "exclusiveBuffId",
      comment = "专属技能被动id"
   )
   private int exclusiveBuffId;
   @ModelColumnAnno(
      columnName = "activeBuffId",
      comment = "主动技能被动id"
   )
   private int activeBuffId;
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

   public int getNeedLevel() {
      return this.needLevel;
   }

   public void setNeedLevel(int needLevel) {
      this.checkModify();
      this.needLevel = needLevel;
   }

   public int getNeedStar() {
      return this.needStar;
   }

   public void setNeedStar(int needStar) {
      this.checkModify();
      this.needStar = needStar;
   }

   public int getFlyLevel() {
      return this.flyLevel;
   }

   public void setFlyLevel(int flyLevel) {
      this.checkModify();
      this.flyLevel = flyLevel;
   }

   public int getAtkGrowUp() {
      return this.atkGrowUp;
   }

   public void setAtkGrowUp(int atkGrowUp) {
      this.checkModify();
      this.atkGrowUp = atkGrowUp;
   }

   public int getHpGrowUp() {
      return this.hpGrowUp;
   }

   public void setHpGrowUp(int hpGrowUp) {
      this.checkModify();
      this.hpGrowUp = hpGrowUp;
   }

   public List<ResourceModel> getNeedItemsFun() {
      return this.needItemsFun;
   }

   public void setNeedItemsFun(List<ResourceModel> needItemsFun) {
      this.checkModify();
      this.needItemsFun = needItemsFun;
   }

   public int getHpFlyAward() {
      return this.hpFlyAward;
   }

   public void setHpFlyAward(int hpFlyAward) {
      this.checkModify();
      this.hpFlyAward = hpFlyAward;
   }

   public int getAtkFlyAward() {
      return this.atkFlyAward;
   }

   public void setAtkFlyAward(int atkFlyAward) {
      this.checkModify();
      this.atkFlyAward = atkFlyAward;
   }

   public int getExclusiveBuffId() {
      return this.exclusiveBuffId;
   }

   public void setExclusiveBuffId(int exclusiveBuffId) {
      this.checkModify();
      this.exclusiveBuffId = exclusiveBuffId;
   }

   public int getActiveBuffId() {
      return this.activeBuffId;
   }

   public void setActiveBuffId(int activeBuffId) {
      this.checkModify();
      this.activeBuffId = activeBuffId;
   }

   public List<ResourceModel> getRetrieve() {
      return this.retrieve;
   }

   public void setRetrieve(List<ResourceModel> retrieve) {
      this.checkModify();
      this.retrieve = retrieve;
   }

   public Map<Integer, NeedItemsFun> getNeedPetFun() {
      return this.needPetFun;
   }

   public void setNeedPetFun(Map<Integer, NeedItemsFun> needPetFun) {
      this.checkModify();
      this.needPetFun = needPetFun;
   }
}
