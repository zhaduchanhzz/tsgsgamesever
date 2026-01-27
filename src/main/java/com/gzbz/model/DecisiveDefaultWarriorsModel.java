package com.gzbz.model;

import com.gzbz.model.fun.WarriorsExtraModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveDefaultWarriors"
)
public class DecisiveDefaultWarriorsModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "段位"
   )
   private int rankId;
   @ModelColumnAnno(
      comment = "职业"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "warriors",
      columnConvertType = 1,
      count = 2,
      subCls = WarriorsExtraModel.class,
      comment = "将印"
   )
   private List<WarriorsExtraModel> warriors = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRankId() {
      return this.rankId;
   }

   public void setRankId(int rankId) {
      this.checkModify();
      this.rankId = rankId;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public List<WarriorsExtraModel> getWarriors() {
      return this.warriors;
   }

   public void setWarriors(List<WarriorsExtraModel> warriors) {
      this.checkModify();
      this.warriors = warriors;
   }
}
