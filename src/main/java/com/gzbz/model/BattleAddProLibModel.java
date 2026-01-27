package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "battleAddProLib"
)
public class BattleAddProLibModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "offsetType",
      comment = "修正类型"
   )
   private byte offsetType;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 5,
      comment = "属性修正"
   )
   private List<PropertyModel> pro = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public byte getOffsetType() {
      return this.offsetType;
   }

   public void setOffsetType(byte offsetType) {
      this.checkModify();
      this.offsetType = offsetType;
   }

   public List<PropertyModel> getPro() {
      return this.pro;
   }

   public void setPro(List<PropertyModel> pro) {
      this.checkModify();
      this.pro = pro;
   }
}
