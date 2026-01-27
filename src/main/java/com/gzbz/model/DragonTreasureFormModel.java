package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonTreasureForm"
)
public class DragonTreasureFormModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "第几期活动"
   )
   private int group;
   @ModelColumnAnno(
      comment = "槽位"
   )
   private int form;
   @ModelColumnAnno(
      comment = "是否可重复获取"
   )
   private int repeat;
   @ModelColumnAnno(
      comment = "前n次必不可出"
   )
   private int notimes;
   @ModelColumnAnno(
      comment = "必出次数"
   )
   private int suretimes;
   @ModelColumnAnno(
      comment = "元宝是否计入必出次数"
   )
   private int sureornot;
   @ModelColumnAnno(
      comment = "奖池组"
   )
   private int awardGroup;
   @ModelColumnAnno(
      comment = "元宝抽获得概率"
   )
   private int odd1;
   @ModelColumnAnno(
      comment = "道具抽获得概率"
   )
   private int odd2;
   @ModelColumnAnno(
      comment = "获得积分"
   )
   private int mark;
   @ModelColumnAnno(
      comment = "播报"
   )
   private int headlines;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public int getForm() {
      return this.form;
   }

   public void setForm(int form) {
      this.checkModify();
      this.form = form;
   }

   public int getRepeat() {
      return this.repeat;
   }

   public void setRepeat(int repeat) {
      this.checkModify();
      this.repeat = repeat;
   }

   public int getNotimes() {
      return this.notimes;
   }

   public void setNotimes(int notimes) {
      this.checkModify();
      this.notimes = notimes;
   }

   public int getSuretimes() {
      return this.suretimes;
   }

   public void setSuretimes(int suretimes) {
      this.checkModify();
      this.suretimes = suretimes;
   }

   public int getSureornot() {
      return this.sureornot;
   }

   public void setSureornot(int sureornot) {
      this.checkModify();
      this.sureornot = sureornot;
   }

   public int getAwardGroup() {
      return this.awardGroup;
   }

   public void setAwardGroup(int awardGroup) {
      this.checkModify();
      this.awardGroup = awardGroup;
   }

   public int getOdd1() {
      return this.odd1;
   }

   public void setOdd1(int odd1) {
      this.checkModify();
      this.odd1 = odd1;
   }

   public int getOdd2() {
      return this.odd2;
   }

   public void setOdd2(int odd2) {
      this.checkModify();
      this.odd2 = odd2;
   }

   public int getMark() {
      return this.mark;
   }

   public void setMark(int mark) {
      this.checkModify();
      this.mark = mark;
   }

   public int getHeadlines() {
      return this.headlines;
   }

   public void setHeadlines(int headlines) {
      this.checkModify();
      this.headlines = headlines;
   }
}
