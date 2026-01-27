package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "videoReward"
)
public class VideoRewardModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "礼包id",
      columnName = "package"
   )
   private int packageId;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> reward = new ArrayList();
   @ModelColumnAnno(
      comment = "限领次数"
   )
   private int time;
   @ModelColumnAnno(
      comment = "初始开服天数"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "末尾开服天数"
   )
   private int dateEnd;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getPackageId() {
      return this.packageId;
   }

   public void setPackageId(int packageId) {
      this.packageId = packageId;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> rewards) {
      this.reward = rewards;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.time = time;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.dateEnd = dateEnd;
   }
}
