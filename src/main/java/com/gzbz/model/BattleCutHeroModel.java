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
   file = "battleCutHero"
)
public class BattleCutHeroModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "难度分段"
   )
   private int hard;
   @ModelColumnAnno(
      comment = "战斗名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "前置id"
   )
   private int lastId;
   @ModelColumnAnno(
      columnConvertType = 2,
      comment = "战力区间",
      subCls = Integer.class
   )
   private List<Integer> fightPower = new ArrayList();
   @ModelColumnAnno(
      comment = "回合限制"
   )
   private byte boutCount;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "通关奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "活动奖励"
   )
   private List<ResourceModel> actRewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "宝箱奖励"
   )
   private List<ResourceModel> boxRewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "actboxRewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "活动宝箱奖励"
   )
   private List<ResourceModel> actBoxRewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, BattleCutHeroModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         BattleCutHeroModel cutHeroModel = (BattleCutHeroModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(cutHeroModel.hard, (v) -> new TreeMap())).put(cutHeroModel.id, cutHeroModel);
      }

      pool.putMap("customBattleCutHero", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getHard() {
      return this.hard;
   }

   public void setHard(int hard) {
      this.checkModify();
      this.hard = hard;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getLastId() {
      return this.lastId;
   }

   public void setLastId(int lastId) {
      this.checkModify();
      this.lastId = lastId;
   }

   public List<Integer> getFightPower() {
      return this.fightPower;
   }

   public void setFightPower(List<Integer> fightPower) {
      this.checkModify();
      this.fightPower = fightPower;
   }

   public byte getBoutCount() {
      return this.boutCount;
   }

   public void setBoutCount(byte boutCount) {
      this.checkModify();
      this.boutCount = boutCount;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public List<ResourceModel> getBoxRewards() {
      return this.boxRewards;
   }

   public void setBoxRewards(List<ResourceModel> boxRewards) {
      this.checkModify();
      this.boxRewards = boxRewards;
   }

   public List<ResourceModel> getActRewards() {
      return this.actRewards;
   }

   public void setActRewards(List<ResourceModel> actRewards) {
      this.checkModify();
      this.actRewards = actRewards;
   }

   public List<ResourceModel> getActBoxRewards() {
      return this.actBoxRewards;
   }

   public void setActBoxRewards(List<ResourceModel> actBoxRewards) {
      this.checkModify();
      this.actBoxRewards = actBoxRewards;
   }
}
