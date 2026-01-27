package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HuaJiaBeautyConnectGroupNew"
)
public class HuaJiaBeautyConnectGroupNewModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno
   private int activityId;
   @ModelColumnAnno(
      columnName = "pos",
      columnConvertType = 4,
      subCls = Integer.class,
      count = 9
   )
   private List<Integer> pos = new ArrayList();
   @ModelColumnAnno
   private int weight;
   @ModelColumnAnno(
      comment = "活动最大随机次数"
   )
   private int maxTimes;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public List<Integer> getPos() {
      return this.pos;
   }

   public void setPos(List<Integer> pos) {
      this.checkModify();
      this.pos = pos;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getMaxTimes() {
      return this.maxTimes;
   }

   public void setMaxTimes(int maxTimes) {
      this.checkModify();
      this.maxTimes = maxTimes;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }
}
