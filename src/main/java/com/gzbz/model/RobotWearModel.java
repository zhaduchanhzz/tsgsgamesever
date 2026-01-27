package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "robotwear"
)
public class RobotWearModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "heroLv",
      comment = "适合等级"
   )
   private int heroLv;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "equips",
      subCls = Integer.class,
      count = 4,
      comment = "装备"
   )
   private Map<Integer, Integer> equips = new TreeMap();
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "warriors",
      subCls = Integer.class,
      count = 2,
      comment = "将印"
   )
   private Map<Integer, Integer> warriors = new TreeMap();
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "warcrafts",
      subCls = Integer.class,
      count = 3,
      comment = "兵法"
   )
   private Map<Integer, Integer> warcrafts = new TreeMap();
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "stones",
      subCls = Integer.class,
      count = 4,
      comment = "宝石"
   )
   private Map<Integer, Integer> stones = new TreeMap();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getHeroLv() {
      return this.heroLv;
   }

   public void setHeroLv(int heroLv) {
      this.checkModify();
      this.heroLv = heroLv;
   }

   public Map<Integer, Integer> getEquips() {
      return this.equips;
   }

   public void setEquips(Map<Integer, Integer> equips) {
      this.checkModify();
      this.equips = equips;
   }

   public Map<Integer, Integer> getWarriors() {
      return this.warriors;
   }

   public void setWarriors(Map<Integer, Integer> warriors) {
      this.checkModify();
      this.warriors = warriors;
   }

   public Map<Integer, Integer> getWarcrafts() {
      return this.warcrafts;
   }

   public void setWarcrafts(Map<Integer, Integer> warcrafts) {
      this.checkModify();
      this.warcrafts = warcrafts;
   }

   public Map<Integer, Integer> getStones() {
      return this.stones;
   }

   public void setStones(Map<Integer, Integer> stones) {
      this.checkModify();
      this.stones = stones;
   }
}
