package com.gzbz.model;

import com.gzbz.model.fun.PlotBattleMonsterFun;
import com.gzbz.model.manager.BaseModel;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "plotBattle"
)
public class PlotBattleModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "name"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "monster",
      columnConvertType = 1,
      count = 10,
      subCls = PlotBattleMonsterFun.class,
      comment = "怪物"
   )
   private TreeMap<Integer, PlotBattleMonsterFun> monsters = new TreeMap();

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

   public TreeMap<Integer, PlotBattleMonsterFun> getMonsters() {
      return this.monsters;
   }

   public void setMonsters(TreeMap<Integer, PlotBattleMonsterFun> monsters) {
      this.checkModify();
      this.monsters = monsters;
   }
}
