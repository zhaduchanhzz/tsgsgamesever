package com.gzbz.model;

import com.gzbz.model.fun.WarriorsModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warriorSignetfix"
)
public class WarriorSigentFixModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "将印评分"
   )
   private int score;
   @ModelColumnAnno(
      columnName = "warriors",
      columnConvertType = 1,
      count = 1,
      subCls = WarriorsModel.class,
      comment = "将印"
   )
   private List<WarriorsModel> warriors = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<WarriorsModel> getWarriors() {
      return this.warriors;
   }

   public void setWarriors(List<WarriorsModel> warriors) {
      this.warriors = warriors;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }
}
