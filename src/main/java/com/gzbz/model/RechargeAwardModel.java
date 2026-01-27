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
   file = "rechargeAward"
)
public class RechargeAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "任务标题"
   )
   private String taskName;
   @ModelColumnAnno(
      comment = "累计需要充值的数量"
   )
   private int money;
   @ModelColumnAnno(
      comment = "前往系统id"
   )
   private int toSystemId;
   @ModelColumnAnno(
      comment = "排序"
   )
   private int sort;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "物品"
   )
   private List<ResourceModel> items = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<RechargeAwardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RechargeAwardModel model = (RechargeAwardModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.activityId, (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customRechargeAward", tempHashMap);
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

   public String getTaskName() {
      return this.taskName;
   }

   public void setTaskName(String taskName) {
      this.checkModify();
      this.taskName = taskName;
   }

   public int getMoney() {
      return this.money;
   }

   public void setMoney(int money) {
      this.checkModify();
      this.money = money;
   }

   public int getToSystemId() {
      return this.toSystemId;
   }

   public void setToSystemId(int toSystemId) {
      this.checkModify();
      this.toSystemId = toSystemId;
   }

   public int getSort() {
      return this.sort;
   }

   public void setSort(int sort) {
      this.checkModify();
      this.sort = sort;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
