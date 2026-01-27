package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "box"
)
public class BoxModel extends BaseModel {
   @ModelColumnAnno(
      comment = "宝箱id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "宝箱id"
   )
   private int iconId;
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 6
   )
   private List<ResourceModel> item = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.checkModify();
      this.iconId = iconId;
   }

   public List<ResourceModel> getItem() {
      return this.item;
   }

   public void setItem(List<ResourceModel> item) {
      this.checkModify();
      this.item = item;
   }
}
