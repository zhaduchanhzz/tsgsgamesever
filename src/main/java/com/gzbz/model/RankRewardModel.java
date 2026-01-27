package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "rankRewards"
)
public class RankRewardModel extends BaseModel {
   public static final int REWARD_WAY_CONFIG = 0;
   public static final int REWARD_WAY_MODEL = 1;
   public static final int TYPE_CHAPTER = 1;
   public static final int TYPE_TOWER = 2;
   public static final int TYPE_POWER = 3;
   public static final int TYPE_UNDER_PALACE = 4;
   public static final int TYPE_HERO_NATION_SHU = 5;
   public static final int TYPE_HERO_NATION_WEI = 6;
   public static final int TYPE_HERO_NATION_WU = 7;
   public static final int TYPE_HERO_NATION_GOD = 8;
   public static final int TYPE_HERO_NATION_DEVIL = 9;
   public static final Map<Integer, Integer> HERO_NATION_RANK = new HashMap();
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "任务类型"
   )
   private int taskType;
   @ModelColumnAnno(
      comment = "任务描述"
   )
   private String taskDesc;
   @ModelColumnAnno(
      comment = "需求值"
   )
   private int need;
   @ModelColumnAnno(
      comment = "奖励方式"
   )
   private int rewardWay;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> reward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, RankRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         RankRewardModel model = (RankRewardModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.taskType, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customRankReward", tempHashMap);
   }

   public ResourceModel rewardResource() {
      ResourceModel resourceModel = new ResourceModel();
      if (this.getRewardWay() == 0) {
         String[] rewardArr = ApplicationContextProvider.getConfigString("rankRewards", "1|9|50").split("\\|");
         resourceModel.setType(Integer.parseInt(rewardArr[0]));
         resourceModel.setId(Integer.parseInt(rewardArr[1]));
         resourceModel.setValue(Integer.parseInt(rewardArr[2]));
      } else {
         resourceModel.setType(((ResourceModel)this.getReward().get(0)).getType());
         resourceModel.setId(((ResourceModel)this.getReward().get(0)).getId());
         resourceModel.setValue(((ResourceModel)this.getReward().get(0)).getValue());
      }

      return resourceModel;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTaskType() {
      return this.taskType;
   }

   public void setTaskType(int taskType) {
      this.checkModify();
      this.taskType = taskType;
   }

   public String getTaskDesc() {
      return this.taskDesc;
   }

   public void setTaskDesc(String taskDesc) {
      this.checkModify();
      this.taskDesc = taskDesc;
   }

   public int getNeed() {
      return this.need;
   }

   public void setNeed(int need) {
      this.checkModify();
      this.need = need;
   }

   public int getRewardWay() {
      return this.rewardWay;
   }

   public void setRewardWay(int rewardWay) {
      this.checkModify();
      this.rewardWay = rewardWay;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }

   static {
      HERO_NATION_RANK.put(2, 5);
      HERO_NATION_RANK.put(1, 6);
      HERO_NATION_RANK.put(3, 7);
      HERO_NATION_RANK.put(4, 8);
      HERO_NATION_RANK.put(5, 9);
   }
}
