package com.gzbz.model;

import com.gzbz.model.fun.CorrectWeightModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DragonVeinPositionLevel"
)
public class DragonVeinPositionLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "等级区间下限"
   )
   private int levelDown;
   @ModelColumnAnno(
      comment = "等级区间上限"
   )
   private int levelUP;
   @ModelColumnAnno(
      columnName = "level",
      columnConvertType = 1,
      subCls = CorrectWeightModel.class,
      comment = "等级修正值权重"
   )
   private List<CorrectWeightModel> level = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLevelDown() {
      return this.levelDown;
   }

   public void setLevelDown(int levelDown) {
      this.checkModify();
      this.levelDown = levelDown;
   }

   public int getLevelUP() {
      return this.levelUP;
   }

   public void setLevelUP(int levelUP) {
      this.checkModify();
      this.levelUP = levelUP;
   }

   public List<CorrectWeightModel> getLevel() {
      return this.level;
   }

   public void setLevel(List<CorrectWeightModel> level) {
      this.checkModify();
      this.level = level;
   }
}
