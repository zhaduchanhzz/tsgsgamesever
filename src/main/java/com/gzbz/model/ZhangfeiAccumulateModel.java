package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "zhangfeiAccumulate"
)
public class ZhangfeiAccumulateModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
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

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, ZhangfeiAccumulateModel> stageNum_rechargeGearMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ZhangfeiAccumulateModel value = (ZhangfeiAccumulateModel)entry.getValue();
         stageNum_rechargeGearMap.put(value.getStageNum() + "_" + value.getRechargeGear(), value);
      }

      pool.putMap("zhangfeiAccumulateStageKey", stageNum_rechargeGearMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
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
}
