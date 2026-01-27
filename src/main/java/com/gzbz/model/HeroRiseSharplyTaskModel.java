package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "heroRiseSharplyTask"
)
public class HeroRiseSharplyTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "档位id"
   )
   private int stepId;
   @ModelColumnAnno(
      comment = "任务组id"
   )
   private int taskGroup;
   @ModelColumnAnno(
      comment = "包含的任务id"
   )
   private int includeTaskId;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, Set<Integer>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeroRiseSharplyTaskModel heroRiseSharplyTaskModel = (HeroRiseSharplyTaskModel)entry.getValue();
         ((Set)((TreeMap)tempHashMap.computeIfAbsent(heroRiseSharplyTaskModel.stepId, (v) -> new TreeMap())).computeIfAbsent(heroRiseSharplyTaskModel.taskGroup, (v) -> new HashSet())).add(heroRiseSharplyTaskModel.includeTaskId);
      }

      pool.putMap("customHeroRiseSharplyTask", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStepId() {
      return this.stepId;
   }

   public void setStepId(int stepId) {
      this.checkModify();
      this.stepId = stepId;
   }

   public int getTaskGroup() {
      return this.taskGroup;
   }

   public void setTaskGroup(int taskGroup) {
      this.checkModify();
      this.taskGroup = taskGroup;
   }

   public int getIncludeTaskId() {
      return this.includeTaskId;
   }

   public void setIncludeTaskId(int includeTaskId) {
      this.checkModify();
      this.includeTaskId = includeTaskId;
   }
}
