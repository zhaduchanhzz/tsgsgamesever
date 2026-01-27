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
   file = "GreatCityGameBuild"
)
public class GreatCityGameBuildModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnName = "buildID"
   )
   private int buildId;
   @ModelColumnAnno
   private String buildName;
   @ModelColumnAnno
   private int buildLv;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "roundRewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "每轮奖励"
   )
   private List<ResourceModel> roundRewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "taskRewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "成就奖励"
   )
   private List<ResourceModel> taskRewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, GreatCityGameBuildModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GreatCityGameBuildModel model = (GreatCityGameBuildModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.buildId, (v) -> new TreeMap())).put(model.buildLv, model);
      }

      pool.putMap("customGreatCityGameBuild", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getBuildId() {
      return this.buildId;
   }

   public void setBuildId(int buildId) {
      this.checkModify();
      this.buildId = buildId;
   }

   public String getBuildName() {
      return this.buildName;
   }

   public void setBuildName(String buildName) {
      this.checkModify();
      this.buildName = buildName;
   }

   public int getBuildLv() {
      return this.buildLv;
   }

   public void setBuildLv(int buildLv) {
      this.checkModify();
      this.buildLv = buildLv;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public List<ResourceModel> getRoundRewards() {
      return this.roundRewards;
   }

   public void setRoundRewards(List<ResourceModel> roundRewards) {
      this.checkModify();
      this.roundRewards = roundRewards;
   }

   public List<ResourceModel> getTaskRewards() {
      return this.taskRewards;
   }

   public void setTaskRewards(List<ResourceModel> taskRewards) {
      this.checkModify();
      this.taskRewards = taskRewards;
   }
}
