package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "battleTemple"
)
public class BattleTempleModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "主id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "竞技场排名要求"
   )
   private int rank;
   @ModelColumnAnno(
      comment = "名字"
   )
   private String name;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "突破次数列表"
   )
   private List<Integer> levels = new ArrayList();
   @ModelColumnAnno(
      comment = "bossId"
   )
   private int boss;
   @ModelColumnAnno(
      comment = "怪物组配置id"
   )
   private int monster;
   @ModelColumnAnno(
      comment = "回合限制"
   )
   private byte boutCount;
   @ModelColumnAnno(
      comment = "称号id"
   )
   private int titleId;
   @ModelColumnAnno(
      comment = "战斗记录上限"
   )
   private int recordCount;
   @ModelColumnAnno(
      comment = "战斗记录保存时间-单位天"
   )
   private int recordTime;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 3,
      comment = "额外属性修正"
   )
   private List<PropertyModel> fun3s = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      comment = "突破等级修正"
   )
   private List<Integer> addLevel = new ArrayList();
   @ModelColumnAnno(
      comment = "副本类型"
   )
   private int copyType;

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

   public int getRank() {
      return this.rank;
   }

   public void setRank(int rank) {
      this.checkModify();
      this.rank = rank;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public List<Integer> getLevels() {
      return this.levels;
   }

   public void setLevels(List<Integer> levels) {
      this.checkModify();
      this.levels = levels;
   }

   public int getBoss() {
      return this.boss;
   }

   public void setBoss(int boss) {
      this.checkModify();
      this.boss = boss;
   }

   public int getMonster() {
      return this.monster;
   }

   public void setMonster(int monster) {
      this.checkModify();
      this.monster = monster;
   }

   public byte getBoutCount() {
      return this.boutCount;
   }

   public void setBoutCount(byte boutCount) {
      this.checkModify();
      this.boutCount = boutCount;
   }

   public int getTitleId() {
      return this.titleId;
   }

   public void setTitleId(int titleId) {
      this.checkModify();
      this.titleId = titleId;
   }

   public int getRecordCount() {
      return this.recordCount;
   }

   public void setRecordCount(int recordCount) {
      this.checkModify();
      this.recordCount = recordCount;
   }

   public int getRecordTime() {
      return this.recordTime;
   }

   public void setRecordTime(int recordTime) {
      this.checkModify();
      this.recordTime = recordTime;
   }

   public List<PropertyModel> getFun3s() {
      return this.fun3s;
   }

   public void setFun3s(List<PropertyModel> fun3s) {
      this.checkModify();
      this.fun3s = fun3s;
   }

   public List<Integer> getAddLevel() {
      return this.addLevel;
   }

   public void setAddLevel(List<Integer> addLevel) {
      this.checkModify();
      this.addLevel = addLevel;
   }

   public int getCopyType() {
      return this.copyType;
   }

   public void setCopyType(int copyType) {
      this.checkModify();
      this.copyType = copyType;
   }
}
