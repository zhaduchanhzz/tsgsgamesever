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
import com.google.protobuf.ProtocolMessageEnum;
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

public final class TongqueTerraceMsg {
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private TongqueTerraceMsg() {
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
      String[] descriptorData = new String[]{"\n\u0014TongqueTerrace.proto\u0012 tongqueTerrace.com.gzbz.protobuf\u001a\fcommon.proto\";\n\nUnlockInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nunlockStep\u0018\u0003 \u0002(\u0005\"\u0091\u0003\n\nBeautyInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nunlockStep\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007trystLv\u0018\u0004 \u0002(\u0005\u0012\u0010\n\btrystExp\u0018\u0005 \u0002(\u0005\u0012\u0011\n\tbestowNum\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0007 \u0002(\u0005\u0012\u0013\n\u000bpatronizeLv\u0018\b \u0002(\u0005\u0012,\n\u000etrystPropertys\u0018\t \u0003(\u000b2\u0014.common.PropertyInfo\u0012-\n\u000fbestowPropertys\u0018\n \u0003(\u000b2\u0014.common.PropertyInfo\u0012/\n\u0011patronizeProperty\u0018\u000b \u0003(\u000b2\u0014.common.PropertyInfo\u0012=\n\u0004type\u0018\f \u0001(\u000e2/.tongqueTerrace.com.gzbz.protobuf.CooperateType\u0012\u0013\n\u000bbeautyGrade\u0018\r \u0001(\u0005\u0012\u0016\n\u000eassistantSkill\u0018\u000e \u0001(\u0005\"S\n\fTrystExpInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006addExp\u0018\u0002 \u0002(\u0005\u0012'\n\tprotities\u0018\u0003 \u0003(\u000b2\u0014.common.PropertyInfo\"t\n\u000fBeautyTrystInfo\u0012\u0010\n\bbeatuyId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007trystLv\u0018\u0002 \u0002(\u0005\u0012\u0010\n\btrystExp\u0018\u0003 \u0002(\u0005\u0012,\n\u000etrystPropertys\u0018\n \u0003(\u000b2\u0014.common.PropertyInfo\"\u0015\n\u0013C2S_UnlockInfo_9801\"X\n\u0019S2C_UnlockInfoResult_9802\u0012;\n\u0005infos\u0018\u0002 \u0003(\u000b2,.tongqueTerrace.com.gzbz.protobuf.UnlockInfo\"\u0011\n\u000fC2S_OpenUi_9803\"f\n\u0015S2C_OpenUiResult_9804\u0012\u0010\n\bdownTime\u0018\u0001 \u0002(\u0005\u0012;\n\u0005infos\u0018\u0002 \u0003(\u000b2,.tongqueTerrace.com.gzbz.protobuf.BeautyInfo\"O\n\u0012C2S_FreeTryst_9805\u00129\n\u0004type\u0018\u0001 \u0002(\u000e2+.tongqueTerrace.com.gzbz.protobuf.TrystType\"ð\u0001\n\u0018S2C_FreeTrystResult_9806\u0012\u0010\n\bdownTime\u0018\u0001 \u0002(\u0005\u00129\n\u0004type\u0018\u0002 \u0002(\u000e2+.tongqueTerrace.com.gzbz.protobuf.TrystType\u0012@\n\bexpInfos\u0018\u0003 \u0003(\u000b2..tongqueTerrace.com.gzbz.protobuf.TrystExpInfo\u0012E\n\ntrystInfos\u0018\u0004 \u0003(\u000b21.tongqueTerrace.com.gzbz.protobuf.BeautyTrystInfo\"(\n\u0014C2S_TrystBeauty_9807\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\"·\u0001\n\u001aS2C_TrystBeautyResult_9808\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\u0012@\n\bexpInfos\u0018\u0002 \u0002(\u000b2..tongqueTerrace.com.gzbz.protobuf.TrystExpInfo\u0012E\n\ntrystInfos\u0018\u0004 \u0002(\u000b21.tongqueTerrace.com.gzbz.protobuf.BeautyTrystInfo\"6\n\u0015C2S_BestowBeauty_9811\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"n\n\u001bS2C_BestowBeautyResult_9812\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\u00120\n\u0012addBestowPropertys\u0018\u0003 \u0003(\u000b2\u0014.common.PropertyInfo\"*\n\u0016C2S_SkillUpBeauty_9813\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\"Y\n\u001cS2C_SkillUpBeautyResult_9814\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0003 \u0002(\u0005\u0012\u0016\n\u000eassistantSkill\u0018\u0004 \u0001(\u0005\",\n\u0018C2S_PatronizeBeauty_9815\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\"{\n\u001eS2C_PatronizeBeautyResult_9816\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bpatronizeLv\u0018\u0002 \u0002(\u0005\u00122\n\u0014addPatronizeProperty\u0018\u0003 \u0003(\u000b2\u0014.common.PropertyInfo\"7\n\u0015C2S_UnlockBeauty_9821\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004step\u0018\u0002 \u0002(\u0005\"Y\n\u001bS2C_UnlockBeautyResult_9822\u0012:\n\u0004info\u0018\u0001 \u0002(\u000b2,.tongqueTerrace.com.gzbz.protobuf.UnlockInfo\"d\n\rCooperateInfo\u0012=\n\u0004type\u0018\u0001 \u0002(\u000e2/.tongqueTerrace.com.gzbz.protobuf.CooperateType\u0012\u0014\n\fbeautyIdList\u0018\u0002 \u0003(\u0005\"\u0018\n\u0016C2S_CooperateInfo_9830\"W\n\u0016S2C_CooperateInfo_9831\u0012=\n\u0004info\u0018\u0001 \u0003(\u000b2/.tongqueTerrace.com.gzbz.protobuf.CooperateInfo\"\\\n\u0016C2S_SaveCooperate_9832\u0012B\n\tcooperate\u0018\u0002 \u0002(\u000b2/.tongqueTerrace.com.gzbz.protobuf.CooperateInfo\"l\n\u0016S2C_SaveCooperate_9833\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012B\n\tcooperate\u0018\u0002 \u0001(\u000b2/.tongqueTerrace.com.gzbz.protobuf.CooperateInfo\"Z\n\u0019C2S_DismissCooperate_9834\u0012=\n\u0004type\u0018\u0001 \u0002(\u000e2/.tongqueTerrace.com.gzbz.protobuf.CooperateType\"j\n\u0019S2C_DismissCooperate_9835\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012=\n\u0004type\u0018\u0002 \u0001(\u000e2/.tongqueTerrace.com.gzbz.protobuf.CooperateType\"Y\n\u001aS2C_NotifyBeautyState_9836\u0012;\n\u0004info\u0018\u0001 \u0003(\u000b2-.tongqueTerrace.com.gzbz.protobuf.BeautyState\"m\n\u000bBeautyState\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012=\n\u0004type\u0018\u0002 \u0002(\u000e2/.tongqueTerrace.com.gzbz.protobuf.CooperateType\u0012\u0013\n\u000bbeautyGrade\u0018\u0003 \u0002(\u0005\"Q\n\u0019C2S_PlayerBeautyInfo_9840\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bbeautyId\u0018\u0003 \u0001(\u0005\"\u0093\u0001\n\u0019S2C_PlayerBeautyInfo_9841\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\u0012;\n\u0005infos\u0018\u0002 \u0003(\u000b2,.tongqueTerrace.com.gzbz.protobuf.BeautyInfo\u0012\u0014\n\fbeautyIdList\u0018\u0003 \u0003(\u0005\u0012\u0011\n\tskillList\u0018\u0004 \u0003(\u0005\"8\n\u0014C2S_ResetBeauty_9842\u0012\u0010\n\bbeautyId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006status\u0018\u0002 \u0002(\u0005\"7\n\u0014S2C_ResetBeauty_9843\u0012\u001f\n\u0005items\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfo*=\n\tTrystType\u0012\u0013\n\u000fTRYST_TYPE_FREE\u0010\u0000\u0012\u001b\n\u0017TRYST_TYPE_FREE_ONEKEEY\u0010\u0001*d\n\rCooperateType\u0012\u0012\n\u000eCOOPERATE_NONE\u0010\u0000\u0012\u0014\n\u0010COOPERATE_HEAVEN\u0010\u0001\u0012\u0013\n\u000fCOOPERATE_EARTH\u0010\u0002\u0012\u0014\n\u0010COOPERATE_PERSON\u0010\u0003B(\n\u0011com.gzbz.protobufB\u0011TongqueTerraceMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_descriptor, new String[]{"Id", "State", "UnlockStep"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_descriptor, new String[]{"Id", "State", "UnlockStep", "TrystLv", "TrystExp", "BestowNum", "SkillId", "PatronizeLv", "TrystPropertys", "BestowPropertys", "PatronizeProperty", "Type", "BeautyGrade", "AssistantSkill"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_descriptor, new String[]{"Id", "AddExp", "Protities"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_descriptor, new String[]{"BeatuyId", "TrystLv", "TrystExp", "TrystPropertys"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_descriptor, new String[0]);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_descriptor, new String[]{"Infos"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_descriptor, new String[0]);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_descriptor, new String[]{"DownTime", "Infos"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_descriptor, new String[]{"Type"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_descriptor, new String[]{"DownTime", "Type", "ExpInfos", "TrystInfos"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_descriptor, new String[]{"BeautyId"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_descriptor, new String[]{"BeautyId", "ExpInfos", "TrystInfos"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_descriptor, new String[]{"BeautyId", "Num"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_descriptor, new String[]{"BeautyId", "Num", "AddBestowPropertys"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_descriptor, new String[]{"BeautyId"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_descriptor, new String[]{"BeautyId", "SkillId", "AssistantSkill"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_descriptor, new String[]{"BeautyId"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_descriptor, new String[]{"BeautyId", "PatronizeLv", "AddPatronizeProperty"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_descriptor, new String[]{"BeautyId", "Step"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_descriptor, new String[]{"Info"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_descriptor, new String[]{"Type", "BeautyIdList"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_descriptor, new String[0]);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_descriptor, new String[]{"Info"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_descriptor, new String[]{"Cooperate"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_descriptor, new String[]{"Result", "Cooperate"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_descriptor, new String[]{"Type"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_descriptor, new String[]{"Result", "Type"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_descriptor, new String[]{"Info"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_descriptor, new String[]{"Id", "Type", "BeautyGrade"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_descriptor, new String[]{"PlayerId", "ServerId", "BeautyId"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_descriptor, new String[]{"BeautyId", "Infos", "BeautyIdList", "SkillList"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_descriptor, new String[]{"BeautyId", "Status"});
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_descriptor, new String[]{"Items"});
      CommonMsg.getDescriptor();
   }

   public static enum TrystType implements ProtocolMessageEnum {
      TRYST_TYPE_FREE(0),
      TRYST_TYPE_FREE_ONEKEEY(1);

      public static final int TRYST_TYPE_FREE_VALUE = 0;
      public static final int TRYST_TYPE_FREE_ONEKEEY_VALUE = 1;
      private static final Internal.EnumLiteMap<TrystType> internalValueMap = new Internal.EnumLiteMap<TrystType>() {
         public TrystType findValueByNumber(int number) {
            return TongqueTerraceMsg.TrystType.forNumber(number);
         }
      };
      private static final TrystType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static TrystType valueOf(int value) {
         return forNumber(value);
      }

      public static TrystType forNumber(int value) {
         switch (value) {
            case 0:
               return TRYST_TYPE_FREE;
            case 1:
               return TRYST_TYPE_FREE_ONEKEEY;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<TrystType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)TongqueTerraceMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static TrystType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private TrystType(int value) {
         this.value = value;
      }
   }

   public static enum CooperateType implements ProtocolMessageEnum {
      COOPERATE_NONE(0),
      COOPERATE_HEAVEN(1),
      COOPERATE_EARTH(2),
      COOPERATE_PERSON(3);

      public static final int COOPERATE_NONE_VALUE = 0;
      public static final int COOPERATE_HEAVEN_VALUE = 1;
      public static final int COOPERATE_EARTH_VALUE = 2;
      public static final int COOPERATE_PERSON_VALUE = 3;
      private static final Internal.EnumLiteMap<CooperateType> internalValueMap = new Internal.EnumLiteMap<CooperateType>() {
         public CooperateType findValueByNumber(int number) {
            return TongqueTerraceMsg.CooperateType.forNumber(number);
         }
      };
      private static final CooperateType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static CooperateType valueOf(int value) {
         return forNumber(value);
      }

      public static CooperateType forNumber(int value) {
         switch (value) {
            case 0:
               return COOPERATE_NONE;
            case 1:
               return COOPERATE_HEAVEN;
            case 2:
               return COOPERATE_EARTH;
            case 3:
               return COOPERATE_PERSON;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CooperateType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)TongqueTerraceMsg.getDescriptor().getEnumTypes().get(1);
      }

      public static CooperateType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private CooperateType(int value) {
         this.value = value;
      }
   }

   public static final class UnlockInfo extends GeneratedMessageV3 implements UnlockInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      public static final int UNLOCKSTEP_FIELD_NUMBER = 3;
      private int unlockStep_;
      private byte memoizedIsInitialized;
      private static final UnlockInfo DEFAULT_INSTANCE = new UnlockInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<UnlockInfo> PARSER = new AbstractParser<UnlockInfo>() {
         public UnlockInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new UnlockInfo(input, extensionRegistry);
         }
      };

      private UnlockInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private UnlockInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new UnlockInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private UnlockInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.state_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.unlockStep_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(UnlockInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasUnlockStep() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getUnlockStep() {
         return this.unlockStep_;
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
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnlockStep()) {
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
            output.writeInt32(2, this.state_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.unlockStep_);
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
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.unlockStep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof UnlockInfo)) {
            return super.equals(obj);
         } else {
            UnlockInfo other = (UnlockInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasUnlockStep() != other.hasUnlockStep()) {
               return false;
            } else if (this.hasUnlockStep() && this.getUnlockStep() != other.getUnlockStep()) {
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

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            if (this.hasUnlockStep()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUnlockStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static UnlockInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (UnlockInfo)PARSER.parseFrom(data);
      }

      public static UnlockInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (UnlockInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static UnlockInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (UnlockInfo)PARSER.parseFrom(data);
      }

      public static UnlockInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (UnlockInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static UnlockInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (UnlockInfo)PARSER.parseFrom(data);
      }

      public static UnlockInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (UnlockInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static UnlockInfo parseFrom(InputStream input) throws IOException {
         return (UnlockInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static UnlockInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (UnlockInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static UnlockInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (UnlockInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static UnlockInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (UnlockInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static UnlockInfo parseFrom(CodedInputStream input) throws IOException {
         return (UnlockInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static UnlockInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (UnlockInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(UnlockInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static UnlockInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<UnlockInfo> parser() {
         return PARSER;
      }

      public Parser<UnlockInfo> getParserForType() {
         return PARSER;
      }

      public UnlockInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UnlockInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int state_;
         private int unlockStep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(UnlockInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.UnlockInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            this.unlockStep_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_UnlockInfo_descriptor;
         }

         public UnlockInfo getDefaultInstanceForType() {
            return TongqueTerraceMsg.UnlockInfo.getDefaultInstance();
         }

         public UnlockInfo build() {
            UnlockInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public UnlockInfo buildPartial() {
            UnlockInfo result = new UnlockInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.unlockStep_ = this.unlockStep_;
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
            if (other instanceof UnlockInfo) {
               return this.mergeFrom((UnlockInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(UnlockInfo other) {
            if (other == TongqueTerraceMsg.UnlockInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasUnlockStep()) {
                  this.setUnlockStep(other.getUnlockStep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else {
               return this.hasUnlockStep();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            UnlockInfo parsedMessage = null;

            try {
               parsedMessage = (UnlockInfo)TongqueTerraceMsg.UnlockInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (UnlockInfo)e.getUnfinishedMessage();
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

         public boolean hasState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 2;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnlockStep() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getUnlockStep() {
            return this.unlockStep_;
         }

         public Builder setUnlockStep(int value) {
            this.bitField0_ |= 4;
            this.unlockStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnlockStep() {
            this.bitField0_ &= -5;
            this.unlockStep_ = 0;
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

   public static final class BeautyInfo extends GeneratedMessageV3 implements BeautyInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int STATE_FIELD_NUMBER = 2;
      private int state_;
      public static final int UNLOCKSTEP_FIELD_NUMBER = 3;
      private int unlockStep_;
      public static final int TRYSTLV_FIELD_NUMBER = 4;
      private int trystLv_;
      public static final int TRYSTEXP_FIELD_NUMBER = 5;
      private int trystExp_;
      public static final int BESTOWNUM_FIELD_NUMBER = 6;
      private int bestowNum_;
      public static final int SKILLID_FIELD_NUMBER = 7;
      private int skillId_;
      public static final int PATRONIZELV_FIELD_NUMBER = 8;
      private int patronizeLv_;
      public static final int TRYSTPROPERTYS_FIELD_NUMBER = 9;
      private List<CommonMsg.PropertyInfo> trystPropertys_;
      public static final int BESTOWPROPERTYS_FIELD_NUMBER = 10;
      private List<CommonMsg.PropertyInfo> bestowPropertys_;
      public static final int PATRONIZEPROPERTY_FIELD_NUMBER = 11;
      private List<CommonMsg.PropertyInfo> patronizeProperty_;
      public static final int TYPE_FIELD_NUMBER = 12;
      private int type_;
      public static final int BEAUTYGRADE_FIELD_NUMBER = 13;
      private int beautyGrade_;
      public static final int ASSISTANTSKILL_FIELD_NUMBER = 14;
      private int assistantSkill_;
      private byte memoizedIsInitialized;
      private static final BeautyInfo DEFAULT_INSTANCE = new BeautyInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<BeautyInfo> PARSER = new AbstractParser<BeautyInfo>() {
         public BeautyInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new BeautyInfo(input, extensionRegistry);
         }
      };

      private BeautyInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private BeautyInfo() {
         this.memoizedIsInitialized = -1;
         this.trystPropertys_ = Collections.emptyList();
         this.bestowPropertys_ = Collections.emptyList();
         this.patronizeProperty_ = Collections.emptyList();
         this.type_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new BeautyInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private BeautyInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.state_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.unlockStep_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.trystLv_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.trystExp_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.bestowNum_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.skillId_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.patronizeLv_ = input.readInt32();
                        break;
                     case 74:
                        if ((mutable_bitField0_ & 256) == 0) {
                           this.trystPropertys_ = new ArrayList();
                           mutable_bitField0_ |= 256;
                        }

                        this.trystPropertys_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        break;
                     case 82:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.bestowPropertys_ = new ArrayList();
                           mutable_bitField0_ |= 512;
                        }

                        this.bestowPropertys_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        break;
                     case 90:
                        if ((mutable_bitField0_ & 1024) == 0) {
                           this.patronizeProperty_ = new ArrayList();
                           mutable_bitField0_ |= 1024;
                        }

                        this.patronizeProperty_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        break;
                     case 96:
                        int rawValue = input.readEnum();
                        CooperateType value = TongqueTerraceMsg.CooperateType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(12, rawValue);
                        } else {
                           this.bitField0_ |= 256;
                           this.type_ = rawValue;
                        }
                        break;
                     case 104:
                        this.bitField0_ |= 512;
                        this.beautyGrade_ = input.readInt32();
                        break;
                     case 112:
                        this.bitField0_ |= 1024;
                        this.assistantSkill_ = input.readInt32();
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
               if ((mutable_bitField0_ & 256) != 0) {
                  this.trystPropertys_ = Collections.unmodifiableList(this.trystPropertys_);
               }

               if ((mutable_bitField0_ & 512) != 0) {
                  this.bestowPropertys_ = Collections.unmodifiableList(this.bestowPropertys_);
               }

               if ((mutable_bitField0_ & 1024) != 0) {
                  this.patronizeProperty_ = Collections.unmodifiableList(this.patronizeProperty_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BeautyInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasUnlockStep() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getUnlockStep() {
         return this.unlockStep_;
      }

      public boolean hasTrystLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTrystLv() {
         return this.trystLv_;
      }

      public boolean hasTrystExp() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getTrystExp() {
         return this.trystExp_;
      }

      public boolean hasBestowNum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getBestowNum() {
         return this.bestowNum_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
      }

      public boolean hasPatronizeLv() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getPatronizeLv() {
         return this.patronizeLv_;
      }

      public List<CommonMsg.PropertyInfo> getTrystPropertysList() {
         return this.trystPropertys_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getTrystPropertysOrBuilderList() {
         return this.trystPropertys_;
      }

      public int getTrystPropertysCount() {
         return this.trystPropertys_.size();
      }

      public CommonMsg.PropertyInfo getTrystPropertys(int index) {
         return (CommonMsg.PropertyInfo)this.trystPropertys_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getTrystPropertysOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.trystPropertys_.get(index);
      }

      public List<CommonMsg.PropertyInfo> getBestowPropertysList() {
         return this.bestowPropertys_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getBestowPropertysOrBuilderList() {
         return this.bestowPropertys_;
      }

      public int getBestowPropertysCount() {
         return this.bestowPropertys_.size();
      }

      public CommonMsg.PropertyInfo getBestowPropertys(int index) {
         return (CommonMsg.PropertyInfo)this.bestowPropertys_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getBestowPropertysOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.bestowPropertys_.get(index);
      }

      public List<CommonMsg.PropertyInfo> getPatronizePropertyList() {
         return this.patronizeProperty_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPatronizePropertyOrBuilderList() {
         return this.patronizeProperty_;
      }

      public int getPatronizePropertyCount() {
         return this.patronizeProperty_.size();
      }

      public CommonMsg.PropertyInfo getPatronizeProperty(int index) {
         return (CommonMsg.PropertyInfo)this.patronizeProperty_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPatronizePropertyOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.patronizeProperty_.get(index);
      }

      public boolean hasType() {
         return (this.bitField0_ & 256) != 0;
      }

      public CooperateType getType() {
         CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
         return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
      }

      public boolean hasBeautyGrade() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getBeautyGrade() {
         return this.beautyGrade_;
      }

      public boolean hasAssistantSkill() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getAssistantSkill() {
         return this.assistantSkill_;
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
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnlockStep()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTrystLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTrystExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBestowNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPatronizeLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTrystPropertysCount(); ++i) {
               if (!this.getTrystPropertys(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getBestowPropertysCount(); ++i) {
               if (!this.getBestowPropertys(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getPatronizePropertyCount(); ++i) {
               if (!this.getPatronizeProperty(i).isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.state_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.unlockStep_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.trystLv_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.trystExp_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.bestowNum_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.skillId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.patronizeLv_);
         }

         for(int i = 0; i < this.trystPropertys_.size(); ++i) {
            output.writeMessage(9, (MessageLite)this.trystPropertys_.get(i));
         }

         for(int i = 0; i < this.bestowPropertys_.size(); ++i) {
            output.writeMessage(10, (MessageLite)this.bestowPropertys_.get(i));
         }

         for(int i = 0; i < this.patronizeProperty_.size(); ++i) {
            output.writeMessage(11, (MessageLite)this.patronizeProperty_.get(i));
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeEnum(12, this.type_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(13, this.beautyGrade_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(14, this.assistantSkill_);
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
               size += CodedOutputStream.computeInt32Size(2, this.state_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.unlockStep_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.trystLv_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.trystExp_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.bestowNum_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.skillId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.patronizeLv_);
            }

            for(int i = 0; i < this.trystPropertys_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(9, (MessageLite)this.trystPropertys_.get(i));
            }

            for(int i = 0; i < this.bestowPropertys_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.bestowPropertys_.get(i));
            }

            for(int i = 0; i < this.patronizeProperty_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(11, (MessageLite)this.patronizeProperty_.get(i));
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeEnumSize(12, this.type_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.beautyGrade_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.assistantSkill_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof BeautyInfo)) {
            return super.equals(obj);
         } else {
            BeautyInfo other = (BeautyInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasUnlockStep() != other.hasUnlockStep()) {
               return false;
            } else if (this.hasUnlockStep() && this.getUnlockStep() != other.getUnlockStep()) {
               return false;
            } else if (this.hasTrystLv() != other.hasTrystLv()) {
               return false;
            } else if (this.hasTrystLv() && this.getTrystLv() != other.getTrystLv()) {
               return false;
            } else if (this.hasTrystExp() != other.hasTrystExp()) {
               return false;
            } else if (this.hasTrystExp() && this.getTrystExp() != other.getTrystExp()) {
               return false;
            } else if (this.hasBestowNum() != other.hasBestowNum()) {
               return false;
            } else if (this.hasBestowNum() && this.getBestowNum() != other.getBestowNum()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
               return false;
            } else if (this.hasPatronizeLv() != other.hasPatronizeLv()) {
               return false;
            } else if (this.hasPatronizeLv() && this.getPatronizeLv() != other.getPatronizeLv()) {
               return false;
            } else if (!this.getTrystPropertysList().equals(other.getTrystPropertysList())) {
               return false;
            } else if (!this.getBestowPropertysList().equals(other.getBestowPropertysList())) {
               return false;
            } else if (!this.getPatronizePropertyList().equals(other.getPatronizePropertyList())) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (this.hasBeautyGrade() != other.hasBeautyGrade()) {
               return false;
            } else if (this.hasBeautyGrade() && this.getBeautyGrade() != other.getBeautyGrade()) {
               return false;
            } else if (this.hasAssistantSkill() != other.hasAssistantSkill()) {
               return false;
            } else if (this.hasAssistantSkill() && this.getAssistantSkill() != other.getAssistantSkill()) {
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

            if (this.hasState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getState();
            }

            if (this.hasUnlockStep()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUnlockStep();
            }

            if (this.hasTrystLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTrystLv();
            }

            if (this.hasTrystExp()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getTrystExp();
            }

            if (this.hasBestowNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBestowNum();
            }

            if (this.hasSkillId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getSkillId();
            }

            if (this.hasPatronizeLv()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getPatronizeLv();
            }

            if (this.getTrystPropertysCount() > 0) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getTrystPropertysList().hashCode();
            }

            if (this.getBestowPropertysCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getBestowPropertysList().hashCode();
            }

            if (this.getPatronizePropertyCount() > 0) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getPatronizePropertyList().hashCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.type_;
            }

            if (this.hasBeautyGrade()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getBeautyGrade();
            }

            if (this.hasAssistantSkill()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getAssistantSkill();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static BeautyInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (BeautyInfo)PARSER.parseFrom(data);
      }

      public static BeautyInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BeautyInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BeautyInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (BeautyInfo)PARSER.parseFrom(data);
      }

      public static BeautyInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BeautyInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BeautyInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (BeautyInfo)PARSER.parseFrom(data);
      }

      public static BeautyInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BeautyInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BeautyInfo parseFrom(InputStream input) throws IOException {
         return (BeautyInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BeautyInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BeautyInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static BeautyInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (BeautyInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static BeautyInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BeautyInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static BeautyInfo parseFrom(CodedInputStream input) throws IOException {
         return (BeautyInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BeautyInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BeautyInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(BeautyInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static BeautyInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<BeautyInfo> parser() {
         return PARSER;
      }

      public Parser<BeautyInfo> getParserForType() {
         return PARSER;
      }

      public BeautyInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BeautyInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int state_;
         private int unlockStep_;
         private int trystLv_;
         private int trystExp_;
         private int bestowNum_;
         private int skillId_;
         private int patronizeLv_;
         private List<CommonMsg.PropertyInfo> trystPropertys_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> trystPropertysBuilder_;
         private List<CommonMsg.PropertyInfo> bestowPropertys_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> bestowPropertysBuilder_;
         private List<CommonMsg.PropertyInfo> patronizeProperty_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> patronizePropertyBuilder_;
         private int type_;
         private int beautyGrade_;
         private int assistantSkill_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BeautyInfo.class, Builder.class);
         }

         private Builder() {
            this.trystPropertys_ = Collections.emptyList();
            this.bestowPropertys_ = Collections.emptyList();
            this.patronizeProperty_ = Collections.emptyList();
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.trystPropertys_ = Collections.emptyList();
            this.bestowPropertys_ = Collections.emptyList();
            this.patronizeProperty_ = Collections.emptyList();
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.BeautyInfo.alwaysUseFieldBuilders) {
               this.getTrystPropertysFieldBuilder();
               this.getBestowPropertysFieldBuilder();
               this.getPatronizePropertyFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.state_ = 0;
            this.bitField0_ &= -3;
            this.unlockStep_ = 0;
            this.bitField0_ &= -5;
            this.trystLv_ = 0;
            this.bitField0_ &= -9;
            this.trystExp_ = 0;
            this.bitField0_ &= -17;
            this.bestowNum_ = 0;
            this.bitField0_ &= -33;
            this.skillId_ = 0;
            this.bitField0_ &= -65;
            this.patronizeLv_ = 0;
            this.bitField0_ &= -129;
            if (this.trystPropertysBuilder_ == null) {
               this.trystPropertys_ = Collections.emptyList();
               this.bitField0_ &= -257;
            } else {
               this.trystPropertysBuilder_.clear();
            }

            if (this.bestowPropertysBuilder_ == null) {
               this.bestowPropertys_ = Collections.emptyList();
               this.bitField0_ &= -513;
            } else {
               this.bestowPropertysBuilder_.clear();
            }

            if (this.patronizePropertyBuilder_ == null) {
               this.patronizeProperty_ = Collections.emptyList();
               this.bitField0_ &= -1025;
            } else {
               this.patronizePropertyBuilder_.clear();
            }

            this.type_ = 0;
            this.bitField0_ &= -2049;
            this.beautyGrade_ = 0;
            this.bitField0_ &= -4097;
            this.assistantSkill_ = 0;
            this.bitField0_ &= -8193;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyInfo_descriptor;
         }

         public BeautyInfo getDefaultInstanceForType() {
            return TongqueTerraceMsg.BeautyInfo.getDefaultInstance();
         }

         public BeautyInfo build() {
            BeautyInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public BeautyInfo buildPartial() {
            BeautyInfo result = new BeautyInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.unlockStep_ = this.unlockStep_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.trystLv_ = this.trystLv_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.trystExp_ = this.trystExp_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.bestowNum_ = this.bestowNum_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.skillId_ = this.skillId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.patronizeLv_ = this.patronizeLv_;
               to_bitField0_ |= 128;
            }

            if (this.trystPropertysBuilder_ == null) {
               if ((this.bitField0_ & 256) != 0) {
                  this.trystPropertys_ = Collections.unmodifiableList(this.trystPropertys_);
                  this.bitField0_ &= -257;
               }

               result.trystPropertys_ = this.trystPropertys_;
            } else {
               result.trystPropertys_ = this.trystPropertysBuilder_.build();
            }

            if (this.bestowPropertysBuilder_ == null) {
               if ((this.bitField0_ & 512) != 0) {
                  this.bestowPropertys_ = Collections.unmodifiableList(this.bestowPropertys_);
                  this.bitField0_ &= -513;
               }

               result.bestowPropertys_ = this.bestowPropertys_;
            } else {
               result.bestowPropertys_ = this.bestowPropertysBuilder_.build();
            }

            if (this.patronizePropertyBuilder_ == null) {
               if ((this.bitField0_ & 1024) != 0) {
                  this.patronizeProperty_ = Collections.unmodifiableList(this.patronizeProperty_);
                  this.bitField0_ &= -1025;
               }

               result.patronizeProperty_ = this.patronizeProperty_;
            } else {
               result.patronizeProperty_ = this.patronizePropertyBuilder_.build();
            }

            if ((from_bitField0_ & 2048) != 0) {
               to_bitField0_ |= 256;
            }

            result.type_ = this.type_;
            if ((from_bitField0_ & 4096) != 0) {
               result.beautyGrade_ = this.beautyGrade_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 8192) != 0) {
               result.assistantSkill_ = this.assistantSkill_;
               to_bitField0_ |= 1024;
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
            if (other instanceof BeautyInfo) {
               return this.mergeFrom((BeautyInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(BeautyInfo other) {
            if (other == TongqueTerraceMsg.BeautyInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasUnlockStep()) {
                  this.setUnlockStep(other.getUnlockStep());
               }

               if (other.hasTrystLv()) {
                  this.setTrystLv(other.getTrystLv());
               }

               if (other.hasTrystExp()) {
                  this.setTrystExp(other.getTrystExp());
               }

               if (other.hasBestowNum()) {
                  this.setBestowNum(other.getBestowNum());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               if (other.hasPatronizeLv()) {
                  this.setPatronizeLv(other.getPatronizeLv());
               }

               if (this.trystPropertysBuilder_ == null) {
                  if (!other.trystPropertys_.isEmpty()) {
                     if (this.trystPropertys_.isEmpty()) {
                        this.trystPropertys_ = other.trystPropertys_;
                        this.bitField0_ &= -257;
                     } else {
                        this.ensureTrystPropertysIsMutable();
                        this.trystPropertys_.addAll(other.trystPropertys_);
                     }

                     this.onChanged();
                  }
               } else if (!other.trystPropertys_.isEmpty()) {
                  if (this.trystPropertysBuilder_.isEmpty()) {
                     this.trystPropertysBuilder_.dispose();
                     this.trystPropertysBuilder_ = null;
                     this.trystPropertys_ = other.trystPropertys_;
                     this.bitField0_ &= -257;
                     this.trystPropertysBuilder_ = TongqueTerraceMsg.BeautyInfo.alwaysUseFieldBuilders ? this.getTrystPropertysFieldBuilder() : null;
                  } else {
                     this.trystPropertysBuilder_.addAllMessages(other.trystPropertys_);
                  }
               }

               if (this.bestowPropertysBuilder_ == null) {
                  if (!other.bestowPropertys_.isEmpty()) {
                     if (this.bestowPropertys_.isEmpty()) {
                        this.bestowPropertys_ = other.bestowPropertys_;
                        this.bitField0_ &= -513;
                     } else {
                        this.ensureBestowPropertysIsMutable();
                        this.bestowPropertys_.addAll(other.bestowPropertys_);
                     }

                     this.onChanged();
                  }
               } else if (!other.bestowPropertys_.isEmpty()) {
                  if (this.bestowPropertysBuilder_.isEmpty()) {
                     this.bestowPropertysBuilder_.dispose();
                     this.bestowPropertysBuilder_ = null;
                     this.bestowPropertys_ = other.bestowPropertys_;
                     this.bitField0_ &= -513;
                     this.bestowPropertysBuilder_ = TongqueTerraceMsg.BeautyInfo.alwaysUseFieldBuilders ? this.getBestowPropertysFieldBuilder() : null;
                  } else {
                     this.bestowPropertysBuilder_.addAllMessages(other.bestowPropertys_);
                  }
               }

               if (this.patronizePropertyBuilder_ == null) {
                  if (!other.patronizeProperty_.isEmpty()) {
                     if (this.patronizeProperty_.isEmpty()) {
                        this.patronizeProperty_ = other.patronizeProperty_;
                        this.bitField0_ &= -1025;
                     } else {
                        this.ensurePatronizePropertyIsMutable();
                        this.patronizeProperty_.addAll(other.patronizeProperty_);
                     }

                     this.onChanged();
                  }
               } else if (!other.patronizeProperty_.isEmpty()) {
                  if (this.patronizePropertyBuilder_.isEmpty()) {
                     this.patronizePropertyBuilder_.dispose();
                     this.patronizePropertyBuilder_ = null;
                     this.patronizeProperty_ = other.patronizeProperty_;
                     this.bitField0_ &= -1025;
                     this.patronizePropertyBuilder_ = TongqueTerraceMsg.BeautyInfo.alwaysUseFieldBuilders ? this.getPatronizePropertyFieldBuilder() : null;
                  } else {
                     this.patronizePropertyBuilder_.addAllMessages(other.patronizeProperty_);
                  }
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasBeautyGrade()) {
                  this.setBeautyGrade(other.getBeautyGrade());
               }

               if (other.hasAssistantSkill()) {
                  this.setAssistantSkill(other.getAssistantSkill());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else if (!this.hasUnlockStep()) {
               return false;
            } else if (!this.hasTrystLv()) {
               return false;
            } else if (!this.hasTrystExp()) {
               return false;
            } else if (!this.hasBestowNum()) {
               return false;
            } else if (!this.hasSkillId()) {
               return false;
            } else if (!this.hasPatronizeLv()) {
               return false;
            } else {
               for(int i = 0; i < this.getTrystPropertysCount(); ++i) {
                  if (!this.getTrystPropertys(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getBestowPropertysCount(); ++i) {
                  if (!this.getBestowPropertys(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getPatronizePropertyCount(); ++i) {
                  if (!this.getPatronizeProperty(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            BeautyInfo parsedMessage = null;

            try {
               parsedMessage = (BeautyInfo)TongqueTerraceMsg.BeautyInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (BeautyInfo)e.getUnfinishedMessage();
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

         public boolean hasState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 2;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnlockStep() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getUnlockStep() {
            return this.unlockStep_;
         }

         public Builder setUnlockStep(int value) {
            this.bitField0_ |= 4;
            this.unlockStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnlockStep() {
            this.bitField0_ &= -5;
            this.unlockStep_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTrystLv() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getTrystLv() {
            return this.trystLv_;
         }

         public Builder setTrystLv(int value) {
            this.bitField0_ |= 8;
            this.trystLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTrystLv() {
            this.bitField0_ &= -9;
            this.trystLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTrystExp() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getTrystExp() {
            return this.trystExp_;
         }

         public Builder setTrystExp(int value) {
            this.bitField0_ |= 16;
            this.trystExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTrystExp() {
            this.bitField0_ &= -17;
            this.trystExp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBestowNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getBestowNum() {
            return this.bestowNum_;
         }

         public Builder setBestowNum(int value) {
            this.bitField0_ |= 32;
            this.bestowNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBestowNum() {
            this.bitField0_ &= -33;
            this.bestowNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 64;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -65;
            this.skillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPatronizeLv() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getPatronizeLv() {
            return this.patronizeLv_;
         }

         public Builder setPatronizeLv(int value) {
            this.bitField0_ |= 128;
            this.patronizeLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPatronizeLv() {
            this.bitField0_ &= -129;
            this.patronizeLv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTrystPropertysIsMutable() {
            if ((this.bitField0_ & 256) == 0) {
               this.trystPropertys_ = new ArrayList(this.trystPropertys_);
               this.bitField0_ |= 256;
            }

         }

         public List<CommonMsg.PropertyInfo> getTrystPropertysList() {
            return this.trystPropertysBuilder_ == null ? Collections.unmodifiableList(this.trystPropertys_) : this.trystPropertysBuilder_.getMessageList();
         }

         public int getTrystPropertysCount() {
            return this.trystPropertysBuilder_ == null ? this.trystPropertys_.size() : this.trystPropertysBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getTrystPropertys(int index) {
            return this.trystPropertysBuilder_ == null ? (CommonMsg.PropertyInfo)this.trystPropertys_.get(index) : (CommonMsg.PropertyInfo)this.trystPropertysBuilder_.getMessage(index);
         }

         public Builder setTrystPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.trystPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.set(index, value);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTrystPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTrystPropertys(CommonMsg.PropertyInfo value) {
            if (this.trystPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.add(value);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTrystPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.trystPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.add(index, value);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTrystPropertys(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTrystPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTrystPropertys(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.trystPropertys_);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTrystPropertys() {
            if (this.trystPropertysBuilder_ == null) {
               this.trystPropertys_ = Collections.emptyList();
               this.bitField0_ &= -257;
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.clear();
            }

            return this;
         }

         public Builder removeTrystPropertys(int index) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.remove(index);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getTrystPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getTrystPropertysFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getTrystPropertysOrBuilder(int index) {
            return this.trystPropertysBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.trystPropertys_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.trystPropertysBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getTrystPropertysOrBuilderList() {
            return this.trystPropertysBuilder_ != null ? this.trystPropertysBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.trystPropertys_);
         }

         public CommonMsg.PropertyInfo.Builder addTrystPropertysBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getTrystPropertysFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addTrystPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getTrystPropertysFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getTrystPropertysBuilderList() {
            return this.getTrystPropertysFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getTrystPropertysFieldBuilder() {
            if (this.trystPropertysBuilder_ == null) {
               this.trystPropertysBuilder_ = new RepeatedFieldBuilderV3(this.trystPropertys_, (this.bitField0_ & 256) != 0, this.getParentForChildren(), this.isClean());
               this.trystPropertys_ = null;
            }

            return this.trystPropertysBuilder_;
         }

         private void ensureBestowPropertysIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.bestowPropertys_ = new ArrayList(this.bestowPropertys_);
               this.bitField0_ |= 512;
            }

         }

         public List<CommonMsg.PropertyInfo> getBestowPropertysList() {
            return this.bestowPropertysBuilder_ == null ? Collections.unmodifiableList(this.bestowPropertys_) : this.bestowPropertysBuilder_.getMessageList();
         }

         public int getBestowPropertysCount() {
            return this.bestowPropertysBuilder_ == null ? this.bestowPropertys_.size() : this.bestowPropertysBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getBestowPropertys(int index) {
            return this.bestowPropertysBuilder_ == null ? (CommonMsg.PropertyInfo)this.bestowPropertys_.get(index) : (CommonMsg.PropertyInfo)this.bestowPropertysBuilder_.getMessage(index);
         }

         public Builder setBestowPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.bestowPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBestowPropertysIsMutable();
               this.bestowPropertys_.set(index, value);
               this.onChanged();
            } else {
               this.bestowPropertysBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBestowPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.bestowPropertysBuilder_ == null) {
               this.ensureBestowPropertysIsMutable();
               this.bestowPropertys_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.bestowPropertysBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBestowPropertys(CommonMsg.PropertyInfo value) {
            if (this.bestowPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBestowPropertysIsMutable();
               this.bestowPropertys_.add(value);
               this.onChanged();
            } else {
               this.bestowPropertysBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBestowPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.bestowPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBestowPropertysIsMutable();
               this.bestowPropertys_.add(index, value);
               this.onChanged();
            } else {
               this.bestowPropertysBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBestowPropertys(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.bestowPropertysBuilder_ == null) {
               this.ensureBestowPropertysIsMutable();
               this.bestowPropertys_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.bestowPropertysBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBestowPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.bestowPropertysBuilder_ == null) {
               this.ensureBestowPropertysIsMutable();
               this.bestowPropertys_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.bestowPropertysBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBestowPropertys(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.bestowPropertysBuilder_ == null) {
               this.ensureBestowPropertysIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.bestowPropertys_);
               this.onChanged();
            } else {
               this.bestowPropertysBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBestowPropertys() {
            if (this.bestowPropertysBuilder_ == null) {
               this.bestowPropertys_ = Collections.emptyList();
               this.bitField0_ &= -513;
               this.onChanged();
            } else {
               this.bestowPropertysBuilder_.clear();
            }

            return this;
         }

         public Builder removeBestowPropertys(int index) {
            if (this.bestowPropertysBuilder_ == null) {
               this.ensureBestowPropertysIsMutable();
               this.bestowPropertys_.remove(index);
               this.onChanged();
            } else {
               this.bestowPropertysBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getBestowPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getBestowPropertysFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getBestowPropertysOrBuilder(int index) {
            return this.bestowPropertysBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.bestowPropertys_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.bestowPropertysBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getBestowPropertysOrBuilderList() {
            return this.bestowPropertysBuilder_ != null ? this.bestowPropertysBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.bestowPropertys_);
         }

         public CommonMsg.PropertyInfo.Builder addBestowPropertysBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getBestowPropertysFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addBestowPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getBestowPropertysFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getBestowPropertysBuilderList() {
            return this.getBestowPropertysFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getBestowPropertysFieldBuilder() {
            if (this.bestowPropertysBuilder_ == null) {
               this.bestowPropertysBuilder_ = new RepeatedFieldBuilderV3(this.bestowPropertys_, (this.bitField0_ & 512) != 0, this.getParentForChildren(), this.isClean());
               this.bestowPropertys_ = null;
            }

            return this.bestowPropertysBuilder_;
         }

         private void ensurePatronizePropertyIsMutable() {
            if ((this.bitField0_ & 1024) == 0) {
               this.patronizeProperty_ = new ArrayList(this.patronizeProperty_);
               this.bitField0_ |= 1024;
            }

         }

         public List<CommonMsg.PropertyInfo> getPatronizePropertyList() {
            return this.patronizePropertyBuilder_ == null ? Collections.unmodifiableList(this.patronizeProperty_) : this.patronizePropertyBuilder_.getMessageList();
         }

         public int getPatronizePropertyCount() {
            return this.patronizePropertyBuilder_ == null ? this.patronizeProperty_.size() : this.patronizePropertyBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getPatronizeProperty(int index) {
            return this.patronizePropertyBuilder_ == null ? (CommonMsg.PropertyInfo)this.patronizeProperty_.get(index) : (CommonMsg.PropertyInfo)this.patronizePropertyBuilder_.getMessage(index);
         }

         public Builder setPatronizeProperty(int index, CommonMsg.PropertyInfo value) {
            if (this.patronizePropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePatronizePropertyIsMutable();
               this.patronizeProperty_.set(index, value);
               this.onChanged();
            } else {
               this.patronizePropertyBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPatronizeProperty(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.patronizePropertyBuilder_ == null) {
               this.ensurePatronizePropertyIsMutable();
               this.patronizeProperty_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.patronizePropertyBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPatronizeProperty(CommonMsg.PropertyInfo value) {
            if (this.patronizePropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePatronizePropertyIsMutable();
               this.patronizeProperty_.add(value);
               this.onChanged();
            } else {
               this.patronizePropertyBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPatronizeProperty(int index, CommonMsg.PropertyInfo value) {
            if (this.patronizePropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePatronizePropertyIsMutable();
               this.patronizeProperty_.add(index, value);
               this.onChanged();
            } else {
               this.patronizePropertyBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPatronizeProperty(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.patronizePropertyBuilder_ == null) {
               this.ensurePatronizePropertyIsMutable();
               this.patronizeProperty_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.patronizePropertyBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPatronizeProperty(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.patronizePropertyBuilder_ == null) {
               this.ensurePatronizePropertyIsMutable();
               this.patronizeProperty_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.patronizePropertyBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPatronizeProperty(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.patronizePropertyBuilder_ == null) {
               this.ensurePatronizePropertyIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.patronizeProperty_);
               this.onChanged();
            } else {
               this.patronizePropertyBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPatronizeProperty() {
            if (this.patronizePropertyBuilder_ == null) {
               this.patronizeProperty_ = Collections.emptyList();
               this.bitField0_ &= -1025;
               this.onChanged();
            } else {
               this.patronizePropertyBuilder_.clear();
            }

            return this;
         }

         public Builder removePatronizeProperty(int index) {
            if (this.patronizePropertyBuilder_ == null) {
               this.ensurePatronizePropertyIsMutable();
               this.patronizeProperty_.remove(index);
               this.onChanged();
            } else {
               this.patronizePropertyBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPatronizePropertyBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPatronizePropertyFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPatronizePropertyOrBuilder(int index) {
            return this.patronizePropertyBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.patronizeProperty_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.patronizePropertyBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPatronizePropertyOrBuilderList() {
            return this.patronizePropertyBuilder_ != null ? this.patronizePropertyBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.patronizeProperty_);
         }

         public CommonMsg.PropertyInfo.Builder addPatronizePropertyBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPatronizePropertyFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPatronizePropertyBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPatronizePropertyFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPatronizePropertyBuilderList() {
            return this.getPatronizePropertyFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPatronizePropertyFieldBuilder() {
            if (this.patronizePropertyBuilder_ == null) {
               this.patronizePropertyBuilder_ = new RepeatedFieldBuilderV3(this.patronizeProperty_, (this.bitField0_ & 1024) != 0, this.getParentForChildren(), this.isClean());
               this.patronizeProperty_ = null;
            }

            return this.patronizePropertyBuilder_;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2048) != 0;
         }

         public CooperateType getType() {
            CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
            return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
         }

         public Builder setType(CooperateType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2049;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBeautyGrade() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getBeautyGrade() {
            return this.beautyGrade_;
         }

         public Builder setBeautyGrade(int value) {
            this.bitField0_ |= 4096;
            this.beautyGrade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyGrade() {
            this.bitField0_ &= -4097;
            this.beautyGrade_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAssistantSkill() {
            return (this.bitField0_ & 8192) != 0;
         }

         public int getAssistantSkill() {
            return this.assistantSkill_;
         }

         public Builder setAssistantSkill(int value) {
            this.bitField0_ |= 8192;
            this.assistantSkill_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAssistantSkill() {
            this.bitField0_ &= -8193;
            this.assistantSkill_ = 0;
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

   public static final class TrystExpInfo extends GeneratedMessageV3 implements TrystExpInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int ADDEXP_FIELD_NUMBER = 2;
      private int addExp_;
      public static final int PROTITIES_FIELD_NUMBER = 3;
      private List<CommonMsg.PropertyInfo> protities_;
      private byte memoizedIsInitialized;
      private static final TrystExpInfo DEFAULT_INSTANCE = new TrystExpInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<TrystExpInfo> PARSER = new AbstractParser<TrystExpInfo>() {
         public TrystExpInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TrystExpInfo(input, extensionRegistry);
         }
      };

      private TrystExpInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TrystExpInfo() {
         this.memoizedIsInitialized = -1;
         this.protities_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TrystExpInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TrystExpInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.addExp_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.protities_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.protities_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.protities_ = Collections.unmodifiableList(this.protities_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrystExpInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasAddExp() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAddExp() {
         return this.addExp_;
      }

      public List<CommonMsg.PropertyInfo> getProtitiesList() {
         return this.protities_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getProtitiesOrBuilderList() {
         return this.protities_;
      }

      public int getProtitiesCount() {
         return this.protities_.size();
      }

      public CommonMsg.PropertyInfo getProtities(int index) {
         return (CommonMsg.PropertyInfo)this.protities_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getProtitiesOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.protities_.get(index);
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
         } else if (!this.hasAddExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getProtitiesCount(); ++i) {
               if (!this.getProtities(i).isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.addExp_);
         }

         for(int i = 0; i < this.protities_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.protities_.get(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.addExp_);
            }

            for(int i = 0; i < this.protities_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.protities_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TrystExpInfo)) {
            return super.equals(obj);
         } else {
            TrystExpInfo other = (TrystExpInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasAddExp() != other.hasAddExp()) {
               return false;
            } else if (this.hasAddExp() && this.getAddExp() != other.getAddExp()) {
               return false;
            } else if (!this.getProtitiesList().equals(other.getProtitiesList())) {
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

            if (this.hasAddExp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAddExp();
            }

            if (this.getProtitiesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getProtitiesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TrystExpInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TrystExpInfo)PARSER.parseFrom(data);
      }

      public static TrystExpInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TrystExpInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TrystExpInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TrystExpInfo)PARSER.parseFrom(data);
      }

      public static TrystExpInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TrystExpInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TrystExpInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TrystExpInfo)PARSER.parseFrom(data);
      }

      public static TrystExpInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TrystExpInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TrystExpInfo parseFrom(InputStream input) throws IOException {
         return (TrystExpInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TrystExpInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TrystExpInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TrystExpInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (TrystExpInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TrystExpInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TrystExpInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TrystExpInfo parseFrom(CodedInputStream input) throws IOException {
         return (TrystExpInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TrystExpInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TrystExpInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TrystExpInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TrystExpInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TrystExpInfo> parser() {
         return PARSER;
      }

      public Parser<TrystExpInfo> getParserForType() {
         return PARSER;
      }

      public TrystExpInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrystExpInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int addExp_;
         private List<CommonMsg.PropertyInfo> protities_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> protitiesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrystExpInfo.class, Builder.class);
         }

         private Builder() {
            this.protities_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.protities_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.TrystExpInfo.alwaysUseFieldBuilders) {
               this.getProtitiesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.addExp_ = 0;
            this.bitField0_ &= -3;
            if (this.protitiesBuilder_ == null) {
               this.protities_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.protitiesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_TrystExpInfo_descriptor;
         }

         public TrystExpInfo getDefaultInstanceForType() {
            return TongqueTerraceMsg.TrystExpInfo.getDefaultInstance();
         }

         public TrystExpInfo build() {
            TrystExpInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TrystExpInfo buildPartial() {
            TrystExpInfo result = new TrystExpInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.addExp_ = this.addExp_;
               to_bitField0_ |= 2;
            }

            if (this.protitiesBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.protities_ = Collections.unmodifiableList(this.protities_);
                  this.bitField0_ &= -5;
               }

               result.protities_ = this.protities_;
            } else {
               result.protities_ = this.protitiesBuilder_.build();
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
            if (other instanceof TrystExpInfo) {
               return this.mergeFrom((TrystExpInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TrystExpInfo other) {
            if (other == TongqueTerraceMsg.TrystExpInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasAddExp()) {
                  this.setAddExp(other.getAddExp());
               }

               if (this.protitiesBuilder_ == null) {
                  if (!other.protities_.isEmpty()) {
                     if (this.protities_.isEmpty()) {
                        this.protities_ = other.protities_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureProtitiesIsMutable();
                        this.protities_.addAll(other.protities_);
                     }

                     this.onChanged();
                  }
               } else if (!other.protities_.isEmpty()) {
                  if (this.protitiesBuilder_.isEmpty()) {
                     this.protitiesBuilder_.dispose();
                     this.protitiesBuilder_ = null;
                     this.protities_ = other.protities_;
                     this.bitField0_ &= -5;
                     this.protitiesBuilder_ = TongqueTerraceMsg.TrystExpInfo.alwaysUseFieldBuilders ? this.getProtitiesFieldBuilder() : null;
                  } else {
                     this.protitiesBuilder_.addAllMessages(other.protities_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasAddExp()) {
               return false;
            } else {
               for(int i = 0; i < this.getProtitiesCount(); ++i) {
                  if (!this.getProtities(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TrystExpInfo parsedMessage = null;

            try {
               parsedMessage = (TrystExpInfo)TongqueTerraceMsg.TrystExpInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TrystExpInfo)e.getUnfinishedMessage();
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

         public boolean hasAddExp() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getAddExp() {
            return this.addExp_;
         }

         public Builder setAddExp(int value) {
            this.bitField0_ |= 2;
            this.addExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAddExp() {
            this.bitField0_ &= -3;
            this.addExp_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureProtitiesIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.protities_ = new ArrayList(this.protities_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.PropertyInfo> getProtitiesList() {
            return this.protitiesBuilder_ == null ? Collections.unmodifiableList(this.protities_) : this.protitiesBuilder_.getMessageList();
         }

         public int getProtitiesCount() {
            return this.protitiesBuilder_ == null ? this.protities_.size() : this.protitiesBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getProtities(int index) {
            return this.protitiesBuilder_ == null ? (CommonMsg.PropertyInfo)this.protities_.get(index) : (CommonMsg.PropertyInfo)this.protitiesBuilder_.getMessage(index);
         }

         public Builder setProtities(int index, CommonMsg.PropertyInfo value) {
            if (this.protitiesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProtitiesIsMutable();
               this.protities_.set(index, value);
               this.onChanged();
            } else {
               this.protitiesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setProtities(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.protitiesBuilder_ == null) {
               this.ensureProtitiesIsMutable();
               this.protities_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.protitiesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addProtities(CommonMsg.PropertyInfo value) {
            if (this.protitiesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProtitiesIsMutable();
               this.protities_.add(value);
               this.onChanged();
            } else {
               this.protitiesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addProtities(int index, CommonMsg.PropertyInfo value) {
            if (this.protitiesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureProtitiesIsMutable();
               this.protities_.add(index, value);
               this.onChanged();
            } else {
               this.protitiesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addProtities(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.protitiesBuilder_ == null) {
               this.ensureProtitiesIsMutable();
               this.protities_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.protitiesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addProtities(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.protitiesBuilder_ == null) {
               this.ensureProtitiesIsMutable();
               this.protities_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.protitiesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllProtities(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.protitiesBuilder_ == null) {
               this.ensureProtitiesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.protities_);
               this.onChanged();
            } else {
               this.protitiesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearProtities() {
            if (this.protitiesBuilder_ == null) {
               this.protities_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.protitiesBuilder_.clear();
            }

            return this;
         }

         public Builder removeProtities(int index) {
            if (this.protitiesBuilder_ == null) {
               this.ensureProtitiesIsMutable();
               this.protities_.remove(index);
               this.onChanged();
            } else {
               this.protitiesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getProtitiesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getProtitiesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getProtitiesOrBuilder(int index) {
            return this.protitiesBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.protities_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.protitiesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getProtitiesOrBuilderList() {
            return this.protitiesBuilder_ != null ? this.protitiesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.protities_);
         }

         public CommonMsg.PropertyInfo.Builder addProtitiesBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getProtitiesFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addProtitiesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getProtitiesFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getProtitiesBuilderList() {
            return this.getProtitiesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getProtitiesFieldBuilder() {
            if (this.protitiesBuilder_ == null) {
               this.protitiesBuilder_ = new RepeatedFieldBuilderV3(this.protities_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.protities_ = null;
            }

            return this.protitiesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class BeautyTrystInfo extends GeneratedMessageV3 implements BeautyTrystInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEATUYID_FIELD_NUMBER = 1;
      private int beatuyId_;
      public static final int TRYSTLV_FIELD_NUMBER = 2;
      private int trystLv_;
      public static final int TRYSTEXP_FIELD_NUMBER = 3;
      private int trystExp_;
      public static final int TRYSTPROPERTYS_FIELD_NUMBER = 10;
      private List<CommonMsg.PropertyInfo> trystPropertys_;
      private byte memoizedIsInitialized;
      private static final BeautyTrystInfo DEFAULT_INSTANCE = new BeautyTrystInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<BeautyTrystInfo> PARSER = new AbstractParser<BeautyTrystInfo>() {
         public BeautyTrystInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new BeautyTrystInfo(input, extensionRegistry);
         }
      };

      private BeautyTrystInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private BeautyTrystInfo() {
         this.memoizedIsInitialized = -1;
         this.trystPropertys_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new BeautyTrystInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private BeautyTrystInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beatuyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.trystLv_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.trystExp_ = input.readInt32();
                        break;
                     case 82:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.trystPropertys_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.trystPropertys_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.trystPropertys_ = Collections.unmodifiableList(this.trystPropertys_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BeautyTrystInfo.class, Builder.class);
      }

      public boolean hasBeatuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeatuyId() {
         return this.beatuyId_;
      }

      public boolean hasTrystLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTrystLv() {
         return this.trystLv_;
      }

      public boolean hasTrystExp() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTrystExp() {
         return this.trystExp_;
      }

      public List<CommonMsg.PropertyInfo> getTrystPropertysList() {
         return this.trystPropertys_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getTrystPropertysOrBuilderList() {
         return this.trystPropertys_;
      }

      public int getTrystPropertysCount() {
         return this.trystPropertys_.size();
      }

      public CommonMsg.PropertyInfo getTrystPropertys(int index) {
         return (CommonMsg.PropertyInfo)this.trystPropertys_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getTrystPropertysOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.trystPropertys_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeatuyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTrystLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTrystExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTrystPropertysCount(); ++i) {
               if (!this.getTrystPropertys(i).isInitialized()) {
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
            output.writeInt32(1, this.beatuyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.trystLv_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.trystExp_);
         }

         for(int i = 0; i < this.trystPropertys_.size(); ++i) {
            output.writeMessage(10, (MessageLite)this.trystPropertys_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.beatuyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.trystLv_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.trystExp_);
            }

            for(int i = 0; i < this.trystPropertys_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.trystPropertys_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof BeautyTrystInfo)) {
            return super.equals(obj);
         } else {
            BeautyTrystInfo other = (BeautyTrystInfo)obj;
            if (this.hasBeatuyId() != other.hasBeatuyId()) {
               return false;
            } else if (this.hasBeatuyId() && this.getBeatuyId() != other.getBeatuyId()) {
               return false;
            } else if (this.hasTrystLv() != other.hasTrystLv()) {
               return false;
            } else if (this.hasTrystLv() && this.getTrystLv() != other.getTrystLv()) {
               return false;
            } else if (this.hasTrystExp() != other.hasTrystExp()) {
               return false;
            } else if (this.hasTrystExp() && this.getTrystExp() != other.getTrystExp()) {
               return false;
            } else if (!this.getTrystPropertysList().equals(other.getTrystPropertysList())) {
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
            if (this.hasBeatuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeatuyId();
            }

            if (this.hasTrystLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTrystLv();
            }

            if (this.hasTrystExp()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTrystExp();
            }

            if (this.getTrystPropertysCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getTrystPropertysList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static BeautyTrystInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (BeautyTrystInfo)PARSER.parseFrom(data);
      }

      public static BeautyTrystInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BeautyTrystInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BeautyTrystInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (BeautyTrystInfo)PARSER.parseFrom(data);
      }

      public static BeautyTrystInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BeautyTrystInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BeautyTrystInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (BeautyTrystInfo)PARSER.parseFrom(data);
      }

      public static BeautyTrystInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BeautyTrystInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BeautyTrystInfo parseFrom(InputStream input) throws IOException {
         return (BeautyTrystInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BeautyTrystInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BeautyTrystInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static BeautyTrystInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (BeautyTrystInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static BeautyTrystInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BeautyTrystInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static BeautyTrystInfo parseFrom(CodedInputStream input) throws IOException {
         return (BeautyTrystInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BeautyTrystInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BeautyTrystInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(BeautyTrystInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static BeautyTrystInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<BeautyTrystInfo> parser() {
         return PARSER;
      }

      public Parser<BeautyTrystInfo> getParserForType() {
         return PARSER;
      }

      public BeautyTrystInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BeautyTrystInfoOrBuilder {
         private int bitField0_;
         private int beatuyId_;
         private int trystLv_;
         private int trystExp_;
         private List<CommonMsg.PropertyInfo> trystPropertys_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> trystPropertysBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BeautyTrystInfo.class, Builder.class);
         }

         private Builder() {
            this.trystPropertys_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.trystPropertys_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.BeautyTrystInfo.alwaysUseFieldBuilders) {
               this.getTrystPropertysFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.beatuyId_ = 0;
            this.bitField0_ &= -2;
            this.trystLv_ = 0;
            this.bitField0_ &= -3;
            this.trystExp_ = 0;
            this.bitField0_ &= -5;
            if (this.trystPropertysBuilder_ == null) {
               this.trystPropertys_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.trystPropertysBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyTrystInfo_descriptor;
         }

         public BeautyTrystInfo getDefaultInstanceForType() {
            return TongqueTerraceMsg.BeautyTrystInfo.getDefaultInstance();
         }

         public BeautyTrystInfo build() {
            BeautyTrystInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public BeautyTrystInfo buildPartial() {
            BeautyTrystInfo result = new BeautyTrystInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beatuyId_ = this.beatuyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.trystLv_ = this.trystLv_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.trystExp_ = this.trystExp_;
               to_bitField0_ |= 4;
            }

            if (this.trystPropertysBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.trystPropertys_ = Collections.unmodifiableList(this.trystPropertys_);
                  this.bitField0_ &= -9;
               }

               result.trystPropertys_ = this.trystPropertys_;
            } else {
               result.trystPropertys_ = this.trystPropertysBuilder_.build();
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
            if (other instanceof BeautyTrystInfo) {
               return this.mergeFrom((BeautyTrystInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(BeautyTrystInfo other) {
            if (other == TongqueTerraceMsg.BeautyTrystInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeatuyId()) {
                  this.setBeatuyId(other.getBeatuyId());
               }

               if (other.hasTrystLv()) {
                  this.setTrystLv(other.getTrystLv());
               }

               if (other.hasTrystExp()) {
                  this.setTrystExp(other.getTrystExp());
               }

               if (this.trystPropertysBuilder_ == null) {
                  if (!other.trystPropertys_.isEmpty()) {
                     if (this.trystPropertys_.isEmpty()) {
                        this.trystPropertys_ = other.trystPropertys_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureTrystPropertysIsMutable();
                        this.trystPropertys_.addAll(other.trystPropertys_);
                     }

                     this.onChanged();
                  }
               } else if (!other.trystPropertys_.isEmpty()) {
                  if (this.trystPropertysBuilder_.isEmpty()) {
                     this.trystPropertysBuilder_.dispose();
                     this.trystPropertysBuilder_ = null;
                     this.trystPropertys_ = other.trystPropertys_;
                     this.bitField0_ &= -9;
                     this.trystPropertysBuilder_ = TongqueTerraceMsg.BeautyTrystInfo.alwaysUseFieldBuilders ? this.getTrystPropertysFieldBuilder() : null;
                  } else {
                     this.trystPropertysBuilder_.addAllMessages(other.trystPropertys_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeatuyId()) {
               return false;
            } else if (!this.hasTrystLv()) {
               return false;
            } else if (!this.hasTrystExp()) {
               return false;
            } else {
               for(int i = 0; i < this.getTrystPropertysCount(); ++i) {
                  if (!this.getTrystPropertys(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            BeautyTrystInfo parsedMessage = null;

            try {
               parsedMessage = (BeautyTrystInfo)TongqueTerraceMsg.BeautyTrystInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (BeautyTrystInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeatuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeatuyId() {
            return this.beatuyId_;
         }

         public Builder setBeatuyId(int value) {
            this.bitField0_ |= 1;
            this.beatuyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeatuyId() {
            this.bitField0_ &= -2;
            this.beatuyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTrystLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTrystLv() {
            return this.trystLv_;
         }

         public Builder setTrystLv(int value) {
            this.bitField0_ |= 2;
            this.trystLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTrystLv() {
            this.bitField0_ &= -3;
            this.trystLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTrystExp() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTrystExp() {
            return this.trystExp_;
         }

         public Builder setTrystExp(int value) {
            this.bitField0_ |= 4;
            this.trystExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTrystExp() {
            this.bitField0_ &= -5;
            this.trystExp_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTrystPropertysIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.trystPropertys_ = new ArrayList(this.trystPropertys_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.PropertyInfo> getTrystPropertysList() {
            return this.trystPropertysBuilder_ == null ? Collections.unmodifiableList(this.trystPropertys_) : this.trystPropertysBuilder_.getMessageList();
         }

         public int getTrystPropertysCount() {
            return this.trystPropertysBuilder_ == null ? this.trystPropertys_.size() : this.trystPropertysBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getTrystPropertys(int index) {
            return this.trystPropertysBuilder_ == null ? (CommonMsg.PropertyInfo)this.trystPropertys_.get(index) : (CommonMsg.PropertyInfo)this.trystPropertysBuilder_.getMessage(index);
         }

         public Builder setTrystPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.trystPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.set(index, value);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTrystPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTrystPropertys(CommonMsg.PropertyInfo value) {
            if (this.trystPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.add(value);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTrystPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.trystPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.add(index, value);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTrystPropertys(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTrystPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTrystPropertys(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.trystPropertys_);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTrystPropertys() {
            if (this.trystPropertysBuilder_ == null) {
               this.trystPropertys_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.clear();
            }

            return this;
         }

         public Builder removeTrystPropertys(int index) {
            if (this.trystPropertysBuilder_ == null) {
               this.ensureTrystPropertysIsMutable();
               this.trystPropertys_.remove(index);
               this.onChanged();
            } else {
               this.trystPropertysBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getTrystPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getTrystPropertysFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getTrystPropertysOrBuilder(int index) {
            return this.trystPropertysBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.trystPropertys_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.trystPropertysBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getTrystPropertysOrBuilderList() {
            return this.trystPropertysBuilder_ != null ? this.trystPropertysBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.trystPropertys_);
         }

         public CommonMsg.PropertyInfo.Builder addTrystPropertysBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getTrystPropertysFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addTrystPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getTrystPropertysFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getTrystPropertysBuilderList() {
            return this.getTrystPropertysFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getTrystPropertysFieldBuilder() {
            if (this.trystPropertysBuilder_ == null) {
               this.trystPropertysBuilder_ = new RepeatedFieldBuilderV3(this.trystPropertys_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.trystPropertys_ = null;
            }

            return this.trystPropertysBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_UnlockInfo_9801 extends GeneratedMessageV3 implements C2S_UnlockInfo_9801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UnlockInfo_9801 DEFAULT_INSTANCE = new C2S_UnlockInfo_9801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnlockInfo_9801> PARSER = new AbstractParser<C2S_UnlockInfo_9801>() {
         public C2S_UnlockInfo_9801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnlockInfo_9801(input, extensionRegistry);
         }
      };

      private C2S_UnlockInfo_9801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnlockInfo_9801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnlockInfo_9801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnlockInfo_9801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockInfo_9801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UnlockInfo_9801)) {
            return super.equals(obj);
         } else {
            C2S_UnlockInfo_9801 other = (C2S_UnlockInfo_9801)obj;
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

      public static C2S_UnlockInfo_9801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnlockInfo_9801)PARSER.parseFrom(data);
      }

      public static C2S_UnlockInfo_9801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockInfo_9801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockInfo_9801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnlockInfo_9801)PARSER.parseFrom(data);
      }

      public static C2S_UnlockInfo_9801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockInfo_9801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockInfo_9801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnlockInfo_9801)PARSER.parseFrom(data);
      }

      public static C2S_UnlockInfo_9801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockInfo_9801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockInfo_9801 parseFrom(InputStream input) throws IOException {
         return (C2S_UnlockInfo_9801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockInfo_9801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockInfo_9801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockInfo_9801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnlockInfo_9801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnlockInfo_9801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockInfo_9801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockInfo_9801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnlockInfo_9801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockInfo_9801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockInfo_9801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnlockInfo_9801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnlockInfo_9801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnlockInfo_9801> parser() {
         return PARSER;
      }

      public Parser<C2S_UnlockInfo_9801> getParserForType() {
         return PARSER;
      }

      public C2S_UnlockInfo_9801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnlockInfo_9801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockInfo_9801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_UnlockInfo_9801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockInfo_9801_descriptor;
         }

         public C2S_UnlockInfo_9801 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_UnlockInfo_9801.getDefaultInstance();
         }

         public C2S_UnlockInfo_9801 build() {
            C2S_UnlockInfo_9801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnlockInfo_9801 buildPartial() {
            C2S_UnlockInfo_9801 result = new C2S_UnlockInfo_9801(this);
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
            if (other instanceof C2S_UnlockInfo_9801) {
               return this.mergeFrom((C2S_UnlockInfo_9801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnlockInfo_9801 other) {
            if (other == TongqueTerraceMsg.C2S_UnlockInfo_9801.getDefaultInstance()) {
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
            C2S_UnlockInfo_9801 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnlockInfo_9801)TongqueTerraceMsg.C2S_UnlockInfo_9801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnlockInfo_9801)e.getUnfinishedMessage();
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

   public static final class S2C_UnlockInfoResult_9802 extends GeneratedMessageV3 implements S2C_UnlockInfoResult_9802OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<UnlockInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockInfoResult_9802 DEFAULT_INSTANCE = new S2C_UnlockInfoResult_9802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockInfoResult_9802> PARSER = new AbstractParser<S2C_UnlockInfoResult_9802>() {
         public S2C_UnlockInfoResult_9802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockInfoResult_9802(input, extensionRegistry);
         }
      };

      private S2C_UnlockInfoResult_9802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockInfoResult_9802() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockInfoResult_9802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockInfoResult_9802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(TongqueTerraceMsg.UnlockInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockInfoResult_9802.class, Builder.class);
      }

      public List<UnlockInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends UnlockInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public UnlockInfo getInfos(int index) {
         return (UnlockInfo)this.infos_.get(index);
      }

      public UnlockInfoOrBuilder getInfosOrBuilder(int index) {
         return (UnlockInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.infos_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockInfoResult_9802)) {
            return super.equals(obj);
         } else {
            S2C_UnlockInfoResult_9802 other = (S2C_UnlockInfoResult_9802)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockInfoResult_9802)PARSER.parseFrom(data);
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockInfoResult_9802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockInfoResult_9802)PARSER.parseFrom(data);
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockInfoResult_9802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockInfoResult_9802)PARSER.parseFrom(data);
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockInfoResult_9802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockInfoResult_9802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockInfoResult_9802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockInfoResult_9802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockInfoResult_9802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockInfoResult_9802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockInfoResult_9802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockInfoResult_9802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockInfoResult_9802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockInfoResult_9802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockInfoResult_9802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockInfoResult_9802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockInfoResult_9802> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockInfoResult_9802> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockInfoResult_9802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockInfoResult_9802OrBuilder {
         private int bitField0_;
         private List<UnlockInfo> infos_;
         private RepeatedFieldBuilderV3<UnlockInfo, UnlockInfo.Builder, UnlockInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockInfoResult_9802.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_UnlockInfoResult_9802.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockInfoResult_9802_descriptor;
         }

         public S2C_UnlockInfoResult_9802 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_UnlockInfoResult_9802.getDefaultInstance();
         }

         public S2C_UnlockInfoResult_9802 build() {
            S2C_UnlockInfoResult_9802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockInfoResult_9802 buildPartial() {
            S2C_UnlockInfoResult_9802 result = new S2C_UnlockInfoResult_9802(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_UnlockInfoResult_9802) {
               return this.mergeFrom((S2C_UnlockInfoResult_9802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockInfoResult_9802 other) {
            if (other == TongqueTerraceMsg.S2C_UnlockInfoResult_9802.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = TongqueTerraceMsg.S2C_UnlockInfoResult_9802.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnlockInfoResult_9802 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockInfoResult_9802)TongqueTerraceMsg.S2C_UnlockInfoResult_9802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockInfoResult_9802)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<UnlockInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public UnlockInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (UnlockInfo)this.infos_.get(index) : (UnlockInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, UnlockInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, UnlockInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(UnlockInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, UnlockInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(UnlockInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, UnlockInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends UnlockInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public UnlockInfo.Builder getInfosBuilder(int index) {
            return (UnlockInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public UnlockInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (UnlockInfoOrBuilder)this.infos_.get(index) : (UnlockInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends UnlockInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public UnlockInfo.Builder addInfosBuilder() {
            return (UnlockInfo.Builder)this.getInfosFieldBuilder().addBuilder(TongqueTerraceMsg.UnlockInfo.getDefaultInstance());
         }

         public UnlockInfo.Builder addInfosBuilder(int index) {
            return (UnlockInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, TongqueTerraceMsg.UnlockInfo.getDefaultInstance());
         }

         public List<UnlockInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<UnlockInfo, UnlockInfo.Builder, UnlockInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OpenUi_9803 extends GeneratedMessageV3 implements C2S_OpenUi_9803OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenUi_9803 DEFAULT_INSTANCE = new C2S_OpenUi_9803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenUi_9803> PARSER = new AbstractParser<C2S_OpenUi_9803>() {
         public C2S_OpenUi_9803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenUi_9803(input, extensionRegistry);
         }
      };

      private C2S_OpenUi_9803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenUi_9803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenUi_9803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenUi_9803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_9803.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenUi_9803)) {
            return super.equals(obj);
         } else {
            C2S_OpenUi_9803 other = (C2S_OpenUi_9803)obj;
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

      public static C2S_OpenUi_9803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_9803)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_9803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_9803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_9803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_9803)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_9803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_9803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_9803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_9803)PARSER.parseFrom(data);
      }

      public static C2S_OpenUi_9803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenUi_9803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenUi_9803 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_9803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_9803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_9803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_9803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenUi_9803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_9803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_9803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenUi_9803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenUi_9803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenUi_9803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenUi_9803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenUi_9803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenUi_9803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenUi_9803> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenUi_9803> getParserForType() {
         return PARSER;
      }

      public C2S_OpenUi_9803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenUi_9803OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenUi_9803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_OpenUi_9803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_OpenUi_9803_descriptor;
         }

         public C2S_OpenUi_9803 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_OpenUi_9803.getDefaultInstance();
         }

         public C2S_OpenUi_9803 build() {
            C2S_OpenUi_9803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenUi_9803 buildPartial() {
            C2S_OpenUi_9803 result = new C2S_OpenUi_9803(this);
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
            if (other instanceof C2S_OpenUi_9803) {
               return this.mergeFrom((C2S_OpenUi_9803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenUi_9803 other) {
            if (other == TongqueTerraceMsg.C2S_OpenUi_9803.getDefaultInstance()) {
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
            C2S_OpenUi_9803 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenUi_9803)TongqueTerraceMsg.C2S_OpenUi_9803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenUi_9803)e.getUnfinishedMessage();
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

   public static final class S2C_OpenUiResult_9804 extends GeneratedMessageV3 implements S2C_OpenUiResult_9804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DOWNTIME_FIELD_NUMBER = 1;
      private int downTime_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<BeautyInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenUiResult_9804 DEFAULT_INSTANCE = new S2C_OpenUiResult_9804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenUiResult_9804> PARSER = new AbstractParser<S2C_OpenUiResult_9804>() {
         public S2C_OpenUiResult_9804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenUiResult_9804(input, extensionRegistry);
         }
      };

      private S2C_OpenUiResult_9804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenUiResult_9804() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenUiResult_9804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenUiResult_9804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.downTime_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(TongqueTerraceMsg.BeautyInfo.PARSER, extensionRegistry));
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_9804.class, Builder.class);
      }

      public boolean hasDownTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDownTime() {
         return this.downTime_;
      }

      public List<BeautyInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends BeautyInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public BeautyInfo getInfos(int index) {
         return (BeautyInfo)this.infos_.get(index);
      }

      public BeautyInfoOrBuilder getInfosOrBuilder(int index) {
         return (BeautyInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDownTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
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
            output.writeInt32(1, this.downTime_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.infos_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.downTime_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenUiResult_9804)) {
            return super.equals(obj);
         } else {
            S2C_OpenUiResult_9804 other = (S2C_OpenUiResult_9804)obj;
            if (this.hasDownTime() != other.hasDownTime()) {
               return false;
            } else if (this.hasDownTime() && this.getDownTime() != other.getDownTime()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.hasDownTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDownTime();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenUiResult_9804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_9804)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_9804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_9804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_9804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_9804)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_9804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_9804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_9804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_9804)PARSER.parseFrom(data);
      }

      public static S2C_OpenUiResult_9804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenUiResult_9804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenUiResult_9804 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_9804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_9804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_9804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_9804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenUiResult_9804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_9804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_9804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenUiResult_9804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenUiResult_9804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenUiResult_9804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenUiResult_9804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenUiResult_9804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenUiResult_9804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenUiResult_9804> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenUiResult_9804> getParserForType() {
         return PARSER;
      }

      public S2C_OpenUiResult_9804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenUiResult_9804OrBuilder {
         private int bitField0_;
         private int downTime_;
         private List<BeautyInfo> infos_;
         private RepeatedFieldBuilderV3<BeautyInfo, BeautyInfo.Builder, BeautyInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenUiResult_9804.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_OpenUiResult_9804.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.downTime_ = 0;
            this.bitField0_ &= -2;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_OpenUiResult_9804_descriptor;
         }

         public S2C_OpenUiResult_9804 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_OpenUiResult_9804.getDefaultInstance();
         }

         public S2C_OpenUiResult_9804 build() {
            S2C_OpenUiResult_9804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenUiResult_9804 buildPartial() {
            S2C_OpenUiResult_9804 result = new S2C_OpenUiResult_9804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.downTime_ = this.downTime_;
               to_bitField0_ |= 1;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -3;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_OpenUiResult_9804) {
               return this.mergeFrom((S2C_OpenUiResult_9804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenUiResult_9804 other) {
            if (other == TongqueTerraceMsg.S2C_OpenUiResult_9804.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDownTime()) {
                  this.setDownTime(other.getDownTime());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -3;
                     this.infosBuilder_ = TongqueTerraceMsg.S2C_OpenUiResult_9804.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDownTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenUiResult_9804 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenUiResult_9804)TongqueTerraceMsg.S2C_OpenUiResult_9804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenUiResult_9804)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDownTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDownTime() {
            return this.downTime_;
         }

         public Builder setDownTime(int value) {
            this.bitField0_ |= 1;
            this.downTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDownTime() {
            this.bitField0_ &= -2;
            this.downTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public List<BeautyInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public BeautyInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (BeautyInfo)this.infos_.get(index) : (BeautyInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, BeautyInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, BeautyInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(BeautyInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, BeautyInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(BeautyInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, BeautyInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends BeautyInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public BeautyInfo.Builder getInfosBuilder(int index) {
            return (BeautyInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public BeautyInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (BeautyInfoOrBuilder)this.infos_.get(index) : (BeautyInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends BeautyInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public BeautyInfo.Builder addInfosBuilder() {
            return (BeautyInfo.Builder)this.getInfosFieldBuilder().addBuilder(TongqueTerraceMsg.BeautyInfo.getDefaultInstance());
         }

         public BeautyInfo.Builder addInfosBuilder(int index) {
            return (BeautyInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, TongqueTerraceMsg.BeautyInfo.getDefaultInstance());
         }

         public List<BeautyInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<BeautyInfo, BeautyInfo.Builder, BeautyInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FreeTryst_9805 extends GeneratedMessageV3 implements C2S_FreeTryst_9805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_FreeTryst_9805 DEFAULT_INSTANCE = new C2S_FreeTryst_9805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FreeTryst_9805> PARSER = new AbstractParser<C2S_FreeTryst_9805>() {
         public C2S_FreeTryst_9805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FreeTryst_9805(input, extensionRegistry);
         }
      };

      private C2S_FreeTryst_9805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FreeTryst_9805() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FreeTryst_9805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FreeTryst_9805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        TrystType value = TongqueTerraceMsg.TrystType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeTryst_9805.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public TrystType getType() {
         TrystType result = TongqueTerraceMsg.TrystType.valueOf(this.type_);
         return result == null ? TongqueTerraceMsg.TrystType.TRYST_TYPE_FREE : result;
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
            output.writeEnum(1, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FreeTryst_9805)) {
            return super.equals(obj);
         } else {
            C2S_FreeTryst_9805 other = (C2S_FreeTryst_9805)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
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
               hash = 53 * hash + this.type_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FreeTryst_9805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FreeTryst_9805)PARSER.parseFrom(data);
      }

      public static C2S_FreeTryst_9805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeTryst_9805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeTryst_9805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FreeTryst_9805)PARSER.parseFrom(data);
      }

      public static C2S_FreeTryst_9805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeTryst_9805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeTryst_9805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FreeTryst_9805)PARSER.parseFrom(data);
      }

      public static C2S_FreeTryst_9805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FreeTryst_9805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FreeTryst_9805 parseFrom(InputStream input) throws IOException {
         return (C2S_FreeTryst_9805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeTryst_9805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeTryst_9805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeTryst_9805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FreeTryst_9805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FreeTryst_9805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeTryst_9805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FreeTryst_9805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FreeTryst_9805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FreeTryst_9805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FreeTryst_9805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FreeTryst_9805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FreeTryst_9805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FreeTryst_9805> parser() {
         return PARSER;
      }

      public Parser<C2S_FreeTryst_9805> getParserForType() {
         return PARSER;
      }

      public C2S_FreeTryst_9805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FreeTryst_9805OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FreeTryst_9805.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_FreeTryst_9805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_FreeTryst_9805_descriptor;
         }

         public C2S_FreeTryst_9805 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_FreeTryst_9805.getDefaultInstance();
         }

         public C2S_FreeTryst_9805 build() {
            C2S_FreeTryst_9805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FreeTryst_9805 buildPartial() {
            C2S_FreeTryst_9805 result = new C2S_FreeTryst_9805(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
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
            if (other instanceof C2S_FreeTryst_9805) {
               return this.mergeFrom((C2S_FreeTryst_9805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FreeTryst_9805 other) {
            if (other == TongqueTerraceMsg.C2S_FreeTryst_9805.getDefaultInstance()) {
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
            C2S_FreeTryst_9805 parsedMessage = null;

            try {
               parsedMessage = (C2S_FreeTryst_9805)TongqueTerraceMsg.C2S_FreeTryst_9805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FreeTryst_9805)e.getUnfinishedMessage();
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

         public TrystType getType() {
            TrystType result = TongqueTerraceMsg.TrystType.valueOf(this.type_);
            return result == null ? TongqueTerraceMsg.TrystType.TRYST_TYPE_FREE : result;
         }

         public Builder setType(TrystType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
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

   public static final class S2C_FreeTrystResult_9806 extends GeneratedMessageV3 implements S2C_FreeTrystResult_9806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DOWNTIME_FIELD_NUMBER = 1;
      private int downTime_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int EXPINFOS_FIELD_NUMBER = 3;
      private List<TrystExpInfo> expInfos_;
      public static final int TRYSTINFOS_FIELD_NUMBER = 4;
      private List<BeautyTrystInfo> trystInfos_;
      private byte memoizedIsInitialized;
      private static final S2C_FreeTrystResult_9806 DEFAULT_INSTANCE = new S2C_FreeTrystResult_9806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FreeTrystResult_9806> PARSER = new AbstractParser<S2C_FreeTrystResult_9806>() {
         public S2C_FreeTrystResult_9806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FreeTrystResult_9806(input, extensionRegistry);
         }
      };

      private S2C_FreeTrystResult_9806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FreeTrystResult_9806() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
         this.expInfos_ = Collections.emptyList();
         this.trystInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FreeTrystResult_9806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FreeTrystResult_9806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.downTime_ = input.readInt32();
                        break;
                     case 16:
                        int rawValue = input.readEnum();
                        TrystType value = TongqueTerraceMsg.TrystType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.type_ = rawValue;
                        }
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.expInfos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.expInfos_.add(input.readMessage(TongqueTerraceMsg.TrystExpInfo.PARSER, extensionRegistry));
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.trystInfos_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.trystInfos_.add(input.readMessage(TongqueTerraceMsg.BeautyTrystInfo.PARSER, extensionRegistry));
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
                  this.expInfos_ = Collections.unmodifiableList(this.expInfos_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.trystInfos_ = Collections.unmodifiableList(this.trystInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeTrystResult_9806.class, Builder.class);
      }

      public boolean hasDownTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDownTime() {
         return this.downTime_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public TrystType getType() {
         TrystType result = TongqueTerraceMsg.TrystType.valueOf(this.type_);
         return result == null ? TongqueTerraceMsg.TrystType.TRYST_TYPE_FREE : result;
      }

      public List<TrystExpInfo> getExpInfosList() {
         return this.expInfos_;
      }

      public List<? extends TrystExpInfoOrBuilder> getExpInfosOrBuilderList() {
         return this.expInfos_;
      }

      public int getExpInfosCount() {
         return this.expInfos_.size();
      }

      public TrystExpInfo getExpInfos(int index) {
         return (TrystExpInfo)this.expInfos_.get(index);
      }

      public TrystExpInfoOrBuilder getExpInfosOrBuilder(int index) {
         return (TrystExpInfoOrBuilder)this.expInfos_.get(index);
      }

      public List<BeautyTrystInfo> getTrystInfosList() {
         return this.trystInfos_;
      }

      public List<? extends BeautyTrystInfoOrBuilder> getTrystInfosOrBuilderList() {
         return this.trystInfos_;
      }

      public int getTrystInfosCount() {
         return this.trystInfos_.size();
      }

      public BeautyTrystInfo getTrystInfos(int index) {
         return (BeautyTrystInfo)this.trystInfos_.get(index);
      }

      public BeautyTrystInfoOrBuilder getTrystInfosOrBuilder(int index) {
         return (BeautyTrystInfoOrBuilder)this.trystInfos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDownTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getExpInfosCount(); ++i) {
               if (!this.getExpInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getTrystInfosCount(); ++i) {
               if (!this.getTrystInfos(i).isInitialized()) {
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
            output.writeInt32(1, this.downTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.type_);
         }

         for(int i = 0; i < this.expInfos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.expInfos_.get(i));
         }

         for(int i = 0; i < this.trystInfos_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.trystInfos_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.downTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeEnumSize(2, this.type_);
            }

            for(int i = 0; i < this.expInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.expInfos_.get(i));
            }

            for(int i = 0; i < this.trystInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.trystInfos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FreeTrystResult_9806)) {
            return super.equals(obj);
         } else {
            S2C_FreeTrystResult_9806 other = (S2C_FreeTrystResult_9806)obj;
            if (this.hasDownTime() != other.hasDownTime()) {
               return false;
            } else if (this.hasDownTime() && this.getDownTime() != other.getDownTime()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (!this.getExpInfosList().equals(other.getExpInfosList())) {
               return false;
            } else if (!this.getTrystInfosList().equals(other.getTrystInfosList())) {
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
            if (this.hasDownTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDownTime();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.type_;
            }

            if (this.getExpInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getExpInfosList().hashCode();
            }

            if (this.getTrystInfosCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTrystInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FreeTrystResult_9806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FreeTrystResult_9806)PARSER.parseFrom(data);
      }

      public static S2C_FreeTrystResult_9806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeTrystResult_9806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeTrystResult_9806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FreeTrystResult_9806)PARSER.parseFrom(data);
      }

      public static S2C_FreeTrystResult_9806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeTrystResult_9806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeTrystResult_9806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FreeTrystResult_9806)PARSER.parseFrom(data);
      }

      public static S2C_FreeTrystResult_9806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FreeTrystResult_9806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FreeTrystResult_9806 parseFrom(InputStream input) throws IOException {
         return (S2C_FreeTrystResult_9806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeTrystResult_9806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeTrystResult_9806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeTrystResult_9806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FreeTrystResult_9806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FreeTrystResult_9806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeTrystResult_9806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FreeTrystResult_9806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FreeTrystResult_9806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FreeTrystResult_9806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FreeTrystResult_9806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FreeTrystResult_9806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FreeTrystResult_9806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FreeTrystResult_9806> parser() {
         return PARSER;
      }

      public Parser<S2C_FreeTrystResult_9806> getParserForType() {
         return PARSER;
      }

      public S2C_FreeTrystResult_9806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FreeTrystResult_9806OrBuilder {
         private int bitField0_;
         private int downTime_;
         private int type_;
         private List<TrystExpInfo> expInfos_;
         private RepeatedFieldBuilderV3<TrystExpInfo, TrystExpInfo.Builder, TrystExpInfoOrBuilder> expInfosBuilder_;
         private List<BeautyTrystInfo> trystInfos_;
         private RepeatedFieldBuilderV3<BeautyTrystInfo, BeautyTrystInfo.Builder, BeautyTrystInfoOrBuilder> trystInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FreeTrystResult_9806.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.expInfos_ = Collections.emptyList();
            this.trystInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.expInfos_ = Collections.emptyList();
            this.trystInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_FreeTrystResult_9806.alwaysUseFieldBuilders) {
               this.getExpInfosFieldBuilder();
               this.getTrystInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.downTime_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            if (this.expInfosBuilder_ == null) {
               this.expInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.expInfosBuilder_.clear();
            }

            if (this.trystInfosBuilder_ == null) {
               this.trystInfos_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.trystInfosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_FreeTrystResult_9806_descriptor;
         }

         public S2C_FreeTrystResult_9806 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_FreeTrystResult_9806.getDefaultInstance();
         }

         public S2C_FreeTrystResult_9806 build() {
            S2C_FreeTrystResult_9806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FreeTrystResult_9806 buildPartial() {
            S2C_FreeTrystResult_9806 result = new S2C_FreeTrystResult_9806(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.downTime_ = this.downTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.type_ = this.type_;
            if (this.expInfosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.expInfos_ = Collections.unmodifiableList(this.expInfos_);
                  this.bitField0_ &= -5;
               }

               result.expInfos_ = this.expInfos_;
            } else {
               result.expInfos_ = this.expInfosBuilder_.build();
            }

            if (this.trystInfosBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.trystInfos_ = Collections.unmodifiableList(this.trystInfos_);
                  this.bitField0_ &= -9;
               }

               result.trystInfos_ = this.trystInfos_;
            } else {
               result.trystInfos_ = this.trystInfosBuilder_.build();
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
            if (other instanceof S2C_FreeTrystResult_9806) {
               return this.mergeFrom((S2C_FreeTrystResult_9806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FreeTrystResult_9806 other) {
            if (other == TongqueTerraceMsg.S2C_FreeTrystResult_9806.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDownTime()) {
                  this.setDownTime(other.getDownTime());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.expInfosBuilder_ == null) {
                  if (!other.expInfos_.isEmpty()) {
                     if (this.expInfos_.isEmpty()) {
                        this.expInfos_ = other.expInfos_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureExpInfosIsMutable();
                        this.expInfos_.addAll(other.expInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.expInfos_.isEmpty()) {
                  if (this.expInfosBuilder_.isEmpty()) {
                     this.expInfosBuilder_.dispose();
                     this.expInfosBuilder_ = null;
                     this.expInfos_ = other.expInfos_;
                     this.bitField0_ &= -5;
                     this.expInfosBuilder_ = TongqueTerraceMsg.S2C_FreeTrystResult_9806.alwaysUseFieldBuilders ? this.getExpInfosFieldBuilder() : null;
                  } else {
                     this.expInfosBuilder_.addAllMessages(other.expInfos_);
                  }
               }

               if (this.trystInfosBuilder_ == null) {
                  if (!other.trystInfos_.isEmpty()) {
                     if (this.trystInfos_.isEmpty()) {
                        this.trystInfos_ = other.trystInfos_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureTrystInfosIsMutable();
                        this.trystInfos_.addAll(other.trystInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.trystInfos_.isEmpty()) {
                  if (this.trystInfosBuilder_.isEmpty()) {
                     this.trystInfosBuilder_.dispose();
                     this.trystInfosBuilder_ = null;
                     this.trystInfos_ = other.trystInfos_;
                     this.bitField0_ &= -9;
                     this.trystInfosBuilder_ = TongqueTerraceMsg.S2C_FreeTrystResult_9806.alwaysUseFieldBuilders ? this.getTrystInfosFieldBuilder() : null;
                  } else {
                     this.trystInfosBuilder_.addAllMessages(other.trystInfos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDownTime()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else {
               for(int i = 0; i < this.getExpInfosCount(); ++i) {
                  if (!this.getExpInfos(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getTrystInfosCount(); ++i) {
                  if (!this.getTrystInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FreeTrystResult_9806 parsedMessage = null;

            try {
               parsedMessage = (S2C_FreeTrystResult_9806)TongqueTerraceMsg.S2C_FreeTrystResult_9806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FreeTrystResult_9806)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDownTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDownTime() {
            return this.downTime_;
         }

         public Builder setDownTime(int value) {
            this.bitField0_ |= 1;
            this.downTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDownTime() {
            this.bitField0_ &= -2;
            this.downTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public TrystType getType() {
            TrystType result = TongqueTerraceMsg.TrystType.valueOf(this.type_);
            return result == null ? TongqueTerraceMsg.TrystType.TRYST_TYPE_FREE : result;
         }

         public Builder setType(TrystType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureExpInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.expInfos_ = new ArrayList(this.expInfos_);
               this.bitField0_ |= 4;
            }

         }

         public List<TrystExpInfo> getExpInfosList() {
            return this.expInfosBuilder_ == null ? Collections.unmodifiableList(this.expInfos_) : this.expInfosBuilder_.getMessageList();
         }

         public int getExpInfosCount() {
            return this.expInfosBuilder_ == null ? this.expInfos_.size() : this.expInfosBuilder_.getCount();
         }

         public TrystExpInfo getExpInfos(int index) {
            return this.expInfosBuilder_ == null ? (TrystExpInfo)this.expInfos_.get(index) : (TrystExpInfo)this.expInfosBuilder_.getMessage(index);
         }

         public Builder setExpInfos(int index, TrystExpInfo value) {
            if (this.expInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExpInfosIsMutable();
               this.expInfos_.set(index, value);
               this.onChanged();
            } else {
               this.expInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setExpInfos(int index, TrystExpInfo.Builder builderForValue) {
            if (this.expInfosBuilder_ == null) {
               this.ensureExpInfosIsMutable();
               this.expInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.expInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addExpInfos(TrystExpInfo value) {
            if (this.expInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExpInfosIsMutable();
               this.expInfos_.add(value);
               this.onChanged();
            } else {
               this.expInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addExpInfos(int index, TrystExpInfo value) {
            if (this.expInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureExpInfosIsMutable();
               this.expInfos_.add(index, value);
               this.onChanged();
            } else {
               this.expInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addExpInfos(TrystExpInfo.Builder builderForValue) {
            if (this.expInfosBuilder_ == null) {
               this.ensureExpInfosIsMutable();
               this.expInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.expInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addExpInfos(int index, TrystExpInfo.Builder builderForValue) {
            if (this.expInfosBuilder_ == null) {
               this.ensureExpInfosIsMutable();
               this.expInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.expInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllExpInfos(Iterable<? extends TrystExpInfo> values) {
            if (this.expInfosBuilder_ == null) {
               this.ensureExpInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.expInfos_);
               this.onChanged();
            } else {
               this.expInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearExpInfos() {
            if (this.expInfosBuilder_ == null) {
               this.expInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.expInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeExpInfos(int index) {
            if (this.expInfosBuilder_ == null) {
               this.ensureExpInfosIsMutable();
               this.expInfos_.remove(index);
               this.onChanged();
            } else {
               this.expInfosBuilder_.remove(index);
            }

            return this;
         }

         public TrystExpInfo.Builder getExpInfosBuilder(int index) {
            return (TrystExpInfo.Builder)this.getExpInfosFieldBuilder().getBuilder(index);
         }

         public TrystExpInfoOrBuilder getExpInfosOrBuilder(int index) {
            return this.expInfosBuilder_ == null ? (TrystExpInfoOrBuilder)this.expInfos_.get(index) : (TrystExpInfoOrBuilder)this.expInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TrystExpInfoOrBuilder> getExpInfosOrBuilderList() {
            return this.expInfosBuilder_ != null ? this.expInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.expInfos_);
         }

         public TrystExpInfo.Builder addExpInfosBuilder() {
            return (TrystExpInfo.Builder)this.getExpInfosFieldBuilder().addBuilder(TongqueTerraceMsg.TrystExpInfo.getDefaultInstance());
         }

         public TrystExpInfo.Builder addExpInfosBuilder(int index) {
            return (TrystExpInfo.Builder)this.getExpInfosFieldBuilder().addBuilder(index, TongqueTerraceMsg.TrystExpInfo.getDefaultInstance());
         }

         public List<TrystExpInfo.Builder> getExpInfosBuilderList() {
            return this.getExpInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TrystExpInfo, TrystExpInfo.Builder, TrystExpInfoOrBuilder> getExpInfosFieldBuilder() {
            if (this.expInfosBuilder_ == null) {
               this.expInfosBuilder_ = new RepeatedFieldBuilderV3(this.expInfos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.expInfos_ = null;
            }

            return this.expInfosBuilder_;
         }

         private void ensureTrystInfosIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.trystInfos_ = new ArrayList(this.trystInfos_);
               this.bitField0_ |= 8;
            }

         }

         public List<BeautyTrystInfo> getTrystInfosList() {
            return this.trystInfosBuilder_ == null ? Collections.unmodifiableList(this.trystInfos_) : this.trystInfosBuilder_.getMessageList();
         }

         public int getTrystInfosCount() {
            return this.trystInfosBuilder_ == null ? this.trystInfos_.size() : this.trystInfosBuilder_.getCount();
         }

         public BeautyTrystInfo getTrystInfos(int index) {
            return this.trystInfosBuilder_ == null ? (BeautyTrystInfo)this.trystInfos_.get(index) : (BeautyTrystInfo)this.trystInfosBuilder_.getMessage(index);
         }

         public Builder setTrystInfos(int index, BeautyTrystInfo value) {
            if (this.trystInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTrystInfosIsMutable();
               this.trystInfos_.set(index, value);
               this.onChanged();
            } else {
               this.trystInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTrystInfos(int index, BeautyTrystInfo.Builder builderForValue) {
            if (this.trystInfosBuilder_ == null) {
               this.ensureTrystInfosIsMutable();
               this.trystInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.trystInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTrystInfos(BeautyTrystInfo value) {
            if (this.trystInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTrystInfosIsMutable();
               this.trystInfos_.add(value);
               this.onChanged();
            } else {
               this.trystInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTrystInfos(int index, BeautyTrystInfo value) {
            if (this.trystInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTrystInfosIsMutable();
               this.trystInfos_.add(index, value);
               this.onChanged();
            } else {
               this.trystInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTrystInfos(BeautyTrystInfo.Builder builderForValue) {
            if (this.trystInfosBuilder_ == null) {
               this.ensureTrystInfosIsMutable();
               this.trystInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.trystInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTrystInfos(int index, BeautyTrystInfo.Builder builderForValue) {
            if (this.trystInfosBuilder_ == null) {
               this.ensureTrystInfosIsMutable();
               this.trystInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.trystInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTrystInfos(Iterable<? extends BeautyTrystInfo> values) {
            if (this.trystInfosBuilder_ == null) {
               this.ensureTrystInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.trystInfos_);
               this.onChanged();
            } else {
               this.trystInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTrystInfos() {
            if (this.trystInfosBuilder_ == null) {
               this.trystInfos_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.trystInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeTrystInfos(int index) {
            if (this.trystInfosBuilder_ == null) {
               this.ensureTrystInfosIsMutable();
               this.trystInfos_.remove(index);
               this.onChanged();
            } else {
               this.trystInfosBuilder_.remove(index);
            }

            return this;
         }

         public BeautyTrystInfo.Builder getTrystInfosBuilder(int index) {
            return (BeautyTrystInfo.Builder)this.getTrystInfosFieldBuilder().getBuilder(index);
         }

         public BeautyTrystInfoOrBuilder getTrystInfosOrBuilder(int index) {
            return this.trystInfosBuilder_ == null ? (BeautyTrystInfoOrBuilder)this.trystInfos_.get(index) : (BeautyTrystInfoOrBuilder)this.trystInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends BeautyTrystInfoOrBuilder> getTrystInfosOrBuilderList() {
            return this.trystInfosBuilder_ != null ? this.trystInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.trystInfos_);
         }

         public BeautyTrystInfo.Builder addTrystInfosBuilder() {
            return (BeautyTrystInfo.Builder)this.getTrystInfosFieldBuilder().addBuilder(TongqueTerraceMsg.BeautyTrystInfo.getDefaultInstance());
         }

         public BeautyTrystInfo.Builder addTrystInfosBuilder(int index) {
            return (BeautyTrystInfo.Builder)this.getTrystInfosFieldBuilder().addBuilder(index, TongqueTerraceMsg.BeautyTrystInfo.getDefaultInstance());
         }

         public List<BeautyTrystInfo.Builder> getTrystInfosBuilderList() {
            return this.getTrystInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<BeautyTrystInfo, BeautyTrystInfo.Builder, BeautyTrystInfoOrBuilder> getTrystInfosFieldBuilder() {
            if (this.trystInfosBuilder_ == null) {
               this.trystInfosBuilder_ = new RepeatedFieldBuilderV3(this.trystInfos_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.trystInfos_ = null;
            }

            return this.trystInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TrystBeauty_9807 extends GeneratedMessageV3 implements C2S_TrystBeauty_9807OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      private byte memoizedIsInitialized;
      private static final C2S_TrystBeauty_9807 DEFAULT_INSTANCE = new C2S_TrystBeauty_9807();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TrystBeauty_9807> PARSER = new AbstractParser<C2S_TrystBeauty_9807>() {
         public C2S_TrystBeauty_9807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TrystBeauty_9807(input, extensionRegistry);
         }
      };

      private C2S_TrystBeauty_9807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TrystBeauty_9807() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TrystBeauty_9807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TrystBeauty_9807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TrystBeauty_9807.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.beautyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TrystBeauty_9807)) {
            return super.equals(obj);
         } else {
            C2S_TrystBeauty_9807 other = (C2S_TrystBeauty_9807)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TrystBeauty_9807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TrystBeauty_9807)PARSER.parseFrom(data);
      }

      public static C2S_TrystBeauty_9807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TrystBeauty_9807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TrystBeauty_9807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TrystBeauty_9807)PARSER.parseFrom(data);
      }

      public static C2S_TrystBeauty_9807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TrystBeauty_9807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TrystBeauty_9807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TrystBeauty_9807)PARSER.parseFrom(data);
      }

      public static C2S_TrystBeauty_9807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TrystBeauty_9807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TrystBeauty_9807 parseFrom(InputStream input) throws IOException {
         return (C2S_TrystBeauty_9807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TrystBeauty_9807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TrystBeauty_9807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TrystBeauty_9807 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TrystBeauty_9807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TrystBeauty_9807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TrystBeauty_9807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TrystBeauty_9807 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TrystBeauty_9807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TrystBeauty_9807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TrystBeauty_9807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TrystBeauty_9807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TrystBeauty_9807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TrystBeauty_9807> parser() {
         return PARSER;
      }

      public Parser<C2S_TrystBeauty_9807> getParserForType() {
         return PARSER;
      }

      public C2S_TrystBeauty_9807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TrystBeauty_9807OrBuilder {
         private int bitField0_;
         private int beautyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TrystBeauty_9807.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_TrystBeauty_9807.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_TrystBeauty_9807_descriptor;
         }

         public C2S_TrystBeauty_9807 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_TrystBeauty_9807.getDefaultInstance();
         }

         public C2S_TrystBeauty_9807 build() {
            C2S_TrystBeauty_9807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TrystBeauty_9807 buildPartial() {
            C2S_TrystBeauty_9807 result = new C2S_TrystBeauty_9807(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
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
            if (other instanceof C2S_TrystBeauty_9807) {
               return this.mergeFrom((C2S_TrystBeauty_9807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TrystBeauty_9807 other) {
            if (other == TongqueTerraceMsg.C2S_TrystBeauty_9807.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBeautyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TrystBeauty_9807 parsedMessage = null;

            try {
               parsedMessage = (C2S_TrystBeauty_9807)TongqueTerraceMsg.C2S_TrystBeauty_9807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TrystBeauty_9807)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
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

   public static final class S2C_TrystBeautyResult_9808 extends GeneratedMessageV3 implements S2C_TrystBeautyResult_9808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      public static final int EXPINFOS_FIELD_NUMBER = 2;
      private TrystExpInfo expInfos_;
      public static final int TRYSTINFOS_FIELD_NUMBER = 4;
      private BeautyTrystInfo trystInfos_;
      private byte memoizedIsInitialized;
      private static final S2C_TrystBeautyResult_9808 DEFAULT_INSTANCE = new S2C_TrystBeautyResult_9808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TrystBeautyResult_9808> PARSER = new AbstractParser<S2C_TrystBeautyResult_9808>() {
         public S2C_TrystBeautyResult_9808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TrystBeautyResult_9808(input, extensionRegistry);
         }
      };

      private S2C_TrystBeautyResult_9808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TrystBeautyResult_9808() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TrystBeautyResult_9808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TrystBeautyResult_9808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
                        break;
                     case 18:
                        TrystExpInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.expInfos_.toBuilder();
                        }

                        this.expInfos_ = (TrystExpInfo)input.readMessage(TongqueTerraceMsg.TrystExpInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.expInfos_);
                           this.expInfos_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 34:
                        BeautyTrystInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.trystInfos_.toBuilder();
                        }

                        this.trystInfos_ = (BeautyTrystInfo)input.readMessage(TongqueTerraceMsg.BeautyTrystInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.trystInfos_);
                           this.trystInfos_ = subBuilder.buildPartial();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TrystBeautyResult_9808.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public boolean hasExpInfos() {
         return (this.bitField0_ & 2) != 0;
      }

      public TrystExpInfo getExpInfos() {
         return this.expInfos_ == null ? TongqueTerraceMsg.TrystExpInfo.getDefaultInstance() : this.expInfos_;
      }

      public TrystExpInfoOrBuilder getExpInfosOrBuilder() {
         return this.expInfos_ == null ? TongqueTerraceMsg.TrystExpInfo.getDefaultInstance() : this.expInfos_;
      }

      public boolean hasTrystInfos() {
         return (this.bitField0_ & 4) != 0;
      }

      public BeautyTrystInfo getTrystInfos() {
         return this.trystInfos_ == null ? TongqueTerraceMsg.BeautyTrystInfo.getDefaultInstance() : this.trystInfos_;
      }

      public BeautyTrystInfoOrBuilder getTrystInfosOrBuilder() {
         return this.trystInfos_ == null ? TongqueTerraceMsg.BeautyTrystInfo.getDefaultInstance() : this.trystInfos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExpInfos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTrystInfos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getExpInfos().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getTrystInfos().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.beautyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getExpInfos());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getTrystInfos());
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getExpInfos());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getTrystInfos());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TrystBeautyResult_9808)) {
            return super.equals(obj);
         } else {
            S2C_TrystBeautyResult_9808 other = (S2C_TrystBeautyResult_9808)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
               return false;
            } else if (this.hasExpInfos() != other.hasExpInfos()) {
               return false;
            } else if (this.hasExpInfos() && !this.getExpInfos().equals(other.getExpInfos())) {
               return false;
            } else if (this.hasTrystInfos() != other.hasTrystInfos()) {
               return false;
            } else if (this.hasTrystInfos() && !this.getTrystInfos().equals(other.getTrystInfos())) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            if (this.hasExpInfos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getExpInfos().hashCode();
            }

            if (this.hasTrystInfos()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTrystInfos().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TrystBeautyResult_9808)PARSER.parseFrom(data);
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TrystBeautyResult_9808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TrystBeautyResult_9808)PARSER.parseFrom(data);
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TrystBeautyResult_9808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TrystBeautyResult_9808)PARSER.parseFrom(data);
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TrystBeautyResult_9808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(InputStream input) throws IOException {
         return (S2C_TrystBeautyResult_9808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TrystBeautyResult_9808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TrystBeautyResult_9808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TrystBeautyResult_9808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TrystBeautyResult_9808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TrystBeautyResult_9808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TrystBeautyResult_9808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TrystBeautyResult_9808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TrystBeautyResult_9808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TrystBeautyResult_9808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TrystBeautyResult_9808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TrystBeautyResult_9808> parser() {
         return PARSER;
      }

      public Parser<S2C_TrystBeautyResult_9808> getParserForType() {
         return PARSER;
      }

      public S2C_TrystBeautyResult_9808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TrystBeautyResult_9808OrBuilder {
         private int bitField0_;
         private int beautyId_;
         private TrystExpInfo expInfos_;
         private SingleFieldBuilderV3<TrystExpInfo, TrystExpInfo.Builder, TrystExpInfoOrBuilder> expInfosBuilder_;
         private BeautyTrystInfo trystInfos_;
         private SingleFieldBuilderV3<BeautyTrystInfo, BeautyTrystInfo.Builder, BeautyTrystInfoOrBuilder> trystInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TrystBeautyResult_9808.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_TrystBeautyResult_9808.alwaysUseFieldBuilders) {
               this.getExpInfosFieldBuilder();
               this.getTrystInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            if (this.expInfosBuilder_ == null) {
               this.expInfos_ = null;
            } else {
               this.expInfosBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.trystInfosBuilder_ == null) {
               this.trystInfos_ = null;
            } else {
               this.trystInfosBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_TrystBeautyResult_9808_descriptor;
         }

         public S2C_TrystBeautyResult_9808 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_TrystBeautyResult_9808.getDefaultInstance();
         }

         public S2C_TrystBeautyResult_9808 build() {
            S2C_TrystBeautyResult_9808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TrystBeautyResult_9808 buildPartial() {
            S2C_TrystBeautyResult_9808 result = new S2C_TrystBeautyResult_9808(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.expInfosBuilder_ == null) {
                  result.expInfos_ = this.expInfos_;
               } else {
                  result.expInfos_ = (TrystExpInfo)this.expInfosBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.trystInfosBuilder_ == null) {
                  result.trystInfos_ = this.trystInfos_;
               } else {
                  result.trystInfos_ = (BeautyTrystInfo)this.trystInfosBuilder_.build();
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
            if (other instanceof S2C_TrystBeautyResult_9808) {
               return this.mergeFrom((S2C_TrystBeautyResult_9808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TrystBeautyResult_9808 other) {
            if (other == TongqueTerraceMsg.S2C_TrystBeautyResult_9808.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               if (other.hasExpInfos()) {
                  this.mergeExpInfos(other.getExpInfos());
               }

               if (other.hasTrystInfos()) {
                  this.mergeTrystInfos(other.getTrystInfos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeautyId()) {
               return false;
            } else if (!this.hasExpInfos()) {
               return false;
            } else if (!this.hasTrystInfos()) {
               return false;
            } else if (!this.getExpInfos().isInitialized()) {
               return false;
            } else {
               return this.getTrystInfos().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TrystBeautyResult_9808 parsedMessage = null;

            try {
               parsedMessage = (S2C_TrystBeautyResult_9808)TongqueTerraceMsg.S2C_TrystBeautyResult_9808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TrystBeautyResult_9808)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExpInfos() {
            return (this.bitField0_ & 2) != 0;
         }

         public TrystExpInfo getExpInfos() {
            if (this.expInfosBuilder_ == null) {
               return this.expInfos_ == null ? TongqueTerraceMsg.TrystExpInfo.getDefaultInstance() : this.expInfos_;
            } else {
               return (TrystExpInfo)this.expInfosBuilder_.getMessage();
            }
         }

         public Builder setExpInfos(TrystExpInfo value) {
            if (this.expInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.expInfos_ = value;
               this.onChanged();
            } else {
               this.expInfosBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setExpInfos(TrystExpInfo.Builder builderForValue) {
            if (this.expInfosBuilder_ == null) {
               this.expInfos_ = builderForValue.build();
               this.onChanged();
            } else {
               this.expInfosBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeExpInfos(TrystExpInfo value) {
            if (this.expInfosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.expInfos_ != null && this.expInfos_ != TongqueTerraceMsg.TrystExpInfo.getDefaultInstance()) {
                  this.expInfos_ = TongqueTerraceMsg.TrystExpInfo.newBuilder(this.expInfos_).mergeFrom(value).buildPartial();
               } else {
                  this.expInfos_ = value;
               }

               this.onChanged();
            } else {
               this.expInfosBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearExpInfos() {
            if (this.expInfosBuilder_ == null) {
               this.expInfos_ = null;
               this.onChanged();
            } else {
               this.expInfosBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public TrystExpInfo.Builder getExpInfosBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (TrystExpInfo.Builder)this.getExpInfosFieldBuilder().getBuilder();
         }

         public TrystExpInfoOrBuilder getExpInfosOrBuilder() {
            if (this.expInfosBuilder_ != null) {
               return (TrystExpInfoOrBuilder)this.expInfosBuilder_.getMessageOrBuilder();
            } else {
               return this.expInfos_ == null ? TongqueTerraceMsg.TrystExpInfo.getDefaultInstance() : this.expInfos_;
            }
         }

         private SingleFieldBuilderV3<TrystExpInfo, TrystExpInfo.Builder, TrystExpInfoOrBuilder> getExpInfosFieldBuilder() {
            if (this.expInfosBuilder_ == null) {
               this.expInfosBuilder_ = new SingleFieldBuilderV3(this.getExpInfos(), this.getParentForChildren(), this.isClean());
               this.expInfos_ = null;
            }

            return this.expInfosBuilder_;
         }

         public boolean hasTrystInfos() {
            return (this.bitField0_ & 4) != 0;
         }

         public BeautyTrystInfo getTrystInfos() {
            if (this.trystInfosBuilder_ == null) {
               return this.trystInfos_ == null ? TongqueTerraceMsg.BeautyTrystInfo.getDefaultInstance() : this.trystInfos_;
            } else {
               return (BeautyTrystInfo)this.trystInfosBuilder_.getMessage();
            }
         }

         public Builder setTrystInfos(BeautyTrystInfo value) {
            if (this.trystInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.trystInfos_ = value;
               this.onChanged();
            } else {
               this.trystInfosBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setTrystInfos(BeautyTrystInfo.Builder builderForValue) {
            if (this.trystInfosBuilder_ == null) {
               this.trystInfos_ = builderForValue.build();
               this.onChanged();
            } else {
               this.trystInfosBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeTrystInfos(BeautyTrystInfo value) {
            if (this.trystInfosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.trystInfos_ != null && this.trystInfos_ != TongqueTerraceMsg.BeautyTrystInfo.getDefaultInstance()) {
                  this.trystInfos_ = TongqueTerraceMsg.BeautyTrystInfo.newBuilder(this.trystInfos_).mergeFrom(value).buildPartial();
               } else {
                  this.trystInfos_ = value;
               }

               this.onChanged();
            } else {
               this.trystInfosBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearTrystInfos() {
            if (this.trystInfosBuilder_ == null) {
               this.trystInfos_ = null;
               this.onChanged();
            } else {
               this.trystInfosBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public BeautyTrystInfo.Builder getTrystInfosBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (BeautyTrystInfo.Builder)this.getTrystInfosFieldBuilder().getBuilder();
         }

         public BeautyTrystInfoOrBuilder getTrystInfosOrBuilder() {
            if (this.trystInfosBuilder_ != null) {
               return (BeautyTrystInfoOrBuilder)this.trystInfosBuilder_.getMessageOrBuilder();
            } else {
               return this.trystInfos_ == null ? TongqueTerraceMsg.BeautyTrystInfo.getDefaultInstance() : this.trystInfos_;
            }
         }

         private SingleFieldBuilderV3<BeautyTrystInfo, BeautyTrystInfo.Builder, BeautyTrystInfoOrBuilder> getTrystInfosFieldBuilder() {
            if (this.trystInfosBuilder_ == null) {
               this.trystInfosBuilder_ = new SingleFieldBuilderV3(this.getTrystInfos(), this.getParentForChildren(), this.isClean());
               this.trystInfos_ = null;
            }

            return this.trystInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_BestowBeauty_9811 extends GeneratedMessageV3 implements C2S_BestowBeauty_9811OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_BestowBeauty_9811 DEFAULT_INSTANCE = new C2S_BestowBeauty_9811();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BestowBeauty_9811> PARSER = new AbstractParser<C2S_BestowBeauty_9811>() {
         public C2S_BestowBeauty_9811 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BestowBeauty_9811(input, extensionRegistry);
         }
      };

      private C2S_BestowBeauty_9811(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BestowBeauty_9811() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BestowBeauty_9811();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BestowBeauty_9811(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BestowBeauty_9811.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.beautyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BestowBeauty_9811)) {
            return super.equals(obj);
         } else {
            C2S_BestowBeauty_9811 other = (C2S_BestowBeauty_9811)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BestowBeauty_9811 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BestowBeauty_9811)PARSER.parseFrom(data);
      }

      public static C2S_BestowBeauty_9811 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BestowBeauty_9811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BestowBeauty_9811 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BestowBeauty_9811)PARSER.parseFrom(data);
      }

      public static C2S_BestowBeauty_9811 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BestowBeauty_9811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BestowBeauty_9811 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BestowBeauty_9811)PARSER.parseFrom(data);
      }

      public static C2S_BestowBeauty_9811 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BestowBeauty_9811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BestowBeauty_9811 parseFrom(InputStream input) throws IOException {
         return (C2S_BestowBeauty_9811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BestowBeauty_9811 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BestowBeauty_9811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BestowBeauty_9811 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BestowBeauty_9811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BestowBeauty_9811 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BestowBeauty_9811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BestowBeauty_9811 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BestowBeauty_9811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BestowBeauty_9811 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BestowBeauty_9811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BestowBeauty_9811 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BestowBeauty_9811 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BestowBeauty_9811> parser() {
         return PARSER;
      }

      public Parser<C2S_BestowBeauty_9811> getParserForType() {
         return PARSER;
      }

      public C2S_BestowBeauty_9811 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BestowBeauty_9811OrBuilder {
         private int bitField0_;
         private int beautyId_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BestowBeauty_9811.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_BestowBeauty_9811.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_BestowBeauty_9811_descriptor;
         }

         public C2S_BestowBeauty_9811 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_BestowBeauty_9811.getDefaultInstance();
         }

         public C2S_BestowBeauty_9811 build() {
            C2S_BestowBeauty_9811 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BestowBeauty_9811 buildPartial() {
            C2S_BestowBeauty_9811 result = new C2S_BestowBeauty_9811(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_BestowBeauty_9811) {
               return this.mergeFrom((C2S_BestowBeauty_9811)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BestowBeauty_9811 other) {
            if (other == TongqueTerraceMsg.C2S_BestowBeauty_9811.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeautyId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BestowBeauty_9811 parsedMessage = null;

            try {
               parsedMessage = (C2S_BestowBeauty_9811)TongqueTerraceMsg.C2S_BestowBeauty_9811.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BestowBeauty_9811)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
            this.num_ = 0;
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

   public static final class S2C_BestowBeautyResult_9812 extends GeneratedMessageV3 implements S2C_BestowBeautyResult_9812OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      public static final int ADDBESTOWPROPERTYS_FIELD_NUMBER = 3;
      private List<CommonMsg.PropertyInfo> addBestowPropertys_;
      private byte memoizedIsInitialized;
      private static final S2C_BestowBeautyResult_9812 DEFAULT_INSTANCE = new S2C_BestowBeautyResult_9812();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BestowBeautyResult_9812> PARSER = new AbstractParser<S2C_BestowBeautyResult_9812>() {
         public S2C_BestowBeautyResult_9812 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BestowBeautyResult_9812(input, extensionRegistry);
         }
      };

      private S2C_BestowBeautyResult_9812(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BestowBeautyResult_9812() {
         this.memoizedIsInitialized = -1;
         this.addBestowPropertys_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BestowBeautyResult_9812();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BestowBeautyResult_9812(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.num_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.addBestowPropertys_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.addBestowPropertys_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.addBestowPropertys_ = Collections.unmodifiableList(this.addBestowPropertys_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BestowBeautyResult_9812.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public boolean hasNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public List<CommonMsg.PropertyInfo> getAddBestowPropertysList() {
         return this.addBestowPropertys_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getAddBestowPropertysOrBuilderList() {
         return this.addBestowPropertys_;
      }

      public int getAddBestowPropertysCount() {
         return this.addBestowPropertys_.size();
      }

      public CommonMsg.PropertyInfo getAddBestowPropertys(int index) {
         return (CommonMsg.PropertyInfo)this.addBestowPropertys_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getAddBestowPropertysOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.addBestowPropertys_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAddBestowPropertysCount(); ++i) {
               if (!this.getAddBestowPropertys(i).isInitialized()) {
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
            output.writeInt32(1, this.beautyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.num_);
         }

         for(int i = 0; i < this.addBestowPropertys_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.addBestowPropertys_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.num_);
            }

            for(int i = 0; i < this.addBestowPropertys_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.addBestowPropertys_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BestowBeautyResult_9812)) {
            return super.equals(obj);
         } else {
            S2C_BestowBeautyResult_9812 other = (S2C_BestowBeautyResult_9812)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
               return false;
            } else if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (!this.getAddBestowPropertysList().equals(other.getAddBestowPropertysList())) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            if (this.hasNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNum();
            }

            if (this.getAddBestowPropertysCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAddBestowPropertysList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BestowBeautyResult_9812)PARSER.parseFrom(data);
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BestowBeautyResult_9812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BestowBeautyResult_9812)PARSER.parseFrom(data);
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BestowBeautyResult_9812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BestowBeautyResult_9812)PARSER.parseFrom(data);
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BestowBeautyResult_9812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(InputStream input) throws IOException {
         return (S2C_BestowBeautyResult_9812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BestowBeautyResult_9812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BestowBeautyResult_9812 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BestowBeautyResult_9812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BestowBeautyResult_9812 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BestowBeautyResult_9812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BestowBeautyResult_9812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BestowBeautyResult_9812 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BestowBeautyResult_9812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BestowBeautyResult_9812 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BestowBeautyResult_9812 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BestowBeautyResult_9812> parser() {
         return PARSER;
      }

      public Parser<S2C_BestowBeautyResult_9812> getParserForType() {
         return PARSER;
      }

      public S2C_BestowBeautyResult_9812 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BestowBeautyResult_9812OrBuilder {
         private int bitField0_;
         private int beautyId_;
         private int num_;
         private List<CommonMsg.PropertyInfo> addBestowPropertys_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> addBestowPropertysBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BestowBeautyResult_9812.class, Builder.class);
         }

         private Builder() {
            this.addBestowPropertys_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.addBestowPropertys_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_BestowBeautyResult_9812.alwaysUseFieldBuilders) {
               this.getAddBestowPropertysFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            if (this.addBestowPropertysBuilder_ == null) {
               this.addBestowPropertys_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.addBestowPropertysBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_BestowBeautyResult_9812_descriptor;
         }

         public S2C_BestowBeautyResult_9812 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_BestowBeautyResult_9812.getDefaultInstance();
         }

         public S2C_BestowBeautyResult_9812 build() {
            S2C_BestowBeautyResult_9812 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BestowBeautyResult_9812 buildPartial() {
            S2C_BestowBeautyResult_9812 result = new S2C_BestowBeautyResult_9812(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 2;
            }

            if (this.addBestowPropertysBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.addBestowPropertys_ = Collections.unmodifiableList(this.addBestowPropertys_);
                  this.bitField0_ &= -5;
               }

               result.addBestowPropertys_ = this.addBestowPropertys_;
            } else {
               result.addBestowPropertys_ = this.addBestowPropertysBuilder_.build();
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
            if (other instanceof S2C_BestowBeautyResult_9812) {
               return this.mergeFrom((S2C_BestowBeautyResult_9812)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BestowBeautyResult_9812 other) {
            if (other == TongqueTerraceMsg.S2C_BestowBeautyResult_9812.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (this.addBestowPropertysBuilder_ == null) {
                  if (!other.addBestowPropertys_.isEmpty()) {
                     if (this.addBestowPropertys_.isEmpty()) {
                        this.addBestowPropertys_ = other.addBestowPropertys_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureAddBestowPropertysIsMutable();
                        this.addBestowPropertys_.addAll(other.addBestowPropertys_);
                     }

                     this.onChanged();
                  }
               } else if (!other.addBestowPropertys_.isEmpty()) {
                  if (this.addBestowPropertysBuilder_.isEmpty()) {
                     this.addBestowPropertysBuilder_.dispose();
                     this.addBestowPropertysBuilder_ = null;
                     this.addBestowPropertys_ = other.addBestowPropertys_;
                     this.bitField0_ &= -5;
                     this.addBestowPropertysBuilder_ = TongqueTerraceMsg.S2C_BestowBeautyResult_9812.alwaysUseFieldBuilders ? this.getAddBestowPropertysFieldBuilder() : null;
                  } else {
                     this.addBestowPropertysBuilder_.addAllMessages(other.addBestowPropertys_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeautyId()) {
               return false;
            } else if (!this.hasNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getAddBestowPropertysCount(); ++i) {
                  if (!this.getAddBestowPropertys(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BestowBeautyResult_9812 parsedMessage = null;

            try {
               parsedMessage = (S2C_BestowBeautyResult_9812)TongqueTerraceMsg.S2C_BestowBeautyResult_9812.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BestowBeautyResult_9812)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 2;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -3;
            this.num_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAddBestowPropertysIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.addBestowPropertys_ = new ArrayList(this.addBestowPropertys_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.PropertyInfo> getAddBestowPropertysList() {
            return this.addBestowPropertysBuilder_ == null ? Collections.unmodifiableList(this.addBestowPropertys_) : this.addBestowPropertysBuilder_.getMessageList();
         }

         public int getAddBestowPropertysCount() {
            return this.addBestowPropertysBuilder_ == null ? this.addBestowPropertys_.size() : this.addBestowPropertysBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getAddBestowPropertys(int index) {
            return this.addBestowPropertysBuilder_ == null ? (CommonMsg.PropertyInfo)this.addBestowPropertys_.get(index) : (CommonMsg.PropertyInfo)this.addBestowPropertysBuilder_.getMessage(index);
         }

         public Builder setAddBestowPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.addBestowPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAddBestowPropertysIsMutable();
               this.addBestowPropertys_.set(index, value);
               this.onChanged();
            } else {
               this.addBestowPropertysBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAddBestowPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.addBestowPropertysBuilder_ == null) {
               this.ensureAddBestowPropertysIsMutable();
               this.addBestowPropertys_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.addBestowPropertysBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAddBestowPropertys(CommonMsg.PropertyInfo value) {
            if (this.addBestowPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAddBestowPropertysIsMutable();
               this.addBestowPropertys_.add(value);
               this.onChanged();
            } else {
               this.addBestowPropertysBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAddBestowPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.addBestowPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAddBestowPropertysIsMutable();
               this.addBestowPropertys_.add(index, value);
               this.onChanged();
            } else {
               this.addBestowPropertysBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAddBestowPropertys(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.addBestowPropertysBuilder_ == null) {
               this.ensureAddBestowPropertysIsMutable();
               this.addBestowPropertys_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.addBestowPropertysBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAddBestowPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.addBestowPropertysBuilder_ == null) {
               this.ensureAddBestowPropertysIsMutable();
               this.addBestowPropertys_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.addBestowPropertysBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAddBestowPropertys(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.addBestowPropertysBuilder_ == null) {
               this.ensureAddBestowPropertysIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.addBestowPropertys_);
               this.onChanged();
            } else {
               this.addBestowPropertysBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAddBestowPropertys() {
            if (this.addBestowPropertysBuilder_ == null) {
               this.addBestowPropertys_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.addBestowPropertysBuilder_.clear();
            }

            return this;
         }

         public Builder removeAddBestowPropertys(int index) {
            if (this.addBestowPropertysBuilder_ == null) {
               this.ensureAddBestowPropertysIsMutable();
               this.addBestowPropertys_.remove(index);
               this.onChanged();
            } else {
               this.addBestowPropertysBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getAddBestowPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getAddBestowPropertysFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getAddBestowPropertysOrBuilder(int index) {
            return this.addBestowPropertysBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.addBestowPropertys_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.addBestowPropertysBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getAddBestowPropertysOrBuilderList() {
            return this.addBestowPropertysBuilder_ != null ? this.addBestowPropertysBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.addBestowPropertys_);
         }

         public CommonMsg.PropertyInfo.Builder addAddBestowPropertysBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getAddBestowPropertysFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addAddBestowPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getAddBestowPropertysFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getAddBestowPropertysBuilderList() {
            return this.getAddBestowPropertysFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getAddBestowPropertysFieldBuilder() {
            if (this.addBestowPropertysBuilder_ == null) {
               this.addBestowPropertysBuilder_ = new RepeatedFieldBuilderV3(this.addBestowPropertys_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.addBestowPropertys_ = null;
            }

            return this.addBestowPropertysBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SkillUpBeauty_9813 extends GeneratedMessageV3 implements C2S_SkillUpBeauty_9813OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      private byte memoizedIsInitialized;
      private static final C2S_SkillUpBeauty_9813 DEFAULT_INSTANCE = new C2S_SkillUpBeauty_9813();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SkillUpBeauty_9813> PARSER = new AbstractParser<C2S_SkillUpBeauty_9813>() {
         public C2S_SkillUpBeauty_9813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SkillUpBeauty_9813(input, extensionRegistry);
         }
      };

      private C2S_SkillUpBeauty_9813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SkillUpBeauty_9813() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SkillUpBeauty_9813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SkillUpBeauty_9813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkillUpBeauty_9813.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.beautyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SkillUpBeauty_9813)) {
            return super.equals(obj);
         } else {
            C2S_SkillUpBeauty_9813 other = (C2S_SkillUpBeauty_9813)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SkillUpBeauty_9813)PARSER.parseFrom(data);
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkillUpBeauty_9813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SkillUpBeauty_9813)PARSER.parseFrom(data);
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkillUpBeauty_9813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SkillUpBeauty_9813)PARSER.parseFrom(data);
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkillUpBeauty_9813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(InputStream input) throws IOException {
         return (C2S_SkillUpBeauty_9813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkillUpBeauty_9813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkillUpBeauty_9813 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SkillUpBeauty_9813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SkillUpBeauty_9813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkillUpBeauty_9813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SkillUpBeauty_9813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkillUpBeauty_9813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkillUpBeauty_9813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SkillUpBeauty_9813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SkillUpBeauty_9813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SkillUpBeauty_9813> parser() {
         return PARSER;
      }

      public Parser<C2S_SkillUpBeauty_9813> getParserForType() {
         return PARSER;
      }

      public C2S_SkillUpBeauty_9813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SkillUpBeauty_9813OrBuilder {
         private int bitField0_;
         private int beautyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkillUpBeauty_9813.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_SkillUpBeauty_9813.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SkillUpBeauty_9813_descriptor;
         }

         public C2S_SkillUpBeauty_9813 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_SkillUpBeauty_9813.getDefaultInstance();
         }

         public C2S_SkillUpBeauty_9813 build() {
            C2S_SkillUpBeauty_9813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SkillUpBeauty_9813 buildPartial() {
            C2S_SkillUpBeauty_9813 result = new C2S_SkillUpBeauty_9813(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
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
            if (other instanceof C2S_SkillUpBeauty_9813) {
               return this.mergeFrom((C2S_SkillUpBeauty_9813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SkillUpBeauty_9813 other) {
            if (other == TongqueTerraceMsg.C2S_SkillUpBeauty_9813.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBeautyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SkillUpBeauty_9813 parsedMessage = null;

            try {
               parsedMessage = (C2S_SkillUpBeauty_9813)TongqueTerraceMsg.C2S_SkillUpBeauty_9813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SkillUpBeauty_9813)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
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

   public static final class S2C_SkillUpBeautyResult_9814 extends GeneratedMessageV3 implements S2C_SkillUpBeautyResult_9814OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      public static final int SKILLID_FIELD_NUMBER = 3;
      private int skillId_;
      public static final int ASSISTANTSKILL_FIELD_NUMBER = 4;
      private int assistantSkill_;
      private byte memoizedIsInitialized;
      private static final S2C_SkillUpBeautyResult_9814 DEFAULT_INSTANCE = new S2C_SkillUpBeautyResult_9814();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SkillUpBeautyResult_9814> PARSER = new AbstractParser<S2C_SkillUpBeautyResult_9814>() {
         public S2C_SkillUpBeautyResult_9814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SkillUpBeautyResult_9814(input, extensionRegistry);
         }
      };

      private S2C_SkillUpBeautyResult_9814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SkillUpBeautyResult_9814() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SkillUpBeautyResult_9814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SkillUpBeautyResult_9814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.skillId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.assistantSkill_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkillUpBeautyResult_9814.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
      }

      public boolean hasAssistantSkill() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAssistantSkill() {
         return this.assistantSkill_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.beautyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.skillId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.assistantSkill_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.skillId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.assistantSkill_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SkillUpBeautyResult_9814)) {
            return super.equals(obj);
         } else {
            S2C_SkillUpBeautyResult_9814 other = (S2C_SkillUpBeautyResult_9814)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
               return false;
            } else if (this.hasAssistantSkill() != other.hasAssistantSkill()) {
               return false;
            } else if (this.hasAssistantSkill() && this.getAssistantSkill() != other.getAssistantSkill()) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            if (this.hasSkillId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSkillId();
            }

            if (this.hasAssistantSkill()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getAssistantSkill();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SkillUpBeautyResult_9814)PARSER.parseFrom(data);
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkillUpBeautyResult_9814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SkillUpBeautyResult_9814)PARSER.parseFrom(data);
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkillUpBeautyResult_9814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SkillUpBeautyResult_9814)PARSER.parseFrom(data);
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkillUpBeautyResult_9814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(InputStream input) throws IOException {
         return (S2C_SkillUpBeautyResult_9814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkillUpBeautyResult_9814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkillUpBeautyResult_9814 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SkillUpBeautyResult_9814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SkillUpBeautyResult_9814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkillUpBeautyResult_9814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SkillUpBeautyResult_9814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkillUpBeautyResult_9814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkillUpBeautyResult_9814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SkillUpBeautyResult_9814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SkillUpBeautyResult_9814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SkillUpBeautyResult_9814> parser() {
         return PARSER;
      }

      public Parser<S2C_SkillUpBeautyResult_9814> getParserForType() {
         return PARSER;
      }

      public S2C_SkillUpBeautyResult_9814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SkillUpBeautyResult_9814OrBuilder {
         private int bitField0_;
         private int beautyId_;
         private int skillId_;
         private int assistantSkill_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkillUpBeautyResult_9814.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_SkillUpBeautyResult_9814.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            this.skillId_ = 0;
            this.bitField0_ &= -3;
            this.assistantSkill_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SkillUpBeautyResult_9814_descriptor;
         }

         public S2C_SkillUpBeautyResult_9814 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_SkillUpBeautyResult_9814.getDefaultInstance();
         }

         public S2C_SkillUpBeautyResult_9814 build() {
            S2C_SkillUpBeautyResult_9814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SkillUpBeautyResult_9814 buildPartial() {
            S2C_SkillUpBeautyResult_9814 result = new S2C_SkillUpBeautyResult_9814(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.skillId_ = this.skillId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.assistantSkill_ = this.assistantSkill_;
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
            if (other instanceof S2C_SkillUpBeautyResult_9814) {
               return this.mergeFrom((S2C_SkillUpBeautyResult_9814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SkillUpBeautyResult_9814 other) {
            if (other == TongqueTerraceMsg.S2C_SkillUpBeautyResult_9814.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               if (other.hasAssistantSkill()) {
                  this.setAssistantSkill(other.getAssistantSkill());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeautyId()) {
               return false;
            } else {
               return this.hasSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SkillUpBeautyResult_9814 parsedMessage = null;

            try {
               parsedMessage = (S2C_SkillUpBeautyResult_9814)TongqueTerraceMsg.S2C_SkillUpBeautyResult_9814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SkillUpBeautyResult_9814)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 2;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -3;
            this.skillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAssistantSkill() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAssistantSkill() {
            return this.assistantSkill_;
         }

         public Builder setAssistantSkill(int value) {
            this.bitField0_ |= 4;
            this.assistantSkill_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAssistantSkill() {
            this.bitField0_ &= -5;
            this.assistantSkill_ = 0;
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

   public static final class C2S_PatronizeBeauty_9815 extends GeneratedMessageV3 implements C2S_PatronizeBeauty_9815OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      private byte memoizedIsInitialized;
      private static final C2S_PatronizeBeauty_9815 DEFAULT_INSTANCE = new C2S_PatronizeBeauty_9815();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PatronizeBeauty_9815> PARSER = new AbstractParser<C2S_PatronizeBeauty_9815>() {
         public C2S_PatronizeBeauty_9815 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PatronizeBeauty_9815(input, extensionRegistry);
         }
      };

      private C2S_PatronizeBeauty_9815(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PatronizeBeauty_9815() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PatronizeBeauty_9815();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PatronizeBeauty_9815(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PatronizeBeauty_9815.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.beautyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PatronizeBeauty_9815)) {
            return super.equals(obj);
         } else {
            C2S_PatronizeBeauty_9815 other = (C2S_PatronizeBeauty_9815)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PatronizeBeauty_9815)PARSER.parseFrom(data);
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PatronizeBeauty_9815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PatronizeBeauty_9815)PARSER.parseFrom(data);
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PatronizeBeauty_9815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PatronizeBeauty_9815)PARSER.parseFrom(data);
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PatronizeBeauty_9815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(InputStream input) throws IOException {
         return (C2S_PatronizeBeauty_9815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PatronizeBeauty_9815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PatronizeBeauty_9815 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PatronizeBeauty_9815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PatronizeBeauty_9815 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PatronizeBeauty_9815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PatronizeBeauty_9815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PatronizeBeauty_9815 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PatronizeBeauty_9815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PatronizeBeauty_9815 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PatronizeBeauty_9815 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PatronizeBeauty_9815> parser() {
         return PARSER;
      }

      public Parser<C2S_PatronizeBeauty_9815> getParserForType() {
         return PARSER;
      }

      public C2S_PatronizeBeauty_9815 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PatronizeBeauty_9815OrBuilder {
         private int bitField0_;
         private int beautyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PatronizeBeauty_9815.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_PatronizeBeauty_9815.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PatronizeBeauty_9815_descriptor;
         }

         public C2S_PatronizeBeauty_9815 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_PatronizeBeauty_9815.getDefaultInstance();
         }

         public C2S_PatronizeBeauty_9815 build() {
            C2S_PatronizeBeauty_9815 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PatronizeBeauty_9815 buildPartial() {
            C2S_PatronizeBeauty_9815 result = new C2S_PatronizeBeauty_9815(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
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
            if (other instanceof C2S_PatronizeBeauty_9815) {
               return this.mergeFrom((C2S_PatronizeBeauty_9815)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PatronizeBeauty_9815 other) {
            if (other == TongqueTerraceMsg.C2S_PatronizeBeauty_9815.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBeautyId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PatronizeBeauty_9815 parsedMessage = null;

            try {
               parsedMessage = (C2S_PatronizeBeauty_9815)TongqueTerraceMsg.C2S_PatronizeBeauty_9815.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PatronizeBeauty_9815)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
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

   public static final class S2C_PatronizeBeautyResult_9816 extends GeneratedMessageV3 implements S2C_PatronizeBeautyResult_9816OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      public static final int PATRONIZELV_FIELD_NUMBER = 2;
      private int patronizeLv_;
      public static final int ADDPATRONIZEPROPERTY_FIELD_NUMBER = 3;
      private List<CommonMsg.PropertyInfo> addPatronizeProperty_;
      private byte memoizedIsInitialized;
      private static final S2C_PatronizeBeautyResult_9816 DEFAULT_INSTANCE = new S2C_PatronizeBeautyResult_9816();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PatronizeBeautyResult_9816> PARSER = new AbstractParser<S2C_PatronizeBeautyResult_9816>() {
         public S2C_PatronizeBeautyResult_9816 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PatronizeBeautyResult_9816(input, extensionRegistry);
         }
      };

      private S2C_PatronizeBeautyResult_9816(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PatronizeBeautyResult_9816() {
         this.memoizedIsInitialized = -1;
         this.addPatronizeProperty_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PatronizeBeautyResult_9816();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PatronizeBeautyResult_9816(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.patronizeLv_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.addPatronizeProperty_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.addPatronizeProperty_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.addPatronizeProperty_ = Collections.unmodifiableList(this.addPatronizeProperty_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PatronizeBeautyResult_9816.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public boolean hasPatronizeLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPatronizeLv() {
         return this.patronizeLv_;
      }

      public List<CommonMsg.PropertyInfo> getAddPatronizePropertyList() {
         return this.addPatronizeProperty_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getAddPatronizePropertyOrBuilderList() {
         return this.addPatronizeProperty_;
      }

      public int getAddPatronizePropertyCount() {
         return this.addPatronizeProperty_.size();
      }

      public CommonMsg.PropertyInfo getAddPatronizeProperty(int index) {
         return (CommonMsg.PropertyInfo)this.addPatronizeProperty_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getAddPatronizePropertyOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.addPatronizeProperty_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPatronizeLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAddPatronizePropertyCount(); ++i) {
               if (!this.getAddPatronizeProperty(i).isInitialized()) {
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
            output.writeInt32(1, this.beautyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.patronizeLv_);
         }

         for(int i = 0; i < this.addPatronizeProperty_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.addPatronizeProperty_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.patronizeLv_);
            }

            for(int i = 0; i < this.addPatronizeProperty_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.addPatronizeProperty_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PatronizeBeautyResult_9816)) {
            return super.equals(obj);
         } else {
            S2C_PatronizeBeautyResult_9816 other = (S2C_PatronizeBeautyResult_9816)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
               return false;
            } else if (this.hasPatronizeLv() != other.hasPatronizeLv()) {
               return false;
            } else if (this.hasPatronizeLv() && this.getPatronizeLv() != other.getPatronizeLv()) {
               return false;
            } else if (!this.getAddPatronizePropertyList().equals(other.getAddPatronizePropertyList())) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            if (this.hasPatronizeLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPatronizeLv();
            }

            if (this.getAddPatronizePropertyCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAddPatronizePropertyList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PatronizeBeautyResult_9816)PARSER.parseFrom(data);
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PatronizeBeautyResult_9816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PatronizeBeautyResult_9816)PARSER.parseFrom(data);
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PatronizeBeautyResult_9816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PatronizeBeautyResult_9816)PARSER.parseFrom(data);
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PatronizeBeautyResult_9816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(InputStream input) throws IOException {
         return (S2C_PatronizeBeautyResult_9816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PatronizeBeautyResult_9816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PatronizeBeautyResult_9816 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PatronizeBeautyResult_9816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PatronizeBeautyResult_9816 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PatronizeBeautyResult_9816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PatronizeBeautyResult_9816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PatronizeBeautyResult_9816 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PatronizeBeautyResult_9816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PatronizeBeautyResult_9816 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PatronizeBeautyResult_9816 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PatronizeBeautyResult_9816> parser() {
         return PARSER;
      }

      public Parser<S2C_PatronizeBeautyResult_9816> getParserForType() {
         return PARSER;
      }

      public S2C_PatronizeBeautyResult_9816 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PatronizeBeautyResult_9816OrBuilder {
         private int bitField0_;
         private int beautyId_;
         private int patronizeLv_;
         private List<CommonMsg.PropertyInfo> addPatronizeProperty_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> addPatronizePropertyBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PatronizeBeautyResult_9816.class, Builder.class);
         }

         private Builder() {
            this.addPatronizeProperty_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.addPatronizeProperty_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_PatronizeBeautyResult_9816.alwaysUseFieldBuilders) {
               this.getAddPatronizePropertyFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            this.patronizeLv_ = 0;
            this.bitField0_ &= -3;
            if (this.addPatronizePropertyBuilder_ == null) {
               this.addPatronizeProperty_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.addPatronizePropertyBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PatronizeBeautyResult_9816_descriptor;
         }

         public S2C_PatronizeBeautyResult_9816 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_PatronizeBeautyResult_9816.getDefaultInstance();
         }

         public S2C_PatronizeBeautyResult_9816 build() {
            S2C_PatronizeBeautyResult_9816 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PatronizeBeautyResult_9816 buildPartial() {
            S2C_PatronizeBeautyResult_9816 result = new S2C_PatronizeBeautyResult_9816(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.patronizeLv_ = this.patronizeLv_;
               to_bitField0_ |= 2;
            }

            if (this.addPatronizePropertyBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.addPatronizeProperty_ = Collections.unmodifiableList(this.addPatronizeProperty_);
                  this.bitField0_ &= -5;
               }

               result.addPatronizeProperty_ = this.addPatronizeProperty_;
            } else {
               result.addPatronizeProperty_ = this.addPatronizePropertyBuilder_.build();
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
            if (other instanceof S2C_PatronizeBeautyResult_9816) {
               return this.mergeFrom((S2C_PatronizeBeautyResult_9816)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PatronizeBeautyResult_9816 other) {
            if (other == TongqueTerraceMsg.S2C_PatronizeBeautyResult_9816.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               if (other.hasPatronizeLv()) {
                  this.setPatronizeLv(other.getPatronizeLv());
               }

               if (this.addPatronizePropertyBuilder_ == null) {
                  if (!other.addPatronizeProperty_.isEmpty()) {
                     if (this.addPatronizeProperty_.isEmpty()) {
                        this.addPatronizeProperty_ = other.addPatronizeProperty_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureAddPatronizePropertyIsMutable();
                        this.addPatronizeProperty_.addAll(other.addPatronizeProperty_);
                     }

                     this.onChanged();
                  }
               } else if (!other.addPatronizeProperty_.isEmpty()) {
                  if (this.addPatronizePropertyBuilder_.isEmpty()) {
                     this.addPatronizePropertyBuilder_.dispose();
                     this.addPatronizePropertyBuilder_ = null;
                     this.addPatronizeProperty_ = other.addPatronizeProperty_;
                     this.bitField0_ &= -5;
                     this.addPatronizePropertyBuilder_ = TongqueTerraceMsg.S2C_PatronizeBeautyResult_9816.alwaysUseFieldBuilders ? this.getAddPatronizePropertyFieldBuilder() : null;
                  } else {
                     this.addPatronizePropertyBuilder_.addAllMessages(other.addPatronizeProperty_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeautyId()) {
               return false;
            } else if (!this.hasPatronizeLv()) {
               return false;
            } else {
               for(int i = 0; i < this.getAddPatronizePropertyCount(); ++i) {
                  if (!this.getAddPatronizeProperty(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PatronizeBeautyResult_9816 parsedMessage = null;

            try {
               parsedMessage = (S2C_PatronizeBeautyResult_9816)TongqueTerraceMsg.S2C_PatronizeBeautyResult_9816.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PatronizeBeautyResult_9816)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPatronizeLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPatronizeLv() {
            return this.patronizeLv_;
         }

         public Builder setPatronizeLv(int value) {
            this.bitField0_ |= 2;
            this.patronizeLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPatronizeLv() {
            this.bitField0_ &= -3;
            this.patronizeLv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAddPatronizePropertyIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.addPatronizeProperty_ = new ArrayList(this.addPatronizeProperty_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.PropertyInfo> getAddPatronizePropertyList() {
            return this.addPatronizePropertyBuilder_ == null ? Collections.unmodifiableList(this.addPatronizeProperty_) : this.addPatronizePropertyBuilder_.getMessageList();
         }

         public int getAddPatronizePropertyCount() {
            return this.addPatronizePropertyBuilder_ == null ? this.addPatronizeProperty_.size() : this.addPatronizePropertyBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getAddPatronizeProperty(int index) {
            return this.addPatronizePropertyBuilder_ == null ? (CommonMsg.PropertyInfo)this.addPatronizeProperty_.get(index) : (CommonMsg.PropertyInfo)this.addPatronizePropertyBuilder_.getMessage(index);
         }

         public Builder setAddPatronizeProperty(int index, CommonMsg.PropertyInfo value) {
            if (this.addPatronizePropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAddPatronizePropertyIsMutable();
               this.addPatronizeProperty_.set(index, value);
               this.onChanged();
            } else {
               this.addPatronizePropertyBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAddPatronizeProperty(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.addPatronizePropertyBuilder_ == null) {
               this.ensureAddPatronizePropertyIsMutable();
               this.addPatronizeProperty_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.addPatronizePropertyBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAddPatronizeProperty(CommonMsg.PropertyInfo value) {
            if (this.addPatronizePropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAddPatronizePropertyIsMutable();
               this.addPatronizeProperty_.add(value);
               this.onChanged();
            } else {
               this.addPatronizePropertyBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAddPatronizeProperty(int index, CommonMsg.PropertyInfo value) {
            if (this.addPatronizePropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAddPatronizePropertyIsMutable();
               this.addPatronizeProperty_.add(index, value);
               this.onChanged();
            } else {
               this.addPatronizePropertyBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAddPatronizeProperty(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.addPatronizePropertyBuilder_ == null) {
               this.ensureAddPatronizePropertyIsMutable();
               this.addPatronizeProperty_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.addPatronizePropertyBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAddPatronizeProperty(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.addPatronizePropertyBuilder_ == null) {
               this.ensureAddPatronizePropertyIsMutable();
               this.addPatronizeProperty_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.addPatronizePropertyBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAddPatronizeProperty(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.addPatronizePropertyBuilder_ == null) {
               this.ensureAddPatronizePropertyIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.addPatronizeProperty_);
               this.onChanged();
            } else {
               this.addPatronizePropertyBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAddPatronizeProperty() {
            if (this.addPatronizePropertyBuilder_ == null) {
               this.addPatronizeProperty_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.addPatronizePropertyBuilder_.clear();
            }

            return this;
         }

         public Builder removeAddPatronizeProperty(int index) {
            if (this.addPatronizePropertyBuilder_ == null) {
               this.ensureAddPatronizePropertyIsMutable();
               this.addPatronizeProperty_.remove(index);
               this.onChanged();
            } else {
               this.addPatronizePropertyBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getAddPatronizePropertyBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getAddPatronizePropertyFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getAddPatronizePropertyOrBuilder(int index) {
            return this.addPatronizePropertyBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.addPatronizeProperty_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.addPatronizePropertyBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getAddPatronizePropertyOrBuilderList() {
            return this.addPatronizePropertyBuilder_ != null ? this.addPatronizePropertyBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.addPatronizeProperty_);
         }

         public CommonMsg.PropertyInfo.Builder addAddPatronizePropertyBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getAddPatronizePropertyFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addAddPatronizePropertyBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getAddPatronizePropertyFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getAddPatronizePropertyBuilderList() {
            return this.getAddPatronizePropertyFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getAddPatronizePropertyFieldBuilder() {
            if (this.addPatronizePropertyBuilder_ == null) {
               this.addPatronizePropertyBuilder_ = new RepeatedFieldBuilderV3(this.addPatronizeProperty_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.addPatronizeProperty_ = null;
            }

            return this.addPatronizePropertyBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_UnlockBeauty_9821 extends GeneratedMessageV3 implements C2S_UnlockBeauty_9821OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      public static final int STEP_FIELD_NUMBER = 2;
      private int step_;
      private byte memoizedIsInitialized;
      private static final C2S_UnlockBeauty_9821 DEFAULT_INSTANCE = new C2S_UnlockBeauty_9821();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnlockBeauty_9821> PARSER = new AbstractParser<C2S_UnlockBeauty_9821>() {
         public C2S_UnlockBeauty_9821 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnlockBeauty_9821(input, extensionRegistry);
         }
      };

      private C2S_UnlockBeauty_9821(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnlockBeauty_9821() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnlockBeauty_9821();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnlockBeauty_9821(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.step_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockBeauty_9821.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public boolean hasStep() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStep() {
         return this.step_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStep()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.beautyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.step_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.step_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UnlockBeauty_9821)) {
            return super.equals(obj);
         } else {
            C2S_UnlockBeauty_9821 other = (C2S_UnlockBeauty_9821)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
               return false;
            } else if (this.hasStep() != other.hasStep()) {
               return false;
            } else if (this.hasStep() && this.getStep() != other.getStep()) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            if (this.hasStep()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UnlockBeauty_9821 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnlockBeauty_9821)PARSER.parseFrom(data);
      }

      public static C2S_UnlockBeauty_9821 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockBeauty_9821)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockBeauty_9821 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnlockBeauty_9821)PARSER.parseFrom(data);
      }

      public static C2S_UnlockBeauty_9821 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockBeauty_9821)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockBeauty_9821 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnlockBeauty_9821)PARSER.parseFrom(data);
      }

      public static C2S_UnlockBeauty_9821 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockBeauty_9821)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockBeauty_9821 parseFrom(InputStream input) throws IOException {
         return (C2S_UnlockBeauty_9821)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockBeauty_9821 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockBeauty_9821)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockBeauty_9821 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnlockBeauty_9821)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnlockBeauty_9821 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockBeauty_9821)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockBeauty_9821 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnlockBeauty_9821)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockBeauty_9821 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockBeauty_9821)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnlockBeauty_9821 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnlockBeauty_9821 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnlockBeauty_9821> parser() {
         return PARSER;
      }

      public Parser<C2S_UnlockBeauty_9821> getParserForType() {
         return PARSER;
      }

      public C2S_UnlockBeauty_9821 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnlockBeauty_9821OrBuilder {
         private int bitField0_;
         private int beautyId_;
         private int step_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockBeauty_9821.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_UnlockBeauty_9821.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            this.step_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_UnlockBeauty_9821_descriptor;
         }

         public C2S_UnlockBeauty_9821 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_UnlockBeauty_9821.getDefaultInstance();
         }

         public C2S_UnlockBeauty_9821 build() {
            C2S_UnlockBeauty_9821 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnlockBeauty_9821 buildPartial() {
            C2S_UnlockBeauty_9821 result = new C2S_UnlockBeauty_9821(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.step_ = this.step_;
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
            if (other instanceof C2S_UnlockBeauty_9821) {
               return this.mergeFrom((C2S_UnlockBeauty_9821)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnlockBeauty_9821 other) {
            if (other == TongqueTerraceMsg.C2S_UnlockBeauty_9821.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               if (other.hasStep()) {
                  this.setStep(other.getStep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeautyId()) {
               return false;
            } else {
               return this.hasStep();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UnlockBeauty_9821 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnlockBeauty_9821)TongqueTerraceMsg.C2S_UnlockBeauty_9821.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnlockBeauty_9821)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStep() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStep() {
            return this.step_;
         }

         public Builder setStep(int value) {
            this.bitField0_ |= 2;
            this.step_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStep() {
            this.bitField0_ &= -3;
            this.step_ = 0;
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

   public static final class S2C_UnlockBeautyResult_9822 extends GeneratedMessageV3 implements S2C_UnlockBeautyResult_9822OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private UnlockInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockBeautyResult_9822 DEFAULT_INSTANCE = new S2C_UnlockBeautyResult_9822();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockBeautyResult_9822> PARSER = new AbstractParser<S2C_UnlockBeautyResult_9822>() {
         public S2C_UnlockBeautyResult_9822 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockBeautyResult_9822(input, extensionRegistry);
         }
      };

      private S2C_UnlockBeautyResult_9822(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockBeautyResult_9822() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockBeautyResult_9822();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockBeautyResult_9822(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        UnlockInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (UnlockInfo)input.readMessage(TongqueTerraceMsg.UnlockInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockBeautyResult_9822.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public UnlockInfo getInfo() {
         return this.info_ == null ? TongqueTerraceMsg.UnlockInfo.getDefaultInstance() : this.info_;
      }

      public UnlockInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? TongqueTerraceMsg.UnlockInfo.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockBeautyResult_9822)) {
            return super.equals(obj);
         } else {
            S2C_UnlockBeautyResult_9822 other = (S2C_UnlockBeautyResult_9822)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
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
            if (this.hasInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockBeautyResult_9822)PARSER.parseFrom(data);
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockBeautyResult_9822)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockBeautyResult_9822)PARSER.parseFrom(data);
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockBeautyResult_9822)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockBeautyResult_9822)PARSER.parseFrom(data);
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockBeautyResult_9822)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockBeautyResult_9822)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockBeautyResult_9822)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockBeautyResult_9822 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockBeautyResult_9822)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockBeautyResult_9822 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockBeautyResult_9822)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockBeautyResult_9822)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockBeautyResult_9822 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockBeautyResult_9822)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockBeautyResult_9822 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockBeautyResult_9822 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockBeautyResult_9822> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockBeautyResult_9822> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockBeautyResult_9822 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockBeautyResult_9822OrBuilder {
         private int bitField0_;
         private UnlockInfo info_;
         private SingleFieldBuilderV3<UnlockInfo, UnlockInfo.Builder, UnlockInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockBeautyResult_9822.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_UnlockBeautyResult_9822.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_UnlockBeautyResult_9822_descriptor;
         }

         public S2C_UnlockBeautyResult_9822 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_UnlockBeautyResult_9822.getDefaultInstance();
         }

         public S2C_UnlockBeautyResult_9822 build() {
            S2C_UnlockBeautyResult_9822 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockBeautyResult_9822 buildPartial() {
            S2C_UnlockBeautyResult_9822 result = new S2C_UnlockBeautyResult_9822(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (UnlockInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_UnlockBeautyResult_9822) {
               return this.mergeFrom((S2C_UnlockBeautyResult_9822)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockBeautyResult_9822 other) {
            if (other == TongqueTerraceMsg.S2C_UnlockBeautyResult_9822.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnlockBeautyResult_9822 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockBeautyResult_9822)TongqueTerraceMsg.S2C_UnlockBeautyResult_9822.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockBeautyResult_9822)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public UnlockInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? TongqueTerraceMsg.UnlockInfo.getDefaultInstance() : this.info_;
            } else {
               return (UnlockInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(UnlockInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setInfo(UnlockInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(UnlockInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != TongqueTerraceMsg.UnlockInfo.getDefaultInstance()) {
                  this.info_ = TongqueTerraceMsg.UnlockInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public UnlockInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (UnlockInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public UnlockInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (UnlockInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? TongqueTerraceMsg.UnlockInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<UnlockInfo, UnlockInfo.Builder, UnlockInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CooperateInfo extends GeneratedMessageV3 implements CooperateInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int BEAUTYIDLIST_FIELD_NUMBER = 2;
      private Internal.IntList beautyIdList_;
      private byte memoizedIsInitialized;
      private static final CooperateInfo DEFAULT_INSTANCE = new CooperateInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CooperateInfo> PARSER = new AbstractParser<CooperateInfo>() {
         public CooperateInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CooperateInfo(input, extensionRegistry);
         }
      };

      private CooperateInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CooperateInfo() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
         this.beautyIdList_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CooperateInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CooperateInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CooperateType value = TongqueTerraceMsg.CooperateType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
                        }
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.beautyIdList_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.beautyIdList_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.beautyIdList_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.beautyIdList_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.beautyIdList_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CooperateInfo.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CooperateType getType() {
         CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
         return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
      }

      public List<Integer> getBeautyIdListList() {
         return this.beautyIdList_;
      }

      public int getBeautyIdListCount() {
         return this.beautyIdList_.size();
      }

      public int getBeautyIdList(int index) {
         return this.beautyIdList_.getInt(index);
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
            output.writeEnum(1, this.type_);
         }

         for(int i = 0; i < this.beautyIdList_.size(); ++i) {
            output.writeInt32(2, this.beautyIdList_.getInt(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.beautyIdList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.beautyIdList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBeautyIdListList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CooperateInfo)) {
            return super.equals(obj);
         } else {
            CooperateInfo other = (CooperateInfo)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (!this.getBeautyIdListList().equals(other.getBeautyIdListList())) {
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
               hash = 53 * hash + this.type_;
            }

            if (this.getBeautyIdListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBeautyIdListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CooperateInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CooperateInfo)PARSER.parseFrom(data);
      }

      public static CooperateInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CooperateInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CooperateInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CooperateInfo)PARSER.parseFrom(data);
      }

      public static CooperateInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CooperateInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CooperateInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CooperateInfo)PARSER.parseFrom(data);
      }

      public static CooperateInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CooperateInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CooperateInfo parseFrom(InputStream input) throws IOException {
         return (CooperateInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CooperateInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CooperateInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CooperateInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CooperateInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CooperateInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CooperateInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CooperateInfo parseFrom(CodedInputStream input) throws IOException {
         return (CooperateInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CooperateInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CooperateInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CooperateInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CooperateInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CooperateInfo> parser() {
         return PARSER;
      }

      public Parser<CooperateInfo> getParserForType() {
         return PARSER;
      }

      public CooperateInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CooperateInfoOrBuilder {
         private int bitField0_;
         private int type_;
         private Internal.IntList beautyIdList_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CooperateInfo.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.beautyIdList_ = TongqueTerraceMsg.CooperateInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.beautyIdList_ = TongqueTerraceMsg.CooperateInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.CooperateInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.beautyIdList_ = TongqueTerraceMsg.CooperateInfo.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_CooperateInfo_descriptor;
         }

         public CooperateInfo getDefaultInstanceForType() {
            return TongqueTerraceMsg.CooperateInfo.getDefaultInstance();
         }

         public CooperateInfo build() {
            CooperateInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CooperateInfo buildPartial() {
            CooperateInfo result = new CooperateInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
            if ((this.bitField0_ & 2) != 0) {
               this.beautyIdList_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.beautyIdList_ = this.beautyIdList_;
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
            if (other instanceof CooperateInfo) {
               return this.mergeFrom((CooperateInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CooperateInfo other) {
            if (other == TongqueTerraceMsg.CooperateInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (!other.beautyIdList_.isEmpty()) {
                  if (this.beautyIdList_.isEmpty()) {
                     this.beautyIdList_ = other.beautyIdList_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureBeautyIdListIsMutable();
                     this.beautyIdList_.addAll(other.beautyIdList_);
                  }

                  this.onChanged();
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
            CooperateInfo parsedMessage = null;

            try {
               parsedMessage = (CooperateInfo)TongqueTerraceMsg.CooperateInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CooperateInfo)e.getUnfinishedMessage();
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

         public CooperateType getType() {
            CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
            return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
         }

         public Builder setType(CooperateType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureBeautyIdListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.beautyIdList_ = TongqueTerraceMsg.CooperateInfo.mutableCopy(this.beautyIdList_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getBeautyIdListList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.beautyIdList_) : this.beautyIdList_);
         }

         public int getBeautyIdListCount() {
            return this.beautyIdList_.size();
         }

         public int getBeautyIdList(int index) {
            return this.beautyIdList_.getInt(index);
         }

         public Builder setBeautyIdList(int index, int value) {
            this.ensureBeautyIdListIsMutable();
            this.beautyIdList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBeautyIdList(int value) {
            this.ensureBeautyIdListIsMutable();
            this.beautyIdList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBeautyIdList(Iterable<? extends Integer> values) {
            this.ensureBeautyIdListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.beautyIdList_);
            this.onChanged();
            return this;
         }

         public Builder clearBeautyIdList() {
            this.beautyIdList_ = TongqueTerraceMsg.CooperateInfo.emptyIntList();
            this.bitField0_ &= -3;
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

   public static final class C2S_CooperateInfo_9830 extends GeneratedMessageV3 implements C2S_CooperateInfo_9830OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CooperateInfo_9830 DEFAULT_INSTANCE = new C2S_CooperateInfo_9830();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CooperateInfo_9830> PARSER = new AbstractParser<C2S_CooperateInfo_9830>() {
         public C2S_CooperateInfo_9830 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CooperateInfo_9830(input, extensionRegistry);
         }
      };

      private C2S_CooperateInfo_9830(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CooperateInfo_9830() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CooperateInfo_9830();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CooperateInfo_9830(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CooperateInfo_9830.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CooperateInfo_9830)) {
            return super.equals(obj);
         } else {
            C2S_CooperateInfo_9830 other = (C2S_CooperateInfo_9830)obj;
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

      public static C2S_CooperateInfo_9830 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CooperateInfo_9830)PARSER.parseFrom(data);
      }

      public static C2S_CooperateInfo_9830 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CooperateInfo_9830)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CooperateInfo_9830 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CooperateInfo_9830)PARSER.parseFrom(data);
      }

      public static C2S_CooperateInfo_9830 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CooperateInfo_9830)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CooperateInfo_9830 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CooperateInfo_9830)PARSER.parseFrom(data);
      }

      public static C2S_CooperateInfo_9830 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CooperateInfo_9830)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CooperateInfo_9830 parseFrom(InputStream input) throws IOException {
         return (C2S_CooperateInfo_9830)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CooperateInfo_9830 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CooperateInfo_9830)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CooperateInfo_9830 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CooperateInfo_9830)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CooperateInfo_9830 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CooperateInfo_9830)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CooperateInfo_9830 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CooperateInfo_9830)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CooperateInfo_9830 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CooperateInfo_9830)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CooperateInfo_9830 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CooperateInfo_9830 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CooperateInfo_9830> parser() {
         return PARSER;
      }

      public Parser<C2S_CooperateInfo_9830> getParserForType() {
         return PARSER;
      }

      public C2S_CooperateInfo_9830 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CooperateInfo_9830OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CooperateInfo_9830.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_CooperateInfo_9830.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_CooperateInfo_9830_descriptor;
         }

         public C2S_CooperateInfo_9830 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_CooperateInfo_9830.getDefaultInstance();
         }

         public C2S_CooperateInfo_9830 build() {
            C2S_CooperateInfo_9830 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CooperateInfo_9830 buildPartial() {
            C2S_CooperateInfo_9830 result = new C2S_CooperateInfo_9830(this);
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
            if (other instanceof C2S_CooperateInfo_9830) {
               return this.mergeFrom((C2S_CooperateInfo_9830)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CooperateInfo_9830 other) {
            if (other == TongqueTerraceMsg.C2S_CooperateInfo_9830.getDefaultInstance()) {
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
            C2S_CooperateInfo_9830 parsedMessage = null;

            try {
               parsedMessage = (C2S_CooperateInfo_9830)TongqueTerraceMsg.C2S_CooperateInfo_9830.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CooperateInfo_9830)e.getUnfinishedMessage();
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

   public static final class S2C_CooperateInfo_9831 extends GeneratedMessageV3 implements S2C_CooperateInfo_9831OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<CooperateInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_CooperateInfo_9831 DEFAULT_INSTANCE = new S2C_CooperateInfo_9831();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CooperateInfo_9831> PARSER = new AbstractParser<S2C_CooperateInfo_9831>() {
         public S2C_CooperateInfo_9831 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CooperateInfo_9831(input, extensionRegistry);
         }
      };

      private S2C_CooperateInfo_9831(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CooperateInfo_9831() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CooperateInfo_9831();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CooperateInfo_9831(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.info_.add(input.readMessage(TongqueTerraceMsg.CooperateInfo.PARSER, extensionRegistry));
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CooperateInfo_9831.class, Builder.class);
      }

      public List<CooperateInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends CooperateInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public CooperateInfo getInfo(int index) {
         return (CooperateInfo)this.info_.get(index);
      }

      public CooperateInfoOrBuilder getInfoOrBuilder(int index) {
         return (CooperateInfoOrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.info_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.info_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CooperateInfo_9831)) {
            return super.equals(obj);
         } else {
            S2C_CooperateInfo_9831 other = (S2C_CooperateInfo_9831)obj;
            if (!this.getInfoList().equals(other.getInfoList())) {
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
            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CooperateInfo_9831 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CooperateInfo_9831)PARSER.parseFrom(data);
      }

      public static S2C_CooperateInfo_9831 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CooperateInfo_9831)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CooperateInfo_9831 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CooperateInfo_9831)PARSER.parseFrom(data);
      }

      public static S2C_CooperateInfo_9831 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CooperateInfo_9831)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CooperateInfo_9831 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CooperateInfo_9831)PARSER.parseFrom(data);
      }

      public static S2C_CooperateInfo_9831 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CooperateInfo_9831)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CooperateInfo_9831 parseFrom(InputStream input) throws IOException {
         return (S2C_CooperateInfo_9831)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CooperateInfo_9831 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CooperateInfo_9831)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CooperateInfo_9831 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CooperateInfo_9831)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CooperateInfo_9831 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CooperateInfo_9831)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CooperateInfo_9831 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CooperateInfo_9831)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CooperateInfo_9831 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CooperateInfo_9831)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CooperateInfo_9831 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CooperateInfo_9831 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CooperateInfo_9831> parser() {
         return PARSER;
      }

      public Parser<S2C_CooperateInfo_9831> getParserForType() {
         return PARSER;
      }

      public S2C_CooperateInfo_9831 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CooperateInfo_9831OrBuilder {
         private int bitField0_;
         private List<CooperateInfo> info_;
         private RepeatedFieldBuilderV3<CooperateInfo, CooperateInfo.Builder, CooperateInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CooperateInfo_9831.class, Builder.class);
         }

         private Builder() {
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_CooperateInfo_9831.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_CooperateInfo_9831_descriptor;
         }

         public S2C_CooperateInfo_9831 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_CooperateInfo_9831.getDefaultInstance();
         }

         public S2C_CooperateInfo_9831 build() {
            S2C_CooperateInfo_9831 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CooperateInfo_9831 buildPartial() {
            S2C_CooperateInfo_9831 result = new S2C_CooperateInfo_9831(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -2;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof S2C_CooperateInfo_9831) {
               return this.mergeFrom((S2C_CooperateInfo_9831)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CooperateInfo_9831 other) {
            if (other == TongqueTerraceMsg.S2C_CooperateInfo_9831.getDefaultInstance()) {
               return this;
            } else {
               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfoIsMutable();
                        this.info_.addAll(other.info_);
                     }

                     this.onChanged();
                  }
               } else if (!other.info_.isEmpty()) {
                  if (this.infoBuilder_.isEmpty()) {
                     this.infoBuilder_.dispose();
                     this.infoBuilder_ = null;
                     this.info_ = other.info_;
                     this.bitField0_ &= -2;
                     this.infoBuilder_ = TongqueTerraceMsg.S2C_CooperateInfo_9831.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CooperateInfo_9831 parsedMessage = null;

            try {
               parsedMessage = (S2C_CooperateInfo_9831)TongqueTerraceMsg.S2C_CooperateInfo_9831.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CooperateInfo_9831)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 1;
            }

         }

         public List<CooperateInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public CooperateInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (CooperateInfo)this.info_.get(index) : (CooperateInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, CooperateInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.set(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfo(int index, CooperateInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(CooperateInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfo(int index, CooperateInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfo(CooperateInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, CooperateInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends CooperateInfo> values) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.info_);
               this.onChanged();
            } else {
               this.infoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfo(int index) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.remove(index);
               this.onChanged();
            } else {
               this.infoBuilder_.remove(index);
            }

            return this;
         }

         public CooperateInfo.Builder getInfoBuilder(int index) {
            return (CooperateInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public CooperateInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (CooperateInfoOrBuilder)this.info_.get(index) : (CooperateInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CooperateInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public CooperateInfo.Builder addInfoBuilder() {
            return (CooperateInfo.Builder)this.getInfoFieldBuilder().addBuilder(TongqueTerraceMsg.CooperateInfo.getDefaultInstance());
         }

         public CooperateInfo.Builder addInfoBuilder(int index) {
            return (CooperateInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, TongqueTerraceMsg.CooperateInfo.getDefaultInstance());
         }

         public List<CooperateInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CooperateInfo, CooperateInfo.Builder, CooperateInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SaveCooperate_9832 extends GeneratedMessageV3 implements C2S_SaveCooperate_9832OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COOPERATE_FIELD_NUMBER = 2;
      private CooperateInfo cooperate_;
      private byte memoizedIsInitialized;
      private static final C2S_SaveCooperate_9832 DEFAULT_INSTANCE = new C2S_SaveCooperate_9832();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SaveCooperate_9832> PARSER = new AbstractParser<C2S_SaveCooperate_9832>() {
         public C2S_SaveCooperate_9832 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SaveCooperate_9832(input, extensionRegistry);
         }
      };

      private C2S_SaveCooperate_9832(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SaveCooperate_9832() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SaveCooperate_9832();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SaveCooperate_9832(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        CooperateInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.cooperate_.toBuilder();
                        }

                        this.cooperate_ = (CooperateInfo)input.readMessage(TongqueTerraceMsg.CooperateInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.cooperate_);
                           this.cooperate_ = subBuilder.buildPartial();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SaveCooperate_9832.class, Builder.class);
      }

      public boolean hasCooperate() {
         return (this.bitField0_ & 1) != 0;
      }

      public CooperateInfo getCooperate() {
         return this.cooperate_ == null ? TongqueTerraceMsg.CooperateInfo.getDefaultInstance() : this.cooperate_;
      }

      public CooperateInfoOrBuilder getCooperateOrBuilder() {
         return this.cooperate_ == null ? TongqueTerraceMsg.CooperateInfo.getDefaultInstance() : this.cooperate_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCooperate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getCooperate().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(2, this.getCooperate());
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
               size += CodedOutputStream.computeMessageSize(2, this.getCooperate());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SaveCooperate_9832)) {
            return super.equals(obj);
         } else {
            C2S_SaveCooperate_9832 other = (C2S_SaveCooperate_9832)obj;
            if (this.hasCooperate() != other.hasCooperate()) {
               return false;
            } else if (this.hasCooperate() && !this.getCooperate().equals(other.getCooperate())) {
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
            if (this.hasCooperate()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCooperate().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SaveCooperate_9832 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SaveCooperate_9832)PARSER.parseFrom(data);
      }

      public static C2S_SaveCooperate_9832 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveCooperate_9832)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveCooperate_9832 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SaveCooperate_9832)PARSER.parseFrom(data);
      }

      public static C2S_SaveCooperate_9832 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveCooperate_9832)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveCooperate_9832 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SaveCooperate_9832)PARSER.parseFrom(data);
      }

      public static C2S_SaveCooperate_9832 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveCooperate_9832)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveCooperate_9832 parseFrom(InputStream input) throws IOException {
         return (C2S_SaveCooperate_9832)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SaveCooperate_9832 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveCooperate_9832)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SaveCooperate_9832 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SaveCooperate_9832)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SaveCooperate_9832 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveCooperate_9832)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SaveCooperate_9832 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SaveCooperate_9832)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SaveCooperate_9832 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveCooperate_9832)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SaveCooperate_9832 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SaveCooperate_9832 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SaveCooperate_9832> parser() {
         return PARSER;
      }

      public Parser<C2S_SaveCooperate_9832> getParserForType() {
         return PARSER;
      }

      public C2S_SaveCooperate_9832 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SaveCooperate_9832OrBuilder {
         private int bitField0_;
         private CooperateInfo cooperate_;
         private SingleFieldBuilderV3<CooperateInfo, CooperateInfo.Builder, CooperateInfoOrBuilder> cooperateBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SaveCooperate_9832.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_SaveCooperate_9832.alwaysUseFieldBuilders) {
               this.getCooperateFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.cooperateBuilder_ == null) {
               this.cooperate_ = null;
            } else {
               this.cooperateBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_SaveCooperate_9832_descriptor;
         }

         public C2S_SaveCooperate_9832 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_SaveCooperate_9832.getDefaultInstance();
         }

         public C2S_SaveCooperate_9832 build() {
            C2S_SaveCooperate_9832 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SaveCooperate_9832 buildPartial() {
            C2S_SaveCooperate_9832 result = new C2S_SaveCooperate_9832(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.cooperateBuilder_ == null) {
                  result.cooperate_ = this.cooperate_;
               } else {
                  result.cooperate_ = (CooperateInfo)this.cooperateBuilder_.build();
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
            if (other instanceof C2S_SaveCooperate_9832) {
               return this.mergeFrom((C2S_SaveCooperate_9832)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SaveCooperate_9832 other) {
            if (other == TongqueTerraceMsg.C2S_SaveCooperate_9832.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCooperate()) {
                  this.mergeCooperate(other.getCooperate());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCooperate()) {
               return false;
            } else {
               return this.getCooperate().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SaveCooperate_9832 parsedMessage = null;

            try {
               parsedMessage = (C2S_SaveCooperate_9832)TongqueTerraceMsg.C2S_SaveCooperate_9832.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SaveCooperate_9832)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCooperate() {
            return (this.bitField0_ & 1) != 0;
         }

         public CooperateInfo getCooperate() {
            if (this.cooperateBuilder_ == null) {
               return this.cooperate_ == null ? TongqueTerraceMsg.CooperateInfo.getDefaultInstance() : this.cooperate_;
            } else {
               return (CooperateInfo)this.cooperateBuilder_.getMessage();
            }
         }

         public Builder setCooperate(CooperateInfo value) {
            if (this.cooperateBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.cooperate_ = value;
               this.onChanged();
            } else {
               this.cooperateBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setCooperate(CooperateInfo.Builder builderForValue) {
            if (this.cooperateBuilder_ == null) {
               this.cooperate_ = builderForValue.build();
               this.onChanged();
            } else {
               this.cooperateBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeCooperate(CooperateInfo value) {
            if (this.cooperateBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.cooperate_ != null && this.cooperate_ != TongqueTerraceMsg.CooperateInfo.getDefaultInstance()) {
                  this.cooperate_ = TongqueTerraceMsg.CooperateInfo.newBuilder(this.cooperate_).mergeFrom(value).buildPartial();
               } else {
                  this.cooperate_ = value;
               }

               this.onChanged();
            } else {
               this.cooperateBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearCooperate() {
            if (this.cooperateBuilder_ == null) {
               this.cooperate_ = null;
               this.onChanged();
            } else {
               this.cooperateBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CooperateInfo.Builder getCooperateBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CooperateInfo.Builder)this.getCooperateFieldBuilder().getBuilder();
         }

         public CooperateInfoOrBuilder getCooperateOrBuilder() {
            if (this.cooperateBuilder_ != null) {
               return (CooperateInfoOrBuilder)this.cooperateBuilder_.getMessageOrBuilder();
            } else {
               return this.cooperate_ == null ? TongqueTerraceMsg.CooperateInfo.getDefaultInstance() : this.cooperate_;
            }
         }

         private SingleFieldBuilderV3<CooperateInfo, CooperateInfo.Builder, CooperateInfoOrBuilder> getCooperateFieldBuilder() {
            if (this.cooperateBuilder_ == null) {
               this.cooperateBuilder_ = new SingleFieldBuilderV3(this.getCooperate(), this.getParentForChildren(), this.isClean());
               this.cooperate_ = null;
            }

            return this.cooperateBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_SaveCooperate_9833 extends GeneratedMessageV3 implements S2C_SaveCooperate_9833OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int COOPERATE_FIELD_NUMBER = 2;
      private CooperateInfo cooperate_;
      private byte memoizedIsInitialized;
      private static final S2C_SaveCooperate_9833 DEFAULT_INSTANCE = new S2C_SaveCooperate_9833();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SaveCooperate_9833> PARSER = new AbstractParser<S2C_SaveCooperate_9833>() {
         public S2C_SaveCooperate_9833 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SaveCooperate_9833(input, extensionRegistry);
         }
      };

      private S2C_SaveCooperate_9833(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SaveCooperate_9833() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SaveCooperate_9833();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SaveCooperate_9833(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CooperateInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.cooperate_.toBuilder();
                        }

                        this.cooperate_ = (CooperateInfo)input.readMessage(TongqueTerraceMsg.CooperateInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.cooperate_);
                           this.cooperate_ = subBuilder.buildPartial();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SaveCooperate_9833.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCooperate() {
         return (this.bitField0_ & 2) != 0;
      }

      public CooperateInfo getCooperate() {
         return this.cooperate_ == null ? TongqueTerraceMsg.CooperateInfo.getDefaultInstance() : this.cooperate_;
      }

      public CooperateInfoOrBuilder getCooperateOrBuilder() {
         return this.cooperate_ == null ? TongqueTerraceMsg.CooperateInfo.getDefaultInstance() : this.cooperate_;
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
         } else if (this.hasCooperate() && !this.getCooperate().isInitialized()) {
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
            output.writeMessage(2, this.getCooperate());
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
               size += CodedOutputStream.computeMessageSize(2, this.getCooperate());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SaveCooperate_9833)) {
            return super.equals(obj);
         } else {
            S2C_SaveCooperate_9833 other = (S2C_SaveCooperate_9833)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCooperate() != other.hasCooperate()) {
               return false;
            } else if (this.hasCooperate() && !this.getCooperate().equals(other.getCooperate())) {
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

            if (this.hasCooperate()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCooperate().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SaveCooperate_9833 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SaveCooperate_9833)PARSER.parseFrom(data);
      }

      public static S2C_SaveCooperate_9833 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveCooperate_9833)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveCooperate_9833 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SaveCooperate_9833)PARSER.parseFrom(data);
      }

      public static S2C_SaveCooperate_9833 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveCooperate_9833)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveCooperate_9833 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SaveCooperate_9833)PARSER.parseFrom(data);
      }

      public static S2C_SaveCooperate_9833 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveCooperate_9833)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveCooperate_9833 parseFrom(InputStream input) throws IOException {
         return (S2C_SaveCooperate_9833)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SaveCooperate_9833 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveCooperate_9833)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SaveCooperate_9833 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SaveCooperate_9833)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SaveCooperate_9833 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveCooperate_9833)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SaveCooperate_9833 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SaveCooperate_9833)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SaveCooperate_9833 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveCooperate_9833)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SaveCooperate_9833 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SaveCooperate_9833 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SaveCooperate_9833> parser() {
         return PARSER;
      }

      public Parser<S2C_SaveCooperate_9833> getParserForType() {
         return PARSER;
      }

      public S2C_SaveCooperate_9833 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SaveCooperate_9833OrBuilder {
         private int bitField0_;
         private int result_;
         private CooperateInfo cooperate_;
         private SingleFieldBuilderV3<CooperateInfo, CooperateInfo.Builder, CooperateInfoOrBuilder> cooperateBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SaveCooperate_9833.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_SaveCooperate_9833.alwaysUseFieldBuilders) {
               this.getCooperateFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.cooperateBuilder_ == null) {
               this.cooperate_ = null;
            } else {
               this.cooperateBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_SaveCooperate_9833_descriptor;
         }

         public S2C_SaveCooperate_9833 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_SaveCooperate_9833.getDefaultInstance();
         }

         public S2C_SaveCooperate_9833 build() {
            S2C_SaveCooperate_9833 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SaveCooperate_9833 buildPartial() {
            S2C_SaveCooperate_9833 result = new S2C_SaveCooperate_9833(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.cooperateBuilder_ == null) {
                  result.cooperate_ = this.cooperate_;
               } else {
                  result.cooperate_ = (CooperateInfo)this.cooperateBuilder_.build();
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
            if (other instanceof S2C_SaveCooperate_9833) {
               return this.mergeFrom((S2C_SaveCooperate_9833)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SaveCooperate_9833 other) {
            if (other == TongqueTerraceMsg.S2C_SaveCooperate_9833.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCooperate()) {
                  this.mergeCooperate(other.getCooperate());
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
               return !this.hasCooperate() || this.getCooperate().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SaveCooperate_9833 parsedMessage = null;

            try {
               parsedMessage = (S2C_SaveCooperate_9833)TongqueTerraceMsg.S2C_SaveCooperate_9833.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SaveCooperate_9833)e.getUnfinishedMessage();
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

         public boolean hasCooperate() {
            return (this.bitField0_ & 2) != 0;
         }

         public CooperateInfo getCooperate() {
            if (this.cooperateBuilder_ == null) {
               return this.cooperate_ == null ? TongqueTerraceMsg.CooperateInfo.getDefaultInstance() : this.cooperate_;
            } else {
               return (CooperateInfo)this.cooperateBuilder_.getMessage();
            }
         }

         public Builder setCooperate(CooperateInfo value) {
            if (this.cooperateBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.cooperate_ = value;
               this.onChanged();
            } else {
               this.cooperateBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setCooperate(CooperateInfo.Builder builderForValue) {
            if (this.cooperateBuilder_ == null) {
               this.cooperate_ = builderForValue.build();
               this.onChanged();
            } else {
               this.cooperateBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeCooperate(CooperateInfo value) {
            if (this.cooperateBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.cooperate_ != null && this.cooperate_ != TongqueTerraceMsg.CooperateInfo.getDefaultInstance()) {
                  this.cooperate_ = TongqueTerraceMsg.CooperateInfo.newBuilder(this.cooperate_).mergeFrom(value).buildPartial();
               } else {
                  this.cooperate_ = value;
               }

               this.onChanged();
            } else {
               this.cooperateBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearCooperate() {
            if (this.cooperateBuilder_ == null) {
               this.cooperate_ = null;
               this.onChanged();
            } else {
               this.cooperateBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CooperateInfo.Builder getCooperateBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CooperateInfo.Builder)this.getCooperateFieldBuilder().getBuilder();
         }

         public CooperateInfoOrBuilder getCooperateOrBuilder() {
            if (this.cooperateBuilder_ != null) {
               return (CooperateInfoOrBuilder)this.cooperateBuilder_.getMessageOrBuilder();
            } else {
               return this.cooperate_ == null ? TongqueTerraceMsg.CooperateInfo.getDefaultInstance() : this.cooperate_;
            }
         }

         private SingleFieldBuilderV3<CooperateInfo, CooperateInfo.Builder, CooperateInfoOrBuilder> getCooperateFieldBuilder() {
            if (this.cooperateBuilder_ == null) {
               this.cooperateBuilder_ = new SingleFieldBuilderV3(this.getCooperate(), this.getParentForChildren(), this.isClean());
               this.cooperate_ = null;
            }

            return this.cooperateBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_DismissCooperate_9834 extends GeneratedMessageV3 implements C2S_DismissCooperate_9834OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_DismissCooperate_9834 DEFAULT_INSTANCE = new C2S_DismissCooperate_9834();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DismissCooperate_9834> PARSER = new AbstractParser<C2S_DismissCooperate_9834>() {
         public C2S_DismissCooperate_9834 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DismissCooperate_9834(input, extensionRegistry);
         }
      };

      private C2S_DismissCooperate_9834(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DismissCooperate_9834() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DismissCooperate_9834();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DismissCooperate_9834(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CooperateType value = TongqueTerraceMsg.CooperateType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DismissCooperate_9834.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CooperateType getType() {
         CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
         return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
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
            output.writeEnum(1, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DismissCooperate_9834)) {
            return super.equals(obj);
         } else {
            C2S_DismissCooperate_9834 other = (C2S_DismissCooperate_9834)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
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
               hash = 53 * hash + this.type_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DismissCooperate_9834 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DismissCooperate_9834)PARSER.parseFrom(data);
      }

      public static C2S_DismissCooperate_9834 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DismissCooperate_9834)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DismissCooperate_9834 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DismissCooperate_9834)PARSER.parseFrom(data);
      }

      public static C2S_DismissCooperate_9834 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DismissCooperate_9834)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DismissCooperate_9834 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DismissCooperate_9834)PARSER.parseFrom(data);
      }

      public static C2S_DismissCooperate_9834 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DismissCooperate_9834)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DismissCooperate_9834 parseFrom(InputStream input) throws IOException {
         return (C2S_DismissCooperate_9834)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DismissCooperate_9834 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DismissCooperate_9834)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DismissCooperate_9834 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DismissCooperate_9834)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DismissCooperate_9834 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DismissCooperate_9834)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DismissCooperate_9834 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DismissCooperate_9834)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DismissCooperate_9834 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DismissCooperate_9834)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DismissCooperate_9834 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DismissCooperate_9834 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DismissCooperate_9834> parser() {
         return PARSER;
      }

      public Parser<C2S_DismissCooperate_9834> getParserForType() {
         return PARSER;
      }

      public C2S_DismissCooperate_9834 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DismissCooperate_9834OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DismissCooperate_9834.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_DismissCooperate_9834.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_DismissCooperate_9834_descriptor;
         }

         public C2S_DismissCooperate_9834 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_DismissCooperate_9834.getDefaultInstance();
         }

         public C2S_DismissCooperate_9834 build() {
            C2S_DismissCooperate_9834 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DismissCooperate_9834 buildPartial() {
            C2S_DismissCooperate_9834 result = new C2S_DismissCooperate_9834(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
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
            if (other instanceof C2S_DismissCooperate_9834) {
               return this.mergeFrom((C2S_DismissCooperate_9834)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DismissCooperate_9834 other) {
            if (other == TongqueTerraceMsg.C2S_DismissCooperate_9834.getDefaultInstance()) {
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
            C2S_DismissCooperate_9834 parsedMessage = null;

            try {
               parsedMessage = (C2S_DismissCooperate_9834)TongqueTerraceMsg.C2S_DismissCooperate_9834.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DismissCooperate_9834)e.getUnfinishedMessage();
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

         public CooperateType getType() {
            CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
            return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
         }

         public Builder setType(CooperateType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
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

   public static final class S2C_DismissCooperate_9835 extends GeneratedMessageV3 implements S2C_DismissCooperate_9835OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_DismissCooperate_9835 DEFAULT_INSTANCE = new S2C_DismissCooperate_9835();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DismissCooperate_9835> PARSER = new AbstractParser<S2C_DismissCooperate_9835>() {
         public S2C_DismissCooperate_9835 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DismissCooperate_9835(input, extensionRegistry);
         }
      };

      private S2C_DismissCooperate_9835(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DismissCooperate_9835() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DismissCooperate_9835();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DismissCooperate_9835(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CooperateType value = TongqueTerraceMsg.CooperateType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.type_ = rawValue;
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DismissCooperate_9835.class, Builder.class);
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

      public CooperateType getType() {
         CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
         return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
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
            output.writeEnum(2, this.type_);
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
               size += CodedOutputStream.computeEnumSize(2, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DismissCooperate_9835)) {
            return super.equals(obj);
         } else {
            S2C_DismissCooperate_9835 other = (S2C_DismissCooperate_9835)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
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
               hash = 53 * hash + this.type_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DismissCooperate_9835 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DismissCooperate_9835)PARSER.parseFrom(data);
      }

      public static S2C_DismissCooperate_9835 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DismissCooperate_9835)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DismissCooperate_9835 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DismissCooperate_9835)PARSER.parseFrom(data);
      }

      public static S2C_DismissCooperate_9835 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DismissCooperate_9835)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DismissCooperate_9835 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DismissCooperate_9835)PARSER.parseFrom(data);
      }

      public static S2C_DismissCooperate_9835 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DismissCooperate_9835)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DismissCooperate_9835 parseFrom(InputStream input) throws IOException {
         return (S2C_DismissCooperate_9835)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DismissCooperate_9835 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DismissCooperate_9835)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DismissCooperate_9835 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DismissCooperate_9835)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DismissCooperate_9835 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DismissCooperate_9835)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DismissCooperate_9835 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DismissCooperate_9835)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DismissCooperate_9835 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DismissCooperate_9835)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DismissCooperate_9835 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DismissCooperate_9835 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DismissCooperate_9835> parser() {
         return PARSER;
      }

      public Parser<S2C_DismissCooperate_9835> getParserForType() {
         return PARSER;
      }

      public S2C_DismissCooperate_9835 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DismissCooperate_9835OrBuilder {
         private int bitField0_;
         private int result_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DismissCooperate_9835.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_DismissCooperate_9835.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_DismissCooperate_9835_descriptor;
         }

         public S2C_DismissCooperate_9835 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_DismissCooperate_9835.getDefaultInstance();
         }

         public S2C_DismissCooperate_9835 build() {
            S2C_DismissCooperate_9835 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DismissCooperate_9835 buildPartial() {
            S2C_DismissCooperate_9835 result = new S2C_DismissCooperate_9835(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.type_ = this.type_;
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
            if (other instanceof S2C_DismissCooperate_9835) {
               return this.mergeFrom((S2C_DismissCooperate_9835)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DismissCooperate_9835 other) {
            if (other == TongqueTerraceMsg.S2C_DismissCooperate_9835.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasResult();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DismissCooperate_9835 parsedMessage = null;

            try {
               parsedMessage = (S2C_DismissCooperate_9835)TongqueTerraceMsg.S2C_DismissCooperate_9835.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DismissCooperate_9835)e.getUnfinishedMessage();
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

         public CooperateType getType() {
            CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
            return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
         }

         public Builder setType(CooperateType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
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

   public static final class S2C_NotifyBeautyState_9836 extends GeneratedMessageV3 implements S2C_NotifyBeautyState_9836OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<BeautyState> info_;
      private byte memoizedIsInitialized;
      private static final S2C_NotifyBeautyState_9836 DEFAULT_INSTANCE = new S2C_NotifyBeautyState_9836();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NotifyBeautyState_9836> PARSER = new AbstractParser<S2C_NotifyBeautyState_9836>() {
         public S2C_NotifyBeautyState_9836 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NotifyBeautyState_9836(input, extensionRegistry);
         }
      };

      private S2C_NotifyBeautyState_9836(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NotifyBeautyState_9836() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NotifyBeautyState_9836();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NotifyBeautyState_9836(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.info_.add(input.readMessage(TongqueTerraceMsg.BeautyState.PARSER, extensionRegistry));
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyBeautyState_9836.class, Builder.class);
      }

      public List<BeautyState> getInfoList() {
         return this.info_;
      }

      public List<? extends BeautyStateOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public BeautyState getInfo(int index) {
         return (BeautyState)this.info_.get(index);
      }

      public BeautyStateOrBuilder getInfoOrBuilder(int index) {
         return (BeautyStateOrBuilder)this.info_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.info_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.info_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NotifyBeautyState_9836)) {
            return super.equals(obj);
         } else {
            S2C_NotifyBeautyState_9836 other = (S2C_NotifyBeautyState_9836)obj;
            if (!this.getInfoList().equals(other.getInfoList())) {
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
            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NotifyBeautyState_9836)PARSER.parseFrom(data);
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyBeautyState_9836)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NotifyBeautyState_9836)PARSER.parseFrom(data);
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyBeautyState_9836)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NotifyBeautyState_9836)PARSER.parseFrom(data);
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NotifyBeautyState_9836)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(InputStream input) throws IOException {
         return (S2C_NotifyBeautyState_9836)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyBeautyState_9836)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyBeautyState_9836 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NotifyBeautyState_9836)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NotifyBeautyState_9836 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyBeautyState_9836)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NotifyBeautyState_9836)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NotifyBeautyState_9836 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NotifyBeautyState_9836)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NotifyBeautyState_9836 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NotifyBeautyState_9836 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NotifyBeautyState_9836> parser() {
         return PARSER;
      }

      public Parser<S2C_NotifyBeautyState_9836> getParserForType() {
         return PARSER;
      }

      public S2C_NotifyBeautyState_9836 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NotifyBeautyState_9836OrBuilder {
         private int bitField0_;
         private List<BeautyState> info_;
         private RepeatedFieldBuilderV3<BeautyState, BeautyState.Builder, BeautyStateOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NotifyBeautyState_9836.class, Builder.class);
         }

         private Builder() {
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_NotifyBeautyState_9836.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_NotifyBeautyState_9836_descriptor;
         }

         public S2C_NotifyBeautyState_9836 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_NotifyBeautyState_9836.getDefaultInstance();
         }

         public S2C_NotifyBeautyState_9836 build() {
            S2C_NotifyBeautyState_9836 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NotifyBeautyState_9836 buildPartial() {
            S2C_NotifyBeautyState_9836 result = new S2C_NotifyBeautyState_9836(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -2;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
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
            if (other instanceof S2C_NotifyBeautyState_9836) {
               return this.mergeFrom((S2C_NotifyBeautyState_9836)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NotifyBeautyState_9836 other) {
            if (other == TongqueTerraceMsg.S2C_NotifyBeautyState_9836.getDefaultInstance()) {
               return this;
            } else {
               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfoIsMutable();
                        this.info_.addAll(other.info_);
                     }

                     this.onChanged();
                  }
               } else if (!other.info_.isEmpty()) {
                  if (this.infoBuilder_.isEmpty()) {
                     this.infoBuilder_.dispose();
                     this.infoBuilder_ = null;
                     this.info_ = other.info_;
                     this.bitField0_ &= -2;
                     this.infoBuilder_ = TongqueTerraceMsg.S2C_NotifyBeautyState_9836.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_NotifyBeautyState_9836 parsedMessage = null;

            try {
               parsedMessage = (S2C_NotifyBeautyState_9836)TongqueTerraceMsg.S2C_NotifyBeautyState_9836.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NotifyBeautyState_9836)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 1;
            }

         }

         public List<BeautyState> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public BeautyState getInfo(int index) {
            return this.infoBuilder_ == null ? (BeautyState)this.info_.get(index) : (BeautyState)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, BeautyState value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.set(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfo(int index, BeautyState.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(BeautyState value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfo(int index, BeautyState value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfo(BeautyState.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, BeautyState.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends BeautyState> values) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.info_);
               this.onChanged();
            } else {
               this.infoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfo(int index) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.remove(index);
               this.onChanged();
            } else {
               this.infoBuilder_.remove(index);
            }

            return this;
         }

         public BeautyState.Builder getInfoBuilder(int index) {
            return (BeautyState.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public BeautyStateOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (BeautyStateOrBuilder)this.info_.get(index) : (BeautyStateOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends BeautyStateOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public BeautyState.Builder addInfoBuilder() {
            return (BeautyState.Builder)this.getInfoFieldBuilder().addBuilder(TongqueTerraceMsg.BeautyState.getDefaultInstance());
         }

         public BeautyState.Builder addInfoBuilder(int index) {
            return (BeautyState.Builder)this.getInfoFieldBuilder().addBuilder(index, TongqueTerraceMsg.BeautyState.getDefaultInstance());
         }

         public List<BeautyState.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<BeautyState, BeautyState.Builder, BeautyStateOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class BeautyState extends GeneratedMessageV3 implements BeautyStateOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int BEAUTYGRADE_FIELD_NUMBER = 3;
      private int beautyGrade_;
      private byte memoizedIsInitialized;
      private static final BeautyState DEFAULT_INSTANCE = new BeautyState();
      /** @deprecated */
      @Deprecated
      public static final Parser<BeautyState> PARSER = new AbstractParser<BeautyState>() {
         public BeautyState parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new BeautyState(input, extensionRegistry);
         }
      };

      private BeautyState(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private BeautyState() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new BeautyState();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private BeautyState(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CooperateType value = TongqueTerraceMsg.CooperateType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.type_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.beautyGrade_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_fieldAccessorTable.ensureFieldAccessorsInitialized(BeautyState.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public CooperateType getType() {
         CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
         return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
      }

      public boolean hasBeautyGrade() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBeautyGrade() {
         return this.beautyGrade_;
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
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBeautyGrade()) {
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
            output.writeEnum(2, this.type_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.beautyGrade_);
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
               size += CodedOutputStream.computeEnumSize(2, this.type_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.beautyGrade_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof BeautyState)) {
            return super.equals(obj);
         } else {
            BeautyState other = (BeautyState)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (this.hasBeautyGrade() != other.hasBeautyGrade()) {
               return false;
            } else if (this.hasBeautyGrade() && this.getBeautyGrade() != other.getBeautyGrade()) {
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

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.type_;
            }

            if (this.hasBeautyGrade()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBeautyGrade();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static BeautyState parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (BeautyState)PARSER.parseFrom(data);
      }

      public static BeautyState parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BeautyState)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BeautyState parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (BeautyState)PARSER.parseFrom(data);
      }

      public static BeautyState parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BeautyState)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BeautyState parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (BeautyState)PARSER.parseFrom(data);
      }

      public static BeautyState parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (BeautyState)PARSER.parseFrom(data, extensionRegistry);
      }

      public static BeautyState parseFrom(InputStream input) throws IOException {
         return (BeautyState)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BeautyState parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BeautyState)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static BeautyState parseDelimitedFrom(InputStream input) throws IOException {
         return (BeautyState)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static BeautyState parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BeautyState)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static BeautyState parseFrom(CodedInputStream input) throws IOException {
         return (BeautyState)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static BeautyState parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (BeautyState)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(BeautyState prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static BeautyState getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<BeautyState> parser() {
         return PARSER;
      }

      public Parser<BeautyState> getParserForType() {
         return PARSER;
      }

      public BeautyState getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BeautyStateOrBuilder {
         private int bitField0_;
         private int id_;
         private int type_;
         private int beautyGrade_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_fieldAccessorTable.ensureFieldAccessorsInitialized(BeautyState.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.BeautyState.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            this.beautyGrade_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_BeautyState_descriptor;
         }

         public BeautyState getDefaultInstanceForType() {
            return TongqueTerraceMsg.BeautyState.getDefaultInstance();
         }

         public BeautyState build() {
            BeautyState result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public BeautyState buildPartial() {
            BeautyState result = new BeautyState(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.type_ = this.type_;
            if ((from_bitField0_ & 4) != 0) {
               result.beautyGrade_ = this.beautyGrade_;
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
            if (other instanceof BeautyState) {
               return this.mergeFrom((BeautyState)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(BeautyState other) {
            if (other == TongqueTerraceMsg.BeautyState.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasBeautyGrade()) {
                  this.setBeautyGrade(other.getBeautyGrade());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else {
               return this.hasBeautyGrade();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            BeautyState parsedMessage = null;

            try {
               parsedMessage = (BeautyState)TongqueTerraceMsg.BeautyState.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (BeautyState)e.getUnfinishedMessage();
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

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public CooperateType getType() {
            CooperateType result = TongqueTerraceMsg.CooperateType.valueOf(this.type_);
            return result == null ? TongqueTerraceMsg.CooperateType.COOPERATE_NONE : result;
         }

         public Builder setType(CooperateType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBeautyGrade() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBeautyGrade() {
            return this.beautyGrade_;
         }

         public Builder setBeautyGrade(int value) {
            this.bitField0_ |= 4;
            this.beautyGrade_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyGrade() {
            this.bitField0_ &= -5;
            this.beautyGrade_ = 0;
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

   public static final class C2S_PlayerBeautyInfo_9840 extends GeneratedMessageV3 implements C2S_PlayerBeautyInfo_9840OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int BEAUTYID_FIELD_NUMBER = 3;
      private int beautyId_;
      private byte memoizedIsInitialized;
      private static final C2S_PlayerBeautyInfo_9840 DEFAULT_INSTANCE = new C2S_PlayerBeautyInfo_9840();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PlayerBeautyInfo_9840> PARSER = new AbstractParser<C2S_PlayerBeautyInfo_9840>() {
         public C2S_PlayerBeautyInfo_9840 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PlayerBeautyInfo_9840(input, extensionRegistry);
         }
      };

      private C2S_PlayerBeautyInfo_9840(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PlayerBeautyInfo_9840() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PlayerBeautyInfo_9840();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PlayerBeautyInfo_9840(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.serverId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.beautyId_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerBeautyInfo_9840.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.serverId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.beautyId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.serverId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.beautyId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PlayerBeautyInfo_9840)) {
            return super.equals(obj);
         } else {
            C2S_PlayerBeautyInfo_9840 other = (C2S_PlayerBeautyInfo_9840)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
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

            if (this.hasServerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasBeautyId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBeautyId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PlayerBeautyInfo_9840)PARSER.parseFrom(data);
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerBeautyInfo_9840)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PlayerBeautyInfo_9840)PARSER.parseFrom(data);
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerBeautyInfo_9840)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PlayerBeautyInfo_9840)PARSER.parseFrom(data);
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PlayerBeautyInfo_9840)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(InputStream input) throws IOException {
         return (C2S_PlayerBeautyInfo_9840)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerBeautyInfo_9840)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerBeautyInfo_9840 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PlayerBeautyInfo_9840)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PlayerBeautyInfo_9840 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerBeautyInfo_9840)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PlayerBeautyInfo_9840)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PlayerBeautyInfo_9840 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PlayerBeautyInfo_9840)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PlayerBeautyInfo_9840 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PlayerBeautyInfo_9840 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PlayerBeautyInfo_9840> parser() {
         return PARSER;
      }

      public Parser<C2S_PlayerBeautyInfo_9840> getParserForType() {
         return PARSER;
      }

      public C2S_PlayerBeautyInfo_9840 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PlayerBeautyInfo_9840OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int serverId_;
         private int beautyId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PlayerBeautyInfo_9840.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_PlayerBeautyInfo_9840.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.bitField0_ &= -3;
            this.beautyId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_PlayerBeautyInfo_9840_descriptor;
         }

         public C2S_PlayerBeautyInfo_9840 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_PlayerBeautyInfo_9840.getDefaultInstance();
         }

         public C2S_PlayerBeautyInfo_9840 build() {
            C2S_PlayerBeautyInfo_9840 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PlayerBeautyInfo_9840 buildPartial() {
            C2S_PlayerBeautyInfo_9840 result = new C2S_PlayerBeautyInfo_9840(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.beautyId_ = this.beautyId_;
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
            if (other instanceof C2S_PlayerBeautyInfo_9840) {
               return this.mergeFrom((C2S_PlayerBeautyInfo_9840)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PlayerBeautyInfo_9840 other) {
            if (other == TongqueTerraceMsg.C2S_PlayerBeautyInfo_9840.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
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
            C2S_PlayerBeautyInfo_9840 parsedMessage = null;

            try {
               parsedMessage = (C2S_PlayerBeautyInfo_9840)TongqueTerraceMsg.C2S_PlayerBeautyInfo_9840.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PlayerBeautyInfo_9840)e.getUnfinishedMessage();
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

         public boolean hasServerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 2;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -3;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 4;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -5;
            this.beautyId_ = 0;
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

   public static final class S2C_PlayerBeautyInfo_9841 extends GeneratedMessageV3 implements S2C_PlayerBeautyInfo_9841OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<BeautyInfo> infos_;
      public static final int BEAUTYIDLIST_FIELD_NUMBER = 3;
      private Internal.IntList beautyIdList_;
      public static final int SKILLLIST_FIELD_NUMBER = 4;
      private Internal.IntList skillList_;
      private byte memoizedIsInitialized;
      private static final S2C_PlayerBeautyInfo_9841 DEFAULT_INSTANCE = new S2C_PlayerBeautyInfo_9841();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PlayerBeautyInfo_9841> PARSER = new AbstractParser<S2C_PlayerBeautyInfo_9841>() {
         public S2C_PlayerBeautyInfo_9841 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PlayerBeautyInfo_9841(input, extensionRegistry);
         }
      };

      private S2C_PlayerBeautyInfo_9841(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PlayerBeautyInfo_9841() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
         this.beautyIdList_ = emptyIntList();
         this.skillList_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PlayerBeautyInfo_9841();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PlayerBeautyInfo_9841(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
                        continue;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(TongqueTerraceMsg.BeautyInfo.PARSER, extensionRegistry));
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.beautyIdList_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.beautyIdList_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.beautyIdList_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.skillList_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.skillList_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.skillList_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.skillList_.addInt(input.readInt32());
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
                     this.beautyIdList_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.beautyIdList_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.skillList_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerBeautyInfo_9841.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public List<BeautyInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends BeautyInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public BeautyInfo getInfos(int index) {
         return (BeautyInfo)this.infos_.get(index);
      }

      public BeautyInfoOrBuilder getInfosOrBuilder(int index) {
         return (BeautyInfoOrBuilder)this.infos_.get(index);
      }

      public List<Integer> getBeautyIdListList() {
         return this.beautyIdList_;
      }

      public int getBeautyIdListCount() {
         return this.beautyIdList_.size();
      }

      public int getBeautyIdList(int index) {
         return this.beautyIdList_.getInt(index);
      }

      public List<Integer> getSkillListList() {
         return this.skillList_;
      }

      public int getSkillListCount() {
         return this.skillList_.size();
      }

      public int getSkillList(int index) {
         return this.skillList_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
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
            output.writeInt32(1, this.beautyId_);
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.infos_.get(i));
         }

         for(int i = 0; i < this.beautyIdList_.size(); ++i) {
            output.writeInt32(3, this.beautyIdList_.getInt(i));
         }

         for(int i = 0; i < this.skillList_.size(); ++i) {
            output.writeInt32(4, this.skillList_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.infos_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.beautyIdList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.beautyIdList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getBeautyIdListList().size();
            dataSize = 0;

            for(int i = 0; i < this.skillList_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.skillList_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSkillListList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PlayerBeautyInfo_9841)) {
            return super.equals(obj);
         } else {
            S2C_PlayerBeautyInfo_9841 other = (S2C_PlayerBeautyInfo_9841)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (!this.getBeautyIdListList().equals(other.getBeautyIdListList())) {
               return false;
            } else if (!this.getSkillListList().equals(other.getSkillListList())) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            if (this.getBeautyIdListCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBeautyIdListList().hashCode();
            }

            if (this.getSkillListCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSkillListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PlayerBeautyInfo_9841)PARSER.parseFrom(data);
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerBeautyInfo_9841)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PlayerBeautyInfo_9841)PARSER.parseFrom(data);
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerBeautyInfo_9841)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PlayerBeautyInfo_9841)PARSER.parseFrom(data);
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PlayerBeautyInfo_9841)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(InputStream input) throws IOException {
         return (S2C_PlayerBeautyInfo_9841)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerBeautyInfo_9841)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerBeautyInfo_9841 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PlayerBeautyInfo_9841)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PlayerBeautyInfo_9841 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerBeautyInfo_9841)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PlayerBeautyInfo_9841)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PlayerBeautyInfo_9841 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PlayerBeautyInfo_9841)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PlayerBeautyInfo_9841 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PlayerBeautyInfo_9841 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PlayerBeautyInfo_9841> parser() {
         return PARSER;
      }

      public Parser<S2C_PlayerBeautyInfo_9841> getParserForType() {
         return PARSER;
      }

      public S2C_PlayerBeautyInfo_9841 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PlayerBeautyInfo_9841OrBuilder {
         private int bitField0_;
         private int beautyId_;
         private List<BeautyInfo> infos_;
         private RepeatedFieldBuilderV3<BeautyInfo, BeautyInfo.Builder, BeautyInfoOrBuilder> infosBuilder_;
         private Internal.IntList beautyIdList_;
         private Internal.IntList skillList_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PlayerBeautyInfo_9841.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.beautyIdList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.emptyIntList();
            this.skillList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.beautyIdList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.emptyIntList();
            this.skillList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infosBuilder_.clear();
            }

            this.beautyIdList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.emptyIntList();
            this.bitField0_ &= -5;
            this.skillList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_PlayerBeautyInfo_9841_descriptor;
         }

         public S2C_PlayerBeautyInfo_9841 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.getDefaultInstance();
         }

         public S2C_PlayerBeautyInfo_9841 build() {
            S2C_PlayerBeautyInfo_9841 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PlayerBeautyInfo_9841 buildPartial() {
            S2C_PlayerBeautyInfo_9841 result = new S2C_PlayerBeautyInfo_9841(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
               to_bitField0_ |= 1;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -3;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
            }

            if ((this.bitField0_ & 4) != 0) {
               this.beautyIdList_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.beautyIdList_ = this.beautyIdList_;
            if ((this.bitField0_ & 8) != 0) {
               this.skillList_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.skillList_ = this.skillList_;
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
            if (other instanceof S2C_PlayerBeautyInfo_9841) {
               return this.mergeFrom((S2C_PlayerBeautyInfo_9841)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PlayerBeautyInfo_9841 other) {
            if (other == TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -3;
                     this.infosBuilder_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (!other.beautyIdList_.isEmpty()) {
                  if (this.beautyIdList_.isEmpty()) {
                     this.beautyIdList_ = other.beautyIdList_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureBeautyIdListIsMutable();
                     this.beautyIdList_.addAll(other.beautyIdList_);
                  }

                  this.onChanged();
               }

               if (!other.skillList_.isEmpty()) {
                  if (this.skillList_.isEmpty()) {
                     this.skillList_ = other.skillList_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureSkillListIsMutable();
                     this.skillList_.addAll(other.skillList_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeautyId()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PlayerBeautyInfo_9841 parsedMessage = null;

            try {
               parsedMessage = (S2C_PlayerBeautyInfo_9841)TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PlayerBeautyInfo_9841)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public List<BeautyInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public BeautyInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (BeautyInfo)this.infos_.get(index) : (BeautyInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, BeautyInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, BeautyInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(BeautyInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, BeautyInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(BeautyInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, BeautyInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends BeautyInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public BeautyInfo.Builder getInfosBuilder(int index) {
            return (BeautyInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public BeautyInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (BeautyInfoOrBuilder)this.infos_.get(index) : (BeautyInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends BeautyInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public BeautyInfo.Builder addInfosBuilder() {
            return (BeautyInfo.Builder)this.getInfosFieldBuilder().addBuilder(TongqueTerraceMsg.BeautyInfo.getDefaultInstance());
         }

         public BeautyInfo.Builder addInfosBuilder(int index) {
            return (BeautyInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, TongqueTerraceMsg.BeautyInfo.getDefaultInstance());
         }

         public List<BeautyInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<BeautyInfo, BeautyInfo.Builder, BeautyInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         private void ensureBeautyIdListIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.beautyIdList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.mutableCopy(this.beautyIdList_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getBeautyIdListList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.beautyIdList_) : this.beautyIdList_);
         }

         public int getBeautyIdListCount() {
            return this.beautyIdList_.size();
         }

         public int getBeautyIdList(int index) {
            return this.beautyIdList_.getInt(index);
         }

         public Builder setBeautyIdList(int index, int value) {
            this.ensureBeautyIdListIsMutable();
            this.beautyIdList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addBeautyIdList(int value) {
            this.ensureBeautyIdListIsMutable();
            this.beautyIdList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllBeautyIdList(Iterable<? extends Integer> values) {
            this.ensureBeautyIdListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.beautyIdList_);
            this.onChanged();
            return this;
         }

         public Builder clearBeautyIdList() {
            this.beautyIdList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureSkillListIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.skillList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.mutableCopy(this.skillList_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getSkillListList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.skillList_) : this.skillList_);
         }

         public int getSkillListCount() {
            return this.skillList_.size();
         }

         public int getSkillList(int index) {
            return this.skillList_.getInt(index);
         }

         public Builder setSkillList(int index, int value) {
            this.ensureSkillListIsMutable();
            this.skillList_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSkillList(int value) {
            this.ensureSkillListIsMutable();
            this.skillList_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSkillList(Iterable<? extends Integer> values) {
            this.ensureSkillListIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.skillList_);
            this.onChanged();
            return this;
         }

         public Builder clearSkillList() {
            this.skillList_ = TongqueTerraceMsg.S2C_PlayerBeautyInfo_9841.emptyIntList();
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

   public static final class C2S_ResetBeauty_9842 extends GeneratedMessageV3 implements C2S_ResetBeauty_9842OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BEAUTYID_FIELD_NUMBER = 1;
      private int beautyId_;
      public static final int STATUS_FIELD_NUMBER = 2;
      private int status_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetBeauty_9842 DEFAULT_INSTANCE = new C2S_ResetBeauty_9842();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetBeauty_9842> PARSER = new AbstractParser<C2S_ResetBeauty_9842>() {
         public C2S_ResetBeauty_9842 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetBeauty_9842(input, extensionRegistry);
         }
      };

      private C2S_ResetBeauty_9842(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetBeauty_9842() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetBeauty_9842();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetBeauty_9842(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.beautyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.status_ = input.readInt32();
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
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetBeauty_9842.class, Builder.class);
      }

      public boolean hasBeautyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBeautyId() {
         return this.beautyId_;
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStatus() {
         return this.status_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBeautyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStatus()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.beautyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.status_);
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
               size += CodedOutputStream.computeInt32Size(1, this.beautyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.status_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ResetBeauty_9842)) {
            return super.equals(obj);
         } else {
            C2S_ResetBeauty_9842 other = (C2S_ResetBeauty_9842)obj;
            if (this.hasBeautyId() != other.hasBeautyId()) {
               return false;
            } else if (this.hasBeautyId() && this.getBeautyId() != other.getBeautyId()) {
               return false;
            } else if (this.hasStatus() != other.hasStatus()) {
               return false;
            } else if (this.hasStatus() && this.getStatus() != other.getStatus()) {
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
            if (this.hasBeautyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBeautyId();
            }

            if (this.hasStatus()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStatus();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ResetBeauty_9842 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetBeauty_9842)PARSER.parseFrom(data);
      }

      public static C2S_ResetBeauty_9842 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetBeauty_9842)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetBeauty_9842 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetBeauty_9842)PARSER.parseFrom(data);
      }

      public static C2S_ResetBeauty_9842 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetBeauty_9842)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetBeauty_9842 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetBeauty_9842)PARSER.parseFrom(data);
      }

      public static C2S_ResetBeauty_9842 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetBeauty_9842)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetBeauty_9842 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetBeauty_9842)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetBeauty_9842 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetBeauty_9842)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetBeauty_9842 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetBeauty_9842)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetBeauty_9842 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetBeauty_9842)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetBeauty_9842 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetBeauty_9842)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetBeauty_9842 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetBeauty_9842)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetBeauty_9842 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetBeauty_9842 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetBeauty_9842> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetBeauty_9842> getParserForType() {
         return PARSER;
      }

      public C2S_ResetBeauty_9842 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetBeauty_9842OrBuilder {
         private int bitField0_;
         private int beautyId_;
         private int status_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetBeauty_9842.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.C2S_ResetBeauty_9842.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.beautyId_ = 0;
            this.bitField0_ &= -2;
            this.status_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_C2S_ResetBeauty_9842_descriptor;
         }

         public C2S_ResetBeauty_9842 getDefaultInstanceForType() {
            return TongqueTerraceMsg.C2S_ResetBeauty_9842.getDefaultInstance();
         }

         public C2S_ResetBeauty_9842 build() {
            C2S_ResetBeauty_9842 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetBeauty_9842 buildPartial() {
            C2S_ResetBeauty_9842 result = new C2S_ResetBeauty_9842(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.beautyId_ = this.beautyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.status_ = this.status_;
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
            if (other instanceof C2S_ResetBeauty_9842) {
               return this.mergeFrom((C2S_ResetBeauty_9842)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetBeauty_9842 other) {
            if (other == TongqueTerraceMsg.C2S_ResetBeauty_9842.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBeautyId()) {
                  this.setBeautyId(other.getBeautyId());
               }

               if (other.hasStatus()) {
                  this.setStatus(other.getStatus());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBeautyId()) {
               return false;
            } else {
               return this.hasStatus();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ResetBeauty_9842 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetBeauty_9842)TongqueTerraceMsg.C2S_ResetBeauty_9842.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetBeauty_9842)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBeautyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBeautyId() {
            return this.beautyId_;
         }

         public Builder setBeautyId(int value) {
            this.bitField0_ |= 1;
            this.beautyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeautyId() {
            this.bitField0_ &= -2;
            this.beautyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStatus() {
            return this.status_;
         }

         public Builder setStatus(int value) {
            this.bitField0_ |= 2;
            this.status_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStatus() {
            this.bitField0_ &= -3;
            this.status_ = 0;
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

   public static final class S2C_ResetBeauty_9843 extends GeneratedMessageV3 implements S2C_ResetBeauty_9843OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMS_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> items_;
      private byte memoizedIsInitialized;
      private static final S2C_ResetBeauty_9843 DEFAULT_INSTANCE = new S2C_ResetBeauty_9843();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetBeauty_9843> PARSER = new AbstractParser<S2C_ResetBeauty_9843>() {
         public S2C_ResetBeauty_9843 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetBeauty_9843(input, extensionRegistry);
         }
      };

      private S2C_ResetBeauty_9843(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetBeauty_9843() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetBeauty_9843();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetBeauty_9843(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.items_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
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
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetBeauty_9843.class, Builder.class);
      }

      public List<CommonMsg.ItemInfo> getItemsList() {
         return this.items_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public CommonMsg.ItemInfo getItems(int index) {
         return (CommonMsg.ItemInfo)this.items_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.items_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.items_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.items_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ResetBeauty_9843)) {
            return super.equals(obj);
         } else {
            S2C_ResetBeauty_9843 other = (S2C_ResetBeauty_9843)obj;
            if (!this.getItemsList().equals(other.getItemsList())) {
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
            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ResetBeauty_9843 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetBeauty_9843)PARSER.parseFrom(data);
      }

      public static S2C_ResetBeauty_9843 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetBeauty_9843)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetBeauty_9843 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetBeauty_9843)PARSER.parseFrom(data);
      }

      public static S2C_ResetBeauty_9843 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetBeauty_9843)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetBeauty_9843 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetBeauty_9843)PARSER.parseFrom(data);
      }

      public static S2C_ResetBeauty_9843 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetBeauty_9843)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetBeauty_9843 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetBeauty_9843)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetBeauty_9843 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetBeauty_9843)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetBeauty_9843 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetBeauty_9843)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetBeauty_9843 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetBeauty_9843)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetBeauty_9843 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetBeauty_9843)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetBeauty_9843 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetBeauty_9843)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetBeauty_9843 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetBeauty_9843 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetBeauty_9843> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetBeauty_9843> getParserForType() {
         return PARSER;
      }

      public S2C_ResetBeauty_9843 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetBeauty_9843OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetBeauty_9843.class, Builder.class);
         }

         private Builder() {
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (TongqueTerraceMsg.S2C_ResetBeauty_9843.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return TongqueTerraceMsg.internal_static_tongqueTerrace_com_gzbz_protobuf_S2C_ResetBeauty_9843_descriptor;
         }

         public S2C_ResetBeauty_9843 getDefaultInstanceForType() {
            return TongqueTerraceMsg.S2C_ResetBeauty_9843.getDefaultInstance();
         }

         public S2C_ResetBeauty_9843 build() {
            S2C_ResetBeauty_9843 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetBeauty_9843 buildPartial() {
            S2C_ResetBeauty_9843 result = new S2C_ResetBeauty_9843(this);
            int from_bitField0_ = this.bitField0_;
            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -2;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
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
            if (other instanceof S2C_ResetBeauty_9843) {
               return this.mergeFrom((S2C_ResetBeauty_9843)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetBeauty_9843 other) {
            if (other == TongqueTerraceMsg.S2C_ResetBeauty_9843.getDefaultInstance()) {
               return this;
            } else {
               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureItemsIsMutable();
                        this.items_.addAll(other.items_);
                     }

                     this.onChanged();
                  }
               } else if (!other.items_.isEmpty()) {
                  if (this.itemsBuilder_.isEmpty()) {
                     this.itemsBuilder_.dispose();
                     this.itemsBuilder_ = null;
                     this.items_ = other.items_;
                     this.bitField0_ &= -2;
                     this.itemsBuilder_ = TongqueTerraceMsg.S2C_ResetBeauty_9843.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ResetBeauty_9843 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetBeauty_9843)TongqueTerraceMsg.S2C_ResetBeauty_9843.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetBeauty_9843)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.ItemInfo> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItems(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfo)this.items_.get(index) : (CommonMsg.ItemInfo)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.set(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.items_);
               this.onChanged();
            } else {
               this.itemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItems() {
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeItems(int index) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.remove(index);
               this.onChanged();
            } else {
               this.itemsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.items_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.items_ = null;
            }

            return this.itemsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface BeautyInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasState();

      int getState();

      boolean hasUnlockStep();

      int getUnlockStep();

      boolean hasTrystLv();

      int getTrystLv();

      boolean hasTrystExp();

      int getTrystExp();

      boolean hasBestowNum();

      int getBestowNum();

      boolean hasSkillId();

      int getSkillId();

      boolean hasPatronizeLv();

      int getPatronizeLv();

      List<CommonMsg.PropertyInfo> getTrystPropertysList();

      CommonMsg.PropertyInfo getTrystPropertys(int index);

      int getTrystPropertysCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getTrystPropertysOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getTrystPropertysOrBuilder(int index);

      List<CommonMsg.PropertyInfo> getBestowPropertysList();

      CommonMsg.PropertyInfo getBestowPropertys(int index);

      int getBestowPropertysCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getBestowPropertysOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getBestowPropertysOrBuilder(int index);

      List<CommonMsg.PropertyInfo> getPatronizePropertyList();

      CommonMsg.PropertyInfo getPatronizeProperty(int index);

      int getPatronizePropertyCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPatronizePropertyOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPatronizePropertyOrBuilder(int index);

      boolean hasType();

      CooperateType getType();

      boolean hasBeautyGrade();

      int getBeautyGrade();

      boolean hasAssistantSkill();

      int getAssistantSkill();
   }

   public interface BeautyStateOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasType();

      CooperateType getType();

      boolean hasBeautyGrade();

      int getBeautyGrade();
   }

   public interface BeautyTrystInfoOrBuilder extends MessageOrBuilder {
      boolean hasBeatuyId();

      int getBeatuyId();

      boolean hasTrystLv();

      int getTrystLv();

      boolean hasTrystExp();

      int getTrystExp();

      List<CommonMsg.PropertyInfo> getTrystPropertysList();

      CommonMsg.PropertyInfo getTrystPropertys(int index);

      int getTrystPropertysCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getTrystPropertysOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getTrystPropertysOrBuilder(int index);
   }

   public interface C2S_BestowBeauty_9811OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_CooperateInfo_9830OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DismissCooperate_9834OrBuilder extends MessageOrBuilder {
      boolean hasType();

      CooperateType getType();
   }

   public interface C2S_FreeTryst_9805OrBuilder extends MessageOrBuilder {
      boolean hasType();

      TrystType getType();
   }

   public interface C2S_OpenUi_9803OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PatronizeBeauty_9815OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();
   }

   public interface C2S_PlayerBeautyInfo_9840OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasServerId();

      int getServerId();

      boolean hasBeautyId();

      int getBeautyId();
   }

   public interface C2S_ResetBeauty_9842OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();

      boolean hasStatus();

      int getStatus();
   }

   public interface C2S_SaveCooperate_9832OrBuilder extends MessageOrBuilder {
      boolean hasCooperate();

      CooperateInfo getCooperate();

      CooperateInfoOrBuilder getCooperateOrBuilder();
   }

   public interface C2S_SkillUpBeauty_9813OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();
   }

   public interface C2S_TrystBeauty_9807OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();
   }

   public interface C2S_UnlockBeauty_9821OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();

      boolean hasStep();

      int getStep();
   }

   public interface C2S_UnlockInfo_9801OrBuilder extends MessageOrBuilder {
   }

   public interface CooperateInfoOrBuilder extends MessageOrBuilder {
      boolean hasType();

      CooperateType getType();

      List<Integer> getBeautyIdListList();

      int getBeautyIdListCount();

      int getBeautyIdList(int index);
   }

   public interface S2C_BestowBeautyResult_9812OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();

      boolean hasNum();

      int getNum();

      List<CommonMsg.PropertyInfo> getAddBestowPropertysList();

      CommonMsg.PropertyInfo getAddBestowPropertys(int index);

      int getAddBestowPropertysCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getAddBestowPropertysOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getAddBestowPropertysOrBuilder(int index);
   }

   public interface S2C_CooperateInfo_9831OrBuilder extends MessageOrBuilder {
      List<CooperateInfo> getInfoList();

      CooperateInfo getInfo(int index);

      int getInfoCount();

      List<? extends CooperateInfoOrBuilder> getInfoOrBuilderList();

      CooperateInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_DismissCooperate_9835OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasType();

      CooperateType getType();
   }

   public interface S2C_FreeTrystResult_9806OrBuilder extends MessageOrBuilder {
      boolean hasDownTime();

      int getDownTime();

      boolean hasType();

      TrystType getType();

      List<TrystExpInfo> getExpInfosList();

      TrystExpInfo getExpInfos(int index);

      int getExpInfosCount();

      List<? extends TrystExpInfoOrBuilder> getExpInfosOrBuilderList();

      TrystExpInfoOrBuilder getExpInfosOrBuilder(int index);

      List<BeautyTrystInfo> getTrystInfosList();

      BeautyTrystInfo getTrystInfos(int index);

      int getTrystInfosCount();

      List<? extends BeautyTrystInfoOrBuilder> getTrystInfosOrBuilderList();

      BeautyTrystInfoOrBuilder getTrystInfosOrBuilder(int index);
   }

   public interface S2C_NotifyBeautyState_9836OrBuilder extends MessageOrBuilder {
      List<BeautyState> getInfoList();

      BeautyState getInfo(int index);

      int getInfoCount();

      List<? extends BeautyStateOrBuilder> getInfoOrBuilderList();

      BeautyStateOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_OpenUiResult_9804OrBuilder extends MessageOrBuilder {
      boolean hasDownTime();

      int getDownTime();

      List<BeautyInfo> getInfosList();

      BeautyInfo getInfos(int index);

      int getInfosCount();

      List<? extends BeautyInfoOrBuilder> getInfosOrBuilderList();

      BeautyInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_PatronizeBeautyResult_9816OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();

      boolean hasPatronizeLv();

      int getPatronizeLv();

      List<CommonMsg.PropertyInfo> getAddPatronizePropertyList();

      CommonMsg.PropertyInfo getAddPatronizeProperty(int index);

      int getAddPatronizePropertyCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getAddPatronizePropertyOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getAddPatronizePropertyOrBuilder(int index);
   }

   public interface S2C_PlayerBeautyInfo_9841OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();

      List<BeautyInfo> getInfosList();

      BeautyInfo getInfos(int index);

      int getInfosCount();

      List<? extends BeautyInfoOrBuilder> getInfosOrBuilderList();

      BeautyInfoOrBuilder getInfosOrBuilder(int index);

      List<Integer> getBeautyIdListList();

      int getBeautyIdListCount();

      int getBeautyIdList(int index);

      List<Integer> getSkillListList();

      int getSkillListCount();

      int getSkillList(int index);
   }

   public interface S2C_ResetBeauty_9843OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);
   }

   public interface S2C_SaveCooperate_9833OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCooperate();

      CooperateInfo getCooperate();

      CooperateInfoOrBuilder getCooperateOrBuilder();
   }

   public interface S2C_SkillUpBeautyResult_9814OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();

      boolean hasSkillId();

      int getSkillId();

      boolean hasAssistantSkill();

      int getAssistantSkill();
   }

   public interface S2C_TrystBeautyResult_9808OrBuilder extends MessageOrBuilder {
      boolean hasBeautyId();

      int getBeautyId();

      boolean hasExpInfos();

      TrystExpInfo getExpInfos();

      TrystExpInfoOrBuilder getExpInfosOrBuilder();

      boolean hasTrystInfos();

      BeautyTrystInfo getTrystInfos();

      BeautyTrystInfoOrBuilder getTrystInfosOrBuilder();
   }

   public interface S2C_UnlockBeautyResult_9822OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      UnlockInfo getInfo();

      UnlockInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_UnlockInfoResult_9802OrBuilder extends MessageOrBuilder {
      List<UnlockInfo> getInfosList();

      UnlockInfo getInfos(int index);

      int getInfosCount();

      List<? extends UnlockInfoOrBuilder> getInfosOrBuilderList();

      UnlockInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface TrystExpInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasAddExp();

      int getAddExp();

      List<CommonMsg.PropertyInfo> getProtitiesList();

      CommonMsg.PropertyInfo getProtities(int index);

      int getProtitiesCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getProtitiesOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getProtitiesOrBuilder(int index);
   }

   public interface UnlockInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasState();

      int getState();

      boolean hasUnlockStep();

      int getUnlockStep();
   }
}
