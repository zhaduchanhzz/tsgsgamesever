package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "peakednessStep"
)
public class PeakednessStepModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "段位id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "段位名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "升到下一段经验"
   )
   private int exp;
   @ModelColumnAnno(
      comment = "缓冲积分"
   )
   private int bufferExp;
   @ModelColumnAnno(
      comment = "升到下一段位需要的胜场"
   )
   private int winTimes;
   @ModelColumnAnno(
      comment = "升到下一段为进行的总场次"
   )
   private int allTimes;
   @ModelColumnAnno(
      comment = "战斗失败减少的经验"
   )
   private int defeatExp;
   @ModelColumnAnno(
      comment = "战斗失败减少的积分"
   )
   private int defeatPoint;
   @ModelColumnAnno(
      columnName = "winAward",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 2,
      comment = "胜利奖励"
   )
   private ArrayList<ResourceModel> winAward = new ArrayList();
   @ModelColumnAnno(
      columnName = "defeatAward",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 2,
      comment = "失败奖励"
   )
   private ArrayList<ResourceModel> defeatAward = new ArrayList();
   @ModelColumnAnno(
      columnName = "firstStepAward",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 3,
      comment = "首次达到段位奖励"
   )
   private ArrayList<ResourceModel> firstStepAward = new ArrayList();
   @ModelColumnAnno(
      comment = "重置后的段位"
   )
   private int stepReset;

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

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }

   public int getBufferExp() {
      return this.bufferExp;
   }

   public void setBufferExp(int bufferExp) {
      this.checkModify();
      this.bufferExp = bufferExp;
   }

   public int getWinTimes() {
      return this.winTimes;
   }

   public void setWinTimes(int winTimes) {
      this.checkModify();
      this.winTimes = winTimes;
   }

   public int getAllTimes() {
      return this.allTimes;
   }

   public void setAllTimes(int allTimes) {
      this.checkModify();
      this.allTimes = allTimes;
   }

   public int getDefeatExp() {
      return this.defeatExp;
   }

   public void setDefeatExp(int defeatExp) {
      this.checkModify();
      this.defeatExp = defeatExp;
   }

   public int getDefeatPoint() {
      return this.defeatPoint;
   }

   public void setDefeatPoint(int defeatPoint) {
      this.checkModify();
      this.defeatPoint = defeatPoint;
   }

   public ArrayList<ResourceModel> getWinAward() {
      return this.winAward;
   }

   public void setWinAward(ArrayList<ResourceModel> winAward) {
      this.checkModify();
      this.winAward = winAward;
   }

   public ArrayList<ResourceModel> getDefeatAward() {
      return this.defeatAward;
   }

   public void setDefeatAward(ArrayList<ResourceModel> defeatAward) {
      this.checkModify();
      this.defeatAward = defeatAward;
   }

   public ArrayList<ResourceModel> getFirstStepAward() {
      return this.firstStepAward;
   }

   public void setFirstStepAward(ArrayList<ResourceModel> firstStepAward) {
      this.checkModify();
      this.firstStepAward = firstStepAward;
   }

   public int getStepReset() {
      return this.stepReset;
   }

   public void setStepReset(int stepReset) {
      this.checkModify();
      this.stepReset = stepReset;
   }
}
