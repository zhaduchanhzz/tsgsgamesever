package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastBuyEgg"
)
public class GodBeastBuyEggModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "次数id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "消耗资源类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "消耗资源id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "消耗资源数量"
   )
   private int itemNum;
   @ModelColumnAnno(
      columnName = "reward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getItemType() {
      return this.itemType;
   }

   public void setItemType(int itemType) {
      this.checkModify();
      this.itemType = itemType;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(int itemNum) {
      this.checkModify();
      this.itemNum = itemNum;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
