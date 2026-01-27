package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "beautyMain"
)
public class BeautyMainModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动类型"
   )
   private int actType;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "持续时间"
   )
   private List<Integer> times = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "对应阶段组"
   )
   private List<Integer> group1 = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "单次抽奖消耗"
   )
   private List<Integer> spend = new ArrayList();
   @ModelColumnAnno(
      comment = "跨服记录最多显示条数"
   )
   private int codeTimes;
   @ModelColumnAnno(
      comment = "个人记录最多显示条数"
   )
   private int codeTimes2;
   @ModelColumnAnno(
      comment = "跨服记录最多显示条数"
   )
   private int delayTimes;
   @ModelColumnAnno(
      comment = "是否显示剩余次数"
   )
   private int showtimes;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getCodeTimes() {
      return this.codeTimes;
   }

   public void setCodeTimes(int codeTimes) {
      this.checkModify();
      this.codeTimes = codeTimes;
   }

   public int getCodeTimes2() {
      return this.codeTimes2;
   }

   public void setCodeTimes2(int codeTimes2) {
      this.checkModify();
      this.codeTimes2 = codeTimes2;
   }

   public int getDelayTimes() {
      return this.delayTimes;
   }

   public void setDelayTimes(int delayTimes) {
      this.checkModify();
      this.delayTimes = delayTimes;
   }

   public int getShowtimes() {
      return this.showtimes;
   }

   public void setShowtimes(int showtimes) {
      this.checkModify();
      this.showtimes = showtimes;
   }

   public List<Integer> getTimes() {
      return this.times;
   }

   public void setTimes(List<Integer> times) {
      this.checkModify();
      this.times = times;
   }

   public List<Integer> getGroup1() {
      return this.group1;
   }

   public void setGroup1(List<Integer> group1) {
      this.checkModify();
      this.group1 = group1;
   }

   public List<Integer> getSpend() {
      return this.spend;
   }

   public void setSpend(List<Integer> spend) {
      this.checkModify();
      this.spend = spend;
   }

   public int getActType() {
      return this.actType;
   }

   public void setActType(int actType) {
      this.checkModify();
      this.actType = actType;
   }
}
