package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "treasureQuality"
)
public class TreasureQualityModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "总星级"
   )
   private int id;
   @ModelColumnAnno(
      comment = "阶数"
   )
   private int level;
   @ModelColumnAnno(
      comment = "升阶所需星级"
   )
   private int upgradeExpStar;
   @ModelColumnAnno(
      comment = "当前星级"
   )
   private int expStar;
   @ModelColumnAnno(
      comment = "进阶加成攻击 万分比"
   )
   private int proAtk;
   @ModelColumnAnno(
      comment = "进阶加成生命 万分比"
   )
   private int proHp;
   @ModelColumnAnno(
      comment = "进阶加成速度"
   )
   private int proSpd;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "进阶需求道具"
   )
   private List<ResourceModel> consumeProp = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "重置获得道具"
   )
   private List<ResourceModel> resetAcquire = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getUpgradeExpStar() {
      return this.upgradeExpStar;
   }

   public void setUpgradeExpStar(int upgradeExpStar) {
      this.checkModify();
      this.upgradeExpStar = upgradeExpStar;
   }

   public int getExpStar() {
      return this.expStar;
   }

   public void setExpStar(int expStar) {
      this.checkModify();
      this.expStar = expStar;
   }

   public int getProAtk() {
      return this.proAtk;
   }

   public void setProAtk(int proAtk) {
      this.checkModify();
      this.proAtk = proAtk;
   }

   public int getProHp() {
      return this.proHp;
   }

   public void setProHp(int proHp) {
      this.checkModify();
      this.proHp = proHp;
   }

   public int getProSpd() {
      return this.proSpd;
   }

   public void setProSpd(int proSpd) {
      this.checkModify();
      this.proSpd = proSpd;
   }

   public List<ResourceModel> getConsumeProp() {
      return this.consumeProp;
   }

   public void setConsumeProp(List<ResourceModel> consumeProp) {
      this.checkModify();
      this.consumeProp = consumeProp;
   }

   public List<ResourceModel> getResetAcquire() {
      return this.resetAcquire;
   }

   public void setResetAcquire(List<ResourceModel> resetAcquire) {
      this.checkModify();
      this.resetAcquire = resetAcquire;
   }
}
