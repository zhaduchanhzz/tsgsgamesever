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
   file = "TongQueBeautyConnect"
)
public class TongQueBeautyConnectModel extends BaseModel {
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
      columnConvertType = 2,
      comment = "组合",
      subCls = Integer.class
   )
   private List<Integer> group = new ArrayList();
   @ModelColumnAnno(
      columnName = "type",
      comment = "奖励类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "typeName",
      comment = "类型名称"
   )
   private String typeName;
   @ModelColumnAnno(
      columnName = "award",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getGroup() {
      return this.group;
   }

   public void setGroup(List<Integer> group) {
      this.checkModify();
      this.group = group;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public String getTypeName() {
      return this.typeName;
   }

   public void setTypeName(String typeName) {
      this.checkModify();
      this.typeName = typeName;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, TongQueBeautyConnectModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TongQueBeautyConnectModel model = (TongQueBeautyConnectModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.activityId, (v) -> new ConcurrentHashMap())).put(model.id, model);
      }

      pool.putMap("customTongQueBeautyConnect", tempHashMap);
   }
}
