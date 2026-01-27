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
   file = "NewArtifactActivate"
)
public class ArtifactActivateNewModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id",
      columnName = "activityID"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "激活道具类型"
   )
   private int exchangeType;
   @ModelColumnAnno(
      comment = "激活道具id"
   )
   private int exchangeId;
   @ModelColumnAnno(
      comment = "激活道具数量"
   )
   private int exchangeNum;
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, ArtifactActivateNewModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactActivateNewModel model = (ArtifactActivateNewModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.activityId, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customNewArtifactActivate", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getExchangeType() {
      return this.exchangeType;
   }

   public void setExchangeType(int exchangeType) {
      this.checkModify();
      this.exchangeType = exchangeType;
   }

   public int getExchangeId() {
      return this.exchangeId;
   }

   public void setExchangeId(int exchangeId) {
      this.checkModify();
      this.exchangeId = exchangeId;
   }

   public int getExchangeNum() {
      return this.exchangeNum;
   }

   public void setExchangeNum(int exchangeNum) {
      this.checkModify();
      this.exchangeNum = exchangeNum;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.rewards = rewards;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }
}
