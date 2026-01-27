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
   file = "eventHeroCall"
)
public class EventHeroCallModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "小库id"
   )
   private int randomid;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> reward = new ArrayList();
   @ModelColumnAnno(
      comment = "奖励上限"
   )
   private int rewardLimit;
   @ModelColumnAnno(
      comment = "奖励权重"
   )
   private int rewardheight;
   @ModelColumnAnno(
      comment = "奖励排序"
   )
   private int sort;
   @ModelColumnAnno(
      comment = "说明"
   )
   private String desc;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<EventHeroCallModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         EventHeroCallModel model = (EventHeroCallModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customEventHeroCall", tempHashMap);
   }

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

   public int getRandomid() {
      return this.randomid;
   }

   public void setRandomid(int randomid) {
      this.randomid = randomid;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.reward = reward;
   }

   public int getRewardLimit() {
      return this.rewardLimit;
   }

   public void setRewardLimit(int rewardLimit) {
      this.rewardLimit = rewardLimit;
   }

   public int getRewardheight() {
      return this.rewardheight;
   }

   public void setRewardheight(int rewardheight) {
      this.rewardheight = rewardheight;
   }

   public int getSort() {
      return this.sort;
   }

   public void setSort(int sort) {
      this.sort = sort;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }
}
