package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "levelPromote"
)
public class LevelPromoteModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "关卡id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "玩家等级需求"
   )
   private int needLv;
   @ModelColumnAnno(
      columnConvertType = 4,
      subCls = Integer.class,
      count = 3,
      comment = "关卡"
   )
   private List<Integer> battle = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 4,
      subCls = Integer.class,
      count = 3,
      comment = "布阵条件"
   )
   private List<Integer> arrayCondition = new ArrayList();
   @ModelColumnAnno(
      comment = "所需胜场"
   )
   private int winTimes;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "突破奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = KeyValFun.class,
      count = 4,
      comment = "系统提升等级"
   )
   private List<KeyValFun> raise = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "额外通关奖励"
   )
   private List<ResourceModel> extraRewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNeedLv() {
      return this.needLv;
   }

   public void setNeedLv(int needLv) {
      this.checkModify();
      this.needLv = needLv;
   }

   public List<Integer> getBattle() {
      return this.battle;
   }

   public void setBattle(List<Integer> battle) {
      this.checkModify();
      this.battle = battle;
   }

   public List<Integer> getArrayCondition() {
      return this.arrayCondition;
   }

   public void setArrayCondition(List<Integer> arrayCondition) {
      this.checkModify();
      this.arrayCondition = arrayCondition;
   }

   public int getWinTimes() {
      return this.winTimes;
   }

   public void setWinTimes(int winTimes) {
      this.checkModify();
      this.winTimes = winTimes;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public List<KeyValFun> getRaise() {
      return this.raise;
   }

   public void setRaise(List<KeyValFun> raise) {
      this.checkModify();
      this.raise = raise;
   }

   public List<ResourceModel> getExtraRewards() {
      return this.extraRewards;
   }

   public void setExtraRewards(List<ResourceModel> extraRewards) {
      this.checkModify();
      this.extraRewards = extraRewards;
   }
}
