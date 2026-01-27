package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ActivityOpenServerTimeBaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ArtifactActivateNewest"
)
public class ArtifactActivateNewestModel extends ActivityOpenServerTimeBaseModel {
   @ModelColumnAnno(
      comment = "激活道具类型"
   )
   private int exchangeType;
   @ModelColumnAnno(
      comment = "激活道具id"
   )
   private int exchangeId;
   @ModelColumnAnno(
      comment = "激活道具数量"
   )
   private int exchangeNum;
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> rewards = new ArrayList();

   public String getCustomExcelName() {
      return "customArtifactActivateNewest";
   }

   public int getExchangeType() {
      return this.exchangeType;
   }

   public void setExchangeType(int exchangeType) {
      this.checkModify();
      this.exchangeType = exchangeType;
   }

   public int getExchangeId() {
      return this.exchangeId;
   }

   public void setExchangeId(int exchangeId) {
      this.checkModify();
      this.exchangeId = exchangeId;
   }

   public int getExchangeNum() {
      return this.exchangeNum;
   }

   public void setExchangeNum(int exchangeNum) {
      this.checkModify();
      this.exchangeNum = exchangeNum;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.rewards = rewards;
   }
}
