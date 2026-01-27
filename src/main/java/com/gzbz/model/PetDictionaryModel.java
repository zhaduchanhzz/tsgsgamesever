package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "petDictionary"
)
public class PetDictionaryModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "petId",
      isPrimaty = true,
      comment = "神兽id"
   )
   private int petId;
   @ModelColumnAnno(
      columnName = "priority",
      comment = "优先级"
   )
   private int priority;
   @ModelColumnAnno(
      columnName = "isShow",
      comment = "是否在图鉴中展示"
   )
   private int isShow;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getPetId() {
      return this.petId;
   }

   public void setPetId(int petId) {
      this.checkModify();
      this.petId = petId;
   }

   public int getPriority() {
      return this.priority;
   }

   public void setPriority(int priority) {
      this.checkModify();
      this.priority = priority;
   }

   public int getIsShow() {
      return this.isShow;
   }

   public void setIsShow(int isShow) {
      this.checkModify();
      this.isShow = isShow;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
