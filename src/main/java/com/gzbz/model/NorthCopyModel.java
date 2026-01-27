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
   file = "northCopy"
)
public class NorthCopyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "关卡id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "章节编号"
   )
   private int sectionId;
   @ModelColumnAnno(
      comment = "关卡类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "副本名称"
   )
   private String name;
   @ModelColumnAnno(
      columnConvertType = 4,
      subCls = Integer.class,
      count = 3,
      comment = "星数"
   )
   private List<Integer> stars = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 4,
      subCls = Integer.class,
      count = 3,
      comment = "战斗"
   )
   private List<Integer> battles = new ArrayList();
   @ModelColumnAnno(
      comment = "回合限制"
   )
   private int boutCount;
   @ModelColumnAnno(
      comment = "场景id"
   )
   private int sceneId;
   @ModelColumnAnno(
      comment = "下个副本id"
   )
   private int nextId;
   @ModelColumnAnno(
      comment = "推荐战力"
   )
   private int power;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "首通奖励"
   )
   private List<ResourceModel> firstRewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, NorthCopyModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         NorthCopyModel model = (NorthCopyModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.sectionId, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customNorthCopy", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getSectionId() {
      return this.sectionId;
   }

   public void setSectionId(int sectionId) {
      this.checkModify();
      this.sectionId = sectionId;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public List<Integer> getStars() {
      return this.stars;
   }

   public void setStars(List<Integer> stars) {
      this.checkModify();
      this.stars = stars;
   }

   public List<Integer> getBattles() {
      return this.battles;
   }

   public void setBattles(List<Integer> battles) {
      this.checkModify();
      this.battles = battles;
   }

   public int getBoutCount() {
      return this.boutCount;
   }

   public void setBoutCount(int boutCount) {
      this.checkModify();
      this.boutCount = boutCount;
   }

   public int getSceneId() {
      return this.sceneId;
   }

   public void setSceneId(int sceneId) {
      this.checkModify();
      this.sceneId = sceneId;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getPower() {
      return this.power;
   }

   public void setPower(int power) {
      this.checkModify();
      this.power = power;
   }

   public List<ResourceModel> getFirstRewards() {
      return this.firstRewards;
   }

   public void setFirstRewards(List<ResourceModel> firstRewards) {
      this.checkModify();
      this.firstRewards = firstRewards;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
