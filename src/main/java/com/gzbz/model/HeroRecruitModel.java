package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroRecruit"
)
public class HeroRecruitModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "将星录类型"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "consumeItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "消耗道具"
   )
   private ArrayList<ResourceModel> consumeItems = new ArrayList();
   @ModelColumnAnno(
      columnName = "receiveItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "获得道具"
   )
   private ArrayList<ResourceModel> receiveItems = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public ArrayList<ResourceModel> getConsumeItems() {
      return this.consumeItems;
   }

   public void setConsumeItems(ArrayList<ResourceModel> consumeItems) {
      this.checkModify();
      this.consumeItems = consumeItems;
   }

   public ArrayList<ResourceModel> getReceiveItems() {
      return this.receiveItems;
   }

   public void setReceiveItems(ArrayList<ResourceModel> receiveItems) {
      this.checkModify();
      this.receiveItems = receiveItems;
   }
}
