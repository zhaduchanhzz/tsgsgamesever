package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ExclusiveWeaponUpStar"
)
public class ExclusiveWeaponUpStarModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "升星规则ID"
   )
   private int id;
   @ModelColumnAnno(
      comment = "下一星级id"
   )
   private int next;
   @ModelColumnAnno(
      comment = "星级"
   )
   private int starLevel;
   @ModelColumnAnno(
      comment = "强化等级上限"
   )
   private int levelMax;
   @ModelColumnAnno(
      comment = "解锁专属技能id"
   )
   private int newSkill;
   @ModelColumnAnno(
      comment = "护佑槽位解锁数量"
   )
   private int blessSlotsNum;
   @ModelColumnAnno(
      comment = "升星生命成长系数（万分之）"
   )
   private int hpAward;
   @ModelColumnAnno(
      comment = "升星防御成长系数（万分之）"
   )
   private int atkAward;
   @ModelColumnAnno(
      comment = "升星防御成长系数（万分之）"
   )
   private int defAward;
   @ModelColumnAnno(
      comment = "升星速度成长系数（万分之）"
   )
   private int spdAward;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "额外属性"
   )
   private ArrayList<PropertyModel> extraAtt = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "星级加成属性"
   )
   private ArrayList<PropertyModel> starAtt = new ArrayList();
   @ModelColumnAnno(
      comment = "本体材料id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "本体材料星级"
   )
   private int itemStar;
   @ModelColumnAnno(
      comment = "本体材料数量"
   )
   private int itemNum;
   @ModelColumnAnno(
      comment = "升星材料组id"
   )
   private int libId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNext() {
      return this.next;
   }

   public void setNext(int next) {
      this.checkModify();
      this.next = next;
   }

   public int getStarLevel() {
      return this.starLevel;
   }

   public void setStarLevel(int starLevel) {
      this.checkModify();
      this.starLevel = starLevel;
   }

   public int getLevelMax() {
      return this.levelMax;
   }

   public void setLevelMax(int levelMax) {
      this.checkModify();
      this.levelMax = levelMax;
   }

   public int getNewSkill() {
      return this.newSkill;
   }

   public void setNewSkill(int newSkill) {
      this.checkModify();
      this.newSkill = newSkill;
   }

   public int getBlessSlotsNum() {
      return this.blessSlotsNum;
   }

   public void setBlessSlotsNum(int blessSlotsNum) {
      this.checkModify();
      this.blessSlotsNum = blessSlotsNum;
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

   public int getDefAward() {
      return this.defAward;
   }

   public void setDefAward(int defAward) {
      this.checkModify();
      this.defAward = defAward;
   }

   public int getSpdAward() {
      return this.spdAward;
   }

   public void setSpdAward(int spdAward) {
      this.checkModify();
      this.spdAward = spdAward;
   }

   public ArrayList<PropertyModel> getExtraAtt() {
      return this.extraAtt;
   }

   public void setExtraAtt(ArrayList<PropertyModel> extraAtt) {
      this.checkModify();
      this.extraAtt = extraAtt;
   }

   public ArrayList<PropertyModel> getStarAtt() {
      return this.starAtt;
   }

   public void setStarAtt(ArrayList<PropertyModel> starAtt) {
      this.checkModify();
      this.starAtt = starAtt;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getItemStar() {
      return this.itemStar;
   }

   public void setItemStar(int itemStar) {
      this.checkModify();
      this.itemStar = itemStar;
   }

   public int getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(int itemNum) {
      this.checkModify();
      this.itemNum = itemNum;
   }

   public int getLibId() {
      return this.libId;
   }

   public void setLibId(int libId) {
      this.checkModify();
      this.libId = libId;
   }
}
