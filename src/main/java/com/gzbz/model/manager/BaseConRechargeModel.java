package com.gzbz.model.manager;

import com.gzbz.model.fun.ResourceModel;
import java.util.List;
import model.ModelColumnAnno;

public abstract class BaseConRechargeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
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
   @ModelColumnAnno(
      comment = "阶段层数"
   )
   private int stageNum;
   @ModelColumnAnno(
      comment = "充值挡位"
   )
   private int rechargeGear;
   @ModelColumnAnno(
      comment = "充值数额"
   )
   private int rechargeNum;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
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

   public int getStageNum() {
      return this.stageNum;
   }

   public void setStageNum(int stageNum) {
      this.checkModify();
      this.stageNum = stageNum;
   }

   public int getRechargeGear() {
      return this.rechargeGear;
   }

   public void setRechargeGear(int rechargeGear) {
      this.checkModify();
      this.rechargeGear = rechargeGear;
   }

   public int getRechargeNum() {
      return this.rechargeNum;
   }

   public void setRechargeNum(int rechargeNum) {
      this.checkModify();
      this.rechargeNum = rechargeNum;
   }

   public abstract List<ResourceModel> getRewards();
}
