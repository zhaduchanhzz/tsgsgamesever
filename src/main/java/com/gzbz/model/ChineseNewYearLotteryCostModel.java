package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ChunJieLotteryCost"
)
public class ChineseNewYearLotteryCostModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "抽奖类型"
   )
   private int extractType;
   @ModelColumnAnno(
      comment = "消耗道具",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> consumeItems = new ArrayList();
   @ModelColumnAnno(
      comment = "抽奖次数"
   )
   private int extractNum;

   public int getExtractType() {
      return this.extractType;
   }

   public void setExtractType(int extractType) {
      this.checkModify();
      this.extractType = extractType;
   }

   public List<ResourceModel> getConsumeItems() {
      return this.consumeItems;
   }

   public void setConsumeItems(List<ResourceModel> consumeItems) {
      this.checkModify();
      this.consumeItems = consumeItems;
   }

   public int getExtractNum() {
      return this.extractNum;
   }

   public void setExtractNum(int extractNum) {
      this.checkModify();
      this.extractNum = extractNum;
   }
}
