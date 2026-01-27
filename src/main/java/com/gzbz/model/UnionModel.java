package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "union"
)
public class UnionModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "unionLevel",
      isPrimaty = true,
      comment = "军团等级"
   )
   private int unionLevel;
   @ModelColumnAnno(
      columnName = "unionNum",
      comment = "军团成员人数"
   )
   private int unionNum;
   @ModelColumnAnno(
      columnName = "viceLeaderNum",
      comment = "副团长人数"
   )
   private int viceLeaderNum;
   @ModelColumnAnno(
      columnName = "needUnionExp",
      comment = "升级消耗军团经验"
   )
   private int needUnionExp;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getUnionLevel() {
      return this.unionLevel;
   }

   public void setUnionLevel(int unionLevel) {
      this.checkModify();
      this.unionLevel = unionLevel;
   }

   public int getUnionNum() {
      return this.unionNum;
   }

   public void setUnionNum(int unionNum) {
      this.checkModify();
      this.unionNum = unionNum;
   }

   public int getViceLeaderNum() {
      return this.viceLeaderNum;
   }

   public void setViceLeaderNum(int viceLeaderNum) {
      this.checkModify();
      this.viceLeaderNum = viceLeaderNum;
   }

   public int getNeedUnionExp() {
      return this.needUnionExp;
   }

   public void setNeedUnionExp(int needUnionExp) {
      this.checkModify();
      this.needUnionExp = needUnionExp;
   }
}
