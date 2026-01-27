package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FaQiuExploreLottery"
)
public class FaQiuExploreLotteryModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "日期组开始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组结束"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemsType;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemsId;
   @ModelColumnAnno(
      comment = "物品类型"
   )
   private int itemsValue;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public int getWeight() {
      return this.weight;
   }

   public boolean dayInRange(int serverOpenDay) {
      return serverOpenDay >= this.dateStart && serverOpenDay <= this.dateEnd || this.dateEnd == -1 && serverOpenDay >= this.dateStart;
   }

   public ResourceModel getRewards() {
      return new ResourceModel(this.itemsType, this.itemsId, this.itemsValue);
   }
}
