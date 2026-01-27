package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HefuRushRank"
)
public class HefuRushRankModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动内起始天"
   )
   private int startDay;
   @ModelColumnAnno(
      comment = "活动内结尾天"
   )
   private int endDay;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "第1名所需积分"
   )
   private int needPoint1;
   @ModelColumnAnno(
      comment = "第2名所需积分"
   )
   private int needPoint2;
   @ModelColumnAnno(
      comment = "第3名所需积分"
   )
   private int needPoint3;
   @ModelColumnAnno(
      comment = "邮件奖励类型"
   )
   private int centreType;
   @ModelColumnAnno(
      comment = "榜名艺术字"
   )
   private String artName;
   @ModelColumnAnno(
      comment = "海报上道具"
   )
   private String itemName;
   @ModelColumnAnno(
      comment = "挑战进度名字"
   )
   private String scoreName;
   @ModelColumnAnno(
      comment = "说明文本"
   )
   private String explainText;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStartDay() {
      return this.startDay;
   }

   public void setStartDay(int startDay) {
      this.checkModify();
      this.startDay = startDay;
   }

   public int getEndDay() {
      return this.endDay;
   }

   public void setEndDay(int endDay) {
      this.checkModify();
      this.endDay = endDay;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getNeedPoint1() {
      return this.needPoint1;
   }

   public void setNeedPoint1(int needPoint1) {
      this.checkModify();
      this.needPoint1 = needPoint1;
   }

   public int getNeedPoint2() {
      return this.needPoint2;
   }

   public void setNeedPoint2(int needPoint2) {
      this.checkModify();
      this.needPoint2 = needPoint2;
   }

   public int getNeedPoint3() {
      return this.needPoint3;
   }

   public void setNeedPoint3(int needPoint3) {
      this.checkModify();
      this.needPoint3 = needPoint3;
   }

   public int getCentreType() {
      return this.centreType;
   }

   public void setCentreType(int centreType) {
      this.checkModify();
      this.centreType = centreType;
   }

   public String getArtName() {
      return this.artName;
   }

   public void setArtName(String artName) {
      this.checkModify();
      this.artName = artName;
   }

   public String getItemName() {
      return this.itemName;
   }

   public void setItemName(String itemName) {
      this.checkModify();
      this.itemName = itemName;
   }

   public String getScoreName() {
      return this.scoreName;
   }

   public void setScoreName(String scoreName) {
      this.checkModify();
      this.scoreName = scoreName;
   }

   public String getExplainText() {
      return this.explainText;
   }

   public void setExplainText(String explainText) {
      this.checkModify();
      this.explainText = explainText;
   }
}
