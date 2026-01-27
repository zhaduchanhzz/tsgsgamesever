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

public final class RuneMsg {
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private RuneMsg() {
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
      String[] descriptorData = new String[]{"\n\nRune.proto\u0012\u0016rune.com.gzbz.protobuf\u001a\fcommon.proto\"\u001b\n\u0019C2S_RuneLotteryInfo_20301\"\u009e\u0001\n\u0019S2C_RuneLotteryInfo_20302\u0012\u0018\n\u0010runeLotteryCount\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010runeLotteryPoint\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bgotBoxes\u0018\u0003 \u0003(\u0005\u0012\u001c\n\u0014runeLotteryFreeCount\u0018\u0004 \u0002(\u0005\u0012\u001d\n\u0015dailyRuneLotteryCount\u0018\u0005 \u0002(\u0005\"%\n\u0015C2S_RuneLottery_20303\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"^\n\u0015S2C_RuneLottery_20304\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010runeLotteryCount\u0018\u0002 \u0002(\u0005\u0012\u001d\n\u0015dailyRuneLotteryCount\u0018\u0003 \u0002(\u0005\",\n\u001eC2S_RuneLotteryBoxReward_20305\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"F\n\u001eS2C_RuneLotteryBoxReward_20306\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010runeLotteryPoint\u0018\u0002 \u0002(\u0005\"/\n\u001fC2S_RuneLotteryRecordList_20307\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"r\n\u001fS2C_RuneLotteryRecordList_20308\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012A\n\nrecordList\u0018\u0002 \u0003(\u000b2-.rune.com.gzbz.protobuf.RuneLotteryRecordData\"`\n\u001bS2C_RuneLotteryRecord_20309\u0012A\n\nrecordList\u0018\u0001 \u0003(\u000b2-.rune.com.gzbz.protobuf.RuneLotteryRecordData\"|\n\u0015RuneLotteryRecordData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\u0014\n\fresourceType\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nresourceId\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bresourceNum\u0018\u0005 \u0002(\u0005\"/\n\u001bC2S_RuneAndRefineInfo_20310\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"e\n\u001bS2C_RuneAndRefineInfo_20311\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u00124\n\u0011runeAndRefineInfo\u0018\u0002 \u0001(\u000b2\u0019.common.RuneAndRefineInfo\"`\n\u0012C2S_WearRune_20312\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0002(\u0005\u0012&\n\bposition\u0018\u0003 \u0002(\u000e2\u0014.common.RunePosition\"w\n\u0012S2C_WearRune_20313\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0001(\u000e2\u0014.common.RunePosition\u0012\u0010\n\bitemCode\u0018\u0003 \u0001(\u0005\u0012\u0015\n\rcallReplaceLv\u0018\u0004 \u0001(\b\"Q\n\u0015C2S_UndressRune_20314\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\"Q\n\u0015S2C_UndressRune_20315\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\"\u009b\u0001\n\u0014C2S_Strengthen_20316\u0012\u0011\n\twearState\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bheroCode\u0018\u0003 \u0001(\u0005\u0012&\n\bposition\u0018\u0004 \u0001(\u000e2\u0014.common.RunePosition\u0012$\n\tcostItems\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\"°\u0001\n\u0014S2C_Strengthen_20317\u0012\u0011\n\twearState\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bheroCode\u0018\u0003 \u0001(\u0005\u0012&\n\bposition\u0018\u0004 \u0001(\u000e2\u0014.common.RunePosition\u0012\u0017\n\u000fupgradeProgress\u0018\u0005 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0006 \u0002(\u0005\u0012\u0011\n\tisUpgrade\u0018\u0007 \u0002(\b\"\u008e\u0001\n\u0010C2S_Fusion_20318\u0012\u0011\n\twearState\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0001(\u0005\u0012&\n\bposition\u0018\u0003 \u0001(\u000e2\u0014.common.RunePosition\u0012\u0016\n\u000efunctionRuneId\u0018\u0004 \u0002(\u0005\u0012\u0015\n\rcostItemCodes\u0018\u0005 \u0003(\u0005\"\u0012\n\u0010S2C_Fusion_20319\"t\n\u0013C2S_UpQuality_20320\u0012\u0011\n\twearState\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bheroCode\u0018\u0003 \u0001(\u0005\u0012&\n\bposition\u0018\u0004 \u0001(\u000e2\u0014.common.RunePosition\"\u0015\n\u0013S2C_UpQuality_20321\"\u0087\u0001\n\u0010C2S_Change_20322\u0012\u0011\n\twearState\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bheroCode\u0018\u0003 \u0001(\u0005\u0012&\n\bposition\u0018\u0004 \u0001(\u000e2\u0014.common.RunePosition\u0012\u0014\n\ftargetRuneId\u0018\u0005 \u0002(\u0005\"\u0012\n\u0010S2C_Change_20323\"p\n\u000fC2S_Reset_20324\u0012\u0011\n\twearState\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bheroCode\u0018\u0003 \u0001(\u0005\u0012&\n\bposition\u0018\u0004 \u0001(\u000e2\u0014.common.RunePosition\"\u0011\n\u000fS2C_Reset_20325\"g\n\u0010C2S_Refine_20326\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\u0012\u0019\n\u0011refineSpecialItem\u0018\u0003 \u0003(\u0005\"\u0012\n\u0010S2C_Refine_20327\"S\n\u0017C2S_RefineBreakUp_20328\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\"\u0019\n\u0017S2C_RefineBreakUp_20329\"Q\n\u0015C2S_RefineReset_20330\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\"\u0017\n\u0015S2C_RefineReset_20331\"e\n\u0017C2S_RefineInherit_20332\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\u0012\u0010\n\bitemCode\u0018\u0003 \u0002(\u0005\"\u0019\n\u0017S2C_RefineInherit_20333\"+\n\u0017C2S_RuneDecompose_20334\u0012\u0010\n\bitemCode\u0018\u0001 \u0003(\u0005\"\u0019\n\u0017S2C_RuneDecompose_20335\"h\n\u0016C2S_LockNatureId_20336\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\u0012\u0014\n\flockNatureId\u0018\u0003 \u0002(\u0005\"\u0018\n\u0016S2C_LockNatureId_20337\"l\n\u0018C2S_UnlockNatureId_20338\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\u0012\u0016\n\u000eunlockNatureId\u0018\u0003 \u0002(\u0005\"\u001a\n\u0018S2C_UnlockNatureId_20339\"V\n\u001aC2S_GetLockNatureIds_20340\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\"l\n\u001aS2C_GetLockNatureIds_20341\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\u0012\u0014\n\flockNatureId\u0018\u0003 \u0003(\u0005\"d\n\u0016C2S_RuneLvChange_20342\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012&\n\bposition\u0018\u0002 \u0002(\u000e2\u0014.common.RunePosition\u0012\u0010\n\bitemCode\u0018\u0003 \u0002(\u0005\"\u0018\n\u0016S2C_RuneLvChange_20343B\u001e\n\u0011com.gzbz.protobufB\u0007RuneMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_descriptor, new String[]{"RuneLotteryCount", "RuneLotteryPoint", "GotBoxes", "RuneLotteryFreeCount", "DailyRuneLotteryCount"});
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_descriptor, new String[]{"Type"});
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_descriptor, new String[]{"Type", "RuneLotteryCount", "DailyRuneLotteryCount"});
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_descriptor, new String[]{"Id"});
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_descriptor, new String[]{"Id", "RuneLotteryPoint"});
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_descriptor, new String[]{"Type"});
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_descriptor, new String[]{"Type", "RecordList"});
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_descriptor, new String[]{"RecordList"});
      internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_descriptor, new String[]{"PlayerId", "PlayerName", "ResourceType", "ResourceId", "ResourceNum"});
      internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_descriptor, new String[]{"HeroCode"});
      internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_descriptor, new String[]{"HeroCode", "RuneAndRefineInfo"});
      internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_descriptor, new String[]{"HeroCode", "ItemCode", "Position"});
      internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_descriptor, new String[]{"HeroCode", "Position", "ItemCode", "CallReplaceLv"});
      internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_descriptor, new String[]{"WearState", "ItemCode", "HeroCode", "Position", "CostItems"});
      internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_descriptor, new String[]{"WearState", "ItemCode", "HeroCode", "Position", "UpgradeProgress", "Level", "IsUpgrade"});
      internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_descriptor, new String[]{"WearState", "HeroCode", "Position", "FunctionRuneId", "CostItemCodes"});
      internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_descriptor, new String[]{"WearState", "ItemCode", "HeroCode", "Position"});
      internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_descriptor, new String[]{"WearState", "ItemCode", "HeroCode", "Position", "TargetRuneId"});
      internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_descriptor, new String[]{"WearState", "ItemCode", "HeroCode", "Position"});
      internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_descriptor, new String[]{"HeroCode", "Position", "RefineSpecialItem"});
      internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_descriptor, new String[]{"HeroCode", "Position", "ItemCode"});
      internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_descriptor, new String[]{"ItemCode"});
      internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_descriptor, new String[]{"HeroCode", "Position", "LockNatureId"});
      internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_descriptor, new String[]{"HeroCode", "Position", "UnlockNatureId"});
      internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_descriptor, new String[0]);
      internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(41);
      internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_descriptor, new String[]{"HeroCode", "Position", "LockNatureId"});
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(42);
      internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_descriptor, new String[]{"HeroCode", "Position", "ItemCode"});
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(43);
      internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_descriptor, new String[0]);
      CommonMsg.getDescriptor();
   }

   public static final class C2S_RuneLotteryInfo_20301 extends GeneratedMessageV3 implements C2S_RuneLotteryInfo_20301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RuneLotteryInfo_20301 DEFAULT_INSTANCE = new C2S_RuneLotteryInfo_20301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneLotteryInfo_20301> PARSER = new AbstractParser<C2S_RuneLotteryInfo_20301>() {
         public C2S_RuneLotteryInfo_20301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneLotteryInfo_20301(input, extensionRegistry);
         }
      };

      private C2S_RuneLotteryInfo_20301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneLotteryInfo_20301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneLotteryInfo_20301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneLotteryInfo_20301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLotteryInfo_20301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RuneLotteryInfo_20301)) {
            return super.equals(obj);
         } else {
            C2S_RuneLotteryInfo_20301 other = (C2S_RuneLotteryInfo_20301)obj;
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

      public static C2S_RuneLotteryInfo_20301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryInfo_20301)PARSER.parseFrom(data);
      }

      public static C2S_RuneLotteryInfo_20301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryInfo_20301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLotteryInfo_20301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryInfo_20301)PARSER.parseFrom(data);
      }

      public static C2S_RuneLotteryInfo_20301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryInfo_20301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLotteryInfo_20301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryInfo_20301)PARSER.parseFrom(data);
      }

      public static C2S_RuneLotteryInfo_20301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryInfo_20301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLotteryInfo_20301 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneLotteryInfo_20301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLotteryInfo_20301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLotteryInfo_20301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLotteryInfo_20301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneLotteryInfo_20301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneLotteryInfo_20301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLotteryInfo_20301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLotteryInfo_20301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneLotteryInfo_20301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLotteryInfo_20301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLotteryInfo_20301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneLotteryInfo_20301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneLotteryInfo_20301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneLotteryInfo_20301> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneLotteryInfo_20301> getParserForType() {
         return PARSER;
      }

      public C2S_RuneLotteryInfo_20301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneLotteryInfo_20301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLotteryInfo_20301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RuneLotteryInfo_20301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryInfo_20301_descriptor;
         }

         public C2S_RuneLotteryInfo_20301 getDefaultInstanceForType() {
            return RuneMsg.C2S_RuneLotteryInfo_20301.getDefaultInstance();
         }

         public C2S_RuneLotteryInfo_20301 build() {
            C2S_RuneLotteryInfo_20301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneLotteryInfo_20301 buildPartial() {
            C2S_RuneLotteryInfo_20301 result = new C2S_RuneLotteryInfo_20301(this);
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
            if (other instanceof C2S_RuneLotteryInfo_20301) {
               return this.mergeFrom((C2S_RuneLotteryInfo_20301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneLotteryInfo_20301 other) {
            if (other == RuneMsg.C2S_RuneLotteryInfo_20301.getDefaultInstance()) {
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
            C2S_RuneLotteryInfo_20301 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneLotteryInfo_20301)RuneMsg.C2S_RuneLotteryInfo_20301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneLotteryInfo_20301)e.getUnfinishedMessage();
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

   public static final class S2C_RuneLotteryInfo_20302 extends GeneratedMessageV3 implements S2C_RuneLotteryInfo_20302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RUNELOTTERYCOUNT_FIELD_NUMBER = 1;
      private int runeLotteryCount_;
      public static final int RUNELOTTERYPOINT_FIELD_NUMBER = 2;
      private int runeLotteryPoint_;
      public static final int GOTBOXES_FIELD_NUMBER = 3;
      private Internal.IntList gotBoxes_;
      public static final int RUNELOTTERYFREECOUNT_FIELD_NUMBER = 4;
      private int runeLotteryFreeCount_;
      public static final int DAILYRUNELOTTERYCOUNT_FIELD_NUMBER = 5;
      private int dailyRuneLotteryCount_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneLotteryInfo_20302 DEFAULT_INSTANCE = new S2C_RuneLotteryInfo_20302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneLotteryInfo_20302> PARSER = new AbstractParser<S2C_RuneLotteryInfo_20302>() {
         public S2C_RuneLotteryInfo_20302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneLotteryInfo_20302(input, extensionRegistry);
         }
      };

      private S2C_RuneLotteryInfo_20302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneLotteryInfo_20302() {
         this.memoizedIsInitialized = -1;
         this.gotBoxes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneLotteryInfo_20302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneLotteryInfo_20302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.runeLotteryCount_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.runeLotteryPoint_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.gotBoxes_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.gotBoxes_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotBoxes_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.runeLotteryFreeCount_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 8;
                        this.dailyRuneLotteryCount_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gotBoxes_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.gotBoxes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLotteryInfo_20302.class, Builder.class);
      }

      public boolean hasRuneLotteryCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRuneLotteryCount() {
         return this.runeLotteryCount_;
      }

      public boolean hasRuneLotteryPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRuneLotteryPoint() {
         return this.runeLotteryPoint_;
      }

      public List<Integer> getGotBoxesList() {
         return this.gotBoxes_;
      }

      public int getGotBoxesCount() {
         return this.gotBoxes_.size();
      }

      public int getGotBoxes(int index) {
         return this.gotBoxes_.getInt(index);
      }

      public boolean hasRuneLotteryFreeCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRuneLotteryFreeCount() {
         return this.runeLotteryFreeCount_;
      }

      public boolean hasDailyRuneLotteryCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDailyRuneLotteryCount() {
         return this.dailyRuneLotteryCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRuneLotteryCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRuneLotteryPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRuneLotteryFreeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyRuneLotteryCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.runeLotteryCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.runeLotteryPoint_);
         }

         for(int i = 0; i < this.gotBoxes_.size(); ++i) {
            output.writeInt32(3, this.gotBoxes_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.runeLotteryFreeCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.dailyRuneLotteryCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.runeLotteryCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.runeLotteryPoint_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotBoxes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotBoxes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotBoxesList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.runeLotteryFreeCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dailyRuneLotteryCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneLotteryInfo_20302)) {
            return super.equals(obj);
         } else {
            S2C_RuneLotteryInfo_20302 other = (S2C_RuneLotteryInfo_20302)obj;
            if (this.hasRuneLotteryCount() != other.hasRuneLotteryCount()) {
               return false;
            } else if (this.hasRuneLotteryCount() && this.getRuneLotteryCount() != other.getRuneLotteryCount()) {
               return false;
            } else if (this.hasRuneLotteryPoint() != other.hasRuneLotteryPoint()) {
               return false;
            } else if (this.hasRuneLotteryPoint() && this.getRuneLotteryPoint() != other.getRuneLotteryPoint()) {
               return false;
            } else if (!this.getGotBoxesList().equals(other.getGotBoxesList())) {
               return false;
            } else if (this.hasRuneLotteryFreeCount() != other.hasRuneLotteryFreeCount()) {
               return false;
            } else if (this.hasRuneLotteryFreeCount() && this.getRuneLotteryFreeCount() != other.getRuneLotteryFreeCount()) {
               return false;
            } else if (this.hasDailyRuneLotteryCount() != other.hasDailyRuneLotteryCount()) {
               return false;
            } else if (this.hasDailyRuneLotteryCount() && this.getDailyRuneLotteryCount() != other.getDailyRuneLotteryCount()) {
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
            if (this.hasRuneLotteryCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRuneLotteryCount();
            }

            if (this.hasRuneLotteryPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRuneLotteryPoint();
            }

            if (this.getGotBoxesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotBoxesList().hashCode();
            }

            if (this.hasRuneLotteryFreeCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRuneLotteryFreeCount();
            }

            if (this.hasDailyRuneLotteryCount()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDailyRuneLotteryCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryInfo_20302)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryInfo_20302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryInfo_20302)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryInfo_20302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryInfo_20302)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryInfo_20302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneLotteryInfo_20302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryInfo_20302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLotteryInfo_20302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneLotteryInfo_20302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryInfo_20302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryInfo_20302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneLotteryInfo_20302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryInfo_20302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryInfo_20302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneLotteryInfo_20302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneLotteryInfo_20302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneLotteryInfo_20302> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneLotteryInfo_20302> getParserForType() {
         return PARSER;
      }

      public S2C_RuneLotteryInfo_20302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneLotteryInfo_20302OrBuilder {
         private int bitField0_;
         private int runeLotteryCount_;
         private int runeLotteryPoint_;
         private Internal.IntList gotBoxes_;
         private int runeLotteryFreeCount_;
         private int dailyRuneLotteryCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLotteryInfo_20302.class, Builder.class);
         }

         private Builder() {
            this.gotBoxes_ = RuneMsg.S2C_RuneLotteryInfo_20302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotBoxes_ = RuneMsg.S2C_RuneLotteryInfo_20302.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RuneLotteryInfo_20302.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.runeLotteryCount_ = 0;
            this.bitField0_ &= -2;
            this.runeLotteryPoint_ = 0;
            this.bitField0_ &= -3;
            this.gotBoxes_ = RuneMsg.S2C_RuneLotteryInfo_20302.emptyIntList();
            this.bitField0_ &= -5;
            this.runeLotteryFreeCount_ = 0;
            this.bitField0_ &= -9;
            this.dailyRuneLotteryCount_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryInfo_20302_descriptor;
         }

         public S2C_RuneLotteryInfo_20302 getDefaultInstanceForType() {
            return RuneMsg.S2C_RuneLotteryInfo_20302.getDefaultInstance();
         }

         public S2C_RuneLotteryInfo_20302 build() {
            S2C_RuneLotteryInfo_20302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneLotteryInfo_20302 buildPartial() {
            S2C_RuneLotteryInfo_20302 result = new S2C_RuneLotteryInfo_20302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.runeLotteryCount_ = this.runeLotteryCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.runeLotteryPoint_ = this.runeLotteryPoint_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotBoxes_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotBoxes_ = this.gotBoxes_;
            if ((from_bitField0_ & 8) != 0) {
               result.runeLotteryFreeCount_ = this.runeLotteryFreeCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dailyRuneLotteryCount_ = this.dailyRuneLotteryCount_;
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
            if (other instanceof S2C_RuneLotteryInfo_20302) {
               return this.mergeFrom((S2C_RuneLotteryInfo_20302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneLotteryInfo_20302 other) {
            if (other == RuneMsg.S2C_RuneLotteryInfo_20302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRuneLotteryCount()) {
                  this.setRuneLotteryCount(other.getRuneLotteryCount());
               }

               if (other.hasRuneLotteryPoint()) {
                  this.setRuneLotteryPoint(other.getRuneLotteryPoint());
               }

               if (!other.gotBoxes_.isEmpty()) {
                  if (this.gotBoxes_.isEmpty()) {
                     this.gotBoxes_ = other.gotBoxes_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGotBoxesIsMutable();
                     this.gotBoxes_.addAll(other.gotBoxes_);
                  }

                  this.onChanged();
               }

               if (other.hasRuneLotteryFreeCount()) {
                  this.setRuneLotteryFreeCount(other.getRuneLotteryFreeCount());
               }

               if (other.hasDailyRuneLotteryCount()) {
                  this.setDailyRuneLotteryCount(other.getDailyRuneLotteryCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRuneLotteryCount()) {
               return false;
            } else if (!this.hasRuneLotteryPoint()) {
               return false;
            } else if (!this.hasRuneLotteryFreeCount()) {
               return false;
            } else {
               return this.hasDailyRuneLotteryCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneLotteryInfo_20302 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneLotteryInfo_20302)RuneMsg.S2C_RuneLotteryInfo_20302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneLotteryInfo_20302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRuneLotteryCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRuneLotteryCount() {
            return this.runeLotteryCount_;
         }

         public Builder setRuneLotteryCount(int value) {
            this.bitField0_ |= 1;
            this.runeLotteryCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRuneLotteryCount() {
            this.bitField0_ &= -2;
            this.runeLotteryCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRuneLotteryPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRuneLotteryPoint() {
            return this.runeLotteryPoint_;
         }

         public Builder setRuneLotteryPoint(int value) {
            this.bitField0_ |= 2;
            this.runeLotteryPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRuneLotteryPoint() {
            this.bitField0_ &= -3;
            this.runeLotteryPoint_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotBoxesIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotBoxes_ = RuneMsg.S2C_RuneLotteryInfo_20302.mutableCopy(this.gotBoxes_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getGotBoxesList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.gotBoxes_) : this.gotBoxes_);
         }

         public int getGotBoxesCount() {
            return this.gotBoxes_.size();
         }

         public int getGotBoxes(int index) {
            return this.gotBoxes_.getInt(index);
         }

         public Builder setGotBoxes(int index, int value) {
            this.ensureGotBoxesIsMutable();
            this.gotBoxes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotBoxes(int value) {
            this.ensureGotBoxesIsMutable();
            this.gotBoxes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotBoxes(Iterable<? extends Integer> values) {
            this.ensureGotBoxesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotBoxes_);
            this.onChanged();
            return this;
         }

         public Builder clearGotBoxes() {
            this.gotBoxes_ = RuneMsg.S2C_RuneLotteryInfo_20302.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasRuneLotteryFreeCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getRuneLotteryFreeCount() {
            return this.runeLotteryFreeCount_;
         }

         public Builder setRuneLotteryFreeCount(int value) {
            this.bitField0_ |= 8;
            this.runeLotteryFreeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRuneLotteryFreeCount() {
            this.bitField0_ &= -9;
            this.runeLotteryFreeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailyRuneLotteryCount() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDailyRuneLotteryCount() {
            return this.dailyRuneLotteryCount_;
         }

         public Builder setDailyRuneLotteryCount(int value) {
            this.bitField0_ |= 16;
            this.dailyRuneLotteryCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyRuneLotteryCount() {
            this.bitField0_ &= -17;
            this.dailyRuneLotteryCount_ = 0;
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

   public static final class C2S_RuneLottery_20303 extends GeneratedMessageV3 implements C2S_RuneLottery_20303OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneLottery_20303 DEFAULT_INSTANCE = new C2S_RuneLottery_20303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneLottery_20303> PARSER = new AbstractParser<C2S_RuneLottery_20303>() {
         public C2S_RuneLottery_20303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneLottery_20303(input, extensionRegistry);
         }
      };

      private C2S_RuneLottery_20303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneLottery_20303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneLottery_20303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneLottery_20303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLottery_20303.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RuneLottery_20303)) {
            return super.equals(obj);
         } else {
            C2S_RuneLottery_20303 other = (C2S_RuneLottery_20303)obj;
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

      public static C2S_RuneLottery_20303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneLottery_20303)PARSER.parseFrom(data);
      }

      public static C2S_RuneLottery_20303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLottery_20303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLottery_20303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneLottery_20303)PARSER.parseFrom(data);
      }

      public static C2S_RuneLottery_20303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLottery_20303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLottery_20303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneLottery_20303)PARSER.parseFrom(data);
      }

      public static C2S_RuneLottery_20303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLottery_20303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLottery_20303 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneLottery_20303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLottery_20303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLottery_20303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLottery_20303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneLottery_20303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneLottery_20303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLottery_20303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLottery_20303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneLottery_20303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLottery_20303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLottery_20303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneLottery_20303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneLottery_20303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneLottery_20303> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneLottery_20303> getParserForType() {
         return PARSER;
      }

      public C2S_RuneLottery_20303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneLottery_20303OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLottery_20303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RuneLottery_20303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLottery_20303_descriptor;
         }

         public C2S_RuneLottery_20303 getDefaultInstanceForType() {
            return RuneMsg.C2S_RuneLottery_20303.getDefaultInstance();
         }

         public C2S_RuneLottery_20303 build() {
            C2S_RuneLottery_20303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneLottery_20303 buildPartial() {
            C2S_RuneLottery_20303 result = new C2S_RuneLottery_20303(this);
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
            if (other instanceof C2S_RuneLottery_20303) {
               return this.mergeFrom((C2S_RuneLottery_20303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneLottery_20303 other) {
            if (other == RuneMsg.C2S_RuneLottery_20303.getDefaultInstance()) {
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
            C2S_RuneLottery_20303 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneLottery_20303)RuneMsg.C2S_RuneLottery_20303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneLottery_20303)e.getUnfinishedMessage();
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

   public static final class S2C_RuneLottery_20304 extends GeneratedMessageV3 implements S2C_RuneLottery_20304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int RUNELOTTERYCOUNT_FIELD_NUMBER = 2;
      private int runeLotteryCount_;
      public static final int DAILYRUNELOTTERYCOUNT_FIELD_NUMBER = 3;
      private int dailyRuneLotteryCount_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneLottery_20304 DEFAULT_INSTANCE = new S2C_RuneLottery_20304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneLottery_20304> PARSER = new AbstractParser<S2C_RuneLottery_20304>() {
         public S2C_RuneLottery_20304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneLottery_20304(input, extensionRegistry);
         }
      };

      private S2C_RuneLottery_20304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneLottery_20304() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneLottery_20304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneLottery_20304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.runeLotteryCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.dailyRuneLotteryCount_ = input.readInt32();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLottery_20304.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasRuneLotteryCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRuneLotteryCount() {
         return this.runeLotteryCount_;
      }

      public boolean hasDailyRuneLotteryCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDailyRuneLotteryCount() {
         return this.dailyRuneLotteryCount_;
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
         } else if (!this.hasRuneLotteryCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyRuneLotteryCount()) {
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
            output.writeInt32(2, this.runeLotteryCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.dailyRuneLotteryCount_);
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
               size += CodedOutputStream.computeInt32Size(2, this.runeLotteryCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dailyRuneLotteryCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneLottery_20304)) {
            return super.equals(obj);
         } else {
            S2C_RuneLottery_20304 other = (S2C_RuneLottery_20304)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasRuneLotteryCount() != other.hasRuneLotteryCount()) {
               return false;
            } else if (this.hasRuneLotteryCount() && this.getRuneLotteryCount() != other.getRuneLotteryCount()) {
               return false;
            } else if (this.hasDailyRuneLotteryCount() != other.hasDailyRuneLotteryCount()) {
               return false;
            } else if (this.hasDailyRuneLotteryCount() && this.getDailyRuneLotteryCount() != other.getDailyRuneLotteryCount()) {
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

            if (this.hasRuneLotteryCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRuneLotteryCount();
            }

            if (this.hasDailyRuneLotteryCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDailyRuneLotteryCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneLottery_20304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneLottery_20304)PARSER.parseFrom(data);
      }

      public static S2C_RuneLottery_20304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLottery_20304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLottery_20304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneLottery_20304)PARSER.parseFrom(data);
      }

      public static S2C_RuneLottery_20304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLottery_20304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLottery_20304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneLottery_20304)PARSER.parseFrom(data);
      }

      public static S2C_RuneLottery_20304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLottery_20304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLottery_20304 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneLottery_20304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLottery_20304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLottery_20304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLottery_20304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneLottery_20304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneLottery_20304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLottery_20304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLottery_20304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneLottery_20304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLottery_20304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLottery_20304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneLottery_20304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneLottery_20304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneLottery_20304> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneLottery_20304> getParserForType() {
         return PARSER;
      }

      public S2C_RuneLottery_20304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneLottery_20304OrBuilder {
         private int bitField0_;
         private int type_;
         private int runeLotteryCount_;
         private int dailyRuneLotteryCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLottery_20304.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RuneLottery_20304.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.runeLotteryCount_ = 0;
            this.bitField0_ &= -3;
            this.dailyRuneLotteryCount_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLottery_20304_descriptor;
         }

         public S2C_RuneLottery_20304 getDefaultInstanceForType() {
            return RuneMsg.S2C_RuneLottery_20304.getDefaultInstance();
         }

         public S2C_RuneLottery_20304 build() {
            S2C_RuneLottery_20304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneLottery_20304 buildPartial() {
            S2C_RuneLottery_20304 result = new S2C_RuneLottery_20304(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.runeLotteryCount_ = this.runeLotteryCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dailyRuneLotteryCount_ = this.dailyRuneLotteryCount_;
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
            if (other instanceof S2C_RuneLottery_20304) {
               return this.mergeFrom((S2C_RuneLottery_20304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneLottery_20304 other) {
            if (other == RuneMsg.S2C_RuneLottery_20304.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasRuneLotteryCount()) {
                  this.setRuneLotteryCount(other.getRuneLotteryCount());
               }

               if (other.hasDailyRuneLotteryCount()) {
                  this.setDailyRuneLotteryCount(other.getDailyRuneLotteryCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasRuneLotteryCount()) {
               return false;
            } else {
               return this.hasDailyRuneLotteryCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneLottery_20304 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneLottery_20304)RuneMsg.S2C_RuneLottery_20304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneLottery_20304)e.getUnfinishedMessage();
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

         public boolean hasRuneLotteryCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRuneLotteryCount() {
            return this.runeLotteryCount_;
         }

         public Builder setRuneLotteryCount(int value) {
            this.bitField0_ |= 2;
            this.runeLotteryCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRuneLotteryCount() {
            this.bitField0_ &= -3;
            this.runeLotteryCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailyRuneLotteryCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDailyRuneLotteryCount() {
            return this.dailyRuneLotteryCount_;
         }

         public Builder setDailyRuneLotteryCount(int value) {
            this.bitField0_ |= 4;
            this.dailyRuneLotteryCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyRuneLotteryCount() {
            this.bitField0_ &= -5;
            this.dailyRuneLotteryCount_ = 0;
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

   public static final class C2S_RuneLotteryBoxReward_20305 extends GeneratedMessageV3 implements C2S_RuneLotteryBoxReward_20305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneLotteryBoxReward_20305 DEFAULT_INSTANCE = new C2S_RuneLotteryBoxReward_20305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneLotteryBoxReward_20305> PARSER = new AbstractParser<C2S_RuneLotteryBoxReward_20305>() {
         public C2S_RuneLotteryBoxReward_20305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneLotteryBoxReward_20305(input, extensionRegistry);
         }
      };

      private C2S_RuneLotteryBoxReward_20305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneLotteryBoxReward_20305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneLotteryBoxReward_20305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneLotteryBoxReward_20305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLotteryBoxReward_20305.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RuneLotteryBoxReward_20305)) {
            return super.equals(obj);
         } else {
            C2S_RuneLotteryBoxReward_20305 other = (C2S_RuneLotteryBoxReward_20305)obj;
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

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryBoxReward_20305)PARSER.parseFrom(data);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryBoxReward_20305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryBoxReward_20305)PARSER.parseFrom(data);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryBoxReward_20305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryBoxReward_20305)PARSER.parseFrom(data);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryBoxReward_20305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneLotteryBoxReward_20305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLotteryBoxReward_20305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneLotteryBoxReward_20305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLotteryBoxReward_20305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneLotteryBoxReward_20305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLotteryBoxReward_20305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLotteryBoxReward_20305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneLotteryBoxReward_20305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneLotteryBoxReward_20305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneLotteryBoxReward_20305> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneLotteryBoxReward_20305> getParserForType() {
         return PARSER;
      }

      public C2S_RuneLotteryBoxReward_20305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneLotteryBoxReward_20305OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLotteryBoxReward_20305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RuneLotteryBoxReward_20305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryBoxReward_20305_descriptor;
         }

         public C2S_RuneLotteryBoxReward_20305 getDefaultInstanceForType() {
            return RuneMsg.C2S_RuneLotteryBoxReward_20305.getDefaultInstance();
         }

         public C2S_RuneLotteryBoxReward_20305 build() {
            C2S_RuneLotteryBoxReward_20305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneLotteryBoxReward_20305 buildPartial() {
            C2S_RuneLotteryBoxReward_20305 result = new C2S_RuneLotteryBoxReward_20305(this);
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
            if (other instanceof C2S_RuneLotteryBoxReward_20305) {
               return this.mergeFrom((C2S_RuneLotteryBoxReward_20305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneLotteryBoxReward_20305 other) {
            if (other == RuneMsg.C2S_RuneLotteryBoxReward_20305.getDefaultInstance()) {
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
            C2S_RuneLotteryBoxReward_20305 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneLotteryBoxReward_20305)RuneMsg.C2S_RuneLotteryBoxReward_20305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneLotteryBoxReward_20305)e.getUnfinishedMessage();
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

   public static final class S2C_RuneLotteryBoxReward_20306 extends GeneratedMessageV3 implements S2C_RuneLotteryBoxReward_20306OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int RUNELOTTERYPOINT_FIELD_NUMBER = 2;
      private int runeLotteryPoint_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneLotteryBoxReward_20306 DEFAULT_INSTANCE = new S2C_RuneLotteryBoxReward_20306();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneLotteryBoxReward_20306> PARSER = new AbstractParser<S2C_RuneLotteryBoxReward_20306>() {
         public S2C_RuneLotteryBoxReward_20306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneLotteryBoxReward_20306(input, extensionRegistry);
         }
      };

      private S2C_RuneLotteryBoxReward_20306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneLotteryBoxReward_20306() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneLotteryBoxReward_20306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneLotteryBoxReward_20306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.runeLotteryPoint_ = input.readInt32();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLotteryBoxReward_20306.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasRuneLotteryPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRuneLotteryPoint() {
         return this.runeLotteryPoint_;
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
         } else if (!this.hasRuneLotteryPoint()) {
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
            output.writeInt32(2, this.runeLotteryPoint_);
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
               size += CodedOutputStream.computeInt32Size(2, this.runeLotteryPoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneLotteryBoxReward_20306)) {
            return super.equals(obj);
         } else {
            S2C_RuneLotteryBoxReward_20306 other = (S2C_RuneLotteryBoxReward_20306)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasRuneLotteryPoint() != other.hasRuneLotteryPoint()) {
               return false;
            } else if (this.hasRuneLotteryPoint() && this.getRuneLotteryPoint() != other.getRuneLotteryPoint()) {
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

            if (this.hasRuneLotteryPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRuneLotteryPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryBoxReward_20306)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryBoxReward_20306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryBoxReward_20306)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryBoxReward_20306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryBoxReward_20306)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryBoxReward_20306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneLotteryBoxReward_20306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryBoxReward_20306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneLotteryBoxReward_20306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryBoxReward_20306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneLotteryBoxReward_20306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryBoxReward_20306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryBoxReward_20306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneLotteryBoxReward_20306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneLotteryBoxReward_20306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneLotteryBoxReward_20306> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneLotteryBoxReward_20306> getParserForType() {
         return PARSER;
      }

      public S2C_RuneLotteryBoxReward_20306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneLotteryBoxReward_20306OrBuilder {
         private int bitField0_;
         private int id_;
         private int runeLotteryPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLotteryBoxReward_20306.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RuneLotteryBoxReward_20306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.runeLotteryPoint_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryBoxReward_20306_descriptor;
         }

         public S2C_RuneLotteryBoxReward_20306 getDefaultInstanceForType() {
            return RuneMsg.S2C_RuneLotteryBoxReward_20306.getDefaultInstance();
         }

         public S2C_RuneLotteryBoxReward_20306 build() {
            S2C_RuneLotteryBoxReward_20306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneLotteryBoxReward_20306 buildPartial() {
            S2C_RuneLotteryBoxReward_20306 result = new S2C_RuneLotteryBoxReward_20306(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.runeLotteryPoint_ = this.runeLotteryPoint_;
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
            if (other instanceof S2C_RuneLotteryBoxReward_20306) {
               return this.mergeFrom((S2C_RuneLotteryBoxReward_20306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneLotteryBoxReward_20306 other) {
            if (other == RuneMsg.S2C_RuneLotteryBoxReward_20306.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasRuneLotteryPoint()) {
                  this.setRuneLotteryPoint(other.getRuneLotteryPoint());
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
               return this.hasRuneLotteryPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneLotteryBoxReward_20306 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneLotteryBoxReward_20306)RuneMsg.S2C_RuneLotteryBoxReward_20306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneLotteryBoxReward_20306)e.getUnfinishedMessage();
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

         public boolean hasRuneLotteryPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRuneLotteryPoint() {
            return this.runeLotteryPoint_;
         }

         public Builder setRuneLotteryPoint(int value) {
            this.bitField0_ |= 2;
            this.runeLotteryPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRuneLotteryPoint() {
            this.bitField0_ &= -3;
            this.runeLotteryPoint_ = 0;
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

   public static final class C2S_RuneLotteryRecordList_20307 extends GeneratedMessageV3 implements C2S_RuneLotteryRecordList_20307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneLotteryRecordList_20307 DEFAULT_INSTANCE = new C2S_RuneLotteryRecordList_20307();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneLotteryRecordList_20307> PARSER = new AbstractParser<C2S_RuneLotteryRecordList_20307>() {
         public C2S_RuneLotteryRecordList_20307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneLotteryRecordList_20307(input, extensionRegistry);
         }
      };

      private C2S_RuneLotteryRecordList_20307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneLotteryRecordList_20307() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneLotteryRecordList_20307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneLotteryRecordList_20307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLotteryRecordList_20307.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RuneLotteryRecordList_20307)) {
            return super.equals(obj);
         } else {
            C2S_RuneLotteryRecordList_20307 other = (C2S_RuneLotteryRecordList_20307)obj;
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

      public static C2S_RuneLotteryRecordList_20307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryRecordList_20307)PARSER.parseFrom(data);
      }

      public static C2S_RuneLotteryRecordList_20307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryRecordList_20307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLotteryRecordList_20307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryRecordList_20307)PARSER.parseFrom(data);
      }

      public static C2S_RuneLotteryRecordList_20307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryRecordList_20307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLotteryRecordList_20307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryRecordList_20307)PARSER.parseFrom(data);
      }

      public static C2S_RuneLotteryRecordList_20307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLotteryRecordList_20307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLotteryRecordList_20307 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneLotteryRecordList_20307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLotteryRecordList_20307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLotteryRecordList_20307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLotteryRecordList_20307 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneLotteryRecordList_20307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneLotteryRecordList_20307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLotteryRecordList_20307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLotteryRecordList_20307 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneLotteryRecordList_20307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLotteryRecordList_20307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLotteryRecordList_20307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneLotteryRecordList_20307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneLotteryRecordList_20307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneLotteryRecordList_20307> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneLotteryRecordList_20307> getParserForType() {
         return PARSER;
      }

      public C2S_RuneLotteryRecordList_20307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneLotteryRecordList_20307OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLotteryRecordList_20307.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RuneLotteryRecordList_20307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLotteryRecordList_20307_descriptor;
         }

         public C2S_RuneLotteryRecordList_20307 getDefaultInstanceForType() {
            return RuneMsg.C2S_RuneLotteryRecordList_20307.getDefaultInstance();
         }

         public C2S_RuneLotteryRecordList_20307 build() {
            C2S_RuneLotteryRecordList_20307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneLotteryRecordList_20307 buildPartial() {
            C2S_RuneLotteryRecordList_20307 result = new C2S_RuneLotteryRecordList_20307(this);
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
            if (other instanceof C2S_RuneLotteryRecordList_20307) {
               return this.mergeFrom((C2S_RuneLotteryRecordList_20307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneLotteryRecordList_20307 other) {
            if (other == RuneMsg.C2S_RuneLotteryRecordList_20307.getDefaultInstance()) {
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
            C2S_RuneLotteryRecordList_20307 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneLotteryRecordList_20307)RuneMsg.C2S_RuneLotteryRecordList_20307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneLotteryRecordList_20307)e.getUnfinishedMessage();
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

   public static final class S2C_RuneLotteryRecordList_20308 extends GeneratedMessageV3 implements S2C_RuneLotteryRecordList_20308OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int RECORDLIST_FIELD_NUMBER = 2;
      private List<RuneLotteryRecordData> recordList_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneLotteryRecordList_20308 DEFAULT_INSTANCE = new S2C_RuneLotteryRecordList_20308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneLotteryRecordList_20308> PARSER = new AbstractParser<S2C_RuneLotteryRecordList_20308>() {
         public S2C_RuneLotteryRecordList_20308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneLotteryRecordList_20308(input, extensionRegistry);
         }
      };

      private S2C_RuneLotteryRecordList_20308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneLotteryRecordList_20308() {
         this.memoizedIsInitialized = -1;
         this.recordList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneLotteryRecordList_20308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneLotteryRecordList_20308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.recordList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.recordList_.add(input.readMessage(RuneMsg.RuneLotteryRecordData.PARSER, extensionRegistry));
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
                  this.recordList_ = Collections.unmodifiableList(this.recordList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLotteryRecordList_20308.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<RuneLotteryRecordData> getRecordListList() {
         return this.recordList_;
      }

      public List<? extends RuneLotteryRecordDataOrBuilder> getRecordListOrBuilderList() {
         return this.recordList_;
      }

      public int getRecordListCount() {
         return this.recordList_.size();
      }

      public RuneLotteryRecordData getRecordList(int index) {
         return (RuneLotteryRecordData)this.recordList_.get(index);
      }

      public RuneLotteryRecordDataOrBuilder getRecordListOrBuilder(int index) {
         return (RuneLotteryRecordDataOrBuilder)this.recordList_.get(index);
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
            for(int i = 0; i < this.getRecordListCount(); ++i) {
               if (!this.getRecordList(i).isInitialized()) {
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
            output.writeInt32(1, this.type_);
         }

         for(int i = 0; i < this.recordList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.recordList_.get(i));
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

            for(int i = 0; i < this.recordList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.recordList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneLotteryRecordList_20308)) {
            return super.equals(obj);
         } else {
            S2C_RuneLotteryRecordList_20308 other = (S2C_RuneLotteryRecordList_20308)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getRecordListList().equals(other.getRecordListList())) {
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

            if (this.getRecordListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecordList_20308)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecordList_20308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecordList_20308)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecordList_20308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecordList_20308)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecordList_20308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneLotteryRecordList_20308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryRecordList_20308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLotteryRecordList_20308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneLotteryRecordList_20308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryRecordList_20308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryRecordList_20308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneLotteryRecordList_20308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryRecordList_20308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryRecordList_20308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneLotteryRecordList_20308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneLotteryRecordList_20308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneLotteryRecordList_20308> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneLotteryRecordList_20308> getParserForType() {
         return PARSER;
      }

      public S2C_RuneLotteryRecordList_20308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneLotteryRecordList_20308OrBuilder {
         private int bitField0_;
         private int type_;
         private List<RuneLotteryRecordData> recordList_;
         private RepeatedFieldBuilderV3<RuneLotteryRecordData, RuneLotteryRecordData.Builder, RuneLotteryRecordDataOrBuilder> recordListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLotteryRecordList_20308.class, Builder.class);
         }

         private Builder() {
            this.recordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RuneLotteryRecordList_20308.alwaysUseFieldBuilders) {
               this.getRecordListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.recordListBuilder_ == null) {
               this.recordList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.recordListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecordList_20308_descriptor;
         }

         public S2C_RuneLotteryRecordList_20308 getDefaultInstanceForType() {
            return RuneMsg.S2C_RuneLotteryRecordList_20308.getDefaultInstance();
         }

         public S2C_RuneLotteryRecordList_20308 build() {
            S2C_RuneLotteryRecordList_20308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneLotteryRecordList_20308 buildPartial() {
            S2C_RuneLotteryRecordList_20308 result = new S2C_RuneLotteryRecordList_20308(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if (this.recordListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.recordList_ = Collections.unmodifiableList(this.recordList_);
                  this.bitField0_ &= -3;
               }

               result.recordList_ = this.recordList_;
            } else {
               result.recordList_ = this.recordListBuilder_.build();
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
            if (other instanceof S2C_RuneLotteryRecordList_20308) {
               return this.mergeFrom((S2C_RuneLotteryRecordList_20308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneLotteryRecordList_20308 other) {
            if (other == RuneMsg.S2C_RuneLotteryRecordList_20308.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.recordListBuilder_ == null) {
                  if (!other.recordList_.isEmpty()) {
                     if (this.recordList_.isEmpty()) {
                        this.recordList_ = other.recordList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRecordListIsMutable();
                        this.recordList_.addAll(other.recordList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recordList_.isEmpty()) {
                  if (this.recordListBuilder_.isEmpty()) {
                     this.recordListBuilder_.dispose();
                     this.recordListBuilder_ = null;
                     this.recordList_ = other.recordList_;
                     this.bitField0_ &= -3;
                     this.recordListBuilder_ = RuneMsg.S2C_RuneLotteryRecordList_20308.alwaysUseFieldBuilders ? this.getRecordListFieldBuilder() : null;
                  } else {
                     this.recordListBuilder_.addAllMessages(other.recordList_);
                  }
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
               for(int i = 0; i < this.getRecordListCount(); ++i) {
                  if (!this.getRecordList(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneLotteryRecordList_20308 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneLotteryRecordList_20308)RuneMsg.S2C_RuneLotteryRecordList_20308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneLotteryRecordList_20308)e.getUnfinishedMessage();
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

         private void ensureRecordListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.recordList_ = new ArrayList(this.recordList_);
               this.bitField0_ |= 2;
            }

         }

         public List<RuneLotteryRecordData> getRecordListList() {
            return this.recordListBuilder_ == null ? Collections.unmodifiableList(this.recordList_) : this.recordListBuilder_.getMessageList();
         }

         public int getRecordListCount() {
            return this.recordListBuilder_ == null ? this.recordList_.size() : this.recordListBuilder_.getCount();
         }

         public RuneLotteryRecordData getRecordList(int index) {
            return this.recordListBuilder_ == null ? (RuneLotteryRecordData)this.recordList_.get(index) : (RuneLotteryRecordData)this.recordListBuilder_.getMessage(index);
         }

         public Builder setRecordList(int index, RuneLotteryRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.set(index, value);
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecordList(int index, RuneLotteryRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(RuneLotteryRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.add(value);
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecordList(int index, RuneLotteryRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.add(index, value);
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecordList(RuneLotteryRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(int index, RuneLotteryRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordList(Iterable<? extends RuneLotteryRecordData> values) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recordList_);
               this.onChanged();
            } else {
               this.recordListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecordList() {
            if (this.recordListBuilder_ == null) {
               this.recordList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.recordListBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecordList(int index) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.remove(index);
               this.onChanged();
            } else {
               this.recordListBuilder_.remove(index);
            }

            return this;
         }

         public RuneLotteryRecordData.Builder getRecordListBuilder(int index) {
            return (RuneLotteryRecordData.Builder)this.getRecordListFieldBuilder().getBuilder(index);
         }

         public RuneLotteryRecordDataOrBuilder getRecordListOrBuilder(int index) {
            return this.recordListBuilder_ == null ? (RuneLotteryRecordDataOrBuilder)this.recordList_.get(index) : (RuneLotteryRecordDataOrBuilder)this.recordListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RuneLotteryRecordDataOrBuilder> getRecordListOrBuilderList() {
            return this.recordListBuilder_ != null ? this.recordListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordList_);
         }

         public RuneLotteryRecordData.Builder addRecordListBuilder() {
            return (RuneLotteryRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(RuneMsg.RuneLotteryRecordData.getDefaultInstance());
         }

         public RuneLotteryRecordData.Builder addRecordListBuilder(int index) {
            return (RuneLotteryRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(index, RuneMsg.RuneLotteryRecordData.getDefaultInstance());
         }

         public List<RuneLotteryRecordData.Builder> getRecordListBuilderList() {
            return this.getRecordListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RuneLotteryRecordData, RuneLotteryRecordData.Builder, RuneLotteryRecordDataOrBuilder> getRecordListFieldBuilder() {
            if (this.recordListBuilder_ == null) {
               this.recordListBuilder_ = new RepeatedFieldBuilderV3(this.recordList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.recordList_ = null;
            }

            return this.recordListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_RuneLotteryRecord_20309 extends GeneratedMessageV3 implements S2C_RuneLotteryRecord_20309OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDLIST_FIELD_NUMBER = 1;
      private List<RuneLotteryRecordData> recordList_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneLotteryRecord_20309 DEFAULT_INSTANCE = new S2C_RuneLotteryRecord_20309();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneLotteryRecord_20309> PARSER = new AbstractParser<S2C_RuneLotteryRecord_20309>() {
         public S2C_RuneLotteryRecord_20309 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneLotteryRecord_20309(input, extensionRegistry);
         }
      };

      private S2C_RuneLotteryRecord_20309(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneLotteryRecord_20309() {
         this.memoizedIsInitialized = -1;
         this.recordList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneLotteryRecord_20309();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneLotteryRecord_20309(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.recordList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recordList_.add(input.readMessage(RuneMsg.RuneLotteryRecordData.PARSER, extensionRegistry));
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
                  this.recordList_ = Collections.unmodifiableList(this.recordList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLotteryRecord_20309.class, Builder.class);
      }

      public List<RuneLotteryRecordData> getRecordListList() {
         return this.recordList_;
      }

      public List<? extends RuneLotteryRecordDataOrBuilder> getRecordListOrBuilderList() {
         return this.recordList_;
      }

      public int getRecordListCount() {
         return this.recordList_.size();
      }

      public RuneLotteryRecordData getRecordList(int index) {
         return (RuneLotteryRecordData)this.recordList_.get(index);
      }

      public RuneLotteryRecordDataOrBuilder getRecordListOrBuilder(int index) {
         return (RuneLotteryRecordDataOrBuilder)this.recordList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRecordListCount(); ++i) {
               if (!this.getRecordList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.recordList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.recordList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.recordList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.recordList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneLotteryRecord_20309)) {
            return super.equals(obj);
         } else {
            S2C_RuneLotteryRecord_20309 other = (S2C_RuneLotteryRecord_20309)obj;
            if (!this.getRecordListList().equals(other.getRecordListList())) {
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
            if (this.getRecordListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecord_20309)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecord_20309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecord_20309)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecord_20309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecord_20309)PARSER.parseFrom(data);
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLotteryRecord_20309)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneLotteryRecord_20309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryRecord_20309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLotteryRecord_20309 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneLotteryRecord_20309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryRecord_20309 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryRecord_20309)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneLotteryRecord_20309)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLotteryRecord_20309 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLotteryRecord_20309)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneLotteryRecord_20309 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneLotteryRecord_20309 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneLotteryRecord_20309> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneLotteryRecord_20309> getParserForType() {
         return PARSER;
      }

      public S2C_RuneLotteryRecord_20309 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneLotteryRecord_20309OrBuilder {
         private int bitField0_;
         private List<RuneLotteryRecordData> recordList_;
         private RepeatedFieldBuilderV3<RuneLotteryRecordData, RuneLotteryRecordData.Builder, RuneLotteryRecordDataOrBuilder> recordListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLotteryRecord_20309.class, Builder.class);
         }

         private Builder() {
            this.recordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RuneLotteryRecord_20309.alwaysUseFieldBuilders) {
               this.getRecordListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordListBuilder_ == null) {
               this.recordList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.recordListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLotteryRecord_20309_descriptor;
         }

         public S2C_RuneLotteryRecord_20309 getDefaultInstanceForType() {
            return RuneMsg.S2C_RuneLotteryRecord_20309.getDefaultInstance();
         }

         public S2C_RuneLotteryRecord_20309 build() {
            S2C_RuneLotteryRecord_20309 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneLotteryRecord_20309 buildPartial() {
            S2C_RuneLotteryRecord_20309 result = new S2C_RuneLotteryRecord_20309(this);
            int from_bitField0_ = this.bitField0_;
            if (this.recordListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.recordList_ = Collections.unmodifiableList(this.recordList_);
                  this.bitField0_ &= -2;
               }

               result.recordList_ = this.recordList_;
            } else {
               result.recordList_ = this.recordListBuilder_.build();
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
            if (other instanceof S2C_RuneLotteryRecord_20309) {
               return this.mergeFrom((S2C_RuneLotteryRecord_20309)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneLotteryRecord_20309 other) {
            if (other == RuneMsg.S2C_RuneLotteryRecord_20309.getDefaultInstance()) {
               return this;
            } else {
               if (this.recordListBuilder_ == null) {
                  if (!other.recordList_.isEmpty()) {
                     if (this.recordList_.isEmpty()) {
                        this.recordList_ = other.recordList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRecordListIsMutable();
                        this.recordList_.addAll(other.recordList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recordList_.isEmpty()) {
                  if (this.recordListBuilder_.isEmpty()) {
                     this.recordListBuilder_.dispose();
                     this.recordListBuilder_ = null;
                     this.recordList_ = other.recordList_;
                     this.bitField0_ &= -2;
                     this.recordListBuilder_ = RuneMsg.S2C_RuneLotteryRecord_20309.alwaysUseFieldBuilders ? this.getRecordListFieldBuilder() : null;
                  } else {
                     this.recordListBuilder_.addAllMessages(other.recordList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRecordListCount(); ++i) {
               if (!this.getRecordList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneLotteryRecord_20309 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneLotteryRecord_20309)RuneMsg.S2C_RuneLotteryRecord_20309.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneLotteryRecord_20309)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recordList_ = new ArrayList(this.recordList_);
               this.bitField0_ |= 1;
            }

         }

         public List<RuneLotteryRecordData> getRecordListList() {
            return this.recordListBuilder_ == null ? Collections.unmodifiableList(this.recordList_) : this.recordListBuilder_.getMessageList();
         }

         public int getRecordListCount() {
            return this.recordListBuilder_ == null ? this.recordList_.size() : this.recordListBuilder_.getCount();
         }

         public RuneLotteryRecordData getRecordList(int index) {
            return this.recordListBuilder_ == null ? (RuneLotteryRecordData)this.recordList_.get(index) : (RuneLotteryRecordData)this.recordListBuilder_.getMessage(index);
         }

         public Builder setRecordList(int index, RuneLotteryRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.set(index, value);
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecordList(int index, RuneLotteryRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(RuneLotteryRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.add(value);
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecordList(int index, RuneLotteryRecordData value) {
            if (this.recordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordListIsMutable();
               this.recordList_.add(index, value);
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecordList(RuneLotteryRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(int index, RuneLotteryRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordList(Iterable<? extends RuneLotteryRecordData> values) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recordList_);
               this.onChanged();
            } else {
               this.recordListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecordList() {
            if (this.recordListBuilder_ == null) {
               this.recordList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.recordListBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecordList(int index) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.remove(index);
               this.onChanged();
            } else {
               this.recordListBuilder_.remove(index);
            }

            return this;
         }

         public RuneLotteryRecordData.Builder getRecordListBuilder(int index) {
            return (RuneLotteryRecordData.Builder)this.getRecordListFieldBuilder().getBuilder(index);
         }

         public RuneLotteryRecordDataOrBuilder getRecordListOrBuilder(int index) {
            return this.recordListBuilder_ == null ? (RuneLotteryRecordDataOrBuilder)this.recordList_.get(index) : (RuneLotteryRecordDataOrBuilder)this.recordListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RuneLotteryRecordDataOrBuilder> getRecordListOrBuilderList() {
            return this.recordListBuilder_ != null ? this.recordListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordList_);
         }

         public RuneLotteryRecordData.Builder addRecordListBuilder() {
            return (RuneLotteryRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(RuneMsg.RuneLotteryRecordData.getDefaultInstance());
         }

         public RuneLotteryRecordData.Builder addRecordListBuilder(int index) {
            return (RuneLotteryRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(index, RuneMsg.RuneLotteryRecordData.getDefaultInstance());
         }

         public List<RuneLotteryRecordData.Builder> getRecordListBuilderList() {
            return this.getRecordListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RuneLotteryRecordData, RuneLotteryRecordData.Builder, RuneLotteryRecordDataOrBuilder> getRecordListFieldBuilder() {
            if (this.recordListBuilder_ == null) {
               this.recordListBuilder_ = new RepeatedFieldBuilderV3(this.recordList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.recordList_ = null;
            }

            return this.recordListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class RuneLotteryRecordData extends GeneratedMessageV3 implements RuneLotteryRecordDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int RESOURCETYPE_FIELD_NUMBER = 3;
      private int resourceType_;
      public static final int RESOURCEID_FIELD_NUMBER = 4;
      private int resourceId_;
      public static final int RESOURCENUM_FIELD_NUMBER = 5;
      private int resourceNum_;
      private byte memoizedIsInitialized;
      private static final RuneLotteryRecordData DEFAULT_INSTANCE = new RuneLotteryRecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RuneLotteryRecordData> PARSER = new AbstractParser<RuneLotteryRecordData>() {
         public RuneLotteryRecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RuneLotteryRecordData(input, extensionRegistry);
         }
      };

      private RuneLotteryRecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RuneLotteryRecordData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RuneLotteryRecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RuneLotteryRecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.resourceType_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.resourceId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.resourceNum_ = input.readInt32();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(RuneLotteryRecordData.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
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

      public boolean hasResourceType() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getResourceType() {
         return this.resourceType_;
      }

      public boolean hasResourceId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getResourceId() {
         return this.resourceId_;
      }

      public boolean hasResourceNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getResourceNum() {
         return this.resourceNum_;
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
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResourceType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResourceId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResourceNum()) {
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
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.resourceType_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.resourceId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.resourceNum_);
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
               size += GeneratedMessageV3.computeStringSize(2, this.playerName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.resourceType_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.resourceId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.resourceNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RuneLotteryRecordData)) {
            return super.equals(obj);
         } else {
            RuneLotteryRecordData other = (RuneLotteryRecordData)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasResourceType() != other.hasResourceType()) {
               return false;
            } else if (this.hasResourceType() && this.getResourceType() != other.getResourceType()) {
               return false;
            } else if (this.hasResourceId() != other.hasResourceId()) {
               return false;
            } else if (this.hasResourceId() && this.getResourceId() != other.getResourceId()) {
               return false;
            } else if (this.hasResourceNum() != other.hasResourceNum()) {
               return false;
            } else if (this.hasResourceNum() && this.getResourceNum() != other.getResourceNum()) {
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

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasResourceType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getResourceType();
            }

            if (this.hasResourceId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResourceId();
            }

            if (this.hasResourceNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getResourceNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RuneLotteryRecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RuneLotteryRecordData)PARSER.parseFrom(data);
      }

      public static RuneLotteryRecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RuneLotteryRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RuneLotteryRecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RuneLotteryRecordData)PARSER.parseFrom(data);
      }

      public static RuneLotteryRecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RuneLotteryRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RuneLotteryRecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RuneLotteryRecordData)PARSER.parseFrom(data);
      }

      public static RuneLotteryRecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RuneLotteryRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RuneLotteryRecordData parseFrom(InputStream input) throws IOException {
         return (RuneLotteryRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RuneLotteryRecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RuneLotteryRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RuneLotteryRecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (RuneLotteryRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RuneLotteryRecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RuneLotteryRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RuneLotteryRecordData parseFrom(CodedInputStream input) throws IOException {
         return (RuneLotteryRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RuneLotteryRecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RuneLotteryRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RuneLotteryRecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RuneLotteryRecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RuneLotteryRecordData> parser() {
         return PARSER;
      }

      public Parser<RuneLotteryRecordData> getParserForType() {
         return PARSER;
      }

      public RuneLotteryRecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RuneLotteryRecordDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int resourceType_;
         private int resourceId_;
         private int resourceNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(RuneLotteryRecordData.class, Builder.class);
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
            if (RuneMsg.RuneLotteryRecordData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.resourceType_ = 0;
            this.bitField0_ &= -5;
            this.resourceId_ = 0;
            this.bitField0_ &= -9;
            this.resourceNum_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_RuneLotteryRecordData_descriptor;
         }

         public RuneLotteryRecordData getDefaultInstanceForType() {
            return RuneMsg.RuneLotteryRecordData.getDefaultInstance();
         }

         public RuneLotteryRecordData build() {
            RuneLotteryRecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RuneLotteryRecordData buildPartial() {
            RuneLotteryRecordData result = new RuneLotteryRecordData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 4) != 0) {
               result.resourceType_ = this.resourceType_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.resourceId_ = this.resourceId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.resourceNum_ = this.resourceNum_;
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
            if (other instanceof RuneLotteryRecordData) {
               return this.mergeFrom((RuneLotteryRecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RuneLotteryRecordData other) {
            if (other == RuneMsg.RuneLotteryRecordData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 2;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasResourceType()) {
                  this.setResourceType(other.getResourceType());
               }

               if (other.hasResourceId()) {
                  this.setResourceId(other.getResourceId());
               }

               if (other.hasResourceNum()) {
                  this.setResourceNum(other.getResourceNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasResourceType()) {
               return false;
            } else if (!this.hasResourceId()) {
               return false;
            } else {
               return this.hasResourceNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RuneLotteryRecordData parsedMessage = null;

            try {
               parsedMessage = (RuneLotteryRecordData)RuneMsg.RuneLotteryRecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RuneLotteryRecordData)e.getUnfinishedMessage();
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
            this.playerName_ = RuneMsg.RuneLotteryRecordData.getDefaultInstance().getPlayerName();
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

         public boolean hasResourceType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResourceType() {
            return this.resourceType_;
         }

         public Builder setResourceType(int value) {
            this.bitField0_ |= 4;
            this.resourceType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResourceType() {
            this.bitField0_ &= -5;
            this.resourceType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResourceId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getResourceId() {
            return this.resourceId_;
         }

         public Builder setResourceId(int value) {
            this.bitField0_ |= 8;
            this.resourceId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResourceId() {
            this.bitField0_ &= -9;
            this.resourceId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResourceNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getResourceNum() {
            return this.resourceNum_;
         }

         public Builder setResourceNum(int value) {
            this.bitField0_ |= 16;
            this.resourceNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResourceNum() {
            this.bitField0_ &= -17;
            this.resourceNum_ = 0;
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

   public static final class C2S_RuneAndRefineInfo_20310 extends GeneratedMessageV3 implements C2S_RuneAndRefineInfo_20310OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneAndRefineInfo_20310 DEFAULT_INSTANCE = new C2S_RuneAndRefineInfo_20310();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneAndRefineInfo_20310> PARSER = new AbstractParser<C2S_RuneAndRefineInfo_20310>() {
         public C2S_RuneAndRefineInfo_20310 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneAndRefineInfo_20310(input, extensionRegistry);
         }
      };

      private C2S_RuneAndRefineInfo_20310(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneAndRefineInfo_20310() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneAndRefineInfo_20310();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneAndRefineInfo_20310(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneAndRefineInfo_20310.class, Builder.class);
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
            output.writeInt32(1, this.heroCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RuneAndRefineInfo_20310)) {
            return super.equals(obj);
         } else {
            C2S_RuneAndRefineInfo_20310 other = (C2S_RuneAndRefineInfo_20310)obj;
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneAndRefineInfo_20310)PARSER.parseFrom(data);
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneAndRefineInfo_20310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneAndRefineInfo_20310)PARSER.parseFrom(data);
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneAndRefineInfo_20310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneAndRefineInfo_20310)PARSER.parseFrom(data);
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneAndRefineInfo_20310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneAndRefineInfo_20310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneAndRefineInfo_20310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneAndRefineInfo_20310 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneAndRefineInfo_20310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneAndRefineInfo_20310 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneAndRefineInfo_20310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneAndRefineInfo_20310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneAndRefineInfo_20310 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneAndRefineInfo_20310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneAndRefineInfo_20310 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneAndRefineInfo_20310 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneAndRefineInfo_20310> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneAndRefineInfo_20310> getParserForType() {
         return PARSER;
      }

      public C2S_RuneAndRefineInfo_20310 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneAndRefineInfo_20310OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneAndRefineInfo_20310.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RuneAndRefineInfo_20310.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneAndRefineInfo_20310_descriptor;
         }

         public C2S_RuneAndRefineInfo_20310 getDefaultInstanceForType() {
            return RuneMsg.C2S_RuneAndRefineInfo_20310.getDefaultInstance();
         }

         public C2S_RuneAndRefineInfo_20310 build() {
            C2S_RuneAndRefineInfo_20310 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneAndRefineInfo_20310 buildPartial() {
            C2S_RuneAndRefineInfo_20310 result = new C2S_RuneAndRefineInfo_20310(this);
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
            if (other instanceof C2S_RuneAndRefineInfo_20310) {
               return this.mergeFrom((C2S_RuneAndRefineInfo_20310)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneAndRefineInfo_20310 other) {
            if (other == RuneMsg.C2S_RuneAndRefineInfo_20310.getDefaultInstance()) {
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
            C2S_RuneAndRefineInfo_20310 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneAndRefineInfo_20310)RuneMsg.C2S_RuneAndRefineInfo_20310.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneAndRefineInfo_20310)e.getUnfinishedMessage();
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

   public static final class S2C_RuneAndRefineInfo_20311 extends GeneratedMessageV3 implements S2C_RuneAndRefineInfo_20311OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int RUNEANDREFINEINFO_FIELD_NUMBER = 2;
      private CommonMsg.RuneAndRefineInfo runeAndRefineInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_RuneAndRefineInfo_20311 DEFAULT_INSTANCE = new S2C_RuneAndRefineInfo_20311();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneAndRefineInfo_20311> PARSER = new AbstractParser<S2C_RuneAndRefineInfo_20311>() {
         public S2C_RuneAndRefineInfo_20311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneAndRefineInfo_20311(input, extensionRegistry);
         }
      };

      private S2C_RuneAndRefineInfo_20311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneAndRefineInfo_20311() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneAndRefineInfo_20311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneAndRefineInfo_20311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.RuneAndRefineInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.runeAndRefineInfo_.toBuilder();
                        }

                        this.runeAndRefineInfo_ = (CommonMsg.RuneAndRefineInfo)input.readMessage(CommonMsg.RuneAndRefineInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.runeAndRefineInfo_);
                           this.runeAndRefineInfo_ = subBuilder.buildPartial();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneAndRefineInfo_20311.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasRuneAndRefineInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RuneAndRefineInfo getRuneAndRefineInfo() {
         return this.runeAndRefineInfo_ == null ? CommonMsg.RuneAndRefineInfo.getDefaultInstance() : this.runeAndRefineInfo_;
      }

      public CommonMsg.RuneAndRefineInfoOrBuilder getRuneAndRefineInfoOrBuilder() {
         return this.runeAndRefineInfo_ == null ? CommonMsg.RuneAndRefineInfo.getDefaultInstance() : this.runeAndRefineInfo_;
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
         } else if (this.hasRuneAndRefineInfo() && !this.getRuneAndRefineInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getRuneAndRefineInfo());
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getRuneAndRefineInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RuneAndRefineInfo_20311)) {
            return super.equals(obj);
         } else {
            S2C_RuneAndRefineInfo_20311 other = (S2C_RuneAndRefineInfo_20311)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasRuneAndRefineInfo() != other.hasRuneAndRefineInfo()) {
               return false;
            } else if (this.hasRuneAndRefineInfo() && !this.getRuneAndRefineInfo().equals(other.getRuneAndRefineInfo())) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasRuneAndRefineInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRuneAndRefineInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneAndRefineInfo_20311)PARSER.parseFrom(data);
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneAndRefineInfo_20311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneAndRefineInfo_20311)PARSER.parseFrom(data);
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneAndRefineInfo_20311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneAndRefineInfo_20311)PARSER.parseFrom(data);
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneAndRefineInfo_20311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneAndRefineInfo_20311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneAndRefineInfo_20311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneAndRefineInfo_20311 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneAndRefineInfo_20311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneAndRefineInfo_20311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneAndRefineInfo_20311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneAndRefineInfo_20311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneAndRefineInfo_20311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneAndRefineInfo_20311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneAndRefineInfo_20311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneAndRefineInfo_20311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneAndRefineInfo_20311> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneAndRefineInfo_20311> getParserForType() {
         return PARSER;
      }

      public S2C_RuneAndRefineInfo_20311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneAndRefineInfo_20311OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private CommonMsg.RuneAndRefineInfo runeAndRefineInfo_;
         private SingleFieldBuilderV3<CommonMsg.RuneAndRefineInfo, CommonMsg.RuneAndRefineInfo.Builder, CommonMsg.RuneAndRefineInfoOrBuilder> runeAndRefineInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneAndRefineInfo_20311.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RuneAndRefineInfo_20311.alwaysUseFieldBuilders) {
               this.getRuneAndRefineInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.runeAndRefineInfoBuilder_ == null) {
               this.runeAndRefineInfo_ = null;
            } else {
               this.runeAndRefineInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneAndRefineInfo_20311_descriptor;
         }

         public S2C_RuneAndRefineInfo_20311 getDefaultInstanceForType() {
            return RuneMsg.S2C_RuneAndRefineInfo_20311.getDefaultInstance();
         }

         public S2C_RuneAndRefineInfo_20311 build() {
            S2C_RuneAndRefineInfo_20311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneAndRefineInfo_20311 buildPartial() {
            S2C_RuneAndRefineInfo_20311 result = new S2C_RuneAndRefineInfo_20311(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.runeAndRefineInfoBuilder_ == null) {
                  result.runeAndRefineInfo_ = this.runeAndRefineInfo_;
               } else {
                  result.runeAndRefineInfo_ = (CommonMsg.RuneAndRefineInfo)this.runeAndRefineInfoBuilder_.build();
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
            if (other instanceof S2C_RuneAndRefineInfo_20311) {
               return this.mergeFrom((S2C_RuneAndRefineInfo_20311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneAndRefineInfo_20311 other) {
            if (other == RuneMsg.S2C_RuneAndRefineInfo_20311.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasRuneAndRefineInfo()) {
                  this.mergeRuneAndRefineInfo(other.getRuneAndRefineInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return !this.hasRuneAndRefineInfo() || this.getRuneAndRefineInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RuneAndRefineInfo_20311 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneAndRefineInfo_20311)RuneMsg.S2C_RuneAndRefineInfo_20311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneAndRefineInfo_20311)e.getUnfinishedMessage();
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

         public boolean hasRuneAndRefineInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RuneAndRefineInfo getRuneAndRefineInfo() {
            if (this.runeAndRefineInfoBuilder_ == null) {
               return this.runeAndRefineInfo_ == null ? CommonMsg.RuneAndRefineInfo.getDefaultInstance() : this.runeAndRefineInfo_;
            } else {
               return (CommonMsg.RuneAndRefineInfo)this.runeAndRefineInfoBuilder_.getMessage();
            }
         }

         public Builder setRuneAndRefineInfo(CommonMsg.RuneAndRefineInfo value) {
            if (this.runeAndRefineInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.runeAndRefineInfo_ = value;
               this.onChanged();
            } else {
               this.runeAndRefineInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setRuneAndRefineInfo(CommonMsg.RuneAndRefineInfo.Builder builderForValue) {
            if (this.runeAndRefineInfoBuilder_ == null) {
               this.runeAndRefineInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.runeAndRefineInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeRuneAndRefineInfo(CommonMsg.RuneAndRefineInfo value) {
            if (this.runeAndRefineInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.runeAndRefineInfo_ != null && this.runeAndRefineInfo_ != CommonMsg.RuneAndRefineInfo.getDefaultInstance()) {
                  this.runeAndRefineInfo_ = CommonMsg.RuneAndRefineInfo.newBuilder(this.runeAndRefineInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.runeAndRefineInfo_ = value;
               }

               this.onChanged();
            } else {
               this.runeAndRefineInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearRuneAndRefineInfo() {
            if (this.runeAndRefineInfoBuilder_ == null) {
               this.runeAndRefineInfo_ = null;
               this.onChanged();
            } else {
               this.runeAndRefineInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.RuneAndRefineInfo.Builder getRuneAndRefineInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.RuneAndRefineInfo.Builder)this.getRuneAndRefineInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.RuneAndRefineInfoOrBuilder getRuneAndRefineInfoOrBuilder() {
            if (this.runeAndRefineInfoBuilder_ != null) {
               return (CommonMsg.RuneAndRefineInfoOrBuilder)this.runeAndRefineInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.runeAndRefineInfo_ == null ? CommonMsg.RuneAndRefineInfo.getDefaultInstance() : this.runeAndRefineInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.RuneAndRefineInfo, CommonMsg.RuneAndRefineInfo.Builder, CommonMsg.RuneAndRefineInfoOrBuilder> getRuneAndRefineInfoFieldBuilder() {
            if (this.runeAndRefineInfoBuilder_ == null) {
               this.runeAndRefineInfoBuilder_ = new SingleFieldBuilderV3(this.getRuneAndRefineInfo(), this.getParentForChildren(), this.isClean());
               this.runeAndRefineInfo_ = null;
            }

            return this.runeAndRefineInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WearRune_20312 extends GeneratedMessageV3 implements C2S_WearRune_20312OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_WearRune_20312 DEFAULT_INSTANCE = new C2S_WearRune_20312();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WearRune_20312> PARSER = new AbstractParser<C2S_WearRune_20312>() {
         public C2S_WearRune_20312 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WearRune_20312(input, extensionRegistry);
         }
      };

      private C2S_WearRune_20312(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WearRune_20312() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WearRune_20312();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WearRune_20312(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.position_ = rawValue;
                        }
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearRune_20312.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
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
         } else if (!this.hasItemCode()) {
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WearRune_20312)) {
            return super.equals(obj);
         } else {
            C2S_WearRune_20312 other = (C2S_WearRune_20312)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WearRune_20312 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WearRune_20312)PARSER.parseFrom(data);
      }

      public static C2S_WearRune_20312 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearRune_20312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearRune_20312 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WearRune_20312)PARSER.parseFrom(data);
      }

      public static C2S_WearRune_20312 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearRune_20312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearRune_20312 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WearRune_20312)PARSER.parseFrom(data);
      }

      public static C2S_WearRune_20312 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearRune_20312)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearRune_20312 parseFrom(InputStream input) throws IOException {
         return (C2S_WearRune_20312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearRune_20312 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearRune_20312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearRune_20312 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WearRune_20312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WearRune_20312 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearRune_20312)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearRune_20312 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WearRune_20312)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearRune_20312 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearRune_20312)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WearRune_20312 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WearRune_20312 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WearRune_20312> parser() {
         return PARSER;
      }

      public Parser<C2S_WearRune_20312> getParserForType() {
         return PARSER;
      }

      public C2S_WearRune_20312 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WearRune_20312OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearRune_20312.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_WearRune_20312.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_WearRune_20312_descriptor;
         }

         public C2S_WearRune_20312 getDefaultInstanceForType() {
            return RuneMsg.C2S_WearRune_20312.getDefaultInstance();
         }

         public C2S_WearRune_20312 build() {
            C2S_WearRune_20312 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WearRune_20312 buildPartial() {
            C2S_WearRune_20312 result = new C2S_WearRune_20312(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_WearRune_20312) {
               return this.mergeFrom((C2S_WearRune_20312)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WearRune_20312 other) {
            if (other == RuneMsg.C2S_WearRune_20312.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
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
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasItemCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WearRune_20312 parsedMessage = null;

            try {
               parsedMessage = (C2S_WearRune_20312)RuneMsg.C2S_WearRune_20312.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WearRune_20312)e.getUnfinishedMessage();
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

         public boolean hasItemCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 2;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -5;
            this.position_ = 1;
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

   public static final class S2C_WearRune_20313 extends GeneratedMessageV3 implements S2C_WearRune_20313OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int ITEMCODE_FIELD_NUMBER = 3;
      private int itemCode_;
      public static final int CALLREPLACELV_FIELD_NUMBER = 4;
      private boolean callReplaceLv_;
      private byte memoizedIsInitialized;
      private static final S2C_WearRune_20313 DEFAULT_INSTANCE = new S2C_WearRune_20313();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WearRune_20313> PARSER = new AbstractParser<S2C_WearRune_20313>() {
         public S2C_WearRune_20313 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WearRune_20313(input, extensionRegistry);
         }
      };

      private S2C_WearRune_20313(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WearRune_20313() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WearRune_20313();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WearRune_20313(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.callReplaceLv_ = input.readBool();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearRune_20313.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasCallReplaceLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getCallReplaceLv() {
         return this.callReplaceLv_;
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.callReplaceLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.itemCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.callReplaceLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WearRune_20313)) {
            return super.equals(obj);
         } else {
            S2C_WearRune_20313 other = (S2C_WearRune_20313)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasCallReplaceLv() != other.hasCallReplaceLv()) {
               return false;
            } else if (this.hasCallReplaceLv() && this.getCallReplaceLv() != other.getCallReplaceLv()) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasCallReplaceLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getCallReplaceLv());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WearRune_20313 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WearRune_20313)PARSER.parseFrom(data);
      }

      public static S2C_WearRune_20313 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearRune_20313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearRune_20313 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WearRune_20313)PARSER.parseFrom(data);
      }

      public static S2C_WearRune_20313 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearRune_20313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearRune_20313 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WearRune_20313)PARSER.parseFrom(data);
      }

      public static S2C_WearRune_20313 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearRune_20313)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearRune_20313 parseFrom(InputStream input) throws IOException {
         return (S2C_WearRune_20313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearRune_20313 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearRune_20313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearRune_20313 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WearRune_20313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WearRune_20313 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearRune_20313)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearRune_20313 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WearRune_20313)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearRune_20313 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearRune_20313)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WearRune_20313 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WearRune_20313 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WearRune_20313> parser() {
         return PARSER;
      }

      public Parser<S2C_WearRune_20313> getParserForType() {
         return PARSER;
      }

      public S2C_WearRune_20313 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WearRune_20313OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int itemCode_;
         private boolean callReplaceLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearRune_20313.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_WearRune_20313.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.bitField0_ &= -5;
            this.callReplaceLv_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_WearRune_20313_descriptor;
         }

         public S2C_WearRune_20313 getDefaultInstanceForType() {
            return RuneMsg.S2C_WearRune_20313.getDefaultInstance();
         }

         public S2C_WearRune_20313 build() {
            S2C_WearRune_20313 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WearRune_20313 buildPartial() {
            S2C_WearRune_20313 result = new S2C_WearRune_20313(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 4) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.callReplaceLv_ = this.callReplaceLv_;
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
            if (other instanceof S2C_WearRune_20313) {
               return this.mergeFrom((S2C_WearRune_20313)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WearRune_20313 other) {
            if (other == RuneMsg.S2C_WearRune_20313.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasCallReplaceLv()) {
                  this.setCallReplaceLv(other.getCallReplaceLv());
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
            S2C_WearRune_20313 parsedMessage = null;

            try {
               parsedMessage = (S2C_WearRune_20313)RuneMsg.S2C_WearRune_20313.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WearRune_20313)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 4;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -5;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCallReplaceLv() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getCallReplaceLv() {
            return this.callReplaceLv_;
         }

         public Builder setCallReplaceLv(boolean value) {
            this.bitField0_ |= 8;
            this.callReplaceLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCallReplaceLv() {
            this.bitField0_ &= -9;
            this.callReplaceLv_ = false;
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

   public static final class C2S_UndressRune_20314 extends GeneratedMessageV3 implements C2S_UndressRune_20314OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_UndressRune_20314 DEFAULT_INSTANCE = new C2S_UndressRune_20314();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UndressRune_20314> PARSER = new AbstractParser<C2S_UndressRune_20314>() {
         public C2S_UndressRune_20314 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UndressRune_20314(input, extensionRegistry);
         }
      };

      private C2S_UndressRune_20314(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UndressRune_20314() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UndressRune_20314();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UndressRune_20314(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressRune_20314.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UndressRune_20314)) {
            return super.equals(obj);
         } else {
            C2S_UndressRune_20314 other = (C2S_UndressRune_20314)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UndressRune_20314 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UndressRune_20314)PARSER.parseFrom(data);
      }

      public static C2S_UndressRune_20314 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressRune_20314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressRune_20314 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UndressRune_20314)PARSER.parseFrom(data);
      }

      public static C2S_UndressRune_20314 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressRune_20314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressRune_20314 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UndressRune_20314)PARSER.parseFrom(data);
      }

      public static C2S_UndressRune_20314 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressRune_20314)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressRune_20314 parseFrom(InputStream input) throws IOException {
         return (C2S_UndressRune_20314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressRune_20314 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressRune_20314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressRune_20314 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UndressRune_20314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UndressRune_20314 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressRune_20314)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressRune_20314 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UndressRune_20314)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressRune_20314 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressRune_20314)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UndressRune_20314 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UndressRune_20314 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UndressRune_20314> parser() {
         return PARSER;
      }

      public Parser<C2S_UndressRune_20314> getParserForType() {
         return PARSER;
      }

      public C2S_UndressRune_20314 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UndressRune_20314OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressRune_20314.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_UndressRune_20314.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UndressRune_20314_descriptor;
         }

         public C2S_UndressRune_20314 getDefaultInstanceForType() {
            return RuneMsg.C2S_UndressRune_20314.getDefaultInstance();
         }

         public C2S_UndressRune_20314 build() {
            C2S_UndressRune_20314 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UndressRune_20314 buildPartial() {
            C2S_UndressRune_20314 result = new C2S_UndressRune_20314(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_UndressRune_20314) {
               return this.mergeFrom((C2S_UndressRune_20314)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UndressRune_20314 other) {
            if (other == RuneMsg.C2S_UndressRune_20314.getDefaultInstance()) {
               return this;
            } else {
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
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UndressRune_20314 parsedMessage = null;

            try {
               parsedMessage = (C2S_UndressRune_20314)RuneMsg.C2S_UndressRune_20314.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UndressRune_20314)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
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

   public static final class S2C_UndressRune_20315 extends GeneratedMessageV3 implements S2C_UndressRune_20315OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final S2C_UndressRune_20315 DEFAULT_INSTANCE = new S2C_UndressRune_20315();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UndressRune_20315> PARSER = new AbstractParser<S2C_UndressRune_20315>() {
         public S2C_UndressRune_20315 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UndressRune_20315(input, extensionRegistry);
         }
      };

      private S2C_UndressRune_20315(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UndressRune_20315() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UndressRune_20315();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UndressRune_20315(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressRune_20315.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UndressRune_20315)) {
            return super.equals(obj);
         } else {
            S2C_UndressRune_20315 other = (S2C_UndressRune_20315)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UndressRune_20315 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UndressRune_20315)PARSER.parseFrom(data);
      }

      public static S2C_UndressRune_20315 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressRune_20315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressRune_20315 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UndressRune_20315)PARSER.parseFrom(data);
      }

      public static S2C_UndressRune_20315 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressRune_20315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressRune_20315 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UndressRune_20315)PARSER.parseFrom(data);
      }

      public static S2C_UndressRune_20315 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressRune_20315)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressRune_20315 parseFrom(InputStream input) throws IOException {
         return (S2C_UndressRune_20315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressRune_20315 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressRune_20315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressRune_20315 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UndressRune_20315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UndressRune_20315 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressRune_20315)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressRune_20315 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UndressRune_20315)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressRune_20315 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressRune_20315)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UndressRune_20315 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UndressRune_20315 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UndressRune_20315> parser() {
         return PARSER;
      }

      public Parser<S2C_UndressRune_20315> getParserForType() {
         return PARSER;
      }

      public S2C_UndressRune_20315 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UndressRune_20315OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressRune_20315.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_UndressRune_20315.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UndressRune_20315_descriptor;
         }

         public S2C_UndressRune_20315 getDefaultInstanceForType() {
            return RuneMsg.S2C_UndressRune_20315.getDefaultInstance();
         }

         public S2C_UndressRune_20315 build() {
            S2C_UndressRune_20315 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UndressRune_20315 buildPartial() {
            S2C_UndressRune_20315 result = new S2C_UndressRune_20315(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
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
            if (other instanceof S2C_UndressRune_20315) {
               return this.mergeFrom((S2C_UndressRune_20315)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UndressRune_20315 other) {
            if (other == RuneMsg.S2C_UndressRune_20315.getDefaultInstance()) {
               return this;
            } else {
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
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UndressRune_20315 parsedMessage = null;

            try {
               parsedMessage = (S2C_UndressRune_20315)RuneMsg.S2C_UndressRune_20315.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UndressRune_20315)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
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

   public static final class C2S_Strengthen_20316 extends GeneratedMessageV3 implements C2S_Strengthen_20316OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATE_FIELD_NUMBER = 1;
      private int wearState_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int HEROCODE_FIELD_NUMBER = 3;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 4;
      private int position_;
      public static final int COSTITEMS_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> costItems_;
      private byte memoizedIsInitialized;
      private static final C2S_Strengthen_20316 DEFAULT_INSTANCE = new C2S_Strengthen_20316();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Strengthen_20316> PARSER = new AbstractParser<C2S_Strengthen_20316>() {
         public C2S_Strengthen_20316 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Strengthen_20316(input, extensionRegistry);
         }
      };

      private C2S_Strengthen_20316(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Strengthen_20316() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
         this.costItems_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Strengthen_20316();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Strengthen_20316(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.wearState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 32:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(4, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.position_ = rawValue;
                        }
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.costItems_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.costItems_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 16) != 0) {
                  this.costItems_ = Collections.unmodifiableList(this.costItems_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Strengthen_20316.class, Builder.class);
      }

      public boolean hasWearState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWearState() {
         return this.wearState_;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 8) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public List<CommonMsg.MapDataII> getCostItemsList() {
         return this.costItems_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getCostItemsOrBuilderList() {
         return this.costItems_;
      }

      public int getCostItemsCount() {
         return this.costItems_.size();
      }

      public CommonMsg.MapDataII getCostItems(int index) {
         return (CommonMsg.MapDataII)this.costItems_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getCostItemsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.costItems_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWearState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getCostItemsCount(); ++i) {
               if (!this.getCostItems(i).isInitialized()) {
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
            output.writeInt32(1, this.wearState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(4, this.position_);
         }

         for(int i = 0; i < this.costItems_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.costItems_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.wearState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(4, this.position_);
            }

            for(int i = 0; i < this.costItems_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.costItems_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Strengthen_20316)) {
            return super.equals(obj);
         } else {
            C2S_Strengthen_20316 other = (C2S_Strengthen_20316)obj;
            if (this.hasWearState() != other.hasWearState()) {
               return false;
            } else if (this.hasWearState() && this.getWearState() != other.getWearState()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (!this.getCostItemsList().equals(other.getCostItemsList())) {
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
            if (this.hasWearState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearState();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.position_;
            }

            if (this.getCostItemsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCostItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Strengthen_20316 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Strengthen_20316)PARSER.parseFrom(data);
      }

      public static C2S_Strengthen_20316 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Strengthen_20316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Strengthen_20316 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Strengthen_20316)PARSER.parseFrom(data);
      }

      public static C2S_Strengthen_20316 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Strengthen_20316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Strengthen_20316 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Strengthen_20316)PARSER.parseFrom(data);
      }

      public static C2S_Strengthen_20316 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Strengthen_20316)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Strengthen_20316 parseFrom(InputStream input) throws IOException {
         return (C2S_Strengthen_20316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Strengthen_20316 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Strengthen_20316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Strengthen_20316 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Strengthen_20316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Strengthen_20316 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Strengthen_20316)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Strengthen_20316 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Strengthen_20316)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Strengthen_20316 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Strengthen_20316)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Strengthen_20316 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Strengthen_20316 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Strengthen_20316> parser() {
         return PARSER;
      }

      public Parser<C2S_Strengthen_20316> getParserForType() {
         return PARSER;
      }

      public C2S_Strengthen_20316 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Strengthen_20316OrBuilder {
         private int bitField0_;
         private int wearState_;
         private int itemCode_;
         private int heroCode_;
         private int position_;
         private List<CommonMsg.MapDataII> costItems_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> costItemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Strengthen_20316.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.costItems_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.costItems_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_Strengthen_20316.alwaysUseFieldBuilders) {
               this.getCostItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.wearState_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.bitField0_ &= -5;
            this.position_ = 1;
            this.bitField0_ &= -9;
            if (this.costItemsBuilder_ == null) {
               this.costItems_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.costItemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Strengthen_20316_descriptor;
         }

         public C2S_Strengthen_20316 getDefaultInstanceForType() {
            return RuneMsg.C2S_Strengthen_20316.getDefaultInstance();
         }

         public C2S_Strengthen_20316 build() {
            C2S_Strengthen_20316 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Strengthen_20316 buildPartial() {
            C2S_Strengthen_20316 result = new C2S_Strengthen_20316(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wearState_ = this.wearState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.position_ = this.position_;
            if (this.costItemsBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.costItems_ = Collections.unmodifiableList(this.costItems_);
                  this.bitField0_ &= -17;
               }

               result.costItems_ = this.costItems_;
            } else {
               result.costItems_ = this.costItemsBuilder_.build();
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
            if (other instanceof C2S_Strengthen_20316) {
               return this.mergeFrom((C2S_Strengthen_20316)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Strengthen_20316 other) {
            if (other == RuneMsg.C2S_Strengthen_20316.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearState()) {
                  this.setWearState(other.getWearState());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (this.costItemsBuilder_ == null) {
                  if (!other.costItems_.isEmpty()) {
                     if (this.costItems_.isEmpty()) {
                        this.costItems_ = other.costItems_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureCostItemsIsMutable();
                        this.costItems_.addAll(other.costItems_);
                     }

                     this.onChanged();
                  }
               } else if (!other.costItems_.isEmpty()) {
                  if (this.costItemsBuilder_.isEmpty()) {
                     this.costItemsBuilder_.dispose();
                     this.costItemsBuilder_ = null;
                     this.costItems_ = other.costItems_;
                     this.bitField0_ &= -17;
                     this.costItemsBuilder_ = RuneMsg.C2S_Strengthen_20316.alwaysUseFieldBuilders ? this.getCostItemsFieldBuilder() : null;
                  } else {
                     this.costItemsBuilder_.addAllMessages(other.costItems_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWearState()) {
               return false;
            } else {
               for(int i = 0; i < this.getCostItemsCount(); ++i) {
                  if (!this.getCostItems(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Strengthen_20316 parsedMessage = null;

            try {
               parsedMessage = (C2S_Strengthen_20316)RuneMsg.C2S_Strengthen_20316.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Strengthen_20316)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWearState() {
            return this.wearState_;
         }

         public Builder setWearState(int value) {
            this.bitField0_ |= 1;
            this.wearState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWearState() {
            this.bitField0_ &= -2;
            this.wearState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 2;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 4;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -5;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 8) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -9;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         private void ensureCostItemsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.costItems_ = new ArrayList(this.costItems_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getCostItemsList() {
            return this.costItemsBuilder_ == null ? Collections.unmodifiableList(this.costItems_) : this.costItemsBuilder_.getMessageList();
         }

         public int getCostItemsCount() {
            return this.costItemsBuilder_ == null ? this.costItems_.size() : this.costItemsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getCostItems(int index) {
            return this.costItemsBuilder_ == null ? (CommonMsg.MapDataII)this.costItems_.get(index) : (CommonMsg.MapDataII)this.costItemsBuilder_.getMessage(index);
         }

         public Builder setCostItems(int index, CommonMsg.MapDataII value) {
            if (this.costItemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCostItemsIsMutable();
               this.costItems_.set(index, value);
               this.onChanged();
            } else {
               this.costItemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCostItems(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.costItemsBuilder_ == null) {
               this.ensureCostItemsIsMutable();
               this.costItems_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.costItemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCostItems(CommonMsg.MapDataII value) {
            if (this.costItemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCostItemsIsMutable();
               this.costItems_.add(value);
               this.onChanged();
            } else {
               this.costItemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCostItems(int index, CommonMsg.MapDataII value) {
            if (this.costItemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCostItemsIsMutable();
               this.costItems_.add(index, value);
               this.onChanged();
            } else {
               this.costItemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCostItems(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.costItemsBuilder_ == null) {
               this.ensureCostItemsIsMutable();
               this.costItems_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.costItemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCostItems(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.costItemsBuilder_ == null) {
               this.ensureCostItemsIsMutable();
               this.costItems_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.costItemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCostItems(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.costItemsBuilder_ == null) {
               this.ensureCostItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.costItems_);
               this.onChanged();
            } else {
               this.costItemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCostItems() {
            if (this.costItemsBuilder_ == null) {
               this.costItems_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.costItemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeCostItems(int index) {
            if (this.costItemsBuilder_ == null) {
               this.ensureCostItemsIsMutable();
               this.costItems_.remove(index);
               this.onChanged();
            } else {
               this.costItemsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getCostItemsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getCostItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getCostItemsOrBuilder(int index) {
            return this.costItemsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.costItems_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.costItemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getCostItemsOrBuilderList() {
            return this.costItemsBuilder_ != null ? this.costItemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.costItems_);
         }

         public CommonMsg.MapDataII.Builder addCostItemsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getCostItemsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addCostItemsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getCostItemsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getCostItemsBuilderList() {
            return this.getCostItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getCostItemsFieldBuilder() {
            if (this.costItemsBuilder_ == null) {
               this.costItemsBuilder_ = new RepeatedFieldBuilderV3(this.costItems_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.costItems_ = null;
            }

            return this.costItemsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Strengthen_20317 extends GeneratedMessageV3 implements S2C_Strengthen_20317OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATE_FIELD_NUMBER = 1;
      private int wearState_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int HEROCODE_FIELD_NUMBER = 3;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 4;
      private int position_;
      public static final int UPGRADEPROGRESS_FIELD_NUMBER = 5;
      private int upgradeProgress_;
      public static final int LEVEL_FIELD_NUMBER = 6;
      private int level_;
      public static final int ISUPGRADE_FIELD_NUMBER = 7;
      private boolean isUpgrade_;
      private byte memoizedIsInitialized;
      private static final S2C_Strengthen_20317 DEFAULT_INSTANCE = new S2C_Strengthen_20317();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Strengthen_20317> PARSER = new AbstractParser<S2C_Strengthen_20317>() {
         public S2C_Strengthen_20317 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Strengthen_20317(input, extensionRegistry);
         }
      };

      private S2C_Strengthen_20317(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Strengthen_20317() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Strengthen_20317();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Strengthen_20317(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.wearState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 32:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(4, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.position_ = rawValue;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.upgradeProgress_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.level_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.isUpgrade_ = input.readBool();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Strengthen_20317.class, Builder.class);
      }

      public boolean hasWearState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWearState() {
         return this.wearState_;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 8) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public boolean hasUpgradeProgress() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getUpgradeProgress() {
         return this.upgradeProgress_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasIsUpgrade() {
         return (this.bitField0_ & 64) != 0;
      }

      public boolean getIsUpgrade() {
         return this.isUpgrade_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWearState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUpgradeProgress()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsUpgrade()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.wearState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(4, this.position_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.upgradeProgress_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.level_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeBool(7, this.isUpgrade_);
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
               size += CodedOutputStream.computeInt32Size(1, this.wearState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(4, this.position_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.upgradeProgress_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.level_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeBoolSize(7, this.isUpgrade_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Strengthen_20317)) {
            return super.equals(obj);
         } else {
            S2C_Strengthen_20317 other = (S2C_Strengthen_20317)obj;
            if (this.hasWearState() != other.hasWearState()) {
               return false;
            } else if (this.hasWearState() && this.getWearState() != other.getWearState()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasUpgradeProgress() != other.hasUpgradeProgress()) {
               return false;
            } else if (this.hasUpgradeProgress() && this.getUpgradeProgress() != other.getUpgradeProgress()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasIsUpgrade() != other.hasIsUpgrade()) {
               return false;
            } else if (this.hasIsUpgrade() && this.getIsUpgrade() != other.getIsUpgrade()) {
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
            if (this.hasWearState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearState();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.position_;
            }

            if (this.hasUpgradeProgress()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getUpgradeProgress();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasIsUpgrade()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashBoolean(this.getIsUpgrade());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Strengthen_20317 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Strengthen_20317)PARSER.parseFrom(data);
      }

      public static S2C_Strengthen_20317 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Strengthen_20317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Strengthen_20317 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Strengthen_20317)PARSER.parseFrom(data);
      }

      public static S2C_Strengthen_20317 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Strengthen_20317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Strengthen_20317 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Strengthen_20317)PARSER.parseFrom(data);
      }

      public static S2C_Strengthen_20317 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Strengthen_20317)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Strengthen_20317 parseFrom(InputStream input) throws IOException {
         return (S2C_Strengthen_20317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Strengthen_20317 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Strengthen_20317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Strengthen_20317 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Strengthen_20317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Strengthen_20317 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Strengthen_20317)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Strengthen_20317 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Strengthen_20317)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Strengthen_20317 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Strengthen_20317)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Strengthen_20317 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Strengthen_20317 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Strengthen_20317> parser() {
         return PARSER;
      }

      public Parser<S2C_Strengthen_20317> getParserForType() {
         return PARSER;
      }

      public S2C_Strengthen_20317 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Strengthen_20317OrBuilder {
         private int bitField0_;
         private int wearState_;
         private int itemCode_;
         private int heroCode_;
         private int position_;
         private int upgradeProgress_;
         private int level_;
         private boolean isUpgrade_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Strengthen_20317.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_Strengthen_20317.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wearState_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.bitField0_ &= -5;
            this.position_ = 1;
            this.bitField0_ &= -9;
            this.upgradeProgress_ = 0;
            this.bitField0_ &= -17;
            this.level_ = 0;
            this.bitField0_ &= -33;
            this.isUpgrade_ = false;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Strengthen_20317_descriptor;
         }

         public S2C_Strengthen_20317 getDefaultInstanceForType() {
            return RuneMsg.S2C_Strengthen_20317.getDefaultInstance();
         }

         public S2C_Strengthen_20317 build() {
            S2C_Strengthen_20317 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Strengthen_20317 buildPartial() {
            S2C_Strengthen_20317 result = new S2C_Strengthen_20317(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wearState_ = this.wearState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 16) != 0) {
               result.upgradeProgress_ = this.upgradeProgress_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.isUpgrade_ = this.isUpgrade_;
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
            if (other instanceof S2C_Strengthen_20317) {
               return this.mergeFrom((S2C_Strengthen_20317)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Strengthen_20317 other) {
            if (other == RuneMsg.S2C_Strengthen_20317.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearState()) {
                  this.setWearState(other.getWearState());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasUpgradeProgress()) {
                  this.setUpgradeProgress(other.getUpgradeProgress());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasIsUpgrade()) {
                  this.setIsUpgrade(other.getIsUpgrade());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWearState()) {
               return false;
            } else if (!this.hasUpgradeProgress()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               return this.hasIsUpgrade();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Strengthen_20317 parsedMessage = null;

            try {
               parsedMessage = (S2C_Strengthen_20317)RuneMsg.S2C_Strengthen_20317.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Strengthen_20317)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWearState() {
            return this.wearState_;
         }

         public Builder setWearState(int value) {
            this.bitField0_ |= 1;
            this.wearState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWearState() {
            this.bitField0_ &= -2;
            this.wearState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 2;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 4;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -5;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 8) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -9;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasUpgradeProgress() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getUpgradeProgress() {
            return this.upgradeProgress_;
         }

         public Builder setUpgradeProgress(int value) {
            this.bitField0_ |= 16;
            this.upgradeProgress_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUpgradeProgress() {
            this.bitField0_ &= -17;
            this.upgradeProgress_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 32;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -33;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsUpgrade() {
            return (this.bitField0_ & 64) != 0;
         }

         public boolean getIsUpgrade() {
            return this.isUpgrade_;
         }

         public Builder setIsUpgrade(boolean value) {
            this.bitField0_ |= 64;
            this.isUpgrade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsUpgrade() {
            this.bitField0_ &= -65;
            this.isUpgrade_ = false;
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

   public static final class C2S_Fusion_20318 extends GeneratedMessageV3 implements C2S_Fusion_20318OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATE_FIELD_NUMBER = 1;
      private int wearState_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      public static final int FUNCTIONRUNEID_FIELD_NUMBER = 4;
      private int functionRuneId_;
      public static final int COSTITEMCODES_FIELD_NUMBER = 5;
      private Internal.IntList costItemCodes_;
      private byte memoizedIsInitialized;
      private static final C2S_Fusion_20318 DEFAULT_INSTANCE = new C2S_Fusion_20318();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Fusion_20318> PARSER = new AbstractParser<C2S_Fusion_20318>() {
         public C2S_Fusion_20318 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Fusion_20318(input, extensionRegistry);
         }
      };

      private C2S_Fusion_20318(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Fusion_20318() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
         this.costItemCodes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Fusion_20318();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Fusion_20318(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.wearState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.position_ = rawValue;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.functionRuneId_ = input.readInt32();
                        break;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.costItemCodes_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.costItemCodes_.addInt(input.readInt32());
                        break;
                     case 42:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.costItemCodes_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.costItemCodes_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 16) != 0) {
                  this.costItemCodes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Fusion_20318.class, Builder.class);
      }

      public boolean hasWearState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWearState() {
         return this.wearState_;
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

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public boolean hasFunctionRuneId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFunctionRuneId() {
         return this.functionRuneId_;
      }

      public List<Integer> getCostItemCodesList() {
         return this.costItemCodes_;
      }

      public int getCostItemCodesCount() {
         return this.costItemCodes_.size();
      }

      public int getCostItemCodes(int index) {
         return this.costItemCodes_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWearState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFunctionRuneId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.wearState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.position_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.functionRuneId_);
         }

         for(int i = 0; i < this.costItemCodes_.size(); ++i) {
            output.writeInt32(5, this.costItemCodes_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.wearState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.position_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.functionRuneId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.costItemCodes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.costItemCodes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCostItemCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Fusion_20318)) {
            return super.equals(obj);
         } else {
            C2S_Fusion_20318 other = (C2S_Fusion_20318)obj;
            if (this.hasWearState() != other.hasWearState()) {
               return false;
            } else if (this.hasWearState() && this.getWearState() != other.getWearState()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasFunctionRuneId() != other.hasFunctionRuneId()) {
               return false;
            } else if (this.hasFunctionRuneId() && this.getFunctionRuneId() != other.getFunctionRuneId()) {
               return false;
            } else if (!this.getCostItemCodesList().equals(other.getCostItemCodesList())) {
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
            if (this.hasWearState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearState();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.position_;
            }

            if (this.hasFunctionRuneId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getFunctionRuneId();
            }

            if (this.getCostItemCodesCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCostItemCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Fusion_20318 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Fusion_20318)PARSER.parseFrom(data);
      }

      public static C2S_Fusion_20318 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Fusion_20318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Fusion_20318 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Fusion_20318)PARSER.parseFrom(data);
      }

      public static C2S_Fusion_20318 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Fusion_20318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Fusion_20318 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Fusion_20318)PARSER.parseFrom(data);
      }

      public static C2S_Fusion_20318 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Fusion_20318)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Fusion_20318 parseFrom(InputStream input) throws IOException {
         return (C2S_Fusion_20318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Fusion_20318 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Fusion_20318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Fusion_20318 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Fusion_20318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Fusion_20318 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Fusion_20318)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Fusion_20318 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Fusion_20318)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Fusion_20318 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Fusion_20318)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Fusion_20318 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Fusion_20318 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Fusion_20318> parser() {
         return PARSER;
      }

      public Parser<C2S_Fusion_20318> getParserForType() {
         return PARSER;
      }

      public C2S_Fusion_20318 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Fusion_20318OrBuilder {
         private int bitField0_;
         private int wearState_;
         private int heroCode_;
         private int position_;
         private int functionRuneId_;
         private Internal.IntList costItemCodes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Fusion_20318.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.costItemCodes_ = RuneMsg.C2S_Fusion_20318.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.costItemCodes_ = RuneMsg.C2S_Fusion_20318.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_Fusion_20318.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wearState_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.bitField0_ &= -5;
            this.functionRuneId_ = 0;
            this.bitField0_ &= -9;
            this.costItemCodes_ = RuneMsg.C2S_Fusion_20318.emptyIntList();
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Fusion_20318_descriptor;
         }

         public C2S_Fusion_20318 getDefaultInstanceForType() {
            return RuneMsg.C2S_Fusion_20318.getDefaultInstance();
         }

         public C2S_Fusion_20318 build() {
            C2S_Fusion_20318 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Fusion_20318 buildPartial() {
            C2S_Fusion_20318 result = new C2S_Fusion_20318(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wearState_ = this.wearState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 8) != 0) {
               result.functionRuneId_ = this.functionRuneId_;
               to_bitField0_ |= 8;
            }

            if ((this.bitField0_ & 16) != 0) {
               this.costItemCodes_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.costItemCodes_ = this.costItemCodes_;
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
            if (other instanceof C2S_Fusion_20318) {
               return this.mergeFrom((C2S_Fusion_20318)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Fusion_20318 other) {
            if (other == RuneMsg.C2S_Fusion_20318.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearState()) {
                  this.setWearState(other.getWearState());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasFunctionRuneId()) {
                  this.setFunctionRuneId(other.getFunctionRuneId());
               }

               if (!other.costItemCodes_.isEmpty()) {
                  if (this.costItemCodes_.isEmpty()) {
                     this.costItemCodes_ = other.costItemCodes_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureCostItemCodesIsMutable();
                     this.costItemCodes_.addAll(other.costItemCodes_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWearState()) {
               return false;
            } else {
               return this.hasFunctionRuneId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Fusion_20318 parsedMessage = null;

            try {
               parsedMessage = (C2S_Fusion_20318)RuneMsg.C2S_Fusion_20318.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Fusion_20318)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWearState() {
            return this.wearState_;
         }

         public Builder setWearState(int value) {
            this.bitField0_ |= 1;
            this.wearState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWearState() {
            this.bitField0_ &= -2;
            this.wearState_ = 0;
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

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -5;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasFunctionRuneId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getFunctionRuneId() {
            return this.functionRuneId_;
         }

         public Builder setFunctionRuneId(int value) {
            this.bitField0_ |= 8;
            this.functionRuneId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFunctionRuneId() {
            this.bitField0_ &= -9;
            this.functionRuneId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCostItemCodesIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.costItemCodes_ = RuneMsg.C2S_Fusion_20318.mutableCopy(this.costItemCodes_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getCostItemCodesList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.costItemCodes_) : this.costItemCodes_);
         }

         public int getCostItemCodesCount() {
            return this.costItemCodes_.size();
         }

         public int getCostItemCodes(int index) {
            return this.costItemCodes_.getInt(index);
         }

         public Builder setCostItemCodes(int index, int value) {
            this.ensureCostItemCodesIsMutable();
            this.costItemCodes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCostItemCodes(int value) {
            this.ensureCostItemCodesIsMutable();
            this.costItemCodes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCostItemCodes(Iterable<? extends Integer> values) {
            this.ensureCostItemCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.costItemCodes_);
            this.onChanged();
            return this;
         }

         public Builder clearCostItemCodes() {
            this.costItemCodes_ = RuneMsg.C2S_Fusion_20318.emptyIntList();
            this.bitField0_ &= -17;
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

   public static final class S2C_Fusion_20319 extends GeneratedMessageV3 implements S2C_Fusion_20319OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Fusion_20319 DEFAULT_INSTANCE = new S2C_Fusion_20319();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Fusion_20319> PARSER = new AbstractParser<S2C_Fusion_20319>() {
         public S2C_Fusion_20319 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Fusion_20319(input, extensionRegistry);
         }
      };

      private S2C_Fusion_20319(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Fusion_20319() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Fusion_20319();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Fusion_20319(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Fusion_20319.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Fusion_20319)) {
            return super.equals(obj);
         } else {
            S2C_Fusion_20319 other = (S2C_Fusion_20319)obj;
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

      public static S2C_Fusion_20319 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Fusion_20319)PARSER.parseFrom(data);
      }

      public static S2C_Fusion_20319 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Fusion_20319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Fusion_20319 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Fusion_20319)PARSER.parseFrom(data);
      }

      public static S2C_Fusion_20319 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Fusion_20319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Fusion_20319 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Fusion_20319)PARSER.parseFrom(data);
      }

      public static S2C_Fusion_20319 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Fusion_20319)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Fusion_20319 parseFrom(InputStream input) throws IOException {
         return (S2C_Fusion_20319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Fusion_20319 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Fusion_20319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Fusion_20319 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Fusion_20319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Fusion_20319 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Fusion_20319)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Fusion_20319 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Fusion_20319)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Fusion_20319 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Fusion_20319)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Fusion_20319 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Fusion_20319 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Fusion_20319> parser() {
         return PARSER;
      }

      public Parser<S2C_Fusion_20319> getParserForType() {
         return PARSER;
      }

      public S2C_Fusion_20319 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Fusion_20319OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Fusion_20319.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_Fusion_20319.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Fusion_20319_descriptor;
         }

         public S2C_Fusion_20319 getDefaultInstanceForType() {
            return RuneMsg.S2C_Fusion_20319.getDefaultInstance();
         }

         public S2C_Fusion_20319 build() {
            S2C_Fusion_20319 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Fusion_20319 buildPartial() {
            S2C_Fusion_20319 result = new S2C_Fusion_20319(this);
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
            if (other instanceof S2C_Fusion_20319) {
               return this.mergeFrom((S2C_Fusion_20319)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Fusion_20319 other) {
            if (other == RuneMsg.S2C_Fusion_20319.getDefaultInstance()) {
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
            S2C_Fusion_20319 parsedMessage = null;

            try {
               parsedMessage = (S2C_Fusion_20319)RuneMsg.S2C_Fusion_20319.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Fusion_20319)e.getUnfinishedMessage();
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

   public static final class C2S_UpQuality_20320 extends GeneratedMessageV3 implements C2S_UpQuality_20320OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATE_FIELD_NUMBER = 1;
      private int wearState_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int HEROCODE_FIELD_NUMBER = 3;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 4;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_UpQuality_20320 DEFAULT_INSTANCE = new C2S_UpQuality_20320();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpQuality_20320> PARSER = new AbstractParser<C2S_UpQuality_20320>() {
         public C2S_UpQuality_20320 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpQuality_20320(input, extensionRegistry);
         }
      };

      private C2S_UpQuality_20320(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpQuality_20320() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpQuality_20320();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpQuality_20320(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.wearState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 32:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(4, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.position_ = rawValue;
                        }
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpQuality_20320.class, Builder.class);
      }

      public boolean hasWearState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWearState() {
         return this.wearState_;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 8) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWearState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.wearState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(4, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.wearState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(4, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UpQuality_20320)) {
            return super.equals(obj);
         } else {
            C2S_UpQuality_20320 other = (C2S_UpQuality_20320)obj;
            if (this.hasWearState() != other.hasWearState()) {
               return false;
            } else if (this.hasWearState() && this.getWearState() != other.getWearState()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
            if (this.hasWearState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearState();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UpQuality_20320 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpQuality_20320)PARSER.parseFrom(data);
      }

      public static C2S_UpQuality_20320 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpQuality_20320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpQuality_20320 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpQuality_20320)PARSER.parseFrom(data);
      }

      public static C2S_UpQuality_20320 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpQuality_20320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpQuality_20320 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpQuality_20320)PARSER.parseFrom(data);
      }

      public static C2S_UpQuality_20320 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpQuality_20320)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpQuality_20320 parseFrom(InputStream input) throws IOException {
         return (C2S_UpQuality_20320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpQuality_20320 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpQuality_20320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpQuality_20320 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpQuality_20320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpQuality_20320 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpQuality_20320)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpQuality_20320 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpQuality_20320)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpQuality_20320 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpQuality_20320)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpQuality_20320 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpQuality_20320 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpQuality_20320> parser() {
         return PARSER;
      }

      public Parser<C2S_UpQuality_20320> getParserForType() {
         return PARSER;
      }

      public C2S_UpQuality_20320 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpQuality_20320OrBuilder {
         private int bitField0_;
         private int wearState_;
         private int itemCode_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpQuality_20320.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_UpQuality_20320.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wearState_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.bitField0_ &= -5;
            this.position_ = 1;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UpQuality_20320_descriptor;
         }

         public C2S_UpQuality_20320 getDefaultInstanceForType() {
            return RuneMsg.C2S_UpQuality_20320.getDefaultInstance();
         }

         public C2S_UpQuality_20320 build() {
            C2S_UpQuality_20320 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpQuality_20320 buildPartial() {
            C2S_UpQuality_20320 result = new C2S_UpQuality_20320(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wearState_ = this.wearState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_UpQuality_20320) {
               return this.mergeFrom((C2S_UpQuality_20320)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpQuality_20320 other) {
            if (other == RuneMsg.C2S_UpQuality_20320.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearState()) {
                  this.setWearState(other.getWearState());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
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
            return this.hasWearState();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UpQuality_20320 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpQuality_20320)RuneMsg.C2S_UpQuality_20320.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpQuality_20320)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWearState() {
            return this.wearState_;
         }

         public Builder setWearState(int value) {
            this.bitField0_ |= 1;
            this.wearState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWearState() {
            this.bitField0_ &= -2;
            this.wearState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 2;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 4;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -5;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 8) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -9;
            this.position_ = 1;
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

   public static final class S2C_UpQuality_20321 extends GeneratedMessageV3 implements S2C_UpQuality_20321OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_UpQuality_20321 DEFAULT_INSTANCE = new S2C_UpQuality_20321();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpQuality_20321> PARSER = new AbstractParser<S2C_UpQuality_20321>() {
         public S2C_UpQuality_20321 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpQuality_20321(input, extensionRegistry);
         }
      };

      private S2C_UpQuality_20321(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpQuality_20321() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpQuality_20321();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpQuality_20321(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpQuality_20321.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UpQuality_20321)) {
            return super.equals(obj);
         } else {
            S2C_UpQuality_20321 other = (S2C_UpQuality_20321)obj;
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

      public static S2C_UpQuality_20321 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpQuality_20321)PARSER.parseFrom(data);
      }

      public static S2C_UpQuality_20321 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpQuality_20321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpQuality_20321 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpQuality_20321)PARSER.parseFrom(data);
      }

      public static S2C_UpQuality_20321 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpQuality_20321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpQuality_20321 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpQuality_20321)PARSER.parseFrom(data);
      }

      public static S2C_UpQuality_20321 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpQuality_20321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpQuality_20321 parseFrom(InputStream input) throws IOException {
         return (S2C_UpQuality_20321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpQuality_20321 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpQuality_20321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpQuality_20321 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpQuality_20321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpQuality_20321 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpQuality_20321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpQuality_20321 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpQuality_20321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpQuality_20321 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpQuality_20321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpQuality_20321 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpQuality_20321 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpQuality_20321> parser() {
         return PARSER;
      }

      public Parser<S2C_UpQuality_20321> getParserForType() {
         return PARSER;
      }

      public S2C_UpQuality_20321 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpQuality_20321OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpQuality_20321.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_UpQuality_20321.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UpQuality_20321_descriptor;
         }

         public S2C_UpQuality_20321 getDefaultInstanceForType() {
            return RuneMsg.S2C_UpQuality_20321.getDefaultInstance();
         }

         public S2C_UpQuality_20321 build() {
            S2C_UpQuality_20321 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpQuality_20321 buildPartial() {
            S2C_UpQuality_20321 result = new S2C_UpQuality_20321(this);
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
            if (other instanceof S2C_UpQuality_20321) {
               return this.mergeFrom((S2C_UpQuality_20321)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpQuality_20321 other) {
            if (other == RuneMsg.S2C_UpQuality_20321.getDefaultInstance()) {
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
            S2C_UpQuality_20321 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpQuality_20321)RuneMsg.S2C_UpQuality_20321.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpQuality_20321)e.getUnfinishedMessage();
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

   public static final class C2S_Change_20322 extends GeneratedMessageV3 implements C2S_Change_20322OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATE_FIELD_NUMBER = 1;
      private int wearState_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int HEROCODE_FIELD_NUMBER = 3;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 4;
      private int position_;
      public static final int TARGETRUNEID_FIELD_NUMBER = 5;
      private int targetRuneId_;
      private byte memoizedIsInitialized;
      private static final C2S_Change_20322 DEFAULT_INSTANCE = new C2S_Change_20322();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Change_20322> PARSER = new AbstractParser<C2S_Change_20322>() {
         public C2S_Change_20322 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Change_20322(input, extensionRegistry);
         }
      };

      private C2S_Change_20322(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Change_20322() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Change_20322();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Change_20322(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.wearState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 32:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(4, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.position_ = rawValue;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.targetRuneId_ = input.readInt32();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Change_20322.class, Builder.class);
      }

      public boolean hasWearState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWearState() {
         return this.wearState_;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 8) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public boolean hasTargetRuneId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getTargetRuneId() {
         return this.targetRuneId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWearState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTargetRuneId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.wearState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(4, this.position_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.targetRuneId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.wearState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(4, this.position_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.targetRuneId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Change_20322)) {
            return super.equals(obj);
         } else {
            C2S_Change_20322 other = (C2S_Change_20322)obj;
            if (this.hasWearState() != other.hasWearState()) {
               return false;
            } else if (this.hasWearState() && this.getWearState() != other.getWearState()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasTargetRuneId() != other.hasTargetRuneId()) {
               return false;
            } else if (this.hasTargetRuneId() && this.getTargetRuneId() != other.getTargetRuneId()) {
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
            if (this.hasWearState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearState();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.position_;
            }

            if (this.hasTargetRuneId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTargetRuneId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Change_20322 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Change_20322)PARSER.parseFrom(data);
      }

      public static C2S_Change_20322 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Change_20322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Change_20322 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Change_20322)PARSER.parseFrom(data);
      }

      public static C2S_Change_20322 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Change_20322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Change_20322 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Change_20322)PARSER.parseFrom(data);
      }

      public static C2S_Change_20322 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Change_20322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Change_20322 parseFrom(InputStream input) throws IOException {
         return (C2S_Change_20322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Change_20322 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Change_20322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Change_20322 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Change_20322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Change_20322 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Change_20322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Change_20322 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Change_20322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Change_20322 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Change_20322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Change_20322 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Change_20322 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Change_20322> parser() {
         return PARSER;
      }

      public Parser<C2S_Change_20322> getParserForType() {
         return PARSER;
      }

      public C2S_Change_20322 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Change_20322OrBuilder {
         private int bitField0_;
         private int wearState_;
         private int itemCode_;
         private int heroCode_;
         private int position_;
         private int targetRuneId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Change_20322.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_Change_20322.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wearState_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.bitField0_ &= -5;
            this.position_ = 1;
            this.bitField0_ &= -9;
            this.targetRuneId_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Change_20322_descriptor;
         }

         public C2S_Change_20322 getDefaultInstanceForType() {
            return RuneMsg.C2S_Change_20322.getDefaultInstance();
         }

         public C2S_Change_20322 build() {
            C2S_Change_20322 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Change_20322 buildPartial() {
            C2S_Change_20322 result = new C2S_Change_20322(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wearState_ = this.wearState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 16) != 0) {
               result.targetRuneId_ = this.targetRuneId_;
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
            if (other instanceof C2S_Change_20322) {
               return this.mergeFrom((C2S_Change_20322)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Change_20322 other) {
            if (other == RuneMsg.C2S_Change_20322.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearState()) {
                  this.setWearState(other.getWearState());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasTargetRuneId()) {
                  this.setTargetRuneId(other.getTargetRuneId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasWearState()) {
               return false;
            } else {
               return this.hasTargetRuneId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Change_20322 parsedMessage = null;

            try {
               parsedMessage = (C2S_Change_20322)RuneMsg.C2S_Change_20322.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Change_20322)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWearState() {
            return this.wearState_;
         }

         public Builder setWearState(int value) {
            this.bitField0_ |= 1;
            this.wearState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWearState() {
            this.bitField0_ &= -2;
            this.wearState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 2;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 4;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -5;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 8) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -9;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasTargetRuneId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTargetRuneId() {
            return this.targetRuneId_;
         }

         public Builder setTargetRuneId(int value) {
            this.bitField0_ |= 16;
            this.targetRuneId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetRuneId() {
            this.bitField0_ &= -17;
            this.targetRuneId_ = 0;
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

   public static final class S2C_Change_20323 extends GeneratedMessageV3 implements S2C_Change_20323OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Change_20323 DEFAULT_INSTANCE = new S2C_Change_20323();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Change_20323> PARSER = new AbstractParser<S2C_Change_20323>() {
         public S2C_Change_20323 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Change_20323(input, extensionRegistry);
         }
      };

      private S2C_Change_20323(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Change_20323() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Change_20323();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Change_20323(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Change_20323.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Change_20323)) {
            return super.equals(obj);
         } else {
            S2C_Change_20323 other = (S2C_Change_20323)obj;
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

      public static S2C_Change_20323 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Change_20323)PARSER.parseFrom(data);
      }

      public static S2C_Change_20323 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Change_20323)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Change_20323 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Change_20323)PARSER.parseFrom(data);
      }

      public static S2C_Change_20323 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Change_20323)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Change_20323 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Change_20323)PARSER.parseFrom(data);
      }

      public static S2C_Change_20323 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Change_20323)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Change_20323 parseFrom(InputStream input) throws IOException {
         return (S2C_Change_20323)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Change_20323 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Change_20323)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Change_20323 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Change_20323)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Change_20323 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Change_20323)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Change_20323 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Change_20323)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Change_20323 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Change_20323)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Change_20323 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Change_20323 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Change_20323> parser() {
         return PARSER;
      }

      public Parser<S2C_Change_20323> getParserForType() {
         return PARSER;
      }

      public S2C_Change_20323 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Change_20323OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Change_20323.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_Change_20323.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Change_20323_descriptor;
         }

         public S2C_Change_20323 getDefaultInstanceForType() {
            return RuneMsg.S2C_Change_20323.getDefaultInstance();
         }

         public S2C_Change_20323 build() {
            S2C_Change_20323 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Change_20323 buildPartial() {
            S2C_Change_20323 result = new S2C_Change_20323(this);
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
            if (other instanceof S2C_Change_20323) {
               return this.mergeFrom((S2C_Change_20323)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Change_20323 other) {
            if (other == RuneMsg.S2C_Change_20323.getDefaultInstance()) {
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
            S2C_Change_20323 parsedMessage = null;

            try {
               parsedMessage = (S2C_Change_20323)RuneMsg.S2C_Change_20323.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Change_20323)e.getUnfinishedMessage();
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

   public static final class C2S_Reset_20324 extends GeneratedMessageV3 implements C2S_Reset_20324OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int WEARSTATE_FIELD_NUMBER = 1;
      private int wearState_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int HEROCODE_FIELD_NUMBER = 3;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 4;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_Reset_20324 DEFAULT_INSTANCE = new C2S_Reset_20324();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Reset_20324> PARSER = new AbstractParser<C2S_Reset_20324>() {
         public C2S_Reset_20324 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Reset_20324(input, extensionRegistry);
         }
      };

      private C2S_Reset_20324(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Reset_20324() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Reset_20324();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Reset_20324(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.wearState_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.itemCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 32:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(4, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.position_ = rawValue;
                        }
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reset_20324.class, Builder.class);
      }

      public boolean hasWearState() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getWearState() {
         return this.wearState_;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 8) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasWearState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.wearState_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(4, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.wearState_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(4, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Reset_20324)) {
            return super.equals(obj);
         } else {
            C2S_Reset_20324 other = (C2S_Reset_20324)obj;
            if (this.hasWearState() != other.hasWearState()) {
               return false;
            } else if (this.hasWearState() && this.getWearState() != other.getWearState()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
            if (this.hasWearState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getWearState();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Reset_20324 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Reset_20324)PARSER.parseFrom(data);
      }

      public static C2S_Reset_20324 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_20324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_20324 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Reset_20324)PARSER.parseFrom(data);
      }

      public static C2S_Reset_20324 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_20324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_20324 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Reset_20324)PARSER.parseFrom(data);
      }

      public static C2S_Reset_20324 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_20324)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_20324 parseFrom(InputStream input) throws IOException {
         return (C2S_Reset_20324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reset_20324 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_20324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reset_20324 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Reset_20324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Reset_20324 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_20324)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reset_20324 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Reset_20324)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reset_20324 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_20324)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Reset_20324 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Reset_20324 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Reset_20324> parser() {
         return PARSER;
      }

      public Parser<C2S_Reset_20324> getParserForType() {
         return PARSER;
      }

      public C2S_Reset_20324 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Reset_20324OrBuilder {
         private int bitField0_;
         private int wearState_;
         private int itemCode_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reset_20324.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_Reset_20324.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.wearState_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.bitField0_ &= -5;
            this.position_ = 1;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Reset_20324_descriptor;
         }

         public C2S_Reset_20324 getDefaultInstanceForType() {
            return RuneMsg.C2S_Reset_20324.getDefaultInstance();
         }

         public C2S_Reset_20324 build() {
            C2S_Reset_20324 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Reset_20324 buildPartial() {
            C2S_Reset_20324 result = new C2S_Reset_20324(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.wearState_ = this.wearState_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_Reset_20324) {
               return this.mergeFrom((C2S_Reset_20324)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Reset_20324 other) {
            if (other == RuneMsg.C2S_Reset_20324.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasWearState()) {
                  this.setWearState(other.getWearState());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
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
            return this.hasWearState();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Reset_20324 parsedMessage = null;

            try {
               parsedMessage = (C2S_Reset_20324)RuneMsg.C2S_Reset_20324.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Reset_20324)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasWearState() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getWearState() {
            return this.wearState_;
         }

         public Builder setWearState(int value) {
            this.bitField0_ |= 1;
            this.wearState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWearState() {
            this.bitField0_ &= -2;
            this.wearState_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 2;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 4;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -5;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 8) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -9;
            this.position_ = 1;
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

   public static final class S2C_Reset_20325 extends GeneratedMessageV3 implements S2C_Reset_20325OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Reset_20325 DEFAULT_INSTANCE = new S2C_Reset_20325();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Reset_20325> PARSER = new AbstractParser<S2C_Reset_20325>() {
         public S2C_Reset_20325 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Reset_20325(input, extensionRegistry);
         }
      };

      private S2C_Reset_20325(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Reset_20325() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Reset_20325();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Reset_20325(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reset_20325.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Reset_20325)) {
            return super.equals(obj);
         } else {
            S2C_Reset_20325 other = (S2C_Reset_20325)obj;
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

      public static S2C_Reset_20325 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Reset_20325)PARSER.parseFrom(data);
      }

      public static S2C_Reset_20325 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_20325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_20325 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Reset_20325)PARSER.parseFrom(data);
      }

      public static S2C_Reset_20325 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_20325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_20325 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Reset_20325)PARSER.parseFrom(data);
      }

      public static S2C_Reset_20325 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_20325)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_20325 parseFrom(InputStream input) throws IOException {
         return (S2C_Reset_20325)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reset_20325 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_20325)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reset_20325 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Reset_20325)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Reset_20325 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_20325)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reset_20325 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Reset_20325)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reset_20325 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_20325)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Reset_20325 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Reset_20325 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Reset_20325> parser() {
         return PARSER;
      }

      public Parser<S2C_Reset_20325> getParserForType() {
         return PARSER;
      }

      public S2C_Reset_20325 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Reset_20325OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reset_20325.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_Reset_20325.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Reset_20325_descriptor;
         }

         public S2C_Reset_20325 getDefaultInstanceForType() {
            return RuneMsg.S2C_Reset_20325.getDefaultInstance();
         }

         public S2C_Reset_20325 build() {
            S2C_Reset_20325 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Reset_20325 buildPartial() {
            S2C_Reset_20325 result = new S2C_Reset_20325(this);
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
            if (other instanceof S2C_Reset_20325) {
               return this.mergeFrom((S2C_Reset_20325)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Reset_20325 other) {
            if (other == RuneMsg.S2C_Reset_20325.getDefaultInstance()) {
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
            S2C_Reset_20325 parsedMessage = null;

            try {
               parsedMessage = (S2C_Reset_20325)RuneMsg.S2C_Reset_20325.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Reset_20325)e.getUnfinishedMessage();
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

   public static final class C2S_Refine_20326 extends GeneratedMessageV3 implements C2S_Refine_20326OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int REFINESPECIALITEM_FIELD_NUMBER = 3;
      private Internal.IntList refineSpecialItem_;
      private byte memoizedIsInitialized;
      private static final C2S_Refine_20326 DEFAULT_INSTANCE = new C2S_Refine_20326();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Refine_20326> PARSER = new AbstractParser<C2S_Refine_20326>() {
         public C2S_Refine_20326 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Refine_20326(input, extensionRegistry);
         }
      };

      private C2S_Refine_20326(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Refine_20326() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
         this.refineSpecialItem_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Refine_20326();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Refine_20326(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.refineSpecialItem_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.refineSpecialItem_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.refineSpecialItem_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.refineSpecialItem_.addInt(input.readInt32());
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
                  this.refineSpecialItem_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Refine_20326.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public List<Integer> getRefineSpecialItemList() {
         return this.refineSpecialItem_;
      }

      public int getRefineSpecialItemCount() {
         return this.refineSpecialItem_.size();
      }

      public int getRefineSpecialItem(int index) {
         return this.refineSpecialItem_.getInt(index);
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         for(int i = 0; i < this.refineSpecialItem_.size(); ++i) {
            output.writeInt32(3, this.refineSpecialItem_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.refineSpecialItem_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.refineSpecialItem_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRefineSpecialItemList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Refine_20326)) {
            return super.equals(obj);
         } else {
            C2S_Refine_20326 other = (C2S_Refine_20326)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (!this.getRefineSpecialItemList().equals(other.getRefineSpecialItemList())) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.getRefineSpecialItemCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRefineSpecialItemList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Refine_20326 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Refine_20326)PARSER.parseFrom(data);
      }

      public static C2S_Refine_20326 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Refine_20326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Refine_20326 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Refine_20326)PARSER.parseFrom(data);
      }

      public static C2S_Refine_20326 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Refine_20326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Refine_20326 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Refine_20326)PARSER.parseFrom(data);
      }

      public static C2S_Refine_20326 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Refine_20326)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Refine_20326 parseFrom(InputStream input) throws IOException {
         return (C2S_Refine_20326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Refine_20326 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Refine_20326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Refine_20326 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Refine_20326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Refine_20326 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Refine_20326)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Refine_20326 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Refine_20326)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Refine_20326 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Refine_20326)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Refine_20326 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Refine_20326 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Refine_20326> parser() {
         return PARSER;
      }

      public Parser<C2S_Refine_20326> getParserForType() {
         return PARSER;
      }

      public C2S_Refine_20326 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Refine_20326OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private Internal.IntList refineSpecialItem_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Refine_20326.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.refineSpecialItem_ = RuneMsg.C2S_Refine_20326.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.refineSpecialItem_ = RuneMsg.C2S_Refine_20326.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_Refine_20326.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.refineSpecialItem_ = RuneMsg.C2S_Refine_20326.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_Refine_20326_descriptor;
         }

         public C2S_Refine_20326 getDefaultInstanceForType() {
            return RuneMsg.C2S_Refine_20326.getDefaultInstance();
         }

         public C2S_Refine_20326 build() {
            C2S_Refine_20326 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Refine_20326 buildPartial() {
            C2S_Refine_20326 result = new C2S_Refine_20326(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((this.bitField0_ & 4) != 0) {
               this.refineSpecialItem_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.refineSpecialItem_ = this.refineSpecialItem_;
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
            if (other instanceof C2S_Refine_20326) {
               return this.mergeFrom((C2S_Refine_20326)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Refine_20326 other) {
            if (other == RuneMsg.C2S_Refine_20326.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (!other.refineSpecialItem_.isEmpty()) {
                  if (this.refineSpecialItem_.isEmpty()) {
                     this.refineSpecialItem_ = other.refineSpecialItem_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureRefineSpecialItemIsMutable();
                     this.refineSpecialItem_.addAll(other.refineSpecialItem_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Refine_20326 parsedMessage = null;

            try {
               parsedMessage = (C2S_Refine_20326)RuneMsg.C2S_Refine_20326.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Refine_20326)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         private void ensureRefineSpecialItemIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.refineSpecialItem_ = RuneMsg.C2S_Refine_20326.mutableCopy(this.refineSpecialItem_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getRefineSpecialItemList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.refineSpecialItem_) : this.refineSpecialItem_);
         }

         public int getRefineSpecialItemCount() {
            return this.refineSpecialItem_.size();
         }

         public int getRefineSpecialItem(int index) {
            return this.refineSpecialItem_.getInt(index);
         }

         public Builder setRefineSpecialItem(int index, int value) {
            this.ensureRefineSpecialItemIsMutable();
            this.refineSpecialItem_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRefineSpecialItem(int value) {
            this.ensureRefineSpecialItemIsMutable();
            this.refineSpecialItem_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRefineSpecialItem(Iterable<? extends Integer> values) {
            this.ensureRefineSpecialItemIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.refineSpecialItem_);
            this.onChanged();
            return this;
         }

         public Builder clearRefineSpecialItem() {
            this.refineSpecialItem_ = RuneMsg.C2S_Refine_20326.emptyIntList();
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

   public static final class S2C_Refine_20327 extends GeneratedMessageV3 implements S2C_Refine_20327OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_Refine_20327 DEFAULT_INSTANCE = new S2C_Refine_20327();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Refine_20327> PARSER = new AbstractParser<S2C_Refine_20327>() {
         public S2C_Refine_20327 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Refine_20327(input, extensionRegistry);
         }
      };

      private S2C_Refine_20327(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Refine_20327() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Refine_20327();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Refine_20327(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Refine_20327.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Refine_20327)) {
            return super.equals(obj);
         } else {
            S2C_Refine_20327 other = (S2C_Refine_20327)obj;
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

      public static S2C_Refine_20327 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Refine_20327)PARSER.parseFrom(data);
      }

      public static S2C_Refine_20327 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Refine_20327)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Refine_20327 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Refine_20327)PARSER.parseFrom(data);
      }

      public static S2C_Refine_20327 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Refine_20327)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Refine_20327 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Refine_20327)PARSER.parseFrom(data);
      }

      public static S2C_Refine_20327 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Refine_20327)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Refine_20327 parseFrom(InputStream input) throws IOException {
         return (S2C_Refine_20327)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Refine_20327 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Refine_20327)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Refine_20327 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Refine_20327)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Refine_20327 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Refine_20327)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Refine_20327 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Refine_20327)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Refine_20327 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Refine_20327)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Refine_20327 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Refine_20327 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Refine_20327> parser() {
         return PARSER;
      }

      public Parser<S2C_Refine_20327> getParserForType() {
         return PARSER;
      }

      public S2C_Refine_20327 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Refine_20327OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Refine_20327.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_Refine_20327.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_Refine_20327_descriptor;
         }

         public S2C_Refine_20327 getDefaultInstanceForType() {
            return RuneMsg.S2C_Refine_20327.getDefaultInstance();
         }

         public S2C_Refine_20327 build() {
            S2C_Refine_20327 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Refine_20327 buildPartial() {
            S2C_Refine_20327 result = new S2C_Refine_20327(this);
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
            if (other instanceof S2C_Refine_20327) {
               return this.mergeFrom((S2C_Refine_20327)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Refine_20327 other) {
            if (other == RuneMsg.S2C_Refine_20327.getDefaultInstance()) {
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
            S2C_Refine_20327 parsedMessage = null;

            try {
               parsedMessage = (S2C_Refine_20327)RuneMsg.S2C_Refine_20327.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Refine_20327)e.getUnfinishedMessage();
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

   public static final class C2S_RefineBreakUp_20328 extends GeneratedMessageV3 implements C2S_RefineBreakUp_20328OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_RefineBreakUp_20328 DEFAULT_INSTANCE = new C2S_RefineBreakUp_20328();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RefineBreakUp_20328> PARSER = new AbstractParser<C2S_RefineBreakUp_20328>() {
         public C2S_RefineBreakUp_20328 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RefineBreakUp_20328(input, extensionRegistry);
         }
      };

      private C2S_RefineBreakUp_20328(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RefineBreakUp_20328() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RefineBreakUp_20328();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RefineBreakUp_20328(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefineBreakUp_20328.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RefineBreakUp_20328)) {
            return super.equals(obj);
         } else {
            C2S_RefineBreakUp_20328 other = (C2S_RefineBreakUp_20328)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RefineBreakUp_20328 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RefineBreakUp_20328)PARSER.parseFrom(data);
      }

      public static C2S_RefineBreakUp_20328 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineBreakUp_20328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineBreakUp_20328 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RefineBreakUp_20328)PARSER.parseFrom(data);
      }

      public static C2S_RefineBreakUp_20328 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineBreakUp_20328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineBreakUp_20328 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RefineBreakUp_20328)PARSER.parseFrom(data);
      }

      public static C2S_RefineBreakUp_20328 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineBreakUp_20328)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineBreakUp_20328 parseFrom(InputStream input) throws IOException {
         return (C2S_RefineBreakUp_20328)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefineBreakUp_20328 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineBreakUp_20328)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefineBreakUp_20328 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RefineBreakUp_20328)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RefineBreakUp_20328 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineBreakUp_20328)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefineBreakUp_20328 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RefineBreakUp_20328)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefineBreakUp_20328 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineBreakUp_20328)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RefineBreakUp_20328 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RefineBreakUp_20328 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RefineBreakUp_20328> parser() {
         return PARSER;
      }

      public Parser<C2S_RefineBreakUp_20328> getParserForType() {
         return PARSER;
      }

      public C2S_RefineBreakUp_20328 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RefineBreakUp_20328OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefineBreakUp_20328.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RefineBreakUp_20328.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineBreakUp_20328_descriptor;
         }

         public C2S_RefineBreakUp_20328 getDefaultInstanceForType() {
            return RuneMsg.C2S_RefineBreakUp_20328.getDefaultInstance();
         }

         public C2S_RefineBreakUp_20328 build() {
            C2S_RefineBreakUp_20328 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RefineBreakUp_20328 buildPartial() {
            C2S_RefineBreakUp_20328 result = new C2S_RefineBreakUp_20328(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_RefineBreakUp_20328) {
               return this.mergeFrom((C2S_RefineBreakUp_20328)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RefineBreakUp_20328 other) {
            if (other == RuneMsg.C2S_RefineBreakUp_20328.getDefaultInstance()) {
               return this;
            } else {
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
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RefineBreakUp_20328 parsedMessage = null;

            try {
               parsedMessage = (C2S_RefineBreakUp_20328)RuneMsg.C2S_RefineBreakUp_20328.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RefineBreakUp_20328)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
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

   public static final class S2C_RefineBreakUp_20329 extends GeneratedMessageV3 implements S2C_RefineBreakUp_20329OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_RefineBreakUp_20329 DEFAULT_INSTANCE = new S2C_RefineBreakUp_20329();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RefineBreakUp_20329> PARSER = new AbstractParser<S2C_RefineBreakUp_20329>() {
         public S2C_RefineBreakUp_20329 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RefineBreakUp_20329(input, extensionRegistry);
         }
      };

      private S2C_RefineBreakUp_20329(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RefineBreakUp_20329() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RefineBreakUp_20329();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RefineBreakUp_20329(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefineBreakUp_20329.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RefineBreakUp_20329)) {
            return super.equals(obj);
         } else {
            S2C_RefineBreakUp_20329 other = (S2C_RefineBreakUp_20329)obj;
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

      public static S2C_RefineBreakUp_20329 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RefineBreakUp_20329)PARSER.parseFrom(data);
      }

      public static S2C_RefineBreakUp_20329 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineBreakUp_20329)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineBreakUp_20329 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RefineBreakUp_20329)PARSER.parseFrom(data);
      }

      public static S2C_RefineBreakUp_20329 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineBreakUp_20329)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineBreakUp_20329 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RefineBreakUp_20329)PARSER.parseFrom(data);
      }

      public static S2C_RefineBreakUp_20329 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineBreakUp_20329)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineBreakUp_20329 parseFrom(InputStream input) throws IOException {
         return (S2C_RefineBreakUp_20329)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefineBreakUp_20329 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineBreakUp_20329)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefineBreakUp_20329 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RefineBreakUp_20329)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RefineBreakUp_20329 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineBreakUp_20329)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefineBreakUp_20329 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RefineBreakUp_20329)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefineBreakUp_20329 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineBreakUp_20329)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RefineBreakUp_20329 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RefineBreakUp_20329 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RefineBreakUp_20329> parser() {
         return PARSER;
      }

      public Parser<S2C_RefineBreakUp_20329> getParserForType() {
         return PARSER;
      }

      public S2C_RefineBreakUp_20329 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RefineBreakUp_20329OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefineBreakUp_20329.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RefineBreakUp_20329.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineBreakUp_20329_descriptor;
         }

         public S2C_RefineBreakUp_20329 getDefaultInstanceForType() {
            return RuneMsg.S2C_RefineBreakUp_20329.getDefaultInstance();
         }

         public S2C_RefineBreakUp_20329 build() {
            S2C_RefineBreakUp_20329 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RefineBreakUp_20329 buildPartial() {
            S2C_RefineBreakUp_20329 result = new S2C_RefineBreakUp_20329(this);
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
            if (other instanceof S2C_RefineBreakUp_20329) {
               return this.mergeFrom((S2C_RefineBreakUp_20329)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RefineBreakUp_20329 other) {
            if (other == RuneMsg.S2C_RefineBreakUp_20329.getDefaultInstance()) {
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
            S2C_RefineBreakUp_20329 parsedMessage = null;

            try {
               parsedMessage = (S2C_RefineBreakUp_20329)RuneMsg.S2C_RefineBreakUp_20329.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RefineBreakUp_20329)e.getUnfinishedMessage();
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

   public static final class C2S_RefineReset_20330 extends GeneratedMessageV3 implements C2S_RefineReset_20330OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_RefineReset_20330 DEFAULT_INSTANCE = new C2S_RefineReset_20330();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RefineReset_20330> PARSER = new AbstractParser<C2S_RefineReset_20330>() {
         public C2S_RefineReset_20330 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RefineReset_20330(input, extensionRegistry);
         }
      };

      private C2S_RefineReset_20330(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RefineReset_20330() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RefineReset_20330();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RefineReset_20330(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefineReset_20330.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RefineReset_20330)) {
            return super.equals(obj);
         } else {
            C2S_RefineReset_20330 other = (C2S_RefineReset_20330)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RefineReset_20330 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RefineReset_20330)PARSER.parseFrom(data);
      }

      public static C2S_RefineReset_20330 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineReset_20330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineReset_20330 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RefineReset_20330)PARSER.parseFrom(data);
      }

      public static C2S_RefineReset_20330 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineReset_20330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineReset_20330 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RefineReset_20330)PARSER.parseFrom(data);
      }

      public static C2S_RefineReset_20330 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineReset_20330)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineReset_20330 parseFrom(InputStream input) throws IOException {
         return (C2S_RefineReset_20330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefineReset_20330 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineReset_20330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefineReset_20330 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RefineReset_20330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RefineReset_20330 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineReset_20330)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefineReset_20330 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RefineReset_20330)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefineReset_20330 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineReset_20330)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RefineReset_20330 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RefineReset_20330 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RefineReset_20330> parser() {
         return PARSER;
      }

      public Parser<C2S_RefineReset_20330> getParserForType() {
         return PARSER;
      }

      public C2S_RefineReset_20330 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RefineReset_20330OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefineReset_20330.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RefineReset_20330.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineReset_20330_descriptor;
         }

         public C2S_RefineReset_20330 getDefaultInstanceForType() {
            return RuneMsg.C2S_RefineReset_20330.getDefaultInstance();
         }

         public C2S_RefineReset_20330 build() {
            C2S_RefineReset_20330 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RefineReset_20330 buildPartial() {
            C2S_RefineReset_20330 result = new C2S_RefineReset_20330(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_RefineReset_20330) {
               return this.mergeFrom((C2S_RefineReset_20330)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RefineReset_20330 other) {
            if (other == RuneMsg.C2S_RefineReset_20330.getDefaultInstance()) {
               return this;
            } else {
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
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RefineReset_20330 parsedMessage = null;

            try {
               parsedMessage = (C2S_RefineReset_20330)RuneMsg.C2S_RefineReset_20330.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RefineReset_20330)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
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

   public static final class S2C_RefineReset_20331 extends GeneratedMessageV3 implements S2C_RefineReset_20331OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_RefineReset_20331 DEFAULT_INSTANCE = new S2C_RefineReset_20331();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RefineReset_20331> PARSER = new AbstractParser<S2C_RefineReset_20331>() {
         public S2C_RefineReset_20331 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RefineReset_20331(input, extensionRegistry);
         }
      };

      private S2C_RefineReset_20331(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RefineReset_20331() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RefineReset_20331();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RefineReset_20331(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefineReset_20331.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RefineReset_20331)) {
            return super.equals(obj);
         } else {
            S2C_RefineReset_20331 other = (S2C_RefineReset_20331)obj;
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

      public static S2C_RefineReset_20331 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RefineReset_20331)PARSER.parseFrom(data);
      }

      public static S2C_RefineReset_20331 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineReset_20331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineReset_20331 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RefineReset_20331)PARSER.parseFrom(data);
      }

      public static S2C_RefineReset_20331 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineReset_20331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineReset_20331 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RefineReset_20331)PARSER.parseFrom(data);
      }

      public static S2C_RefineReset_20331 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineReset_20331)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineReset_20331 parseFrom(InputStream input) throws IOException {
         return (S2C_RefineReset_20331)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefineReset_20331 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineReset_20331)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefineReset_20331 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RefineReset_20331)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RefineReset_20331 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineReset_20331)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefineReset_20331 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RefineReset_20331)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefineReset_20331 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineReset_20331)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RefineReset_20331 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RefineReset_20331 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RefineReset_20331> parser() {
         return PARSER;
      }

      public Parser<S2C_RefineReset_20331> getParserForType() {
         return PARSER;
      }

      public S2C_RefineReset_20331 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RefineReset_20331OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefineReset_20331.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RefineReset_20331.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineReset_20331_descriptor;
         }

         public S2C_RefineReset_20331 getDefaultInstanceForType() {
            return RuneMsg.S2C_RefineReset_20331.getDefaultInstance();
         }

         public S2C_RefineReset_20331 build() {
            S2C_RefineReset_20331 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RefineReset_20331 buildPartial() {
            S2C_RefineReset_20331 result = new S2C_RefineReset_20331(this);
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
            if (other instanceof S2C_RefineReset_20331) {
               return this.mergeFrom((S2C_RefineReset_20331)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RefineReset_20331 other) {
            if (other == RuneMsg.S2C_RefineReset_20331.getDefaultInstance()) {
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
            S2C_RefineReset_20331 parsedMessage = null;

            try {
               parsedMessage = (S2C_RefineReset_20331)RuneMsg.S2C_RefineReset_20331.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RefineReset_20331)e.getUnfinishedMessage();
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

   public static final class C2S_RefineInherit_20332 extends GeneratedMessageV3 implements C2S_RefineInherit_20332OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int ITEMCODE_FIELD_NUMBER = 3;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_RefineInherit_20332 DEFAULT_INSTANCE = new C2S_RefineInherit_20332();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RefineInherit_20332> PARSER = new AbstractParser<C2S_RefineInherit_20332>() {
         public C2S_RefineInherit_20332 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RefineInherit_20332(input, extensionRegistry);
         }
      };

      private C2S_RefineInherit_20332(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RefineInherit_20332() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RefineInherit_20332();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RefineInherit_20332(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.itemCode_ = input.readInt32();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefineInherit_20332.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
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
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItemCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.itemCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RefineInherit_20332)) {
            return super.equals(obj);
         } else {
            C2S_RefineInherit_20332 other = (C2S_RefineInherit_20332)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RefineInherit_20332 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RefineInherit_20332)PARSER.parseFrom(data);
      }

      public static C2S_RefineInherit_20332 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineInherit_20332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineInherit_20332 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RefineInherit_20332)PARSER.parseFrom(data);
      }

      public static C2S_RefineInherit_20332 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineInherit_20332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineInherit_20332 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RefineInherit_20332)PARSER.parseFrom(data);
      }

      public static C2S_RefineInherit_20332 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineInherit_20332)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineInherit_20332 parseFrom(InputStream input) throws IOException {
         return (C2S_RefineInherit_20332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefineInherit_20332 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineInherit_20332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefineInherit_20332 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RefineInherit_20332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RefineInherit_20332 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineInherit_20332)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefineInherit_20332 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RefineInherit_20332)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefineInherit_20332 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineInherit_20332)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RefineInherit_20332 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RefineInherit_20332 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RefineInherit_20332> parser() {
         return PARSER;
      }

      public Parser<C2S_RefineInherit_20332> getParserForType() {
         return PARSER;
      }

      public C2S_RefineInherit_20332 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RefineInherit_20332OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefineInherit_20332.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RefineInherit_20332.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RefineInherit_20332_descriptor;
         }

         public C2S_RefineInherit_20332 getDefaultInstanceForType() {
            return RuneMsg.C2S_RefineInherit_20332.getDefaultInstance();
         }

         public C2S_RefineInherit_20332 build() {
            C2S_RefineInherit_20332 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RefineInherit_20332 buildPartial() {
            C2S_RefineInherit_20332 result = new C2S_RefineInherit_20332(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 4) != 0) {
               result.itemCode_ = this.itemCode_;
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
            if (other instanceof C2S_RefineInherit_20332) {
               return this.mergeFrom((C2S_RefineInherit_20332)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RefineInherit_20332 other) {
            if (other == RuneMsg.C2S_RefineInherit_20332.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasItemCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RefineInherit_20332 parsedMessage = null;

            try {
               parsedMessage = (C2S_RefineInherit_20332)RuneMsg.C2S_RefineInherit_20332.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RefineInherit_20332)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 4;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -5;
            this.itemCode_ = 0;
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

   public static final class S2C_RefineInherit_20333 extends GeneratedMessageV3 implements S2C_RefineInherit_20333OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_RefineInherit_20333 DEFAULT_INSTANCE = new S2C_RefineInherit_20333();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RefineInherit_20333> PARSER = new AbstractParser<S2C_RefineInherit_20333>() {
         public S2C_RefineInherit_20333 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RefineInherit_20333(input, extensionRegistry);
         }
      };

      private S2C_RefineInherit_20333(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RefineInherit_20333() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RefineInherit_20333();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RefineInherit_20333(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefineInherit_20333.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RefineInherit_20333)) {
            return super.equals(obj);
         } else {
            S2C_RefineInherit_20333 other = (S2C_RefineInherit_20333)obj;
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

      public static S2C_RefineInherit_20333 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RefineInherit_20333)PARSER.parseFrom(data);
      }

      public static S2C_RefineInherit_20333 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineInherit_20333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineInherit_20333 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RefineInherit_20333)PARSER.parseFrom(data);
      }

      public static S2C_RefineInherit_20333 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineInherit_20333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineInherit_20333 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RefineInherit_20333)PARSER.parseFrom(data);
      }

      public static S2C_RefineInherit_20333 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineInherit_20333)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineInherit_20333 parseFrom(InputStream input) throws IOException {
         return (S2C_RefineInherit_20333)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefineInherit_20333 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineInherit_20333)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefineInherit_20333 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RefineInherit_20333)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RefineInherit_20333 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineInherit_20333)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefineInherit_20333 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RefineInherit_20333)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefineInherit_20333 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineInherit_20333)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RefineInherit_20333 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RefineInherit_20333 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RefineInherit_20333> parser() {
         return PARSER;
      }

      public Parser<S2C_RefineInherit_20333> getParserForType() {
         return PARSER;
      }

      public S2C_RefineInherit_20333 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RefineInherit_20333OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefineInherit_20333.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RefineInherit_20333.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RefineInherit_20333_descriptor;
         }

         public S2C_RefineInherit_20333 getDefaultInstanceForType() {
            return RuneMsg.S2C_RefineInherit_20333.getDefaultInstance();
         }

         public S2C_RefineInherit_20333 build() {
            S2C_RefineInherit_20333 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RefineInherit_20333 buildPartial() {
            S2C_RefineInherit_20333 result = new S2C_RefineInherit_20333(this);
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
            if (other instanceof S2C_RefineInherit_20333) {
               return this.mergeFrom((S2C_RefineInherit_20333)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RefineInherit_20333 other) {
            if (other == RuneMsg.S2C_RefineInherit_20333.getDefaultInstance()) {
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
            S2C_RefineInherit_20333 parsedMessage = null;

            try {
               parsedMessage = (S2C_RefineInherit_20333)RuneMsg.S2C_RefineInherit_20333.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RefineInherit_20333)e.getUnfinishedMessage();
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

   public static final class C2S_RuneDecompose_20334 extends GeneratedMessageV3 implements C2S_RuneDecompose_20334OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private Internal.IntList itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneDecompose_20334 DEFAULT_INSTANCE = new C2S_RuneDecompose_20334();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneDecompose_20334> PARSER = new AbstractParser<C2S_RuneDecompose_20334>() {
         public C2S_RuneDecompose_20334 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneDecompose_20334(input, extensionRegistry);
         }
      };

      private C2S_RuneDecompose_20334(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneDecompose_20334() {
         this.memoizedIsInitialized = -1;
         this.itemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneDecompose_20334();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneDecompose_20334(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemCode_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.itemCode_.addInt(input.readInt32());
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
                  this.itemCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneDecompose_20334.class, Builder.class);
      }

      public List<Integer> getItemCodeList() {
         return this.itemCode_;
      }

      public int getItemCodeCount() {
         return this.itemCode_.size();
      }

      public int getItemCode(int index) {
         return this.itemCode_.getInt(index);
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
         for(int i = 0; i < this.itemCode_.size(); ++i) {
            output.writeInt32(1, this.itemCode_.getInt(i));
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

            for(int i = 0; i < this.itemCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.itemCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getItemCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RuneDecompose_20334)) {
            return super.equals(obj);
         } else {
            C2S_RuneDecompose_20334 other = (C2S_RuneDecompose_20334)obj;
            if (!this.getItemCodeList().equals(other.getItemCodeList())) {
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
            if (this.getItemCodeCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RuneDecompose_20334 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneDecompose_20334)PARSER.parseFrom(data);
      }

      public static C2S_RuneDecompose_20334 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneDecompose_20334)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneDecompose_20334 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneDecompose_20334)PARSER.parseFrom(data);
      }

      public static C2S_RuneDecompose_20334 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneDecompose_20334)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneDecompose_20334 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneDecompose_20334)PARSER.parseFrom(data);
      }

      public static C2S_RuneDecompose_20334 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneDecompose_20334)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneDecompose_20334 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneDecompose_20334)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneDecompose_20334 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneDecompose_20334)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneDecompose_20334 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneDecompose_20334)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneDecompose_20334 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneDecompose_20334)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneDecompose_20334 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneDecompose_20334)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneDecompose_20334 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneDecompose_20334)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneDecompose_20334 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneDecompose_20334 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneDecompose_20334> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneDecompose_20334> getParserForType() {
         return PARSER;
      }

      public C2S_RuneDecompose_20334 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneDecompose_20334OrBuilder {
         private int bitField0_;
         private Internal.IntList itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneDecompose_20334.class, Builder.class);
         }

         private Builder() {
            this.itemCode_ = RuneMsg.C2S_RuneDecompose_20334.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCode_ = RuneMsg.C2S_RuneDecompose_20334.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RuneDecompose_20334.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = RuneMsg.C2S_RuneDecompose_20334.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneDecompose_20334_descriptor;
         }

         public C2S_RuneDecompose_20334 getDefaultInstanceForType() {
            return RuneMsg.C2S_RuneDecompose_20334.getDefaultInstance();
         }

         public C2S_RuneDecompose_20334 build() {
            C2S_RuneDecompose_20334 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneDecompose_20334 buildPartial() {
            C2S_RuneDecompose_20334 result = new C2S_RuneDecompose_20334(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.itemCode_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemCode_ = this.itemCode_;
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
            if (other instanceof C2S_RuneDecompose_20334) {
               return this.mergeFrom((C2S_RuneDecompose_20334)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneDecompose_20334 other) {
            if (other == RuneMsg.C2S_RuneDecompose_20334.getDefaultInstance()) {
               return this;
            } else {
               if (!other.itemCode_.isEmpty()) {
                  if (this.itemCode_.isEmpty()) {
                     this.itemCode_ = other.itemCode_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureItemCodeIsMutable();
                     this.itemCode_.addAll(other.itemCode_);
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
            C2S_RuneDecompose_20334 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneDecompose_20334)RuneMsg.C2S_RuneDecompose_20334.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneDecompose_20334)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemCodeIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.itemCode_ = RuneMsg.C2S_RuneDecompose_20334.mutableCopy(this.itemCode_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getItemCodeList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.itemCode_) : this.itemCode_);
         }

         public int getItemCodeCount() {
            return this.itemCode_.size();
         }

         public int getItemCode(int index) {
            return this.itemCode_.getInt(index);
         }

         public Builder setItemCode(int index, int value) {
            this.ensureItemCodeIsMutable();
            this.itemCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addItemCode(int value) {
            this.ensureItemCodeIsMutable();
            this.itemCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllItemCode(Iterable<? extends Integer> values) {
            this.ensureItemCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemCode_);
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.itemCode_ = RuneMsg.C2S_RuneDecompose_20334.emptyIntList();
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

   public static final class S2C_RuneDecompose_20335 extends GeneratedMessageV3 implements S2C_RuneDecompose_20335OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_RuneDecompose_20335 DEFAULT_INSTANCE = new S2C_RuneDecompose_20335();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneDecompose_20335> PARSER = new AbstractParser<S2C_RuneDecompose_20335>() {
         public S2C_RuneDecompose_20335 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneDecompose_20335(input, extensionRegistry);
         }
      };

      private S2C_RuneDecompose_20335(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneDecompose_20335() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneDecompose_20335();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneDecompose_20335(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneDecompose_20335.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RuneDecompose_20335)) {
            return super.equals(obj);
         } else {
            S2C_RuneDecompose_20335 other = (S2C_RuneDecompose_20335)obj;
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

      public static S2C_RuneDecompose_20335 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneDecompose_20335)PARSER.parseFrom(data);
      }

      public static S2C_RuneDecompose_20335 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneDecompose_20335)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneDecompose_20335 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneDecompose_20335)PARSER.parseFrom(data);
      }

      public static S2C_RuneDecompose_20335 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneDecompose_20335)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneDecompose_20335 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneDecompose_20335)PARSER.parseFrom(data);
      }

      public static S2C_RuneDecompose_20335 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneDecompose_20335)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneDecompose_20335 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneDecompose_20335)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneDecompose_20335 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneDecompose_20335)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneDecompose_20335 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneDecompose_20335)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneDecompose_20335 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneDecompose_20335)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneDecompose_20335 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneDecompose_20335)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneDecompose_20335 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneDecompose_20335)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneDecompose_20335 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneDecompose_20335 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneDecompose_20335> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneDecompose_20335> getParserForType() {
         return PARSER;
      }

      public S2C_RuneDecompose_20335 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneDecompose_20335OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneDecompose_20335.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RuneDecompose_20335.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneDecompose_20335_descriptor;
         }

         public S2C_RuneDecompose_20335 getDefaultInstanceForType() {
            return RuneMsg.S2C_RuneDecompose_20335.getDefaultInstance();
         }

         public S2C_RuneDecompose_20335 build() {
            S2C_RuneDecompose_20335 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneDecompose_20335 buildPartial() {
            S2C_RuneDecompose_20335 result = new S2C_RuneDecompose_20335(this);
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
            if (other instanceof S2C_RuneDecompose_20335) {
               return this.mergeFrom((S2C_RuneDecompose_20335)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneDecompose_20335 other) {
            if (other == RuneMsg.S2C_RuneDecompose_20335.getDefaultInstance()) {
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
            S2C_RuneDecompose_20335 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneDecompose_20335)RuneMsg.S2C_RuneDecompose_20335.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneDecompose_20335)e.getUnfinishedMessage();
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

   public static final class C2S_LockNatureId_20336 extends GeneratedMessageV3 implements C2S_LockNatureId_20336OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int LOCKNATUREID_FIELD_NUMBER = 3;
      private int lockNatureId_;
      private byte memoizedIsInitialized;
      private static final C2S_LockNatureId_20336 DEFAULT_INSTANCE = new C2S_LockNatureId_20336();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LockNatureId_20336> PARSER = new AbstractParser<C2S_LockNatureId_20336>() {
         public C2S_LockNatureId_20336 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LockNatureId_20336(input, extensionRegistry);
         }
      };

      private C2S_LockNatureId_20336(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LockNatureId_20336() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LockNatureId_20336();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LockNatureId_20336(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lockNatureId_ = input.readInt32();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LockNatureId_20336.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public boolean hasLockNatureId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLockNatureId() {
         return this.lockNatureId_;
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
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLockNatureId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lockNatureId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lockNatureId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LockNatureId_20336)) {
            return super.equals(obj);
         } else {
            C2S_LockNatureId_20336 other = (C2S_LockNatureId_20336)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasLockNatureId() != other.hasLockNatureId()) {
               return false;
            } else if (this.hasLockNatureId() && this.getLockNatureId() != other.getLockNatureId()) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.hasLockNatureId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLockNatureId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LockNatureId_20336 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LockNatureId_20336)PARSER.parseFrom(data);
      }

      public static C2S_LockNatureId_20336 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockNatureId_20336)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockNatureId_20336 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LockNatureId_20336)PARSER.parseFrom(data);
      }

      public static C2S_LockNatureId_20336 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockNatureId_20336)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockNatureId_20336 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LockNatureId_20336)PARSER.parseFrom(data);
      }

      public static C2S_LockNatureId_20336 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockNatureId_20336)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockNatureId_20336 parseFrom(InputStream input) throws IOException {
         return (C2S_LockNatureId_20336)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LockNatureId_20336 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockNatureId_20336)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LockNatureId_20336 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LockNatureId_20336)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LockNatureId_20336 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockNatureId_20336)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LockNatureId_20336 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LockNatureId_20336)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LockNatureId_20336 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockNatureId_20336)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LockNatureId_20336 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LockNatureId_20336 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LockNatureId_20336> parser() {
         return PARSER;
      }

      public Parser<C2S_LockNatureId_20336> getParserForType() {
         return PARSER;
      }

      public C2S_LockNatureId_20336 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LockNatureId_20336OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int lockNatureId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LockNatureId_20336.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_LockNatureId_20336.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.lockNatureId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_LockNatureId_20336_descriptor;
         }

         public C2S_LockNatureId_20336 getDefaultInstanceForType() {
            return RuneMsg.C2S_LockNatureId_20336.getDefaultInstance();
         }

         public C2S_LockNatureId_20336 build() {
            C2S_LockNatureId_20336 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LockNatureId_20336 buildPartial() {
            C2S_LockNatureId_20336 result = new C2S_LockNatureId_20336(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 4) != 0) {
               result.lockNatureId_ = this.lockNatureId_;
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
            if (other instanceof C2S_LockNatureId_20336) {
               return this.mergeFrom((C2S_LockNatureId_20336)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LockNatureId_20336 other) {
            if (other == RuneMsg.C2S_LockNatureId_20336.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasLockNatureId()) {
                  this.setLockNatureId(other.getLockNatureId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasLockNatureId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LockNatureId_20336 parsedMessage = null;

            try {
               parsedMessage = (C2S_LockNatureId_20336)RuneMsg.C2S_LockNatureId_20336.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LockNatureId_20336)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasLockNatureId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLockNatureId() {
            return this.lockNatureId_;
         }

         public Builder setLockNatureId(int value) {
            this.bitField0_ |= 4;
            this.lockNatureId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLockNatureId() {
            this.bitField0_ &= -5;
            this.lockNatureId_ = 0;
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

   public static final class S2C_LockNatureId_20337 extends GeneratedMessageV3 implements S2C_LockNatureId_20337OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_LockNatureId_20337 DEFAULT_INSTANCE = new S2C_LockNatureId_20337();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LockNatureId_20337> PARSER = new AbstractParser<S2C_LockNatureId_20337>() {
         public S2C_LockNatureId_20337 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LockNatureId_20337(input, extensionRegistry);
         }
      };

      private S2C_LockNatureId_20337(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LockNatureId_20337() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LockNatureId_20337();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LockNatureId_20337(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LockNatureId_20337.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LockNatureId_20337)) {
            return super.equals(obj);
         } else {
            S2C_LockNatureId_20337 other = (S2C_LockNatureId_20337)obj;
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

      public static S2C_LockNatureId_20337 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LockNatureId_20337)PARSER.parseFrom(data);
      }

      public static S2C_LockNatureId_20337 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockNatureId_20337)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockNatureId_20337 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LockNatureId_20337)PARSER.parseFrom(data);
      }

      public static S2C_LockNatureId_20337 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockNatureId_20337)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockNatureId_20337 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LockNatureId_20337)PARSER.parseFrom(data);
      }

      public static S2C_LockNatureId_20337 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockNatureId_20337)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockNatureId_20337 parseFrom(InputStream input) throws IOException {
         return (S2C_LockNatureId_20337)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LockNatureId_20337 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockNatureId_20337)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LockNatureId_20337 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LockNatureId_20337)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LockNatureId_20337 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockNatureId_20337)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LockNatureId_20337 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LockNatureId_20337)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LockNatureId_20337 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockNatureId_20337)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LockNatureId_20337 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LockNatureId_20337 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LockNatureId_20337> parser() {
         return PARSER;
      }

      public Parser<S2C_LockNatureId_20337> getParserForType() {
         return PARSER;
      }

      public S2C_LockNatureId_20337 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LockNatureId_20337OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LockNatureId_20337.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_LockNatureId_20337.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_LockNatureId_20337_descriptor;
         }

         public S2C_LockNatureId_20337 getDefaultInstanceForType() {
            return RuneMsg.S2C_LockNatureId_20337.getDefaultInstance();
         }

         public S2C_LockNatureId_20337 build() {
            S2C_LockNatureId_20337 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LockNatureId_20337 buildPartial() {
            S2C_LockNatureId_20337 result = new S2C_LockNatureId_20337(this);
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
            if (other instanceof S2C_LockNatureId_20337) {
               return this.mergeFrom((S2C_LockNatureId_20337)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LockNatureId_20337 other) {
            if (other == RuneMsg.S2C_LockNatureId_20337.getDefaultInstance()) {
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
            S2C_LockNatureId_20337 parsedMessage = null;

            try {
               parsedMessage = (S2C_LockNatureId_20337)RuneMsg.S2C_LockNatureId_20337.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LockNatureId_20337)e.getUnfinishedMessage();
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

   public static final class C2S_UnlockNatureId_20338 extends GeneratedMessageV3 implements C2S_UnlockNatureId_20338OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int UNLOCKNATUREID_FIELD_NUMBER = 3;
      private int unlockNatureId_;
      private byte memoizedIsInitialized;
      private static final C2S_UnlockNatureId_20338 DEFAULT_INSTANCE = new C2S_UnlockNatureId_20338();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnlockNatureId_20338> PARSER = new AbstractParser<C2S_UnlockNatureId_20338>() {
         public C2S_UnlockNatureId_20338 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnlockNatureId_20338(input, extensionRegistry);
         }
      };

      private C2S_UnlockNatureId_20338(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnlockNatureId_20338() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnlockNatureId_20338();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnlockNatureId_20338(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.unlockNatureId_ = input.readInt32();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockNatureId_20338.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public boolean hasUnlockNatureId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getUnlockNatureId() {
         return this.unlockNatureId_;
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
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnlockNatureId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.unlockNatureId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.unlockNatureId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UnlockNatureId_20338)) {
            return super.equals(obj);
         } else {
            C2S_UnlockNatureId_20338 other = (C2S_UnlockNatureId_20338)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasUnlockNatureId() != other.hasUnlockNatureId()) {
               return false;
            } else if (this.hasUnlockNatureId() && this.getUnlockNatureId() != other.getUnlockNatureId()) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.hasUnlockNatureId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUnlockNatureId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UnlockNatureId_20338 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnlockNatureId_20338)PARSER.parseFrom(data);
      }

      public static C2S_UnlockNatureId_20338 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockNatureId_20338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockNatureId_20338 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnlockNatureId_20338)PARSER.parseFrom(data);
      }

      public static C2S_UnlockNatureId_20338 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockNatureId_20338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockNatureId_20338 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnlockNatureId_20338)PARSER.parseFrom(data);
      }

      public static C2S_UnlockNatureId_20338 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockNatureId_20338)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockNatureId_20338 parseFrom(InputStream input) throws IOException {
         return (C2S_UnlockNatureId_20338)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockNatureId_20338 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockNatureId_20338)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockNatureId_20338 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnlockNatureId_20338)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnlockNatureId_20338 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockNatureId_20338)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockNatureId_20338 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnlockNatureId_20338)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockNatureId_20338 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockNatureId_20338)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnlockNatureId_20338 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnlockNatureId_20338 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnlockNatureId_20338> parser() {
         return PARSER;
      }

      public Parser<C2S_UnlockNatureId_20338> getParserForType() {
         return PARSER;
      }

      public C2S_UnlockNatureId_20338 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnlockNatureId_20338OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int unlockNatureId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockNatureId_20338.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_UnlockNatureId_20338.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.unlockNatureId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_UnlockNatureId_20338_descriptor;
         }

         public C2S_UnlockNatureId_20338 getDefaultInstanceForType() {
            return RuneMsg.C2S_UnlockNatureId_20338.getDefaultInstance();
         }

         public C2S_UnlockNatureId_20338 build() {
            C2S_UnlockNatureId_20338 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnlockNatureId_20338 buildPartial() {
            C2S_UnlockNatureId_20338 result = new C2S_UnlockNatureId_20338(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 4) != 0) {
               result.unlockNatureId_ = this.unlockNatureId_;
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
            if (other instanceof C2S_UnlockNatureId_20338) {
               return this.mergeFrom((C2S_UnlockNatureId_20338)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnlockNatureId_20338 other) {
            if (other == RuneMsg.C2S_UnlockNatureId_20338.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasUnlockNatureId()) {
                  this.setUnlockNatureId(other.getUnlockNatureId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasUnlockNatureId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UnlockNatureId_20338 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnlockNatureId_20338)RuneMsg.C2S_UnlockNatureId_20338.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnlockNatureId_20338)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasUnlockNatureId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getUnlockNatureId() {
            return this.unlockNatureId_;
         }

         public Builder setUnlockNatureId(int value) {
            this.bitField0_ |= 4;
            this.unlockNatureId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnlockNatureId() {
            this.bitField0_ &= -5;
            this.unlockNatureId_ = 0;
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

   public static final class S2C_UnlockNatureId_20339 extends GeneratedMessageV3 implements S2C_UnlockNatureId_20339OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockNatureId_20339 DEFAULT_INSTANCE = new S2C_UnlockNatureId_20339();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockNatureId_20339> PARSER = new AbstractParser<S2C_UnlockNatureId_20339>() {
         public S2C_UnlockNatureId_20339 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockNatureId_20339(input, extensionRegistry);
         }
      };

      private S2C_UnlockNatureId_20339(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockNatureId_20339() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockNatureId_20339();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockNatureId_20339(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockNatureId_20339.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UnlockNatureId_20339)) {
            return super.equals(obj);
         } else {
            S2C_UnlockNatureId_20339 other = (S2C_UnlockNatureId_20339)obj;
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

      public static S2C_UnlockNatureId_20339 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockNatureId_20339)PARSER.parseFrom(data);
      }

      public static S2C_UnlockNatureId_20339 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockNatureId_20339)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockNatureId_20339 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockNatureId_20339)PARSER.parseFrom(data);
      }

      public static S2C_UnlockNatureId_20339 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockNatureId_20339)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockNatureId_20339 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockNatureId_20339)PARSER.parseFrom(data);
      }

      public static S2C_UnlockNatureId_20339 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockNatureId_20339)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockNatureId_20339 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockNatureId_20339)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockNatureId_20339 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockNatureId_20339)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockNatureId_20339 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockNatureId_20339)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockNatureId_20339 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockNatureId_20339)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockNatureId_20339 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockNatureId_20339)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockNatureId_20339 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockNatureId_20339)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockNatureId_20339 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockNatureId_20339 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockNatureId_20339> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockNatureId_20339> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockNatureId_20339 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockNatureId_20339OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockNatureId_20339.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_UnlockNatureId_20339.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_UnlockNatureId_20339_descriptor;
         }

         public S2C_UnlockNatureId_20339 getDefaultInstanceForType() {
            return RuneMsg.S2C_UnlockNatureId_20339.getDefaultInstance();
         }

         public S2C_UnlockNatureId_20339 build() {
            S2C_UnlockNatureId_20339 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockNatureId_20339 buildPartial() {
            S2C_UnlockNatureId_20339 result = new S2C_UnlockNatureId_20339(this);
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
            if (other instanceof S2C_UnlockNatureId_20339) {
               return this.mergeFrom((S2C_UnlockNatureId_20339)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockNatureId_20339 other) {
            if (other == RuneMsg.S2C_UnlockNatureId_20339.getDefaultInstance()) {
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
            S2C_UnlockNatureId_20339 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockNatureId_20339)RuneMsg.S2C_UnlockNatureId_20339.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockNatureId_20339)e.getUnfinishedMessage();
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

   public static final class C2S_GetLockNatureIds_20340 extends GeneratedMessageV3 implements C2S_GetLockNatureIds_20340OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_GetLockNatureIds_20340 DEFAULT_INSTANCE = new C2S_GetLockNatureIds_20340();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetLockNatureIds_20340> PARSER = new AbstractParser<C2S_GetLockNatureIds_20340>() {
         public C2S_GetLockNatureIds_20340 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetLockNatureIds_20340(input, extensionRegistry);
         }
      };

      private C2S_GetLockNatureIds_20340(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetLockNatureIds_20340() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetLockNatureIds_20340();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetLockNatureIds_20340(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetLockNatureIds_20340.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GetLockNatureIds_20340)) {
            return super.equals(obj);
         } else {
            C2S_GetLockNatureIds_20340 other = (C2S_GetLockNatureIds_20340)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetLockNatureIds_20340)PARSER.parseFrom(data);
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetLockNatureIds_20340)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetLockNatureIds_20340)PARSER.parseFrom(data);
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetLockNatureIds_20340)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetLockNatureIds_20340)PARSER.parseFrom(data);
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetLockNatureIds_20340)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(InputStream input) throws IOException {
         return (C2S_GetLockNatureIds_20340)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetLockNatureIds_20340)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetLockNatureIds_20340 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetLockNatureIds_20340)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetLockNatureIds_20340 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetLockNatureIds_20340)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetLockNatureIds_20340)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetLockNatureIds_20340 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetLockNatureIds_20340)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetLockNatureIds_20340 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetLockNatureIds_20340 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetLockNatureIds_20340> parser() {
         return PARSER;
      }

      public Parser<C2S_GetLockNatureIds_20340> getParserForType() {
         return PARSER;
      }

      public C2S_GetLockNatureIds_20340 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetLockNatureIds_20340OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetLockNatureIds_20340.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_GetLockNatureIds_20340.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_GetLockNatureIds_20340_descriptor;
         }

         public C2S_GetLockNatureIds_20340 getDefaultInstanceForType() {
            return RuneMsg.C2S_GetLockNatureIds_20340.getDefaultInstance();
         }

         public C2S_GetLockNatureIds_20340 build() {
            C2S_GetLockNatureIds_20340 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetLockNatureIds_20340 buildPartial() {
            C2S_GetLockNatureIds_20340 result = new C2S_GetLockNatureIds_20340(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
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
            if (other instanceof C2S_GetLockNatureIds_20340) {
               return this.mergeFrom((C2S_GetLockNatureIds_20340)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetLockNatureIds_20340 other) {
            if (other == RuneMsg.C2S_GetLockNatureIds_20340.getDefaultInstance()) {
               return this;
            } else {
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
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GetLockNatureIds_20340 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetLockNatureIds_20340)RuneMsg.C2S_GetLockNatureIds_20340.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetLockNatureIds_20340)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
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

   public static final class S2C_GetLockNatureIds_20341 extends GeneratedMessageV3 implements S2C_GetLockNatureIds_20341OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int LOCKNATUREID_FIELD_NUMBER = 3;
      private Internal.IntList lockNatureId_;
      private byte memoizedIsInitialized;
      private static final S2C_GetLockNatureIds_20341 DEFAULT_INSTANCE = new S2C_GetLockNatureIds_20341();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetLockNatureIds_20341> PARSER = new AbstractParser<S2C_GetLockNatureIds_20341>() {
         public S2C_GetLockNatureIds_20341 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetLockNatureIds_20341(input, extensionRegistry);
         }
      };

      private S2C_GetLockNatureIds_20341(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetLockNatureIds_20341() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
         this.lockNatureId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetLockNatureIds_20341();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetLockNatureIds_20341(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.lockNatureId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.lockNatureId_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.lockNatureId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.lockNatureId_.addInt(input.readInt32());
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
                  this.lockNatureId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetLockNatureIds_20341.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public List<Integer> getLockNatureIdList() {
         return this.lockNatureId_;
      }

      public int getLockNatureIdCount() {
         return this.lockNatureId_.size();
      }

      public int getLockNatureId(int index) {
         return this.lockNatureId_.getInt(index);
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         for(int i = 0; i < this.lockNatureId_.size(); ++i) {
            output.writeInt32(3, this.lockNatureId_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.lockNatureId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.lockNatureId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getLockNatureIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetLockNatureIds_20341)) {
            return super.equals(obj);
         } else {
            S2C_GetLockNatureIds_20341 other = (S2C_GetLockNatureIds_20341)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (!this.getLockNatureIdList().equals(other.getLockNatureIdList())) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.getLockNatureIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLockNatureIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetLockNatureIds_20341)PARSER.parseFrom(data);
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetLockNatureIds_20341)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetLockNatureIds_20341)PARSER.parseFrom(data);
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetLockNatureIds_20341)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetLockNatureIds_20341)PARSER.parseFrom(data);
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetLockNatureIds_20341)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(InputStream input) throws IOException {
         return (S2C_GetLockNatureIds_20341)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetLockNatureIds_20341)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetLockNatureIds_20341 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetLockNatureIds_20341)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetLockNatureIds_20341 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetLockNatureIds_20341)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetLockNatureIds_20341)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetLockNatureIds_20341 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetLockNatureIds_20341)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetLockNatureIds_20341 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetLockNatureIds_20341 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetLockNatureIds_20341> parser() {
         return PARSER;
      }

      public Parser<S2C_GetLockNatureIds_20341> getParserForType() {
         return PARSER;
      }

      public S2C_GetLockNatureIds_20341 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetLockNatureIds_20341OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private Internal.IntList lockNatureId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetLockNatureIds_20341.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.lockNatureId_ = RuneMsg.S2C_GetLockNatureIds_20341.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.lockNatureId_ = RuneMsg.S2C_GetLockNatureIds_20341.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_GetLockNatureIds_20341.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.lockNatureId_ = RuneMsg.S2C_GetLockNatureIds_20341.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_GetLockNatureIds_20341_descriptor;
         }

         public S2C_GetLockNatureIds_20341 getDefaultInstanceForType() {
            return RuneMsg.S2C_GetLockNatureIds_20341.getDefaultInstance();
         }

         public S2C_GetLockNatureIds_20341 build() {
            S2C_GetLockNatureIds_20341 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetLockNatureIds_20341 buildPartial() {
            S2C_GetLockNatureIds_20341 result = new S2C_GetLockNatureIds_20341(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((this.bitField0_ & 4) != 0) {
               this.lockNatureId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.lockNatureId_ = this.lockNatureId_;
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
            if (other instanceof S2C_GetLockNatureIds_20341) {
               return this.mergeFrom((S2C_GetLockNatureIds_20341)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetLockNatureIds_20341 other) {
            if (other == RuneMsg.S2C_GetLockNatureIds_20341.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (!other.lockNatureId_.isEmpty()) {
                  if (this.lockNatureId_.isEmpty()) {
                     this.lockNatureId_ = other.lockNatureId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureLockNatureIdIsMutable();
                     this.lockNatureId_.addAll(other.lockNatureId_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetLockNatureIds_20341 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetLockNatureIds_20341)RuneMsg.S2C_GetLockNatureIds_20341.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetLockNatureIds_20341)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         private void ensureLockNatureIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.lockNatureId_ = RuneMsg.S2C_GetLockNatureIds_20341.mutableCopy(this.lockNatureId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getLockNatureIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.lockNatureId_) : this.lockNatureId_);
         }

         public int getLockNatureIdCount() {
            return this.lockNatureId_.size();
         }

         public int getLockNatureId(int index) {
            return this.lockNatureId_.getInt(index);
         }

         public Builder setLockNatureId(int index, int value) {
            this.ensureLockNatureIdIsMutable();
            this.lockNatureId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addLockNatureId(int value) {
            this.ensureLockNatureIdIsMutable();
            this.lockNatureId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllLockNatureId(Iterable<? extends Integer> values) {
            this.ensureLockNatureIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.lockNatureId_);
            this.onChanged();
            return this;
         }

         public Builder clearLockNatureId() {
            this.lockNatureId_ = RuneMsg.S2C_GetLockNatureIds_20341.emptyIntList();
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

   public static final class C2S_RuneLvChange_20342 extends GeneratedMessageV3 implements C2S_RuneLvChange_20342OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int ITEMCODE_FIELD_NUMBER = 3;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_RuneLvChange_20342 DEFAULT_INSTANCE = new C2S_RuneLvChange_20342();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RuneLvChange_20342> PARSER = new AbstractParser<C2S_RuneLvChange_20342>() {
         public C2S_RuneLvChange_20342 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RuneLvChange_20342(input, extensionRegistry);
         }
      };

      private C2S_RuneLvChange_20342(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RuneLvChange_20342() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RuneLvChange_20342();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RuneLvChange_20342(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCode_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        CommonMsg.RunePosition value = CommonMsg.RunePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.itemCode_ = input.readInt32();
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLvChange_20342.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.RunePosition getPosition() {
         CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
         return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
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
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItemCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.position_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.itemCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RuneLvChange_20342)) {
            return super.equals(obj);
         } else {
            C2S_RuneLvChange_20342 other = (C2S_RuneLvChange_20342)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.position_;
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RuneLvChange_20342 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RuneLvChange_20342)PARSER.parseFrom(data);
      }

      public static C2S_RuneLvChange_20342 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLvChange_20342)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLvChange_20342 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RuneLvChange_20342)PARSER.parseFrom(data);
      }

      public static C2S_RuneLvChange_20342 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLvChange_20342)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLvChange_20342 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RuneLvChange_20342)PARSER.parseFrom(data);
      }

      public static C2S_RuneLvChange_20342 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RuneLvChange_20342)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RuneLvChange_20342 parseFrom(InputStream input) throws IOException {
         return (C2S_RuneLvChange_20342)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLvChange_20342 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLvChange_20342)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLvChange_20342 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RuneLvChange_20342)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RuneLvChange_20342 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLvChange_20342)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RuneLvChange_20342 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RuneLvChange_20342)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RuneLvChange_20342 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RuneLvChange_20342)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RuneLvChange_20342 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RuneLvChange_20342 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RuneLvChange_20342> parser() {
         return PARSER;
      }

      public Parser<C2S_RuneLvChange_20342> getParserForType() {
         return PARSER;
      }

      public C2S_RuneLvChange_20342 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RuneLvChange_20342OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RuneLvChange_20342.class, Builder.class);
         }

         private Builder() {
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.position_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.C2S_RuneLvChange_20342.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.itemCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_C2S_RuneLvChange_20342_descriptor;
         }

         public C2S_RuneLvChange_20342 getDefaultInstanceForType() {
            return RuneMsg.C2S_RuneLvChange_20342.getDefaultInstance();
         }

         public C2S_RuneLvChange_20342 build() {
            C2S_RuneLvChange_20342 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RuneLvChange_20342 buildPartial() {
            C2S_RuneLvChange_20342 result = new C2S_RuneLvChange_20342(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.position_ = this.position_;
            if ((from_bitField0_ & 4) != 0) {
               result.itemCode_ = this.itemCode_;
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
            if (other instanceof C2S_RuneLvChange_20342) {
               return this.mergeFrom((C2S_RuneLvChange_20342)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RuneLvChange_20342 other) {
            if (other == RuneMsg.C2S_RuneLvChange_20342.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasItemCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RuneLvChange_20342 parsedMessage = null;

            try {
               parsedMessage = (C2S_RuneLvChange_20342)RuneMsg.C2S_RuneLvChange_20342.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RuneLvChange_20342)e.getUnfinishedMessage();
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

         public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.RunePosition getPosition() {
            CommonMsg.RunePosition result = CommonMsg.RunePosition.valueOf(this.position_);
            return result == null ? CommonMsg.RunePosition.WEAR_RUNE_1 : result;
         }

         public Builder setPosition(CommonMsg.RunePosition value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.position_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearPosition() {
            this.bitField0_ &= -3;
            this.position_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasItemCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getItemCode() {
            return this.itemCode_;
         }

         public Builder setItemCode(int value) {
            this.bitField0_ |= 4;
            this.itemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemCode() {
            this.bitField0_ &= -5;
            this.itemCode_ = 0;
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

   public static final class S2C_RuneLvChange_20343 extends GeneratedMessageV3 implements S2C_RuneLvChange_20343OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_RuneLvChange_20343 DEFAULT_INSTANCE = new S2C_RuneLvChange_20343();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RuneLvChange_20343> PARSER = new AbstractParser<S2C_RuneLvChange_20343>() {
         public S2C_RuneLvChange_20343 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RuneLvChange_20343(input, extensionRegistry);
         }
      };

      private S2C_RuneLvChange_20343(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RuneLvChange_20343() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RuneLvChange_20343();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RuneLvChange_20343(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLvChange_20343.class, Builder.class);
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
         } else if (!(obj instanceof S2C_RuneLvChange_20343)) {
            return super.equals(obj);
         } else {
            S2C_RuneLvChange_20343 other = (S2C_RuneLvChange_20343)obj;
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

      public static S2C_RuneLvChange_20343 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RuneLvChange_20343)PARSER.parseFrom(data);
      }

      public static S2C_RuneLvChange_20343 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLvChange_20343)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLvChange_20343 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RuneLvChange_20343)PARSER.parseFrom(data);
      }

      public static S2C_RuneLvChange_20343 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLvChange_20343)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLvChange_20343 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RuneLvChange_20343)PARSER.parseFrom(data);
      }

      public static S2C_RuneLvChange_20343 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RuneLvChange_20343)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RuneLvChange_20343 parseFrom(InputStream input) throws IOException {
         return (S2C_RuneLvChange_20343)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLvChange_20343 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLvChange_20343)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLvChange_20343 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RuneLvChange_20343)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RuneLvChange_20343 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLvChange_20343)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RuneLvChange_20343 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RuneLvChange_20343)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RuneLvChange_20343 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RuneLvChange_20343)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RuneLvChange_20343 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RuneLvChange_20343 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RuneLvChange_20343> parser() {
         return PARSER;
      }

      public Parser<S2C_RuneLvChange_20343> getParserForType() {
         return PARSER;
      }

      public S2C_RuneLvChange_20343 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RuneLvChange_20343OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RuneLvChange_20343.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RuneMsg.S2C_RuneLvChange_20343.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return RuneMsg.internal_static_rune_com_gzbz_protobuf_S2C_RuneLvChange_20343_descriptor;
         }

         public S2C_RuneLvChange_20343 getDefaultInstanceForType() {
            return RuneMsg.S2C_RuneLvChange_20343.getDefaultInstance();
         }

         public S2C_RuneLvChange_20343 build() {
            S2C_RuneLvChange_20343 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RuneLvChange_20343 buildPartial() {
            S2C_RuneLvChange_20343 result = new S2C_RuneLvChange_20343(this);
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
            if (other instanceof S2C_RuneLvChange_20343) {
               return this.mergeFrom((S2C_RuneLvChange_20343)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RuneLvChange_20343 other) {
            if (other == RuneMsg.S2C_RuneLvChange_20343.getDefaultInstance()) {
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
            S2C_RuneLvChange_20343 parsedMessage = null;

            try {
               parsedMessage = (S2C_RuneLvChange_20343)RuneMsg.S2C_RuneLvChange_20343.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RuneLvChange_20343)e.getUnfinishedMessage();
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

   public interface C2S_Change_20322OrBuilder extends MessageOrBuilder {
      boolean hasWearState();

      int getWearState();

      boolean hasItemCode();

      int getItemCode();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      boolean hasTargetRuneId();

      int getTargetRuneId();
   }

   public interface C2S_Fusion_20318OrBuilder extends MessageOrBuilder {
      boolean hasWearState();

      int getWearState();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      boolean hasFunctionRuneId();

      int getFunctionRuneId();

      List<Integer> getCostItemCodesList();

      int getCostItemCodesCount();

      int getCostItemCodes(int index);
   }

   public interface C2S_GetLockNatureIds_20340OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();
   }

   public interface C2S_LockNatureId_20336OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      boolean hasLockNatureId();

      int getLockNatureId();
   }

   public interface C2S_RefineBreakUp_20328OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();
   }

   public interface C2S_RefineInherit_20332OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      boolean hasItemCode();

      int getItemCode();
   }

   public interface C2S_RefineReset_20330OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();
   }

   public interface C2S_Refine_20326OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      List<Integer> getRefineSpecialItemList();

      int getRefineSpecialItemCount();

      int getRefineSpecialItem(int index);
   }

   public interface C2S_Reset_20324OrBuilder extends MessageOrBuilder {
      boolean hasWearState();

      int getWearState();

      boolean hasItemCode();

      int getItemCode();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();
   }

   public interface C2S_RuneAndRefineInfo_20310OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_RuneDecompose_20334OrBuilder extends MessageOrBuilder {
      List<Integer> getItemCodeList();

      int getItemCodeCount();

      int getItemCode(int index);
   }

   public interface C2S_RuneLotteryBoxReward_20305OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_RuneLotteryInfo_20301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RuneLotteryRecordList_20307OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_RuneLottery_20303OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_RuneLvChange_20342OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      boolean hasItemCode();

      int getItemCode();
   }

   public interface C2S_Strengthen_20316OrBuilder extends MessageOrBuilder {
      boolean hasWearState();

      int getWearState();

      boolean hasItemCode();

      int getItemCode();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      List<CommonMsg.MapDataII> getCostItemsList();

      CommonMsg.MapDataII getCostItems(int index);

      int getCostItemsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getCostItemsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getCostItemsOrBuilder(int index);
   }

   public interface C2S_UndressRune_20314OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();
   }

   public interface C2S_UnlockNatureId_20338OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      boolean hasUnlockNatureId();

      int getUnlockNatureId();
   }

   public interface C2S_UpQuality_20320OrBuilder extends MessageOrBuilder {
      boolean hasWearState();

      int getWearState();

      boolean hasItemCode();

      int getItemCode();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();
   }

   public interface C2S_WearRune_20312OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();
   }

   public interface RuneLotteryRecordDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasResourceType();

      int getResourceType();

      boolean hasResourceId();

      int getResourceId();

      boolean hasResourceNum();

      int getResourceNum();
   }

   public interface S2C_Change_20323OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Fusion_20319OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_GetLockNatureIds_20341OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      List<Integer> getLockNatureIdList();

      int getLockNatureIdCount();

      int getLockNatureId(int index);
   }

   public interface S2C_LockNatureId_20337OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_RefineBreakUp_20329OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_RefineInherit_20333OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_RefineReset_20331OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Refine_20327OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Reset_20325OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_RuneAndRefineInfo_20311OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasRuneAndRefineInfo();

      CommonMsg.RuneAndRefineInfo getRuneAndRefineInfo();

      CommonMsg.RuneAndRefineInfoOrBuilder getRuneAndRefineInfoOrBuilder();
   }

   public interface S2C_RuneDecompose_20335OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_RuneLotteryBoxReward_20306OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasRuneLotteryPoint();

      int getRuneLotteryPoint();
   }

   public interface S2C_RuneLotteryInfo_20302OrBuilder extends MessageOrBuilder {
      boolean hasRuneLotteryCount();

      int getRuneLotteryCount();

      boolean hasRuneLotteryPoint();

      int getRuneLotteryPoint();

      List<Integer> getGotBoxesList();

      int getGotBoxesCount();

      int getGotBoxes(int index);

      boolean hasRuneLotteryFreeCount();

      int getRuneLotteryFreeCount();

      boolean hasDailyRuneLotteryCount();

      int getDailyRuneLotteryCount();
   }

   public interface S2C_RuneLotteryRecordList_20308OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<RuneLotteryRecordData> getRecordListList();

      RuneLotteryRecordData getRecordList(int index);

      int getRecordListCount();

      List<? extends RuneLotteryRecordDataOrBuilder> getRecordListOrBuilderList();

      RuneLotteryRecordDataOrBuilder getRecordListOrBuilder(int index);
   }

   public interface S2C_RuneLotteryRecord_20309OrBuilder extends MessageOrBuilder {
      List<RuneLotteryRecordData> getRecordListList();

      RuneLotteryRecordData getRecordList(int index);

      int getRecordListCount();

      List<? extends RuneLotteryRecordDataOrBuilder> getRecordListOrBuilderList();

      RuneLotteryRecordDataOrBuilder getRecordListOrBuilder(int index);
   }

   public interface S2C_RuneLottery_20304OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasRuneLotteryCount();

      int getRuneLotteryCount();

      boolean hasDailyRuneLotteryCount();

      int getDailyRuneLotteryCount();
   }

   public interface S2C_RuneLvChange_20343OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Strengthen_20317OrBuilder extends MessageOrBuilder {
      boolean hasWearState();

      int getWearState();

      boolean hasItemCode();

      int getItemCode();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      boolean hasUpgradeProgress();

      int getUpgradeProgress();

      boolean hasLevel();

      int getLevel();

      boolean hasIsUpgrade();

      boolean getIsUpgrade();
   }

   public interface S2C_UndressRune_20315OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();
   }

   public interface S2C_UnlockNatureId_20339OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_UpQuality_20321OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_WearRune_20313OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.RunePosition getPosition();

      boolean hasItemCode();

      int getItemCode();

      boolean hasCallReplaceLv();

      boolean getCallReplaceLv();
   }
}
