package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionDonatePointsBox"
)
public class UnionDonatePointsBoxModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "宝箱序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "所需捐献进度"
   )
   private int needPonits;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励道具"
   )
   private List<ResourceModel> items = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNeedPonits() {
      return this.needPonits;
   }

   public void setNeedPonits(int needPonits) {
      this.checkModify();
      this.needPonits = needPonits;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
