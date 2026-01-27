package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "pray"
)
public class PrayModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "祈福类型id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "单次幸运值"
   )
   private int luckPoint;
   @ModelColumnAnno(
      comment = "单次祈福积分"
   )
   private int prayScore;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "祈福次数方式"
   )
   private List<Integer> prayTimes = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      count = 2,
      subCls = ResourceModel.class,
      comment = "祈福方式消耗"
   )
   private List<ResourceModel> cost = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      count = 1,
      subCls = ResourceModel.class,
      comment = "刷新消耗"
   )
   private List<ResourceModel> refreshCost = new ArrayList();
   @ModelColumnAnno(
      comment = "免费刷新次数上限"
   )
   private int freeRefreshCount;
   @ModelColumnAnno(
      comment = "获得免费刷新次数时间间隔：单位小时"
   )
   private int freeRefreshTime;
   @ModelColumnAnno(
      comment = "奖励概率描述"
   )
   private String desc;

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

   public int getLuckPoint() {
      return this.luckPoint;
   }

   public void setLuckPoint(int luckPoint) {
      this.checkModify();
      this.luckPoint = luckPoint;
   }

   public int getPrayScore() {
      return this.prayScore;
   }

   public void setPrayScore(int prayScore) {
      this.checkModify();
      this.prayScore = prayScore;
   }

   public List<Integer> getPrayTimes() {
      return this.prayTimes;
   }

   public void setPrayTimes(List<Integer> prayTimes) {
      this.checkModify();
      this.prayTimes = prayTimes;
   }

   public List<ResourceModel> getCost() {
      return this.cost;
   }

   public void setCost(List<ResourceModel> cost) {
      this.checkModify();
      this.cost = cost;
   }

   public List<ResourceModel> getRefreshCost() {
      return this.refreshCost;
   }

   public void setRefreshCost(List<ResourceModel> refreshCost) {
      this.checkModify();
      this.refreshCost = refreshCost;
   }

   public int getFreeRefreshCount() {
      return this.freeRefreshCount;
   }

   public void setFreeRefreshCount(int freeRefreshCount) {
      this.checkModify();
      this.freeRefreshCount = freeRefreshCount;
   }

   public int getFreeRefreshTime() {
      return this.freeRefreshTime;
   }

   public void setFreeRefreshTime(int freeRefreshTime) {
      this.checkModify();
      this.freeRefreshTime = freeRefreshTime;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
