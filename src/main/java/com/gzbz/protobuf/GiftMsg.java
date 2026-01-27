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

public final class GiftMsg {
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_GiftData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_GiftData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_LevelGiftData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_LevelGiftData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_WarOrderData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_WarOrderData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private GiftMsg() {
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
      String[] descriptorData = new String[]{"\n\nGift.proto\u0012\u0016gift.com.gzbz.protobuf\"4\n\u0014TimeLimitGiftBuyData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuyCount\u0018\u0002 \u0002(\u0005\"@\n\u0011TimeLimitGiftData\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bplayerLv\u0018\u0003 \u0002(\u0005\"I\n\bGiftData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuyCount\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006gotDay\u0018\u0004 \u0002(\u0005\",\n\rLevelGiftData\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\"I\n\fWarOrderData\u0012\u000e\n\u0006system\u0018\u0001 \u0002(\u0005\u0012\u0014\n\frewardCommon\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000brewardSuper\u0018\u0003 \u0003(\u0005\"_\n S2C_TimeLimitGiftListNotify_8601\u0012;\n\bgiftData\u0018\u0001 \u0003(\u000b2).gift.com.gzbz.protobuf.TimeLimitGiftData\"-\n\u001fC2S_TimeLimitGiftEndNotify_8602\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"-\n\u001fS2C_TimeLimitGiftEndNotify_8603\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"*\n\u0019C2S_TimeLimitGiftBuy_8604\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\"<\n\u0019S2C_TimeLimitGiftBuy_8605\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuyCount\u0018\u0002 \u0002(\u0005\"\u001c\n\u001aC2S_TimeLimitGiftList_8606\" \u0001\n\u001aS2C_TimeLimitGiftList_8607\u0012?\n\fgiftDataList\u0018\u0001 \u0003(\u000b2).gift.com.gzbz.protobuf.TimeLimitGiftData\u0012A\n\u000bbuyGiftList\u0018\u0002 \u0003(\u000b2,.gift.com.gzbz.protobuf.TimeLimitGiftBuyData\"!\n\u0010C2S_GiftBuy_8609\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\"T\n\u0010S2C_GiftBuy_8610\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bbuyCount\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006gotDay\u0018\u0004 \u0002(\u0005\"\u0013\n\u0011C2S_GiftList_8611\"D\n\u0011S2C_GiftList_8612\u0012/\n\u0005gifts\u0018\u0001 \u0003(\u000b2 .gift.com.gzbz.protobuf.GiftData\"\u0018\n\u0016C2S_LevelGiftMain_8613\"P\n\u0016S2C_LevelGiftMain_8614\u00126\n\u0007gotGift\u0018\u0001 \u0003(\u000b2%.gift.com.gzbz.protobuf.LevelGiftData\"R\n\u0018C2S_LevelGiftReward_8615\u00126\n\u0007getGift\u0018\u0001 \u0002(\u000b2%.gift.com.gzbz.protobuf.LevelGiftData\"R\n\u0018S2C_LevelGiftReward_8616\u00126\n\u0007getGift\u0018\u0001 \u0002(\u000b2%.gift.com.gzbz.protobuf.LevelGiftData\"\u0017\n\u0015C2S_ActLimitShop_8617\"0\n\u0015S2C_ActLimitShop_8618\u0012\u0017\n\u000factTriggerGifts\u0018\u0001 \u0003(\u0005\"8\n\u0019C2S_WeeklyCardReward_8619\u0012\u000e\n\u0006giftId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0002 \u0002(\u0005\"8\n\u0019S2C_WeeklyCardReward_8620\u0012\u000e\n\u0006giftId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0002 \u0002(\u0005\"'\n\u0017C2S_GeneralWelfare_8623\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"a\n\u0017S2C_GeneralWelfare_8624\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\u0012\u0014\n\frewardCommon\u0018\u0003 \u0003(\u0005\u0012\u0013\n\u000brewardSuper\u0018\u0004 \u0003(\u0005\"/\n\u001dC2S_GeneralWelfareReward_8625\u0012\u000e\n\u0006reward\u0018\u0001 \u0002(\u0005\"Z\n\u001dS2C_GeneralWelfareReward_8626\u0012\u000e\n\u0006reward\u0018\u0001 \u0002(\u0005\u0012\u0014\n\frewardCommon\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000brewardSuper\u0018\u0003 \u0003(\u0005\"<\n\u001dS2C_GeneralWelfareNotify_8628\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0002(\u0005\"\u0013\n\u0011C2S_WarOrder_8629\"K\n\u0011S2C_WarOrder_8630\u00126\n\bwarOrder\u0018\u0001 \u0003(\u000b2$.gift.com.gzbz.protobuf.WarOrderData\"9\n\u0017C2S_WarOrderReward_8631\u0012\u000e\n\u0006system\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006reward\u0018\u0002 \u0002(\u0005\"Q\n\u0017S2C_WarOrderReward_8632\u00126\n\bwarOrder\u0018\u0001 \u0002(\u000b2$.gift.com.gzbz.protobuf.WarOrderData\"B\n\u001dC2S_WarOrderOneKeyReward_8633\u0012\u000e\n\u0006system\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tstageType\u0018\u0002 \u0002(\u0005\"j\n\u001dS2C_WarOrderOneKeyReward_8634\u00126\n\bwarOrder\u0018\u0001 \u0002(\u000b2$.gift.com.gzbz.protobuf.WarOrderData\u0012\u0011\n\tstageType\u0018\u0002 \u0002(\u0005\"?\n C2S_SpecialWeeklyCardReward_8635\u0012\u000e\n\u0006giftId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0002 \u0002(\u0005\"?\n S2C_SpecialWeeklyCardReward_8636\u0012\u000e\n\u0006giftId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0002 \u0002(\u0005\"8\n%C2S_SpecialWeeklyCardPointReward_8637\u0012\u000f\n\u0007awardId\u0018\u0001 \u0002(\u0005\"8\n%S2C_SpecialWeeklyCardPointReward_8638\u0012\u000f\n\u0007awardId\u0018\u0001 \u0002(\u0005\"\"\n C2S_LifeTimeCardGiftBuyInfo_8639\"1\n S2C_LifeTimeCardGiftBuyInfo_8640\u0012\r\n\u0005isBuy\u0018\u0001 \u0002(\bB\u001e\n\u0011com.gzbz.protobufB\u0007GiftMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_descriptor, new String[]{"Id", "BuyCount"});
      internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_descriptor, new String[]{"Type", "End", "PlayerLv"});
      internal_static_gift_com_gzbz_protobuf_GiftData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_gift_com_gzbz_protobuf_GiftData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_GiftData_descriptor, new String[]{"Id", "BuyCount", "EndTime", "GotDay"});
      internal_static_gift_com_gzbz_protobuf_LevelGiftData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_gift_com_gzbz_protobuf_LevelGiftData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_LevelGiftData_descriptor, new String[]{"Type", "Level"});
      internal_static_gift_com_gzbz_protobuf_WarOrderData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_gift_com_gzbz_protobuf_WarOrderData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_WarOrderData_descriptor, new String[]{"System", "RewardCommon", "RewardSuper"});
      internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_descriptor, new String[]{"GiftData"});
      internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_descriptor, new String[]{"Id"});
      internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_descriptor, new String[]{"Id"});
      internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_descriptor, new String[]{"BuyId"});
      internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_descriptor, new String[]{"BuyId", "BuyCount"});
      internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_descriptor, new String[0]);
      internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_descriptor, new String[]{"GiftDataList", "BuyGiftList"});
      internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_descriptor, new String[]{"BuyId"});
      internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_descriptor, new String[]{"BuyId", "BuyCount", "EndTime", "GotDay"});
      internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_descriptor, new String[0]);
      internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_descriptor, new String[]{"Gifts"});
      internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_descriptor, new String[0]);
      internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_descriptor, new String[]{"GotGift"});
      internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_descriptor, new String[]{"GetGift"});
      internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_descriptor, new String[]{"GetGift"});
      internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_descriptor, new String[0]);
      internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_descriptor, new String[]{"ActTriggerGifts"});
      internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_descriptor, new String[]{"GiftId", "Day"});
      internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_descriptor, new String[]{"GiftId", "Day"});
      internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_descriptor, new String[]{"Type"});
      internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_descriptor, new String[]{"Type", "Count", "RewardCommon", "RewardSuper"});
      internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_descriptor, new String[]{"Reward"});
      internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_descriptor, new String[]{"Reward", "RewardCommon", "RewardSuper"});
      internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_descriptor, new String[]{"Type", "Count"});
      internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_descriptor, new String[0]);
      internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_descriptor, new String[]{"WarOrder"});
      internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_descriptor, new String[]{"System", "Reward"});
      internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_descriptor, new String[]{"WarOrder"});
      internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_descriptor, new String[]{"System", "StageType"});
      internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_descriptor, new String[]{"WarOrder", "StageType"});
      internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_descriptor, new String[]{"GiftId", "Day"});
      internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_descriptor, new String[]{"GiftId", "Day"});
      internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_descriptor, new String[]{"AwardId"});
      internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_descriptor, new String[]{"AwardId"});
      internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_descriptor, new String[0]);
      internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_descriptor, new String[]{"IsBuy"});
   }

   public static final class TimeLimitGiftBuyData extends GeneratedMessageV3 implements TimeLimitGiftBuyDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int BUYCOUNT_FIELD_NUMBER = 2;
      private int buyCount_;
      private byte memoizedIsInitialized;
      private static final TimeLimitGiftBuyData DEFAULT_INSTANCE = new TimeLimitGiftBuyData();
      /** @deprecated */
      @Deprecated
      public static final Parser<TimeLimitGiftBuyData> PARSER = new AbstractParser<TimeLimitGiftBuyData>() {
         public TimeLimitGiftBuyData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TimeLimitGiftBuyData(input, extensionRegistry);
         }
      };

      private TimeLimitGiftBuyData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TimeLimitGiftBuyData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TimeLimitGiftBuyData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TimeLimitGiftBuyData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyCount_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_fieldAccessorTable.ensureFieldAccessorsInitialized(TimeLimitGiftBuyData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasBuyCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyCount() {
         return this.buyCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.id_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TimeLimitGiftBuyData)) {
            return super.equals(obj);
         } else {
            TimeLimitGiftBuyData other = (TimeLimitGiftBuyData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasBuyCount() != other.hasBuyCount()) {
               return false;
            } else if (this.hasBuyCount() && this.getBuyCount() != other.getBuyCount()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            if (this.hasBuyCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TimeLimitGiftBuyData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TimeLimitGiftBuyData)PARSER.parseFrom(data);
      }

      public static TimeLimitGiftBuyData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TimeLimitGiftBuyData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TimeLimitGiftBuyData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TimeLimitGiftBuyData)PARSER.parseFrom(data);
      }

      public static TimeLimitGiftBuyData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TimeLimitGiftBuyData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TimeLimitGiftBuyData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TimeLimitGiftBuyData)PARSER.parseFrom(data);
      }

      public static TimeLimitGiftBuyData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TimeLimitGiftBuyData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TimeLimitGiftBuyData parseFrom(InputStream input) throws IOException {
         return (TimeLimitGiftBuyData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TimeLimitGiftBuyData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TimeLimitGiftBuyData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TimeLimitGiftBuyData parseDelimitedFrom(InputStream input) throws IOException {
         return (TimeLimitGiftBuyData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TimeLimitGiftBuyData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TimeLimitGiftBuyData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TimeLimitGiftBuyData parseFrom(CodedInputStream input) throws IOException {
         return (TimeLimitGiftBuyData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TimeLimitGiftBuyData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TimeLimitGiftBuyData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TimeLimitGiftBuyData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TimeLimitGiftBuyData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TimeLimitGiftBuyData> parser() {
         return PARSER;
      }

      public Parser<TimeLimitGiftBuyData> getParserForType() {
         return PARSER;
      }

      public TimeLimitGiftBuyData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TimeLimitGiftBuyDataOrBuilder {
         private int bitField0_;
         private int id_;
         private int buyCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_fieldAccessorTable.ensureFieldAccessorsInitialized(TimeLimitGiftBuyData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.TimeLimitGiftBuyData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.buyCount_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftBuyData_descriptor;
         }

         public TimeLimitGiftBuyData getDefaultInstanceForType() {
            return GiftMsg.TimeLimitGiftBuyData.getDefaultInstance();
         }

         public TimeLimitGiftBuyData build() {
            TimeLimitGiftBuyData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TimeLimitGiftBuyData buildPartial() {
            TimeLimitGiftBuyData result = new TimeLimitGiftBuyData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyCount_ = this.buyCount_;
               to_bitField0_ |= 2;
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
            if (other instanceof TimeLimitGiftBuyData) {
               return this.mergeFrom((TimeLimitGiftBuyData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TimeLimitGiftBuyData other) {
            if (other == GiftMsg.TimeLimitGiftBuyData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasBuyCount()) {
                  this.setBuyCount(other.getBuyCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasBuyCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TimeLimitGiftBuyData parsedMessage = null;

            try {
               parsedMessage = (TimeLimitGiftBuyData)GiftMsg.TimeLimitGiftBuyData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TimeLimitGiftBuyData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 1;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyCount() {
            return this.buyCount_;
         }

         public Builder setBuyCount(int value) {
            this.bitField0_ |= 2;
            this.buyCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyCount() {
            this.bitField0_ &= -3;
            this.buyCount_ = 0;
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

   public static final class TimeLimitGiftData extends GeneratedMessageV3 implements TimeLimitGiftDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int END_FIELD_NUMBER = 2;
      private int end_;
      public static final int PLAYERLV_FIELD_NUMBER = 3;
      private int playerLv_;
      private byte memoizedIsInitialized;
      private static final TimeLimitGiftData DEFAULT_INSTANCE = new TimeLimitGiftData();
      /** @deprecated */
      @Deprecated
      public static final Parser<TimeLimitGiftData> PARSER = new AbstractParser<TimeLimitGiftData>() {
         public TimeLimitGiftData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TimeLimitGiftData(input, extensionRegistry);
         }
      };

      private TimeLimitGiftData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TimeLimitGiftData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TimeLimitGiftData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TimeLimitGiftData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.end_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerLv_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(TimeLimitGiftData.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasEnd() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEnd() {
         return this.end_;
      }

      public boolean hasPlayerLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayerLv() {
         return this.playerLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.end_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.end_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TimeLimitGiftData)) {
            return super.equals(obj);
         } else {
            TimeLimitGiftData other = (TimeLimitGiftData)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasEnd() != other.hasEnd()) {
               return false;
            } else if (this.hasEnd() && this.getEnd() != other.getEnd()) {
               return false;
            } else if (this.hasPlayerLv() != other.hasPlayerLv()) {
               return false;
            } else if (this.hasPlayerLv() && this.getPlayerLv() != other.getPlayerLv()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasEnd()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEnd();
            }

            if (this.hasPlayerLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TimeLimitGiftData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TimeLimitGiftData)PARSER.parseFrom(data);
      }

      public static TimeLimitGiftData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TimeLimitGiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TimeLimitGiftData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TimeLimitGiftData)PARSER.parseFrom(data);
      }

      public static TimeLimitGiftData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TimeLimitGiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TimeLimitGiftData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TimeLimitGiftData)PARSER.parseFrom(data);
      }

      public static TimeLimitGiftData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TimeLimitGiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TimeLimitGiftData parseFrom(InputStream input) throws IOException {
         return (TimeLimitGiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TimeLimitGiftData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TimeLimitGiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TimeLimitGiftData parseDelimitedFrom(InputStream input) throws IOException {
         return (TimeLimitGiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TimeLimitGiftData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TimeLimitGiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TimeLimitGiftData parseFrom(CodedInputStream input) throws IOException {
         return (TimeLimitGiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TimeLimitGiftData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TimeLimitGiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TimeLimitGiftData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TimeLimitGiftData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TimeLimitGiftData> parser() {
         return PARSER;
      }

      public Parser<TimeLimitGiftData> getParserForType() {
         return PARSER;
      }

      public TimeLimitGiftData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TimeLimitGiftDataOrBuilder {
         private int bitField0_;
         private int type_;
         private int end_;
         private int playerLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(TimeLimitGiftData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.TimeLimitGiftData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.end_ = 0;
            this.bitField0_ &= -3;
            this.playerLv_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_TimeLimitGiftData_descriptor;
         }

         public TimeLimitGiftData getDefaultInstanceForType() {
            return GiftMsg.TimeLimitGiftData.getDefaultInstance();
         }

         public TimeLimitGiftData build() {
            TimeLimitGiftData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TimeLimitGiftData buildPartial() {
            TimeLimitGiftData result = new TimeLimitGiftData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.end_ = this.end_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.playerLv_ = this.playerLv_;
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
            if (other instanceof TimeLimitGiftData) {
               return this.mergeFrom((TimeLimitGiftData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TimeLimitGiftData other) {
            if (other == GiftMsg.TimeLimitGiftData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasEnd()) {
                  this.setEnd(other.getEnd());
               }

               if (other.hasPlayerLv()) {
                  this.setPlayerLv(other.getPlayerLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasEnd()) {
               return false;
            } else {
               return this.hasPlayerLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TimeLimitGiftData parsedMessage = null;

            try {
               parsedMessage = (TimeLimitGiftData)GiftMsg.TimeLimitGiftData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TimeLimitGiftData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEnd() {
            return this.end_;
         }

         public Builder setEnd(int value) {
            this.bitField0_ |= 2;
            this.end_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPlayerLv() {
            return this.playerLv_;
         }

         public Builder setPlayerLv(int value) {
            this.bitField0_ |= 4;
            this.playerLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerLv() {
            this.bitField0_ &= -5;
            this.playerLv_ = 0;
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

   public static final class GiftData extends GeneratedMessageV3 implements GiftDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int BUYCOUNT_FIELD_NUMBER = 2;
      private int buyCount_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int GOTDAY_FIELD_NUMBER = 4;
      private int gotDay_;
      private byte memoizedIsInitialized;
      private static final GiftData DEFAULT_INSTANCE = new GiftData();
      /** @deprecated */
      @Deprecated
      public static final Parser<GiftData> PARSER = new AbstractParser<GiftData>() {
         public GiftData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GiftData(input, extensionRegistry);
         }
      };

      private GiftData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GiftData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GiftData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GiftData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.gotDay_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_GiftData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_GiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(GiftData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasBuyCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyCount() {
         return this.buyCount_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasGotDay() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGotDay() {
         return this.gotDay_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGotDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.gotDay_);
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
               size += CodedOutputStream.computeInt32Size(1, this.id_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.gotDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GiftData)) {
            return super.equals(obj);
         } else {
            GiftData other = (GiftData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasBuyCount() != other.hasBuyCount()) {
               return false;
            } else if (this.hasBuyCount() && this.getBuyCount() != other.getBuyCount()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasGotDay() != other.hasGotDay()) {
               return false;
            } else if (this.hasGotDay() && this.getGotDay() != other.getGotDay()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            if (this.hasBuyCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyCount();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasGotDay()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGotDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GiftData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data);
      }

      public static GiftData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GiftData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data);
      }

      public static GiftData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GiftData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data);
      }

      public static GiftData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GiftData parseFrom(InputStream input) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GiftData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GiftData parseDelimitedFrom(InputStream input) throws IOException {
         return (GiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GiftData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GiftData parseFrom(CodedInputStream input) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GiftData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GiftData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GiftData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GiftData> parser() {
         return PARSER;
      }

      public Parser<GiftData> getParserForType() {
         return PARSER;
      }

      public GiftData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GiftDataOrBuilder {
         private int bitField0_;
         private int id_;
         private int buyCount_;
         private int endTime_;
         private int gotDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_GiftData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_GiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(GiftData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.GiftData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.buyCount_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.gotDay_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_GiftData_descriptor;
         }

         public GiftData getDefaultInstanceForType() {
            return GiftMsg.GiftData.getDefaultInstance();
         }

         public GiftData build() {
            GiftData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GiftData buildPartial() {
            GiftData result = new GiftData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyCount_ = this.buyCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.gotDay_ = this.gotDay_;
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
            if (other instanceof GiftData) {
               return this.mergeFrom((GiftData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GiftData other) {
            if (other == GiftMsg.GiftData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasBuyCount()) {
                  this.setBuyCount(other.getBuyCount());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasGotDay()) {
                  this.setGotDay(other.getGotDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasBuyCount()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else {
               return this.hasGotDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GiftData parsedMessage = null;

            try {
               parsedMessage = (GiftData)GiftMsg.GiftData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GiftData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 1;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyCount() {
            return this.buyCount_;
         }

         public Builder setBuyCount(int value) {
            this.bitField0_ |= 2;
            this.buyCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyCount() {
            this.bitField0_ &= -3;
            this.buyCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 4;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -5;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGotDay() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGotDay() {
            return this.gotDay_;
         }

         public Builder setGotDay(int value) {
            this.bitField0_ |= 8;
            this.gotDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotDay() {
            this.bitField0_ &= -9;
            this.gotDay_ = 0;
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

   public static final class LevelGiftData extends GeneratedMessageV3 implements LevelGiftDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      private byte memoizedIsInitialized;
      private static final LevelGiftData DEFAULT_INSTANCE = new LevelGiftData();
      /** @deprecated */
      @Deprecated
      public static final Parser<LevelGiftData> PARSER = new AbstractParser<LevelGiftData>() {
         public LevelGiftData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new LevelGiftData(input, extensionRegistry);
         }
      };

      private LevelGiftData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private LevelGiftData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new LevelGiftData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private LevelGiftData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_LevelGiftData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_LevelGiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(LevelGiftData.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.level_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof LevelGiftData)) {
            return super.equals(obj);
         } else {
            LevelGiftData other = (LevelGiftData)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static LevelGiftData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (LevelGiftData)PARSER.parseFrom(data);
      }

      public static LevelGiftData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LevelGiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LevelGiftData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (LevelGiftData)PARSER.parseFrom(data);
      }

      public static LevelGiftData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LevelGiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LevelGiftData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (LevelGiftData)PARSER.parseFrom(data);
      }

      public static LevelGiftData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LevelGiftData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LevelGiftData parseFrom(InputStream input) throws IOException {
         return (LevelGiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static LevelGiftData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LevelGiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static LevelGiftData parseDelimitedFrom(InputStream input) throws IOException {
         return (LevelGiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static LevelGiftData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LevelGiftData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static LevelGiftData parseFrom(CodedInputStream input) throws IOException {
         return (LevelGiftData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static LevelGiftData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LevelGiftData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(LevelGiftData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static LevelGiftData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<LevelGiftData> parser() {
         return PARSER;
      }

      public Parser<LevelGiftData> getParserForType() {
         return PARSER;
      }

      public LevelGiftData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LevelGiftDataOrBuilder {
         private int bitField0_;
         private int type_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_LevelGiftData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_LevelGiftData_fieldAccessorTable.ensureFieldAccessorsInitialized(LevelGiftData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.LevelGiftData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_LevelGiftData_descriptor;
         }

         public LevelGiftData getDefaultInstanceForType() {
            return GiftMsg.LevelGiftData.getDefaultInstance();
         }

         public LevelGiftData build() {
            LevelGiftData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public LevelGiftData buildPartial() {
            LevelGiftData result = new LevelGiftData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 2;
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
            if (other instanceof LevelGiftData) {
               return this.mergeFrom((LevelGiftData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(LevelGiftData other) {
            if (other == GiftMsg.LevelGiftData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            LevelGiftData parsedMessage = null;

            try {
               parsedMessage = (LevelGiftData)GiftMsg.LevelGiftData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (LevelGiftData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 2;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -3;
            this.level_ = 0;
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

   public static final class WarOrderData extends GeneratedMessageV3 implements WarOrderDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SYSTEM_FIELD_NUMBER = 1;
      private int system_;
      public static final int REWARDCOMMON_FIELD_NUMBER = 2;
      private Internal.IntList rewardCommon_;
      public static final int REWARDSUPER_FIELD_NUMBER = 3;
      private Internal.IntList rewardSuper_;
      private byte memoizedIsInitialized;
      private static final WarOrderData DEFAULT_INSTANCE = new WarOrderData();
      /** @deprecated */
      @Deprecated
      public static final Parser<WarOrderData> PARSER = new AbstractParser<WarOrderData>() {
         public WarOrderData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new WarOrderData(input, extensionRegistry);
         }
      };

      private WarOrderData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private WarOrderData() {
         this.memoizedIsInitialized = -1;
         this.rewardCommon_ = emptyIntList();
         this.rewardSuper_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new WarOrderData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private WarOrderData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 1;
                        this.system_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rewardCommon_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewardCommon_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardCommon_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rewardSuper_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rewardSuper_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardSuper_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.rewardSuper_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.rewardCommon_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.rewardCommon_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.rewardSuper_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_WarOrderData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_WarOrderData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarOrderData.class, Builder.class);
      }

      public boolean hasSystem() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSystem() {
         return this.system_;
      }

      public List<Integer> getRewardCommonList() {
         return this.rewardCommon_;
      }

      public int getRewardCommonCount() {
         return this.rewardCommon_.size();
      }

      public int getRewardCommon(int index) {
         return this.rewardCommon_.getInt(index);
      }

      public List<Integer> getRewardSuperList() {
         return this.rewardSuper_;
      }

      public int getRewardSuperCount() {
         return this.rewardSuper_.size();
      }

      public int getRewardSuper(int index) {
         return this.rewardSuper_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSystem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.system_);
         }

         for(int i = 0; i < this.rewardCommon_.size(); ++i) {
            output.writeInt32(2, this.rewardCommon_.getInt(i));
         }

         for(int i = 0; i < this.rewardSuper_.size(); ++i) {
            output.writeInt32(3, this.rewardSuper_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.system_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardCommon_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardCommon_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardCommonList().size();
            dataSize = 0;

            for(int i = 0; i < this.rewardSuper_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardSuper_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardSuperList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof WarOrderData)) {
            return super.equals(obj);
         } else {
            WarOrderData other = (WarOrderData)obj;
            if (this.hasSystem() != other.hasSystem()) {
               return false;
            } else if (this.hasSystem() && this.getSystem() != other.getSystem()) {
               return false;
            } else if (!this.getRewardCommonList().equals(other.getRewardCommonList())) {
               return false;
            } else if (!this.getRewardSuperList().equals(other.getRewardSuperList())) {
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
            if (this.hasSystem()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSystem();
            }

            if (this.getRewardCommonCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardCommonList().hashCode();
            }

            if (this.getRewardSuperCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardSuperList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static WarOrderData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (WarOrderData)PARSER.parseFrom(data);
      }

      public static WarOrderData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarOrderData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarOrderData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (WarOrderData)PARSER.parseFrom(data);
      }

      public static WarOrderData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarOrderData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarOrderData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (WarOrderData)PARSER.parseFrom(data);
      }

      public static WarOrderData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (WarOrderData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static WarOrderData parseFrom(InputStream input) throws IOException {
         return (WarOrderData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarOrderData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarOrderData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarOrderData parseDelimitedFrom(InputStream input) throws IOException {
         return (WarOrderData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static WarOrderData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarOrderData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static WarOrderData parseFrom(CodedInputStream input) throws IOException {
         return (WarOrderData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static WarOrderData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (WarOrderData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(WarOrderData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static WarOrderData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<WarOrderData> parser() {
         return PARSER;
      }

      public Parser<WarOrderData> getParserForType() {
         return PARSER;
      }

      public WarOrderData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WarOrderDataOrBuilder {
         private int bitField0_;
         private int system_;
         private Internal.IntList rewardCommon_;
         private Internal.IntList rewardSuper_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_WarOrderData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_WarOrderData_fieldAccessorTable.ensureFieldAccessorsInitialized(WarOrderData.class, Builder.class);
         }

         private Builder() {
            this.rewardCommon_ = GiftMsg.WarOrderData.emptyIntList();
            this.rewardSuper_ = GiftMsg.WarOrderData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardCommon_ = GiftMsg.WarOrderData.emptyIntList();
            this.rewardSuper_ = GiftMsg.WarOrderData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.WarOrderData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.system_ = 0;
            this.bitField0_ &= -2;
            this.rewardCommon_ = GiftMsg.WarOrderData.emptyIntList();
            this.bitField0_ &= -3;
            this.rewardSuper_ = GiftMsg.WarOrderData.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_WarOrderData_descriptor;
         }

         public WarOrderData getDefaultInstanceForType() {
            return GiftMsg.WarOrderData.getDefaultInstance();
         }

         public WarOrderData build() {
            WarOrderData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public WarOrderData buildPartial() {
            WarOrderData result = new WarOrderData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.system_ = this.system_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.rewardCommon_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.rewardCommon_ = this.rewardCommon_;
            if ((this.bitField0_ & 4) != 0) {
               this.rewardSuper_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.rewardSuper_ = this.rewardSuper_;
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
            if (other instanceof WarOrderData) {
               return this.mergeFrom((WarOrderData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(WarOrderData other) {
            if (other == GiftMsg.WarOrderData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSystem()) {
                  this.setSystem(other.getSystem());
               }

               if (!other.rewardCommon_.isEmpty()) {
                  if (this.rewardCommon_.isEmpty()) {
                     this.rewardCommon_ = other.rewardCommon_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRewardCommonIsMutable();
                     this.rewardCommon_.addAll(other.rewardCommon_);
                  }

                  this.onChanged();
               }

               if (!other.rewardSuper_.isEmpty()) {
                  if (this.rewardSuper_.isEmpty()) {
                     this.rewardSuper_ = other.rewardSuper_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureRewardSuperIsMutable();
                     this.rewardSuper_.addAll(other.rewardSuper_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSystem();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            WarOrderData parsedMessage = null;

            try {
               parsedMessage = (WarOrderData)GiftMsg.WarOrderData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (WarOrderData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSystem() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSystem() {
            return this.system_;
         }

         public Builder setSystem(int value) {
            this.bitField0_ |= 1;
            this.system_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSystem() {
            this.bitField0_ &= -2;
            this.system_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardCommonIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewardCommon_ = GiftMsg.WarOrderData.mutableCopy(this.rewardCommon_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getRewardCommonList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.rewardCommon_) : this.rewardCommon_);
         }

         public int getRewardCommonCount() {
            return this.rewardCommon_.size();
         }

         public int getRewardCommon(int index) {
            return this.rewardCommon_.getInt(index);
         }

         public Builder setRewardCommon(int index, int value) {
            this.ensureRewardCommonIsMutable();
            this.rewardCommon_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardCommon(int value) {
            this.ensureRewardCommonIsMutable();
            this.rewardCommon_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardCommon(Iterable<? extends Integer> values) {
            this.ensureRewardCommonIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardCommon_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardCommon() {
            this.rewardCommon_ = GiftMsg.WarOrderData.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureRewardSuperIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rewardSuper_ = GiftMsg.WarOrderData.mutableCopy(this.rewardSuper_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getRewardSuperList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.rewardSuper_) : this.rewardSuper_);
         }

         public int getRewardSuperCount() {
            return this.rewardSuper_.size();
         }

         public int getRewardSuper(int index) {
            return this.rewardSuper_.getInt(index);
         }

         public Builder setRewardSuper(int index, int value) {
            this.ensureRewardSuperIsMutable();
            this.rewardSuper_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardSuper(int value) {
            this.ensureRewardSuperIsMutable();
            this.rewardSuper_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardSuper(Iterable<? extends Integer> values) {
            this.ensureRewardSuperIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardSuper_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardSuper() {
            this.rewardSuper_ = GiftMsg.WarOrderData.emptyIntList();
            this.bitField0_ &= -5;
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

   public static final class S2C_TimeLimitGiftListNotify_8601 extends GeneratedMessageV3 implements S2C_TimeLimitGiftListNotify_8601OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GIFTDATA_FIELD_NUMBER = 1;
      private List<TimeLimitGiftData> giftData_;
      private byte memoizedIsInitialized;
      private static final S2C_TimeLimitGiftListNotify_8601 DEFAULT_INSTANCE = new S2C_TimeLimitGiftListNotify_8601();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TimeLimitGiftListNotify_8601> PARSER = new AbstractParser<S2C_TimeLimitGiftListNotify_8601>() {
         public S2C_TimeLimitGiftListNotify_8601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TimeLimitGiftListNotify_8601(input, extensionRegistry);
         }
      };

      private S2C_TimeLimitGiftListNotify_8601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TimeLimitGiftListNotify_8601() {
         this.memoizedIsInitialized = -1;
         this.giftData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TimeLimitGiftListNotify_8601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TimeLimitGiftListNotify_8601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.giftData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.giftData_.add(input.readMessage(GiftMsg.TimeLimitGiftData.PARSER, extensionRegistry));
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
                  this.giftData_ = Collections.unmodifiableList(this.giftData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TimeLimitGiftListNotify_8601.class, Builder.class);
      }

      public List<TimeLimitGiftData> getGiftDataList() {
         return this.giftData_;
      }

      public List<? extends TimeLimitGiftDataOrBuilder> getGiftDataOrBuilderList() {
         return this.giftData_;
      }

      public int getGiftDataCount() {
         return this.giftData_.size();
      }

      public TimeLimitGiftData getGiftData(int index) {
         return (TimeLimitGiftData)this.giftData_.get(index);
      }

      public TimeLimitGiftDataOrBuilder getGiftDataOrBuilder(int index) {
         return (TimeLimitGiftDataOrBuilder)this.giftData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGiftDataCount(); ++i) {
               if (!this.getGiftData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.giftData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.giftData_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.giftData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.giftData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TimeLimitGiftListNotify_8601)) {
            return super.equals(obj);
         } else {
            S2C_TimeLimitGiftListNotify_8601 other = (S2C_TimeLimitGiftListNotify_8601)obj;
            if (!this.getGiftDataList().equals(other.getGiftDataList())) {
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
            if (this.getGiftDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftListNotify_8601)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftListNotify_8601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftListNotify_8601)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftListNotify_8601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftListNotify_8601)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftListNotify_8601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(InputStream input) throws IOException {
         return (S2C_TimeLimitGiftListNotify_8601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftListNotify_8601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TimeLimitGiftListNotify_8601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftListNotify_8601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TimeLimitGiftListNotify_8601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftListNotify_8601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftListNotify_8601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TimeLimitGiftListNotify_8601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TimeLimitGiftListNotify_8601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TimeLimitGiftListNotify_8601> parser() {
         return PARSER;
      }

      public Parser<S2C_TimeLimitGiftListNotify_8601> getParserForType() {
         return PARSER;
      }

      public S2C_TimeLimitGiftListNotify_8601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TimeLimitGiftListNotify_8601OrBuilder {
         private int bitField0_;
         private List<TimeLimitGiftData> giftData_;
         private RepeatedFieldBuilderV3<TimeLimitGiftData, TimeLimitGiftData.Builder, TimeLimitGiftDataOrBuilder> giftDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TimeLimitGiftListNotify_8601.class, Builder.class);
         }

         private Builder() {
            this.giftData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.giftData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_TimeLimitGiftListNotify_8601.alwaysUseFieldBuilders) {
               this.getGiftDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.giftDataBuilder_ == null) {
               this.giftData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.giftDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftListNotify_8601_descriptor;
         }

         public S2C_TimeLimitGiftListNotify_8601 getDefaultInstanceForType() {
            return GiftMsg.S2C_TimeLimitGiftListNotify_8601.getDefaultInstance();
         }

         public S2C_TimeLimitGiftListNotify_8601 build() {
            S2C_TimeLimitGiftListNotify_8601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TimeLimitGiftListNotify_8601 buildPartial() {
            S2C_TimeLimitGiftListNotify_8601 result = new S2C_TimeLimitGiftListNotify_8601(this);
            int from_bitField0_ = this.bitField0_;
            if (this.giftDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.giftData_ = Collections.unmodifiableList(this.giftData_);
                  this.bitField0_ &= -2;
               }

               result.giftData_ = this.giftData_;
            } else {
               result.giftData_ = this.giftDataBuilder_.build();
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
            if (other instanceof S2C_TimeLimitGiftListNotify_8601) {
               return this.mergeFrom((S2C_TimeLimitGiftListNotify_8601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TimeLimitGiftListNotify_8601 other) {
            if (other == GiftMsg.S2C_TimeLimitGiftListNotify_8601.getDefaultInstance()) {
               return this;
            } else {
               if (this.giftDataBuilder_ == null) {
                  if (!other.giftData_.isEmpty()) {
                     if (this.giftData_.isEmpty()) {
                        this.giftData_ = other.giftData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGiftDataIsMutable();
                        this.giftData_.addAll(other.giftData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.giftData_.isEmpty()) {
                  if (this.giftDataBuilder_.isEmpty()) {
                     this.giftDataBuilder_.dispose();
                     this.giftDataBuilder_ = null;
                     this.giftData_ = other.giftData_;
                     this.bitField0_ &= -2;
                     this.giftDataBuilder_ = GiftMsg.S2C_TimeLimitGiftListNotify_8601.alwaysUseFieldBuilders ? this.getGiftDataFieldBuilder() : null;
                  } else {
                     this.giftDataBuilder_.addAllMessages(other.giftData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGiftDataCount(); ++i) {
               if (!this.getGiftData(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TimeLimitGiftListNotify_8601 parsedMessage = null;

            try {
               parsedMessage = (S2C_TimeLimitGiftListNotify_8601)GiftMsg.S2C_TimeLimitGiftListNotify_8601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TimeLimitGiftListNotify_8601)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGiftDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.giftData_ = new ArrayList(this.giftData_);
               this.bitField0_ |= 1;
            }

         }

         public List<TimeLimitGiftData> getGiftDataList() {
            return this.giftDataBuilder_ == null ? Collections.unmodifiableList(this.giftData_) : this.giftDataBuilder_.getMessageList();
         }

         public int getGiftDataCount() {
            return this.giftDataBuilder_ == null ? this.giftData_.size() : this.giftDataBuilder_.getCount();
         }

         public TimeLimitGiftData getGiftData(int index) {
            return this.giftDataBuilder_ == null ? (TimeLimitGiftData)this.giftData_.get(index) : (TimeLimitGiftData)this.giftDataBuilder_.getMessage(index);
         }

         public Builder setGiftData(int index, TimeLimitGiftData value) {
            if (this.giftDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftDataIsMutable();
               this.giftData_.set(index, value);
               this.onChanged();
            } else {
               this.giftDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGiftData(int index, TimeLimitGiftData.Builder builderForValue) {
            if (this.giftDataBuilder_ == null) {
               this.ensureGiftDataIsMutable();
               this.giftData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGiftData(TimeLimitGiftData value) {
            if (this.giftDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftDataIsMutable();
               this.giftData_.add(value);
               this.onChanged();
            } else {
               this.giftDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGiftData(int index, TimeLimitGiftData value) {
            if (this.giftDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftDataIsMutable();
               this.giftData_.add(index, value);
               this.onChanged();
            } else {
               this.giftDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGiftData(TimeLimitGiftData.Builder builderForValue) {
            if (this.giftDataBuilder_ == null) {
               this.ensureGiftDataIsMutable();
               this.giftData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.giftDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGiftData(int index, TimeLimitGiftData.Builder builderForValue) {
            if (this.giftDataBuilder_ == null) {
               this.ensureGiftDataIsMutable();
               this.giftData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGiftData(Iterable<? extends TimeLimitGiftData> values) {
            if (this.giftDataBuilder_ == null) {
               this.ensureGiftDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.giftData_);
               this.onChanged();
            } else {
               this.giftDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGiftData() {
            if (this.giftDataBuilder_ == null) {
               this.giftData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.giftDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeGiftData(int index) {
            if (this.giftDataBuilder_ == null) {
               this.ensureGiftDataIsMutable();
               this.giftData_.remove(index);
               this.onChanged();
            } else {
               this.giftDataBuilder_.remove(index);
            }

            return this;
         }

         public TimeLimitGiftData.Builder getGiftDataBuilder(int index) {
            return (TimeLimitGiftData.Builder)this.getGiftDataFieldBuilder().getBuilder(index);
         }

         public TimeLimitGiftDataOrBuilder getGiftDataOrBuilder(int index) {
            return this.giftDataBuilder_ == null ? (TimeLimitGiftDataOrBuilder)this.giftData_.get(index) : (TimeLimitGiftDataOrBuilder)this.giftDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TimeLimitGiftDataOrBuilder> getGiftDataOrBuilderList() {
            return this.giftDataBuilder_ != null ? this.giftDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.giftData_);
         }

         public TimeLimitGiftData.Builder addGiftDataBuilder() {
            return (TimeLimitGiftData.Builder)this.getGiftDataFieldBuilder().addBuilder(GiftMsg.TimeLimitGiftData.getDefaultInstance());
         }

         public TimeLimitGiftData.Builder addGiftDataBuilder(int index) {
            return (TimeLimitGiftData.Builder)this.getGiftDataFieldBuilder().addBuilder(index, GiftMsg.TimeLimitGiftData.getDefaultInstance());
         }

         public List<TimeLimitGiftData.Builder> getGiftDataBuilderList() {
            return this.getGiftDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TimeLimitGiftData, TimeLimitGiftData.Builder, TimeLimitGiftDataOrBuilder> getGiftDataFieldBuilder() {
            if (this.giftDataBuilder_ == null) {
               this.giftDataBuilder_ = new RepeatedFieldBuilderV3(this.giftData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.giftData_ = null;
            }

            return this.giftDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TimeLimitGiftEndNotify_8602 extends GeneratedMessageV3 implements C2S_TimeLimitGiftEndNotify_8602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_TimeLimitGiftEndNotify_8602 DEFAULT_INSTANCE = new C2S_TimeLimitGiftEndNotify_8602();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TimeLimitGiftEndNotify_8602> PARSER = new AbstractParser<C2S_TimeLimitGiftEndNotify_8602>() {
         public C2S_TimeLimitGiftEndNotify_8602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TimeLimitGiftEndNotify_8602(input, extensionRegistry);
         }
      };

      private C2S_TimeLimitGiftEndNotify_8602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TimeLimitGiftEndNotify_8602() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TimeLimitGiftEndNotify_8602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TimeLimitGiftEndNotify_8602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TimeLimitGiftEndNotify_8602.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.id_);
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
               size += CodedOutputStream.computeInt32Size(1, this.id_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TimeLimitGiftEndNotify_8602)) {
            return super.equals(obj);
         } else {
            C2S_TimeLimitGiftEndNotify_8602 other = (C2S_TimeLimitGiftEndNotify_8602)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftEndNotify_8602)PARSER.parseFrom(data);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftEndNotify_8602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftEndNotify_8602)PARSER.parseFrom(data);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftEndNotify_8602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftEndNotify_8602)PARSER.parseFrom(data);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftEndNotify_8602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(InputStream input) throws IOException {
         return (C2S_TimeLimitGiftEndNotify_8602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TimeLimitGiftEndNotify_8602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TimeLimitGiftEndNotify_8602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TimeLimitGiftEndNotify_8602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TimeLimitGiftEndNotify_8602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TimeLimitGiftEndNotify_8602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TimeLimitGiftEndNotify_8602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TimeLimitGiftEndNotify_8602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TimeLimitGiftEndNotify_8602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TimeLimitGiftEndNotify_8602> parser() {
         return PARSER;
      }

      public Parser<C2S_TimeLimitGiftEndNotify_8602> getParserForType() {
         return PARSER;
      }

      public C2S_TimeLimitGiftEndNotify_8602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TimeLimitGiftEndNotify_8602OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TimeLimitGiftEndNotify_8602.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_TimeLimitGiftEndNotify_8602.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftEndNotify_8602_descriptor;
         }

         public C2S_TimeLimitGiftEndNotify_8602 getDefaultInstanceForType() {
            return GiftMsg.C2S_TimeLimitGiftEndNotify_8602.getDefaultInstance();
         }

         public C2S_TimeLimitGiftEndNotify_8602 build() {
            C2S_TimeLimitGiftEndNotify_8602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TimeLimitGiftEndNotify_8602 buildPartial() {
            C2S_TimeLimitGiftEndNotify_8602 result = new C2S_TimeLimitGiftEndNotify_8602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof C2S_TimeLimitGiftEndNotify_8602) {
               return this.mergeFrom((C2S_TimeLimitGiftEndNotify_8602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TimeLimitGiftEndNotify_8602 other) {
            if (other == GiftMsg.C2S_TimeLimitGiftEndNotify_8602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TimeLimitGiftEndNotify_8602 parsedMessage = null;

            try {
               parsedMessage = (C2S_TimeLimitGiftEndNotify_8602)GiftMsg.C2S_TimeLimitGiftEndNotify_8602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TimeLimitGiftEndNotify_8602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 1;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -2;
            this.id_ = 0;
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

   public static final class S2C_TimeLimitGiftEndNotify_8603 extends GeneratedMessageV3 implements S2C_TimeLimitGiftEndNotify_8603OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_TimeLimitGiftEndNotify_8603 DEFAULT_INSTANCE = new S2C_TimeLimitGiftEndNotify_8603();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TimeLimitGiftEndNotify_8603> PARSER = new AbstractParser<S2C_TimeLimitGiftEndNotify_8603>() {
         public S2C_TimeLimitGiftEndNotify_8603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TimeLimitGiftEndNotify_8603(input, extensionRegistry);
         }
      };

      private S2C_TimeLimitGiftEndNotify_8603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TimeLimitGiftEndNotify_8603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TimeLimitGiftEndNotify_8603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TimeLimitGiftEndNotify_8603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TimeLimitGiftEndNotify_8603.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.id_);
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
               size += CodedOutputStream.computeInt32Size(1, this.id_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TimeLimitGiftEndNotify_8603)) {
            return super.equals(obj);
         } else {
            S2C_TimeLimitGiftEndNotify_8603 other = (S2C_TimeLimitGiftEndNotify_8603)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftEndNotify_8603)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftEndNotify_8603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftEndNotify_8603)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftEndNotify_8603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftEndNotify_8603)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftEndNotify_8603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(InputStream input) throws IOException {
         return (S2C_TimeLimitGiftEndNotify_8603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftEndNotify_8603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TimeLimitGiftEndNotify_8603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftEndNotify_8603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TimeLimitGiftEndNotify_8603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftEndNotify_8603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftEndNotify_8603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TimeLimitGiftEndNotify_8603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TimeLimitGiftEndNotify_8603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TimeLimitGiftEndNotify_8603> parser() {
         return PARSER;
      }

      public Parser<S2C_TimeLimitGiftEndNotify_8603> getParserForType() {
         return PARSER;
      }

      public S2C_TimeLimitGiftEndNotify_8603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TimeLimitGiftEndNotify_8603OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TimeLimitGiftEndNotify_8603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_TimeLimitGiftEndNotify_8603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftEndNotify_8603_descriptor;
         }

         public S2C_TimeLimitGiftEndNotify_8603 getDefaultInstanceForType() {
            return GiftMsg.S2C_TimeLimitGiftEndNotify_8603.getDefaultInstance();
         }

         public S2C_TimeLimitGiftEndNotify_8603 build() {
            S2C_TimeLimitGiftEndNotify_8603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TimeLimitGiftEndNotify_8603 buildPartial() {
            S2C_TimeLimitGiftEndNotify_8603 result = new S2C_TimeLimitGiftEndNotify_8603(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof S2C_TimeLimitGiftEndNotify_8603) {
               return this.mergeFrom((S2C_TimeLimitGiftEndNotify_8603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TimeLimitGiftEndNotify_8603 other) {
            if (other == GiftMsg.S2C_TimeLimitGiftEndNotify_8603.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TimeLimitGiftEndNotify_8603 parsedMessage = null;

            try {
               parsedMessage = (S2C_TimeLimitGiftEndNotify_8603)GiftMsg.S2C_TimeLimitGiftEndNotify_8603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TimeLimitGiftEndNotify_8603)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 1;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -2;
            this.id_ = 0;
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

   public static final class C2S_TimeLimitGiftBuy_8604 extends GeneratedMessageV3 implements C2S_TimeLimitGiftBuy_8604OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final C2S_TimeLimitGiftBuy_8604 DEFAULT_INSTANCE = new C2S_TimeLimitGiftBuy_8604();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TimeLimitGiftBuy_8604> PARSER = new AbstractParser<C2S_TimeLimitGiftBuy_8604>() {
         public C2S_TimeLimitGiftBuy_8604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TimeLimitGiftBuy_8604(input, extensionRegistry);
         }
      };

      private C2S_TimeLimitGiftBuy_8604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TimeLimitGiftBuy_8604() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TimeLimitGiftBuy_8604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TimeLimitGiftBuy_8604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TimeLimitGiftBuy_8604.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TimeLimitGiftBuy_8604)) {
            return super.equals(obj);
         } else {
            C2S_TimeLimitGiftBuy_8604 other = (C2S_TimeLimitGiftBuy_8604)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftBuy_8604)PARSER.parseFrom(data);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftBuy_8604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftBuy_8604)PARSER.parseFrom(data);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftBuy_8604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftBuy_8604)PARSER.parseFrom(data);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftBuy_8604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(InputStream input) throws IOException {
         return (C2S_TimeLimitGiftBuy_8604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TimeLimitGiftBuy_8604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TimeLimitGiftBuy_8604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TimeLimitGiftBuy_8604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TimeLimitGiftBuy_8604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TimeLimitGiftBuy_8604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TimeLimitGiftBuy_8604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TimeLimitGiftBuy_8604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TimeLimitGiftBuy_8604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TimeLimitGiftBuy_8604> parser() {
         return PARSER;
      }

      public Parser<C2S_TimeLimitGiftBuy_8604> getParserForType() {
         return PARSER;
      }

      public C2S_TimeLimitGiftBuy_8604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TimeLimitGiftBuy_8604OrBuilder {
         private int bitField0_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TimeLimitGiftBuy_8604.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_TimeLimitGiftBuy_8604.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftBuy_8604_descriptor;
         }

         public C2S_TimeLimitGiftBuy_8604 getDefaultInstanceForType() {
            return GiftMsg.C2S_TimeLimitGiftBuy_8604.getDefaultInstance();
         }

         public C2S_TimeLimitGiftBuy_8604 build() {
            C2S_TimeLimitGiftBuy_8604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TimeLimitGiftBuy_8604 buildPartial() {
            C2S_TimeLimitGiftBuy_8604 result = new C2S_TimeLimitGiftBuy_8604(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof C2S_TimeLimitGiftBuy_8604) {
               return this.mergeFrom((C2S_TimeLimitGiftBuy_8604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TimeLimitGiftBuy_8604 other) {
            if (other == GiftMsg.C2S_TimeLimitGiftBuy_8604.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TimeLimitGiftBuy_8604 parsedMessage = null;

            try {
               parsedMessage = (C2S_TimeLimitGiftBuy_8604)GiftMsg.C2S_TimeLimitGiftBuy_8604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TimeLimitGiftBuy_8604)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
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

   public static final class S2C_TimeLimitGiftBuy_8605 extends GeneratedMessageV3 implements S2C_TimeLimitGiftBuy_8605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      public static final int BUYCOUNT_FIELD_NUMBER = 2;
      private int buyCount_;
      private byte memoizedIsInitialized;
      private static final S2C_TimeLimitGiftBuy_8605 DEFAULT_INSTANCE = new S2C_TimeLimitGiftBuy_8605();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TimeLimitGiftBuy_8605> PARSER = new AbstractParser<S2C_TimeLimitGiftBuy_8605>() {
         public S2C_TimeLimitGiftBuy_8605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TimeLimitGiftBuy_8605(input, extensionRegistry);
         }
      };

      private S2C_TimeLimitGiftBuy_8605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TimeLimitGiftBuy_8605() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TimeLimitGiftBuy_8605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TimeLimitGiftBuy_8605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyCount_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TimeLimitGiftBuy_8605.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public boolean hasBuyCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyCount() {
         return this.buyCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TimeLimitGiftBuy_8605)) {
            return super.equals(obj);
         } else {
            S2C_TimeLimitGiftBuy_8605 other = (S2C_TimeLimitGiftBuy_8605)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
               return false;
            } else if (this.hasBuyCount() != other.hasBuyCount()) {
               return false;
            } else if (this.hasBuyCount() && this.getBuyCount() != other.getBuyCount()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            if (this.hasBuyCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftBuy_8605)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftBuy_8605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftBuy_8605)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftBuy_8605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftBuy_8605)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftBuy_8605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(InputStream input) throws IOException {
         return (S2C_TimeLimitGiftBuy_8605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftBuy_8605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TimeLimitGiftBuy_8605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftBuy_8605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TimeLimitGiftBuy_8605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftBuy_8605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftBuy_8605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TimeLimitGiftBuy_8605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TimeLimitGiftBuy_8605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TimeLimitGiftBuy_8605> parser() {
         return PARSER;
      }

      public Parser<S2C_TimeLimitGiftBuy_8605> getParserForType() {
         return PARSER;
      }

      public S2C_TimeLimitGiftBuy_8605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TimeLimitGiftBuy_8605OrBuilder {
         private int bitField0_;
         private int buyId_;
         private int buyCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TimeLimitGiftBuy_8605.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_TimeLimitGiftBuy_8605.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            this.buyCount_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftBuy_8605_descriptor;
         }

         public S2C_TimeLimitGiftBuy_8605 getDefaultInstanceForType() {
            return GiftMsg.S2C_TimeLimitGiftBuy_8605.getDefaultInstance();
         }

         public S2C_TimeLimitGiftBuy_8605 build() {
            S2C_TimeLimitGiftBuy_8605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TimeLimitGiftBuy_8605 buildPartial() {
            S2C_TimeLimitGiftBuy_8605 result = new S2C_TimeLimitGiftBuy_8605(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyCount_ = this.buyCount_;
               to_bitField0_ |= 2;
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
            if (other instanceof S2C_TimeLimitGiftBuy_8605) {
               return this.mergeFrom((S2C_TimeLimitGiftBuy_8605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TimeLimitGiftBuy_8605 other) {
            if (other == GiftMsg.S2C_TimeLimitGiftBuy_8605.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               if (other.hasBuyCount()) {
                  this.setBuyCount(other.getBuyCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBuyId()) {
               return false;
            } else {
               return this.hasBuyCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TimeLimitGiftBuy_8605 parsedMessage = null;

            try {
               parsedMessage = (S2C_TimeLimitGiftBuy_8605)GiftMsg.S2C_TimeLimitGiftBuy_8605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TimeLimitGiftBuy_8605)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyCount() {
            return this.buyCount_;
         }

         public Builder setBuyCount(int value) {
            this.bitField0_ |= 2;
            this.buyCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyCount() {
            this.bitField0_ &= -3;
            this.buyCount_ = 0;
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

   public static final class C2S_TimeLimitGiftList_8606 extends GeneratedMessageV3 implements C2S_TimeLimitGiftList_8606OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TimeLimitGiftList_8606 DEFAULT_INSTANCE = new C2S_TimeLimitGiftList_8606();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TimeLimitGiftList_8606> PARSER = new AbstractParser<C2S_TimeLimitGiftList_8606>() {
         public C2S_TimeLimitGiftList_8606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TimeLimitGiftList_8606(input, extensionRegistry);
         }
      };

      private C2S_TimeLimitGiftList_8606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TimeLimitGiftList_8606() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TimeLimitGiftList_8606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TimeLimitGiftList_8606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TimeLimitGiftList_8606.class, Builder.class);
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
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TimeLimitGiftList_8606)) {
            return super.equals(obj);
         } else {
            C2S_TimeLimitGiftList_8606 other = (C2S_TimeLimitGiftList_8606)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftList_8606)PARSER.parseFrom(data);
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftList_8606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftList_8606)PARSER.parseFrom(data);
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftList_8606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftList_8606)PARSER.parseFrom(data);
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TimeLimitGiftList_8606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(InputStream input) throws IOException {
         return (C2S_TimeLimitGiftList_8606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TimeLimitGiftList_8606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TimeLimitGiftList_8606 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TimeLimitGiftList_8606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TimeLimitGiftList_8606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TimeLimitGiftList_8606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TimeLimitGiftList_8606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TimeLimitGiftList_8606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TimeLimitGiftList_8606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TimeLimitGiftList_8606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TimeLimitGiftList_8606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TimeLimitGiftList_8606> parser() {
         return PARSER;
      }

      public Parser<C2S_TimeLimitGiftList_8606> getParserForType() {
         return PARSER;
      }

      public C2S_TimeLimitGiftList_8606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TimeLimitGiftList_8606OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TimeLimitGiftList_8606.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_TimeLimitGiftList_8606.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_TimeLimitGiftList_8606_descriptor;
         }

         public C2S_TimeLimitGiftList_8606 getDefaultInstanceForType() {
            return GiftMsg.C2S_TimeLimitGiftList_8606.getDefaultInstance();
         }

         public C2S_TimeLimitGiftList_8606 build() {
            C2S_TimeLimitGiftList_8606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TimeLimitGiftList_8606 buildPartial() {
            C2S_TimeLimitGiftList_8606 result = new C2S_TimeLimitGiftList_8606(this);
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
            if (other instanceof C2S_TimeLimitGiftList_8606) {
               return this.mergeFrom((C2S_TimeLimitGiftList_8606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TimeLimitGiftList_8606 other) {
            if (other == GiftMsg.C2S_TimeLimitGiftList_8606.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TimeLimitGiftList_8606 parsedMessage = null;

            try {
               parsedMessage = (C2S_TimeLimitGiftList_8606)GiftMsg.C2S_TimeLimitGiftList_8606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TimeLimitGiftList_8606)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

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

   public static final class S2C_TimeLimitGiftList_8607 extends GeneratedMessageV3 implements S2C_TimeLimitGiftList_8607OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GIFTDATALIST_FIELD_NUMBER = 1;
      private List<TimeLimitGiftData> giftDataList_;
      public static final int BUYGIFTLIST_FIELD_NUMBER = 2;
      private List<TimeLimitGiftBuyData> buyGiftList_;
      private byte memoizedIsInitialized;
      private static final S2C_TimeLimitGiftList_8607 DEFAULT_INSTANCE = new S2C_TimeLimitGiftList_8607();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TimeLimitGiftList_8607> PARSER = new AbstractParser<S2C_TimeLimitGiftList_8607>() {
         public S2C_TimeLimitGiftList_8607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TimeLimitGiftList_8607(input, extensionRegistry);
         }
      };

      private S2C_TimeLimitGiftList_8607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TimeLimitGiftList_8607() {
         this.memoizedIsInitialized = -1;
         this.giftDataList_ = Collections.emptyList();
         this.buyGiftList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TimeLimitGiftList_8607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TimeLimitGiftList_8607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.giftDataList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.giftDataList_.add(input.readMessage(GiftMsg.TimeLimitGiftData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.buyGiftList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.buyGiftList_.add(input.readMessage(GiftMsg.TimeLimitGiftBuyData.PARSER, extensionRegistry));
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
                  this.giftDataList_ = Collections.unmodifiableList(this.giftDataList_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.buyGiftList_ = Collections.unmodifiableList(this.buyGiftList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TimeLimitGiftList_8607.class, Builder.class);
      }

      public List<TimeLimitGiftData> getGiftDataListList() {
         return this.giftDataList_;
      }

      public List<? extends TimeLimitGiftDataOrBuilder> getGiftDataListOrBuilderList() {
         return this.giftDataList_;
      }

      public int getGiftDataListCount() {
         return this.giftDataList_.size();
      }

      public TimeLimitGiftData getGiftDataList(int index) {
         return (TimeLimitGiftData)this.giftDataList_.get(index);
      }

      public TimeLimitGiftDataOrBuilder getGiftDataListOrBuilder(int index) {
         return (TimeLimitGiftDataOrBuilder)this.giftDataList_.get(index);
      }

      public List<TimeLimitGiftBuyData> getBuyGiftListList() {
         return this.buyGiftList_;
      }

      public List<? extends TimeLimitGiftBuyDataOrBuilder> getBuyGiftListOrBuilderList() {
         return this.buyGiftList_;
      }

      public int getBuyGiftListCount() {
         return this.buyGiftList_.size();
      }

      public TimeLimitGiftBuyData getBuyGiftList(int index) {
         return (TimeLimitGiftBuyData)this.buyGiftList_.get(index);
      }

      public TimeLimitGiftBuyDataOrBuilder getBuyGiftListOrBuilder(int index) {
         return (TimeLimitGiftBuyDataOrBuilder)this.buyGiftList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGiftDataListCount(); ++i) {
               if (!this.getGiftDataList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getBuyGiftListCount(); ++i) {
               if (!this.getBuyGiftList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.giftDataList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.giftDataList_.get(i));
         }

         for(int i = 0; i < this.buyGiftList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.buyGiftList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.giftDataList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.giftDataList_.get(i));
            }

            for(int i = 0; i < this.buyGiftList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.buyGiftList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TimeLimitGiftList_8607)) {
            return super.equals(obj);
         } else {
            S2C_TimeLimitGiftList_8607 other = (S2C_TimeLimitGiftList_8607)obj;
            if (!this.getGiftDataListList().equals(other.getGiftDataListList())) {
               return false;
            } else if (!this.getBuyGiftListList().equals(other.getBuyGiftListList())) {
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
            if (this.getGiftDataListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftDataListList().hashCode();
            }

            if (this.getBuyGiftListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyGiftListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftList_8607)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftList_8607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftList_8607)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftList_8607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftList_8607)PARSER.parseFrom(data);
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TimeLimitGiftList_8607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(InputStream input) throws IOException {
         return (S2C_TimeLimitGiftList_8607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftList_8607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TimeLimitGiftList_8607 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TimeLimitGiftList_8607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftList_8607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftList_8607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TimeLimitGiftList_8607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TimeLimitGiftList_8607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TimeLimitGiftList_8607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TimeLimitGiftList_8607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TimeLimitGiftList_8607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TimeLimitGiftList_8607> parser() {
         return PARSER;
      }

      public Parser<S2C_TimeLimitGiftList_8607> getParserForType() {
         return PARSER;
      }

      public S2C_TimeLimitGiftList_8607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TimeLimitGiftList_8607OrBuilder {
         private int bitField0_;
         private List<TimeLimitGiftData> giftDataList_;
         private RepeatedFieldBuilderV3<TimeLimitGiftData, TimeLimitGiftData.Builder, TimeLimitGiftDataOrBuilder> giftDataListBuilder_;
         private List<TimeLimitGiftBuyData> buyGiftList_;
         private RepeatedFieldBuilderV3<TimeLimitGiftBuyData, TimeLimitGiftBuyData.Builder, TimeLimitGiftBuyDataOrBuilder> buyGiftListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TimeLimitGiftList_8607.class, Builder.class);
         }

         private Builder() {
            this.giftDataList_ = Collections.emptyList();
            this.buyGiftList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.giftDataList_ = Collections.emptyList();
            this.buyGiftList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_TimeLimitGiftList_8607.alwaysUseFieldBuilders) {
               this.getGiftDataListFieldBuilder();
               this.getBuyGiftListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.giftDataListBuilder_ == null) {
               this.giftDataList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.giftDataListBuilder_.clear();
            }

            if (this.buyGiftListBuilder_ == null) {
               this.buyGiftList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.buyGiftListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_TimeLimitGiftList_8607_descriptor;
         }

         public S2C_TimeLimitGiftList_8607 getDefaultInstanceForType() {
            return GiftMsg.S2C_TimeLimitGiftList_8607.getDefaultInstance();
         }

         public S2C_TimeLimitGiftList_8607 build() {
            S2C_TimeLimitGiftList_8607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TimeLimitGiftList_8607 buildPartial() {
            S2C_TimeLimitGiftList_8607 result = new S2C_TimeLimitGiftList_8607(this);
            int from_bitField0_ = this.bitField0_;
            if (this.giftDataListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.giftDataList_ = Collections.unmodifiableList(this.giftDataList_);
                  this.bitField0_ &= -2;
               }

               result.giftDataList_ = this.giftDataList_;
            } else {
               result.giftDataList_ = this.giftDataListBuilder_.build();
            }

            if (this.buyGiftListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.buyGiftList_ = Collections.unmodifiableList(this.buyGiftList_);
                  this.bitField0_ &= -3;
               }

               result.buyGiftList_ = this.buyGiftList_;
            } else {
               result.buyGiftList_ = this.buyGiftListBuilder_.build();
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
            if (other instanceof S2C_TimeLimitGiftList_8607) {
               return this.mergeFrom((S2C_TimeLimitGiftList_8607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TimeLimitGiftList_8607 other) {
            if (other == GiftMsg.S2C_TimeLimitGiftList_8607.getDefaultInstance()) {
               return this;
            } else {
               if (this.giftDataListBuilder_ == null) {
                  if (!other.giftDataList_.isEmpty()) {
                     if (this.giftDataList_.isEmpty()) {
                        this.giftDataList_ = other.giftDataList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGiftDataListIsMutable();
                        this.giftDataList_.addAll(other.giftDataList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.giftDataList_.isEmpty()) {
                  if (this.giftDataListBuilder_.isEmpty()) {
                     this.giftDataListBuilder_.dispose();
                     this.giftDataListBuilder_ = null;
                     this.giftDataList_ = other.giftDataList_;
                     this.bitField0_ &= -2;
                     this.giftDataListBuilder_ = GiftMsg.S2C_TimeLimitGiftList_8607.alwaysUseFieldBuilders ? this.getGiftDataListFieldBuilder() : null;
                  } else {
                     this.giftDataListBuilder_.addAllMessages(other.giftDataList_);
                  }
               }

               if (this.buyGiftListBuilder_ == null) {
                  if (!other.buyGiftList_.isEmpty()) {
                     if (this.buyGiftList_.isEmpty()) {
                        this.buyGiftList_ = other.buyGiftList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureBuyGiftListIsMutable();
                        this.buyGiftList_.addAll(other.buyGiftList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.buyGiftList_.isEmpty()) {
                  if (this.buyGiftListBuilder_.isEmpty()) {
                     this.buyGiftListBuilder_.dispose();
                     this.buyGiftListBuilder_ = null;
                     this.buyGiftList_ = other.buyGiftList_;
                     this.bitField0_ &= -3;
                     this.buyGiftListBuilder_ = GiftMsg.S2C_TimeLimitGiftList_8607.alwaysUseFieldBuilders ? this.getBuyGiftListFieldBuilder() : null;
                  } else {
                     this.buyGiftListBuilder_.addAllMessages(other.buyGiftList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGiftDataListCount(); ++i) {
               if (!this.getGiftDataList(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getBuyGiftListCount(); ++i) {
               if (!this.getBuyGiftList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TimeLimitGiftList_8607 parsedMessage = null;

            try {
               parsedMessage = (S2C_TimeLimitGiftList_8607)GiftMsg.S2C_TimeLimitGiftList_8607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TimeLimitGiftList_8607)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGiftDataListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.giftDataList_ = new ArrayList(this.giftDataList_);
               this.bitField0_ |= 1;
            }

         }

         public List<TimeLimitGiftData> getGiftDataListList() {
            return this.giftDataListBuilder_ == null ? Collections.unmodifiableList(this.giftDataList_) : this.giftDataListBuilder_.getMessageList();
         }

         public int getGiftDataListCount() {
            return this.giftDataListBuilder_ == null ? this.giftDataList_.size() : this.giftDataListBuilder_.getCount();
         }

         public TimeLimitGiftData getGiftDataList(int index) {
            return this.giftDataListBuilder_ == null ? (TimeLimitGiftData)this.giftDataList_.get(index) : (TimeLimitGiftData)this.giftDataListBuilder_.getMessage(index);
         }

         public Builder setGiftDataList(int index, TimeLimitGiftData value) {
            if (this.giftDataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftDataListIsMutable();
               this.giftDataList_.set(index, value);
               this.onChanged();
            } else {
               this.giftDataListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGiftDataList(int index, TimeLimitGiftData.Builder builderForValue) {
            if (this.giftDataListBuilder_ == null) {
               this.ensureGiftDataListIsMutable();
               this.giftDataList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftDataListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGiftDataList(TimeLimitGiftData value) {
            if (this.giftDataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftDataListIsMutable();
               this.giftDataList_.add(value);
               this.onChanged();
            } else {
               this.giftDataListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGiftDataList(int index, TimeLimitGiftData value) {
            if (this.giftDataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftDataListIsMutable();
               this.giftDataList_.add(index, value);
               this.onChanged();
            } else {
               this.giftDataListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGiftDataList(TimeLimitGiftData.Builder builderForValue) {
            if (this.giftDataListBuilder_ == null) {
               this.ensureGiftDataListIsMutable();
               this.giftDataList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.giftDataListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGiftDataList(int index, TimeLimitGiftData.Builder builderForValue) {
            if (this.giftDataListBuilder_ == null) {
               this.ensureGiftDataListIsMutable();
               this.giftDataList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftDataListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGiftDataList(Iterable<? extends TimeLimitGiftData> values) {
            if (this.giftDataListBuilder_ == null) {
               this.ensureGiftDataListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.giftDataList_);
               this.onChanged();
            } else {
               this.giftDataListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGiftDataList() {
            if (this.giftDataListBuilder_ == null) {
               this.giftDataList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.giftDataListBuilder_.clear();
            }

            return this;
         }

         public Builder removeGiftDataList(int index) {
            if (this.giftDataListBuilder_ == null) {
               this.ensureGiftDataListIsMutable();
               this.giftDataList_.remove(index);
               this.onChanged();
            } else {
               this.giftDataListBuilder_.remove(index);
            }

            return this;
         }

         public TimeLimitGiftData.Builder getGiftDataListBuilder(int index) {
            return (TimeLimitGiftData.Builder)this.getGiftDataListFieldBuilder().getBuilder(index);
         }

         public TimeLimitGiftDataOrBuilder getGiftDataListOrBuilder(int index) {
            return this.giftDataListBuilder_ == null ? (TimeLimitGiftDataOrBuilder)this.giftDataList_.get(index) : (TimeLimitGiftDataOrBuilder)this.giftDataListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TimeLimitGiftDataOrBuilder> getGiftDataListOrBuilderList() {
            return this.giftDataListBuilder_ != null ? this.giftDataListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.giftDataList_);
         }

         public TimeLimitGiftData.Builder addGiftDataListBuilder() {
            return (TimeLimitGiftData.Builder)this.getGiftDataListFieldBuilder().addBuilder(GiftMsg.TimeLimitGiftData.getDefaultInstance());
         }

         public TimeLimitGiftData.Builder addGiftDataListBuilder(int index) {
            return (TimeLimitGiftData.Builder)this.getGiftDataListFieldBuilder().addBuilder(index, GiftMsg.TimeLimitGiftData.getDefaultInstance());
         }

         public List<TimeLimitGiftData.Builder> getGiftDataListBuilderList() {
            return this.getGiftDataListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TimeLimitGiftData, TimeLimitGiftData.Builder, TimeLimitGiftDataOrBuilder> getGiftDataListFieldBuilder() {
            if (this.giftDataListBuilder_ == null) {
               this.giftDataListBuilder_ = new RepeatedFieldBuilderV3(this.giftDataList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.giftDataList_ = null;
            }

            return this.giftDataListBuilder_;
         }

         private void ensureBuyGiftListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.buyGiftList_ = new ArrayList(this.buyGiftList_);
               this.bitField0_ |= 2;
            }

         }

         public List<TimeLimitGiftBuyData> getBuyGiftListList() {
            return this.buyGiftListBuilder_ == null ? Collections.unmodifiableList(this.buyGiftList_) : this.buyGiftListBuilder_.getMessageList();
         }

         public int getBuyGiftListCount() {
            return this.buyGiftListBuilder_ == null ? this.buyGiftList_.size() : this.buyGiftListBuilder_.getCount();
         }

         public TimeLimitGiftBuyData getBuyGiftList(int index) {
            return this.buyGiftListBuilder_ == null ? (TimeLimitGiftBuyData)this.buyGiftList_.get(index) : (TimeLimitGiftBuyData)this.buyGiftListBuilder_.getMessage(index);
         }

         public Builder setBuyGiftList(int index, TimeLimitGiftBuyData value) {
            if (this.buyGiftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyGiftListIsMutable();
               this.buyGiftList_.set(index, value);
               this.onChanged();
            } else {
               this.buyGiftListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBuyGiftList(int index, TimeLimitGiftBuyData.Builder builderForValue) {
            if (this.buyGiftListBuilder_ == null) {
               this.ensureBuyGiftListIsMutable();
               this.buyGiftList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyGiftListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBuyGiftList(TimeLimitGiftBuyData value) {
            if (this.buyGiftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyGiftListIsMutable();
               this.buyGiftList_.add(value);
               this.onChanged();
            } else {
               this.buyGiftListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBuyGiftList(int index, TimeLimitGiftBuyData value) {
            if (this.buyGiftListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuyGiftListIsMutable();
               this.buyGiftList_.add(index, value);
               this.onChanged();
            } else {
               this.buyGiftListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBuyGiftList(TimeLimitGiftBuyData.Builder builderForValue) {
            if (this.buyGiftListBuilder_ == null) {
               this.ensureBuyGiftListIsMutable();
               this.buyGiftList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.buyGiftListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBuyGiftList(int index, TimeLimitGiftBuyData.Builder builderForValue) {
            if (this.buyGiftListBuilder_ == null) {
               this.ensureBuyGiftListIsMutable();
               this.buyGiftList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buyGiftListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBuyGiftList(Iterable<? extends TimeLimitGiftBuyData> values) {
            if (this.buyGiftListBuilder_ == null) {
               this.ensureBuyGiftListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buyGiftList_);
               this.onChanged();
            } else {
               this.buyGiftListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBuyGiftList() {
            if (this.buyGiftListBuilder_ == null) {
               this.buyGiftList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.buyGiftListBuilder_.clear();
            }

            return this;
         }

         public Builder removeBuyGiftList(int index) {
            if (this.buyGiftListBuilder_ == null) {
               this.ensureBuyGiftListIsMutable();
               this.buyGiftList_.remove(index);
               this.onChanged();
            } else {
               this.buyGiftListBuilder_.remove(index);
            }

            return this;
         }

         public TimeLimitGiftBuyData.Builder getBuyGiftListBuilder(int index) {
            return (TimeLimitGiftBuyData.Builder)this.getBuyGiftListFieldBuilder().getBuilder(index);
         }

         public TimeLimitGiftBuyDataOrBuilder getBuyGiftListOrBuilder(int index) {
            return this.buyGiftListBuilder_ == null ? (TimeLimitGiftBuyDataOrBuilder)this.buyGiftList_.get(index) : (TimeLimitGiftBuyDataOrBuilder)this.buyGiftListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TimeLimitGiftBuyDataOrBuilder> getBuyGiftListOrBuilderList() {
            return this.buyGiftListBuilder_ != null ? this.buyGiftListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.buyGiftList_);
         }

         public TimeLimitGiftBuyData.Builder addBuyGiftListBuilder() {
            return (TimeLimitGiftBuyData.Builder)this.getBuyGiftListFieldBuilder().addBuilder(GiftMsg.TimeLimitGiftBuyData.getDefaultInstance());
         }

         public TimeLimitGiftBuyData.Builder addBuyGiftListBuilder(int index) {
            return (TimeLimitGiftBuyData.Builder)this.getBuyGiftListFieldBuilder().addBuilder(index, GiftMsg.TimeLimitGiftBuyData.getDefaultInstance());
         }

         public List<TimeLimitGiftBuyData.Builder> getBuyGiftListBuilderList() {
            return this.getBuyGiftListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TimeLimitGiftBuyData, TimeLimitGiftBuyData.Builder, TimeLimitGiftBuyDataOrBuilder> getBuyGiftListFieldBuilder() {
            if (this.buyGiftListBuilder_ == null) {
               this.buyGiftListBuilder_ = new RepeatedFieldBuilderV3(this.buyGiftList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.buyGiftList_ = null;
            }

            return this.buyGiftListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_GiftBuy_8609 extends GeneratedMessageV3 implements C2S_GiftBuy_8609OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final C2S_GiftBuy_8609 DEFAULT_INSTANCE = new C2S_GiftBuy_8609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GiftBuy_8609> PARSER = new AbstractParser<C2S_GiftBuy_8609>() {
         public C2S_GiftBuy_8609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GiftBuy_8609(input, extensionRegistry);
         }
      };

      private C2S_GiftBuy_8609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GiftBuy_8609() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GiftBuy_8609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GiftBuy_8609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiftBuy_8609.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GiftBuy_8609)) {
            return super.equals(obj);
         } else {
            C2S_GiftBuy_8609 other = (C2S_GiftBuy_8609)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GiftBuy_8609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GiftBuy_8609)PARSER.parseFrom(data);
      }

      public static C2S_GiftBuy_8609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftBuy_8609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftBuy_8609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GiftBuy_8609)PARSER.parseFrom(data);
      }

      public static C2S_GiftBuy_8609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftBuy_8609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftBuy_8609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GiftBuy_8609)PARSER.parseFrom(data);
      }

      public static C2S_GiftBuy_8609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftBuy_8609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftBuy_8609 parseFrom(InputStream input) throws IOException {
         return (C2S_GiftBuy_8609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiftBuy_8609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftBuy_8609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiftBuy_8609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GiftBuy_8609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GiftBuy_8609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftBuy_8609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiftBuy_8609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GiftBuy_8609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiftBuy_8609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftBuy_8609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GiftBuy_8609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GiftBuy_8609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GiftBuy_8609> parser() {
         return PARSER;
      }

      public Parser<C2S_GiftBuy_8609> getParserForType() {
         return PARSER;
      }

      public C2S_GiftBuy_8609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GiftBuy_8609OrBuilder {
         private int bitField0_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiftBuy_8609.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_GiftBuy_8609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftBuy_8609_descriptor;
         }

         public C2S_GiftBuy_8609 getDefaultInstanceForType() {
            return GiftMsg.C2S_GiftBuy_8609.getDefaultInstance();
         }

         public C2S_GiftBuy_8609 build() {
            C2S_GiftBuy_8609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GiftBuy_8609 buildPartial() {
            C2S_GiftBuy_8609 result = new C2S_GiftBuy_8609(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof C2S_GiftBuy_8609) {
               return this.mergeFrom((C2S_GiftBuy_8609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GiftBuy_8609 other) {
            if (other == GiftMsg.C2S_GiftBuy_8609.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GiftBuy_8609 parsedMessage = null;

            try {
               parsedMessage = (C2S_GiftBuy_8609)GiftMsg.C2S_GiftBuy_8609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GiftBuy_8609)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
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

   public static final class S2C_GiftBuy_8610 extends GeneratedMessageV3 implements S2C_GiftBuy_8610OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      public static final int BUYCOUNT_FIELD_NUMBER = 2;
      private int buyCount_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int GOTDAY_FIELD_NUMBER = 4;
      private int gotDay_;
      private byte memoizedIsInitialized;
      private static final S2C_GiftBuy_8610 DEFAULT_INSTANCE = new S2C_GiftBuy_8610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GiftBuy_8610> PARSER = new AbstractParser<S2C_GiftBuy_8610>() {
         public S2C_GiftBuy_8610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GiftBuy_8610(input, extensionRegistry);
         }
      };

      private S2C_GiftBuy_8610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GiftBuy_8610() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GiftBuy_8610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GiftBuy_8610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.buyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.gotDay_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftBuy_8610.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
      }

      public boolean hasBuyCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyCount() {
         return this.buyCount_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasGotDay() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGotDay() {
         return this.gotDay_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGotDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.buyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.gotDay_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.gotDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GiftBuy_8610)) {
            return super.equals(obj);
         } else {
            S2C_GiftBuy_8610 other = (S2C_GiftBuy_8610)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
               return false;
            } else if (this.hasBuyCount() != other.hasBuyCount()) {
               return false;
            } else if (this.hasBuyCount() && this.getBuyCount() != other.getBuyCount()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasGotDay() != other.hasGotDay()) {
               return false;
            } else if (this.hasGotDay() && this.getGotDay() != other.getGotDay()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
            }

            if (this.hasBuyCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyCount();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasGotDay()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGotDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GiftBuy_8610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GiftBuy_8610)PARSER.parseFrom(data);
      }

      public static S2C_GiftBuy_8610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBuy_8610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBuy_8610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GiftBuy_8610)PARSER.parseFrom(data);
      }

      public static S2C_GiftBuy_8610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBuy_8610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBuy_8610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GiftBuy_8610)PARSER.parseFrom(data);
      }

      public static S2C_GiftBuy_8610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftBuy_8610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftBuy_8610 parseFrom(InputStream input) throws IOException {
         return (S2C_GiftBuy_8610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftBuy_8610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBuy_8610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftBuy_8610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GiftBuy_8610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GiftBuy_8610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBuy_8610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftBuy_8610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GiftBuy_8610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftBuy_8610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftBuy_8610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GiftBuy_8610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GiftBuy_8610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GiftBuy_8610> parser() {
         return PARSER;
      }

      public Parser<S2C_GiftBuy_8610> getParserForType() {
         return PARSER;
      }

      public S2C_GiftBuy_8610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GiftBuy_8610OrBuilder {
         private int bitField0_;
         private int buyId_;
         private int buyCount_;
         private int endTime_;
         private int gotDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftBuy_8610.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_GiftBuy_8610.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            this.buyCount_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.gotDay_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftBuy_8610_descriptor;
         }

         public S2C_GiftBuy_8610 getDefaultInstanceForType() {
            return GiftMsg.S2C_GiftBuy_8610.getDefaultInstance();
         }

         public S2C_GiftBuy_8610 build() {
            S2C_GiftBuy_8610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GiftBuy_8610 buildPartial() {
            S2C_GiftBuy_8610 result = new S2C_GiftBuy_8610(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyCount_ = this.buyCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.gotDay_ = this.gotDay_;
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
            if (other instanceof S2C_GiftBuy_8610) {
               return this.mergeFrom((S2C_GiftBuy_8610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GiftBuy_8610 other) {
            if (other == GiftMsg.S2C_GiftBuy_8610.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               if (other.hasBuyCount()) {
                  this.setBuyCount(other.getBuyCount());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasGotDay()) {
                  this.setGotDay(other.getGotDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBuyId()) {
               return false;
            } else if (!this.hasBuyCount()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else {
               return this.hasGotDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GiftBuy_8610 parsedMessage = null;

            try {
               parsedMessage = (S2C_GiftBuy_8610)GiftMsg.S2C_GiftBuy_8610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GiftBuy_8610)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyCount() {
            return this.buyCount_;
         }

         public Builder setBuyCount(int value) {
            this.bitField0_ |= 2;
            this.buyCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyCount() {
            this.bitField0_ &= -3;
            this.buyCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 4;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -5;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGotDay() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGotDay() {
            return this.gotDay_;
         }

         public Builder setGotDay(int value) {
            this.bitField0_ |= 8;
            this.gotDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotDay() {
            this.bitField0_ &= -9;
            this.gotDay_ = 0;
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

   public static final class C2S_GiftList_8611 extends GeneratedMessageV3 implements C2S_GiftList_8611OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GiftList_8611 DEFAULT_INSTANCE = new C2S_GiftList_8611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GiftList_8611> PARSER = new AbstractParser<C2S_GiftList_8611>() {
         public C2S_GiftList_8611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GiftList_8611(input, extensionRegistry);
         }
      };

      private C2S_GiftList_8611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GiftList_8611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GiftList_8611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GiftList_8611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiftList_8611.class, Builder.class);
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
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GiftList_8611)) {
            return super.equals(obj);
         } else {
            C2S_GiftList_8611 other = (C2S_GiftList_8611)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GiftList_8611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GiftList_8611)PARSER.parseFrom(data);
      }

      public static C2S_GiftList_8611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftList_8611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftList_8611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GiftList_8611)PARSER.parseFrom(data);
      }

      public static C2S_GiftList_8611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftList_8611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftList_8611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GiftList_8611)PARSER.parseFrom(data);
      }

      public static C2S_GiftList_8611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GiftList_8611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GiftList_8611 parseFrom(InputStream input) throws IOException {
         return (C2S_GiftList_8611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiftList_8611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftList_8611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiftList_8611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GiftList_8611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GiftList_8611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftList_8611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GiftList_8611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GiftList_8611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GiftList_8611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GiftList_8611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GiftList_8611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GiftList_8611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GiftList_8611> parser() {
         return PARSER;
      }

      public Parser<C2S_GiftList_8611> getParserForType() {
         return PARSER;
      }

      public C2S_GiftList_8611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GiftList_8611OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GiftList_8611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_GiftList_8611.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GiftList_8611_descriptor;
         }

         public C2S_GiftList_8611 getDefaultInstanceForType() {
            return GiftMsg.C2S_GiftList_8611.getDefaultInstance();
         }

         public C2S_GiftList_8611 build() {
            C2S_GiftList_8611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GiftList_8611 buildPartial() {
            C2S_GiftList_8611 result = new C2S_GiftList_8611(this);
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
            if (other instanceof C2S_GiftList_8611) {
               return this.mergeFrom((C2S_GiftList_8611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GiftList_8611 other) {
            if (other == GiftMsg.C2S_GiftList_8611.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GiftList_8611 parsedMessage = null;

            try {
               parsedMessage = (C2S_GiftList_8611)GiftMsg.C2S_GiftList_8611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GiftList_8611)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

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

   public static final class S2C_GiftList_8612 extends GeneratedMessageV3 implements S2C_GiftList_8612OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GIFTS_FIELD_NUMBER = 1;
      private List<GiftData> gifts_;
      private byte memoizedIsInitialized;
      private static final S2C_GiftList_8612 DEFAULT_INSTANCE = new S2C_GiftList_8612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GiftList_8612> PARSER = new AbstractParser<S2C_GiftList_8612>() {
         public S2C_GiftList_8612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GiftList_8612(input, extensionRegistry);
         }
      };

      private S2C_GiftList_8612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GiftList_8612() {
         this.memoizedIsInitialized = -1;
         this.gifts_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GiftList_8612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GiftList_8612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.gifts_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.gifts_.add(input.readMessage(GiftMsg.GiftData.PARSER, extensionRegistry));
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
                  this.gifts_ = Collections.unmodifiableList(this.gifts_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftList_8612.class, Builder.class);
      }

      public List<GiftData> getGiftsList() {
         return this.gifts_;
      }

      public List<? extends GiftDataOrBuilder> getGiftsOrBuilderList() {
         return this.gifts_;
      }

      public int getGiftsCount() {
         return this.gifts_.size();
      }

      public GiftData getGifts(int index) {
         return (GiftData)this.gifts_.get(index);
      }

      public GiftDataOrBuilder getGiftsOrBuilder(int index) {
         return (GiftDataOrBuilder)this.gifts_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGiftsCount(); ++i) {
               if (!this.getGifts(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.gifts_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.gifts_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.gifts_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.gifts_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GiftList_8612)) {
            return super.equals(obj);
         } else {
            S2C_GiftList_8612 other = (S2C_GiftList_8612)obj;
            if (!this.getGiftsList().equals(other.getGiftsList())) {
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
            if (this.getGiftsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GiftList_8612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GiftList_8612)PARSER.parseFrom(data);
      }

      public static S2C_GiftList_8612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftList_8612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftList_8612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GiftList_8612)PARSER.parseFrom(data);
      }

      public static S2C_GiftList_8612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftList_8612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftList_8612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GiftList_8612)PARSER.parseFrom(data);
      }

      public static S2C_GiftList_8612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GiftList_8612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GiftList_8612 parseFrom(InputStream input) throws IOException {
         return (S2C_GiftList_8612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftList_8612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftList_8612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftList_8612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GiftList_8612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GiftList_8612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftList_8612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GiftList_8612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GiftList_8612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GiftList_8612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GiftList_8612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GiftList_8612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GiftList_8612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GiftList_8612> parser() {
         return PARSER;
      }

      public Parser<S2C_GiftList_8612> getParserForType() {
         return PARSER;
      }

      public S2C_GiftList_8612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GiftList_8612OrBuilder {
         private int bitField0_;
         private List<GiftData> gifts_;
         private RepeatedFieldBuilderV3<GiftData, GiftData.Builder, GiftDataOrBuilder> giftsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GiftList_8612.class, Builder.class);
         }

         private Builder() {
            this.gifts_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gifts_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_GiftList_8612.alwaysUseFieldBuilders) {
               this.getGiftsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.giftsBuilder_ == null) {
               this.gifts_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.giftsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GiftList_8612_descriptor;
         }

         public S2C_GiftList_8612 getDefaultInstanceForType() {
            return GiftMsg.S2C_GiftList_8612.getDefaultInstance();
         }

         public S2C_GiftList_8612 build() {
            S2C_GiftList_8612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GiftList_8612 buildPartial() {
            S2C_GiftList_8612 result = new S2C_GiftList_8612(this);
            int from_bitField0_ = this.bitField0_;
            if (this.giftsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.gifts_ = Collections.unmodifiableList(this.gifts_);
                  this.bitField0_ &= -2;
               }

               result.gifts_ = this.gifts_;
            } else {
               result.gifts_ = this.giftsBuilder_.build();
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
            if (other instanceof S2C_GiftList_8612) {
               return this.mergeFrom((S2C_GiftList_8612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GiftList_8612 other) {
            if (other == GiftMsg.S2C_GiftList_8612.getDefaultInstance()) {
               return this;
            } else {
               if (this.giftsBuilder_ == null) {
                  if (!other.gifts_.isEmpty()) {
                     if (this.gifts_.isEmpty()) {
                        this.gifts_ = other.gifts_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGiftsIsMutable();
                        this.gifts_.addAll(other.gifts_);
                     }

                     this.onChanged();
                  }
               } else if (!other.gifts_.isEmpty()) {
                  if (this.giftsBuilder_.isEmpty()) {
                     this.giftsBuilder_.dispose();
                     this.giftsBuilder_ = null;
                     this.gifts_ = other.gifts_;
                     this.bitField0_ &= -2;
                     this.giftsBuilder_ = GiftMsg.S2C_GiftList_8612.alwaysUseFieldBuilders ? this.getGiftsFieldBuilder() : null;
                  } else {
                     this.giftsBuilder_.addAllMessages(other.gifts_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGiftsCount(); ++i) {
               if (!this.getGifts(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GiftList_8612 parsedMessage = null;

            try {
               parsedMessage = (S2C_GiftList_8612)GiftMsg.S2C_GiftList_8612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GiftList_8612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGiftsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.gifts_ = new ArrayList(this.gifts_);
               this.bitField0_ |= 1;
            }

         }

         public List<GiftData> getGiftsList() {
            return this.giftsBuilder_ == null ? Collections.unmodifiableList(this.gifts_) : this.giftsBuilder_.getMessageList();
         }

         public int getGiftsCount() {
            return this.giftsBuilder_ == null ? this.gifts_.size() : this.giftsBuilder_.getCount();
         }

         public GiftData getGifts(int index) {
            return this.giftsBuilder_ == null ? (GiftData)this.gifts_.get(index) : (GiftData)this.giftsBuilder_.getMessage(index);
         }

         public Builder setGifts(int index, GiftData value) {
            if (this.giftsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftsIsMutable();
               this.gifts_.set(index, value);
               this.onChanged();
            } else {
               this.giftsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGifts(int index, GiftData.Builder builderForValue) {
            if (this.giftsBuilder_ == null) {
               this.ensureGiftsIsMutable();
               this.gifts_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGifts(GiftData value) {
            if (this.giftsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftsIsMutable();
               this.gifts_.add(value);
               this.onChanged();
            } else {
               this.giftsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGifts(int index, GiftData value) {
            if (this.giftsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGiftsIsMutable();
               this.gifts_.add(index, value);
               this.onChanged();
            } else {
               this.giftsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGifts(GiftData.Builder builderForValue) {
            if (this.giftsBuilder_ == null) {
               this.ensureGiftsIsMutable();
               this.gifts_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.giftsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGifts(int index, GiftData.Builder builderForValue) {
            if (this.giftsBuilder_ == null) {
               this.ensureGiftsIsMutable();
               this.gifts_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.giftsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGifts(Iterable<? extends GiftData> values) {
            if (this.giftsBuilder_ == null) {
               this.ensureGiftsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gifts_);
               this.onChanged();
            } else {
               this.giftsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGifts() {
            if (this.giftsBuilder_ == null) {
               this.gifts_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.giftsBuilder_.clear();
            }

            return this;
         }

         public Builder removeGifts(int index) {
            if (this.giftsBuilder_ == null) {
               this.ensureGiftsIsMutable();
               this.gifts_.remove(index);
               this.onChanged();
            } else {
               this.giftsBuilder_.remove(index);
            }

            return this;
         }

         public GiftData.Builder getGiftsBuilder(int index) {
            return (GiftData.Builder)this.getGiftsFieldBuilder().getBuilder(index);
         }

         public GiftDataOrBuilder getGiftsOrBuilder(int index) {
            return this.giftsBuilder_ == null ? (GiftDataOrBuilder)this.gifts_.get(index) : (GiftDataOrBuilder)this.giftsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GiftDataOrBuilder> getGiftsOrBuilderList() {
            return this.giftsBuilder_ != null ? this.giftsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.gifts_);
         }

         public GiftData.Builder addGiftsBuilder() {
            return (GiftData.Builder)this.getGiftsFieldBuilder().addBuilder(GiftMsg.GiftData.getDefaultInstance());
         }

         public GiftData.Builder addGiftsBuilder(int index) {
            return (GiftData.Builder)this.getGiftsFieldBuilder().addBuilder(index, GiftMsg.GiftData.getDefaultInstance());
         }

         public List<GiftData.Builder> getGiftsBuilderList() {
            return this.getGiftsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GiftData, GiftData.Builder, GiftDataOrBuilder> getGiftsFieldBuilder() {
            if (this.giftsBuilder_ == null) {
               this.giftsBuilder_ = new RepeatedFieldBuilderV3(this.gifts_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.gifts_ = null;
            }

            return this.giftsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LevelGiftMain_8613 extends GeneratedMessageV3 implements C2S_LevelGiftMain_8613OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LevelGiftMain_8613 DEFAULT_INSTANCE = new C2S_LevelGiftMain_8613();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LevelGiftMain_8613> PARSER = new AbstractParser<C2S_LevelGiftMain_8613>() {
         public C2S_LevelGiftMain_8613 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LevelGiftMain_8613(input, extensionRegistry);
         }
      };

      private C2S_LevelGiftMain_8613(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LevelGiftMain_8613() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LevelGiftMain_8613();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LevelGiftMain_8613(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LevelGiftMain_8613.class, Builder.class);
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
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LevelGiftMain_8613)) {
            return super.equals(obj);
         } else {
            C2S_LevelGiftMain_8613 other = (C2S_LevelGiftMain_8613)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LevelGiftMain_8613 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftMain_8613)PARSER.parseFrom(data);
      }

      public static C2S_LevelGiftMain_8613 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftMain_8613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LevelGiftMain_8613 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftMain_8613)PARSER.parseFrom(data);
      }

      public static C2S_LevelGiftMain_8613 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftMain_8613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LevelGiftMain_8613 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftMain_8613)PARSER.parseFrom(data);
      }

      public static C2S_LevelGiftMain_8613 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftMain_8613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LevelGiftMain_8613 parseFrom(InputStream input) throws IOException {
         return (C2S_LevelGiftMain_8613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LevelGiftMain_8613 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LevelGiftMain_8613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LevelGiftMain_8613 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LevelGiftMain_8613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LevelGiftMain_8613 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LevelGiftMain_8613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LevelGiftMain_8613 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LevelGiftMain_8613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LevelGiftMain_8613 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LevelGiftMain_8613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LevelGiftMain_8613 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LevelGiftMain_8613 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LevelGiftMain_8613> parser() {
         return PARSER;
      }

      public Parser<C2S_LevelGiftMain_8613> getParserForType() {
         return PARSER;
      }

      public C2S_LevelGiftMain_8613 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LevelGiftMain_8613OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LevelGiftMain_8613.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_LevelGiftMain_8613.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftMain_8613_descriptor;
         }

         public C2S_LevelGiftMain_8613 getDefaultInstanceForType() {
            return GiftMsg.C2S_LevelGiftMain_8613.getDefaultInstance();
         }

         public C2S_LevelGiftMain_8613 build() {
            C2S_LevelGiftMain_8613 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LevelGiftMain_8613 buildPartial() {
            C2S_LevelGiftMain_8613 result = new C2S_LevelGiftMain_8613(this);
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
            if (other instanceof C2S_LevelGiftMain_8613) {
               return this.mergeFrom((C2S_LevelGiftMain_8613)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LevelGiftMain_8613 other) {
            if (other == GiftMsg.C2S_LevelGiftMain_8613.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LevelGiftMain_8613 parsedMessage = null;

            try {
               parsedMessage = (C2S_LevelGiftMain_8613)GiftMsg.C2S_LevelGiftMain_8613.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LevelGiftMain_8613)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

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

   public static final class S2C_LevelGiftMain_8614 extends GeneratedMessageV3 implements S2C_LevelGiftMain_8614OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GOTGIFT_FIELD_NUMBER = 1;
      private List<LevelGiftData> gotGift_;
      private byte memoizedIsInitialized;
      private static final S2C_LevelGiftMain_8614 DEFAULT_INSTANCE = new S2C_LevelGiftMain_8614();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LevelGiftMain_8614> PARSER = new AbstractParser<S2C_LevelGiftMain_8614>() {
         public S2C_LevelGiftMain_8614 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LevelGiftMain_8614(input, extensionRegistry);
         }
      };

      private S2C_LevelGiftMain_8614(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LevelGiftMain_8614() {
         this.memoizedIsInitialized = -1;
         this.gotGift_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LevelGiftMain_8614();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LevelGiftMain_8614(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.gotGift_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.gotGift_.add(input.readMessage(GiftMsg.LevelGiftData.PARSER, extensionRegistry));
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
                  this.gotGift_ = Collections.unmodifiableList(this.gotGift_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LevelGiftMain_8614.class, Builder.class);
      }

      public List<LevelGiftData> getGotGiftList() {
         return this.gotGift_;
      }

      public List<? extends LevelGiftDataOrBuilder> getGotGiftOrBuilderList() {
         return this.gotGift_;
      }

      public int getGotGiftCount() {
         return this.gotGift_.size();
      }

      public LevelGiftData getGotGift(int index) {
         return (LevelGiftData)this.gotGift_.get(index);
      }

      public LevelGiftDataOrBuilder getGotGiftOrBuilder(int index) {
         return (LevelGiftDataOrBuilder)this.gotGift_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGotGiftCount(); ++i) {
               if (!this.getGotGift(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.gotGift_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.gotGift_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.gotGift_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.gotGift_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LevelGiftMain_8614)) {
            return super.equals(obj);
         } else {
            S2C_LevelGiftMain_8614 other = (S2C_LevelGiftMain_8614)obj;
            if (!this.getGotGiftList().equals(other.getGotGiftList())) {
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
            if (this.getGotGiftCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotGiftList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LevelGiftMain_8614 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftMain_8614)PARSER.parseFrom(data);
      }

      public static S2C_LevelGiftMain_8614 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftMain_8614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LevelGiftMain_8614 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftMain_8614)PARSER.parseFrom(data);
      }

      public static S2C_LevelGiftMain_8614 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftMain_8614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LevelGiftMain_8614 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftMain_8614)PARSER.parseFrom(data);
      }

      public static S2C_LevelGiftMain_8614 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftMain_8614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LevelGiftMain_8614 parseFrom(InputStream input) throws IOException {
         return (S2C_LevelGiftMain_8614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LevelGiftMain_8614 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LevelGiftMain_8614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LevelGiftMain_8614 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LevelGiftMain_8614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LevelGiftMain_8614 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LevelGiftMain_8614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LevelGiftMain_8614 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LevelGiftMain_8614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LevelGiftMain_8614 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LevelGiftMain_8614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LevelGiftMain_8614 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LevelGiftMain_8614 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LevelGiftMain_8614> parser() {
         return PARSER;
      }

      public Parser<S2C_LevelGiftMain_8614> getParserForType() {
         return PARSER;
      }

      public S2C_LevelGiftMain_8614 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LevelGiftMain_8614OrBuilder {
         private int bitField0_;
         private List<LevelGiftData> gotGift_;
         private RepeatedFieldBuilderV3<LevelGiftData, LevelGiftData.Builder, LevelGiftDataOrBuilder> gotGiftBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LevelGiftMain_8614.class, Builder.class);
         }

         private Builder() {
            this.gotGift_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotGift_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_LevelGiftMain_8614.alwaysUseFieldBuilders) {
               this.getGotGiftFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.gotGiftBuilder_ == null) {
               this.gotGift_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.gotGiftBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftMain_8614_descriptor;
         }

         public S2C_LevelGiftMain_8614 getDefaultInstanceForType() {
            return GiftMsg.S2C_LevelGiftMain_8614.getDefaultInstance();
         }

         public S2C_LevelGiftMain_8614 build() {
            S2C_LevelGiftMain_8614 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LevelGiftMain_8614 buildPartial() {
            S2C_LevelGiftMain_8614 result = new S2C_LevelGiftMain_8614(this);
            int from_bitField0_ = this.bitField0_;
            if (this.gotGiftBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.gotGift_ = Collections.unmodifiableList(this.gotGift_);
                  this.bitField0_ &= -2;
               }

               result.gotGift_ = this.gotGift_;
            } else {
               result.gotGift_ = this.gotGiftBuilder_.build();
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
            if (other instanceof S2C_LevelGiftMain_8614) {
               return this.mergeFrom((S2C_LevelGiftMain_8614)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LevelGiftMain_8614 other) {
            if (other == GiftMsg.S2C_LevelGiftMain_8614.getDefaultInstance()) {
               return this;
            } else {
               if (this.gotGiftBuilder_ == null) {
                  if (!other.gotGift_.isEmpty()) {
                     if (this.gotGift_.isEmpty()) {
                        this.gotGift_ = other.gotGift_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGotGiftIsMutable();
                        this.gotGift_.addAll(other.gotGift_);
                     }

                     this.onChanged();
                  }
               } else if (!other.gotGift_.isEmpty()) {
                  if (this.gotGiftBuilder_.isEmpty()) {
                     this.gotGiftBuilder_.dispose();
                     this.gotGiftBuilder_ = null;
                     this.gotGift_ = other.gotGift_;
                     this.bitField0_ &= -2;
                     this.gotGiftBuilder_ = GiftMsg.S2C_LevelGiftMain_8614.alwaysUseFieldBuilders ? this.getGotGiftFieldBuilder() : null;
                  } else {
                     this.gotGiftBuilder_.addAllMessages(other.gotGift_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGotGiftCount(); ++i) {
               if (!this.getGotGift(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LevelGiftMain_8614 parsedMessage = null;

            try {
               parsedMessage = (S2C_LevelGiftMain_8614)GiftMsg.S2C_LevelGiftMain_8614.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LevelGiftMain_8614)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGotGiftIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.gotGift_ = new ArrayList(this.gotGift_);
               this.bitField0_ |= 1;
            }

         }

         public List<LevelGiftData> getGotGiftList() {
            return this.gotGiftBuilder_ == null ? Collections.unmodifiableList(this.gotGift_) : this.gotGiftBuilder_.getMessageList();
         }

         public int getGotGiftCount() {
            return this.gotGiftBuilder_ == null ? this.gotGift_.size() : this.gotGiftBuilder_.getCount();
         }

         public LevelGiftData getGotGift(int index) {
            return this.gotGiftBuilder_ == null ? (LevelGiftData)this.gotGift_.get(index) : (LevelGiftData)this.gotGiftBuilder_.getMessage(index);
         }

         public Builder setGotGift(int index, LevelGiftData value) {
            if (this.gotGiftBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGotGiftIsMutable();
               this.gotGift_.set(index, value);
               this.onChanged();
            } else {
               this.gotGiftBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGotGift(int index, LevelGiftData.Builder builderForValue) {
            if (this.gotGiftBuilder_ == null) {
               this.ensureGotGiftIsMutable();
               this.gotGift_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gotGiftBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGotGift(LevelGiftData value) {
            if (this.gotGiftBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGotGiftIsMutable();
               this.gotGift_.add(value);
               this.onChanged();
            } else {
               this.gotGiftBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGotGift(int index, LevelGiftData value) {
            if (this.gotGiftBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGotGiftIsMutable();
               this.gotGift_.add(index, value);
               this.onChanged();
            } else {
               this.gotGiftBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGotGift(LevelGiftData.Builder builderForValue) {
            if (this.gotGiftBuilder_ == null) {
               this.ensureGotGiftIsMutable();
               this.gotGift_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.gotGiftBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGotGift(int index, LevelGiftData.Builder builderForValue) {
            if (this.gotGiftBuilder_ == null) {
               this.ensureGotGiftIsMutable();
               this.gotGift_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gotGiftBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGotGift(Iterable<? extends LevelGiftData> values) {
            if (this.gotGiftBuilder_ == null) {
               this.ensureGotGiftIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotGift_);
               this.onChanged();
            } else {
               this.gotGiftBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGotGift() {
            if (this.gotGiftBuilder_ == null) {
               this.gotGift_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.gotGiftBuilder_.clear();
            }

            return this;
         }

         public Builder removeGotGift(int index) {
            if (this.gotGiftBuilder_ == null) {
               this.ensureGotGiftIsMutable();
               this.gotGift_.remove(index);
               this.onChanged();
            } else {
               this.gotGiftBuilder_.remove(index);
            }

            return this;
         }

         public LevelGiftData.Builder getGotGiftBuilder(int index) {
            return (LevelGiftData.Builder)this.getGotGiftFieldBuilder().getBuilder(index);
         }

         public LevelGiftDataOrBuilder getGotGiftOrBuilder(int index) {
            return this.gotGiftBuilder_ == null ? (LevelGiftDataOrBuilder)this.gotGift_.get(index) : (LevelGiftDataOrBuilder)this.gotGiftBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends LevelGiftDataOrBuilder> getGotGiftOrBuilderList() {
            return this.gotGiftBuilder_ != null ? this.gotGiftBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.gotGift_);
         }

         public LevelGiftData.Builder addGotGiftBuilder() {
            return (LevelGiftData.Builder)this.getGotGiftFieldBuilder().addBuilder(GiftMsg.LevelGiftData.getDefaultInstance());
         }

         public LevelGiftData.Builder addGotGiftBuilder(int index) {
            return (LevelGiftData.Builder)this.getGotGiftFieldBuilder().addBuilder(index, GiftMsg.LevelGiftData.getDefaultInstance());
         }

         public List<LevelGiftData.Builder> getGotGiftBuilderList() {
            return this.getGotGiftFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<LevelGiftData, LevelGiftData.Builder, LevelGiftDataOrBuilder> getGotGiftFieldBuilder() {
            if (this.gotGiftBuilder_ == null) {
               this.gotGiftBuilder_ = new RepeatedFieldBuilderV3(this.gotGift_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.gotGift_ = null;
            }

            return this.gotGiftBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LevelGiftReward_8615 extends GeneratedMessageV3 implements C2S_LevelGiftReward_8615OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GETGIFT_FIELD_NUMBER = 1;
      private LevelGiftData getGift_;
      private byte memoizedIsInitialized;
      private static final C2S_LevelGiftReward_8615 DEFAULT_INSTANCE = new C2S_LevelGiftReward_8615();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LevelGiftReward_8615> PARSER = new AbstractParser<C2S_LevelGiftReward_8615>() {
         public C2S_LevelGiftReward_8615 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LevelGiftReward_8615(input, extensionRegistry);
         }
      };

      private C2S_LevelGiftReward_8615(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LevelGiftReward_8615() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LevelGiftReward_8615();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LevelGiftReward_8615(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        LevelGiftData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.getGift_.toBuilder();
                        }

                        this.getGift_ = (LevelGiftData)input.readMessage(GiftMsg.LevelGiftData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.getGift_);
                           this.getGift_ = subBuilder.buildPartial();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LevelGiftReward_8615.class, Builder.class);
      }

      public boolean hasGetGift() {
         return (this.bitField0_ & 1) != 0;
      }

      public LevelGiftData getGetGift() {
         return this.getGift_ == null ? GiftMsg.LevelGiftData.getDefaultInstance() : this.getGift_;
      }

      public LevelGiftDataOrBuilder getGetGiftOrBuilder() {
         return this.getGift_ == null ? GiftMsg.LevelGiftData.getDefaultInstance() : this.getGift_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGetGift()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGetGift().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGetGift());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGetGift());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LevelGiftReward_8615)) {
            return super.equals(obj);
         } else {
            C2S_LevelGiftReward_8615 other = (C2S_LevelGiftReward_8615)obj;
            if (this.hasGetGift() != other.hasGetGift()) {
               return false;
            } else if (this.hasGetGift() && !this.getGetGift().equals(other.getGetGift())) {
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
            if (this.hasGetGift()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGetGift().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LevelGiftReward_8615 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftReward_8615)PARSER.parseFrom(data);
      }

      public static C2S_LevelGiftReward_8615 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftReward_8615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LevelGiftReward_8615 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftReward_8615)PARSER.parseFrom(data);
      }

      public static C2S_LevelGiftReward_8615 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftReward_8615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LevelGiftReward_8615 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftReward_8615)PARSER.parseFrom(data);
      }

      public static C2S_LevelGiftReward_8615 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LevelGiftReward_8615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LevelGiftReward_8615 parseFrom(InputStream input) throws IOException {
         return (C2S_LevelGiftReward_8615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LevelGiftReward_8615 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LevelGiftReward_8615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LevelGiftReward_8615 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LevelGiftReward_8615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LevelGiftReward_8615 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LevelGiftReward_8615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LevelGiftReward_8615 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LevelGiftReward_8615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LevelGiftReward_8615 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LevelGiftReward_8615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LevelGiftReward_8615 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LevelGiftReward_8615 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LevelGiftReward_8615> parser() {
         return PARSER;
      }

      public Parser<C2S_LevelGiftReward_8615> getParserForType() {
         return PARSER;
      }

      public C2S_LevelGiftReward_8615 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LevelGiftReward_8615OrBuilder {
         private int bitField0_;
         private LevelGiftData getGift_;
         private SingleFieldBuilderV3<LevelGiftData, LevelGiftData.Builder, LevelGiftDataOrBuilder> getGiftBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LevelGiftReward_8615.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_LevelGiftReward_8615.alwaysUseFieldBuilders) {
               this.getGetGiftFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.getGiftBuilder_ == null) {
               this.getGift_ = null;
            } else {
               this.getGiftBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LevelGiftReward_8615_descriptor;
         }

         public C2S_LevelGiftReward_8615 getDefaultInstanceForType() {
            return GiftMsg.C2S_LevelGiftReward_8615.getDefaultInstance();
         }

         public C2S_LevelGiftReward_8615 build() {
            C2S_LevelGiftReward_8615 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LevelGiftReward_8615 buildPartial() {
            C2S_LevelGiftReward_8615 result = new C2S_LevelGiftReward_8615(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.getGiftBuilder_ == null) {
                  result.getGift_ = this.getGift_;
               } else {
                  result.getGift_ = (LevelGiftData)this.getGiftBuilder_.build();
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
            if (other instanceof C2S_LevelGiftReward_8615) {
               return this.mergeFrom((C2S_LevelGiftReward_8615)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LevelGiftReward_8615 other) {
            if (other == GiftMsg.C2S_LevelGiftReward_8615.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGetGift()) {
                  this.mergeGetGift(other.getGetGift());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGetGift()) {
               return false;
            } else {
               return this.getGetGift().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LevelGiftReward_8615 parsedMessage = null;

            try {
               parsedMessage = (C2S_LevelGiftReward_8615)GiftMsg.C2S_LevelGiftReward_8615.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LevelGiftReward_8615)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGetGift() {
            return (this.bitField0_ & 1) != 0;
         }

         public LevelGiftData getGetGift() {
            if (this.getGiftBuilder_ == null) {
               return this.getGift_ == null ? GiftMsg.LevelGiftData.getDefaultInstance() : this.getGift_;
            } else {
               return (LevelGiftData)this.getGiftBuilder_.getMessage();
            }
         }

         public Builder setGetGift(LevelGiftData value) {
            if (this.getGiftBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.getGift_ = value;
               this.onChanged();
            } else {
               this.getGiftBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGetGift(LevelGiftData.Builder builderForValue) {
            if (this.getGiftBuilder_ == null) {
               this.getGift_ = builderForValue.build();
               this.onChanged();
            } else {
               this.getGiftBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGetGift(LevelGiftData value) {
            if (this.getGiftBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.getGift_ != null && this.getGift_ != GiftMsg.LevelGiftData.getDefaultInstance()) {
                  this.getGift_ = GiftMsg.LevelGiftData.newBuilder(this.getGift_).mergeFrom(value).buildPartial();
               } else {
                  this.getGift_ = value;
               }

               this.onChanged();
            } else {
               this.getGiftBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGetGift() {
            if (this.getGiftBuilder_ == null) {
               this.getGift_ = null;
               this.onChanged();
            } else {
               this.getGiftBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public LevelGiftData.Builder getGetGiftBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (LevelGiftData.Builder)this.getGetGiftFieldBuilder().getBuilder();
         }

         public LevelGiftDataOrBuilder getGetGiftOrBuilder() {
            if (this.getGiftBuilder_ != null) {
               return (LevelGiftDataOrBuilder)this.getGiftBuilder_.getMessageOrBuilder();
            } else {
               return this.getGift_ == null ? GiftMsg.LevelGiftData.getDefaultInstance() : this.getGift_;
            }
         }

         private SingleFieldBuilderV3<LevelGiftData, LevelGiftData.Builder, LevelGiftDataOrBuilder> getGetGiftFieldBuilder() {
            if (this.getGiftBuilder_ == null) {
               this.getGiftBuilder_ = new SingleFieldBuilderV3(this.getGetGift(), this.getParentForChildren(), this.isClean());
               this.getGift_ = null;
            }

            return this.getGiftBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_LevelGiftReward_8616 extends GeneratedMessageV3 implements S2C_LevelGiftReward_8616OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GETGIFT_FIELD_NUMBER = 1;
      private LevelGiftData getGift_;
      private byte memoizedIsInitialized;
      private static final S2C_LevelGiftReward_8616 DEFAULT_INSTANCE = new S2C_LevelGiftReward_8616();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LevelGiftReward_8616> PARSER = new AbstractParser<S2C_LevelGiftReward_8616>() {
         public S2C_LevelGiftReward_8616 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LevelGiftReward_8616(input, extensionRegistry);
         }
      };

      private S2C_LevelGiftReward_8616(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LevelGiftReward_8616() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LevelGiftReward_8616();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LevelGiftReward_8616(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        LevelGiftData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.getGift_.toBuilder();
                        }

                        this.getGift_ = (LevelGiftData)input.readMessage(GiftMsg.LevelGiftData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.getGift_);
                           this.getGift_ = subBuilder.buildPartial();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LevelGiftReward_8616.class, Builder.class);
      }

      public boolean hasGetGift() {
         return (this.bitField0_ & 1) != 0;
      }

      public LevelGiftData getGetGift() {
         return this.getGift_ == null ? GiftMsg.LevelGiftData.getDefaultInstance() : this.getGift_;
      }

      public LevelGiftDataOrBuilder getGetGiftOrBuilder() {
         return this.getGift_ == null ? GiftMsg.LevelGiftData.getDefaultInstance() : this.getGift_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGetGift()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGetGift().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGetGift());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGetGift());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LevelGiftReward_8616)) {
            return super.equals(obj);
         } else {
            S2C_LevelGiftReward_8616 other = (S2C_LevelGiftReward_8616)obj;
            if (this.hasGetGift() != other.hasGetGift()) {
               return false;
            } else if (this.hasGetGift() && !this.getGetGift().equals(other.getGetGift())) {
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
            if (this.hasGetGift()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGetGift().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LevelGiftReward_8616 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftReward_8616)PARSER.parseFrom(data);
      }

      public static S2C_LevelGiftReward_8616 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftReward_8616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LevelGiftReward_8616 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftReward_8616)PARSER.parseFrom(data);
      }

      public static S2C_LevelGiftReward_8616 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftReward_8616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LevelGiftReward_8616 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftReward_8616)PARSER.parseFrom(data);
      }

      public static S2C_LevelGiftReward_8616 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LevelGiftReward_8616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LevelGiftReward_8616 parseFrom(InputStream input) throws IOException {
         return (S2C_LevelGiftReward_8616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LevelGiftReward_8616 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LevelGiftReward_8616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LevelGiftReward_8616 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LevelGiftReward_8616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LevelGiftReward_8616 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LevelGiftReward_8616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LevelGiftReward_8616 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LevelGiftReward_8616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LevelGiftReward_8616 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LevelGiftReward_8616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LevelGiftReward_8616 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LevelGiftReward_8616 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LevelGiftReward_8616> parser() {
         return PARSER;
      }

      public Parser<S2C_LevelGiftReward_8616> getParserForType() {
         return PARSER;
      }

      public S2C_LevelGiftReward_8616 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LevelGiftReward_8616OrBuilder {
         private int bitField0_;
         private LevelGiftData getGift_;
         private SingleFieldBuilderV3<LevelGiftData, LevelGiftData.Builder, LevelGiftDataOrBuilder> getGiftBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LevelGiftReward_8616.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_LevelGiftReward_8616.alwaysUseFieldBuilders) {
               this.getGetGiftFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.getGiftBuilder_ == null) {
               this.getGift_ = null;
            } else {
               this.getGiftBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LevelGiftReward_8616_descriptor;
         }

         public S2C_LevelGiftReward_8616 getDefaultInstanceForType() {
            return GiftMsg.S2C_LevelGiftReward_8616.getDefaultInstance();
         }

         public S2C_LevelGiftReward_8616 build() {
            S2C_LevelGiftReward_8616 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LevelGiftReward_8616 buildPartial() {
            S2C_LevelGiftReward_8616 result = new S2C_LevelGiftReward_8616(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.getGiftBuilder_ == null) {
                  result.getGift_ = this.getGift_;
               } else {
                  result.getGift_ = (LevelGiftData)this.getGiftBuilder_.build();
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
            if (other instanceof S2C_LevelGiftReward_8616) {
               return this.mergeFrom((S2C_LevelGiftReward_8616)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LevelGiftReward_8616 other) {
            if (other == GiftMsg.S2C_LevelGiftReward_8616.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGetGift()) {
                  this.mergeGetGift(other.getGetGift());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGetGift()) {
               return false;
            } else {
               return this.getGetGift().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LevelGiftReward_8616 parsedMessage = null;

            try {
               parsedMessage = (S2C_LevelGiftReward_8616)GiftMsg.S2C_LevelGiftReward_8616.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LevelGiftReward_8616)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGetGift() {
            return (this.bitField0_ & 1) != 0;
         }

         public LevelGiftData getGetGift() {
            if (this.getGiftBuilder_ == null) {
               return this.getGift_ == null ? GiftMsg.LevelGiftData.getDefaultInstance() : this.getGift_;
            } else {
               return (LevelGiftData)this.getGiftBuilder_.getMessage();
            }
         }

         public Builder setGetGift(LevelGiftData value) {
            if (this.getGiftBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.getGift_ = value;
               this.onChanged();
            } else {
               this.getGiftBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGetGift(LevelGiftData.Builder builderForValue) {
            if (this.getGiftBuilder_ == null) {
               this.getGift_ = builderForValue.build();
               this.onChanged();
            } else {
               this.getGiftBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGetGift(LevelGiftData value) {
            if (this.getGiftBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.getGift_ != null && this.getGift_ != GiftMsg.LevelGiftData.getDefaultInstance()) {
                  this.getGift_ = GiftMsg.LevelGiftData.newBuilder(this.getGift_).mergeFrom(value).buildPartial();
               } else {
                  this.getGift_ = value;
               }

               this.onChanged();
            } else {
               this.getGiftBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGetGift() {
            if (this.getGiftBuilder_ == null) {
               this.getGift_ = null;
               this.onChanged();
            } else {
               this.getGiftBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public LevelGiftData.Builder getGetGiftBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (LevelGiftData.Builder)this.getGetGiftFieldBuilder().getBuilder();
         }

         public LevelGiftDataOrBuilder getGetGiftOrBuilder() {
            if (this.getGiftBuilder_ != null) {
               return (LevelGiftDataOrBuilder)this.getGiftBuilder_.getMessageOrBuilder();
            } else {
               return this.getGift_ == null ? GiftMsg.LevelGiftData.getDefaultInstance() : this.getGift_;
            }
         }

         private SingleFieldBuilderV3<LevelGiftData, LevelGiftData.Builder, LevelGiftDataOrBuilder> getGetGiftFieldBuilder() {
            if (this.getGiftBuilder_ == null) {
               this.getGiftBuilder_ = new SingleFieldBuilderV3(this.getGetGift(), this.getParentForChildren(), this.isClean());
               this.getGift_ = null;
            }

            return this.getGiftBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ActLimitShop_8617 extends GeneratedMessageV3 implements C2S_ActLimitShop_8617OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActLimitShop_8617 DEFAULT_INSTANCE = new C2S_ActLimitShop_8617();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActLimitShop_8617> PARSER = new AbstractParser<C2S_ActLimitShop_8617>() {
         public C2S_ActLimitShop_8617 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActLimitShop_8617(input, extensionRegistry);
         }
      };

      private C2S_ActLimitShop_8617(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActLimitShop_8617() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActLimitShop_8617();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActLimitShop_8617(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActLimitShop_8617.class, Builder.class);
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
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ActLimitShop_8617)) {
            return super.equals(obj);
         } else {
            C2S_ActLimitShop_8617 other = (C2S_ActLimitShop_8617)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ActLimitShop_8617 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActLimitShop_8617)PARSER.parseFrom(data);
      }

      public static C2S_ActLimitShop_8617 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActLimitShop_8617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActLimitShop_8617 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActLimitShop_8617)PARSER.parseFrom(data);
      }

      public static C2S_ActLimitShop_8617 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActLimitShop_8617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActLimitShop_8617 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActLimitShop_8617)PARSER.parseFrom(data);
      }

      public static C2S_ActLimitShop_8617 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActLimitShop_8617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActLimitShop_8617 parseFrom(InputStream input) throws IOException {
         return (C2S_ActLimitShop_8617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActLimitShop_8617 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActLimitShop_8617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActLimitShop_8617 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActLimitShop_8617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActLimitShop_8617 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActLimitShop_8617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActLimitShop_8617 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActLimitShop_8617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActLimitShop_8617 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActLimitShop_8617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActLimitShop_8617 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActLimitShop_8617 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActLimitShop_8617> parser() {
         return PARSER;
      }

      public Parser<C2S_ActLimitShop_8617> getParserForType() {
         return PARSER;
      }

      public C2S_ActLimitShop_8617 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActLimitShop_8617OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActLimitShop_8617.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_ActLimitShop_8617.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_ActLimitShop_8617_descriptor;
         }

         public C2S_ActLimitShop_8617 getDefaultInstanceForType() {
            return GiftMsg.C2S_ActLimitShop_8617.getDefaultInstance();
         }

         public C2S_ActLimitShop_8617 build() {
            C2S_ActLimitShop_8617 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActLimitShop_8617 buildPartial() {
            C2S_ActLimitShop_8617 result = new C2S_ActLimitShop_8617(this);
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
            if (other instanceof C2S_ActLimitShop_8617) {
               return this.mergeFrom((C2S_ActLimitShop_8617)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActLimitShop_8617 other) {
            if (other == GiftMsg.C2S_ActLimitShop_8617.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ActLimitShop_8617 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActLimitShop_8617)GiftMsg.C2S_ActLimitShop_8617.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActLimitShop_8617)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

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

   public static final class S2C_ActLimitShop_8618 extends GeneratedMessageV3 implements S2C_ActLimitShop_8618OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ACTTRIGGERGIFTS_FIELD_NUMBER = 1;
      private Internal.IntList actTriggerGifts_;
      private byte memoizedIsInitialized;
      private static final S2C_ActLimitShop_8618 DEFAULT_INSTANCE = new S2C_ActLimitShop_8618();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActLimitShop_8618> PARSER = new AbstractParser<S2C_ActLimitShop_8618>() {
         public S2C_ActLimitShop_8618 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActLimitShop_8618(input, extensionRegistry);
         }
      };

      private S2C_ActLimitShop_8618(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActLimitShop_8618() {
         this.memoizedIsInitialized = -1;
         this.actTriggerGifts_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActLimitShop_8618();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActLimitShop_8618(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.actTriggerGifts_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.actTriggerGifts_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.actTriggerGifts_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.actTriggerGifts_.addInt(input.readInt32());
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
                  this.actTriggerGifts_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActLimitShop_8618.class, Builder.class);
      }

      public List<Integer> getActTriggerGiftsList() {
         return this.actTriggerGifts_;
      }

      public int getActTriggerGiftsCount() {
         return this.actTriggerGifts_.size();
      }

      public int getActTriggerGifts(int index) {
         return this.actTriggerGifts_.getInt(index);
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
         for(int i = 0; i < this.actTriggerGifts_.size(); ++i) {
            output.writeInt32(1, this.actTriggerGifts_.getInt(i));
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

            for(int i = 0; i < this.actTriggerGifts_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.actTriggerGifts_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getActTriggerGiftsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActLimitShop_8618)) {
            return super.equals(obj);
         } else {
            S2C_ActLimitShop_8618 other = (S2C_ActLimitShop_8618)obj;
            if (!this.getActTriggerGiftsList().equals(other.getActTriggerGiftsList())) {
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
            if (this.getActTriggerGiftsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActTriggerGiftsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActLimitShop_8618 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActLimitShop_8618)PARSER.parseFrom(data);
      }

      public static S2C_ActLimitShop_8618 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActLimitShop_8618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActLimitShop_8618 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActLimitShop_8618)PARSER.parseFrom(data);
      }

      public static S2C_ActLimitShop_8618 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActLimitShop_8618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActLimitShop_8618 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActLimitShop_8618)PARSER.parseFrom(data);
      }

      public static S2C_ActLimitShop_8618 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActLimitShop_8618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActLimitShop_8618 parseFrom(InputStream input) throws IOException {
         return (S2C_ActLimitShop_8618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActLimitShop_8618 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActLimitShop_8618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActLimitShop_8618 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActLimitShop_8618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActLimitShop_8618 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActLimitShop_8618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActLimitShop_8618 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActLimitShop_8618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActLimitShop_8618 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActLimitShop_8618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActLimitShop_8618 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActLimitShop_8618 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActLimitShop_8618> parser() {
         return PARSER;
      }

      public Parser<S2C_ActLimitShop_8618> getParserForType() {
         return PARSER;
      }

      public S2C_ActLimitShop_8618 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActLimitShop_8618OrBuilder {
         private int bitField0_;
         private Internal.IntList actTriggerGifts_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActLimitShop_8618.class, Builder.class);
         }

         private Builder() {
            this.actTriggerGifts_ = GiftMsg.S2C_ActLimitShop_8618.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.actTriggerGifts_ = GiftMsg.S2C_ActLimitShop_8618.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_ActLimitShop_8618.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.actTriggerGifts_ = GiftMsg.S2C_ActLimitShop_8618.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_ActLimitShop_8618_descriptor;
         }

         public S2C_ActLimitShop_8618 getDefaultInstanceForType() {
            return GiftMsg.S2C_ActLimitShop_8618.getDefaultInstance();
         }

         public S2C_ActLimitShop_8618 build() {
            S2C_ActLimitShop_8618 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActLimitShop_8618 buildPartial() {
            S2C_ActLimitShop_8618 result = new S2C_ActLimitShop_8618(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.actTriggerGifts_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.actTriggerGifts_ = this.actTriggerGifts_;
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
            if (other instanceof S2C_ActLimitShop_8618) {
               return this.mergeFrom((S2C_ActLimitShop_8618)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActLimitShop_8618 other) {
            if (other == GiftMsg.S2C_ActLimitShop_8618.getDefaultInstance()) {
               return this;
            } else {
               if (!other.actTriggerGifts_.isEmpty()) {
                  if (this.actTriggerGifts_.isEmpty()) {
                     this.actTriggerGifts_ = other.actTriggerGifts_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureActTriggerGiftsIsMutable();
                     this.actTriggerGifts_.addAll(other.actTriggerGifts_);
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
            S2C_ActLimitShop_8618 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActLimitShop_8618)GiftMsg.S2C_ActLimitShop_8618.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActLimitShop_8618)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureActTriggerGiftsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.actTriggerGifts_ = GiftMsg.S2C_ActLimitShop_8618.mutableCopy(this.actTriggerGifts_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getActTriggerGiftsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.actTriggerGifts_) : this.actTriggerGifts_);
         }

         public int getActTriggerGiftsCount() {
            return this.actTriggerGifts_.size();
         }

         public int getActTriggerGifts(int index) {
            return this.actTriggerGifts_.getInt(index);
         }

         public Builder setActTriggerGifts(int index, int value) {
            this.ensureActTriggerGiftsIsMutable();
            this.actTriggerGifts_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addActTriggerGifts(int value) {
            this.ensureActTriggerGiftsIsMutable();
            this.actTriggerGifts_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllActTriggerGifts(Iterable<? extends Integer> values) {
            this.ensureActTriggerGiftsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.actTriggerGifts_);
            this.onChanged();
            return this;
         }

         public Builder clearActTriggerGifts() {
            this.actTriggerGifts_ = GiftMsg.S2C_ActLimitShop_8618.emptyIntList();
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

   public static final class C2S_WeeklyCardReward_8619 extends GeneratedMessageV3 implements C2S_WeeklyCardReward_8619OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTID_FIELD_NUMBER = 1;
      private int giftId_;
      public static final int DAY_FIELD_NUMBER = 2;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_WeeklyCardReward_8619 DEFAULT_INSTANCE = new C2S_WeeklyCardReward_8619();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WeeklyCardReward_8619> PARSER = new AbstractParser<C2S_WeeklyCardReward_8619>() {
         public C2S_WeeklyCardReward_8619 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WeeklyCardReward_8619(input, extensionRegistry);
         }
      };

      private C2S_WeeklyCardReward_8619(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WeeklyCardReward_8619() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WeeklyCardReward_8619();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WeeklyCardReward_8619(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.giftId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.day_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WeeklyCardReward_8619.class, Builder.class);
      }

      public boolean hasGiftId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGiftId() {
         return this.giftId_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGiftId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.giftId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.giftId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WeeklyCardReward_8619)) {
            return super.equals(obj);
         } else {
            C2S_WeeklyCardReward_8619 other = (C2S_WeeklyCardReward_8619)obj;
            if (this.hasGiftId() != other.hasGiftId()) {
               return false;
            } else if (this.hasGiftId() && this.getGiftId() != other.getGiftId()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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
            if (this.hasGiftId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftId();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WeeklyCardReward_8619)PARSER.parseFrom(data);
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeeklyCardReward_8619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WeeklyCardReward_8619)PARSER.parseFrom(data);
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeeklyCardReward_8619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WeeklyCardReward_8619)PARSER.parseFrom(data);
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeeklyCardReward_8619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(InputStream input) throws IOException {
         return (C2S_WeeklyCardReward_8619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeeklyCardReward_8619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WeeklyCardReward_8619 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WeeklyCardReward_8619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WeeklyCardReward_8619 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeeklyCardReward_8619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WeeklyCardReward_8619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WeeklyCardReward_8619 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeeklyCardReward_8619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WeeklyCardReward_8619 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WeeklyCardReward_8619 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WeeklyCardReward_8619> parser() {
         return PARSER;
      }

      public Parser<C2S_WeeklyCardReward_8619> getParserForType() {
         return PARSER;
      }

      public C2S_WeeklyCardReward_8619 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WeeklyCardReward_8619OrBuilder {
         private int bitField0_;
         private int giftId_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WeeklyCardReward_8619.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_WeeklyCardReward_8619.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giftId_ = 0;
            this.bitField0_ &= -2;
            this.day_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WeeklyCardReward_8619_descriptor;
         }

         public C2S_WeeklyCardReward_8619 getDefaultInstanceForType() {
            return GiftMsg.C2S_WeeklyCardReward_8619.getDefaultInstance();
         }

         public C2S_WeeklyCardReward_8619 build() {
            C2S_WeeklyCardReward_8619 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WeeklyCardReward_8619 buildPartial() {
            C2S_WeeklyCardReward_8619 result = new C2S_WeeklyCardReward_8619(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.giftId_ = this.giftId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 2;
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
            if (other instanceof C2S_WeeklyCardReward_8619) {
               return this.mergeFrom((C2S_WeeklyCardReward_8619)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WeeklyCardReward_8619 other) {
            if (other == GiftMsg.C2S_WeeklyCardReward_8619.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGiftId()) {
                  this.setGiftId(other.getGiftId());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGiftId()) {
               return false;
            } else {
               return this.hasDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WeeklyCardReward_8619 parsedMessage = null;

            try {
               parsedMessage = (C2S_WeeklyCardReward_8619)GiftMsg.C2S_WeeklyCardReward_8619.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WeeklyCardReward_8619)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGiftId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGiftId() {
            return this.giftId_;
         }

         public Builder setGiftId(int value) {
            this.bitField0_ |= 1;
            this.giftId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiftId() {
            this.bitField0_ &= -2;
            this.giftId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 2;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -3;
            this.day_ = 0;
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

   public static final class S2C_WeeklyCardReward_8620 extends GeneratedMessageV3 implements S2C_WeeklyCardReward_8620OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTID_FIELD_NUMBER = 1;
      private int giftId_;
      public static final int DAY_FIELD_NUMBER = 2;
      private int day_;
      private byte memoizedIsInitialized;
      private static final S2C_WeeklyCardReward_8620 DEFAULT_INSTANCE = new S2C_WeeklyCardReward_8620();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WeeklyCardReward_8620> PARSER = new AbstractParser<S2C_WeeklyCardReward_8620>() {
         public S2C_WeeklyCardReward_8620 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WeeklyCardReward_8620(input, extensionRegistry);
         }
      };

      private S2C_WeeklyCardReward_8620(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WeeklyCardReward_8620() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WeeklyCardReward_8620();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WeeklyCardReward_8620(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.giftId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.day_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WeeklyCardReward_8620.class, Builder.class);
      }

      public boolean hasGiftId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGiftId() {
         return this.giftId_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGiftId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.giftId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.giftId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WeeklyCardReward_8620)) {
            return super.equals(obj);
         } else {
            S2C_WeeklyCardReward_8620 other = (S2C_WeeklyCardReward_8620)obj;
            if (this.hasGiftId() != other.hasGiftId()) {
               return false;
            } else if (this.hasGiftId() && this.getGiftId() != other.getGiftId()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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
            if (this.hasGiftId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftId();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WeeklyCardReward_8620)PARSER.parseFrom(data);
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeeklyCardReward_8620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WeeklyCardReward_8620)PARSER.parseFrom(data);
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeeklyCardReward_8620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WeeklyCardReward_8620)PARSER.parseFrom(data);
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeeklyCardReward_8620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(InputStream input) throws IOException {
         return (S2C_WeeklyCardReward_8620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeeklyCardReward_8620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WeeklyCardReward_8620 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WeeklyCardReward_8620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WeeklyCardReward_8620 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeeklyCardReward_8620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WeeklyCardReward_8620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WeeklyCardReward_8620 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeeklyCardReward_8620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WeeklyCardReward_8620 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WeeklyCardReward_8620 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WeeklyCardReward_8620> parser() {
         return PARSER;
      }

      public Parser<S2C_WeeklyCardReward_8620> getParserForType() {
         return PARSER;
      }

      public S2C_WeeklyCardReward_8620 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WeeklyCardReward_8620OrBuilder {
         private int bitField0_;
         private int giftId_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WeeklyCardReward_8620.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_WeeklyCardReward_8620.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giftId_ = 0;
            this.bitField0_ &= -2;
            this.day_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WeeklyCardReward_8620_descriptor;
         }

         public S2C_WeeklyCardReward_8620 getDefaultInstanceForType() {
            return GiftMsg.S2C_WeeklyCardReward_8620.getDefaultInstance();
         }

         public S2C_WeeklyCardReward_8620 build() {
            S2C_WeeklyCardReward_8620 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WeeklyCardReward_8620 buildPartial() {
            S2C_WeeklyCardReward_8620 result = new S2C_WeeklyCardReward_8620(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.giftId_ = this.giftId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 2;
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
            if (other instanceof S2C_WeeklyCardReward_8620) {
               return this.mergeFrom((S2C_WeeklyCardReward_8620)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WeeklyCardReward_8620 other) {
            if (other == GiftMsg.S2C_WeeklyCardReward_8620.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGiftId()) {
                  this.setGiftId(other.getGiftId());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGiftId()) {
               return false;
            } else {
               return this.hasDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WeeklyCardReward_8620 parsedMessage = null;

            try {
               parsedMessage = (S2C_WeeklyCardReward_8620)GiftMsg.S2C_WeeklyCardReward_8620.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WeeklyCardReward_8620)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGiftId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGiftId() {
            return this.giftId_;
         }

         public Builder setGiftId(int value) {
            this.bitField0_ |= 1;
            this.giftId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiftId() {
            this.bitField0_ &= -2;
            this.giftId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 2;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -3;
            this.day_ = 0;
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

   public static final class C2S_GeneralWelfare_8623 extends GeneratedMessageV3 implements C2S_GeneralWelfare_8623OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_GeneralWelfare_8623 DEFAULT_INSTANCE = new C2S_GeneralWelfare_8623();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GeneralWelfare_8623> PARSER = new AbstractParser<C2S_GeneralWelfare_8623>() {
         public C2S_GeneralWelfare_8623 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GeneralWelfare_8623(input, extensionRegistry);
         }
      };

      private C2S_GeneralWelfare_8623(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GeneralWelfare_8623() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GeneralWelfare_8623();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GeneralWelfare_8623(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GeneralWelfare_8623.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GeneralWelfare_8623)) {
            return super.equals(obj);
         } else {
            C2S_GeneralWelfare_8623 other = (C2S_GeneralWelfare_8623)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GeneralWelfare_8623 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfare_8623)PARSER.parseFrom(data);
      }

      public static C2S_GeneralWelfare_8623 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfare_8623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GeneralWelfare_8623 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfare_8623)PARSER.parseFrom(data);
      }

      public static C2S_GeneralWelfare_8623 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfare_8623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GeneralWelfare_8623 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfare_8623)PARSER.parseFrom(data);
      }

      public static C2S_GeneralWelfare_8623 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfare_8623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GeneralWelfare_8623 parseFrom(InputStream input) throws IOException {
         return (C2S_GeneralWelfare_8623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GeneralWelfare_8623 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GeneralWelfare_8623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GeneralWelfare_8623 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GeneralWelfare_8623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GeneralWelfare_8623 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GeneralWelfare_8623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GeneralWelfare_8623 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GeneralWelfare_8623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GeneralWelfare_8623 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GeneralWelfare_8623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GeneralWelfare_8623 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GeneralWelfare_8623 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GeneralWelfare_8623> parser() {
         return PARSER;
      }

      public Parser<C2S_GeneralWelfare_8623> getParserForType() {
         return PARSER;
      }

      public C2S_GeneralWelfare_8623 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GeneralWelfare_8623OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GeneralWelfare_8623.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_GeneralWelfare_8623.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfare_8623_descriptor;
         }

         public C2S_GeneralWelfare_8623 getDefaultInstanceForType() {
            return GiftMsg.C2S_GeneralWelfare_8623.getDefaultInstance();
         }

         public C2S_GeneralWelfare_8623 build() {
            C2S_GeneralWelfare_8623 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GeneralWelfare_8623 buildPartial() {
            C2S_GeneralWelfare_8623 result = new C2S_GeneralWelfare_8623(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_GeneralWelfare_8623) {
               return this.mergeFrom((C2S_GeneralWelfare_8623)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GeneralWelfare_8623 other) {
            if (other == GiftMsg.C2S_GeneralWelfare_8623.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GeneralWelfare_8623 parsedMessage = null;

            try {
               parsedMessage = (C2S_GeneralWelfare_8623)GiftMsg.C2S_GeneralWelfare_8623.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GeneralWelfare_8623)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
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

   public static final class S2C_GeneralWelfare_8624 extends GeneratedMessageV3 implements S2C_GeneralWelfare_8624OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      public static final int REWARDCOMMON_FIELD_NUMBER = 3;
      private Internal.IntList rewardCommon_;
      public static final int REWARDSUPER_FIELD_NUMBER = 4;
      private Internal.IntList rewardSuper_;
      private byte memoizedIsInitialized;
      private static final S2C_GeneralWelfare_8624 DEFAULT_INSTANCE = new S2C_GeneralWelfare_8624();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GeneralWelfare_8624> PARSER = new AbstractParser<S2C_GeneralWelfare_8624>() {
         public S2C_GeneralWelfare_8624 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GeneralWelfare_8624(input, extensionRegistry);
         }
      };

      private S2C_GeneralWelfare_8624(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GeneralWelfare_8624() {
         this.memoizedIsInitialized = -1;
         this.rewardCommon_ = emptyIntList();
         this.rewardSuper_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GeneralWelfare_8624();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GeneralWelfare_8624(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 1;
                        this.type_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.count_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rewardCommon_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rewardCommon_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardCommon_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.rewardSuper_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.rewardSuper_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardSuper_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.rewardSuper_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.rewardCommon_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.rewardCommon_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.rewardSuper_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GeneralWelfare_8624.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public List<Integer> getRewardCommonList() {
         return this.rewardCommon_;
      }

      public int getRewardCommonCount() {
         return this.rewardCommon_.size();
      }

      public int getRewardCommon(int index) {
         return this.rewardCommon_.getInt(index);
      }

      public List<Integer> getRewardSuperList() {
         return this.rewardSuper_;
      }

      public int getRewardSuperCount() {
         return this.rewardSuper_.size();
      }

      public int getRewardSuper(int index) {
         return this.rewardSuper_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.count_);
         }

         for(int i = 0; i < this.rewardCommon_.size(); ++i) {
            output.writeInt32(3, this.rewardCommon_.getInt(i));
         }

         for(int i = 0; i < this.rewardSuper_.size(); ++i) {
            output.writeInt32(4, this.rewardSuper_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.count_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardCommon_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardCommon_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardCommonList().size();
            dataSize = 0;

            for(int i = 0; i < this.rewardSuper_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardSuper_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardSuperList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GeneralWelfare_8624)) {
            return super.equals(obj);
         } else {
            S2C_GeneralWelfare_8624 other = (S2C_GeneralWelfare_8624)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (!this.getRewardCommonList().equals(other.getRewardCommonList())) {
               return false;
            } else if (!this.getRewardSuperList().equals(other.getRewardSuperList())) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCount();
            }

            if (this.getRewardCommonCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardCommonList().hashCode();
            }

            if (this.getRewardSuperCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRewardSuperList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GeneralWelfare_8624 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfare_8624)PARSER.parseFrom(data);
      }

      public static S2C_GeneralWelfare_8624 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfare_8624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GeneralWelfare_8624 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfare_8624)PARSER.parseFrom(data);
      }

      public static S2C_GeneralWelfare_8624 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfare_8624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GeneralWelfare_8624 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfare_8624)PARSER.parseFrom(data);
      }

      public static S2C_GeneralWelfare_8624 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfare_8624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GeneralWelfare_8624 parseFrom(InputStream input) throws IOException {
         return (S2C_GeneralWelfare_8624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GeneralWelfare_8624 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GeneralWelfare_8624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GeneralWelfare_8624 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GeneralWelfare_8624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GeneralWelfare_8624 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GeneralWelfare_8624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GeneralWelfare_8624 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GeneralWelfare_8624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GeneralWelfare_8624 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GeneralWelfare_8624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GeneralWelfare_8624 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GeneralWelfare_8624 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GeneralWelfare_8624> parser() {
         return PARSER;
      }

      public Parser<S2C_GeneralWelfare_8624> getParserForType() {
         return PARSER;
      }

      public S2C_GeneralWelfare_8624 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GeneralWelfare_8624OrBuilder {
         private int bitField0_;
         private int type_;
         private int count_;
         private Internal.IntList rewardCommon_;
         private Internal.IntList rewardSuper_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GeneralWelfare_8624.class, Builder.class);
         }

         private Builder() {
            this.rewardCommon_ = GiftMsg.S2C_GeneralWelfare_8624.emptyIntList();
            this.rewardSuper_ = GiftMsg.S2C_GeneralWelfare_8624.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardCommon_ = GiftMsg.S2C_GeneralWelfare_8624.emptyIntList();
            this.rewardSuper_ = GiftMsg.S2C_GeneralWelfare_8624.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_GeneralWelfare_8624.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.bitField0_ &= -3;
            this.rewardCommon_ = GiftMsg.S2C_GeneralWelfare_8624.emptyIntList();
            this.bitField0_ &= -5;
            this.rewardSuper_ = GiftMsg.S2C_GeneralWelfare_8624.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfare_8624_descriptor;
         }

         public S2C_GeneralWelfare_8624 getDefaultInstanceForType() {
            return GiftMsg.S2C_GeneralWelfare_8624.getDefaultInstance();
         }

         public S2C_GeneralWelfare_8624 build() {
            S2C_GeneralWelfare_8624 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GeneralWelfare_8624 buildPartial() {
            S2C_GeneralWelfare_8624 result = new S2C_GeneralWelfare_8624(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.rewardCommon_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.rewardCommon_ = this.rewardCommon_;
            if ((this.bitField0_ & 8) != 0) {
               this.rewardSuper_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.rewardSuper_ = this.rewardSuper_;
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
            if (other instanceof S2C_GeneralWelfare_8624) {
               return this.mergeFrom((S2C_GeneralWelfare_8624)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GeneralWelfare_8624 other) {
            if (other == GiftMsg.S2C_GeneralWelfare_8624.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (!other.rewardCommon_.isEmpty()) {
                  if (this.rewardCommon_.isEmpty()) {
                     this.rewardCommon_ = other.rewardCommon_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureRewardCommonIsMutable();
                     this.rewardCommon_.addAll(other.rewardCommon_);
                  }

                  this.onChanged();
               }

               if (!other.rewardSuper_.isEmpty()) {
                  if (this.rewardSuper_.isEmpty()) {
                     this.rewardSuper_ = other.rewardSuper_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureRewardSuperIsMutable();
                     this.rewardSuper_.addAll(other.rewardSuper_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GeneralWelfare_8624 parsedMessage = null;

            try {
               parsedMessage = (S2C_GeneralWelfare_8624)GiftMsg.S2C_GeneralWelfare_8624.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GeneralWelfare_8624)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 2;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -3;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardCommonIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rewardCommon_ = GiftMsg.S2C_GeneralWelfare_8624.mutableCopy(this.rewardCommon_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getRewardCommonList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.rewardCommon_) : this.rewardCommon_);
         }

         public int getRewardCommonCount() {
            return this.rewardCommon_.size();
         }

         public int getRewardCommon(int index) {
            return this.rewardCommon_.getInt(index);
         }

         public Builder setRewardCommon(int index, int value) {
            this.ensureRewardCommonIsMutable();
            this.rewardCommon_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardCommon(int value) {
            this.ensureRewardCommonIsMutable();
            this.rewardCommon_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardCommon(Iterable<? extends Integer> values) {
            this.ensureRewardCommonIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardCommon_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardCommon() {
            this.rewardCommon_ = GiftMsg.S2C_GeneralWelfare_8624.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureRewardSuperIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.rewardSuper_ = GiftMsg.S2C_GeneralWelfare_8624.mutableCopy(this.rewardSuper_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getRewardSuperList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.rewardSuper_) : this.rewardSuper_);
         }

         public int getRewardSuperCount() {
            return this.rewardSuper_.size();
         }

         public int getRewardSuper(int index) {
            return this.rewardSuper_.getInt(index);
         }

         public Builder setRewardSuper(int index, int value) {
            this.ensureRewardSuperIsMutable();
            this.rewardSuper_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardSuper(int value) {
            this.ensureRewardSuperIsMutable();
            this.rewardSuper_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardSuper(Iterable<? extends Integer> values) {
            this.ensureRewardSuperIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardSuper_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardSuper() {
            this.rewardSuper_ = GiftMsg.S2C_GeneralWelfare_8624.emptyIntList();
            this.bitField0_ &= -9;
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

   public static final class C2S_GeneralWelfareReward_8625 extends GeneratedMessageV3 implements C2S_GeneralWelfareReward_8625OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARD_FIELD_NUMBER = 1;
      private int reward_;
      private byte memoizedIsInitialized;
      private static final C2S_GeneralWelfareReward_8625 DEFAULT_INSTANCE = new C2S_GeneralWelfareReward_8625();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GeneralWelfareReward_8625> PARSER = new AbstractParser<C2S_GeneralWelfareReward_8625>() {
         public C2S_GeneralWelfareReward_8625 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GeneralWelfareReward_8625(input, extensionRegistry);
         }
      };

      private C2S_GeneralWelfareReward_8625(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GeneralWelfareReward_8625() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GeneralWelfareReward_8625();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GeneralWelfareReward_8625(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.reward_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GeneralWelfareReward_8625.class, Builder.class);
      }

      public boolean hasReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getReward() {
         return this.reward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.reward_);
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
               size += CodedOutputStream.computeInt32Size(1, this.reward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GeneralWelfareReward_8625)) {
            return super.equals(obj);
         } else {
            C2S_GeneralWelfareReward_8625 other = (C2S_GeneralWelfareReward_8625)obj;
            if (this.hasReward() != other.hasReward()) {
               return false;
            } else if (this.hasReward() && this.getReward() != other.getReward()) {
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
            if (this.hasReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReward();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfareReward_8625)PARSER.parseFrom(data);
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfareReward_8625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfareReward_8625)PARSER.parseFrom(data);
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfareReward_8625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfareReward_8625)PARSER.parseFrom(data);
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GeneralWelfareReward_8625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(InputStream input) throws IOException {
         return (C2S_GeneralWelfareReward_8625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GeneralWelfareReward_8625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GeneralWelfareReward_8625 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GeneralWelfareReward_8625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GeneralWelfareReward_8625 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GeneralWelfareReward_8625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GeneralWelfareReward_8625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GeneralWelfareReward_8625 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GeneralWelfareReward_8625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GeneralWelfareReward_8625 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GeneralWelfareReward_8625 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GeneralWelfareReward_8625> parser() {
         return PARSER;
      }

      public Parser<C2S_GeneralWelfareReward_8625> getParserForType() {
         return PARSER;
      }

      public C2S_GeneralWelfareReward_8625 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GeneralWelfareReward_8625OrBuilder {
         private int bitField0_;
         private int reward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GeneralWelfareReward_8625.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_GeneralWelfareReward_8625.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.reward_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_GeneralWelfareReward_8625_descriptor;
         }

         public C2S_GeneralWelfareReward_8625 getDefaultInstanceForType() {
            return GiftMsg.C2S_GeneralWelfareReward_8625.getDefaultInstance();
         }

         public C2S_GeneralWelfareReward_8625 build() {
            C2S_GeneralWelfareReward_8625 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GeneralWelfareReward_8625 buildPartial() {
            C2S_GeneralWelfareReward_8625 result = new C2S_GeneralWelfareReward_8625(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.reward_ = this.reward_;
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
            if (other instanceof C2S_GeneralWelfareReward_8625) {
               return this.mergeFrom((C2S_GeneralWelfareReward_8625)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GeneralWelfareReward_8625 other) {
            if (other == GiftMsg.C2S_GeneralWelfareReward_8625.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasReward()) {
                  this.setReward(other.getReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasReward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GeneralWelfareReward_8625 parsedMessage = null;

            try {
               parsedMessage = (C2S_GeneralWelfareReward_8625)GiftMsg.C2S_GeneralWelfareReward_8625.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GeneralWelfareReward_8625)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getReward() {
            return this.reward_;
         }

         public Builder setReward(int value) {
            this.bitField0_ |= 1;
            this.reward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReward() {
            this.bitField0_ &= -2;
            this.reward_ = 0;
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

   public static final class S2C_GeneralWelfareReward_8626 extends GeneratedMessageV3 implements S2C_GeneralWelfareReward_8626OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARD_FIELD_NUMBER = 1;
      private int reward_;
      public static final int REWARDCOMMON_FIELD_NUMBER = 2;
      private Internal.IntList rewardCommon_;
      public static final int REWARDSUPER_FIELD_NUMBER = 3;
      private Internal.IntList rewardSuper_;
      private byte memoizedIsInitialized;
      private static final S2C_GeneralWelfareReward_8626 DEFAULT_INSTANCE = new S2C_GeneralWelfareReward_8626();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GeneralWelfareReward_8626> PARSER = new AbstractParser<S2C_GeneralWelfareReward_8626>() {
         public S2C_GeneralWelfareReward_8626 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GeneralWelfareReward_8626(input, extensionRegistry);
         }
      };

      private S2C_GeneralWelfareReward_8626(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GeneralWelfareReward_8626() {
         this.memoizedIsInitialized = -1;
         this.rewardCommon_ = emptyIntList();
         this.rewardSuper_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GeneralWelfareReward_8626();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GeneralWelfareReward_8626(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 1;
                        this.reward_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rewardCommon_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewardCommon_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardCommon_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rewardSuper_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rewardSuper_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.rewardSuper_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.rewardSuper_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.rewardCommon_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.rewardCommon_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.rewardSuper_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GeneralWelfareReward_8626.class, Builder.class);
      }

      public boolean hasReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getReward() {
         return this.reward_;
      }

      public List<Integer> getRewardCommonList() {
         return this.rewardCommon_;
      }

      public int getRewardCommonCount() {
         return this.rewardCommon_.size();
      }

      public int getRewardCommon(int index) {
         return this.rewardCommon_.getInt(index);
      }

      public List<Integer> getRewardSuperList() {
         return this.rewardSuper_;
      }

      public int getRewardSuperCount() {
         return this.rewardSuper_.size();
      }

      public int getRewardSuper(int index) {
         return this.rewardSuper_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.reward_);
         }

         for(int i = 0; i < this.rewardCommon_.size(); ++i) {
            output.writeInt32(2, this.rewardCommon_.getInt(i));
         }

         for(int i = 0; i < this.rewardSuper_.size(); ++i) {
            output.writeInt32(3, this.rewardSuper_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.reward_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.rewardCommon_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardCommon_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardCommonList().size();
            dataSize = 0;

            for(int i = 0; i < this.rewardSuper_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.rewardSuper_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRewardSuperList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GeneralWelfareReward_8626)) {
            return super.equals(obj);
         } else {
            S2C_GeneralWelfareReward_8626 other = (S2C_GeneralWelfareReward_8626)obj;
            if (this.hasReward() != other.hasReward()) {
               return false;
            } else if (this.hasReward() && this.getReward() != other.getReward()) {
               return false;
            } else if (!this.getRewardCommonList().equals(other.getRewardCommonList())) {
               return false;
            } else if (!this.getRewardSuperList().equals(other.getRewardSuperList())) {
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
            if (this.hasReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReward();
            }

            if (this.getRewardCommonCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardCommonList().hashCode();
            }

            if (this.getRewardSuperCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardSuperList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareReward_8626)PARSER.parseFrom(data);
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareReward_8626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareReward_8626)PARSER.parseFrom(data);
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareReward_8626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareReward_8626)PARSER.parseFrom(data);
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareReward_8626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(InputStream input) throws IOException {
         return (S2C_GeneralWelfareReward_8626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GeneralWelfareReward_8626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GeneralWelfareReward_8626 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GeneralWelfareReward_8626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GeneralWelfareReward_8626 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GeneralWelfareReward_8626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GeneralWelfareReward_8626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GeneralWelfareReward_8626 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GeneralWelfareReward_8626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GeneralWelfareReward_8626 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GeneralWelfareReward_8626 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GeneralWelfareReward_8626> parser() {
         return PARSER;
      }

      public Parser<S2C_GeneralWelfareReward_8626> getParserForType() {
         return PARSER;
      }

      public S2C_GeneralWelfareReward_8626 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GeneralWelfareReward_8626OrBuilder {
         private int bitField0_;
         private int reward_;
         private Internal.IntList rewardCommon_;
         private Internal.IntList rewardSuper_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GeneralWelfareReward_8626.class, Builder.class);
         }

         private Builder() {
            this.rewardCommon_ = GiftMsg.S2C_GeneralWelfareReward_8626.emptyIntList();
            this.rewardSuper_ = GiftMsg.S2C_GeneralWelfareReward_8626.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewardCommon_ = GiftMsg.S2C_GeneralWelfareReward_8626.emptyIntList();
            this.rewardSuper_ = GiftMsg.S2C_GeneralWelfareReward_8626.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_GeneralWelfareReward_8626.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.reward_ = 0;
            this.bitField0_ &= -2;
            this.rewardCommon_ = GiftMsg.S2C_GeneralWelfareReward_8626.emptyIntList();
            this.bitField0_ &= -3;
            this.rewardSuper_ = GiftMsg.S2C_GeneralWelfareReward_8626.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareReward_8626_descriptor;
         }

         public S2C_GeneralWelfareReward_8626 getDefaultInstanceForType() {
            return GiftMsg.S2C_GeneralWelfareReward_8626.getDefaultInstance();
         }

         public S2C_GeneralWelfareReward_8626 build() {
            S2C_GeneralWelfareReward_8626 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GeneralWelfareReward_8626 buildPartial() {
            S2C_GeneralWelfareReward_8626 result = new S2C_GeneralWelfareReward_8626(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.reward_ = this.reward_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.rewardCommon_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.rewardCommon_ = this.rewardCommon_;
            if ((this.bitField0_ & 4) != 0) {
               this.rewardSuper_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.rewardSuper_ = this.rewardSuper_;
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
            if (other instanceof S2C_GeneralWelfareReward_8626) {
               return this.mergeFrom((S2C_GeneralWelfareReward_8626)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GeneralWelfareReward_8626 other) {
            if (other == GiftMsg.S2C_GeneralWelfareReward_8626.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasReward()) {
                  this.setReward(other.getReward());
               }

               if (!other.rewardCommon_.isEmpty()) {
                  if (this.rewardCommon_.isEmpty()) {
                     this.rewardCommon_ = other.rewardCommon_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRewardCommonIsMutable();
                     this.rewardCommon_.addAll(other.rewardCommon_);
                  }

                  this.onChanged();
               }

               if (!other.rewardSuper_.isEmpty()) {
                  if (this.rewardSuper_.isEmpty()) {
                     this.rewardSuper_ = other.rewardSuper_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureRewardSuperIsMutable();
                     this.rewardSuper_.addAll(other.rewardSuper_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasReward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GeneralWelfareReward_8626 parsedMessage = null;

            try {
               parsedMessage = (S2C_GeneralWelfareReward_8626)GiftMsg.S2C_GeneralWelfareReward_8626.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GeneralWelfareReward_8626)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getReward() {
            return this.reward_;
         }

         public Builder setReward(int value) {
            this.bitField0_ |= 1;
            this.reward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReward() {
            this.bitField0_ &= -2;
            this.reward_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRewardCommonIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewardCommon_ = GiftMsg.S2C_GeneralWelfareReward_8626.mutableCopy(this.rewardCommon_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getRewardCommonList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.rewardCommon_) : this.rewardCommon_);
         }

         public int getRewardCommonCount() {
            return this.rewardCommon_.size();
         }

         public int getRewardCommon(int index) {
            return this.rewardCommon_.getInt(index);
         }

         public Builder setRewardCommon(int index, int value) {
            this.ensureRewardCommonIsMutable();
            this.rewardCommon_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardCommon(int value) {
            this.ensureRewardCommonIsMutable();
            this.rewardCommon_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardCommon(Iterable<? extends Integer> values) {
            this.ensureRewardCommonIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardCommon_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardCommon() {
            this.rewardCommon_ = GiftMsg.S2C_GeneralWelfareReward_8626.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureRewardSuperIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rewardSuper_ = GiftMsg.S2C_GeneralWelfareReward_8626.mutableCopy(this.rewardSuper_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getRewardSuperList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.rewardSuper_) : this.rewardSuper_);
         }

         public int getRewardSuperCount() {
            return this.rewardSuper_.size();
         }

         public int getRewardSuper(int index) {
            return this.rewardSuper_.getInt(index);
         }

         public Builder setRewardSuper(int index, int value) {
            this.ensureRewardSuperIsMutable();
            this.rewardSuper_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRewardSuper(int value) {
            this.ensureRewardSuperIsMutable();
            this.rewardSuper_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRewardSuper(Iterable<? extends Integer> values) {
            this.ensureRewardSuperIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewardSuper_);
            this.onChanged();
            return this;
         }

         public Builder clearRewardSuper() {
            this.rewardSuper_ = GiftMsg.S2C_GeneralWelfareReward_8626.emptyIntList();
            this.bitField0_ &= -5;
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

   public static final class S2C_GeneralWelfareNotify_8628 extends GeneratedMessageV3 implements S2C_GeneralWelfareNotify_8628OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private int count_;
      private byte memoizedIsInitialized;
      private static final S2C_GeneralWelfareNotify_8628 DEFAULT_INSTANCE = new S2C_GeneralWelfareNotify_8628();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GeneralWelfareNotify_8628> PARSER = new AbstractParser<S2C_GeneralWelfareNotify_8628>() {
         public S2C_GeneralWelfareNotify_8628 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GeneralWelfareNotify_8628(input, extensionRegistry);
         }
      };

      private S2C_GeneralWelfareNotify_8628(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GeneralWelfareNotify_8628() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GeneralWelfareNotify_8628();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GeneralWelfareNotify_8628(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.type_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.count_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GeneralWelfareNotify_8628.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.count_);
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
               size += CodedOutputStream.computeInt32Size(1, this.type_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GeneralWelfareNotify_8628)) {
            return super.equals(obj);
         } else {
            S2C_GeneralWelfareNotify_8628 other = (S2C_GeneralWelfareNotify_8628)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareNotify_8628)PARSER.parseFrom(data);
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareNotify_8628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareNotify_8628)PARSER.parseFrom(data);
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareNotify_8628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareNotify_8628)PARSER.parseFrom(data);
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GeneralWelfareNotify_8628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(InputStream input) throws IOException {
         return (S2C_GeneralWelfareNotify_8628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GeneralWelfareNotify_8628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GeneralWelfareNotify_8628 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GeneralWelfareNotify_8628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GeneralWelfareNotify_8628 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GeneralWelfareNotify_8628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GeneralWelfareNotify_8628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GeneralWelfareNotify_8628 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GeneralWelfareNotify_8628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GeneralWelfareNotify_8628 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GeneralWelfareNotify_8628 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GeneralWelfareNotify_8628> parser() {
         return PARSER;
      }

      public Parser<S2C_GeneralWelfareNotify_8628> getParserForType() {
         return PARSER;
      }

      public S2C_GeneralWelfareNotify_8628 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GeneralWelfareNotify_8628OrBuilder {
         private int bitField0_;
         private int type_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GeneralWelfareNotify_8628.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_GeneralWelfareNotify_8628.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_GeneralWelfareNotify_8628_descriptor;
         }

         public S2C_GeneralWelfareNotify_8628 getDefaultInstanceForType() {
            return GiftMsg.S2C_GeneralWelfareNotify_8628.getDefaultInstance();
         }

         public S2C_GeneralWelfareNotify_8628 build() {
            S2C_GeneralWelfareNotify_8628 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GeneralWelfareNotify_8628 buildPartial() {
            S2C_GeneralWelfareNotify_8628 result = new S2C_GeneralWelfareNotify_8628(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 2;
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
            if (other instanceof S2C_GeneralWelfareNotify_8628) {
               return this.mergeFrom((S2C_GeneralWelfareNotify_8628)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GeneralWelfareNotify_8628 other) {
            if (other == GiftMsg.S2C_GeneralWelfareNotify_8628.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GeneralWelfareNotify_8628 parsedMessage = null;

            try {
               parsedMessage = (S2C_GeneralWelfareNotify_8628)GiftMsg.S2C_GeneralWelfareNotify_8628.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GeneralWelfareNotify_8628)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 1;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 2;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -3;
            this.count_ = 0;
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

   public static final class C2S_WarOrder_8629 extends GeneratedMessageV3 implements C2S_WarOrder_8629OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarOrder_8629 DEFAULT_INSTANCE = new C2S_WarOrder_8629();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarOrder_8629> PARSER = new AbstractParser<C2S_WarOrder_8629>() {
         public C2S_WarOrder_8629 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarOrder_8629(input, extensionRegistry);
         }
      };

      private C2S_WarOrder_8629(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarOrder_8629() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarOrder_8629();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarOrder_8629(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrder_8629.class, Builder.class);
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
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarOrder_8629)) {
            return super.equals(obj);
         } else {
            C2S_WarOrder_8629 other = (C2S_WarOrder_8629)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarOrder_8629 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_8629)PARSER.parseFrom(data);
      }

      public static C2S_WarOrder_8629 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_8629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrder_8629 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_8629)PARSER.parseFrom(data);
      }

      public static C2S_WarOrder_8629 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_8629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrder_8629 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_8629)PARSER.parseFrom(data);
      }

      public static C2S_WarOrder_8629 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrder_8629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrder_8629 parseFrom(InputStream input) throws IOException {
         return (C2S_WarOrder_8629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrder_8629 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrder_8629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrder_8629 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarOrder_8629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarOrder_8629 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrder_8629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrder_8629 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarOrder_8629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrder_8629 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrder_8629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarOrder_8629 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarOrder_8629 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarOrder_8629> parser() {
         return PARSER;
      }

      public Parser<C2S_WarOrder_8629> getParserForType() {
         return PARSER;
      }

      public C2S_WarOrder_8629 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarOrder_8629OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrder_8629.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_WarOrder_8629.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrder_8629_descriptor;
         }

         public C2S_WarOrder_8629 getDefaultInstanceForType() {
            return GiftMsg.C2S_WarOrder_8629.getDefaultInstance();
         }

         public C2S_WarOrder_8629 build() {
            C2S_WarOrder_8629 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarOrder_8629 buildPartial() {
            C2S_WarOrder_8629 result = new C2S_WarOrder_8629(this);
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
            if (other instanceof C2S_WarOrder_8629) {
               return this.mergeFrom((C2S_WarOrder_8629)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarOrder_8629 other) {
            if (other == GiftMsg.C2S_WarOrder_8629.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarOrder_8629 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarOrder_8629)GiftMsg.C2S_WarOrder_8629.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarOrder_8629)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

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

   public static final class S2C_WarOrder_8630 extends GeneratedMessageV3 implements S2C_WarOrder_8630OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int WARORDER_FIELD_NUMBER = 1;
      private List<WarOrderData> warOrder_;
      private byte memoizedIsInitialized;
      private static final S2C_WarOrder_8630 DEFAULT_INSTANCE = new S2C_WarOrder_8630();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarOrder_8630> PARSER = new AbstractParser<S2C_WarOrder_8630>() {
         public S2C_WarOrder_8630 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarOrder_8630(input, extensionRegistry);
         }
      };

      private S2C_WarOrder_8630(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarOrder_8630() {
         this.memoizedIsInitialized = -1;
         this.warOrder_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarOrder_8630();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarOrder_8630(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.warOrder_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.warOrder_.add(input.readMessage(GiftMsg.WarOrderData.PARSER, extensionRegistry));
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
                  this.warOrder_ = Collections.unmodifiableList(this.warOrder_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrder_8630.class, Builder.class);
      }

      public List<WarOrderData> getWarOrderList() {
         return this.warOrder_;
      }

      public List<? extends WarOrderDataOrBuilder> getWarOrderOrBuilderList() {
         return this.warOrder_;
      }

      public int getWarOrderCount() {
         return this.warOrder_.size();
      }

      public WarOrderData getWarOrder(int index) {
         return (WarOrderData)this.warOrder_.get(index);
      }

      public WarOrderDataOrBuilder getWarOrderOrBuilder(int index) {
         return (WarOrderDataOrBuilder)this.warOrder_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getWarOrderCount(); ++i) {
               if (!this.getWarOrder(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.warOrder_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.warOrder_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.warOrder_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.warOrder_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarOrder_8630)) {
            return super.equals(obj);
         } else {
            S2C_WarOrder_8630 other = (S2C_WarOrder_8630)obj;
            if (!this.getWarOrderList().equals(other.getWarOrderList())) {
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
            if (this.getWarOrderCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWarOrderList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarOrder_8630 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_8630)PARSER.parseFrom(data);
      }

      public static S2C_WarOrder_8630 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_8630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrder_8630 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_8630)PARSER.parseFrom(data);
      }

      public static S2C_WarOrder_8630 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_8630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrder_8630 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_8630)PARSER.parseFrom(data);
      }

      public static S2C_WarOrder_8630 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrder_8630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrder_8630 parseFrom(InputStream input) throws IOException {
         return (S2C_WarOrder_8630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrder_8630 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrder_8630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrder_8630 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarOrder_8630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarOrder_8630 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrder_8630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrder_8630 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarOrder_8630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrder_8630 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrder_8630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarOrder_8630 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarOrder_8630 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarOrder_8630> parser() {
         return PARSER;
      }

      public Parser<S2C_WarOrder_8630> getParserForType() {
         return PARSER;
      }

      public S2C_WarOrder_8630 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarOrder_8630OrBuilder {
         private int bitField0_;
         private List<WarOrderData> warOrder_;
         private RepeatedFieldBuilderV3<WarOrderData, WarOrderData.Builder, WarOrderDataOrBuilder> warOrderBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrder_8630.class, Builder.class);
         }

         private Builder() {
            this.warOrder_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.warOrder_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_WarOrder_8630.alwaysUseFieldBuilders) {
               this.getWarOrderFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.warOrderBuilder_ == null) {
               this.warOrder_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.warOrderBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrder_8630_descriptor;
         }

         public S2C_WarOrder_8630 getDefaultInstanceForType() {
            return GiftMsg.S2C_WarOrder_8630.getDefaultInstance();
         }

         public S2C_WarOrder_8630 build() {
            S2C_WarOrder_8630 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarOrder_8630 buildPartial() {
            S2C_WarOrder_8630 result = new S2C_WarOrder_8630(this);
            int from_bitField0_ = this.bitField0_;
            if (this.warOrderBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.warOrder_ = Collections.unmodifiableList(this.warOrder_);
                  this.bitField0_ &= -2;
               }

               result.warOrder_ = this.warOrder_;
            } else {
               result.warOrder_ = this.warOrderBuilder_.build();
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
            if (other instanceof S2C_WarOrder_8630) {
               return this.mergeFrom((S2C_WarOrder_8630)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarOrder_8630 other) {
            if (other == GiftMsg.S2C_WarOrder_8630.getDefaultInstance()) {
               return this;
            } else {
               if (this.warOrderBuilder_ == null) {
                  if (!other.warOrder_.isEmpty()) {
                     if (this.warOrder_.isEmpty()) {
                        this.warOrder_ = other.warOrder_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureWarOrderIsMutable();
                        this.warOrder_.addAll(other.warOrder_);
                     }

                     this.onChanged();
                  }
               } else if (!other.warOrder_.isEmpty()) {
                  if (this.warOrderBuilder_.isEmpty()) {
                     this.warOrderBuilder_.dispose();
                     this.warOrderBuilder_ = null;
                     this.warOrder_ = other.warOrder_;
                     this.bitField0_ &= -2;
                     this.warOrderBuilder_ = GiftMsg.S2C_WarOrder_8630.alwaysUseFieldBuilders ? this.getWarOrderFieldBuilder() : null;
                  } else {
                     this.warOrderBuilder_.addAllMessages(other.warOrder_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getWarOrderCount(); ++i) {
               if (!this.getWarOrder(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarOrder_8630 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarOrder_8630)GiftMsg.S2C_WarOrder_8630.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarOrder_8630)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureWarOrderIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.warOrder_ = new ArrayList(this.warOrder_);
               this.bitField0_ |= 1;
            }

         }

         public List<WarOrderData> getWarOrderList() {
            return this.warOrderBuilder_ == null ? Collections.unmodifiableList(this.warOrder_) : this.warOrderBuilder_.getMessageList();
         }

         public int getWarOrderCount() {
            return this.warOrderBuilder_ == null ? this.warOrder_.size() : this.warOrderBuilder_.getCount();
         }

         public WarOrderData getWarOrder(int index) {
            return this.warOrderBuilder_ == null ? (WarOrderData)this.warOrder_.get(index) : (WarOrderData)this.warOrderBuilder_.getMessage(index);
         }

         public Builder setWarOrder(int index, WarOrderData value) {
            if (this.warOrderBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWarOrderIsMutable();
               this.warOrder_.set(index, value);
               this.onChanged();
            } else {
               this.warOrderBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setWarOrder(int index, WarOrderData.Builder builderForValue) {
            if (this.warOrderBuilder_ == null) {
               this.ensureWarOrderIsMutable();
               this.warOrder_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.warOrderBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addWarOrder(WarOrderData value) {
            if (this.warOrderBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWarOrderIsMutable();
               this.warOrder_.add(value);
               this.onChanged();
            } else {
               this.warOrderBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addWarOrder(int index, WarOrderData value) {
            if (this.warOrderBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureWarOrderIsMutable();
               this.warOrder_.add(index, value);
               this.onChanged();
            } else {
               this.warOrderBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addWarOrder(WarOrderData.Builder builderForValue) {
            if (this.warOrderBuilder_ == null) {
               this.ensureWarOrderIsMutable();
               this.warOrder_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.warOrderBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addWarOrder(int index, WarOrderData.Builder builderForValue) {
            if (this.warOrderBuilder_ == null) {
               this.ensureWarOrderIsMutable();
               this.warOrder_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.warOrderBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllWarOrder(Iterable<? extends WarOrderData> values) {
            if (this.warOrderBuilder_ == null) {
               this.ensureWarOrderIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.warOrder_);
               this.onChanged();
            } else {
               this.warOrderBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearWarOrder() {
            if (this.warOrderBuilder_ == null) {
               this.warOrder_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.warOrderBuilder_.clear();
            }

            return this;
         }

         public Builder removeWarOrder(int index) {
            if (this.warOrderBuilder_ == null) {
               this.ensureWarOrderIsMutable();
               this.warOrder_.remove(index);
               this.onChanged();
            } else {
               this.warOrderBuilder_.remove(index);
            }

            return this;
         }

         public WarOrderData.Builder getWarOrderBuilder(int index) {
            return (WarOrderData.Builder)this.getWarOrderFieldBuilder().getBuilder(index);
         }

         public WarOrderDataOrBuilder getWarOrderOrBuilder(int index) {
            return this.warOrderBuilder_ == null ? (WarOrderDataOrBuilder)this.warOrder_.get(index) : (WarOrderDataOrBuilder)this.warOrderBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends WarOrderDataOrBuilder> getWarOrderOrBuilderList() {
            return this.warOrderBuilder_ != null ? this.warOrderBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.warOrder_);
         }

         public WarOrderData.Builder addWarOrderBuilder() {
            return (WarOrderData.Builder)this.getWarOrderFieldBuilder().addBuilder(GiftMsg.WarOrderData.getDefaultInstance());
         }

         public WarOrderData.Builder addWarOrderBuilder(int index) {
            return (WarOrderData.Builder)this.getWarOrderFieldBuilder().addBuilder(index, GiftMsg.WarOrderData.getDefaultInstance());
         }

         public List<WarOrderData.Builder> getWarOrderBuilderList() {
            return this.getWarOrderFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<WarOrderData, WarOrderData.Builder, WarOrderDataOrBuilder> getWarOrderFieldBuilder() {
            if (this.warOrderBuilder_ == null) {
               this.warOrderBuilder_ = new RepeatedFieldBuilderV3(this.warOrder_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.warOrder_ = null;
            }

            return this.warOrderBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarOrderReward_8631 extends GeneratedMessageV3 implements C2S_WarOrderReward_8631OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SYSTEM_FIELD_NUMBER = 1;
      private int system_;
      public static final int REWARD_FIELD_NUMBER = 2;
      private int reward_;
      private byte memoizedIsInitialized;
      private static final C2S_WarOrderReward_8631 DEFAULT_INSTANCE = new C2S_WarOrderReward_8631();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarOrderReward_8631> PARSER = new AbstractParser<C2S_WarOrderReward_8631>() {
         public C2S_WarOrderReward_8631 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarOrderReward_8631(input, extensionRegistry);
         }
      };

      private C2S_WarOrderReward_8631(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarOrderReward_8631() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarOrderReward_8631();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarOrderReward_8631(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.system_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.reward_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrderReward_8631.class, Builder.class);
      }

      public boolean hasSystem() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSystem() {
         return this.system_;
      }

      public boolean hasReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getReward() {
         return this.reward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSystem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.system_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.reward_);
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
               size += CodedOutputStream.computeInt32Size(1, this.system_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.reward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarOrderReward_8631)) {
            return super.equals(obj);
         } else {
            C2S_WarOrderReward_8631 other = (C2S_WarOrderReward_8631)obj;
            if (this.hasSystem() != other.hasSystem()) {
               return false;
            } else if (this.hasSystem() && this.getSystem() != other.getSystem()) {
               return false;
            } else if (this.hasReward() != other.hasReward()) {
               return false;
            } else if (this.hasReward() && this.getReward() != other.getReward()) {
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
            if (this.hasSystem()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSystem();
            }

            if (this.hasReward()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getReward();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarOrderReward_8631 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderReward_8631)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderReward_8631 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderReward_8631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderReward_8631 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderReward_8631)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderReward_8631 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderReward_8631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderReward_8631 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderReward_8631)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderReward_8631 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderReward_8631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderReward_8631 parseFrom(InputStream input) throws IOException {
         return (C2S_WarOrderReward_8631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrderReward_8631 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderReward_8631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrderReward_8631 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarOrderReward_8631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarOrderReward_8631 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderReward_8631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrderReward_8631 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarOrderReward_8631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrderReward_8631 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderReward_8631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarOrderReward_8631 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarOrderReward_8631 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarOrderReward_8631> parser() {
         return PARSER;
      }

      public Parser<C2S_WarOrderReward_8631> getParserForType() {
         return PARSER;
      }

      public C2S_WarOrderReward_8631 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarOrderReward_8631OrBuilder {
         private int bitField0_;
         private int system_;
         private int reward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrderReward_8631.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_WarOrderReward_8631.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.system_ = 0;
            this.bitField0_ &= -2;
            this.reward_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderReward_8631_descriptor;
         }

         public C2S_WarOrderReward_8631 getDefaultInstanceForType() {
            return GiftMsg.C2S_WarOrderReward_8631.getDefaultInstance();
         }

         public C2S_WarOrderReward_8631 build() {
            C2S_WarOrderReward_8631 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarOrderReward_8631 buildPartial() {
            C2S_WarOrderReward_8631 result = new C2S_WarOrderReward_8631(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.system_ = this.system_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.reward_ = this.reward_;
               to_bitField0_ |= 2;
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
            if (other instanceof C2S_WarOrderReward_8631) {
               return this.mergeFrom((C2S_WarOrderReward_8631)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarOrderReward_8631 other) {
            if (other == GiftMsg.C2S_WarOrderReward_8631.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSystem()) {
                  this.setSystem(other.getSystem());
               }

               if (other.hasReward()) {
                  this.setReward(other.getReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSystem()) {
               return false;
            } else {
               return this.hasReward();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarOrderReward_8631 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarOrderReward_8631)GiftMsg.C2S_WarOrderReward_8631.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarOrderReward_8631)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSystem() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSystem() {
            return this.system_;
         }

         public Builder setSystem(int value) {
            this.bitField0_ |= 1;
            this.system_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSystem() {
            this.bitField0_ &= -2;
            this.system_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasReward() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getReward() {
            return this.reward_;
         }

         public Builder setReward(int value) {
            this.bitField0_ |= 2;
            this.reward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReward() {
            this.bitField0_ &= -3;
            this.reward_ = 0;
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

   public static final class S2C_WarOrderReward_8632 extends GeneratedMessageV3 implements S2C_WarOrderReward_8632OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WARORDER_FIELD_NUMBER = 1;
      private WarOrderData warOrder_;
      private byte memoizedIsInitialized;
      private static final S2C_WarOrderReward_8632 DEFAULT_INSTANCE = new S2C_WarOrderReward_8632();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarOrderReward_8632> PARSER = new AbstractParser<S2C_WarOrderReward_8632>() {
         public S2C_WarOrderReward_8632 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarOrderReward_8632(input, extensionRegistry);
         }
      };

      private S2C_WarOrderReward_8632(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarOrderReward_8632() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarOrderReward_8632();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarOrderReward_8632(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WarOrderData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.warOrder_.toBuilder();
                        }

                        this.warOrder_ = (WarOrderData)input.readMessage(GiftMsg.WarOrderData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.warOrder_);
                           this.warOrder_ = subBuilder.buildPartial();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderReward_8632.class, Builder.class);
      }

      public boolean hasWarOrder() {
         return (this.bitField0_ & 1) != 0;
      }

      public WarOrderData getWarOrder() {
         return this.warOrder_ == null ? GiftMsg.WarOrderData.getDefaultInstance() : this.warOrder_;
      }

      public WarOrderDataOrBuilder getWarOrderOrBuilder() {
         return this.warOrder_ == null ? GiftMsg.WarOrderData.getDefaultInstance() : this.warOrder_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWarOrder()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getWarOrder().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getWarOrder());
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
               size += CodedOutputStream.computeMessageSize(1, this.getWarOrder());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarOrderReward_8632)) {
            return super.equals(obj);
         } else {
            S2C_WarOrderReward_8632 other = (S2C_WarOrderReward_8632)obj;
            if (this.hasWarOrder() != other.hasWarOrder()) {
               return false;
            } else if (this.hasWarOrder() && !this.getWarOrder().equals(other.getWarOrder())) {
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
            if (this.hasWarOrder()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWarOrder().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarOrderReward_8632 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderReward_8632)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderReward_8632 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderReward_8632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderReward_8632 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderReward_8632)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderReward_8632 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderReward_8632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderReward_8632 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderReward_8632)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderReward_8632 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderReward_8632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderReward_8632 parseFrom(InputStream input) throws IOException {
         return (S2C_WarOrderReward_8632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderReward_8632 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderReward_8632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderReward_8632 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarOrderReward_8632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarOrderReward_8632 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderReward_8632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderReward_8632 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarOrderReward_8632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderReward_8632 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderReward_8632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarOrderReward_8632 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarOrderReward_8632 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarOrderReward_8632> parser() {
         return PARSER;
      }

      public Parser<S2C_WarOrderReward_8632> getParserForType() {
         return PARSER;
      }

      public S2C_WarOrderReward_8632 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarOrderReward_8632OrBuilder {
         private int bitField0_;
         private WarOrderData warOrder_;
         private SingleFieldBuilderV3<WarOrderData, WarOrderData.Builder, WarOrderDataOrBuilder> warOrderBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderReward_8632.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_WarOrderReward_8632.alwaysUseFieldBuilders) {
               this.getWarOrderFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.warOrderBuilder_ == null) {
               this.warOrder_ = null;
            } else {
               this.warOrderBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderReward_8632_descriptor;
         }

         public S2C_WarOrderReward_8632 getDefaultInstanceForType() {
            return GiftMsg.S2C_WarOrderReward_8632.getDefaultInstance();
         }

         public S2C_WarOrderReward_8632 build() {
            S2C_WarOrderReward_8632 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarOrderReward_8632 buildPartial() {
            S2C_WarOrderReward_8632 result = new S2C_WarOrderReward_8632(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.warOrderBuilder_ == null) {
                  result.warOrder_ = this.warOrder_;
               } else {
                  result.warOrder_ = (WarOrderData)this.warOrderBuilder_.build();
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
            if (other instanceof S2C_WarOrderReward_8632) {
               return this.mergeFrom((S2C_WarOrderReward_8632)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarOrderReward_8632 other) {
            if (other == GiftMsg.S2C_WarOrderReward_8632.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWarOrder()) {
                  this.mergeWarOrder(other.getWarOrder());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWarOrder()) {
               return false;
            } else {
               return this.getWarOrder().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarOrderReward_8632 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarOrderReward_8632)GiftMsg.S2C_WarOrderReward_8632.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarOrderReward_8632)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWarOrder() {
            return (this.bitField0_ & 1) != 0;
         }

         public WarOrderData getWarOrder() {
            if (this.warOrderBuilder_ == null) {
               return this.warOrder_ == null ? GiftMsg.WarOrderData.getDefaultInstance() : this.warOrder_;
            } else {
               return (WarOrderData)this.warOrderBuilder_.getMessage();
            }
         }

         public Builder setWarOrder(WarOrderData value) {
            if (this.warOrderBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.warOrder_ = value;
               this.onChanged();
            } else {
               this.warOrderBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setWarOrder(WarOrderData.Builder builderForValue) {
            if (this.warOrderBuilder_ == null) {
               this.warOrder_ = builderForValue.build();
               this.onChanged();
            } else {
               this.warOrderBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeWarOrder(WarOrderData value) {
            if (this.warOrderBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.warOrder_ != null && this.warOrder_ != GiftMsg.WarOrderData.getDefaultInstance()) {
                  this.warOrder_ = GiftMsg.WarOrderData.newBuilder(this.warOrder_).mergeFrom(value).buildPartial();
               } else {
                  this.warOrder_ = value;
               }

               this.onChanged();
            } else {
               this.warOrderBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearWarOrder() {
            if (this.warOrderBuilder_ == null) {
               this.warOrder_ = null;
               this.onChanged();
            } else {
               this.warOrderBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WarOrderData.Builder getWarOrderBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WarOrderData.Builder)this.getWarOrderFieldBuilder().getBuilder();
         }

         public WarOrderDataOrBuilder getWarOrderOrBuilder() {
            if (this.warOrderBuilder_ != null) {
               return (WarOrderDataOrBuilder)this.warOrderBuilder_.getMessageOrBuilder();
            } else {
               return this.warOrder_ == null ? GiftMsg.WarOrderData.getDefaultInstance() : this.warOrder_;
            }
         }

         private SingleFieldBuilderV3<WarOrderData, WarOrderData.Builder, WarOrderDataOrBuilder> getWarOrderFieldBuilder() {
            if (this.warOrderBuilder_ == null) {
               this.warOrderBuilder_ = new SingleFieldBuilderV3(this.getWarOrder(), this.getParentForChildren(), this.isClean());
               this.warOrder_ = null;
            }

            return this.warOrderBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WarOrderOneKeyReward_8633 extends GeneratedMessageV3 implements C2S_WarOrderOneKeyReward_8633OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SYSTEM_FIELD_NUMBER = 1;
      private int system_;
      public static final int STAGETYPE_FIELD_NUMBER = 2;
      private int stageType_;
      private byte memoizedIsInitialized;
      private static final C2S_WarOrderOneKeyReward_8633 DEFAULT_INSTANCE = new C2S_WarOrderOneKeyReward_8633();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarOrderOneKeyReward_8633> PARSER = new AbstractParser<C2S_WarOrderOneKeyReward_8633>() {
         public C2S_WarOrderOneKeyReward_8633 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarOrderOneKeyReward_8633(input, extensionRegistry);
         }
      };

      private C2S_WarOrderOneKeyReward_8633(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarOrderOneKeyReward_8633() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarOrderOneKeyReward_8633();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarOrderOneKeyReward_8633(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.system_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stageType_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrderOneKeyReward_8633.class, Builder.class);
      }

      public boolean hasSystem() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSystem() {
         return this.system_;
      }

      public boolean hasStageType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStageType() {
         return this.stageType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSystem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.system_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stageType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.system_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stageType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WarOrderOneKeyReward_8633)) {
            return super.equals(obj);
         } else {
            C2S_WarOrderOneKeyReward_8633 other = (C2S_WarOrderOneKeyReward_8633)obj;
            if (this.hasSystem() != other.hasSystem()) {
               return false;
            } else if (this.hasSystem() && this.getSystem() != other.getSystem()) {
               return false;
            } else if (this.hasStageType() != other.hasStageType()) {
               return false;
            } else if (this.hasStageType() && this.getStageType() != other.getStageType()) {
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
            if (this.hasSystem()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSystem();
            }

            if (this.hasStageType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderOneKeyReward_8633)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderOneKeyReward_8633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderOneKeyReward_8633)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderOneKeyReward_8633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarOrderOneKeyReward_8633)PARSER.parseFrom(data);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarOrderOneKeyReward_8633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(InputStream input) throws IOException {
         return (C2S_WarOrderOneKeyReward_8633)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderOneKeyReward_8633)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarOrderOneKeyReward_8633)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderOneKeyReward_8633)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarOrderOneKeyReward_8633)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarOrderOneKeyReward_8633 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarOrderOneKeyReward_8633)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarOrderOneKeyReward_8633 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarOrderOneKeyReward_8633 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarOrderOneKeyReward_8633> parser() {
         return PARSER;
      }

      public Parser<C2S_WarOrderOneKeyReward_8633> getParserForType() {
         return PARSER;
      }

      public C2S_WarOrderOneKeyReward_8633 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarOrderOneKeyReward_8633OrBuilder {
         private int bitField0_;
         private int system_;
         private int stageType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarOrderOneKeyReward_8633.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_WarOrderOneKeyReward_8633.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.system_ = 0;
            this.bitField0_ &= -2;
            this.stageType_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_WarOrderOneKeyReward_8633_descriptor;
         }

         public C2S_WarOrderOneKeyReward_8633 getDefaultInstanceForType() {
            return GiftMsg.C2S_WarOrderOneKeyReward_8633.getDefaultInstance();
         }

         public C2S_WarOrderOneKeyReward_8633 build() {
            C2S_WarOrderOneKeyReward_8633 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarOrderOneKeyReward_8633 buildPartial() {
            C2S_WarOrderOneKeyReward_8633 result = new C2S_WarOrderOneKeyReward_8633(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.system_ = this.system_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stageType_ = this.stageType_;
               to_bitField0_ |= 2;
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
            if (other instanceof C2S_WarOrderOneKeyReward_8633) {
               return this.mergeFrom((C2S_WarOrderOneKeyReward_8633)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarOrderOneKeyReward_8633 other) {
            if (other == GiftMsg.C2S_WarOrderOneKeyReward_8633.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSystem()) {
                  this.setSystem(other.getSystem());
               }

               if (other.hasStageType()) {
                  this.setStageType(other.getStageType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSystem()) {
               return false;
            } else {
               return this.hasStageType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WarOrderOneKeyReward_8633 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarOrderOneKeyReward_8633)GiftMsg.C2S_WarOrderOneKeyReward_8633.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarOrderOneKeyReward_8633)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSystem() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSystem() {
            return this.system_;
         }

         public Builder setSystem(int value) {
            this.bitField0_ |= 1;
            this.system_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSystem() {
            this.bitField0_ &= -2;
            this.system_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStageType() {
            return this.stageType_;
         }

         public Builder setStageType(int value) {
            this.bitField0_ |= 2;
            this.stageType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageType() {
            this.bitField0_ &= -3;
            this.stageType_ = 0;
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

   public static final class S2C_WarOrderOneKeyReward_8634 extends GeneratedMessageV3 implements S2C_WarOrderOneKeyReward_8634OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WARORDER_FIELD_NUMBER = 1;
      private WarOrderData warOrder_;
      public static final int STAGETYPE_FIELD_NUMBER = 2;
      private int stageType_;
      private byte memoizedIsInitialized;
      private static final S2C_WarOrderOneKeyReward_8634 DEFAULT_INSTANCE = new S2C_WarOrderOneKeyReward_8634();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarOrderOneKeyReward_8634> PARSER = new AbstractParser<S2C_WarOrderOneKeyReward_8634>() {
         public S2C_WarOrderOneKeyReward_8634 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarOrderOneKeyReward_8634(input, extensionRegistry);
         }
      };

      private S2C_WarOrderOneKeyReward_8634(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarOrderOneKeyReward_8634() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarOrderOneKeyReward_8634();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarOrderOneKeyReward_8634(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        WarOrderData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.warOrder_.toBuilder();
                        }

                        this.warOrder_ = (WarOrderData)input.readMessage(GiftMsg.WarOrderData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.warOrder_);
                           this.warOrder_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stageType_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderOneKeyReward_8634.class, Builder.class);
      }

      public boolean hasWarOrder() {
         return (this.bitField0_ & 1) != 0;
      }

      public WarOrderData getWarOrder() {
         return this.warOrder_ == null ? GiftMsg.WarOrderData.getDefaultInstance() : this.warOrder_;
      }

      public WarOrderDataOrBuilder getWarOrderOrBuilder() {
         return this.warOrder_ == null ? GiftMsg.WarOrderData.getDefaultInstance() : this.warOrder_;
      }

      public boolean hasStageType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStageType() {
         return this.stageType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWarOrder()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getWarOrder().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getWarOrder());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stageType_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getWarOrder());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stageType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarOrderOneKeyReward_8634)) {
            return super.equals(obj);
         } else {
            S2C_WarOrderOneKeyReward_8634 other = (S2C_WarOrderOneKeyReward_8634)obj;
            if (this.hasWarOrder() != other.hasWarOrder()) {
               return false;
            } else if (this.hasWarOrder() && !this.getWarOrder().equals(other.getWarOrder())) {
               return false;
            } else if (this.hasStageType() != other.hasStageType()) {
               return false;
            } else if (this.hasStageType() && this.getStageType() != other.getStageType()) {
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
            if (this.hasWarOrder()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWarOrder().hashCode();
            }

            if (this.hasStageType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderOneKeyReward_8634)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderOneKeyReward_8634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderOneKeyReward_8634)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderOneKeyReward_8634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarOrderOneKeyReward_8634)PARSER.parseFrom(data);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarOrderOneKeyReward_8634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(InputStream input) throws IOException {
         return (S2C_WarOrderOneKeyReward_8634)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderOneKeyReward_8634)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarOrderOneKeyReward_8634)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderOneKeyReward_8634)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarOrderOneKeyReward_8634)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarOrderOneKeyReward_8634 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarOrderOneKeyReward_8634)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarOrderOneKeyReward_8634 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarOrderOneKeyReward_8634 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarOrderOneKeyReward_8634> parser() {
         return PARSER;
      }

      public Parser<S2C_WarOrderOneKeyReward_8634> getParserForType() {
         return PARSER;
      }

      public S2C_WarOrderOneKeyReward_8634 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarOrderOneKeyReward_8634OrBuilder {
         private int bitField0_;
         private WarOrderData warOrder_;
         private SingleFieldBuilderV3<WarOrderData, WarOrderData.Builder, WarOrderDataOrBuilder> warOrderBuilder_;
         private int stageType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarOrderOneKeyReward_8634.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_WarOrderOneKeyReward_8634.alwaysUseFieldBuilders) {
               this.getWarOrderFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.warOrderBuilder_ == null) {
               this.warOrder_ = null;
            } else {
               this.warOrderBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.stageType_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_WarOrderOneKeyReward_8634_descriptor;
         }

         public S2C_WarOrderOneKeyReward_8634 getDefaultInstanceForType() {
            return GiftMsg.S2C_WarOrderOneKeyReward_8634.getDefaultInstance();
         }

         public S2C_WarOrderOneKeyReward_8634 build() {
            S2C_WarOrderOneKeyReward_8634 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarOrderOneKeyReward_8634 buildPartial() {
            S2C_WarOrderOneKeyReward_8634 result = new S2C_WarOrderOneKeyReward_8634(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.warOrderBuilder_ == null) {
                  result.warOrder_ = this.warOrder_;
               } else {
                  result.warOrder_ = (WarOrderData)this.warOrderBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stageType_ = this.stageType_;
               to_bitField0_ |= 2;
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
            if (other instanceof S2C_WarOrderOneKeyReward_8634) {
               return this.mergeFrom((S2C_WarOrderOneKeyReward_8634)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarOrderOneKeyReward_8634 other) {
            if (other == GiftMsg.S2C_WarOrderOneKeyReward_8634.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWarOrder()) {
                  this.mergeWarOrder(other.getWarOrder());
               }

               if (other.hasStageType()) {
                  this.setStageType(other.getStageType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWarOrder()) {
               return false;
            } else if (!this.hasStageType()) {
               return false;
            } else {
               return this.getWarOrder().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarOrderOneKeyReward_8634 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarOrderOneKeyReward_8634)GiftMsg.S2C_WarOrderOneKeyReward_8634.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarOrderOneKeyReward_8634)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWarOrder() {
            return (this.bitField0_ & 1) != 0;
         }

         public WarOrderData getWarOrder() {
            if (this.warOrderBuilder_ == null) {
               return this.warOrder_ == null ? GiftMsg.WarOrderData.getDefaultInstance() : this.warOrder_;
            } else {
               return (WarOrderData)this.warOrderBuilder_.getMessage();
            }
         }

         public Builder setWarOrder(WarOrderData value) {
            if (this.warOrderBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.warOrder_ = value;
               this.onChanged();
            } else {
               this.warOrderBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setWarOrder(WarOrderData.Builder builderForValue) {
            if (this.warOrderBuilder_ == null) {
               this.warOrder_ = builderForValue.build();
               this.onChanged();
            } else {
               this.warOrderBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeWarOrder(WarOrderData value) {
            if (this.warOrderBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.warOrder_ != null && this.warOrder_ != GiftMsg.WarOrderData.getDefaultInstance()) {
                  this.warOrder_ = GiftMsg.WarOrderData.newBuilder(this.warOrder_).mergeFrom(value).buildPartial();
               } else {
                  this.warOrder_ = value;
               }

               this.onChanged();
            } else {
               this.warOrderBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearWarOrder() {
            if (this.warOrderBuilder_ == null) {
               this.warOrder_ = null;
               this.onChanged();
            } else {
               this.warOrderBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WarOrderData.Builder getWarOrderBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WarOrderData.Builder)this.getWarOrderFieldBuilder().getBuilder();
         }

         public WarOrderDataOrBuilder getWarOrderOrBuilder() {
            if (this.warOrderBuilder_ != null) {
               return (WarOrderDataOrBuilder)this.warOrderBuilder_.getMessageOrBuilder();
            } else {
               return this.warOrder_ == null ? GiftMsg.WarOrderData.getDefaultInstance() : this.warOrder_;
            }
         }

         private SingleFieldBuilderV3<WarOrderData, WarOrderData.Builder, WarOrderDataOrBuilder> getWarOrderFieldBuilder() {
            if (this.warOrderBuilder_ == null) {
               this.warOrderBuilder_ = new SingleFieldBuilderV3(this.getWarOrder(), this.getParentForChildren(), this.isClean());
               this.warOrder_ = null;
            }

            return this.warOrderBuilder_;
         }

         public boolean hasStageType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStageType() {
            return this.stageType_;
         }

         public Builder setStageType(int value) {
            this.bitField0_ |= 2;
            this.stageType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageType() {
            this.bitField0_ &= -3;
            this.stageType_ = 0;
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

   public static final class C2S_SpecialWeeklyCardReward_8635 extends GeneratedMessageV3 implements C2S_SpecialWeeklyCardReward_8635OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTID_FIELD_NUMBER = 1;
      private int giftId_;
      public static final int DAY_FIELD_NUMBER = 2;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_SpecialWeeklyCardReward_8635 DEFAULT_INSTANCE = new C2S_SpecialWeeklyCardReward_8635();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SpecialWeeklyCardReward_8635> PARSER = new AbstractParser<C2S_SpecialWeeklyCardReward_8635>() {
         public C2S_SpecialWeeklyCardReward_8635 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SpecialWeeklyCardReward_8635(input, extensionRegistry);
         }
      };

      private C2S_SpecialWeeklyCardReward_8635(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SpecialWeeklyCardReward_8635() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SpecialWeeklyCardReward_8635();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SpecialWeeklyCardReward_8635(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.giftId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.day_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpecialWeeklyCardReward_8635.class, Builder.class);
      }

      public boolean hasGiftId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGiftId() {
         return this.giftId_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGiftId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.giftId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.giftId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SpecialWeeklyCardReward_8635)) {
            return super.equals(obj);
         } else {
            C2S_SpecialWeeklyCardReward_8635 other = (C2S_SpecialWeeklyCardReward_8635)obj;
            if (this.hasGiftId() != other.hasGiftId()) {
               return false;
            } else if (this.hasGiftId() && this.getGiftId() != other.getGiftId()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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
            if (this.hasGiftId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftId();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardReward_8635)PARSER.parseFrom(data);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardReward_8635)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardReward_8635)PARSER.parseFrom(data);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardReward_8635)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardReward_8635)PARSER.parseFrom(data);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardReward_8635)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(InputStream input) throws IOException {
         return (C2S_SpecialWeeklyCardReward_8635)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpecialWeeklyCardReward_8635)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SpecialWeeklyCardReward_8635)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpecialWeeklyCardReward_8635)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SpecialWeeklyCardReward_8635)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpecialWeeklyCardReward_8635 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpecialWeeklyCardReward_8635)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SpecialWeeklyCardReward_8635 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SpecialWeeklyCardReward_8635 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SpecialWeeklyCardReward_8635> parser() {
         return PARSER;
      }

      public Parser<C2S_SpecialWeeklyCardReward_8635> getParserForType() {
         return PARSER;
      }

      public C2S_SpecialWeeklyCardReward_8635 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SpecialWeeklyCardReward_8635OrBuilder {
         private int bitField0_;
         private int giftId_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpecialWeeklyCardReward_8635.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_SpecialWeeklyCardReward_8635.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giftId_ = 0;
            this.bitField0_ &= -2;
            this.day_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardReward_8635_descriptor;
         }

         public C2S_SpecialWeeklyCardReward_8635 getDefaultInstanceForType() {
            return GiftMsg.C2S_SpecialWeeklyCardReward_8635.getDefaultInstance();
         }

         public C2S_SpecialWeeklyCardReward_8635 build() {
            C2S_SpecialWeeklyCardReward_8635 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SpecialWeeklyCardReward_8635 buildPartial() {
            C2S_SpecialWeeklyCardReward_8635 result = new C2S_SpecialWeeklyCardReward_8635(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.giftId_ = this.giftId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 2;
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
            if (other instanceof C2S_SpecialWeeklyCardReward_8635) {
               return this.mergeFrom((C2S_SpecialWeeklyCardReward_8635)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SpecialWeeklyCardReward_8635 other) {
            if (other == GiftMsg.C2S_SpecialWeeklyCardReward_8635.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGiftId()) {
                  this.setGiftId(other.getGiftId());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGiftId()) {
               return false;
            } else {
               return this.hasDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SpecialWeeklyCardReward_8635 parsedMessage = null;

            try {
               parsedMessage = (C2S_SpecialWeeklyCardReward_8635)GiftMsg.C2S_SpecialWeeklyCardReward_8635.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SpecialWeeklyCardReward_8635)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGiftId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGiftId() {
            return this.giftId_;
         }

         public Builder setGiftId(int value) {
            this.bitField0_ |= 1;
            this.giftId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiftId() {
            this.bitField0_ &= -2;
            this.giftId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 2;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -3;
            this.day_ = 0;
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

   public static final class S2C_SpecialWeeklyCardReward_8636 extends GeneratedMessageV3 implements S2C_SpecialWeeklyCardReward_8636OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GIFTID_FIELD_NUMBER = 1;
      private int giftId_;
      public static final int DAY_FIELD_NUMBER = 2;
      private int day_;
      private byte memoizedIsInitialized;
      private static final S2C_SpecialWeeklyCardReward_8636 DEFAULT_INSTANCE = new S2C_SpecialWeeklyCardReward_8636();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SpecialWeeklyCardReward_8636> PARSER = new AbstractParser<S2C_SpecialWeeklyCardReward_8636>() {
         public S2C_SpecialWeeklyCardReward_8636 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SpecialWeeklyCardReward_8636(input, extensionRegistry);
         }
      };

      private S2C_SpecialWeeklyCardReward_8636(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SpecialWeeklyCardReward_8636() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SpecialWeeklyCardReward_8636();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SpecialWeeklyCardReward_8636(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.giftId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.day_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpecialWeeklyCardReward_8636.class, Builder.class);
      }

      public boolean hasGiftId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGiftId() {
         return this.giftId_;
      }

      public boolean hasDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDay() {
         return this.day_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGiftId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.giftId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.giftId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SpecialWeeklyCardReward_8636)) {
            return super.equals(obj);
         } else {
            S2C_SpecialWeeklyCardReward_8636 other = (S2C_SpecialWeeklyCardReward_8636)obj;
            if (this.hasGiftId() != other.hasGiftId()) {
               return false;
            } else if (this.hasGiftId() && this.getGiftId() != other.getGiftId()) {
               return false;
            } else if (this.hasDay() != other.hasDay()) {
               return false;
            } else if (this.hasDay() && this.getDay() != other.getDay()) {
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
            if (this.hasGiftId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGiftId();
            }

            if (this.hasDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardReward_8636)PARSER.parseFrom(data);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardReward_8636)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardReward_8636)PARSER.parseFrom(data);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardReward_8636)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardReward_8636)PARSER.parseFrom(data);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardReward_8636)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(InputStream input) throws IOException {
         return (S2C_SpecialWeeklyCardReward_8636)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialWeeklyCardReward_8636)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SpecialWeeklyCardReward_8636)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialWeeklyCardReward_8636)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SpecialWeeklyCardReward_8636)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpecialWeeklyCardReward_8636 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialWeeklyCardReward_8636)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SpecialWeeklyCardReward_8636 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SpecialWeeklyCardReward_8636 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SpecialWeeklyCardReward_8636> parser() {
         return PARSER;
      }

      public Parser<S2C_SpecialWeeklyCardReward_8636> getParserForType() {
         return PARSER;
      }

      public S2C_SpecialWeeklyCardReward_8636 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SpecialWeeklyCardReward_8636OrBuilder {
         private int bitField0_;
         private int giftId_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpecialWeeklyCardReward_8636.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_SpecialWeeklyCardReward_8636.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.giftId_ = 0;
            this.bitField0_ &= -2;
            this.day_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardReward_8636_descriptor;
         }

         public S2C_SpecialWeeklyCardReward_8636 getDefaultInstanceForType() {
            return GiftMsg.S2C_SpecialWeeklyCardReward_8636.getDefaultInstance();
         }

         public S2C_SpecialWeeklyCardReward_8636 build() {
            S2C_SpecialWeeklyCardReward_8636 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SpecialWeeklyCardReward_8636 buildPartial() {
            S2C_SpecialWeeklyCardReward_8636 result = new S2C_SpecialWeeklyCardReward_8636(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.giftId_ = this.giftId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.day_ = this.day_;
               to_bitField0_ |= 2;
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
            if (other instanceof S2C_SpecialWeeklyCardReward_8636) {
               return this.mergeFrom((S2C_SpecialWeeklyCardReward_8636)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SpecialWeeklyCardReward_8636 other) {
            if (other == GiftMsg.S2C_SpecialWeeklyCardReward_8636.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGiftId()) {
                  this.setGiftId(other.getGiftId());
               }

               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGiftId()) {
               return false;
            } else {
               return this.hasDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SpecialWeeklyCardReward_8636 parsedMessage = null;

            try {
               parsedMessage = (S2C_SpecialWeeklyCardReward_8636)GiftMsg.S2C_SpecialWeeklyCardReward_8636.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SpecialWeeklyCardReward_8636)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGiftId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGiftId() {
            return this.giftId_;
         }

         public Builder setGiftId(int value) {
            this.bitField0_ |= 1;
            this.giftId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiftId() {
            this.bitField0_ &= -2;
            this.giftId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 2;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -3;
            this.day_ = 0;
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

   public static final class C2S_SpecialWeeklyCardPointReward_8637 extends GeneratedMessageV3 implements C2S_SpecialWeeklyCardPointReward_8637OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int AWARDID_FIELD_NUMBER = 1;
      private int awardId_;
      private byte memoizedIsInitialized;
      private static final C2S_SpecialWeeklyCardPointReward_8637 DEFAULT_INSTANCE = new C2S_SpecialWeeklyCardPointReward_8637();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SpecialWeeklyCardPointReward_8637> PARSER = new AbstractParser<C2S_SpecialWeeklyCardPointReward_8637>() {
         public C2S_SpecialWeeklyCardPointReward_8637 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SpecialWeeklyCardPointReward_8637(input, extensionRegistry);
         }
      };

      private C2S_SpecialWeeklyCardPointReward_8637(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SpecialWeeklyCardPointReward_8637() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SpecialWeeklyCardPointReward_8637();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SpecialWeeklyCardPointReward_8637(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.awardId_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpecialWeeklyCardPointReward_8637.class, Builder.class);
      }

      public boolean hasAwardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAwardId() {
         return this.awardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAwardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.awardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.awardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SpecialWeeklyCardPointReward_8637)) {
            return super.equals(obj);
         } else {
            C2S_SpecialWeeklyCardPointReward_8637 other = (C2S_SpecialWeeklyCardPointReward_8637)obj;
            if (this.hasAwardId() != other.hasAwardId()) {
               return false;
            } else if (this.hasAwardId() && this.getAwardId() != other.getAwardId()) {
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
            if (this.hasAwardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAwardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardPointReward_8637)PARSER.parseFrom(data);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardPointReward_8637)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardPointReward_8637)PARSER.parseFrom(data);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardPointReward_8637)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardPointReward_8637)PARSER.parseFrom(data);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SpecialWeeklyCardPointReward_8637)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(InputStream input) throws IOException {
         return (C2S_SpecialWeeklyCardPointReward_8637)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpecialWeeklyCardPointReward_8637)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SpecialWeeklyCardPointReward_8637)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpecialWeeklyCardPointReward_8637)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SpecialWeeklyCardPointReward_8637)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SpecialWeeklyCardPointReward_8637)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SpecialWeeklyCardPointReward_8637 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SpecialWeeklyCardPointReward_8637 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SpecialWeeklyCardPointReward_8637> parser() {
         return PARSER;
      }

      public Parser<C2S_SpecialWeeklyCardPointReward_8637> getParserForType() {
         return PARSER;
      }

      public C2S_SpecialWeeklyCardPointReward_8637 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SpecialWeeklyCardPointReward_8637OrBuilder {
         private int bitField0_;
         private int awardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SpecialWeeklyCardPointReward_8637.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_SpecialWeeklyCardPointReward_8637.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.awardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_SpecialWeeklyCardPointReward_8637_descriptor;
         }

         public C2S_SpecialWeeklyCardPointReward_8637 getDefaultInstanceForType() {
            return GiftMsg.C2S_SpecialWeeklyCardPointReward_8637.getDefaultInstance();
         }

         public C2S_SpecialWeeklyCardPointReward_8637 build() {
            C2S_SpecialWeeklyCardPointReward_8637 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SpecialWeeklyCardPointReward_8637 buildPartial() {
            C2S_SpecialWeeklyCardPointReward_8637 result = new C2S_SpecialWeeklyCardPointReward_8637(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.awardId_ = this.awardId_;
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
            if (other instanceof C2S_SpecialWeeklyCardPointReward_8637) {
               return this.mergeFrom((C2S_SpecialWeeklyCardPointReward_8637)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SpecialWeeklyCardPointReward_8637 other) {
            if (other == GiftMsg.C2S_SpecialWeeklyCardPointReward_8637.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAwardId()) {
                  this.setAwardId(other.getAwardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasAwardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SpecialWeeklyCardPointReward_8637 parsedMessage = null;

            try {
               parsedMessage = (C2S_SpecialWeeklyCardPointReward_8637)GiftMsg.C2S_SpecialWeeklyCardPointReward_8637.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SpecialWeeklyCardPointReward_8637)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAwardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAwardId() {
            return this.awardId_;
         }

         public Builder setAwardId(int value) {
            this.bitField0_ |= 1;
            this.awardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAwardId() {
            this.bitField0_ &= -2;
            this.awardId_ = 0;
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

   public static final class S2C_SpecialWeeklyCardPointReward_8638 extends GeneratedMessageV3 implements S2C_SpecialWeeklyCardPointReward_8638OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int AWARDID_FIELD_NUMBER = 1;
      private int awardId_;
      private byte memoizedIsInitialized;
      private static final S2C_SpecialWeeklyCardPointReward_8638 DEFAULT_INSTANCE = new S2C_SpecialWeeklyCardPointReward_8638();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SpecialWeeklyCardPointReward_8638> PARSER = new AbstractParser<S2C_SpecialWeeklyCardPointReward_8638>() {
         public S2C_SpecialWeeklyCardPointReward_8638 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SpecialWeeklyCardPointReward_8638(input, extensionRegistry);
         }
      };

      private S2C_SpecialWeeklyCardPointReward_8638(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SpecialWeeklyCardPointReward_8638() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SpecialWeeklyCardPointReward_8638();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SpecialWeeklyCardPointReward_8638(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.awardId_ = input.readInt32();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpecialWeeklyCardPointReward_8638.class, Builder.class);
      }

      public boolean hasAwardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAwardId() {
         return this.awardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAwardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.awardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.awardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SpecialWeeklyCardPointReward_8638)) {
            return super.equals(obj);
         } else {
            S2C_SpecialWeeklyCardPointReward_8638 other = (S2C_SpecialWeeklyCardPointReward_8638)obj;
            if (this.hasAwardId() != other.hasAwardId()) {
               return false;
            } else if (this.hasAwardId() && this.getAwardId() != other.getAwardId()) {
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
            if (this.hasAwardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAwardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardPointReward_8638)PARSER.parseFrom(data);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardPointReward_8638)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardPointReward_8638)PARSER.parseFrom(data);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardPointReward_8638)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardPointReward_8638)PARSER.parseFrom(data);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialWeeklyCardPointReward_8638)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(InputStream input) throws IOException {
         return (S2C_SpecialWeeklyCardPointReward_8638)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialWeeklyCardPointReward_8638)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SpecialWeeklyCardPointReward_8638)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialWeeklyCardPointReward_8638)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SpecialWeeklyCardPointReward_8638)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialWeeklyCardPointReward_8638)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SpecialWeeklyCardPointReward_8638 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SpecialWeeklyCardPointReward_8638 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SpecialWeeklyCardPointReward_8638> parser() {
         return PARSER;
      }

      public Parser<S2C_SpecialWeeklyCardPointReward_8638> getParserForType() {
         return PARSER;
      }

      public S2C_SpecialWeeklyCardPointReward_8638 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SpecialWeeklyCardPointReward_8638OrBuilder {
         private int bitField0_;
         private int awardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpecialWeeklyCardPointReward_8638.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_SpecialWeeklyCardPointReward_8638.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.awardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_SpecialWeeklyCardPointReward_8638_descriptor;
         }

         public S2C_SpecialWeeklyCardPointReward_8638 getDefaultInstanceForType() {
            return GiftMsg.S2C_SpecialWeeklyCardPointReward_8638.getDefaultInstance();
         }

         public S2C_SpecialWeeklyCardPointReward_8638 build() {
            S2C_SpecialWeeklyCardPointReward_8638 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SpecialWeeklyCardPointReward_8638 buildPartial() {
            S2C_SpecialWeeklyCardPointReward_8638 result = new S2C_SpecialWeeklyCardPointReward_8638(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.awardId_ = this.awardId_;
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
            if (other instanceof S2C_SpecialWeeklyCardPointReward_8638) {
               return this.mergeFrom((S2C_SpecialWeeklyCardPointReward_8638)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SpecialWeeklyCardPointReward_8638 other) {
            if (other == GiftMsg.S2C_SpecialWeeklyCardPointReward_8638.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAwardId()) {
                  this.setAwardId(other.getAwardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasAwardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SpecialWeeklyCardPointReward_8638 parsedMessage = null;

            try {
               parsedMessage = (S2C_SpecialWeeklyCardPointReward_8638)GiftMsg.S2C_SpecialWeeklyCardPointReward_8638.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SpecialWeeklyCardPointReward_8638)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAwardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAwardId() {
            return this.awardId_;
         }

         public Builder setAwardId(int value) {
            this.bitField0_ |= 1;
            this.awardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAwardId() {
            this.bitField0_ &= -2;
            this.awardId_ = 0;
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

   public static final class C2S_LifeTimeCardGiftBuyInfo_8639 extends GeneratedMessageV3 implements C2S_LifeTimeCardGiftBuyInfo_8639OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LifeTimeCardGiftBuyInfo_8639 DEFAULT_INSTANCE = new C2S_LifeTimeCardGiftBuyInfo_8639();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LifeTimeCardGiftBuyInfo_8639> PARSER = new AbstractParser<C2S_LifeTimeCardGiftBuyInfo_8639>() {
         public C2S_LifeTimeCardGiftBuyInfo_8639 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LifeTimeCardGiftBuyInfo_8639(input, extensionRegistry);
         }
      };

      private C2S_LifeTimeCardGiftBuyInfo_8639(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LifeTimeCardGiftBuyInfo_8639() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LifeTimeCardGiftBuyInfo_8639();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LifeTimeCardGiftBuyInfo_8639(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();

            try {
               boolean done = false;

               while(!done) {
                  int tag = input.readTag();
                  switch (tag) {
                     case 0:
                        done = true;
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LifeTimeCardGiftBuyInfo_8639.class, Builder.class);
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
         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LifeTimeCardGiftBuyInfo_8639)) {
            return super.equals(obj);
         } else {
            C2S_LifeTimeCardGiftBuyInfo_8639 other = (C2S_LifeTimeCardGiftBuyInfo_8639)obj;
            return this.unknownFields.equals(other.unknownFields);
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)PARSER.parseFrom(data);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)PARSER.parseFrom(data);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)PARSER.parseFrom(data);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(InputStream input) throws IOException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LifeTimeCardGiftBuyInfo_8639)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LifeTimeCardGiftBuyInfo_8639 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LifeTimeCardGiftBuyInfo_8639 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LifeTimeCardGiftBuyInfo_8639> parser() {
         return PARSER;
      }

      public Parser<C2S_LifeTimeCardGiftBuyInfo_8639> getParserForType() {
         return PARSER;
      }

      public C2S_LifeTimeCardGiftBuyInfo_8639 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LifeTimeCardGiftBuyInfo_8639OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LifeTimeCardGiftBuyInfo_8639.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.C2S_LifeTimeCardGiftBuyInfo_8639.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_C2S_LifeTimeCardGiftBuyInfo_8639_descriptor;
         }

         public C2S_LifeTimeCardGiftBuyInfo_8639 getDefaultInstanceForType() {
            return GiftMsg.C2S_LifeTimeCardGiftBuyInfo_8639.getDefaultInstance();
         }

         public C2S_LifeTimeCardGiftBuyInfo_8639 build() {
            C2S_LifeTimeCardGiftBuyInfo_8639 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LifeTimeCardGiftBuyInfo_8639 buildPartial() {
            C2S_LifeTimeCardGiftBuyInfo_8639 result = new C2S_LifeTimeCardGiftBuyInfo_8639(this);
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
            if (other instanceof C2S_LifeTimeCardGiftBuyInfo_8639) {
               return this.mergeFrom((C2S_LifeTimeCardGiftBuyInfo_8639)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LifeTimeCardGiftBuyInfo_8639 other) {
            if (other == GiftMsg.C2S_LifeTimeCardGiftBuyInfo_8639.getDefaultInstance()) {
               return this;
            } else {
               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LifeTimeCardGiftBuyInfo_8639 parsedMessage = null;

            try {
               parsedMessage = (C2S_LifeTimeCardGiftBuyInfo_8639)GiftMsg.C2S_LifeTimeCardGiftBuyInfo_8639.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LifeTimeCardGiftBuyInfo_8639)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

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

   public static final class S2C_LifeTimeCardGiftBuyInfo_8640 extends GeneratedMessageV3 implements S2C_LifeTimeCardGiftBuyInfo_8640OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISBUY_FIELD_NUMBER = 1;
      private boolean isBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_LifeTimeCardGiftBuyInfo_8640 DEFAULT_INSTANCE = new S2C_LifeTimeCardGiftBuyInfo_8640();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LifeTimeCardGiftBuyInfo_8640> PARSER = new AbstractParser<S2C_LifeTimeCardGiftBuyInfo_8640>() {
         public S2C_LifeTimeCardGiftBuyInfo_8640 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LifeTimeCardGiftBuyInfo_8640(input, extensionRegistry);
         }
      };

      private S2C_LifeTimeCardGiftBuyInfo_8640(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LifeTimeCardGiftBuyInfo_8640() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LifeTimeCardGiftBuyInfo_8640();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LifeTimeCardGiftBuyInfo_8640(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isBuy_ = input.readBool();
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
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LifeTimeCardGiftBuyInfo_8640.class, Builder.class);
      }

      public boolean hasIsBuy() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsBuy() {
         return this.isBuy_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsBuy()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.isBuy_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isBuy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LifeTimeCardGiftBuyInfo_8640)) {
            return super.equals(obj);
         } else {
            S2C_LifeTimeCardGiftBuyInfo_8640 other = (S2C_LifeTimeCardGiftBuyInfo_8640)obj;
            if (this.hasIsBuy() != other.hasIsBuy()) {
               return false;
            } else if (this.hasIsBuy() && this.getIsBuy() != other.getIsBuy()) {
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
            if (this.hasIsBuy()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsBuy());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)PARSER.parseFrom(data);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)PARSER.parseFrom(data);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)PARSER.parseFrom(data);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(InputStream input) throws IOException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LifeTimeCardGiftBuyInfo_8640)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LifeTimeCardGiftBuyInfo_8640 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LifeTimeCardGiftBuyInfo_8640 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LifeTimeCardGiftBuyInfo_8640> parser() {
         return PARSER;
      }

      public Parser<S2C_LifeTimeCardGiftBuyInfo_8640> getParserForType() {
         return PARSER;
      }

      public S2C_LifeTimeCardGiftBuyInfo_8640 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LifeTimeCardGiftBuyInfo_8640OrBuilder {
         private int bitField0_;
         private boolean isBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LifeTimeCardGiftBuyInfo_8640.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GiftMsg.S2C_LifeTimeCardGiftBuyInfo_8640.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isBuy_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GiftMsg.internal_static_gift_com_gzbz_protobuf_S2C_LifeTimeCardGiftBuyInfo_8640_descriptor;
         }

         public S2C_LifeTimeCardGiftBuyInfo_8640 getDefaultInstanceForType() {
            return GiftMsg.S2C_LifeTimeCardGiftBuyInfo_8640.getDefaultInstance();
         }

         public S2C_LifeTimeCardGiftBuyInfo_8640 build() {
            S2C_LifeTimeCardGiftBuyInfo_8640 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LifeTimeCardGiftBuyInfo_8640 buildPartial() {
            S2C_LifeTimeCardGiftBuyInfo_8640 result = new S2C_LifeTimeCardGiftBuyInfo_8640(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isBuy_ = this.isBuy_;
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
            if (other instanceof S2C_LifeTimeCardGiftBuyInfo_8640) {
               return this.mergeFrom((S2C_LifeTimeCardGiftBuyInfo_8640)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LifeTimeCardGiftBuyInfo_8640 other) {
            if (other == GiftMsg.S2C_LifeTimeCardGiftBuyInfo_8640.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsBuy()) {
                  this.setIsBuy(other.getIsBuy());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsBuy();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LifeTimeCardGiftBuyInfo_8640 parsedMessage = null;

            try {
               parsedMessage = (S2C_LifeTimeCardGiftBuyInfo_8640)GiftMsg.S2C_LifeTimeCardGiftBuyInfo_8640.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LifeTimeCardGiftBuyInfo_8640)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsBuy() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsBuy() {
            return this.isBuy_;
         }

         public Builder setIsBuy(boolean value) {
            this.bitField0_ |= 1;
            this.isBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsBuy() {
            this.bitField0_ &= -2;
            this.isBuy_ = false;
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

   public interface C2S_ActLimitShop_8617OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GeneralWelfareReward_8625OrBuilder extends MessageOrBuilder {
      boolean hasReward();

      int getReward();
   }

   public interface C2S_GeneralWelfare_8623OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_GiftBuy_8609OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();
   }

   public interface C2S_GiftList_8611OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LevelGiftMain_8613OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LevelGiftReward_8615OrBuilder extends MessageOrBuilder {
      boolean hasGetGift();

      LevelGiftData getGetGift();

      LevelGiftDataOrBuilder getGetGiftOrBuilder();
   }

   public interface C2S_LifeTimeCardGiftBuyInfo_8639OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SpecialWeeklyCardPointReward_8637OrBuilder extends MessageOrBuilder {
      boolean hasAwardId();

      int getAwardId();
   }

   public interface C2S_SpecialWeeklyCardReward_8635OrBuilder extends MessageOrBuilder {
      boolean hasGiftId();

      int getGiftId();

      boolean hasDay();

      int getDay();
   }

   public interface C2S_TimeLimitGiftBuy_8604OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();
   }

   public interface C2S_TimeLimitGiftEndNotify_8602OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_TimeLimitGiftList_8606OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WarOrderOneKeyReward_8633OrBuilder extends MessageOrBuilder {
      boolean hasSystem();

      int getSystem();

      boolean hasStageType();

      int getStageType();
   }

   public interface C2S_WarOrderReward_8631OrBuilder extends MessageOrBuilder {
      boolean hasSystem();

      int getSystem();

      boolean hasReward();

      int getReward();
   }

   public interface C2S_WarOrder_8629OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WeeklyCardReward_8619OrBuilder extends MessageOrBuilder {
      boolean hasGiftId();

      int getGiftId();

      boolean hasDay();

      int getDay();
   }

   public interface GiftDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasBuyCount();

      int getBuyCount();

      boolean hasEndTime();

      int getEndTime();

      boolean hasGotDay();

      int getGotDay();
   }

   public interface LevelGiftDataOrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasLevel();

      int getLevel();
   }

   public interface S2C_ActLimitShop_8618OrBuilder extends MessageOrBuilder {
      List<Integer> getActTriggerGiftsList();

      int getActTriggerGiftsCount();

      int getActTriggerGifts(int index);
   }

   public interface S2C_GeneralWelfareNotify_8628OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasCount();

      int getCount();
   }

   public interface S2C_GeneralWelfareReward_8626OrBuilder extends MessageOrBuilder {
      boolean hasReward();

      int getReward();

      List<Integer> getRewardCommonList();

      int getRewardCommonCount();

      int getRewardCommon(int index);

      List<Integer> getRewardSuperList();

      int getRewardSuperCount();

      int getRewardSuper(int index);
   }

   public interface S2C_GeneralWelfare_8624OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasCount();

      int getCount();

      List<Integer> getRewardCommonList();

      int getRewardCommonCount();

      int getRewardCommon(int index);

      List<Integer> getRewardSuperList();

      int getRewardSuperCount();

      int getRewardSuper(int index);
   }

   public interface S2C_GiftBuy_8610OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();

      boolean hasBuyCount();

      int getBuyCount();

      boolean hasEndTime();

      int getEndTime();

      boolean hasGotDay();

      int getGotDay();
   }

   public interface S2C_GiftList_8612OrBuilder extends MessageOrBuilder {
      List<GiftData> getGiftsList();

      GiftData getGifts(int index);

      int getGiftsCount();

      List<? extends GiftDataOrBuilder> getGiftsOrBuilderList();

      GiftDataOrBuilder getGiftsOrBuilder(int index);
   }

   public interface S2C_LevelGiftMain_8614OrBuilder extends MessageOrBuilder {
      List<LevelGiftData> getGotGiftList();

      LevelGiftData getGotGift(int index);

      int getGotGiftCount();

      List<? extends LevelGiftDataOrBuilder> getGotGiftOrBuilderList();

      LevelGiftDataOrBuilder getGotGiftOrBuilder(int index);
   }

   public interface S2C_LevelGiftReward_8616OrBuilder extends MessageOrBuilder {
      boolean hasGetGift();

      LevelGiftData getGetGift();

      LevelGiftDataOrBuilder getGetGiftOrBuilder();
   }

   public interface S2C_LifeTimeCardGiftBuyInfo_8640OrBuilder extends MessageOrBuilder {
      boolean hasIsBuy();

      boolean getIsBuy();
   }

   public interface S2C_SpecialWeeklyCardPointReward_8638OrBuilder extends MessageOrBuilder {
      boolean hasAwardId();

      int getAwardId();
   }

   public interface S2C_SpecialWeeklyCardReward_8636OrBuilder extends MessageOrBuilder {
      boolean hasGiftId();

      int getGiftId();

      boolean hasDay();

      int getDay();
   }

   public interface S2C_TimeLimitGiftBuy_8605OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();

      boolean hasBuyCount();

      int getBuyCount();
   }

   public interface S2C_TimeLimitGiftEndNotify_8603OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_TimeLimitGiftListNotify_8601OrBuilder extends MessageOrBuilder {
      List<TimeLimitGiftData> getGiftDataList();

      TimeLimitGiftData getGiftData(int index);

      int getGiftDataCount();

      List<? extends TimeLimitGiftDataOrBuilder> getGiftDataOrBuilderList();

      TimeLimitGiftDataOrBuilder getGiftDataOrBuilder(int index);
   }

   public interface S2C_TimeLimitGiftList_8607OrBuilder extends MessageOrBuilder {
      List<TimeLimitGiftData> getGiftDataListList();

      TimeLimitGiftData getGiftDataList(int index);

      int getGiftDataListCount();

      List<? extends TimeLimitGiftDataOrBuilder> getGiftDataListOrBuilderList();

      TimeLimitGiftDataOrBuilder getGiftDataListOrBuilder(int index);

      List<TimeLimitGiftBuyData> getBuyGiftListList();

      TimeLimitGiftBuyData getBuyGiftList(int index);

      int getBuyGiftListCount();

      List<? extends TimeLimitGiftBuyDataOrBuilder> getBuyGiftListOrBuilderList();

      TimeLimitGiftBuyDataOrBuilder getBuyGiftListOrBuilder(int index);
   }

   public interface S2C_WarOrderOneKeyReward_8634OrBuilder extends MessageOrBuilder {
      boolean hasWarOrder();

      WarOrderData getWarOrder();

      WarOrderDataOrBuilder getWarOrderOrBuilder();

      boolean hasStageType();

      int getStageType();
   }

   public interface S2C_WarOrderReward_8632OrBuilder extends MessageOrBuilder {
      boolean hasWarOrder();

      WarOrderData getWarOrder();

      WarOrderDataOrBuilder getWarOrderOrBuilder();
   }

   public interface S2C_WarOrder_8630OrBuilder extends MessageOrBuilder {
      List<WarOrderData> getWarOrderList();

      WarOrderData getWarOrder(int index);

      int getWarOrderCount();

      List<? extends WarOrderDataOrBuilder> getWarOrderOrBuilderList();

      WarOrderDataOrBuilder getWarOrderOrBuilder(int index);
   }

   public interface S2C_WeeklyCardReward_8620OrBuilder extends MessageOrBuilder {
      boolean hasGiftId();

      int getGiftId();

      boolean hasDay();

      int getDay();
   }

   public interface TimeLimitGiftBuyDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasBuyCount();

      int getBuyCount();
   }

   public interface TimeLimitGiftDataOrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasEnd();

      int getEnd();

      boolean hasPlayerLv();

      int getPlayerLv();
   }

   public interface WarOrderDataOrBuilder extends MessageOrBuilder {
      boolean hasSystem();

      int getSystem();

      List<Integer> getRewardCommonList();

      int getRewardCommonCount();

      int getRewardCommon(int index);

      List<Integer> getRewardSuperList();

      int getRewardSuperCount();

      int getRewardSuper(int index);
   }
}
