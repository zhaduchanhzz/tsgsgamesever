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
   file = "chapterAdventure"
)
public class ChapterAdventureModel extends BaseModel {
   public static int MinQualityGroup = 4;
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "奇遇id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "奇遇名字"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "group",
      comment = "奖励组"
   )
   private int group;
   @ModelColumnAnno(
      columnName = "odds",
      comment = "单独概率"
   )
   private int odds;
   @ModelColumnAnno(
      columnName = "openLevel",
      comment = "出现等级"
   )
   private int openLevel;
   @ModelColumnAnno(
      columnName = "quality",
      comment = "奇遇品质"
   )
   private int quality;
   @ModelColumnAnno(
      columnName = "six2five",
      comment = "6星换5星"
   )
   private int six2five;
   @ModelColumnAnno(
      columnName = "rewardItems",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励道具"
   )
   private ArrayList<ResourceModel> rewardItems = new ArrayList();
   @ModelColumnAnno(
      columnName = "times",
      comment = "所需时长"
   )
   private int times;
   @ModelColumnAnno(
      columnName = "cost",
      comment = "情报消耗"
   )
   private int cost;
   @ModelColumnAnno(
      columnName = "activityCost",
      comment = "情报消耗/活动"
   )
   private int activityCost;
   @ModelColumnAnno(
      columnName = "star",
      comment = "需求武将星级"
   )
   private int star;
   @ModelColumnAnno(
      columnName = "nation",
      comment = "需求阵营"
   )
   private int nation;
   @ModelColumnAnno(
      columnName = "nation2",
      comment = "需求阵营2"
   )
   private int nation2;
   @ModelColumnAnno(
      columnName = "slot",
      comment = "武将槽位"
   )
   private int slot;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<ChapterAdventureModel>> group_HashMap = new ConcurrentHashMap();
      ConcurrentHashMap<Integer, Integer> totalGroupOdds = new ConcurrentHashMap();
      ConcurrentHashMap<Integer, List<ChapterAdventureModel>> quality_HashMap = new ConcurrentHashMap();
      ConcurrentHashMap<Integer, List<ChapterAdventureModel>> quality_4_HashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ChapterAdventureModel model = (ChapterAdventureModel)entry.getValue();
         if (group_HashMap.get(model.group) == null) {
            List<ChapterAdventureModel> tempList = new ArrayList();
            tempList.add(model);
            group_HashMap.put(model.group, tempList);
            totalGroupOdds.put(model.group, model.odds);
         } else {
            List<ChapterAdventureModel> tempList = (List)group_HashMap.get(model.group);
            tempList.add(model);
            group_HashMap.put(model.group, tempList);
            int oldVal = (Integer)totalGroupOdds.get(model.group);
            totalGroupOdds.put(model.group, oldVal + model.odds);
         }

         if (quality_HashMap.get(model.quality) == null) {
            List<ChapterAdventureModel> tempList = new ArrayList();
            tempList.add(model);
            quality_HashMap.put(model.quality, tempList);
         } else {
            List<ChapterAdventureModel> tempList = (List)quality_HashMap.get(model.quality);
            tempList.add(model);
            quality_HashMap.put(model.quality, tempList);
         }

         if (model.quality == MinQualityGroup) {
            if (quality_4_HashMap.get(MinQualityGroup) == null) {
               List<ChapterAdventureModel> tempList = new ArrayList();
               tempList.add(model);
               quality_4_HashMap.put(MinQualityGroup, tempList);
            } else {
               List<ChapterAdventureModel> tempList = (List)quality_4_HashMap.get(MinQualityGroup);
               tempList.add(model);
               quality_4_HashMap.put(MinQualityGroup, tempList);
            }
         }
      }

      pool.putMap("customChapterAdventureGroup", group_HashMap);
      pool.putMap("customChapterAdventureProbability", totalGroupOdds);
      pool.putMap("customChapterAdventureQuality", quality_HashMap);
      pool.putMap("customChapterAdventureQuality4", quality_4_HashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public int getOdds() {
      return this.odds;
   }

   public void setOdds(int odds) {
      this.checkModify();
      this.odds = odds;
   }

   public int getOpenLevel() {
      return this.openLevel;
   }

   public void setOpenLevel(int openLevel) {
      this.checkModify();
      this.openLevel = openLevel;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getSix2five() {
      return this.six2five;
   }

   public void setSix2five(int six2five) {
      this.checkModify();
      this.six2five = six2five;
   }

   public ArrayList<ResourceModel> getRewardItems() {
      return this.rewardItems;
   }

   public void setRewardItems(ArrayList<ResourceModel> rewardItems) {
      this.checkModify();
      this.rewardItems = rewardItems;
   }

   public int getTimes() {
      return this.times;
   }

   public void setTimes(int times) {
      this.checkModify();
      this.times = times;
   }

   public int getCost() {
      return this.cost;
   }

   public void setCost(int cost) {
      this.checkModify();
      this.cost = cost;
   }

   public int getActivityCost() {
      return this.activityCost;
   }

   public void setActivityCost(int activityCost) {
      this.checkModify();
      this.activityCost = activityCost;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
   }

   public int getNation2() {
      return this.nation2;
   }

   public void setNation2(int nation2) {
      this.checkModify();
      this.nation2 = nation2;
   }

   public int getSlot() {
      return this.slot;
   }

   public void setSlot(int slot) {
      this.checkModify();
      this.slot = slot;
   }
}
