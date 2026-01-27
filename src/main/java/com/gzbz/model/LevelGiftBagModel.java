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
   file = "levelGiftBag"
)
public class LevelGiftBagModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奖励组",
      columnName = "AwardGroup"
   )
   private int awardGroup;
   @ModelColumnAnno(
      comment = "需求等级",
      columnName = "taskName"
   )
   private int taskName;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "物品"
   )
   private List<ResourceModel> items = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, LevelGiftBagModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         LevelGiftBagModel model = (LevelGiftBagModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.awardGroup, (v) -> new ConcurrentHashMap())).put(model.taskName, model);
      }

      pool.putMap("customlevelGiftBag", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getAwardGroup() {
      return this.awardGroup;
   }

   public void setAwardGroup(int awardGroup) {
      this.checkModify();
      this.awardGroup = awardGroup;
   }

   public int getTaskName() {
      return this.taskName;
   }

   public void setTaskName(int taskName) {
      this.checkModify();
      this.taskName = taskName;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
