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
   file = "battleDaily"
)
public class BattleDailyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "主id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "战斗名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "副本类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "玩家等级限制"
   )
   private int level;
   @ModelColumnAnno(
      comment = "前置难度"
   )
   private int lastHard;
   @ModelColumnAnno(
      columnConvertType = 2,
      comment = "副本难度",
      subCls = Integer.class
   )
   private List<Integer> hardLevel;
   @ModelColumnAnno(
      comment = "战力需求"
   )
   private int fightPower;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "回合限制"
   )
   private byte boutCount;
   @ModelColumnAnno(
      columnConvertType = 2,
      comment = "购买挑战次数消耗 type|id|num",
      subCls = Integer.class
   )
   private List<Integer> buyCountCost;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
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
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, BattleDailyModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         BattleDailyModel model = (BattleDailyModel)entry.getValue();
         ((ConcurrentHashMap)tempHashMap.computeIfAbsent(model.type, (v) -> new ConcurrentHashMap())).put(model.id, model);
      }

      pool.putMap("customBattleDaily", tempHashMap);
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

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getLastHard() {
      return this.lastHard;
   }

   public void setLastHard(int lastHard) {
      this.checkModify();
      this.lastHard = lastHard;
   }

   public List<Integer> getHardLevel() {
      return this.hardLevel;
   }

   public void setHardLevel(List<Integer> hardLevel) {
      this.checkModify();
      this.hardLevel = hardLevel;
   }

   public int getFightPower() {
      return this.fightPower;
   }

   public void setFightPower(int fightPower) {
      this.checkModify();
      this.fightPower = fightPower;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public byte getBoutCount() {
      return this.boutCount;
   }

   public void setBoutCount(byte boutCount) {
      this.checkModify();
      this.boutCount = boutCount;
   }

   public List<Integer> getBuyCountCost() {
      return this.buyCountCost;
   }

   public void setBuyCountCost(List<Integer> buyCountCost) {
      this.checkModify();
      this.buyCountCost = buyCountCost;
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
