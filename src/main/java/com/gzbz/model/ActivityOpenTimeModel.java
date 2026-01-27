package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "activityopenTime"
)
public class ActivityOpenTimeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = " activityId",
      isPrimaty = true,
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      columnName = "activityType",
      comment = "活动类型"
   )
   private int activityType;
   @ModelColumnAnno(
      columnName = "tips",
      comment = "备注"
   )
   private String tips;
   @ModelColumnAnno(
      columnName = "isClose",
      comment = "活动是否未开启"
   )
   private int isClose;
   @ModelColumnAnno(
      columnName = "needLevel",
      comment = "需求等级"
   )
   private int needLevel;
   @ModelColumnAnno(
      columnName = "systemid",
      comment = "系统id"
   )
   private int systemid;
   @ModelColumnAnno(
      columnName = "backGroundId",
      comment = "背景id"
   )
   private int backGroundId;
   @ModelColumnAnno(
      columnName = "BonusDesc",
      comment = "加成描述"
   )
   private String BonusDesc;
   @ModelColumnAnno(
      columnName = "sort",
      comment = "轮换顺序"
   )
   private int sort;
   @ModelColumnAnno(
      columnName = "sameOpenTime",
      comment = "同时开启"
   )
   private int sameOpenTime;
   @ModelColumnAnno(
      columnName = "earlyTime",
      comment = "最早开服时间"
   )
   private int earlyTime;
   @ModelColumnAnno(
      columnName = "evenTime",
      comment = "最晚开服时间"
   )
   private int evenTime;
   @ModelColumnAnno(
      columnName = "extendParams",
      comment = "扩展参数"
   )
   private String extendParams;
   @ModelColumnAnno(
      columnName = "integralType",
      comment = "积分类型"
   )
   private int integralType;
   @ModelColumnAnno(
      columnName = "integralId",
      comment = "积分id"
   )
   private int integralId;
   @ModelColumnAnno(
      comment = "远征章节id"
   )
   private int expeditionId;
   @ModelColumnAnno(
      columnName = "limitTime",
      comment = "开服时间满足指定时间条件"
   )
   private String limitTime;
   @ModelColumnAnno(
      columnName = "sameTypeActivity",
      comment = "相同活动分组"
   )
   private int sameTypeActivity;
   @ModelColumnAnno(
      comment = "地区限制",
      columnConvertType = 2,
      subCls = String.class
   )
   private final List<String> areanLimit = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, ActivityOpenTimeModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(activityOpenTimeModel.activityType, (v) -> new TreeMap())).put(activityOpenTimeModel.activityId, activityOpenTimeModel);
      }

      pool.putMap("customActivityOpenTime", tempHashMap);
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getActivityType() {
      return this.activityType;
   }

   public void setActivityType(int activityType) {
      this.checkModify();
      this.activityType = activityType;
   }

   public String getTips() {
      return this.tips;
   }

   public void setTips(String tips) {
      this.checkModify();
      this.tips = tips;
   }

   public int getNeedLevel() {
      return this.needLevel;
   }

   public void setNeedLevel(int needLevel) {
      this.checkModify();
      this.needLevel = needLevel;
   }

   public int getSystemid() {
      return this.systemid;
   }

   public void setSystemid(int systemid) {
      this.checkModify();
      this.systemid = systemid;
   }

   public int getBackGroundId() {
      return this.backGroundId;
   }

   public void setBackGroundId(int backGroundId) {
      this.checkModify();
      this.backGroundId = backGroundId;
   }

   public String getBonusDesc() {
      return this.BonusDesc;
   }

   public void setBonusDesc(String BonusDesc) {
      this.checkModify();
      this.BonusDesc = BonusDesc;
   }

   public int getSort() {
      return this.sort;
   }

   public void setSort(int sort) {
      this.checkModify();
      this.sort = sort;
   }

   public int getSameOpenTime() {
      return this.sameOpenTime;
   }

   public void setSameOpenTime(int sameOpenTime) {
      this.checkModify();
      this.sameOpenTime = sameOpenTime;
   }

   public int getIsClose() {
      return this.isClose;
   }

   public void setIsClose(int isClose) {
      this.checkModify();
      this.isClose = isClose;
   }

   public String getExtendParams() {
      return this.extendParams;
   }

   public void setExtendParams(String extendParams) {
      this.checkModify();
      this.extendParams = extendParams;
   }

   public int getIntegralType() {
      return this.integralType;
   }

   public void setIntegralType(int integralType) {
      this.checkModify();
      this.integralType = integralType;
   }

   public int getIntegralId() {
      return this.integralId;
   }

   public void setIntegralId(int integralId) {
      this.checkModify();
      this.integralId = integralId;
   }

   public int getExpeditionId() {
      return this.expeditionId;
   }

   public void setExpeditionId(int expeditionId) {
      this.checkModify();
      this.expeditionId = expeditionId;
   }

   public String getLimitTime() {
      return this.limitTime;
   }

   public void setLimitTime(String limitTime) {
      this.checkModify();
      this.limitTime = limitTime;
   }

   public int getSameTypeActivity() {
      return this.sameTypeActivity;
   }

   public void setSameTypeActivity(int sameTypeActivity) {
      this.checkModify();
      this.sameTypeActivity = sameTypeActivity;
   }

   public int getEarlyTime() {
      return this.earlyTime;
   }

   public void setEarlyTime(int earlyTime) {
      this.checkModify();
      this.earlyTime = earlyTime;
   }

   public int getEvenTime() {
      return this.evenTime;
   }

   public void setEvenTime(int evenTime) {
      this.checkModify();
      this.evenTime = evenTime;
   }

   public List<String> getAreanLimit() {
      return this.areanLimit;
   }
}
