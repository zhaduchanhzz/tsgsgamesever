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
   file = "ChunJieMonopolyEvent"
)
public class ChineseNewYearMonopolyEventModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnName = "eventID",
      comment = "事件id"
   )
   private int eventId;
   @ModelColumnAnno
   private int eventType;
   @ModelColumnAnno(
      columnConvertType = 4,
      subCls = Integer.class,
      count = 3,
      comment = "参数"
   )
   private List<Integer> param = new ArrayList();
   @ModelColumnAnno
   private int randOdd;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, ChineseNewYearMonopolyEventModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ChineseNewYearMonopolyEventModel model = (ChineseNewYearMonopolyEventModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.eventId, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customChunJieMonopolyEvent", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getEventId() {
      return this.eventId;
   }

   public void setEventId(int eventId) {
      this.checkModify();
      this.eventId = eventId;
   }

   public int getEventType() {
      return this.eventType;
   }

   public void setEventType(int eventType) {
      this.checkModify();
      this.eventType = eventType;
   }

   public List<Integer> getParam() {
      return this.param;
   }

   public void setParam(List<Integer> param) {
      this.checkModify();
      this.param = param;
   }

   public int getRandOdd() {
      return this.randOdd;
   }

   public void setRandOdd(int randOdd) {
      this.checkModify();
      this.randOdd = randOdd;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
