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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
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

public final class BenefitMsg {
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_PreferentialData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_PreferentialData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_GrowFundData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_GrowFundData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_RecommendTask_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_RecommendTask_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private BenefitMsg() {
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
      String[] descriptorData = new String[]{"\n\rBenefit.proto\u0012\u0019benefit.com.gzbz.protobuf\u001a\nShop.proto\u001a\fcommon.proto\"S\n\u0010PreferentialData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012!\n\u0007rewards\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0010\n\bbuyCount\u0018\u0003 \u0002(\u0005\"\u0018\n\u0016C2S_DailySignInfo_8101\"i\n\u001cS2C_DailySignInfoResult_8102\u0012\f\n\u0004days\u0018\u0001 \u0003(\u0005\u0012\u0011\n\ttodaySign\u0018\u0002 \u0002(\u0005\u0012\u0015\n\rtodayRecharge\u0018\u0003 \u0002(\b\u0012\u0011\n\tloginDays\u0018\u0004 \u0002(\u0005\"!\n\u0012C2S_DailySign_8103\u0012\u000b\n\u0003day\u0018\u0001 \u0002(\u0005\"7\n\u0018S2C_DailySignResult_8104\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003day\u0018\u0002 \u0002(\u0005\"(\n\u0018C2S_MonthlyCardInfo_8105\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u009e\u0001\n\u001aS2C_MonthlyCardResult_8106\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rrechargeTotal\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nisActivate\u0018\u0003 \u0002(\b\u0012\u0012\n\nisGotToday\u0018\u0004 \u0002(\b\u0012\u000f\n\u0007gotDays\u0018\u0005 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0007 \u0002(\u0005\"*\n\u001aC2S_MonthlyCardReward_8107\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"e\n S2C_monthlyCardRewardResult_8108\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nisGotToday\u0018\u0003 \u0002(\b\u0012\u000f\n\u0007gotDays\u0018\u0004 \u0002(\u0005\"!\n\u001fC2S_WeeklyPreferentialInfo_8109\"b\n!S2C_WeeklyPreferentialResult_8110\u0012=\n\bdataList\u0018\u0001 \u0003(\u000b2+.benefit.com.gzbz.protobuf.PreferentialData\"\"\n C2S_MonthlyPreferentialInfo_8111\"c\n\"S2C_MonthlyPreferentialResult_8112\u0012=\n\bdataList\u0018\u0001 \u0003(\u000b2+.benefit.com.gzbz.protobuf.PreferentialData\"/\n\u001eC2S_WeeklyPreferentialBuy_8113\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\"E\n$S2C_WeeklyPreferentialBuyResult_8114\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005buyId\u0018\u0002 \u0002(\u0005\"0\n\u001fC2S_MonthlyPreferentialBuy_8115\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\"F\n%S2C_MonthlyPreferentialBuyResult_8116\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005buyId\u0018\u0002 \u0002(\u0005\";\n\fGrowFundData\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005isBuy\u0018\u0002 \u0002(\b\u0012\u000e\n\u0006gotIds\u0018\u0003 \u0003(\u0005\"\u0017\n\u0015C2S_GrowFundInfo_8117\"P\n\u0017S2C_GrowFundResult_8118\u00125\n\u0004data\u0018\u0001 \u0003(\u000b2'.benefit.com.gzbz.protobuf.GrowFundData\"%\n\u0017C2S_GrowFundReward_8119\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\";\n\u001dS2C_GrowFundRewardResult_8120\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\"9\n\u001aS2C_GrowFundBuyNotify_8121\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005isBuy\u0018\u0002 \u0002(\b\"*\n\u0016C2S_RecommendInfo_8122\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"I\n\rRecommendTask\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bfinishCount\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000brewardCount\u0018\u0003 \u0002(\u0005\"f\n\u000fRecommendPlayer\u0012\f\n\u0004head\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bcombatPower\u0018\u0004 \u0002(\u0003\u0012\r\n\u0005vipLv\u0018\u0005 \u0002(\u0003\"È\u0001\n\u0018S2C_RecommendResult_8123\u0012\u0015\n\rrecommendCode\u0018\u0001 \u0002(\u0005\u00127\n\u0005tasks\u0018\u0002 \u0003(\u000b2(.benefit.com.gzbz.protobuf.RecommendTask\u0012C\n\u000frecommendPlayer\u0018\u0003 \u0003(\u000b2*.benefit.com.gzbz.protobuf.RecommendPlayer\u0012\u0017\n\u000fbeRecommendCode\u0018\u0004 \u0002(\u0005\"*\n\u0018C2S_RecommendReward_8124\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"@\n\u001eS2C_RecommendRewardResult_8125\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006taskId\u0018\u0002 \u0002(\u0005\"%\n\u0014C2S_CdKeyReward_8126\u0012\r\n\u0005cdKey\u0018\u0001 \u0002(\t\";\n\u001aS2C_CdKeyRewardResult_8127\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005cdKey\u0018\u0002 \u0002(\t\"(\n\u0018C2S_RecommendActive_8128\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"(\n\u0018S2C_RecommendActive_8129\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"\u001c\n\u001aC2S_PreventionCartoon_8131\"+\n\u001aS2C_PreventionCartoon_8132\u0012\r\n\u0005isGot\u0018\u0001 \u0002(\b\"\"\n C2S_PreventionCartoonReward_8133\"1\n S2C_PreventionCartoonReward_8134\u0012\r\n\u0005isGot\u0018\u0001 \u0002(\b\"\u001c\n\u001aC2S_ShopGoldCdKeyTime_8135\"]\n\u001aS2C_ShopGoldCdKeyTime_8136\u0012?\n\rshopGoldCdKey\u0018\u0001 \u0002(\u000b2(.benefit.com.gzbz.protobuf.ShopGoldCdKey\"?\n\rShopGoldCdKey\u0012\u0014\n\fexchangeCode\u0018\u0001 \u0003(\t\u0012\u0018\n\u0010lastExchangeTime\u0018\u0002 \u0002(\u0003B!\n\u0011com.gzbz.protobufB\nBenefitMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{ShopMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_benefit_com_gzbz_protobuf_PreferentialData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_benefit_com_gzbz_protobuf_PreferentialData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_PreferentialData_descriptor, new String[]{"Id", "Rewards", "BuyCount"});
      internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_descriptor, new String[0]);
      internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_descriptor, new String[]{"Days", "TodaySign", "TodayRecharge", "LoginDays"});
      internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_descriptor, new String[]{"Day"});
      internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_descriptor, new String[]{"Result", "Day"});
      internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_descriptor, new String[]{"Type"});
      internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_descriptor, new String[]{"Type", "RechargeTotal", "IsActivate", "IsGotToday", "GotDays", "StartTime", "EndTime"});
      internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_descriptor, new String[]{"Type"});
      internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_descriptor, new String[]{"Result", "Type", "IsGotToday", "GotDays"});
      internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_descriptor, new String[0]);
      internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_descriptor, new String[]{"DataList"});
      internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_descriptor, new String[0]);
      internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_descriptor, new String[]{"DataList"});
      internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_descriptor, new String[]{"BuyId"});
      internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_descriptor, new String[]{"Result", "BuyId"});
      internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_descriptor, new String[]{"BuyId"});
      internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_descriptor, new String[]{"Result", "BuyId"});
      internal_static_benefit_com_gzbz_protobuf_GrowFundData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_benefit_com_gzbz_protobuf_GrowFundData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_GrowFundData_descriptor, new String[]{"Type", "IsBuy", "GotIds"});
      internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_descriptor, new String[0]);
      internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_descriptor, new String[]{"Data"});
      internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_descriptor, new String[]{"Id"});
      internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_descriptor, new String[]{"Result", "Id"});
      internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_descriptor, new String[]{"Type", "IsBuy"});
      internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_descriptor, new String[]{"PlayerId"});
      internal_static_benefit_com_gzbz_protobuf_RecommendTask_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_benefit_com_gzbz_protobuf_RecommendTask_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_RecommendTask_descriptor, new String[]{"TaskId", "FinishCount", "RewardCount"});
      internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_descriptor, new String[]{"Head", "PlayerName", "Level", "CombatPower", "VipLv"});
      internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_descriptor, new String[]{"RecommendCode", "Tasks", "RecommendPlayer", "BeRecommendCode"});
      internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_descriptor, new String[]{"TaskId"});
      internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_descriptor, new String[]{"Result", "TaskId"});
      internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_descriptor, new String[]{"CdKey"});
      internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_descriptor, new String[]{"Result", "CdKey"});
      internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_descriptor, new String[]{"Code"});
      internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_descriptor, new String[]{"Code"});
      internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_descriptor, new String[0]);
      internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_descriptor, new String[]{"IsGot"});
      internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_descriptor, new String[0]);
      internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_descriptor, new String[]{"IsGot"});
      internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_descriptor, new String[0]);
      internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_descriptor, new String[]{"ShopGoldCdKey"});
      internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_descriptor, new String[]{"ExchangeCode", "LastExchangeTime"});
      ShopMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class PreferentialData extends GeneratedMessageV3 implements PreferentialDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int REWARDS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> rewards_;
      public static final int BUYCOUNT_FIELD_NUMBER = 3;
      private int buyCount_;
      private byte memoizedIsInitialized;
      private static final PreferentialData DEFAULT_INSTANCE = new PreferentialData();
      /** @deprecated */
      @Deprecated
      public static final Parser<PreferentialData> PARSER = new AbstractParser<PreferentialData>() {
         public PreferentialData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new PreferentialData(input, extensionRegistry);
         }
      };

      private PreferentialData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private PreferentialData() {
         this.memoizedIsInitialized = -1;
         this.rewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new PreferentialData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private PreferentialData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rewards_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewards_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_PreferentialData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_PreferentialData_fieldAccessorTable.ensureFieldAccessorsInitialized(PreferentialData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<CommonMsg.ItemInfo> getRewardsList() {
         return this.rewards_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList() {
         return this.rewards_;
      }

      public int getRewardsCount() {
         return this.rewards_.size();
      }

      public CommonMsg.ItemInfo getRewards(int index) {
         return (CommonMsg.ItemInfo)this.rewards_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.rewards_.get(index);
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
            for(int i = 0; i < this.getRewardsCount(); ++i) {
               if (!this.getRewards(i).isInitialized()) {
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
            output.writeInt32(1, this.id_);
         }

         for(int i = 0; i < this.rewards_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rewards_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.buyCount_);
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

            for(int i = 0; i < this.rewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rewards_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.buyCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof PreferentialData)) {
            return super.equals(obj);
         } else {
            PreferentialData other = (PreferentialData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getRewardsList().equals(other.getRewardsList())) {
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

            if (this.getRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardsList().hashCode();
            }

            if (this.hasBuyCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBuyCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static PreferentialData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (PreferentialData)PARSER.parseFrom(data);
      }

      public static PreferentialData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PreferentialData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PreferentialData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (PreferentialData)PARSER.parseFrom(data);
      }

      public static PreferentialData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PreferentialData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PreferentialData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (PreferentialData)PARSER.parseFrom(data);
      }

      public static PreferentialData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (PreferentialData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static PreferentialData parseFrom(InputStream input) throws IOException {
         return (PreferentialData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PreferentialData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PreferentialData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static PreferentialData parseDelimitedFrom(InputStream input) throws IOException {
         return (PreferentialData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static PreferentialData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PreferentialData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static PreferentialData parseFrom(CodedInputStream input) throws IOException {
         return (PreferentialData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static PreferentialData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (PreferentialData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(PreferentialData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static PreferentialData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PreferentialData> parser() {
         return PARSER;
      }

      public Parser<PreferentialData> getParserForType() {
         return PARSER;
      }

      public PreferentialData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PreferentialDataOrBuilder {
         private int bitField0_;
         private int id_;
         private List<CommonMsg.ItemInfo> rewards_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardsBuilder_;
         private int buyCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_PreferentialData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_PreferentialData_fieldAccessorTable.ensureFieldAccessorsInitialized(PreferentialData.class, Builder.class);
         }

         private Builder() {
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.PreferentialData.alwaysUseFieldBuilders) {
               this.getRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rewardsBuilder_.clear();
            }

            this.buyCount_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_PreferentialData_descriptor;
         }

         public PreferentialData getDefaultInstanceForType() {
            return BenefitMsg.PreferentialData.getDefaultInstance();
         }

         public PreferentialData build() {
            PreferentialData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public PreferentialData buildPartial() {
            PreferentialData result = new PreferentialData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if (this.rewardsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
                  this.bitField0_ &= -3;
               }

               result.rewards_ = this.rewards_;
            } else {
               result.rewards_ = this.rewardsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
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
            if (other instanceof PreferentialData) {
               return this.mergeFrom((PreferentialData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(PreferentialData other) {
            if (other == BenefitMsg.PreferentialData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (this.rewardsBuilder_ == null) {
                  if (!other.rewards_.isEmpty()) {
                     if (this.rewards_.isEmpty()) {
                        this.rewards_ = other.rewards_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRewardsIsMutable();
                        this.rewards_.addAll(other.rewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rewards_.isEmpty()) {
                  if (this.rewardsBuilder_.isEmpty()) {
                     this.rewardsBuilder_.dispose();
                     this.rewardsBuilder_ = null;
                     this.rewards_ = other.rewards_;
                     this.bitField0_ &= -3;
                     this.rewardsBuilder_ = BenefitMsg.PreferentialData.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
                  } else {
                     this.rewardsBuilder_.addAllMessages(other.rewards_);
                  }
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
            } else if (!this.hasBuyCount()) {
               return false;
            } else {
               for(int i = 0; i < this.getRewardsCount(); ++i) {
                  if (!this.getRewards(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            PreferentialData parsedMessage = null;

            try {
               parsedMessage = (PreferentialData)BenefitMsg.PreferentialData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (PreferentialData)e.getUnfinishedMessage();
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

         private void ensureRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewards_ = new ArrayList(this.rewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardsList() {
            return this.rewardsBuilder_ == null ? Collections.unmodifiableList(this.rewards_) : this.rewardsBuilder_.getMessageList();
         }

         public int getRewardsCount() {
            return this.rewardsBuilder_ == null ? this.rewards_.size() : this.rewardsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getRewards(int index) {
            return this.rewardsBuilder_ == null ? (CommonMsg.ItemInfo)this.rewards_.get(index) : (CommonMsg.ItemInfo)this.rewardsBuilder_.getMessage(index);
         }

         public Builder setRewards(int index, CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.set(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRewards(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRewards(int index, CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRewards(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRewards(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewards_);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRewards() {
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRewards(int index) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.remove(index);
               this.onChanged();
            } else {
               this.rewardsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index) {
            return this.rewardsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.rewards_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList() {
            return this.rewardsBuilder_ != null ? this.rewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rewards_);
         }

         public CommonMsg.ItemInfo.Builder addRewardsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardsBuilderList() {
            return this.getRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardsFieldBuilder() {
            if (this.rewardsBuilder_ == null) {
               this.rewardsBuilder_ = new RepeatedFieldBuilderV3(this.rewards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rewards_ = null;
            }

            return this.rewardsBuilder_;
         }

         public boolean hasBuyCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBuyCount() {
            return this.buyCount_;
         }

         public Builder setBuyCount(int value) {
            this.bitField0_ |= 4;
            this.buyCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyCount() {
            this.bitField0_ &= -5;
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

   public static final class C2S_DailySignInfo_8101 extends GeneratedMessageV3 implements C2S_DailySignInfo_8101OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DailySignInfo_8101 DEFAULT_INSTANCE = new C2S_DailySignInfo_8101();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DailySignInfo_8101> PARSER = new AbstractParser<C2S_DailySignInfo_8101>() {
         public C2S_DailySignInfo_8101 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DailySignInfo_8101(input, extensionRegistry);
         }
      };

      private C2S_DailySignInfo_8101(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DailySignInfo_8101() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DailySignInfo_8101();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DailySignInfo_8101(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailySignInfo_8101.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DailySignInfo_8101)) {
            return super.equals(obj);
         } else {
            C2S_DailySignInfo_8101 other = (C2S_DailySignInfo_8101)obj;
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

      public static C2S_DailySignInfo_8101 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DailySignInfo_8101)PARSER.parseFrom(data);
      }

      public static C2S_DailySignInfo_8101 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailySignInfo_8101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailySignInfo_8101 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DailySignInfo_8101)PARSER.parseFrom(data);
      }

      public static C2S_DailySignInfo_8101 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailySignInfo_8101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailySignInfo_8101 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DailySignInfo_8101)PARSER.parseFrom(data);
      }

      public static C2S_DailySignInfo_8101 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailySignInfo_8101)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailySignInfo_8101 parseFrom(InputStream input) throws IOException {
         return (C2S_DailySignInfo_8101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailySignInfo_8101 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailySignInfo_8101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailySignInfo_8101 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DailySignInfo_8101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DailySignInfo_8101 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailySignInfo_8101)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailySignInfo_8101 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DailySignInfo_8101)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailySignInfo_8101 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailySignInfo_8101)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DailySignInfo_8101 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DailySignInfo_8101 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DailySignInfo_8101> parser() {
         return PARSER;
      }

      public Parser<C2S_DailySignInfo_8101> getParserForType() {
         return PARSER;
      }

      public C2S_DailySignInfo_8101 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DailySignInfo_8101OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailySignInfo_8101.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_DailySignInfo_8101.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySignInfo_8101_descriptor;
         }

         public C2S_DailySignInfo_8101 getDefaultInstanceForType() {
            return BenefitMsg.C2S_DailySignInfo_8101.getDefaultInstance();
         }

         public C2S_DailySignInfo_8101 build() {
            C2S_DailySignInfo_8101 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DailySignInfo_8101 buildPartial() {
            C2S_DailySignInfo_8101 result = new C2S_DailySignInfo_8101(this);
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
            if (other instanceof C2S_DailySignInfo_8101) {
               return this.mergeFrom((C2S_DailySignInfo_8101)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DailySignInfo_8101 other) {
            if (other == BenefitMsg.C2S_DailySignInfo_8101.getDefaultInstance()) {
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
            C2S_DailySignInfo_8101 parsedMessage = null;

            try {
               parsedMessage = (C2S_DailySignInfo_8101)BenefitMsg.C2S_DailySignInfo_8101.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DailySignInfo_8101)e.getUnfinishedMessage();
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

   public static final class S2C_DailySignInfoResult_8102 extends GeneratedMessageV3 implements S2C_DailySignInfoResult_8102OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAYS_FIELD_NUMBER = 1;
      private Internal.IntList days_;
      public static final int TODAYSIGN_FIELD_NUMBER = 2;
      private int todaySign_;
      public static final int TODAYRECHARGE_FIELD_NUMBER = 3;
      private boolean todayRecharge_;
      public static final int LOGINDAYS_FIELD_NUMBER = 4;
      private int loginDays_;
      private byte memoizedIsInitialized;
      private static final S2C_DailySignInfoResult_8102 DEFAULT_INSTANCE = new S2C_DailySignInfoResult_8102();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DailySignInfoResult_8102> PARSER = new AbstractParser<S2C_DailySignInfoResult_8102>() {
         public S2C_DailySignInfoResult_8102 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DailySignInfoResult_8102(input, extensionRegistry);
         }
      };

      private S2C_DailySignInfoResult_8102(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DailySignInfoResult_8102() {
         this.memoizedIsInitialized = -1;
         this.days_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DailySignInfoResult_8102();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DailySignInfoResult_8102(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.days_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.days_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.days_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.todaySign_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.todayRecharge_ = input.readBool();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.loginDays_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.days_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.days_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailySignInfoResult_8102.class, Builder.class);
      }

      public List<Integer> getDaysList() {
         return this.days_;
      }

      public int getDaysCount() {
         return this.days_.size();
      }

      public int getDays(int index) {
         return this.days_.getInt(index);
      }

      public boolean hasTodaySign() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTodaySign() {
         return this.todaySign_;
      }

      public boolean hasTodayRecharge() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getTodayRecharge() {
         return this.todayRecharge_;
      }

      public boolean hasLoginDays() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLoginDays() {
         return this.loginDays_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTodaySign()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTodayRecharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLoginDays()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.days_.size(); ++i) {
            output.writeInt32(1, this.days_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.todaySign_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.todayRecharge_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.loginDays_);
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

            for(int i = 0; i < this.days_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.days_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getDaysList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.todaySign_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.todayRecharge_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.loginDays_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DailySignInfoResult_8102)) {
            return super.equals(obj);
         } else {
            S2C_DailySignInfoResult_8102 other = (S2C_DailySignInfoResult_8102)obj;
            if (!this.getDaysList().equals(other.getDaysList())) {
               return false;
            } else if (this.hasTodaySign() != other.hasTodaySign()) {
               return false;
            } else if (this.hasTodaySign() && this.getTodaySign() != other.getTodaySign()) {
               return false;
            } else if (this.hasTodayRecharge() != other.hasTodayRecharge()) {
               return false;
            } else if (this.hasTodayRecharge() && this.getTodayRecharge() != other.getTodayRecharge()) {
               return false;
            } else if (this.hasLoginDays() != other.hasLoginDays()) {
               return false;
            } else if (this.hasLoginDays() && this.getLoginDays() != other.getLoginDays()) {
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
            if (this.getDaysCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDaysList().hashCode();
            }

            if (this.hasTodaySign()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTodaySign();
            }

            if (this.hasTodayRecharge()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getTodayRecharge());
            }

            if (this.hasLoginDays()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLoginDays();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DailySignInfoResult_8102)PARSER.parseFrom(data);
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailySignInfoResult_8102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DailySignInfoResult_8102)PARSER.parseFrom(data);
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailySignInfoResult_8102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DailySignInfoResult_8102)PARSER.parseFrom(data);
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailySignInfoResult_8102)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(InputStream input) throws IOException {
         return (S2C_DailySignInfoResult_8102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailySignInfoResult_8102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailySignInfoResult_8102 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DailySignInfoResult_8102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DailySignInfoResult_8102 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailySignInfoResult_8102)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DailySignInfoResult_8102)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailySignInfoResult_8102 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailySignInfoResult_8102)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DailySignInfoResult_8102 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DailySignInfoResult_8102 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DailySignInfoResult_8102> parser() {
         return PARSER;
      }

      public Parser<S2C_DailySignInfoResult_8102> getParserForType() {
         return PARSER;
      }

      public S2C_DailySignInfoResult_8102 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DailySignInfoResult_8102OrBuilder {
         private int bitField0_;
         private Internal.IntList days_;
         private int todaySign_;
         private boolean todayRecharge_;
         private int loginDays_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailySignInfoResult_8102.class, Builder.class);
         }

         private Builder() {
            this.days_ = BenefitMsg.S2C_DailySignInfoResult_8102.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.days_ = BenefitMsg.S2C_DailySignInfoResult_8102.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_DailySignInfoResult_8102.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.days_ = BenefitMsg.S2C_DailySignInfoResult_8102.emptyIntList();
            this.bitField0_ &= -2;
            this.todaySign_ = 0;
            this.bitField0_ &= -3;
            this.todayRecharge_ = false;
            this.bitField0_ &= -5;
            this.loginDays_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignInfoResult_8102_descriptor;
         }

         public S2C_DailySignInfoResult_8102 getDefaultInstanceForType() {
            return BenefitMsg.S2C_DailySignInfoResult_8102.getDefaultInstance();
         }

         public S2C_DailySignInfoResult_8102 build() {
            S2C_DailySignInfoResult_8102 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DailySignInfoResult_8102 buildPartial() {
            S2C_DailySignInfoResult_8102 result = new S2C_DailySignInfoResult_8102(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.days_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.days_ = this.days_;
            if ((from_bitField0_ & 2) != 0) {
               result.todaySign_ = this.todaySign_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.todayRecharge_ = this.todayRecharge_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.loginDays_ = this.loginDays_;
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
            if (other instanceof S2C_DailySignInfoResult_8102) {
               return this.mergeFrom((S2C_DailySignInfoResult_8102)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DailySignInfoResult_8102 other) {
            if (other == BenefitMsg.S2C_DailySignInfoResult_8102.getDefaultInstance()) {
               return this;
            } else {
               if (!other.days_.isEmpty()) {
                  if (this.days_.isEmpty()) {
                     this.days_ = other.days_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureDaysIsMutable();
                     this.days_.addAll(other.days_);
                  }

                  this.onChanged();
               }

               if (other.hasTodaySign()) {
                  this.setTodaySign(other.getTodaySign());
               }

               if (other.hasTodayRecharge()) {
                  this.setTodayRecharge(other.getTodayRecharge());
               }

               if (other.hasLoginDays()) {
                  this.setLoginDays(other.getLoginDays());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTodaySign()) {
               return false;
            } else if (!this.hasTodayRecharge()) {
               return false;
            } else {
               return this.hasLoginDays();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DailySignInfoResult_8102 parsedMessage = null;

            try {
               parsedMessage = (S2C_DailySignInfoResult_8102)BenefitMsg.S2C_DailySignInfoResult_8102.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DailySignInfoResult_8102)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDaysIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.days_ = BenefitMsg.S2C_DailySignInfoResult_8102.mutableCopy(this.days_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getDaysList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.days_) : this.days_);
         }

         public int getDaysCount() {
            return this.days_.size();
         }

         public int getDays(int index) {
            return this.days_.getInt(index);
         }

         public Builder setDays(int index, int value) {
            this.ensureDaysIsMutable();
            this.days_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addDays(int value) {
            this.ensureDaysIsMutable();
            this.days_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllDays(Iterable<? extends Integer> values) {
            this.ensureDaysIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.days_);
            this.onChanged();
            return this;
         }

         public Builder clearDays() {
            this.days_ = BenefitMsg.S2C_DailySignInfoResult_8102.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasTodaySign() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTodaySign() {
            return this.todaySign_;
         }

         public Builder setTodaySign(int value) {
            this.bitField0_ |= 2;
            this.todaySign_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTodaySign() {
            this.bitField0_ &= -3;
            this.todaySign_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTodayRecharge() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getTodayRecharge() {
            return this.todayRecharge_;
         }

         public Builder setTodayRecharge(boolean value) {
            this.bitField0_ |= 4;
            this.todayRecharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTodayRecharge() {
            this.bitField0_ &= -5;
            this.todayRecharge_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasLoginDays() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getLoginDays() {
            return this.loginDays_;
         }

         public Builder setLoginDays(int value) {
            this.bitField0_ |= 8;
            this.loginDays_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLoginDays() {
            this.bitField0_ &= -9;
            this.loginDays_ = 0;
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

   public static final class C2S_DailySign_8103 extends GeneratedMessageV3 implements C2S_DailySign_8103OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAY_FIELD_NUMBER = 1;
      private int day_;
      private byte memoizedIsInitialized;
      private static final C2S_DailySign_8103 DEFAULT_INSTANCE = new C2S_DailySign_8103();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DailySign_8103> PARSER = new AbstractParser<C2S_DailySign_8103>() {
         public C2S_DailySign_8103 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DailySign_8103(input, extensionRegistry);
         }
      };

      private C2S_DailySign_8103(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DailySign_8103() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DailySign_8103();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DailySign_8103(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailySign_8103.class, Builder.class);
      }

      public boolean hasDay() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.day_);
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
               size += CodedOutputStream.computeInt32Size(1, this.day_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DailySign_8103)) {
            return super.equals(obj);
         } else {
            C2S_DailySign_8103 other = (C2S_DailySign_8103)obj;
            if (this.hasDay() != other.hasDay()) {
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
            if (this.hasDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DailySign_8103 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DailySign_8103)PARSER.parseFrom(data);
      }

      public static C2S_DailySign_8103 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailySign_8103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailySign_8103 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DailySign_8103)PARSER.parseFrom(data);
      }

      public static C2S_DailySign_8103 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailySign_8103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailySign_8103 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DailySign_8103)PARSER.parseFrom(data);
      }

      public static C2S_DailySign_8103 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DailySign_8103)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DailySign_8103 parseFrom(InputStream input) throws IOException {
         return (C2S_DailySign_8103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailySign_8103 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailySign_8103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailySign_8103 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DailySign_8103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DailySign_8103 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailySign_8103)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DailySign_8103 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DailySign_8103)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DailySign_8103 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DailySign_8103)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DailySign_8103 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DailySign_8103 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DailySign_8103> parser() {
         return PARSER;
      }

      public Parser<C2S_DailySign_8103> getParserForType() {
         return PARSER;
      }

      public C2S_DailySign_8103 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DailySign_8103OrBuilder {
         private int bitField0_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DailySign_8103.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_DailySign_8103.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.day_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_DailySign_8103_descriptor;
         }

         public C2S_DailySign_8103 getDefaultInstanceForType() {
            return BenefitMsg.C2S_DailySign_8103.getDefaultInstance();
         }

         public C2S_DailySign_8103 build() {
            C2S_DailySign_8103 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DailySign_8103 buildPartial() {
            C2S_DailySign_8103 result = new C2S_DailySign_8103(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.day_ = this.day_;
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
            if (other instanceof C2S_DailySign_8103) {
               return this.mergeFrom((C2S_DailySign_8103)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DailySign_8103 other) {
            if (other == BenefitMsg.C2S_DailySign_8103.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDay()) {
                  this.setDay(other.getDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasDay();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_DailySign_8103 parsedMessage = null;

            try {
               parsedMessage = (C2S_DailySign_8103)BenefitMsg.C2S_DailySign_8103.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DailySign_8103)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDay() {
            return this.day_;
         }

         public Builder setDay(int value) {
            this.bitField0_ |= 1;
            this.day_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDay() {
            this.bitField0_ &= -2;
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

   public static final class S2C_DailySignResult_8104 extends GeneratedMessageV3 implements S2C_DailySignResult_8104OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int DAY_FIELD_NUMBER = 2;
      private int day_;
      private byte memoizedIsInitialized;
      private static final S2C_DailySignResult_8104 DEFAULT_INSTANCE = new S2C_DailySignResult_8104();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DailySignResult_8104> PARSER = new AbstractParser<S2C_DailySignResult_8104>() {
         public S2C_DailySignResult_8104 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DailySignResult_8104(input, extensionRegistry);
         }
      };

      private S2C_DailySignResult_8104(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DailySignResult_8104() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DailySignResult_8104();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DailySignResult_8104(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailySignResult_8104.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
         } else if (!this.hasResult()) {
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
            output.writeInt32(1, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
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
         } else if (!(obj instanceof S2C_DailySignResult_8104)) {
            return super.equals(obj);
         } else {
            S2C_DailySignResult_8104 other = (S2C_DailySignResult_8104)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
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

      public static S2C_DailySignResult_8104 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DailySignResult_8104)PARSER.parseFrom(data);
      }

      public static S2C_DailySignResult_8104 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailySignResult_8104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailySignResult_8104 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DailySignResult_8104)PARSER.parseFrom(data);
      }

      public static S2C_DailySignResult_8104 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailySignResult_8104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailySignResult_8104 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DailySignResult_8104)PARSER.parseFrom(data);
      }

      public static S2C_DailySignResult_8104 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailySignResult_8104)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailySignResult_8104 parseFrom(InputStream input) throws IOException {
         return (S2C_DailySignResult_8104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailySignResult_8104 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailySignResult_8104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailySignResult_8104 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DailySignResult_8104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DailySignResult_8104 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailySignResult_8104)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailySignResult_8104 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DailySignResult_8104)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailySignResult_8104 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailySignResult_8104)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DailySignResult_8104 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DailySignResult_8104 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DailySignResult_8104> parser() {
         return PARSER;
      }

      public Parser<S2C_DailySignResult_8104> getParserForType() {
         return PARSER;
      }

      public S2C_DailySignResult_8104 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DailySignResult_8104OrBuilder {
         private int bitField0_;
         private int result_;
         private int day_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailySignResult_8104.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_DailySignResult_8104.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.day_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_DailySignResult_8104_descriptor;
         }

         public S2C_DailySignResult_8104 getDefaultInstanceForType() {
            return BenefitMsg.S2C_DailySignResult_8104.getDefaultInstance();
         }

         public S2C_DailySignResult_8104 build() {
            S2C_DailySignResult_8104 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DailySignResult_8104 buildPartial() {
            S2C_DailySignResult_8104 result = new S2C_DailySignResult_8104(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_DailySignResult_8104) {
               return this.mergeFrom((S2C_DailySignResult_8104)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DailySignResult_8104 other) {
            if (other == BenefitMsg.S2C_DailySignResult_8104.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DailySignResult_8104 parsedMessage = null;

            try {
               parsedMessage = (S2C_DailySignResult_8104)BenefitMsg.S2C_DailySignResult_8104.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DailySignResult_8104)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
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

   public static final class C2S_MonthlyCardInfo_8105 extends GeneratedMessageV3 implements C2S_MonthlyCardInfo_8105OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_MonthlyCardInfo_8105 DEFAULT_INSTANCE = new C2S_MonthlyCardInfo_8105();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MonthlyCardInfo_8105> PARSER = new AbstractParser<C2S_MonthlyCardInfo_8105>() {
         public C2S_MonthlyCardInfo_8105 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MonthlyCardInfo_8105(input, extensionRegistry);
         }
      };

      private C2S_MonthlyCardInfo_8105(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MonthlyCardInfo_8105() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MonthlyCardInfo_8105();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MonthlyCardInfo_8105(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonthlyCardInfo_8105.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MonthlyCardInfo_8105)) {
            return super.equals(obj);
         } else {
            C2S_MonthlyCardInfo_8105 other = (C2S_MonthlyCardInfo_8105)obj;
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

      public static C2S_MonthlyCardInfo_8105 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardInfo_8105)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyCardInfo_8105 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardInfo_8105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyCardInfo_8105 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardInfo_8105)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyCardInfo_8105 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardInfo_8105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyCardInfo_8105 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardInfo_8105)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyCardInfo_8105 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardInfo_8105)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyCardInfo_8105 parseFrom(InputStream input) throws IOException {
         return (C2S_MonthlyCardInfo_8105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonthlyCardInfo_8105 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyCardInfo_8105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonthlyCardInfo_8105 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MonthlyCardInfo_8105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MonthlyCardInfo_8105 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyCardInfo_8105)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonthlyCardInfo_8105 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MonthlyCardInfo_8105)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonthlyCardInfo_8105 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyCardInfo_8105)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MonthlyCardInfo_8105 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MonthlyCardInfo_8105 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MonthlyCardInfo_8105> parser() {
         return PARSER;
      }

      public Parser<C2S_MonthlyCardInfo_8105> getParserForType() {
         return PARSER;
      }

      public C2S_MonthlyCardInfo_8105 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MonthlyCardInfo_8105OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonthlyCardInfo_8105.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_MonthlyCardInfo_8105.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardInfo_8105_descriptor;
         }

         public C2S_MonthlyCardInfo_8105 getDefaultInstanceForType() {
            return BenefitMsg.C2S_MonthlyCardInfo_8105.getDefaultInstance();
         }

         public C2S_MonthlyCardInfo_8105 build() {
            C2S_MonthlyCardInfo_8105 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MonthlyCardInfo_8105 buildPartial() {
            C2S_MonthlyCardInfo_8105 result = new C2S_MonthlyCardInfo_8105(this);
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
            if (other instanceof C2S_MonthlyCardInfo_8105) {
               return this.mergeFrom((C2S_MonthlyCardInfo_8105)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MonthlyCardInfo_8105 other) {
            if (other == BenefitMsg.C2S_MonthlyCardInfo_8105.getDefaultInstance()) {
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
            C2S_MonthlyCardInfo_8105 parsedMessage = null;

            try {
               parsedMessage = (C2S_MonthlyCardInfo_8105)BenefitMsg.C2S_MonthlyCardInfo_8105.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MonthlyCardInfo_8105)e.getUnfinishedMessage();
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

   public static final class S2C_MonthlyCardResult_8106 extends GeneratedMessageV3 implements S2C_MonthlyCardResult_8106OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int RECHARGETOTAL_FIELD_NUMBER = 2;
      private int rechargeTotal_;
      public static final int ISACTIVATE_FIELD_NUMBER = 3;
      private boolean isActivate_;
      public static final int ISGOTTODAY_FIELD_NUMBER = 4;
      private boolean isGotToday_;
      public static final int GOTDAYS_FIELD_NUMBER = 5;
      private int gotDays_;
      public static final int STARTTIME_FIELD_NUMBER = 6;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 7;
      private int endTime_;
      private byte memoizedIsInitialized;
      private static final S2C_MonthlyCardResult_8106 DEFAULT_INSTANCE = new S2C_MonthlyCardResult_8106();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MonthlyCardResult_8106> PARSER = new AbstractParser<S2C_MonthlyCardResult_8106>() {
         public S2C_MonthlyCardResult_8106 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MonthlyCardResult_8106(input, extensionRegistry);
         }
      };

      private S2C_MonthlyCardResult_8106(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MonthlyCardResult_8106() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MonthlyCardResult_8106();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MonthlyCardResult_8106(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rechargeTotal_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isActivate_ = input.readBool();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isGotToday_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.gotDays_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.startTime_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.endTime_ = input.readInt32();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonthlyCardResult_8106.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasRechargeTotal() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRechargeTotal() {
         return this.rechargeTotal_;
      }

      public boolean hasIsActivate() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsActivate() {
         return this.isActivate_;
      }

      public boolean hasIsGotToday() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsGotToday() {
         return this.isGotToday_;
      }

      public boolean hasGotDays() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getGotDays() {
         return this.gotDays_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
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
         } else if (!this.hasRechargeTotal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsActivate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsGotToday()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGotDays()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
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
            output.writeInt32(2, this.rechargeTotal_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isActivate_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.isGotToday_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.gotDays_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.startTime_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.endTime_);
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
               size += CodedOutputStream.computeInt32Size(2, this.rechargeTotal_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isActivate_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isGotToday_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.gotDays_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.startTime_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.endTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MonthlyCardResult_8106)) {
            return super.equals(obj);
         } else {
            S2C_MonthlyCardResult_8106 other = (S2C_MonthlyCardResult_8106)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasRechargeTotal() != other.hasRechargeTotal()) {
               return false;
            } else if (this.hasRechargeTotal() && this.getRechargeTotal() != other.getRechargeTotal()) {
               return false;
            } else if (this.hasIsActivate() != other.hasIsActivate()) {
               return false;
            } else if (this.hasIsActivate() && this.getIsActivate() != other.getIsActivate()) {
               return false;
            } else if (this.hasIsGotToday() != other.hasIsGotToday()) {
               return false;
            } else if (this.hasIsGotToday() && this.getIsGotToday() != other.getIsGotToday()) {
               return false;
            } else if (this.hasGotDays() != other.hasGotDays()) {
               return false;
            } else if (this.hasGotDays() && this.getGotDays() != other.getGotDays()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
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

            if (this.hasRechargeTotal()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRechargeTotal();
            }

            if (this.hasIsActivate()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsActivate());
            }

            if (this.hasIsGotToday()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGotToday());
            }

            if (this.hasGotDays()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGotDays();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getEndTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MonthlyCardResult_8106)PARSER.parseFrom(data);
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonthlyCardResult_8106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MonthlyCardResult_8106)PARSER.parseFrom(data);
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonthlyCardResult_8106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MonthlyCardResult_8106)PARSER.parseFrom(data);
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonthlyCardResult_8106)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(InputStream input) throws IOException {
         return (S2C_MonthlyCardResult_8106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonthlyCardResult_8106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonthlyCardResult_8106 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MonthlyCardResult_8106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MonthlyCardResult_8106 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonthlyCardResult_8106)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MonthlyCardResult_8106)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonthlyCardResult_8106 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonthlyCardResult_8106)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MonthlyCardResult_8106 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MonthlyCardResult_8106 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MonthlyCardResult_8106> parser() {
         return PARSER;
      }

      public Parser<S2C_MonthlyCardResult_8106> getParserForType() {
         return PARSER;
      }

      public S2C_MonthlyCardResult_8106 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MonthlyCardResult_8106OrBuilder {
         private int bitField0_;
         private int type_;
         private int rechargeTotal_;
         private boolean isActivate_;
         private boolean isGotToday_;
         private int gotDays_;
         private int startTime_;
         private int endTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonthlyCardResult_8106.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_MonthlyCardResult_8106.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.rechargeTotal_ = 0;
            this.bitField0_ &= -3;
            this.isActivate_ = false;
            this.bitField0_ &= -5;
            this.isGotToday_ = false;
            this.bitField0_ &= -9;
            this.gotDays_ = 0;
            this.bitField0_ &= -17;
            this.startTime_ = 0;
            this.bitField0_ &= -33;
            this.endTime_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyCardResult_8106_descriptor;
         }

         public S2C_MonthlyCardResult_8106 getDefaultInstanceForType() {
            return BenefitMsg.S2C_MonthlyCardResult_8106.getDefaultInstance();
         }

         public S2C_MonthlyCardResult_8106 build() {
            S2C_MonthlyCardResult_8106 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MonthlyCardResult_8106 buildPartial() {
            S2C_MonthlyCardResult_8106 result = new S2C_MonthlyCardResult_8106(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rechargeTotal_ = this.rechargeTotal_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isActivate_ = this.isActivate_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isGotToday_ = this.isGotToday_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.gotDays_ = this.gotDays_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 64;
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
            if (other instanceof S2C_MonthlyCardResult_8106) {
               return this.mergeFrom((S2C_MonthlyCardResult_8106)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MonthlyCardResult_8106 other) {
            if (other == BenefitMsg.S2C_MonthlyCardResult_8106.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasRechargeTotal()) {
                  this.setRechargeTotal(other.getRechargeTotal());
               }

               if (other.hasIsActivate()) {
                  this.setIsActivate(other.getIsActivate());
               }

               if (other.hasIsGotToday()) {
                  this.setIsGotToday(other.getIsGotToday());
               }

               if (other.hasGotDays()) {
                  this.setGotDays(other.getGotDays());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasRechargeTotal()) {
               return false;
            } else if (!this.hasIsActivate()) {
               return false;
            } else if (!this.hasIsGotToday()) {
               return false;
            } else if (!this.hasGotDays()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else {
               return this.hasEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MonthlyCardResult_8106 parsedMessage = null;

            try {
               parsedMessage = (S2C_MonthlyCardResult_8106)BenefitMsg.S2C_MonthlyCardResult_8106.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MonthlyCardResult_8106)e.getUnfinishedMessage();
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

         public boolean hasRechargeTotal() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRechargeTotal() {
            return this.rechargeTotal_;
         }

         public Builder setRechargeTotal(int value) {
            this.bitField0_ |= 2;
            this.rechargeTotal_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRechargeTotal() {
            this.bitField0_ &= -3;
            this.rechargeTotal_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsActivate() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsActivate() {
            return this.isActivate_;
         }

         public Builder setIsActivate(boolean value) {
            this.bitField0_ |= 4;
            this.isActivate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsActivate() {
            this.bitField0_ &= -5;
            this.isActivate_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIsGotToday() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsGotToday() {
            return this.isGotToday_;
         }

         public Builder setIsGotToday(boolean value) {
            this.bitField0_ |= 8;
            this.isGotToday_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGotToday() {
            this.bitField0_ &= -9;
            this.isGotToday_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasGotDays() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getGotDays() {
            return this.gotDays_;
         }

         public Builder setGotDays(int value) {
            this.bitField0_ |= 16;
            this.gotDays_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotDays() {
            this.bitField0_ &= -17;
            this.gotDays_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 32;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -33;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 64;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -65;
            this.endTime_ = 0;
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

   public static final class C2S_MonthlyCardReward_8107 extends GeneratedMessageV3 implements C2S_MonthlyCardReward_8107OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_MonthlyCardReward_8107 DEFAULT_INSTANCE = new C2S_MonthlyCardReward_8107();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MonthlyCardReward_8107> PARSER = new AbstractParser<C2S_MonthlyCardReward_8107>() {
         public C2S_MonthlyCardReward_8107 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MonthlyCardReward_8107(input, extensionRegistry);
         }
      };

      private C2S_MonthlyCardReward_8107(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MonthlyCardReward_8107() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MonthlyCardReward_8107();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MonthlyCardReward_8107(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonthlyCardReward_8107.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MonthlyCardReward_8107)) {
            return super.equals(obj);
         } else {
            C2S_MonthlyCardReward_8107 other = (C2S_MonthlyCardReward_8107)obj;
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

      public static C2S_MonthlyCardReward_8107 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardReward_8107)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyCardReward_8107 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardReward_8107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyCardReward_8107 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardReward_8107)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyCardReward_8107 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardReward_8107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyCardReward_8107 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardReward_8107)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyCardReward_8107 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyCardReward_8107)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyCardReward_8107 parseFrom(InputStream input) throws IOException {
         return (C2S_MonthlyCardReward_8107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonthlyCardReward_8107 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyCardReward_8107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonthlyCardReward_8107 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MonthlyCardReward_8107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MonthlyCardReward_8107 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyCardReward_8107)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonthlyCardReward_8107 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MonthlyCardReward_8107)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonthlyCardReward_8107 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyCardReward_8107)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MonthlyCardReward_8107 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MonthlyCardReward_8107 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MonthlyCardReward_8107> parser() {
         return PARSER;
      }

      public Parser<C2S_MonthlyCardReward_8107> getParserForType() {
         return PARSER;
      }

      public C2S_MonthlyCardReward_8107 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MonthlyCardReward_8107OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonthlyCardReward_8107.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_MonthlyCardReward_8107.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyCardReward_8107_descriptor;
         }

         public C2S_MonthlyCardReward_8107 getDefaultInstanceForType() {
            return BenefitMsg.C2S_MonthlyCardReward_8107.getDefaultInstance();
         }

         public C2S_MonthlyCardReward_8107 build() {
            C2S_MonthlyCardReward_8107 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MonthlyCardReward_8107 buildPartial() {
            C2S_MonthlyCardReward_8107 result = new C2S_MonthlyCardReward_8107(this);
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
            if (other instanceof C2S_MonthlyCardReward_8107) {
               return this.mergeFrom((C2S_MonthlyCardReward_8107)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MonthlyCardReward_8107 other) {
            if (other == BenefitMsg.C2S_MonthlyCardReward_8107.getDefaultInstance()) {
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
            C2S_MonthlyCardReward_8107 parsedMessage = null;

            try {
               parsedMessage = (C2S_MonthlyCardReward_8107)BenefitMsg.C2S_MonthlyCardReward_8107.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MonthlyCardReward_8107)e.getUnfinishedMessage();
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

   public static final class S2C_monthlyCardRewardResult_8108 extends GeneratedMessageV3 implements S2C_monthlyCardRewardResult_8108OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int ISGOTTODAY_FIELD_NUMBER = 3;
      private boolean isGotToday_;
      public static final int GOTDAYS_FIELD_NUMBER = 4;
      private int gotDays_;
      private byte memoizedIsInitialized;
      private static final S2C_monthlyCardRewardResult_8108 DEFAULT_INSTANCE = new S2C_monthlyCardRewardResult_8108();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_monthlyCardRewardResult_8108> PARSER = new AbstractParser<S2C_monthlyCardRewardResult_8108>() {
         public S2C_monthlyCardRewardResult_8108 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_monthlyCardRewardResult_8108(input, extensionRegistry);
         }
      };

      private S2C_monthlyCardRewardResult_8108(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_monthlyCardRewardResult_8108() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_monthlyCardRewardResult_8108();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_monthlyCardRewardResult_8108(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.isGotToday_ = input.readBool();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.gotDays_ = input.readInt32();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_monthlyCardRewardResult_8108.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasIsGotToday() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsGotToday() {
         return this.isGotToday_;
      }

      public boolean hasGotDays() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGotDays() {
         return this.gotDays_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsGotToday()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGotDays()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.isGotToday_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.gotDays_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.isGotToday_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.gotDays_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_monthlyCardRewardResult_8108)) {
            return super.equals(obj);
         } else {
            S2C_monthlyCardRewardResult_8108 other = (S2C_monthlyCardRewardResult_8108)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasIsGotToday() != other.hasIsGotToday()) {
               return false;
            } else if (this.hasIsGotToday() && this.getIsGotToday() != other.getIsGotToday()) {
               return false;
            } else if (this.hasGotDays() != other.hasGotDays()) {
               return false;
            } else if (this.hasGotDays() && this.getGotDays() != other.getGotDays()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            if (this.hasIsGotToday()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGotToday());
            }

            if (this.hasGotDays()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGotDays();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_monthlyCardRewardResult_8108)PARSER.parseFrom(data);
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_monthlyCardRewardResult_8108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_monthlyCardRewardResult_8108)PARSER.parseFrom(data);
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_monthlyCardRewardResult_8108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_monthlyCardRewardResult_8108)PARSER.parseFrom(data);
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_monthlyCardRewardResult_8108)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(InputStream input) throws IOException {
         return (S2C_monthlyCardRewardResult_8108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_monthlyCardRewardResult_8108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_monthlyCardRewardResult_8108 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_monthlyCardRewardResult_8108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_monthlyCardRewardResult_8108 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_monthlyCardRewardResult_8108)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_monthlyCardRewardResult_8108)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_monthlyCardRewardResult_8108 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_monthlyCardRewardResult_8108)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_monthlyCardRewardResult_8108 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_monthlyCardRewardResult_8108 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_monthlyCardRewardResult_8108> parser() {
         return PARSER;
      }

      public Parser<S2C_monthlyCardRewardResult_8108> getParserForType() {
         return PARSER;
      }

      public S2C_monthlyCardRewardResult_8108 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_monthlyCardRewardResult_8108OrBuilder {
         private int bitField0_;
         private int result_;
         private int type_;
         private boolean isGotToday_;
         private int gotDays_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_monthlyCardRewardResult_8108.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_monthlyCardRewardResult_8108.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            this.isGotToday_ = false;
            this.bitField0_ &= -5;
            this.gotDays_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_monthlyCardRewardResult_8108_descriptor;
         }

         public S2C_monthlyCardRewardResult_8108 getDefaultInstanceForType() {
            return BenefitMsg.S2C_monthlyCardRewardResult_8108.getDefaultInstance();
         }

         public S2C_monthlyCardRewardResult_8108 build() {
            S2C_monthlyCardRewardResult_8108 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_monthlyCardRewardResult_8108 buildPartial() {
            S2C_monthlyCardRewardResult_8108 result = new S2C_monthlyCardRewardResult_8108(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.isGotToday_ = this.isGotToday_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.gotDays_ = this.gotDays_;
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
            if (other instanceof S2C_monthlyCardRewardResult_8108) {
               return this.mergeFrom((S2C_monthlyCardRewardResult_8108)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_monthlyCardRewardResult_8108 other) {
            if (other == BenefitMsg.S2C_monthlyCardRewardResult_8108.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasIsGotToday()) {
                  this.setIsGotToday(other.getIsGotToday());
               }

               if (other.hasGotDays()) {
                  this.setGotDays(other.getGotDays());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else if (!this.hasIsGotToday()) {
               return false;
            } else {
               return this.hasGotDays();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_monthlyCardRewardResult_8108 parsedMessage = null;

            try {
               parsedMessage = (S2C_monthlyCardRewardResult_8108)BenefitMsg.S2C_monthlyCardRewardResult_8108.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_monthlyCardRewardResult_8108)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 2;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsGotToday() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIsGotToday() {
            return this.isGotToday_;
         }

         public Builder setIsGotToday(boolean value) {
            this.bitField0_ |= 4;
            this.isGotToday_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGotToday() {
            this.bitField0_ &= -5;
            this.isGotToday_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasGotDays() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGotDays() {
            return this.gotDays_;
         }

         public Builder setGotDays(int value) {
            this.bitField0_ |= 8;
            this.gotDays_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGotDays() {
            this.bitField0_ &= -9;
            this.gotDays_ = 0;
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

   public static final class C2S_WeeklyPreferentialInfo_8109 extends GeneratedMessageV3 implements C2S_WeeklyPreferentialInfo_8109OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WeeklyPreferentialInfo_8109 DEFAULT_INSTANCE = new C2S_WeeklyPreferentialInfo_8109();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WeeklyPreferentialInfo_8109> PARSER = new AbstractParser<C2S_WeeklyPreferentialInfo_8109>() {
         public C2S_WeeklyPreferentialInfo_8109 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WeeklyPreferentialInfo_8109(input, extensionRegistry);
         }
      };

      private C2S_WeeklyPreferentialInfo_8109(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WeeklyPreferentialInfo_8109() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WeeklyPreferentialInfo_8109();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WeeklyPreferentialInfo_8109(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WeeklyPreferentialInfo_8109.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WeeklyPreferentialInfo_8109)) {
            return super.equals(obj);
         } else {
            C2S_WeeklyPreferentialInfo_8109 other = (C2S_WeeklyPreferentialInfo_8109)obj;
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

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialInfo_8109)PARSER.parseFrom(data);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialInfo_8109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialInfo_8109)PARSER.parseFrom(data);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialInfo_8109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialInfo_8109)PARSER.parseFrom(data);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialInfo_8109)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(InputStream input) throws IOException {
         return (C2S_WeeklyPreferentialInfo_8109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeeklyPreferentialInfo_8109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WeeklyPreferentialInfo_8109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeeklyPreferentialInfo_8109)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WeeklyPreferentialInfo_8109)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WeeklyPreferentialInfo_8109 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeeklyPreferentialInfo_8109)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WeeklyPreferentialInfo_8109 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WeeklyPreferentialInfo_8109 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WeeklyPreferentialInfo_8109> parser() {
         return PARSER;
      }

      public Parser<C2S_WeeklyPreferentialInfo_8109> getParserForType() {
         return PARSER;
      }

      public C2S_WeeklyPreferentialInfo_8109 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WeeklyPreferentialInfo_8109OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WeeklyPreferentialInfo_8109.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_WeeklyPreferentialInfo_8109.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialInfo_8109_descriptor;
         }

         public C2S_WeeklyPreferentialInfo_8109 getDefaultInstanceForType() {
            return BenefitMsg.C2S_WeeklyPreferentialInfo_8109.getDefaultInstance();
         }

         public C2S_WeeklyPreferentialInfo_8109 build() {
            C2S_WeeklyPreferentialInfo_8109 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WeeklyPreferentialInfo_8109 buildPartial() {
            C2S_WeeklyPreferentialInfo_8109 result = new C2S_WeeklyPreferentialInfo_8109(this);
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
            if (other instanceof C2S_WeeklyPreferentialInfo_8109) {
               return this.mergeFrom((C2S_WeeklyPreferentialInfo_8109)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WeeklyPreferentialInfo_8109 other) {
            if (other == BenefitMsg.C2S_WeeklyPreferentialInfo_8109.getDefaultInstance()) {
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
            C2S_WeeklyPreferentialInfo_8109 parsedMessage = null;

            try {
               parsedMessage = (C2S_WeeklyPreferentialInfo_8109)BenefitMsg.C2S_WeeklyPreferentialInfo_8109.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WeeklyPreferentialInfo_8109)e.getUnfinishedMessage();
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

   public static final class S2C_WeeklyPreferentialResult_8110 extends GeneratedMessageV3 implements S2C_WeeklyPreferentialResult_8110OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DATALIST_FIELD_NUMBER = 1;
      private List<PreferentialData> dataList_;
      private byte memoizedIsInitialized;
      private static final S2C_WeeklyPreferentialResult_8110 DEFAULT_INSTANCE = new S2C_WeeklyPreferentialResult_8110();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WeeklyPreferentialResult_8110> PARSER = new AbstractParser<S2C_WeeklyPreferentialResult_8110>() {
         public S2C_WeeklyPreferentialResult_8110 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WeeklyPreferentialResult_8110(input, extensionRegistry);
         }
      };

      private S2C_WeeklyPreferentialResult_8110(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WeeklyPreferentialResult_8110() {
         this.memoizedIsInitialized = -1;
         this.dataList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WeeklyPreferentialResult_8110();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WeeklyPreferentialResult_8110(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.dataList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.dataList_.add(input.readMessage(BenefitMsg.PreferentialData.PARSER, extensionRegistry));
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
                  this.dataList_ = Collections.unmodifiableList(this.dataList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WeeklyPreferentialResult_8110.class, Builder.class);
      }

      public List<PreferentialData> getDataListList() {
         return this.dataList_;
      }

      public List<? extends PreferentialDataOrBuilder> getDataListOrBuilderList() {
         return this.dataList_;
      }

      public int getDataListCount() {
         return this.dataList_.size();
      }

      public PreferentialData getDataList(int index) {
         return (PreferentialData)this.dataList_.get(index);
      }

      public PreferentialDataOrBuilder getDataListOrBuilder(int index) {
         return (PreferentialDataOrBuilder)this.dataList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getDataListCount(); ++i) {
               if (!this.getDataList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.dataList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.dataList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.dataList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.dataList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WeeklyPreferentialResult_8110)) {
            return super.equals(obj);
         } else {
            S2C_WeeklyPreferentialResult_8110 other = (S2C_WeeklyPreferentialResult_8110)obj;
            if (!this.getDataListList().equals(other.getDataListList())) {
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
            if (this.getDataListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDataListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialResult_8110)PARSER.parseFrom(data);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialResult_8110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialResult_8110)PARSER.parseFrom(data);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialResult_8110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialResult_8110)PARSER.parseFrom(data);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialResult_8110)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(InputStream input) throws IOException {
         return (S2C_WeeklyPreferentialResult_8110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeeklyPreferentialResult_8110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WeeklyPreferentialResult_8110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeeklyPreferentialResult_8110)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WeeklyPreferentialResult_8110)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WeeklyPreferentialResult_8110 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeeklyPreferentialResult_8110)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WeeklyPreferentialResult_8110 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WeeklyPreferentialResult_8110 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WeeklyPreferentialResult_8110> parser() {
         return PARSER;
      }

      public Parser<S2C_WeeklyPreferentialResult_8110> getParserForType() {
         return PARSER;
      }

      public S2C_WeeklyPreferentialResult_8110 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WeeklyPreferentialResult_8110OrBuilder {
         private int bitField0_;
         private List<PreferentialData> dataList_;
         private RepeatedFieldBuilderV3<PreferentialData, PreferentialData.Builder, PreferentialDataOrBuilder> dataListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WeeklyPreferentialResult_8110.class, Builder.class);
         }

         private Builder() {
            this.dataList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.dataList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_WeeklyPreferentialResult_8110.alwaysUseFieldBuilders) {
               this.getDataListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dataListBuilder_ == null) {
               this.dataList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.dataListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialResult_8110_descriptor;
         }

         public S2C_WeeklyPreferentialResult_8110 getDefaultInstanceForType() {
            return BenefitMsg.S2C_WeeklyPreferentialResult_8110.getDefaultInstance();
         }

         public S2C_WeeklyPreferentialResult_8110 build() {
            S2C_WeeklyPreferentialResult_8110 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WeeklyPreferentialResult_8110 buildPartial() {
            S2C_WeeklyPreferentialResult_8110 result = new S2C_WeeklyPreferentialResult_8110(this);
            int from_bitField0_ = this.bitField0_;
            if (this.dataListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.dataList_ = Collections.unmodifiableList(this.dataList_);
                  this.bitField0_ &= -2;
               }

               result.dataList_ = this.dataList_;
            } else {
               result.dataList_ = this.dataListBuilder_.build();
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
            if (other instanceof S2C_WeeklyPreferentialResult_8110) {
               return this.mergeFrom((S2C_WeeklyPreferentialResult_8110)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WeeklyPreferentialResult_8110 other) {
            if (other == BenefitMsg.S2C_WeeklyPreferentialResult_8110.getDefaultInstance()) {
               return this;
            } else {
               if (this.dataListBuilder_ == null) {
                  if (!other.dataList_.isEmpty()) {
                     if (this.dataList_.isEmpty()) {
                        this.dataList_ = other.dataList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureDataListIsMutable();
                        this.dataList_.addAll(other.dataList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.dataList_.isEmpty()) {
                  if (this.dataListBuilder_.isEmpty()) {
                     this.dataListBuilder_.dispose();
                     this.dataListBuilder_ = null;
                     this.dataList_ = other.dataList_;
                     this.bitField0_ &= -2;
                     this.dataListBuilder_ = BenefitMsg.S2C_WeeklyPreferentialResult_8110.alwaysUseFieldBuilders ? this.getDataListFieldBuilder() : null;
                  } else {
                     this.dataListBuilder_.addAllMessages(other.dataList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getDataListCount(); ++i) {
               if (!this.getDataList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WeeklyPreferentialResult_8110 parsedMessage = null;

            try {
               parsedMessage = (S2C_WeeklyPreferentialResult_8110)BenefitMsg.S2C_WeeklyPreferentialResult_8110.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WeeklyPreferentialResult_8110)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDataListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.dataList_ = new ArrayList(this.dataList_);
               this.bitField0_ |= 1;
            }

         }

         public List<PreferentialData> getDataListList() {
            return this.dataListBuilder_ == null ? Collections.unmodifiableList(this.dataList_) : this.dataListBuilder_.getMessageList();
         }

         public int getDataListCount() {
            return this.dataListBuilder_ == null ? this.dataList_.size() : this.dataListBuilder_.getCount();
         }

         public PreferentialData getDataList(int index) {
            return this.dataListBuilder_ == null ? (PreferentialData)this.dataList_.get(index) : (PreferentialData)this.dataListBuilder_.getMessage(index);
         }

         public Builder setDataList(int index, PreferentialData value) {
            if (this.dataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataListIsMutable();
               this.dataList_.set(index, value);
               this.onChanged();
            } else {
               this.dataListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDataList(int index, PreferentialData.Builder builderForValue) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               this.dataList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDataList(PreferentialData value) {
            if (this.dataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataListIsMutable();
               this.dataList_.add(value);
               this.onChanged();
            } else {
               this.dataListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDataList(int index, PreferentialData value) {
            if (this.dataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataListIsMutable();
               this.dataList_.add(index, value);
               this.onChanged();
            } else {
               this.dataListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDataList(PreferentialData.Builder builderForValue) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               this.dataList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dataListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDataList(int index, PreferentialData.Builder builderForValue) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               this.dataList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDataList(Iterable<? extends PreferentialData> values) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.dataList_);
               this.onChanged();
            } else {
               this.dataListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDataList() {
            if (this.dataListBuilder_ == null) {
               this.dataList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.dataListBuilder_.clear();
            }

            return this;
         }

         public Builder removeDataList(int index) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               this.dataList_.remove(index);
               this.onChanged();
            } else {
               this.dataListBuilder_.remove(index);
            }

            return this;
         }

         public PreferentialData.Builder getDataListBuilder(int index) {
            return (PreferentialData.Builder)this.getDataListFieldBuilder().getBuilder(index);
         }

         public PreferentialDataOrBuilder getDataListOrBuilder(int index) {
            return this.dataListBuilder_ == null ? (PreferentialDataOrBuilder)this.dataList_.get(index) : (PreferentialDataOrBuilder)this.dataListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PreferentialDataOrBuilder> getDataListOrBuilderList() {
            return this.dataListBuilder_ != null ? this.dataListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.dataList_);
         }

         public PreferentialData.Builder addDataListBuilder() {
            return (PreferentialData.Builder)this.getDataListFieldBuilder().addBuilder(BenefitMsg.PreferentialData.getDefaultInstance());
         }

         public PreferentialData.Builder addDataListBuilder(int index) {
            return (PreferentialData.Builder)this.getDataListFieldBuilder().addBuilder(index, BenefitMsg.PreferentialData.getDefaultInstance());
         }

         public List<PreferentialData.Builder> getDataListBuilderList() {
            return this.getDataListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PreferentialData, PreferentialData.Builder, PreferentialDataOrBuilder> getDataListFieldBuilder() {
            if (this.dataListBuilder_ == null) {
               this.dataListBuilder_ = new RepeatedFieldBuilderV3(this.dataList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.dataList_ = null;
            }

            return this.dataListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MonthlyPreferentialInfo_8111 extends GeneratedMessageV3 implements C2S_MonthlyPreferentialInfo_8111OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MonthlyPreferentialInfo_8111 DEFAULT_INSTANCE = new C2S_MonthlyPreferentialInfo_8111();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MonthlyPreferentialInfo_8111> PARSER = new AbstractParser<C2S_MonthlyPreferentialInfo_8111>() {
         public C2S_MonthlyPreferentialInfo_8111 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MonthlyPreferentialInfo_8111(input, extensionRegistry);
         }
      };

      private C2S_MonthlyPreferentialInfo_8111(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MonthlyPreferentialInfo_8111() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MonthlyPreferentialInfo_8111();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MonthlyPreferentialInfo_8111(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonthlyPreferentialInfo_8111.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MonthlyPreferentialInfo_8111)) {
            return super.equals(obj);
         } else {
            C2S_MonthlyPreferentialInfo_8111 other = (C2S_MonthlyPreferentialInfo_8111)obj;
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

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialInfo_8111)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialInfo_8111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialInfo_8111)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialInfo_8111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialInfo_8111)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialInfo_8111)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(InputStream input) throws IOException {
         return (C2S_MonthlyPreferentialInfo_8111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyPreferentialInfo_8111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MonthlyPreferentialInfo_8111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyPreferentialInfo_8111)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MonthlyPreferentialInfo_8111)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonthlyPreferentialInfo_8111 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyPreferentialInfo_8111)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MonthlyPreferentialInfo_8111 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MonthlyPreferentialInfo_8111 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MonthlyPreferentialInfo_8111> parser() {
         return PARSER;
      }

      public Parser<C2S_MonthlyPreferentialInfo_8111> getParserForType() {
         return PARSER;
      }

      public C2S_MonthlyPreferentialInfo_8111 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MonthlyPreferentialInfo_8111OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonthlyPreferentialInfo_8111.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_MonthlyPreferentialInfo_8111.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialInfo_8111_descriptor;
         }

         public C2S_MonthlyPreferentialInfo_8111 getDefaultInstanceForType() {
            return BenefitMsg.C2S_MonthlyPreferentialInfo_8111.getDefaultInstance();
         }

         public C2S_MonthlyPreferentialInfo_8111 build() {
            C2S_MonthlyPreferentialInfo_8111 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MonthlyPreferentialInfo_8111 buildPartial() {
            C2S_MonthlyPreferentialInfo_8111 result = new C2S_MonthlyPreferentialInfo_8111(this);
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
            if (other instanceof C2S_MonthlyPreferentialInfo_8111) {
               return this.mergeFrom((C2S_MonthlyPreferentialInfo_8111)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MonthlyPreferentialInfo_8111 other) {
            if (other == BenefitMsg.C2S_MonthlyPreferentialInfo_8111.getDefaultInstance()) {
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
            C2S_MonthlyPreferentialInfo_8111 parsedMessage = null;

            try {
               parsedMessage = (C2S_MonthlyPreferentialInfo_8111)BenefitMsg.C2S_MonthlyPreferentialInfo_8111.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MonthlyPreferentialInfo_8111)e.getUnfinishedMessage();
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

   public static final class S2C_MonthlyPreferentialResult_8112 extends GeneratedMessageV3 implements S2C_MonthlyPreferentialResult_8112OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DATALIST_FIELD_NUMBER = 1;
      private List<PreferentialData> dataList_;
      private byte memoizedIsInitialized;
      private static final S2C_MonthlyPreferentialResult_8112 DEFAULT_INSTANCE = new S2C_MonthlyPreferentialResult_8112();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MonthlyPreferentialResult_8112> PARSER = new AbstractParser<S2C_MonthlyPreferentialResult_8112>() {
         public S2C_MonthlyPreferentialResult_8112 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MonthlyPreferentialResult_8112(input, extensionRegistry);
         }
      };

      private S2C_MonthlyPreferentialResult_8112(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MonthlyPreferentialResult_8112() {
         this.memoizedIsInitialized = -1;
         this.dataList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MonthlyPreferentialResult_8112();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MonthlyPreferentialResult_8112(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.dataList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.dataList_.add(input.readMessage(BenefitMsg.PreferentialData.PARSER, extensionRegistry));
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
                  this.dataList_ = Collections.unmodifiableList(this.dataList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonthlyPreferentialResult_8112.class, Builder.class);
      }

      public List<PreferentialData> getDataListList() {
         return this.dataList_;
      }

      public List<? extends PreferentialDataOrBuilder> getDataListOrBuilderList() {
         return this.dataList_;
      }

      public int getDataListCount() {
         return this.dataList_.size();
      }

      public PreferentialData getDataList(int index) {
         return (PreferentialData)this.dataList_.get(index);
      }

      public PreferentialDataOrBuilder getDataListOrBuilder(int index) {
         return (PreferentialDataOrBuilder)this.dataList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getDataListCount(); ++i) {
               if (!this.getDataList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.dataList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.dataList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.dataList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.dataList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MonthlyPreferentialResult_8112)) {
            return super.equals(obj);
         } else {
            S2C_MonthlyPreferentialResult_8112 other = (S2C_MonthlyPreferentialResult_8112)obj;
            if (!this.getDataListList().equals(other.getDataListList())) {
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
            if (this.getDataListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDataListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialResult_8112)PARSER.parseFrom(data);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialResult_8112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialResult_8112)PARSER.parseFrom(data);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialResult_8112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialResult_8112)PARSER.parseFrom(data);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialResult_8112)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(InputStream input) throws IOException {
         return (S2C_MonthlyPreferentialResult_8112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonthlyPreferentialResult_8112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MonthlyPreferentialResult_8112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonthlyPreferentialResult_8112)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MonthlyPreferentialResult_8112)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonthlyPreferentialResult_8112 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonthlyPreferentialResult_8112)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MonthlyPreferentialResult_8112 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MonthlyPreferentialResult_8112 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MonthlyPreferentialResult_8112> parser() {
         return PARSER;
      }

      public Parser<S2C_MonthlyPreferentialResult_8112> getParserForType() {
         return PARSER;
      }

      public S2C_MonthlyPreferentialResult_8112 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MonthlyPreferentialResult_8112OrBuilder {
         private int bitField0_;
         private List<PreferentialData> dataList_;
         private RepeatedFieldBuilderV3<PreferentialData, PreferentialData.Builder, PreferentialDataOrBuilder> dataListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonthlyPreferentialResult_8112.class, Builder.class);
         }

         private Builder() {
            this.dataList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.dataList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_MonthlyPreferentialResult_8112.alwaysUseFieldBuilders) {
               this.getDataListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dataListBuilder_ == null) {
               this.dataList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.dataListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialResult_8112_descriptor;
         }

         public S2C_MonthlyPreferentialResult_8112 getDefaultInstanceForType() {
            return BenefitMsg.S2C_MonthlyPreferentialResult_8112.getDefaultInstance();
         }

         public S2C_MonthlyPreferentialResult_8112 build() {
            S2C_MonthlyPreferentialResult_8112 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MonthlyPreferentialResult_8112 buildPartial() {
            S2C_MonthlyPreferentialResult_8112 result = new S2C_MonthlyPreferentialResult_8112(this);
            int from_bitField0_ = this.bitField0_;
            if (this.dataListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.dataList_ = Collections.unmodifiableList(this.dataList_);
                  this.bitField0_ &= -2;
               }

               result.dataList_ = this.dataList_;
            } else {
               result.dataList_ = this.dataListBuilder_.build();
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
            if (other instanceof S2C_MonthlyPreferentialResult_8112) {
               return this.mergeFrom((S2C_MonthlyPreferentialResult_8112)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MonthlyPreferentialResult_8112 other) {
            if (other == BenefitMsg.S2C_MonthlyPreferentialResult_8112.getDefaultInstance()) {
               return this;
            } else {
               if (this.dataListBuilder_ == null) {
                  if (!other.dataList_.isEmpty()) {
                     if (this.dataList_.isEmpty()) {
                        this.dataList_ = other.dataList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureDataListIsMutable();
                        this.dataList_.addAll(other.dataList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.dataList_.isEmpty()) {
                  if (this.dataListBuilder_.isEmpty()) {
                     this.dataListBuilder_.dispose();
                     this.dataListBuilder_ = null;
                     this.dataList_ = other.dataList_;
                     this.bitField0_ &= -2;
                     this.dataListBuilder_ = BenefitMsg.S2C_MonthlyPreferentialResult_8112.alwaysUseFieldBuilders ? this.getDataListFieldBuilder() : null;
                  } else {
                     this.dataListBuilder_.addAllMessages(other.dataList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getDataListCount(); ++i) {
               if (!this.getDataList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MonthlyPreferentialResult_8112 parsedMessage = null;

            try {
               parsedMessage = (S2C_MonthlyPreferentialResult_8112)BenefitMsg.S2C_MonthlyPreferentialResult_8112.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MonthlyPreferentialResult_8112)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDataListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.dataList_ = new ArrayList(this.dataList_);
               this.bitField0_ |= 1;
            }

         }

         public List<PreferentialData> getDataListList() {
            return this.dataListBuilder_ == null ? Collections.unmodifiableList(this.dataList_) : this.dataListBuilder_.getMessageList();
         }

         public int getDataListCount() {
            return this.dataListBuilder_ == null ? this.dataList_.size() : this.dataListBuilder_.getCount();
         }

         public PreferentialData getDataList(int index) {
            return this.dataListBuilder_ == null ? (PreferentialData)this.dataList_.get(index) : (PreferentialData)this.dataListBuilder_.getMessage(index);
         }

         public Builder setDataList(int index, PreferentialData value) {
            if (this.dataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataListIsMutable();
               this.dataList_.set(index, value);
               this.onChanged();
            } else {
               this.dataListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDataList(int index, PreferentialData.Builder builderForValue) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               this.dataList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDataList(PreferentialData value) {
            if (this.dataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataListIsMutable();
               this.dataList_.add(value);
               this.onChanged();
            } else {
               this.dataListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDataList(int index, PreferentialData value) {
            if (this.dataListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDataListIsMutable();
               this.dataList_.add(index, value);
               this.onChanged();
            } else {
               this.dataListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDataList(PreferentialData.Builder builderForValue) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               this.dataList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dataListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDataList(int index, PreferentialData.Builder builderForValue) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               this.dataList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDataList(Iterable<? extends PreferentialData> values) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.dataList_);
               this.onChanged();
            } else {
               this.dataListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDataList() {
            if (this.dataListBuilder_ == null) {
               this.dataList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.dataListBuilder_.clear();
            }

            return this;
         }

         public Builder removeDataList(int index) {
            if (this.dataListBuilder_ == null) {
               this.ensureDataListIsMutable();
               this.dataList_.remove(index);
               this.onChanged();
            } else {
               this.dataListBuilder_.remove(index);
            }

            return this;
         }

         public PreferentialData.Builder getDataListBuilder(int index) {
            return (PreferentialData.Builder)this.getDataListFieldBuilder().getBuilder(index);
         }

         public PreferentialDataOrBuilder getDataListOrBuilder(int index) {
            return this.dataListBuilder_ == null ? (PreferentialDataOrBuilder)this.dataList_.get(index) : (PreferentialDataOrBuilder)this.dataListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends PreferentialDataOrBuilder> getDataListOrBuilderList() {
            return this.dataListBuilder_ != null ? this.dataListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.dataList_);
         }

         public PreferentialData.Builder addDataListBuilder() {
            return (PreferentialData.Builder)this.getDataListFieldBuilder().addBuilder(BenefitMsg.PreferentialData.getDefaultInstance());
         }

         public PreferentialData.Builder addDataListBuilder(int index) {
            return (PreferentialData.Builder)this.getDataListFieldBuilder().addBuilder(index, BenefitMsg.PreferentialData.getDefaultInstance());
         }

         public List<PreferentialData.Builder> getDataListBuilderList() {
            return this.getDataListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<PreferentialData, PreferentialData.Builder, PreferentialDataOrBuilder> getDataListFieldBuilder() {
            if (this.dataListBuilder_ == null) {
               this.dataListBuilder_ = new RepeatedFieldBuilderV3(this.dataList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.dataList_ = null;
            }

            return this.dataListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WeeklyPreferentialBuy_8113 extends GeneratedMessageV3 implements C2S_WeeklyPreferentialBuy_8113OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final C2S_WeeklyPreferentialBuy_8113 DEFAULT_INSTANCE = new C2S_WeeklyPreferentialBuy_8113();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WeeklyPreferentialBuy_8113> PARSER = new AbstractParser<C2S_WeeklyPreferentialBuy_8113>() {
         public C2S_WeeklyPreferentialBuy_8113 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WeeklyPreferentialBuy_8113(input, extensionRegistry);
         }
      };

      private C2S_WeeklyPreferentialBuy_8113(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WeeklyPreferentialBuy_8113() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WeeklyPreferentialBuy_8113();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WeeklyPreferentialBuy_8113(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WeeklyPreferentialBuy_8113.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WeeklyPreferentialBuy_8113)) {
            return super.equals(obj);
         } else {
            C2S_WeeklyPreferentialBuy_8113 other = (C2S_WeeklyPreferentialBuy_8113)obj;
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

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialBuy_8113)PARSER.parseFrom(data);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialBuy_8113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialBuy_8113)PARSER.parseFrom(data);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialBuy_8113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialBuy_8113)PARSER.parseFrom(data);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WeeklyPreferentialBuy_8113)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(InputStream input) throws IOException {
         return (C2S_WeeklyPreferentialBuy_8113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeeklyPreferentialBuy_8113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WeeklyPreferentialBuy_8113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeeklyPreferentialBuy_8113)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WeeklyPreferentialBuy_8113)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WeeklyPreferentialBuy_8113 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WeeklyPreferentialBuy_8113)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WeeklyPreferentialBuy_8113 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WeeklyPreferentialBuy_8113 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WeeklyPreferentialBuy_8113> parser() {
         return PARSER;
      }

      public Parser<C2S_WeeklyPreferentialBuy_8113> getParserForType() {
         return PARSER;
      }

      public C2S_WeeklyPreferentialBuy_8113 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WeeklyPreferentialBuy_8113OrBuilder {
         private int bitField0_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WeeklyPreferentialBuy_8113.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_WeeklyPreferentialBuy_8113.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_WeeklyPreferentialBuy_8113_descriptor;
         }

         public C2S_WeeklyPreferentialBuy_8113 getDefaultInstanceForType() {
            return BenefitMsg.C2S_WeeklyPreferentialBuy_8113.getDefaultInstance();
         }

         public C2S_WeeklyPreferentialBuy_8113 build() {
            C2S_WeeklyPreferentialBuy_8113 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WeeklyPreferentialBuy_8113 buildPartial() {
            C2S_WeeklyPreferentialBuy_8113 result = new C2S_WeeklyPreferentialBuy_8113(this);
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
            if (other instanceof C2S_WeeklyPreferentialBuy_8113) {
               return this.mergeFrom((C2S_WeeklyPreferentialBuy_8113)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WeeklyPreferentialBuy_8113 other) {
            if (other == BenefitMsg.C2S_WeeklyPreferentialBuy_8113.getDefaultInstance()) {
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
            C2S_WeeklyPreferentialBuy_8113 parsedMessage = null;

            try {
               parsedMessage = (C2S_WeeklyPreferentialBuy_8113)BenefitMsg.C2S_WeeklyPreferentialBuy_8113.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WeeklyPreferentialBuy_8113)e.getUnfinishedMessage();
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

   public static final class S2C_WeeklyPreferentialBuyResult_8114 extends GeneratedMessageV3 implements S2C_WeeklyPreferentialBuyResult_8114OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int BUYID_FIELD_NUMBER = 2;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final S2C_WeeklyPreferentialBuyResult_8114 DEFAULT_INSTANCE = new S2C_WeeklyPreferentialBuyResult_8114();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WeeklyPreferentialBuyResult_8114> PARSER = new AbstractParser<S2C_WeeklyPreferentialBuyResult_8114>() {
         public S2C_WeeklyPreferentialBuyResult_8114 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WeeklyPreferentialBuyResult_8114(input, extensionRegistry);
         }
      };

      private S2C_WeeklyPreferentialBuyResult_8114(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WeeklyPreferentialBuyResult_8114() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WeeklyPreferentialBuyResult_8114();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WeeklyPreferentialBuyResult_8114(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WeeklyPreferentialBuyResult_8114.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WeeklyPreferentialBuyResult_8114)) {
            return super.equals(obj);
         } else {
            S2C_WeeklyPreferentialBuyResult_8114 other = (S2C_WeeklyPreferentialBuyResult_8114)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasBuyId() != other.hasBuyId()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasBuyId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialBuyResult_8114)PARSER.parseFrom(data);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialBuyResult_8114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialBuyResult_8114)PARSER.parseFrom(data);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialBuyResult_8114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialBuyResult_8114)PARSER.parseFrom(data);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WeeklyPreferentialBuyResult_8114)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(InputStream input) throws IOException {
         return (S2C_WeeklyPreferentialBuyResult_8114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeeklyPreferentialBuyResult_8114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WeeklyPreferentialBuyResult_8114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeeklyPreferentialBuyResult_8114)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WeeklyPreferentialBuyResult_8114)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WeeklyPreferentialBuyResult_8114)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WeeklyPreferentialBuyResult_8114 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WeeklyPreferentialBuyResult_8114 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WeeklyPreferentialBuyResult_8114> parser() {
         return PARSER;
      }

      public Parser<S2C_WeeklyPreferentialBuyResult_8114> getParserForType() {
         return PARSER;
      }

      public S2C_WeeklyPreferentialBuyResult_8114 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WeeklyPreferentialBuyResult_8114OrBuilder {
         private int bitField0_;
         private int result_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WeeklyPreferentialBuyResult_8114.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_WeeklyPreferentialBuyResult_8114.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.buyId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_WeeklyPreferentialBuyResult_8114_descriptor;
         }

         public S2C_WeeklyPreferentialBuyResult_8114 getDefaultInstanceForType() {
            return BenefitMsg.S2C_WeeklyPreferentialBuyResult_8114.getDefaultInstance();
         }

         public S2C_WeeklyPreferentialBuyResult_8114 build() {
            S2C_WeeklyPreferentialBuyResult_8114 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WeeklyPreferentialBuyResult_8114 buildPartial() {
            S2C_WeeklyPreferentialBuyResult_8114 result = new S2C_WeeklyPreferentialBuyResult_8114(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof S2C_WeeklyPreferentialBuyResult_8114) {
               return this.mergeFrom((S2C_WeeklyPreferentialBuyResult_8114)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WeeklyPreferentialBuyResult_8114 other) {
            if (other == BenefitMsg.S2C_WeeklyPreferentialBuyResult_8114.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasBuyId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WeeklyPreferentialBuyResult_8114 parsedMessage = null;

            try {
               parsedMessage = (S2C_WeeklyPreferentialBuyResult_8114)BenefitMsg.S2C_WeeklyPreferentialBuyResult_8114.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WeeklyPreferentialBuyResult_8114)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 2;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -3;
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

   public static final class C2S_MonthlyPreferentialBuy_8115 extends GeneratedMessageV3 implements C2S_MonthlyPreferentialBuy_8115OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final C2S_MonthlyPreferentialBuy_8115 DEFAULT_INSTANCE = new C2S_MonthlyPreferentialBuy_8115();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MonthlyPreferentialBuy_8115> PARSER = new AbstractParser<C2S_MonthlyPreferentialBuy_8115>() {
         public C2S_MonthlyPreferentialBuy_8115 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MonthlyPreferentialBuy_8115(input, extensionRegistry);
         }
      };

      private C2S_MonthlyPreferentialBuy_8115(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MonthlyPreferentialBuy_8115() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MonthlyPreferentialBuy_8115();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MonthlyPreferentialBuy_8115(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonthlyPreferentialBuy_8115.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MonthlyPreferentialBuy_8115)) {
            return super.equals(obj);
         } else {
            C2S_MonthlyPreferentialBuy_8115 other = (C2S_MonthlyPreferentialBuy_8115)obj;
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

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialBuy_8115)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialBuy_8115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialBuy_8115)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialBuy_8115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialBuy_8115)PARSER.parseFrom(data);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MonthlyPreferentialBuy_8115)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(InputStream input) throws IOException {
         return (C2S_MonthlyPreferentialBuy_8115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyPreferentialBuy_8115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MonthlyPreferentialBuy_8115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyPreferentialBuy_8115)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MonthlyPreferentialBuy_8115)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MonthlyPreferentialBuy_8115 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MonthlyPreferentialBuy_8115)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MonthlyPreferentialBuy_8115 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MonthlyPreferentialBuy_8115 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MonthlyPreferentialBuy_8115> parser() {
         return PARSER;
      }

      public Parser<C2S_MonthlyPreferentialBuy_8115> getParserForType() {
         return PARSER;
      }

      public C2S_MonthlyPreferentialBuy_8115 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MonthlyPreferentialBuy_8115OrBuilder {
         private int bitField0_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MonthlyPreferentialBuy_8115.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_MonthlyPreferentialBuy_8115.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_MonthlyPreferentialBuy_8115_descriptor;
         }

         public C2S_MonthlyPreferentialBuy_8115 getDefaultInstanceForType() {
            return BenefitMsg.C2S_MonthlyPreferentialBuy_8115.getDefaultInstance();
         }

         public C2S_MonthlyPreferentialBuy_8115 build() {
            C2S_MonthlyPreferentialBuy_8115 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MonthlyPreferentialBuy_8115 buildPartial() {
            C2S_MonthlyPreferentialBuy_8115 result = new C2S_MonthlyPreferentialBuy_8115(this);
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
            if (other instanceof C2S_MonthlyPreferentialBuy_8115) {
               return this.mergeFrom((C2S_MonthlyPreferentialBuy_8115)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MonthlyPreferentialBuy_8115 other) {
            if (other == BenefitMsg.C2S_MonthlyPreferentialBuy_8115.getDefaultInstance()) {
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
            C2S_MonthlyPreferentialBuy_8115 parsedMessage = null;

            try {
               parsedMessage = (C2S_MonthlyPreferentialBuy_8115)BenefitMsg.C2S_MonthlyPreferentialBuy_8115.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MonthlyPreferentialBuy_8115)e.getUnfinishedMessage();
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

   public static final class S2C_MonthlyPreferentialBuyResult_8116 extends GeneratedMessageV3 implements S2C_MonthlyPreferentialBuyResult_8116OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int BUYID_FIELD_NUMBER = 2;
      private int buyId_;
      private byte memoizedIsInitialized;
      private static final S2C_MonthlyPreferentialBuyResult_8116 DEFAULT_INSTANCE = new S2C_MonthlyPreferentialBuyResult_8116();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MonthlyPreferentialBuyResult_8116> PARSER = new AbstractParser<S2C_MonthlyPreferentialBuyResult_8116>() {
         public S2C_MonthlyPreferentialBuyResult_8116 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MonthlyPreferentialBuyResult_8116(input, extensionRegistry);
         }
      };

      private S2C_MonthlyPreferentialBuyResult_8116(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MonthlyPreferentialBuyResult_8116() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MonthlyPreferentialBuyResult_8116();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MonthlyPreferentialBuyResult_8116(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonthlyPreferentialBuyResult_8116.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MonthlyPreferentialBuyResult_8116)) {
            return super.equals(obj);
         } else {
            S2C_MonthlyPreferentialBuyResult_8116 other = (S2C_MonthlyPreferentialBuyResult_8116)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasBuyId() != other.hasBuyId()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasBuyId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialBuyResult_8116)PARSER.parseFrom(data);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialBuyResult_8116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialBuyResult_8116)PARSER.parseFrom(data);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialBuyResult_8116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialBuyResult_8116)PARSER.parseFrom(data);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MonthlyPreferentialBuyResult_8116)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(InputStream input) throws IOException {
         return (S2C_MonthlyPreferentialBuyResult_8116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonthlyPreferentialBuyResult_8116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MonthlyPreferentialBuyResult_8116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonthlyPreferentialBuyResult_8116)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MonthlyPreferentialBuyResult_8116)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MonthlyPreferentialBuyResult_8116)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MonthlyPreferentialBuyResult_8116 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MonthlyPreferentialBuyResult_8116 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MonthlyPreferentialBuyResult_8116> parser() {
         return PARSER;
      }

      public Parser<S2C_MonthlyPreferentialBuyResult_8116> getParserForType() {
         return PARSER;
      }

      public S2C_MonthlyPreferentialBuyResult_8116 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MonthlyPreferentialBuyResult_8116OrBuilder {
         private int bitField0_;
         private int result_;
         private int buyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MonthlyPreferentialBuyResult_8116.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_MonthlyPreferentialBuyResult_8116.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.buyId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_MonthlyPreferentialBuyResult_8116_descriptor;
         }

         public S2C_MonthlyPreferentialBuyResult_8116 getDefaultInstanceForType() {
            return BenefitMsg.S2C_MonthlyPreferentialBuyResult_8116.getDefaultInstance();
         }

         public S2C_MonthlyPreferentialBuyResult_8116 build() {
            S2C_MonthlyPreferentialBuyResult_8116 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MonthlyPreferentialBuyResult_8116 buildPartial() {
            S2C_MonthlyPreferentialBuyResult_8116 result = new S2C_MonthlyPreferentialBuyResult_8116(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof S2C_MonthlyPreferentialBuyResult_8116) {
               return this.mergeFrom((S2C_MonthlyPreferentialBuyResult_8116)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MonthlyPreferentialBuyResult_8116 other) {
            if (other == BenefitMsg.S2C_MonthlyPreferentialBuyResult_8116.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasBuyId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MonthlyPreferentialBuyResult_8116 parsedMessage = null;

            try {
               parsedMessage = (S2C_MonthlyPreferentialBuyResult_8116)BenefitMsg.S2C_MonthlyPreferentialBuyResult_8116.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MonthlyPreferentialBuyResult_8116)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 2;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -3;
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

   public static final class GrowFundData extends GeneratedMessageV3 implements GrowFundDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ISBUY_FIELD_NUMBER = 2;
      private boolean isBuy_;
      public static final int GOTIDS_FIELD_NUMBER = 3;
      private Internal.IntList gotIds_;
      private byte memoizedIsInitialized;
      private static final GrowFundData DEFAULT_INSTANCE = new GrowFundData();
      /** @deprecated */
      @Deprecated
      public static final Parser<GrowFundData> PARSER = new AbstractParser<GrowFundData>() {
         public GrowFundData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GrowFundData(input, extensionRegistry);
         }
      };

      private GrowFundData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GrowFundData() {
         this.memoizedIsInitialized = -1;
         this.gotIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GrowFundData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GrowFundData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isBuy_ = input.readBool();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotIds_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotIds_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.gotIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_GrowFundData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_GrowFundData_fieldAccessorTable.ensureFieldAccessorsInitialized(GrowFundData.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasIsBuy() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsBuy() {
         return this.isBuy_;
      }

      public List<Integer> getGotIdsList() {
         return this.gotIds_;
      }

      public int getGotIdsCount() {
         return this.gotIds_.size();
      }

      public int getGotIds(int index) {
         return this.gotIds_.getInt(index);
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
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isBuy_);
         }

         for(int i = 0; i < this.gotIds_.size(); ++i) {
            output.writeInt32(3, this.gotIds_.getInt(i));
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
               size += CodedOutputStream.computeBoolSize(2, this.isBuy_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GrowFundData)) {
            return super.equals(obj);
         } else {
            GrowFundData other = (GrowFundData)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasIsBuy() != other.hasIsBuy()) {
               return false;
            } else if (this.hasIsBuy() && this.getIsBuy() != other.getIsBuy()) {
               return false;
            } else if (!this.getGotIdsList().equals(other.getGotIdsList())) {
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

            if (this.hasIsBuy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsBuy());
            }

            if (this.getGotIdsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GrowFundData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GrowFundData)PARSER.parseFrom(data);
      }

      public static GrowFundData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GrowFundData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GrowFundData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GrowFundData)PARSER.parseFrom(data);
      }

      public static GrowFundData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GrowFundData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GrowFundData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GrowFundData)PARSER.parseFrom(data);
      }

      public static GrowFundData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GrowFundData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GrowFundData parseFrom(InputStream input) throws IOException {
         return (GrowFundData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GrowFundData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GrowFundData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GrowFundData parseDelimitedFrom(InputStream input) throws IOException {
         return (GrowFundData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GrowFundData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GrowFundData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GrowFundData parseFrom(CodedInputStream input) throws IOException {
         return (GrowFundData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GrowFundData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GrowFundData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GrowFundData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GrowFundData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GrowFundData> parser() {
         return PARSER;
      }

      public Parser<GrowFundData> getParserForType() {
         return PARSER;
      }

      public GrowFundData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GrowFundDataOrBuilder {
         private int bitField0_;
         private int type_;
         private boolean isBuy_;
         private Internal.IntList gotIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_GrowFundData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_GrowFundData_fieldAccessorTable.ensureFieldAccessorsInitialized(GrowFundData.class, Builder.class);
         }

         private Builder() {
            this.gotIds_ = BenefitMsg.GrowFundData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotIds_ = BenefitMsg.GrowFundData.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.GrowFundData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.isBuy_ = false;
            this.bitField0_ &= -3;
            this.gotIds_ = BenefitMsg.GrowFundData.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_GrowFundData_descriptor;
         }

         public GrowFundData getDefaultInstanceForType() {
            return BenefitMsg.GrowFundData.getDefaultInstance();
         }

         public GrowFundData build() {
            GrowFundData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GrowFundData buildPartial() {
            GrowFundData result = new GrowFundData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isBuy_ = this.isBuy_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotIds_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotIds_ = this.gotIds_;
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
            if (other instanceof GrowFundData) {
               return this.mergeFrom((GrowFundData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GrowFundData other) {
            if (other == BenefitMsg.GrowFundData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasIsBuy()) {
                  this.setIsBuy(other.getIsBuy());
               }

               if (!other.gotIds_.isEmpty()) {
                  if (this.gotIds_.isEmpty()) {
                     this.gotIds_ = other.gotIds_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotIdsIsMutable();
                     this.gotIds_.addAll(other.gotIds_);
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
               return this.hasIsBuy();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GrowFundData parsedMessage = null;

            try {
               parsedMessage = (GrowFundData)BenefitMsg.GrowFundData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GrowFundData)e.getUnfinishedMessage();
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

         public boolean hasIsBuy() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsBuy() {
            return this.isBuy_;
         }

         public Builder setIsBuy(boolean value) {
            this.bitField0_ |= 2;
            this.isBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsBuy() {
            this.bitField0_ &= -3;
            this.isBuy_ = false;
            this.onChanged();
            return this;
         }

         private void ensureGotIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotIds_ = BenefitMsg.GrowFundData.mutableCopy(this.gotIds_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotIdsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotIds_) : this.gotIds_);
         }

         public int getGotIdsCount() {
            return this.gotIds_.size();
         }

         public int getGotIds(int index) {
            return this.gotIds_.getInt(index);
         }

         public Builder setGotIds(int index, int value) {
            this.ensureGotIdsIsMutable();
            this.gotIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotIds(int value) {
            this.ensureGotIdsIsMutable();
            this.gotIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotIds(Iterable<? extends Integer> values) {
            this.ensureGotIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotIds_);
            this.onChanged();
            return this;
         }

         public Builder clearGotIds() {
            this.gotIds_ = BenefitMsg.GrowFundData.emptyIntList();
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

   public static final class C2S_GrowFundInfo_8117 extends GeneratedMessageV3 implements C2S_GrowFundInfo_8117OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GrowFundInfo_8117 DEFAULT_INSTANCE = new C2S_GrowFundInfo_8117();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GrowFundInfo_8117> PARSER = new AbstractParser<C2S_GrowFundInfo_8117>() {
         public C2S_GrowFundInfo_8117 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GrowFundInfo_8117(input, extensionRegistry);
         }
      };

      private C2S_GrowFundInfo_8117(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GrowFundInfo_8117() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GrowFundInfo_8117();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GrowFundInfo_8117(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GrowFundInfo_8117.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GrowFundInfo_8117)) {
            return super.equals(obj);
         } else {
            C2S_GrowFundInfo_8117 other = (C2S_GrowFundInfo_8117)obj;
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

      public static C2S_GrowFundInfo_8117 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GrowFundInfo_8117)PARSER.parseFrom(data);
      }

      public static C2S_GrowFundInfo_8117 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GrowFundInfo_8117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GrowFundInfo_8117 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GrowFundInfo_8117)PARSER.parseFrom(data);
      }

      public static C2S_GrowFundInfo_8117 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GrowFundInfo_8117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GrowFundInfo_8117 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GrowFundInfo_8117)PARSER.parseFrom(data);
      }

      public static C2S_GrowFundInfo_8117 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GrowFundInfo_8117)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GrowFundInfo_8117 parseFrom(InputStream input) throws IOException {
         return (C2S_GrowFundInfo_8117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GrowFundInfo_8117 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GrowFundInfo_8117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GrowFundInfo_8117 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GrowFundInfo_8117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GrowFundInfo_8117 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GrowFundInfo_8117)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GrowFundInfo_8117 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GrowFundInfo_8117)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GrowFundInfo_8117 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GrowFundInfo_8117)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GrowFundInfo_8117 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GrowFundInfo_8117 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GrowFundInfo_8117> parser() {
         return PARSER;
      }

      public Parser<C2S_GrowFundInfo_8117> getParserForType() {
         return PARSER;
      }

      public C2S_GrowFundInfo_8117 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GrowFundInfo_8117OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GrowFundInfo_8117.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_GrowFundInfo_8117.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundInfo_8117_descriptor;
         }

         public C2S_GrowFundInfo_8117 getDefaultInstanceForType() {
            return BenefitMsg.C2S_GrowFundInfo_8117.getDefaultInstance();
         }

         public C2S_GrowFundInfo_8117 build() {
            C2S_GrowFundInfo_8117 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GrowFundInfo_8117 buildPartial() {
            C2S_GrowFundInfo_8117 result = new C2S_GrowFundInfo_8117(this);
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
            if (other instanceof C2S_GrowFundInfo_8117) {
               return this.mergeFrom((C2S_GrowFundInfo_8117)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GrowFundInfo_8117 other) {
            if (other == BenefitMsg.C2S_GrowFundInfo_8117.getDefaultInstance()) {
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
            C2S_GrowFundInfo_8117 parsedMessage = null;

            try {
               parsedMessage = (C2S_GrowFundInfo_8117)BenefitMsg.C2S_GrowFundInfo_8117.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GrowFundInfo_8117)e.getUnfinishedMessage();
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

   public static final class S2C_GrowFundResult_8118 extends GeneratedMessageV3 implements S2C_GrowFundResult_8118OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DATA_FIELD_NUMBER = 1;
      private List<GrowFundData> data_;
      private byte memoizedIsInitialized;
      private static final S2C_GrowFundResult_8118 DEFAULT_INSTANCE = new S2C_GrowFundResult_8118();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GrowFundResult_8118> PARSER = new AbstractParser<S2C_GrowFundResult_8118>() {
         public S2C_GrowFundResult_8118 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GrowFundResult_8118(input, extensionRegistry);
         }
      };

      private S2C_GrowFundResult_8118(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GrowFundResult_8118() {
         this.memoizedIsInitialized = -1;
         this.data_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GrowFundResult_8118();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GrowFundResult_8118(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.data_.add(input.readMessage(BenefitMsg.GrowFundData.PARSER, extensionRegistry));
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GrowFundResult_8118.class, Builder.class);
      }

      public List<GrowFundData> getDataList() {
         return this.data_;
      }

      public List<? extends GrowFundDataOrBuilder> getDataOrBuilderList() {
         return this.data_;
      }

      public int getDataCount() {
         return this.data_.size();
      }

      public GrowFundData getData(int index) {
         return (GrowFundData)this.data_.get(index);
      }

      public GrowFundDataOrBuilder getDataOrBuilder(int index) {
         return (GrowFundDataOrBuilder)this.data_.get(index);
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
         } else if (!(obj instanceof S2C_GrowFundResult_8118)) {
            return super.equals(obj);
         } else {
            S2C_GrowFundResult_8118 other = (S2C_GrowFundResult_8118)obj;
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

      public static S2C_GrowFundResult_8118 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GrowFundResult_8118)PARSER.parseFrom(data);
      }

      public static S2C_GrowFundResult_8118 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GrowFundResult_8118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GrowFundResult_8118 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GrowFundResult_8118)PARSER.parseFrom(data);
      }

      public static S2C_GrowFundResult_8118 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GrowFundResult_8118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GrowFundResult_8118 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GrowFundResult_8118)PARSER.parseFrom(data);
      }

      public static S2C_GrowFundResult_8118 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GrowFundResult_8118)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GrowFundResult_8118 parseFrom(InputStream input) throws IOException {
         return (S2C_GrowFundResult_8118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GrowFundResult_8118 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GrowFundResult_8118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GrowFundResult_8118 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GrowFundResult_8118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GrowFundResult_8118 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GrowFundResult_8118)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GrowFundResult_8118 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GrowFundResult_8118)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GrowFundResult_8118 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GrowFundResult_8118)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GrowFundResult_8118 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GrowFundResult_8118 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GrowFundResult_8118> parser() {
         return PARSER;
      }

      public Parser<S2C_GrowFundResult_8118> getParserForType() {
         return PARSER;
      }

      public S2C_GrowFundResult_8118 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GrowFundResult_8118OrBuilder {
         private int bitField0_;
         private List<GrowFundData> data_;
         private RepeatedFieldBuilderV3<GrowFundData, GrowFundData.Builder, GrowFundDataOrBuilder> dataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GrowFundResult_8118.class, Builder.class);
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
            if (BenefitMsg.S2C_GrowFundResult_8118.alwaysUseFieldBuilders) {
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
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundResult_8118_descriptor;
         }

         public S2C_GrowFundResult_8118 getDefaultInstanceForType() {
            return BenefitMsg.S2C_GrowFundResult_8118.getDefaultInstance();
         }

         public S2C_GrowFundResult_8118 build() {
            S2C_GrowFundResult_8118 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GrowFundResult_8118 buildPartial() {
            S2C_GrowFundResult_8118 result = new S2C_GrowFundResult_8118(this);
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
            if (other instanceof S2C_GrowFundResult_8118) {
               return this.mergeFrom((S2C_GrowFundResult_8118)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GrowFundResult_8118 other) {
            if (other == BenefitMsg.S2C_GrowFundResult_8118.getDefaultInstance()) {
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
                     this.dataBuilder_ = BenefitMsg.S2C_GrowFundResult_8118.alwaysUseFieldBuilders ? this.getDataFieldBuilder() : null;
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
            S2C_GrowFundResult_8118 parsedMessage = null;

            try {
               parsedMessage = (S2C_GrowFundResult_8118)BenefitMsg.S2C_GrowFundResult_8118.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GrowFundResult_8118)e.getUnfinishedMessage();
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

         public List<GrowFundData> getDataList() {
            return this.dataBuilder_ == null ? Collections.unmodifiableList(this.data_) : this.dataBuilder_.getMessageList();
         }

         public int getDataCount() {
            return this.dataBuilder_ == null ? this.data_.size() : this.dataBuilder_.getCount();
         }

         public GrowFundData getData(int index) {
            return this.dataBuilder_ == null ? (GrowFundData)this.data_.get(index) : (GrowFundData)this.dataBuilder_.getMessage(index);
         }

         public Builder setData(int index, GrowFundData value) {
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

         public Builder setData(int index, GrowFundData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addData(GrowFundData value) {
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

         public Builder addData(int index, GrowFundData value) {
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

         public Builder addData(GrowFundData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addData(int index, GrowFundData.Builder builderForValue) {
            if (this.dataBuilder_ == null) {
               this.ensureDataIsMutable();
               this.data_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllData(Iterable<? extends GrowFundData> values) {
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

         public GrowFundData.Builder getDataBuilder(int index) {
            return (GrowFundData.Builder)this.getDataFieldBuilder().getBuilder(index);
         }

         public GrowFundDataOrBuilder getDataOrBuilder(int index) {
            return this.dataBuilder_ == null ? (GrowFundDataOrBuilder)this.data_.get(index) : (GrowFundDataOrBuilder)this.dataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GrowFundDataOrBuilder> getDataOrBuilderList() {
            return this.dataBuilder_ != null ? this.dataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
         }

         public GrowFundData.Builder addDataBuilder() {
            return (GrowFundData.Builder)this.getDataFieldBuilder().addBuilder(BenefitMsg.GrowFundData.getDefaultInstance());
         }

         public GrowFundData.Builder addDataBuilder(int index) {
            return (GrowFundData.Builder)this.getDataFieldBuilder().addBuilder(index, BenefitMsg.GrowFundData.getDefaultInstance());
         }

         public List<GrowFundData.Builder> getDataBuilderList() {
            return this.getDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GrowFundData, GrowFundData.Builder, GrowFundDataOrBuilder> getDataFieldBuilder() {
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

   public static final class C2S_GrowFundReward_8119 extends GeneratedMessageV3 implements C2S_GrowFundReward_8119OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_GrowFundReward_8119 DEFAULT_INSTANCE = new C2S_GrowFundReward_8119();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GrowFundReward_8119> PARSER = new AbstractParser<C2S_GrowFundReward_8119>() {
         public C2S_GrowFundReward_8119 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GrowFundReward_8119(input, extensionRegistry);
         }
      };

      private C2S_GrowFundReward_8119(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GrowFundReward_8119() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GrowFundReward_8119();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GrowFundReward_8119(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GrowFundReward_8119.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GrowFundReward_8119)) {
            return super.equals(obj);
         } else {
            C2S_GrowFundReward_8119 other = (C2S_GrowFundReward_8119)obj;
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

      public static C2S_GrowFundReward_8119 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GrowFundReward_8119)PARSER.parseFrom(data);
      }

      public static C2S_GrowFundReward_8119 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GrowFundReward_8119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GrowFundReward_8119 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GrowFundReward_8119)PARSER.parseFrom(data);
      }

      public static C2S_GrowFundReward_8119 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GrowFundReward_8119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GrowFundReward_8119 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GrowFundReward_8119)PARSER.parseFrom(data);
      }

      public static C2S_GrowFundReward_8119 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GrowFundReward_8119)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GrowFundReward_8119 parseFrom(InputStream input) throws IOException {
         return (C2S_GrowFundReward_8119)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GrowFundReward_8119 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GrowFundReward_8119)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GrowFundReward_8119 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GrowFundReward_8119)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GrowFundReward_8119 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GrowFundReward_8119)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GrowFundReward_8119 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GrowFundReward_8119)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GrowFundReward_8119 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GrowFundReward_8119)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GrowFundReward_8119 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GrowFundReward_8119 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GrowFundReward_8119> parser() {
         return PARSER;
      }

      public Parser<C2S_GrowFundReward_8119> getParserForType() {
         return PARSER;
      }

      public C2S_GrowFundReward_8119 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GrowFundReward_8119OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GrowFundReward_8119.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_GrowFundReward_8119.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_GrowFundReward_8119_descriptor;
         }

         public C2S_GrowFundReward_8119 getDefaultInstanceForType() {
            return BenefitMsg.C2S_GrowFundReward_8119.getDefaultInstance();
         }

         public C2S_GrowFundReward_8119 build() {
            C2S_GrowFundReward_8119 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GrowFundReward_8119 buildPartial() {
            C2S_GrowFundReward_8119 result = new C2S_GrowFundReward_8119(this);
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
            if (other instanceof C2S_GrowFundReward_8119) {
               return this.mergeFrom((C2S_GrowFundReward_8119)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GrowFundReward_8119 other) {
            if (other == BenefitMsg.C2S_GrowFundReward_8119.getDefaultInstance()) {
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
            C2S_GrowFundReward_8119 parsedMessage = null;

            try {
               parsedMessage = (C2S_GrowFundReward_8119)BenefitMsg.C2S_GrowFundReward_8119.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GrowFundReward_8119)e.getUnfinishedMessage();
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

   public static final class S2C_GrowFundRewardResult_8120 extends GeneratedMessageV3 implements S2C_GrowFundRewardResult_8120OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_GrowFundRewardResult_8120 DEFAULT_INSTANCE = new S2C_GrowFundRewardResult_8120();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GrowFundRewardResult_8120> PARSER = new AbstractParser<S2C_GrowFundRewardResult_8120>() {
         public S2C_GrowFundRewardResult_8120 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GrowFundRewardResult_8120(input, extensionRegistry);
         }
      };

      private S2C_GrowFundRewardResult_8120(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GrowFundRewardResult_8120() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GrowFundRewardResult_8120();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GrowFundRewardResult_8120(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GrowFundRewardResult_8120.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GrowFundRewardResult_8120)) {
            return super.equals(obj);
         } else {
            S2C_GrowFundRewardResult_8120 other = (S2C_GrowFundRewardResult_8120)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GrowFundRewardResult_8120)PARSER.parseFrom(data);
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GrowFundRewardResult_8120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GrowFundRewardResult_8120)PARSER.parseFrom(data);
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GrowFundRewardResult_8120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GrowFundRewardResult_8120)PARSER.parseFrom(data);
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GrowFundRewardResult_8120)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(InputStream input) throws IOException {
         return (S2C_GrowFundRewardResult_8120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GrowFundRewardResult_8120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GrowFundRewardResult_8120 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GrowFundRewardResult_8120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GrowFundRewardResult_8120 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GrowFundRewardResult_8120)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GrowFundRewardResult_8120)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GrowFundRewardResult_8120 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GrowFundRewardResult_8120)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GrowFundRewardResult_8120 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GrowFundRewardResult_8120 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GrowFundRewardResult_8120> parser() {
         return PARSER;
      }

      public Parser<S2C_GrowFundRewardResult_8120> getParserForType() {
         return PARSER;
      }

      public S2C_GrowFundRewardResult_8120 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GrowFundRewardResult_8120OrBuilder {
         private int bitField0_;
         private int result_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GrowFundRewardResult_8120.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_GrowFundRewardResult_8120.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundRewardResult_8120_descriptor;
         }

         public S2C_GrowFundRewardResult_8120 getDefaultInstanceForType() {
            return BenefitMsg.S2C_GrowFundRewardResult_8120.getDefaultInstance();
         }

         public S2C_GrowFundRewardResult_8120 build() {
            S2C_GrowFundRewardResult_8120 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GrowFundRewardResult_8120 buildPartial() {
            S2C_GrowFundRewardResult_8120 result = new S2C_GrowFundRewardResult_8120(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof S2C_GrowFundRewardResult_8120) {
               return this.mergeFrom((S2C_GrowFundRewardResult_8120)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GrowFundRewardResult_8120 other) {
            if (other == BenefitMsg.S2C_GrowFundRewardResult_8120.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GrowFundRewardResult_8120 parsedMessage = null;

            try {
               parsedMessage = (S2C_GrowFundRewardResult_8120)BenefitMsg.S2C_GrowFundRewardResult_8120.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GrowFundRewardResult_8120)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getId() {
            return this.id_;
         }

         public Builder setId(int value) {
            this.bitField0_ |= 2;
            this.id_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.bitField0_ &= -3;
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

   public static final class S2C_GrowFundBuyNotify_8121 extends GeneratedMessageV3 implements S2C_GrowFundBuyNotify_8121OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ISBUY_FIELD_NUMBER = 2;
      private boolean isBuy_;
      private byte memoizedIsInitialized;
      private static final S2C_GrowFundBuyNotify_8121 DEFAULT_INSTANCE = new S2C_GrowFundBuyNotify_8121();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GrowFundBuyNotify_8121> PARSER = new AbstractParser<S2C_GrowFundBuyNotify_8121>() {
         public S2C_GrowFundBuyNotify_8121 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GrowFundBuyNotify_8121(input, extensionRegistry);
         }
      };

      private S2C_GrowFundBuyNotify_8121(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GrowFundBuyNotify_8121() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GrowFundBuyNotify_8121();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GrowFundBuyNotify_8121(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GrowFundBuyNotify_8121.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasIsBuy() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isBuy_);
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
               size += CodedOutputStream.computeBoolSize(2, this.isBuy_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GrowFundBuyNotify_8121)) {
            return super.equals(obj);
         } else {
            S2C_GrowFundBuyNotify_8121 other = (S2C_GrowFundBuyNotify_8121)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasIsBuy() != other.hasIsBuy()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasIsBuy()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsBuy());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GrowFundBuyNotify_8121)PARSER.parseFrom(data);
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GrowFundBuyNotify_8121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GrowFundBuyNotify_8121)PARSER.parseFrom(data);
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GrowFundBuyNotify_8121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GrowFundBuyNotify_8121)PARSER.parseFrom(data);
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GrowFundBuyNotify_8121)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(InputStream input) throws IOException {
         return (S2C_GrowFundBuyNotify_8121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GrowFundBuyNotify_8121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GrowFundBuyNotify_8121 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GrowFundBuyNotify_8121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GrowFundBuyNotify_8121 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GrowFundBuyNotify_8121)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GrowFundBuyNotify_8121)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GrowFundBuyNotify_8121 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GrowFundBuyNotify_8121)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GrowFundBuyNotify_8121 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GrowFundBuyNotify_8121 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GrowFundBuyNotify_8121> parser() {
         return PARSER;
      }

      public Parser<S2C_GrowFundBuyNotify_8121> getParserForType() {
         return PARSER;
      }

      public S2C_GrowFundBuyNotify_8121 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GrowFundBuyNotify_8121OrBuilder {
         private int bitField0_;
         private int type_;
         private boolean isBuy_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GrowFundBuyNotify_8121.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_GrowFundBuyNotify_8121.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.isBuy_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_GrowFundBuyNotify_8121_descriptor;
         }

         public S2C_GrowFundBuyNotify_8121 getDefaultInstanceForType() {
            return BenefitMsg.S2C_GrowFundBuyNotify_8121.getDefaultInstance();
         }

         public S2C_GrowFundBuyNotify_8121 build() {
            S2C_GrowFundBuyNotify_8121 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GrowFundBuyNotify_8121 buildPartial() {
            S2C_GrowFundBuyNotify_8121 result = new S2C_GrowFundBuyNotify_8121(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isBuy_ = this.isBuy_;
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
            if (other instanceof S2C_GrowFundBuyNotify_8121) {
               return this.mergeFrom((S2C_GrowFundBuyNotify_8121)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GrowFundBuyNotify_8121 other) {
            if (other == BenefitMsg.S2C_GrowFundBuyNotify_8121.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasIsBuy()) {
                  this.setIsBuy(other.getIsBuy());
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
               return this.hasIsBuy();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GrowFundBuyNotify_8121 parsedMessage = null;

            try {
               parsedMessage = (S2C_GrowFundBuyNotify_8121)BenefitMsg.S2C_GrowFundBuyNotify_8121.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GrowFundBuyNotify_8121)e.getUnfinishedMessage();
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

         public boolean hasIsBuy() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsBuy() {
            return this.isBuy_;
         }

         public Builder setIsBuy(boolean value) {
            this.bitField0_ |= 2;
            this.isBuy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsBuy() {
            this.bitField0_ &= -3;
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

   public static final class C2S_RecommendInfo_8122 extends GeneratedMessageV3 implements C2S_RecommendInfo_8122OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_RecommendInfo_8122 DEFAULT_INSTANCE = new C2S_RecommendInfo_8122();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecommendInfo_8122> PARSER = new AbstractParser<C2S_RecommendInfo_8122>() {
         public C2S_RecommendInfo_8122 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecommendInfo_8122(input, extensionRegistry);
         }
      };

      private C2S_RecommendInfo_8122(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecommendInfo_8122() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecommendInfo_8122();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecommendInfo_8122(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecommendInfo_8122.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerId_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecommendInfo_8122)) {
            return super.equals(obj);
         } else {
            C2S_RecommendInfo_8122 other = (C2S_RecommendInfo_8122)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecommendInfo_8122 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecommendInfo_8122)PARSER.parseFrom(data);
      }

      public static C2S_RecommendInfo_8122 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecommendInfo_8122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecommendInfo_8122 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecommendInfo_8122)PARSER.parseFrom(data);
      }

      public static C2S_RecommendInfo_8122 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecommendInfo_8122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecommendInfo_8122 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecommendInfo_8122)PARSER.parseFrom(data);
      }

      public static C2S_RecommendInfo_8122 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecommendInfo_8122)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecommendInfo_8122 parseFrom(InputStream input) throws IOException {
         return (C2S_RecommendInfo_8122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecommendInfo_8122 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecommendInfo_8122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecommendInfo_8122 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecommendInfo_8122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecommendInfo_8122 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecommendInfo_8122)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecommendInfo_8122 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecommendInfo_8122)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecommendInfo_8122 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecommendInfo_8122)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecommendInfo_8122 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecommendInfo_8122 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecommendInfo_8122> parser() {
         return PARSER;
      }

      public Parser<C2S_RecommendInfo_8122> getParserForType() {
         return PARSER;
      }

      public C2S_RecommendInfo_8122 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecommendInfo_8122OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecommendInfo_8122.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_RecommendInfo_8122.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendInfo_8122_descriptor;
         }

         public C2S_RecommendInfo_8122 getDefaultInstanceForType() {
            return BenefitMsg.C2S_RecommendInfo_8122.getDefaultInstance();
         }

         public C2S_RecommendInfo_8122 build() {
            C2S_RecommendInfo_8122 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecommendInfo_8122 buildPartial() {
            C2S_RecommendInfo_8122 result = new C2S_RecommendInfo_8122(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof C2S_RecommendInfo_8122) {
               return this.mergeFrom((C2S_RecommendInfo_8122)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecommendInfo_8122 other) {
            if (other == BenefitMsg.C2S_RecommendInfo_8122.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecommendInfo_8122 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecommendInfo_8122)BenefitMsg.C2S_RecommendInfo_8122.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecommendInfo_8122)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class RecommendTask extends GeneratedMessageV3 implements RecommendTaskOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      public static final int FINISHCOUNT_FIELD_NUMBER = 2;
      private int finishCount_;
      public static final int REWARDCOUNT_FIELD_NUMBER = 3;
      private int rewardCount_;
      private byte memoizedIsInitialized;
      private static final RecommendTask DEFAULT_INSTANCE = new RecommendTask();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecommendTask> PARSER = new AbstractParser<RecommendTask>() {
         public RecommendTask parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecommendTask(input, extensionRegistry);
         }
      };

      private RecommendTask(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecommendTask() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecommendTask();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecommendTask(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.finishCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.rewardCount_ = input.readInt32();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendTask_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendTask_fieldAccessorTable.ensureFieldAccessorsInitialized(RecommendTask.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public boolean hasFinishCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFinishCount() {
         return this.finishCount_;
      }

      public boolean hasRewardCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRewardCount() {
         return this.rewardCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFinishCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.finishCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.rewardCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.finishCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.rewardCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecommendTask)) {
            return super.equals(obj);
         } else {
            RecommendTask other = (RecommendTask)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else if (this.hasFinishCount() != other.hasFinishCount()) {
               return false;
            } else if (this.hasFinishCount() && this.getFinishCount() != other.getFinishCount()) {
               return false;
            } else if (this.hasRewardCount() != other.hasRewardCount()) {
               return false;
            } else if (this.hasRewardCount() && this.getRewardCount() != other.getRewardCount()) {
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
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            if (this.hasFinishCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFinishCount();
            }

            if (this.hasRewardCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRewardCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecommendTask parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecommendTask)PARSER.parseFrom(data);
      }

      public static RecommendTask parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecommendTask)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecommendTask parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecommendTask)PARSER.parseFrom(data);
      }

      public static RecommendTask parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecommendTask)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecommendTask parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecommendTask)PARSER.parseFrom(data);
      }

      public static RecommendTask parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecommendTask)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecommendTask parseFrom(InputStream input) throws IOException {
         return (RecommendTask)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecommendTask parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecommendTask)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecommendTask parseDelimitedFrom(InputStream input) throws IOException {
         return (RecommendTask)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecommendTask parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecommendTask)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecommendTask parseFrom(CodedInputStream input) throws IOException {
         return (RecommendTask)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecommendTask parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecommendTask)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecommendTask prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecommendTask getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecommendTask> parser() {
         return PARSER;
      }

      public Parser<RecommendTask> getParserForType() {
         return PARSER;
      }

      public RecommendTask getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecommendTaskOrBuilder {
         private int bitField0_;
         private int taskId_;
         private int finishCount_;
         private int rewardCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendTask_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendTask_fieldAccessorTable.ensureFieldAccessorsInitialized(RecommendTask.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.RecommendTask.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            this.finishCount_ = 0;
            this.bitField0_ &= -3;
            this.rewardCount_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendTask_descriptor;
         }

         public RecommendTask getDefaultInstanceForType() {
            return BenefitMsg.RecommendTask.getDefaultInstance();
         }

         public RecommendTask build() {
            RecommendTask result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecommendTask buildPartial() {
            RecommendTask result = new RecommendTask(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.finishCount_ = this.finishCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.rewardCount_ = this.rewardCount_;
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
            if (other instanceof RecommendTask) {
               return this.mergeFrom((RecommendTask)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecommendTask other) {
            if (other == BenefitMsg.RecommendTask.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               if (other.hasFinishCount()) {
                  this.setFinishCount(other.getFinishCount());
               }

               if (other.hasRewardCount()) {
                  this.setRewardCount(other.getRewardCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTaskId()) {
               return false;
            } else if (!this.hasFinishCount()) {
               return false;
            } else {
               return this.hasRewardCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecommendTask parsedMessage = null;

            try {
               parsedMessage = (RecommendTask)BenefitMsg.RecommendTask.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecommendTask)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFinishCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFinishCount() {
            return this.finishCount_;
         }

         public Builder setFinishCount(int value) {
            this.bitField0_ |= 2;
            this.finishCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFinishCount() {
            this.bitField0_ &= -3;
            this.finishCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRewardCount() {
            return this.rewardCount_;
         }

         public Builder setRewardCount(int value) {
            this.bitField0_ |= 4;
            this.rewardCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardCount() {
            this.bitField0_ &= -5;
            this.rewardCount_ = 0;
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

   public static final class RecommendPlayer extends GeneratedMessageV3 implements RecommendPlayerOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEAD_FIELD_NUMBER = 1;
      private int head_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      public static final int COMBATPOWER_FIELD_NUMBER = 4;
      private long combatPower_;
      public static final int VIPLV_FIELD_NUMBER = 5;
      private long vipLv_;
      private byte memoizedIsInitialized;
      private static final RecommendPlayer DEFAULT_INSTANCE = new RecommendPlayer();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecommendPlayer> PARSER = new AbstractParser<RecommendPlayer>() {
         public RecommendPlayer parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecommendPlayer(input, extensionRegistry);
         }
      };

      private RecommendPlayer(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecommendPlayer() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecommendPlayer();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecommendPlayer(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.head_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.level_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.combatPower_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.vipLv_ = input.readInt64();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_fieldAccessorTable.ensureFieldAccessorsInitialized(RecommendPlayer.class, Builder.class);
      }

      public boolean hasHead() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getPlayerName() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.playerName_ = s;
            }

            return s;
         }
      }

      public ByteString getPlayerNameBytes() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.playerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasCombatPower() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getCombatPower() {
         return this.combatPower_;
      }

      public boolean hasVipLv() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getVipLv() {
         return this.vipLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCombatPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVipLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.head_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.combatPower_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.vipLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.head_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.playerName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.combatPower_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.vipLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecommendPlayer)) {
            return super.equals(obj);
         } else {
            RecommendPlayer other = (RecommendPlayer)obj;
            if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasCombatPower() != other.hasCombatPower()) {
               return false;
            } else if (this.hasCombatPower() && this.getCombatPower() != other.getCombatPower()) {
               return false;
            } else if (this.hasVipLv() != other.hasVipLv()) {
               return false;
            } else if (this.hasVipLv() && this.getVipLv() != other.getVipLv()) {
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
            if (this.hasHead()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasCombatPower()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getCombatPower());
            }

            if (this.hasVipLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getVipLv());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecommendPlayer parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecommendPlayer)PARSER.parseFrom(data);
      }

      public static RecommendPlayer parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecommendPlayer)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecommendPlayer parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecommendPlayer)PARSER.parseFrom(data);
      }

      public static RecommendPlayer parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecommendPlayer)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecommendPlayer parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecommendPlayer)PARSER.parseFrom(data);
      }

      public static RecommendPlayer parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecommendPlayer)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecommendPlayer parseFrom(InputStream input) throws IOException {
         return (RecommendPlayer)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecommendPlayer parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecommendPlayer)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecommendPlayer parseDelimitedFrom(InputStream input) throws IOException {
         return (RecommendPlayer)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecommendPlayer parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecommendPlayer)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecommendPlayer parseFrom(CodedInputStream input) throws IOException {
         return (RecommendPlayer)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecommendPlayer parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecommendPlayer)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecommendPlayer prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecommendPlayer getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecommendPlayer> parser() {
         return PARSER;
      }

      public Parser<RecommendPlayer> getParserForType() {
         return PARSER;
      }

      public RecommendPlayer getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecommendPlayerOrBuilder {
         private int bitField0_;
         private int head_;
         private Object playerName_;
         private int level_;
         private long combatPower_;
         private long vipLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_fieldAccessorTable.ensureFieldAccessorsInitialized(RecommendPlayer.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.RecommendPlayer.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.head_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            this.combatPower_ = 0L;
            this.bitField0_ &= -9;
            this.vipLv_ = 0L;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_RecommendPlayer_descriptor;
         }

         public RecommendPlayer getDefaultInstanceForType() {
            return BenefitMsg.RecommendPlayer.getDefaultInstance();
         }

         public RecommendPlayer build() {
            RecommendPlayer result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecommendPlayer buildPartial() {
            RecommendPlayer result = new RecommendPlayer(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.combatPower_ = this.combatPower_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.vipLv_ = this.vipLv_;
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
            if (other instanceof RecommendPlayer) {
               return this.mergeFrom((RecommendPlayer)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecommendPlayer other) {
            if (other == BenefitMsg.RecommendPlayer.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 2;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasCombatPower()) {
                  this.setCombatPower(other.getCombatPower());
               }

               if (other.hasVipLv()) {
                  this.setVipLv(other.getVipLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHead()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else if (!this.hasCombatPower()) {
               return false;
            } else {
               return this.hasVipLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecommendPlayer parsedMessage = null;

            try {
               parsedMessage = (RecommendPlayer)BenefitMsg.RecommendPlayer.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecommendPlayer)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 1;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -2;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getPlayerName() {
            Object ref = this.playerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.playerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPlayerNameBytes() {
            Object ref = this.playerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.playerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -3;
            this.playerName_ = BenefitMsg.RecommendPlayer.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCombatPower() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getCombatPower() {
            return this.combatPower_;
         }

         public Builder setCombatPower(long value) {
            this.bitField0_ |= 8;
            this.combatPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCombatPower() {
            this.bitField0_ &= -9;
            this.combatPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasVipLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getVipLv() {
            return this.vipLv_;
         }

         public Builder setVipLv(long value) {
            this.bitField0_ |= 16;
            this.vipLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLv() {
            this.bitField0_ &= -17;
            this.vipLv_ = 0L;
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

   public static final class S2C_RecommendResult_8123 extends GeneratedMessageV3 implements S2C_RecommendResult_8123OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECOMMENDCODE_FIELD_NUMBER = 1;
      private int recommendCode_;
      public static final int TASKS_FIELD_NUMBER = 2;
      private List<RecommendTask> tasks_;
      public static final int RECOMMENDPLAYER_FIELD_NUMBER = 3;
      private List<RecommendPlayer> recommendPlayer_;
      public static final int BERECOMMENDCODE_FIELD_NUMBER = 4;
      private int beRecommendCode_;
      private byte memoizedIsInitialized;
      private static final S2C_RecommendResult_8123 DEFAULT_INSTANCE = new S2C_RecommendResult_8123();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecommendResult_8123> PARSER = new AbstractParser<S2C_RecommendResult_8123>() {
         public S2C_RecommendResult_8123 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecommendResult_8123(input, extensionRegistry);
         }
      };

      private S2C_RecommendResult_8123(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecommendResult_8123() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
         this.recommendPlayer_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecommendResult_8123();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecommendResult_8123(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recommendCode_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.tasks_.add(input.readMessage(BenefitMsg.RecommendTask.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.recommendPlayer_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.recommendPlayer_.add(input.readMessage(BenefitMsg.RecommendPlayer.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.beRecommendCode_ = input.readInt32();
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
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.recommendPlayer_ = Collections.unmodifiableList(this.recommendPlayer_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecommendResult_8123.class, Builder.class);
      }

      public boolean hasRecommendCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecommendCode() {
         return this.recommendCode_;
      }

      public List<RecommendTask> getTasksList() {
         return this.tasks_;
      }

      public List<? extends RecommendTaskOrBuilder> getTasksOrBuilderList() {
         return this.tasks_;
      }

      public int getTasksCount() {
         return this.tasks_.size();
      }

      public RecommendTask getTasks(int index) {
         return (RecommendTask)this.tasks_.get(index);
      }

      public RecommendTaskOrBuilder getTasksOrBuilder(int index) {
         return (RecommendTaskOrBuilder)this.tasks_.get(index);
      }

      public List<RecommendPlayer> getRecommendPlayerList() {
         return this.recommendPlayer_;
      }

      public List<? extends RecommendPlayerOrBuilder> getRecommendPlayerOrBuilderList() {
         return this.recommendPlayer_;
      }

      public int getRecommendPlayerCount() {
         return this.recommendPlayer_.size();
      }

      public RecommendPlayer getRecommendPlayer(int index) {
         return (RecommendPlayer)this.recommendPlayer_.get(index);
      }

      public RecommendPlayerOrBuilder getRecommendPlayerOrBuilder(int index) {
         return (RecommendPlayerOrBuilder)this.recommendPlayer_.get(index);
      }

      public boolean hasBeRecommendCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBeRecommendCode() {
         return this.beRecommendCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecommendCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBeRecommendCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRecommendPlayerCount(); ++i) {
               if (!this.getRecommendPlayer(i).isInitialized()) {
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
            output.writeInt32(1, this.recommendCode_);
         }

         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.tasks_.get(i));
         }

         for(int i = 0; i < this.recommendPlayer_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.recommendPlayer_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.beRecommendCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.recommendCode_);
            }

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.tasks_.get(i));
            }

            for(int i = 0; i < this.recommendPlayer_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.recommendPlayer_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.beRecommendCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecommendResult_8123)) {
            return super.equals(obj);
         } else {
            S2C_RecommendResult_8123 other = (S2C_RecommendResult_8123)obj;
            if (this.hasRecommendCode() != other.hasRecommendCode()) {
               return false;
            } else if (this.hasRecommendCode() && this.getRecommendCode() != other.getRecommendCode()) {
               return false;
            } else if (!this.getTasksList().equals(other.getTasksList())) {
               return false;
            } else if (!this.getRecommendPlayerList().equals(other.getRecommendPlayerList())) {
               return false;
            } else if (this.hasBeRecommendCode() != other.hasBeRecommendCode()) {
               return false;
            } else if (this.hasBeRecommendCode() && this.getBeRecommendCode() != other.getBeRecommendCode()) {
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
            if (this.hasRecommendCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecommendCode();
            }

            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            if (this.getRecommendPlayerCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecommendPlayerList().hashCode();
            }

            if (this.hasBeRecommendCode()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getBeRecommendCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecommendResult_8123 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecommendResult_8123)PARSER.parseFrom(data);
      }

      public static S2C_RecommendResult_8123 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecommendResult_8123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecommendResult_8123 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecommendResult_8123)PARSER.parseFrom(data);
      }

      public static S2C_RecommendResult_8123 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecommendResult_8123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecommendResult_8123 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecommendResult_8123)PARSER.parseFrom(data);
      }

      public static S2C_RecommendResult_8123 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecommendResult_8123)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecommendResult_8123 parseFrom(InputStream input) throws IOException {
         return (S2C_RecommendResult_8123)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecommendResult_8123 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecommendResult_8123)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecommendResult_8123 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecommendResult_8123)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecommendResult_8123 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecommendResult_8123)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecommendResult_8123 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecommendResult_8123)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecommendResult_8123 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecommendResult_8123)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecommendResult_8123 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecommendResult_8123 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecommendResult_8123> parser() {
         return PARSER;
      }

      public Parser<S2C_RecommendResult_8123> getParserForType() {
         return PARSER;
      }

      public S2C_RecommendResult_8123 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecommendResult_8123OrBuilder {
         private int bitField0_;
         private int recommendCode_;
         private List<RecommendTask> tasks_;
         private RepeatedFieldBuilderV3<RecommendTask, RecommendTask.Builder, RecommendTaskOrBuilder> tasksBuilder_;
         private List<RecommendPlayer> recommendPlayer_;
         private RepeatedFieldBuilderV3<RecommendPlayer, RecommendPlayer.Builder, RecommendPlayerOrBuilder> recommendPlayerBuilder_;
         private int beRecommendCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecommendResult_8123.class, Builder.class);
         }

         private Builder() {
            this.tasks_ = Collections.emptyList();
            this.recommendPlayer_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tasks_ = Collections.emptyList();
            this.recommendPlayer_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_RecommendResult_8123.alwaysUseFieldBuilders) {
               this.getTasksFieldBuilder();
               this.getRecommendPlayerFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.recommendCode_ = 0;
            this.bitField0_ &= -2;
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.tasksBuilder_.clear();
            }

            if (this.recommendPlayerBuilder_ == null) {
               this.recommendPlayer_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.recommendPlayerBuilder_.clear();
            }

            this.beRecommendCode_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendResult_8123_descriptor;
         }

         public S2C_RecommendResult_8123 getDefaultInstanceForType() {
            return BenefitMsg.S2C_RecommendResult_8123.getDefaultInstance();
         }

         public S2C_RecommendResult_8123 build() {
            S2C_RecommendResult_8123 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecommendResult_8123 buildPartial() {
            S2C_RecommendResult_8123 result = new S2C_RecommendResult_8123(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recommendCode_ = this.recommendCode_;
               to_bitField0_ |= 1;
            }

            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -3;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
            }

            if (this.recommendPlayerBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.recommendPlayer_ = Collections.unmodifiableList(this.recommendPlayer_);
                  this.bitField0_ &= -5;
               }

               result.recommendPlayer_ = this.recommendPlayer_;
            } else {
               result.recommendPlayer_ = this.recommendPlayerBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.beRecommendCode_ = this.beRecommendCode_;
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
            if (other instanceof S2C_RecommendResult_8123) {
               return this.mergeFrom((S2C_RecommendResult_8123)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecommendResult_8123 other) {
            if (other == BenefitMsg.S2C_RecommendResult_8123.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecommendCode()) {
                  this.setRecommendCode(other.getRecommendCode());
               }

               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureTasksIsMutable();
                        this.tasks_.addAll(other.tasks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tasks_.isEmpty()) {
                  if (this.tasksBuilder_.isEmpty()) {
                     this.tasksBuilder_.dispose();
                     this.tasksBuilder_ = null;
                     this.tasks_ = other.tasks_;
                     this.bitField0_ &= -3;
                     this.tasksBuilder_ = BenefitMsg.S2C_RecommendResult_8123.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
                  } else {
                     this.tasksBuilder_.addAllMessages(other.tasks_);
                  }
               }

               if (this.recommendPlayerBuilder_ == null) {
                  if (!other.recommendPlayer_.isEmpty()) {
                     if (this.recommendPlayer_.isEmpty()) {
                        this.recommendPlayer_ = other.recommendPlayer_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureRecommendPlayerIsMutable();
                        this.recommendPlayer_.addAll(other.recommendPlayer_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recommendPlayer_.isEmpty()) {
                  if (this.recommendPlayerBuilder_.isEmpty()) {
                     this.recommendPlayerBuilder_.dispose();
                     this.recommendPlayerBuilder_ = null;
                     this.recommendPlayer_ = other.recommendPlayer_;
                     this.bitField0_ &= -5;
                     this.recommendPlayerBuilder_ = BenefitMsg.S2C_RecommendResult_8123.alwaysUseFieldBuilders ? this.getRecommendPlayerFieldBuilder() : null;
                  } else {
                     this.recommendPlayerBuilder_.addAllMessages(other.recommendPlayer_);
                  }
               }

               if (other.hasBeRecommendCode()) {
                  this.setBeRecommendCode(other.getBeRecommendCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecommendCode()) {
               return false;
            } else if (!this.hasBeRecommendCode()) {
               return false;
            } else {
               for(int i = 0; i < this.getTasksCount(); ++i) {
                  if (!this.getTasks(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRecommendPlayerCount(); ++i) {
                  if (!this.getRecommendPlayer(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecommendResult_8123 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecommendResult_8123)BenefitMsg.S2C_RecommendResult_8123.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecommendResult_8123)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecommendCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecommendCode() {
            return this.recommendCode_;
         }

         public Builder setRecommendCode(int value) {
            this.bitField0_ |= 1;
            this.recommendCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecommendCode() {
            this.bitField0_ &= -2;
            this.recommendCode_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 2;
            }

         }

         public List<RecommendTask> getTasksList() {
            return this.tasksBuilder_ == null ? Collections.unmodifiableList(this.tasks_) : this.tasksBuilder_.getMessageList();
         }

         public int getTasksCount() {
            return this.tasksBuilder_ == null ? this.tasks_.size() : this.tasksBuilder_.getCount();
         }

         public RecommendTask getTasks(int index) {
            return this.tasksBuilder_ == null ? (RecommendTask)this.tasks_.get(index) : (RecommendTask)this.tasksBuilder_.getMessage(index);
         }

         public Builder setTasks(int index, RecommendTask value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.set(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTasks(int index, RecommendTask.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(RecommendTask value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTasks(int index, RecommendTask value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTasks(RecommendTask.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(int index, RecommendTask.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTasks(Iterable<? extends RecommendTask> values) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tasks_);
               this.onChanged();
            } else {
               this.tasksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTasks() {
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTasks(int index) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.remove(index);
               this.onChanged();
            } else {
               this.tasksBuilder_.remove(index);
            }

            return this;
         }

         public RecommendTask.Builder getTasksBuilder(int index) {
            return (RecommendTask.Builder)this.getTasksFieldBuilder().getBuilder(index);
         }

         public RecommendTaskOrBuilder getTasksOrBuilder(int index) {
            return this.tasksBuilder_ == null ? (RecommendTaskOrBuilder)this.tasks_.get(index) : (RecommendTaskOrBuilder)this.tasksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecommendTaskOrBuilder> getTasksOrBuilderList() {
            return this.tasksBuilder_ != null ? this.tasksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tasks_);
         }

         public RecommendTask.Builder addTasksBuilder() {
            return (RecommendTask.Builder)this.getTasksFieldBuilder().addBuilder(BenefitMsg.RecommendTask.getDefaultInstance());
         }

         public RecommendTask.Builder addTasksBuilder(int index) {
            return (RecommendTask.Builder)this.getTasksFieldBuilder().addBuilder(index, BenefitMsg.RecommendTask.getDefaultInstance());
         }

         public List<RecommendTask.Builder> getTasksBuilderList() {
            return this.getTasksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecommendTask, RecommendTask.Builder, RecommendTaskOrBuilder> getTasksFieldBuilder() {
            if (this.tasksBuilder_ == null) {
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.tasks_ = null;
            }

            return this.tasksBuilder_;
         }

         private void ensureRecommendPlayerIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.recommendPlayer_ = new ArrayList(this.recommendPlayer_);
               this.bitField0_ |= 4;
            }

         }

         public List<RecommendPlayer> getRecommendPlayerList() {
            return this.recommendPlayerBuilder_ == null ? Collections.unmodifiableList(this.recommendPlayer_) : this.recommendPlayerBuilder_.getMessageList();
         }

         public int getRecommendPlayerCount() {
            return this.recommendPlayerBuilder_ == null ? this.recommendPlayer_.size() : this.recommendPlayerBuilder_.getCount();
         }

         public RecommendPlayer getRecommendPlayer(int index) {
            return this.recommendPlayerBuilder_ == null ? (RecommendPlayer)this.recommendPlayer_.get(index) : (RecommendPlayer)this.recommendPlayerBuilder_.getMessage(index);
         }

         public Builder setRecommendPlayer(int index, RecommendPlayer value) {
            if (this.recommendPlayerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecommendPlayerIsMutable();
               this.recommendPlayer_.set(index, value);
               this.onChanged();
            } else {
               this.recommendPlayerBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecommendPlayer(int index, RecommendPlayer.Builder builderForValue) {
            if (this.recommendPlayerBuilder_ == null) {
               this.ensureRecommendPlayerIsMutable();
               this.recommendPlayer_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recommendPlayerBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecommendPlayer(RecommendPlayer value) {
            if (this.recommendPlayerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecommendPlayerIsMutable();
               this.recommendPlayer_.add(value);
               this.onChanged();
            } else {
               this.recommendPlayerBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecommendPlayer(int index, RecommendPlayer value) {
            if (this.recommendPlayerBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecommendPlayerIsMutable();
               this.recommendPlayer_.add(index, value);
               this.onChanged();
            } else {
               this.recommendPlayerBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecommendPlayer(RecommendPlayer.Builder builderForValue) {
            if (this.recommendPlayerBuilder_ == null) {
               this.ensureRecommendPlayerIsMutable();
               this.recommendPlayer_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recommendPlayerBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecommendPlayer(int index, RecommendPlayer.Builder builderForValue) {
            if (this.recommendPlayerBuilder_ == null) {
               this.ensureRecommendPlayerIsMutable();
               this.recommendPlayer_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recommendPlayerBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecommendPlayer(Iterable<? extends RecommendPlayer> values) {
            if (this.recommendPlayerBuilder_ == null) {
               this.ensureRecommendPlayerIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recommendPlayer_);
               this.onChanged();
            } else {
               this.recommendPlayerBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecommendPlayer() {
            if (this.recommendPlayerBuilder_ == null) {
               this.recommendPlayer_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.recommendPlayerBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecommendPlayer(int index) {
            if (this.recommendPlayerBuilder_ == null) {
               this.ensureRecommendPlayerIsMutable();
               this.recommendPlayer_.remove(index);
               this.onChanged();
            } else {
               this.recommendPlayerBuilder_.remove(index);
            }

            return this;
         }

         public RecommendPlayer.Builder getRecommendPlayerBuilder(int index) {
            return (RecommendPlayer.Builder)this.getRecommendPlayerFieldBuilder().getBuilder(index);
         }

         public RecommendPlayerOrBuilder getRecommendPlayerOrBuilder(int index) {
            return this.recommendPlayerBuilder_ == null ? (RecommendPlayerOrBuilder)this.recommendPlayer_.get(index) : (RecommendPlayerOrBuilder)this.recommendPlayerBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecommendPlayerOrBuilder> getRecommendPlayerOrBuilderList() {
            return this.recommendPlayerBuilder_ != null ? this.recommendPlayerBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recommendPlayer_);
         }

         public RecommendPlayer.Builder addRecommendPlayerBuilder() {
            return (RecommendPlayer.Builder)this.getRecommendPlayerFieldBuilder().addBuilder(BenefitMsg.RecommendPlayer.getDefaultInstance());
         }

         public RecommendPlayer.Builder addRecommendPlayerBuilder(int index) {
            return (RecommendPlayer.Builder)this.getRecommendPlayerFieldBuilder().addBuilder(index, BenefitMsg.RecommendPlayer.getDefaultInstance());
         }

         public List<RecommendPlayer.Builder> getRecommendPlayerBuilderList() {
            return this.getRecommendPlayerFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecommendPlayer, RecommendPlayer.Builder, RecommendPlayerOrBuilder> getRecommendPlayerFieldBuilder() {
            if (this.recommendPlayerBuilder_ == null) {
               this.recommendPlayerBuilder_ = new RepeatedFieldBuilderV3(this.recommendPlayer_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.recommendPlayer_ = null;
            }

            return this.recommendPlayerBuilder_;
         }

         public boolean hasBeRecommendCode() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getBeRecommendCode() {
            return this.beRecommendCode_;
         }

         public Builder setBeRecommendCode(int value) {
            this.bitField0_ |= 8;
            this.beRecommendCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeRecommendCode() {
            this.bitField0_ &= -9;
            this.beRecommendCode_ = 0;
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

   public static final class C2S_RecommendReward_8124 extends GeneratedMessageV3 implements C2S_RecommendReward_8124OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_RecommendReward_8124 DEFAULT_INSTANCE = new C2S_RecommendReward_8124();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecommendReward_8124> PARSER = new AbstractParser<C2S_RecommendReward_8124>() {
         public C2S_RecommendReward_8124 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecommendReward_8124(input, extensionRegistry);
         }
      };

      private C2S_RecommendReward_8124(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecommendReward_8124() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecommendReward_8124();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecommendReward_8124(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.taskId_ = input.readInt32();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecommendReward_8124.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecommendReward_8124)) {
            return super.equals(obj);
         } else {
            C2S_RecommendReward_8124 other = (C2S_RecommendReward_8124)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
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
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecommendReward_8124 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecommendReward_8124)PARSER.parseFrom(data);
      }

      public static C2S_RecommendReward_8124 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecommendReward_8124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecommendReward_8124 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecommendReward_8124)PARSER.parseFrom(data);
      }

      public static C2S_RecommendReward_8124 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecommendReward_8124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecommendReward_8124 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecommendReward_8124)PARSER.parseFrom(data);
      }

      public static C2S_RecommendReward_8124 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecommendReward_8124)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecommendReward_8124 parseFrom(InputStream input) throws IOException {
         return (C2S_RecommendReward_8124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecommendReward_8124 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecommendReward_8124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecommendReward_8124 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecommendReward_8124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecommendReward_8124 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecommendReward_8124)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecommendReward_8124 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecommendReward_8124)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecommendReward_8124 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecommendReward_8124)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecommendReward_8124 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecommendReward_8124 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecommendReward_8124> parser() {
         return PARSER;
      }

      public Parser<C2S_RecommendReward_8124> getParserForType() {
         return PARSER;
      }

      public C2S_RecommendReward_8124 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecommendReward_8124OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecommendReward_8124.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_RecommendReward_8124.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendReward_8124_descriptor;
         }

         public C2S_RecommendReward_8124 getDefaultInstanceForType() {
            return BenefitMsg.C2S_RecommendReward_8124.getDefaultInstance();
         }

         public C2S_RecommendReward_8124 build() {
            C2S_RecommendReward_8124 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecommendReward_8124 buildPartial() {
            C2S_RecommendReward_8124 result = new C2S_RecommendReward_8124(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
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
            if (other instanceof C2S_RecommendReward_8124) {
               return this.mergeFrom((C2S_RecommendReward_8124)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecommendReward_8124 other) {
            if (other == BenefitMsg.C2S_RecommendReward_8124.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecommendReward_8124 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecommendReward_8124)BenefitMsg.C2S_RecommendReward_8124.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecommendReward_8124)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
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

   public static final class S2C_RecommendRewardResult_8125 extends GeneratedMessageV3 implements S2C_RecommendRewardResult_8125OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TASKID_FIELD_NUMBER = 2;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_RecommendRewardResult_8125 DEFAULT_INSTANCE = new S2C_RecommendRewardResult_8125();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecommendRewardResult_8125> PARSER = new AbstractParser<S2C_RecommendRewardResult_8125>() {
         public S2C_RecommendRewardResult_8125 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecommendRewardResult_8125(input, extensionRegistry);
         }
      };

      private S2C_RecommendRewardResult_8125(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecommendRewardResult_8125() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecommendRewardResult_8125();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecommendRewardResult_8125(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.taskId_ = input.readInt32();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecommendRewardResult_8125.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.taskId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.taskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecommendRewardResult_8125)) {
            return super.equals(obj);
         } else {
            S2C_RecommendRewardResult_8125 other = (S2C_RecommendRewardResult_8125)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasTaskId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecommendRewardResult_8125)PARSER.parseFrom(data);
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecommendRewardResult_8125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecommendRewardResult_8125)PARSER.parseFrom(data);
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecommendRewardResult_8125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecommendRewardResult_8125)PARSER.parseFrom(data);
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecommendRewardResult_8125)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(InputStream input) throws IOException {
         return (S2C_RecommendRewardResult_8125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecommendRewardResult_8125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecommendRewardResult_8125 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecommendRewardResult_8125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecommendRewardResult_8125 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecommendRewardResult_8125)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecommendRewardResult_8125)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecommendRewardResult_8125 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecommendRewardResult_8125)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecommendRewardResult_8125 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecommendRewardResult_8125 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecommendRewardResult_8125> parser() {
         return PARSER;
      }

      public Parser<S2C_RecommendRewardResult_8125> getParserForType() {
         return PARSER;
      }

      public S2C_RecommendRewardResult_8125 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecommendRewardResult_8125OrBuilder {
         private int bitField0_;
         private int result_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecommendRewardResult_8125.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_RecommendRewardResult_8125.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendRewardResult_8125_descriptor;
         }

         public S2C_RecommendRewardResult_8125 getDefaultInstanceForType() {
            return BenefitMsg.S2C_RecommendRewardResult_8125.getDefaultInstance();
         }

         public S2C_RecommendRewardResult_8125 build() {
            S2C_RecommendRewardResult_8125 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecommendRewardResult_8125 buildPartial() {
            S2C_RecommendRewardResult_8125 result = new S2C_RecommendRewardResult_8125(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.taskId_ = this.taskId_;
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
            if (other instanceof S2C_RecommendRewardResult_8125) {
               return this.mergeFrom((S2C_RecommendRewardResult_8125)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecommendRewardResult_8125 other) {
            if (other == BenefitMsg.S2C_RecommendRewardResult_8125.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasTaskId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecommendRewardResult_8125 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecommendRewardResult_8125)BenefitMsg.S2C_RecommendRewardResult_8125.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecommendRewardResult_8125)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 2;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -3;
            this.taskId_ = 0;
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

   public static final class C2S_CdKeyReward_8126 extends GeneratedMessageV3 implements C2S_CdKeyReward_8126OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CDKEY_FIELD_NUMBER = 1;
      private volatile Object cdKey_;
      private byte memoizedIsInitialized;
      private static final C2S_CdKeyReward_8126 DEFAULT_INSTANCE = new C2S_CdKeyReward_8126();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CdKeyReward_8126> PARSER = new AbstractParser<C2S_CdKeyReward_8126>() {
         public C2S_CdKeyReward_8126 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CdKeyReward_8126(input, extensionRegistry);
         }
      };

      private C2S_CdKeyReward_8126(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CdKeyReward_8126() {
         this.memoizedIsInitialized = -1;
         this.cdKey_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CdKeyReward_8126();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CdKeyReward_8126(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.cdKey_ = bs;
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CdKeyReward_8126.class, Builder.class);
      }

      public boolean hasCdKey() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getCdKey() {
         Object ref = this.cdKey_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.cdKey_ = s;
            }

            return s;
         }
      }

      public ByteString getCdKeyBytes() {
         Object ref = this.cdKey_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.cdKey_ = b;
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
         } else if (!this.hasCdKey()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.cdKey_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.cdKey_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CdKeyReward_8126)) {
            return super.equals(obj);
         } else {
            C2S_CdKeyReward_8126 other = (C2S_CdKeyReward_8126)obj;
            if (this.hasCdKey() != other.hasCdKey()) {
               return false;
            } else if (this.hasCdKey() && !this.getCdKey().equals(other.getCdKey())) {
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
            if (this.hasCdKey()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCdKey().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CdKeyReward_8126 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CdKeyReward_8126)PARSER.parseFrom(data);
      }

      public static C2S_CdKeyReward_8126 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CdKeyReward_8126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CdKeyReward_8126 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CdKeyReward_8126)PARSER.parseFrom(data);
      }

      public static C2S_CdKeyReward_8126 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CdKeyReward_8126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CdKeyReward_8126 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CdKeyReward_8126)PARSER.parseFrom(data);
      }

      public static C2S_CdKeyReward_8126 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CdKeyReward_8126)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CdKeyReward_8126 parseFrom(InputStream input) throws IOException {
         return (C2S_CdKeyReward_8126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CdKeyReward_8126 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CdKeyReward_8126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CdKeyReward_8126 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CdKeyReward_8126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CdKeyReward_8126 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CdKeyReward_8126)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CdKeyReward_8126 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CdKeyReward_8126)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CdKeyReward_8126 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CdKeyReward_8126)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CdKeyReward_8126 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CdKeyReward_8126 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CdKeyReward_8126> parser() {
         return PARSER;
      }

      public Parser<C2S_CdKeyReward_8126> getParserForType() {
         return PARSER;
      }

      public C2S_CdKeyReward_8126 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CdKeyReward_8126OrBuilder {
         private int bitField0_;
         private Object cdKey_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CdKeyReward_8126.class, Builder.class);
         }

         private Builder() {
            this.cdKey_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cdKey_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_CdKeyReward_8126.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cdKey_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_CdKeyReward_8126_descriptor;
         }

         public C2S_CdKeyReward_8126 getDefaultInstanceForType() {
            return BenefitMsg.C2S_CdKeyReward_8126.getDefaultInstance();
         }

         public C2S_CdKeyReward_8126 build() {
            C2S_CdKeyReward_8126 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CdKeyReward_8126 buildPartial() {
            C2S_CdKeyReward_8126 result = new C2S_CdKeyReward_8126(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.cdKey_ = this.cdKey_;
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
            if (other instanceof C2S_CdKeyReward_8126) {
               return this.mergeFrom((C2S_CdKeyReward_8126)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CdKeyReward_8126 other) {
            if (other == BenefitMsg.C2S_CdKeyReward_8126.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCdKey()) {
                  this.bitField0_ |= 1;
                  this.cdKey_ = other.cdKey_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCdKey();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CdKeyReward_8126 parsedMessage = null;

            try {
               parsedMessage = (C2S_CdKeyReward_8126)BenefitMsg.C2S_CdKeyReward_8126.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CdKeyReward_8126)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCdKey() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getCdKey() {
            Object ref = this.cdKey_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.cdKey_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCdKeyBytes() {
            Object ref = this.cdKey_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.cdKey_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCdKey(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.cdKey_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCdKey() {
            this.bitField0_ &= -2;
            this.cdKey_ = BenefitMsg.C2S_CdKeyReward_8126.getDefaultInstance().getCdKey();
            this.onChanged();
            return this;
         }

         public Builder setCdKeyBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.cdKey_ = value;
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

   public static final class S2C_CdKeyRewardResult_8127 extends GeneratedMessageV3 implements S2C_CdKeyRewardResult_8127OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CDKEY_FIELD_NUMBER = 2;
      private volatile Object cdKey_;
      private byte memoizedIsInitialized;
      private static final S2C_CdKeyRewardResult_8127 DEFAULT_INSTANCE = new S2C_CdKeyRewardResult_8127();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CdKeyRewardResult_8127> PARSER = new AbstractParser<S2C_CdKeyRewardResult_8127>() {
         public S2C_CdKeyRewardResult_8127 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CdKeyRewardResult_8127(input, extensionRegistry);
         }
      };

      private S2C_CdKeyRewardResult_8127(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CdKeyRewardResult_8127() {
         this.memoizedIsInitialized = -1;
         this.cdKey_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CdKeyRewardResult_8127();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CdKeyRewardResult_8127(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.cdKey_ = bs;
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CdKeyRewardResult_8127.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCdKey() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getCdKey() {
         Object ref = this.cdKey_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.cdKey_ = s;
            }

            return s;
         }
      }

      public ByteString getCdKeyBytes() {
         Object ref = this.cdKey_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.cdKey_ = b;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCdKey()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.cdKey_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.cdKey_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CdKeyRewardResult_8127)) {
            return super.equals(obj);
         } else {
            S2C_CdKeyRewardResult_8127 other = (S2C_CdKeyRewardResult_8127)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCdKey() != other.hasCdKey()) {
               return false;
            } else if (this.hasCdKey() && !this.getCdKey().equals(other.getCdKey())) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasCdKey()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCdKey().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CdKeyRewardResult_8127)PARSER.parseFrom(data);
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CdKeyRewardResult_8127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CdKeyRewardResult_8127)PARSER.parseFrom(data);
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CdKeyRewardResult_8127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CdKeyRewardResult_8127)PARSER.parseFrom(data);
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CdKeyRewardResult_8127)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(InputStream input) throws IOException {
         return (S2C_CdKeyRewardResult_8127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CdKeyRewardResult_8127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CdKeyRewardResult_8127 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CdKeyRewardResult_8127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CdKeyRewardResult_8127 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CdKeyRewardResult_8127)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CdKeyRewardResult_8127)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CdKeyRewardResult_8127 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CdKeyRewardResult_8127)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CdKeyRewardResult_8127 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CdKeyRewardResult_8127 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CdKeyRewardResult_8127> parser() {
         return PARSER;
      }

      public Parser<S2C_CdKeyRewardResult_8127> getParserForType() {
         return PARSER;
      }

      public S2C_CdKeyRewardResult_8127 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CdKeyRewardResult_8127OrBuilder {
         private int bitField0_;
         private int result_;
         private Object cdKey_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CdKeyRewardResult_8127.class, Builder.class);
         }

         private Builder() {
            this.cdKey_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cdKey_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_CdKeyRewardResult_8127.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.cdKey_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_CdKeyRewardResult_8127_descriptor;
         }

         public S2C_CdKeyRewardResult_8127 getDefaultInstanceForType() {
            return BenefitMsg.S2C_CdKeyRewardResult_8127.getDefaultInstance();
         }

         public S2C_CdKeyRewardResult_8127 build() {
            S2C_CdKeyRewardResult_8127 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CdKeyRewardResult_8127 buildPartial() {
            S2C_CdKeyRewardResult_8127 result = new S2C_CdKeyRewardResult_8127(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.cdKey_ = this.cdKey_;
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
            if (other instanceof S2C_CdKeyRewardResult_8127) {
               return this.mergeFrom((S2C_CdKeyRewardResult_8127)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CdKeyRewardResult_8127 other) {
            if (other == BenefitMsg.S2C_CdKeyRewardResult_8127.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCdKey()) {
                  this.bitField0_ |= 2;
                  this.cdKey_ = other.cdKey_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasCdKey();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CdKeyRewardResult_8127 parsedMessage = null;

            try {
               parsedMessage = (S2C_CdKeyRewardResult_8127)BenefitMsg.S2C_CdKeyRewardResult_8127.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CdKeyRewardResult_8127)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCdKey() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getCdKey() {
            Object ref = this.cdKey_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.cdKey_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCdKeyBytes() {
            Object ref = this.cdKey_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.cdKey_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCdKey(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.cdKey_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCdKey() {
            this.bitField0_ &= -3;
            this.cdKey_ = BenefitMsg.S2C_CdKeyRewardResult_8127.getDefaultInstance().getCdKey();
            this.onChanged();
            return this;
         }

         public Builder setCdKeyBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.cdKey_ = value;
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

   public static final class C2S_RecommendActive_8128 extends GeneratedMessageV3 implements C2S_RecommendActive_8128OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_RecommendActive_8128 DEFAULT_INSTANCE = new C2S_RecommendActive_8128();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecommendActive_8128> PARSER = new AbstractParser<C2S_RecommendActive_8128>() {
         public C2S_RecommendActive_8128 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecommendActive_8128(input, extensionRegistry);
         }
      };

      private C2S_RecommendActive_8128(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecommendActive_8128() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecommendActive_8128();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecommendActive_8128(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecommendActive_8128.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecommendActive_8128)) {
            return super.equals(obj);
         } else {
            C2S_RecommendActive_8128 other = (C2S_RecommendActive_8128)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecommendActive_8128 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecommendActive_8128)PARSER.parseFrom(data);
      }

      public static C2S_RecommendActive_8128 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecommendActive_8128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecommendActive_8128 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecommendActive_8128)PARSER.parseFrom(data);
      }

      public static C2S_RecommendActive_8128 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecommendActive_8128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecommendActive_8128 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecommendActive_8128)PARSER.parseFrom(data);
      }

      public static C2S_RecommendActive_8128 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecommendActive_8128)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecommendActive_8128 parseFrom(InputStream input) throws IOException {
         return (C2S_RecommendActive_8128)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecommendActive_8128 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecommendActive_8128)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecommendActive_8128 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecommendActive_8128)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecommendActive_8128 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecommendActive_8128)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecommendActive_8128 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecommendActive_8128)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecommendActive_8128 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecommendActive_8128)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecommendActive_8128 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecommendActive_8128 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecommendActive_8128> parser() {
         return PARSER;
      }

      public Parser<C2S_RecommendActive_8128> getParserForType() {
         return PARSER;
      }

      public C2S_RecommendActive_8128 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecommendActive_8128OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecommendActive_8128.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_RecommendActive_8128.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_RecommendActive_8128_descriptor;
         }

         public C2S_RecommendActive_8128 getDefaultInstanceForType() {
            return BenefitMsg.C2S_RecommendActive_8128.getDefaultInstance();
         }

         public C2S_RecommendActive_8128 build() {
            C2S_RecommendActive_8128 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecommendActive_8128 buildPartial() {
            C2S_RecommendActive_8128 result = new C2S_RecommendActive_8128(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_RecommendActive_8128) {
               return this.mergeFrom((C2S_RecommendActive_8128)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecommendActive_8128 other) {
            if (other == BenefitMsg.C2S_RecommendActive_8128.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecommendActive_8128 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecommendActive_8128)BenefitMsg.C2S_RecommendActive_8128.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecommendActive_8128)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_RecommendActive_8129 extends GeneratedMessageV3 implements S2C_RecommendActive_8129OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2C_RecommendActive_8129 DEFAULT_INSTANCE = new S2C_RecommendActive_8129();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecommendActive_8129> PARSER = new AbstractParser<S2C_RecommendActive_8129>() {
         public S2C_RecommendActive_8129 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecommendActive_8129(input, extensionRegistry);
         }
      };

      private S2C_RecommendActive_8129(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecommendActive_8129() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecommendActive_8129();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecommendActive_8129(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecommendActive_8129.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.code_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecommendActive_8129)) {
            return super.equals(obj);
         } else {
            S2C_RecommendActive_8129 other = (S2C_RecommendActive_8129)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecommendActive_8129 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecommendActive_8129)PARSER.parseFrom(data);
      }

      public static S2C_RecommendActive_8129 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecommendActive_8129)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecommendActive_8129 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecommendActive_8129)PARSER.parseFrom(data);
      }

      public static S2C_RecommendActive_8129 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecommendActive_8129)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecommendActive_8129 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecommendActive_8129)PARSER.parseFrom(data);
      }

      public static S2C_RecommendActive_8129 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecommendActive_8129)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecommendActive_8129 parseFrom(InputStream input) throws IOException {
         return (S2C_RecommendActive_8129)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecommendActive_8129 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecommendActive_8129)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecommendActive_8129 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecommendActive_8129)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecommendActive_8129 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecommendActive_8129)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecommendActive_8129 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecommendActive_8129)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecommendActive_8129 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecommendActive_8129)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecommendActive_8129 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecommendActive_8129 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecommendActive_8129> parser() {
         return PARSER;
      }

      public Parser<S2C_RecommendActive_8129> getParserForType() {
         return PARSER;
      }

      public S2C_RecommendActive_8129 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecommendActive_8129OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecommendActive_8129.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_RecommendActive_8129.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_RecommendActive_8129_descriptor;
         }

         public S2C_RecommendActive_8129 getDefaultInstanceForType() {
            return BenefitMsg.S2C_RecommendActive_8129.getDefaultInstance();
         }

         public S2C_RecommendActive_8129 build() {
            S2C_RecommendActive_8129 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecommendActive_8129 buildPartial() {
            S2C_RecommendActive_8129 result = new S2C_RecommendActive_8129(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof S2C_RecommendActive_8129) {
               return this.mergeFrom((S2C_RecommendActive_8129)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecommendActive_8129 other) {
            if (other == BenefitMsg.S2C_RecommendActive_8129.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecommendActive_8129 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecommendActive_8129)BenefitMsg.S2C_RecommendActive_8129.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecommendActive_8129)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_PreventionCartoon_8131 extends GeneratedMessageV3 implements C2S_PreventionCartoon_8131OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PreventionCartoon_8131 DEFAULT_INSTANCE = new C2S_PreventionCartoon_8131();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PreventionCartoon_8131> PARSER = new AbstractParser<C2S_PreventionCartoon_8131>() {
         public C2S_PreventionCartoon_8131 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PreventionCartoon_8131(input, extensionRegistry);
         }
      };

      private C2S_PreventionCartoon_8131(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PreventionCartoon_8131() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PreventionCartoon_8131();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PreventionCartoon_8131(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PreventionCartoon_8131.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PreventionCartoon_8131)) {
            return super.equals(obj);
         } else {
            C2S_PreventionCartoon_8131 other = (C2S_PreventionCartoon_8131)obj;
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

      public static C2S_PreventionCartoon_8131 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoon_8131)PARSER.parseFrom(data);
      }

      public static C2S_PreventionCartoon_8131 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoon_8131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PreventionCartoon_8131 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoon_8131)PARSER.parseFrom(data);
      }

      public static C2S_PreventionCartoon_8131 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoon_8131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PreventionCartoon_8131 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoon_8131)PARSER.parseFrom(data);
      }

      public static C2S_PreventionCartoon_8131 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoon_8131)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PreventionCartoon_8131 parseFrom(InputStream input) throws IOException {
         return (C2S_PreventionCartoon_8131)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PreventionCartoon_8131 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PreventionCartoon_8131)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PreventionCartoon_8131 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PreventionCartoon_8131)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PreventionCartoon_8131 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PreventionCartoon_8131)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PreventionCartoon_8131 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PreventionCartoon_8131)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PreventionCartoon_8131 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PreventionCartoon_8131)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PreventionCartoon_8131 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PreventionCartoon_8131 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PreventionCartoon_8131> parser() {
         return PARSER;
      }

      public Parser<C2S_PreventionCartoon_8131> getParserForType() {
         return PARSER;
      }

      public C2S_PreventionCartoon_8131 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PreventionCartoon_8131OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PreventionCartoon_8131.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_PreventionCartoon_8131.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoon_8131_descriptor;
         }

         public C2S_PreventionCartoon_8131 getDefaultInstanceForType() {
            return BenefitMsg.C2S_PreventionCartoon_8131.getDefaultInstance();
         }

         public C2S_PreventionCartoon_8131 build() {
            C2S_PreventionCartoon_8131 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PreventionCartoon_8131 buildPartial() {
            C2S_PreventionCartoon_8131 result = new C2S_PreventionCartoon_8131(this);
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
            if (other instanceof C2S_PreventionCartoon_8131) {
               return this.mergeFrom((C2S_PreventionCartoon_8131)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PreventionCartoon_8131 other) {
            if (other == BenefitMsg.C2S_PreventionCartoon_8131.getDefaultInstance()) {
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
            C2S_PreventionCartoon_8131 parsedMessage = null;

            try {
               parsedMessage = (C2S_PreventionCartoon_8131)BenefitMsg.C2S_PreventionCartoon_8131.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PreventionCartoon_8131)e.getUnfinishedMessage();
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

   public static final class S2C_PreventionCartoon_8132 extends GeneratedMessageV3 implements S2C_PreventionCartoon_8132OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISGOT_FIELD_NUMBER = 1;
      private boolean isGot_;
      private byte memoizedIsInitialized;
      private static final S2C_PreventionCartoon_8132 DEFAULT_INSTANCE = new S2C_PreventionCartoon_8132();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PreventionCartoon_8132> PARSER = new AbstractParser<S2C_PreventionCartoon_8132>() {
         public S2C_PreventionCartoon_8132 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PreventionCartoon_8132(input, extensionRegistry);
         }
      };

      private S2C_PreventionCartoon_8132(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PreventionCartoon_8132() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PreventionCartoon_8132();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PreventionCartoon_8132(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isGot_ = input.readBool();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PreventionCartoon_8132.class, Builder.class);
      }

      public boolean hasIsGot() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsGot() {
         return this.isGot_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsGot()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.isGot_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isGot_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PreventionCartoon_8132)) {
            return super.equals(obj);
         } else {
            S2C_PreventionCartoon_8132 other = (S2C_PreventionCartoon_8132)obj;
            if (this.hasIsGot() != other.hasIsGot()) {
               return false;
            } else if (this.hasIsGot() && this.getIsGot() != other.getIsGot()) {
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
            if (this.hasIsGot()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGot());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PreventionCartoon_8132 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoon_8132)PARSER.parseFrom(data);
      }

      public static S2C_PreventionCartoon_8132 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoon_8132)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PreventionCartoon_8132 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoon_8132)PARSER.parseFrom(data);
      }

      public static S2C_PreventionCartoon_8132 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoon_8132)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PreventionCartoon_8132 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoon_8132)PARSER.parseFrom(data);
      }

      public static S2C_PreventionCartoon_8132 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoon_8132)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PreventionCartoon_8132 parseFrom(InputStream input) throws IOException {
         return (S2C_PreventionCartoon_8132)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PreventionCartoon_8132 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PreventionCartoon_8132)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PreventionCartoon_8132 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PreventionCartoon_8132)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PreventionCartoon_8132 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PreventionCartoon_8132)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PreventionCartoon_8132 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PreventionCartoon_8132)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PreventionCartoon_8132 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PreventionCartoon_8132)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PreventionCartoon_8132 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PreventionCartoon_8132 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PreventionCartoon_8132> parser() {
         return PARSER;
      }

      public Parser<S2C_PreventionCartoon_8132> getParserForType() {
         return PARSER;
      }

      public S2C_PreventionCartoon_8132 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PreventionCartoon_8132OrBuilder {
         private int bitField0_;
         private boolean isGot_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PreventionCartoon_8132.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_PreventionCartoon_8132.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isGot_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoon_8132_descriptor;
         }

         public S2C_PreventionCartoon_8132 getDefaultInstanceForType() {
            return BenefitMsg.S2C_PreventionCartoon_8132.getDefaultInstance();
         }

         public S2C_PreventionCartoon_8132 build() {
            S2C_PreventionCartoon_8132 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PreventionCartoon_8132 buildPartial() {
            S2C_PreventionCartoon_8132 result = new S2C_PreventionCartoon_8132(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isGot_ = this.isGot_;
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
            if (other instanceof S2C_PreventionCartoon_8132) {
               return this.mergeFrom((S2C_PreventionCartoon_8132)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PreventionCartoon_8132 other) {
            if (other == BenefitMsg.S2C_PreventionCartoon_8132.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsGot()) {
                  this.setIsGot(other.getIsGot());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsGot();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PreventionCartoon_8132 parsedMessage = null;

            try {
               parsedMessage = (S2C_PreventionCartoon_8132)BenefitMsg.S2C_PreventionCartoon_8132.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PreventionCartoon_8132)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsGot() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsGot() {
            return this.isGot_;
         }

         public Builder setIsGot(boolean value) {
            this.bitField0_ |= 1;
            this.isGot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGot() {
            this.bitField0_ &= -2;
            this.isGot_ = false;
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

   public static final class C2S_PreventionCartoonReward_8133 extends GeneratedMessageV3 implements C2S_PreventionCartoonReward_8133OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PreventionCartoonReward_8133 DEFAULT_INSTANCE = new C2S_PreventionCartoonReward_8133();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PreventionCartoonReward_8133> PARSER = new AbstractParser<C2S_PreventionCartoonReward_8133>() {
         public C2S_PreventionCartoonReward_8133 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PreventionCartoonReward_8133(input, extensionRegistry);
         }
      };

      private C2S_PreventionCartoonReward_8133(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PreventionCartoonReward_8133() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PreventionCartoonReward_8133();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PreventionCartoonReward_8133(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PreventionCartoonReward_8133.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PreventionCartoonReward_8133)) {
            return super.equals(obj);
         } else {
            C2S_PreventionCartoonReward_8133 other = (C2S_PreventionCartoonReward_8133)obj;
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

      public static C2S_PreventionCartoonReward_8133 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoonReward_8133)PARSER.parseFrom(data);
      }

      public static C2S_PreventionCartoonReward_8133 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoonReward_8133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PreventionCartoonReward_8133 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoonReward_8133)PARSER.parseFrom(data);
      }

      public static C2S_PreventionCartoonReward_8133 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoonReward_8133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PreventionCartoonReward_8133 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoonReward_8133)PARSER.parseFrom(data);
      }

      public static C2S_PreventionCartoonReward_8133 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PreventionCartoonReward_8133)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PreventionCartoonReward_8133 parseFrom(InputStream input) throws IOException {
         return (C2S_PreventionCartoonReward_8133)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PreventionCartoonReward_8133 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PreventionCartoonReward_8133)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PreventionCartoonReward_8133 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PreventionCartoonReward_8133)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PreventionCartoonReward_8133 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PreventionCartoonReward_8133)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PreventionCartoonReward_8133 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PreventionCartoonReward_8133)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PreventionCartoonReward_8133 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PreventionCartoonReward_8133)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PreventionCartoonReward_8133 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PreventionCartoonReward_8133 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PreventionCartoonReward_8133> parser() {
         return PARSER;
      }

      public Parser<C2S_PreventionCartoonReward_8133> getParserForType() {
         return PARSER;
      }

      public C2S_PreventionCartoonReward_8133 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PreventionCartoonReward_8133OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PreventionCartoonReward_8133.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_PreventionCartoonReward_8133.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_PreventionCartoonReward_8133_descriptor;
         }

         public C2S_PreventionCartoonReward_8133 getDefaultInstanceForType() {
            return BenefitMsg.C2S_PreventionCartoonReward_8133.getDefaultInstance();
         }

         public C2S_PreventionCartoonReward_8133 build() {
            C2S_PreventionCartoonReward_8133 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PreventionCartoonReward_8133 buildPartial() {
            C2S_PreventionCartoonReward_8133 result = new C2S_PreventionCartoonReward_8133(this);
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
            if (other instanceof C2S_PreventionCartoonReward_8133) {
               return this.mergeFrom((C2S_PreventionCartoonReward_8133)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PreventionCartoonReward_8133 other) {
            if (other == BenefitMsg.C2S_PreventionCartoonReward_8133.getDefaultInstance()) {
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
            C2S_PreventionCartoonReward_8133 parsedMessage = null;

            try {
               parsedMessage = (C2S_PreventionCartoonReward_8133)BenefitMsg.C2S_PreventionCartoonReward_8133.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PreventionCartoonReward_8133)e.getUnfinishedMessage();
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

   public static final class S2C_PreventionCartoonReward_8134 extends GeneratedMessageV3 implements S2C_PreventionCartoonReward_8134OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISGOT_FIELD_NUMBER = 1;
      private boolean isGot_;
      private byte memoizedIsInitialized;
      private static final S2C_PreventionCartoonReward_8134 DEFAULT_INSTANCE = new S2C_PreventionCartoonReward_8134();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PreventionCartoonReward_8134> PARSER = new AbstractParser<S2C_PreventionCartoonReward_8134>() {
         public S2C_PreventionCartoonReward_8134 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PreventionCartoonReward_8134(input, extensionRegistry);
         }
      };

      private S2C_PreventionCartoonReward_8134(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PreventionCartoonReward_8134() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PreventionCartoonReward_8134();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PreventionCartoonReward_8134(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isGot_ = input.readBool();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PreventionCartoonReward_8134.class, Builder.class);
      }

      public boolean hasIsGot() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsGot() {
         return this.isGot_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsGot()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.isGot_);
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
               size += CodedOutputStream.computeBoolSize(1, this.isGot_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PreventionCartoonReward_8134)) {
            return super.equals(obj);
         } else {
            S2C_PreventionCartoonReward_8134 other = (S2C_PreventionCartoonReward_8134)obj;
            if (this.hasIsGot() != other.hasIsGot()) {
               return false;
            } else if (this.hasIsGot() && this.getIsGot() != other.getIsGot()) {
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
            if (this.hasIsGot()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGot());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoonReward_8134)PARSER.parseFrom(data);
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoonReward_8134)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoonReward_8134)PARSER.parseFrom(data);
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoonReward_8134)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoonReward_8134)PARSER.parseFrom(data);
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PreventionCartoonReward_8134)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(InputStream input) throws IOException {
         return (S2C_PreventionCartoonReward_8134)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PreventionCartoonReward_8134)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PreventionCartoonReward_8134 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PreventionCartoonReward_8134)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PreventionCartoonReward_8134 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PreventionCartoonReward_8134)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PreventionCartoonReward_8134)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PreventionCartoonReward_8134 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PreventionCartoonReward_8134)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PreventionCartoonReward_8134 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PreventionCartoonReward_8134 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PreventionCartoonReward_8134> parser() {
         return PARSER;
      }

      public Parser<S2C_PreventionCartoonReward_8134> getParserForType() {
         return PARSER;
      }

      public S2C_PreventionCartoonReward_8134 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PreventionCartoonReward_8134OrBuilder {
         private int bitField0_;
         private boolean isGot_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PreventionCartoonReward_8134.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_PreventionCartoonReward_8134.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isGot_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_PreventionCartoonReward_8134_descriptor;
         }

         public S2C_PreventionCartoonReward_8134 getDefaultInstanceForType() {
            return BenefitMsg.S2C_PreventionCartoonReward_8134.getDefaultInstance();
         }

         public S2C_PreventionCartoonReward_8134 build() {
            S2C_PreventionCartoonReward_8134 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PreventionCartoonReward_8134 buildPartial() {
            S2C_PreventionCartoonReward_8134 result = new S2C_PreventionCartoonReward_8134(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isGot_ = this.isGot_;
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
            if (other instanceof S2C_PreventionCartoonReward_8134) {
               return this.mergeFrom((S2C_PreventionCartoonReward_8134)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PreventionCartoonReward_8134 other) {
            if (other == BenefitMsg.S2C_PreventionCartoonReward_8134.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsGot()) {
                  this.setIsGot(other.getIsGot());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsGot();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PreventionCartoonReward_8134 parsedMessage = null;

            try {
               parsedMessage = (S2C_PreventionCartoonReward_8134)BenefitMsg.S2C_PreventionCartoonReward_8134.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PreventionCartoonReward_8134)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsGot() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsGot() {
            return this.isGot_;
         }

         public Builder setIsGot(boolean value) {
            this.bitField0_ |= 1;
            this.isGot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGot() {
            this.bitField0_ &= -2;
            this.isGot_ = false;
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

   public static final class C2S_ShopGoldCdKeyTime_8135 extends GeneratedMessageV3 implements C2S_ShopGoldCdKeyTime_8135OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopGoldCdKeyTime_8135 DEFAULT_INSTANCE = new C2S_ShopGoldCdKeyTime_8135();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopGoldCdKeyTime_8135> PARSER = new AbstractParser<C2S_ShopGoldCdKeyTime_8135>() {
         public C2S_ShopGoldCdKeyTime_8135 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopGoldCdKeyTime_8135(input, extensionRegistry);
         }
      };

      private C2S_ShopGoldCdKeyTime_8135(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopGoldCdKeyTime_8135() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopGoldCdKeyTime_8135();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopGoldCdKeyTime_8135(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopGoldCdKeyTime_8135.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopGoldCdKeyTime_8135)) {
            return super.equals(obj);
         } else {
            C2S_ShopGoldCdKeyTime_8135 other = (C2S_ShopGoldCdKeyTime_8135)obj;
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

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopGoldCdKeyTime_8135)PARSER.parseFrom(data);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopGoldCdKeyTime_8135)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopGoldCdKeyTime_8135)PARSER.parseFrom(data);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopGoldCdKeyTime_8135)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopGoldCdKeyTime_8135)PARSER.parseFrom(data);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopGoldCdKeyTime_8135)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopGoldCdKeyTime_8135)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopGoldCdKeyTime_8135)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopGoldCdKeyTime_8135)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopGoldCdKeyTime_8135)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopGoldCdKeyTime_8135)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopGoldCdKeyTime_8135 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopGoldCdKeyTime_8135)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopGoldCdKeyTime_8135 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopGoldCdKeyTime_8135 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopGoldCdKeyTime_8135> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopGoldCdKeyTime_8135> getParserForType() {
         return PARSER;
      }

      public C2S_ShopGoldCdKeyTime_8135 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopGoldCdKeyTime_8135OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopGoldCdKeyTime_8135.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.C2S_ShopGoldCdKeyTime_8135.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_C2S_ShopGoldCdKeyTime_8135_descriptor;
         }

         public C2S_ShopGoldCdKeyTime_8135 getDefaultInstanceForType() {
            return BenefitMsg.C2S_ShopGoldCdKeyTime_8135.getDefaultInstance();
         }

         public C2S_ShopGoldCdKeyTime_8135 build() {
            C2S_ShopGoldCdKeyTime_8135 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopGoldCdKeyTime_8135 buildPartial() {
            C2S_ShopGoldCdKeyTime_8135 result = new C2S_ShopGoldCdKeyTime_8135(this);
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
            if (other instanceof C2S_ShopGoldCdKeyTime_8135) {
               return this.mergeFrom((C2S_ShopGoldCdKeyTime_8135)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopGoldCdKeyTime_8135 other) {
            if (other == BenefitMsg.C2S_ShopGoldCdKeyTime_8135.getDefaultInstance()) {
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
            C2S_ShopGoldCdKeyTime_8135 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopGoldCdKeyTime_8135)BenefitMsg.C2S_ShopGoldCdKeyTime_8135.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopGoldCdKeyTime_8135)e.getUnfinishedMessage();
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

   public static final class S2C_ShopGoldCdKeyTime_8136 extends GeneratedMessageV3 implements S2C_ShopGoldCdKeyTime_8136OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPGOLDCDKEY_FIELD_NUMBER = 1;
      private ShopGoldCdKey shopGoldCdKey_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopGoldCdKeyTime_8136 DEFAULT_INSTANCE = new S2C_ShopGoldCdKeyTime_8136();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopGoldCdKeyTime_8136> PARSER = new AbstractParser<S2C_ShopGoldCdKeyTime_8136>() {
         public S2C_ShopGoldCdKeyTime_8136 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopGoldCdKeyTime_8136(input, extensionRegistry);
         }
      };

      private S2C_ShopGoldCdKeyTime_8136(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopGoldCdKeyTime_8136() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopGoldCdKeyTime_8136();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopGoldCdKeyTime_8136(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ShopGoldCdKey.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.shopGoldCdKey_.toBuilder();
                        }

                        this.shopGoldCdKey_ = (ShopGoldCdKey)input.readMessage(BenefitMsg.ShopGoldCdKey.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.shopGoldCdKey_);
                           this.shopGoldCdKey_ = subBuilder.buildPartial();
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
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopGoldCdKeyTime_8136.class, Builder.class);
      }

      public boolean hasShopGoldCdKey() {
         return (this.bitField0_ & 1) != 0;
      }

      public ShopGoldCdKey getShopGoldCdKey() {
         return this.shopGoldCdKey_ == null ? BenefitMsg.ShopGoldCdKey.getDefaultInstance() : this.shopGoldCdKey_;
      }

      public ShopGoldCdKeyOrBuilder getShopGoldCdKeyOrBuilder() {
         return this.shopGoldCdKey_ == null ? BenefitMsg.ShopGoldCdKey.getDefaultInstance() : this.shopGoldCdKey_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopGoldCdKey()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getShopGoldCdKey().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getShopGoldCdKey());
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
               size += CodedOutputStream.computeMessageSize(1, this.getShopGoldCdKey());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShopGoldCdKeyTime_8136)) {
            return super.equals(obj);
         } else {
            S2C_ShopGoldCdKeyTime_8136 other = (S2C_ShopGoldCdKeyTime_8136)obj;
            if (this.hasShopGoldCdKey() != other.hasShopGoldCdKey()) {
               return false;
            } else if (this.hasShopGoldCdKey() && !this.getShopGoldCdKey().equals(other.getShopGoldCdKey())) {
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
            if (this.hasShopGoldCdKey()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopGoldCdKey().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopGoldCdKeyTime_8136)PARSER.parseFrom(data);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopGoldCdKeyTime_8136)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopGoldCdKeyTime_8136)PARSER.parseFrom(data);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopGoldCdKeyTime_8136)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopGoldCdKeyTime_8136)PARSER.parseFrom(data);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopGoldCdKeyTime_8136)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopGoldCdKeyTime_8136)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopGoldCdKeyTime_8136)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopGoldCdKeyTime_8136)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopGoldCdKeyTime_8136)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopGoldCdKeyTime_8136)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopGoldCdKeyTime_8136 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopGoldCdKeyTime_8136)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopGoldCdKeyTime_8136 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopGoldCdKeyTime_8136 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopGoldCdKeyTime_8136> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopGoldCdKeyTime_8136> getParserForType() {
         return PARSER;
      }

      public S2C_ShopGoldCdKeyTime_8136 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopGoldCdKeyTime_8136OrBuilder {
         private int bitField0_;
         private ShopGoldCdKey shopGoldCdKey_;
         private SingleFieldBuilderV3<ShopGoldCdKey, ShopGoldCdKey.Builder, ShopGoldCdKeyOrBuilder> shopGoldCdKeyBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopGoldCdKeyTime_8136.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.S2C_ShopGoldCdKeyTime_8136.alwaysUseFieldBuilders) {
               this.getShopGoldCdKeyFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.shopGoldCdKeyBuilder_ == null) {
               this.shopGoldCdKey_ = null;
            } else {
               this.shopGoldCdKeyBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_S2C_ShopGoldCdKeyTime_8136_descriptor;
         }

         public S2C_ShopGoldCdKeyTime_8136 getDefaultInstanceForType() {
            return BenefitMsg.S2C_ShopGoldCdKeyTime_8136.getDefaultInstance();
         }

         public S2C_ShopGoldCdKeyTime_8136 build() {
            S2C_ShopGoldCdKeyTime_8136 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopGoldCdKeyTime_8136 buildPartial() {
            S2C_ShopGoldCdKeyTime_8136 result = new S2C_ShopGoldCdKeyTime_8136(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.shopGoldCdKeyBuilder_ == null) {
                  result.shopGoldCdKey_ = this.shopGoldCdKey_;
               } else {
                  result.shopGoldCdKey_ = (ShopGoldCdKey)this.shopGoldCdKeyBuilder_.build();
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
            if (other instanceof S2C_ShopGoldCdKeyTime_8136) {
               return this.mergeFrom((S2C_ShopGoldCdKeyTime_8136)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopGoldCdKeyTime_8136 other) {
            if (other == BenefitMsg.S2C_ShopGoldCdKeyTime_8136.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopGoldCdKey()) {
                  this.mergeShopGoldCdKey(other.getShopGoldCdKey());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShopGoldCdKey()) {
               return false;
            } else {
               return this.getShopGoldCdKey().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShopGoldCdKeyTime_8136 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopGoldCdKeyTime_8136)BenefitMsg.S2C_ShopGoldCdKeyTime_8136.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopGoldCdKeyTime_8136)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopGoldCdKey() {
            return (this.bitField0_ & 1) != 0;
         }

         public ShopGoldCdKey getShopGoldCdKey() {
            if (this.shopGoldCdKeyBuilder_ == null) {
               return this.shopGoldCdKey_ == null ? BenefitMsg.ShopGoldCdKey.getDefaultInstance() : this.shopGoldCdKey_;
            } else {
               return (ShopGoldCdKey)this.shopGoldCdKeyBuilder_.getMessage();
            }
         }

         public Builder setShopGoldCdKey(ShopGoldCdKey value) {
            if (this.shopGoldCdKeyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.shopGoldCdKey_ = value;
               this.onChanged();
            } else {
               this.shopGoldCdKeyBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setShopGoldCdKey(ShopGoldCdKey.Builder builderForValue) {
            if (this.shopGoldCdKeyBuilder_ == null) {
               this.shopGoldCdKey_ = builderForValue.build();
               this.onChanged();
            } else {
               this.shopGoldCdKeyBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeShopGoldCdKey(ShopGoldCdKey value) {
            if (this.shopGoldCdKeyBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.shopGoldCdKey_ != null && this.shopGoldCdKey_ != BenefitMsg.ShopGoldCdKey.getDefaultInstance()) {
                  this.shopGoldCdKey_ = BenefitMsg.ShopGoldCdKey.newBuilder(this.shopGoldCdKey_).mergeFrom(value).buildPartial();
               } else {
                  this.shopGoldCdKey_ = value;
               }

               this.onChanged();
            } else {
               this.shopGoldCdKeyBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearShopGoldCdKey() {
            if (this.shopGoldCdKeyBuilder_ == null) {
               this.shopGoldCdKey_ = null;
               this.onChanged();
            } else {
               this.shopGoldCdKeyBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public ShopGoldCdKey.Builder getShopGoldCdKeyBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ShopGoldCdKey.Builder)this.getShopGoldCdKeyFieldBuilder().getBuilder();
         }

         public ShopGoldCdKeyOrBuilder getShopGoldCdKeyOrBuilder() {
            if (this.shopGoldCdKeyBuilder_ != null) {
               return (ShopGoldCdKeyOrBuilder)this.shopGoldCdKeyBuilder_.getMessageOrBuilder();
            } else {
               return this.shopGoldCdKey_ == null ? BenefitMsg.ShopGoldCdKey.getDefaultInstance() : this.shopGoldCdKey_;
            }
         }

         private SingleFieldBuilderV3<ShopGoldCdKey, ShopGoldCdKey.Builder, ShopGoldCdKeyOrBuilder> getShopGoldCdKeyFieldBuilder() {
            if (this.shopGoldCdKeyBuilder_ == null) {
               this.shopGoldCdKeyBuilder_ = new SingleFieldBuilderV3(this.getShopGoldCdKey(), this.getParentForChildren(), this.isClean());
               this.shopGoldCdKey_ = null;
            }

            return this.shopGoldCdKeyBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class ShopGoldCdKey extends GeneratedMessageV3 implements ShopGoldCdKeyOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EXCHANGECODE_FIELD_NUMBER = 1;
      private LazyStringList exchangeCode_;
      public static final int LASTEXCHANGETIME_FIELD_NUMBER = 2;
      private long lastExchangeTime_;
      private byte memoizedIsInitialized;
      private static final ShopGoldCdKey DEFAULT_INSTANCE = new ShopGoldCdKey();
      /** @deprecated */
      @Deprecated
      public static final Parser<ShopGoldCdKey> PARSER = new AbstractParser<ShopGoldCdKey>() {
         public ShopGoldCdKey parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ShopGoldCdKey(input, extensionRegistry);
         }
      };

      private ShopGoldCdKey(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ShopGoldCdKey() {
         this.memoizedIsInitialized = -1;
         this.exchangeCode_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ShopGoldCdKey();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ShopGoldCdKey(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.exchangeCode_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.exchangeCode_.add(bs);
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.lastExchangeTime_ = input.readInt64();
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
                  this.exchangeCode_ = this.exchangeCode_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopGoldCdKey.class, Builder.class);
      }

      public ProtocolStringList getExchangeCodeList() {
         return this.exchangeCode_;
      }

      public int getExchangeCodeCount() {
         return this.exchangeCode_.size();
      }

      public String getExchangeCode(int index) {
         return (String)this.exchangeCode_.get(index);
      }

      public ByteString getExchangeCodeBytes(int index) {
         return this.exchangeCode_.getByteString(index);
      }

      public boolean hasLastExchangeTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getLastExchangeTime() {
         return this.lastExchangeTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLastExchangeTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.exchangeCode_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 1, this.exchangeCode_.getRaw(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(2, this.lastExchangeTime_);
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

            for(int i = 0; i < this.exchangeCode_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.exchangeCode_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getExchangeCodeList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.lastExchangeTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ShopGoldCdKey)) {
            return super.equals(obj);
         } else {
            ShopGoldCdKey other = (ShopGoldCdKey)obj;
            if (!this.getExchangeCodeList().equals(other.getExchangeCodeList())) {
               return false;
            } else if (this.hasLastExchangeTime() != other.hasLastExchangeTime()) {
               return false;
            } else if (this.hasLastExchangeTime() && this.getLastExchangeTime() != other.getLastExchangeTime()) {
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
            if (this.getExchangeCodeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getExchangeCodeList().hashCode();
            }

            if (this.hasLastExchangeTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getLastExchangeTime());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ShopGoldCdKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ShopGoldCdKey)PARSER.parseFrom(data);
      }

      public static ShopGoldCdKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopGoldCdKey)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopGoldCdKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ShopGoldCdKey)PARSER.parseFrom(data);
      }

      public static ShopGoldCdKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopGoldCdKey)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopGoldCdKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ShopGoldCdKey)PARSER.parseFrom(data);
      }

      public static ShopGoldCdKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopGoldCdKey)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopGoldCdKey parseFrom(InputStream input) throws IOException {
         return (ShopGoldCdKey)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ShopGoldCdKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopGoldCdKey)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ShopGoldCdKey parseDelimitedFrom(InputStream input) throws IOException {
         return (ShopGoldCdKey)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ShopGoldCdKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopGoldCdKey)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ShopGoldCdKey parseFrom(CodedInputStream input) throws IOException {
         return (ShopGoldCdKey)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ShopGoldCdKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopGoldCdKey)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ShopGoldCdKey prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ShopGoldCdKey getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ShopGoldCdKey> parser() {
         return PARSER;
      }

      public Parser<ShopGoldCdKey> getParserForType() {
         return PARSER;
      }

      public ShopGoldCdKey getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShopGoldCdKeyOrBuilder {
         private int bitField0_;
         private LazyStringList exchangeCode_;
         private long lastExchangeTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopGoldCdKey.class, Builder.class);
         }

         private Builder() {
            this.exchangeCode_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.exchangeCode_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BenefitMsg.ShopGoldCdKey.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.exchangeCode_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.lastExchangeTime_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BenefitMsg.internal_static_benefit_com_gzbz_protobuf_ShopGoldCdKey_descriptor;
         }

         public ShopGoldCdKey getDefaultInstanceForType() {
            return BenefitMsg.ShopGoldCdKey.getDefaultInstance();
         }

         public ShopGoldCdKey build() {
            ShopGoldCdKey result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ShopGoldCdKey buildPartial() {
            ShopGoldCdKey result = new ShopGoldCdKey(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.exchangeCode_ = this.exchangeCode_.getUnmodifiableView();
               this.bitField0_ &= -2;
            }

            result.exchangeCode_ = this.exchangeCode_;
            if ((from_bitField0_ & 2) != 0) {
               result.lastExchangeTime_ = this.lastExchangeTime_;
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
            if (other instanceof ShopGoldCdKey) {
               return this.mergeFrom((ShopGoldCdKey)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ShopGoldCdKey other) {
            if (other == BenefitMsg.ShopGoldCdKey.getDefaultInstance()) {
               return this;
            } else {
               if (!other.exchangeCode_.isEmpty()) {
                  if (this.exchangeCode_.isEmpty()) {
                     this.exchangeCode_ = other.exchangeCode_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureExchangeCodeIsMutable();
                     this.exchangeCode_.addAll(other.exchangeCode_);
                  }

                  this.onChanged();
               }

               if (other.hasLastExchangeTime()) {
                  this.setLastExchangeTime(other.getLastExchangeTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasLastExchangeTime();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ShopGoldCdKey parsedMessage = null;

            try {
               parsedMessage = (ShopGoldCdKey)BenefitMsg.ShopGoldCdKey.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ShopGoldCdKey)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureExchangeCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.exchangeCode_ = new LazyStringArrayList(this.exchangeCode_);
               this.bitField0_ |= 1;
            }

         }

         public ProtocolStringList getExchangeCodeList() {
            return this.exchangeCode_.getUnmodifiableView();
         }

         public int getExchangeCodeCount() {
            return this.exchangeCode_.size();
         }

         public String getExchangeCode(int index) {
            return (String)this.exchangeCode_.get(index);
         }

         public ByteString getExchangeCodeBytes(int index) {
            return this.exchangeCode_.getByteString(index);
         }

         public Builder setExchangeCode(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureExchangeCodeIsMutable();
               this.exchangeCode_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addExchangeCode(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureExchangeCodeIsMutable();
               this.exchangeCode_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllExchangeCode(Iterable<String> values) {
            this.ensureExchangeCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.exchangeCode_);
            this.onChanged();
            return this;
         }

         public Builder clearExchangeCode() {
            this.exchangeCode_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public Builder addExchangeCodeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureExchangeCodeIsMutable();
               this.exchangeCode_.add(value);
               this.onChanged();
               return this;
            }
         }

         public boolean hasLastExchangeTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getLastExchangeTime() {
            return this.lastExchangeTime_;
         }

         public Builder setLastExchangeTime(long value) {
            this.bitField0_ |= 2;
            this.lastExchangeTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLastExchangeTime() {
            this.bitField0_ &= -3;
            this.lastExchangeTime_ = 0L;
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

   public interface C2S_CdKeyReward_8126OrBuilder extends MessageOrBuilder {
      boolean hasCdKey();

      String getCdKey();

      ByteString getCdKeyBytes();
   }

   public interface C2S_DailySignInfo_8101OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DailySign_8103OrBuilder extends MessageOrBuilder {
      boolean hasDay();

      int getDay();
   }

   public interface C2S_GrowFundInfo_8117OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GrowFundReward_8119OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_MonthlyCardInfo_8105OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_MonthlyCardReward_8107OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_MonthlyPreferentialBuy_8115OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();
   }

   public interface C2S_MonthlyPreferentialInfo_8111OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PreventionCartoonReward_8133OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PreventionCartoon_8131OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecommendActive_8128OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_RecommendInfo_8122OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_RecommendReward_8124OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_ShopGoldCdKeyTime_8135OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WeeklyPreferentialBuy_8113OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();
   }

   public interface C2S_WeeklyPreferentialInfo_8109OrBuilder extends MessageOrBuilder {
   }

   public interface GrowFundDataOrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasIsBuy();

      boolean getIsBuy();

      List<Integer> getGotIdsList();

      int getGotIdsCount();

      int getGotIds(int index);
   }

   public interface PreferentialDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<CommonMsg.ItemInfo> getRewardsList();

      CommonMsg.ItemInfo getRewards(int index);

      int getRewardsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index);

      boolean hasBuyCount();

      int getBuyCount();
   }

   public interface RecommendPlayerOrBuilder extends MessageOrBuilder {
      boolean hasHead();

      int getHead();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasLevel();

      int getLevel();

      boolean hasCombatPower();

      long getCombatPower();

      boolean hasVipLv();

      long getVipLv();
   }

   public interface RecommendTaskOrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();

      boolean hasFinishCount();

      int getFinishCount();

      boolean hasRewardCount();

      int getRewardCount();
   }

   public interface S2C_CdKeyRewardResult_8127OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCdKey();

      String getCdKey();

      ByteString getCdKeyBytes();
   }

   public interface S2C_DailySignInfoResult_8102OrBuilder extends MessageOrBuilder {
      List<Integer> getDaysList();

      int getDaysCount();

      int getDays(int index);

      boolean hasTodaySign();

      int getTodaySign();

      boolean hasTodayRecharge();

      boolean getTodayRecharge();

      boolean hasLoginDays();

      int getLoginDays();
   }

   public interface S2C_DailySignResult_8104OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasDay();

      int getDay();
   }

   public interface S2C_GrowFundBuyNotify_8121OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasIsBuy();

      boolean getIsBuy();
   }

   public interface S2C_GrowFundResult_8118OrBuilder extends MessageOrBuilder {
      List<GrowFundData> getDataList();

      GrowFundData getData(int index);

      int getDataCount();

      List<? extends GrowFundDataOrBuilder> getDataOrBuilderList();

      GrowFundDataOrBuilder getDataOrBuilder(int index);
   }

   public interface S2C_GrowFundRewardResult_8120OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasId();

      int getId();
   }

   public interface S2C_MonthlyCardResult_8106OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasRechargeTotal();

      int getRechargeTotal();

      boolean hasIsActivate();

      boolean getIsActivate();

      boolean hasIsGotToday();

      boolean getIsGotToday();

      boolean hasGotDays();

      int getGotDays();

      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();
   }

   public interface S2C_MonthlyPreferentialBuyResult_8116OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasBuyId();

      int getBuyId();
   }

   public interface S2C_MonthlyPreferentialResult_8112OrBuilder extends MessageOrBuilder {
      List<PreferentialData> getDataListList();

      PreferentialData getDataList(int index);

      int getDataListCount();

      List<? extends PreferentialDataOrBuilder> getDataListOrBuilderList();

      PreferentialDataOrBuilder getDataListOrBuilder(int index);
   }

   public interface S2C_PreventionCartoonReward_8134OrBuilder extends MessageOrBuilder {
      boolean hasIsGot();

      boolean getIsGot();
   }

   public interface S2C_PreventionCartoon_8132OrBuilder extends MessageOrBuilder {
      boolean hasIsGot();

      boolean getIsGot();
   }

   public interface S2C_RecommendActive_8129OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface S2C_RecommendResult_8123OrBuilder extends MessageOrBuilder {
      boolean hasRecommendCode();

      int getRecommendCode();

      List<RecommendTask> getTasksList();

      RecommendTask getTasks(int index);

      int getTasksCount();

      List<? extends RecommendTaskOrBuilder> getTasksOrBuilderList();

      RecommendTaskOrBuilder getTasksOrBuilder(int index);

      List<RecommendPlayer> getRecommendPlayerList();

      RecommendPlayer getRecommendPlayer(int index);

      int getRecommendPlayerCount();

      List<? extends RecommendPlayerOrBuilder> getRecommendPlayerOrBuilderList();

      RecommendPlayerOrBuilder getRecommendPlayerOrBuilder(int index);

      boolean hasBeRecommendCode();

      int getBeRecommendCode();
   }

   public interface S2C_RecommendRewardResult_8125OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_ShopGoldCdKeyTime_8136OrBuilder extends MessageOrBuilder {
      boolean hasShopGoldCdKey();

      ShopGoldCdKey getShopGoldCdKey();

      ShopGoldCdKeyOrBuilder getShopGoldCdKeyOrBuilder();
   }

   public interface S2C_WeeklyPreferentialBuyResult_8114OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasBuyId();

      int getBuyId();
   }

   public interface S2C_WeeklyPreferentialResult_8110OrBuilder extends MessageOrBuilder {
      List<PreferentialData> getDataListList();

      PreferentialData getDataList(int index);

      int getDataListCount();

      List<? extends PreferentialDataOrBuilder> getDataListOrBuilderList();

      PreferentialDataOrBuilder getDataListOrBuilder(int index);
   }

   public interface S2C_monthlyCardRewardResult_8108OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasType();

      int getType();

      boolean hasIsGotToday();

      boolean getIsGotToday();

      boolean hasGotDays();

      int getGotDays();
   }

   public interface ShopGoldCdKeyOrBuilder extends MessageOrBuilder {
      List<String> getExchangeCodeList();

      int getExchangeCodeCount();

      String getExchangeCode(int index);

      ByteString getExchangeCodeBytes(int index);

      boolean hasLastExchangeTime();

      long getLastExchangeTime();
   }
}
