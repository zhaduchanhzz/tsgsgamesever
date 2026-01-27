package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "vip"
)
public class VipModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "会员等级"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "vipExp",
      comment = "会员升级经验"
   )
   private int vipExp;
   @ModelColumnAnno(
      columnName = "vipDrop1",
      comment = "玩家经验掉落修正"
   )
   private int vipDrop1;
   @ModelColumnAnno(
      columnName = "vipDrop2",
      comment = "武将经验掉落修正"
   )
   private int vipDrop2;
   @ModelColumnAnno(
      columnName = "vipDrop3",
      comment = "铜钱掉落修正"
   )
   private int vipDrop3;
   @ModelColumnAnno(
      columnName = "vipDrop4",
      comment = "情报掉落修正"
   )
   private int vipDrop4;
   @ModelColumnAnno(
      columnName = "heroLimit",
      comment = "武将数量上限"
   )
   private int heroLimit;
   @ModelColumnAnno(
      columnName = "challengeTimes",
      comment = "校场购买次数"
   )
   private int challengeTimes;
   @ModelColumnAnno(
      comment = "日常副本购买次数"
   )
   private int dailyCopyPassTimes;
   @ModelColumnAnno(
      comment = "北伐中原副本购买次数"
   )
   private int northCopyPassTimes;
   @ModelColumnAnno(
      comment = "通天塔购买次数"
   )
   private int trialsTowerPurchases;
   @ModelColumnAnno(
      comment = "神秘商店刷新次数"
   )
   private int mysticMerchantRefresh;
   @ModelColumnAnno(
      comment = "千里单骑复活次数"
   )
   private int resurrectionTimes;
   @ModelColumnAnno(
      comment = "悬赏每日奖励获得次数"
   )
   private int offerRewardTimes;
   @ModelColumnAnno(
      comment = "战斗速度"
   )
   private int combatSpeed;
   @ModelColumnAnno(
      comment = "挂机收益时长"
   )
   private int hangBenefitsLong;
   @ModelColumnAnno(
      comment = "点金加成"
   )
   private int goldBonus;
   @ModelColumnAnno(
      comment = "副本购买次数"
   )
   private int copyPurchases;
   @ModelColumnAnno(
      comment = "专属图标"
   )
   private int icon;
   @ModelColumnAnno(
      comment = "专属奖励"
   )
   private int reward;
   @ModelColumnAnno(
      comment = "特权礼包id"
   )
   private int iPrivilegePackage;
   @ModelColumnAnno(
      comment = "礼包描述"
   )
   private String giftDesc;
   @ModelColumnAnno(
      comment = "自由幽会次数加成"
   )
   private int beautyTimes;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getVipExp() {
      return this.vipExp;
   }

   public void setVipExp(int vipExp) {
      this.checkModify();
      this.vipExp = vipExp;
   }

   public int getVipDrop1() {
      return this.vipDrop1;
   }

   public void setVipDrop1(int vipDrop1) {
      this.checkModify();
      this.vipDrop1 = vipDrop1;
   }

   public int getVipDrop2() {
      return this.vipDrop2;
   }

   public void setVipDrop2(int vipDrop2) {
      this.checkModify();
      this.vipDrop2 = vipDrop2;
   }

   public int getVipDrop3() {
      return this.vipDrop3;
   }

   public void setVipDrop3(int vipDrop3) {
      this.checkModify();
      this.vipDrop3 = vipDrop3;
   }

   public int getVipDrop4() {
      return this.vipDrop4;
   }

   public void setVipDrop4(int vipDrop4) {
      this.checkModify();
      this.vipDrop4 = vipDrop4;
   }

   public int getHeroLimit() {
      return this.heroLimit;
   }

   public void setHeroLimit(int heroLimit) {
      this.checkModify();
      this.heroLimit = heroLimit;
   }

   public int getChallengeTimes() {
      return this.challengeTimes;
   }

   public void setChallengeTimes(int challengeTimes) {
      this.checkModify();
      this.challengeTimes = challengeTimes;
   }

   public int getDailyCopyPassTimes() {
      return this.dailyCopyPassTimes;
   }

   public void setDailyCopyPassTimes(int dailyCopyPassTimes) {
      this.checkModify();
      this.dailyCopyPassTimes = dailyCopyPassTimes;
   }

   public int getNorthCopyPassTimes() {
      return this.northCopyPassTimes;
   }

   public void setNorthCopyPassTimes(int northCopyPassTimes) {
      this.checkModify();
      this.northCopyPassTimes = northCopyPassTimes;
   }

   public int getTrialsTowerPurchases() {
      return this.trialsTowerPurchases;
   }

   public void setTrialsTowerPurchases(int trialsTowerPurchases) {
      this.checkModify();
      this.trialsTowerPurchases = trialsTowerPurchases;
   }

   public int getMysticMerchantRefresh() {
      return this.mysticMerchantRefresh;
   }

   public void setMysticMerchantRefresh(int mysticMerchantRefresh) {
      this.checkModify();
      this.mysticMerchantRefresh = mysticMerchantRefresh;
   }

   public int getResurrectionTimes() {
      return this.resurrectionTimes;
   }

   public void setResurrectionTimes(int resurrectionTimes) {
      this.checkModify();
      this.resurrectionTimes = resurrectionTimes;
   }

   public int getOfferRewardTimes() {
      return this.offerRewardTimes;
   }

   public void setOfferRewardTimes(int offerRewardTimes) {
      this.checkModify();
      this.offerRewardTimes = offerRewardTimes;
   }

   public int getCombatSpeed() {
      return this.combatSpeed;
   }

   public void setCombatSpeed(int combatSpeed) {
      this.checkModify();
      this.combatSpeed = combatSpeed;
   }

   public int getHangBenefitsLong() {
      return this.hangBenefitsLong;
   }

   public void setHangBenefitsLong(int hangBenefitsLong) {
      this.checkModify();
      this.hangBenefitsLong = hangBenefitsLong;
   }

   public int getGoldBonus() {
      return this.goldBonus;
   }

   public void setGoldBonus(int goldBonus) {
      this.checkModify();
      this.goldBonus = goldBonus;
   }

   public int getCopyPurchases() {
      return this.copyPurchases;
   }

   public void setCopyPurchases(int copyPurchases) {
      this.checkModify();
      this.copyPurchases = copyPurchases;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public int getReward() {
      return this.reward;
   }

   public void setReward(int reward) {
      this.checkModify();
      this.reward = reward;
   }

   public int getIPrivilegePackage() {
      return this.iPrivilegePackage;
   }

   public void setIPrivilegePackage(int iPrivilegePackage) {
      this.checkModify();
      this.iPrivilegePackage = iPrivilegePackage;
   }

   public String getGiftDesc() {
      return this.giftDesc;
   }

   public void setGiftDesc(String giftDesc) {
      this.checkModify();
      this.giftDesc = giftDesc;
   }

   public int getBeautyTimes() {
      return this.beautyTimes;
   }

   public void setBeautyTimes(int beautyTimes) {
      this.checkModify();
      this.beautyTimes = beautyTimes;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
