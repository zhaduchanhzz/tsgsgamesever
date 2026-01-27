package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FirstYearFourteenSignAward"
)
public class FirstYearFourteenSignAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动天数"
   )
   private int day;
   @ModelColumnAnno(
      comment = "开服天数组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "开服天数组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "奖励列表",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public int getDay() {
      return this.day;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public boolean theDayInRegion(int signDay) {
      return signDay >= this.dateStart && (this.dateEnd < this.dateStart || signDay <= this.dateEnd);
   }
}
