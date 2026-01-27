package com.gzbz.model;

import com.gzbz.model.fun.HeroRandomFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "robot"
)
public class RobotModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "编号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "type",
      comment = "机器人类型"
   )
   private int type;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "机器人等级随机区间"
   )
   private List<Integer> playerLv;
   @ModelColumnAnno(
      columnName = "armyAdviser",
      comment = "神兵(如果有神兵需要另外配表)"
   )
   private int armyAdviser;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = HeroRandomFun.class,
      count = 6,
      comment = "武将"
   )
   private ArrayList<HeroRandomFun> heros = new ArrayList();
   @ModelColumnAnno(
      columnName = "score",
      comment = "校场积分"
   )
   private int score;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public List<Integer> getPlayerLv() {
      return this.playerLv;
   }

   public void setPlayerLv(List<Integer> playerLv) {
      this.checkModify();
      this.playerLv = playerLv;
   }

   public int getArmyAdviser() {
      return this.armyAdviser;
   }

   public void setArmyAdviser(int armyAdviser) {
      this.checkModify();
      this.armyAdviser = armyAdviser;
   }

   public ArrayList<HeroRandomFun> getHeros() {
      return this.heros;
   }

   public void setHeros(ArrayList<HeroRandomFun> heros) {
      this.checkModify();
      this.heros = heros;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }
}
