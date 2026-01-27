package com.yy.db;

import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.mart.MartDefine;
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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_cross_mart",
   dbType = 2,
   resultType = 5,
   mapKey = {"code"}
)
public class CrossMartDao extends DBDao {
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
      comment = "当前价格"
   )
   public int curPrice;
   @DBColumnAnno(
      comment = "卖家"
   )
   public int seller;
   @DBColumnAnno(
      comment = "当前出价者"
   )
   public int buyer;
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
      comment = "卖家是否已领取"
   )
   public boolean isReceive;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "关注的玩家",
      loadFun = "loadCareSet",
      saveFun = "saveCareSet"
   )
   public Set<Integer> careSet = new HashSet();
   @DBColumnAnno(
      comment = "是否隐藏卖家"
   )
   public int hideSeller;
   @DBColumnAnno(
      comment = "是否隐藏买家"
   )
   public int hideBuyer;
   @DBColumnAnno(
      comment = "锁定时间"
   )
   public long lockTime;
   @DBColumnAnno(
      comment = "是否珍宝"
   )
   public boolean isSpecial = true;
   @DBColumnAnno(
      comment = "词条id"
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

   public void loadCareSet(String data) {
      this.careSet = DataUtils.stringToIntSet(data);
   }

   public String saveCareSet() {
      return DataUtils.intSetToString(this.careSet);
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
      priceInfoMsg.setCurPrice(this.curPrice);
      priceInfoMsg.setMaxPrice(this.maxPrice);
      builder.setPriceInfo(priceInfoMsg);
      builder.setState(MartMsg.GOODS_STATE.forNumber(this.state));
      builder.setStartTime(this.startTime);
      builder.setSeller(this.seller);
      builder.setEndTime(this.endTime);
      builder.setBuyer(this.buyer);
      builder.setScoreId(this.scoreId);
      if (MartDefine.isBestGoods(this.itemId, this.scoreId)) {
         builder.setIsSpecial(this.isSpecial);
      } else {
         builder.setIsSpecial(false);
      }

      return builder;
   }
}
