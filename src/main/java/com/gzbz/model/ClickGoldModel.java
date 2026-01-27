package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "clickGoldCfg"
)
public class ClickGoldModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "chapterId",
      isPrimaty = true,
      comment = "章节ID"
   )
   private int chapterId;
   @ModelColumnAnno(
      columnName = "freeClick",
      comment = "免费点金"
   )
   private int freeClick;
   @ModelColumnAnno(
      columnName = "lowClick",
      comment = "初级元宝点金"
   )
   private int lowClick;
   @ModelColumnAnno(
      columnName = "highClick",
      comment = "高级元宝点金"
   )
   private int highClick;
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "vipFree",
      subCls = Integer.class,
      count = 10,
      comment = "免费VIP加成"
   )
   private Map<Integer, Integer> vipFree = new TreeMap();
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "vipLow",
      subCls = Integer.class,
      count = 10,
      comment = "初级VIP加成"
   )
   private Map<Integer, Integer> vipLow = new TreeMap();
   @ModelColumnAnno(
      columnConvertType = 4,
      columnName = "vipHigh",
      subCls = Integer.class,
      count = 10,
      comment = "高级VIP加成"
   )
   private Map<Integer, Integer> vipHigh = new TreeMap();

   public int getChapterId() {
      return this.chapterId;
   }

   public void setChapterId(int chapterId) {
      this.checkModify();
      this.chapterId = chapterId;
   }

   public int getFreeClick() {
      return this.freeClick;
   }

   public void setFreeClick(int freeClick) {
      this.checkModify();
      this.freeClick = freeClick;
   }

   public int getLowClick() {
      return this.lowClick;
   }

   public void setLowClick(int lowClick) {
      this.checkModify();
      this.lowClick = lowClick;
   }

   public int getHighClick() {
      return this.highClick;
   }

   public void setHighClick(int highClick) {
      this.checkModify();
      this.highClick = highClick;
   }

   public Map<Integer, Integer> getVipFree() {
      return this.vipFree;
   }

   public void setVipFree(Map<Integer, Integer> vipFree) {
      this.checkModify();
      this.vipFree = vipFree;
   }

   public Map<Integer, Integer> getVipLow() {
      return this.vipLow;
   }

   public void setVipLow(Map<Integer, Integer> vipLow) {
      this.checkModify();
      this.vipLow = vipLow;
   }

   public Map<Integer, Integer> getVipHigh() {
      return this.vipHigh;
   }

   public void setVipHigh(Map<Integer, Integer> vipHigh) {
      this.checkModify();
      this.vipHigh = vipHigh;
   }
}
