package com.gzbz.model;

import com.gzbz.model.fun.WarriorsModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveBattleRobotWear"
)
public class BattleWearModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "battleId",
      isPrimaty = true,
      comment = "battleId"
   )
   private int battleId;
   @ModelColumnAnno(
      columnName = "warrior1",
      columnConvertType = 1,
      count = 2,
      subCls = WarriorsModel.class,
      comment = "将印"
   )
   private List<WarriorsModel> warrior1 = new ArrayList();
   @ModelColumnAnno(
      columnName = "warrior2",
      columnConvertType = 1,
      count = 2,
      subCls = WarriorsModel.class,
      comment = "将印"
   )
   private List<WarriorsModel> warrior2 = new ArrayList();
   @ModelColumnAnno(
      columnName = "warrior3",
      columnConvertType = 1,
      count = 2,
      subCls = WarriorsModel.class,
      comment = "将印"
   )
   private List<WarriorsModel> warrior3 = new ArrayList();
   @ModelColumnAnno(
      columnName = "warrior4",
      columnConvertType = 1,
      count = 2,
      subCls = WarriorsModel.class,
      comment = "将印"
   )
   private List<WarriorsModel> warrior4 = new ArrayList();
   @ModelColumnAnno(
      columnName = "warrior5",
      columnConvertType = 1,
      count = 2,
      subCls = WarriorsModel.class,
      comment = "将印"
   )
   private List<WarriorsModel> warrior5 = new ArrayList();
   @ModelColumnAnno(
      columnName = "warrior6",
      columnConvertType = 1,
      count = 2,
      subCls = WarriorsModel.class,
      comment = "将印"
   )
   private List<WarriorsModel> warrior6 = new ArrayList();

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public List<WarriorsModel> getWarrior1() {
      return this.warrior1;
   }

   public void setWarrior1(List<WarriorsModel> warrior1) {
      this.checkModify();
      this.warrior1 = warrior1;
   }

   public List<WarriorsModel> getWarrior2() {
      return this.warrior2;
   }

   public void setWarrior2(List<WarriorsModel> warrior2) {
      this.checkModify();
      this.warrior2 = warrior2;
   }

   public List<WarriorsModel> getWarrior3() {
      return this.warrior3;
   }

   public void setWarrior3(List<WarriorsModel> warrior3) {
      this.checkModify();
      this.warrior3 = warrior3;
   }

   public List<WarriorsModel> getWarrior4() {
      return this.warrior4;
   }

   public void setWarrior4(List<WarriorsModel> warrior4) {
      this.checkModify();
      this.warrior4 = warrior4;
   }

   public List<WarriorsModel> getWarrior5() {
      return this.warrior5;
   }

   public void setWarrior5(List<WarriorsModel> warrior5) {
      this.checkModify();
      this.warrior5 = warrior5;
   }

   public List<WarriorsModel> getWarrior6() {
      return this.warrior6;
   }

   public void setWarrior6(List<WarriorsModel> warrior6) {
      this.checkModify();
      this.warrior6 = warrior6;
   }
}
