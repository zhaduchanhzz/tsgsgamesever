package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHLGoods"
)
public class WarHLGoodsModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "商品序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "商品类型"
   )
   private int goodsType;
   @ModelColumnAnno(
      comment = "商品id"
   )
   private int goodsId;
   @ModelColumnAnno(
      comment = "商品数量"
   )
   private int goodsNum;
   @ModelColumnAnno(
      comment = "折扣显示"
   )
   private int discount;
   @ModelColumnAnno(
      comment = "消耗类型"
   )
   private int costType;
   @ModelColumnAnno(
      comment = "消耗id"
   )
   private int costId;
   @ModelColumnAnno(
      comment = "消耗数量"
   )
   private int costNum;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int pro;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGoodsType() {
      return this.goodsType;
   }

   public void setGoodsType(int goodsType) {
      this.checkModify();
      this.goodsType = goodsType;
   }

   public int getGoodsId() {
      return this.goodsId;
   }

   public void setGoodsId(int goodsId) {
      this.checkModify();
      this.goodsId = goodsId;
   }

   public int getGoodsNum() {
      return this.goodsNum;
   }

   public void setGoodsNum(int goodsNum) {
      this.checkModify();
      this.goodsNum = goodsNum;
   }

   public int getDiscount() {
      return this.discount;
   }

   public void setDiscount(int discount) {
      this.checkModify();
      this.discount = discount;
   }

   public int getCostType() {
      return this.costType;
   }

   public void setCostType(int costType) {
      this.checkModify();
      this.costType = costType;
   }

   public int getCostId() {
      return this.costId;
   }

   public void setCostId(int costId) {
      this.checkModify();
      this.costId = costId;
   }

   public int getCostNum() {
      return this.costNum;
   }

   public void setCostNum(int costNum) {
      this.checkModify();
      this.costNum = costNum;
   }

   public int getPro() {
      return this.pro;
   }

   public void setPro(int pro) {
      this.checkModify();
      this.pro = pro;
   }
}
