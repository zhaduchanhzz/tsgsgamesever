package com.gzbz.model.fun;

import com.gzbz.model.WarHorseBaseModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class BattleMonsterFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "pos",
      comment = "站位"
   )
   private byte pos;
   @ModelColumnAnno(
      columnName = "id",
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "lv",
      comment = "实际等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "showLv",
      comment = "显示等级"
   )
   private int showLv;
   @ModelColumnAnno(
      columnName = "star",
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      columnName = "offset",
      comment = "属性修正值"
   )
   private int offset;
   private ArrayList<Integer> warriorSignet = new ArrayList();
   private ArrayList<Integer> warcrafts = new ArrayList();
   private List<Integer> totemSkills = new ArrayList();
   private List<Integer> stampSkills = new ArrayList();
   private WarHorseBaseModel warHorse;
   private List<Integer> talentSkills = new ArrayList();

   public byte getPos() {
      return this.pos;
   }

   public void setPos(byte pos) {
      this.checkModify();
      this.pos = pos;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getShowLv() {
      return this.showLv;
   }

   public void setShowLv(int showLv) {
      this.checkModify();
      this.showLv = showLv;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getOffset() {
      return this.offset;
   }

   public void setOffset(int offset) {
      this.checkModify();
      this.offset = offset;
   }

   public ArrayList<Integer> getWarriorSignet() {
      return this.warriorSignet;
   }

   public void setWarriorSignet(ArrayList<Integer> warriorSignet) {
      this.warriorSignet = warriorSignet;
   }

   public ArrayList<Integer> getWarcrafts() {
      return this.warcrafts;
   }

   public void setWarcrafts(ArrayList<Integer> warcrafts) {
      this.warcrafts = warcrafts;
   }

   public List<Integer> getTotemSkills() {
      return this.totemSkills;
   }

   public void setTotemSkills(List<Integer> totemSkills) {
      this.totemSkills = totemSkills;
   }

   public List<Integer> getStampSkills() {
      return this.stampSkills;
   }

   public void setStampSkills(List<Integer> totemSkills) {
      this.stampSkills = totemSkills;
   }

   public WarHorseBaseModel getWarHorse() {
      return this.warHorse;
   }

   public void setWarHorse(WarHorseBaseModel warHorse) {
      this.warHorse = warHorse;
   }

   public List<Integer> getTalentSkills() {
      return this.talentSkills;
   }

   public String toString() {
      return "BattleMonsterFun{pos=" + this.pos + ", id=" + this.id + ", lv=" + this.lv + ", showLv=" + this.showLv + ", star=" + this.star + ", offset=" + this.offset + ", warriorSignet=" + this.warriorSignet + '}';
   }
}
