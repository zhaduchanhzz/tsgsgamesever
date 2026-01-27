package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroPalaceNotice"
)
public class HeroPalaceNoticeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "unlockLv",
      comment = "解锁等级"
   )
   private int unlockLv;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励"
   )
   private List<ResourceModel> items = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getUnlockLv() {
      return this.unlockLv;
   }

   public void setUnlockLv(int unlockLv) {
      this.checkModify();
      this.unlockLv = unlockLv;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
