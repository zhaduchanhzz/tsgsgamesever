package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "demonList"
)
public class DemonStrikesNpcModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno
   private String name;
   @ModelColumnAnno(
      columnName = "battleId"
   )
   private int battle;
   @ModelColumnAnno(
      columnName = "defencePoint"
   )
   private int defense;
   @ModelColumnAnno(
      columnName = "actionNum"
   )
   private int num;
   @ModelColumnAnno(
      columnName = "nextAction"
   )
   private int actionSecond;
   @ModelColumnAnno(
      columnName = "target",
      columnConvertType = 4,
      subCls = Integer.class,
      comment = "功能点攻打目标",
      count = 10
   )
   private List<Integer> target = new ArrayList();

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

   public int getDefense() {
      return this.defense;
   }

   public void setDefense(int defense) {
      this.checkModify();
      this.defense = defense;
   }

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      this.checkModify();
      this.num = num;
   }

   public int getActionSecond() {
      return this.actionSecond;
   }

   public void setActionSecond(int actionSecond) {
      this.checkModify();
      this.actionSecond = actionSecond;
   }

   public List<Integer> getTarget() {
      return this.target;
   }

   public void setTarget(List<Integer> target) {
      this.checkModify();
      this.target = target;
   }

   public int getBattle() {
      return this.battle;
   }

   public void setBattle(int battle) {
      this.checkModify();
      this.battle = battle;
   }
}
