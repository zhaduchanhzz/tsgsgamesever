package com.gzbz.model;

import com.gzbz.model.fun.QualityWeightModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroGameBoxLottery"
)
public class HeroGameBoxLotteryModel extends BaseModel {
   @ModelColumnAnno(
      comment = "抽卡等级",
      isPrimaty = true
   )
   private int boxLv;
   @ModelColumnAnno(
      comment = "所需玩家等级"
   )
   private int needLevel;
   @ModelColumnAnno(
      comment = "累计抽卡次数"
   )
   private int needLotteryNum;
   @ModelColumnAnno(
      comment = "升级消耗",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> need = new ArrayList();
   @ModelColumnAnno(
      comment = "升级耗时（秒）"
   )
   private int time;
   @ModelColumnAnno(
      comment = "品质保底",
      columnConvertType = 1,
      subCls = QualityWeightModel.class
   )
   private List<QualityWeightModel> qualityWeight = new ArrayList();
   @ModelColumnAnno(
      comment = "解锁的抽奖额外奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> unlock = new ArrayList();
   @ModelColumnAnno(
      comment = "额外获取权重"
   )
   private int unlockWeight;

   public int getBoxLv() {
      return this.boxLv;
   }

   public void setBoxLv(int boxLv) {
      this.checkModify();
      this.boxLv = boxLv;
   }

   public int getNeedLevel() {
      return this.needLevel;
   }

   public void setNeedLevel(int needLevel) {
      this.checkModify();
      this.needLevel = needLevel;
   }

   public int getNeedLotteryNum() {
      return this.needLotteryNum;
   }

   public void setNeedLotteryNum(int needLotteryNum) {
      this.checkModify();
      this.needLotteryNum = needLotteryNum;
   }

   public List<ResourceModel> getNeed() {
      return this.need;
   }

   public void setNeed(List<ResourceModel> need) {
      this.checkModify();
      this.need = need;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public List<QualityWeightModel> getQualityWeight() {
      return this.qualityWeight;
   }

   public void setQualityWeight(List<QualityWeightModel> qualityWeight) {
      this.checkModify();
      this.qualityWeight = qualityWeight;
   }

   public List<ResourceModel> getUnlock() {
      return this.unlock;
   }

   public void setUnlock(List<ResourceModel> unlock) {
      this.checkModify();
      this.unlock = unlock;
   }

   public int getUnlockWeight() {
      return this.unlockWeight;
   }

   public void setUnlockWeight(int unlockWeight) {
      this.checkModify();
      this.unlockWeight = unlockWeight;
   }
}
