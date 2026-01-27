package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "skinActivityLuckyAward"
)
public class SkinActivityLuckyAwardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "activityId",
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      columnName = "round",
      comment = "轮次"
   )
   private int round;
   @ModelColumnAnno(
      columnName = "luckAward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "可选的道具"
   )
   private List<ResourceModel> luckAward = new ArrayList();

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

   public int getRound() {
      return this.round;
   }

   public void setRound(int round) {
      this.checkModify();
      this.round = round;
   }

   public List<ResourceModel> getLuckAward() {
      return this.luckAward;
   }

   public void setLuckAward(List<ResourceModel> luckAward) {
      this.checkModify();
      this.luckAward = luckAward;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, SkinActivityLuckyAwardModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SkinActivityLuckyAwardModel model = (SkinActivityLuckyAwardModel)entry.getValue();
         if (tempMap.containsKey(model.getActivityId())) {
            ((Map)tempMap.get(model.getActivityId())).put(model.getRound(), model);
         } else {
            Map<Integer, SkinActivityLuckyAwardModel> subMap = new HashMap();
            subMap.put(model.getRound(), model);
            tempMap.put(model.getActivityId(), subMap);
         }
      }

      pool.putMap("customSkinActivityLuckyAward", tempMap);
   }
}
