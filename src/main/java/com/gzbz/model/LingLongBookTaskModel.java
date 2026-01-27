package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.task.base.GlobalTaskPart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "LingLongBaojianTask"
)
public class LingLongBookTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno
   private int type;
   @ModelColumnAnno(
      columnName = "targetType"
   )
   private int targetType;
   @ModelColumnAnno(
      columnName = "targetId"
   )
   private int targetId;
   @ModelColumnAnno(
      columnName = "targetValue"
   )
   private int targetValue;
   @ModelColumnAnno(
      columnName = "taskDesc"
   )
   private String taskDesc;
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
      ConcurrentHashMap<Integer, Map<Integer, LingLongBookTaskModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         LingLongBookTaskModel model = (LingLongBookTaskModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.type, (v) -> new HashMap())).put(model.id, model);
      }

      pool.putMap("customLingLongBookTask", tempHashMap);
   }

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_LING_LONG_BOOK.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getTargetType() {
      return this.targetType;
   }

   public void setTargetType(int targetType) {
      this.checkModify();
      this.targetType = targetType;
   }

   public int getTargetId() {
      return this.targetId;
   }

   public void setTargetId(int targetId) {
      this.checkModify();
      this.targetId = targetId;
   }

   public int getTargetValue() {
      return this.targetValue;
   }

   public void setTargetValue(int targetValue) {
      this.checkModify();
      this.targetValue = targetValue;
   }

   public String getTaskDesc() {
      return this.taskDesc;
   }

   public void setTaskDesc(String taskDesc) {
      this.checkModify();
      this.taskDesc = taskDesc;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
