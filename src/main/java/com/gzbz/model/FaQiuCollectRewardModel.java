package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FaQiuCollectReward"
)
public class FaQiuCollectRewardModel extends BaseModel {
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
      columnName = "gridid",
      columnConvertType = 4,
      subCls = Integer.class,
      comment = "格子id"
   )
   private final List<Integer> gridId = new ArrayList();
   @ModelColumnAnno(
      comment = "奖励类型"
   )
   private int rewardType;
   @ModelColumnAnno(
      comment = "奖励道具"
   )
   private int rewardId;
   @ModelColumnAnno(
      comment = "奖励数量"
   )
   private int rewardValue;

   public int getId() {
      return this.id;
   }

   public List<Integer> getGridId() {
      return this.gridId;
   }

   public boolean dayInRange(int activityOpenDay) {
      return activityOpenDay >= this.dateStart && activityOpenDay <= this.dateEnd || this.dateEnd == -1 && activityOpenDay >= this.dateStart;
   }

   public ResourceModel getReward() {
      return new ResourceModel(this.rewardType, this.rewardId, this.rewardValue);
   }
}
