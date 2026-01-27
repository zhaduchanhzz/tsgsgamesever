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
   file = "FriendsPackage"
)
public class FriendsPackageModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "ID"
   )
   private int id;
   @ModelColumnAnno(
      comment = "任务名称"
   )
   private String taskName;
   @ModelColumnAnno(
      columnName = "Canal"
   )
   private String platform;
   @ModelColumnAnno
   private int taskType;
   @ModelColumnAnno
   private int taskNum;
   @ModelColumnAnno
   private int playerNum;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, Map<Integer, FriendsPackageModel>> tempHashMap = new ConcurrentHashMap();
      ConcurrentHashMap<String, Map<Integer, List<FriendsPackageModel>>> tempHashMap1 = new ConcurrentHashMap();
      List<String> keyList = new ArrayList();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         FriendsPackageModel model = (FriendsPackageModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.platform, (v) -> new HashMap())).put(model.id, model);
         String key = String.format("%s-%d-%d", model.platform, model.taskType, model.taskNum);
         if (!keyList.contains(key)) {
            keyList.add(key);
            ((List)((Map)tempHashMap1.computeIfAbsent(model.platform, (v) -> new HashMap())).computeIfAbsent(model.taskType, (v) -> new ArrayList())).add(model);
         }
      }

      pool.putMap("customFriendsPackage", tempHashMap);
      pool.putMap("customFriendsPackageBeInvite", tempHashMap1);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getTaskName() {
      return this.taskName;
   }

   public String getPlatform() {
      return this.platform;
   }

   public void setPlatform(String platform) {
      this.checkModify();
      this.platform = platform;
   }

   public int getTaskType() {
      return this.taskType;
   }

   public void setTaskType(int taskType) {
      this.checkModify();
      this.taskType = taskType;
   }

   public int getTaskNum() {
      return this.taskNum;
   }

   public void setTaskNum(int taskNum) {
      this.checkModify();
      this.taskNum = taskNum;
   }

   public int getPlayerNum() {
      return this.playerNum;
   }

   public void setPlayerNum(int playerNum) {
      this.checkModify();
      this.playerNum = playerNum;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
