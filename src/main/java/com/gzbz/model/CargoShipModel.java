package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import misc.MapUtil;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "CargoShip"
)
public class CargoShipModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "运输船名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "luckrate",
      comment = "幸运倍率"
   )
   private int luckRate;
   @ModelColumnAnno(
      columnName = "ShipQuality",
      comment = "品质"
   )
   private int shipQuality;
   @ModelColumnAnno(
      columnName = "TransTime",
      comment = "运输时间"
   )
   private int transTime;
   @ModelColumnAnno(
      columnName = "iconId",
      comment = "图标id"
   )
   private int iconId;
   @ModelColumnAnno(
      columnName = "guardRewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "护卫奖励",
      count = 2
   )
   private List<ResourceModel> guardRewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "MaxExtraBonus",
      comment = "完美漕运最大奖励百分比"
   )
   private int maxExtraBonus;
   @ModelColumnAnno(
      columnName = "RobSuccess",
      comment = "拦截成功获得的奖励的比例"
   )
   private int robSuccess;
   @ModelColumnAnno(
      columnName = "RobRequire",
      comment = "触发获得拦截失败奖励的战力要求比例"
   )
   private int robRequire;
   @ModelColumnAnno(
      columnName = "Roblost",
      comment = "拦截失败奖励获得的奖励比例"
   )
   private int roblost;
   @ModelColumnAnno(
      columnName = "RobFail",
      comment = "拦截获得的固定奖励"
   )
   private String robFail;
   @ModelColumnAnno(
      columnName = "CargoProtect",
      comment = "拦截后的保护时间"
   )
   private int cargoProtect;
   @ModelColumnAnno(
      columnName = "RobSuccessStop",
      comment = "拦截成功后的停滞时间"
   )
   private int robSuccessStop;
   @ModelColumnAnno(
      columnName = "RobLostStop",
      comment = "到达战力的拦截失败后的停滞时间"
   )
   private int robLostStop;
   @ModelColumnAnno(
      columnName = "Bonus",
      comment = "额外奖励加成百分比"
   )
   private int bonus;
   @ModelColumnAnno(
      columnName = "CargoFightScene",
      comment = "战斗场景id"
   )
   private int cargoFightScene;
   @ModelColumnAnno(
      columnName = "salvageRewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "打捞奖励",
      count = 2
   )
   private List<ResourceModel> salvageRewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "luckyBoat",
      comment = "幸运船出现概率"
   )
   private int luckyBoat;
   @ModelColumnAnno(
      columnName = "bonusReward",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "奖励加成",
      count = 2
   )
   private List<Integer> bonusReward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, CargoShipModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CargoShipModel model = (CargoShipModel)entry.getValue();
         ((TreeMap)MapUtil.computeIfAbsent(tempHashMap, model.shipQuality, TreeMap.class)).put(model.id, model);
      }

      pool.putMap("customCargoShip", tempHashMap);
   }

   public static int getInitShipModel() {
      Map<Integer, TreeMap<Integer, CargoShipModel>> cargoShipModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CargoShipModel>>getModelPoolMap("customCargoShip");
      TreeMap<Integer, TreeMap<Integer, CargoShipModel>> tempMap = new TreeMap(cargoShipModelMap);
      return cargoShipModelMap != null && !cargoShipModelMap.isEmpty() ? (Integer)((TreeMap)tempMap.firstEntry().getValue()).firstKey() : 0;
   }

   public static int getInitShipModel(int shipQuality) {
      Map<Integer, TreeMap<Integer, CargoShipModel>> cargoShipModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CargoShipModel>>getModelPoolMap("customCargoShip");
      return cargoShipModelMap != null && !cargoShipModelMap.isEmpty() ? (Integer)((TreeMap)cargoShipModelMap.get(shipQuality)).firstKey() : 0;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLuckRate() {
      return this.luckRate;
   }

   public void setLuckRate(int luckRate) {
      this.luckRate = luckRate;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getShipQuality() {
      return this.shipQuality;
   }

   public void setShipQuality(int shipQuality) {
      this.checkModify();
      this.shipQuality = shipQuality;
   }

   public int getTransTime() {
      return this.transTime;
   }

   public void setTransTime(int transTime) {
      this.checkModify();
      this.transTime = transTime;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.checkModify();
      this.iconId = iconId;
   }

   public List<ResourceModel> getGuardRewards() {
      return this.guardRewards;
   }

   public void setGuardRewards(List<ResourceModel> guardRewards) {
      this.checkModify();
      this.guardRewards = guardRewards;
   }

   public int getMaxExtraBonus() {
      return this.maxExtraBonus;
   }

   public void setMaxExtraBonus(int maxExtraBonus) {
      this.checkModify();
      this.maxExtraBonus = maxExtraBonus;
   }

   public int getRobSuccess() {
      return this.robSuccess;
   }

   public void setRobSuccess(int robSuccess) {
      this.checkModify();
      this.robSuccess = robSuccess;
   }

   public int getRobRequire() {
      return this.robRequire;
   }

   public void setRobRequire(int robRequire) {
      this.checkModify();
      this.robRequire = robRequire;
   }

   public int getRoblost() {
      return this.roblost;
   }

   public void setRoblost(int roblost) {
      this.checkModify();
      this.roblost = roblost;
   }

   public String getRobFail() {
      return this.robFail;
   }

   public void setRobFail(String robFail) {
      this.checkModify();
      this.robFail = robFail;
   }

   public int getCargoProtect() {
      return this.cargoProtect;
   }

   public void setCargoProtect(int cargoProtect) {
      this.checkModify();
      this.cargoProtect = cargoProtect;
   }

   public int getBonus() {
      return this.bonus;
   }

   public void setBonus(int bonus) {
      this.checkModify();
      this.bonus = bonus;
   }

   public int getRobSuccessStop() {
      return this.robSuccessStop;
   }

   public void setRobSuccessStop(int robSuccessStop) {
      this.checkModify();
      this.robSuccessStop = robSuccessStop;
   }

   public int getRobLostStop() {
      return this.robLostStop;
   }

   public void setRobLostStop(int robLostStop) {
      this.checkModify();
      this.robLostStop = robLostStop;
   }

   public int getCargoFightScene() {
      return this.cargoFightScene;
   }

   public void setCargoFightScene(int cargoFightScene) {
      this.checkModify();
      this.cargoFightScene = cargoFightScene;
   }

   public List<ResourceModel> getSalvageRewards() {
      return this.salvageRewards;
   }

   public void setSalvageRewards(List<ResourceModel> salvageRewards) {
      this.checkModify();
      this.salvageRewards = salvageRewards;
   }

   public int getLuckyBoat() {
      return this.luckyBoat;
   }

   public void setLuckyBoat(int luckyBoat) {
      this.checkModify();
      this.luckyBoat = luckyBoat;
   }

   public List<Integer> getBonusReward() {
      return this.bonusReward;
   }

   public void setBonusReward(List<Integer> bonusReward) {
      this.checkModify();
      this.bonusReward = bonusReward;
   }
}
