package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "RuneStarNature"
)
public class RuneStarNatureModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "星级属性组id"
   )
   private int starNatureId;
   @ModelColumnAnno(
      comment = "位置"
   )
   private int seat;
   @ModelColumnAnno(
      comment = "星级"
   )
   private int starLv;
   @ModelColumnAnno(
      columnName = "pro",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 4,
      comment = "星级属性"
   )
   private ArrayList<PropertyModel> pro = new ArrayList();

   public int getStarNatureId() {
      return this.starNatureId;
   }

   public void setStarNatureId(int starNatureId) {
      this.checkModify();
      this.starNatureId = starNatureId;
   }

   public int getSeat() {
      return this.seat;
   }

   public void setSeat(int seat) {
      this.checkModify();
      this.seat = seat;
   }

   public int getStarLv() {
      return this.starLv;
   }

   public void setStarLv(int starLv) {
      this.checkModify();
      this.starLv = starLv;
   }

   public ArrayList<PropertyModel> getPro() {
      return this.pro;
   }

   public void setPro(ArrayList<PropertyModel> pro) {
      this.checkModify();
      this.pro = pro;
   }
}
