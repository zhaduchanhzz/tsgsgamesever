package com.gzbz.model;

import com.gzbz.model.fun.MidAutumnStageModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "YuanxiaoGuest"
)
public class YuanXiaoGuestModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "甜品id"
   )
   private int dessertId;
   @ModelColumnAnno(
      comment = "刷出概率",
      columnName = "Value"
   )
   private int value;
   @ModelColumnAnno(
      comment = "最高积分",
      columnName = "MaxPiont"
   )
   private int maxPoint;
   @ModelColumnAnno(
      comment = "等待时间",
      columnName = "WaitTime"
   )
   private int waitTime;
   @ModelColumnAnno(
      columnName = "stage",
      columnConvertType = 1,
      subCls = MidAutumnStageModel.class,
      count = 4,
      comment = "阶段"
   )
   private List<MidAutumnStageModel> stage = new ArrayList();
   @ModelColumnAnno(
      columnName = "Visitorreward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "客人奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDessertId() {
      return this.dessertId;
   }

   public void setDessertId(int dessertId) {
      this.checkModify();
      this.dessertId = dessertId;
   }

   public int getValue() {
      return this.value;
   }

   public void setValue(int value) {
      this.checkModify();
      this.value = value;
   }

   public int getWaitTime() {
      return this.waitTime;
   }

   public void setWaitTime(int waitTime) {
      this.checkModify();
      this.waitTime = waitTime;
   }

   public List<MidAutumnStageModel> getStage() {
      return this.stage;
   }

   public void setStage(List<MidAutumnStageModel> stage) {
      this.checkModify();
      this.stage = stage;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }

   public int getMaxPoint() {
      return this.maxPoint;
   }

   public void setMaxPoint(int maxPoint) {
      this.checkModify();
      this.maxPoint = maxPoint;
   }
}
