package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "qianKunReward"
)
public class QianKunRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奖励组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "格子位置"
   )
   private int form;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "道具"
   )
   private ArrayList<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "显示概率"
   )
   private int odd1;
   @ModelColumnAnno(
      comment = "真实权重"
   )
   private int odd2;
   @ModelColumnAnno(
      comment = "是否有前置次数"
   )
   private int true1;
   @ModelColumnAnno(
      comment = "可能抽取到所需的前置次数"
   )
   private int times1;
   @ModelColumnAnno(
      comment = "是否有必定获得次数"
   )
   private int true2;
   @ModelColumnAnno(
      comment = "必定获得所需的次数"
   )
   private int times2;
   @ModelColumnAnno(
      comment = "最多可获得的次数"
   )
   private int times3;
   @ModelColumnAnno(
      comment = "是否记录到跨服记录中"
   )
   private int true3;
   @ModelColumnAnno(
      comment = "是否进行跨服播报"
   )
   private int true4;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public int getForm() {
      return this.form;
   }

   public void setForm(int form) {
      this.checkModify();
      this.form = form;
   }

   public ArrayList<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(ArrayList<ResourceModel> rewards) {
      this.rewards = rewards;
   }

   public int getOdd2() {
      return this.odd2;
   }

   public void setOdd2(int odd2) {
      this.checkModify();
      this.odd2 = odd2;
   }

   public int getTrue1() {
      return this.true1;
   }

   public void setTrue1(int true1) {
      this.checkModify();
      this.true1 = true1;
   }

   public int getTimes1() {
      return this.times1;
   }

   public void setTimes1(int times1) {
      this.checkModify();
      this.times1 = times1;
   }

   public int getTrue2() {
      return this.true2;
   }

   public void setTrue2(int true2) {
      this.checkModify();
      this.true2 = true2;
   }

   public int getTimes2() {
      return this.times2;
   }

   public void setTimes2(int times2) {
      this.checkModify();
      this.times2 = times2;
   }

   public int getTimes3() {
      return this.times3;
   }

   public void setTimes3(int times3) {
      this.checkModify();
      this.times3 = times3;
   }

   public int getTrue3() {
      return this.true3;
   }

   public void setTrue3(int true3) {
      this.checkModify();
      this.true3 = true3;
   }

   public int getTrue4() {
      return this.true4;
   }

   public void setTrue4(int true4) {
      this.checkModify();
      this.true4 = true4;
   }

   public int getOdd1() {
      return this.odd1;
   }

   public void setOdd1(int odd1) {
      this.checkModify();
      this.odd1 = odd1;
   }
}
