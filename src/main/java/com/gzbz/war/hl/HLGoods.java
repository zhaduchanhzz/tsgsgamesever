package com.gzbz.war.hl;

import com.gzbz.model.WarHLGoodsModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.WarMsg;
import com.gzbz.util.ResCountryDifUtils;

public class HLGoods {
   public int index;
   public ResourceModel item;
   public ResourceModel cost;
   public int discount;
   public boolean bought;

   public HLGoods() {
   }

   public HLGoods(WarHLGoodsModel goodsModel) {
      this.index = goodsModel.getId();
      this.item = new ResourceModel(goodsModel.getGoodsType(), goodsModel.getGoodsId(), goodsModel.getGoodsNum());
      int costNum = ResCountryDifUtils.goldAdditionForJp(goodsModel.getCostType(), goodsModel.getCostId(), goodsModel.getCostNum());
      this.cost = new ResourceModel(goodsModel.getCostType(), goodsModel.getCostId(), costNum);
      this.discount = goodsModel.getDiscount();
   }

   public WarMsg.HLGoods builder() {
      WarMsg.HLGoods.Builder builder = WarMsg.HLGoods.newBuilder();
      builder.setIndex(this.index);
      builder.setItem(this.item.builder());
      builder.setCost(this.cost.builder());
      builder.setDiscount(this.discount);
      builder.setBought(this.bought);
      return builder.build();
   }
}
