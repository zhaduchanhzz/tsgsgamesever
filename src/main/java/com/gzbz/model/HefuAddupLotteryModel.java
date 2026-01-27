package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HefuReturnAward"
)
public class HefuAddupLotteryModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "dateStart"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "dateEnd"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "AddupNum"
   )
   private int AddupNum;
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }

   public int getAddupNum() {
      return this.AddupNum;
   }

   public void setAddupNum(int addupNum) {
      this.checkModify();
      this.AddupNum = addupNum;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
