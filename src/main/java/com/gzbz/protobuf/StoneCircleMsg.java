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

public final class StoneCircleMsg {
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_EventInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_EventInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_HpData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_HpData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_Arraying_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_Arraying_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private StoneCircleMsg() {
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
      String[] descriptorData = new String[]{"\n\u0011StoneCircle.proto\u0012\u001dstonecircle.com.gzbz.protobuf\u001a\fcommon.proto\"\u001a\n\u0018C2S_StoneCircleInfo_5801\"\u0086\u0002\n\u0018S2C_StoneCircleInfo_5802\u0012\u0011\n\tspiritNum\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0002 \u0002(\u0005\u00125\n\u0006hpData\u0018\u0003 \u0003(\u000b2%.stonecircle.com.gzbz.protobuf.HpData\u0012?\n\u000bsupportInfo\u0018\u0004 \u0003(\u000b2*.stonecircle.com.gzbz.protobuf.SupportInfo\u0012\u0011\n\tmySupport\u0018\u0005 \u0003(\u0005\u0012=\n\nemployInfo\u0018\u0006 \u0003(\u000b2).stonecircle.com.gzbz.protobuf.EmployInfo\"\u0017\n\u0015C2S_StoneMapInfo_5803\"\u0081\u0003\n\u0015S2C_StoneMapInfo_5804\u0012\u0011\n\tspiritNum\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0002 \u0002(\u0005\u0012<\n\bposition\u0018\u0003 \u0002(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u0012\u0011\n\textraGrid\u0018\u0004 \u0003(\u0005\u0012:\n\bmapEvent\u0018\u0005 \u0003(\u000b2(.stonecircle.com.gzbz.protobuf.EventInfo\u0012A\n\rlightPosition\u0018\u0006 \u0003(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u0012\u0013\n\u000bbossMapGrid\u0018\u0007 \u0002(\u0005\u0012\u0014\n\fbossLocation\u0018\b \u0002(\u0005\u0012;\n\tbossEvent\u0018\t \u0003(\u000b2(.stonecircle.com.gzbz.protobuf.EventInfo\u0012\u000e\n\u0006isShow\u0018\n \u0002(\u0005\"/\n\u000bMapIdentify\u0012\u000f\n\u0007mapGrid\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007mapCell\u0018\u0002 \u0002(\u0005\"³\u0001\n\tEventInfo\u0012<\n\bposition\u0018\u0001 \u0002(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u0012\u000f\n\u0007eventId\u0018\u0003 \u0002(\u0005\u0012\u0011\n\teventType\u0018\u0004 \u0001(\u0005\u00127\n\u0005goods\u0018\u0005 \u0003(\u000b2(.stonecircle.com.gzbz.protobuf.ShopGoods\u0012\u000b\n\u0003end\u0018\u0007 \u0002(\b\"+\n\tShopGoods\u0012\u000e\n\u0006shopId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006bought\u0018\u0005 \u0002(\b\"C\n\u000bSupportInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\"\n\bheroInfo\u0018\u0003 \u0002(\u000b2\u0010.common.HeroInfo\"N\n\nEmployInfo\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002hp\u0018\u0002 \u0002(\u0002\u0012\"\n\bheroInfo\u0018\u0003 \u0002(\u000b2\u0010.common.HeroInfo\"\"\n\u0006HpData\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002hp\u0018\u0002 \u0002(\u0002\"e\n\u0014C2S_BattleEvent_5805\u0012<\n\bposition\u0018\u0001 \u0002(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u0012\u000f\n\u0007eventId\u0018\u0002 \u0002(\u0005\"R\n\u0014S2C_BattleEvent_5806\u0012:\n\bmapEvent\u0018\u0005 \u0002(\u000b2(.stonecircle.com.gzbz.protobuf.EventInfo\"#\n\u0010C2S_TpEvent_5807\u0012\u000f\n\u0007eventId\u0018\u0001 \u0002(\u0005\"Z\n\u0010S2C_TpEvent_5808\u0012F\n\bnextInfo\u0018\u0001 \u0002(\u000b24.stonecircle.com.gzbz.protobuf.S2C_StoneMapInfo_5804\"\u0019\n\u0017C2S_RefreshSupport_5809\"Z\n\u0017S2C_RefreshSupport_5810\u0012?\n\u000bsupportInfo\u0018\u0001 \u0003(\u000b2*.stonecircle.com.gzbz.protobuf.SupportInfo\"f\n\u0015C2S_RecoverEvent_5811\u0012<\n\bposition\u0018\u0001 \u0002(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u0012\u000f\n\u0007eventId\u0018\u0002 \u0002(\u0005\"É\u0001\n\u0015S2C_RecoverEvent_5812\u0012:\n\bmapEvent\u0018\u0001 \u0002(\u000b2(.stonecircle.com.gzbz.protobuf.EventInfo\u00125\n\u0006heroHp\u0018\u0002 \u0003(\u000b2%.stonecircle.com.gzbz.protobuf.HpData\u0012=\n\nemployInfo\u0018\u0003 \u0003(\u000b2).stonecircle.com.gzbz.protobuf.EmployInfo\"t\n\u0012C2S_ShopEvent_5813\u0012<\n\bposition\u0018\u0001 \u0002(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u0012\u000f\n\u0007eventId\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007shopInx\u0018\u0003 \u0002(\u0005\"Q\n\u0012S2C_ShopEvent_5814\u0012;\n\tshopEvent\u0018\u0005 \u0002(\u000b2(.stonecircle.com.gzbz.protobuf.EventInfo\"\u001c\n\u001aC2S_EnterSpecialEvent_5815\"\u001c\n\u001aS2C_EnterSpecialEvent_5816\"\u008c\u0001\n\u0011C2S_LightMap_5817\u0012<\n\bposition\u0018\u0001 \u0002(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u00129\n\u0005light\u0018\u0002 \u0003(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\"\u008c\u0001\n\u0011S2C_LightMap_5818\u0012<\n\bposition\u0018\u0001 \u0002(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u00129\n\u0005light\u0018\u0002 \u0003(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\"X\n\u0015C2S_SaveArraying_5819\u0012?\n\textraHero\u0018\u0001 \u0003(\u000b2,.stonecircle.com.gzbz.protobuf.ExtraArraying\"R\n\u0015S2C_SaveArraying_5820\u00129\n\barraying\u0018\u0001 \u0003(\u000b2'.stonecircle.com.gzbz.protobuf.Arraying\"\u0018\n\u0016C2S_ExtraArraying_5821\"S\n\u0016S2C_ExtraArraying_5822\u00129\n\barraying\u0018\u0001 \u0003(\u000b2'.stonecircle.com.gzbz.protobuf.Arraying\"E\n\rExtraArraying\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bposition\u0018\u0003 \u0002(\u0005\"[\n\bArraying\u0012=\n\nemployInfo\u0018\u0001 \u0002(\u000b2).stonecircle.com.gzbz.protobuf.EmployInfo\u0012\u0010\n\bposition\u0018\u0003 \u0002(\u0005\"9\n\u0013C2S_EmployHero_5824\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"V\n\u0013S2C_EmployHero_5825\u0012?\n\u000bsupportHero\u0018\u0001 \u0003(\u000b2*.stonecircle.com.gzbz.protobuf.SupportInfo\"k\n\u001aC2S_FinishCommonEvent_5826\u0012<\n\bposition\u0018\u0001 \u0002(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u0012\u000f\n\u0007eventId\u0018\u0002 \u0002(\u0005\"[\n\u001aS2C_FinishCommonEvent_5827\u0012=\n\u000bcommonEvent\u0018\u0001 \u0002(\u000b2(.stonecircle.com.gzbz.protobuf.EventInfo\"(\n\u0014C2S_SupportHero_5828\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"+\n\u0014S2C_SupportHero_5829\u0012\u0013\n\u000bsupportHero\u0018\u0001 \u0003(\u0005\"d\n\u0013C2S_LeaveEvent_5830\u0012<\n\bposition\u0018\u0001 \u0002(\u000b2*.stonecircle.com.gzbz.protobuf.MapIdentify\u0012\u000f\n\u0007eventId\u0018\u0002 \u0002(\u0005\"S\n\u0013S2C_LeaveEvent_5831\u0012<\n\nleaveEvent\u0018\u0001 \u0002(\u000b2(.stonecircle.com.gzbz.protobuf.EventInfoB%\n\u0011com.gzbz.protobufB\u000eStoneCircleMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_descriptor, new String[0]);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_descriptor, new String[]{"SpiritNum", "Stage", "HpData", "SupportInfo", "MySupport", "EmployInfo"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_descriptor, new String[0]);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_descriptor, new String[]{"SpiritNum", "Stage", "Position", "ExtraGrid", "MapEvent", "LightPosition", "BossMapGrid", "BossLocation", "BossEvent", "IsShow"});
      internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_descriptor, new String[]{"MapGrid", "MapCell"});
      internal_static_stonecircle_com_gzbz_protobuf_EventInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_stonecircle_com_gzbz_protobuf_EventInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_EventInfo_descriptor, new String[]{"Position", "EventId", "EventType", "Goods", "End"});
      internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_descriptor, new String[]{"ShopId", "Bought"});
      internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_descriptor, new String[]{"PlayerId", "HeroInfo"});
      internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_descriptor, new String[]{"PlayerId", "Hp", "HeroInfo"});
      internal_static_stonecircle_com_gzbz_protobuf_HpData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_stonecircle_com_gzbz_protobuf_HpData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_HpData_descriptor, new String[]{"Code", "Hp"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_descriptor, new String[]{"Position", "EventId"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_descriptor, new String[]{"MapEvent"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_descriptor, new String[]{"EventId"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_descriptor, new String[]{"NextInfo"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_descriptor, new String[0]);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_descriptor, new String[]{"SupportInfo"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_descriptor, new String[]{"Position", "EventId"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_descriptor, new String[]{"MapEvent", "HeroHp", "EmployInfo"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_descriptor, new String[]{"Position", "EventId", "ShopInx"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_descriptor, new String[]{"ShopEvent"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_descriptor, new String[0]);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_descriptor, new String[0]);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_descriptor, new String[]{"Position", "Light"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_descriptor, new String[]{"Position", "Light"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_descriptor, new String[]{"ExtraHero"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_descriptor, new String[]{"Arraying"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_descriptor, new String[0]);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_descriptor, new String[]{"Arraying"});
      internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_descriptor, new String[]{"PlayerId", "HeroCode", "Position"});
      internal_static_stonecircle_com_gzbz_protobuf_Arraying_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_stonecircle_com_gzbz_protobuf_Arraying_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_Arraying_descriptor, new String[]{"EmployInfo", "Position"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_descriptor, new String[]{"PlayerId", "HeroCode"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_descriptor, new String[]{"SupportHero"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_descriptor, new String[]{"Position", "EventId"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_descriptor, new String[]{"CommonEvent"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_descriptor, new String[]{"HeroCode"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_descriptor, new String[]{"SupportHero"});
      internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_descriptor, new String[]{"Position", "EventId"});
      internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_descriptor, new String[]{"LeaveEvent"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_StoneCircleInfo_5801 extends GeneratedMessageV3 implements C2S_StoneCircleInfo_5801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_StoneCircleInfo_5801 DEFAULT_INSTANCE = new C2S_StoneCircleInfo_5801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StoneCircleInfo_5801> PARSER = new AbstractParser<C2S_StoneCircleInfo_5801>() {
         public C2S_StoneCircleInfo_5801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StoneCircleInfo_5801(input, extensionRegistry);
         }
      };

      private C2S_StoneCircleInfo_5801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StoneCircleInfo_5801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StoneCircleInfo_5801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StoneCircleInfo_5801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneCircleInfo_5801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StoneCircleInfo_5801)) {
            return super.equals(obj);
         } else {
            C2S_StoneCircleInfo_5801 other = (C2S_StoneCircleInfo_5801)obj;
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

      public static C2S_StoneCircleInfo_5801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StoneCircleInfo_5801)PARSER.parseFrom(data);
      }

      public static C2S_StoneCircleInfo_5801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneCircleInfo_5801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneCircleInfo_5801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StoneCircleInfo_5801)PARSER.parseFrom(data);
      }

      public static C2S_StoneCircleInfo_5801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneCircleInfo_5801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneCircleInfo_5801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StoneCircleInfo_5801)PARSER.parseFrom(data);
      }

      public static C2S_StoneCircleInfo_5801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneCircleInfo_5801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneCircleInfo_5801 parseFrom(InputStream input) throws IOException {
         return (C2S_StoneCircleInfo_5801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneCircleInfo_5801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneCircleInfo_5801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneCircleInfo_5801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StoneCircleInfo_5801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StoneCircleInfo_5801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneCircleInfo_5801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneCircleInfo_5801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StoneCircleInfo_5801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneCircleInfo_5801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneCircleInfo_5801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StoneCircleInfo_5801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StoneCircleInfo_5801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StoneCircleInfo_5801> parser() {
         return PARSER;
      }

      public Parser<C2S_StoneCircleInfo_5801> getParserForType() {
         return PARSER;
      }

      public C2S_StoneCircleInfo_5801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StoneCircleInfo_5801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneCircleInfo_5801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_StoneCircleInfo_5801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneCircleInfo_5801_descriptor;
         }

         public C2S_StoneCircleInfo_5801 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_StoneCircleInfo_5801.getDefaultInstance();
         }

         public C2S_StoneCircleInfo_5801 build() {
            C2S_StoneCircleInfo_5801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StoneCircleInfo_5801 buildPartial() {
            C2S_StoneCircleInfo_5801 result = new C2S_StoneCircleInfo_5801(this);
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
            if (other instanceof C2S_StoneCircleInfo_5801) {
               return this.mergeFrom((C2S_StoneCircleInfo_5801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StoneCircleInfo_5801 other) {
            if (other == StoneCircleMsg.C2S_StoneCircleInfo_5801.getDefaultInstance()) {
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
            C2S_StoneCircleInfo_5801 parsedMessage = null;

            try {
               parsedMessage = (C2S_StoneCircleInfo_5801)StoneCircleMsg.C2S_StoneCircleInfo_5801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StoneCircleInfo_5801)e.getUnfinishedMessage();
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

   public static final class S2C_StoneCircleInfo_5802 extends GeneratedMessageV3 implements S2C_StoneCircleInfo_5802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SPIRITNUM_FIELD_NUMBER = 1;
      private int spiritNum_;
      public static final int STAGE_FIELD_NUMBER = 2;
      private int stage_;
      public static final int HPDATA_FIELD_NUMBER = 3;
      private List<HpData> hpData_;
      public static final int SUPPORTINFO_FIELD_NUMBER = 4;
      private List<SupportInfo> supportInfo_;
      public static final int MYSUPPORT_FIELD_NUMBER = 5;
      private Internal.IntList mySupport_;
      public static final int EMPLOYINFO_FIELD_NUMBER = 6;
      private List<EmployInfo> employInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_StoneCircleInfo_5802 DEFAULT_INSTANCE = new S2C_StoneCircleInfo_5802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StoneCircleInfo_5802> PARSER = new AbstractParser<S2C_StoneCircleInfo_5802>() {
         public S2C_StoneCircleInfo_5802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StoneCircleInfo_5802(input, extensionRegistry);
         }
      };

      private S2C_StoneCircleInfo_5802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StoneCircleInfo_5802() {
         this.memoizedIsInitialized = -1;
         this.hpData_ = Collections.emptyList();
         this.supportInfo_ = Collections.emptyList();
         this.mySupport_ = emptyIntList();
         this.employInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StoneCircleInfo_5802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StoneCircleInfo_5802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.spiritNum_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stage_ = input.readInt32();
                        continue;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.hpData_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.hpData_.add(input.readMessage(StoneCircleMsg.HpData.PARSER, extensionRegistry));
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.supportInfo_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.supportInfo_.add(input.readMessage(StoneCircleMsg.SupportInfo.PARSER, extensionRegistry));
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.mySupport_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.mySupport_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.mySupport_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.employInfo_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.employInfo_.add(input.readMessage(StoneCircleMsg.EmployInfo.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.mySupport_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.hpData_ = Collections.unmodifiableList(this.hpData_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.supportInfo_ = Collections.unmodifiableList(this.supportInfo_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.mySupport_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.employInfo_ = Collections.unmodifiableList(this.employInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneCircleInfo_5802.class, Builder.class);
      }

      public boolean hasSpiritNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSpiritNum() {
         return this.spiritNum_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public List<HpData> getHpDataList() {
         return this.hpData_;
      }

      public List<? extends HpDataOrBuilder> getHpDataOrBuilderList() {
         return this.hpData_;
      }

      public int getHpDataCount() {
         return this.hpData_.size();
      }

      public HpData getHpData(int index) {
         return (HpData)this.hpData_.get(index);
      }

      public HpDataOrBuilder getHpDataOrBuilder(int index) {
         return (HpDataOrBuilder)this.hpData_.get(index);
      }

      public List<SupportInfo> getSupportInfoList() {
         return this.supportInfo_;
      }

      public List<? extends SupportInfoOrBuilder> getSupportInfoOrBuilderList() {
         return this.supportInfo_;
      }

      public int getSupportInfoCount() {
         return this.supportInfo_.size();
      }

      public SupportInfo getSupportInfo(int index) {
         return (SupportInfo)this.supportInfo_.get(index);
      }

      public SupportInfoOrBuilder getSupportInfoOrBuilder(int index) {
         return (SupportInfoOrBuilder)this.supportInfo_.get(index);
      }

      public List<Integer> getMySupportList() {
         return this.mySupport_;
      }

      public int getMySupportCount() {
         return this.mySupport_.size();
      }

      public int getMySupport(int index) {
         return this.mySupport_.getInt(index);
      }

      public List<EmployInfo> getEmployInfoList() {
         return this.employInfo_;
      }

      public List<? extends EmployInfoOrBuilder> getEmployInfoOrBuilderList() {
         return this.employInfo_;
      }

      public int getEmployInfoCount() {
         return this.employInfo_.size();
      }

      public EmployInfo getEmployInfo(int index) {
         return (EmployInfo)this.employInfo_.get(index);
      }

      public EmployInfoOrBuilder getEmployInfoOrBuilder(int index) {
         return (EmployInfoOrBuilder)this.employInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSpiritNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHpDataCount(); ++i) {
               if (!this.getHpData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getSupportInfoCount(); ++i) {
               if (!this.getSupportInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getEmployInfoCount(); ++i) {
               if (!this.getEmployInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.spiritNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stage_);
         }

         for(int i = 0; i < this.hpData_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.hpData_.get(i));
         }

         for(int i = 0; i < this.supportInfo_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.supportInfo_.get(i));
         }

         for(int i = 0; i < this.mySupport_.size(); ++i) {
            output.writeInt32(5, this.mySupport_.getInt(i));
         }

         for(int i = 0; i < this.employInfo_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.employInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.spiritNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stage_);
            }

            for(int i = 0; i < this.hpData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.hpData_.get(i));
            }

            for(int i = 0; i < this.supportInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.supportInfo_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.mySupport_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.mySupport_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMySupportList().size();

            for(int i = 0; i < this.employInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.employInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StoneCircleInfo_5802)) {
            return super.equals(obj);
         } else {
            S2C_StoneCircleInfo_5802 other = (S2C_StoneCircleInfo_5802)obj;
            if (this.hasSpiritNum() != other.hasSpiritNum()) {
               return false;
            } else if (this.hasSpiritNum() && this.getSpiritNum() != other.getSpiritNum()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (!this.getHpDataList().equals(other.getHpDataList())) {
               return false;
            } else if (!this.getSupportInfoList().equals(other.getSupportInfoList())) {
               return false;
            } else if (!this.getMySupportList().equals(other.getMySupportList())) {
               return false;
            } else if (!this.getEmployInfoList().equals(other.getEmployInfoList())) {
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
            if (this.hasSpiritNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSpiritNum();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStage();
            }

            if (this.getHpDataCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHpDataList().hashCode();
            }

            if (this.getSupportInfoCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSupportInfoList().hashCode();
            }

            if (this.getMySupportCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMySupportList().hashCode();
            }

            if (this.getEmployInfoCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getEmployInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StoneCircleInfo_5802)PARSER.parseFrom(data);
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneCircleInfo_5802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StoneCircleInfo_5802)PARSER.parseFrom(data);
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneCircleInfo_5802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StoneCircleInfo_5802)PARSER.parseFrom(data);
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneCircleInfo_5802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(InputStream input) throws IOException {
         return (S2C_StoneCircleInfo_5802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneCircleInfo_5802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneCircleInfo_5802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StoneCircleInfo_5802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StoneCircleInfo_5802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneCircleInfo_5802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StoneCircleInfo_5802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneCircleInfo_5802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneCircleInfo_5802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StoneCircleInfo_5802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StoneCircleInfo_5802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StoneCircleInfo_5802> parser() {
         return PARSER;
      }

      public Parser<S2C_StoneCircleInfo_5802> getParserForType() {
         return PARSER;
      }

      public S2C_StoneCircleInfo_5802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StoneCircleInfo_5802OrBuilder {
         private int bitField0_;
         private int spiritNum_;
         private int stage_;
         private List<HpData> hpData_;
         private RepeatedFieldBuilderV3<HpData, HpData.Builder, HpDataOrBuilder> hpDataBuilder_;
         private List<SupportInfo> supportInfo_;
         private RepeatedFieldBuilderV3<SupportInfo, SupportInfo.Builder, SupportInfoOrBuilder> supportInfoBuilder_;
         private Internal.IntList mySupport_;
         private List<EmployInfo> employInfo_;
         private RepeatedFieldBuilderV3<EmployInfo, EmployInfo.Builder, EmployInfoOrBuilder> employInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneCircleInfo_5802.class, Builder.class);
         }

         private Builder() {
            this.hpData_ = Collections.emptyList();
            this.supportInfo_ = Collections.emptyList();
            this.mySupport_ = StoneCircleMsg.S2C_StoneCircleInfo_5802.emptyIntList();
            this.employInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hpData_ = Collections.emptyList();
            this.supportInfo_ = Collections.emptyList();
            this.mySupport_ = StoneCircleMsg.S2C_StoneCircleInfo_5802.emptyIntList();
            this.employInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_StoneCircleInfo_5802.alwaysUseFieldBuilders) {
               this.getHpDataFieldBuilder();
               this.getSupportInfoFieldBuilder();
               this.getEmployInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.spiritNum_ = 0;
            this.bitField0_ &= -2;
            this.stage_ = 0;
            this.bitField0_ &= -3;
            if (this.hpDataBuilder_ == null) {
               this.hpData_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.hpDataBuilder_.clear();
            }

            if (this.supportInfoBuilder_ == null) {
               this.supportInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.supportInfoBuilder_.clear();
            }

            this.mySupport_ = StoneCircleMsg.S2C_StoneCircleInfo_5802.emptyIntList();
            this.bitField0_ &= -17;
            if (this.employInfoBuilder_ == null) {
               this.employInfo_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.employInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneCircleInfo_5802_descriptor;
         }

         public S2C_StoneCircleInfo_5802 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_StoneCircleInfo_5802.getDefaultInstance();
         }

         public S2C_StoneCircleInfo_5802 build() {
            S2C_StoneCircleInfo_5802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StoneCircleInfo_5802 buildPartial() {
            S2C_StoneCircleInfo_5802 result = new S2C_StoneCircleInfo_5802(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.spiritNum_ = this.spiritNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 2;
            }

            if (this.hpDataBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.hpData_ = Collections.unmodifiableList(this.hpData_);
                  this.bitField0_ &= -5;
               }

               result.hpData_ = this.hpData_;
            } else {
               result.hpData_ = this.hpDataBuilder_.build();
            }

            if (this.supportInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.supportInfo_ = Collections.unmodifiableList(this.supportInfo_);
                  this.bitField0_ &= -9;
               }

               result.supportInfo_ = this.supportInfo_;
            } else {
               result.supportInfo_ = this.supportInfoBuilder_.build();
            }

            if ((this.bitField0_ & 16) != 0) {
               this.mySupport_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.mySupport_ = this.mySupport_;
            if (this.employInfoBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.employInfo_ = Collections.unmodifiableList(this.employInfo_);
                  this.bitField0_ &= -33;
               }

               result.employInfo_ = this.employInfo_;
            } else {
               result.employInfo_ = this.employInfoBuilder_.build();
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
            if (other instanceof S2C_StoneCircleInfo_5802) {
               return this.mergeFrom((S2C_StoneCircleInfo_5802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StoneCircleInfo_5802 other) {
            if (other == StoneCircleMsg.S2C_StoneCircleInfo_5802.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSpiritNum()) {
                  this.setSpiritNum(other.getSpiritNum());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (this.hpDataBuilder_ == null) {
                  if (!other.hpData_.isEmpty()) {
                     if (this.hpData_.isEmpty()) {
                        this.hpData_ = other.hpData_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureHpDataIsMutable();
                        this.hpData_.addAll(other.hpData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.hpData_.isEmpty()) {
                  if (this.hpDataBuilder_.isEmpty()) {
                     this.hpDataBuilder_.dispose();
                     this.hpDataBuilder_ = null;
                     this.hpData_ = other.hpData_;
                     this.bitField0_ &= -5;
                     this.hpDataBuilder_ = StoneCircleMsg.S2C_StoneCircleInfo_5802.alwaysUseFieldBuilders ? this.getHpDataFieldBuilder() : null;
                  } else {
                     this.hpDataBuilder_.addAllMessages(other.hpData_);
                  }
               }

               if (this.supportInfoBuilder_ == null) {
                  if (!other.supportInfo_.isEmpty()) {
                     if (this.supportInfo_.isEmpty()) {
                        this.supportInfo_ = other.supportInfo_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureSupportInfoIsMutable();
                        this.supportInfo_.addAll(other.supportInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.supportInfo_.isEmpty()) {
                  if (this.supportInfoBuilder_.isEmpty()) {
                     this.supportInfoBuilder_.dispose();
                     this.supportInfoBuilder_ = null;
                     this.supportInfo_ = other.supportInfo_;
                     this.bitField0_ &= -9;
                     this.supportInfoBuilder_ = StoneCircleMsg.S2C_StoneCircleInfo_5802.alwaysUseFieldBuilders ? this.getSupportInfoFieldBuilder() : null;
                  } else {
                     this.supportInfoBuilder_.addAllMessages(other.supportInfo_);
                  }
               }

               if (!other.mySupport_.isEmpty()) {
                  if (this.mySupport_.isEmpty()) {
                     this.mySupport_ = other.mySupport_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureMySupportIsMutable();
                     this.mySupport_.addAll(other.mySupport_);
                  }

                  this.onChanged();
               }

               if (this.employInfoBuilder_ == null) {
                  if (!other.employInfo_.isEmpty()) {
                     if (this.employInfo_.isEmpty()) {
                        this.employInfo_ = other.employInfo_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureEmployInfoIsMutable();
                        this.employInfo_.addAll(other.employInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.employInfo_.isEmpty()) {
                  if (this.employInfoBuilder_.isEmpty()) {
                     this.employInfoBuilder_.dispose();
                     this.employInfoBuilder_ = null;
                     this.employInfo_ = other.employInfo_;
                     this.bitField0_ &= -33;
                     this.employInfoBuilder_ = StoneCircleMsg.S2C_StoneCircleInfo_5802.alwaysUseFieldBuilders ? this.getEmployInfoFieldBuilder() : null;
                  } else {
                     this.employInfoBuilder_.addAllMessages(other.employInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSpiritNum()) {
               return false;
            } else if (!this.hasStage()) {
               return false;
            } else {
               for(int i = 0; i < this.getHpDataCount(); ++i) {
                  if (!this.getHpData(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getSupportInfoCount(); ++i) {
                  if (!this.getSupportInfo(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getEmployInfoCount(); ++i) {
                  if (!this.getEmployInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StoneCircleInfo_5802 parsedMessage = null;

            try {
               parsedMessage = (S2C_StoneCircleInfo_5802)StoneCircleMsg.S2C_StoneCircleInfo_5802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StoneCircleInfo_5802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSpiritNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSpiritNum() {
            return this.spiritNum_;
         }

         public Builder setSpiritNum(int value) {
            this.bitField0_ |= 1;
            this.spiritNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSpiritNum() {
            this.bitField0_ &= -2;
            this.spiritNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 2;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHpDataIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hpData_ = new ArrayList(this.hpData_);
               this.bitField0_ |= 4;
            }

         }

         public List<HpData> getHpDataList() {
            return this.hpDataBuilder_ == null ? Collections.unmodifiableList(this.hpData_) : this.hpDataBuilder_.getMessageList();
         }

         public int getHpDataCount() {
            return this.hpDataBuilder_ == null ? this.hpData_.size() : this.hpDataBuilder_.getCount();
         }

         public HpData getHpData(int index) {
            return this.hpDataBuilder_ == null ? (HpData)this.hpData_.get(index) : (HpData)this.hpDataBuilder_.getMessage(index);
         }

         public Builder setHpData(int index, HpData value) {
            if (this.hpDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHpDataIsMutable();
               this.hpData_.set(index, value);
               this.onChanged();
            } else {
               this.hpDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHpData(int index, HpData.Builder builderForValue) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hpDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHpData(HpData value) {
            if (this.hpDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHpDataIsMutable();
               this.hpData_.add(value);
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHpData(int index, HpData value) {
            if (this.hpDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHpDataIsMutable();
               this.hpData_.add(index, value);
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHpData(HpData.Builder builderForValue) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHpData(int index, HpData.Builder builderForValue) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.hpDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHpData(Iterable<? extends HpData> values) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hpData_);
               this.onChanged();
            } else {
               this.hpDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHpData() {
            if (this.hpDataBuilder_ == null) {
               this.hpData_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.hpDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeHpData(int index) {
            if (this.hpDataBuilder_ == null) {
               this.ensureHpDataIsMutable();
               this.hpData_.remove(index);
               this.onChanged();
            } else {
               this.hpDataBuilder_.remove(index);
            }

            return this;
         }

         public HpData.Builder getHpDataBuilder(int index) {
            return (HpData.Builder)this.getHpDataFieldBuilder().getBuilder(index);
         }

         public HpDataOrBuilder getHpDataOrBuilder(int index) {
            return this.hpDataBuilder_ == null ? (HpDataOrBuilder)this.hpData_.get(index) : (HpDataOrBuilder)this.hpDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HpDataOrBuilder> getHpDataOrBuilderList() {
            return this.hpDataBuilder_ != null ? this.hpDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hpData_);
         }

         public HpData.Builder addHpDataBuilder() {
            return (HpData.Builder)this.getHpDataFieldBuilder().addBuilder(StoneCircleMsg.HpData.getDefaultInstance());
         }

         public HpData.Builder addHpDataBuilder(int index) {
            return (HpData.Builder)this.getHpDataFieldBuilder().addBuilder(index, StoneCircleMsg.HpData.getDefaultInstance());
         }

         public List<HpData.Builder> getHpDataBuilderList() {
            return this.getHpDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HpData, HpData.Builder, HpDataOrBuilder> getHpDataFieldBuilder() {
            if (this.hpDataBuilder_ == null) {
               this.hpDataBuilder_ = new RepeatedFieldBuilderV3(this.hpData_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.hpData_ = null;
            }

            return this.hpDataBuilder_;
         }

         private void ensureSupportInfoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.supportInfo_ = new ArrayList(this.supportInfo_);
               this.bitField0_ |= 8;
            }

         }

         public List<SupportInfo> getSupportInfoList() {
            return this.supportInfoBuilder_ == null ? Collections.unmodifiableList(this.supportInfo_) : this.supportInfoBuilder_.getMessageList();
         }

         public int getSupportInfoCount() {
            return this.supportInfoBuilder_ == null ? this.supportInfo_.size() : this.supportInfoBuilder_.getCount();
         }

         public SupportInfo getSupportInfo(int index) {
            return this.supportInfoBuilder_ == null ? (SupportInfo)this.supportInfo_.get(index) : (SupportInfo)this.supportInfoBuilder_.getMessage(index);
         }

         public Builder setSupportInfo(int index, SupportInfo value) {
            if (this.supportInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSupportInfoIsMutable();
               this.supportInfo_.set(index, value);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSupportInfo(int index, SupportInfo.Builder builderForValue) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               this.supportInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.supportInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSupportInfo(SupportInfo value) {
            if (this.supportInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSupportInfoIsMutable();
               this.supportInfo_.add(value);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSupportInfo(int index, SupportInfo value) {
            if (this.supportInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSupportInfoIsMutable();
               this.supportInfo_.add(index, value);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSupportInfo(SupportInfo.Builder builderForValue) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               this.supportInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSupportInfo(int index, SupportInfo.Builder builderForValue) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               this.supportInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSupportInfo(Iterable<? extends SupportInfo> values) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.supportInfo_);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSupportInfo() {
            if (this.supportInfoBuilder_ == null) {
               this.supportInfo_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.supportInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeSupportInfo(int index) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               this.supportInfo_.remove(index);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.remove(index);
            }

            return this;
         }

         public SupportInfo.Builder getSupportInfoBuilder(int index) {
            return (SupportInfo.Builder)this.getSupportInfoFieldBuilder().getBuilder(index);
         }

         public SupportInfoOrBuilder getSupportInfoOrBuilder(int index) {
            return this.supportInfoBuilder_ == null ? (SupportInfoOrBuilder)this.supportInfo_.get(index) : (SupportInfoOrBuilder)this.supportInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SupportInfoOrBuilder> getSupportInfoOrBuilderList() {
            return this.supportInfoBuilder_ != null ? this.supportInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.supportInfo_);
         }

         public SupportInfo.Builder addSupportInfoBuilder() {
            return (SupportInfo.Builder)this.getSupportInfoFieldBuilder().addBuilder(StoneCircleMsg.SupportInfo.getDefaultInstance());
         }

         public SupportInfo.Builder addSupportInfoBuilder(int index) {
            return (SupportInfo.Builder)this.getSupportInfoFieldBuilder().addBuilder(index, StoneCircleMsg.SupportInfo.getDefaultInstance());
         }

         public List<SupportInfo.Builder> getSupportInfoBuilderList() {
            return this.getSupportInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SupportInfo, SupportInfo.Builder, SupportInfoOrBuilder> getSupportInfoFieldBuilder() {
            if (this.supportInfoBuilder_ == null) {
               this.supportInfoBuilder_ = new RepeatedFieldBuilderV3(this.supportInfo_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.supportInfo_ = null;
            }

            return this.supportInfoBuilder_;
         }

         private void ensureMySupportIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.mySupport_ = StoneCircleMsg.S2C_StoneCircleInfo_5802.mutableCopy(this.mySupport_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getMySupportList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.mySupport_) : this.mySupport_);
         }

         public int getMySupportCount() {
            return this.mySupport_.size();
         }

         public int getMySupport(int index) {
            return this.mySupport_.getInt(index);
         }

         public Builder setMySupport(int index, int value) {
            this.ensureMySupportIsMutable();
            this.mySupport_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMySupport(int value) {
            this.ensureMySupportIsMutable();
            this.mySupport_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMySupport(Iterable<? extends Integer> values) {
            this.ensureMySupportIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.mySupport_);
            this.onChanged();
            return this;
         }

         public Builder clearMySupport() {
            this.mySupport_ = StoneCircleMsg.S2C_StoneCircleInfo_5802.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         private void ensureEmployInfoIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.employInfo_ = new ArrayList(this.employInfo_);
               this.bitField0_ |= 32;
            }

         }

         public List<EmployInfo> getEmployInfoList() {
            return this.employInfoBuilder_ == null ? Collections.unmodifiableList(this.employInfo_) : this.employInfoBuilder_.getMessageList();
         }

         public int getEmployInfoCount() {
            return this.employInfoBuilder_ == null ? this.employInfo_.size() : this.employInfoBuilder_.getCount();
         }

         public EmployInfo getEmployInfo(int index) {
            return this.employInfoBuilder_ == null ? (EmployInfo)this.employInfo_.get(index) : (EmployInfo)this.employInfoBuilder_.getMessage(index);
         }

         public Builder setEmployInfo(int index, EmployInfo value) {
            if (this.employInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEmployInfoIsMutable();
               this.employInfo_.set(index, value);
               this.onChanged();
            } else {
               this.employInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEmployInfo(int index, EmployInfo.Builder builderForValue) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               this.employInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.employInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEmployInfo(EmployInfo value) {
            if (this.employInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEmployInfoIsMutable();
               this.employInfo_.add(value);
               this.onChanged();
            } else {
               this.employInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEmployInfo(int index, EmployInfo value) {
            if (this.employInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEmployInfoIsMutable();
               this.employInfo_.add(index, value);
               this.onChanged();
            } else {
               this.employInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEmployInfo(EmployInfo.Builder builderForValue) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               this.employInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.employInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEmployInfo(int index, EmployInfo.Builder builderForValue) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               this.employInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.employInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEmployInfo(Iterable<? extends EmployInfo> values) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.employInfo_);
               this.onChanged();
            } else {
               this.employInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEmployInfo() {
            if (this.employInfoBuilder_ == null) {
               this.employInfo_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.employInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeEmployInfo(int index) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               this.employInfo_.remove(index);
               this.onChanged();
            } else {
               this.employInfoBuilder_.remove(index);
            }

            return this;
         }

         public EmployInfo.Builder getEmployInfoBuilder(int index) {
            return (EmployInfo.Builder)this.getEmployInfoFieldBuilder().getBuilder(index);
         }

         public EmployInfoOrBuilder getEmployInfoOrBuilder(int index) {
            return this.employInfoBuilder_ == null ? (EmployInfoOrBuilder)this.employInfo_.get(index) : (EmployInfoOrBuilder)this.employInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EmployInfoOrBuilder> getEmployInfoOrBuilderList() {
            return this.employInfoBuilder_ != null ? this.employInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.employInfo_);
         }

         public EmployInfo.Builder addEmployInfoBuilder() {
            return (EmployInfo.Builder)this.getEmployInfoFieldBuilder().addBuilder(StoneCircleMsg.EmployInfo.getDefaultInstance());
         }

         public EmployInfo.Builder addEmployInfoBuilder(int index) {
            return (EmployInfo.Builder)this.getEmployInfoFieldBuilder().addBuilder(index, StoneCircleMsg.EmployInfo.getDefaultInstance());
         }

         public List<EmployInfo.Builder> getEmployInfoBuilderList() {
            return this.getEmployInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EmployInfo, EmployInfo.Builder, EmployInfoOrBuilder> getEmployInfoFieldBuilder() {
            if (this.employInfoBuilder_ == null) {
               this.employInfoBuilder_ = new RepeatedFieldBuilderV3(this.employInfo_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.employInfo_ = null;
            }

            return this.employInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_StoneMapInfo_5803 extends GeneratedMessageV3 implements C2S_StoneMapInfo_5803OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_StoneMapInfo_5803 DEFAULT_INSTANCE = new C2S_StoneMapInfo_5803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StoneMapInfo_5803> PARSER = new AbstractParser<C2S_StoneMapInfo_5803>() {
         public C2S_StoneMapInfo_5803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StoneMapInfo_5803(input, extensionRegistry);
         }
      };

      private C2S_StoneMapInfo_5803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StoneMapInfo_5803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StoneMapInfo_5803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StoneMapInfo_5803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneMapInfo_5803.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StoneMapInfo_5803)) {
            return super.equals(obj);
         } else {
            C2S_StoneMapInfo_5803 other = (C2S_StoneMapInfo_5803)obj;
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

      public static C2S_StoneMapInfo_5803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StoneMapInfo_5803)PARSER.parseFrom(data);
      }

      public static C2S_StoneMapInfo_5803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneMapInfo_5803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneMapInfo_5803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StoneMapInfo_5803)PARSER.parseFrom(data);
      }

      public static C2S_StoneMapInfo_5803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneMapInfo_5803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneMapInfo_5803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StoneMapInfo_5803)PARSER.parseFrom(data);
      }

      public static C2S_StoneMapInfo_5803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneMapInfo_5803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneMapInfo_5803 parseFrom(InputStream input) throws IOException {
         return (C2S_StoneMapInfo_5803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneMapInfo_5803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneMapInfo_5803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneMapInfo_5803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StoneMapInfo_5803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StoneMapInfo_5803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneMapInfo_5803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneMapInfo_5803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StoneMapInfo_5803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneMapInfo_5803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneMapInfo_5803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StoneMapInfo_5803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StoneMapInfo_5803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StoneMapInfo_5803> parser() {
         return PARSER;
      }

      public Parser<C2S_StoneMapInfo_5803> getParserForType() {
         return PARSER;
      }

      public C2S_StoneMapInfo_5803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StoneMapInfo_5803OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneMapInfo_5803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_StoneMapInfo_5803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_StoneMapInfo_5803_descriptor;
         }

         public C2S_StoneMapInfo_5803 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_StoneMapInfo_5803.getDefaultInstance();
         }

         public C2S_StoneMapInfo_5803 build() {
            C2S_StoneMapInfo_5803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StoneMapInfo_5803 buildPartial() {
            C2S_StoneMapInfo_5803 result = new C2S_StoneMapInfo_5803(this);
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
            if (other instanceof C2S_StoneMapInfo_5803) {
               return this.mergeFrom((C2S_StoneMapInfo_5803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StoneMapInfo_5803 other) {
            if (other == StoneCircleMsg.C2S_StoneMapInfo_5803.getDefaultInstance()) {
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
            C2S_StoneMapInfo_5803 parsedMessage = null;

            try {
               parsedMessage = (C2S_StoneMapInfo_5803)StoneCircleMsg.C2S_StoneMapInfo_5803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StoneMapInfo_5803)e.getUnfinishedMessage();
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

   public static final class S2C_StoneMapInfo_5804 extends GeneratedMessageV3 implements S2C_StoneMapInfo_5804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SPIRITNUM_FIELD_NUMBER = 1;
      private int spiritNum_;
      public static final int STAGE_FIELD_NUMBER = 2;
      private int stage_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private MapIdentify position_;
      public static final int EXTRAGRID_FIELD_NUMBER = 4;
      private Internal.IntList extraGrid_;
      public static final int MAPEVENT_FIELD_NUMBER = 5;
      private List<EventInfo> mapEvent_;
      public static final int LIGHTPOSITION_FIELD_NUMBER = 6;
      private List<MapIdentify> lightPosition_;
      public static final int BOSSMAPGRID_FIELD_NUMBER = 7;
      private int bossMapGrid_;
      public static final int BOSSLOCATION_FIELD_NUMBER = 8;
      private int bossLocation_;
      public static final int BOSSEVENT_FIELD_NUMBER = 9;
      private List<EventInfo> bossEvent_;
      public static final int ISSHOW_FIELD_NUMBER = 10;
      private int isShow_;
      private byte memoizedIsInitialized;
      private static final S2C_StoneMapInfo_5804 DEFAULT_INSTANCE = new S2C_StoneMapInfo_5804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StoneMapInfo_5804> PARSER = new AbstractParser<S2C_StoneMapInfo_5804>() {
         public S2C_StoneMapInfo_5804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StoneMapInfo_5804(input, extensionRegistry);
         }
      };

      private S2C_StoneMapInfo_5804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StoneMapInfo_5804() {
         this.memoizedIsInitialized = -1;
         this.extraGrid_ = emptyIntList();
         this.mapEvent_ = Collections.emptyList();
         this.lightPosition_ = Collections.emptyList();
         this.bossEvent_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StoneMapInfo_5804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StoneMapInfo_5804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.spiritNum_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.stage_ = input.readInt32();
                        continue;
                     case 26:
                        MapIdentify.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.position_.toBuilder();
                        }

                        this.position_ = (MapIdentify)input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.position_);
                           this.position_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.extraGrid_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.extraGrid_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.extraGrid_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.mapEvent_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.mapEvent_.add(input.readMessage(StoneCircleMsg.EventInfo.PARSER, extensionRegistry));
                        continue;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.lightPosition_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.lightPosition_.add(input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry));
                        continue;
                     case 56:
                        this.bitField0_ |= 8;
                        this.bossMapGrid_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 16;
                        this.bossLocation_ = input.readInt32();
                        continue;
                     case 74:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.bossEvent_ = new ArrayList();
                           mutable_bitField0_ |= 256;
                        }

                        this.bossEvent_.add(input.readMessage(StoneCircleMsg.EventInfo.PARSER, extensionRegistry));
                        continue;
                     case 80:
                        this.bitField0_ |= 32;
                        this.isShow_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.extraGrid_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.extraGrid_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.mapEvent_ = Collections.unmodifiableList(this.mapEvent_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.lightPosition_ = Collections.unmodifiableList(this.lightPosition_);
               }

               if ((mutable_bitField0_ & 256) != 0) {
                  this.bossEvent_ = Collections.unmodifiableList(this.bossEvent_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneMapInfo_5804.class, Builder.class);
      }

      public boolean hasSpiritNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSpiritNum() {
         return this.spiritNum_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 4) != 0;
      }

      public MapIdentify getPosition() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public MapIdentifyOrBuilder getPositionOrBuilder() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public List<Integer> getExtraGridList() {
         return this.extraGrid_;
      }

      public int getExtraGridCount() {
         return this.extraGrid_.size();
      }

      public int getExtraGrid(int index) {
         return this.extraGrid_.getInt(index);
      }

      public List<EventInfo> getMapEventList() {
         return this.mapEvent_;
      }

      public List<? extends EventInfoOrBuilder> getMapEventOrBuilderList() {
         return this.mapEvent_;
      }

      public int getMapEventCount() {
         return this.mapEvent_.size();
      }

      public EventInfo getMapEvent(int index) {
         return (EventInfo)this.mapEvent_.get(index);
      }

      public EventInfoOrBuilder getMapEventOrBuilder(int index) {
         return (EventInfoOrBuilder)this.mapEvent_.get(index);
      }

      public List<MapIdentify> getLightPositionList() {
         return this.lightPosition_;
      }

      public List<? extends MapIdentifyOrBuilder> getLightPositionOrBuilderList() {
         return this.lightPosition_;
      }

      public int getLightPositionCount() {
         return this.lightPosition_.size();
      }

      public MapIdentify getLightPosition(int index) {
         return (MapIdentify)this.lightPosition_.get(index);
      }

      public MapIdentifyOrBuilder getLightPositionOrBuilder(int index) {
         return (MapIdentifyOrBuilder)this.lightPosition_.get(index);
      }

      public boolean hasBossMapGrid() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getBossMapGrid() {
         return this.bossMapGrid_;
      }

      public boolean hasBossLocation() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getBossLocation() {
         return this.bossLocation_;
      }

      public List<EventInfo> getBossEventList() {
         return this.bossEvent_;
      }

      public List<? extends EventInfoOrBuilder> getBossEventOrBuilderList() {
         return this.bossEvent_;
      }

      public int getBossEventCount() {
         return this.bossEvent_.size();
      }

      public EventInfo getBossEvent(int index) {
         return (EventInfo)this.bossEvent_.get(index);
      }

      public EventInfoOrBuilder getBossEventOrBuilder(int index) {
         return (EventInfoOrBuilder)this.bossEvent_.get(index);
      }

      public boolean hasIsShow() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getIsShow() {
         return this.isShow_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSpiritNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBossMapGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBossLocation()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsShow()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPosition().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getMapEventCount(); ++i) {
               if (!this.getMapEvent(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getLightPositionCount(); ++i) {
               if (!this.getLightPosition(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getBossEventCount(); ++i) {
               if (!this.getBossEvent(i).isInitialized()) {
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
            output.writeInt32(1, this.spiritNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.stage_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getPosition());
         }

         for(int i = 0; i < this.extraGrid_.size(); ++i) {
            output.writeInt32(4, this.extraGrid_.getInt(i));
         }

         for(int i = 0; i < this.mapEvent_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.mapEvent_.get(i));
         }

         for(int i = 0; i < this.lightPosition_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.lightPosition_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(7, this.bossMapGrid_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(8, this.bossLocation_);
         }

         for(int i = 0; i < this.bossEvent_.size(); ++i) {
            output.writeMessage(9, (MessageLite)this.bossEvent_.get(i));
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(10, this.isShow_);
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
               size += CodedOutputStream.computeInt32Size(1, this.spiritNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stage_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getPosition());
            }

            int dataSize = 0;

            for(int i = 0; i < this.extraGrid_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.extraGrid_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getExtraGridList().size();

            for(int i = 0; i < this.mapEvent_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.mapEvent_.get(i));
            }

            for(int i = 0; i < this.lightPosition_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.lightPosition_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.bossMapGrid_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.bossLocation_);
            }

            for(int i = 0; i < this.bossEvent_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(9, (MessageLite)this.bossEvent_.get(i));
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.isShow_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StoneMapInfo_5804)) {
            return super.equals(obj);
         } else {
            S2C_StoneMapInfo_5804 other = (S2C_StoneMapInfo_5804)obj;
            if (this.hasSpiritNum() != other.hasSpiritNum()) {
               return false;
            } else if (this.hasSpiritNum() && this.getSpiritNum() != other.getSpiritNum()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
               return false;
            } else if (!this.getExtraGridList().equals(other.getExtraGridList())) {
               return false;
            } else if (!this.getMapEventList().equals(other.getMapEventList())) {
               return false;
            } else if (!this.getLightPositionList().equals(other.getLightPositionList())) {
               return false;
            } else if (this.hasBossMapGrid() != other.hasBossMapGrid()) {
               return false;
            } else if (this.hasBossMapGrid() && this.getBossMapGrid() != other.getBossMapGrid()) {
               return false;
            } else if (this.hasBossLocation() != other.hasBossLocation()) {
               return false;
            } else if (this.hasBossLocation() && this.getBossLocation() != other.getBossLocation()) {
               return false;
            } else if (!this.getBossEventList().equals(other.getBossEventList())) {
               return false;
            } else if (this.hasIsShow() != other.hasIsShow()) {
               return false;
            } else if (this.hasIsShow() && this.getIsShow() != other.getIsShow()) {
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
            if (this.hasSpiritNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSpiritNum();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPosition().hashCode();
            }

            if (this.getExtraGridCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getExtraGridList().hashCode();
            }

            if (this.getMapEventCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMapEventList().hashCode();
            }

            if (this.getLightPositionCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLightPositionList().hashCode();
            }

            if (this.hasBossMapGrid()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getBossMapGrid();
            }

            if (this.hasBossLocation()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getBossLocation();
            }

            if (this.getBossEventCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getBossEventList().hashCode();
            }

            if (this.hasIsShow()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getIsShow();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StoneMapInfo_5804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StoneMapInfo_5804)PARSER.parseFrom(data);
      }

      public static S2C_StoneMapInfo_5804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneMapInfo_5804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneMapInfo_5804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StoneMapInfo_5804)PARSER.parseFrom(data);
      }

      public static S2C_StoneMapInfo_5804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneMapInfo_5804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneMapInfo_5804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StoneMapInfo_5804)PARSER.parseFrom(data);
      }

      public static S2C_StoneMapInfo_5804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneMapInfo_5804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneMapInfo_5804 parseFrom(InputStream input) throws IOException {
         return (S2C_StoneMapInfo_5804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneMapInfo_5804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneMapInfo_5804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneMapInfo_5804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StoneMapInfo_5804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StoneMapInfo_5804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneMapInfo_5804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneMapInfo_5804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StoneMapInfo_5804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneMapInfo_5804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneMapInfo_5804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StoneMapInfo_5804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StoneMapInfo_5804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StoneMapInfo_5804> parser() {
         return PARSER;
      }

      public Parser<S2C_StoneMapInfo_5804> getParserForType() {
         return PARSER;
      }

      public S2C_StoneMapInfo_5804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StoneMapInfo_5804OrBuilder {
         private int bitField0_;
         private int spiritNum_;
         private int stage_;
         private MapIdentify position_;
         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> positionBuilder_;
         private Internal.IntList extraGrid_;
         private List<EventInfo> mapEvent_;
         private RepeatedFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> mapEventBuilder_;
         private List<MapIdentify> lightPosition_;
         private RepeatedFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> lightPositionBuilder_;
         private int bossMapGrid_;
         private int bossLocation_;
         private List<EventInfo> bossEvent_;
         private RepeatedFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> bossEventBuilder_;
         private int isShow_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneMapInfo_5804.class, Builder.class);
         }

         private Builder() {
            this.extraGrid_ = StoneCircleMsg.S2C_StoneMapInfo_5804.emptyIntList();
            this.mapEvent_ = Collections.emptyList();
            this.lightPosition_ = Collections.emptyList();
            this.bossEvent_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.extraGrid_ = StoneCircleMsg.S2C_StoneMapInfo_5804.emptyIntList();
            this.mapEvent_ = Collections.emptyList();
            this.lightPosition_ = Collections.emptyList();
            this.bossEvent_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_StoneMapInfo_5804.alwaysUseFieldBuilders) {
               this.getPositionFieldBuilder();
               this.getMapEventFieldBuilder();
               this.getLightPositionFieldBuilder();
               this.getBossEventFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.spiritNum_ = 0;
            this.bitField0_ &= -2;
            this.stage_ = 0;
            this.bitField0_ &= -3;
            if (this.positionBuilder_ == null) {
               this.position_ = null;
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -5;
            this.extraGrid_ = StoneCircleMsg.S2C_StoneMapInfo_5804.emptyIntList();
            this.bitField0_ &= -9;
            if (this.mapEventBuilder_ == null) {
               this.mapEvent_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.mapEventBuilder_.clear();
            }

            if (this.lightPositionBuilder_ == null) {
               this.lightPosition_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.lightPositionBuilder_.clear();
            }

            this.bossMapGrid_ = 0;
            this.bitField0_ &= -65;
            this.bossLocation_ = 0;
            this.bitField0_ &= -129;
            if (this.bossEventBuilder_ == null) {
               this.bossEvent_ = Collections.emptyList();
               this.bitField0_ &= -257;
            } else {
               this.bossEventBuilder_.clear();
            }

            this.isShow_ = 0;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_StoneMapInfo_5804_descriptor;
         }

         public S2C_StoneMapInfo_5804 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_StoneMapInfo_5804.getDefaultInstance();
         }

         public S2C_StoneMapInfo_5804 build() {
            S2C_StoneMapInfo_5804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StoneMapInfo_5804 buildPartial() {
            S2C_StoneMapInfo_5804 result = new S2C_StoneMapInfo_5804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.spiritNum_ = this.spiritNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.positionBuilder_ == null) {
                  result.position_ = this.position_;
               } else {
                  result.position_ = (MapIdentify)this.positionBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.extraGrid_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.extraGrid_ = this.extraGrid_;
            if (this.mapEventBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.mapEvent_ = Collections.unmodifiableList(this.mapEvent_);
                  this.bitField0_ &= -17;
               }

               result.mapEvent_ = this.mapEvent_;
            } else {
               result.mapEvent_ = this.mapEventBuilder_.build();
            }

            if (this.lightPositionBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.lightPosition_ = Collections.unmodifiableList(this.lightPosition_);
                  this.bitField0_ &= -33;
               }

               result.lightPosition_ = this.lightPosition_;
            } else {
               result.lightPosition_ = this.lightPositionBuilder_.build();
            }

            if ((from_bitField0_ & 64) != 0) {
               result.bossMapGrid_ = this.bossMapGrid_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.bossLocation_ = this.bossLocation_;
               to_bitField0_ |= 16;
            }

            if (this.bossEventBuilder_ == null) {
               if ((this.bitField0_ & 256) != 0) {
                  this.bossEvent_ = Collections.unmodifiableList(this.bossEvent_);
                  this.bitField0_ &= -257;
               }

               result.bossEvent_ = this.bossEvent_;
            } else {
               result.bossEvent_ = this.bossEventBuilder_.build();
            }

            if ((from_bitField0_ & 512) != 0) {
               result.isShow_ = this.isShow_;
               to_bitField0_ |= 32;
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
            if (other instanceof S2C_StoneMapInfo_5804) {
               return this.mergeFrom((S2C_StoneMapInfo_5804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StoneMapInfo_5804 other) {
            if (other == StoneCircleMsg.S2C_StoneMapInfo_5804.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSpiritNum()) {
                  this.setSpiritNum(other.getSpiritNum());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasPosition()) {
                  this.mergePosition(other.getPosition());
               }

               if (!other.extraGrid_.isEmpty()) {
                  if (this.extraGrid_.isEmpty()) {
                     this.extraGrid_ = other.extraGrid_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureExtraGridIsMutable();
                     this.extraGrid_.addAll(other.extraGrid_);
                  }

                  this.onChanged();
               }

               if (this.mapEventBuilder_ == null) {
                  if (!other.mapEvent_.isEmpty()) {
                     if (this.mapEvent_.isEmpty()) {
                        this.mapEvent_ = other.mapEvent_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureMapEventIsMutable();
                        this.mapEvent_.addAll(other.mapEvent_);
                     }

                     this.onChanged();
                  }
               } else if (!other.mapEvent_.isEmpty()) {
                  if (this.mapEventBuilder_.isEmpty()) {
                     this.mapEventBuilder_.dispose();
                     this.mapEventBuilder_ = null;
                     this.mapEvent_ = other.mapEvent_;
                     this.bitField0_ &= -17;
                     this.mapEventBuilder_ = StoneCircleMsg.S2C_StoneMapInfo_5804.alwaysUseFieldBuilders ? this.getMapEventFieldBuilder() : null;
                  } else {
                     this.mapEventBuilder_.addAllMessages(other.mapEvent_);
                  }
               }

               if (this.lightPositionBuilder_ == null) {
                  if (!other.lightPosition_.isEmpty()) {
                     if (this.lightPosition_.isEmpty()) {
                        this.lightPosition_ = other.lightPosition_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureLightPositionIsMutable();
                        this.lightPosition_.addAll(other.lightPosition_);
                     }

                     this.onChanged();
                  }
               } else if (!other.lightPosition_.isEmpty()) {
                  if (this.lightPositionBuilder_.isEmpty()) {
                     this.lightPositionBuilder_.dispose();
                     this.lightPositionBuilder_ = null;
                     this.lightPosition_ = other.lightPosition_;
                     this.bitField0_ &= -33;
                     this.lightPositionBuilder_ = StoneCircleMsg.S2C_StoneMapInfo_5804.alwaysUseFieldBuilders ? this.getLightPositionFieldBuilder() : null;
                  } else {
                     this.lightPositionBuilder_.addAllMessages(other.lightPosition_);
                  }
               }

               if (other.hasBossMapGrid()) {
                  this.setBossMapGrid(other.getBossMapGrid());
               }

               if (other.hasBossLocation()) {
                  this.setBossLocation(other.getBossLocation());
               }

               if (this.bossEventBuilder_ == null) {
                  if (!other.bossEvent_.isEmpty()) {
                     if (this.bossEvent_.isEmpty()) {
                        this.bossEvent_ = other.bossEvent_;
                        this.bitField0_ &= -257;
                     } else {
                        this.ensureBossEventIsMutable();
                        this.bossEvent_.addAll(other.bossEvent_);
                     }

                     this.onChanged();
                  }
               } else if (!other.bossEvent_.isEmpty()) {
                  if (this.bossEventBuilder_.isEmpty()) {
                     this.bossEventBuilder_.dispose();
                     this.bossEventBuilder_ = null;
                     this.bossEvent_ = other.bossEvent_;
                     this.bitField0_ &= -257;
                     this.bossEventBuilder_ = StoneCircleMsg.S2C_StoneMapInfo_5804.alwaysUseFieldBuilders ? this.getBossEventFieldBuilder() : null;
                  } else {
                     this.bossEventBuilder_.addAllMessages(other.bossEvent_);
                  }
               }

               if (other.hasIsShow()) {
                  this.setIsShow(other.getIsShow());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSpiritNum()) {
               return false;
            } else if (!this.hasStage()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else if (!this.hasBossMapGrid()) {
               return false;
            } else if (!this.hasBossLocation()) {
               return false;
            } else if (!this.hasIsShow()) {
               return false;
            } else if (!this.getPosition().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getMapEventCount(); ++i) {
                  if (!this.getMapEvent(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getLightPositionCount(); ++i) {
                  if (!this.getLightPosition(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getBossEventCount(); ++i) {
                  if (!this.getBossEvent(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StoneMapInfo_5804 parsedMessage = null;

            try {
               parsedMessage = (S2C_StoneMapInfo_5804)StoneCircleMsg.S2C_StoneMapInfo_5804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StoneMapInfo_5804)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSpiritNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSpiritNum() {
            return this.spiritNum_;
         }

         public Builder setSpiritNum(int value) {
            this.bitField0_ |= 1;
            this.spiritNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSpiritNum() {
            this.bitField0_ &= -2;
            this.spiritNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 2;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 4) != 0;
         }

         public MapIdentify getPosition() {
            if (this.positionBuilder_ == null) {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            } else {
               return (MapIdentify)this.positionBuilder_.getMessage();
            }
         }

         public Builder setPosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.position_ = value;
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setPosition(MapIdentify.Builder builderForValue) {
            if (this.positionBuilder_ == null) {
               this.position_ = builderForValue.build();
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergePosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.position_ != null && this.position_ != StoneCircleMsg.MapIdentify.getDefaultInstance()) {
                  this.position_ = StoneCircleMsg.MapIdentify.newBuilder(this.position_).mergeFrom(value).buildPartial();
               } else {
                  this.position_ = value;
               }

               this.onChanged();
            } else {
               this.positionBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearPosition() {
            if (this.positionBuilder_ == null) {
               this.position_ = null;
               this.onChanged();
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public MapIdentify.Builder getPositionBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (MapIdentify.Builder)this.getPositionFieldBuilder().getBuilder();
         }

         public MapIdentifyOrBuilder getPositionOrBuilder() {
            if (this.positionBuilder_ != null) {
               return (MapIdentifyOrBuilder)this.positionBuilder_.getMessageOrBuilder();
            } else {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            }
         }

         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getPositionFieldBuilder() {
            if (this.positionBuilder_ == null) {
               this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
               this.position_ = null;
            }

            return this.positionBuilder_;
         }

         private void ensureExtraGridIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.extraGrid_ = StoneCircleMsg.S2C_StoneMapInfo_5804.mutableCopy(this.extraGrid_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getExtraGridList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.extraGrid_) : this.extraGrid_);
         }

         public int getExtraGridCount() {
            return this.extraGrid_.size();
         }

         public int getExtraGrid(int index) {
            return this.extraGrid_.getInt(index);
         }

         public Builder setExtraGrid(int index, int value) {
            this.ensureExtraGridIsMutable();
            this.extraGrid_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addExtraGrid(int value) {
            this.ensureExtraGridIsMutable();
            this.extraGrid_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllExtraGrid(Iterable<? extends Integer> values) {
            this.ensureExtraGridIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.extraGrid_);
            this.onChanged();
            return this;
         }

         public Builder clearExtraGrid() {
            this.extraGrid_ = StoneCircleMsg.S2C_StoneMapInfo_5804.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         private void ensureMapEventIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.mapEvent_ = new ArrayList(this.mapEvent_);
               this.bitField0_ |= 16;
            }

         }

         public List<EventInfo> getMapEventList() {
            return this.mapEventBuilder_ == null ? Collections.unmodifiableList(this.mapEvent_) : this.mapEventBuilder_.getMessageList();
         }

         public int getMapEventCount() {
            return this.mapEventBuilder_ == null ? this.mapEvent_.size() : this.mapEventBuilder_.getCount();
         }

         public EventInfo getMapEvent(int index) {
            return this.mapEventBuilder_ == null ? (EventInfo)this.mapEvent_.get(index) : (EventInfo)this.mapEventBuilder_.getMessage(index);
         }

         public Builder setMapEvent(int index, EventInfo value) {
            if (this.mapEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMapEventIsMutable();
               this.mapEvent_.set(index, value);
               this.onChanged();
            } else {
               this.mapEventBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMapEvent(int index, EventInfo.Builder builderForValue) {
            if (this.mapEventBuilder_ == null) {
               this.ensureMapEventIsMutable();
               this.mapEvent_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mapEventBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMapEvent(EventInfo value) {
            if (this.mapEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMapEventIsMutable();
               this.mapEvent_.add(value);
               this.onChanged();
            } else {
               this.mapEventBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMapEvent(int index, EventInfo value) {
            if (this.mapEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMapEventIsMutable();
               this.mapEvent_.add(index, value);
               this.onChanged();
            } else {
               this.mapEventBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMapEvent(EventInfo.Builder builderForValue) {
            if (this.mapEventBuilder_ == null) {
               this.ensureMapEventIsMutable();
               this.mapEvent_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.mapEventBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMapEvent(int index, EventInfo.Builder builderForValue) {
            if (this.mapEventBuilder_ == null) {
               this.ensureMapEventIsMutable();
               this.mapEvent_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mapEventBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMapEvent(Iterable<? extends EventInfo> values) {
            if (this.mapEventBuilder_ == null) {
               this.ensureMapEventIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.mapEvent_);
               this.onChanged();
            } else {
               this.mapEventBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMapEvent() {
            if (this.mapEventBuilder_ == null) {
               this.mapEvent_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.mapEventBuilder_.clear();
            }

            return this;
         }

         public Builder removeMapEvent(int index) {
            if (this.mapEventBuilder_ == null) {
               this.ensureMapEventIsMutable();
               this.mapEvent_.remove(index);
               this.onChanged();
            } else {
               this.mapEventBuilder_.remove(index);
            }

            return this;
         }

         public EventInfo.Builder getMapEventBuilder(int index) {
            return (EventInfo.Builder)this.getMapEventFieldBuilder().getBuilder(index);
         }

         public EventInfoOrBuilder getMapEventOrBuilder(int index) {
            return this.mapEventBuilder_ == null ? (EventInfoOrBuilder)this.mapEvent_.get(index) : (EventInfoOrBuilder)this.mapEventBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EventInfoOrBuilder> getMapEventOrBuilderList() {
            return this.mapEventBuilder_ != null ? this.mapEventBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.mapEvent_);
         }

         public EventInfo.Builder addMapEventBuilder() {
            return (EventInfo.Builder)this.getMapEventFieldBuilder().addBuilder(StoneCircleMsg.EventInfo.getDefaultInstance());
         }

         public EventInfo.Builder addMapEventBuilder(int index) {
            return (EventInfo.Builder)this.getMapEventFieldBuilder().addBuilder(index, StoneCircleMsg.EventInfo.getDefaultInstance());
         }

         public List<EventInfo.Builder> getMapEventBuilderList() {
            return this.getMapEventFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> getMapEventFieldBuilder() {
            if (this.mapEventBuilder_ == null) {
               this.mapEventBuilder_ = new RepeatedFieldBuilderV3(this.mapEvent_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.mapEvent_ = null;
            }

            return this.mapEventBuilder_;
         }

         private void ensureLightPositionIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.lightPosition_ = new ArrayList(this.lightPosition_);
               this.bitField0_ |= 32;
            }

         }

         public List<MapIdentify> getLightPositionList() {
            return this.lightPositionBuilder_ == null ? Collections.unmodifiableList(this.lightPosition_) : this.lightPositionBuilder_.getMessageList();
         }

         public int getLightPositionCount() {
            return this.lightPositionBuilder_ == null ? this.lightPosition_.size() : this.lightPositionBuilder_.getCount();
         }

         public MapIdentify getLightPosition(int index) {
            return this.lightPositionBuilder_ == null ? (MapIdentify)this.lightPosition_.get(index) : (MapIdentify)this.lightPositionBuilder_.getMessage(index);
         }

         public Builder setLightPosition(int index, MapIdentify value) {
            if (this.lightPositionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLightPositionIsMutable();
               this.lightPosition_.set(index, value);
               this.onChanged();
            } else {
               this.lightPositionBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLightPosition(int index, MapIdentify.Builder builderForValue) {
            if (this.lightPositionBuilder_ == null) {
               this.ensureLightPositionIsMutable();
               this.lightPosition_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lightPositionBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLightPosition(MapIdentify value) {
            if (this.lightPositionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLightPositionIsMutable();
               this.lightPosition_.add(value);
               this.onChanged();
            } else {
               this.lightPositionBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLightPosition(int index, MapIdentify value) {
            if (this.lightPositionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLightPositionIsMutable();
               this.lightPosition_.add(index, value);
               this.onChanged();
            } else {
               this.lightPositionBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLightPosition(MapIdentify.Builder builderForValue) {
            if (this.lightPositionBuilder_ == null) {
               this.ensureLightPositionIsMutable();
               this.lightPosition_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.lightPositionBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLightPosition(int index, MapIdentify.Builder builderForValue) {
            if (this.lightPositionBuilder_ == null) {
               this.ensureLightPositionIsMutable();
               this.lightPosition_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lightPositionBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLightPosition(Iterable<? extends MapIdentify> values) {
            if (this.lightPositionBuilder_ == null) {
               this.ensureLightPositionIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.lightPosition_);
               this.onChanged();
            } else {
               this.lightPositionBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLightPosition() {
            if (this.lightPositionBuilder_ == null) {
               this.lightPosition_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.lightPositionBuilder_.clear();
            }

            return this;
         }

         public Builder removeLightPosition(int index) {
            if (this.lightPositionBuilder_ == null) {
               this.ensureLightPositionIsMutable();
               this.lightPosition_.remove(index);
               this.onChanged();
            } else {
               this.lightPositionBuilder_.remove(index);
            }

            return this;
         }

         public MapIdentify.Builder getLightPositionBuilder(int index) {
            return (MapIdentify.Builder)this.getLightPositionFieldBuilder().getBuilder(index);
         }

         public MapIdentifyOrBuilder getLightPositionOrBuilder(int index) {
            return this.lightPositionBuilder_ == null ? (MapIdentifyOrBuilder)this.lightPosition_.get(index) : (MapIdentifyOrBuilder)this.lightPositionBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MapIdentifyOrBuilder> getLightPositionOrBuilderList() {
            return this.lightPositionBuilder_ != null ? this.lightPositionBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.lightPosition_);
         }

         public MapIdentify.Builder addLightPositionBuilder() {
            return (MapIdentify.Builder)this.getLightPositionFieldBuilder().addBuilder(StoneCircleMsg.MapIdentify.getDefaultInstance());
         }

         public MapIdentify.Builder addLightPositionBuilder(int index) {
            return (MapIdentify.Builder)this.getLightPositionFieldBuilder().addBuilder(index, StoneCircleMsg.MapIdentify.getDefaultInstance());
         }

         public List<MapIdentify.Builder> getLightPositionBuilderList() {
            return this.getLightPositionFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getLightPositionFieldBuilder() {
            if (this.lightPositionBuilder_ == null) {
               this.lightPositionBuilder_ = new RepeatedFieldBuilderV3(this.lightPosition_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.lightPosition_ = null;
            }

            return this.lightPositionBuilder_;
         }

         public boolean hasBossMapGrid() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getBossMapGrid() {
            return this.bossMapGrid_;
         }

         public Builder setBossMapGrid(int value) {
            this.bitField0_ |= 64;
            this.bossMapGrid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBossMapGrid() {
            this.bitField0_ &= -65;
            this.bossMapGrid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBossLocation() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getBossLocation() {
            return this.bossLocation_;
         }

         public Builder setBossLocation(int value) {
            this.bitField0_ |= 128;
            this.bossLocation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBossLocation() {
            this.bitField0_ &= -129;
            this.bossLocation_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBossEventIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.bossEvent_ = new ArrayList(this.bossEvent_);
               this.bitField0_ |= 256;
            }

         }

         public List<EventInfo> getBossEventList() {
            return this.bossEventBuilder_ == null ? Collections.unmodifiableList(this.bossEvent_) : this.bossEventBuilder_.getMessageList();
         }

         public int getBossEventCount() {
            return this.bossEventBuilder_ == null ? this.bossEvent_.size() : this.bossEventBuilder_.getCount();
         }

         public EventInfo getBossEvent(int index) {
            return this.bossEventBuilder_ == null ? (EventInfo)this.bossEvent_.get(index) : (EventInfo)this.bossEventBuilder_.getMessage(index);
         }

         public Builder setBossEvent(int index, EventInfo value) {
            if (this.bossEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBossEventIsMutable();
               this.bossEvent_.set(index, value);
               this.onChanged();
            } else {
               this.bossEventBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBossEvent(int index, EventInfo.Builder builderForValue) {
            if (this.bossEventBuilder_ == null) {
               this.ensureBossEventIsMutable();
               this.bossEvent_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.bossEventBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBossEvent(EventInfo value) {
            if (this.bossEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBossEventIsMutable();
               this.bossEvent_.add(value);
               this.onChanged();
            } else {
               this.bossEventBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBossEvent(int index, EventInfo value) {
            if (this.bossEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBossEventIsMutable();
               this.bossEvent_.add(index, value);
               this.onChanged();
            } else {
               this.bossEventBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBossEvent(EventInfo.Builder builderForValue) {
            if (this.bossEventBuilder_ == null) {
               this.ensureBossEventIsMutable();
               this.bossEvent_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.bossEventBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBossEvent(int index, EventInfo.Builder builderForValue) {
            if (this.bossEventBuilder_ == null) {
               this.ensureBossEventIsMutable();
               this.bossEvent_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.bossEventBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBossEvent(Iterable<? extends EventInfo> values) {
            if (this.bossEventBuilder_ == null) {
               this.ensureBossEventIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.bossEvent_);
               this.onChanged();
            } else {
               this.bossEventBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBossEvent() {
            if (this.bossEventBuilder_ == null) {
               this.bossEvent_ = Collections.emptyList();
               this.bitField0_ &= -257;
               this.onChanged();
            } else {
               this.bossEventBuilder_.clear();
            }

            return this;
         }

         public Builder removeBossEvent(int index) {
            if (this.bossEventBuilder_ == null) {
               this.ensureBossEventIsMutable();
               this.bossEvent_.remove(index);
               this.onChanged();
            } else {
               this.bossEventBuilder_.remove(index);
            }

            return this;
         }

         public EventInfo.Builder getBossEventBuilder(int index) {
            return (EventInfo.Builder)this.getBossEventFieldBuilder().getBuilder(index);
         }

         public EventInfoOrBuilder getBossEventOrBuilder(int index) {
            return this.bossEventBuilder_ == null ? (EventInfoOrBuilder)this.bossEvent_.get(index) : (EventInfoOrBuilder)this.bossEventBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EventInfoOrBuilder> getBossEventOrBuilderList() {
            return this.bossEventBuilder_ != null ? this.bossEventBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.bossEvent_);
         }

         public EventInfo.Builder addBossEventBuilder() {
            return (EventInfo.Builder)this.getBossEventFieldBuilder().addBuilder(StoneCircleMsg.EventInfo.getDefaultInstance());
         }

         public EventInfo.Builder addBossEventBuilder(int index) {
            return (EventInfo.Builder)this.getBossEventFieldBuilder().addBuilder(index, StoneCircleMsg.EventInfo.getDefaultInstance());
         }

         public List<EventInfo.Builder> getBossEventBuilderList() {
            return this.getBossEventFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> getBossEventFieldBuilder() {
            if (this.bossEventBuilder_ == null) {
               this.bossEventBuilder_ = new RepeatedFieldBuilderV3(this.bossEvent_, (this.bitField0_ & 256) != 0, this.getParentForChildren(), this.isClean());
               this.bossEvent_ = null;
            }

            return this.bossEventBuilder_;
         }

         public boolean hasIsShow() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getIsShow() {
            return this.isShow_;
         }

         public Builder setIsShow(int value) {
            this.bitField0_ |= 512;
            this.isShow_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsShow() {
            this.bitField0_ &= -513;
            this.isShow_ = 0;
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

   public static final class MapIdentify extends GeneratedMessageV3 implements MapIdentifyOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAPGRID_FIELD_NUMBER = 1;
      private int mapGrid_;
      public static final int MAPCELL_FIELD_NUMBER = 2;
      private int mapCell_;
      private byte memoizedIsInitialized;
      private static final MapIdentify DEFAULT_INSTANCE = new MapIdentify();
      /** @deprecated */
      @Deprecated
      public static final Parser<MapIdentify> PARSER = new AbstractParser<MapIdentify>() {
         public MapIdentify parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MapIdentify(input, extensionRegistry);
         }
      };

      private MapIdentify(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MapIdentify() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MapIdentify();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MapIdentify(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.mapGrid_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.mapCell_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_fieldAccessorTable.ensureFieldAccessorsInitialized(MapIdentify.class, Builder.class);
      }

      public boolean hasMapGrid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMapGrid() {
         return this.mapGrid_;
      }

      public boolean hasMapCell() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMapCell() {
         return this.mapCell_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMapGrid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMapCell()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.mapGrid_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.mapCell_);
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
               size += CodedOutputStream.computeInt32Size(1, this.mapGrid_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.mapCell_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MapIdentify)) {
            return super.equals(obj);
         } else {
            MapIdentify other = (MapIdentify)obj;
            if (this.hasMapGrid() != other.hasMapGrid()) {
               return false;
            } else if (this.hasMapGrid() && this.getMapGrid() != other.getMapGrid()) {
               return false;
            } else if (this.hasMapCell() != other.hasMapCell()) {
               return false;
            } else if (this.hasMapCell() && this.getMapCell() != other.getMapCell()) {
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
            if (this.hasMapGrid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMapGrid();
            }

            if (this.hasMapCell()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMapCell();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MapIdentify parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MapIdentify)PARSER.parseFrom(data);
      }

      public static MapIdentify parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MapIdentify)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MapIdentify parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MapIdentify)PARSER.parseFrom(data);
      }

      public static MapIdentify parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MapIdentify)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MapIdentify parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MapIdentify)PARSER.parseFrom(data);
      }

      public static MapIdentify parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MapIdentify)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MapIdentify parseFrom(InputStream input) throws IOException {
         return (MapIdentify)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MapIdentify parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MapIdentify)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MapIdentify parseDelimitedFrom(InputStream input) throws IOException {
         return (MapIdentify)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MapIdentify parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MapIdentify)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MapIdentify parseFrom(CodedInputStream input) throws IOException {
         return (MapIdentify)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MapIdentify parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MapIdentify)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MapIdentify prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MapIdentify getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MapIdentify> parser() {
         return PARSER;
      }

      public Parser<MapIdentify> getParserForType() {
         return PARSER;
      }

      public MapIdentify getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MapIdentifyOrBuilder {
         private int bitField0_;
         private int mapGrid_;
         private int mapCell_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_fieldAccessorTable.ensureFieldAccessorsInitialized(MapIdentify.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.MapIdentify.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.mapGrid_ = 0;
            this.bitField0_ &= -2;
            this.mapCell_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_MapIdentify_descriptor;
         }

         public MapIdentify getDefaultInstanceForType() {
            return StoneCircleMsg.MapIdentify.getDefaultInstance();
         }

         public MapIdentify build() {
            MapIdentify result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MapIdentify buildPartial() {
            MapIdentify result = new MapIdentify(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.mapGrid_ = this.mapGrid_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.mapCell_ = this.mapCell_;
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
            if (other instanceof MapIdentify) {
               return this.mergeFrom((MapIdentify)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MapIdentify other) {
            if (other == StoneCircleMsg.MapIdentify.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMapGrid()) {
                  this.setMapGrid(other.getMapGrid());
               }

               if (other.hasMapCell()) {
                  this.setMapCell(other.getMapCell());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMapGrid()) {
               return false;
            } else {
               return this.hasMapCell();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MapIdentify parsedMessage = null;

            try {
               parsedMessage = (MapIdentify)StoneCircleMsg.MapIdentify.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MapIdentify)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMapGrid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMapGrid() {
            return this.mapGrid_;
         }

         public Builder setMapGrid(int value) {
            this.bitField0_ |= 1;
            this.mapGrid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMapGrid() {
            this.bitField0_ &= -2;
            this.mapGrid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMapCell() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMapCell() {
            return this.mapCell_;
         }

         public Builder setMapCell(int value) {
            this.bitField0_ |= 2;
            this.mapCell_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMapCell() {
            this.bitField0_ &= -3;
            this.mapCell_ = 0;
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

   public static final class EventInfo extends GeneratedMessageV3 implements EventInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private MapIdentify position_;
      public static final int EVENTID_FIELD_NUMBER = 3;
      private int eventId_;
      public static final int EVENTTYPE_FIELD_NUMBER = 4;
      private int eventType_;
      public static final int GOODS_FIELD_NUMBER = 5;
      private List<ShopGoods> goods_;
      public static final int END_FIELD_NUMBER = 7;
      private boolean end_;
      private byte memoizedIsInitialized;
      private static final EventInfo DEFAULT_INSTANCE = new EventInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<EventInfo> PARSER = new AbstractParser<EventInfo>() {
         public EventInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new EventInfo(input, extensionRegistry);
         }
      };

      private EventInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private EventInfo() {
         this.memoizedIsInitialized = -1;
         this.goods_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new EventInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private EventInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MapIdentify.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.position_.toBuilder();
                        }

                        this.position_ = (MapIdentify)input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.position_);
                           this.position_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.eventId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.eventType_ = input.readInt32();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.goods_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.goods_.add(input.readMessage(StoneCircleMsg.ShopGoods.PARSER, extensionRegistry));
                        break;
                     case 56:
                        this.bitField0_ |= 8;
                        this.end_ = input.readBool();
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EventInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EventInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EventInfo.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public MapIdentify getPosition() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public MapIdentifyOrBuilder getPositionOrBuilder() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public boolean hasEventId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventId() {
         return this.eventId_;
      }

      public boolean hasEventType() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEventType() {
         return this.eventType_;
      }

      public List<ShopGoods> getGoodsList() {
         return this.goods_;
      }

      public List<? extends ShopGoodsOrBuilder> getGoodsOrBuilderList() {
         return this.goods_;
      }

      public int getGoodsCount() {
         return this.goods_.size();
      }

      public ShopGoods getGoods(int index) {
         return (ShopGoods)this.goods_.get(index);
      }

      public ShopGoodsOrBuilder getGoodsOrBuilder(int index) {
         return (ShopGoodsOrBuilder)this.goods_.get(index);
      }

      public boolean hasEnd() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getEnd() {
         return this.end_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPosition().isInitialized()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getPosition());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.eventId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.eventType_);
         }

         for(int i = 0; i < this.goods_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.goods_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(7, this.end_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getPosition());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.eventId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.eventType_);
            }

            for(int i = 0; i < this.goods_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.goods_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(7, this.end_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof EventInfo)) {
            return super.equals(obj);
         } else {
            EventInfo other = (EventInfo)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
               return false;
            } else if (this.hasEventId() != other.hasEventId()) {
               return false;
            } else if (this.hasEventId() && this.getEventId() != other.getEventId()) {
               return false;
            } else if (this.hasEventType() != other.hasEventType()) {
               return false;
            } else if (this.hasEventType() && this.getEventType() != other.getEventType()) {
               return false;
            } else if (!this.getGoodsList().equals(other.getGoodsList())) {
               return false;
            } else if (this.hasEnd() != other.hasEnd()) {
               return false;
            } else if (this.hasEnd() && this.getEnd() != other.getEnd()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition().hashCode();
            }

            if (this.hasEventId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEventId();
            }

            if (this.hasEventType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEventType();
            }

            if (this.getGoodsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getGoodsList().hashCode();
            }

            if (this.hasEnd()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashBoolean(this.getEnd());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static EventInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (EventInfo)PARSER.parseFrom(data);
      }

      public static EventInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EventInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EventInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (EventInfo)PARSER.parseFrom(data);
      }

      public static EventInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EventInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EventInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (EventInfo)PARSER.parseFrom(data);
      }

      public static EventInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EventInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EventInfo parseFrom(InputStream input) throws IOException {
         return (EventInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EventInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EventInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static EventInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (EventInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static EventInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EventInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static EventInfo parseFrom(CodedInputStream input) throws IOException {
         return (EventInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EventInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EventInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(EventInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static EventInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<EventInfo> parser() {
         return PARSER;
      }

      public Parser<EventInfo> getParserForType() {
         return PARSER;
      }

      public EventInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventInfoOrBuilder {
         private int bitField0_;
         private MapIdentify position_;
         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> positionBuilder_;
         private int eventId_;
         private int eventType_;
         private List<ShopGoods> goods_;
         private RepeatedFieldBuilderV3<ShopGoods, ShopGoods.Builder, ShopGoodsOrBuilder> goodsBuilder_;
         private boolean end_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EventInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EventInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EventInfo.class, Builder.class);
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
            if (StoneCircleMsg.EventInfo.alwaysUseFieldBuilders) {
               this.getPositionFieldBuilder();
               this.getGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.positionBuilder_ == null) {
               this.position_ = null;
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.eventId_ = 0;
            this.bitField0_ &= -3;
            this.eventType_ = 0;
            this.bitField0_ &= -5;
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.goodsBuilder_.clear();
            }

            this.end_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EventInfo_descriptor;
         }

         public EventInfo getDefaultInstanceForType() {
            return StoneCircleMsg.EventInfo.getDefaultInstance();
         }

         public EventInfo build() {
            EventInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public EventInfo buildPartial() {
            EventInfo result = new EventInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.positionBuilder_ == null) {
                  result.position_ = this.position_;
               } else {
                  result.position_ = (MapIdentify)this.positionBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventId_ = this.eventId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.eventType_ = this.eventType_;
               to_bitField0_ |= 4;
            }

            if (this.goodsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
                  this.bitField0_ &= -9;
               }

               result.goods_ = this.goods_;
            } else {
               result.goods_ = this.goodsBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.end_ = this.end_;
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
            if (other instanceof EventInfo) {
               return this.mergeFrom((EventInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(EventInfo other) {
            if (other == StoneCircleMsg.EventInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.mergePosition(other.getPosition());
               }

               if (other.hasEventId()) {
                  this.setEventId(other.getEventId());
               }

               if (other.hasEventType()) {
                  this.setEventType(other.getEventType());
               }

               if (this.goodsBuilder_ == null) {
                  if (!other.goods_.isEmpty()) {
                     if (this.goods_.isEmpty()) {
                        this.goods_ = other.goods_;
                        this.bitField0_ &= -9;
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
                     this.bitField0_ &= -9;
                     this.goodsBuilder_ = StoneCircleMsg.EventInfo.alwaysUseFieldBuilders ? this.getGoodsFieldBuilder() : null;
                  } else {
                     this.goodsBuilder_.addAllMessages(other.goods_);
                  }
               }

               if (other.hasEnd()) {
                  this.setEnd(other.getEnd());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasEventId()) {
               return false;
            } else if (!this.hasEnd()) {
               return false;
            } else if (!this.getPosition().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getGoodsCount(); ++i) {
                  if (!this.getGoods(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            EventInfo parsedMessage = null;

            try {
               parsedMessage = (EventInfo)StoneCircleMsg.EventInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (EventInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public MapIdentify getPosition() {
            if (this.positionBuilder_ == null) {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            } else {
               return (MapIdentify)this.positionBuilder_.getMessage();
            }
         }

         public Builder setPosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.position_ = value;
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPosition(MapIdentify.Builder builderForValue) {
            if (this.positionBuilder_ == null) {
               this.position_ = builderForValue.build();
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != StoneCircleMsg.MapIdentify.getDefaultInstance()) {
                  this.position_ = StoneCircleMsg.MapIdentify.newBuilder(this.position_).mergeFrom(value).buildPartial();
               } else {
                  this.position_ = value;
               }

               this.onChanged();
            } else {
               this.positionBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPosition() {
            if (this.positionBuilder_ == null) {
               this.position_ = null;
               this.onChanged();
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MapIdentify.Builder getPositionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MapIdentify.Builder)this.getPositionFieldBuilder().getBuilder();
         }

         public MapIdentifyOrBuilder getPositionOrBuilder() {
            if (this.positionBuilder_ != null) {
               return (MapIdentifyOrBuilder)this.positionBuilder_.getMessageOrBuilder();
            } else {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            }
         }

         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getPositionFieldBuilder() {
            if (this.positionBuilder_ == null) {
               this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
               this.position_ = null;
            }

            return this.positionBuilder_;
         }

         public boolean hasEventId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventId() {
            return this.eventId_;
         }

         public Builder setEventId(int value) {
            this.bitField0_ |= 2;
            this.eventId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.bitField0_ &= -3;
            this.eventId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEventType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEventType() {
            return this.eventType_;
         }

         public Builder setEventType(int value) {
            this.bitField0_ |= 4;
            this.eventType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventType() {
            this.bitField0_ &= -5;
            this.eventType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGoodsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.goods_ = new ArrayList(this.goods_);
               this.bitField0_ |= 8;
            }

         }

         public List<ShopGoods> getGoodsList() {
            return this.goodsBuilder_ == null ? Collections.unmodifiableList(this.goods_) : this.goodsBuilder_.getMessageList();
         }

         public int getGoodsCount() {
            return this.goodsBuilder_ == null ? this.goods_.size() : this.goodsBuilder_.getCount();
         }

         public ShopGoods getGoods(int index) {
            return this.goodsBuilder_ == null ? (ShopGoods)this.goods_.get(index) : (ShopGoods)this.goodsBuilder_.getMessage(index);
         }

         public Builder setGoods(int index, ShopGoods value) {
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

         public Builder setGoods(int index, ShopGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(ShopGoods value) {
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

         public Builder addGoods(int index, ShopGoods value) {
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

         public Builder addGoods(ShopGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(int index, ShopGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGoods(Iterable<? extends ShopGoods> values) {
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
               this.bitField0_ &= -9;
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

         public ShopGoods.Builder getGoodsBuilder(int index) {
            return (ShopGoods.Builder)this.getGoodsFieldBuilder().getBuilder(index);
         }

         public ShopGoodsOrBuilder getGoodsOrBuilder(int index) {
            return this.goodsBuilder_ == null ? (ShopGoodsOrBuilder)this.goods_.get(index) : (ShopGoodsOrBuilder)this.goodsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ShopGoodsOrBuilder> getGoodsOrBuilderList() {
            return this.goodsBuilder_ != null ? this.goodsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.goods_);
         }

         public ShopGoods.Builder addGoodsBuilder() {
            return (ShopGoods.Builder)this.getGoodsFieldBuilder().addBuilder(StoneCircleMsg.ShopGoods.getDefaultInstance());
         }

         public ShopGoods.Builder addGoodsBuilder(int index) {
            return (ShopGoods.Builder)this.getGoodsFieldBuilder().addBuilder(index, StoneCircleMsg.ShopGoods.getDefaultInstance());
         }

         public List<ShopGoods.Builder> getGoodsBuilderList() {
            return this.getGoodsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ShopGoods, ShopGoods.Builder, ShopGoodsOrBuilder> getGoodsFieldBuilder() {
            if (this.goodsBuilder_ == null) {
               this.goodsBuilder_ = new RepeatedFieldBuilderV3(this.goods_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.goods_ = null;
            }

            return this.goodsBuilder_;
         }

         public boolean hasEnd() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getEnd() {
            return this.end_;
         }

         public Builder setEnd(boolean value) {
            this.bitField0_ |= 16;
            this.end_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnd() {
            this.bitField0_ &= -17;
            this.end_ = false;
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

   public static final class ShopGoods extends GeneratedMessageV3 implements ShopGoodsOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPID_FIELD_NUMBER = 1;
      private int shopId_;
      public static final int BOUGHT_FIELD_NUMBER = 5;
      private boolean bought_;
      private byte memoizedIsInitialized;
      private static final ShopGoods DEFAULT_INSTANCE = new ShopGoods();
      /** @deprecated */
      @Deprecated
      public static final Parser<ShopGoods> PARSER = new AbstractParser<ShopGoods>() {
         public ShopGoods parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ShopGoods(input, extensionRegistry);
         }
      };

      private ShopGoods(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ShopGoods() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ShopGoods();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ShopGoods(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.shopId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 2;
                        this.bought_ = input.readBool();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopGoods.class, Builder.class);
      }

      public boolean hasShopId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShopId() {
         return this.shopId_;
      }

      public boolean hasBought() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getBought() {
         return this.bought_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBought()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shopId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(5, this.bought_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shopId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.bought_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ShopGoods)) {
            return super.equals(obj);
         } else {
            ShopGoods other = (ShopGoods)obj;
            if (this.hasShopId() != other.hasShopId()) {
               return false;
            } else if (this.hasShopId() && this.getShopId() != other.getShopId()) {
               return false;
            } else if (this.hasBought() != other.hasBought()) {
               return false;
            } else if (this.hasBought() && this.getBought() != other.getBought()) {
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
            if (this.hasShopId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShopId();
            }

            if (this.hasBought()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getBought());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ShopGoods parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ShopGoods)PARSER.parseFrom(data);
      }

      public static ShopGoods parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopGoods)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopGoods parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ShopGoods)PARSER.parseFrom(data);
      }

      public static ShopGoods parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopGoods)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopGoods parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ShopGoods)PARSER.parseFrom(data);
      }

      public static ShopGoods parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ShopGoods)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ShopGoods parseFrom(InputStream input) throws IOException {
         return (ShopGoods)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ShopGoods parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopGoods)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ShopGoods parseDelimitedFrom(InputStream input) throws IOException {
         return (ShopGoods)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ShopGoods parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopGoods)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ShopGoods parseFrom(CodedInputStream input) throws IOException {
         return (ShopGoods)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ShopGoods parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ShopGoods)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ShopGoods prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ShopGoods getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ShopGoods> parser() {
         return PARSER;
      }

      public Parser<ShopGoods> getParserForType() {
         return PARSER;
      }

      public ShopGoods getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShopGoodsOrBuilder {
         private int bitField0_;
         private int shopId_;
         private boolean bought_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_fieldAccessorTable.ensureFieldAccessorsInitialized(ShopGoods.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.ShopGoods.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shopId_ = 0;
            this.bitField0_ &= -2;
            this.bought_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ShopGoods_descriptor;
         }

         public ShopGoods getDefaultInstanceForType() {
            return StoneCircleMsg.ShopGoods.getDefaultInstance();
         }

         public ShopGoods build() {
            ShopGoods result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ShopGoods buildPartial() {
            ShopGoods result = new ShopGoods(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shopId_ = this.shopId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.bought_ = this.bought_;
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
            if (other instanceof ShopGoods) {
               return this.mergeFrom((ShopGoods)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ShopGoods other) {
            if (other == StoneCircleMsg.ShopGoods.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopId()) {
                  this.setShopId(other.getShopId());
               }

               if (other.hasBought()) {
                  this.setBought(other.getBought());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShopId()) {
               return false;
            } else {
               return this.hasBought();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ShopGoods parsedMessage = null;

            try {
               parsedMessage = (ShopGoods)StoneCircleMsg.ShopGoods.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ShopGoods)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShopId() {
            return this.shopId_;
         }

         public Builder setShopId(int value) {
            this.bitField0_ |= 1;
            this.shopId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopId() {
            this.bitField0_ &= -2;
            this.shopId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBought() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getBought() {
            return this.bought_;
         }

         public Builder setBought(boolean value) {
            this.bitField0_ |= 2;
            this.bought_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBought() {
            this.bitField0_ &= -3;
            this.bought_ = false;
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

   public static final class SupportInfo extends GeneratedMessageV3 implements SupportInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int HEROINFO_FIELD_NUMBER = 3;
      private CommonMsg.HeroInfo heroInfo_;
      private byte memoizedIsInitialized;
      private static final SupportInfo DEFAULT_INSTANCE = new SupportInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<SupportInfo> PARSER = new AbstractParser<SupportInfo>() {
         public SupportInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SupportInfo(input, extensionRegistry);
         }
      };

      private SupportInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SupportInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SupportInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SupportInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
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
         } else if (!this.hasHeroInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getHeroInfo().isInitialized()) {
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
            output.writeMessage(3, this.getHeroInfo());
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
               size += CodedOutputStream.computeMessageSize(3, this.getHeroInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SupportInfo)) {
            return super.equals(obj);
         } else {
            SupportInfo other = (SupportInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
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

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SupportInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SupportInfo)PARSER.parseFrom(data);
      }

      public static SupportInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SupportInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SupportInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SupportInfo)PARSER.parseFrom(data);
      }

      public static SupportInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SupportInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SupportInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SupportInfo)PARSER.parseFrom(data);
      }

      public static SupportInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SupportInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SupportInfo parseFrom(InputStream input) throws IOException {
         return (SupportInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SupportInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SupportInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SupportInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (SupportInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SupportInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SupportInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SupportInfo parseFrom(CodedInputStream input) throws IOException {
         return (SupportInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SupportInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SupportInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SupportInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SupportInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SupportInfo> parser() {
         return PARSER;
      }

      public Parser<SupportInfo> getParserForType() {
         return PARSER;
      }

      public SupportInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.SupportInfo.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_SupportInfo_descriptor;
         }

         public SupportInfo getDefaultInstanceForType() {
            return StoneCircleMsg.SupportInfo.getDefaultInstance();
         }

         public SupportInfo build() {
            SupportInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SupportInfo buildPartial() {
            SupportInfo result = new SupportInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
               }

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
            if (other instanceof SupportInfo) {
               return this.mergeFrom((SupportInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SupportInfo other) {
            if (other == StoneCircleMsg.SupportInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasHeroInfo()) {
               return false;
            } else {
               return this.getHeroInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SupportInfo parsedMessage = null;

            try {
               parsedMessage = (SupportInfo)StoneCircleMsg.SupportInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SupportInfo)e.getUnfinishedMessage();
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

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.HeroInfo getHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            } else {
               return (CommonMsg.HeroInfo)this.heroInfoBuilder_.getMessage();
            }
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroInfo_ = value;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
            if (this.heroInfoBuilder_ != null) {
               return (CommonMsg.HeroInfoOrBuilder)this.heroInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroInfoFieldBuilder() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfoBuilder_ = new SingleFieldBuilderV3(this.getHeroInfo(), this.getParentForChildren(), this.isClean());
               this.heroInfo_ = null;
            }

            return this.heroInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class EmployInfo extends GeneratedMessageV3 implements EmployInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int HP_FIELD_NUMBER = 2;
      private float hp_;
      public static final int HEROINFO_FIELD_NUMBER = 3;
      private CommonMsg.HeroInfo heroInfo_;
      private byte memoizedIsInitialized;
      private static final EmployInfo DEFAULT_INSTANCE = new EmployInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<EmployInfo> PARSER = new AbstractParser<EmployInfo>() {
         public EmployInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new EmployInfo(input, extensionRegistry);
         }
      };

      private EmployInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private EmployInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new EmployInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private EmployInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 21:
                        this.bitField0_ |= 2;
                        this.hp_ = input.readFloat();
                        break;
                     case 26:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EmployInfo.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasHp() {
         return (this.bitField0_ & 2) != 0;
      }

      public float getHp() {
         return this.hp_;
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
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
         } else if (!this.hasHp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getHeroInfo().isInitialized()) {
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
            output.writeFloat(2, this.hp_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getHeroInfo());
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
               size += CodedOutputStream.computeFloatSize(2, this.hp_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getHeroInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof EmployInfo)) {
            return super.equals(obj);
         } else {
            EmployInfo other = (EmployInfo)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasHp() != other.hasHp()) {
               return false;
            } else if (this.hasHp() && Float.floatToIntBits(this.getHp()) != Float.floatToIntBits(other.getHp())) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
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

            if (this.hasHp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Float.floatToIntBits(this.getHp());
            }

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static EmployInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (EmployInfo)PARSER.parseFrom(data);
      }

      public static EmployInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EmployInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EmployInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (EmployInfo)PARSER.parseFrom(data);
      }

      public static EmployInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EmployInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EmployInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (EmployInfo)PARSER.parseFrom(data);
      }

      public static EmployInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EmployInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EmployInfo parseFrom(InputStream input) throws IOException {
         return (EmployInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EmployInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EmployInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static EmployInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (EmployInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static EmployInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EmployInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static EmployInfo parseFrom(CodedInputStream input) throws IOException {
         return (EmployInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EmployInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EmployInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(EmployInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static EmployInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<EmployInfo> parser() {
         return PARSER;
      }

      public Parser<EmployInfo> getParserForType() {
         return PARSER;
      }

      public EmployInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EmployInfoOrBuilder {
         private int bitField0_;
         private int playerId_;
         private float hp_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EmployInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.EmployInfo.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.hp_ = 0.0F;
            this.bitField0_ &= -3;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_EmployInfo_descriptor;
         }

         public EmployInfo getDefaultInstanceForType() {
            return StoneCircleMsg.EmployInfo.getDefaultInstance();
         }

         public EmployInfo build() {
            EmployInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public EmployInfo buildPartial() {
            EmployInfo result = new EmployInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hp_ = this.hp_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
               }

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
            if (other instanceof EmployInfo) {
               return this.mergeFrom((EmployInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(EmployInfo other) {
            if (other == StoneCircleMsg.EmployInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasHp()) {
                  this.setHp(other.getHp());
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasHp()) {
               return false;
            } else if (!this.hasHeroInfo()) {
               return false;
            } else {
               return this.getHeroInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            EmployInfo parsedMessage = null;

            try {
               parsedMessage = (EmployInfo)StoneCircleMsg.EmployInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (EmployInfo)e.getUnfinishedMessage();
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

         public boolean hasHp() {
            return (this.bitField0_ & 2) != 0;
         }

         public float getHp() {
            return this.hp_;
         }

         public Builder setHp(float value) {
            this.bitField0_ |= 2;
            this.hp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHp() {
            this.bitField0_ &= -3;
            this.hp_ = 0.0F;
            this.onChanged();
            return this;
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.HeroInfo getHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            } else {
               return (CommonMsg.HeroInfo)this.heroInfoBuilder_.getMessage();
            }
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroInfo_ = value;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
            if (this.heroInfoBuilder_ != null) {
               return (CommonMsg.HeroInfoOrBuilder)this.heroInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroInfoFieldBuilder() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfoBuilder_ = new SingleFieldBuilderV3(this.getHeroInfo(), this.getParentForChildren(), this.isClean());
               this.heroInfo_ = null;
            }

            return this.heroInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class HpData extends GeneratedMessageV3 implements HpDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int HP_FIELD_NUMBER = 2;
      private float hp_;
      private byte memoizedIsInitialized;
      private static final HpData DEFAULT_INSTANCE = new HpData();
      /** @deprecated */
      @Deprecated
      public static final Parser<HpData> PARSER = new AbstractParser<HpData>() {
         public HpData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HpData(input, extensionRegistry);
         }
      };

      private HpData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HpData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HpData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HpData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 21:
                        this.bitField0_ |= 2;
                        this.hp_ = input.readFloat();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_HpData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_HpData_fieldAccessorTable.ensureFieldAccessorsInitialized(HpData.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasHp() {
         return (this.bitField0_ & 2) != 0;
      }

      public float getHp() {
         return this.hp_;
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
         } else if (!this.hasHp()) {
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
            output.writeFloat(2, this.hp_);
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
               size += CodedOutputStream.computeFloatSize(2, this.hp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HpData)) {
            return super.equals(obj);
         } else {
            HpData other = (HpData)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasHp() != other.hasHp()) {
               return false;
            } else if (this.hasHp() && Float.floatToIntBits(this.getHp()) != Float.floatToIntBits(other.getHp())) {
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

            if (this.hasHp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Float.floatToIntBits(this.getHp());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HpData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data);
      }

      public static HpData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HpData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data);
      }

      public static HpData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HpData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data);
      }

      public static HpData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HpData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HpData parseFrom(InputStream input) throws IOException {
         return (HpData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HpData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HpData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HpData parseDelimitedFrom(InputStream input) throws IOException {
         return (HpData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HpData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HpData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HpData parseFrom(CodedInputStream input) throws IOException {
         return (HpData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HpData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HpData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HpData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HpData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HpData> parser() {
         return PARSER;
      }

      public Parser<HpData> getParserForType() {
         return PARSER;
      }

      public HpData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HpDataOrBuilder {
         private int bitField0_;
         private int code_;
         private float hp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_HpData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_HpData_fieldAccessorTable.ensureFieldAccessorsInitialized(HpData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.HpData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.hp_ = 0.0F;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_HpData_descriptor;
         }

         public HpData getDefaultInstanceForType() {
            return StoneCircleMsg.HpData.getDefaultInstance();
         }

         public HpData build() {
            HpData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HpData buildPartial() {
            HpData result = new HpData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hp_ = this.hp_;
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
            if (other instanceof HpData) {
               return this.mergeFrom((HpData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HpData other) {
            if (other == StoneCircleMsg.HpData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasHp()) {
                  this.setHp(other.getHp());
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
               return this.hasHp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HpData parsedMessage = null;

            try {
               parsedMessage = (HpData)StoneCircleMsg.HpData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HpData)e.getUnfinishedMessage();
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

         public boolean hasHp() {
            return (this.bitField0_ & 2) != 0;
         }

         public float getHp() {
            return this.hp_;
         }

         public Builder setHp(float value) {
            this.bitField0_ |= 2;
            this.hp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHp() {
            this.bitField0_ &= -3;
            this.hp_ = 0.0F;
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

   public static final class C2S_BattleEvent_5805 extends GeneratedMessageV3 implements C2S_BattleEvent_5805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private MapIdentify position_;
      public static final int EVENTID_FIELD_NUMBER = 2;
      private int eventId_;
      private byte memoizedIsInitialized;
      private static final C2S_BattleEvent_5805 DEFAULT_INSTANCE = new C2S_BattleEvent_5805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BattleEvent_5805> PARSER = new AbstractParser<C2S_BattleEvent_5805>() {
         public C2S_BattleEvent_5805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BattleEvent_5805(input, extensionRegistry);
         }
      };

      private C2S_BattleEvent_5805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BattleEvent_5805() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BattleEvent_5805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BattleEvent_5805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MapIdentify.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.position_.toBuilder();
                        }

                        this.position_ = (MapIdentify)input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.position_);
                           this.position_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eventId_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleEvent_5805.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public MapIdentify getPosition() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public MapIdentifyOrBuilder getPositionOrBuilder() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public boolean hasEventId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventId() {
         return this.eventId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPosition().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getPosition());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eventId_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getPosition());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eventId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BattleEvent_5805)) {
            return super.equals(obj);
         } else {
            C2S_BattleEvent_5805 other = (C2S_BattleEvent_5805)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
               return false;
            } else if (this.hasEventId() != other.hasEventId()) {
               return false;
            } else if (this.hasEventId() && this.getEventId() != other.getEventId()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition().hashCode();
            }

            if (this.hasEventId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BattleEvent_5805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BattleEvent_5805)PARSER.parseFrom(data);
      }

      public static C2S_BattleEvent_5805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleEvent_5805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleEvent_5805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BattleEvent_5805)PARSER.parseFrom(data);
      }

      public static C2S_BattleEvent_5805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleEvent_5805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleEvent_5805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BattleEvent_5805)PARSER.parseFrom(data);
      }

      public static C2S_BattleEvent_5805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BattleEvent_5805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BattleEvent_5805 parseFrom(InputStream input) throws IOException {
         return (C2S_BattleEvent_5805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleEvent_5805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleEvent_5805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleEvent_5805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BattleEvent_5805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BattleEvent_5805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleEvent_5805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BattleEvent_5805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BattleEvent_5805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BattleEvent_5805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BattleEvent_5805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BattleEvent_5805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BattleEvent_5805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BattleEvent_5805> parser() {
         return PARSER;
      }

      public Parser<C2S_BattleEvent_5805> getParserForType() {
         return PARSER;
      }

      public C2S_BattleEvent_5805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BattleEvent_5805OrBuilder {
         private int bitField0_;
         private MapIdentify position_;
         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> positionBuilder_;
         private int eventId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BattleEvent_5805.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_BattleEvent_5805.alwaysUseFieldBuilders) {
               this.getPositionFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.positionBuilder_ == null) {
               this.position_ = null;
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.eventId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_BattleEvent_5805_descriptor;
         }

         public C2S_BattleEvent_5805 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_BattleEvent_5805.getDefaultInstance();
         }

         public C2S_BattleEvent_5805 build() {
            C2S_BattleEvent_5805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BattleEvent_5805 buildPartial() {
            C2S_BattleEvent_5805 result = new C2S_BattleEvent_5805(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.positionBuilder_ == null) {
                  result.position_ = this.position_;
               } else {
                  result.position_ = (MapIdentify)this.positionBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventId_ = this.eventId_;
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
            if (other instanceof C2S_BattleEvent_5805) {
               return this.mergeFrom((C2S_BattleEvent_5805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BattleEvent_5805 other) {
            if (other == StoneCircleMsg.C2S_BattleEvent_5805.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.mergePosition(other.getPosition());
               }

               if (other.hasEventId()) {
                  this.setEventId(other.getEventId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasEventId()) {
               return false;
            } else {
               return this.getPosition().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BattleEvent_5805 parsedMessage = null;

            try {
               parsedMessage = (C2S_BattleEvent_5805)StoneCircleMsg.C2S_BattleEvent_5805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BattleEvent_5805)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public MapIdentify getPosition() {
            if (this.positionBuilder_ == null) {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            } else {
               return (MapIdentify)this.positionBuilder_.getMessage();
            }
         }

         public Builder setPosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.position_ = value;
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPosition(MapIdentify.Builder builderForValue) {
            if (this.positionBuilder_ == null) {
               this.position_ = builderForValue.build();
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != StoneCircleMsg.MapIdentify.getDefaultInstance()) {
                  this.position_ = StoneCircleMsg.MapIdentify.newBuilder(this.position_).mergeFrom(value).buildPartial();
               } else {
                  this.position_ = value;
               }

               this.onChanged();
            } else {
               this.positionBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPosition() {
            if (this.positionBuilder_ == null) {
               this.position_ = null;
               this.onChanged();
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MapIdentify.Builder getPositionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MapIdentify.Builder)this.getPositionFieldBuilder().getBuilder();
         }

         public MapIdentifyOrBuilder getPositionOrBuilder() {
            if (this.positionBuilder_ != null) {
               return (MapIdentifyOrBuilder)this.positionBuilder_.getMessageOrBuilder();
            } else {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            }
         }

         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getPositionFieldBuilder() {
            if (this.positionBuilder_ == null) {
               this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
               this.position_ = null;
            }

            return this.positionBuilder_;
         }

         public boolean hasEventId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventId() {
            return this.eventId_;
         }

         public Builder setEventId(int value) {
            this.bitField0_ |= 2;
            this.eventId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.bitField0_ &= -3;
            this.eventId_ = 0;
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

   public static final class S2C_BattleEvent_5806 extends GeneratedMessageV3 implements S2C_BattleEvent_5806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAPEVENT_FIELD_NUMBER = 5;
      private EventInfo mapEvent_;
      private byte memoizedIsInitialized;
      private static final S2C_BattleEvent_5806 DEFAULT_INSTANCE = new S2C_BattleEvent_5806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BattleEvent_5806> PARSER = new AbstractParser<S2C_BattleEvent_5806>() {
         public S2C_BattleEvent_5806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BattleEvent_5806(input, extensionRegistry);
         }
      };

      private S2C_BattleEvent_5806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BattleEvent_5806() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BattleEvent_5806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BattleEvent_5806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 42:
                        EventInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.mapEvent_.toBuilder();
                        }

                        this.mapEvent_ = (EventInfo)input.readMessage(StoneCircleMsg.EventInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.mapEvent_);
                           this.mapEvent_ = subBuilder.buildPartial();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleEvent_5806.class, Builder.class);
      }

      public boolean hasMapEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public EventInfo getMapEvent() {
         return this.mapEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.mapEvent_;
      }

      public EventInfoOrBuilder getMapEventOrBuilder() {
         return this.mapEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.mapEvent_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMapEvent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMapEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(5, this.getMapEvent());
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
               size += CodedOutputStream.computeMessageSize(5, this.getMapEvent());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BattleEvent_5806)) {
            return super.equals(obj);
         } else {
            S2C_BattleEvent_5806 other = (S2C_BattleEvent_5806)obj;
            if (this.hasMapEvent() != other.hasMapEvent()) {
               return false;
            } else if (this.hasMapEvent() && !this.getMapEvent().equals(other.getMapEvent())) {
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
            if (this.hasMapEvent()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMapEvent().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BattleEvent_5806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BattleEvent_5806)PARSER.parseFrom(data);
      }

      public static S2C_BattleEvent_5806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEvent_5806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEvent_5806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BattleEvent_5806)PARSER.parseFrom(data);
      }

      public static S2C_BattleEvent_5806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEvent_5806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEvent_5806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BattleEvent_5806)PARSER.parseFrom(data);
      }

      public static S2C_BattleEvent_5806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BattleEvent_5806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BattleEvent_5806 parseFrom(InputStream input) throws IOException {
         return (S2C_BattleEvent_5806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleEvent_5806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEvent_5806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleEvent_5806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BattleEvent_5806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BattleEvent_5806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEvent_5806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BattleEvent_5806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BattleEvent_5806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BattleEvent_5806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BattleEvent_5806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BattleEvent_5806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BattleEvent_5806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BattleEvent_5806> parser() {
         return PARSER;
      }

      public Parser<S2C_BattleEvent_5806> getParserForType() {
         return PARSER;
      }

      public S2C_BattleEvent_5806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BattleEvent_5806OrBuilder {
         private int bitField0_;
         private EventInfo mapEvent_;
         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> mapEventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BattleEvent_5806.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_BattleEvent_5806.alwaysUseFieldBuilders) {
               this.getMapEventFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.mapEventBuilder_ == null) {
               this.mapEvent_ = null;
            } else {
               this.mapEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_BattleEvent_5806_descriptor;
         }

         public S2C_BattleEvent_5806 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_BattleEvent_5806.getDefaultInstance();
         }

         public S2C_BattleEvent_5806 build() {
            S2C_BattleEvent_5806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BattleEvent_5806 buildPartial() {
            S2C_BattleEvent_5806 result = new S2C_BattleEvent_5806(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.mapEventBuilder_ == null) {
                  result.mapEvent_ = this.mapEvent_;
               } else {
                  result.mapEvent_ = (EventInfo)this.mapEventBuilder_.build();
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
            if (other instanceof S2C_BattleEvent_5806) {
               return this.mergeFrom((S2C_BattleEvent_5806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BattleEvent_5806 other) {
            if (other == StoneCircleMsg.S2C_BattleEvent_5806.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMapEvent()) {
                  this.mergeMapEvent(other.getMapEvent());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMapEvent()) {
               return false;
            } else {
               return this.getMapEvent().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BattleEvent_5806 parsedMessage = null;

            try {
               parsedMessage = (S2C_BattleEvent_5806)StoneCircleMsg.S2C_BattleEvent_5806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BattleEvent_5806)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMapEvent() {
            return (this.bitField0_ & 1) != 0;
         }

         public EventInfo getMapEvent() {
            if (this.mapEventBuilder_ == null) {
               return this.mapEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.mapEvent_;
            } else {
               return (EventInfo)this.mapEventBuilder_.getMessage();
            }
         }

         public Builder setMapEvent(EventInfo value) {
            if (this.mapEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.mapEvent_ = value;
               this.onChanged();
            } else {
               this.mapEventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setMapEvent(EventInfo.Builder builderForValue) {
            if (this.mapEventBuilder_ == null) {
               this.mapEvent_ = builderForValue.build();
               this.onChanged();
            } else {
               this.mapEventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMapEvent(EventInfo value) {
            if (this.mapEventBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.mapEvent_ != null && this.mapEvent_ != StoneCircleMsg.EventInfo.getDefaultInstance()) {
                  this.mapEvent_ = StoneCircleMsg.EventInfo.newBuilder(this.mapEvent_).mergeFrom(value).buildPartial();
               } else {
                  this.mapEvent_ = value;
               }

               this.onChanged();
            } else {
               this.mapEventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearMapEvent() {
            if (this.mapEventBuilder_ == null) {
               this.mapEvent_ = null;
               this.onChanged();
            } else {
               this.mapEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public EventInfo.Builder getMapEventBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (EventInfo.Builder)this.getMapEventFieldBuilder().getBuilder();
         }

         public EventInfoOrBuilder getMapEventOrBuilder() {
            if (this.mapEventBuilder_ != null) {
               return (EventInfoOrBuilder)this.mapEventBuilder_.getMessageOrBuilder();
            } else {
               return this.mapEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.mapEvent_;
            }
         }

         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> getMapEventFieldBuilder() {
            if (this.mapEventBuilder_ == null) {
               this.mapEventBuilder_ = new SingleFieldBuilderV3(this.getMapEvent(), this.getParentForChildren(), this.isClean());
               this.mapEvent_ = null;
            }

            return this.mapEventBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TpEvent_5807 extends GeneratedMessageV3 implements C2S_TpEvent_5807OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENTID_FIELD_NUMBER = 1;
      private int eventId_;
      private byte memoizedIsInitialized;
      private static final C2S_TpEvent_5807 DEFAULT_INSTANCE = new C2S_TpEvent_5807();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TpEvent_5807> PARSER = new AbstractParser<C2S_TpEvent_5807>() {
         public C2S_TpEvent_5807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TpEvent_5807(input, extensionRegistry);
         }
      };

      private C2S_TpEvent_5807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TpEvent_5807() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TpEvent_5807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TpEvent_5807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.eventId_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TpEvent_5807.class, Builder.class);
      }

      public boolean hasEventId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEventId() {
         return this.eventId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEventId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.eventId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.eventId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TpEvent_5807)) {
            return super.equals(obj);
         } else {
            C2S_TpEvent_5807 other = (C2S_TpEvent_5807)obj;
            if (this.hasEventId() != other.hasEventId()) {
               return false;
            } else if (this.hasEventId() && this.getEventId() != other.getEventId()) {
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
            if (this.hasEventId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEventId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TpEvent_5807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TpEvent_5807)PARSER.parseFrom(data);
      }

      public static C2S_TpEvent_5807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TpEvent_5807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TpEvent_5807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TpEvent_5807)PARSER.parseFrom(data);
      }

      public static C2S_TpEvent_5807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TpEvent_5807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TpEvent_5807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TpEvent_5807)PARSER.parseFrom(data);
      }

      public static C2S_TpEvent_5807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TpEvent_5807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TpEvent_5807 parseFrom(InputStream input) throws IOException {
         return (C2S_TpEvent_5807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TpEvent_5807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TpEvent_5807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TpEvent_5807 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TpEvent_5807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TpEvent_5807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TpEvent_5807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TpEvent_5807 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TpEvent_5807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TpEvent_5807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TpEvent_5807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TpEvent_5807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TpEvent_5807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TpEvent_5807> parser() {
         return PARSER;
      }

      public Parser<C2S_TpEvent_5807> getParserForType() {
         return PARSER;
      }

      public C2S_TpEvent_5807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TpEvent_5807OrBuilder {
         private int bitField0_;
         private int eventId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TpEvent_5807.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_TpEvent_5807.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.eventId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_TpEvent_5807_descriptor;
         }

         public C2S_TpEvent_5807 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_TpEvent_5807.getDefaultInstance();
         }

         public C2S_TpEvent_5807 build() {
            C2S_TpEvent_5807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TpEvent_5807 buildPartial() {
            C2S_TpEvent_5807 result = new C2S_TpEvent_5807(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.eventId_ = this.eventId_;
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
            if (other instanceof C2S_TpEvent_5807) {
               return this.mergeFrom((C2S_TpEvent_5807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TpEvent_5807 other) {
            if (other == StoneCircleMsg.C2S_TpEvent_5807.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEventId()) {
                  this.setEventId(other.getEventId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEventId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TpEvent_5807 parsedMessage = null;

            try {
               parsedMessage = (C2S_TpEvent_5807)StoneCircleMsg.C2S_TpEvent_5807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TpEvent_5807)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEventId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEventId() {
            return this.eventId_;
         }

         public Builder setEventId(int value) {
            this.bitField0_ |= 1;
            this.eventId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.bitField0_ &= -2;
            this.eventId_ = 0;
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

   public static final class S2C_TpEvent_5808 extends GeneratedMessageV3 implements S2C_TpEvent_5808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NEXTINFO_FIELD_NUMBER = 1;
      private S2C_StoneMapInfo_5804 nextInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_TpEvent_5808 DEFAULT_INSTANCE = new S2C_TpEvent_5808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TpEvent_5808> PARSER = new AbstractParser<S2C_TpEvent_5808>() {
         public S2C_TpEvent_5808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TpEvent_5808(input, extensionRegistry);
         }
      };

      private S2C_TpEvent_5808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TpEvent_5808() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TpEvent_5808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TpEvent_5808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        S2C_StoneMapInfo_5804.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.nextInfo_.toBuilder();
                        }

                        this.nextInfo_ = (S2C_StoneMapInfo_5804)input.readMessage(StoneCircleMsg.S2C_StoneMapInfo_5804.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.nextInfo_);
                           this.nextInfo_ = subBuilder.buildPartial();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TpEvent_5808.class, Builder.class);
      }

      public boolean hasNextInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public S2C_StoneMapInfo_5804 getNextInfo() {
         return this.nextInfo_ == null ? StoneCircleMsg.S2C_StoneMapInfo_5804.getDefaultInstance() : this.nextInfo_;
      }

      public S2C_StoneMapInfo_5804OrBuilder getNextInfoOrBuilder() {
         return this.nextInfo_ == null ? StoneCircleMsg.S2C_StoneMapInfo_5804.getDefaultInstance() : this.nextInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasNextInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getNextInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getNextInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getNextInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TpEvent_5808)) {
            return super.equals(obj);
         } else {
            S2C_TpEvent_5808 other = (S2C_TpEvent_5808)obj;
            if (this.hasNextInfo() != other.hasNextInfo()) {
               return false;
            } else if (this.hasNextInfo() && !this.getNextInfo().equals(other.getNextInfo())) {
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
            if (this.hasNextInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNextInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TpEvent_5808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TpEvent_5808)PARSER.parseFrom(data);
      }

      public static S2C_TpEvent_5808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TpEvent_5808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TpEvent_5808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TpEvent_5808)PARSER.parseFrom(data);
      }

      public static S2C_TpEvent_5808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TpEvent_5808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TpEvent_5808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TpEvent_5808)PARSER.parseFrom(data);
      }

      public static S2C_TpEvent_5808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TpEvent_5808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TpEvent_5808 parseFrom(InputStream input) throws IOException {
         return (S2C_TpEvent_5808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TpEvent_5808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TpEvent_5808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TpEvent_5808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TpEvent_5808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TpEvent_5808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TpEvent_5808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TpEvent_5808 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TpEvent_5808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TpEvent_5808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TpEvent_5808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TpEvent_5808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TpEvent_5808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TpEvent_5808> parser() {
         return PARSER;
      }

      public Parser<S2C_TpEvent_5808> getParserForType() {
         return PARSER;
      }

      public S2C_TpEvent_5808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TpEvent_5808OrBuilder {
         private int bitField0_;
         private S2C_StoneMapInfo_5804 nextInfo_;
         private SingleFieldBuilderV3<S2C_StoneMapInfo_5804, S2C_StoneMapInfo_5804.Builder, S2C_StoneMapInfo_5804OrBuilder> nextInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TpEvent_5808.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_TpEvent_5808.alwaysUseFieldBuilders) {
               this.getNextInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.nextInfoBuilder_ == null) {
               this.nextInfo_ = null;
            } else {
               this.nextInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_TpEvent_5808_descriptor;
         }

         public S2C_TpEvent_5808 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_TpEvent_5808.getDefaultInstance();
         }

         public S2C_TpEvent_5808 build() {
            S2C_TpEvent_5808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TpEvent_5808 buildPartial() {
            S2C_TpEvent_5808 result = new S2C_TpEvent_5808(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.nextInfoBuilder_ == null) {
                  result.nextInfo_ = this.nextInfo_;
               } else {
                  result.nextInfo_ = (S2C_StoneMapInfo_5804)this.nextInfoBuilder_.build();
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
            if (other instanceof S2C_TpEvent_5808) {
               return this.mergeFrom((S2C_TpEvent_5808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TpEvent_5808 other) {
            if (other == StoneCircleMsg.S2C_TpEvent_5808.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNextInfo()) {
                  this.mergeNextInfo(other.getNextInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNextInfo()) {
               return false;
            } else {
               return this.getNextInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TpEvent_5808 parsedMessage = null;

            try {
               parsedMessage = (S2C_TpEvent_5808)StoneCircleMsg.S2C_TpEvent_5808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TpEvent_5808)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNextInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public S2C_StoneMapInfo_5804 getNextInfo() {
            if (this.nextInfoBuilder_ == null) {
               return this.nextInfo_ == null ? StoneCircleMsg.S2C_StoneMapInfo_5804.getDefaultInstance() : this.nextInfo_;
            } else {
               return (S2C_StoneMapInfo_5804)this.nextInfoBuilder_.getMessage();
            }
         }

         public Builder setNextInfo(S2C_StoneMapInfo_5804 value) {
            if (this.nextInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.nextInfo_ = value;
               this.onChanged();
            } else {
               this.nextInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setNextInfo(S2C_StoneMapInfo_5804.Builder builderForValue) {
            if (this.nextInfoBuilder_ == null) {
               this.nextInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.nextInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeNextInfo(S2C_StoneMapInfo_5804 value) {
            if (this.nextInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.nextInfo_ != null && this.nextInfo_ != StoneCircleMsg.S2C_StoneMapInfo_5804.getDefaultInstance()) {
                  this.nextInfo_ = StoneCircleMsg.S2C_StoneMapInfo_5804.newBuilder(this.nextInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.nextInfo_ = value;
               }

               this.onChanged();
            } else {
               this.nextInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearNextInfo() {
            if (this.nextInfoBuilder_ == null) {
               this.nextInfo_ = null;
               this.onChanged();
            } else {
               this.nextInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public S2C_StoneMapInfo_5804.Builder getNextInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (S2C_StoneMapInfo_5804.Builder)this.getNextInfoFieldBuilder().getBuilder();
         }

         public S2C_StoneMapInfo_5804OrBuilder getNextInfoOrBuilder() {
            if (this.nextInfoBuilder_ != null) {
               return (S2C_StoneMapInfo_5804OrBuilder)this.nextInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.nextInfo_ == null ? StoneCircleMsg.S2C_StoneMapInfo_5804.getDefaultInstance() : this.nextInfo_;
            }
         }

         private SingleFieldBuilderV3<S2C_StoneMapInfo_5804, S2C_StoneMapInfo_5804.Builder, S2C_StoneMapInfo_5804OrBuilder> getNextInfoFieldBuilder() {
            if (this.nextInfoBuilder_ == null) {
               this.nextInfoBuilder_ = new SingleFieldBuilderV3(this.getNextInfo(), this.getParentForChildren(), this.isClean());
               this.nextInfo_ = null;
            }

            return this.nextInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RefreshSupport_5809 extends GeneratedMessageV3 implements C2S_RefreshSupport_5809OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RefreshSupport_5809 DEFAULT_INSTANCE = new C2S_RefreshSupport_5809();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RefreshSupport_5809> PARSER = new AbstractParser<C2S_RefreshSupport_5809>() {
         public C2S_RefreshSupport_5809 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RefreshSupport_5809(input, extensionRegistry);
         }
      };

      private C2S_RefreshSupport_5809(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RefreshSupport_5809() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RefreshSupport_5809();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RefreshSupport_5809(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefreshSupport_5809.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RefreshSupport_5809)) {
            return super.equals(obj);
         } else {
            C2S_RefreshSupport_5809 other = (C2S_RefreshSupport_5809)obj;
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

      public static C2S_RefreshSupport_5809 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RefreshSupport_5809)PARSER.parseFrom(data);
      }

      public static C2S_RefreshSupport_5809 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshSupport_5809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshSupport_5809 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RefreshSupport_5809)PARSER.parseFrom(data);
      }

      public static C2S_RefreshSupport_5809 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshSupport_5809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshSupport_5809 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RefreshSupport_5809)PARSER.parseFrom(data);
      }

      public static C2S_RefreshSupport_5809 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefreshSupport_5809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefreshSupport_5809 parseFrom(InputStream input) throws IOException {
         return (C2S_RefreshSupport_5809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefreshSupport_5809 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshSupport_5809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefreshSupport_5809 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RefreshSupport_5809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RefreshSupport_5809 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshSupport_5809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefreshSupport_5809 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RefreshSupport_5809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefreshSupport_5809 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefreshSupport_5809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RefreshSupport_5809 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RefreshSupport_5809 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RefreshSupport_5809> parser() {
         return PARSER;
      }

      public Parser<C2S_RefreshSupport_5809> getParserForType() {
         return PARSER;
      }

      public C2S_RefreshSupport_5809 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RefreshSupport_5809OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefreshSupport_5809.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_RefreshSupport_5809.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RefreshSupport_5809_descriptor;
         }

         public C2S_RefreshSupport_5809 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_RefreshSupport_5809.getDefaultInstance();
         }

         public C2S_RefreshSupport_5809 build() {
            C2S_RefreshSupport_5809 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RefreshSupport_5809 buildPartial() {
            C2S_RefreshSupport_5809 result = new C2S_RefreshSupport_5809(this);
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
            if (other instanceof C2S_RefreshSupport_5809) {
               return this.mergeFrom((C2S_RefreshSupport_5809)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RefreshSupport_5809 other) {
            if (other == StoneCircleMsg.C2S_RefreshSupport_5809.getDefaultInstance()) {
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
            C2S_RefreshSupport_5809 parsedMessage = null;

            try {
               parsedMessage = (C2S_RefreshSupport_5809)StoneCircleMsg.C2S_RefreshSupport_5809.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RefreshSupport_5809)e.getUnfinishedMessage();
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

   public static final class S2C_RefreshSupport_5810 extends GeneratedMessageV3 implements S2C_RefreshSupport_5810OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SUPPORTINFO_FIELD_NUMBER = 1;
      private List<SupportInfo> supportInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_RefreshSupport_5810 DEFAULT_INSTANCE = new S2C_RefreshSupport_5810();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RefreshSupport_5810> PARSER = new AbstractParser<S2C_RefreshSupport_5810>() {
         public S2C_RefreshSupport_5810 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RefreshSupport_5810(input, extensionRegistry);
         }
      };

      private S2C_RefreshSupport_5810(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RefreshSupport_5810() {
         this.memoizedIsInitialized = -1;
         this.supportInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RefreshSupport_5810();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RefreshSupport_5810(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.supportInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.supportInfo_.add(input.readMessage(StoneCircleMsg.SupportInfo.PARSER, extensionRegistry));
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
                  this.supportInfo_ = Collections.unmodifiableList(this.supportInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefreshSupport_5810.class, Builder.class);
      }

      public List<SupportInfo> getSupportInfoList() {
         return this.supportInfo_;
      }

      public List<? extends SupportInfoOrBuilder> getSupportInfoOrBuilderList() {
         return this.supportInfo_;
      }

      public int getSupportInfoCount() {
         return this.supportInfo_.size();
      }

      public SupportInfo getSupportInfo(int index) {
         return (SupportInfo)this.supportInfo_.get(index);
      }

      public SupportInfoOrBuilder getSupportInfoOrBuilder(int index) {
         return (SupportInfoOrBuilder)this.supportInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getSupportInfoCount(); ++i) {
               if (!this.getSupportInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.supportInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.supportInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.supportInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.supportInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RefreshSupport_5810)) {
            return super.equals(obj);
         } else {
            S2C_RefreshSupport_5810 other = (S2C_RefreshSupport_5810)obj;
            if (!this.getSupportInfoList().equals(other.getSupportInfoList())) {
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
            if (this.getSupportInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSupportInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RefreshSupport_5810 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RefreshSupport_5810)PARSER.parseFrom(data);
      }

      public static S2C_RefreshSupport_5810 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshSupport_5810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshSupport_5810 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RefreshSupport_5810)PARSER.parseFrom(data);
      }

      public static S2C_RefreshSupport_5810 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshSupport_5810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshSupport_5810 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RefreshSupport_5810)PARSER.parseFrom(data);
      }

      public static S2C_RefreshSupport_5810 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefreshSupport_5810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefreshSupport_5810 parseFrom(InputStream input) throws IOException {
         return (S2C_RefreshSupport_5810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefreshSupport_5810 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshSupport_5810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefreshSupport_5810 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RefreshSupport_5810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RefreshSupport_5810 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshSupport_5810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefreshSupport_5810 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RefreshSupport_5810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefreshSupport_5810 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefreshSupport_5810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RefreshSupport_5810 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RefreshSupport_5810 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RefreshSupport_5810> parser() {
         return PARSER;
      }

      public Parser<S2C_RefreshSupport_5810> getParserForType() {
         return PARSER;
      }

      public S2C_RefreshSupport_5810 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RefreshSupport_5810OrBuilder {
         private int bitField0_;
         private List<SupportInfo> supportInfo_;
         private RepeatedFieldBuilderV3<SupportInfo, SupportInfo.Builder, SupportInfoOrBuilder> supportInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefreshSupport_5810.class, Builder.class);
         }

         private Builder() {
            this.supportInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.supportInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_RefreshSupport_5810.alwaysUseFieldBuilders) {
               this.getSupportInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.supportInfoBuilder_ == null) {
               this.supportInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.supportInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RefreshSupport_5810_descriptor;
         }

         public S2C_RefreshSupport_5810 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_RefreshSupport_5810.getDefaultInstance();
         }

         public S2C_RefreshSupport_5810 build() {
            S2C_RefreshSupport_5810 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RefreshSupport_5810 buildPartial() {
            S2C_RefreshSupport_5810 result = new S2C_RefreshSupport_5810(this);
            int from_bitField0_ = this.bitField0_;
            if (this.supportInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.supportInfo_ = Collections.unmodifiableList(this.supportInfo_);
                  this.bitField0_ &= -2;
               }

               result.supportInfo_ = this.supportInfo_;
            } else {
               result.supportInfo_ = this.supportInfoBuilder_.build();
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
            if (other instanceof S2C_RefreshSupport_5810) {
               return this.mergeFrom((S2C_RefreshSupport_5810)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RefreshSupport_5810 other) {
            if (other == StoneCircleMsg.S2C_RefreshSupport_5810.getDefaultInstance()) {
               return this;
            } else {
               if (this.supportInfoBuilder_ == null) {
                  if (!other.supportInfo_.isEmpty()) {
                     if (this.supportInfo_.isEmpty()) {
                        this.supportInfo_ = other.supportInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureSupportInfoIsMutable();
                        this.supportInfo_.addAll(other.supportInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.supportInfo_.isEmpty()) {
                  if (this.supportInfoBuilder_.isEmpty()) {
                     this.supportInfoBuilder_.dispose();
                     this.supportInfoBuilder_ = null;
                     this.supportInfo_ = other.supportInfo_;
                     this.bitField0_ &= -2;
                     this.supportInfoBuilder_ = StoneCircleMsg.S2C_RefreshSupport_5810.alwaysUseFieldBuilders ? this.getSupportInfoFieldBuilder() : null;
                  } else {
                     this.supportInfoBuilder_.addAllMessages(other.supportInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getSupportInfoCount(); ++i) {
               if (!this.getSupportInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RefreshSupport_5810 parsedMessage = null;

            try {
               parsedMessage = (S2C_RefreshSupport_5810)StoneCircleMsg.S2C_RefreshSupport_5810.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RefreshSupport_5810)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureSupportInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.supportInfo_ = new ArrayList(this.supportInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<SupportInfo> getSupportInfoList() {
            return this.supportInfoBuilder_ == null ? Collections.unmodifiableList(this.supportInfo_) : this.supportInfoBuilder_.getMessageList();
         }

         public int getSupportInfoCount() {
            return this.supportInfoBuilder_ == null ? this.supportInfo_.size() : this.supportInfoBuilder_.getCount();
         }

         public SupportInfo getSupportInfo(int index) {
            return this.supportInfoBuilder_ == null ? (SupportInfo)this.supportInfo_.get(index) : (SupportInfo)this.supportInfoBuilder_.getMessage(index);
         }

         public Builder setSupportInfo(int index, SupportInfo value) {
            if (this.supportInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSupportInfoIsMutable();
               this.supportInfo_.set(index, value);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSupportInfo(int index, SupportInfo.Builder builderForValue) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               this.supportInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.supportInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSupportInfo(SupportInfo value) {
            if (this.supportInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSupportInfoIsMutable();
               this.supportInfo_.add(value);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSupportInfo(int index, SupportInfo value) {
            if (this.supportInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSupportInfoIsMutable();
               this.supportInfo_.add(index, value);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSupportInfo(SupportInfo.Builder builderForValue) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               this.supportInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSupportInfo(int index, SupportInfo.Builder builderForValue) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               this.supportInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSupportInfo(Iterable<? extends SupportInfo> values) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.supportInfo_);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSupportInfo() {
            if (this.supportInfoBuilder_ == null) {
               this.supportInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.supportInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeSupportInfo(int index) {
            if (this.supportInfoBuilder_ == null) {
               this.ensureSupportInfoIsMutable();
               this.supportInfo_.remove(index);
               this.onChanged();
            } else {
               this.supportInfoBuilder_.remove(index);
            }

            return this;
         }

         public SupportInfo.Builder getSupportInfoBuilder(int index) {
            return (SupportInfo.Builder)this.getSupportInfoFieldBuilder().getBuilder(index);
         }

         public SupportInfoOrBuilder getSupportInfoOrBuilder(int index) {
            return this.supportInfoBuilder_ == null ? (SupportInfoOrBuilder)this.supportInfo_.get(index) : (SupportInfoOrBuilder)this.supportInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SupportInfoOrBuilder> getSupportInfoOrBuilderList() {
            return this.supportInfoBuilder_ != null ? this.supportInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.supportInfo_);
         }

         public SupportInfo.Builder addSupportInfoBuilder() {
            return (SupportInfo.Builder)this.getSupportInfoFieldBuilder().addBuilder(StoneCircleMsg.SupportInfo.getDefaultInstance());
         }

         public SupportInfo.Builder addSupportInfoBuilder(int index) {
            return (SupportInfo.Builder)this.getSupportInfoFieldBuilder().addBuilder(index, StoneCircleMsg.SupportInfo.getDefaultInstance());
         }

         public List<SupportInfo.Builder> getSupportInfoBuilderList() {
            return this.getSupportInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SupportInfo, SupportInfo.Builder, SupportInfoOrBuilder> getSupportInfoFieldBuilder() {
            if (this.supportInfoBuilder_ == null) {
               this.supportInfoBuilder_ = new RepeatedFieldBuilderV3(this.supportInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.supportInfo_ = null;
            }

            return this.supportInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RecoverEvent_5811 extends GeneratedMessageV3 implements C2S_RecoverEvent_5811OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private MapIdentify position_;
      public static final int EVENTID_FIELD_NUMBER = 2;
      private int eventId_;
      private byte memoizedIsInitialized;
      private static final C2S_RecoverEvent_5811 DEFAULT_INSTANCE = new C2S_RecoverEvent_5811();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecoverEvent_5811> PARSER = new AbstractParser<C2S_RecoverEvent_5811>() {
         public C2S_RecoverEvent_5811 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecoverEvent_5811(input, extensionRegistry);
         }
      };

      private C2S_RecoverEvent_5811(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecoverEvent_5811() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecoverEvent_5811();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecoverEvent_5811(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MapIdentify.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.position_.toBuilder();
                        }

                        this.position_ = (MapIdentify)input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.position_);
                           this.position_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eventId_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecoverEvent_5811.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public MapIdentify getPosition() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public MapIdentifyOrBuilder getPositionOrBuilder() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public boolean hasEventId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventId() {
         return this.eventId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPosition().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getPosition());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eventId_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getPosition());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eventId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecoverEvent_5811)) {
            return super.equals(obj);
         } else {
            C2S_RecoverEvent_5811 other = (C2S_RecoverEvent_5811)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
               return false;
            } else if (this.hasEventId() != other.hasEventId()) {
               return false;
            } else if (this.hasEventId() && this.getEventId() != other.getEventId()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition().hashCode();
            }

            if (this.hasEventId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecoverEvent_5811 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecoverEvent_5811)PARSER.parseFrom(data);
      }

      public static C2S_RecoverEvent_5811 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecoverEvent_5811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecoverEvent_5811 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecoverEvent_5811)PARSER.parseFrom(data);
      }

      public static C2S_RecoverEvent_5811 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecoverEvent_5811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecoverEvent_5811 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecoverEvent_5811)PARSER.parseFrom(data);
      }

      public static C2S_RecoverEvent_5811 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecoverEvent_5811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecoverEvent_5811 parseFrom(InputStream input) throws IOException {
         return (C2S_RecoverEvent_5811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecoverEvent_5811 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecoverEvent_5811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecoverEvent_5811 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecoverEvent_5811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecoverEvent_5811 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecoverEvent_5811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecoverEvent_5811 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecoverEvent_5811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecoverEvent_5811 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecoverEvent_5811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecoverEvent_5811 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecoverEvent_5811 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecoverEvent_5811> parser() {
         return PARSER;
      }

      public Parser<C2S_RecoverEvent_5811> getParserForType() {
         return PARSER;
      }

      public C2S_RecoverEvent_5811 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecoverEvent_5811OrBuilder {
         private int bitField0_;
         private MapIdentify position_;
         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> positionBuilder_;
         private int eventId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecoverEvent_5811.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_RecoverEvent_5811.alwaysUseFieldBuilders) {
               this.getPositionFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.positionBuilder_ == null) {
               this.position_ = null;
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.eventId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_RecoverEvent_5811_descriptor;
         }

         public C2S_RecoverEvent_5811 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_RecoverEvent_5811.getDefaultInstance();
         }

         public C2S_RecoverEvent_5811 build() {
            C2S_RecoverEvent_5811 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecoverEvent_5811 buildPartial() {
            C2S_RecoverEvent_5811 result = new C2S_RecoverEvent_5811(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.positionBuilder_ == null) {
                  result.position_ = this.position_;
               } else {
                  result.position_ = (MapIdentify)this.positionBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventId_ = this.eventId_;
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
            if (other instanceof C2S_RecoverEvent_5811) {
               return this.mergeFrom((C2S_RecoverEvent_5811)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecoverEvent_5811 other) {
            if (other == StoneCircleMsg.C2S_RecoverEvent_5811.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.mergePosition(other.getPosition());
               }

               if (other.hasEventId()) {
                  this.setEventId(other.getEventId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasEventId()) {
               return false;
            } else {
               return this.getPosition().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecoverEvent_5811 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecoverEvent_5811)StoneCircleMsg.C2S_RecoverEvent_5811.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecoverEvent_5811)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public MapIdentify getPosition() {
            if (this.positionBuilder_ == null) {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            } else {
               return (MapIdentify)this.positionBuilder_.getMessage();
            }
         }

         public Builder setPosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.position_ = value;
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPosition(MapIdentify.Builder builderForValue) {
            if (this.positionBuilder_ == null) {
               this.position_ = builderForValue.build();
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != StoneCircleMsg.MapIdentify.getDefaultInstance()) {
                  this.position_ = StoneCircleMsg.MapIdentify.newBuilder(this.position_).mergeFrom(value).buildPartial();
               } else {
                  this.position_ = value;
               }

               this.onChanged();
            } else {
               this.positionBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPosition() {
            if (this.positionBuilder_ == null) {
               this.position_ = null;
               this.onChanged();
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MapIdentify.Builder getPositionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MapIdentify.Builder)this.getPositionFieldBuilder().getBuilder();
         }

         public MapIdentifyOrBuilder getPositionOrBuilder() {
            if (this.positionBuilder_ != null) {
               return (MapIdentifyOrBuilder)this.positionBuilder_.getMessageOrBuilder();
            } else {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            }
         }

         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getPositionFieldBuilder() {
            if (this.positionBuilder_ == null) {
               this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
               this.position_ = null;
            }

            return this.positionBuilder_;
         }

         public boolean hasEventId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventId() {
            return this.eventId_;
         }

         public Builder setEventId(int value) {
            this.bitField0_ |= 2;
            this.eventId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.bitField0_ &= -3;
            this.eventId_ = 0;
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

   public static final class S2C_RecoverEvent_5812 extends GeneratedMessageV3 implements S2C_RecoverEvent_5812OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAPEVENT_FIELD_NUMBER = 1;
      private EventInfo mapEvent_;
      public static final int HEROHP_FIELD_NUMBER = 2;
      private List<HpData> heroHp_;
      public static final int EMPLOYINFO_FIELD_NUMBER = 3;
      private List<EmployInfo> employInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_RecoverEvent_5812 DEFAULT_INSTANCE = new S2C_RecoverEvent_5812();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecoverEvent_5812> PARSER = new AbstractParser<S2C_RecoverEvent_5812>() {
         public S2C_RecoverEvent_5812 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecoverEvent_5812(input, extensionRegistry);
         }
      };

      private S2C_RecoverEvent_5812(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecoverEvent_5812() {
         this.memoizedIsInitialized = -1;
         this.heroHp_ = Collections.emptyList();
         this.employInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecoverEvent_5812();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecoverEvent_5812(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        EventInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.mapEvent_.toBuilder();
                        }

                        this.mapEvent_ = (EventInfo)input.readMessage(StoneCircleMsg.EventInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.mapEvent_);
                           this.mapEvent_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.heroHp_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroHp_.add(input.readMessage(StoneCircleMsg.HpData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.employInfo_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.employInfo_.add(input.readMessage(StoneCircleMsg.EmployInfo.PARSER, extensionRegistry));
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
                  this.heroHp_ = Collections.unmodifiableList(this.heroHp_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.employInfo_ = Collections.unmodifiableList(this.employInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecoverEvent_5812.class, Builder.class);
      }

      public boolean hasMapEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public EventInfo getMapEvent() {
         return this.mapEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.mapEvent_;
      }

      public EventInfoOrBuilder getMapEventOrBuilder() {
         return this.mapEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.mapEvent_;
      }

      public List<HpData> getHeroHpList() {
         return this.heroHp_;
      }

      public List<? extends HpDataOrBuilder> getHeroHpOrBuilderList() {
         return this.heroHp_;
      }

      public int getHeroHpCount() {
         return this.heroHp_.size();
      }

      public HpData getHeroHp(int index) {
         return (HpData)this.heroHp_.get(index);
      }

      public HpDataOrBuilder getHeroHpOrBuilder(int index) {
         return (HpDataOrBuilder)this.heroHp_.get(index);
      }

      public List<EmployInfo> getEmployInfoList() {
         return this.employInfo_;
      }

      public List<? extends EmployInfoOrBuilder> getEmployInfoOrBuilderList() {
         return this.employInfo_;
      }

      public int getEmployInfoCount() {
         return this.employInfo_.size();
      }

      public EmployInfo getEmployInfo(int index) {
         return (EmployInfo)this.employInfo_.get(index);
      }

      public EmployInfoOrBuilder getEmployInfoOrBuilder(int index) {
         return (EmployInfoOrBuilder)this.employInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMapEvent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMapEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHeroHpCount(); ++i) {
               if (!this.getHeroHp(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getEmployInfoCount(); ++i) {
               if (!this.getEmployInfo(i).isInitialized()) {
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
            output.writeMessage(1, this.getMapEvent());
         }

         for(int i = 0; i < this.heroHp_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.heroHp_.get(i));
         }

         for(int i = 0; i < this.employInfo_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.employInfo_.get(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getMapEvent());
            }

            for(int i = 0; i < this.heroHp_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.heroHp_.get(i));
            }

            for(int i = 0; i < this.employInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.employInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecoverEvent_5812)) {
            return super.equals(obj);
         } else {
            S2C_RecoverEvent_5812 other = (S2C_RecoverEvent_5812)obj;
            if (this.hasMapEvent() != other.hasMapEvent()) {
               return false;
            } else if (this.hasMapEvent() && !this.getMapEvent().equals(other.getMapEvent())) {
               return false;
            } else if (!this.getHeroHpList().equals(other.getHeroHpList())) {
               return false;
            } else if (!this.getEmployInfoList().equals(other.getEmployInfoList())) {
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
            if (this.hasMapEvent()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMapEvent().hashCode();
            }

            if (this.getHeroHpCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroHpList().hashCode();
            }

            if (this.getEmployInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEmployInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecoverEvent_5812 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecoverEvent_5812)PARSER.parseFrom(data);
      }

      public static S2C_RecoverEvent_5812 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecoverEvent_5812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecoverEvent_5812 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecoverEvent_5812)PARSER.parseFrom(data);
      }

      public static S2C_RecoverEvent_5812 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecoverEvent_5812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecoverEvent_5812 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecoverEvent_5812)PARSER.parseFrom(data);
      }

      public static S2C_RecoverEvent_5812 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecoverEvent_5812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecoverEvent_5812 parseFrom(InputStream input) throws IOException {
         return (S2C_RecoverEvent_5812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecoverEvent_5812 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecoverEvent_5812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecoverEvent_5812 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecoverEvent_5812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecoverEvent_5812 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecoverEvent_5812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecoverEvent_5812 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecoverEvent_5812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecoverEvent_5812 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecoverEvent_5812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecoverEvent_5812 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecoverEvent_5812 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecoverEvent_5812> parser() {
         return PARSER;
      }

      public Parser<S2C_RecoverEvent_5812> getParserForType() {
         return PARSER;
      }

      public S2C_RecoverEvent_5812 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecoverEvent_5812OrBuilder {
         private int bitField0_;
         private EventInfo mapEvent_;
         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> mapEventBuilder_;
         private List<HpData> heroHp_;
         private RepeatedFieldBuilderV3<HpData, HpData.Builder, HpDataOrBuilder> heroHpBuilder_;
         private List<EmployInfo> employInfo_;
         private RepeatedFieldBuilderV3<EmployInfo, EmployInfo.Builder, EmployInfoOrBuilder> employInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecoverEvent_5812.class, Builder.class);
         }

         private Builder() {
            this.heroHp_ = Collections.emptyList();
            this.employInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroHp_ = Collections.emptyList();
            this.employInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_RecoverEvent_5812.alwaysUseFieldBuilders) {
               this.getMapEventFieldBuilder();
               this.getHeroHpFieldBuilder();
               this.getEmployInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.mapEventBuilder_ == null) {
               this.mapEvent_ = null;
            } else {
               this.mapEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.heroHpBuilder_.clear();
            }

            if (this.employInfoBuilder_ == null) {
               this.employInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.employInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_RecoverEvent_5812_descriptor;
         }

         public S2C_RecoverEvent_5812 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_RecoverEvent_5812.getDefaultInstance();
         }

         public S2C_RecoverEvent_5812 build() {
            S2C_RecoverEvent_5812 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecoverEvent_5812 buildPartial() {
            S2C_RecoverEvent_5812 result = new S2C_RecoverEvent_5812(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.mapEventBuilder_ == null) {
                  result.mapEvent_ = this.mapEvent_;
               } else {
                  result.mapEvent_ = (EventInfo)this.mapEventBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.heroHpBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.heroHp_ = Collections.unmodifiableList(this.heroHp_);
                  this.bitField0_ &= -3;
               }

               result.heroHp_ = this.heroHp_;
            } else {
               result.heroHp_ = this.heroHpBuilder_.build();
            }

            if (this.employInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.employInfo_ = Collections.unmodifiableList(this.employInfo_);
                  this.bitField0_ &= -5;
               }

               result.employInfo_ = this.employInfo_;
            } else {
               result.employInfo_ = this.employInfoBuilder_.build();
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
            if (other instanceof S2C_RecoverEvent_5812) {
               return this.mergeFrom((S2C_RecoverEvent_5812)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecoverEvent_5812 other) {
            if (other == StoneCircleMsg.S2C_RecoverEvent_5812.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMapEvent()) {
                  this.mergeMapEvent(other.getMapEvent());
               }

               if (this.heroHpBuilder_ == null) {
                  if (!other.heroHp_.isEmpty()) {
                     if (this.heroHp_.isEmpty()) {
                        this.heroHp_ = other.heroHp_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureHeroHpIsMutable();
                        this.heroHp_.addAll(other.heroHp_);
                     }

                     this.onChanged();
                  }
               } else if (!other.heroHp_.isEmpty()) {
                  if (this.heroHpBuilder_.isEmpty()) {
                     this.heroHpBuilder_.dispose();
                     this.heroHpBuilder_ = null;
                     this.heroHp_ = other.heroHp_;
                     this.bitField0_ &= -3;
                     this.heroHpBuilder_ = StoneCircleMsg.S2C_RecoverEvent_5812.alwaysUseFieldBuilders ? this.getHeroHpFieldBuilder() : null;
                  } else {
                     this.heroHpBuilder_.addAllMessages(other.heroHp_);
                  }
               }

               if (this.employInfoBuilder_ == null) {
                  if (!other.employInfo_.isEmpty()) {
                     if (this.employInfo_.isEmpty()) {
                        this.employInfo_ = other.employInfo_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureEmployInfoIsMutable();
                        this.employInfo_.addAll(other.employInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.employInfo_.isEmpty()) {
                  if (this.employInfoBuilder_.isEmpty()) {
                     this.employInfoBuilder_.dispose();
                     this.employInfoBuilder_ = null;
                     this.employInfo_ = other.employInfo_;
                     this.bitField0_ &= -5;
                     this.employInfoBuilder_ = StoneCircleMsg.S2C_RecoverEvent_5812.alwaysUseFieldBuilders ? this.getEmployInfoFieldBuilder() : null;
                  } else {
                     this.employInfoBuilder_.addAllMessages(other.employInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMapEvent()) {
               return false;
            } else if (!this.getMapEvent().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getHeroHpCount(); ++i) {
                  if (!this.getHeroHp(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getEmployInfoCount(); ++i) {
                  if (!this.getEmployInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecoverEvent_5812 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecoverEvent_5812)StoneCircleMsg.S2C_RecoverEvent_5812.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecoverEvent_5812)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMapEvent() {
            return (this.bitField0_ & 1) != 0;
         }

         public EventInfo getMapEvent() {
            if (this.mapEventBuilder_ == null) {
               return this.mapEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.mapEvent_;
            } else {
               return (EventInfo)this.mapEventBuilder_.getMessage();
            }
         }

         public Builder setMapEvent(EventInfo value) {
            if (this.mapEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.mapEvent_ = value;
               this.onChanged();
            } else {
               this.mapEventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setMapEvent(EventInfo.Builder builderForValue) {
            if (this.mapEventBuilder_ == null) {
               this.mapEvent_ = builderForValue.build();
               this.onChanged();
            } else {
               this.mapEventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMapEvent(EventInfo value) {
            if (this.mapEventBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.mapEvent_ != null && this.mapEvent_ != StoneCircleMsg.EventInfo.getDefaultInstance()) {
                  this.mapEvent_ = StoneCircleMsg.EventInfo.newBuilder(this.mapEvent_).mergeFrom(value).buildPartial();
               } else {
                  this.mapEvent_ = value;
               }

               this.onChanged();
            } else {
               this.mapEventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearMapEvent() {
            if (this.mapEventBuilder_ == null) {
               this.mapEvent_ = null;
               this.onChanged();
            } else {
               this.mapEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public EventInfo.Builder getMapEventBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (EventInfo.Builder)this.getMapEventFieldBuilder().getBuilder();
         }

         public EventInfoOrBuilder getMapEventOrBuilder() {
            if (this.mapEventBuilder_ != null) {
               return (EventInfoOrBuilder)this.mapEventBuilder_.getMessageOrBuilder();
            } else {
               return this.mapEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.mapEvent_;
            }
         }

         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> getMapEventFieldBuilder() {
            if (this.mapEventBuilder_ == null) {
               this.mapEventBuilder_ = new SingleFieldBuilderV3(this.getMapEvent(), this.getParentForChildren(), this.isClean());
               this.mapEvent_ = null;
            }

            return this.mapEventBuilder_;
         }

         private void ensureHeroHpIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroHp_ = new ArrayList(this.heroHp_);
               this.bitField0_ |= 2;
            }

         }

         public List<HpData> getHeroHpList() {
            return this.heroHpBuilder_ == null ? Collections.unmodifiableList(this.heroHp_) : this.heroHpBuilder_.getMessageList();
         }

         public int getHeroHpCount() {
            return this.heroHpBuilder_ == null ? this.heroHp_.size() : this.heroHpBuilder_.getCount();
         }

         public HpData getHeroHp(int index) {
            return this.heroHpBuilder_ == null ? (HpData)this.heroHp_.get(index) : (HpData)this.heroHpBuilder_.getMessage(index);
         }

         public Builder setHeroHp(int index, HpData value) {
            if (this.heroHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroHpIsMutable();
               this.heroHp_.set(index, value);
               this.onChanged();
            } else {
               this.heroHpBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHeroHp(int index, HpData.Builder builderForValue) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               this.heroHp_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroHpBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHeroHp(HpData value) {
            if (this.heroHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroHpIsMutable();
               this.heroHp_.add(value);
               this.onChanged();
            } else {
               this.heroHpBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHeroHp(int index, HpData value) {
            if (this.heroHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroHpIsMutable();
               this.heroHp_.add(index, value);
               this.onChanged();
            } else {
               this.heroHpBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHeroHp(HpData.Builder builderForValue) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               this.heroHp_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroHpBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHeroHp(int index, HpData.Builder builderForValue) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               this.heroHp_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroHpBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHeroHp(Iterable<? extends HpData> values) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroHp_);
               this.onChanged();
            } else {
               this.heroHpBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHeroHp() {
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.heroHpBuilder_.clear();
            }

            return this;
         }

         public Builder removeHeroHp(int index) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               this.heroHp_.remove(index);
               this.onChanged();
            } else {
               this.heroHpBuilder_.remove(index);
            }

            return this;
         }

         public HpData.Builder getHeroHpBuilder(int index) {
            return (HpData.Builder)this.getHeroHpFieldBuilder().getBuilder(index);
         }

         public HpDataOrBuilder getHeroHpOrBuilder(int index) {
            return this.heroHpBuilder_ == null ? (HpDataOrBuilder)this.heroHp_.get(index) : (HpDataOrBuilder)this.heroHpBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HpDataOrBuilder> getHeroHpOrBuilderList() {
            return this.heroHpBuilder_ != null ? this.heroHpBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.heroHp_);
         }

         public HpData.Builder addHeroHpBuilder() {
            return (HpData.Builder)this.getHeroHpFieldBuilder().addBuilder(StoneCircleMsg.HpData.getDefaultInstance());
         }

         public HpData.Builder addHeroHpBuilder(int index) {
            return (HpData.Builder)this.getHeroHpFieldBuilder().addBuilder(index, StoneCircleMsg.HpData.getDefaultInstance());
         }

         public List<HpData.Builder> getHeroHpBuilderList() {
            return this.getHeroHpFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HpData, HpData.Builder, HpDataOrBuilder> getHeroHpFieldBuilder() {
            if (this.heroHpBuilder_ == null) {
               this.heroHpBuilder_ = new RepeatedFieldBuilderV3(this.heroHp_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.heroHp_ = null;
            }

            return this.heroHpBuilder_;
         }

         private void ensureEmployInfoIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.employInfo_ = new ArrayList(this.employInfo_);
               this.bitField0_ |= 4;
            }

         }

         public List<EmployInfo> getEmployInfoList() {
            return this.employInfoBuilder_ == null ? Collections.unmodifiableList(this.employInfo_) : this.employInfoBuilder_.getMessageList();
         }

         public int getEmployInfoCount() {
            return this.employInfoBuilder_ == null ? this.employInfo_.size() : this.employInfoBuilder_.getCount();
         }

         public EmployInfo getEmployInfo(int index) {
            return this.employInfoBuilder_ == null ? (EmployInfo)this.employInfo_.get(index) : (EmployInfo)this.employInfoBuilder_.getMessage(index);
         }

         public Builder setEmployInfo(int index, EmployInfo value) {
            if (this.employInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEmployInfoIsMutable();
               this.employInfo_.set(index, value);
               this.onChanged();
            } else {
               this.employInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEmployInfo(int index, EmployInfo.Builder builderForValue) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               this.employInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.employInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEmployInfo(EmployInfo value) {
            if (this.employInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEmployInfoIsMutable();
               this.employInfo_.add(value);
               this.onChanged();
            } else {
               this.employInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEmployInfo(int index, EmployInfo value) {
            if (this.employInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEmployInfoIsMutable();
               this.employInfo_.add(index, value);
               this.onChanged();
            } else {
               this.employInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEmployInfo(EmployInfo.Builder builderForValue) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               this.employInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.employInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEmployInfo(int index, EmployInfo.Builder builderForValue) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               this.employInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.employInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEmployInfo(Iterable<? extends EmployInfo> values) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.employInfo_);
               this.onChanged();
            } else {
               this.employInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEmployInfo() {
            if (this.employInfoBuilder_ == null) {
               this.employInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.employInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeEmployInfo(int index) {
            if (this.employInfoBuilder_ == null) {
               this.ensureEmployInfoIsMutable();
               this.employInfo_.remove(index);
               this.onChanged();
            } else {
               this.employInfoBuilder_.remove(index);
            }

            return this;
         }

         public EmployInfo.Builder getEmployInfoBuilder(int index) {
            return (EmployInfo.Builder)this.getEmployInfoFieldBuilder().getBuilder(index);
         }

         public EmployInfoOrBuilder getEmployInfoOrBuilder(int index) {
            return this.employInfoBuilder_ == null ? (EmployInfoOrBuilder)this.employInfo_.get(index) : (EmployInfoOrBuilder)this.employInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EmployInfoOrBuilder> getEmployInfoOrBuilderList() {
            return this.employInfoBuilder_ != null ? this.employInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.employInfo_);
         }

         public EmployInfo.Builder addEmployInfoBuilder() {
            return (EmployInfo.Builder)this.getEmployInfoFieldBuilder().addBuilder(StoneCircleMsg.EmployInfo.getDefaultInstance());
         }

         public EmployInfo.Builder addEmployInfoBuilder(int index) {
            return (EmployInfo.Builder)this.getEmployInfoFieldBuilder().addBuilder(index, StoneCircleMsg.EmployInfo.getDefaultInstance());
         }

         public List<EmployInfo.Builder> getEmployInfoBuilderList() {
            return this.getEmployInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EmployInfo, EmployInfo.Builder, EmployInfoOrBuilder> getEmployInfoFieldBuilder() {
            if (this.employInfoBuilder_ == null) {
               this.employInfoBuilder_ = new RepeatedFieldBuilderV3(this.employInfo_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.employInfo_ = null;
            }

            return this.employInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ShopEvent_5813 extends GeneratedMessageV3 implements C2S_ShopEvent_5813OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private MapIdentify position_;
      public static final int EVENTID_FIELD_NUMBER = 2;
      private int eventId_;
      public static final int SHOPINX_FIELD_NUMBER = 3;
      private int shopInx_;
      private byte memoizedIsInitialized;
      private static final C2S_ShopEvent_5813 DEFAULT_INSTANCE = new C2S_ShopEvent_5813();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopEvent_5813> PARSER = new AbstractParser<C2S_ShopEvent_5813>() {
         public C2S_ShopEvent_5813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopEvent_5813(input, extensionRegistry);
         }
      };

      private C2S_ShopEvent_5813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopEvent_5813() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopEvent_5813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopEvent_5813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MapIdentify.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.position_.toBuilder();
                        }

                        this.position_ = (MapIdentify)input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.position_);
                           this.position_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eventId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.shopInx_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopEvent_5813.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public MapIdentify getPosition() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public MapIdentifyOrBuilder getPositionOrBuilder() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public boolean hasEventId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventId() {
         return this.eventId_;
      }

      public boolean hasShopInx() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getShopInx() {
         return this.shopInx_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShopInx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPosition().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getPosition());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eventId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.shopInx_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getPosition());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eventId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.shopInx_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ShopEvent_5813)) {
            return super.equals(obj);
         } else {
            C2S_ShopEvent_5813 other = (C2S_ShopEvent_5813)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
               return false;
            } else if (this.hasEventId() != other.hasEventId()) {
               return false;
            } else if (this.hasEventId() && this.getEventId() != other.getEventId()) {
               return false;
            } else if (this.hasShopInx() != other.hasShopInx()) {
               return false;
            } else if (this.hasShopInx() && this.getShopInx() != other.getShopInx()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition().hashCode();
            }

            if (this.hasEventId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventId();
            }

            if (this.hasShopInx()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getShopInx();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ShopEvent_5813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopEvent_5813)PARSER.parseFrom(data);
      }

      public static C2S_ShopEvent_5813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopEvent_5813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopEvent_5813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopEvent_5813)PARSER.parseFrom(data);
      }

      public static C2S_ShopEvent_5813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopEvent_5813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopEvent_5813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopEvent_5813)PARSER.parseFrom(data);
      }

      public static C2S_ShopEvent_5813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopEvent_5813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopEvent_5813 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopEvent_5813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopEvent_5813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopEvent_5813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopEvent_5813 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopEvent_5813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopEvent_5813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopEvent_5813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopEvent_5813 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopEvent_5813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopEvent_5813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopEvent_5813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopEvent_5813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopEvent_5813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopEvent_5813> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopEvent_5813> getParserForType() {
         return PARSER;
      }

      public C2S_ShopEvent_5813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopEvent_5813OrBuilder {
         private int bitField0_;
         private MapIdentify position_;
         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> positionBuilder_;
         private int eventId_;
         private int shopInx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopEvent_5813.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_ShopEvent_5813.alwaysUseFieldBuilders) {
               this.getPositionFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.positionBuilder_ == null) {
               this.position_ = null;
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.eventId_ = 0;
            this.bitField0_ &= -3;
            this.shopInx_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ShopEvent_5813_descriptor;
         }

         public C2S_ShopEvent_5813 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_ShopEvent_5813.getDefaultInstance();
         }

         public C2S_ShopEvent_5813 build() {
            C2S_ShopEvent_5813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopEvent_5813 buildPartial() {
            C2S_ShopEvent_5813 result = new C2S_ShopEvent_5813(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.positionBuilder_ == null) {
                  result.position_ = this.position_;
               } else {
                  result.position_ = (MapIdentify)this.positionBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventId_ = this.eventId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.shopInx_ = this.shopInx_;
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
            if (other instanceof C2S_ShopEvent_5813) {
               return this.mergeFrom((C2S_ShopEvent_5813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopEvent_5813 other) {
            if (other == StoneCircleMsg.C2S_ShopEvent_5813.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.mergePosition(other.getPosition());
               }

               if (other.hasEventId()) {
                  this.setEventId(other.getEventId());
               }

               if (other.hasShopInx()) {
                  this.setShopInx(other.getShopInx());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasEventId()) {
               return false;
            } else if (!this.hasShopInx()) {
               return false;
            } else {
               return this.getPosition().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ShopEvent_5813 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopEvent_5813)StoneCircleMsg.C2S_ShopEvent_5813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopEvent_5813)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public MapIdentify getPosition() {
            if (this.positionBuilder_ == null) {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            } else {
               return (MapIdentify)this.positionBuilder_.getMessage();
            }
         }

         public Builder setPosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.position_ = value;
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPosition(MapIdentify.Builder builderForValue) {
            if (this.positionBuilder_ == null) {
               this.position_ = builderForValue.build();
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != StoneCircleMsg.MapIdentify.getDefaultInstance()) {
                  this.position_ = StoneCircleMsg.MapIdentify.newBuilder(this.position_).mergeFrom(value).buildPartial();
               } else {
                  this.position_ = value;
               }

               this.onChanged();
            } else {
               this.positionBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPosition() {
            if (this.positionBuilder_ == null) {
               this.position_ = null;
               this.onChanged();
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MapIdentify.Builder getPositionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MapIdentify.Builder)this.getPositionFieldBuilder().getBuilder();
         }

         public MapIdentifyOrBuilder getPositionOrBuilder() {
            if (this.positionBuilder_ != null) {
               return (MapIdentifyOrBuilder)this.positionBuilder_.getMessageOrBuilder();
            } else {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            }
         }

         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getPositionFieldBuilder() {
            if (this.positionBuilder_ == null) {
               this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
               this.position_ = null;
            }

            return this.positionBuilder_;
         }

         public boolean hasEventId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventId() {
            return this.eventId_;
         }

         public Builder setEventId(int value) {
            this.bitField0_ |= 2;
            this.eventId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.bitField0_ &= -3;
            this.eventId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShopInx() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getShopInx() {
            return this.shopInx_;
         }

         public Builder setShopInx(int value) {
            this.bitField0_ |= 4;
            this.shopInx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopInx() {
            this.bitField0_ &= -5;
            this.shopInx_ = 0;
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

   public static final class S2C_ShopEvent_5814 extends GeneratedMessageV3 implements S2C_ShopEvent_5814OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHOPEVENT_FIELD_NUMBER = 5;
      private EventInfo shopEvent_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopEvent_5814 DEFAULT_INSTANCE = new S2C_ShopEvent_5814();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopEvent_5814> PARSER = new AbstractParser<S2C_ShopEvent_5814>() {
         public S2C_ShopEvent_5814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopEvent_5814(input, extensionRegistry);
         }
      };

      private S2C_ShopEvent_5814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopEvent_5814() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopEvent_5814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopEvent_5814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 42:
                        EventInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.shopEvent_.toBuilder();
                        }

                        this.shopEvent_ = (EventInfo)input.readMessage(StoneCircleMsg.EventInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.shopEvent_);
                           this.shopEvent_ = subBuilder.buildPartial();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopEvent_5814.class, Builder.class);
      }

      public boolean hasShopEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public EventInfo getShopEvent() {
         return this.shopEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.shopEvent_;
      }

      public EventInfoOrBuilder getShopEventOrBuilder() {
         return this.shopEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.shopEvent_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShopEvent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getShopEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(5, this.getShopEvent());
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
               size += CodedOutputStream.computeMessageSize(5, this.getShopEvent());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShopEvent_5814)) {
            return super.equals(obj);
         } else {
            S2C_ShopEvent_5814 other = (S2C_ShopEvent_5814)obj;
            if (this.hasShopEvent() != other.hasShopEvent()) {
               return false;
            } else if (this.hasShopEvent() && !this.getShopEvent().equals(other.getShopEvent())) {
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
            if (this.hasShopEvent()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getShopEvent().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShopEvent_5814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopEvent_5814)PARSER.parseFrom(data);
      }

      public static S2C_ShopEvent_5814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopEvent_5814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopEvent_5814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopEvent_5814)PARSER.parseFrom(data);
      }

      public static S2C_ShopEvent_5814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopEvent_5814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopEvent_5814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopEvent_5814)PARSER.parseFrom(data);
      }

      public static S2C_ShopEvent_5814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopEvent_5814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopEvent_5814 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopEvent_5814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopEvent_5814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopEvent_5814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopEvent_5814 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopEvent_5814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopEvent_5814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopEvent_5814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopEvent_5814 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopEvent_5814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopEvent_5814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopEvent_5814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopEvent_5814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopEvent_5814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopEvent_5814> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopEvent_5814> getParserForType() {
         return PARSER;
      }

      public S2C_ShopEvent_5814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopEvent_5814OrBuilder {
         private int bitField0_;
         private EventInfo shopEvent_;
         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> shopEventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopEvent_5814.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_ShopEvent_5814.alwaysUseFieldBuilders) {
               this.getShopEventFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.shopEventBuilder_ == null) {
               this.shopEvent_ = null;
            } else {
               this.shopEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ShopEvent_5814_descriptor;
         }

         public S2C_ShopEvent_5814 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_ShopEvent_5814.getDefaultInstance();
         }

         public S2C_ShopEvent_5814 build() {
            S2C_ShopEvent_5814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopEvent_5814 buildPartial() {
            S2C_ShopEvent_5814 result = new S2C_ShopEvent_5814(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.shopEventBuilder_ == null) {
                  result.shopEvent_ = this.shopEvent_;
               } else {
                  result.shopEvent_ = (EventInfo)this.shopEventBuilder_.build();
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
            if (other instanceof S2C_ShopEvent_5814) {
               return this.mergeFrom((S2C_ShopEvent_5814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopEvent_5814 other) {
            if (other == StoneCircleMsg.S2C_ShopEvent_5814.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShopEvent()) {
                  this.mergeShopEvent(other.getShopEvent());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShopEvent()) {
               return false;
            } else {
               return this.getShopEvent().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShopEvent_5814 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopEvent_5814)StoneCircleMsg.S2C_ShopEvent_5814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopEvent_5814)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShopEvent() {
            return (this.bitField0_ & 1) != 0;
         }

         public EventInfo getShopEvent() {
            if (this.shopEventBuilder_ == null) {
               return this.shopEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.shopEvent_;
            } else {
               return (EventInfo)this.shopEventBuilder_.getMessage();
            }
         }

         public Builder setShopEvent(EventInfo value) {
            if (this.shopEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.shopEvent_ = value;
               this.onChanged();
            } else {
               this.shopEventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setShopEvent(EventInfo.Builder builderForValue) {
            if (this.shopEventBuilder_ == null) {
               this.shopEvent_ = builderForValue.build();
               this.onChanged();
            } else {
               this.shopEventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeShopEvent(EventInfo value) {
            if (this.shopEventBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.shopEvent_ != null && this.shopEvent_ != StoneCircleMsg.EventInfo.getDefaultInstance()) {
                  this.shopEvent_ = StoneCircleMsg.EventInfo.newBuilder(this.shopEvent_).mergeFrom(value).buildPartial();
               } else {
                  this.shopEvent_ = value;
               }

               this.onChanged();
            } else {
               this.shopEventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearShopEvent() {
            if (this.shopEventBuilder_ == null) {
               this.shopEvent_ = null;
               this.onChanged();
            } else {
               this.shopEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public EventInfo.Builder getShopEventBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (EventInfo.Builder)this.getShopEventFieldBuilder().getBuilder();
         }

         public EventInfoOrBuilder getShopEventOrBuilder() {
            if (this.shopEventBuilder_ != null) {
               return (EventInfoOrBuilder)this.shopEventBuilder_.getMessageOrBuilder();
            } else {
               return this.shopEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.shopEvent_;
            }
         }

         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> getShopEventFieldBuilder() {
            if (this.shopEventBuilder_ == null) {
               this.shopEventBuilder_ = new SingleFieldBuilderV3(this.getShopEvent(), this.getParentForChildren(), this.isClean());
               this.shopEvent_ = null;
            }

            return this.shopEventBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_EnterSpecialEvent_5815 extends GeneratedMessageV3 implements C2S_EnterSpecialEvent_5815OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_EnterSpecialEvent_5815 DEFAULT_INSTANCE = new C2S_EnterSpecialEvent_5815();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnterSpecialEvent_5815> PARSER = new AbstractParser<C2S_EnterSpecialEvent_5815>() {
         public C2S_EnterSpecialEvent_5815 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnterSpecialEvent_5815(input, extensionRegistry);
         }
      };

      private C2S_EnterSpecialEvent_5815(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnterSpecialEvent_5815() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnterSpecialEvent_5815();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnterSpecialEvent_5815(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterSpecialEvent_5815.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EnterSpecialEvent_5815)) {
            return super.equals(obj);
         } else {
            C2S_EnterSpecialEvent_5815 other = (C2S_EnterSpecialEvent_5815)obj;
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

      public static C2S_EnterSpecialEvent_5815 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnterSpecialEvent_5815)PARSER.parseFrom(data);
      }

      public static C2S_EnterSpecialEvent_5815 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterSpecialEvent_5815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterSpecialEvent_5815 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnterSpecialEvent_5815)PARSER.parseFrom(data);
      }

      public static C2S_EnterSpecialEvent_5815 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterSpecialEvent_5815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterSpecialEvent_5815 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnterSpecialEvent_5815)PARSER.parseFrom(data);
      }

      public static C2S_EnterSpecialEvent_5815 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterSpecialEvent_5815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterSpecialEvent_5815 parseFrom(InputStream input) throws IOException {
         return (C2S_EnterSpecialEvent_5815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterSpecialEvent_5815 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterSpecialEvent_5815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterSpecialEvent_5815 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnterSpecialEvent_5815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnterSpecialEvent_5815 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterSpecialEvent_5815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterSpecialEvent_5815 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnterSpecialEvent_5815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterSpecialEvent_5815 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterSpecialEvent_5815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnterSpecialEvent_5815 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnterSpecialEvent_5815 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnterSpecialEvent_5815> parser() {
         return PARSER;
      }

      public Parser<C2S_EnterSpecialEvent_5815> getParserForType() {
         return PARSER;
      }

      public C2S_EnterSpecialEvent_5815 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnterSpecialEvent_5815OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterSpecialEvent_5815.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_EnterSpecialEvent_5815.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EnterSpecialEvent_5815_descriptor;
         }

         public C2S_EnterSpecialEvent_5815 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_EnterSpecialEvent_5815.getDefaultInstance();
         }

         public C2S_EnterSpecialEvent_5815 build() {
            C2S_EnterSpecialEvent_5815 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnterSpecialEvent_5815 buildPartial() {
            C2S_EnterSpecialEvent_5815 result = new C2S_EnterSpecialEvent_5815(this);
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
            if (other instanceof C2S_EnterSpecialEvent_5815) {
               return this.mergeFrom((C2S_EnterSpecialEvent_5815)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnterSpecialEvent_5815 other) {
            if (other == StoneCircleMsg.C2S_EnterSpecialEvent_5815.getDefaultInstance()) {
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
            C2S_EnterSpecialEvent_5815 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnterSpecialEvent_5815)StoneCircleMsg.C2S_EnterSpecialEvent_5815.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnterSpecialEvent_5815)e.getUnfinishedMessage();
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

   public static final class S2C_EnterSpecialEvent_5816 extends GeneratedMessageV3 implements S2C_EnterSpecialEvent_5816OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_EnterSpecialEvent_5816 DEFAULT_INSTANCE = new S2C_EnterSpecialEvent_5816();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnterSpecialEvent_5816> PARSER = new AbstractParser<S2C_EnterSpecialEvent_5816>() {
         public S2C_EnterSpecialEvent_5816 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnterSpecialEvent_5816(input, extensionRegistry);
         }
      };

      private S2C_EnterSpecialEvent_5816(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnterSpecialEvent_5816() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnterSpecialEvent_5816();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnterSpecialEvent_5816(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterSpecialEvent_5816.class, Builder.class);
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
         } else if (!(obj instanceof S2C_EnterSpecialEvent_5816)) {
            return super.equals(obj);
         } else {
            S2C_EnterSpecialEvent_5816 other = (S2C_EnterSpecialEvent_5816)obj;
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

      public static S2C_EnterSpecialEvent_5816 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnterSpecialEvent_5816)PARSER.parseFrom(data);
      }

      public static S2C_EnterSpecialEvent_5816 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterSpecialEvent_5816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterSpecialEvent_5816 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnterSpecialEvent_5816)PARSER.parseFrom(data);
      }

      public static S2C_EnterSpecialEvent_5816 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterSpecialEvent_5816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterSpecialEvent_5816 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnterSpecialEvent_5816)PARSER.parseFrom(data);
      }

      public static S2C_EnterSpecialEvent_5816 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterSpecialEvent_5816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterSpecialEvent_5816 parseFrom(InputStream input) throws IOException {
         return (S2C_EnterSpecialEvent_5816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterSpecialEvent_5816 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterSpecialEvent_5816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterSpecialEvent_5816 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnterSpecialEvent_5816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnterSpecialEvent_5816 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterSpecialEvent_5816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterSpecialEvent_5816 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnterSpecialEvent_5816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterSpecialEvent_5816 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterSpecialEvent_5816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnterSpecialEvent_5816 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnterSpecialEvent_5816 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnterSpecialEvent_5816> parser() {
         return PARSER;
      }

      public Parser<S2C_EnterSpecialEvent_5816> getParserForType() {
         return PARSER;
      }

      public S2C_EnterSpecialEvent_5816 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnterSpecialEvent_5816OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterSpecialEvent_5816.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_EnterSpecialEvent_5816.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EnterSpecialEvent_5816_descriptor;
         }

         public S2C_EnterSpecialEvent_5816 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_EnterSpecialEvent_5816.getDefaultInstance();
         }

         public S2C_EnterSpecialEvent_5816 build() {
            S2C_EnterSpecialEvent_5816 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnterSpecialEvent_5816 buildPartial() {
            S2C_EnterSpecialEvent_5816 result = new S2C_EnterSpecialEvent_5816(this);
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
            if (other instanceof S2C_EnterSpecialEvent_5816) {
               return this.mergeFrom((S2C_EnterSpecialEvent_5816)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnterSpecialEvent_5816 other) {
            if (other == StoneCircleMsg.S2C_EnterSpecialEvent_5816.getDefaultInstance()) {
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
            S2C_EnterSpecialEvent_5816 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnterSpecialEvent_5816)StoneCircleMsg.S2C_EnterSpecialEvent_5816.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnterSpecialEvent_5816)e.getUnfinishedMessage();
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

   public static final class C2S_LightMap_5817 extends GeneratedMessageV3 implements C2S_LightMap_5817OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private MapIdentify position_;
      public static final int LIGHT_FIELD_NUMBER = 2;
      private List<MapIdentify> light_;
      private byte memoizedIsInitialized;
      private static final C2S_LightMap_5817 DEFAULT_INSTANCE = new C2S_LightMap_5817();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LightMap_5817> PARSER = new AbstractParser<C2S_LightMap_5817>() {
         public C2S_LightMap_5817 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LightMap_5817(input, extensionRegistry);
         }
      };

      private C2S_LightMap_5817(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LightMap_5817() {
         this.memoizedIsInitialized = -1;
         this.light_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LightMap_5817();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LightMap_5817(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MapIdentify.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.position_.toBuilder();
                        }

                        this.position_ = (MapIdentify)input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.position_);
                           this.position_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.light_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.light_.add(input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry));
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
                  this.light_ = Collections.unmodifiableList(this.light_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LightMap_5817.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public MapIdentify getPosition() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public MapIdentifyOrBuilder getPositionOrBuilder() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public List<MapIdentify> getLightList() {
         return this.light_;
      }

      public List<? extends MapIdentifyOrBuilder> getLightOrBuilderList() {
         return this.light_;
      }

      public int getLightCount() {
         return this.light_.size();
      }

      public MapIdentify getLight(int index) {
         return (MapIdentify)this.light_.get(index);
      }

      public MapIdentifyOrBuilder getLightOrBuilder(int index) {
         return (MapIdentifyOrBuilder)this.light_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPosition().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getLightCount(); ++i) {
               if (!this.getLight(i).isInitialized()) {
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
            output.writeMessage(1, this.getPosition());
         }

         for(int i = 0; i < this.light_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.light_.get(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getPosition());
            }

            for(int i = 0; i < this.light_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.light_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LightMap_5817)) {
            return super.equals(obj);
         } else {
            C2S_LightMap_5817 other = (C2S_LightMap_5817)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
               return false;
            } else if (!this.getLightList().equals(other.getLightList())) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition().hashCode();
            }

            if (this.getLightCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLightList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LightMap_5817 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LightMap_5817)PARSER.parseFrom(data);
      }

      public static C2S_LightMap_5817 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LightMap_5817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LightMap_5817 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LightMap_5817)PARSER.parseFrom(data);
      }

      public static C2S_LightMap_5817 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LightMap_5817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LightMap_5817 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LightMap_5817)PARSER.parseFrom(data);
      }

      public static C2S_LightMap_5817 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LightMap_5817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LightMap_5817 parseFrom(InputStream input) throws IOException {
         return (C2S_LightMap_5817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LightMap_5817 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LightMap_5817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LightMap_5817 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LightMap_5817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LightMap_5817 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LightMap_5817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LightMap_5817 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LightMap_5817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LightMap_5817 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LightMap_5817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LightMap_5817 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LightMap_5817 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LightMap_5817> parser() {
         return PARSER;
      }

      public Parser<C2S_LightMap_5817> getParserForType() {
         return PARSER;
      }

      public C2S_LightMap_5817 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LightMap_5817OrBuilder {
         private int bitField0_;
         private MapIdentify position_;
         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> positionBuilder_;
         private List<MapIdentify> light_;
         private RepeatedFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> lightBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LightMap_5817.class, Builder.class);
         }

         private Builder() {
            this.light_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.light_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_LightMap_5817.alwaysUseFieldBuilders) {
               this.getPositionFieldBuilder();
               this.getLightFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.positionBuilder_ == null) {
               this.position_ = null;
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.lightBuilder_ == null) {
               this.light_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.lightBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LightMap_5817_descriptor;
         }

         public C2S_LightMap_5817 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_LightMap_5817.getDefaultInstance();
         }

         public C2S_LightMap_5817 build() {
            C2S_LightMap_5817 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LightMap_5817 buildPartial() {
            C2S_LightMap_5817 result = new C2S_LightMap_5817(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.positionBuilder_ == null) {
                  result.position_ = this.position_;
               } else {
                  result.position_ = (MapIdentify)this.positionBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.lightBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.light_ = Collections.unmodifiableList(this.light_);
                  this.bitField0_ &= -3;
               }

               result.light_ = this.light_;
            } else {
               result.light_ = this.lightBuilder_.build();
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
            if (other instanceof C2S_LightMap_5817) {
               return this.mergeFrom((C2S_LightMap_5817)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LightMap_5817 other) {
            if (other == StoneCircleMsg.C2S_LightMap_5817.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.mergePosition(other.getPosition());
               }

               if (this.lightBuilder_ == null) {
                  if (!other.light_.isEmpty()) {
                     if (this.light_.isEmpty()) {
                        this.light_ = other.light_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureLightIsMutable();
                        this.light_.addAll(other.light_);
                     }

                     this.onChanged();
                  }
               } else if (!other.light_.isEmpty()) {
                  if (this.lightBuilder_.isEmpty()) {
                     this.lightBuilder_.dispose();
                     this.lightBuilder_ = null;
                     this.light_ = other.light_;
                     this.bitField0_ &= -3;
                     this.lightBuilder_ = StoneCircleMsg.C2S_LightMap_5817.alwaysUseFieldBuilders ? this.getLightFieldBuilder() : null;
                  } else {
                     this.lightBuilder_.addAllMessages(other.light_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.getPosition().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getLightCount(); ++i) {
                  if (!this.getLight(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LightMap_5817 parsedMessage = null;

            try {
               parsedMessage = (C2S_LightMap_5817)StoneCircleMsg.C2S_LightMap_5817.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LightMap_5817)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public MapIdentify getPosition() {
            if (this.positionBuilder_ == null) {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            } else {
               return (MapIdentify)this.positionBuilder_.getMessage();
            }
         }

         public Builder setPosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.position_ = value;
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPosition(MapIdentify.Builder builderForValue) {
            if (this.positionBuilder_ == null) {
               this.position_ = builderForValue.build();
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != StoneCircleMsg.MapIdentify.getDefaultInstance()) {
                  this.position_ = StoneCircleMsg.MapIdentify.newBuilder(this.position_).mergeFrom(value).buildPartial();
               } else {
                  this.position_ = value;
               }

               this.onChanged();
            } else {
               this.positionBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPosition() {
            if (this.positionBuilder_ == null) {
               this.position_ = null;
               this.onChanged();
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MapIdentify.Builder getPositionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MapIdentify.Builder)this.getPositionFieldBuilder().getBuilder();
         }

         public MapIdentifyOrBuilder getPositionOrBuilder() {
            if (this.positionBuilder_ != null) {
               return (MapIdentifyOrBuilder)this.positionBuilder_.getMessageOrBuilder();
            } else {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            }
         }

         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getPositionFieldBuilder() {
            if (this.positionBuilder_ == null) {
               this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
               this.position_ = null;
            }

            return this.positionBuilder_;
         }

         private void ensureLightIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.light_ = new ArrayList(this.light_);
               this.bitField0_ |= 2;
            }

         }

         public List<MapIdentify> getLightList() {
            return this.lightBuilder_ == null ? Collections.unmodifiableList(this.light_) : this.lightBuilder_.getMessageList();
         }

         public int getLightCount() {
            return this.lightBuilder_ == null ? this.light_.size() : this.lightBuilder_.getCount();
         }

         public MapIdentify getLight(int index) {
            return this.lightBuilder_ == null ? (MapIdentify)this.light_.get(index) : (MapIdentify)this.lightBuilder_.getMessage(index);
         }

         public Builder setLight(int index, MapIdentify value) {
            if (this.lightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLightIsMutable();
               this.light_.set(index, value);
               this.onChanged();
            } else {
               this.lightBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLight(int index, MapIdentify.Builder builderForValue) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               this.light_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lightBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLight(MapIdentify value) {
            if (this.lightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLightIsMutable();
               this.light_.add(value);
               this.onChanged();
            } else {
               this.lightBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLight(int index, MapIdentify value) {
            if (this.lightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLightIsMutable();
               this.light_.add(index, value);
               this.onChanged();
            } else {
               this.lightBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLight(MapIdentify.Builder builderForValue) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               this.light_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.lightBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLight(int index, MapIdentify.Builder builderForValue) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               this.light_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lightBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLight(Iterable<? extends MapIdentify> values) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.light_);
               this.onChanged();
            } else {
               this.lightBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLight() {
            if (this.lightBuilder_ == null) {
               this.light_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.lightBuilder_.clear();
            }

            return this;
         }

         public Builder removeLight(int index) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               this.light_.remove(index);
               this.onChanged();
            } else {
               this.lightBuilder_.remove(index);
            }

            return this;
         }

         public MapIdentify.Builder getLightBuilder(int index) {
            return (MapIdentify.Builder)this.getLightFieldBuilder().getBuilder(index);
         }

         public MapIdentifyOrBuilder getLightOrBuilder(int index) {
            return this.lightBuilder_ == null ? (MapIdentifyOrBuilder)this.light_.get(index) : (MapIdentifyOrBuilder)this.lightBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MapIdentifyOrBuilder> getLightOrBuilderList() {
            return this.lightBuilder_ != null ? this.lightBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.light_);
         }

         public MapIdentify.Builder addLightBuilder() {
            return (MapIdentify.Builder)this.getLightFieldBuilder().addBuilder(StoneCircleMsg.MapIdentify.getDefaultInstance());
         }

         public MapIdentify.Builder addLightBuilder(int index) {
            return (MapIdentify.Builder)this.getLightFieldBuilder().addBuilder(index, StoneCircleMsg.MapIdentify.getDefaultInstance());
         }

         public List<MapIdentify.Builder> getLightBuilderList() {
            return this.getLightFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getLightFieldBuilder() {
            if (this.lightBuilder_ == null) {
               this.lightBuilder_ = new RepeatedFieldBuilderV3(this.light_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.light_ = null;
            }

            return this.lightBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_LightMap_5818 extends GeneratedMessageV3 implements S2C_LightMap_5818OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private MapIdentify position_;
      public static final int LIGHT_FIELD_NUMBER = 2;
      private List<MapIdentify> light_;
      private byte memoizedIsInitialized;
      private static final S2C_LightMap_5818 DEFAULT_INSTANCE = new S2C_LightMap_5818();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LightMap_5818> PARSER = new AbstractParser<S2C_LightMap_5818>() {
         public S2C_LightMap_5818 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LightMap_5818(input, extensionRegistry);
         }
      };

      private S2C_LightMap_5818(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LightMap_5818() {
         this.memoizedIsInitialized = -1;
         this.light_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LightMap_5818();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LightMap_5818(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MapIdentify.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.position_.toBuilder();
                        }

                        this.position_ = (MapIdentify)input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.position_);
                           this.position_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.light_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.light_.add(input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry));
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
                  this.light_ = Collections.unmodifiableList(this.light_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LightMap_5818.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public MapIdentify getPosition() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public MapIdentifyOrBuilder getPositionOrBuilder() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public List<MapIdentify> getLightList() {
         return this.light_;
      }

      public List<? extends MapIdentifyOrBuilder> getLightOrBuilderList() {
         return this.light_;
      }

      public int getLightCount() {
         return this.light_.size();
      }

      public MapIdentify getLight(int index) {
         return (MapIdentify)this.light_.get(index);
      }

      public MapIdentifyOrBuilder getLightOrBuilder(int index) {
         return (MapIdentifyOrBuilder)this.light_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPosition().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getLightCount(); ++i) {
               if (!this.getLight(i).isInitialized()) {
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
            output.writeMessage(1, this.getPosition());
         }

         for(int i = 0; i < this.light_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.light_.get(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getPosition());
            }

            for(int i = 0; i < this.light_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.light_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LightMap_5818)) {
            return super.equals(obj);
         } else {
            S2C_LightMap_5818 other = (S2C_LightMap_5818)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
               return false;
            } else if (!this.getLightList().equals(other.getLightList())) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition().hashCode();
            }

            if (this.getLightCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLightList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LightMap_5818 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LightMap_5818)PARSER.parseFrom(data);
      }

      public static S2C_LightMap_5818 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LightMap_5818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LightMap_5818 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LightMap_5818)PARSER.parseFrom(data);
      }

      public static S2C_LightMap_5818 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LightMap_5818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LightMap_5818 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LightMap_5818)PARSER.parseFrom(data);
      }

      public static S2C_LightMap_5818 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LightMap_5818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LightMap_5818 parseFrom(InputStream input) throws IOException {
         return (S2C_LightMap_5818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LightMap_5818 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LightMap_5818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LightMap_5818 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LightMap_5818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LightMap_5818 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LightMap_5818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LightMap_5818 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LightMap_5818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LightMap_5818 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LightMap_5818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LightMap_5818 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LightMap_5818 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LightMap_5818> parser() {
         return PARSER;
      }

      public Parser<S2C_LightMap_5818> getParserForType() {
         return PARSER;
      }

      public S2C_LightMap_5818 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LightMap_5818OrBuilder {
         private int bitField0_;
         private MapIdentify position_;
         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> positionBuilder_;
         private List<MapIdentify> light_;
         private RepeatedFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> lightBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LightMap_5818.class, Builder.class);
         }

         private Builder() {
            this.light_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.light_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_LightMap_5818.alwaysUseFieldBuilders) {
               this.getPositionFieldBuilder();
               this.getLightFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.positionBuilder_ == null) {
               this.position_ = null;
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.lightBuilder_ == null) {
               this.light_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.lightBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LightMap_5818_descriptor;
         }

         public S2C_LightMap_5818 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_LightMap_5818.getDefaultInstance();
         }

         public S2C_LightMap_5818 build() {
            S2C_LightMap_5818 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LightMap_5818 buildPartial() {
            S2C_LightMap_5818 result = new S2C_LightMap_5818(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.positionBuilder_ == null) {
                  result.position_ = this.position_;
               } else {
                  result.position_ = (MapIdentify)this.positionBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.lightBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.light_ = Collections.unmodifiableList(this.light_);
                  this.bitField0_ &= -3;
               }

               result.light_ = this.light_;
            } else {
               result.light_ = this.lightBuilder_.build();
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
            if (other instanceof S2C_LightMap_5818) {
               return this.mergeFrom((S2C_LightMap_5818)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LightMap_5818 other) {
            if (other == StoneCircleMsg.S2C_LightMap_5818.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.mergePosition(other.getPosition());
               }

               if (this.lightBuilder_ == null) {
                  if (!other.light_.isEmpty()) {
                     if (this.light_.isEmpty()) {
                        this.light_ = other.light_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureLightIsMutable();
                        this.light_.addAll(other.light_);
                     }

                     this.onChanged();
                  }
               } else if (!other.light_.isEmpty()) {
                  if (this.lightBuilder_.isEmpty()) {
                     this.lightBuilder_.dispose();
                     this.lightBuilder_ = null;
                     this.light_ = other.light_;
                     this.bitField0_ &= -3;
                     this.lightBuilder_ = StoneCircleMsg.S2C_LightMap_5818.alwaysUseFieldBuilders ? this.getLightFieldBuilder() : null;
                  } else {
                     this.lightBuilder_.addAllMessages(other.light_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.getPosition().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getLightCount(); ++i) {
                  if (!this.getLight(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LightMap_5818 parsedMessage = null;

            try {
               parsedMessage = (S2C_LightMap_5818)StoneCircleMsg.S2C_LightMap_5818.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LightMap_5818)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public MapIdentify getPosition() {
            if (this.positionBuilder_ == null) {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            } else {
               return (MapIdentify)this.positionBuilder_.getMessage();
            }
         }

         public Builder setPosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.position_ = value;
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPosition(MapIdentify.Builder builderForValue) {
            if (this.positionBuilder_ == null) {
               this.position_ = builderForValue.build();
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != StoneCircleMsg.MapIdentify.getDefaultInstance()) {
                  this.position_ = StoneCircleMsg.MapIdentify.newBuilder(this.position_).mergeFrom(value).buildPartial();
               } else {
                  this.position_ = value;
               }

               this.onChanged();
            } else {
               this.positionBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPosition() {
            if (this.positionBuilder_ == null) {
               this.position_ = null;
               this.onChanged();
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MapIdentify.Builder getPositionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MapIdentify.Builder)this.getPositionFieldBuilder().getBuilder();
         }

         public MapIdentifyOrBuilder getPositionOrBuilder() {
            if (this.positionBuilder_ != null) {
               return (MapIdentifyOrBuilder)this.positionBuilder_.getMessageOrBuilder();
            } else {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            }
         }

         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getPositionFieldBuilder() {
            if (this.positionBuilder_ == null) {
               this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
               this.position_ = null;
            }

            return this.positionBuilder_;
         }

         private void ensureLightIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.light_ = new ArrayList(this.light_);
               this.bitField0_ |= 2;
            }

         }

         public List<MapIdentify> getLightList() {
            return this.lightBuilder_ == null ? Collections.unmodifiableList(this.light_) : this.lightBuilder_.getMessageList();
         }

         public int getLightCount() {
            return this.lightBuilder_ == null ? this.light_.size() : this.lightBuilder_.getCount();
         }

         public MapIdentify getLight(int index) {
            return this.lightBuilder_ == null ? (MapIdentify)this.light_.get(index) : (MapIdentify)this.lightBuilder_.getMessage(index);
         }

         public Builder setLight(int index, MapIdentify value) {
            if (this.lightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLightIsMutable();
               this.light_.set(index, value);
               this.onChanged();
            } else {
               this.lightBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLight(int index, MapIdentify.Builder builderForValue) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               this.light_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lightBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLight(MapIdentify value) {
            if (this.lightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLightIsMutable();
               this.light_.add(value);
               this.onChanged();
            } else {
               this.lightBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLight(int index, MapIdentify value) {
            if (this.lightBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLightIsMutable();
               this.light_.add(index, value);
               this.onChanged();
            } else {
               this.lightBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLight(MapIdentify.Builder builderForValue) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               this.light_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.lightBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLight(int index, MapIdentify.Builder builderForValue) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               this.light_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lightBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLight(Iterable<? extends MapIdentify> values) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.light_);
               this.onChanged();
            } else {
               this.lightBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLight() {
            if (this.lightBuilder_ == null) {
               this.light_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.lightBuilder_.clear();
            }

            return this;
         }

         public Builder removeLight(int index) {
            if (this.lightBuilder_ == null) {
               this.ensureLightIsMutable();
               this.light_.remove(index);
               this.onChanged();
            } else {
               this.lightBuilder_.remove(index);
            }

            return this;
         }

         public MapIdentify.Builder getLightBuilder(int index) {
            return (MapIdentify.Builder)this.getLightFieldBuilder().getBuilder(index);
         }

         public MapIdentifyOrBuilder getLightOrBuilder(int index) {
            return this.lightBuilder_ == null ? (MapIdentifyOrBuilder)this.light_.get(index) : (MapIdentifyOrBuilder)this.lightBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MapIdentifyOrBuilder> getLightOrBuilderList() {
            return this.lightBuilder_ != null ? this.lightBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.light_);
         }

         public MapIdentify.Builder addLightBuilder() {
            return (MapIdentify.Builder)this.getLightFieldBuilder().addBuilder(StoneCircleMsg.MapIdentify.getDefaultInstance());
         }

         public MapIdentify.Builder addLightBuilder(int index) {
            return (MapIdentify.Builder)this.getLightFieldBuilder().addBuilder(index, StoneCircleMsg.MapIdentify.getDefaultInstance());
         }

         public List<MapIdentify.Builder> getLightBuilderList() {
            return this.getLightFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getLightFieldBuilder() {
            if (this.lightBuilder_ == null) {
               this.lightBuilder_ = new RepeatedFieldBuilderV3(this.light_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.light_ = null;
            }

            return this.lightBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SaveArraying_5819 extends GeneratedMessageV3 implements C2S_SaveArraying_5819OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int EXTRAHERO_FIELD_NUMBER = 1;
      private List<ExtraArraying> extraHero_;
      private byte memoizedIsInitialized;
      private static final C2S_SaveArraying_5819 DEFAULT_INSTANCE = new C2S_SaveArraying_5819();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SaveArraying_5819> PARSER = new AbstractParser<C2S_SaveArraying_5819>() {
         public C2S_SaveArraying_5819 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SaveArraying_5819(input, extensionRegistry);
         }
      };

      private C2S_SaveArraying_5819(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SaveArraying_5819() {
         this.memoizedIsInitialized = -1;
         this.extraHero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SaveArraying_5819();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SaveArraying_5819(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.extraHero_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.extraHero_.add(input.readMessage(StoneCircleMsg.ExtraArraying.PARSER, extensionRegistry));
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
                  this.extraHero_ = Collections.unmodifiableList(this.extraHero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SaveArraying_5819.class, Builder.class);
      }

      public List<ExtraArraying> getExtraHeroList() {
         return this.extraHero_;
      }

      public List<? extends ExtraArrayingOrBuilder> getExtraHeroOrBuilderList() {
         return this.extraHero_;
      }

      public int getExtraHeroCount() {
         return this.extraHero_.size();
      }

      public ExtraArraying getExtraHero(int index) {
         return (ExtraArraying)this.extraHero_.get(index);
      }

      public ExtraArrayingOrBuilder getExtraHeroOrBuilder(int index) {
         return (ExtraArrayingOrBuilder)this.extraHero_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getExtraHeroCount(); ++i) {
               if (!this.getExtraHero(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.extraHero_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.extraHero_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.extraHero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.extraHero_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SaveArraying_5819)) {
            return super.equals(obj);
         } else {
            C2S_SaveArraying_5819 other = (C2S_SaveArraying_5819)obj;
            if (!this.getExtraHeroList().equals(other.getExtraHeroList())) {
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
            if (this.getExtraHeroCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getExtraHeroList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SaveArraying_5819 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_5819)PARSER.parseFrom(data);
      }

      public static C2S_SaveArraying_5819 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_5819)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveArraying_5819 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_5819)PARSER.parseFrom(data);
      }

      public static C2S_SaveArraying_5819 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_5819)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveArraying_5819 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_5819)PARSER.parseFrom(data);
      }

      public static C2S_SaveArraying_5819 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_5819)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveArraying_5819 parseFrom(InputStream input) throws IOException {
         return (C2S_SaveArraying_5819)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SaveArraying_5819 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveArraying_5819)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SaveArraying_5819 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SaveArraying_5819)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SaveArraying_5819 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveArraying_5819)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SaveArraying_5819 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SaveArraying_5819)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SaveArraying_5819 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveArraying_5819)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SaveArraying_5819 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SaveArraying_5819 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SaveArraying_5819> parser() {
         return PARSER;
      }

      public Parser<C2S_SaveArraying_5819> getParserForType() {
         return PARSER;
      }

      public C2S_SaveArraying_5819 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SaveArraying_5819OrBuilder {
         private int bitField0_;
         private List<ExtraArraying> extraHero_;
         private RepeatedFieldBuilderV3<ExtraArraying, ExtraArraying.Builder, ExtraArrayingOrBuilder> extraHeroBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SaveArraying_5819.class, Builder.class);
         }

         private Builder() {
            this.extraHero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.extraHero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_SaveArraying_5819.alwaysUseFieldBuilders) {
               this.getExtraHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.extraHeroBuilder_ == null) {
               this.extraHero_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.extraHeroBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SaveArraying_5819_descriptor;
         }

         public C2S_SaveArraying_5819 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_SaveArraying_5819.getDefaultInstance();
         }

         public C2S_SaveArraying_5819 build() {
            C2S_SaveArraying_5819 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SaveArraying_5819 buildPartial() {
            C2S_SaveArraying_5819 result = new C2S_SaveArraying_5819(this);
            int from_bitField0_ = this.bitField0_;
            if (this.extraHeroBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.extraHero_ = Collections.unmodifiableList(this.extraHero_);
                  this.bitField0_ &= -2;
               }

               result.extraHero_ = this.extraHero_;
            } else {
               result.extraHero_ = this.extraHeroBuilder_.build();
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
            if (other instanceof C2S_SaveArraying_5819) {
               return this.mergeFrom((C2S_SaveArraying_5819)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SaveArraying_5819 other) {
            if (other == StoneCircleMsg.C2S_SaveArraying_5819.getDefaultInstance()) {
               return this;
            } else {
               if (this.extraHeroBuilder_ == null) {
                  if (!other.extraHero_.isEmpty()) {
                     if (this.extraHero_.isEmpty()) {
                        this.extraHero_ = other.extraHero_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureExtraHeroIsMutable();
                        this.extraHero_.addAll(other.extraHero_);
                     }

                     this.onChanged();
                  }
               } else if (!other.extraHero_.isEmpty()) {
                  if (this.extraHeroBuilder_.isEmpty()) {
                     this.extraHeroBuilder_.dispose();
                     this.extraHeroBuilder_ = null;
                     this.extraHero_ = other.extraHero_;
                     this.bitField0_ &= -2;
                     this.extraHeroBuilder_ = StoneCircleMsg.C2S_SaveArraying_5819.alwaysUseFieldBuilders ? this.getExtraHeroFieldBuilder() : null;
                  } else {
                     this.extraHeroBuilder_.addAllMessages(other.extraHero_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getExtraHeroCount(); ++i) {
               if (!this.getExtraHero(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SaveArraying_5819 parsedMessage = null;

            try {
               parsedMessage = (C2S_SaveArraying_5819)StoneCircleMsg.C2S_SaveArraying_5819.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SaveArraying_5819)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureExtraHeroIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.extraHero_ = new ArrayList(this.extraHero_);
               this.bitField0_ |= 1;
            }

         }

         public List<ExtraArraying> getExtraHeroList() {
            return this.extraHeroBuilder_ == null ? Collections.unmodifiableList(this.extraHero_) : this.extraHeroBuilder_.getMessageList();
         }

         public int getExtraHeroCount() {
            return this.extraHeroBuilder_ == null ? this.extraHero_.size() : this.extraHeroBuilder_.getCount();
         }

         public ExtraArraying getExtraHero(int index) {
            return this.extraHeroBuilder_ == null ? (ExtraArraying)this.extraHero_.get(index) : (ExtraArraying)this.extraHeroBuilder_.getMessage(index);
         }

         public Builder setExtraHero(int index, ExtraArraying value) {
            if (this.extraHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExtraHeroIsMutable();
               this.extraHero_.set(index, value);
               this.onChanged();
            } else {
               this.extraHeroBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setExtraHero(int index, ExtraArraying.Builder builderForValue) {
            if (this.extraHeroBuilder_ == null) {
               this.ensureExtraHeroIsMutable();
               this.extraHero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.extraHeroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addExtraHero(ExtraArraying value) {
            if (this.extraHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExtraHeroIsMutable();
               this.extraHero_.add(value);
               this.onChanged();
            } else {
               this.extraHeroBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addExtraHero(int index, ExtraArraying value) {
            if (this.extraHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExtraHeroIsMutable();
               this.extraHero_.add(index, value);
               this.onChanged();
            } else {
               this.extraHeroBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addExtraHero(ExtraArraying.Builder builderForValue) {
            if (this.extraHeroBuilder_ == null) {
               this.ensureExtraHeroIsMutable();
               this.extraHero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.extraHeroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addExtraHero(int index, ExtraArraying.Builder builderForValue) {
            if (this.extraHeroBuilder_ == null) {
               this.ensureExtraHeroIsMutable();
               this.extraHero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.extraHeroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllExtraHero(Iterable<? extends ExtraArraying> values) {
            if (this.extraHeroBuilder_ == null) {
               this.ensureExtraHeroIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.extraHero_);
               this.onChanged();
            } else {
               this.extraHeroBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearExtraHero() {
            if (this.extraHeroBuilder_ == null) {
               this.extraHero_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.extraHeroBuilder_.clear();
            }

            return this;
         }

         public Builder removeExtraHero(int index) {
            if (this.extraHeroBuilder_ == null) {
               this.ensureExtraHeroIsMutable();
               this.extraHero_.remove(index);
               this.onChanged();
            } else {
               this.extraHeroBuilder_.remove(index);
            }

            return this;
         }

         public ExtraArraying.Builder getExtraHeroBuilder(int index) {
            return (ExtraArraying.Builder)this.getExtraHeroFieldBuilder().getBuilder(index);
         }

         public ExtraArrayingOrBuilder getExtraHeroOrBuilder(int index) {
            return this.extraHeroBuilder_ == null ? (ExtraArrayingOrBuilder)this.extraHero_.get(index) : (ExtraArrayingOrBuilder)this.extraHeroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ExtraArrayingOrBuilder> getExtraHeroOrBuilderList() {
            return this.extraHeroBuilder_ != null ? this.extraHeroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.extraHero_);
         }

         public ExtraArraying.Builder addExtraHeroBuilder() {
            return (ExtraArraying.Builder)this.getExtraHeroFieldBuilder().addBuilder(StoneCircleMsg.ExtraArraying.getDefaultInstance());
         }

         public ExtraArraying.Builder addExtraHeroBuilder(int index) {
            return (ExtraArraying.Builder)this.getExtraHeroFieldBuilder().addBuilder(index, StoneCircleMsg.ExtraArraying.getDefaultInstance());
         }

         public List<ExtraArraying.Builder> getExtraHeroBuilderList() {
            return this.getExtraHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ExtraArraying, ExtraArraying.Builder, ExtraArrayingOrBuilder> getExtraHeroFieldBuilder() {
            if (this.extraHeroBuilder_ == null) {
               this.extraHeroBuilder_ = new RepeatedFieldBuilderV3(this.extraHero_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.extraHero_ = null;
            }

            return this.extraHeroBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_SaveArraying_5820 extends GeneratedMessageV3 implements S2C_SaveArraying_5820OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ARRAYING_FIELD_NUMBER = 1;
      private List<Arraying> arraying_;
      private byte memoizedIsInitialized;
      private static final S2C_SaveArraying_5820 DEFAULT_INSTANCE = new S2C_SaveArraying_5820();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SaveArraying_5820> PARSER = new AbstractParser<S2C_SaveArraying_5820>() {
         public S2C_SaveArraying_5820 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SaveArraying_5820(input, extensionRegistry);
         }
      };

      private S2C_SaveArraying_5820(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SaveArraying_5820() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SaveArraying_5820();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SaveArraying_5820(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.arraying_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.arraying_.add(input.readMessage(StoneCircleMsg.Arraying.PARSER, extensionRegistry));
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
                  this.arraying_ = Collections.unmodifiableList(this.arraying_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SaveArraying_5820.class, Builder.class);
      }

      public List<Arraying> getArrayingList() {
         return this.arraying_;
      }

      public List<? extends ArrayingOrBuilder> getArrayingOrBuilderList() {
         return this.arraying_;
      }

      public int getArrayingCount() {
         return this.arraying_.size();
      }

      public Arraying getArraying(int index) {
         return (Arraying)this.arraying_.get(index);
      }

      public ArrayingOrBuilder getArrayingOrBuilder(int index) {
         return (ArrayingOrBuilder)this.arraying_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getArrayingCount(); ++i) {
               if (!this.getArraying(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.arraying_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.arraying_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.arraying_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.arraying_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SaveArraying_5820)) {
            return super.equals(obj);
         } else {
            S2C_SaveArraying_5820 other = (S2C_SaveArraying_5820)obj;
            if (!this.getArrayingList().equals(other.getArrayingList())) {
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
            if (this.getArrayingCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getArrayingList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SaveArraying_5820 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_5820)PARSER.parseFrom(data);
      }

      public static S2C_SaveArraying_5820 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_5820)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveArraying_5820 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_5820)PARSER.parseFrom(data);
      }

      public static S2C_SaveArraying_5820 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_5820)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveArraying_5820 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_5820)PARSER.parseFrom(data);
      }

      public static S2C_SaveArraying_5820 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_5820)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveArraying_5820 parseFrom(InputStream input) throws IOException {
         return (S2C_SaveArraying_5820)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SaveArraying_5820 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveArraying_5820)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SaveArraying_5820 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SaveArraying_5820)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SaveArraying_5820 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveArraying_5820)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SaveArraying_5820 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SaveArraying_5820)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SaveArraying_5820 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveArraying_5820)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SaveArraying_5820 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SaveArraying_5820 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SaveArraying_5820> parser() {
         return PARSER;
      }

      public Parser<S2C_SaveArraying_5820> getParserForType() {
         return PARSER;
      }

      public S2C_SaveArraying_5820 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SaveArraying_5820OrBuilder {
         private int bitField0_;
         private List<Arraying> arraying_;
         private RepeatedFieldBuilderV3<Arraying, Arraying.Builder, ArrayingOrBuilder> arrayingBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SaveArraying_5820.class, Builder.class);
         }

         private Builder() {
            this.arraying_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arraying_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_SaveArraying_5820.alwaysUseFieldBuilders) {
               this.getArrayingFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.arrayingBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SaveArraying_5820_descriptor;
         }

         public S2C_SaveArraying_5820 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_SaveArraying_5820.getDefaultInstance();
         }

         public S2C_SaveArraying_5820 build() {
            S2C_SaveArraying_5820 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SaveArraying_5820 buildPartial() {
            S2C_SaveArraying_5820 result = new S2C_SaveArraying_5820(this);
            int from_bitField0_ = this.bitField0_;
            if (this.arrayingBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.arraying_ = Collections.unmodifiableList(this.arraying_);
                  this.bitField0_ &= -2;
               }

               result.arraying_ = this.arraying_;
            } else {
               result.arraying_ = this.arrayingBuilder_.build();
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
            if (other instanceof S2C_SaveArraying_5820) {
               return this.mergeFrom((S2C_SaveArraying_5820)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SaveArraying_5820 other) {
            if (other == StoneCircleMsg.S2C_SaveArraying_5820.getDefaultInstance()) {
               return this;
            } else {
               if (this.arrayingBuilder_ == null) {
                  if (!other.arraying_.isEmpty()) {
                     if (this.arraying_.isEmpty()) {
                        this.arraying_ = other.arraying_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureArrayingIsMutable();
                        this.arraying_.addAll(other.arraying_);
                     }

                     this.onChanged();
                  }
               } else if (!other.arraying_.isEmpty()) {
                  if (this.arrayingBuilder_.isEmpty()) {
                     this.arrayingBuilder_.dispose();
                     this.arrayingBuilder_ = null;
                     this.arraying_ = other.arraying_;
                     this.bitField0_ &= -2;
                     this.arrayingBuilder_ = StoneCircleMsg.S2C_SaveArraying_5820.alwaysUseFieldBuilders ? this.getArrayingFieldBuilder() : null;
                  } else {
                     this.arrayingBuilder_.addAllMessages(other.arraying_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getArrayingCount(); ++i) {
               if (!this.getArraying(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SaveArraying_5820 parsedMessage = null;

            try {
               parsedMessage = (S2C_SaveArraying_5820)StoneCircleMsg.S2C_SaveArraying_5820.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SaveArraying_5820)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureArrayingIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.arraying_ = new ArrayList(this.arraying_);
               this.bitField0_ |= 1;
            }

         }

         public List<Arraying> getArrayingList() {
            return this.arrayingBuilder_ == null ? Collections.unmodifiableList(this.arraying_) : this.arrayingBuilder_.getMessageList();
         }

         public int getArrayingCount() {
            return this.arrayingBuilder_ == null ? this.arraying_.size() : this.arrayingBuilder_.getCount();
         }

         public Arraying getArraying(int index) {
            return this.arrayingBuilder_ == null ? (Arraying)this.arraying_.get(index) : (Arraying)this.arrayingBuilder_.getMessage(index);
         }

         public Builder setArraying(int index, Arraying value) {
            if (this.arrayingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingIsMutable();
               this.arraying_.set(index, value);
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setArraying(int index, Arraying.Builder builderForValue) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               this.arraying_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addArraying(Arraying value) {
            if (this.arrayingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingIsMutable();
               this.arraying_.add(value);
               this.onChanged();
            } else {
               this.arrayingBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addArraying(int index, Arraying value) {
            if (this.arrayingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingIsMutable();
               this.arraying_.add(index, value);
               this.onChanged();
            } else {
               this.arrayingBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addArraying(Arraying.Builder builderForValue) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               this.arraying_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addArraying(int index, Arraying.Builder builderForValue) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               this.arraying_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllArraying(Iterable<? extends Arraying> values) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.arraying_);
               this.onChanged();
            } else {
               this.arrayingBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearArraying() {
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.arrayingBuilder_.clear();
            }

            return this;
         }

         public Builder removeArraying(int index) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               this.arraying_.remove(index);
               this.onChanged();
            } else {
               this.arrayingBuilder_.remove(index);
            }

            return this;
         }

         public Arraying.Builder getArrayingBuilder(int index) {
            return (Arraying.Builder)this.getArrayingFieldBuilder().getBuilder(index);
         }

         public ArrayingOrBuilder getArrayingOrBuilder(int index) {
            return this.arrayingBuilder_ == null ? (ArrayingOrBuilder)this.arraying_.get(index) : (ArrayingOrBuilder)this.arrayingBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ArrayingOrBuilder> getArrayingOrBuilderList() {
            return this.arrayingBuilder_ != null ? this.arrayingBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.arraying_);
         }

         public Arraying.Builder addArrayingBuilder() {
            return (Arraying.Builder)this.getArrayingFieldBuilder().addBuilder(StoneCircleMsg.Arraying.getDefaultInstance());
         }

         public Arraying.Builder addArrayingBuilder(int index) {
            return (Arraying.Builder)this.getArrayingFieldBuilder().addBuilder(index, StoneCircleMsg.Arraying.getDefaultInstance());
         }

         public List<Arraying.Builder> getArrayingBuilderList() {
            return this.getArrayingFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Arraying, Arraying.Builder, ArrayingOrBuilder> getArrayingFieldBuilder() {
            if (this.arrayingBuilder_ == null) {
               this.arrayingBuilder_ = new RepeatedFieldBuilderV3(this.arraying_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.arraying_ = null;
            }

            return this.arrayingBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ExtraArraying_5821 extends GeneratedMessageV3 implements C2S_ExtraArraying_5821OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ExtraArraying_5821 DEFAULT_INSTANCE = new C2S_ExtraArraying_5821();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ExtraArraying_5821> PARSER = new AbstractParser<C2S_ExtraArraying_5821>() {
         public C2S_ExtraArraying_5821 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ExtraArraying_5821(input, extensionRegistry);
         }
      };

      private C2S_ExtraArraying_5821(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ExtraArraying_5821() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ExtraArraying_5821();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ExtraArraying_5821(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExtraArraying_5821.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ExtraArraying_5821)) {
            return super.equals(obj);
         } else {
            C2S_ExtraArraying_5821 other = (C2S_ExtraArraying_5821)obj;
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

      public static C2S_ExtraArraying_5821 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ExtraArraying_5821)PARSER.parseFrom(data);
      }

      public static C2S_ExtraArraying_5821 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExtraArraying_5821)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExtraArraying_5821 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ExtraArraying_5821)PARSER.parseFrom(data);
      }

      public static C2S_ExtraArraying_5821 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExtraArraying_5821)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExtraArraying_5821 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ExtraArraying_5821)PARSER.parseFrom(data);
      }

      public static C2S_ExtraArraying_5821 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ExtraArraying_5821)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ExtraArraying_5821 parseFrom(InputStream input) throws IOException {
         return (C2S_ExtraArraying_5821)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExtraArraying_5821 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExtraArraying_5821)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExtraArraying_5821 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ExtraArraying_5821)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ExtraArraying_5821 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExtraArraying_5821)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ExtraArraying_5821 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ExtraArraying_5821)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ExtraArraying_5821 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ExtraArraying_5821)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ExtraArraying_5821 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ExtraArraying_5821 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ExtraArraying_5821> parser() {
         return PARSER;
      }

      public Parser<C2S_ExtraArraying_5821> getParserForType() {
         return PARSER;
      }

      public C2S_ExtraArraying_5821 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ExtraArraying_5821OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ExtraArraying_5821.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_ExtraArraying_5821.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_ExtraArraying_5821_descriptor;
         }

         public C2S_ExtraArraying_5821 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_ExtraArraying_5821.getDefaultInstance();
         }

         public C2S_ExtraArraying_5821 build() {
            C2S_ExtraArraying_5821 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ExtraArraying_5821 buildPartial() {
            C2S_ExtraArraying_5821 result = new C2S_ExtraArraying_5821(this);
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
            if (other instanceof C2S_ExtraArraying_5821) {
               return this.mergeFrom((C2S_ExtraArraying_5821)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ExtraArraying_5821 other) {
            if (other == StoneCircleMsg.C2S_ExtraArraying_5821.getDefaultInstance()) {
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
            C2S_ExtraArraying_5821 parsedMessage = null;

            try {
               parsedMessage = (C2S_ExtraArraying_5821)StoneCircleMsg.C2S_ExtraArraying_5821.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ExtraArraying_5821)e.getUnfinishedMessage();
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

   public static final class S2C_ExtraArraying_5822 extends GeneratedMessageV3 implements S2C_ExtraArraying_5822OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ARRAYING_FIELD_NUMBER = 1;
      private List<Arraying> arraying_;
      private byte memoizedIsInitialized;
      private static final S2C_ExtraArraying_5822 DEFAULT_INSTANCE = new S2C_ExtraArraying_5822();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ExtraArraying_5822> PARSER = new AbstractParser<S2C_ExtraArraying_5822>() {
         public S2C_ExtraArraying_5822 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ExtraArraying_5822(input, extensionRegistry);
         }
      };

      private S2C_ExtraArraying_5822(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ExtraArraying_5822() {
         this.memoizedIsInitialized = -1;
         this.arraying_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ExtraArraying_5822();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ExtraArraying_5822(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.arraying_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.arraying_.add(input.readMessage(StoneCircleMsg.Arraying.PARSER, extensionRegistry));
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
                  this.arraying_ = Collections.unmodifiableList(this.arraying_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExtraArraying_5822.class, Builder.class);
      }

      public List<Arraying> getArrayingList() {
         return this.arraying_;
      }

      public List<? extends ArrayingOrBuilder> getArrayingOrBuilderList() {
         return this.arraying_;
      }

      public int getArrayingCount() {
         return this.arraying_.size();
      }

      public Arraying getArraying(int index) {
         return (Arraying)this.arraying_.get(index);
      }

      public ArrayingOrBuilder getArrayingOrBuilder(int index) {
         return (ArrayingOrBuilder)this.arraying_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getArrayingCount(); ++i) {
               if (!this.getArraying(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.arraying_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.arraying_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.arraying_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.arraying_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ExtraArraying_5822)) {
            return super.equals(obj);
         } else {
            S2C_ExtraArraying_5822 other = (S2C_ExtraArraying_5822)obj;
            if (!this.getArrayingList().equals(other.getArrayingList())) {
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
            if (this.getArrayingCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getArrayingList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ExtraArraying_5822 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ExtraArraying_5822)PARSER.parseFrom(data);
      }

      public static S2C_ExtraArraying_5822 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExtraArraying_5822)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExtraArraying_5822 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ExtraArraying_5822)PARSER.parseFrom(data);
      }

      public static S2C_ExtraArraying_5822 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExtraArraying_5822)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExtraArraying_5822 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ExtraArraying_5822)PARSER.parseFrom(data);
      }

      public static S2C_ExtraArraying_5822 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ExtraArraying_5822)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ExtraArraying_5822 parseFrom(InputStream input) throws IOException {
         return (S2C_ExtraArraying_5822)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExtraArraying_5822 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExtraArraying_5822)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExtraArraying_5822 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ExtraArraying_5822)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ExtraArraying_5822 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExtraArraying_5822)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ExtraArraying_5822 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ExtraArraying_5822)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ExtraArraying_5822 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ExtraArraying_5822)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ExtraArraying_5822 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ExtraArraying_5822 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ExtraArraying_5822> parser() {
         return PARSER;
      }

      public Parser<S2C_ExtraArraying_5822> getParserForType() {
         return PARSER;
      }

      public S2C_ExtraArraying_5822 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ExtraArraying_5822OrBuilder {
         private int bitField0_;
         private List<Arraying> arraying_;
         private RepeatedFieldBuilderV3<Arraying, Arraying.Builder, ArrayingOrBuilder> arrayingBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ExtraArraying_5822.class, Builder.class);
         }

         private Builder() {
            this.arraying_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arraying_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_ExtraArraying_5822.alwaysUseFieldBuilders) {
               this.getArrayingFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.arrayingBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_ExtraArraying_5822_descriptor;
         }

         public S2C_ExtraArraying_5822 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_ExtraArraying_5822.getDefaultInstance();
         }

         public S2C_ExtraArraying_5822 build() {
            S2C_ExtraArraying_5822 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ExtraArraying_5822 buildPartial() {
            S2C_ExtraArraying_5822 result = new S2C_ExtraArraying_5822(this);
            int from_bitField0_ = this.bitField0_;
            if (this.arrayingBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.arraying_ = Collections.unmodifiableList(this.arraying_);
                  this.bitField0_ &= -2;
               }

               result.arraying_ = this.arraying_;
            } else {
               result.arraying_ = this.arrayingBuilder_.build();
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
            if (other instanceof S2C_ExtraArraying_5822) {
               return this.mergeFrom((S2C_ExtraArraying_5822)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ExtraArraying_5822 other) {
            if (other == StoneCircleMsg.S2C_ExtraArraying_5822.getDefaultInstance()) {
               return this;
            } else {
               if (this.arrayingBuilder_ == null) {
                  if (!other.arraying_.isEmpty()) {
                     if (this.arraying_.isEmpty()) {
                        this.arraying_ = other.arraying_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureArrayingIsMutable();
                        this.arraying_.addAll(other.arraying_);
                     }

                     this.onChanged();
                  }
               } else if (!other.arraying_.isEmpty()) {
                  if (this.arrayingBuilder_.isEmpty()) {
                     this.arrayingBuilder_.dispose();
                     this.arrayingBuilder_ = null;
                     this.arraying_ = other.arraying_;
                     this.bitField0_ &= -2;
                     this.arrayingBuilder_ = StoneCircleMsg.S2C_ExtraArraying_5822.alwaysUseFieldBuilders ? this.getArrayingFieldBuilder() : null;
                  } else {
                     this.arrayingBuilder_.addAllMessages(other.arraying_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getArrayingCount(); ++i) {
               if (!this.getArraying(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ExtraArraying_5822 parsedMessage = null;

            try {
               parsedMessage = (S2C_ExtraArraying_5822)StoneCircleMsg.S2C_ExtraArraying_5822.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ExtraArraying_5822)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureArrayingIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.arraying_ = new ArrayList(this.arraying_);
               this.bitField0_ |= 1;
            }

         }

         public List<Arraying> getArrayingList() {
            return this.arrayingBuilder_ == null ? Collections.unmodifiableList(this.arraying_) : this.arrayingBuilder_.getMessageList();
         }

         public int getArrayingCount() {
            return this.arrayingBuilder_ == null ? this.arraying_.size() : this.arrayingBuilder_.getCount();
         }

         public Arraying getArraying(int index) {
            return this.arrayingBuilder_ == null ? (Arraying)this.arraying_.get(index) : (Arraying)this.arrayingBuilder_.getMessage(index);
         }

         public Builder setArraying(int index, Arraying value) {
            if (this.arrayingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingIsMutable();
               this.arraying_.set(index, value);
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setArraying(int index, Arraying.Builder builderForValue) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               this.arraying_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addArraying(Arraying value) {
            if (this.arrayingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingIsMutable();
               this.arraying_.add(value);
               this.onChanged();
            } else {
               this.arrayingBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addArraying(int index, Arraying value) {
            if (this.arrayingBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingIsMutable();
               this.arraying_.add(index, value);
               this.onChanged();
            } else {
               this.arrayingBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addArraying(Arraying.Builder builderForValue) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               this.arraying_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addArraying(int index, Arraying.Builder builderForValue) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               this.arraying_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllArraying(Iterable<? extends Arraying> values) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.arraying_);
               this.onChanged();
            } else {
               this.arrayingBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearArraying() {
            if (this.arrayingBuilder_ == null) {
               this.arraying_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.arrayingBuilder_.clear();
            }

            return this;
         }

         public Builder removeArraying(int index) {
            if (this.arrayingBuilder_ == null) {
               this.ensureArrayingIsMutable();
               this.arraying_.remove(index);
               this.onChanged();
            } else {
               this.arrayingBuilder_.remove(index);
            }

            return this;
         }

         public Arraying.Builder getArrayingBuilder(int index) {
            return (Arraying.Builder)this.getArrayingFieldBuilder().getBuilder(index);
         }

         public ArrayingOrBuilder getArrayingOrBuilder(int index) {
            return this.arrayingBuilder_ == null ? (ArrayingOrBuilder)this.arraying_.get(index) : (ArrayingOrBuilder)this.arrayingBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ArrayingOrBuilder> getArrayingOrBuilderList() {
            return this.arrayingBuilder_ != null ? this.arrayingBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.arraying_);
         }

         public Arraying.Builder addArrayingBuilder() {
            return (Arraying.Builder)this.getArrayingFieldBuilder().addBuilder(StoneCircleMsg.Arraying.getDefaultInstance());
         }

         public Arraying.Builder addArrayingBuilder(int index) {
            return (Arraying.Builder)this.getArrayingFieldBuilder().addBuilder(index, StoneCircleMsg.Arraying.getDefaultInstance());
         }

         public List<Arraying.Builder> getArrayingBuilderList() {
            return this.getArrayingFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Arraying, Arraying.Builder, ArrayingOrBuilder> getArrayingFieldBuilder() {
            if (this.arrayingBuilder_ == null) {
               this.arrayingBuilder_ = new RepeatedFieldBuilderV3(this.arraying_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.arraying_ = null;
            }

            return this.arrayingBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class ExtraArraying extends GeneratedMessageV3 implements ExtraArrayingOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      private byte memoizedIsInitialized;
      private static final ExtraArraying DEFAULT_INSTANCE = new ExtraArraying();
      /** @deprecated */
      @Deprecated
      public static final Parser<ExtraArraying> PARSER = new AbstractParser<ExtraArraying>() {
         public ExtraArraying parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ExtraArraying(input, extensionRegistry);
         }
      };

      private ExtraArraying(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ExtraArraying() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ExtraArraying();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ExtraArraying(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.position_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_fieldAccessorTable.ensureFieldAccessorsInitialized(ExtraArraying.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPosition() {
         return this.position_;
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
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
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
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.position_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ExtraArraying)) {
            return super.equals(obj);
         } else {
            ExtraArraying other = (ExtraArraying)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
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

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPosition();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ExtraArraying parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ExtraArraying)PARSER.parseFrom(data);
      }

      public static ExtraArraying parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExtraArraying)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExtraArraying parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ExtraArraying)PARSER.parseFrom(data);
      }

      public static ExtraArraying parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExtraArraying)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExtraArraying parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ExtraArraying)PARSER.parseFrom(data);
      }

      public static ExtraArraying parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExtraArraying)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExtraArraying parseFrom(InputStream input) throws IOException {
         return (ExtraArraying)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ExtraArraying parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExtraArraying)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ExtraArraying parseDelimitedFrom(InputStream input) throws IOException {
         return (ExtraArraying)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ExtraArraying parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExtraArraying)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ExtraArraying parseFrom(CodedInputStream input) throws IOException {
         return (ExtraArraying)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ExtraArraying parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExtraArraying)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ExtraArraying prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ExtraArraying getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ExtraArraying> parser() {
         return PARSER;
      }

      public Parser<ExtraArraying> getParserForType() {
         return PARSER;
      }

      public ExtraArraying getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExtraArrayingOrBuilder {
         private int bitField0_;
         private int playerId_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_fieldAccessorTable.ensureFieldAccessorsInitialized(ExtraArraying.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.ExtraArraying.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.position_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_ExtraArraying_descriptor;
         }

         public ExtraArraying getDefaultInstanceForType() {
            return StoneCircleMsg.ExtraArraying.getDefaultInstance();
         }

         public ExtraArraying build() {
            ExtraArraying result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ExtraArraying buildPartial() {
            ExtraArraying result = new ExtraArraying(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.position_ = this.position_;
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
            if (other instanceof ExtraArraying) {
               return this.mergeFrom((ExtraArraying)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ExtraArraying other) {
            if (other == StoneCircleMsg.ExtraArraying.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ExtraArraying parsedMessage = null;

            try {
               parsedMessage = (ExtraArraying)StoneCircleMsg.ExtraArraying.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ExtraArraying)e.getUnfinishedMessage();
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

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 4;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -5;
            this.position_ = 0;
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

   public static final class Arraying extends GeneratedMessageV3 implements ArrayingOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EMPLOYINFO_FIELD_NUMBER = 1;
      private EmployInfo employInfo_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      private byte memoizedIsInitialized;
      private static final Arraying DEFAULT_INSTANCE = new Arraying();
      /** @deprecated */
      @Deprecated
      public static final Parser<Arraying> PARSER = new AbstractParser<Arraying>() {
         public Arraying parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Arraying(input, extensionRegistry);
         }
      };

      private Arraying(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Arraying() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Arraying();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Arraying(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        EmployInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.employInfo_.toBuilder();
                        }

                        this.employInfo_ = (EmployInfo)input.readMessage(StoneCircleMsg.EmployInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.employInfo_);
                           this.employInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.position_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_Arraying_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_Arraying_fieldAccessorTable.ensureFieldAccessorsInitialized(Arraying.class, Builder.class);
      }

      public boolean hasEmployInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public EmployInfo getEmployInfo() {
         return this.employInfo_ == null ? StoneCircleMsg.EmployInfo.getDefaultInstance() : this.employInfo_;
      }

      public EmployInfoOrBuilder getEmployInfoOrBuilder() {
         return this.employInfo_ == null ? StoneCircleMsg.EmployInfo.getDefaultInstance() : this.employInfo_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEmployInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getEmployInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getEmployInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.position_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getEmployInfo());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Arraying)) {
            return super.equals(obj);
         } else {
            Arraying other = (Arraying)obj;
            if (this.hasEmployInfo() != other.hasEmployInfo()) {
               return false;
            } else if (this.hasEmployInfo() && !this.getEmployInfo().equals(other.getEmployInfo())) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
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
            if (this.hasEmployInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEmployInfo().hashCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPosition();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Arraying parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Arraying)PARSER.parseFrom(data);
      }

      public static Arraying parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Arraying)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Arraying parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Arraying)PARSER.parseFrom(data);
      }

      public static Arraying parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Arraying)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Arraying parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Arraying)PARSER.parseFrom(data);
      }

      public static Arraying parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Arraying)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Arraying parseFrom(InputStream input) throws IOException {
         return (Arraying)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Arraying parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Arraying)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Arraying parseDelimitedFrom(InputStream input) throws IOException {
         return (Arraying)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Arraying parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Arraying)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Arraying parseFrom(CodedInputStream input) throws IOException {
         return (Arraying)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Arraying parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Arraying)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Arraying prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Arraying getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Arraying> parser() {
         return PARSER;
      }

      public Parser<Arraying> getParserForType() {
         return PARSER;
      }

      public Arraying getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ArrayingOrBuilder {
         private int bitField0_;
         private EmployInfo employInfo_;
         private SingleFieldBuilderV3<EmployInfo, EmployInfo.Builder, EmployInfoOrBuilder> employInfoBuilder_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_Arraying_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_Arraying_fieldAccessorTable.ensureFieldAccessorsInitialized(Arraying.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.Arraying.alwaysUseFieldBuilders) {
               this.getEmployInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.employInfoBuilder_ == null) {
               this.employInfo_ = null;
            } else {
               this.employInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.position_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_Arraying_descriptor;
         }

         public Arraying getDefaultInstanceForType() {
            return StoneCircleMsg.Arraying.getDefaultInstance();
         }

         public Arraying build() {
            Arraying result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Arraying buildPartial() {
            Arraying result = new Arraying(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.employInfoBuilder_ == null) {
                  result.employInfo_ = this.employInfo_;
               } else {
                  result.employInfo_ = (EmployInfo)this.employInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.position_ = this.position_;
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
            if (other instanceof Arraying) {
               return this.mergeFrom((Arraying)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Arraying other) {
            if (other == StoneCircleMsg.Arraying.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEmployInfo()) {
                  this.mergeEmployInfo(other.getEmployInfo());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEmployInfo()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.getEmployInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Arraying parsedMessage = null;

            try {
               parsedMessage = (Arraying)StoneCircleMsg.Arraying.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Arraying)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEmployInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public EmployInfo getEmployInfo() {
            if (this.employInfoBuilder_ == null) {
               return this.employInfo_ == null ? StoneCircleMsg.EmployInfo.getDefaultInstance() : this.employInfo_;
            } else {
               return (EmployInfo)this.employInfoBuilder_.getMessage();
            }
         }

         public Builder setEmployInfo(EmployInfo value) {
            if (this.employInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.employInfo_ = value;
               this.onChanged();
            } else {
               this.employInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setEmployInfo(EmployInfo.Builder builderForValue) {
            if (this.employInfoBuilder_ == null) {
               this.employInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.employInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeEmployInfo(EmployInfo value) {
            if (this.employInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.employInfo_ != null && this.employInfo_ != StoneCircleMsg.EmployInfo.getDefaultInstance()) {
                  this.employInfo_ = StoneCircleMsg.EmployInfo.newBuilder(this.employInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.employInfo_ = value;
               }

               this.onChanged();
            } else {
               this.employInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearEmployInfo() {
            if (this.employInfoBuilder_ == null) {
               this.employInfo_ = null;
               this.onChanged();
            } else {
               this.employInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public EmployInfo.Builder getEmployInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (EmployInfo.Builder)this.getEmployInfoFieldBuilder().getBuilder();
         }

         public EmployInfoOrBuilder getEmployInfoOrBuilder() {
            if (this.employInfoBuilder_ != null) {
               return (EmployInfoOrBuilder)this.employInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.employInfo_ == null ? StoneCircleMsg.EmployInfo.getDefaultInstance() : this.employInfo_;
            }
         }

         private SingleFieldBuilderV3<EmployInfo, EmployInfo.Builder, EmployInfoOrBuilder> getEmployInfoFieldBuilder() {
            if (this.employInfoBuilder_ == null) {
               this.employInfoBuilder_ = new SingleFieldBuilderV3(this.getEmployInfo(), this.getParentForChildren(), this.isClean());
               this.employInfo_ = null;
            }

            return this.employInfoBuilder_;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 2;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 0;
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

   public static final class C2S_EmployHero_5824 extends GeneratedMessageV3 implements C2S_EmployHero_5824OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_EmployHero_5824 DEFAULT_INSTANCE = new C2S_EmployHero_5824();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EmployHero_5824> PARSER = new AbstractParser<C2S_EmployHero_5824>() {
         public C2S_EmployHero_5824 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EmployHero_5824(input, extensionRegistry);
         }
      };

      private C2S_EmployHero_5824(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EmployHero_5824() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EmployHero_5824();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EmployHero_5824(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EmployHero_5824.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
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
         } else if (!this.hasHeroCode()) {
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
            output.writeInt32(2, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EmployHero_5824)) {
            return super.equals(obj);
         } else {
            C2S_EmployHero_5824 other = (C2S_EmployHero_5824)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EmployHero_5824 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_5824)PARSER.parseFrom(data);
      }

      public static C2S_EmployHero_5824 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_5824)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EmployHero_5824 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_5824)PARSER.parseFrom(data);
      }

      public static C2S_EmployHero_5824 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_5824)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EmployHero_5824 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_5824)PARSER.parseFrom(data);
      }

      public static C2S_EmployHero_5824 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EmployHero_5824)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EmployHero_5824 parseFrom(InputStream input) throws IOException {
         return (C2S_EmployHero_5824)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EmployHero_5824 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EmployHero_5824)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EmployHero_5824 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EmployHero_5824)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EmployHero_5824 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EmployHero_5824)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EmployHero_5824 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EmployHero_5824)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EmployHero_5824 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EmployHero_5824)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EmployHero_5824 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EmployHero_5824 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EmployHero_5824> parser() {
         return PARSER;
      }

      public Parser<C2S_EmployHero_5824> getParserForType() {
         return PARSER;
      }

      public C2S_EmployHero_5824 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EmployHero_5824OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EmployHero_5824.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_EmployHero_5824.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_EmployHero_5824_descriptor;
         }

         public C2S_EmployHero_5824 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_EmployHero_5824.getDefaultInstance();
         }

         public C2S_EmployHero_5824 build() {
            C2S_EmployHero_5824 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EmployHero_5824 buildPartial() {
            C2S_EmployHero_5824 result = new C2S_EmployHero_5824(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_EmployHero_5824) {
               return this.mergeFrom((C2S_EmployHero_5824)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EmployHero_5824 other) {
            if (other == StoneCircleMsg.C2S_EmployHero_5824.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EmployHero_5824 parsedMessage = null;

            try {
               parsedMessage = (C2S_EmployHero_5824)StoneCircleMsg.C2S_EmployHero_5824.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EmployHero_5824)e.getUnfinishedMessage();
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

         public boolean hasHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 2;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
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

   public static final class S2C_EmployHero_5825 extends GeneratedMessageV3 implements S2C_EmployHero_5825OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SUPPORTHERO_FIELD_NUMBER = 1;
      private List<SupportInfo> supportHero_;
      private byte memoizedIsInitialized;
      private static final S2C_EmployHero_5825 DEFAULT_INSTANCE = new S2C_EmployHero_5825();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EmployHero_5825> PARSER = new AbstractParser<S2C_EmployHero_5825>() {
         public S2C_EmployHero_5825 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EmployHero_5825(input, extensionRegistry);
         }
      };

      private S2C_EmployHero_5825(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EmployHero_5825() {
         this.memoizedIsInitialized = -1;
         this.supportHero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EmployHero_5825();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EmployHero_5825(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.supportHero_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.supportHero_.add(input.readMessage(StoneCircleMsg.SupportInfo.PARSER, extensionRegistry));
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
                  this.supportHero_ = Collections.unmodifiableList(this.supportHero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EmployHero_5825.class, Builder.class);
      }

      public List<SupportInfo> getSupportHeroList() {
         return this.supportHero_;
      }

      public List<? extends SupportInfoOrBuilder> getSupportHeroOrBuilderList() {
         return this.supportHero_;
      }

      public int getSupportHeroCount() {
         return this.supportHero_.size();
      }

      public SupportInfo getSupportHero(int index) {
         return (SupportInfo)this.supportHero_.get(index);
      }

      public SupportInfoOrBuilder getSupportHeroOrBuilder(int index) {
         return (SupportInfoOrBuilder)this.supportHero_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getSupportHeroCount(); ++i) {
               if (!this.getSupportHero(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.supportHero_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.supportHero_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.supportHero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.supportHero_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EmployHero_5825)) {
            return super.equals(obj);
         } else {
            S2C_EmployHero_5825 other = (S2C_EmployHero_5825)obj;
            if (!this.getSupportHeroList().equals(other.getSupportHeroList())) {
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
            if (this.getSupportHeroCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSupportHeroList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EmployHero_5825 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_5825)PARSER.parseFrom(data);
      }

      public static S2C_EmployHero_5825 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_5825)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EmployHero_5825 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_5825)PARSER.parseFrom(data);
      }

      public static S2C_EmployHero_5825 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_5825)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EmployHero_5825 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_5825)PARSER.parseFrom(data);
      }

      public static S2C_EmployHero_5825 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EmployHero_5825)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EmployHero_5825 parseFrom(InputStream input) throws IOException {
         return (S2C_EmployHero_5825)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EmployHero_5825 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EmployHero_5825)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EmployHero_5825 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EmployHero_5825)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EmployHero_5825 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EmployHero_5825)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EmployHero_5825 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EmployHero_5825)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EmployHero_5825 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EmployHero_5825)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EmployHero_5825 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EmployHero_5825 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EmployHero_5825> parser() {
         return PARSER;
      }

      public Parser<S2C_EmployHero_5825> getParserForType() {
         return PARSER;
      }

      public S2C_EmployHero_5825 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EmployHero_5825OrBuilder {
         private int bitField0_;
         private List<SupportInfo> supportHero_;
         private RepeatedFieldBuilderV3<SupportInfo, SupportInfo.Builder, SupportInfoOrBuilder> supportHeroBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EmployHero_5825.class, Builder.class);
         }

         private Builder() {
            this.supportHero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.supportHero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_EmployHero_5825.alwaysUseFieldBuilders) {
               this.getSupportHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.supportHeroBuilder_ == null) {
               this.supportHero_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.supportHeroBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_EmployHero_5825_descriptor;
         }

         public S2C_EmployHero_5825 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_EmployHero_5825.getDefaultInstance();
         }

         public S2C_EmployHero_5825 build() {
            S2C_EmployHero_5825 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EmployHero_5825 buildPartial() {
            S2C_EmployHero_5825 result = new S2C_EmployHero_5825(this);
            int from_bitField0_ = this.bitField0_;
            if (this.supportHeroBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.supportHero_ = Collections.unmodifiableList(this.supportHero_);
                  this.bitField0_ &= -2;
               }

               result.supportHero_ = this.supportHero_;
            } else {
               result.supportHero_ = this.supportHeroBuilder_.build();
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
            if (other instanceof S2C_EmployHero_5825) {
               return this.mergeFrom((S2C_EmployHero_5825)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EmployHero_5825 other) {
            if (other == StoneCircleMsg.S2C_EmployHero_5825.getDefaultInstance()) {
               return this;
            } else {
               if (this.supportHeroBuilder_ == null) {
                  if (!other.supportHero_.isEmpty()) {
                     if (this.supportHero_.isEmpty()) {
                        this.supportHero_ = other.supportHero_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureSupportHeroIsMutable();
                        this.supportHero_.addAll(other.supportHero_);
                     }

                     this.onChanged();
                  }
               } else if (!other.supportHero_.isEmpty()) {
                  if (this.supportHeroBuilder_.isEmpty()) {
                     this.supportHeroBuilder_.dispose();
                     this.supportHeroBuilder_ = null;
                     this.supportHero_ = other.supportHero_;
                     this.bitField0_ &= -2;
                     this.supportHeroBuilder_ = StoneCircleMsg.S2C_EmployHero_5825.alwaysUseFieldBuilders ? this.getSupportHeroFieldBuilder() : null;
                  } else {
                     this.supportHeroBuilder_.addAllMessages(other.supportHero_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getSupportHeroCount(); ++i) {
               if (!this.getSupportHero(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EmployHero_5825 parsedMessage = null;

            try {
               parsedMessage = (S2C_EmployHero_5825)StoneCircleMsg.S2C_EmployHero_5825.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EmployHero_5825)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureSupportHeroIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.supportHero_ = new ArrayList(this.supportHero_);
               this.bitField0_ |= 1;
            }

         }

         public List<SupportInfo> getSupportHeroList() {
            return this.supportHeroBuilder_ == null ? Collections.unmodifiableList(this.supportHero_) : this.supportHeroBuilder_.getMessageList();
         }

         public int getSupportHeroCount() {
            return this.supportHeroBuilder_ == null ? this.supportHero_.size() : this.supportHeroBuilder_.getCount();
         }

         public SupportInfo getSupportHero(int index) {
            return this.supportHeroBuilder_ == null ? (SupportInfo)this.supportHero_.get(index) : (SupportInfo)this.supportHeroBuilder_.getMessage(index);
         }

         public Builder setSupportHero(int index, SupportInfo value) {
            if (this.supportHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSupportHeroIsMutable();
               this.supportHero_.set(index, value);
               this.onChanged();
            } else {
               this.supportHeroBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSupportHero(int index, SupportInfo.Builder builderForValue) {
            if (this.supportHeroBuilder_ == null) {
               this.ensureSupportHeroIsMutable();
               this.supportHero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.supportHeroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSupportHero(SupportInfo value) {
            if (this.supportHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSupportHeroIsMutable();
               this.supportHero_.add(value);
               this.onChanged();
            } else {
               this.supportHeroBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSupportHero(int index, SupportInfo value) {
            if (this.supportHeroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSupportHeroIsMutable();
               this.supportHero_.add(index, value);
               this.onChanged();
            } else {
               this.supportHeroBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSupportHero(SupportInfo.Builder builderForValue) {
            if (this.supportHeroBuilder_ == null) {
               this.ensureSupportHeroIsMutable();
               this.supportHero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.supportHeroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSupportHero(int index, SupportInfo.Builder builderForValue) {
            if (this.supportHeroBuilder_ == null) {
               this.ensureSupportHeroIsMutable();
               this.supportHero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.supportHeroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSupportHero(Iterable<? extends SupportInfo> values) {
            if (this.supportHeroBuilder_ == null) {
               this.ensureSupportHeroIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.supportHero_);
               this.onChanged();
            } else {
               this.supportHeroBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSupportHero() {
            if (this.supportHeroBuilder_ == null) {
               this.supportHero_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.supportHeroBuilder_.clear();
            }

            return this;
         }

         public Builder removeSupportHero(int index) {
            if (this.supportHeroBuilder_ == null) {
               this.ensureSupportHeroIsMutable();
               this.supportHero_.remove(index);
               this.onChanged();
            } else {
               this.supportHeroBuilder_.remove(index);
            }

            return this;
         }

         public SupportInfo.Builder getSupportHeroBuilder(int index) {
            return (SupportInfo.Builder)this.getSupportHeroFieldBuilder().getBuilder(index);
         }

         public SupportInfoOrBuilder getSupportHeroOrBuilder(int index) {
            return this.supportHeroBuilder_ == null ? (SupportInfoOrBuilder)this.supportHero_.get(index) : (SupportInfoOrBuilder)this.supportHeroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SupportInfoOrBuilder> getSupportHeroOrBuilderList() {
            return this.supportHeroBuilder_ != null ? this.supportHeroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.supportHero_);
         }

         public SupportInfo.Builder addSupportHeroBuilder() {
            return (SupportInfo.Builder)this.getSupportHeroFieldBuilder().addBuilder(StoneCircleMsg.SupportInfo.getDefaultInstance());
         }

         public SupportInfo.Builder addSupportHeroBuilder(int index) {
            return (SupportInfo.Builder)this.getSupportHeroFieldBuilder().addBuilder(index, StoneCircleMsg.SupportInfo.getDefaultInstance());
         }

         public List<SupportInfo.Builder> getSupportHeroBuilderList() {
            return this.getSupportHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SupportInfo, SupportInfo.Builder, SupportInfoOrBuilder> getSupportHeroFieldBuilder() {
            if (this.supportHeroBuilder_ == null) {
               this.supportHeroBuilder_ = new RepeatedFieldBuilderV3(this.supportHero_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.supportHero_ = null;
            }

            return this.supportHeroBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FinishCommonEvent_5826 extends GeneratedMessageV3 implements C2S_FinishCommonEvent_5826OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private MapIdentify position_;
      public static final int EVENTID_FIELD_NUMBER = 2;
      private int eventId_;
      private byte memoizedIsInitialized;
      private static final C2S_FinishCommonEvent_5826 DEFAULT_INSTANCE = new C2S_FinishCommonEvent_5826();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FinishCommonEvent_5826> PARSER = new AbstractParser<C2S_FinishCommonEvent_5826>() {
         public C2S_FinishCommonEvent_5826 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FinishCommonEvent_5826(input, extensionRegistry);
         }
      };

      private C2S_FinishCommonEvent_5826(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FinishCommonEvent_5826() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FinishCommonEvent_5826();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FinishCommonEvent_5826(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MapIdentify.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.position_.toBuilder();
                        }

                        this.position_ = (MapIdentify)input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.position_);
                           this.position_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eventId_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FinishCommonEvent_5826.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public MapIdentify getPosition() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public MapIdentifyOrBuilder getPositionOrBuilder() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public boolean hasEventId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventId() {
         return this.eventId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPosition().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getPosition());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eventId_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getPosition());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eventId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FinishCommonEvent_5826)) {
            return super.equals(obj);
         } else {
            C2S_FinishCommonEvent_5826 other = (C2S_FinishCommonEvent_5826)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
               return false;
            } else if (this.hasEventId() != other.hasEventId()) {
               return false;
            } else if (this.hasEventId() && this.getEventId() != other.getEventId()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition().hashCode();
            }

            if (this.hasEventId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FinishCommonEvent_5826)PARSER.parseFrom(data);
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinishCommonEvent_5826)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FinishCommonEvent_5826)PARSER.parseFrom(data);
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinishCommonEvent_5826)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FinishCommonEvent_5826)PARSER.parseFrom(data);
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FinishCommonEvent_5826)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(InputStream input) throws IOException {
         return (C2S_FinishCommonEvent_5826)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinishCommonEvent_5826)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FinishCommonEvent_5826 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FinishCommonEvent_5826)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FinishCommonEvent_5826 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinishCommonEvent_5826)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FinishCommonEvent_5826)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FinishCommonEvent_5826 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FinishCommonEvent_5826)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FinishCommonEvent_5826 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FinishCommonEvent_5826 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FinishCommonEvent_5826> parser() {
         return PARSER;
      }

      public Parser<C2S_FinishCommonEvent_5826> getParserForType() {
         return PARSER;
      }

      public C2S_FinishCommonEvent_5826 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FinishCommonEvent_5826OrBuilder {
         private int bitField0_;
         private MapIdentify position_;
         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> positionBuilder_;
         private int eventId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FinishCommonEvent_5826.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_FinishCommonEvent_5826.alwaysUseFieldBuilders) {
               this.getPositionFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.positionBuilder_ == null) {
               this.position_ = null;
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.eventId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_FinishCommonEvent_5826_descriptor;
         }

         public C2S_FinishCommonEvent_5826 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_FinishCommonEvent_5826.getDefaultInstance();
         }

         public C2S_FinishCommonEvent_5826 build() {
            C2S_FinishCommonEvent_5826 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FinishCommonEvent_5826 buildPartial() {
            C2S_FinishCommonEvent_5826 result = new C2S_FinishCommonEvent_5826(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.positionBuilder_ == null) {
                  result.position_ = this.position_;
               } else {
                  result.position_ = (MapIdentify)this.positionBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventId_ = this.eventId_;
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
            if (other instanceof C2S_FinishCommonEvent_5826) {
               return this.mergeFrom((C2S_FinishCommonEvent_5826)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FinishCommonEvent_5826 other) {
            if (other == StoneCircleMsg.C2S_FinishCommonEvent_5826.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.mergePosition(other.getPosition());
               }

               if (other.hasEventId()) {
                  this.setEventId(other.getEventId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasEventId()) {
               return false;
            } else {
               return this.getPosition().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FinishCommonEvent_5826 parsedMessage = null;

            try {
               parsedMessage = (C2S_FinishCommonEvent_5826)StoneCircleMsg.C2S_FinishCommonEvent_5826.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FinishCommonEvent_5826)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public MapIdentify getPosition() {
            if (this.positionBuilder_ == null) {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            } else {
               return (MapIdentify)this.positionBuilder_.getMessage();
            }
         }

         public Builder setPosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.position_ = value;
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPosition(MapIdentify.Builder builderForValue) {
            if (this.positionBuilder_ == null) {
               this.position_ = builderForValue.build();
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != StoneCircleMsg.MapIdentify.getDefaultInstance()) {
                  this.position_ = StoneCircleMsg.MapIdentify.newBuilder(this.position_).mergeFrom(value).buildPartial();
               } else {
                  this.position_ = value;
               }

               this.onChanged();
            } else {
               this.positionBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPosition() {
            if (this.positionBuilder_ == null) {
               this.position_ = null;
               this.onChanged();
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MapIdentify.Builder getPositionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MapIdentify.Builder)this.getPositionFieldBuilder().getBuilder();
         }

         public MapIdentifyOrBuilder getPositionOrBuilder() {
            if (this.positionBuilder_ != null) {
               return (MapIdentifyOrBuilder)this.positionBuilder_.getMessageOrBuilder();
            } else {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            }
         }

         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getPositionFieldBuilder() {
            if (this.positionBuilder_ == null) {
               this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
               this.position_ = null;
            }

            return this.positionBuilder_;
         }

         public boolean hasEventId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventId() {
            return this.eventId_;
         }

         public Builder setEventId(int value) {
            this.bitField0_ |= 2;
            this.eventId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.bitField0_ &= -3;
            this.eventId_ = 0;
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

   public static final class S2C_FinishCommonEvent_5827 extends GeneratedMessageV3 implements S2C_FinishCommonEvent_5827OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COMMONEVENT_FIELD_NUMBER = 1;
      private EventInfo commonEvent_;
      private byte memoizedIsInitialized;
      private static final S2C_FinishCommonEvent_5827 DEFAULT_INSTANCE = new S2C_FinishCommonEvent_5827();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FinishCommonEvent_5827> PARSER = new AbstractParser<S2C_FinishCommonEvent_5827>() {
         public S2C_FinishCommonEvent_5827 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FinishCommonEvent_5827(input, extensionRegistry);
         }
      };

      private S2C_FinishCommonEvent_5827(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FinishCommonEvent_5827() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FinishCommonEvent_5827();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FinishCommonEvent_5827(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        EventInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.commonEvent_.toBuilder();
                        }

                        this.commonEvent_ = (EventInfo)input.readMessage(StoneCircleMsg.EventInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.commonEvent_);
                           this.commonEvent_ = subBuilder.buildPartial();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FinishCommonEvent_5827.class, Builder.class);
      }

      public boolean hasCommonEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public EventInfo getCommonEvent() {
         return this.commonEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.commonEvent_;
      }

      public EventInfoOrBuilder getCommonEventOrBuilder() {
         return this.commonEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.commonEvent_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCommonEvent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getCommonEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getCommonEvent());
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
               size += CodedOutputStream.computeMessageSize(1, this.getCommonEvent());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FinishCommonEvent_5827)) {
            return super.equals(obj);
         } else {
            S2C_FinishCommonEvent_5827 other = (S2C_FinishCommonEvent_5827)obj;
            if (this.hasCommonEvent() != other.hasCommonEvent()) {
               return false;
            } else if (this.hasCommonEvent() && !this.getCommonEvent().equals(other.getCommonEvent())) {
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
            if (this.hasCommonEvent()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCommonEvent().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FinishCommonEvent_5827)PARSER.parseFrom(data);
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinishCommonEvent_5827)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FinishCommonEvent_5827)PARSER.parseFrom(data);
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinishCommonEvent_5827)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FinishCommonEvent_5827)PARSER.parseFrom(data);
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FinishCommonEvent_5827)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(InputStream input) throws IOException {
         return (S2C_FinishCommonEvent_5827)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinishCommonEvent_5827)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FinishCommonEvent_5827 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FinishCommonEvent_5827)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FinishCommonEvent_5827 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinishCommonEvent_5827)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FinishCommonEvent_5827)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FinishCommonEvent_5827 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FinishCommonEvent_5827)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FinishCommonEvent_5827 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FinishCommonEvent_5827 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FinishCommonEvent_5827> parser() {
         return PARSER;
      }

      public Parser<S2C_FinishCommonEvent_5827> getParserForType() {
         return PARSER;
      }

      public S2C_FinishCommonEvent_5827 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FinishCommonEvent_5827OrBuilder {
         private int bitField0_;
         private EventInfo commonEvent_;
         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> commonEventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FinishCommonEvent_5827.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_FinishCommonEvent_5827.alwaysUseFieldBuilders) {
               this.getCommonEventFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.commonEventBuilder_ == null) {
               this.commonEvent_ = null;
            } else {
               this.commonEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_FinishCommonEvent_5827_descriptor;
         }

         public S2C_FinishCommonEvent_5827 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_FinishCommonEvent_5827.getDefaultInstance();
         }

         public S2C_FinishCommonEvent_5827 build() {
            S2C_FinishCommonEvent_5827 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FinishCommonEvent_5827 buildPartial() {
            S2C_FinishCommonEvent_5827 result = new S2C_FinishCommonEvent_5827(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.commonEventBuilder_ == null) {
                  result.commonEvent_ = this.commonEvent_;
               } else {
                  result.commonEvent_ = (EventInfo)this.commonEventBuilder_.build();
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
            if (other instanceof S2C_FinishCommonEvent_5827) {
               return this.mergeFrom((S2C_FinishCommonEvent_5827)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FinishCommonEvent_5827 other) {
            if (other == StoneCircleMsg.S2C_FinishCommonEvent_5827.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCommonEvent()) {
                  this.mergeCommonEvent(other.getCommonEvent());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCommonEvent()) {
               return false;
            } else {
               return this.getCommonEvent().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FinishCommonEvent_5827 parsedMessage = null;

            try {
               parsedMessage = (S2C_FinishCommonEvent_5827)StoneCircleMsg.S2C_FinishCommonEvent_5827.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FinishCommonEvent_5827)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCommonEvent() {
            return (this.bitField0_ & 1) != 0;
         }

         public EventInfo getCommonEvent() {
            if (this.commonEventBuilder_ == null) {
               return this.commonEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.commonEvent_;
            } else {
               return (EventInfo)this.commonEventBuilder_.getMessage();
            }
         }

         public Builder setCommonEvent(EventInfo value) {
            if (this.commonEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.commonEvent_ = value;
               this.onChanged();
            } else {
               this.commonEventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setCommonEvent(EventInfo.Builder builderForValue) {
            if (this.commonEventBuilder_ == null) {
               this.commonEvent_ = builderForValue.build();
               this.onChanged();
            } else {
               this.commonEventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeCommonEvent(EventInfo value) {
            if (this.commonEventBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.commonEvent_ != null && this.commonEvent_ != StoneCircleMsg.EventInfo.getDefaultInstance()) {
                  this.commonEvent_ = StoneCircleMsg.EventInfo.newBuilder(this.commonEvent_).mergeFrom(value).buildPartial();
               } else {
                  this.commonEvent_ = value;
               }

               this.onChanged();
            } else {
               this.commonEventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearCommonEvent() {
            if (this.commonEventBuilder_ == null) {
               this.commonEvent_ = null;
               this.onChanged();
            } else {
               this.commonEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public EventInfo.Builder getCommonEventBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (EventInfo.Builder)this.getCommonEventFieldBuilder().getBuilder();
         }

         public EventInfoOrBuilder getCommonEventOrBuilder() {
            if (this.commonEventBuilder_ != null) {
               return (EventInfoOrBuilder)this.commonEventBuilder_.getMessageOrBuilder();
            } else {
               return this.commonEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.commonEvent_;
            }
         }

         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> getCommonEventFieldBuilder() {
            if (this.commonEventBuilder_ == null) {
               this.commonEventBuilder_ = new SingleFieldBuilderV3(this.getCommonEvent(), this.getParentForChildren(), this.isClean());
               this.commonEvent_ = null;
            }

            return this.commonEventBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SupportHero_5828 extends GeneratedMessageV3 implements C2S_SupportHero_5828OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_SupportHero_5828 DEFAULT_INSTANCE = new C2S_SupportHero_5828();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SupportHero_5828> PARSER = new AbstractParser<C2S_SupportHero_5828>() {
         public C2S_SupportHero_5828 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SupportHero_5828(input, extensionRegistry);
         }
      };

      private C2S_SupportHero_5828(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SupportHero_5828() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SupportHero_5828();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SupportHero_5828(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 1;
                        this.heroCode_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SupportHero_5828.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SupportHero_5828)) {
            return super.equals(obj);
         } else {
            C2S_SupportHero_5828 other = (C2S_SupportHero_5828)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SupportHero_5828 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SupportHero_5828)PARSER.parseFrom(data);
      }

      public static C2S_SupportHero_5828 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SupportHero_5828)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SupportHero_5828 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SupportHero_5828)PARSER.parseFrom(data);
      }

      public static C2S_SupportHero_5828 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SupportHero_5828)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SupportHero_5828 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SupportHero_5828)PARSER.parseFrom(data);
      }

      public static C2S_SupportHero_5828 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SupportHero_5828)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SupportHero_5828 parseFrom(InputStream input) throws IOException {
         return (C2S_SupportHero_5828)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SupportHero_5828 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SupportHero_5828)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SupportHero_5828 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SupportHero_5828)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SupportHero_5828 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SupportHero_5828)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SupportHero_5828 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SupportHero_5828)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SupportHero_5828 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SupportHero_5828)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SupportHero_5828 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SupportHero_5828 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SupportHero_5828> parser() {
         return PARSER;
      }

      public Parser<C2S_SupportHero_5828> getParserForType() {
         return PARSER;
      }

      public C2S_SupportHero_5828 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SupportHero_5828OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SupportHero_5828.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_SupportHero_5828.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_SupportHero_5828_descriptor;
         }

         public C2S_SupportHero_5828 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_SupportHero_5828.getDefaultInstance();
         }

         public C2S_SupportHero_5828 build() {
            C2S_SupportHero_5828 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SupportHero_5828 buildPartial() {
            C2S_SupportHero_5828 result = new C2S_SupportHero_5828(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_SupportHero_5828) {
               return this.mergeFrom((C2S_SupportHero_5828)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SupportHero_5828 other) {
            if (other == StoneCircleMsg.C2S_SupportHero_5828.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SupportHero_5828 parsedMessage = null;

            try {
               parsedMessage = (C2S_SupportHero_5828)StoneCircleMsg.C2S_SupportHero_5828.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SupportHero_5828)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 1;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
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

   public static final class S2C_SupportHero_5829 extends GeneratedMessageV3 implements S2C_SupportHero_5829OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SUPPORTHERO_FIELD_NUMBER = 1;
      private Internal.IntList supportHero_;
      private byte memoizedIsInitialized;
      private static final S2C_SupportHero_5829 DEFAULT_INSTANCE = new S2C_SupportHero_5829();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SupportHero_5829> PARSER = new AbstractParser<S2C_SupportHero_5829>() {
         public S2C_SupportHero_5829 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SupportHero_5829(input, extensionRegistry);
         }
      };

      private S2C_SupportHero_5829(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SupportHero_5829() {
         this.memoizedIsInitialized = -1;
         this.supportHero_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SupportHero_5829();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SupportHero_5829(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.supportHero_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.supportHero_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.supportHero_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.supportHero_.addInt(input.readInt32());
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
                  this.supportHero_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SupportHero_5829.class, Builder.class);
      }

      public List<Integer> getSupportHeroList() {
         return this.supportHero_;
      }

      public int getSupportHeroCount() {
         return this.supportHero_.size();
      }

      public int getSupportHero(int index) {
         return this.supportHero_.getInt(index);
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
         for(int i = 0; i < this.supportHero_.size(); ++i) {
            output.writeInt32(1, this.supportHero_.getInt(i));
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

            for(int i = 0; i < this.supportHero_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.supportHero_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSupportHeroList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SupportHero_5829)) {
            return super.equals(obj);
         } else {
            S2C_SupportHero_5829 other = (S2C_SupportHero_5829)obj;
            if (!this.getSupportHeroList().equals(other.getSupportHeroList())) {
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
            if (this.getSupportHeroCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSupportHeroList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SupportHero_5829 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SupportHero_5829)PARSER.parseFrom(data);
      }

      public static S2C_SupportHero_5829 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SupportHero_5829)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SupportHero_5829 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SupportHero_5829)PARSER.parseFrom(data);
      }

      public static S2C_SupportHero_5829 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SupportHero_5829)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SupportHero_5829 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SupportHero_5829)PARSER.parseFrom(data);
      }

      public static S2C_SupportHero_5829 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SupportHero_5829)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SupportHero_5829 parseFrom(InputStream input) throws IOException {
         return (S2C_SupportHero_5829)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SupportHero_5829 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SupportHero_5829)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SupportHero_5829 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SupportHero_5829)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SupportHero_5829 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SupportHero_5829)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SupportHero_5829 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SupportHero_5829)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SupportHero_5829 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SupportHero_5829)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SupportHero_5829 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SupportHero_5829 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SupportHero_5829> parser() {
         return PARSER;
      }

      public Parser<S2C_SupportHero_5829> getParserForType() {
         return PARSER;
      }

      public S2C_SupportHero_5829 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SupportHero_5829OrBuilder {
         private int bitField0_;
         private Internal.IntList supportHero_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SupportHero_5829.class, Builder.class);
         }

         private Builder() {
            this.supportHero_ = StoneCircleMsg.S2C_SupportHero_5829.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.supportHero_ = StoneCircleMsg.S2C_SupportHero_5829.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_SupportHero_5829.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.supportHero_ = StoneCircleMsg.S2C_SupportHero_5829.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_SupportHero_5829_descriptor;
         }

         public S2C_SupportHero_5829 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_SupportHero_5829.getDefaultInstance();
         }

         public S2C_SupportHero_5829 build() {
            S2C_SupportHero_5829 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SupportHero_5829 buildPartial() {
            S2C_SupportHero_5829 result = new S2C_SupportHero_5829(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.supportHero_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.supportHero_ = this.supportHero_;
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
            if (other instanceof S2C_SupportHero_5829) {
               return this.mergeFrom((S2C_SupportHero_5829)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SupportHero_5829 other) {
            if (other == StoneCircleMsg.S2C_SupportHero_5829.getDefaultInstance()) {
               return this;
            } else {
               if (!other.supportHero_.isEmpty()) {
                  if (this.supportHero_.isEmpty()) {
                     this.supportHero_ = other.supportHero_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureSupportHeroIsMutable();
                     this.supportHero_.addAll(other.supportHero_);
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
            S2C_SupportHero_5829 parsedMessage = null;

            try {
               parsedMessage = (S2C_SupportHero_5829)StoneCircleMsg.S2C_SupportHero_5829.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SupportHero_5829)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureSupportHeroIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.supportHero_ = StoneCircleMsg.S2C_SupportHero_5829.mutableCopy(this.supportHero_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getSupportHeroList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.supportHero_) : this.supportHero_);
         }

         public int getSupportHeroCount() {
            return this.supportHero_.size();
         }

         public int getSupportHero(int index) {
            return this.supportHero_.getInt(index);
         }

         public Builder setSupportHero(int index, int value) {
            this.ensureSupportHeroIsMutable();
            this.supportHero_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSupportHero(int value) {
            this.ensureSupportHeroIsMutable();
            this.supportHero_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSupportHero(Iterable<? extends Integer> values) {
            this.ensureSupportHeroIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.supportHero_);
            this.onChanged();
            return this;
         }

         public Builder clearSupportHero() {
            this.supportHero_ = StoneCircleMsg.S2C_SupportHero_5829.emptyIntList();
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

   public static final class C2S_LeaveEvent_5830 extends GeneratedMessageV3 implements C2S_LeaveEvent_5830OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POSITION_FIELD_NUMBER = 1;
      private MapIdentify position_;
      public static final int EVENTID_FIELD_NUMBER = 2;
      private int eventId_;
      private byte memoizedIsInitialized;
      private static final C2S_LeaveEvent_5830 DEFAULT_INSTANCE = new C2S_LeaveEvent_5830();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LeaveEvent_5830> PARSER = new AbstractParser<C2S_LeaveEvent_5830>() {
         public C2S_LeaveEvent_5830 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LeaveEvent_5830(input, extensionRegistry);
         }
      };

      private C2S_LeaveEvent_5830(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LeaveEvent_5830() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LeaveEvent_5830();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LeaveEvent_5830(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        MapIdentify.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.position_.toBuilder();
                        }

                        this.position_ = (MapIdentify)input.readMessage(StoneCircleMsg.MapIdentify.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.position_);
                           this.position_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eventId_ = input.readInt32();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LeaveEvent_5830.class, Builder.class);
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 1) != 0;
      }

      public MapIdentify getPosition() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public MapIdentifyOrBuilder getPositionOrBuilder() {
         return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
      }

      public boolean hasEventId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventId() {
         return this.eventId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPosition().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getPosition());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eventId_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getPosition());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eventId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LeaveEvent_5830)) {
            return super.equals(obj);
         } else {
            C2S_LeaveEvent_5830 other = (C2S_LeaveEvent_5830)obj;
            if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && !this.getPosition().equals(other.getPosition())) {
               return false;
            } else if (this.hasEventId() != other.hasEventId()) {
               return false;
            } else if (this.hasEventId() && this.getEventId() != other.getEventId()) {
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
            if (this.hasPosition()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPosition().hashCode();
            }

            if (this.hasEventId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LeaveEvent_5830 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LeaveEvent_5830)PARSER.parseFrom(data);
      }

      public static C2S_LeaveEvent_5830 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LeaveEvent_5830)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LeaveEvent_5830 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LeaveEvent_5830)PARSER.parseFrom(data);
      }

      public static C2S_LeaveEvent_5830 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LeaveEvent_5830)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LeaveEvent_5830 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LeaveEvent_5830)PARSER.parseFrom(data);
      }

      public static C2S_LeaveEvent_5830 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LeaveEvent_5830)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LeaveEvent_5830 parseFrom(InputStream input) throws IOException {
         return (C2S_LeaveEvent_5830)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LeaveEvent_5830 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LeaveEvent_5830)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LeaveEvent_5830 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LeaveEvent_5830)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LeaveEvent_5830 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LeaveEvent_5830)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LeaveEvent_5830 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LeaveEvent_5830)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LeaveEvent_5830 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LeaveEvent_5830)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LeaveEvent_5830 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LeaveEvent_5830 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LeaveEvent_5830> parser() {
         return PARSER;
      }

      public Parser<C2S_LeaveEvent_5830> getParserForType() {
         return PARSER;
      }

      public C2S_LeaveEvent_5830 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LeaveEvent_5830OrBuilder {
         private int bitField0_;
         private MapIdentify position_;
         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> positionBuilder_;
         private int eventId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LeaveEvent_5830.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.C2S_LeaveEvent_5830.alwaysUseFieldBuilders) {
               this.getPositionFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.positionBuilder_ == null) {
               this.position_ = null;
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.eventId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_C2S_LeaveEvent_5830_descriptor;
         }

         public C2S_LeaveEvent_5830 getDefaultInstanceForType() {
            return StoneCircleMsg.C2S_LeaveEvent_5830.getDefaultInstance();
         }

         public C2S_LeaveEvent_5830 build() {
            C2S_LeaveEvent_5830 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LeaveEvent_5830 buildPartial() {
            C2S_LeaveEvent_5830 result = new C2S_LeaveEvent_5830(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.positionBuilder_ == null) {
                  result.position_ = this.position_;
               } else {
                  result.position_ = (MapIdentify)this.positionBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventId_ = this.eventId_;
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
            if (other instanceof C2S_LeaveEvent_5830) {
               return this.mergeFrom((C2S_LeaveEvent_5830)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LeaveEvent_5830 other) {
            if (other == StoneCircleMsg.C2S_LeaveEvent_5830.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPosition()) {
                  this.mergePosition(other.getPosition());
               }

               if (other.hasEventId()) {
                  this.setEventId(other.getEventId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPosition()) {
               return false;
            } else if (!this.hasEventId()) {
               return false;
            } else {
               return this.getPosition().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LeaveEvent_5830 parsedMessage = null;

            try {
               parsedMessage = (C2S_LeaveEvent_5830)StoneCircleMsg.C2S_LeaveEvent_5830.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LeaveEvent_5830)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
         }

         public MapIdentify getPosition() {
            if (this.positionBuilder_ == null) {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            } else {
               return (MapIdentify)this.positionBuilder_.getMessage();
            }
         }

         public Builder setPosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.position_ = value;
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPosition(MapIdentify.Builder builderForValue) {
            if (this.positionBuilder_ == null) {
               this.position_ = builderForValue.build();
               this.onChanged();
            } else {
               this.positionBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePosition(MapIdentify value) {
            if (this.positionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.position_ != null && this.position_ != StoneCircleMsg.MapIdentify.getDefaultInstance()) {
                  this.position_ = StoneCircleMsg.MapIdentify.newBuilder(this.position_).mergeFrom(value).buildPartial();
               } else {
                  this.position_ = value;
               }

               this.onChanged();
            } else {
               this.positionBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPosition() {
            if (this.positionBuilder_ == null) {
               this.position_ = null;
               this.onChanged();
            } else {
               this.positionBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public MapIdentify.Builder getPositionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MapIdentify.Builder)this.getPositionFieldBuilder().getBuilder();
         }

         public MapIdentifyOrBuilder getPositionOrBuilder() {
            if (this.positionBuilder_ != null) {
               return (MapIdentifyOrBuilder)this.positionBuilder_.getMessageOrBuilder();
            } else {
               return this.position_ == null ? StoneCircleMsg.MapIdentify.getDefaultInstance() : this.position_;
            }
         }

         private SingleFieldBuilderV3<MapIdentify, MapIdentify.Builder, MapIdentifyOrBuilder> getPositionFieldBuilder() {
            if (this.positionBuilder_ == null) {
               this.positionBuilder_ = new SingleFieldBuilderV3(this.getPosition(), this.getParentForChildren(), this.isClean());
               this.position_ = null;
            }

            return this.positionBuilder_;
         }

         public boolean hasEventId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventId() {
            return this.eventId_;
         }

         public Builder setEventId(int value) {
            this.bitField0_ |= 2;
            this.eventId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.bitField0_ &= -3;
            this.eventId_ = 0;
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

   public static final class S2C_LeaveEvent_5831 extends GeneratedMessageV3 implements S2C_LeaveEvent_5831OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEAVEEVENT_FIELD_NUMBER = 1;
      private EventInfo leaveEvent_;
      private byte memoizedIsInitialized;
      private static final S2C_LeaveEvent_5831 DEFAULT_INSTANCE = new S2C_LeaveEvent_5831();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LeaveEvent_5831> PARSER = new AbstractParser<S2C_LeaveEvent_5831>() {
         public S2C_LeaveEvent_5831 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LeaveEvent_5831(input, extensionRegistry);
         }
      };

      private S2C_LeaveEvent_5831(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LeaveEvent_5831() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LeaveEvent_5831();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LeaveEvent_5831(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        EventInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.leaveEvent_.toBuilder();
                        }

                        this.leaveEvent_ = (EventInfo)input.readMessage(StoneCircleMsg.EventInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.leaveEvent_);
                           this.leaveEvent_ = subBuilder.buildPartial();
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
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LeaveEvent_5831.class, Builder.class);
      }

      public boolean hasLeaveEvent() {
         return (this.bitField0_ & 1) != 0;
      }

      public EventInfo getLeaveEvent() {
         return this.leaveEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.leaveEvent_;
      }

      public EventInfoOrBuilder getLeaveEventOrBuilder() {
         return this.leaveEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.leaveEvent_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLeaveEvent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getLeaveEvent().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getLeaveEvent());
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
               size += CodedOutputStream.computeMessageSize(1, this.getLeaveEvent());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LeaveEvent_5831)) {
            return super.equals(obj);
         } else {
            S2C_LeaveEvent_5831 other = (S2C_LeaveEvent_5831)obj;
            if (this.hasLeaveEvent() != other.hasLeaveEvent()) {
               return false;
            } else if (this.hasLeaveEvent() && !this.getLeaveEvent().equals(other.getLeaveEvent())) {
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
            if (this.hasLeaveEvent()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLeaveEvent().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LeaveEvent_5831 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LeaveEvent_5831)PARSER.parseFrom(data);
      }

      public static S2C_LeaveEvent_5831 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LeaveEvent_5831)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LeaveEvent_5831 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LeaveEvent_5831)PARSER.parseFrom(data);
      }

      public static S2C_LeaveEvent_5831 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LeaveEvent_5831)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LeaveEvent_5831 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LeaveEvent_5831)PARSER.parseFrom(data);
      }

      public static S2C_LeaveEvent_5831 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LeaveEvent_5831)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LeaveEvent_5831 parseFrom(InputStream input) throws IOException {
         return (S2C_LeaveEvent_5831)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LeaveEvent_5831 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LeaveEvent_5831)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LeaveEvent_5831 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LeaveEvent_5831)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LeaveEvent_5831 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LeaveEvent_5831)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LeaveEvent_5831 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LeaveEvent_5831)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LeaveEvent_5831 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LeaveEvent_5831)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LeaveEvent_5831 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LeaveEvent_5831 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LeaveEvent_5831> parser() {
         return PARSER;
      }

      public Parser<S2C_LeaveEvent_5831> getParserForType() {
         return PARSER;
      }

      public S2C_LeaveEvent_5831 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LeaveEvent_5831OrBuilder {
         private int bitField0_;
         private EventInfo leaveEvent_;
         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> leaveEventBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LeaveEvent_5831.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (StoneCircleMsg.S2C_LeaveEvent_5831.alwaysUseFieldBuilders) {
               this.getLeaveEventFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.leaveEventBuilder_ == null) {
               this.leaveEvent_ = null;
            } else {
               this.leaveEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return StoneCircleMsg.internal_static_stonecircle_com_gzbz_protobuf_S2C_LeaveEvent_5831_descriptor;
         }

         public S2C_LeaveEvent_5831 getDefaultInstanceForType() {
            return StoneCircleMsg.S2C_LeaveEvent_5831.getDefaultInstance();
         }

         public S2C_LeaveEvent_5831 build() {
            S2C_LeaveEvent_5831 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LeaveEvent_5831 buildPartial() {
            S2C_LeaveEvent_5831 result = new S2C_LeaveEvent_5831(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.leaveEventBuilder_ == null) {
                  result.leaveEvent_ = this.leaveEvent_;
               } else {
                  result.leaveEvent_ = (EventInfo)this.leaveEventBuilder_.build();
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
            if (other instanceof S2C_LeaveEvent_5831) {
               return this.mergeFrom((S2C_LeaveEvent_5831)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LeaveEvent_5831 other) {
            if (other == StoneCircleMsg.S2C_LeaveEvent_5831.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLeaveEvent()) {
                  this.mergeLeaveEvent(other.getLeaveEvent());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLeaveEvent()) {
               return false;
            } else {
               return this.getLeaveEvent().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LeaveEvent_5831 parsedMessage = null;

            try {
               parsedMessage = (S2C_LeaveEvent_5831)StoneCircleMsg.S2C_LeaveEvent_5831.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LeaveEvent_5831)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLeaveEvent() {
            return (this.bitField0_ & 1) != 0;
         }

         public EventInfo getLeaveEvent() {
            if (this.leaveEventBuilder_ == null) {
               return this.leaveEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.leaveEvent_;
            } else {
               return (EventInfo)this.leaveEventBuilder_.getMessage();
            }
         }

         public Builder setLeaveEvent(EventInfo value) {
            if (this.leaveEventBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.leaveEvent_ = value;
               this.onChanged();
            } else {
               this.leaveEventBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setLeaveEvent(EventInfo.Builder builderForValue) {
            if (this.leaveEventBuilder_ == null) {
               this.leaveEvent_ = builderForValue.build();
               this.onChanged();
            } else {
               this.leaveEventBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeLeaveEvent(EventInfo value) {
            if (this.leaveEventBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.leaveEvent_ != null && this.leaveEvent_ != StoneCircleMsg.EventInfo.getDefaultInstance()) {
                  this.leaveEvent_ = StoneCircleMsg.EventInfo.newBuilder(this.leaveEvent_).mergeFrom(value).buildPartial();
               } else {
                  this.leaveEvent_ = value;
               }

               this.onChanged();
            } else {
               this.leaveEventBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearLeaveEvent() {
            if (this.leaveEventBuilder_ == null) {
               this.leaveEvent_ = null;
               this.onChanged();
            } else {
               this.leaveEventBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public EventInfo.Builder getLeaveEventBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (EventInfo.Builder)this.getLeaveEventFieldBuilder().getBuilder();
         }

         public EventInfoOrBuilder getLeaveEventOrBuilder() {
            if (this.leaveEventBuilder_ != null) {
               return (EventInfoOrBuilder)this.leaveEventBuilder_.getMessageOrBuilder();
            } else {
               return this.leaveEvent_ == null ? StoneCircleMsg.EventInfo.getDefaultInstance() : this.leaveEvent_;
            }
         }

         private SingleFieldBuilderV3<EventInfo, EventInfo.Builder, EventInfoOrBuilder> getLeaveEventFieldBuilder() {
            if (this.leaveEventBuilder_ == null) {
               this.leaveEventBuilder_ = new SingleFieldBuilderV3(this.getLeaveEvent(), this.getParentForChildren(), this.isClean());
               this.leaveEvent_ = null;
            }

            return this.leaveEventBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface ArrayingOrBuilder extends MessageOrBuilder {
      boolean hasEmployInfo();

      EmployInfo getEmployInfo();

      EmployInfoOrBuilder getEmployInfoOrBuilder();

      boolean hasPosition();

      int getPosition();
   }

   public interface C2S_BattleEvent_5805OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      MapIdentify getPosition();

      MapIdentifyOrBuilder getPositionOrBuilder();

      boolean hasEventId();

      int getEventId();
   }

   public interface C2S_EmployHero_5824OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_EnterSpecialEvent_5815OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ExtraArraying_5821OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FinishCommonEvent_5826OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      MapIdentify getPosition();

      MapIdentifyOrBuilder getPositionOrBuilder();

      boolean hasEventId();

      int getEventId();
   }

   public interface C2S_LeaveEvent_5830OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      MapIdentify getPosition();

      MapIdentifyOrBuilder getPositionOrBuilder();

      boolean hasEventId();

      int getEventId();
   }

   public interface C2S_LightMap_5817OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      MapIdentify getPosition();

      MapIdentifyOrBuilder getPositionOrBuilder();

      List<MapIdentify> getLightList();

      MapIdentify getLight(int index);

      int getLightCount();

      List<? extends MapIdentifyOrBuilder> getLightOrBuilderList();

      MapIdentifyOrBuilder getLightOrBuilder(int index);
   }

   public interface C2S_RecoverEvent_5811OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      MapIdentify getPosition();

      MapIdentifyOrBuilder getPositionOrBuilder();

      boolean hasEventId();

      int getEventId();
   }

   public interface C2S_RefreshSupport_5809OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SaveArraying_5819OrBuilder extends MessageOrBuilder {
      List<ExtraArraying> getExtraHeroList();

      ExtraArraying getExtraHero(int index);

      int getExtraHeroCount();

      List<? extends ExtraArrayingOrBuilder> getExtraHeroOrBuilderList();

      ExtraArrayingOrBuilder getExtraHeroOrBuilder(int index);
   }

   public interface C2S_ShopEvent_5813OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      MapIdentify getPosition();

      MapIdentifyOrBuilder getPositionOrBuilder();

      boolean hasEventId();

      int getEventId();

      boolean hasShopInx();

      int getShopInx();
   }

   public interface C2S_StoneCircleInfo_5801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_StoneMapInfo_5803OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SupportHero_5828OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_TpEvent_5807OrBuilder extends MessageOrBuilder {
      boolean hasEventId();

      int getEventId();
   }

   public interface EmployInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasHp();

      float getHp();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();
   }

   public interface EventInfoOrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      MapIdentify getPosition();

      MapIdentifyOrBuilder getPositionOrBuilder();

      boolean hasEventId();

      int getEventId();

      boolean hasEventType();

      int getEventType();

      List<ShopGoods> getGoodsList();

      ShopGoods getGoods(int index);

      int getGoodsCount();

      List<? extends ShopGoodsOrBuilder> getGoodsOrBuilderList();

      ShopGoodsOrBuilder getGoodsOrBuilder(int index);

      boolean hasEnd();

      boolean getEnd();
   }

   public interface ExtraArrayingOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      int getPosition();
   }

   public interface HpDataOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasHp();

      float getHp();
   }

   public interface MapIdentifyOrBuilder extends MessageOrBuilder {
      boolean hasMapGrid();

      int getMapGrid();

      boolean hasMapCell();

      int getMapCell();
   }

   public interface S2C_BattleEvent_5806OrBuilder extends MessageOrBuilder {
      boolean hasMapEvent();

      EventInfo getMapEvent();

      EventInfoOrBuilder getMapEventOrBuilder();
   }

   public interface S2C_EmployHero_5825OrBuilder extends MessageOrBuilder {
      List<SupportInfo> getSupportHeroList();

      SupportInfo getSupportHero(int index);

      int getSupportHeroCount();

      List<? extends SupportInfoOrBuilder> getSupportHeroOrBuilderList();

      SupportInfoOrBuilder getSupportHeroOrBuilder(int index);
   }

   public interface S2C_EnterSpecialEvent_5816OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ExtraArraying_5822OrBuilder extends MessageOrBuilder {
      List<Arraying> getArrayingList();

      Arraying getArraying(int index);

      int getArrayingCount();

      List<? extends ArrayingOrBuilder> getArrayingOrBuilderList();

      ArrayingOrBuilder getArrayingOrBuilder(int index);
   }

   public interface S2C_FinishCommonEvent_5827OrBuilder extends MessageOrBuilder {
      boolean hasCommonEvent();

      EventInfo getCommonEvent();

      EventInfoOrBuilder getCommonEventOrBuilder();
   }

   public interface S2C_LeaveEvent_5831OrBuilder extends MessageOrBuilder {
      boolean hasLeaveEvent();

      EventInfo getLeaveEvent();

      EventInfoOrBuilder getLeaveEventOrBuilder();
   }

   public interface S2C_LightMap_5818OrBuilder extends MessageOrBuilder {
      boolean hasPosition();

      MapIdentify getPosition();

      MapIdentifyOrBuilder getPositionOrBuilder();

      List<MapIdentify> getLightList();

      MapIdentify getLight(int index);

      int getLightCount();

      List<? extends MapIdentifyOrBuilder> getLightOrBuilderList();

      MapIdentifyOrBuilder getLightOrBuilder(int index);
   }

   public interface S2C_RecoverEvent_5812OrBuilder extends MessageOrBuilder {
      boolean hasMapEvent();

      EventInfo getMapEvent();

      EventInfoOrBuilder getMapEventOrBuilder();

      List<HpData> getHeroHpList();

      HpData getHeroHp(int index);

      int getHeroHpCount();

      List<? extends HpDataOrBuilder> getHeroHpOrBuilderList();

      HpDataOrBuilder getHeroHpOrBuilder(int index);

      List<EmployInfo> getEmployInfoList();

      EmployInfo getEmployInfo(int index);

      int getEmployInfoCount();

      List<? extends EmployInfoOrBuilder> getEmployInfoOrBuilderList();

      EmployInfoOrBuilder getEmployInfoOrBuilder(int index);
   }

   public interface S2C_RefreshSupport_5810OrBuilder extends MessageOrBuilder {
      List<SupportInfo> getSupportInfoList();

      SupportInfo getSupportInfo(int index);

      int getSupportInfoCount();

      List<? extends SupportInfoOrBuilder> getSupportInfoOrBuilderList();

      SupportInfoOrBuilder getSupportInfoOrBuilder(int index);
   }

   public interface S2C_SaveArraying_5820OrBuilder extends MessageOrBuilder {
      List<Arraying> getArrayingList();

      Arraying getArraying(int index);

      int getArrayingCount();

      List<? extends ArrayingOrBuilder> getArrayingOrBuilderList();

      ArrayingOrBuilder getArrayingOrBuilder(int index);
   }

   public interface S2C_ShopEvent_5814OrBuilder extends MessageOrBuilder {
      boolean hasShopEvent();

      EventInfo getShopEvent();

      EventInfoOrBuilder getShopEventOrBuilder();
   }

   public interface S2C_StoneCircleInfo_5802OrBuilder extends MessageOrBuilder {
      boolean hasSpiritNum();

      int getSpiritNum();

      boolean hasStage();

      int getStage();

      List<HpData> getHpDataList();

      HpData getHpData(int index);

      int getHpDataCount();

      List<? extends HpDataOrBuilder> getHpDataOrBuilderList();

      HpDataOrBuilder getHpDataOrBuilder(int index);

      List<SupportInfo> getSupportInfoList();

      SupportInfo getSupportInfo(int index);

      int getSupportInfoCount();

      List<? extends SupportInfoOrBuilder> getSupportInfoOrBuilderList();

      SupportInfoOrBuilder getSupportInfoOrBuilder(int index);

      List<Integer> getMySupportList();

      int getMySupportCount();

      int getMySupport(int index);

      List<EmployInfo> getEmployInfoList();

      EmployInfo getEmployInfo(int index);

      int getEmployInfoCount();

      List<? extends EmployInfoOrBuilder> getEmployInfoOrBuilderList();

      EmployInfoOrBuilder getEmployInfoOrBuilder(int index);
   }

   public interface S2C_StoneMapInfo_5804OrBuilder extends MessageOrBuilder {
      boolean hasSpiritNum();

      int getSpiritNum();

      boolean hasStage();

      int getStage();

      boolean hasPosition();

      MapIdentify getPosition();

      MapIdentifyOrBuilder getPositionOrBuilder();

      List<Integer> getExtraGridList();

      int getExtraGridCount();

      int getExtraGrid(int index);

      List<EventInfo> getMapEventList();

      EventInfo getMapEvent(int index);

      int getMapEventCount();

      List<? extends EventInfoOrBuilder> getMapEventOrBuilderList();

      EventInfoOrBuilder getMapEventOrBuilder(int index);

      List<MapIdentify> getLightPositionList();

      MapIdentify getLightPosition(int index);

      int getLightPositionCount();

      List<? extends MapIdentifyOrBuilder> getLightPositionOrBuilderList();

      MapIdentifyOrBuilder getLightPositionOrBuilder(int index);

      boolean hasBossMapGrid();

      int getBossMapGrid();

      boolean hasBossLocation();

      int getBossLocation();

      List<EventInfo> getBossEventList();

      EventInfo getBossEvent(int index);

      int getBossEventCount();

      List<? extends EventInfoOrBuilder> getBossEventOrBuilderList();

      EventInfoOrBuilder getBossEventOrBuilder(int index);

      boolean hasIsShow();

      int getIsShow();
   }

   public interface S2C_SupportHero_5829OrBuilder extends MessageOrBuilder {
      List<Integer> getSupportHeroList();

      int getSupportHeroCount();

      int getSupportHero(int index);
   }

   public interface S2C_TpEvent_5808OrBuilder extends MessageOrBuilder {
      boolean hasNextInfo();

      S2C_StoneMapInfo_5804 getNextInfo();

      S2C_StoneMapInfo_5804OrBuilder getNextInfoOrBuilder();
   }

   public interface ShopGoodsOrBuilder extends MessageOrBuilder {
      boolean hasShopId();

      int getShopId();

      boolean hasBought();

      boolean getBought();
   }

   public interface SupportInfoOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();
   }
}
