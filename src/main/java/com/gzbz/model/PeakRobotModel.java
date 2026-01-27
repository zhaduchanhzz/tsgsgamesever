package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "peakRobot"
)
public class PeakRobotModel extends BaseModel {
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
      columnName = "nationType",
      comment = "阵营"
   )
   private int nationType;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "机器人等级随机区间"
   )
   private List<Integer> playerLv;
   @ModelColumnAnno(
      columnName = "battleId",
      comment = "battleId"
   )
   private int battleId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getNationType() {
      return this.nationType;
   }

   public void setNationType(int nationType) {
      this.nationType = nationType;
   }

   public List<Integer> getPlayerLv() {
      return this.playerLv;
   }

   public void setPlayerLv(List<Integer> playerLv) {
      this.playerLv = playerLv;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.battleId = battleId;
   }
}
