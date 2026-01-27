package com.gzbz.mart.bean;

import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MartMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MartDetailData {
   public int code;
   public int itemId;
   public int priceType;
   public int priceId;
   public int oriPrice;
   public int curPrice;
   public int maxPrice;
   public int dealTime;
   public int seller;
   public int buyer;
   public int state;
   public int scoreId;
   public String sellerName = "";
   public String buyerName = "";
   public Map<Integer, PropertyModel> attrMap = new HashMap();
   public int entryId;

   public void decode(String string) {
      String[] split = string.split("@");
      String[] arr = split[0].split(",");
      this.code = Integer.parseInt(arr[0]);
      this.itemId = Integer.parseInt(arr[1]);
      this.priceType = Integer.parseInt(arr[2]);
      this.priceId = Integer.parseInt(arr[3]);
      this.oriPrice = Integer.parseInt(arr[4]);
      this.curPrice = Integer.parseInt(arr[5]);
      this.maxPrice = Integer.parseInt(arr[6]);
      this.dealTime = Integer.parseInt(arr[7]);
      this.seller = Integer.parseInt(arr[8]);
      this.buyer = Integer.parseInt(arr[9]);
      this.state = Integer.parseInt(arr[10]);
      if (arr.length > 11) {
         this.scoreId = Integer.parseInt(arr[11]);
      }

      if (arr.length > 12) {
         this.sellerName = arr[12];
      }

      if (arr.length > 13) {
         this.buyerName = arr[13];
      }

      if (arr.length > 14) {
         this.entryId = Integer.parseInt(arr[14]);
      }

      String[] propertyArr = split[1].split(",");

      for(String strProperty : propertyArr) {
         String[] cellProperty = strProperty.split("_");
         PropertyModel propertyModel = new PropertyModel(Integer.parseInt(cellProperty[0]), Integer.parseInt(cellProperty[1]), (long)Integer.parseInt(cellProperty[2]));
         this.attrMap.put(propertyModel.getType(), propertyModel);
      }

   }

   public String encode() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.code).append(",");
      sb.append(this.itemId).append(",");
      sb.append(this.priceType).append(",");
      sb.append(this.priceId).append(",");
      sb.append(this.oriPrice).append(",");
      sb.append(this.curPrice).append(",");
      sb.append(this.maxPrice).append(",");
      sb.append(this.dealTime).append(",");
      sb.append(this.seller).append(",");
      sb.append(this.buyer).append(",");
      sb.append(this.state).append(",");
      sb.append(this.scoreId).append(",");
      sb.append(this.sellerName).append(",");
      sb.append(this.buyerName).append(",");
      sb.append(this.entryId);
      sb.append("@");
      if (this.attrMap.size() > 0) {
         for(PropertyModel propertyModel : this.attrMap.values()) {
            sb.append(propertyModel.getType()).append("_").append(propertyModel.getWay()).append("_").append(propertyModel.getValue()).append(",");
         }

         sb.deleteCharAt(sb.length() - 1);
      }

      return sb.toString();
   }

   public void intt(MartMsg.Goods goods) {
      BagMsg.Item_Info itemInfo = goods.getItemInfo();
      this.code = itemInfo.getCode();
      this.itemId = itemInfo.getId();
      MartMsg.PRICE_INFO priceInfo = goods.getPriceInfo();
      this.priceType = priceInfo.getPriceType();
      this.priceId = priceInfo.getPriceId();
      this.oriPrice = priceInfo.getOriPrice();
      this.curPrice = priceInfo.getCurPrice();
      this.maxPrice = priceInfo.getMaxPrice();
      this.dealTime = goods.getDealTime();
      this.seller = goods.getSeller();
      this.buyer = goods.getBuyer();
      this.state = goods.getState().getNumber();
      this.scoreId = goods.getScoreId();
      this.sellerName = goods.getSellerName();
      this.buyerName = goods.getBuyerName();

      for(CommonMsg.PropertyInfo propertyInfo : itemInfo.getPropertiesList()) {
         PropertyModel propertyModel = new PropertyModel(propertyInfo.getId(), propertyInfo.getWay(), (long)((int)propertyInfo.getValue()));
         this.attrMap.put(propertyInfo.getId(), propertyModel);
      }

      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", this.itemId);
      if (itemModel.getSubclass() == 36) {
         this.entryId = itemInfo.getParamId();
      }

   }

   public MartMsg.Goods.Builder toGoodsBuilder() {
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", this.itemId);
      MartMsg.Goods.Builder builder = MartMsg.Goods.newBuilder();
      BagMsg.Item_Info.Builder itemInfoMsg = BagMsg.Item_Info.newBuilder();
      itemInfoMsg.setCode(this.code);
      itemInfoMsg.setId(this.itemId);
      itemInfoMsg.setNum(1);
      itemInfoMsg.setSubclass(itemModel.getSubclass());
      itemInfoMsg.setParamId(this.entryId);

      for(PropertyModel propertyModel : this.attrMap.values()) {
         CommonMsg.PropertyInfo.Builder propertyMsg = CommonMsg.PropertyInfo.newBuilder();
         propertyMsg.setId(propertyModel.getType());
         propertyMsg.setWay(propertyModel.getWay());
         propertyMsg.setValue((double)propertyModel.getValue());
         itemInfoMsg.addProperties(propertyMsg);
      }

      if (itemModel.getSubclass() == 36) {
         NeiDanItem neiDanItem = new NeiDanItem(this.itemId, 0, 0, this.entryId, new ArrayList(this.attrMap.values()));
         itemInfoMsg.setNeiDanInfo(neiDanItem.recNeiDanInfoBuilder());
      }

      builder.setItemInfo(itemInfoMsg);
      MartMsg.PRICE_INFO.Builder priceMsg = MartMsg.PRICE_INFO.newBuilder();
      priceMsg.setPriceType(this.priceType);
      priceMsg.setPriceId(this.priceId);
      priceMsg.setOriPrice(this.oriPrice);
      priceMsg.setCurPrice(this.curPrice);
      priceMsg.setMaxPrice(this.maxPrice);
      builder.setPriceInfo(priceMsg);
      builder.setState(MartMsg.GOODS_STATE.forNumber(this.state));
      builder.setSeller(this.seller);
      builder.setBuyer(this.buyer);
      builder.setDealTime(this.dealTime);
      builder.setEndTime(this.dealTime);
      builder.setScoreId(this.scoreId);
      builder.setSellerName(this.sellerName);
      builder.setBuyerName(this.buyerName);
      return builder;
   }
}
