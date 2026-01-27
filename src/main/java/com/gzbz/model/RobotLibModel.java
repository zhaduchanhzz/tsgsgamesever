package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "robotLib"
)
public class RobotLibModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "编号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "type",
      comment = "所属类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "heroId",
      comment = "武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      columnName = "heroLv",
      comment = "武将等级"
   )
   private int heroLv;
   @ModelColumnAnno(
      columnName = "nation",
      comment = "阵营"
   )
   private int nation;
   @ModelColumnAnno(
      columnName = "heroType",
      comment = "职业类型"
   )
   private int heroType;
   @ModelColumnAnno(
      columnName = "starModify",
      comment = "星级修正"
   )
   private int starModify;
   @ModelColumnAnno(
      columnName = "breachModify",
      comment = "进阶次数修正"
   )
   private int breachModify;

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

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getHeroLv() {
      return this.heroLv;
   }

   public void setHeroLv(int heroLv) {
      this.checkModify();
      this.heroLv = heroLv;
   }

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
   }

   public int getHeroType() {
      return this.heroType;
   }

   public void setHeroType(int heroType) {
      this.checkModify();
      this.heroType = heroType;
   }

   public int getStarModify() {
      return this.starModify;
   }

   public void setStarModify(int starModify) {
      this.checkModify();
      this.starModify = starModify;
   }

   public int getBreachModify() {
      return this.breachModify;
   }

   public void setBreachModify(int breachModify) {
      this.checkModify();
      this.breachModify = breachModify;
   }
}
