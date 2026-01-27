package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FaQiuLastReward"
)
public class FaQiuGetLastRewardModel extends BaseModel {
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
      comment = "奖励类型"
   )
   private int rewardType;
   @ModelColumnAnno(
      comment = "奖励id"
   )
   private int rewardId;
   @ModelColumnAnno(
      comment = "奖励数量"
   )
   private int rewardValue;

   public int getId() {
      return this.id;
   }

   public boolean dayInRange(int serverOpenDay) {
      return serverOpenDay >= this.dateStart && serverOpenDay <= this.dateEnd || this.dateEnd == -1 && serverOpenDay >= this.dateStart;
   }

   public ResourceModel getReward() {
      return new ResourceModel(this.rewardType, this.rewardId, this.rewardValue);
   }
}
