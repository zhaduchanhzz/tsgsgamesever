package com.yy.db;

import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MartMsg;
import com.gzbz.spring.ApplicationContextProvider;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_cross_mart_clone",
   dbType = 2,
   resultType = 5,
   mapKey = {"code"}
)
public class CrossMartCloneDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "序号"
   )
   public int code;
   @DBColumnAnno(
      comment = "物品id"
   )
   public int itemId;
   @DBColumnAnno(
      comment = "灵兽资质属性",
      loadFun = "loadAttrMap",
      saveFun = "saveAttrMap"
   )
   public Map<Integer, PropertyModel> attrMap = new HashMap();
   @DBColumnAnno(
      comment = "资质"
   )
   public int scoreId;
   @DBColumnAnno(
      comment = "货币类型"
   )
   public int priceType;
   @DBColumnAnno(
      comment = "货币id"
   )
   public int priceId;
   @DBColumnAnno(
      comment = "初始价"
   )
   public int oriPrice;
   @DBColumnAnno(
      comment = "一口价"
   )
   public int maxPrice;
   @DBColumnAnno(
      comment = "成交价格"
   )
   public int dealPrice;
   @DBColumnAnno(
      comment = "卖家id"
   )
   public int seller;
   @DBColumnAnno(
      comment = "卖家名字"
   )
   public String sellerName = "";
   @DBColumnAnno(
      comment = "是否隐藏卖家"
   )
   public int hideSeller;
   @DBColumnAnno(
      comment = "买家id"
   )
   public int buyer;
   @DBColumnAnno(
      comment = "买家名字"
   )
   public String buyerName = "";
   @DBColumnAnno(
      comment = "是否隐藏买家"
   )
   public int hideBuyer;
   @DBColumnAnno(
      comment = "物品状态"
   )
   public int state;
   @DBColumnAnno(
      comment = "上架时间"
   )
   public int startTime;
   @DBColumnAnno(
      comment = "结束时间"
   )
   public int endTime;
   @DBColumnAnno(
      comment = "成交时间"
   )
   public int dealTime;
   @DBColumnAnno(
      comment = "竞价过程",
      columnType = "LONGTEXT",
      loadFun = "loadDetailInfos",
      saveFun = "saveDetailInfos"
   )
   public List<String> detailInfos = new ArrayList();
   @DBColumnAnno(
      comment = "买家领取灵兽时间"
   )
   public int buyerReceiveTime;
   @DBColumnAnno(
      comment = "卖家领取星钻时间"
   )
   public int sellerReceiveTime;
   @DBColumnAnno(
      comment = "是否游戏服上传数据"
   )
   public boolean isFromGameServer;
   @DBColumnAnno(
      comment = "买家服务器"
   )
   public int buyerServerId;
   @DBColumnAnno(
      comment = "卖家服务器"
   )
   public int sellerServerId;
   @DBColumnAnno(
      comment = "内丹词条属性id"
   )
   public int entryId;

   public void loadAttrMap(String data) {
      if (!StringUtils.isEmpty(data)) {
         String[] split = data.split("\\|");

         for(String str : split) {
            String[] cell = str.split(",");
            PropertyModel pro = new PropertyModel(Integer.parseInt(cell[0]), Integer.parseInt(cell[1]), (long)Integer.parseInt(cell[2]));
            this.attrMap.put(pro.getType(), pro);
         }

      }
   }

   public String saveAttrMap() {
      if (this.attrMap.size() == 0) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(PropertyModel propertyModel : this.attrMap.values()) {
            stringBuilder.append(propertyModel.getType()).append(",").append(propertyModel.getWay()).append(",").append(propertyModel.getValue()).append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         return stringBuilder.toString();
      }
   }

   public void loadDetailInfos(String string) {
      String[] arr = string.split("\\|");

      for(String str : arr) {
         this.detailInfos.add(str);
      }

   }

   public String saveDetailInfos() {
      if (this.detailInfos.isEmpty()) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(String detailInfo : this.detailInfos) {
            stringBuilder.append(detailInfo).append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         return stringBuilder.toString();
      }
   }

   public MartMsg.Goods.Builder toBuilder() {
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
      MartMsg.PRICE_INFO.Builder priceInfoMsg = MartMsg.PRICE_INFO.newBuilder();
      priceInfoMsg.setPriceType(this.priceType);
      priceInfoMsg.setPriceId(this.priceId);
      priceInfoMsg.setOriPrice(this.oriPrice);
      int curPrice = this.state == 3 ? this.oriPrice : this.dealPrice;
      priceInfoMsg.setCurPrice(curPrice);
      priceInfoMsg.setMaxPrice(this.maxPrice);
      builder.setPriceInfo(priceInfoMsg);
      builder.setState(MartMsg.GOODS_STATE.forNumber(this.state));
      builder.setStartTime(this.startTime);
      builder.setEndTime(this.endTime);
      builder.setScoreId(this.scoreId);
      builder.setDealTime(this.dealTime);
      if (this.hideBuyer == 0) {
         builder.setBuyer(this.buyer);
         builder.setBuyerName(this.buyerName);
         builder.setBuyerServerId(this.buyerServerId);
      }

      if (this.hideSeller == 0) {
         builder.setSeller(this.seller);
         builder.setSellerName(this.sellerName);
         builder.setSellerServerId(this.sellerServerId);
      }

      return builder;
   }

   public MartMsg.Goods.Builder toBuilder(boolean deal) {
      MartMsg.Goods.Builder builder = this.toBuilder();
      if (deal) {
         builder.setEndTime(this.dealTime);
      }

      return builder;
   }

   public MartMsg.Goods.Builder toBuilder(boolean isShowBuyer, boolean isShowSeller) {
      MartMsg.Goods.Builder builder = this.toBuilder();
      if (isShowBuyer) {
         builder.setBuyer(this.buyer);
         builder.setBuyerName(this.buyerName);
         builder.setBuyerServerId(this.buyerServerId);
      }

      if (isShowSeller) {
         builder.setSeller(this.seller);
         builder.setSellerName(this.sellerName);
         builder.setSellerServerId(this.sellerServerId);
      }

      return builder;
   }
}
