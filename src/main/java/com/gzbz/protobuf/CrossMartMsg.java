package com.gzbz.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CrossMartMsg {
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossMartMsg() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite registry) {
   }

   public static void registerAllExtensions(ExtensionRegistry registry) {
      registerAllExtensions((ExtensionRegistryLite)registry);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] descriptorData = new String[]{"\n\u000fCrossMart.proto\u0012\u001bcrossMart.com.gzbz.protobuf\u001a\fcommon.proto\u001a\nMart.proto\u001a\tBag.proto\"k\n\u000fReturnPriceData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006itemId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tpriceType\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007priceId\u0018\u0004 \u0002(\u0005\u0012\u0012\n\npriceValue\u0018\u0005 \u0002(\u0005\"+\n\u0013S2CR_MartInfo_23301\u0012\u0014\n\faddGridIndex\u0018\u0001 \u0003(\u0005\"m\n\u0012S2CR_SellHit_23305\u0012\u0010\n\bitemCode\u0018\u0001 \u0002(\u0005\u0012\u0010\n\boriPrice\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bmaxPrice\u0018\u0003 \u0001(\u0005\u0012\u000b\n\u0003hie\u0018\u0004 \u0001(\u0005\u0012\u0014\n\ftotalGridNum\u0018\u0005 \u0002(\u0005\"W\n\u0012CR2S_SellHit_23306\u0012\u0010\n\bitemCode\u0018\u0001 \u0002(\u0005\u0012\u0010\n\boriPrice\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bmaxPrice\u0018\u0003 \u0001(\u0005\u0012\u000b\n\u0003hie\u0018\u0004 \u0001(\u0005\"w\n\u000fS2CR_Sell_23307\u00122\n\bitemInfo\u0018\u0001 \u0002(\u000b2 .bag.com.gzbz.protobuf.Item_Info\u0012\u0010\n\boriPrice\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bmaxPrice\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004hide\u0018\u0004 \u0001(\u0005\"L\n\u000eCR2S_Off_23310\u0012\f\n\u0004code\u0018\u0001 \u0003(\u0005\u0012,\n\u0005goods\u0018\u0002 \u0003(\u000b2\u001d.mart.com.gzbz.protobuf.Goods\"C\n\u0011S2CR_BuyHit_23311\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nofferPrice\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004hide\u0018\u0003 \u0001(\u0005\"d\n\u0011CR2S_BuyHit_23312\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012#\n\tpriceInfo\u0018\u0002 \u0002(\u000b2\u0010.common.ItemInfo\u0012\f\n\u0004hide\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006result\u0018\u0004 \u0002(\u0005\"F\n\u0014S2CR_BuySubmit_23313\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nofferPrice\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004hide\u0018\u0003 \u0001(\u0005\"q\n\u0017CR2S_ReceiveGoods_23318\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tpriceType\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007priceId\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005price\u0018\u0004 \u0002(\u0005\u0012\u0015\n\rserviceCharge\u0018\u0005 \u0002(\u0005\"D\n\u0014CR2S_ChangInfo_23320\u0012,\n\u0005goods\u0018\u0001 \u0003(\u000b2\u001d.mart.com.gzbz.protobuf.Goods\"\u0083\u0001\n\u0019S2CR_UploadOffGoods_23321\u00123\n\ftakeOffGoods\u0018\u0001 \u0003(\u000b2\u001d.mart.com.gzbz.protobuf.Goods\u00121\n\nunGetGoods\u0018\u0002 \u0003(\u000b2\u001d.mart.com.gzbz.protobuf.Goods\"U\n\u0017CR2S_ReturnPrices_23324\u0012:\n\u0004data\u0018\u0001 \u0003(\u000b2,.crossMart.com.gzbz.protobuf.ReturnPriceData\"M\n\u0015CR2S_NotifyDeal_23326\u0012\u000e\n\u0006itemId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005price\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rserviceCharge\u0018\u0003 \u0002(\u0005\"+\n\u001aCR2S_UpdateMartState_23328\u0012\r\n\u0005state\u0018\u0001 \u0002(\u0005\"E\n\u0015CR2S_UnGetGoods_23330\u0012,\n\u0005goods\u0018\u0001 \u0003(\u000b2\u001d.mart.com.gzbz.protobuf.Goods\"T\n\u0016CR2S_UnGetPrices_23332\u0012:\n\u0004data\u0018\u0001 \u0003(\u000b2,.crossMart.com.gzbz.protobuf.ReturnPriceData\"?\n\u000fCR2S_Deal_23334\u0012,\n\u0005goods\u0018\u0001 \u0002(\u000b2\u001d.mart.com.gzbz.protobuf.Goods\"o\n\u0010S2CR_Hatch_23336\u0012\u0011\n\thatchType\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eplayerHatchNum\u0018\u0002 \u0002(\u0003\u00120\n\u0015playerQualityHatchNum\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\"õ\u0001\n\u0010CR2S_Hatch_23337\u0012\u0011\n\thatchType\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngodBeastId\u0018\u0002 \u0002(\u0005\u0012\"\n\u0004attr\u0018\u0003 \u0003(\u000b2\u0014.common.PropertyInfo\u00120\n\u0015playerQualityHatchNum\u0018\u0004 \u0003(\u000b2\u0011.common.MapDataII\u0012/\n\u0014worldQualityHatchNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u00123\n\u0018worldQualityTriggerTimes\u0018\u0006 \u0003(\u000b2\u0011.common.MapDataII\"\u009c\u0001\n\u0015S2CR_BatchHatch_23338\u0012\u0011\n\thatchType\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eplayerHatchNum\u0018\u0002 \u0002(\u0003\u00120\n\u0015playerQualityHatchNum\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0012\n\nhatchCount\u0018\u0004 \u0002(\u0005\u0012\u0012\n\nisPointLog\u0018\u0005 \u0002(\b\"â\u0002\n\u0015CR2S_BatchHatch_23339\u0012\u0011\n\thatchType\u0018\u0001 \u0002(\u0005\u0012I\n\u0011godBeastHatchData\u0018\u0002 \u0003(\u000b2..crossMart.com.gzbz.protobuf.GodBeastHatchData\u00120\n\u0015playerQualityHatchNum\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\u0012/\n\u0014worldQualityHatchNum\u0018\u0004 \u0003(\u000b2\u0011.common.MapDataII\u00123\n\u0018worldQualityTriggerTimes\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0016\n\u000erealHatchCount\u0018\u0006 \u0002(\u0005\u0012'\n\fqualityCount\u0018\u0007 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0012\n\nisPointLog\u0018\b \u0002(\b\"K\n\u0011GodBeastHatchData\u0012\u0012\n\ngodBeastId\u0018\u0001 \u0002(\u0005\u0012\"\n\u0004attr\u0018\u0002 \u0003(\u000b2\u0014.common.PropertyInfo\"\u001f\n\rS2CR_GM_23381\u0012\u000e\n\u0006string\u0018\u0001 \u0002(\tB#\n\u0011com.gzbz.protobufB\fCrossMartMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), MartMsg.getDescriptor(), BagMsg.getDescriptor()});
      internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_descriptor, new String[]{"PlayerId", "ItemId", "PriceType", "PriceId", "PriceValue"});
      internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_descriptor, new String[]{"AddGridIndex"});
      internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_descriptor, new String[]{"ItemCode", "OriPrice", "MaxPrice", "Hie", "TotalGridNum"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_descriptor, new String[]{"ItemCode", "OriPrice", "MaxPrice", "Hie"});
      internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_descriptor, new String[]{"ItemInfo", "OriPrice", "MaxPrice", "Hide"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_descriptor, new String[]{"Code", "Goods"});
      internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_descriptor, new String[]{"Code", "OfferPrice", "Hide"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_descriptor, new String[]{"Code", "PriceInfo", "Hide", "Result"});
      internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_descriptor, new String[]{"Code", "OfferPrice", "Hide"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_descriptor, new String[]{"Code", "PriceType", "PriceId", "Price", "ServiceCharge"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_descriptor, new String[]{"Goods"});
      internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_descriptor, new String[]{"TakeOffGoods", "UnGetGoods"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_descriptor, new String[]{"Data"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_descriptor, new String[]{"ItemId", "Price", "ServiceCharge"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_descriptor, new String[]{"State"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_descriptor, new String[]{"Goods"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_descriptor, new String[]{"Data"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_descriptor, new String[]{"Goods"});
      internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_descriptor, new String[]{"HatchType", "PlayerHatchNum", "PlayerQualityHatchNum"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_descriptor, new String[]{"HatchType", "GodBeastId", "Attr", "PlayerQualityHatchNum", "WorldQualityHatchNum", "WorldQualityTriggerTimes"});
      internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_descriptor, new String[]{"HatchType", "PlayerHatchNum", "PlayerQualityHatchNum", "HatchCount", "IsPointLog"});
      internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_descriptor, new String[]{"HatchType", "GodBeastHatchData", "PlayerQualityHatchNum", "WorldQualityHatchNum", "WorldQualityTriggerTimes", "RealHatchCount", "QualityCount", "IsPointLog"});
      internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_descriptor, new String[]{"GodBeastId", "Attr"});
      internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_descriptor, new String[]{"String"});
      CommonMsg.getDescriptor();
      MartMsg.getDescriptor();
      BagMsg.getDescriptor();
   }

   public static final class ReturnPriceData extends GeneratedMessageV3 implements ReturnPriceDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int ITEMID_FIELD_NUMBER = 2;
      private int itemId_;
      public static final int PRICETYPE_FIELD_NUMBER = 3;
      private int priceType_;
      public static final int PRICEID_FIELD_NUMBER = 4;
      private int priceId_;
      public static final int PRICEVALUE_FIELD_NUMBER = 5;
      private int priceValue_;
      private byte memoizedIsInitialized;
      private static final ReturnPriceData DEFAULT_INSTANCE = new ReturnPriceData();
      /** @deprecated */
      @Deprecated
      public static final Parser<ReturnPriceData> PARSER = new AbstractParser<ReturnPriceData>() {
         public ReturnPriceData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ReturnPriceData(input, extensionRegistry);
         }
      };

      private ReturnPriceData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ReturnPriceData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ReturnPriceData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ReturnPriceData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.playerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.priceType_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.priceId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.priceValue_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_fieldAccessorTable.ensureFieldAccessorsInitialized(ReturnPriceData.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public boolean hasPriceType() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPriceType() {
         return this.priceType_;
      }

      public boolean hasPriceId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPriceId() {
         return this.priceId_;
      }

      public boolean hasPriceValue() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getPriceValue() {
         return this.priceValue_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPriceType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPriceId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPriceValue()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.priceType_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.priceId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.priceValue_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.playerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.priceType_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.priceId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.priceValue_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ReturnPriceData)) {
            return super.equals(obj);
         } else {
            ReturnPriceData other = (ReturnPriceData)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
               return false;
            } else if (this.hasPriceType() != other.hasPriceType()) {
               return false;
            } else if (this.hasPriceType() && this.getPriceType() != other.getPriceType()) {
               return false;
            } else if (this.hasPriceId() != other.hasPriceId()) {
               return false;
            } else if (this.hasPriceId() && this.getPriceId() != other.getPriceId()) {
               return false;
            } else if (this.hasPriceValue() != other.hasPriceValue()) {
               return false;
            } else if (this.hasPriceValue() && this.getPriceValue() != other.getPriceValue()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemId();
            }

            if (this.hasPriceType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPriceType();
            }

            if (this.hasPriceId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPriceId();
            }

            if (this.hasPriceValue()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPriceValue();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ReturnPriceData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ReturnPriceData)PARSER.parseFrom(data);
      }

      public static ReturnPriceData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ReturnPriceData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ReturnPriceData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ReturnPriceData)PARSER.parseFrom(data);
      }

      public static ReturnPriceData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ReturnPriceData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ReturnPriceData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ReturnPriceData)PARSER.parseFrom(data);
      }

      public static ReturnPriceData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ReturnPriceData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ReturnPriceData parseFrom(InputStream input) throws IOException {
         return (ReturnPriceData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ReturnPriceData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ReturnPriceData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ReturnPriceData parseDelimitedFrom(InputStream input) throws IOException {
         return (ReturnPriceData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ReturnPriceData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ReturnPriceData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ReturnPriceData parseFrom(CodedInputStream input) throws IOException {
         return (ReturnPriceData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ReturnPriceData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ReturnPriceData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ReturnPriceData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ReturnPriceData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ReturnPriceData> parser() {
         return PARSER;
      }

      public Parser<ReturnPriceData> getParserForType() {
         return PARSER;
      }

      public ReturnPriceData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReturnPriceDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private int itemId_;
         private int priceType_;
         private int priceId_;
         private int priceValue_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_fieldAccessorTable.ensureFieldAccessorsInitialized(ReturnPriceData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.ReturnPriceData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.itemId_ = 0;
            this.bitField0_ &= -3;
            this.priceType_ = 0;
            this.bitField0_ &= -5;
            this.priceId_ = 0;
            this.bitField0_ &= -9;
            this.priceValue_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_ReturnPriceData_descriptor;
         }

         public ReturnPriceData getDefaultInstanceForType() {
            return CrossMartMsg.ReturnPriceData.getDefaultInstance();
         }

         public ReturnPriceData build() {
            ReturnPriceData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ReturnPriceData buildPartial() {
            ReturnPriceData result = new ReturnPriceData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemId_ = this.itemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.priceType_ = this.priceType_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.priceId_ = this.priceId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.priceValue_ = this.priceValue_;
               to_bitField0_ |= 16;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof ReturnPriceData) {
               return this.mergeFrom((ReturnPriceData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ReturnPriceData other) {
            if (other == CrossMartMsg.ReturnPriceData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               if (other.hasPriceType()) {
                  this.setPriceType(other.getPriceType());
               }

               if (other.hasPriceId()) {
                  this.setPriceId(other.getPriceId());
               }

               if (other.hasPriceValue()) {
                  this.setPriceValue(other.getPriceValue());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasItemId()) {
               return false;
            } else if (!this.hasPriceType()) {
               return false;
            } else if (!this.hasPriceId()) {
               return false;
            } else {
               return this.hasPriceValue();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ReturnPriceData parsedMessage = null;

            try {
               parsedMessage = (ReturnPriceData)CrossMartMsg.ReturnPriceData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ReturnPriceData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 1;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 2;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -3;
            this.itemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPriceType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPriceType() {
            return this.priceType_;
         }

         public Builder setPriceType(int value) {
            this.bitField0_ |= 4;
            this.priceType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPriceType() {
            this.bitField0_ &= -5;
            this.priceType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPriceId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPriceId() {
            return this.priceId_;
         }

         public Builder setPriceId(int value) {
            this.bitField0_ |= 8;
            this.priceId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPriceId() {
            this.bitField0_ &= -9;
            this.priceId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPriceValue() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getPriceValue() {
            return this.priceValue_;
         }

         public Builder setPriceValue(int value) {
            this.bitField0_ |= 16;
            this.priceValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPriceValue() {
            this.bitField0_ &= -17;
            this.priceValue_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_MartInfo_23301 extends GeneratedMessageV3 implements S2CR_MartInfo_23301OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ADDGRIDINDEX_FIELD_NUMBER = 1;
      private Internal.IntList addGridIndex_;
      private byte memoizedIsInitialized;
      private static final S2CR_MartInfo_23301 DEFAULT_INSTANCE = new S2CR_MartInfo_23301();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MartInfo_23301> PARSER = new AbstractParser<S2CR_MartInfo_23301>() {
         public S2CR_MartInfo_23301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MartInfo_23301(input, extensionRegistry);
         }
      };

      private S2CR_MartInfo_23301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MartInfo_23301() {
         this.memoizedIsInitialized = -1;
         this.addGridIndex_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MartInfo_23301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MartInfo_23301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.addGridIndex_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.addGridIndex_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.addGridIndex_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.addGridIndex_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.addGridIndex_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MartInfo_23301.class, Builder.class);
      }

      public List<Integer> getAddGridIndexList() {
         return this.addGridIndex_;
      }

      public int getAddGridIndexCount() {
         return this.addGridIndex_.size();
      }

      public int getAddGridIndex(int index) {
         return this.addGridIndex_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.addGridIndex_.size(); ++i) {
            output.writeInt32(1, this.addGridIndex_.getInt(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            int dataSize = 0;

            for(int i = 0; i < this.addGridIndex_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.addGridIndex_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getAddGridIndexList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MartInfo_23301)) {
            return super.equals(obj);
         } else {
            S2CR_MartInfo_23301 other = (S2CR_MartInfo_23301)obj;
            if (!this.getAddGridIndexList().equals(other.getAddGridIndexList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getAddGridIndexCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAddGridIndexList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MartInfo_23301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MartInfo_23301)PARSER.parseFrom(data);
      }

      public static S2CR_MartInfo_23301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MartInfo_23301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MartInfo_23301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MartInfo_23301)PARSER.parseFrom(data);
      }

      public static S2CR_MartInfo_23301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MartInfo_23301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MartInfo_23301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MartInfo_23301)PARSER.parseFrom(data);
      }

      public static S2CR_MartInfo_23301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MartInfo_23301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MartInfo_23301 parseFrom(InputStream input) throws IOException {
         return (S2CR_MartInfo_23301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MartInfo_23301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MartInfo_23301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MartInfo_23301 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MartInfo_23301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MartInfo_23301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MartInfo_23301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MartInfo_23301 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MartInfo_23301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MartInfo_23301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MartInfo_23301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MartInfo_23301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MartInfo_23301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MartInfo_23301> parser() {
         return PARSER;
      }

      public Parser<S2CR_MartInfo_23301> getParserForType() {
         return PARSER;
      }

      public S2CR_MartInfo_23301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MartInfo_23301OrBuilder {
         private int bitField0_;
         private Internal.IntList addGridIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MartInfo_23301.class, Builder.class);
         }

         private Builder() {
            this.addGridIndex_ = CrossMartMsg.S2CR_MartInfo_23301.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.addGridIndex_ = CrossMartMsg.S2CR_MartInfo_23301.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.S2CR_MartInfo_23301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.addGridIndex_ = CrossMartMsg.S2CR_MartInfo_23301.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_MartInfo_23301_descriptor;
         }

         public S2CR_MartInfo_23301 getDefaultInstanceForType() {
            return CrossMartMsg.S2CR_MartInfo_23301.getDefaultInstance();
         }

         public S2CR_MartInfo_23301 build() {
            S2CR_MartInfo_23301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MartInfo_23301 buildPartial() {
            S2CR_MartInfo_23301 result = new S2CR_MartInfo_23301(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.addGridIndex_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.addGridIndex_ = this.addGridIndex_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_MartInfo_23301) {
               return this.mergeFrom((S2CR_MartInfo_23301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MartInfo_23301 other) {
            if (other == CrossMartMsg.S2CR_MartInfo_23301.getDefaultInstance()) {
               return this;
            } else {
               if (!other.addGridIndex_.isEmpty()) {
                  if (this.addGridIndex_.isEmpty()) {
                     this.addGridIndex_ = other.addGridIndex_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureAddGridIndexIsMutable();
                     this.addGridIndex_.addAll(other.addGridIndex_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_MartInfo_23301 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MartInfo_23301)CrossMartMsg.S2CR_MartInfo_23301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MartInfo_23301)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureAddGridIndexIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.addGridIndex_ = CrossMartMsg.S2CR_MartInfo_23301.mutableCopy(this.addGridIndex_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getAddGridIndexList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.addGridIndex_) : this.addGridIndex_);
         }

         public int getAddGridIndexCount() {
            return this.addGridIndex_.size();
         }

         public int getAddGridIndex(int index) {
            return this.addGridIndex_.getInt(index);
         }

         public Builder setAddGridIndex(int index, int value) {
            this.ensureAddGridIndexIsMutable();
            this.addGridIndex_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addAddGridIndex(int value) {
            this.ensureAddGridIndexIsMutable();
            this.addGridIndex_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllAddGridIndex(Iterable<? extends Integer> values) {
            this.ensureAddGridIndexIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.addGridIndex_);
            this.onChanged();
            return this;
         }

         public Builder clearAddGridIndex() {
            this.addGridIndex_ = CrossMartMsg.S2CR_MartInfo_23301.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_SellHit_23305 extends GeneratedMessageV3 implements S2CR_SellHit_23305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private int itemCode_;
      public static final int ORIPRICE_FIELD_NUMBER = 2;
      private int oriPrice_;
      public static final int MAXPRICE_FIELD_NUMBER = 3;
      private int maxPrice_;
      public static final int HIE_FIELD_NUMBER = 4;
      private int hie_;
      public static final int TOTALGRIDNUM_FIELD_NUMBER = 5;
      private int totalGridNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_SellHit_23305 DEFAULT_INSTANCE = new S2CR_SellHit_23305();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SellHit_23305> PARSER = new AbstractParser<S2CR_SellHit_23305>() {
         public S2CR_SellHit_23305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SellHit_23305(input, extensionRegistry);
         }
      };

      private S2CR_SellHit_23305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SellHit_23305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SellHit_23305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SellHit_23305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.oriPrice_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.maxPrice_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.hie_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.totalGridNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SellHit_23305.class, Builder.class);
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasOriPrice() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOriPrice() {
         return this.oriPrice_;
      }

      public boolean hasMaxPrice() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMaxPrice() {
         return this.maxPrice_;
      }

      public boolean hasHie() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHie() {
         return this.hie_;
      }

      public boolean hasTotalGridNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getTotalGridNum() {
         return this.totalGridNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOriPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalGridNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.oriPrice_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.maxPrice_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.hie_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.totalGridNum_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.itemCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.oriPrice_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.maxPrice_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.hie_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.totalGridNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_SellHit_23305)) {
            return super.equals(obj);
         } else {
            S2CR_SellHit_23305 other = (S2CR_SellHit_23305)obj;
            if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasOriPrice() != other.hasOriPrice()) {
               return false;
            } else if (this.hasOriPrice() && this.getOriPrice() != other.getOriPrice()) {
               return false;
            } else if (this.hasMaxPrice() != other.hasMaxPrice()) {
               return false;
            } else if (this.hasMaxPrice() && this.getMaxPrice() != other.getMaxPrice()) {
               return false;
            } else if (this.hasHie() != other.hasHie()) {
               return false;
            } else if (this.hasHie() && this.getHie() != other.getHie()) {
               return false;
            } else if (this.hasTotalGridNum() != other.hasTotalGridNum()) {
               return false;
            } else if (this.hasTotalGridNum() && this.getTotalGridNum() != other.getTotalGridNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasItemCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasOriPrice()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOriPrice();
            }

            if (this.hasMaxPrice()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMaxPrice();
            }

            if (this.hasHie()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHie();
            }

            if (this.hasTotalGridNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTotalGridNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_SellHit_23305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SellHit_23305)PARSER.parseFrom(data);
      }

      public static S2CR_SellHit_23305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SellHit_23305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SellHit_23305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SellHit_23305)PARSER.parseFrom(data);
      }

      public static S2CR_SellHit_23305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SellHit_23305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SellHit_23305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SellHit_23305)PARSER.parseFrom(data);
      }

      public static S2CR_SellHit_23305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SellHit_23305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SellHit_23305 parseFrom(InputStream input) throws IOException {
         return (S2CR_SellHit_23305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SellHit_23305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SellHit_23305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SellHit_23305 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SellHit_23305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SellHit_23305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SellHit_23305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SellHit_23305 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SellHit_23305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SellHit_23305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SellHit_23305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SellHit_23305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SellHit_23305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SellHit_23305> parser() {
         return PARSER;
      }

      public Parser<S2CR_SellHit_23305> getParserForType() {
         return PARSER;
      }

      public S2CR_SellHit_23305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SellHit_23305OrBuilder {
         private int bitField0_;
         private int itemCode_;
         private int oriPrice_;
         private int maxPrice_;
         private int hie_;
         private int totalGridNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SellHit_23305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.S2CR_SellHit_23305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = 0;
            this.bitField0_ &= -2;
            this.oriPrice_ = 0;
            this.bitField0_ &= -3;
            this.maxPrice_ = 0;
            this.bitField0_ &= -5;
            this.hie_ = 0;
            this.bitField0_ &= -9;
            this.totalGridNum_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_SellHit_23305_descriptor;
         }

         public S2CR_SellHit_23305 getDefaultInstanceForType() {
            return CrossMartMsg.S2CR_SellHit_23305.getDefaultInstance();
         }

         public S2CR_SellHit_23305 build() {
            S2CR_SellHit_23305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SellHit_23305 buildPartial() {
            S2CR_SellHit_23305 result = new S2CR_SellHit_23305(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.oriPrice_ = this.oriPrice_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.maxPrice_ = this.maxPrice_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.hie_ = this.hie_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.totalGridNum_ = this.totalGridNum_;
               to_bitField0_ |= 16;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_SellHit_23305) {
               return this.mergeFrom((S2CR_SellHit_23305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SellHit_23305 other) {
            if (other == CrossMartMsg.S2CR_SellHit_23305.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasOriPrice()) {
                  this.setOriPrice(other.getOriPrice());
               }

               if (other.hasMaxPrice()) {
                  this.setMaxPrice(other.getMaxPrice());
               }

               if (other.hasHie()) {
                  this.setHie(other.getHie());
               }

               if (other.hasTotalGridNum()) {
                  this.setTotalGridNum(other.getTotalGridNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemCode()) {
               return false;
            } else if (!this.hasOriPrice()) {
               return false;
            } else {
               return this.hasTotalGridNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_SellHit_23305 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SellHit_23305)CrossMartMsg.S2CR_SellHit_23305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SellHit_23305)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 1;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOriPrice() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOriPrice() {
            return this.oriPrice_;
         }

         public Builder setOriPrice(int value) {
            this.bitField0_ |= 2;
            this.oriPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriPrice() {
            this.bitField0_ &= -3;
            this.oriPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMaxPrice() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMaxPrice() {
            return this.maxPrice_;
         }

         public Builder setMaxPrice(int value) {
            this.bitField0_ |= 4;
            this.maxPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxPrice() {
            this.bitField0_ &= -5;
            this.maxPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHie() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHie() {
            return this.hie_;
         }

         public Builder setHie(int value) {
            this.bitField0_ |= 8;
            this.hie_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHie() {
            this.bitField0_ &= -9;
            this.hie_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTotalGridNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTotalGridNum() {
            return this.totalGridNum_;
         }

         public Builder setTotalGridNum(int value) {
            this.bitField0_ |= 16;
            this.totalGridNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalGridNum() {
            this.bitField0_ &= -17;
            this.totalGridNum_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_SellHit_23306 extends GeneratedMessageV3 implements CR2S_SellHit_23306OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private int itemCode_;
      public static final int ORIPRICE_FIELD_NUMBER = 2;
      private int oriPrice_;
      public static final int MAXPRICE_FIELD_NUMBER = 3;
      private int maxPrice_;
      public static final int HIE_FIELD_NUMBER = 4;
      private int hie_;
      private byte memoizedIsInitialized;
      private static final CR2S_SellHit_23306 DEFAULT_INSTANCE = new CR2S_SellHit_23306();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_SellHit_23306> PARSER = new AbstractParser<CR2S_SellHit_23306>() {
         public CR2S_SellHit_23306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_SellHit_23306(input, extensionRegistry);
         }
      };

      private CR2S_SellHit_23306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_SellHit_23306() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_SellHit_23306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_SellHit_23306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.oriPrice_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.maxPrice_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.hie_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SellHit_23306.class, Builder.class);
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasOriPrice() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOriPrice() {
         return this.oriPrice_;
      }

      public boolean hasMaxPrice() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMaxPrice() {
         return this.maxPrice_;
      }

      public boolean hasHie() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHie() {
         return this.hie_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOriPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.oriPrice_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.maxPrice_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.hie_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.itemCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.oriPrice_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.maxPrice_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.hie_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_SellHit_23306)) {
            return super.equals(obj);
         } else {
            CR2S_SellHit_23306 other = (CR2S_SellHit_23306)obj;
            if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasOriPrice() != other.hasOriPrice()) {
               return false;
            } else if (this.hasOriPrice() && this.getOriPrice() != other.getOriPrice()) {
               return false;
            } else if (this.hasMaxPrice() != other.hasMaxPrice()) {
               return false;
            } else if (this.hasMaxPrice() && this.getMaxPrice() != other.getMaxPrice()) {
               return false;
            } else if (this.hasHie() != other.hasHie()) {
               return false;
            } else if (this.hasHie() && this.getHie() != other.getHie()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasItemCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasOriPrice()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOriPrice();
            }

            if (this.hasMaxPrice()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMaxPrice();
            }

            if (this.hasHie()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHie();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_SellHit_23306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_SellHit_23306)PARSER.parseFrom(data);
      }

      public static CR2S_SellHit_23306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SellHit_23306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SellHit_23306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_SellHit_23306)PARSER.parseFrom(data);
      }

      public static CR2S_SellHit_23306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SellHit_23306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SellHit_23306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_SellHit_23306)PARSER.parseFrom(data);
      }

      public static CR2S_SellHit_23306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SellHit_23306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SellHit_23306 parseFrom(InputStream input) throws IOException {
         return (CR2S_SellHit_23306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SellHit_23306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SellHit_23306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SellHit_23306 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_SellHit_23306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_SellHit_23306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SellHit_23306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SellHit_23306 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_SellHit_23306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SellHit_23306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SellHit_23306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_SellHit_23306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_SellHit_23306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_SellHit_23306> parser() {
         return PARSER;
      }

      public Parser<CR2S_SellHit_23306> getParserForType() {
         return PARSER;
      }

      public CR2S_SellHit_23306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_SellHit_23306OrBuilder {
         private int bitField0_;
         private int itemCode_;
         private int oriPrice_;
         private int maxPrice_;
         private int hie_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SellHit_23306.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_SellHit_23306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = 0;
            this.bitField0_ &= -2;
            this.oriPrice_ = 0;
            this.bitField0_ &= -3;
            this.maxPrice_ = 0;
            this.bitField0_ &= -5;
            this.hie_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_SellHit_23306_descriptor;
         }

         public CR2S_SellHit_23306 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_SellHit_23306.getDefaultInstance();
         }

         public CR2S_SellHit_23306 build() {
            CR2S_SellHit_23306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_SellHit_23306 buildPartial() {
            CR2S_SellHit_23306 result = new CR2S_SellHit_23306(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.oriPrice_ = this.oriPrice_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.maxPrice_ = this.maxPrice_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.hie_ = this.hie_;
               to_bitField0_ |= 8;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_SellHit_23306) {
               return this.mergeFrom((CR2S_SellHit_23306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_SellHit_23306 other) {
            if (other == CrossMartMsg.CR2S_SellHit_23306.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasOriPrice()) {
                  this.setOriPrice(other.getOriPrice());
               }

               if (other.hasMaxPrice()) {
                  this.setMaxPrice(other.getMaxPrice());
               }

               if (other.hasHie()) {
                  this.setHie(other.getHie());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemCode()) {
               return false;
            } else {
               return this.hasOriPrice();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_SellHit_23306 parsedMessage = null;

            try {
               parsedMessage = (CR2S_SellHit_23306)CrossMartMsg.CR2S_SellHit_23306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_SellHit_23306)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 1;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOriPrice() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOriPrice() {
            return this.oriPrice_;
         }

         public Builder setOriPrice(int value) {
            this.bitField0_ |= 2;
            this.oriPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriPrice() {
            this.bitField0_ &= -3;
            this.oriPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMaxPrice() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMaxPrice() {
            return this.maxPrice_;
         }

         public Builder setMaxPrice(int value) {
            this.bitField0_ |= 4;
            this.maxPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxPrice() {
            this.bitField0_ &= -5;
            this.maxPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHie() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHie() {
            return this.hie_;
         }

         public Builder setHie(int value) {
            this.bitField0_ |= 8;
            this.hie_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHie() {
            this.bitField0_ &= -9;
            this.hie_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_Sell_23307 extends GeneratedMessageV3 implements S2CR_Sell_23307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMINFO_FIELD_NUMBER = 1;
      private BagMsg.Item_Info itemInfo_;
      public static final int ORIPRICE_FIELD_NUMBER = 2;
      private int oriPrice_;
      public static final int MAXPRICE_FIELD_NUMBER = 3;
      private int maxPrice_;
      public static final int HIDE_FIELD_NUMBER = 4;
      private int hide_;
      private byte memoizedIsInitialized;
      private static final S2CR_Sell_23307 DEFAULT_INSTANCE = new S2CR_Sell_23307();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Sell_23307> PARSER = new AbstractParser<S2CR_Sell_23307>() {
         public S2CR_Sell_23307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Sell_23307(input, extensionRegistry);
         }
      };

      private S2CR_Sell_23307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Sell_23307() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Sell_23307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Sell_23307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        BagMsg.Item_Info.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.itemInfo_.toBuilder();
                        }

                        this.itemInfo_ = (BagMsg.Item_Info)input.readMessage(BagMsg.Item_Info.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.itemInfo_);
                           this.itemInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.oriPrice_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.maxPrice_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.hide_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Sell_23307.class, Builder.class);
      }

      public boolean hasItemInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public BagMsg.Item_Info getItemInfo() {
         return this.itemInfo_ == null ? BagMsg.Item_Info.getDefaultInstance() : this.itemInfo_;
      }

      public BagMsg.Item_InfoOrBuilder getItemInfoOrBuilder() {
         return this.itemInfo_ == null ? BagMsg.Item_Info.getDefaultInstance() : this.itemInfo_;
      }

      public boolean hasOriPrice() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOriPrice() {
         return this.oriPrice_;
      }

      public boolean hasMaxPrice() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMaxPrice() {
         return this.maxPrice_;
      }

      public boolean hasHide() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHide() {
         return this.hide_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOriPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getItemInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getItemInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.oriPrice_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.maxPrice_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.hide_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(1, this.getItemInfo());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.oriPrice_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.maxPrice_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.hide_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Sell_23307)) {
            return super.equals(obj);
         } else {
            S2CR_Sell_23307 other = (S2CR_Sell_23307)obj;
            if (this.hasItemInfo() != other.hasItemInfo()) {
               return false;
            } else if (this.hasItemInfo() && !this.getItemInfo().equals(other.getItemInfo())) {
               return false;
            } else if (this.hasOriPrice() != other.hasOriPrice()) {
               return false;
            } else if (this.hasOriPrice() && this.getOriPrice() != other.getOriPrice()) {
               return false;
            } else if (this.hasMaxPrice() != other.hasMaxPrice()) {
               return false;
            } else if (this.hasMaxPrice() && this.getMaxPrice() != other.getMaxPrice()) {
               return false;
            } else if (this.hasHide() != other.hasHide()) {
               return false;
            } else if (this.hasHide() && this.getHide() != other.getHide()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasItemInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemInfo().hashCode();
            }

            if (this.hasOriPrice()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOriPrice();
            }

            if (this.hasMaxPrice()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMaxPrice();
            }

            if (this.hasHide()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHide();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Sell_23307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Sell_23307)PARSER.parseFrom(data);
      }

      public static S2CR_Sell_23307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Sell_23307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Sell_23307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Sell_23307)PARSER.parseFrom(data);
      }

      public static S2CR_Sell_23307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Sell_23307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Sell_23307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Sell_23307)PARSER.parseFrom(data);
      }

      public static S2CR_Sell_23307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Sell_23307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Sell_23307 parseFrom(InputStream input) throws IOException {
         return (S2CR_Sell_23307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Sell_23307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Sell_23307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Sell_23307 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Sell_23307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Sell_23307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Sell_23307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Sell_23307 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Sell_23307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Sell_23307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Sell_23307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Sell_23307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Sell_23307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Sell_23307> parser() {
         return PARSER;
      }

      public Parser<S2CR_Sell_23307> getParserForType() {
         return PARSER;
      }

      public S2CR_Sell_23307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Sell_23307OrBuilder {
         private int bitField0_;
         private BagMsg.Item_Info itemInfo_;
         private SingleFieldBuilderV3<BagMsg.Item_Info, BagMsg.Item_Info.Builder, BagMsg.Item_InfoOrBuilder> itemInfoBuilder_;
         private int oriPrice_;
         private int maxPrice_;
         private int hide_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Sell_23307.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.S2CR_Sell_23307.alwaysUseFieldBuilders) {
               this.getItemInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = null;
            } else {
               this.itemInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.oriPrice_ = 0;
            this.bitField0_ &= -3;
            this.maxPrice_ = 0;
            this.bitField0_ &= -5;
            this.hide_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Sell_23307_descriptor;
         }

         public S2CR_Sell_23307 getDefaultInstanceForType() {
            return CrossMartMsg.S2CR_Sell_23307.getDefaultInstance();
         }

         public S2CR_Sell_23307 build() {
            S2CR_Sell_23307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Sell_23307 buildPartial() {
            S2CR_Sell_23307 result = new S2CR_Sell_23307(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.itemInfoBuilder_ == null) {
                  result.itemInfo_ = this.itemInfo_;
               } else {
                  result.itemInfo_ = (BagMsg.Item_Info)this.itemInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.oriPrice_ = this.oriPrice_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.maxPrice_ = this.maxPrice_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.hide_ = this.hide_;
               to_bitField0_ |= 8;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_Sell_23307) {
               return this.mergeFrom((S2CR_Sell_23307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Sell_23307 other) {
            if (other == CrossMartMsg.S2CR_Sell_23307.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemInfo()) {
                  this.mergeItemInfo(other.getItemInfo());
               }

               if (other.hasOriPrice()) {
                  this.setOriPrice(other.getOriPrice());
               }

               if (other.hasMaxPrice()) {
                  this.setMaxPrice(other.getMaxPrice());
               }

               if (other.hasHide()) {
                  this.setHide(other.getHide());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemInfo()) {
               return false;
            } else if (!this.hasOriPrice()) {
               return false;
            } else {
               return this.getItemInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Sell_23307 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Sell_23307)CrossMartMsg.S2CR_Sell_23307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Sell_23307)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public BagMsg.Item_Info getItemInfo() {
            if (this.itemInfoBuilder_ == null) {
               return this.itemInfo_ == null ? BagMsg.Item_Info.getDefaultInstance() : this.itemInfo_;
            } else {
               return (BagMsg.Item_Info)this.itemInfoBuilder_.getMessage();
            }
         }

         public Builder setItemInfo(BagMsg.Item_Info value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.itemInfo_ = value;
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setItemInfo(BagMsg.Item_Info.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeItemInfo(BagMsg.Item_Info value) {
            if (this.itemInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.itemInfo_ != null && this.itemInfo_ != BagMsg.Item_Info.getDefaultInstance()) {
                  this.itemInfo_ = BagMsg.Item_Info.newBuilder(this.itemInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.itemInfo_ = value;
               }

               this.onChanged();
            } else {
               this.itemInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearItemInfo() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = null;
               this.onChanged();
            } else {
               this.itemInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public BagMsg.Item_Info.Builder getItemInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (BagMsg.Item_Info.Builder)this.getItemInfoFieldBuilder().getBuilder();
         }

         public BagMsg.Item_InfoOrBuilder getItemInfoOrBuilder() {
            if (this.itemInfoBuilder_ != null) {
               return (BagMsg.Item_InfoOrBuilder)this.itemInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.itemInfo_ == null ? BagMsg.Item_Info.getDefaultInstance() : this.itemInfo_;
            }
         }

         private SingleFieldBuilderV3<BagMsg.Item_Info, BagMsg.Item_Info.Builder, BagMsg.Item_InfoOrBuilder> getItemInfoFieldBuilder() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfoBuilder_ = new SingleFieldBuilderV3(this.getItemInfo(), this.getParentForChildren(), this.isClean());
               this.itemInfo_ = null;
            }

            return this.itemInfoBuilder_;
         }

         public boolean hasOriPrice() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOriPrice() {
            return this.oriPrice_;
         }

         public Builder setOriPrice(int value) {
            this.bitField0_ |= 2;
            this.oriPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOriPrice() {
            this.bitField0_ &= -3;
            this.oriPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMaxPrice() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMaxPrice() {
            return this.maxPrice_;
         }

         public Builder setMaxPrice(int value) {
            this.bitField0_ |= 4;
            this.maxPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxPrice() {
            this.bitField0_ &= -5;
            this.maxPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHide() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHide() {
            return this.hide_;
         }

         public Builder setHide(int value) {
            this.bitField0_ |= 8;
            this.hide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHide() {
            this.bitField0_ &= -9;
            this.hide_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_Off_23310 extends GeneratedMessageV3 implements CR2S_Off_23310OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODE_FIELD_NUMBER = 1;
      private Internal.IntList code_;
      public static final int GOODS_FIELD_NUMBER = 2;
      private List<MartMsg.Goods> goods_;
      private byte memoizedIsInitialized;
      private static final CR2S_Off_23310 DEFAULT_INSTANCE = new CR2S_Off_23310();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Off_23310> PARSER = new AbstractParser<CR2S_Off_23310>() {
         public CR2S_Off_23310 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Off_23310(input, extensionRegistry);
         }
      };

      private CR2S_Off_23310(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Off_23310() {
         this.memoizedIsInitialized = -1;
         this.code_ = emptyIntList();
         this.goods_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Off_23310();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Off_23310(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  int limit;
                  switch (tag) {
                     case 0:
                        done = true;
                        continue;
                     case 8:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.code_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.goods_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.goods_.add(input.readMessage(MartMsg.Goods.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.code_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.code_.makeImmutable();
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Off_23310.class, Builder.class);
      }

      public List<Integer> getCodeList() {
         return this.code_;
      }

      public int getCodeCount() {
         return this.code_.size();
      }

      public int getCode(int index) {
         return this.code_.getInt(index);
      }

      public List<MartMsg.Goods> getGoodsList() {
         return this.goods_;
      }

      public List<? extends MartMsg.GoodsOrBuilder> getGoodsOrBuilderList() {
         return this.goods_;
      }

      public int getGoodsCount() {
         return this.goods_.size();
      }

      public MartMsg.Goods getGoods(int index) {
         return (MartMsg.Goods)this.goods_.get(index);
      }

      public MartMsg.GoodsOrBuilder getGoodsOrBuilder(int index) {
         return (MartMsg.GoodsOrBuilder)this.goods_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGoodsCount(); ++i) {
               if (!this.getGoods(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.code_.size(); ++i) {
            output.writeInt32(1, this.code_.getInt(i));
         }

         for(int i = 0; i < this.goods_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.goods_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            int dataSize = 0;

            for(int i = 0; i < this.code_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.code_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodeList().size();

            for(int i = 0; i < this.goods_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.goods_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Off_23310)) {
            return super.equals(obj);
         } else {
            CR2S_Off_23310 other = (CR2S_Off_23310)obj;
            if (!this.getCodeList().equals(other.getCodeList())) {
               return false;
            } else if (!this.getGoodsList().equals(other.getGoodsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getCodeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCodeList().hashCode();
            }

            if (this.getGoodsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGoodsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Off_23310 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Off_23310)PARSER.parseFrom(data);
      }

      public static CR2S_Off_23310 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Off_23310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Off_23310 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Off_23310)PARSER.parseFrom(data);
      }

      public static CR2S_Off_23310 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Off_23310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Off_23310 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Off_23310)PARSER.parseFrom(data);
      }

      public static CR2S_Off_23310 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Off_23310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Off_23310 parseFrom(InputStream input) throws IOException {
         return (CR2S_Off_23310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Off_23310 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Off_23310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Off_23310 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Off_23310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Off_23310 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Off_23310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Off_23310 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Off_23310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Off_23310 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Off_23310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Off_23310 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Off_23310 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Off_23310> parser() {
         return PARSER;
      }

      public Parser<CR2S_Off_23310> getParserForType() {
         return PARSER;
      }

      public CR2S_Off_23310 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Off_23310OrBuilder {
         private int bitField0_;
         private Internal.IntList code_;
         private List<MartMsg.Goods> goods_;
         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> goodsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Off_23310.class, Builder.class);
         }

         private Builder() {
            this.code_ = CrossMartMsg.CR2S_Off_23310.emptyIntList();
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = CrossMartMsg.CR2S_Off_23310.emptyIntList();
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_Off_23310.alwaysUseFieldBuilders) {
               this.getGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = CrossMartMsg.CR2S_Off_23310.emptyIntList();
            this.bitField0_ &= -2;
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.goodsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Off_23310_descriptor;
         }

         public CR2S_Off_23310 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_Off_23310.getDefaultInstance();
         }

         public CR2S_Off_23310 build() {
            CR2S_Off_23310 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Off_23310 buildPartial() {
            CR2S_Off_23310 result = new CR2S_Off_23310(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.code_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.code_ = this.code_;
            if (this.goodsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
                  this.bitField0_ &= -3;
               }

               result.goods_ = this.goods_;
            } else {
               result.goods_ = this.goodsBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_Off_23310) {
               return this.mergeFrom((CR2S_Off_23310)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Off_23310 other) {
            if (other == CrossMartMsg.CR2S_Off_23310.getDefaultInstance()) {
               return this;
            } else {
               if (!other.code_.isEmpty()) {
                  if (this.code_.isEmpty()) {
                     this.code_ = other.code_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCodeIsMutable();
                     this.code_.addAll(other.code_);
                  }

                  this.onChanged();
               }

               if (this.goodsBuilder_ == null) {
                  if (!other.goods_.isEmpty()) {
                     if (this.goods_.isEmpty()) {
                        this.goods_ = other.goods_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureGoodsIsMutable();
                        this.goods_.addAll(other.goods_);
                     }

                     this.onChanged();
                  }
               } else if (!other.goods_.isEmpty()) {
                  if (this.goodsBuilder_.isEmpty()) {
                     this.goodsBuilder_.dispose();
                     this.goodsBuilder_ = null;
                     this.goods_ = other.goods_;
                     this.bitField0_ &= -3;
                     this.goodsBuilder_ = CrossMartMsg.CR2S_Off_23310.alwaysUseFieldBuilders ? this.getGoodsFieldBuilder() : null;
                  } else {
                     this.goodsBuilder_.addAllMessages(other.goods_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGoodsCount(); ++i) {
               if (!this.getGoods(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Off_23310 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Off_23310)CrossMartMsg.CR2S_Off_23310.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Off_23310)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.code_ = CrossMartMsg.CR2S_Off_23310.mutableCopy(this.code_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCodeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.code_) : this.code_);
         }

         public int getCodeCount() {
            return this.code_.size();
         }

         public int getCode(int index) {
            return this.code_.getInt(index);
         }

         public Builder setCode(int index, int value) {
            this.ensureCodeIsMutable();
            this.code_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCode(int value) {
            this.ensureCodeIsMutable();
            this.code_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCode(Iterable<? extends Integer> values) {
            this.ensureCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.code_);
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.code_ = CrossMartMsg.CR2S_Off_23310.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         private void ensureGoodsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.goods_ = new ArrayList(this.goods_);
               this.bitField0_ |= 2;
            }

         }

         public List<MartMsg.Goods> getGoodsList() {
            return this.goodsBuilder_ == null ? Collections.unmodifiableList(this.goods_) : this.goodsBuilder_.getMessageList();
         }

         public int getGoodsCount() {
            return this.goodsBuilder_ == null ? this.goods_.size() : this.goodsBuilder_.getCount();
         }

         public MartMsg.Goods getGoods(int index) {
            return this.goodsBuilder_ == null ? (MartMsg.Goods)this.goods_.get(index) : (MartMsg.Goods)this.goodsBuilder_.getMessage(index);
         }

         public Builder setGoods(int index, MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.set(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGoods(int index, MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGoods(MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGoods(Iterable<? extends MartMsg.Goods> values) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.goods_);
               this.onChanged();
            } else {
               this.goodsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGoods() {
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.goodsBuilder_.clear();
            }

            return this;
         }

         public Builder removeGoods(int index) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.remove(index);
               this.onChanged();
            } else {
               this.goodsBuilder_.remove(index);
            }

            return this;
         }

         public MartMsg.Goods.Builder getGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().getBuilder(index);
         }

         public MartMsg.GoodsOrBuilder getGoodsOrBuilder(int index) {
            return this.goodsBuilder_ == null ? (MartMsg.GoodsOrBuilder)this.goods_.get(index) : (MartMsg.GoodsOrBuilder)this.goodsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MartMsg.GoodsOrBuilder> getGoodsOrBuilderList() {
            return this.goodsBuilder_ != null ? this.goodsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.goods_);
         }

         public MartMsg.Goods.Builder addGoodsBuilder() {
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().addBuilder(MartMsg.Goods.getDefaultInstance());
         }

         public MartMsg.Goods.Builder addGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().addBuilder(index, MartMsg.Goods.getDefaultInstance());
         }

         public List<MartMsg.Goods.Builder> getGoodsBuilderList() {
            return this.getGoodsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> getGoodsFieldBuilder() {
            if (this.goodsBuilder_ == null) {
               this.goodsBuilder_ = new RepeatedFieldBuilderV3(this.goods_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.goods_ = null;
            }

            return this.goodsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_BuyHit_23311 extends GeneratedMessageV3 implements S2CR_BuyHit_23311OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int OFFERPRICE_FIELD_NUMBER = 2;
      private int offerPrice_;
      public static final int HIDE_FIELD_NUMBER = 3;
      private int hide_;
      private byte memoizedIsInitialized;
      private static final S2CR_BuyHit_23311 DEFAULT_INSTANCE = new S2CR_BuyHit_23311();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BuyHit_23311> PARSER = new AbstractParser<S2CR_BuyHit_23311>() {
         public S2CR_BuyHit_23311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BuyHit_23311(input, extensionRegistry);
         }
      };

      private S2CR_BuyHit_23311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BuyHit_23311() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BuyHit_23311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BuyHit_23311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.offerPrice_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.hide_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BuyHit_23311.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasOfferPrice() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOfferPrice() {
         return this.offerPrice_;
      }

      public boolean hasHide() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHide() {
         return this.hide_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.offerPrice_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.hide_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.offerPrice_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.hide_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_BuyHit_23311)) {
            return super.equals(obj);
         } else {
            S2CR_BuyHit_23311 other = (S2CR_BuyHit_23311)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasOfferPrice() != other.hasOfferPrice()) {
               return false;
            } else if (this.hasOfferPrice() && this.getOfferPrice() != other.getOfferPrice()) {
               return false;
            } else if (this.hasHide() != other.hasHide()) {
               return false;
            } else if (this.hasHide() && this.getHide() != other.getHide()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasOfferPrice()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOfferPrice();
            }

            if (this.hasHide()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHide();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_BuyHit_23311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BuyHit_23311)PARSER.parseFrom(data);
      }

      public static S2CR_BuyHit_23311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuyHit_23311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuyHit_23311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BuyHit_23311)PARSER.parseFrom(data);
      }

      public static S2CR_BuyHit_23311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuyHit_23311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuyHit_23311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BuyHit_23311)PARSER.parseFrom(data);
      }

      public static S2CR_BuyHit_23311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuyHit_23311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuyHit_23311 parseFrom(InputStream input) throws IOException {
         return (S2CR_BuyHit_23311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BuyHit_23311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuyHit_23311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BuyHit_23311 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BuyHit_23311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BuyHit_23311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuyHit_23311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BuyHit_23311 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BuyHit_23311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BuyHit_23311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuyHit_23311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BuyHit_23311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BuyHit_23311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BuyHit_23311> parser() {
         return PARSER;
      }

      public Parser<S2CR_BuyHit_23311> getParserForType() {
         return PARSER;
      }

      public S2CR_BuyHit_23311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BuyHit_23311OrBuilder {
         private int bitField0_;
         private int code_;
         private int offerPrice_;
         private int hide_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BuyHit_23311.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.S2CR_BuyHit_23311.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.offerPrice_ = 0;
            this.bitField0_ &= -3;
            this.hide_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuyHit_23311_descriptor;
         }

         public S2CR_BuyHit_23311 getDefaultInstanceForType() {
            return CrossMartMsg.S2CR_BuyHit_23311.getDefaultInstance();
         }

         public S2CR_BuyHit_23311 build() {
            S2CR_BuyHit_23311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BuyHit_23311 buildPartial() {
            S2CR_BuyHit_23311 result = new S2CR_BuyHit_23311(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.offerPrice_ = this.offerPrice_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.hide_ = this.hide_;
               to_bitField0_ |= 4;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_BuyHit_23311) {
               return this.mergeFrom((S2CR_BuyHit_23311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BuyHit_23311 other) {
            if (other == CrossMartMsg.S2CR_BuyHit_23311.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasOfferPrice()) {
                  this.setOfferPrice(other.getOfferPrice());
               }

               if (other.hasHide()) {
                  this.setHide(other.getHide());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasOfferPrice();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_BuyHit_23311 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BuyHit_23311)CrossMartMsg.S2CR_BuyHit_23311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BuyHit_23311)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOfferPrice() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOfferPrice() {
            return this.offerPrice_;
         }

         public Builder setOfferPrice(int value) {
            this.bitField0_ |= 2;
            this.offerPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferPrice() {
            this.bitField0_ &= -3;
            this.offerPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHide() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHide() {
            return this.hide_;
         }

         public Builder setHide(int value) {
            this.bitField0_ |= 4;
            this.hide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHide() {
            this.bitField0_ &= -5;
            this.hide_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_BuyHit_23312 extends GeneratedMessageV3 implements CR2S_BuyHit_23312OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int PRICEINFO_FIELD_NUMBER = 2;
      private CommonMsg.ItemInfo priceInfo_;
      public static final int HIDE_FIELD_NUMBER = 3;
      private int hide_;
      public static final int RESULT_FIELD_NUMBER = 4;
      private int result_;
      private byte memoizedIsInitialized;
      private static final CR2S_BuyHit_23312 DEFAULT_INSTANCE = new CR2S_BuyHit_23312();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BuyHit_23312> PARSER = new AbstractParser<CR2S_BuyHit_23312>() {
         public CR2S_BuyHit_23312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BuyHit_23312(input, extensionRegistry);
         }
      };

      private CR2S_BuyHit_23312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BuyHit_23312() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BuyHit_23312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BuyHit_23312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.code_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.priceInfo_.toBuilder();
                        }

                        this.priceInfo_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.priceInfo_);
                           this.priceInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.hide_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.result_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BuyHit_23312.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasPriceInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.ItemInfo getPriceInfo() {
         return this.priceInfo_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.priceInfo_;
      }

      public CommonMsg.ItemInfoOrBuilder getPriceInfoOrBuilder() {
         return this.priceInfo_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.priceInfo_;
      }

      public boolean hasHide() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHide() {
         return this.hide_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPriceInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPriceInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getPriceInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.hide_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.result_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getPriceInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.hide_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BuyHit_23312)) {
            return super.equals(obj);
         } else {
            CR2S_BuyHit_23312 other = (CR2S_BuyHit_23312)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasPriceInfo() != other.hasPriceInfo()) {
               return false;
            } else if (this.hasPriceInfo() && !this.getPriceInfo().equals(other.getPriceInfo())) {
               return false;
            } else if (this.hasHide() != other.hasHide()) {
               return false;
            } else if (this.hasHide() && this.getHide() != other.getHide()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasPriceInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPriceInfo().hashCode();
            }

            if (this.hasHide()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHide();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BuyHit_23312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BuyHit_23312)PARSER.parseFrom(data);
      }

      public static CR2S_BuyHit_23312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BuyHit_23312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BuyHit_23312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BuyHit_23312)PARSER.parseFrom(data);
      }

      public static CR2S_BuyHit_23312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BuyHit_23312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BuyHit_23312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BuyHit_23312)PARSER.parseFrom(data);
      }

      public static CR2S_BuyHit_23312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BuyHit_23312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BuyHit_23312 parseFrom(InputStream input) throws IOException {
         return (CR2S_BuyHit_23312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BuyHit_23312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BuyHit_23312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BuyHit_23312 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BuyHit_23312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BuyHit_23312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BuyHit_23312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BuyHit_23312 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BuyHit_23312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BuyHit_23312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BuyHit_23312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BuyHit_23312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BuyHit_23312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BuyHit_23312> parser() {
         return PARSER;
      }

      public Parser<CR2S_BuyHit_23312> getParserForType() {
         return PARSER;
      }

      public CR2S_BuyHit_23312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BuyHit_23312OrBuilder {
         private int bitField0_;
         private int code_;
         private CommonMsg.ItemInfo priceInfo_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> priceInfoBuilder_;
         private int hide_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BuyHit_23312.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_BuyHit_23312.alwaysUseFieldBuilders) {
               this.getPriceInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            if (this.priceInfoBuilder_ == null) {
               this.priceInfo_ = null;
            } else {
               this.priceInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.hide_ = 0;
            this.bitField0_ &= -5;
            this.result_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BuyHit_23312_descriptor;
         }

         public CR2S_BuyHit_23312 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_BuyHit_23312.getDefaultInstance();
         }

         public CR2S_BuyHit_23312 build() {
            CR2S_BuyHit_23312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BuyHit_23312 buildPartial() {
            CR2S_BuyHit_23312 result = new CR2S_BuyHit_23312(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.priceInfoBuilder_ == null) {
                  result.priceInfo_ = this.priceInfo_;
               } else {
                  result.priceInfo_ = (CommonMsg.ItemInfo)this.priceInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.hide_ = this.hide_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 8;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_BuyHit_23312) {
               return this.mergeFrom((CR2S_BuyHit_23312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BuyHit_23312 other) {
            if (other == CrossMartMsg.CR2S_BuyHit_23312.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasPriceInfo()) {
                  this.mergePriceInfo(other.getPriceInfo());
               }

               if (other.hasHide()) {
                  this.setHide(other.getHide());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasPriceInfo()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               return this.getPriceInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BuyHit_23312 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BuyHit_23312)CrossMartMsg.CR2S_BuyHit_23312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BuyHit_23312)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPriceInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.ItemInfo getPriceInfo() {
            if (this.priceInfoBuilder_ == null) {
               return this.priceInfo_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.priceInfo_;
            } else {
               return (CommonMsg.ItemInfo)this.priceInfoBuilder_.getMessage();
            }
         }

         public Builder setPriceInfo(CommonMsg.ItemInfo value) {
            if (this.priceInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.priceInfo_ = value;
               this.onChanged();
            } else {
               this.priceInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setPriceInfo(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.priceInfoBuilder_ == null) {
               this.priceInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.priceInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergePriceInfo(CommonMsg.ItemInfo value) {
            if (this.priceInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.priceInfo_ != null && this.priceInfo_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.priceInfo_ = CommonMsg.ItemInfo.newBuilder(this.priceInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.priceInfo_ = value;
               }

               this.onChanged();
            } else {
               this.priceInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearPriceInfo() {
            if (this.priceInfoBuilder_ == null) {
               this.priceInfo_ = null;
               this.onChanged();
            } else {
               this.priceInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getPriceInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getPriceInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getPriceInfoOrBuilder() {
            if (this.priceInfoBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.priceInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.priceInfo_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.priceInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getPriceInfoFieldBuilder() {
            if (this.priceInfoBuilder_ == null) {
               this.priceInfoBuilder_ = new SingleFieldBuilderV3(this.getPriceInfo(), this.getParentForChildren(), this.isClean());
               this.priceInfo_ = null;
            }

            return this.priceInfoBuilder_;
         }

         public boolean hasHide() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHide() {
            return this.hide_;
         }

         public Builder setHide(int value) {
            this.bitField0_ |= 4;
            this.hide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHide() {
            this.bitField0_ &= -5;
            this.hide_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 8;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -9;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_BuySubmit_23313 extends GeneratedMessageV3 implements S2CR_BuySubmit_23313OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int OFFERPRICE_FIELD_NUMBER = 2;
      private int offerPrice_;
      public static final int HIDE_FIELD_NUMBER = 3;
      private int hide_;
      private byte memoizedIsInitialized;
      private static final S2CR_BuySubmit_23313 DEFAULT_INSTANCE = new S2CR_BuySubmit_23313();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BuySubmit_23313> PARSER = new AbstractParser<S2CR_BuySubmit_23313>() {
         public S2CR_BuySubmit_23313 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BuySubmit_23313(input, extensionRegistry);
         }
      };

      private S2CR_BuySubmit_23313(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BuySubmit_23313() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BuySubmit_23313();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BuySubmit_23313(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.offerPrice_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.hide_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BuySubmit_23313.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasOfferPrice() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getOfferPrice() {
         return this.offerPrice_;
      }

      public boolean hasHide() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHide() {
         return this.hide_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.offerPrice_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.hide_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.offerPrice_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.hide_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_BuySubmit_23313)) {
            return super.equals(obj);
         } else {
            S2CR_BuySubmit_23313 other = (S2CR_BuySubmit_23313)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasOfferPrice() != other.hasOfferPrice()) {
               return false;
            } else if (this.hasOfferPrice() && this.getOfferPrice() != other.getOfferPrice()) {
               return false;
            } else if (this.hasHide() != other.hasHide()) {
               return false;
            } else if (this.hasHide() && this.getHide() != other.getHide()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasOfferPrice()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getOfferPrice();
            }

            if (this.hasHide()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHide();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_BuySubmit_23313 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BuySubmit_23313)PARSER.parseFrom(data);
      }

      public static S2CR_BuySubmit_23313 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuySubmit_23313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuySubmit_23313 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BuySubmit_23313)PARSER.parseFrom(data);
      }

      public static S2CR_BuySubmit_23313 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuySubmit_23313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuySubmit_23313 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BuySubmit_23313)PARSER.parseFrom(data);
      }

      public static S2CR_BuySubmit_23313 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BuySubmit_23313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BuySubmit_23313 parseFrom(InputStream input) throws IOException {
         return (S2CR_BuySubmit_23313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BuySubmit_23313 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuySubmit_23313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BuySubmit_23313 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BuySubmit_23313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BuySubmit_23313 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuySubmit_23313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BuySubmit_23313 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BuySubmit_23313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BuySubmit_23313 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BuySubmit_23313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BuySubmit_23313 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BuySubmit_23313 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BuySubmit_23313> parser() {
         return PARSER;
      }

      public Parser<S2CR_BuySubmit_23313> getParserForType() {
         return PARSER;
      }

      public S2CR_BuySubmit_23313 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BuySubmit_23313OrBuilder {
         private int bitField0_;
         private int code_;
         private int offerPrice_;
         private int hide_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BuySubmit_23313.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.S2CR_BuySubmit_23313.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.offerPrice_ = 0;
            this.bitField0_ &= -3;
            this.hide_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BuySubmit_23313_descriptor;
         }

         public S2CR_BuySubmit_23313 getDefaultInstanceForType() {
            return CrossMartMsg.S2CR_BuySubmit_23313.getDefaultInstance();
         }

         public S2CR_BuySubmit_23313 build() {
            S2CR_BuySubmit_23313 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BuySubmit_23313 buildPartial() {
            S2CR_BuySubmit_23313 result = new S2CR_BuySubmit_23313(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.offerPrice_ = this.offerPrice_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.hide_ = this.hide_;
               to_bitField0_ |= 4;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_BuySubmit_23313) {
               return this.mergeFrom((S2CR_BuySubmit_23313)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BuySubmit_23313 other) {
            if (other == CrossMartMsg.S2CR_BuySubmit_23313.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasOfferPrice()) {
                  this.setOfferPrice(other.getOfferPrice());
               }

               if (other.hasHide()) {
                  this.setHide(other.getHide());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else {
               return this.hasOfferPrice();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_BuySubmit_23313 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BuySubmit_23313)CrossMartMsg.S2CR_BuySubmit_23313.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BuySubmit_23313)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOfferPrice() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getOfferPrice() {
            return this.offerPrice_;
         }

         public Builder setOfferPrice(int value) {
            this.bitField0_ |= 2;
            this.offerPrice_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferPrice() {
            this.bitField0_ &= -3;
            this.offerPrice_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHide() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHide() {
            return this.hide_;
         }

         public Builder setHide(int value) {
            this.bitField0_ |= 4;
            this.hide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHide() {
            this.bitField0_ &= -5;
            this.hide_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_ReceiveGoods_23318 extends GeneratedMessageV3 implements CR2S_ReceiveGoods_23318OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int PRICETYPE_FIELD_NUMBER = 2;
      private int priceType_;
      public static final int PRICEID_FIELD_NUMBER = 3;
      private int priceId_;
      public static final int PRICE_FIELD_NUMBER = 4;
      private int price_;
      public static final int SERVICECHARGE_FIELD_NUMBER = 5;
      private int serviceCharge_;
      private byte memoizedIsInitialized;
      private static final CR2S_ReceiveGoods_23318 DEFAULT_INSTANCE = new CR2S_ReceiveGoods_23318();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ReceiveGoods_23318> PARSER = new AbstractParser<CR2S_ReceiveGoods_23318>() {
         public CR2S_ReceiveGoods_23318 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ReceiveGoods_23318(input, extensionRegistry);
         }
      };

      private CR2S_ReceiveGoods_23318(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ReceiveGoods_23318() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ReceiveGoods_23318();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ReceiveGoods_23318(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.code_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.priceType_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.priceId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.price_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.serviceCharge_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ReceiveGoods_23318.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasPriceType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPriceType() {
         return this.priceType_;
      }

      public boolean hasPriceId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPriceId() {
         return this.priceId_;
      }

      public boolean hasPrice() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPrice() {
         return this.price_;
      }

      public boolean hasServiceCharge() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getServiceCharge() {
         return this.serviceCharge_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPriceType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPriceId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServiceCharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.priceType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.priceId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.price_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.serviceCharge_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.priceType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.priceId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.price_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.serviceCharge_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ReceiveGoods_23318)) {
            return super.equals(obj);
         } else {
            CR2S_ReceiveGoods_23318 other = (CR2S_ReceiveGoods_23318)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasPriceType() != other.hasPriceType()) {
               return false;
            } else if (this.hasPriceType() && this.getPriceType() != other.getPriceType()) {
               return false;
            } else if (this.hasPriceId() != other.hasPriceId()) {
               return false;
            } else if (this.hasPriceId() && this.getPriceId() != other.getPriceId()) {
               return false;
            } else if (this.hasPrice() != other.hasPrice()) {
               return false;
            } else if (this.hasPrice() && this.getPrice() != other.getPrice()) {
               return false;
            } else if (this.hasServiceCharge() != other.hasServiceCharge()) {
               return false;
            } else if (this.hasServiceCharge() && this.getServiceCharge() != other.getServiceCharge()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasPriceType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPriceType();
            }

            if (this.hasPriceId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPriceId();
            }

            if (this.hasPrice()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPrice();
            }

            if (this.hasServiceCharge()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getServiceCharge();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ReceiveGoods_23318)PARSER.parseFrom(data);
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ReceiveGoods_23318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ReceiveGoods_23318)PARSER.parseFrom(data);
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ReceiveGoods_23318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ReceiveGoods_23318)PARSER.parseFrom(data);
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ReceiveGoods_23318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(InputStream input) throws IOException {
         return (CR2S_ReceiveGoods_23318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ReceiveGoods_23318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ReceiveGoods_23318 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ReceiveGoods_23318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ReceiveGoods_23318 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ReceiveGoods_23318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ReceiveGoods_23318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ReceiveGoods_23318 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ReceiveGoods_23318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ReceiveGoods_23318 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ReceiveGoods_23318 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ReceiveGoods_23318> parser() {
         return PARSER;
      }

      public Parser<CR2S_ReceiveGoods_23318> getParserForType() {
         return PARSER;
      }

      public CR2S_ReceiveGoods_23318 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ReceiveGoods_23318OrBuilder {
         private int bitField0_;
         private int code_;
         private int priceType_;
         private int priceId_;
         private int price_;
         private int serviceCharge_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ReceiveGoods_23318.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_ReceiveGoods_23318.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.priceType_ = 0;
            this.bitField0_ &= -3;
            this.priceId_ = 0;
            this.bitField0_ &= -5;
            this.price_ = 0;
            this.bitField0_ &= -9;
            this.serviceCharge_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReceiveGoods_23318_descriptor;
         }

         public CR2S_ReceiveGoods_23318 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_ReceiveGoods_23318.getDefaultInstance();
         }

         public CR2S_ReceiveGoods_23318 build() {
            CR2S_ReceiveGoods_23318 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ReceiveGoods_23318 buildPartial() {
            CR2S_ReceiveGoods_23318 result = new CR2S_ReceiveGoods_23318(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.priceType_ = this.priceType_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.priceId_ = this.priceId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.price_ = this.price_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.serviceCharge_ = this.serviceCharge_;
               to_bitField0_ |= 16;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_ReceiveGoods_23318) {
               return this.mergeFrom((CR2S_ReceiveGoods_23318)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ReceiveGoods_23318 other) {
            if (other == CrossMartMsg.CR2S_ReceiveGoods_23318.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasPriceType()) {
                  this.setPriceType(other.getPriceType());
               }

               if (other.hasPriceId()) {
                  this.setPriceId(other.getPriceId());
               }

               if (other.hasPrice()) {
                  this.setPrice(other.getPrice());
               }

               if (other.hasServiceCharge()) {
                  this.setServiceCharge(other.getServiceCharge());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasPriceType()) {
               return false;
            } else if (!this.hasPriceId()) {
               return false;
            } else if (!this.hasPrice()) {
               return false;
            } else {
               return this.hasServiceCharge();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ReceiveGoods_23318 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ReceiveGoods_23318)CrossMartMsg.CR2S_ReceiveGoods_23318.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ReceiveGoods_23318)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 1;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPriceType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPriceType() {
            return this.priceType_;
         }

         public Builder setPriceType(int value) {
            this.bitField0_ |= 2;
            this.priceType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPriceType() {
            this.bitField0_ &= -3;
            this.priceType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPriceId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPriceId() {
            return this.priceId_;
         }

         public Builder setPriceId(int value) {
            this.bitField0_ |= 4;
            this.priceId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPriceId() {
            this.bitField0_ &= -5;
            this.priceId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrice() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPrice() {
            return this.price_;
         }

         public Builder setPrice(int value) {
            this.bitField0_ |= 8;
            this.price_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrice() {
            this.bitField0_ &= -9;
            this.price_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServiceCharge() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getServiceCharge() {
            return this.serviceCharge_;
         }

         public Builder setServiceCharge(int value) {
            this.bitField0_ |= 16;
            this.serviceCharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServiceCharge() {
            this.bitField0_ &= -17;
            this.serviceCharge_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_ChangInfo_23320 extends GeneratedMessageV3 implements CR2S_ChangInfo_23320OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GOODS_FIELD_NUMBER = 1;
      private List<MartMsg.Goods> goods_;
      private byte memoizedIsInitialized;
      private static final CR2S_ChangInfo_23320 DEFAULT_INSTANCE = new CR2S_ChangInfo_23320();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ChangInfo_23320> PARSER = new AbstractParser<CR2S_ChangInfo_23320>() {
         public CR2S_ChangInfo_23320 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ChangInfo_23320(input, extensionRegistry);
         }
      };

      private CR2S_ChangInfo_23320(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ChangInfo_23320() {
         this.memoizedIsInitialized = -1;
         this.goods_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ChangInfo_23320();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ChangInfo_23320(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.goods_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.goods_.add(input.readMessage(MartMsg.Goods.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChangInfo_23320.class, Builder.class);
      }

      public List<MartMsg.Goods> getGoodsList() {
         return this.goods_;
      }

      public List<? extends MartMsg.GoodsOrBuilder> getGoodsOrBuilderList() {
         return this.goods_;
      }

      public int getGoodsCount() {
         return this.goods_.size();
      }

      public MartMsg.Goods getGoods(int index) {
         return (MartMsg.Goods)this.goods_.get(index);
      }

      public MartMsg.GoodsOrBuilder getGoodsOrBuilder(int index) {
         return (MartMsg.GoodsOrBuilder)this.goods_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGoodsCount(); ++i) {
               if (!this.getGoods(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.goods_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.goods_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.goods_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.goods_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ChangInfo_23320)) {
            return super.equals(obj);
         } else {
            CR2S_ChangInfo_23320 other = (CR2S_ChangInfo_23320)obj;
            if (!this.getGoodsList().equals(other.getGoodsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getGoodsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGoodsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ChangInfo_23320 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_23320)PARSER.parseFrom(data);
      }

      public static CR2S_ChangInfo_23320 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_23320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangInfo_23320 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_23320)PARSER.parseFrom(data);
      }

      public static CR2S_ChangInfo_23320 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_23320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangInfo_23320 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_23320)PARSER.parseFrom(data);
      }

      public static CR2S_ChangInfo_23320 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangInfo_23320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangInfo_23320 parseFrom(InputStream input) throws IOException {
         return (CR2S_ChangInfo_23320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChangInfo_23320 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangInfo_23320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChangInfo_23320 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ChangInfo_23320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ChangInfo_23320 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangInfo_23320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChangInfo_23320 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ChangInfo_23320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChangInfo_23320 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangInfo_23320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ChangInfo_23320 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ChangInfo_23320 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ChangInfo_23320> parser() {
         return PARSER;
      }

      public Parser<CR2S_ChangInfo_23320> getParserForType() {
         return PARSER;
      }

      public CR2S_ChangInfo_23320 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ChangInfo_23320OrBuilder {
         private int bitField0_;
         private List<MartMsg.Goods> goods_;
         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> goodsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChangInfo_23320.class, Builder.class);
         }

         private Builder() {
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_ChangInfo_23320.alwaysUseFieldBuilders) {
               this.getGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.goodsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ChangInfo_23320_descriptor;
         }

         public CR2S_ChangInfo_23320 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_ChangInfo_23320.getDefaultInstance();
         }

         public CR2S_ChangInfo_23320 build() {
            CR2S_ChangInfo_23320 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ChangInfo_23320 buildPartial() {
            CR2S_ChangInfo_23320 result = new CR2S_ChangInfo_23320(this);
            int from_bitField0_ = this.bitField0_;
            if (this.goodsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
                  this.bitField0_ &= -2;
               }

               result.goods_ = this.goods_;
            } else {
               result.goods_ = this.goodsBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_ChangInfo_23320) {
               return this.mergeFrom((CR2S_ChangInfo_23320)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ChangInfo_23320 other) {
            if (other == CrossMartMsg.CR2S_ChangInfo_23320.getDefaultInstance()) {
               return this;
            } else {
               if (this.goodsBuilder_ == null) {
                  if (!other.goods_.isEmpty()) {
                     if (this.goods_.isEmpty()) {
                        this.goods_ = other.goods_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGoodsIsMutable();
                        this.goods_.addAll(other.goods_);
                     }

                     this.onChanged();
                  }
               } else if (!other.goods_.isEmpty()) {
                  if (this.goodsBuilder_.isEmpty()) {
                     this.goodsBuilder_.dispose();
                     this.goodsBuilder_ = null;
                     this.goods_ = other.goods_;
                     this.bitField0_ &= -2;
                     this.goodsBuilder_ = CrossMartMsg.CR2S_ChangInfo_23320.alwaysUseFieldBuilders ? this.getGoodsFieldBuilder() : null;
                  } else {
                     this.goodsBuilder_.addAllMessages(other.goods_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGoodsCount(); ++i) {
               if (!this.getGoods(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ChangInfo_23320 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ChangInfo_23320)CrossMartMsg.CR2S_ChangInfo_23320.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ChangInfo_23320)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGoodsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.goods_ = new ArrayList(this.goods_);
               this.bitField0_ |= 1;
            }

         }

         public List<MartMsg.Goods> getGoodsList() {
            return this.goodsBuilder_ == null ? Collections.unmodifiableList(this.goods_) : this.goodsBuilder_.getMessageList();
         }

         public int getGoodsCount() {
            return this.goodsBuilder_ == null ? this.goods_.size() : this.goodsBuilder_.getCount();
         }

         public MartMsg.Goods getGoods(int index) {
            return this.goodsBuilder_ == null ? (MartMsg.Goods)this.goods_.get(index) : (MartMsg.Goods)this.goodsBuilder_.getMessage(index);
         }

         public Builder setGoods(int index, MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.set(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGoods(int index, MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGoods(MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGoods(Iterable<? extends MartMsg.Goods> values) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.goods_);
               this.onChanged();
            } else {
               this.goodsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGoods() {
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.goodsBuilder_.clear();
            }

            return this;
         }

         public Builder removeGoods(int index) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.remove(index);
               this.onChanged();
            } else {
               this.goodsBuilder_.remove(index);
            }

            return this;
         }

         public MartMsg.Goods.Builder getGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().getBuilder(index);
         }

         public MartMsg.GoodsOrBuilder getGoodsOrBuilder(int index) {
            return this.goodsBuilder_ == null ? (MartMsg.GoodsOrBuilder)this.goods_.get(index) : (MartMsg.GoodsOrBuilder)this.goodsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MartMsg.GoodsOrBuilder> getGoodsOrBuilderList() {
            return this.goodsBuilder_ != null ? this.goodsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.goods_);
         }

         public MartMsg.Goods.Builder addGoodsBuilder() {
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().addBuilder(MartMsg.Goods.getDefaultInstance());
         }

         public MartMsg.Goods.Builder addGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().addBuilder(index, MartMsg.Goods.getDefaultInstance());
         }

         public List<MartMsg.Goods.Builder> getGoodsBuilderList() {
            return this.getGoodsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> getGoodsFieldBuilder() {
            if (this.goodsBuilder_ == null) {
               this.goodsBuilder_ = new RepeatedFieldBuilderV3(this.goods_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.goods_ = null;
            }

            return this.goodsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_UploadOffGoods_23321 extends GeneratedMessageV3 implements S2CR_UploadOffGoods_23321OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TAKEOFFGOODS_FIELD_NUMBER = 1;
      private List<MartMsg.Goods> takeOffGoods_;
      public static final int UNGETGOODS_FIELD_NUMBER = 2;
      private List<MartMsg.Goods> unGetGoods_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadOffGoods_23321 DEFAULT_INSTANCE = new S2CR_UploadOffGoods_23321();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadOffGoods_23321> PARSER = new AbstractParser<S2CR_UploadOffGoods_23321>() {
         public S2CR_UploadOffGoods_23321 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadOffGoods_23321(input, extensionRegistry);
         }
      };

      private S2CR_UploadOffGoods_23321(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadOffGoods_23321() {
         this.memoizedIsInitialized = -1;
         this.takeOffGoods_ = Collections.emptyList();
         this.unGetGoods_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadOffGoods_23321();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadOffGoods_23321(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.takeOffGoods_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.takeOffGoods_.add(input.readMessage(MartMsg.Goods.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.unGetGoods_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.unGetGoods_.add(input.readMessage(MartMsg.Goods.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.takeOffGoods_ = Collections.unmodifiableList(this.takeOffGoods_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.unGetGoods_ = Collections.unmodifiableList(this.unGetGoods_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadOffGoods_23321.class, Builder.class);
      }

      public List<MartMsg.Goods> getTakeOffGoodsList() {
         return this.takeOffGoods_;
      }

      public List<? extends MartMsg.GoodsOrBuilder> getTakeOffGoodsOrBuilderList() {
         return this.takeOffGoods_;
      }

      public int getTakeOffGoodsCount() {
         return this.takeOffGoods_.size();
      }

      public MartMsg.Goods getTakeOffGoods(int index) {
         return (MartMsg.Goods)this.takeOffGoods_.get(index);
      }

      public MartMsg.GoodsOrBuilder getTakeOffGoodsOrBuilder(int index) {
         return (MartMsg.GoodsOrBuilder)this.takeOffGoods_.get(index);
      }

      public List<MartMsg.Goods> getUnGetGoodsList() {
         return this.unGetGoods_;
      }

      public List<? extends MartMsg.GoodsOrBuilder> getUnGetGoodsOrBuilderList() {
         return this.unGetGoods_;
      }

      public int getUnGetGoodsCount() {
         return this.unGetGoods_.size();
      }

      public MartMsg.Goods getUnGetGoods(int index) {
         return (MartMsg.Goods)this.unGetGoods_.get(index);
      }

      public MartMsg.GoodsOrBuilder getUnGetGoodsOrBuilder(int index) {
         return (MartMsg.GoodsOrBuilder)this.unGetGoods_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTakeOffGoodsCount(); ++i) {
               if (!this.getTakeOffGoods(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getUnGetGoodsCount(); ++i) {
               if (!this.getUnGetGoods(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.takeOffGoods_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.takeOffGoods_.get(i));
         }

         for(int i = 0; i < this.unGetGoods_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.unGetGoods_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.takeOffGoods_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.takeOffGoods_.get(i));
            }

            for(int i = 0; i < this.unGetGoods_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.unGetGoods_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadOffGoods_23321)) {
            return super.equals(obj);
         } else {
            S2CR_UploadOffGoods_23321 other = (S2CR_UploadOffGoods_23321)obj;
            if (!this.getTakeOffGoodsList().equals(other.getTakeOffGoodsList())) {
               return false;
            } else if (!this.getUnGetGoodsList().equals(other.getUnGetGoodsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTakeOffGoodsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTakeOffGoodsList().hashCode();
            }

            if (this.getUnGetGoodsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnGetGoodsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadOffGoods_23321)PARSER.parseFrom(data);
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadOffGoods_23321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadOffGoods_23321)PARSER.parseFrom(data);
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadOffGoods_23321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadOffGoods_23321)PARSER.parseFrom(data);
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadOffGoods_23321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadOffGoods_23321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadOffGoods_23321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadOffGoods_23321 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadOffGoods_23321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadOffGoods_23321 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadOffGoods_23321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadOffGoods_23321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadOffGoods_23321 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadOffGoods_23321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadOffGoods_23321 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadOffGoods_23321 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadOffGoods_23321> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadOffGoods_23321> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadOffGoods_23321 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadOffGoods_23321OrBuilder {
         private int bitField0_;
         private List<MartMsg.Goods> takeOffGoods_;
         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> takeOffGoodsBuilder_;
         private List<MartMsg.Goods> unGetGoods_;
         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> unGetGoodsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadOffGoods_23321.class, Builder.class);
         }

         private Builder() {
            this.takeOffGoods_ = Collections.emptyList();
            this.unGetGoods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.takeOffGoods_ = Collections.emptyList();
            this.unGetGoods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.S2CR_UploadOffGoods_23321.alwaysUseFieldBuilders) {
               this.getTakeOffGoodsFieldBuilder();
               this.getUnGetGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.takeOffGoodsBuilder_ == null) {
               this.takeOffGoods_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.takeOffGoodsBuilder_.clear();
            }

            if (this.unGetGoodsBuilder_ == null) {
               this.unGetGoods_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.unGetGoodsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_UploadOffGoods_23321_descriptor;
         }

         public S2CR_UploadOffGoods_23321 getDefaultInstanceForType() {
            return CrossMartMsg.S2CR_UploadOffGoods_23321.getDefaultInstance();
         }

         public S2CR_UploadOffGoods_23321 build() {
            S2CR_UploadOffGoods_23321 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadOffGoods_23321 buildPartial() {
            S2CR_UploadOffGoods_23321 result = new S2CR_UploadOffGoods_23321(this);
            int from_bitField0_ = this.bitField0_;
            if (this.takeOffGoodsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.takeOffGoods_ = Collections.unmodifiableList(this.takeOffGoods_);
                  this.bitField0_ &= -2;
               }

               result.takeOffGoods_ = this.takeOffGoods_;
            } else {
               result.takeOffGoods_ = this.takeOffGoodsBuilder_.build();
            }

            if (this.unGetGoodsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.unGetGoods_ = Collections.unmodifiableList(this.unGetGoods_);
                  this.bitField0_ &= -3;
               }

               result.unGetGoods_ = this.unGetGoods_;
            } else {
               result.unGetGoods_ = this.unGetGoodsBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_UploadOffGoods_23321) {
               return this.mergeFrom((S2CR_UploadOffGoods_23321)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadOffGoods_23321 other) {
            if (other == CrossMartMsg.S2CR_UploadOffGoods_23321.getDefaultInstance()) {
               return this;
            } else {
               if (this.takeOffGoodsBuilder_ == null) {
                  if (!other.takeOffGoods_.isEmpty()) {
                     if (this.takeOffGoods_.isEmpty()) {
                        this.takeOffGoods_ = other.takeOffGoods_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTakeOffGoodsIsMutable();
                        this.takeOffGoods_.addAll(other.takeOffGoods_);
                     }

                     this.onChanged();
                  }
               } else if (!other.takeOffGoods_.isEmpty()) {
                  if (this.takeOffGoodsBuilder_.isEmpty()) {
                     this.takeOffGoodsBuilder_.dispose();
                     this.takeOffGoodsBuilder_ = null;
                     this.takeOffGoods_ = other.takeOffGoods_;
                     this.bitField0_ &= -2;
                     this.takeOffGoodsBuilder_ = CrossMartMsg.S2CR_UploadOffGoods_23321.alwaysUseFieldBuilders ? this.getTakeOffGoodsFieldBuilder() : null;
                  } else {
                     this.takeOffGoodsBuilder_.addAllMessages(other.takeOffGoods_);
                  }
               }

               if (this.unGetGoodsBuilder_ == null) {
                  if (!other.unGetGoods_.isEmpty()) {
                     if (this.unGetGoods_.isEmpty()) {
                        this.unGetGoods_ = other.unGetGoods_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureUnGetGoodsIsMutable();
                        this.unGetGoods_.addAll(other.unGetGoods_);
                     }

                     this.onChanged();
                  }
               } else if (!other.unGetGoods_.isEmpty()) {
                  if (this.unGetGoodsBuilder_.isEmpty()) {
                     this.unGetGoodsBuilder_.dispose();
                     this.unGetGoodsBuilder_ = null;
                     this.unGetGoods_ = other.unGetGoods_;
                     this.bitField0_ &= -3;
                     this.unGetGoodsBuilder_ = CrossMartMsg.S2CR_UploadOffGoods_23321.alwaysUseFieldBuilders ? this.getUnGetGoodsFieldBuilder() : null;
                  } else {
                     this.unGetGoodsBuilder_.addAllMessages(other.unGetGoods_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTakeOffGoodsCount(); ++i) {
               if (!this.getTakeOffGoods(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getUnGetGoodsCount(); ++i) {
               if (!this.getUnGetGoods(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadOffGoods_23321 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadOffGoods_23321)CrossMartMsg.S2CR_UploadOffGoods_23321.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadOffGoods_23321)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTakeOffGoodsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.takeOffGoods_ = new ArrayList(this.takeOffGoods_);
               this.bitField0_ |= 1;
            }

         }

         public List<MartMsg.Goods> getTakeOffGoodsList() {
            return this.takeOffGoodsBuilder_ == null ? Collections.unmodifiableList(this.takeOffGoods_) : this.takeOffGoodsBuilder_.getMessageList();
         }

         public int getTakeOffGoodsCount() {
            return this.takeOffGoodsBuilder_ == null ? this.takeOffGoods_.size() : this.takeOffGoodsBuilder_.getCount();
         }

         public MartMsg.Goods getTakeOffGoods(int index) {
            return this.takeOffGoodsBuilder_ == null ? (MartMsg.Goods)this.takeOffGoods_.get(index) : (MartMsg.Goods)this.takeOffGoodsBuilder_.getMessage(index);
         }

         public Builder setTakeOffGoods(int index, MartMsg.Goods value) {
            if (this.takeOffGoodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTakeOffGoodsIsMutable();
               this.takeOffGoods_.set(index, value);
               this.onChanged();
            } else {
               this.takeOffGoodsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTakeOffGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.takeOffGoodsBuilder_ == null) {
               this.ensureTakeOffGoodsIsMutable();
               this.takeOffGoods_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.takeOffGoodsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTakeOffGoods(MartMsg.Goods value) {
            if (this.takeOffGoodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTakeOffGoodsIsMutable();
               this.takeOffGoods_.add(value);
               this.onChanged();
            } else {
               this.takeOffGoodsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTakeOffGoods(int index, MartMsg.Goods value) {
            if (this.takeOffGoodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTakeOffGoodsIsMutable();
               this.takeOffGoods_.add(index, value);
               this.onChanged();
            } else {
               this.takeOffGoodsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTakeOffGoods(MartMsg.Goods.Builder builderForValue) {
            if (this.takeOffGoodsBuilder_ == null) {
               this.ensureTakeOffGoodsIsMutable();
               this.takeOffGoods_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.takeOffGoodsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTakeOffGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.takeOffGoodsBuilder_ == null) {
               this.ensureTakeOffGoodsIsMutable();
               this.takeOffGoods_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.takeOffGoodsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTakeOffGoods(Iterable<? extends MartMsg.Goods> values) {
            if (this.takeOffGoodsBuilder_ == null) {
               this.ensureTakeOffGoodsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takeOffGoods_);
               this.onChanged();
            } else {
               this.takeOffGoodsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTakeOffGoods() {
            if (this.takeOffGoodsBuilder_ == null) {
               this.takeOffGoods_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.takeOffGoodsBuilder_.clear();
            }

            return this;
         }

         public Builder removeTakeOffGoods(int index) {
            if (this.takeOffGoodsBuilder_ == null) {
               this.ensureTakeOffGoodsIsMutable();
               this.takeOffGoods_.remove(index);
               this.onChanged();
            } else {
               this.takeOffGoodsBuilder_.remove(index);
            }

            return this;
         }

         public MartMsg.Goods.Builder getTakeOffGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getTakeOffGoodsFieldBuilder().getBuilder(index);
         }

         public MartMsg.GoodsOrBuilder getTakeOffGoodsOrBuilder(int index) {
            return this.takeOffGoodsBuilder_ == null ? (MartMsg.GoodsOrBuilder)this.takeOffGoods_.get(index) : (MartMsg.GoodsOrBuilder)this.takeOffGoodsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MartMsg.GoodsOrBuilder> getTakeOffGoodsOrBuilderList() {
            return this.takeOffGoodsBuilder_ != null ? this.takeOffGoodsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.takeOffGoods_);
         }

         public MartMsg.Goods.Builder addTakeOffGoodsBuilder() {
            return (MartMsg.Goods.Builder)this.getTakeOffGoodsFieldBuilder().addBuilder(MartMsg.Goods.getDefaultInstance());
         }

         public MartMsg.Goods.Builder addTakeOffGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getTakeOffGoodsFieldBuilder().addBuilder(index, MartMsg.Goods.getDefaultInstance());
         }

         public List<MartMsg.Goods.Builder> getTakeOffGoodsBuilderList() {
            return this.getTakeOffGoodsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> getTakeOffGoodsFieldBuilder() {
            if (this.takeOffGoodsBuilder_ == null) {
               this.takeOffGoodsBuilder_ = new RepeatedFieldBuilderV3(this.takeOffGoods_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.takeOffGoods_ = null;
            }

            return this.takeOffGoodsBuilder_;
         }

         private void ensureUnGetGoodsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.unGetGoods_ = new ArrayList(this.unGetGoods_);
               this.bitField0_ |= 2;
            }

         }

         public List<MartMsg.Goods> getUnGetGoodsList() {
            return this.unGetGoodsBuilder_ == null ? Collections.unmodifiableList(this.unGetGoods_) : this.unGetGoodsBuilder_.getMessageList();
         }

         public int getUnGetGoodsCount() {
            return this.unGetGoodsBuilder_ == null ? this.unGetGoods_.size() : this.unGetGoodsBuilder_.getCount();
         }

         public MartMsg.Goods getUnGetGoods(int index) {
            return this.unGetGoodsBuilder_ == null ? (MartMsg.Goods)this.unGetGoods_.get(index) : (MartMsg.Goods)this.unGetGoodsBuilder_.getMessage(index);
         }

         public Builder setUnGetGoods(int index, MartMsg.Goods value) {
            if (this.unGetGoodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUnGetGoodsIsMutable();
               this.unGetGoods_.set(index, value);
               this.onChanged();
            } else {
               this.unGetGoodsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setUnGetGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.unGetGoodsBuilder_ == null) {
               this.ensureUnGetGoodsIsMutable();
               this.unGetGoods_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.unGetGoodsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addUnGetGoods(MartMsg.Goods value) {
            if (this.unGetGoodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUnGetGoodsIsMutable();
               this.unGetGoods_.add(value);
               this.onChanged();
            } else {
               this.unGetGoodsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addUnGetGoods(int index, MartMsg.Goods value) {
            if (this.unGetGoodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUnGetGoodsIsMutable();
               this.unGetGoods_.add(index, value);
               this.onChanged();
            } else {
               this.unGetGoodsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addUnGetGoods(MartMsg.Goods.Builder builderForValue) {
            if (this.unGetGoodsBuilder_ == null) {
               this.ensureUnGetGoodsIsMutable();
               this.unGetGoods_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.unGetGoodsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addUnGetGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.unGetGoodsBuilder_ == null) {
               this.ensureUnGetGoodsIsMutable();
               this.unGetGoods_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.unGetGoodsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllUnGetGoods(Iterable<? extends MartMsg.Goods> values) {
            if (this.unGetGoodsBuilder_ == null) {
               this.ensureUnGetGoodsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.unGetGoods_);
               this.onChanged();
            } else {
               this.unGetGoodsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearUnGetGoods() {
            if (this.unGetGoodsBuilder_ == null) {
               this.unGetGoods_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.unGetGoodsBuilder_.clear();
            }

            return this;
         }

         public Builder removeUnGetGoods(int index) {
            if (this.unGetGoodsBuilder_ == null) {
               this.ensureUnGetGoodsIsMutable();
               this.unGetGoods_.remove(index);
               this.onChanged();
            } else {
               this.unGetGoodsBuilder_.remove(index);
            }

            return this;
         }

         public MartMsg.Goods.Builder getUnGetGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getUnGetGoodsFieldBuilder().getBuilder(index);
         }

         public MartMsg.GoodsOrBuilder getUnGetGoodsOrBuilder(int index) {
            return this.unGetGoodsBuilder_ == null ? (MartMsg.GoodsOrBuilder)this.unGetGoods_.get(index) : (MartMsg.GoodsOrBuilder)this.unGetGoodsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MartMsg.GoodsOrBuilder> getUnGetGoodsOrBuilderList() {
            return this.unGetGoodsBuilder_ != null ? this.unGetGoodsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.unGetGoods_);
         }

         public MartMsg.Goods.Builder addUnGetGoodsBuilder() {
            return (MartMsg.Goods.Builder)this.getUnGetGoodsFieldBuilder().addBuilder(MartMsg.Goods.getDefaultInstance());
         }

         public MartMsg.Goods.Builder addUnGetGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getUnGetGoodsFieldBuilder().addBuilder(index, MartMsg.Goods.getDefaultInstance());
         }

         public List<MartMsg.Goods.Builder> getUnGetGoodsBuilderList() {
            return this.getUnGetGoodsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> getUnGetGoodsFieldBuilder() {
            if (this.unGetGoodsBuilder_ == null) {
               this.unGetGoodsBuilder_ = new RepeatedFieldBuilderV3(this.unGetGoods_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.unGetGoods_ = null;
            }

            return this.unGetGoodsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_ReturnPrices_23324 extends GeneratedMessageV3 implements CR2S_ReturnPrices_23324OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DATA_FIELD_NUMBER = 1;
      private List<ReturnPriceData> data_;
      private byte memoizedIsInitialized;
      private static final CR2S_ReturnPrices_23324 DEFAULT_INSTANCE = new CR2S_ReturnPrices_23324();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ReturnPrices_23324> PARSER = new AbstractParser<CR2S_ReturnPrices_23324>() {
         public CR2S_ReturnPrices_23324 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ReturnPrices_23324(input, extensionRegistry);
         }
      };

      private CR2S_ReturnPrices_23324(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ReturnPrices_23324() {
         this.memoizedIsInitialized = -1;
         this.data_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ReturnPrices_23324();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ReturnPrices_23324(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.data_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.data_.add(input.readMessage(CrossMartMsg.ReturnPriceData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.data_ = Collections.unmodifiableList(this.data_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ReturnPrices_23324.class, Builder.class);
      }

      public List<ReturnPriceData> getDataList() {
         return this.data_;
      }

      public List<? extends ReturnPriceDataOrBuilder> getDataOrBuilderList() {
         return this.data_;
      }

      public int getDataCount() {
         return this.data_.size();
      }

      public ReturnPriceData getData(int index) {
         return (ReturnPriceData)this.data_.get(index);
      }

      public ReturnPriceDataOrBuilder getDataOrBuilder(int index) {
         return (ReturnPriceDataOrBuilder)this.data_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getDataCount(); ++i) {
               if (!this.getData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.data_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.data_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.data_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.data_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ReturnPrices_23324)) {
            return super.equals(obj);
         } else {
            CR2S_ReturnPrices_23324 other = (CR2S_ReturnPrices_23324)obj;
            if (!this.getDataList().equals(other.getDataList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ReturnPrices_23324 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ReturnPrices_23324)PARSER.parseFrom(data);
      }

      public static CR2S_ReturnPrices_23324 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ReturnPrices_23324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ReturnPrices_23324 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ReturnPrices_23324)PARSER.parseFrom(data);
      }

      public static CR2S_ReturnPrices_23324 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ReturnPrices_23324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ReturnPrices_23324 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ReturnPrices_23324)PARSER.parseFrom(data);
      }

      public static CR2S_ReturnPrices_23324 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ReturnPrices_23324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ReturnPrices_23324 parseFrom(InputStream input) throws IOException {
         return (CR2S_ReturnPrices_23324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ReturnPrices_23324 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ReturnPrices_23324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ReturnPrices_23324 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ReturnPrices_23324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ReturnPrices_23324 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ReturnPrices_23324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ReturnPrices_23324 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ReturnPrices_23324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ReturnPrices_23324 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ReturnPrices_23324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ReturnPrices_23324 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ReturnPrices_23324 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ReturnPrices_23324> parser() {
         return PARSER;
      }

      public Parser<CR2S_ReturnPrices_23324> getParserForType() {
         return PARSER;
      }

      public CR2S_ReturnPrices_23324 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ReturnPrices_23324OrBuilder {
         private int bitField0_;
         private List<ReturnPriceData> data_;
         private RepeatedFieldBuilderV3<ReturnPriceData, ReturnPriceData.Builder, ReturnPriceDataOrBuilder> dataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ReturnPrices_23324.class, Builder.class);
         }

         private Builder() {
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_ReturnPrices_23324.alwaysUseFieldBuilders) {
               this.getDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_ReturnPrices_23324_descriptor;
         }

         public CR2S_ReturnPrices_23324 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_ReturnPrices_23324.getDefaultInstance();
         }

         public CR2S_ReturnPrices_23324 build() {
            CR2S_ReturnPrices_23324 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ReturnPrices_23324 buildPartial() {
            CR2S_ReturnPrices_23324 result = new CR2S_ReturnPrices_23324(this);
            int from_bitField0_ = this.bitField0_;
            if (this.dataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.data_ = Collections.unmodifiableList(this.data_);
                  this.bitField0_ &= -2;
               }

               result.data_ = this.data_;
            } else {
               result.data_ = this.dataBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_ReturnPrices_23324) {
               return this.mergeFrom((CR2S_ReturnPrices_23324)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ReturnPrices_23324 other) {
            if (other == CrossMartMsg.CR2S_ReturnPrices_23324.getDefaultInstance()) {
               return this;
            } else {
               if (this.dataBuilder_ == null) {
                  if (!other.data_.isEmpty()) {
                     if (this.data_.isEmpty()) {
                        this.data_ = other.data_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureDataIsMutable();
                        this.data_.addAll(other.data_);
                     }

                     this.onChanged();
                  }
               } else if (!other.data_.isEmpty()) {
                  if (this.dataBuilder_.isEmpty()) {
                     this.dataBuilder_.dispose();
                     this.dataBuilder_ = null;
                     this.data_ = other.data_;
                     this.bitField0_ &= -2;
                     this.dataBuilder_ = CrossMartMsg.CR2S_ReturnPrices_23324.alwaysUseFieldBuilders ? this.getDataFieldBuilder() : null;
                  } else {
                     this.dataBuilder_.addAllMessages(other.data_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getDataCount(); ++i) {
               if (!this.getData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ReturnPrices_23324 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ReturnPrices_23324)CrossMartMsg.CR2S_ReturnPrices_23324.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ReturnPrices_23324)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.data_ = new ArrayList(this.data_);
               this.bitField0_ |= 1;
            }

         }

         public List<ReturnPriceData> getDataList() {
            return this.dataBuilder_ == null ? Collections.unmodifiableList(this.data_) : this.dataBuilder_.getMessageList();
         }

         public int getDataCount() {
            return this.dataBuilder_ == null ? this.data_.size() : this.dataBuilder_.getCount();
         }

         public ReturnPriceData getData(int index) {
            return this.dataBuilder_ == null ? (ReturnPriceData)this.data_.get(index) : (ReturnPriceData)this.dataBuilder_.getMessage(index);
         }

         public Builder setData(int index, ReturnPriceData value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.set(index, value);
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setData(int index, ReturnPriceData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addData(ReturnPriceData value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.add(value);
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addData(int index, ReturnPriceData value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.add(index, value);
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addData(ReturnPriceData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addData(int index, ReturnPriceData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllData(Iterable<? extends ReturnPriceData> values) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.data_);
               this.onChanged();
            } else {
               this.dataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearData() {
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Builder removeData(int index) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.remove(index);
               this.onChanged();
            } else {
               this.dataBuilder_.remove(index);
            }

            return this;
         }

         public ReturnPriceData.Builder getDataBuilder(int index) {
            return (ReturnPriceData.Builder)this.getDataFieldBuilder().getBuilder(index);
         }

         public ReturnPriceDataOrBuilder getDataOrBuilder(int index) {
            return this.dataBuilder_ == null ? (ReturnPriceDataOrBuilder)this.data_.get(index) : (ReturnPriceDataOrBuilder)this.dataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ReturnPriceDataOrBuilder> getDataOrBuilderList() {
            return this.dataBuilder_ != null ? this.dataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
         }

         public ReturnPriceData.Builder addDataBuilder() {
            return (ReturnPriceData.Builder)this.getDataFieldBuilder().addBuilder(CrossMartMsg.ReturnPriceData.getDefaultInstance());
         }

         public ReturnPriceData.Builder addDataBuilder(int index) {
            return (ReturnPriceData.Builder)this.getDataFieldBuilder().addBuilder(index, CrossMartMsg.ReturnPriceData.getDefaultInstance());
         }

         public List<ReturnPriceData.Builder> getDataBuilderList() {
            return this.getDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ReturnPriceData, ReturnPriceData.Builder, ReturnPriceDataOrBuilder> getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
               this.dataBuilder_ = new RepeatedFieldBuilderV3(this.data_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.data_ = null;
            }

            return this.dataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_NotifyDeal_23326 extends GeneratedMessageV3 implements CR2S_NotifyDeal_23326OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMID_FIELD_NUMBER = 1;
      private int itemId_;
      public static final int PRICE_FIELD_NUMBER = 2;
      private int price_;
      public static final int SERVICECHARGE_FIELD_NUMBER = 3;
      private int serviceCharge_;
      private byte memoizedIsInitialized;
      private static final CR2S_NotifyDeal_23326 DEFAULT_INSTANCE = new CR2S_NotifyDeal_23326();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_NotifyDeal_23326> PARSER = new AbstractParser<CR2S_NotifyDeal_23326>() {
         public CR2S_NotifyDeal_23326 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_NotifyDeal_23326(input, extensionRegistry);
         }
      };

      private CR2S_NotifyDeal_23326(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_NotifyDeal_23326() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_NotifyDeal_23326();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_NotifyDeal_23326(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.itemId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.price_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.serviceCharge_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NotifyDeal_23326.class, Builder.class);
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemId() {
         return this.itemId_;
      }

      public boolean hasPrice() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPrice() {
         return this.price_;
      }

      public boolean hasServiceCharge() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getServiceCharge() {
         return this.serviceCharge_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPrice()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServiceCharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.price_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.serviceCharge_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.itemId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.price_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.serviceCharge_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_NotifyDeal_23326)) {
            return super.equals(obj);
         } else {
            CR2S_NotifyDeal_23326 other = (CR2S_NotifyDeal_23326)obj;
            if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
               return false;
            } else if (this.hasPrice() != other.hasPrice()) {
               return false;
            } else if (this.hasPrice() && this.getPrice() != other.getPrice()) {
               return false;
            } else if (this.hasServiceCharge() != other.hasServiceCharge()) {
               return false;
            } else if (this.hasServiceCharge() && this.getServiceCharge() != other.getServiceCharge()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasItemId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemId();
            }

            if (this.hasPrice()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPrice();
            }

            if (this.hasServiceCharge()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getServiceCharge();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_NotifyDeal_23326 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_NotifyDeal_23326)PARSER.parseFrom(data);
      }

      public static CR2S_NotifyDeal_23326 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NotifyDeal_23326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NotifyDeal_23326 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_NotifyDeal_23326)PARSER.parseFrom(data);
      }

      public static CR2S_NotifyDeal_23326 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NotifyDeal_23326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NotifyDeal_23326 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_NotifyDeal_23326)PARSER.parseFrom(data);
      }

      public static CR2S_NotifyDeal_23326 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_NotifyDeal_23326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_NotifyDeal_23326 parseFrom(InputStream input) throws IOException {
         return (CR2S_NotifyDeal_23326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NotifyDeal_23326 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NotifyDeal_23326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NotifyDeal_23326 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_NotifyDeal_23326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_NotifyDeal_23326 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NotifyDeal_23326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_NotifyDeal_23326 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_NotifyDeal_23326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_NotifyDeal_23326 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_NotifyDeal_23326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_NotifyDeal_23326 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_NotifyDeal_23326 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_NotifyDeal_23326> parser() {
         return PARSER;
      }

      public Parser<CR2S_NotifyDeal_23326> getParserForType() {
         return PARSER;
      }

      public CR2S_NotifyDeal_23326 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_NotifyDeal_23326OrBuilder {
         private int bitField0_;
         private int itemId_;
         private int price_;
         private int serviceCharge_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_NotifyDeal_23326.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_NotifyDeal_23326.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemId_ = 0;
            this.bitField0_ &= -2;
            this.price_ = 0;
            this.bitField0_ &= -3;
            this.serviceCharge_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_NotifyDeal_23326_descriptor;
         }

         public CR2S_NotifyDeal_23326 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_NotifyDeal_23326.getDefaultInstance();
         }

         public CR2S_NotifyDeal_23326 build() {
            CR2S_NotifyDeal_23326 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_NotifyDeal_23326 buildPartial() {
            CR2S_NotifyDeal_23326 result = new CR2S_NotifyDeal_23326(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemId_ = this.itemId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.price_ = this.price_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.serviceCharge_ = this.serviceCharge_;
               to_bitField0_ |= 4;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_NotifyDeal_23326) {
               return this.mergeFrom((CR2S_NotifyDeal_23326)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_NotifyDeal_23326 other) {
            if (other == CrossMartMsg.CR2S_NotifyDeal_23326.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
               }

               if (other.hasPrice()) {
                  this.setPrice(other.getPrice());
               }

               if (other.hasServiceCharge()) {
                  this.setServiceCharge(other.getServiceCharge());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasItemId()) {
               return false;
            } else if (!this.hasPrice()) {
               return false;
            } else {
               return this.hasServiceCharge();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_NotifyDeal_23326 parsedMessage = null;

            try {
               parsedMessage = (CR2S_NotifyDeal_23326)CrossMartMsg.CR2S_NotifyDeal_23326.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_NotifyDeal_23326)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemId() {
            return this.itemId_;
         }

         public Builder setItemId(int value) {
            this.bitField0_ |= 1;
            this.itemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemId() {
            this.bitField0_ &= -2;
            this.itemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrice() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPrice() {
            return this.price_;
         }

         public Builder setPrice(int value) {
            this.bitField0_ |= 2;
            this.price_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrice() {
            this.bitField0_ &= -3;
            this.price_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServiceCharge() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getServiceCharge() {
            return this.serviceCharge_;
         }

         public Builder setServiceCharge(int value) {
            this.bitField0_ |= 4;
            this.serviceCharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServiceCharge() {
            this.bitField0_ &= -5;
            this.serviceCharge_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UpdateMartState_23328 extends GeneratedMessageV3 implements CR2S_UpdateMartState_23328OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      private byte memoizedIsInitialized;
      private static final CR2S_UpdateMartState_23328 DEFAULT_INSTANCE = new CR2S_UpdateMartState_23328();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UpdateMartState_23328> PARSER = new AbstractParser<CR2S_UpdateMartState_23328>() {
         public CR2S_UpdateMartState_23328 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UpdateMartState_23328(input, extensionRegistry);
         }
      };

      private CR2S_UpdateMartState_23328(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UpdateMartState_23328() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UpdateMartState_23328();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UpdateMartState_23328(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.state_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateMartState_23328.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.state_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.state_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UpdateMartState_23328)) {
            return super.equals(obj);
         } else {
            CR2S_UpdateMartState_23328 other = (CR2S_UpdateMartState_23328)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UpdateMartState_23328 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMartState_23328)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateMartState_23328 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMartState_23328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateMartState_23328 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMartState_23328)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateMartState_23328 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMartState_23328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateMartState_23328 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMartState_23328)PARSER.parseFrom(data);
      }

      public static CR2S_UpdateMartState_23328 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UpdateMartState_23328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UpdateMartState_23328 parseFrom(InputStream input) throws IOException {
         return (CR2S_UpdateMartState_23328)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateMartState_23328 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateMartState_23328)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateMartState_23328 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UpdateMartState_23328)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UpdateMartState_23328 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateMartState_23328)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UpdateMartState_23328 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UpdateMartState_23328)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UpdateMartState_23328 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UpdateMartState_23328)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UpdateMartState_23328 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UpdateMartState_23328 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UpdateMartState_23328> parser() {
         return PARSER;
      }

      public Parser<CR2S_UpdateMartState_23328> getParserForType() {
         return PARSER;
      }

      public CR2S_UpdateMartState_23328 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UpdateMartState_23328OrBuilder {
         private int bitField0_;
         private int state_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UpdateMartState_23328.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_UpdateMartState_23328.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UpdateMartState_23328_descriptor;
         }

         public CR2S_UpdateMartState_23328 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_UpdateMartState_23328.getDefaultInstance();
         }

         public CR2S_UpdateMartState_23328 build() {
            CR2S_UpdateMartState_23328 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UpdateMartState_23328 buildPartial() {
            CR2S_UpdateMartState_23328 result = new CR2S_UpdateMartState_23328(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 1;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_UpdateMartState_23328) {
               return this.mergeFrom((CR2S_UpdateMartState_23328)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UpdateMartState_23328 other) {
            if (other == CrossMartMsg.CR2S_UpdateMartState_23328.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasState();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UpdateMartState_23328 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UpdateMartState_23328)CrossMartMsg.CR2S_UpdateMartState_23328.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UpdateMartState_23328)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 1;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UnGetGoods_23330 extends GeneratedMessageV3 implements CR2S_UnGetGoods_23330OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GOODS_FIELD_NUMBER = 1;
      private List<MartMsg.Goods> goods_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnGetGoods_23330 DEFAULT_INSTANCE = new CR2S_UnGetGoods_23330();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnGetGoods_23330> PARSER = new AbstractParser<CR2S_UnGetGoods_23330>() {
         public CR2S_UnGetGoods_23330 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnGetGoods_23330(input, extensionRegistry);
         }
      };

      private CR2S_UnGetGoods_23330(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnGetGoods_23330() {
         this.memoizedIsInitialized = -1;
         this.goods_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnGetGoods_23330();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnGetGoods_23330(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.goods_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.goods_.add(input.readMessage(MartMsg.Goods.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnGetGoods_23330.class, Builder.class);
      }

      public List<MartMsg.Goods> getGoodsList() {
         return this.goods_;
      }

      public List<? extends MartMsg.GoodsOrBuilder> getGoodsOrBuilderList() {
         return this.goods_;
      }

      public int getGoodsCount() {
         return this.goods_.size();
      }

      public MartMsg.Goods getGoods(int index) {
         return (MartMsg.Goods)this.goods_.get(index);
      }

      public MartMsg.GoodsOrBuilder getGoodsOrBuilder(int index) {
         return (MartMsg.GoodsOrBuilder)this.goods_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGoodsCount(); ++i) {
               if (!this.getGoods(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.goods_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.goods_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.goods_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.goods_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnGetGoods_23330)) {
            return super.equals(obj);
         } else {
            CR2S_UnGetGoods_23330 other = (CR2S_UnGetGoods_23330)obj;
            if (!this.getGoodsList().equals(other.getGoodsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getGoodsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGoodsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnGetGoods_23330 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnGetGoods_23330)PARSER.parseFrom(data);
      }

      public static CR2S_UnGetGoods_23330 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnGetGoods_23330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnGetGoods_23330 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnGetGoods_23330)PARSER.parseFrom(data);
      }

      public static CR2S_UnGetGoods_23330 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnGetGoods_23330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnGetGoods_23330 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnGetGoods_23330)PARSER.parseFrom(data);
      }

      public static CR2S_UnGetGoods_23330 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnGetGoods_23330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnGetGoods_23330 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnGetGoods_23330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnGetGoods_23330 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnGetGoods_23330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnGetGoods_23330 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnGetGoods_23330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnGetGoods_23330 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnGetGoods_23330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnGetGoods_23330 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnGetGoods_23330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnGetGoods_23330 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnGetGoods_23330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnGetGoods_23330 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnGetGoods_23330 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnGetGoods_23330> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnGetGoods_23330> getParserForType() {
         return PARSER;
      }

      public CR2S_UnGetGoods_23330 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnGetGoods_23330OrBuilder {
         private int bitField0_;
         private List<MartMsg.Goods> goods_;
         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> goodsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnGetGoods_23330.class, Builder.class);
         }

         private Builder() {
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_UnGetGoods_23330.alwaysUseFieldBuilders) {
               this.getGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.goodsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetGoods_23330_descriptor;
         }

         public CR2S_UnGetGoods_23330 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_UnGetGoods_23330.getDefaultInstance();
         }

         public CR2S_UnGetGoods_23330 build() {
            CR2S_UnGetGoods_23330 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnGetGoods_23330 buildPartial() {
            CR2S_UnGetGoods_23330 result = new CR2S_UnGetGoods_23330(this);
            int from_bitField0_ = this.bitField0_;
            if (this.goodsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
                  this.bitField0_ &= -2;
               }

               result.goods_ = this.goods_;
            } else {
               result.goods_ = this.goodsBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_UnGetGoods_23330) {
               return this.mergeFrom((CR2S_UnGetGoods_23330)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnGetGoods_23330 other) {
            if (other == CrossMartMsg.CR2S_UnGetGoods_23330.getDefaultInstance()) {
               return this;
            } else {
               if (this.goodsBuilder_ == null) {
                  if (!other.goods_.isEmpty()) {
                     if (this.goods_.isEmpty()) {
                        this.goods_ = other.goods_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGoodsIsMutable();
                        this.goods_.addAll(other.goods_);
                     }

                     this.onChanged();
                  }
               } else if (!other.goods_.isEmpty()) {
                  if (this.goodsBuilder_.isEmpty()) {
                     this.goodsBuilder_.dispose();
                     this.goodsBuilder_ = null;
                     this.goods_ = other.goods_;
                     this.bitField0_ &= -2;
                     this.goodsBuilder_ = CrossMartMsg.CR2S_UnGetGoods_23330.alwaysUseFieldBuilders ? this.getGoodsFieldBuilder() : null;
                  } else {
                     this.goodsBuilder_.addAllMessages(other.goods_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGoodsCount(); ++i) {
               if (!this.getGoods(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnGetGoods_23330 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnGetGoods_23330)CrossMartMsg.CR2S_UnGetGoods_23330.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnGetGoods_23330)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGoodsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.goods_ = new ArrayList(this.goods_);
               this.bitField0_ |= 1;
            }

         }

         public List<MartMsg.Goods> getGoodsList() {
            return this.goodsBuilder_ == null ? Collections.unmodifiableList(this.goods_) : this.goodsBuilder_.getMessageList();
         }

         public int getGoodsCount() {
            return this.goodsBuilder_ == null ? this.goods_.size() : this.goodsBuilder_.getCount();
         }

         public MartMsg.Goods getGoods(int index) {
            return this.goodsBuilder_ == null ? (MartMsg.Goods)this.goods_.get(index) : (MartMsg.Goods)this.goodsBuilder_.getMessage(index);
         }

         public Builder setGoods(int index, MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.set(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGoods(int index, MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGoods(MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(int index, MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGoods(Iterable<? extends MartMsg.Goods> values) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.goods_);
               this.onChanged();
            } else {
               this.goodsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGoods() {
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.goodsBuilder_.clear();
            }

            return this;
         }

         public Builder removeGoods(int index) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.remove(index);
               this.onChanged();
            } else {
               this.goodsBuilder_.remove(index);
            }

            return this;
         }

         public MartMsg.Goods.Builder getGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().getBuilder(index);
         }

         public MartMsg.GoodsOrBuilder getGoodsOrBuilder(int index) {
            return this.goodsBuilder_ == null ? (MartMsg.GoodsOrBuilder)this.goods_.get(index) : (MartMsg.GoodsOrBuilder)this.goodsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MartMsg.GoodsOrBuilder> getGoodsOrBuilderList() {
            return this.goodsBuilder_ != null ? this.goodsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.goods_);
         }

         public MartMsg.Goods.Builder addGoodsBuilder() {
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().addBuilder(MartMsg.Goods.getDefaultInstance());
         }

         public MartMsg.Goods.Builder addGoodsBuilder(int index) {
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().addBuilder(index, MartMsg.Goods.getDefaultInstance());
         }

         public List<MartMsg.Goods.Builder> getGoodsBuilderList() {
            return this.getGoodsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> getGoodsFieldBuilder() {
            if (this.goodsBuilder_ == null) {
               this.goodsBuilder_ = new RepeatedFieldBuilderV3(this.goods_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.goods_ = null;
            }

            return this.goodsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_UnGetPrices_23332 extends GeneratedMessageV3 implements CR2S_UnGetPrices_23332OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DATA_FIELD_NUMBER = 1;
      private List<ReturnPriceData> data_;
      private byte memoizedIsInitialized;
      private static final CR2S_UnGetPrices_23332 DEFAULT_INSTANCE = new CR2S_UnGetPrices_23332();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UnGetPrices_23332> PARSER = new AbstractParser<CR2S_UnGetPrices_23332>() {
         public CR2S_UnGetPrices_23332 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UnGetPrices_23332(input, extensionRegistry);
         }
      };

      private CR2S_UnGetPrices_23332(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UnGetPrices_23332() {
         this.memoizedIsInitialized = -1;
         this.data_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UnGetPrices_23332();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UnGetPrices_23332(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.data_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.data_.add(input.readMessage(CrossMartMsg.ReturnPriceData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.data_ = Collections.unmodifiableList(this.data_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnGetPrices_23332.class, Builder.class);
      }

      public List<ReturnPriceData> getDataList() {
         return this.data_;
      }

      public List<? extends ReturnPriceDataOrBuilder> getDataOrBuilderList() {
         return this.data_;
      }

      public int getDataCount() {
         return this.data_.size();
      }

      public ReturnPriceData getData(int index) {
         return (ReturnPriceData)this.data_.get(index);
      }

      public ReturnPriceDataOrBuilder getDataOrBuilder(int index) {
         return (ReturnPriceDataOrBuilder)this.data_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getDataCount(); ++i) {
               if (!this.getData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.data_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.data_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.data_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.data_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_UnGetPrices_23332)) {
            return super.equals(obj);
         } else {
            CR2S_UnGetPrices_23332 other = (CR2S_UnGetPrices_23332)obj;
            if (!this.getDataList().equals(other.getDataList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_UnGetPrices_23332 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UnGetPrices_23332)PARSER.parseFrom(data);
      }

      public static CR2S_UnGetPrices_23332 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnGetPrices_23332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnGetPrices_23332 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UnGetPrices_23332)PARSER.parseFrom(data);
      }

      public static CR2S_UnGetPrices_23332 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnGetPrices_23332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnGetPrices_23332 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UnGetPrices_23332)PARSER.parseFrom(data);
      }

      public static CR2S_UnGetPrices_23332 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UnGetPrices_23332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UnGetPrices_23332 parseFrom(InputStream input) throws IOException {
         return (CR2S_UnGetPrices_23332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnGetPrices_23332 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnGetPrices_23332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnGetPrices_23332 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UnGetPrices_23332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UnGetPrices_23332 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnGetPrices_23332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UnGetPrices_23332 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UnGetPrices_23332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UnGetPrices_23332 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UnGetPrices_23332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UnGetPrices_23332 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UnGetPrices_23332 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UnGetPrices_23332> parser() {
         return PARSER;
      }

      public Parser<CR2S_UnGetPrices_23332> getParserForType() {
         return PARSER;
      }

      public CR2S_UnGetPrices_23332 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UnGetPrices_23332OrBuilder {
         private int bitField0_;
         private List<ReturnPriceData> data_;
         private RepeatedFieldBuilderV3<ReturnPriceData, ReturnPriceData.Builder, ReturnPriceDataOrBuilder> dataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UnGetPrices_23332.class, Builder.class);
         }

         private Builder() {
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.data_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_UnGetPrices_23332.alwaysUseFieldBuilders) {
               this.getDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_UnGetPrices_23332_descriptor;
         }

         public CR2S_UnGetPrices_23332 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_UnGetPrices_23332.getDefaultInstance();
         }

         public CR2S_UnGetPrices_23332 build() {
            CR2S_UnGetPrices_23332 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UnGetPrices_23332 buildPartial() {
            CR2S_UnGetPrices_23332 result = new CR2S_UnGetPrices_23332(this);
            int from_bitField0_ = this.bitField0_;
            if (this.dataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.data_ = Collections.unmodifiableList(this.data_);
                  this.bitField0_ &= -2;
               }

               result.data_ = this.data_;
            } else {
               result.data_ = this.dataBuilder_.build();
            }

            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_UnGetPrices_23332) {
               return this.mergeFrom((CR2S_UnGetPrices_23332)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UnGetPrices_23332 other) {
            if (other == CrossMartMsg.CR2S_UnGetPrices_23332.getDefaultInstance()) {
               return this;
            } else {
               if (this.dataBuilder_ == null) {
                  if (!other.data_.isEmpty()) {
                     if (this.data_.isEmpty()) {
                        this.data_ = other.data_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureDataIsMutable();
                        this.data_.addAll(other.data_);
                     }

                     this.onChanged();
                  }
               } else if (!other.data_.isEmpty()) {
                  if (this.dataBuilder_.isEmpty()) {
                     this.dataBuilder_.dispose();
                     this.dataBuilder_ = null;
                     this.data_ = other.data_;
                     this.bitField0_ &= -2;
                     this.dataBuilder_ = CrossMartMsg.CR2S_UnGetPrices_23332.alwaysUseFieldBuilders ? this.getDataFieldBuilder() : null;
                  } else {
                     this.dataBuilder_.addAllMessages(other.data_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getDataCount(); ++i) {
               if (!this.getData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_UnGetPrices_23332 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UnGetPrices_23332)CrossMartMsg.CR2S_UnGetPrices_23332.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UnGetPrices_23332)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.data_ = new ArrayList(this.data_);
               this.bitField0_ |= 1;
            }

         }

         public List<ReturnPriceData> getDataList() {
            return this.dataBuilder_ == null ? Collections.unmodifiableList(this.data_) : this.dataBuilder_.getMessageList();
         }

         public int getDataCount() {
            return this.dataBuilder_ == null ? this.data_.size() : this.dataBuilder_.getCount();
         }

         public ReturnPriceData getData(int index) {
            return this.dataBuilder_ == null ? (ReturnPriceData)this.data_.get(index) : (ReturnPriceData)this.dataBuilder_.getMessage(index);
         }

         public Builder setData(int index, ReturnPriceData value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.set(index, value);
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setData(int index, ReturnPriceData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addData(ReturnPriceData value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.add(value);
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addData(int index, ReturnPriceData value) {
            if (this.dataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataIsMutable();
               this.data_.add(index, value);
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addData(ReturnPriceData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addData(int index, ReturnPriceData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllData(Iterable<? extends ReturnPriceData> values) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.data_);
               this.onChanged();
            } else {
               this.dataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearData() {
            if (this.dataBuilder_ == null) {
               this.data_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.dataBuilder_.clear();
            }

            return this;
         }

         public Builder removeData(int index) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.remove(index);
               this.onChanged();
            } else {
               this.dataBuilder_.remove(index);
            }

            return this;
         }

         public ReturnPriceData.Builder getDataBuilder(int index) {
            return (ReturnPriceData.Builder)this.getDataFieldBuilder().getBuilder(index);
         }

         public ReturnPriceDataOrBuilder getDataOrBuilder(int index) {
            return this.dataBuilder_ == null ? (ReturnPriceDataOrBuilder)this.data_.get(index) : (ReturnPriceDataOrBuilder)this.dataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ReturnPriceDataOrBuilder> getDataOrBuilderList() {
            return this.dataBuilder_ != null ? this.dataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
         }

         public ReturnPriceData.Builder addDataBuilder() {
            return (ReturnPriceData.Builder)this.getDataFieldBuilder().addBuilder(CrossMartMsg.ReturnPriceData.getDefaultInstance());
         }

         public ReturnPriceData.Builder addDataBuilder(int index) {
            return (ReturnPriceData.Builder)this.getDataFieldBuilder().addBuilder(index, CrossMartMsg.ReturnPriceData.getDefaultInstance());
         }

         public List<ReturnPriceData.Builder> getDataBuilderList() {
            return this.getDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ReturnPriceData, ReturnPriceData.Builder, ReturnPriceDataOrBuilder> getDataFieldBuilder() {
            if (this.dataBuilder_ == null) {
               this.dataBuilder_ = new RepeatedFieldBuilderV3(this.data_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.data_ = null;
            }

            return this.dataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_Deal_23334 extends GeneratedMessageV3 implements CR2S_Deal_23334OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOODS_FIELD_NUMBER = 1;
      private MartMsg.Goods goods_;
      private byte memoizedIsInitialized;
      private static final CR2S_Deal_23334 DEFAULT_INSTANCE = new CR2S_Deal_23334();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Deal_23334> PARSER = new AbstractParser<CR2S_Deal_23334>() {
         public CR2S_Deal_23334 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Deal_23334(input, extensionRegistry);
         }
      };

      private CR2S_Deal_23334(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Deal_23334() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Deal_23334();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Deal_23334(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        MartMsg.Goods.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.goods_.toBuilder();
                        }

                        this.goods_ = (MartMsg.Goods)input.readMessage(MartMsg.Goods.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.goods_);
                           this.goods_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Deal_23334.class, Builder.class);
      }

      public boolean hasGoods() {
         return (this.bitField0_ & 1) != 0;
      }

      public MartMsg.Goods getGoods() {
         return this.goods_ == null ? MartMsg.Goods.getDefaultInstance() : this.goods_;
      }

      public MartMsg.GoodsOrBuilder getGoodsOrBuilder() {
         return this.goods_ == null ? MartMsg.Goods.getDefaultInstance() : this.goods_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGoods()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGoods().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGoods());
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(1, this.getGoods());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Deal_23334)) {
            return super.equals(obj);
         } else {
            CR2S_Deal_23334 other = (CR2S_Deal_23334)obj;
            if (this.hasGoods() != other.hasGoods()) {
               return false;
            } else if (this.hasGoods() && !this.getGoods().equals(other.getGoods())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasGoods()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGoods().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Deal_23334 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Deal_23334)PARSER.parseFrom(data);
      }

      public static CR2S_Deal_23334 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Deal_23334)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Deal_23334 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Deal_23334)PARSER.parseFrom(data);
      }

      public static CR2S_Deal_23334 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Deal_23334)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Deal_23334 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Deal_23334)PARSER.parseFrom(data);
      }

      public static CR2S_Deal_23334 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Deal_23334)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Deal_23334 parseFrom(InputStream input) throws IOException {
         return (CR2S_Deal_23334)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Deal_23334 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Deal_23334)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Deal_23334 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Deal_23334)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Deal_23334 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Deal_23334)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Deal_23334 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Deal_23334)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Deal_23334 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Deal_23334)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Deal_23334 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Deal_23334 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Deal_23334> parser() {
         return PARSER;
      }

      public Parser<CR2S_Deal_23334> getParserForType() {
         return PARSER;
      }

      public CR2S_Deal_23334 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Deal_23334OrBuilder {
         private int bitField0_;
         private MartMsg.Goods goods_;
         private SingleFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> goodsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Deal_23334.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_Deal_23334.alwaysUseFieldBuilders) {
               this.getGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.goodsBuilder_ == null) {
               this.goods_ = null;
            } else {
               this.goodsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Deal_23334_descriptor;
         }

         public CR2S_Deal_23334 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_Deal_23334.getDefaultInstance();
         }

         public CR2S_Deal_23334 build() {
            CR2S_Deal_23334 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Deal_23334 buildPartial() {
            CR2S_Deal_23334 result = new CR2S_Deal_23334(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.goodsBuilder_ == null) {
                  result.goods_ = this.goods_;
               } else {
                  result.goods_ = (MartMsg.Goods)this.goodsBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_Deal_23334) {
               return this.mergeFrom((CR2S_Deal_23334)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Deal_23334 other) {
            if (other == CrossMartMsg.CR2S_Deal_23334.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGoods()) {
                  this.mergeGoods(other.getGoods());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGoods()) {
               return false;
            } else {
               return this.getGoods().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Deal_23334 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Deal_23334)CrossMartMsg.CR2S_Deal_23334.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Deal_23334)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGoods() {
            return (this.bitField0_ & 1) != 0;
         }

         public MartMsg.Goods getGoods() {
            if (this.goodsBuilder_ == null) {
               return this.goods_ == null ? MartMsg.Goods.getDefaultInstance() : this.goods_;
            } else {
               return (MartMsg.Goods)this.goodsBuilder_.getMessage();
            }
         }

         public Builder setGoods(MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.goods_ = value;
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGoods(MartMsg.Goods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.goods_ = builderForValue.build();
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGoods(MartMsg.Goods value) {
            if (this.goodsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.goods_ != null && this.goods_ != MartMsg.Goods.getDefaultInstance()) {
                  this.goods_ = MartMsg.Goods.newBuilder(this.goods_).mergeFrom(value).buildPartial();
               } else {
                  this.goods_ = value;
               }

               this.onChanged();
            } else {
               this.goodsBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGoods() {
            if (this.goodsBuilder_ == null) {
               this.goods_ = null;
               this.onChanged();
            } else {
               this.goodsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MartMsg.Goods.Builder getGoodsBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MartMsg.Goods.Builder)this.getGoodsFieldBuilder().getBuilder();
         }

         public MartMsg.GoodsOrBuilder getGoodsOrBuilder() {
            if (this.goodsBuilder_ != null) {
               return (MartMsg.GoodsOrBuilder)this.goodsBuilder_.getMessageOrBuilder();
            } else {
               return this.goods_ == null ? MartMsg.Goods.getDefaultInstance() : this.goods_;
            }
         }

         private SingleFieldBuilderV3<MartMsg.Goods, MartMsg.Goods.Builder, MartMsg.GoodsOrBuilder> getGoodsFieldBuilder() {
            if (this.goodsBuilder_ == null) {
               this.goodsBuilder_ = new SingleFieldBuilderV3(this.getGoods(), this.getParentForChildren(), this.isClean());
               this.goods_ = null;
            }

            return this.goodsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_Hatch_23336 extends GeneratedMessageV3 implements S2CR_Hatch_23336OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HATCHTYPE_FIELD_NUMBER = 1;
      private int hatchType_;
      public static final int PLAYERHATCHNUM_FIELD_NUMBER = 2;
      private long playerHatchNum_;
      public static final int PLAYERQUALITYHATCHNUM_FIELD_NUMBER = 3;
      private List<CommonMsg.MapDataII> playerQualityHatchNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_Hatch_23336 DEFAULT_INSTANCE = new S2CR_Hatch_23336();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Hatch_23336> PARSER = new AbstractParser<S2CR_Hatch_23336>() {
         public S2CR_Hatch_23336 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Hatch_23336(input, extensionRegistry);
         }
      };

      private S2CR_Hatch_23336(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Hatch_23336() {
         this.memoizedIsInitialized = -1;
         this.playerQualityHatchNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Hatch_23336();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Hatch_23336(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.hatchType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerHatchNum_ = input.readInt64();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.playerQualityHatchNum_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.playerQualityHatchNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.playerQualityHatchNum_ = Collections.unmodifiableList(this.playerQualityHatchNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Hatch_23336.class, Builder.class);
      }

      public boolean hasHatchType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHatchType() {
         return this.hatchType_;
      }

      public boolean hasPlayerHatchNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getPlayerHatchNum() {
         return this.playerHatchNum_;
      }

      public List<CommonMsg.MapDataII> getPlayerQualityHatchNumList() {
         return this.playerQualityHatchNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList() {
         return this.playerQualityHatchNum_;
      }

      public int getPlayerQualityHatchNumCount() {
         return this.playerQualityHatchNum_.size();
      }

      public CommonMsg.MapDataII getPlayerQualityHatchNum(int index) {
         return (CommonMsg.MapDataII)this.playerQualityHatchNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNum_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHatchType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerHatchNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPlayerQualityHatchNumCount(); ++i) {
               if (!this.getPlayerQualityHatchNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hatchType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.playerHatchNum_);
         }

         for(int i = 0; i < this.playerQualityHatchNum_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.playerQualityHatchNum_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.hatchType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.playerHatchNum_);
            }

            for(int i = 0; i < this.playerQualityHatchNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.playerQualityHatchNum_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Hatch_23336)) {
            return super.equals(obj);
         } else {
            S2CR_Hatch_23336 other = (S2CR_Hatch_23336)obj;
            if (this.hasHatchType() != other.hasHatchType()) {
               return false;
            } else if (this.hasHatchType() && this.getHatchType() != other.getHatchType()) {
               return false;
            } else if (this.hasPlayerHatchNum() != other.hasPlayerHatchNum()) {
               return false;
            } else if (this.hasPlayerHatchNum() && this.getPlayerHatchNum() != other.getPlayerHatchNum()) {
               return false;
            } else if (!this.getPlayerQualityHatchNumList().equals(other.getPlayerQualityHatchNumList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasHatchType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHatchType();
            }

            if (this.hasPlayerHatchNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getPlayerHatchNum());
            }

            if (this.getPlayerQualityHatchNumCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerQualityHatchNumList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Hatch_23336 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Hatch_23336)PARSER.parseFrom(data);
      }

      public static S2CR_Hatch_23336 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Hatch_23336)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Hatch_23336 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Hatch_23336)PARSER.parseFrom(data);
      }

      public static S2CR_Hatch_23336 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Hatch_23336)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Hatch_23336 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Hatch_23336)PARSER.parseFrom(data);
      }

      public static S2CR_Hatch_23336 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Hatch_23336)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Hatch_23336 parseFrom(InputStream input) throws IOException {
         return (S2CR_Hatch_23336)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Hatch_23336 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Hatch_23336)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Hatch_23336 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Hatch_23336)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Hatch_23336 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Hatch_23336)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Hatch_23336 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Hatch_23336)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Hatch_23336 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Hatch_23336)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Hatch_23336 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Hatch_23336 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Hatch_23336> parser() {
         return PARSER;
      }

      public Parser<S2CR_Hatch_23336> getParserForType() {
         return PARSER;
      }

      public S2CR_Hatch_23336 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Hatch_23336OrBuilder {
         private int bitField0_;
         private int hatchType_;
         private long playerHatchNum_;
         private List<CommonMsg.MapDataII> playerQualityHatchNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> playerQualityHatchNumBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Hatch_23336.class, Builder.class);
         }

         private Builder() {
            this.playerQualityHatchNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerQualityHatchNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.S2CR_Hatch_23336.alwaysUseFieldBuilders) {
               this.getPlayerQualityHatchNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.hatchType_ = 0;
            this.bitField0_ &= -2;
            this.playerHatchNum_ = 0L;
            this.bitField0_ &= -3;
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.playerQualityHatchNumBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_Hatch_23336_descriptor;
         }

         public S2CR_Hatch_23336 getDefaultInstanceForType() {
            return CrossMartMsg.S2CR_Hatch_23336.getDefaultInstance();
         }

         public S2CR_Hatch_23336 build() {
            S2CR_Hatch_23336 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Hatch_23336 buildPartial() {
            S2CR_Hatch_23336 result = new S2CR_Hatch_23336(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hatchType_ = this.hatchType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerHatchNum_ = this.playerHatchNum_;
               to_bitField0_ |= 2;
            }

            if (this.playerQualityHatchNumBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.playerQualityHatchNum_ = Collections.unmodifiableList(this.playerQualityHatchNum_);
                  this.bitField0_ &= -5;
               }

               result.playerQualityHatchNum_ = this.playerQualityHatchNum_;
            } else {
               result.playerQualityHatchNum_ = this.playerQualityHatchNumBuilder_.build();
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_Hatch_23336) {
               return this.mergeFrom((S2CR_Hatch_23336)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Hatch_23336 other) {
            if (other == CrossMartMsg.S2CR_Hatch_23336.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHatchType()) {
                  this.setHatchType(other.getHatchType());
               }

               if (other.hasPlayerHatchNum()) {
                  this.setPlayerHatchNum(other.getPlayerHatchNum());
               }

               if (this.playerQualityHatchNumBuilder_ == null) {
                  if (!other.playerQualityHatchNum_.isEmpty()) {
                     if (this.playerQualityHatchNum_.isEmpty()) {
                        this.playerQualityHatchNum_ = other.playerQualityHatchNum_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensurePlayerQualityHatchNumIsMutable();
                        this.playerQualityHatchNum_.addAll(other.playerQualityHatchNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerQualityHatchNum_.isEmpty()) {
                  if (this.playerQualityHatchNumBuilder_.isEmpty()) {
                     this.playerQualityHatchNumBuilder_.dispose();
                     this.playerQualityHatchNumBuilder_ = null;
                     this.playerQualityHatchNum_ = other.playerQualityHatchNum_;
                     this.bitField0_ &= -5;
                     this.playerQualityHatchNumBuilder_ = CrossMartMsg.S2CR_Hatch_23336.alwaysUseFieldBuilders ? this.getPlayerQualityHatchNumFieldBuilder() : null;
                  } else {
                     this.playerQualityHatchNumBuilder_.addAllMessages(other.playerQualityHatchNum_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHatchType()) {
               return false;
            } else if (!this.hasPlayerHatchNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getPlayerQualityHatchNumCount(); ++i) {
                  if (!this.getPlayerQualityHatchNum(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Hatch_23336 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Hatch_23336)CrossMartMsg.S2CR_Hatch_23336.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Hatch_23336)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHatchType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHatchType() {
            return this.hatchType_;
         }

         public Builder setHatchType(int value) {
            this.bitField0_ |= 1;
            this.hatchType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchType() {
            this.bitField0_ &= -2;
            this.hatchType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerHatchNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getPlayerHatchNum() {
            return this.playerHatchNum_;
         }

         public Builder setPlayerHatchNum(long value) {
            this.bitField0_ |= 2;
            this.playerHatchNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerHatchNum() {
            this.bitField0_ &= -3;
            this.playerHatchNum_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensurePlayerQualityHatchNumIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.playerQualityHatchNum_ = new ArrayList(this.playerQualityHatchNum_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.MapDataII> getPlayerQualityHatchNumList() {
            return this.playerQualityHatchNumBuilder_ == null ? Collections.unmodifiableList(this.playerQualityHatchNum_) : this.playerQualityHatchNumBuilder_.getMessageList();
         }

         public int getPlayerQualityHatchNumCount() {
            return this.playerQualityHatchNumBuilder_ == null ? this.playerQualityHatchNum_.size() : this.playerQualityHatchNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getPlayerQualityHatchNum(int index) {
            return this.playerQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataII)this.playerQualityHatchNum_.get(index) : (CommonMsg.MapDataII)this.playerQualityHatchNumBuilder_.getMessage(index);
         }

         public Builder setPlayerQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.set(index, value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(index, value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerQualityHatchNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerQualityHatchNum_);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerQualityHatchNum() {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerQualityHatchNum(int index) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.remove(index);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getPlayerQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index) {
            return this.playerQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList() {
            return this.playerQualityHatchNumBuilder_ != null ? this.playerQualityHatchNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerQualityHatchNum_);
         }

         public CommonMsg.MapDataII.Builder addPlayerQualityHatchNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addPlayerQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getPlayerQualityHatchNumBuilderList() {
            return this.getPlayerQualityHatchNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumFieldBuilder() {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNumBuilder_ = new RepeatedFieldBuilderV3(this.playerQualityHatchNum_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.playerQualityHatchNum_ = null;
            }

            return this.playerQualityHatchNumBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_Hatch_23337 extends GeneratedMessageV3 implements CR2S_Hatch_23337OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HATCHTYPE_FIELD_NUMBER = 1;
      private int hatchType_;
      public static final int GODBEASTID_FIELD_NUMBER = 2;
      private int godBeastId_;
      public static final int ATTR_FIELD_NUMBER = 3;
      private List<CommonMsg.PropertyInfo> attr_;
      public static final int PLAYERQUALITYHATCHNUM_FIELD_NUMBER = 4;
      private List<CommonMsg.MapDataII> playerQualityHatchNum_;
      public static final int WORLDQUALITYHATCHNUM_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> worldQualityHatchNum_;
      public static final int WORLDQUALITYTRIGGERTIMES_FIELD_NUMBER = 6;
      private List<CommonMsg.MapDataII> worldQualityTriggerTimes_;
      private byte memoizedIsInitialized;
      private static final CR2S_Hatch_23337 DEFAULT_INSTANCE = new CR2S_Hatch_23337();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Hatch_23337> PARSER = new AbstractParser<CR2S_Hatch_23337>() {
         public CR2S_Hatch_23337 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Hatch_23337(input, extensionRegistry);
         }
      };

      private CR2S_Hatch_23337(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Hatch_23337() {
         this.memoizedIsInitialized = -1;
         this.attr_ = Collections.emptyList();
         this.playerQualityHatchNum_ = Collections.emptyList();
         this.worldQualityHatchNum_ = Collections.emptyList();
         this.worldQualityTriggerTimes_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Hatch_23337();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Hatch_23337(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.hatchType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.godBeastId_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.attr_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.attr_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.playerQualityHatchNum_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.playerQualityHatchNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.worldQualityHatchNum_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.worldQualityHatchNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.worldQualityTriggerTimes_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.worldQualityTriggerTimes_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.attr_ = Collections.unmodifiableList(this.attr_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.playerQualityHatchNum_ = Collections.unmodifiableList(this.playerQualityHatchNum_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.worldQualityHatchNum_ = Collections.unmodifiableList(this.worldQualityHatchNum_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.worldQualityTriggerTimes_ = Collections.unmodifiableList(this.worldQualityTriggerTimes_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Hatch_23337.class, Builder.class);
      }

      public boolean hasHatchType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHatchType() {
         return this.hatchType_;
      }

      public boolean hasGodBeastId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGodBeastId() {
         return this.godBeastId_;
      }

      public List<CommonMsg.PropertyInfo> getAttrList() {
         return this.attr_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getAttrOrBuilderList() {
         return this.attr_;
      }

      public int getAttrCount() {
         return this.attr_.size();
      }

      public CommonMsg.PropertyInfo getAttr(int index) {
         return (CommonMsg.PropertyInfo)this.attr_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getAttrOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.attr_.get(index);
      }

      public List<CommonMsg.MapDataII> getPlayerQualityHatchNumList() {
         return this.playerQualityHatchNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList() {
         return this.playerQualityHatchNum_;
      }

      public int getPlayerQualityHatchNumCount() {
         return this.playerQualityHatchNum_.size();
      }

      public CommonMsg.MapDataII getPlayerQualityHatchNum(int index) {
         return (CommonMsg.MapDataII)this.playerQualityHatchNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNum_.get(index);
      }

      public List<CommonMsg.MapDataII> getWorldQualityHatchNumList() {
         return this.worldQualityHatchNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityHatchNumOrBuilderList() {
         return this.worldQualityHatchNum_;
      }

      public int getWorldQualityHatchNumCount() {
         return this.worldQualityHatchNum_.size();
      }

      public CommonMsg.MapDataII getWorldQualityHatchNum(int index) {
         return (CommonMsg.MapDataII)this.worldQualityHatchNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getWorldQualityHatchNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.worldQualityHatchNum_.get(index);
      }

      public List<CommonMsg.MapDataII> getWorldQualityTriggerTimesList() {
         return this.worldQualityTriggerTimes_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityTriggerTimesOrBuilderList() {
         return this.worldQualityTriggerTimes_;
      }

      public int getWorldQualityTriggerTimesCount() {
         return this.worldQualityTriggerTimes_.size();
      }

      public CommonMsg.MapDataII getWorldQualityTriggerTimes(int index) {
         return (CommonMsg.MapDataII)this.worldQualityTriggerTimes_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getWorldQualityTriggerTimesOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.worldQualityTriggerTimes_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHatchType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGodBeastId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAttrCount(); ++i) {
               if (!this.getAttr(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getPlayerQualityHatchNumCount(); ++i) {
               if (!this.getPlayerQualityHatchNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getWorldQualityHatchNumCount(); ++i) {
               if (!this.getWorldQualityHatchNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getWorldQualityTriggerTimesCount(); ++i) {
               if (!this.getWorldQualityTriggerTimes(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hatchType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.godBeastId_);
         }

         for(int i = 0; i < this.attr_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.attr_.get(i));
         }

         for(int i = 0; i < this.playerQualityHatchNum_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.playerQualityHatchNum_.get(i));
         }

         for(int i = 0; i < this.worldQualityHatchNum_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.worldQualityHatchNum_.get(i));
         }

         for(int i = 0; i < this.worldQualityTriggerTimes_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.worldQualityTriggerTimes_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.hatchType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.godBeastId_);
            }

            for(int i = 0; i < this.attr_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.attr_.get(i));
            }

            for(int i = 0; i < this.playerQualityHatchNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.playerQualityHatchNum_.get(i));
            }

            for(int i = 0; i < this.worldQualityHatchNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.worldQualityHatchNum_.get(i));
            }

            for(int i = 0; i < this.worldQualityTriggerTimes_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.worldQualityTriggerTimes_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Hatch_23337)) {
            return super.equals(obj);
         } else {
            CR2S_Hatch_23337 other = (CR2S_Hatch_23337)obj;
            if (this.hasHatchType() != other.hasHatchType()) {
               return false;
            } else if (this.hasHatchType() && this.getHatchType() != other.getHatchType()) {
               return false;
            } else if (this.hasGodBeastId() != other.hasGodBeastId()) {
               return false;
            } else if (this.hasGodBeastId() && this.getGodBeastId() != other.getGodBeastId()) {
               return false;
            } else if (!this.getAttrList().equals(other.getAttrList())) {
               return false;
            } else if (!this.getPlayerQualityHatchNumList().equals(other.getPlayerQualityHatchNumList())) {
               return false;
            } else if (!this.getWorldQualityHatchNumList().equals(other.getWorldQualityHatchNumList())) {
               return false;
            } else if (!this.getWorldQualityTriggerTimesList().equals(other.getWorldQualityTriggerTimesList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasHatchType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHatchType();
            }

            if (this.hasGodBeastId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGodBeastId();
            }

            if (this.getAttrCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAttrList().hashCode();
            }

            if (this.getPlayerQualityHatchNumCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerQualityHatchNumList().hashCode();
            }

            if (this.getWorldQualityHatchNumCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getWorldQualityHatchNumList().hashCode();
            }

            if (this.getWorldQualityTriggerTimesCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getWorldQualityTriggerTimesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Hatch_23337 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Hatch_23337)PARSER.parseFrom(data);
      }

      public static CR2S_Hatch_23337 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Hatch_23337)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Hatch_23337 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Hatch_23337)PARSER.parseFrom(data);
      }

      public static CR2S_Hatch_23337 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Hatch_23337)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Hatch_23337 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Hatch_23337)PARSER.parseFrom(data);
      }

      public static CR2S_Hatch_23337 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Hatch_23337)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Hatch_23337 parseFrom(InputStream input) throws IOException {
         return (CR2S_Hatch_23337)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Hatch_23337 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Hatch_23337)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Hatch_23337 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Hatch_23337)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Hatch_23337 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Hatch_23337)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Hatch_23337 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Hatch_23337)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Hatch_23337 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Hatch_23337)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Hatch_23337 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Hatch_23337 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Hatch_23337> parser() {
         return PARSER;
      }

      public Parser<CR2S_Hatch_23337> getParserForType() {
         return PARSER;
      }

      public CR2S_Hatch_23337 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Hatch_23337OrBuilder {
         private int bitField0_;
         private int hatchType_;
         private int godBeastId_;
         private List<CommonMsg.PropertyInfo> attr_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> attrBuilder_;
         private List<CommonMsg.MapDataII> playerQualityHatchNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> playerQualityHatchNumBuilder_;
         private List<CommonMsg.MapDataII> worldQualityHatchNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> worldQualityHatchNumBuilder_;
         private List<CommonMsg.MapDataII> worldQualityTriggerTimes_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> worldQualityTriggerTimesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Hatch_23337.class, Builder.class);
         }

         private Builder() {
            this.attr_ = Collections.emptyList();
            this.playerQualityHatchNum_ = Collections.emptyList();
            this.worldQualityHatchNum_ = Collections.emptyList();
            this.worldQualityTriggerTimes_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.attr_ = Collections.emptyList();
            this.playerQualityHatchNum_ = Collections.emptyList();
            this.worldQualityHatchNum_ = Collections.emptyList();
            this.worldQualityTriggerTimes_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_Hatch_23337.alwaysUseFieldBuilders) {
               this.getAttrFieldBuilder();
               this.getPlayerQualityHatchNumFieldBuilder();
               this.getWorldQualityHatchNumFieldBuilder();
               this.getWorldQualityTriggerTimesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.hatchType_ = 0;
            this.bitField0_ &= -2;
            this.godBeastId_ = 0;
            this.bitField0_ &= -3;
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.attrBuilder_.clear();
            }

            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.playerQualityHatchNumBuilder_.clear();
            }

            if (this.worldQualityHatchNumBuilder_ == null) {
               this.worldQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.worldQualityHatchNumBuilder_.clear();
            }

            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.worldQualityTriggerTimes_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.worldQualityTriggerTimesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_Hatch_23337_descriptor;
         }

         public CR2S_Hatch_23337 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_Hatch_23337.getDefaultInstance();
         }

         public CR2S_Hatch_23337 build() {
            CR2S_Hatch_23337 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Hatch_23337 buildPartial() {
            CR2S_Hatch_23337 result = new CR2S_Hatch_23337(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hatchType_ = this.hatchType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.godBeastId_ = this.godBeastId_;
               to_bitField0_ |= 2;
            }

            if (this.attrBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.attr_ = Collections.unmodifiableList(this.attr_);
                  this.bitField0_ &= -5;
               }

               result.attr_ = this.attr_;
            } else {
               result.attr_ = this.attrBuilder_.build();
            }

            if (this.playerQualityHatchNumBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.playerQualityHatchNum_ = Collections.unmodifiableList(this.playerQualityHatchNum_);
                  this.bitField0_ &= -9;
               }

               result.playerQualityHatchNum_ = this.playerQualityHatchNum_;
            } else {
               result.playerQualityHatchNum_ = this.playerQualityHatchNumBuilder_.build();
            }

            if (this.worldQualityHatchNumBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.worldQualityHatchNum_ = Collections.unmodifiableList(this.worldQualityHatchNum_);
                  this.bitField0_ &= -17;
               }

               result.worldQualityHatchNum_ = this.worldQualityHatchNum_;
            } else {
               result.worldQualityHatchNum_ = this.worldQualityHatchNumBuilder_.build();
            }

            if (this.worldQualityTriggerTimesBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.worldQualityTriggerTimes_ = Collections.unmodifiableList(this.worldQualityTriggerTimes_);
                  this.bitField0_ &= -33;
               }

               result.worldQualityTriggerTimes_ = this.worldQualityTriggerTimes_;
            } else {
               result.worldQualityTriggerTimes_ = this.worldQualityTriggerTimesBuilder_.build();
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_Hatch_23337) {
               return this.mergeFrom((CR2S_Hatch_23337)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Hatch_23337 other) {
            if (other == CrossMartMsg.CR2S_Hatch_23337.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHatchType()) {
                  this.setHatchType(other.getHatchType());
               }

               if (other.hasGodBeastId()) {
                  this.setGodBeastId(other.getGodBeastId());
               }

               if (this.attrBuilder_ == null) {
                  if (!other.attr_.isEmpty()) {
                     if (this.attr_.isEmpty()) {
                        this.attr_ = other.attr_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureAttrIsMutable();
                        this.attr_.addAll(other.attr_);
                     }

                     this.onChanged();
                  }
               } else if (!other.attr_.isEmpty()) {
                  if (this.attrBuilder_.isEmpty()) {
                     this.attrBuilder_.dispose();
                     this.attrBuilder_ = null;
                     this.attr_ = other.attr_;
                     this.bitField0_ &= -5;
                     this.attrBuilder_ = CrossMartMsg.CR2S_Hatch_23337.alwaysUseFieldBuilders ? this.getAttrFieldBuilder() : null;
                  } else {
                     this.attrBuilder_.addAllMessages(other.attr_);
                  }
               }

               if (this.playerQualityHatchNumBuilder_ == null) {
                  if (!other.playerQualityHatchNum_.isEmpty()) {
                     if (this.playerQualityHatchNum_.isEmpty()) {
                        this.playerQualityHatchNum_ = other.playerQualityHatchNum_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensurePlayerQualityHatchNumIsMutable();
                        this.playerQualityHatchNum_.addAll(other.playerQualityHatchNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerQualityHatchNum_.isEmpty()) {
                  if (this.playerQualityHatchNumBuilder_.isEmpty()) {
                     this.playerQualityHatchNumBuilder_.dispose();
                     this.playerQualityHatchNumBuilder_ = null;
                     this.playerQualityHatchNum_ = other.playerQualityHatchNum_;
                     this.bitField0_ &= -9;
                     this.playerQualityHatchNumBuilder_ = CrossMartMsg.CR2S_Hatch_23337.alwaysUseFieldBuilders ? this.getPlayerQualityHatchNumFieldBuilder() : null;
                  } else {
                     this.playerQualityHatchNumBuilder_.addAllMessages(other.playerQualityHatchNum_);
                  }
               }

               if (this.worldQualityHatchNumBuilder_ == null) {
                  if (!other.worldQualityHatchNum_.isEmpty()) {
                     if (this.worldQualityHatchNum_.isEmpty()) {
                        this.worldQualityHatchNum_ = other.worldQualityHatchNum_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureWorldQualityHatchNumIsMutable();
                        this.worldQualityHatchNum_.addAll(other.worldQualityHatchNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.worldQualityHatchNum_.isEmpty()) {
                  if (this.worldQualityHatchNumBuilder_.isEmpty()) {
                     this.worldQualityHatchNumBuilder_.dispose();
                     this.worldQualityHatchNumBuilder_ = null;
                     this.worldQualityHatchNum_ = other.worldQualityHatchNum_;
                     this.bitField0_ &= -17;
                     this.worldQualityHatchNumBuilder_ = CrossMartMsg.CR2S_Hatch_23337.alwaysUseFieldBuilders ? this.getWorldQualityHatchNumFieldBuilder() : null;
                  } else {
                     this.worldQualityHatchNumBuilder_.addAllMessages(other.worldQualityHatchNum_);
                  }
               }

               if (this.worldQualityTriggerTimesBuilder_ == null) {
                  if (!other.worldQualityTriggerTimes_.isEmpty()) {
                     if (this.worldQualityTriggerTimes_.isEmpty()) {
                        this.worldQualityTriggerTimes_ = other.worldQualityTriggerTimes_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureWorldQualityTriggerTimesIsMutable();
                        this.worldQualityTriggerTimes_.addAll(other.worldQualityTriggerTimes_);
                     }

                     this.onChanged();
                  }
               } else if (!other.worldQualityTriggerTimes_.isEmpty()) {
                  if (this.worldQualityTriggerTimesBuilder_.isEmpty()) {
                     this.worldQualityTriggerTimesBuilder_.dispose();
                     this.worldQualityTriggerTimesBuilder_ = null;
                     this.worldQualityTriggerTimes_ = other.worldQualityTriggerTimes_;
                     this.bitField0_ &= -33;
                     this.worldQualityTriggerTimesBuilder_ = CrossMartMsg.CR2S_Hatch_23337.alwaysUseFieldBuilders ? this.getWorldQualityTriggerTimesFieldBuilder() : null;
                  } else {
                     this.worldQualityTriggerTimesBuilder_.addAllMessages(other.worldQualityTriggerTimes_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHatchType()) {
               return false;
            } else if (!this.hasGodBeastId()) {
               return false;
            } else {
               for(int i = 0; i < this.getAttrCount(); ++i) {
                  if (!this.getAttr(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getPlayerQualityHatchNumCount(); ++i) {
                  if (!this.getPlayerQualityHatchNum(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getWorldQualityHatchNumCount(); ++i) {
                  if (!this.getWorldQualityHatchNum(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getWorldQualityTriggerTimesCount(); ++i) {
                  if (!this.getWorldQualityTriggerTimes(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Hatch_23337 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Hatch_23337)CrossMartMsg.CR2S_Hatch_23337.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Hatch_23337)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHatchType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHatchType() {
            return this.hatchType_;
         }

         public Builder setHatchType(int value) {
            this.bitField0_ |= 1;
            this.hatchType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchType() {
            this.bitField0_ &= -2;
            this.hatchType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGodBeastId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGodBeastId() {
            return this.godBeastId_;
         }

         public Builder setGodBeastId(int value) {
            this.bitField0_ |= 2;
            this.godBeastId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGodBeastId() {
            this.bitField0_ &= -3;
            this.godBeastId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAttrIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.attr_ = new ArrayList(this.attr_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.PropertyInfo> getAttrList() {
            return this.attrBuilder_ == null ? Collections.unmodifiableList(this.attr_) : this.attrBuilder_.getMessageList();
         }

         public int getAttrCount() {
            return this.attrBuilder_ == null ? this.attr_.size() : this.attrBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getAttr(int index) {
            return this.attrBuilder_ == null ? (CommonMsg.PropertyInfo)this.attr_.get(index) : (CommonMsg.PropertyInfo)this.attrBuilder_.getMessage(index);
         }

         public Builder setAttr(int index, CommonMsg.PropertyInfo value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.set(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAttr(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(CommonMsg.PropertyInfo value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAttr(int index, CommonMsg.PropertyInfo value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAttr(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAttr(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.attr_);
               this.onChanged();
            } else {
               this.attrBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAttr() {
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.attrBuilder_.clear();
            }

            return this;
         }

         public Builder removeAttr(int index) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.remove(index);
               this.onChanged();
            } else {
               this.attrBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getAttrBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getAttrFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getAttrOrBuilder(int index) {
            return this.attrBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.attr_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.attrBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getAttrOrBuilderList() {
            return this.attrBuilder_ != null ? this.attrBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.attr_);
         }

         public CommonMsg.PropertyInfo.Builder addAttrBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getAttrFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addAttrBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getAttrFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getAttrBuilderList() {
            return this.getAttrFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getAttrFieldBuilder() {
            if (this.attrBuilder_ == null) {
               this.attrBuilder_ = new RepeatedFieldBuilderV3(this.attr_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.attr_ = null;
            }

            return this.attrBuilder_;
         }

         private void ensurePlayerQualityHatchNumIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.playerQualityHatchNum_ = new ArrayList(this.playerQualityHatchNum_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.MapDataII> getPlayerQualityHatchNumList() {
            return this.playerQualityHatchNumBuilder_ == null ? Collections.unmodifiableList(this.playerQualityHatchNum_) : this.playerQualityHatchNumBuilder_.getMessageList();
         }

         public int getPlayerQualityHatchNumCount() {
            return this.playerQualityHatchNumBuilder_ == null ? this.playerQualityHatchNum_.size() : this.playerQualityHatchNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getPlayerQualityHatchNum(int index) {
            return this.playerQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataII)this.playerQualityHatchNum_.get(index) : (CommonMsg.MapDataII)this.playerQualityHatchNumBuilder_.getMessage(index);
         }

         public Builder setPlayerQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.set(index, value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(index, value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerQualityHatchNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerQualityHatchNum_);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerQualityHatchNum() {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerQualityHatchNum(int index) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.remove(index);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getPlayerQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index) {
            return this.playerQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList() {
            return this.playerQualityHatchNumBuilder_ != null ? this.playerQualityHatchNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerQualityHatchNum_);
         }

         public CommonMsg.MapDataII.Builder addPlayerQualityHatchNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addPlayerQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getPlayerQualityHatchNumBuilderList() {
            return this.getPlayerQualityHatchNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumFieldBuilder() {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNumBuilder_ = new RepeatedFieldBuilderV3(this.playerQualityHatchNum_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.playerQualityHatchNum_ = null;
            }

            return this.playerQualityHatchNumBuilder_;
         }

         private void ensureWorldQualityHatchNumIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.worldQualityHatchNum_ = new ArrayList(this.worldQualityHatchNum_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getWorldQualityHatchNumList() {
            return this.worldQualityHatchNumBuilder_ == null ? Collections.unmodifiableList(this.worldQualityHatchNum_) : this.worldQualityHatchNumBuilder_.getMessageList();
         }

         public int getWorldQualityHatchNumCount() {
            return this.worldQualityHatchNumBuilder_ == null ? this.worldQualityHatchNum_.size() : this.worldQualityHatchNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getWorldQualityHatchNum(int index) {
            return this.worldQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataII)this.worldQualityHatchNum_.get(index) : (CommonMsg.MapDataII)this.worldQualityHatchNumBuilder_.getMessage(index);
         }

         public Builder setWorldQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.set(index, value);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWorldQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWorldQualityHatchNum(CommonMsg.MapDataII value) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.add(value);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWorldQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.add(index, value);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWorldQualityHatchNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWorldQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWorldQualityHatchNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.worldQualityHatchNum_);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWorldQualityHatchNum() {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.worldQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeWorldQualityHatchNum(int index) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.remove(index);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getWorldQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityHatchNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getWorldQualityHatchNumOrBuilder(int index) {
            return this.worldQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.worldQualityHatchNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.worldQualityHatchNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityHatchNumOrBuilderList() {
            return this.worldQualityHatchNumBuilder_ != null ? this.worldQualityHatchNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.worldQualityHatchNum_);
         }

         public CommonMsg.MapDataII.Builder addWorldQualityHatchNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityHatchNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addWorldQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityHatchNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getWorldQualityHatchNumBuilderList() {
            return this.getWorldQualityHatchNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getWorldQualityHatchNumFieldBuilder() {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.worldQualityHatchNumBuilder_ = new RepeatedFieldBuilderV3(this.worldQualityHatchNum_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.worldQualityHatchNum_ = null;
            }

            return this.worldQualityHatchNumBuilder_;
         }

         private void ensureWorldQualityTriggerTimesIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.worldQualityTriggerTimes_ = new ArrayList(this.worldQualityTriggerTimes_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.MapDataII> getWorldQualityTriggerTimesList() {
            return this.worldQualityTriggerTimesBuilder_ == null ? Collections.unmodifiableList(this.worldQualityTriggerTimes_) : this.worldQualityTriggerTimesBuilder_.getMessageList();
         }

         public int getWorldQualityTriggerTimesCount() {
            return this.worldQualityTriggerTimesBuilder_ == null ? this.worldQualityTriggerTimes_.size() : this.worldQualityTriggerTimesBuilder_.getCount();
         }

         public CommonMsg.MapDataII getWorldQualityTriggerTimes(int index) {
            return this.worldQualityTriggerTimesBuilder_ == null ? (CommonMsg.MapDataII)this.worldQualityTriggerTimes_.get(index) : (CommonMsg.MapDataII)this.worldQualityTriggerTimesBuilder_.getMessage(index);
         }

         public Builder setWorldQualityTriggerTimes(int index, CommonMsg.MapDataII value) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.set(index, value);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWorldQualityTriggerTimes(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWorldQualityTriggerTimes(CommonMsg.MapDataII value) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.add(value);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWorldQualityTriggerTimes(int index, CommonMsg.MapDataII value) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.add(index, value);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWorldQualityTriggerTimes(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWorldQualityTriggerTimes(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWorldQualityTriggerTimes(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.worldQualityTriggerTimes_);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWorldQualityTriggerTimes() {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.worldQualityTriggerTimes_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.clear();
            }

            return this;
         }

         public Builder removeWorldQualityTriggerTimes(int index) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.remove(index);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getWorldQualityTriggerTimesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityTriggerTimesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getWorldQualityTriggerTimesOrBuilder(int index) {
            return this.worldQualityTriggerTimesBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.worldQualityTriggerTimes_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.worldQualityTriggerTimesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityTriggerTimesOrBuilderList() {
            return this.worldQualityTriggerTimesBuilder_ != null ? this.worldQualityTriggerTimesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.worldQualityTriggerTimes_);
         }

         public CommonMsg.MapDataII.Builder addWorldQualityTriggerTimesBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityTriggerTimesFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addWorldQualityTriggerTimesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityTriggerTimesFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getWorldQualityTriggerTimesBuilderList() {
            return this.getWorldQualityTriggerTimesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getWorldQualityTriggerTimesFieldBuilder() {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.worldQualityTriggerTimesBuilder_ = new RepeatedFieldBuilderV3(this.worldQualityTriggerTimes_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.worldQualityTriggerTimes_ = null;
            }

            return this.worldQualityTriggerTimesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_BatchHatch_23338 extends GeneratedMessageV3 implements S2CR_BatchHatch_23338OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HATCHTYPE_FIELD_NUMBER = 1;
      private int hatchType_;
      public static final int PLAYERHATCHNUM_FIELD_NUMBER = 2;
      private long playerHatchNum_;
      public static final int PLAYERQUALITYHATCHNUM_FIELD_NUMBER = 3;
      private List<CommonMsg.MapDataII> playerQualityHatchNum_;
      public static final int HATCHCOUNT_FIELD_NUMBER = 4;
      private int hatchCount_;
      public static final int ISPOINTLOG_FIELD_NUMBER = 5;
      private boolean isPointLog_;
      private byte memoizedIsInitialized;
      private static final S2CR_BatchHatch_23338 DEFAULT_INSTANCE = new S2CR_BatchHatch_23338();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_BatchHatch_23338> PARSER = new AbstractParser<S2CR_BatchHatch_23338>() {
         public S2CR_BatchHatch_23338 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_BatchHatch_23338(input, extensionRegistry);
         }
      };

      private S2CR_BatchHatch_23338(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_BatchHatch_23338() {
         this.memoizedIsInitialized = -1;
         this.playerQualityHatchNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_BatchHatch_23338();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_BatchHatch_23338(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.hatchType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerHatchNum_ = input.readInt64();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.playerQualityHatchNum_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.playerQualityHatchNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.hatchCount_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.isPointLog_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.playerQualityHatchNum_ = Collections.unmodifiableList(this.playerQualityHatchNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BatchHatch_23338.class, Builder.class);
      }

      public boolean hasHatchType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHatchType() {
         return this.hatchType_;
      }

      public boolean hasPlayerHatchNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getPlayerHatchNum() {
         return this.playerHatchNum_;
      }

      public List<CommonMsg.MapDataII> getPlayerQualityHatchNumList() {
         return this.playerQualityHatchNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList() {
         return this.playerQualityHatchNum_;
      }

      public int getPlayerQualityHatchNumCount() {
         return this.playerQualityHatchNum_.size();
      }

      public CommonMsg.MapDataII getPlayerQualityHatchNum(int index) {
         return (CommonMsg.MapDataII)this.playerQualityHatchNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNum_.get(index);
      }

      public boolean hasHatchCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHatchCount() {
         return this.hatchCount_;
      }

      public boolean hasIsPointLog() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsPointLog() {
         return this.isPointLog_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHatchType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerHatchNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHatchCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsPointLog()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPlayerQualityHatchNumCount(); ++i) {
               if (!this.getPlayerQualityHatchNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hatchType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.playerHatchNum_);
         }

         for(int i = 0; i < this.playerQualityHatchNum_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.playerQualityHatchNum_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.hatchCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(5, this.isPointLog_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.hatchType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.playerHatchNum_);
            }

            for(int i = 0; i < this.playerQualityHatchNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.playerQualityHatchNum_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.hatchCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.isPointLog_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_BatchHatch_23338)) {
            return super.equals(obj);
         } else {
            S2CR_BatchHatch_23338 other = (S2CR_BatchHatch_23338)obj;
            if (this.hasHatchType() != other.hasHatchType()) {
               return false;
            } else if (this.hasHatchType() && this.getHatchType() != other.getHatchType()) {
               return false;
            } else if (this.hasPlayerHatchNum() != other.hasPlayerHatchNum()) {
               return false;
            } else if (this.hasPlayerHatchNum() && this.getPlayerHatchNum() != other.getPlayerHatchNum()) {
               return false;
            } else if (!this.getPlayerQualityHatchNumList().equals(other.getPlayerQualityHatchNumList())) {
               return false;
            } else if (this.hasHatchCount() != other.hasHatchCount()) {
               return false;
            } else if (this.hasHatchCount() && this.getHatchCount() != other.getHatchCount()) {
               return false;
            } else if (this.hasIsPointLog() != other.hasIsPointLog()) {
               return false;
            } else if (this.hasIsPointLog() && this.getIsPointLog() != other.getIsPointLog()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasHatchType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHatchType();
            }

            if (this.hasPlayerHatchNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getPlayerHatchNum());
            }

            if (this.getPlayerQualityHatchNumCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerQualityHatchNumList().hashCode();
            }

            if (this.hasHatchCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHatchCount();
            }

            if (this.hasIsPointLog()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getIsPointLog());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_BatchHatch_23338 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_BatchHatch_23338)PARSER.parseFrom(data);
      }

      public static S2CR_BatchHatch_23338 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BatchHatch_23338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BatchHatch_23338 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_BatchHatch_23338)PARSER.parseFrom(data);
      }

      public static S2CR_BatchHatch_23338 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BatchHatch_23338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BatchHatch_23338 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_BatchHatch_23338)PARSER.parseFrom(data);
      }

      public static S2CR_BatchHatch_23338 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_BatchHatch_23338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_BatchHatch_23338 parseFrom(InputStream input) throws IOException {
         return (S2CR_BatchHatch_23338)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BatchHatch_23338 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BatchHatch_23338)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BatchHatch_23338 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_BatchHatch_23338)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_BatchHatch_23338 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BatchHatch_23338)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_BatchHatch_23338 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_BatchHatch_23338)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_BatchHatch_23338 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_BatchHatch_23338)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_BatchHatch_23338 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_BatchHatch_23338 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_BatchHatch_23338> parser() {
         return PARSER;
      }

      public Parser<S2CR_BatchHatch_23338> getParserForType() {
         return PARSER;
      }

      public S2CR_BatchHatch_23338 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_BatchHatch_23338OrBuilder {
         private int bitField0_;
         private int hatchType_;
         private long playerHatchNum_;
         private List<CommonMsg.MapDataII> playerQualityHatchNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> playerQualityHatchNumBuilder_;
         private int hatchCount_;
         private boolean isPointLog_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_BatchHatch_23338.class, Builder.class);
         }

         private Builder() {
            this.playerQualityHatchNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerQualityHatchNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.S2CR_BatchHatch_23338.alwaysUseFieldBuilders) {
               this.getPlayerQualityHatchNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.hatchType_ = 0;
            this.bitField0_ &= -2;
            this.playerHatchNum_ = 0L;
            this.bitField0_ &= -3;
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.playerQualityHatchNumBuilder_.clear();
            }

            this.hatchCount_ = 0;
            this.bitField0_ &= -9;
            this.isPointLog_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_BatchHatch_23338_descriptor;
         }

         public S2CR_BatchHatch_23338 getDefaultInstanceForType() {
            return CrossMartMsg.S2CR_BatchHatch_23338.getDefaultInstance();
         }

         public S2CR_BatchHatch_23338 build() {
            S2CR_BatchHatch_23338 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_BatchHatch_23338 buildPartial() {
            S2CR_BatchHatch_23338 result = new S2CR_BatchHatch_23338(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hatchType_ = this.hatchType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerHatchNum_ = this.playerHatchNum_;
               to_bitField0_ |= 2;
            }

            if (this.playerQualityHatchNumBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.playerQualityHatchNum_ = Collections.unmodifiableList(this.playerQualityHatchNum_);
                  this.bitField0_ &= -5;
               }

               result.playerQualityHatchNum_ = this.playerQualityHatchNum_;
            } else {
               result.playerQualityHatchNum_ = this.playerQualityHatchNumBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.hatchCount_ = this.hatchCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isPointLog_ = this.isPointLog_;
               to_bitField0_ |= 8;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_BatchHatch_23338) {
               return this.mergeFrom((S2CR_BatchHatch_23338)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_BatchHatch_23338 other) {
            if (other == CrossMartMsg.S2CR_BatchHatch_23338.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHatchType()) {
                  this.setHatchType(other.getHatchType());
               }

               if (other.hasPlayerHatchNum()) {
                  this.setPlayerHatchNum(other.getPlayerHatchNum());
               }

               if (this.playerQualityHatchNumBuilder_ == null) {
                  if (!other.playerQualityHatchNum_.isEmpty()) {
                     if (this.playerQualityHatchNum_.isEmpty()) {
                        this.playerQualityHatchNum_ = other.playerQualityHatchNum_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensurePlayerQualityHatchNumIsMutable();
                        this.playerQualityHatchNum_.addAll(other.playerQualityHatchNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerQualityHatchNum_.isEmpty()) {
                  if (this.playerQualityHatchNumBuilder_.isEmpty()) {
                     this.playerQualityHatchNumBuilder_.dispose();
                     this.playerQualityHatchNumBuilder_ = null;
                     this.playerQualityHatchNum_ = other.playerQualityHatchNum_;
                     this.bitField0_ &= -5;
                     this.playerQualityHatchNumBuilder_ = CrossMartMsg.S2CR_BatchHatch_23338.alwaysUseFieldBuilders ? this.getPlayerQualityHatchNumFieldBuilder() : null;
                  } else {
                     this.playerQualityHatchNumBuilder_.addAllMessages(other.playerQualityHatchNum_);
                  }
               }

               if (other.hasHatchCount()) {
                  this.setHatchCount(other.getHatchCount());
               }

               if (other.hasIsPointLog()) {
                  this.setIsPointLog(other.getIsPointLog());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHatchType()) {
               return false;
            } else if (!this.hasPlayerHatchNum()) {
               return false;
            } else if (!this.hasHatchCount()) {
               return false;
            } else if (!this.hasIsPointLog()) {
               return false;
            } else {
               for(int i = 0; i < this.getPlayerQualityHatchNumCount(); ++i) {
                  if (!this.getPlayerQualityHatchNum(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_BatchHatch_23338 parsedMessage = null;

            try {
               parsedMessage = (S2CR_BatchHatch_23338)CrossMartMsg.S2CR_BatchHatch_23338.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_BatchHatch_23338)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHatchType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHatchType() {
            return this.hatchType_;
         }

         public Builder setHatchType(int value) {
            this.bitField0_ |= 1;
            this.hatchType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchType() {
            this.bitField0_ &= -2;
            this.hatchType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerHatchNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getPlayerHatchNum() {
            return this.playerHatchNum_;
         }

         public Builder setPlayerHatchNum(long value) {
            this.bitField0_ |= 2;
            this.playerHatchNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerHatchNum() {
            this.bitField0_ &= -3;
            this.playerHatchNum_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensurePlayerQualityHatchNumIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.playerQualityHatchNum_ = new ArrayList(this.playerQualityHatchNum_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.MapDataII> getPlayerQualityHatchNumList() {
            return this.playerQualityHatchNumBuilder_ == null ? Collections.unmodifiableList(this.playerQualityHatchNum_) : this.playerQualityHatchNumBuilder_.getMessageList();
         }

         public int getPlayerQualityHatchNumCount() {
            return this.playerQualityHatchNumBuilder_ == null ? this.playerQualityHatchNum_.size() : this.playerQualityHatchNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getPlayerQualityHatchNum(int index) {
            return this.playerQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataII)this.playerQualityHatchNum_.get(index) : (CommonMsg.MapDataII)this.playerQualityHatchNumBuilder_.getMessage(index);
         }

         public Builder setPlayerQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.set(index, value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(index, value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerQualityHatchNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerQualityHatchNum_);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerQualityHatchNum() {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerQualityHatchNum(int index) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.remove(index);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getPlayerQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index) {
            return this.playerQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList() {
            return this.playerQualityHatchNumBuilder_ != null ? this.playerQualityHatchNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerQualityHatchNum_);
         }

         public CommonMsg.MapDataII.Builder addPlayerQualityHatchNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addPlayerQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getPlayerQualityHatchNumBuilderList() {
            return this.getPlayerQualityHatchNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumFieldBuilder() {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNumBuilder_ = new RepeatedFieldBuilderV3(this.playerQualityHatchNum_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.playerQualityHatchNum_ = null;
            }

            return this.playerQualityHatchNumBuilder_;
         }

         public boolean hasHatchCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHatchCount() {
            return this.hatchCount_;
         }

         public Builder setHatchCount(int value) {
            this.bitField0_ |= 8;
            this.hatchCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchCount() {
            this.bitField0_ &= -9;
            this.hatchCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsPointLog() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsPointLog() {
            return this.isPointLog_;
         }

         public Builder setIsPointLog(boolean value) {
            this.bitField0_ |= 16;
            this.isPointLog_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsPointLog() {
            this.bitField0_ &= -17;
            this.isPointLog_ = false;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_BatchHatch_23339 extends GeneratedMessageV3 implements CR2S_BatchHatch_23339OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HATCHTYPE_FIELD_NUMBER = 1;
      private int hatchType_;
      public static final int GODBEASTHATCHDATA_FIELD_NUMBER = 2;
      private List<GodBeastHatchData> godBeastHatchData_;
      public static final int PLAYERQUALITYHATCHNUM_FIELD_NUMBER = 3;
      private List<CommonMsg.MapDataII> playerQualityHatchNum_;
      public static final int WORLDQUALITYHATCHNUM_FIELD_NUMBER = 4;
      private List<CommonMsg.MapDataII> worldQualityHatchNum_;
      public static final int WORLDQUALITYTRIGGERTIMES_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> worldQualityTriggerTimes_;
      public static final int REALHATCHCOUNT_FIELD_NUMBER = 6;
      private int realHatchCount_;
      public static final int QUALITYCOUNT_FIELD_NUMBER = 7;
      private List<CommonMsg.MapDataII> qualityCount_;
      public static final int ISPOINTLOG_FIELD_NUMBER = 8;
      private boolean isPointLog_;
      private byte memoizedIsInitialized;
      private static final CR2S_BatchHatch_23339 DEFAULT_INSTANCE = new CR2S_BatchHatch_23339();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BatchHatch_23339> PARSER = new AbstractParser<CR2S_BatchHatch_23339>() {
         public CR2S_BatchHatch_23339 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BatchHatch_23339(input, extensionRegistry);
         }
      };

      private CR2S_BatchHatch_23339(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BatchHatch_23339() {
         this.memoizedIsInitialized = -1;
         this.godBeastHatchData_ = Collections.emptyList();
         this.playerQualityHatchNum_ = Collections.emptyList();
         this.worldQualityHatchNum_ = Collections.emptyList();
         this.worldQualityTriggerTimes_ = Collections.emptyList();
         this.qualityCount_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BatchHatch_23339();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BatchHatch_23339(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.hatchType_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.godBeastHatchData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.godBeastHatchData_.add(input.readMessage(CrossMartMsg.GodBeastHatchData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.playerQualityHatchNum_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.playerQualityHatchNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.worldQualityHatchNum_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.worldQualityHatchNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.worldQualityTriggerTimes_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.worldQualityTriggerTimes_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 48:
                        this.bitField0_ |= 2;
                        this.realHatchCount_ = input.readInt32();
                        break;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.qualityCount_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.qualityCount_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 64:
                        this.bitField0_ |= 4;
                        this.isPointLog_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.godBeastHatchData_ = Collections.unmodifiableList(this.godBeastHatchData_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.playerQualityHatchNum_ = Collections.unmodifiableList(this.playerQualityHatchNum_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.worldQualityHatchNum_ = Collections.unmodifiableList(this.worldQualityHatchNum_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.worldQualityTriggerTimes_ = Collections.unmodifiableList(this.worldQualityTriggerTimes_);
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.qualityCount_ = Collections.unmodifiableList(this.qualityCount_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BatchHatch_23339.class, Builder.class);
      }

      public boolean hasHatchType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHatchType() {
         return this.hatchType_;
      }

      public List<GodBeastHatchData> getGodBeastHatchDataList() {
         return this.godBeastHatchData_;
      }

      public List<? extends GodBeastHatchDataOrBuilder> getGodBeastHatchDataOrBuilderList() {
         return this.godBeastHatchData_;
      }

      public int getGodBeastHatchDataCount() {
         return this.godBeastHatchData_.size();
      }

      public GodBeastHatchData getGodBeastHatchData(int index) {
         return (GodBeastHatchData)this.godBeastHatchData_.get(index);
      }

      public GodBeastHatchDataOrBuilder getGodBeastHatchDataOrBuilder(int index) {
         return (GodBeastHatchDataOrBuilder)this.godBeastHatchData_.get(index);
      }

      public List<CommonMsg.MapDataII> getPlayerQualityHatchNumList() {
         return this.playerQualityHatchNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList() {
         return this.playerQualityHatchNum_;
      }

      public int getPlayerQualityHatchNumCount() {
         return this.playerQualityHatchNum_.size();
      }

      public CommonMsg.MapDataII getPlayerQualityHatchNum(int index) {
         return (CommonMsg.MapDataII)this.playerQualityHatchNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNum_.get(index);
      }

      public List<CommonMsg.MapDataII> getWorldQualityHatchNumList() {
         return this.worldQualityHatchNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityHatchNumOrBuilderList() {
         return this.worldQualityHatchNum_;
      }

      public int getWorldQualityHatchNumCount() {
         return this.worldQualityHatchNum_.size();
      }

      public CommonMsg.MapDataII getWorldQualityHatchNum(int index) {
         return (CommonMsg.MapDataII)this.worldQualityHatchNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getWorldQualityHatchNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.worldQualityHatchNum_.get(index);
      }

      public List<CommonMsg.MapDataII> getWorldQualityTriggerTimesList() {
         return this.worldQualityTriggerTimes_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityTriggerTimesOrBuilderList() {
         return this.worldQualityTriggerTimes_;
      }

      public int getWorldQualityTriggerTimesCount() {
         return this.worldQualityTriggerTimes_.size();
      }

      public CommonMsg.MapDataII getWorldQualityTriggerTimes(int index) {
         return (CommonMsg.MapDataII)this.worldQualityTriggerTimes_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getWorldQualityTriggerTimesOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.worldQualityTriggerTimes_.get(index);
      }

      public boolean hasRealHatchCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRealHatchCount() {
         return this.realHatchCount_;
      }

      public List<CommonMsg.MapDataII> getQualityCountList() {
         return this.qualityCount_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getQualityCountOrBuilderList() {
         return this.qualityCount_;
      }

      public int getQualityCountCount() {
         return this.qualityCount_.size();
      }

      public CommonMsg.MapDataII getQualityCount(int index) {
         return (CommonMsg.MapDataII)this.qualityCount_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getQualityCountOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.qualityCount_.get(index);
      }

      public boolean hasIsPointLog() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsPointLog() {
         return this.isPointLog_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHatchType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRealHatchCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsPointLog()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getGodBeastHatchDataCount(); ++i) {
               if (!this.getGodBeastHatchData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getPlayerQualityHatchNumCount(); ++i) {
               if (!this.getPlayerQualityHatchNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getWorldQualityHatchNumCount(); ++i) {
               if (!this.getWorldQualityHatchNum(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getWorldQualityTriggerTimesCount(); ++i) {
               if (!this.getWorldQualityTriggerTimes(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getQualityCountCount(); ++i) {
               if (!this.getQualityCount(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.hatchType_);
         }

         for(int i = 0; i < this.godBeastHatchData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.godBeastHatchData_.get(i));
         }

         for(int i = 0; i < this.playerQualityHatchNum_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.playerQualityHatchNum_.get(i));
         }

         for(int i = 0; i < this.worldQualityHatchNum_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.worldQualityHatchNum_.get(i));
         }

         for(int i = 0; i < this.worldQualityTriggerTimes_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.worldQualityTriggerTimes_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(6, this.realHatchCount_);
         }

         for(int i = 0; i < this.qualityCount_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.qualityCount_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(8, this.isPointLog_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.hatchType_);
            }

            for(int i = 0; i < this.godBeastHatchData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.godBeastHatchData_.get(i));
            }

            for(int i = 0; i < this.playerQualityHatchNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.playerQualityHatchNum_.get(i));
            }

            for(int i = 0; i < this.worldQualityHatchNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.worldQualityHatchNum_.get(i));
            }

            for(int i = 0; i < this.worldQualityTriggerTimes_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.worldQualityTriggerTimes_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.realHatchCount_);
            }

            for(int i = 0; i < this.qualityCount_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.qualityCount_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(8, this.isPointLog_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BatchHatch_23339)) {
            return super.equals(obj);
         } else {
            CR2S_BatchHatch_23339 other = (CR2S_BatchHatch_23339)obj;
            if (this.hasHatchType() != other.hasHatchType()) {
               return false;
            } else if (this.hasHatchType() && this.getHatchType() != other.getHatchType()) {
               return false;
            } else if (!this.getGodBeastHatchDataList().equals(other.getGodBeastHatchDataList())) {
               return false;
            } else if (!this.getPlayerQualityHatchNumList().equals(other.getPlayerQualityHatchNumList())) {
               return false;
            } else if (!this.getWorldQualityHatchNumList().equals(other.getWorldQualityHatchNumList())) {
               return false;
            } else if (!this.getWorldQualityTriggerTimesList().equals(other.getWorldQualityTriggerTimesList())) {
               return false;
            } else if (this.hasRealHatchCount() != other.hasRealHatchCount()) {
               return false;
            } else if (this.hasRealHatchCount() && this.getRealHatchCount() != other.getRealHatchCount()) {
               return false;
            } else if (!this.getQualityCountList().equals(other.getQualityCountList())) {
               return false;
            } else if (this.hasIsPointLog() != other.hasIsPointLog()) {
               return false;
            } else if (this.hasIsPointLog() && this.getIsPointLog() != other.getIsPointLog()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasHatchType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHatchType();
            }

            if (this.getGodBeastHatchDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGodBeastHatchDataList().hashCode();
            }

            if (this.getPlayerQualityHatchNumCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerQualityHatchNumList().hashCode();
            }

            if (this.getWorldQualityHatchNumCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getWorldQualityHatchNumList().hashCode();
            }

            if (this.getWorldQualityTriggerTimesCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getWorldQualityTriggerTimesList().hashCode();
            }

            if (this.hasRealHatchCount()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRealHatchCount();
            }

            if (this.getQualityCountCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getQualityCountList().hashCode();
            }

            if (this.hasIsPointLog()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashBoolean(this.getIsPointLog());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BatchHatch_23339 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BatchHatch_23339)PARSER.parseFrom(data);
      }

      public static CR2S_BatchHatch_23339 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BatchHatch_23339)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BatchHatch_23339 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BatchHatch_23339)PARSER.parseFrom(data);
      }

      public static CR2S_BatchHatch_23339 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BatchHatch_23339)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BatchHatch_23339 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BatchHatch_23339)PARSER.parseFrom(data);
      }

      public static CR2S_BatchHatch_23339 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BatchHatch_23339)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BatchHatch_23339 parseFrom(InputStream input) throws IOException {
         return (CR2S_BatchHatch_23339)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BatchHatch_23339 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BatchHatch_23339)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BatchHatch_23339 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BatchHatch_23339)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BatchHatch_23339 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BatchHatch_23339)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BatchHatch_23339 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BatchHatch_23339)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BatchHatch_23339 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BatchHatch_23339)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BatchHatch_23339 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BatchHatch_23339 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BatchHatch_23339> parser() {
         return PARSER;
      }

      public Parser<CR2S_BatchHatch_23339> getParserForType() {
         return PARSER;
      }

      public CR2S_BatchHatch_23339 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BatchHatch_23339OrBuilder {
         private int bitField0_;
         private int hatchType_;
         private List<GodBeastHatchData> godBeastHatchData_;
         private RepeatedFieldBuilderV3<GodBeastHatchData, GodBeastHatchData.Builder, GodBeastHatchDataOrBuilder> godBeastHatchDataBuilder_;
         private List<CommonMsg.MapDataII> playerQualityHatchNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> playerQualityHatchNumBuilder_;
         private List<CommonMsg.MapDataII> worldQualityHatchNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> worldQualityHatchNumBuilder_;
         private List<CommonMsg.MapDataII> worldQualityTriggerTimes_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> worldQualityTriggerTimesBuilder_;
         private int realHatchCount_;
         private List<CommonMsg.MapDataII> qualityCount_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> qualityCountBuilder_;
         private boolean isPointLog_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BatchHatch_23339.class, Builder.class);
         }

         private Builder() {
            this.godBeastHatchData_ = Collections.emptyList();
            this.playerQualityHatchNum_ = Collections.emptyList();
            this.worldQualityHatchNum_ = Collections.emptyList();
            this.worldQualityTriggerTimes_ = Collections.emptyList();
            this.qualityCount_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.godBeastHatchData_ = Collections.emptyList();
            this.playerQualityHatchNum_ = Collections.emptyList();
            this.worldQualityHatchNum_ = Collections.emptyList();
            this.worldQualityTriggerTimes_ = Collections.emptyList();
            this.qualityCount_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.CR2S_BatchHatch_23339.alwaysUseFieldBuilders) {
               this.getGodBeastHatchDataFieldBuilder();
               this.getPlayerQualityHatchNumFieldBuilder();
               this.getWorldQualityHatchNumFieldBuilder();
               this.getWorldQualityTriggerTimesFieldBuilder();
               this.getQualityCountFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.hatchType_ = 0;
            this.bitField0_ &= -2;
            if (this.godBeastHatchDataBuilder_ == null) {
               this.godBeastHatchData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.godBeastHatchDataBuilder_.clear();
            }

            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.playerQualityHatchNumBuilder_.clear();
            }

            if (this.worldQualityHatchNumBuilder_ == null) {
               this.worldQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.worldQualityHatchNumBuilder_.clear();
            }

            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.worldQualityTriggerTimes_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.worldQualityTriggerTimesBuilder_.clear();
            }

            this.realHatchCount_ = 0;
            this.bitField0_ &= -33;
            if (this.qualityCountBuilder_ == null) {
               this.qualityCount_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.qualityCountBuilder_.clear();
            }

            this.isPointLog_ = false;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_CR2S_BatchHatch_23339_descriptor;
         }

         public CR2S_BatchHatch_23339 getDefaultInstanceForType() {
            return CrossMartMsg.CR2S_BatchHatch_23339.getDefaultInstance();
         }

         public CR2S_BatchHatch_23339 build() {
            CR2S_BatchHatch_23339 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BatchHatch_23339 buildPartial() {
            CR2S_BatchHatch_23339 result = new CR2S_BatchHatch_23339(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hatchType_ = this.hatchType_;
               to_bitField0_ |= 1;
            }

            if (this.godBeastHatchDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.godBeastHatchData_ = Collections.unmodifiableList(this.godBeastHatchData_);
                  this.bitField0_ &= -3;
               }

               result.godBeastHatchData_ = this.godBeastHatchData_;
            } else {
               result.godBeastHatchData_ = this.godBeastHatchDataBuilder_.build();
            }

            if (this.playerQualityHatchNumBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.playerQualityHatchNum_ = Collections.unmodifiableList(this.playerQualityHatchNum_);
                  this.bitField0_ &= -5;
               }

               result.playerQualityHatchNum_ = this.playerQualityHatchNum_;
            } else {
               result.playerQualityHatchNum_ = this.playerQualityHatchNumBuilder_.build();
            }

            if (this.worldQualityHatchNumBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.worldQualityHatchNum_ = Collections.unmodifiableList(this.worldQualityHatchNum_);
                  this.bitField0_ &= -9;
               }

               result.worldQualityHatchNum_ = this.worldQualityHatchNum_;
            } else {
               result.worldQualityHatchNum_ = this.worldQualityHatchNumBuilder_.build();
            }

            if (this.worldQualityTriggerTimesBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.worldQualityTriggerTimes_ = Collections.unmodifiableList(this.worldQualityTriggerTimes_);
                  this.bitField0_ &= -17;
               }

               result.worldQualityTriggerTimes_ = this.worldQualityTriggerTimes_;
            } else {
               result.worldQualityTriggerTimes_ = this.worldQualityTriggerTimesBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.realHatchCount_ = this.realHatchCount_;
               to_bitField0_ |= 2;
            }

            if (this.qualityCountBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.qualityCount_ = Collections.unmodifiableList(this.qualityCount_);
                  this.bitField0_ &= -65;
               }

               result.qualityCount_ = this.qualityCount_;
            } else {
               result.qualityCount_ = this.qualityCountBuilder_.build();
            }

            if ((from_bitField0_ & 128) != 0) {
               result.isPointLog_ = this.isPointLog_;
               to_bitField0_ |= 4;
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_BatchHatch_23339) {
               return this.mergeFrom((CR2S_BatchHatch_23339)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BatchHatch_23339 other) {
            if (other == CrossMartMsg.CR2S_BatchHatch_23339.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHatchType()) {
                  this.setHatchType(other.getHatchType());
               }

               if (this.godBeastHatchDataBuilder_ == null) {
                  if (!other.godBeastHatchData_.isEmpty()) {
                     if (this.godBeastHatchData_.isEmpty()) {
                        this.godBeastHatchData_ = other.godBeastHatchData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureGodBeastHatchDataIsMutable();
                        this.godBeastHatchData_.addAll(other.godBeastHatchData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.godBeastHatchData_.isEmpty()) {
                  if (this.godBeastHatchDataBuilder_.isEmpty()) {
                     this.godBeastHatchDataBuilder_.dispose();
                     this.godBeastHatchDataBuilder_ = null;
                     this.godBeastHatchData_ = other.godBeastHatchData_;
                     this.bitField0_ &= -3;
                     this.godBeastHatchDataBuilder_ = CrossMartMsg.CR2S_BatchHatch_23339.alwaysUseFieldBuilders ? this.getGodBeastHatchDataFieldBuilder() : null;
                  } else {
                     this.godBeastHatchDataBuilder_.addAllMessages(other.godBeastHatchData_);
                  }
               }

               if (this.playerQualityHatchNumBuilder_ == null) {
                  if (!other.playerQualityHatchNum_.isEmpty()) {
                     if (this.playerQualityHatchNum_.isEmpty()) {
                        this.playerQualityHatchNum_ = other.playerQualityHatchNum_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensurePlayerQualityHatchNumIsMutable();
                        this.playerQualityHatchNum_.addAll(other.playerQualityHatchNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerQualityHatchNum_.isEmpty()) {
                  if (this.playerQualityHatchNumBuilder_.isEmpty()) {
                     this.playerQualityHatchNumBuilder_.dispose();
                     this.playerQualityHatchNumBuilder_ = null;
                     this.playerQualityHatchNum_ = other.playerQualityHatchNum_;
                     this.bitField0_ &= -5;
                     this.playerQualityHatchNumBuilder_ = CrossMartMsg.CR2S_BatchHatch_23339.alwaysUseFieldBuilders ? this.getPlayerQualityHatchNumFieldBuilder() : null;
                  } else {
                     this.playerQualityHatchNumBuilder_.addAllMessages(other.playerQualityHatchNum_);
                  }
               }

               if (this.worldQualityHatchNumBuilder_ == null) {
                  if (!other.worldQualityHatchNum_.isEmpty()) {
                     if (this.worldQualityHatchNum_.isEmpty()) {
                        this.worldQualityHatchNum_ = other.worldQualityHatchNum_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureWorldQualityHatchNumIsMutable();
                        this.worldQualityHatchNum_.addAll(other.worldQualityHatchNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.worldQualityHatchNum_.isEmpty()) {
                  if (this.worldQualityHatchNumBuilder_.isEmpty()) {
                     this.worldQualityHatchNumBuilder_.dispose();
                     this.worldQualityHatchNumBuilder_ = null;
                     this.worldQualityHatchNum_ = other.worldQualityHatchNum_;
                     this.bitField0_ &= -9;
                     this.worldQualityHatchNumBuilder_ = CrossMartMsg.CR2S_BatchHatch_23339.alwaysUseFieldBuilders ? this.getWorldQualityHatchNumFieldBuilder() : null;
                  } else {
                     this.worldQualityHatchNumBuilder_.addAllMessages(other.worldQualityHatchNum_);
                  }
               }

               if (this.worldQualityTriggerTimesBuilder_ == null) {
                  if (!other.worldQualityTriggerTimes_.isEmpty()) {
                     if (this.worldQualityTriggerTimes_.isEmpty()) {
                        this.worldQualityTriggerTimes_ = other.worldQualityTriggerTimes_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureWorldQualityTriggerTimesIsMutable();
                        this.worldQualityTriggerTimes_.addAll(other.worldQualityTriggerTimes_);
                     }

                     this.onChanged();
                  }
               } else if (!other.worldQualityTriggerTimes_.isEmpty()) {
                  if (this.worldQualityTriggerTimesBuilder_.isEmpty()) {
                     this.worldQualityTriggerTimesBuilder_.dispose();
                     this.worldQualityTriggerTimesBuilder_ = null;
                     this.worldQualityTriggerTimes_ = other.worldQualityTriggerTimes_;
                     this.bitField0_ &= -17;
                     this.worldQualityTriggerTimesBuilder_ = CrossMartMsg.CR2S_BatchHatch_23339.alwaysUseFieldBuilders ? this.getWorldQualityTriggerTimesFieldBuilder() : null;
                  } else {
                     this.worldQualityTriggerTimesBuilder_.addAllMessages(other.worldQualityTriggerTimes_);
                  }
               }

               if (other.hasRealHatchCount()) {
                  this.setRealHatchCount(other.getRealHatchCount());
               }

               if (this.qualityCountBuilder_ == null) {
                  if (!other.qualityCount_.isEmpty()) {
                     if (this.qualityCount_.isEmpty()) {
                        this.qualityCount_ = other.qualityCount_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureQualityCountIsMutable();
                        this.qualityCount_.addAll(other.qualityCount_);
                     }

                     this.onChanged();
                  }
               } else if (!other.qualityCount_.isEmpty()) {
                  if (this.qualityCountBuilder_.isEmpty()) {
                     this.qualityCountBuilder_.dispose();
                     this.qualityCountBuilder_ = null;
                     this.qualityCount_ = other.qualityCount_;
                     this.bitField0_ &= -65;
                     this.qualityCountBuilder_ = CrossMartMsg.CR2S_BatchHatch_23339.alwaysUseFieldBuilders ? this.getQualityCountFieldBuilder() : null;
                  } else {
                     this.qualityCountBuilder_.addAllMessages(other.qualityCount_);
                  }
               }

               if (other.hasIsPointLog()) {
                  this.setIsPointLog(other.getIsPointLog());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHatchType()) {
               return false;
            } else if (!this.hasRealHatchCount()) {
               return false;
            } else if (!this.hasIsPointLog()) {
               return false;
            } else {
               for(int i = 0; i < this.getGodBeastHatchDataCount(); ++i) {
                  if (!this.getGodBeastHatchData(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getPlayerQualityHatchNumCount(); ++i) {
                  if (!this.getPlayerQualityHatchNum(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getWorldQualityHatchNumCount(); ++i) {
                  if (!this.getWorldQualityHatchNum(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getWorldQualityTriggerTimesCount(); ++i) {
                  if (!this.getWorldQualityTriggerTimes(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getQualityCountCount(); ++i) {
                  if (!this.getQualityCount(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BatchHatch_23339 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BatchHatch_23339)CrossMartMsg.CR2S_BatchHatch_23339.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BatchHatch_23339)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHatchType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHatchType() {
            return this.hatchType_;
         }

         public Builder setHatchType(int value) {
            this.bitField0_ |= 1;
            this.hatchType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchType() {
            this.bitField0_ &= -2;
            this.hatchType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGodBeastHatchDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.godBeastHatchData_ = new ArrayList(this.godBeastHatchData_);
               this.bitField0_ |= 2;
            }

         }

         public List<GodBeastHatchData> getGodBeastHatchDataList() {
            return this.godBeastHatchDataBuilder_ == null ? Collections.unmodifiableList(this.godBeastHatchData_) : this.godBeastHatchDataBuilder_.getMessageList();
         }

         public int getGodBeastHatchDataCount() {
            return this.godBeastHatchDataBuilder_ == null ? this.godBeastHatchData_.size() : this.godBeastHatchDataBuilder_.getCount();
         }

         public GodBeastHatchData getGodBeastHatchData(int index) {
            return this.godBeastHatchDataBuilder_ == null ? (GodBeastHatchData)this.godBeastHatchData_.get(index) : (GodBeastHatchData)this.godBeastHatchDataBuilder_.getMessage(index);
         }

         public Builder setGodBeastHatchData(int index, GodBeastHatchData value) {
            if (this.godBeastHatchDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGodBeastHatchDataIsMutable();
               this.godBeastHatchData_.set(index, value);
               this.onChanged();
            } else {
               this.godBeastHatchDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGodBeastHatchData(int index, GodBeastHatchData.Builder builderForValue) {
            if (this.godBeastHatchDataBuilder_ == null) {
               this.ensureGodBeastHatchDataIsMutable();
               this.godBeastHatchData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.godBeastHatchDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGodBeastHatchData(GodBeastHatchData value) {
            if (this.godBeastHatchDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGodBeastHatchDataIsMutable();
               this.godBeastHatchData_.add(value);
               this.onChanged();
            } else {
               this.godBeastHatchDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGodBeastHatchData(int index, GodBeastHatchData value) {
            if (this.godBeastHatchDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGodBeastHatchDataIsMutable();
               this.godBeastHatchData_.add(index, value);
               this.onChanged();
            } else {
               this.godBeastHatchDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGodBeastHatchData(GodBeastHatchData.Builder builderForValue) {
            if (this.godBeastHatchDataBuilder_ == null) {
               this.ensureGodBeastHatchDataIsMutable();
               this.godBeastHatchData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.godBeastHatchDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGodBeastHatchData(int index, GodBeastHatchData.Builder builderForValue) {
            if (this.godBeastHatchDataBuilder_ == null) {
               this.ensureGodBeastHatchDataIsMutable();
               this.godBeastHatchData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.godBeastHatchDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGodBeastHatchData(Iterable<? extends GodBeastHatchData> values) {
            if (this.godBeastHatchDataBuilder_ == null) {
               this.ensureGodBeastHatchDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.godBeastHatchData_);
               this.onChanged();
            } else {
               this.godBeastHatchDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGodBeastHatchData() {
            if (this.godBeastHatchDataBuilder_ == null) {
               this.godBeastHatchData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.godBeastHatchDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeGodBeastHatchData(int index) {
            if (this.godBeastHatchDataBuilder_ == null) {
               this.ensureGodBeastHatchDataIsMutable();
               this.godBeastHatchData_.remove(index);
               this.onChanged();
            } else {
               this.godBeastHatchDataBuilder_.remove(index);
            }

            return this;
         }

         public GodBeastHatchData.Builder getGodBeastHatchDataBuilder(int index) {
            return (GodBeastHatchData.Builder)this.getGodBeastHatchDataFieldBuilder().getBuilder(index);
         }

         public GodBeastHatchDataOrBuilder getGodBeastHatchDataOrBuilder(int index) {
            return this.godBeastHatchDataBuilder_ == null ? (GodBeastHatchDataOrBuilder)this.godBeastHatchData_.get(index) : (GodBeastHatchDataOrBuilder)this.godBeastHatchDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GodBeastHatchDataOrBuilder> getGodBeastHatchDataOrBuilderList() {
            return this.godBeastHatchDataBuilder_ != null ? this.godBeastHatchDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.godBeastHatchData_);
         }

         public GodBeastHatchData.Builder addGodBeastHatchDataBuilder() {
            return (GodBeastHatchData.Builder)this.getGodBeastHatchDataFieldBuilder().addBuilder(CrossMartMsg.GodBeastHatchData.getDefaultInstance());
         }

         public GodBeastHatchData.Builder addGodBeastHatchDataBuilder(int index) {
            return (GodBeastHatchData.Builder)this.getGodBeastHatchDataFieldBuilder().addBuilder(index, CrossMartMsg.GodBeastHatchData.getDefaultInstance());
         }

         public List<GodBeastHatchData.Builder> getGodBeastHatchDataBuilderList() {
            return this.getGodBeastHatchDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GodBeastHatchData, GodBeastHatchData.Builder, GodBeastHatchDataOrBuilder> getGodBeastHatchDataFieldBuilder() {
            if (this.godBeastHatchDataBuilder_ == null) {
               this.godBeastHatchDataBuilder_ = new RepeatedFieldBuilderV3(this.godBeastHatchData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.godBeastHatchData_ = null;
            }

            return this.godBeastHatchDataBuilder_;
         }

         private void ensurePlayerQualityHatchNumIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.playerQualityHatchNum_ = new ArrayList(this.playerQualityHatchNum_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.MapDataII> getPlayerQualityHatchNumList() {
            return this.playerQualityHatchNumBuilder_ == null ? Collections.unmodifiableList(this.playerQualityHatchNum_) : this.playerQualityHatchNumBuilder_.getMessageList();
         }

         public int getPlayerQualityHatchNumCount() {
            return this.playerQualityHatchNumBuilder_ == null ? this.playerQualityHatchNum_.size() : this.playerQualityHatchNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getPlayerQualityHatchNum(int index) {
            return this.playerQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataII)this.playerQualityHatchNum_.get(index) : (CommonMsg.MapDataII)this.playerQualityHatchNumBuilder_.getMessage(index);
         }

         public Builder setPlayerQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.set(index, value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(index, value);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerQualityHatchNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerQualityHatchNum_);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerQualityHatchNum() {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerQualityHatchNum(int index) {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.ensurePlayerQualityHatchNumIsMutable();
               this.playerQualityHatchNum_.remove(index);
               this.onChanged();
            } else {
               this.playerQualityHatchNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getPlayerQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index) {
            return this.playerQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.playerQualityHatchNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList() {
            return this.playerQualityHatchNumBuilder_ != null ? this.playerQualityHatchNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerQualityHatchNum_);
         }

         public CommonMsg.MapDataII.Builder addPlayerQualityHatchNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addPlayerQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getPlayerQualityHatchNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getPlayerQualityHatchNumBuilderList() {
            return this.getPlayerQualityHatchNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumFieldBuilder() {
            if (this.playerQualityHatchNumBuilder_ == null) {
               this.playerQualityHatchNumBuilder_ = new RepeatedFieldBuilderV3(this.playerQualityHatchNum_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.playerQualityHatchNum_ = null;
            }

            return this.playerQualityHatchNumBuilder_;
         }

         private void ensureWorldQualityHatchNumIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.worldQualityHatchNum_ = new ArrayList(this.worldQualityHatchNum_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.MapDataII> getWorldQualityHatchNumList() {
            return this.worldQualityHatchNumBuilder_ == null ? Collections.unmodifiableList(this.worldQualityHatchNum_) : this.worldQualityHatchNumBuilder_.getMessageList();
         }

         public int getWorldQualityHatchNumCount() {
            return this.worldQualityHatchNumBuilder_ == null ? this.worldQualityHatchNum_.size() : this.worldQualityHatchNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getWorldQualityHatchNum(int index) {
            return this.worldQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataII)this.worldQualityHatchNum_.get(index) : (CommonMsg.MapDataII)this.worldQualityHatchNumBuilder_.getMessage(index);
         }

         public Builder setWorldQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.set(index, value);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWorldQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWorldQualityHatchNum(CommonMsg.MapDataII value) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.add(value);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWorldQualityHatchNum(int index, CommonMsg.MapDataII value) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.add(index, value);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWorldQualityHatchNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWorldQualityHatchNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWorldQualityHatchNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.worldQualityHatchNum_);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWorldQualityHatchNum() {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.worldQualityHatchNum_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeWorldQualityHatchNum(int index) {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.ensureWorldQualityHatchNumIsMutable();
               this.worldQualityHatchNum_.remove(index);
               this.onChanged();
            } else {
               this.worldQualityHatchNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getWorldQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityHatchNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getWorldQualityHatchNumOrBuilder(int index) {
            return this.worldQualityHatchNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.worldQualityHatchNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.worldQualityHatchNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityHatchNumOrBuilderList() {
            return this.worldQualityHatchNumBuilder_ != null ? this.worldQualityHatchNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.worldQualityHatchNum_);
         }

         public CommonMsg.MapDataII.Builder addWorldQualityHatchNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityHatchNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addWorldQualityHatchNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityHatchNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getWorldQualityHatchNumBuilderList() {
            return this.getWorldQualityHatchNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getWorldQualityHatchNumFieldBuilder() {
            if (this.worldQualityHatchNumBuilder_ == null) {
               this.worldQualityHatchNumBuilder_ = new RepeatedFieldBuilderV3(this.worldQualityHatchNum_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.worldQualityHatchNum_ = null;
            }

            return this.worldQualityHatchNumBuilder_;
         }

         private void ensureWorldQualityTriggerTimesIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.worldQualityTriggerTimes_ = new ArrayList(this.worldQualityTriggerTimes_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getWorldQualityTriggerTimesList() {
            return this.worldQualityTriggerTimesBuilder_ == null ? Collections.unmodifiableList(this.worldQualityTriggerTimes_) : this.worldQualityTriggerTimesBuilder_.getMessageList();
         }

         public int getWorldQualityTriggerTimesCount() {
            return this.worldQualityTriggerTimesBuilder_ == null ? this.worldQualityTriggerTimes_.size() : this.worldQualityTriggerTimesBuilder_.getCount();
         }

         public CommonMsg.MapDataII getWorldQualityTriggerTimes(int index) {
            return this.worldQualityTriggerTimesBuilder_ == null ? (CommonMsg.MapDataII)this.worldQualityTriggerTimes_.get(index) : (CommonMsg.MapDataII)this.worldQualityTriggerTimesBuilder_.getMessage(index);
         }

         public Builder setWorldQualityTriggerTimes(int index, CommonMsg.MapDataII value) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.set(index, value);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWorldQualityTriggerTimes(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWorldQualityTriggerTimes(CommonMsg.MapDataII value) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.add(value);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWorldQualityTriggerTimes(int index, CommonMsg.MapDataII value) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.add(index, value);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWorldQualityTriggerTimes(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWorldQualityTriggerTimes(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWorldQualityTriggerTimes(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.worldQualityTriggerTimes_);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWorldQualityTriggerTimes() {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.worldQualityTriggerTimes_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.clear();
            }

            return this;
         }

         public Builder removeWorldQualityTriggerTimes(int index) {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.ensureWorldQualityTriggerTimesIsMutable();
               this.worldQualityTriggerTimes_.remove(index);
               this.onChanged();
            } else {
               this.worldQualityTriggerTimesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getWorldQualityTriggerTimesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityTriggerTimesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getWorldQualityTriggerTimesOrBuilder(int index) {
            return this.worldQualityTriggerTimesBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.worldQualityTriggerTimes_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.worldQualityTriggerTimesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityTriggerTimesOrBuilderList() {
            return this.worldQualityTriggerTimesBuilder_ != null ? this.worldQualityTriggerTimesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.worldQualityTriggerTimes_);
         }

         public CommonMsg.MapDataII.Builder addWorldQualityTriggerTimesBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityTriggerTimesFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addWorldQualityTriggerTimesBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getWorldQualityTriggerTimesFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getWorldQualityTriggerTimesBuilderList() {
            return this.getWorldQualityTriggerTimesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getWorldQualityTriggerTimesFieldBuilder() {
            if (this.worldQualityTriggerTimesBuilder_ == null) {
               this.worldQualityTriggerTimesBuilder_ = new RepeatedFieldBuilderV3(this.worldQualityTriggerTimes_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.worldQualityTriggerTimes_ = null;
            }

            return this.worldQualityTriggerTimesBuilder_;
         }

         public boolean hasRealHatchCount() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getRealHatchCount() {
            return this.realHatchCount_;
         }

         public Builder setRealHatchCount(int value) {
            this.bitField0_ |= 32;
            this.realHatchCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRealHatchCount() {
            this.bitField0_ &= -33;
            this.realHatchCount_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureQualityCountIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.qualityCount_ = new ArrayList(this.qualityCount_);
               this.bitField0_ |= 64;
            }

         }

         public List<CommonMsg.MapDataII> getQualityCountList() {
            return this.qualityCountBuilder_ == null ? Collections.unmodifiableList(this.qualityCount_) : this.qualityCountBuilder_.getMessageList();
         }

         public int getQualityCountCount() {
            return this.qualityCountBuilder_ == null ? this.qualityCount_.size() : this.qualityCountBuilder_.getCount();
         }

         public CommonMsg.MapDataII getQualityCount(int index) {
            return this.qualityCountBuilder_ == null ? (CommonMsg.MapDataII)this.qualityCount_.get(index) : (CommonMsg.MapDataII)this.qualityCountBuilder_.getMessage(index);
         }

         public Builder setQualityCount(int index, CommonMsg.MapDataII value) {
            if (this.qualityCountBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureQualityCountIsMutable();
               this.qualityCount_.set(index, value);
               this.onChanged();
            } else {
               this.qualityCountBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setQualityCount(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.qualityCountBuilder_ == null) {
               this.ensureQualityCountIsMutable();
               this.qualityCount_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.qualityCountBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addQualityCount(CommonMsg.MapDataII value) {
            if (this.qualityCountBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureQualityCountIsMutable();
               this.qualityCount_.add(value);
               this.onChanged();
            } else {
               this.qualityCountBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addQualityCount(int index, CommonMsg.MapDataII value) {
            if (this.qualityCountBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureQualityCountIsMutable();
               this.qualityCount_.add(index, value);
               this.onChanged();
            } else {
               this.qualityCountBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addQualityCount(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.qualityCountBuilder_ == null) {
               this.ensureQualityCountIsMutable();
               this.qualityCount_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.qualityCountBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addQualityCount(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.qualityCountBuilder_ == null) {
               this.ensureQualityCountIsMutable();
               this.qualityCount_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.qualityCountBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllQualityCount(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.qualityCountBuilder_ == null) {
               this.ensureQualityCountIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.qualityCount_);
               this.onChanged();
            } else {
               this.qualityCountBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearQualityCount() {
            if (this.qualityCountBuilder_ == null) {
               this.qualityCount_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.qualityCountBuilder_.clear();
            }

            return this;
         }

         public Builder removeQualityCount(int index) {
            if (this.qualityCountBuilder_ == null) {
               this.ensureQualityCountIsMutable();
               this.qualityCount_.remove(index);
               this.onChanged();
            } else {
               this.qualityCountBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getQualityCountBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getQualityCountFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getQualityCountOrBuilder(int index) {
            return this.qualityCountBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.qualityCount_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.qualityCountBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getQualityCountOrBuilderList() {
            return this.qualityCountBuilder_ != null ? this.qualityCountBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.qualityCount_);
         }

         public CommonMsg.MapDataII.Builder addQualityCountBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getQualityCountFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addQualityCountBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getQualityCountFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getQualityCountBuilderList() {
            return this.getQualityCountFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getQualityCountFieldBuilder() {
            if (this.qualityCountBuilder_ == null) {
               this.qualityCountBuilder_ = new RepeatedFieldBuilderV3(this.qualityCount_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.qualityCount_ = null;
            }

            return this.qualityCountBuilder_;
         }

         public boolean hasIsPointLog() {
            return (this.bitField0_ & 128) != 0;
         }

         public boolean getIsPointLog() {
            return this.isPointLog_;
         }

         public Builder setIsPointLog(boolean value) {
            this.bitField0_ |= 128;
            this.isPointLog_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsPointLog() {
            this.bitField0_ &= -129;
            this.isPointLog_ = false;
            this.onChanged();
            return this;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class GodBeastHatchData extends GeneratedMessageV3 implements GodBeastHatchDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GODBEASTID_FIELD_NUMBER = 1;
      private int godBeastId_;
      public static final int ATTR_FIELD_NUMBER = 2;
      private List<CommonMsg.PropertyInfo> attr_;
      private byte memoizedIsInitialized;
      private static final GodBeastHatchData DEFAULT_INSTANCE = new GodBeastHatchData();
      /** @deprecated */
      @Deprecated
      public static final Parser<GodBeastHatchData> PARSER = new AbstractParser<GodBeastHatchData>() {
         public GodBeastHatchData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GodBeastHatchData(input, extensionRegistry);
         }
      };

      private GodBeastHatchData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GodBeastHatchData() {
         this.memoizedIsInitialized = -1;
         this.attr_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GodBeastHatchData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GodBeastHatchData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 8:
                        this.bitField0_ |= 1;
                        this.godBeastId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.attr_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.attr_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.attr_ = Collections.unmodifiableList(this.attr_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_fieldAccessorTable.ensureFieldAccessorsInitialized(GodBeastHatchData.class, Builder.class);
      }

      public boolean hasGodBeastId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGodBeastId() {
         return this.godBeastId_;
      }

      public List<CommonMsg.PropertyInfo> getAttrList() {
         return this.attr_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getAttrOrBuilderList() {
         return this.attr_;
      }

      public int getAttrCount() {
         return this.attr_.size();
      }

      public CommonMsg.PropertyInfo getAttr(int index) {
         return (CommonMsg.PropertyInfo)this.attr_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getAttrOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.attr_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGodBeastId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAttrCount(); ++i) {
               if (!this.getAttr(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.godBeastId_);
         }

         for(int i = 0; i < this.attr_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.attr_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.godBeastId_);
            }

            for(int i = 0; i < this.attr_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.attr_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GodBeastHatchData)) {
            return super.equals(obj);
         } else {
            GodBeastHatchData other = (GodBeastHatchData)obj;
            if (this.hasGodBeastId() != other.hasGodBeastId()) {
               return false;
            } else if (this.hasGodBeastId() && this.getGodBeastId() != other.getGodBeastId()) {
               return false;
            } else if (!this.getAttrList().equals(other.getAttrList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasGodBeastId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGodBeastId();
            }

            if (this.getAttrCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAttrList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GodBeastHatchData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GodBeastHatchData)PARSER.parseFrom(data);
      }

      public static GodBeastHatchData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GodBeastHatchData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GodBeastHatchData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GodBeastHatchData)PARSER.parseFrom(data);
      }

      public static GodBeastHatchData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GodBeastHatchData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GodBeastHatchData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GodBeastHatchData)PARSER.parseFrom(data);
      }

      public static GodBeastHatchData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GodBeastHatchData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GodBeastHatchData parseFrom(InputStream input) throws IOException {
         return (GodBeastHatchData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GodBeastHatchData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GodBeastHatchData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GodBeastHatchData parseDelimitedFrom(InputStream input) throws IOException {
         return (GodBeastHatchData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GodBeastHatchData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GodBeastHatchData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GodBeastHatchData parseFrom(CodedInputStream input) throws IOException {
         return (GodBeastHatchData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GodBeastHatchData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GodBeastHatchData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GodBeastHatchData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GodBeastHatchData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GodBeastHatchData> parser() {
         return PARSER;
      }

      public Parser<GodBeastHatchData> getParserForType() {
         return PARSER;
      }

      public GodBeastHatchData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GodBeastHatchDataOrBuilder {
         private int bitField0_;
         private int godBeastId_;
         private List<CommonMsg.PropertyInfo> attr_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> attrBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_fieldAccessorTable.ensureFieldAccessorsInitialized(GodBeastHatchData.class, Builder.class);
         }

         private Builder() {
            this.attr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.attr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.GodBeastHatchData.alwaysUseFieldBuilders) {
               this.getAttrFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.godBeastId_ = 0;
            this.bitField0_ &= -2;
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.attrBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_GodBeastHatchData_descriptor;
         }

         public GodBeastHatchData getDefaultInstanceForType() {
            return CrossMartMsg.GodBeastHatchData.getDefaultInstance();
         }

         public GodBeastHatchData build() {
            GodBeastHatchData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GodBeastHatchData buildPartial() {
            GodBeastHatchData result = new GodBeastHatchData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.godBeastId_ = this.godBeastId_;
               to_bitField0_ |= 1;
            }

            if (this.attrBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.attr_ = Collections.unmodifiableList(this.attr_);
                  this.bitField0_ &= -3;
               }

               result.attr_ = this.attr_;
            } else {
               result.attr_ = this.attrBuilder_.build();
            }

            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof GodBeastHatchData) {
               return this.mergeFrom((GodBeastHatchData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GodBeastHatchData other) {
            if (other == CrossMartMsg.GodBeastHatchData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGodBeastId()) {
                  this.setGodBeastId(other.getGodBeastId());
               }

               if (this.attrBuilder_ == null) {
                  if (!other.attr_.isEmpty()) {
                     if (this.attr_.isEmpty()) {
                        this.attr_ = other.attr_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureAttrIsMutable();
                        this.attr_.addAll(other.attr_);
                     }

                     this.onChanged();
                  }
               } else if (!other.attr_.isEmpty()) {
                  if (this.attrBuilder_.isEmpty()) {
                     this.attrBuilder_.dispose();
                     this.attrBuilder_ = null;
                     this.attr_ = other.attr_;
                     this.bitField0_ &= -3;
                     this.attrBuilder_ = CrossMartMsg.GodBeastHatchData.alwaysUseFieldBuilders ? this.getAttrFieldBuilder() : null;
                  } else {
                     this.attrBuilder_.addAllMessages(other.attr_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGodBeastId()) {
               return false;
            } else {
               for(int i = 0; i < this.getAttrCount(); ++i) {
                  if (!this.getAttr(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GodBeastHatchData parsedMessage = null;

            try {
               parsedMessage = (GodBeastHatchData)CrossMartMsg.GodBeastHatchData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GodBeastHatchData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGodBeastId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGodBeastId() {
            return this.godBeastId_;
         }

         public Builder setGodBeastId(int value) {
            this.bitField0_ |= 1;
            this.godBeastId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGodBeastId() {
            this.bitField0_ &= -2;
            this.godBeastId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAttrIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.attr_ = new ArrayList(this.attr_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.PropertyInfo> getAttrList() {
            return this.attrBuilder_ == null ? Collections.unmodifiableList(this.attr_) : this.attrBuilder_.getMessageList();
         }

         public int getAttrCount() {
            return this.attrBuilder_ == null ? this.attr_.size() : this.attrBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getAttr(int index) {
            return this.attrBuilder_ == null ? (CommonMsg.PropertyInfo)this.attr_.get(index) : (CommonMsg.PropertyInfo)this.attrBuilder_.getMessage(index);
         }

         public Builder setAttr(int index, CommonMsg.PropertyInfo value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.set(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAttr(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(CommonMsg.PropertyInfo value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAttr(int index, CommonMsg.PropertyInfo value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAttr(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAttr(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.attr_);
               this.onChanged();
            } else {
               this.attrBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAttr() {
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.attrBuilder_.clear();
            }

            return this;
         }

         public Builder removeAttr(int index) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.remove(index);
               this.onChanged();
            } else {
               this.attrBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getAttrBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getAttrFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getAttrOrBuilder(int index) {
            return this.attrBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.attr_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.attrBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getAttrOrBuilderList() {
            return this.attrBuilder_ != null ? this.attrBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.attr_);
         }

         public CommonMsg.PropertyInfo.Builder addAttrBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getAttrFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addAttrBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getAttrFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getAttrBuilderList() {
            return this.getAttrFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getAttrFieldBuilder() {
            if (this.attrBuilder_ == null) {
               this.attrBuilder_ = new RepeatedFieldBuilderV3(this.attr_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.attr_ = null;
            }

            return this.attrBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_GM_23381 extends GeneratedMessageV3 implements S2CR_GM_23381OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STRING_FIELD_NUMBER = 1;
      private volatile Object string_;
      private byte memoizedIsInitialized;
      private static final S2CR_GM_23381 DEFAULT_INSTANCE = new S2CR_GM_23381();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GM_23381> PARSER = new AbstractParser<S2CR_GM_23381>() {
         public S2CR_GM_23381 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GM_23381(input, extensionRegistry);
         }
      };

      private S2CR_GM_23381(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GM_23381() {
         this.memoizedIsInitialized = -1;
         this.string_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GM_23381();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GM_23381(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
                        break;
                     case 10:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1;
                        this.string_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GM_23381.class, Builder.class);
      }

      public boolean hasString() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getString() {
         Object ref = this.string_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.string_ = s;
            }

            return s;
         }
      }

      public ByteString getStringBytes() {
         Object ref = this.string_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.string_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasString()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.string_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += GeneratedMessageV3.computeStringSize(1, this.string_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_GM_23381)) {
            return super.equals(obj);
         } else {
            S2CR_GM_23381 other = (S2CR_GM_23381)obj;
            if (this.hasString() != other.hasString()) {
               return false;
            } else if (this.hasString() && !this.getString().equals(other.getString())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasString()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getString().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_GM_23381 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GM_23381)PARSER.parseFrom(data);
      }

      public static S2CR_GM_23381 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GM_23381)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GM_23381 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GM_23381)PARSER.parseFrom(data);
      }

      public static S2CR_GM_23381 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GM_23381)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GM_23381 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GM_23381)PARSER.parseFrom(data);
      }

      public static S2CR_GM_23381 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GM_23381)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GM_23381 parseFrom(InputStream input) throws IOException {
         return (S2CR_GM_23381)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GM_23381 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GM_23381)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GM_23381 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GM_23381)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GM_23381 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GM_23381)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GM_23381 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GM_23381)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GM_23381 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GM_23381)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GM_23381 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GM_23381 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GM_23381> parser() {
         return PARSER;
      }

      public Parser<S2CR_GM_23381> getParserForType() {
         return PARSER;
      }

      public S2CR_GM_23381 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GM_23381OrBuilder {
         private int bitField0_;
         private Object string_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GM_23381.class, Builder.class);
         }

         private Builder() {
            this.string_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.string_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMartMsg.S2CR_GM_23381.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.string_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMartMsg.internal_static_crossMart_com_gzbz_protobuf_S2CR_GM_23381_descriptor;
         }

         public S2CR_GM_23381 getDefaultInstanceForType() {
            return CrossMartMsg.S2CR_GM_23381.getDefaultInstance();
         }

         public S2CR_GM_23381 build() {
            S2CR_GM_23381 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GM_23381 buildPartial() {
            S2CR_GM_23381 result = new S2CR_GM_23381(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.string_ = this.string_;
            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_GM_23381) {
               return this.mergeFrom((S2CR_GM_23381)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GM_23381 other) {
            if (other == CrossMartMsg.S2CR_GM_23381.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasString()) {
                  this.bitField0_ |= 1;
                  this.string_ = other.string_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasString();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_GM_23381 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GM_23381)CrossMartMsg.S2CR_GM_23381.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GM_23381)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasString() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getString() {
            Object ref = this.string_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.string_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getStringBytes() {
            Object ref = this.string_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.string_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setString(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.string_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearString() {
            this.bitField0_ &= -2;
            this.string_ = CrossMartMsg.S2CR_GM_23381.getDefaultInstance().getString();
            this.onChanged();
            return this;
         }

         public Builder setStringBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.string_ = value;
               this.onChanged();
               return this;
            }
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface CR2S_BatchHatch_23339OrBuilder extends MessageOrBuilder {
      boolean hasHatchType();

      int getHatchType();

      List<GodBeastHatchData> getGodBeastHatchDataList();

      GodBeastHatchData getGodBeastHatchData(int index);

      int getGodBeastHatchDataCount();

      List<? extends GodBeastHatchDataOrBuilder> getGodBeastHatchDataOrBuilderList();

      GodBeastHatchDataOrBuilder getGodBeastHatchDataOrBuilder(int index);

      List<CommonMsg.MapDataII> getPlayerQualityHatchNumList();

      CommonMsg.MapDataII getPlayerQualityHatchNum(int index);

      int getPlayerQualityHatchNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index);

      List<CommonMsg.MapDataII> getWorldQualityHatchNumList();

      CommonMsg.MapDataII getWorldQualityHatchNum(int index);

      int getWorldQualityHatchNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityHatchNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getWorldQualityHatchNumOrBuilder(int index);

      List<CommonMsg.MapDataII> getWorldQualityTriggerTimesList();

      CommonMsg.MapDataII getWorldQualityTriggerTimes(int index);

      int getWorldQualityTriggerTimesCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityTriggerTimesOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getWorldQualityTriggerTimesOrBuilder(int index);

      boolean hasRealHatchCount();

      int getRealHatchCount();

      List<CommonMsg.MapDataII> getQualityCountList();

      CommonMsg.MapDataII getQualityCount(int index);

      int getQualityCountCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getQualityCountOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getQualityCountOrBuilder(int index);

      boolean hasIsPointLog();

      boolean getIsPointLog();
   }

   public interface CR2S_BuyHit_23312OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasPriceInfo();

      CommonMsg.ItemInfo getPriceInfo();

      CommonMsg.ItemInfoOrBuilder getPriceInfoOrBuilder();

      boolean hasHide();

      int getHide();

      boolean hasResult();

      int getResult();
   }

   public interface CR2S_ChangInfo_23320OrBuilder extends MessageOrBuilder {
      List<MartMsg.Goods> getGoodsList();

      MartMsg.Goods getGoods(int index);

      int getGoodsCount();

      List<? extends MartMsg.GoodsOrBuilder> getGoodsOrBuilderList();

      MartMsg.GoodsOrBuilder getGoodsOrBuilder(int index);
   }

   public interface CR2S_Deal_23334OrBuilder extends MessageOrBuilder {
      boolean hasGoods();

      MartMsg.Goods getGoods();

      MartMsg.GoodsOrBuilder getGoodsOrBuilder();
   }

   public interface CR2S_Hatch_23337OrBuilder extends MessageOrBuilder {
      boolean hasHatchType();

      int getHatchType();

      boolean hasGodBeastId();

      int getGodBeastId();

      List<CommonMsg.PropertyInfo> getAttrList();

      CommonMsg.PropertyInfo getAttr(int index);

      int getAttrCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getAttrOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getAttrOrBuilder(int index);

      List<CommonMsg.MapDataII> getPlayerQualityHatchNumList();

      CommonMsg.MapDataII getPlayerQualityHatchNum(int index);

      int getPlayerQualityHatchNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index);

      List<CommonMsg.MapDataII> getWorldQualityHatchNumList();

      CommonMsg.MapDataII getWorldQualityHatchNum(int index);

      int getWorldQualityHatchNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityHatchNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getWorldQualityHatchNumOrBuilder(int index);

      List<CommonMsg.MapDataII> getWorldQualityTriggerTimesList();

      CommonMsg.MapDataII getWorldQualityTriggerTimes(int index);

      int getWorldQualityTriggerTimesCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getWorldQualityTriggerTimesOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getWorldQualityTriggerTimesOrBuilder(int index);
   }

   public interface CR2S_NotifyDeal_23326OrBuilder extends MessageOrBuilder {
      boolean hasItemId();

      int getItemId();

      boolean hasPrice();

      int getPrice();

      boolean hasServiceCharge();

      int getServiceCharge();
   }

   public interface CR2S_Off_23310OrBuilder extends MessageOrBuilder {
      List<Integer> getCodeList();

      int getCodeCount();

      int getCode(int index);

      List<MartMsg.Goods> getGoodsList();

      MartMsg.Goods getGoods(int index);

      int getGoodsCount();

      List<? extends MartMsg.GoodsOrBuilder> getGoodsOrBuilderList();

      MartMsg.GoodsOrBuilder getGoodsOrBuilder(int index);
   }

   public interface CR2S_ReceiveGoods_23318OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasPriceType();

      int getPriceType();

      boolean hasPriceId();

      int getPriceId();

      boolean hasPrice();

      int getPrice();

      boolean hasServiceCharge();

      int getServiceCharge();
   }

   public interface CR2S_ReturnPrices_23324OrBuilder extends MessageOrBuilder {
      List<ReturnPriceData> getDataList();

      ReturnPriceData getData(int index);

      int getDataCount();

      List<? extends ReturnPriceDataOrBuilder> getDataOrBuilderList();

      ReturnPriceDataOrBuilder getDataOrBuilder(int index);
   }

   public interface CR2S_SellHit_23306OrBuilder extends MessageOrBuilder {
      boolean hasItemCode();

      int getItemCode();

      boolean hasOriPrice();

      int getOriPrice();

      boolean hasMaxPrice();

      int getMaxPrice();

      boolean hasHie();

      int getHie();
   }

   public interface CR2S_UnGetGoods_23330OrBuilder extends MessageOrBuilder {
      List<MartMsg.Goods> getGoodsList();

      MartMsg.Goods getGoods(int index);

      int getGoodsCount();

      List<? extends MartMsg.GoodsOrBuilder> getGoodsOrBuilderList();

      MartMsg.GoodsOrBuilder getGoodsOrBuilder(int index);
   }

   public interface CR2S_UnGetPrices_23332OrBuilder extends MessageOrBuilder {
      List<ReturnPriceData> getDataList();

      ReturnPriceData getData(int index);

      int getDataCount();

      List<? extends ReturnPriceDataOrBuilder> getDataOrBuilderList();

      ReturnPriceDataOrBuilder getDataOrBuilder(int index);
   }

   public interface CR2S_UpdateMartState_23328OrBuilder extends MessageOrBuilder {
      boolean hasState();

      int getState();
   }

   public interface GodBeastHatchDataOrBuilder extends MessageOrBuilder {
      boolean hasGodBeastId();

      int getGodBeastId();

      List<CommonMsg.PropertyInfo> getAttrList();

      CommonMsg.PropertyInfo getAttr(int index);

      int getAttrCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getAttrOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getAttrOrBuilder(int index);
   }

   public interface ReturnPriceDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasItemId();

      int getItemId();

      boolean hasPriceType();

      int getPriceType();

      boolean hasPriceId();

      int getPriceId();

      boolean hasPriceValue();

      int getPriceValue();
   }

   public interface S2CR_BatchHatch_23338OrBuilder extends MessageOrBuilder {
      boolean hasHatchType();

      int getHatchType();

      boolean hasPlayerHatchNum();

      long getPlayerHatchNum();

      List<CommonMsg.MapDataII> getPlayerQualityHatchNumList();

      CommonMsg.MapDataII getPlayerQualityHatchNum(int index);

      int getPlayerQualityHatchNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index);

      boolean hasHatchCount();

      int getHatchCount();

      boolean hasIsPointLog();

      boolean getIsPointLog();
   }

   public interface S2CR_BuyHit_23311OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasOfferPrice();

      int getOfferPrice();

      boolean hasHide();

      int getHide();
   }

   public interface S2CR_BuySubmit_23313OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasOfferPrice();

      int getOfferPrice();

      boolean hasHide();

      int getHide();
   }

   public interface S2CR_GM_23381OrBuilder extends MessageOrBuilder {
      boolean hasString();

      String getString();

      ByteString getStringBytes();
   }

   public interface S2CR_Hatch_23336OrBuilder extends MessageOrBuilder {
      boolean hasHatchType();

      int getHatchType();

      boolean hasPlayerHatchNum();

      long getPlayerHatchNum();

      List<CommonMsg.MapDataII> getPlayerQualityHatchNumList();

      CommonMsg.MapDataII getPlayerQualityHatchNum(int index);

      int getPlayerQualityHatchNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getPlayerQualityHatchNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getPlayerQualityHatchNumOrBuilder(int index);
   }

   public interface S2CR_MartInfo_23301OrBuilder extends MessageOrBuilder {
      List<Integer> getAddGridIndexList();

      int getAddGridIndexCount();

      int getAddGridIndex(int index);
   }

   public interface S2CR_SellHit_23305OrBuilder extends MessageOrBuilder {
      boolean hasItemCode();

      int getItemCode();

      boolean hasOriPrice();

      int getOriPrice();

      boolean hasMaxPrice();

      int getMaxPrice();

      boolean hasHie();

      int getHie();

      boolean hasTotalGridNum();

      int getTotalGridNum();
   }

   public interface S2CR_Sell_23307OrBuilder extends MessageOrBuilder {
      boolean hasItemInfo();

      BagMsg.Item_Info getItemInfo();

      BagMsg.Item_InfoOrBuilder getItemInfoOrBuilder();

      boolean hasOriPrice();

      int getOriPrice();

      boolean hasMaxPrice();

      int getMaxPrice();

      boolean hasHide();

      int getHide();
   }

   public interface S2CR_UploadOffGoods_23321OrBuilder extends MessageOrBuilder {
      List<MartMsg.Goods> getTakeOffGoodsList();

      MartMsg.Goods getTakeOffGoods(int index);

      int getTakeOffGoodsCount();

      List<? extends MartMsg.GoodsOrBuilder> getTakeOffGoodsOrBuilderList();

      MartMsg.GoodsOrBuilder getTakeOffGoodsOrBuilder(int index);

      List<MartMsg.Goods> getUnGetGoodsList();

      MartMsg.Goods getUnGetGoods(int index);

      int getUnGetGoodsCount();

      List<? extends MartMsg.GoodsOrBuilder> getUnGetGoodsOrBuilderList();

      MartMsg.GoodsOrBuilder getUnGetGoodsOrBuilder(int index);
   }
}
