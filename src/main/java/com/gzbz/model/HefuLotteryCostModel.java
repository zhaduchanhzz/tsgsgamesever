package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HefuLotteryCost"
)
public class HefuLotteryCostModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "抽奖次数"
   )
   private int extractNum;
   @ModelColumnAnno(
      comment = "道具属性",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> consumeItems = new ArrayList();

   public int getExtractNum() {
      return this.extractNum;
   }

   public void setExtractNum(int extractNum) {
      this.checkModify();
      this.extractNum = extractNum;
   }

   public List<ResourceModel> getConsumeItems() {
      return this.consumeItems;
   }

   public void setConsumeItems(List<ResourceModel> consumeItems) {
      this.checkModify();
      this.consumeItems = consumeItems;
   }
}
