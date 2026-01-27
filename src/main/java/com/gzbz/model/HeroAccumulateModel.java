package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
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
   file = "HeroAccumulate"
)
public class HeroAccumulateModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int actid;
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
   @ModelColumnAnno(
      comment = "奖励列表",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "开服天数起始"
   )
   private int daysStart;
   @ModelColumnAnno(
      comment = "开服天数结束"
   )
   private int days;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, ConcurrentHashMap<String, HeroAccumulateModel>>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeroAccumulateModel model = (HeroAccumulateModel)entry.getValue();
         String key = model.getStageNum() + "_" + model.getRechargeGear();
         ((ConcurrentHashMap)((TreeMap)tempMap.computeIfAbsent(model.getActid(), (v) -> new TreeMap())).computeIfAbsent(model.getDaysStart(), (v) -> new ConcurrentHashMap())).put(key, model);
      }

      pool.putMap("curtomHeroAccumulate", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getActid() {
      return this.actid;
   }

   public void setActid(int actid) {
      this.checkModify();
      this.actid = actid;
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

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getDaysStart() {
      return this.daysStart;
   }

   public void setDaysStart(int daysStart) {
      this.checkModify();
      this.daysStart = daysStart;
   }

   public int getDays() {
      return this.days;
   }

   public void setDays(int days) {
      this.checkModify();
      this.days = days;
   }
}
