package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ChiBiCoincidence"
)
public class ChiBiCoinCidenceModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = " 奖励道具"
   )
   private ArrayList<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnName = "rate",
      comment = "权重"
   )
   private int rate;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public ArrayList<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(ArrayList<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public int getRate() {
      return this.rate;
   }

   public void setRate(int rate) {
      this.checkModify();
      this.rate = rate;
   }
}
