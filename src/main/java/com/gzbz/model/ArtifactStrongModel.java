package com.gzbz.model;

import com.gzbz.model.fun.ProbabilityFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import misc.RandomUtil;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "artifactStrong"
)
public class ArtifactStrongModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "level",
      isPrimaty = true,
      comment = "等级"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "exp",
      comment = "升级需求经验值"
   )
   private int exp;
   @ModelColumnAnno(
      columnName = "randoms",
      columnConvertType = 1,
      subCls = ProbabilityFun.class,
      count = 3,
      comment = "随机"
   )
   private ArrayList<ProbabilityFun> randoms = new ArrayList();
   @ModelColumnAnno(
      columnName = "expAtk",
      comment = "每点经验值给予攻击力"
   )
   private float expAtk;
   @ModelColumnAnno(
      columnName = "expHp",
      comment = "每点经验值给予生命值"
   )
   private float expHp;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "强化道具"
   )
   private ArrayList<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      columnName = "rewardAtk",
      comment = "每次升级提供额外攻击力"
   )
   private int rewardAtk;
   @ModelColumnAnno(
      columnName = "rewardHp",
      comment = "每次升级提供额外生命值"
   )
   private int rewardHp;
   @ModelColumnAnno(
      columnName = "artifactSoulNum",
      comment = "铸魂次数上限"
   )
   private int artifactSoulNum;

   public int getRandomExp() {
      int totalProb = 0;

      for(ProbabilityFun random : this.randoms) {
         totalProb += random.getProbability();
      }

      int r = RandomUtil.randInt(totalProb);
      int temp = 0;

      for(ProbabilityFun random : this.randoms) {
         temp += random.getProbability();
         if (r < temp) {
            return random.getVal();
         }
      }

      return 0;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }

   public ArrayList<ProbabilityFun> getRandoms() {
      return this.randoms;
   }

   public void setRandoms(ArrayList<ProbabilityFun> randoms) {
      this.checkModify();
      this.randoms = randoms;
   }

   public float getExpAtk() {
      return this.expAtk;
   }

   public void setExpAtk(float expAtk) {
      this.checkModify();
      this.expAtk = expAtk;
   }

   public float getExpHp() {
      return this.expHp;
   }

   public void setExpHp(float expHp) {
      this.checkModify();
      this.expHp = expHp;
   }

   public ArrayList<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(ArrayList<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public int getRewardAtk() {
      return this.rewardAtk;
   }

   public void setRewardAtk(int rewardAtk) {
      this.checkModify();
      this.rewardAtk = rewardAtk;
   }

   public int getRewardHp() {
      return this.rewardHp;
   }

   public void setRewardHp(int rewardHp) {
      this.checkModify();
      this.rewardHp = rewardHp;
   }

   public int getArtifactSoulNum() {
      return this.artifactSoulNum;
   }

   public void setArtifactSoulNum(int artifactSoulNum) {
      this.checkModify();
      this.artifactSoulNum = artifactSoulNum;
   }
}
