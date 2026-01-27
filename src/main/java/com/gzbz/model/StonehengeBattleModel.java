package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stonehengeBattle"
)
public class StonehengeBattleModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "副本类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "战斗类型(1普通 2精英 3boss 4伏兵)"
   )
   private int battleType;
   @ModelColumnAnno(
      comment = "1只挑战一次 2挑战直至胜利"
   )
   private int isEvent;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleID;
   @ModelColumnAnno(
      comment = "战斗id2"
   )
   private int battleID2;
   @ModelColumnAnno(
      comment = "条件值"
   )
   private int value;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "随机占比"
   )
   private int ratio;

   public int getId() {
      return this.id;
   }

   public int getType() {
      return this.type;
   }

   public int getBattleType() {
      return this.battleType;
   }

   public int getBattleId1() {
      return this.battleID;
   }

   public int getBattleId2() {
      return this.battleID2;
   }

   public int getValue() {
      return this.value;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public int getIsEvent() {
      return this.isEvent;
   }

   public int getRatio() {
      return this.ratio;
   }

   public int getBattleId(int wave) {
      return wave == 1 ? this.battleID : this.battleID2;
   }

   public boolean checkCon(int type, int battleType, int isEvent) {
      return this.type == type && this.battleType == battleType && this.isEvent == isEvent;
   }
}
