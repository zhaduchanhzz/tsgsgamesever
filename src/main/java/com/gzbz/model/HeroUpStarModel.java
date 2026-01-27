package com.gzbz.model;

import com.gzbz.model.fun.NeedItemsFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroUpStar"
)
public class HeroUpStarModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "升星规则ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "next",
      comment = "下一级别"
   )
   private int next;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "starLevel",
      comment = "星级"
   )
   private int starLevel;
   @ModelColumnAnno(
      columnName = "playerLevel",
      comment = "玩家等级前置条件"
   )
   private int playerLevel;
   @ModelColumnAnno(
      columnName = "worldLevel",
      comment = "世界等级前置条件"
   )
   private int worldLevel;
   @ModelColumnAnno(
      columnName = "levelMax",
      comment = "等级上限"
   )
   private int levelMax;
   @ModelColumnAnno(
      columnName = "skillSlot",
      comment = "该星级替换技能槽"
   )
   private int skillSlot;
   @ModelColumnAnno(
      columnName = "newSkill",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "新技能id"
   )
   private List<Integer> newSkillList = new ArrayList();
   @ModelColumnAnno(
      columnName = "hpAward",
      comment = "进阶生命成长系数"
   )
   private int hpAward;
   @ModelColumnAnno(
      columnName = "atkAward",
      comment = "进阶攻击成长系数"
   )
   private int atkAward;
   @ModelColumnAnno(
      columnName = "defAward",
      comment = "进阶攻击成长系数"
   )
   private int defAward;
   @ModelColumnAnno(
      columnName = "spdAward",
      comment = "进阶攻击成长系数"
   )
   private int spdAward;
   @ModelColumnAnno(
      columnName = "resistAward",
      comment = "升星免伤成长固定值"
   )
   private int resistAward;
   @ModelColumnAnno(
      columnName = "itemNum",
      comment = "需求将星石数量"
   )
   private int itemNum;
   @ModelColumnAnno(
      columnName = "NeedItemsFun",
      columnConvertType = 1,
      subCls = NeedItemsFun.class,
      count = 5,
      comment = "材料"
   )
   private ArrayList<NeedItemsFun> needItems = new ArrayList();
   @ModelColumnAnno(
      columnName = "specialItem",
      comment = "特殊材料-道具id"
   )
   private int specialItem;
   @ModelColumnAnno(
      columnName = "specialItemNum",
      comment = "特殊材料-道具数量"
   )
   private int specialItemNum;
   @ModelColumnAnno(
      columnName = "specialItem2",
      comment = "特殊材料2-道具id"
   )
   private int specialItem2;
   @ModelColumnAnno(
      columnName = "specialItemNum2",
      comment = "特殊材料2-道具数量"
   )
   private int specialItemNum2;
   @ModelColumnAnno(
      columnName = "herostar",
      comment = "需要武将星级"
   )
   private int herostar;
   @ModelColumnAnno(
      columnName = "heroNum",
      comment = "需要武将个数"
   )
   private int heroNum;

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

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getStarLevel() {
      return this.starLevel;
   }

   public void setStarLevel(int starLevel) {
      this.checkModify();
      this.starLevel = starLevel;
   }

   public int getPlayerLevel() {
      return this.playerLevel;
   }

   public void setPlayerLevel(int playerLevel) {
      this.checkModify();
      this.playerLevel = playerLevel;
   }

   public int getWorldLevel() {
      return this.worldLevel;
   }

   public void setWorldLevel(int worldLevel) {
      this.checkModify();
      this.worldLevel = worldLevel;
   }

   public int getLevelMax() {
      return this.levelMax;
   }

   public void setLevelMax(int levelMax) {
      this.checkModify();
      this.levelMax = levelMax;
   }

   public int getSkillSlot() {
      return this.skillSlot;
   }

   public void setSkillSlot(int skillSlot) {
      this.checkModify();
      this.skillSlot = skillSlot;
   }

   public List<Integer> getNewSkillList() {
      return this.newSkillList;
   }

   public void setNewSkillList(List<Integer> newSkillList) {
      this.checkModify();
      this.newSkillList = newSkillList;
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

   public int getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(int itemNum) {
      this.checkModify();
      this.itemNum = itemNum;
   }

   public ArrayList<NeedItemsFun> getNeedItems() {
      return this.needItems;
   }

   public void setNeedItems(ArrayList<NeedItemsFun> needItems) {
      this.checkModify();
      this.needItems = needItems;
   }

   public int getSpecialItem() {
      return this.specialItem;
   }

   public void setSpecialItem(int specialItem) {
      this.checkModify();
      this.specialItem = specialItem;
   }

   public int getSpecialItemNum() {
      return this.specialItemNum;
   }

   public void setSpecialItemNum(int specialItemNum) {
      this.checkModify();
      this.specialItemNum = specialItemNum;
   }

   public int getResistAward() {
      return this.resistAward;
   }

   public void setResistAward(int resistAward) {
      this.checkModify();
      this.resistAward = resistAward;
   }

   public int getSpecialItem2() {
      return this.specialItem2;
   }

   public void setSpecialItem2(int specialItem2) {
      this.checkModify();
      this.specialItem2 = specialItem2;
   }

   public int getSpecialItemNum2() {
      return this.specialItemNum2;
   }

   public void setSpecialItemNum2(int specialItemNum2) {
      this.checkModify();
      this.specialItemNum2 = specialItemNum2;
   }

   public int getHerostar() {
      return this.herostar;
   }

   public void setHerostar(int herostar) {
      this.checkModify();
      this.herostar = herostar;
   }

   public int getHeroNum() {
      return this.heroNum;
   }

   public void setHeroNum(int heroNum) {
      this.checkModify();
      this.heroNum = heroNum;
   }
}
