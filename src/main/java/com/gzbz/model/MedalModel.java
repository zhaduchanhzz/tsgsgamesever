package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.GlobalTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "xunzhang"
)
public class MedalModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "itemid"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno
   private int targetType;
   @ModelColumnAnno(
      columnName = "targetID"
   )
   private int targetId;
   @ModelColumnAnno
   private int targetValue;

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
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

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<MedalModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         MedalModel medalModel = (MedalModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(medalModel.type, (v) -> new ArrayList())).add(medalModel);
      }

      pool.putMap("customXunzhang", tempHashMap);
   }

   public void reloadTaskTrigger() {
      if (this.getTargetType() > 0 && this.getTargetValue() > 0) {
         ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_MEDAL.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getItemId());
      }
   }

   public static TreeMap<Integer, MedalModel> duelMedalMap() {
      TreeMap<Integer, MedalModel> medalModelMap = new TreeMap();
      List<MedalModel> medalModels = (List)ApplicationContextProvider.getModelPoolEntity("customXunzhang", 1);
      if (medalModels != null) {
         for(MedalModel medalModel : medalModels) {
            medalModelMap.put(medalModel.getTargetValue(), medalModel);
         }
      }

      return medalModelMap;
   }
}
