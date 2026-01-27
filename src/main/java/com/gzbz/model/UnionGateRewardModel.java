package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "unionGateReward"
)
public class UnionGateRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "军团等级"
   )
   private int unionLv;
   @ModelColumnAnno(
      comment = "猜仙门层数"
   )
   private int stage;
   @ModelColumnAnno(
      columnName = "firstClearReward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "首通奖励"
   )
   private ArrayList<ResourceModel> firstClearReward = new ArrayList();
   @ModelColumnAnno(
      columnName = "clearReward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "通关奖励"
   )
   private ArrayList<ResourceModel> clearReward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, UnionGateRewardModel> unionLv_UnionGateReward = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         UnionGateRewardModel value = (UnionGateRewardModel)entry.getValue();
         unionLv_UnionGateReward.put(value.getUnionLv(), value);
      }

      pool.putMap("unionGateReward", unionLv_UnionGateReward);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getUnionLv() {
      return this.unionLv;
   }

   public void setUnionLv(int unionLv) {
      this.checkModify();
      this.unionLv = unionLv;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
   }

   public ArrayList<ResourceModel> getFirstClearReward() {
      return this.firstClearReward;
   }

   public void setFirstClearReward(ArrayList<ResourceModel> firstClearReward) {
      this.checkModify();
      this.firstClearReward = firstClearReward;
   }

   public ArrayList<ResourceModel> getClearReward() {
      return this.clearReward;
   }

   public void setClearReward(ArrayList<ResourceModel> clearReward) {
      this.checkModify();
      this.clearReward = clearReward;
   }
}
