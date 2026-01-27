package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FaQiuLotteryCost"
)
public class FaQiuLotteryCostModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "消耗道具类型"
   )
   private int propType;
   @ModelColumnAnno(
      comment = "消耗道具id"
   )
   private int propId;
   @ModelColumnAnno(
      comment = "消耗道具数量"
   )
   private int propValue;

   public ResourceModel getCost() {
      return new ResourceModel(this.propType, this.propId, this.propValue);
   }
}
