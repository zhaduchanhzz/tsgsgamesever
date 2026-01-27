package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ActivityOpenServerTimeBaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ArtifactPrizeNewest"
)
public class ArtifactSkinPrizeModel extends ActivityOpenServerTimeBaseModel {
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      comment = "选取上限"
   )
   private int chooseMax;
   @ModelColumnAnno(
      comment = "必出指定次数"
   )
   private int appearNum;
   @ModelColumnAnno(
      comment = "前置抽取需求次数"
   )
   private int floorNum;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   public String getCustomExcelName() {
      return "customArtifactPrizeNewest";
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public int getChooseMax() {
      return this.chooseMax;
   }

   public void setChooseMax(int chooseMax) {
      this.checkModify();
      this.chooseMax = chooseMax;
   }

   public int getAppearNum() {
      return this.appearNum;
   }

   public void setAppearNum(int appearNum) {
      this.checkModify();
      this.appearNum = appearNum;
   }

   public int getFloorNum() {
      return this.floorNum;
   }

   public void setFloorNum(int floorNum) {
      this.checkModify();
      this.floorNum = floorNum;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
