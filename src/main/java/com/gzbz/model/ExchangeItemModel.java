package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "exchangeItem"
)
public class ExchangeItemModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "composeLib",
      comment = "组合库id"
   )
   private int composeLib;
   @ModelColumnAnno(
      columnName = "obtainType",
      comment = "获得的物品类型"
   )
   private int obtainType;
   @ModelColumnAnno(
      columnName = "obtainId",
      comment = "获得的物品id"
   )
   private int obtainId;
   @ModelColumnAnno(
      columnName = "odds",
      comment = "概率"
   )
   private int odds;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getComposeLib() {
      return this.composeLib;
   }

   public void setComposeLib(int composeLib) {
      this.checkModify();
      this.composeLib = composeLib;
   }

   public int getObtainType() {
      return this.obtainType;
   }

   public void setObtainType(int obtainType) {
      this.checkModify();
      this.obtainType = obtainType;
   }

   public int getObtainId() {
      return this.obtainId;
   }

   public void setObtainId(int obtainId) {
      this.checkModify();
      this.obtainId = obtainId;
   }

   public int getOdds() {
      return this.odds;
   }

   public void setOdds(int odds) {
      this.checkModify();
      this.odds = odds;
   }
}
