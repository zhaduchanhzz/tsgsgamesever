package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonTreasure"
)
public class DragonTreasureModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "活动id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "终极奖励初始元宝值"
   )
   private int money;
   @ModelColumnAnno(
      comment = "单次提升奖励"
   )
   private int addmoney;
   @ModelColumnAnno(
      comment = "排行奖励组"
   )
   private int centreAward;
   @ModelColumnAnno(
      comment = "元宝抽奖次数"
   )
   private int freeChance;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "元宝单次的消耗"
   )
   private List<Integer> chanceSpend = new ArrayList();
   @ModelColumnAnno(
      comment = "积分道具id"
   )
   private int point;
   @ModelColumnAnno(
      comment = "播报条数 "
   )
   private int headlinesTimes;

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

   public int getMoney() {
      return this.money;
   }

   public void setMoney(int money) {
      this.checkModify();
      this.money = money;
   }

   public int getAddmoney() {
      return this.addmoney;
   }

   public void setAddmoney(int addmoney) {
      this.checkModify();
      this.addmoney = addmoney;
   }

   public int getCentreAward() {
      return this.centreAward;
   }

   public void setCentreAward(int centreAward) {
      this.checkModify();
      this.centreAward = centreAward;
   }

   public int getFreeChance() {
      return this.freeChance;
   }

   public void setFreeChance(int freeChance) {
      this.checkModify();
      this.freeChance = freeChance;
   }

   public List<Integer> getChanceSpend() {
      return this.chanceSpend;
   }

   public void setChanceSpend(List<Integer> chanceSpend) {
      this.checkModify();
      this.chanceSpend = chanceSpend;
   }

   public int getPoint() {
      return this.point;
   }

   public void setPoint(int point) {
      this.checkModify();
      this.point = point;
   }

   public int getHeadlinesTimes() {
      return this.headlinesTimes;
   }

   public void setHeadlinesTimes(int headlinesTimes) {
      this.checkModify();
      this.headlinesTimes = headlinesTimes;
   }
}
