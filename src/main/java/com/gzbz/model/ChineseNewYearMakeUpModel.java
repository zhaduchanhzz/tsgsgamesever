package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ChunJieMakeUP"
)
public class ChineseNewYearMakeUpModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "组合",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> makeup = new ArrayList();
   @ModelColumnAnno(
      comment = "组合奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> Makeitem = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getMakeup() {
      return this.makeup;
   }

   public void setMakeup(List<Integer> makeup) {
      this.checkModify();
      this.makeup = makeup;
   }

   public List<ResourceModel> getMakeitem() {
      return this.Makeitem;
   }

   public void setMakeitem(List<ResourceModel> makeitem) {
      this.checkModify();
      this.Makeitem = makeitem;
   }
}
