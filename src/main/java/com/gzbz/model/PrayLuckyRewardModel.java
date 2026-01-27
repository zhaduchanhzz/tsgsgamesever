package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "prayLuckyReward"
)
public class PrayLuckyRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "祈福类型id"
   )
   private int prayId;
   @ModelColumnAnno(
      comment = "幸运值要求"
   )
   private int luckyPoint;
   @ModelColumnAnno(
      comment = "上一档奖励限制"
   )
   private int lastId;
   @ModelColumnAnno(
      columnConvertType = 1,
      count = 1,
      subCls = ResourceModel.class,
      comment = "奖励列表"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "领取后是否消耗幸运值并重置0否1是"
   )
   private int reset;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getPrayId() {
      return this.prayId;
   }

   public void setPrayId(int prayId) {
      this.checkModify();
      this.prayId = prayId;
   }

   public int getLuckyPoint() {
      return this.luckyPoint;
   }

   public void setLuckyPoint(int luckyPoint) {
      this.checkModify();
      this.luckyPoint = luckyPoint;
   }

   public int getLastId() {
      return this.lastId;
   }

   public void setLastId(int lastId) {
      this.checkModify();
      this.lastId = lastId;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getReset() {
      return this.reset;
   }

   public void setReset(int reset) {
      this.checkModify();
      this.reset = reset;
   }
}
