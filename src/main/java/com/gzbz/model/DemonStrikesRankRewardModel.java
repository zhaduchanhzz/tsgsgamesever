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
   file = "demonWarRankreward"
)
public class DemonStrikesRankRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnName = "rewardtype"
   )
   private int rewardType;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> rank = new ArrayList();
   @ModelColumnAnno(
      columnName = "rankreward",
      columnConvertType = 1,
      count = 4,
      subCls = ResourceModel.class,
      comment = "奖励道具"
   )
   private List<ResourceModel> rankReward = new ArrayList();
   @ModelColumnAnno
   private String title;
   @ModelColumnAnno
   private String desc;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, DemonStrikesRankRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         DemonStrikesRankRewardModel model = (DemonStrikesRankRewardModel)entry.getValue();
         if (model.rank != null && !model.rank.isEmpty()) {
            if (model.rank.size() == 1) {
               ((TreeMap)tempHashMap.computeIfAbsent(model.rewardType, (v) -> new TreeMap())).put(model.rank.get(0), model);
            } else if (model.rank.size() == 2) {
               if ((Integer)model.rank.get(1) > 90000) {
                  ((TreeMap)tempHashMap.computeIfAbsent(model.rewardType, (v) -> new TreeMap())).put(model.rank.get(0), model);
               } else {
                  for(int i = (Integer)model.rank.get(0); i <= (Integer)model.rank.get(1); ++i) {
                     ((TreeMap)tempHashMap.computeIfAbsent(model.rewardType, (v) -> new TreeMap())).put(i, model);
                  }
               }
            }
         }
      }

      pool.putMap("customDemonWarRankReward", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRewardType() {
      return this.rewardType;
   }

   public void setRewardType(int rewardType) {
      this.checkModify();
      this.rewardType = rewardType;
   }

   public List<Integer> getRank() {
      return this.rank;
   }

   public void setRank(List<Integer> rank) {
      this.checkModify();
      this.rank = rank;
   }

   public List<ResourceModel> getRankReward() {
      return this.rankReward;
   }

   public void setRankReward(List<ResourceModel> rankReward) {
      this.checkModify();
      this.rankReward = rankReward;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.checkModify();
      this.title = title;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
