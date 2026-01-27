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
   file = "FristYearSite"
)
public class FirstYearSiteModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "建筑类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "建筑名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "建筑等级"
   )
   private int level;
   @ModelColumnAnno(
      comment = "挑战次数"
   )
   private int time;
   @ModelColumnAnno(
      comment = "每小时收益"
   )
   private int profit;
   @ModelColumnAnno(
      comment = "cd时间"
   )
   private int cd;
   @ModelColumnAnno(
      comment = "显示解锁时间"
   )
   private int showCd;
   @ModelColumnAnno(
      comment = "结算时间"
   )
   private int AccountCd;
   @ModelColumnAnno(
      comment = "解锁条件描述"
   )
   private String lockDesc;
   @ModelColumnAnno(
      comment = "数量"
   )
   private int targetValue;
   @ModelColumnAnno(
      comment = "升级消耗",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> leveItem = new ArrayList();
   @ModelColumnAnno(
      comment = "挑战奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> rewardItem = new ArrayList();
   @ModelColumnAnno(
      comment = "触发奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> strikeReward = new ArrayList();
   @ModelColumnAnno(
      comment = "触发奖励品质",
      columnConvertType = 2,
      subCls = String.class
   )
   private List<String> character = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, FirstYearSiteModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         FirstYearSiteModel model = (FirstYearSiteModel)entry.getValue();
         ((ConcurrentHashMap)tempMap.computeIfAbsent(model.getType(), (v) -> new ConcurrentHashMap())).put(model.getLevel(), model);
      }

      pool.putMap("customFristYearSite", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
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

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public int getProfit() {
      return this.profit;
   }

   public void setProfit(int profit) {
      this.checkModify();
      this.profit = profit;
   }

   public int getCd() {
      return this.cd;
   }

   public void setCd(int cd) {
      this.checkModify();
      this.cd = cd;
   }

   public int getShowCd() {
      return this.showCd;
   }

   public void setShowCd(int showCd) {
      this.checkModify();
      this.showCd = showCd;
   }

   public int getAccountCd() {
      return this.AccountCd;
   }

   public void setAccountCd(int accountCd) {
      this.checkModify();
      this.AccountCd = accountCd;
   }

   public String getLockDesc() {
      return this.lockDesc;
   }

   public void setLockDesc(String lockDesc) {
      this.checkModify();
      this.lockDesc = lockDesc;
   }

   public int getTargetValue() {
      return this.targetValue;
   }

   public void setTargetValue(int targetValue) {
      this.checkModify();
      this.targetValue = targetValue;
   }

   public List<ResourceModel> getLeveItem() {
      return this.leveItem;
   }

   public void setLeveItem(List<ResourceModel> leveItem) {
      this.checkModify();
      this.leveItem = leveItem;
   }

   public List<ResourceModel> getRewardItem() {
      return this.rewardItem;
   }

   public void setRewardItem(List<ResourceModel> rewardItem) {
      this.checkModify();
      this.rewardItem = rewardItem;
   }

   public List<ResourceModel> getStrikeReward() {
      return this.strikeReward;
   }

   public void setStrikeReward(List<ResourceModel> strikeReward) {
      this.checkModify();
      this.strikeReward = strikeReward;
   }

   public List<String> getCharacter() {
      return this.character;
   }

   public void setCharacter(List<String> character) {
      this.checkModify();
      this.character = character;
   }
}
