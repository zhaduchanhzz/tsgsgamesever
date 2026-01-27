package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HuaJiaActivityTableNew"
)
public class HuaJiaActivityTableNewModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
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
      comment = "活动ID"
   )
   private int actId;
   @ModelColumnAnno(
      comment = "页面切换类型"
   )
   private int showType;
   @ModelColumnAnno(
      comment = "活动类型"
   )
   private int actType;
   @ModelColumnAnno(
      comment = "活动类型"
   )
   private int group1;
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
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "玲珑绘棋翻开消耗道具"
   )
   private List<Integer> TongQueOverturnCost = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "九宫格刷新消耗"
   )
   private List<Integer> TongQueBeautyRefreshCost = new ArrayList();
   @ModelColumnAnno(
      comment = "九宫格刷新上限次数"
   )
   private int TongQueBeautyRefreshLimit;
   @ModelColumnAnno(
      comment = "活动结束出售道具"
   )
   private String sellItem;

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

   public int getActId() {
      return this.actId;
   }

   public void setActId(int actId) {
      this.checkModify();
      this.actId = actId;
   }

   public int getShowType() {
      return this.showType;
   }

   public void setShowType(int showType) {
      this.checkModify();
      this.showType = showType;
   }

   public int getGroup1() {
      return this.group1;
   }

   public void setGroup1(int group1) {
      this.checkModify();
      this.group1 = group1;
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

   public List<Integer> getTongQueOverturnCost() {
      return this.TongQueOverturnCost;
   }

   public void setTongQueOverturnCost(List<Integer> tongQueOverturnCost) {
      this.checkModify();
      this.TongQueOverturnCost = tongQueOverturnCost;
   }

   public List<Integer> getTongQueBeautyRefreshCost() {
      return this.TongQueBeautyRefreshCost;
   }

   public void setTongQueBeautyRefreshCost(List<Integer> tongQueBeautyRefreshCost) {
      this.checkModify();
      this.TongQueBeautyRefreshCost = tongQueBeautyRefreshCost;
   }

   public int getTongQueBeautyRefreshLimit() {
      return this.TongQueBeautyRefreshLimit;
   }

   public void setTongQueBeautyRefreshLimit(int tongQueBeautyRefreshLimit) {
      this.checkModify();
      this.TongQueBeautyRefreshLimit = tongQueBeautyRefreshLimit;
   }

   public String getSellItem() {
      return this.sellItem;
   }

   public void setSellItem(String sellItem) {
      this.checkModify();
      this.sellItem = sellItem;
   }
}
