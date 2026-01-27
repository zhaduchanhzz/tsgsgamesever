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
   file = "eventHeroChallengeReward"
)
public class EventHeroChallengeRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "主题id"
   )
   private int mainId;
   @ModelColumnAnno(
      comment = "积分"
   )
   private int bonus;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "，目标奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<EventHeroChallengeRewardModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         EventHeroChallengeRewardModel model = (EventHeroChallengeRewardModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getMainId(), (k) -> new ArrayList())).add(model);
      }

      pool.putMap("customEventHeroChallengeReward", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMainId() {
      return this.mainId;
   }

   public void setMainId(int mainId) {
      this.checkModify();
      this.mainId = mainId;
   }

   public int getBonus() {
      return this.bonus;
   }

   public void setBonus(int bonus) {
      this.checkModify();
      this.bonus = bonus;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
