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
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class WarHorseMsg {
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_LvUpItem_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_LvUpItem_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private WarHorseMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eWarHorse.proto\u0012\u001awarHorse.com.gzbz.protobuf\"\u0016\n\u0014C2S_OpenMainUi_13801\"\u0016\n\u0014S2C_OpenMainUi_13802\"9\n\u0013C2S_WearHorse_13803\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0002(\u0005\"7\n\u0013S2C_WearHorse_13804\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"*\n\u0016C2S_UndressHorse_13805\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\":\n\u0016S2C_UndressHorse_13806\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"i\n\u0013C2S_LockHorse_13807\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0003 \u0002(\u0005\"k\n\u0013S2C_LockHorse_13808\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0003 \u0002(\u0005\"\u0080\u0001\n\u0018C2S_LockHorseSkill_13809\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bposition\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0004 \u0002(\u0005\"\u0082\u0001\n\u0018S2C_LockHorseSkill_13810\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bposition\u0018\u0004 \u0002(\u0005\"'\n\bLvUpItem\u0012\u000e\n\u0006itemId\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"\u0097\u0001\n\u000eC2S_LvUp_13811\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\u00123\n\u0005items\u0018\u0004 \u0003(\u000b2$.warHorse.com.gzbz.protobuf.LvUpItem\"f\n\u000eS2C_LvUp_13812\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0003 \u0002(\u0005\"n\n\u000fC2S_Merge_13813\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u0010\n\bmainCode\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tslaveCode\u0018\u0003 \u0002(\u0005\"Ú\u0001\n\u000fS2C_Merge_13814\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bmainCode\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tslaveCode\u0018\u0004 \u0002(\u0005\u0012\u0017\n\u000fslaveSkillIndex\u0018\u0005 \u0002(\u0005\u0012\u0014\n\fslaveSkillId\u0018\u0006 \u0002(\u0005\u0012\u0016\n\u000emainSkillIndex\u0018\u0007 \u0002(\u0005\u0012\u0013\n\u000bmainSkillId\u0018\b \u0002(\u0005\"\u0083\u0001\n\u0012C2S_Artifice_13815\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u0010\n\bmainCode\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nslaveCodes\u0018\u0003 \u0003(\u0005\u0012\u000f\n\u0007itemNum\u0018\u0004 \u0001(\u0005\"\u0082\u0001\n\u0012S2C_Artifice_13816\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bmainCode\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nslaveCodes\u0018\u0004 \u0003(\u0005\"~\n\u0011C2S_Inherit_13817\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u0010\n\bmainCode\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tslaveCode\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0004 \u0001(\u0005\"\u008e\u0001\n\u0011S2C_Inherit_13818\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bmainCode\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tslaveCode\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0005 \u0001(\u0005\"7\n\u0016C2S_ComposeHorse_13831\u0012\u0010\n\bitemCode\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003num\u0018\u0002 \u0002(\u0005\"(\n\u0016S2C_ComposeHorse_13832\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_SacrificeInfo_13841\"\u0094\u0001\n\u0017S2C_SacrificeInfo_13842\u0012\u0016\n\u000esacrificeCount\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esacrificePoint\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bgotBoxes\u0018\u0003 \u0003(\u0005\u0012\u001a\n\u0012sacrificeFreeCount\u0018\u0004 \u0002(\u0005\u0012\u001b\n\u0013dailySacrificeCount\u0018\u0005 \u0002(\u0005\"%\n\u0015C2S_DoSacrifice_13843\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"Z\n\u0015S2C_DoSacrifice_13844\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esacrificeCount\u0018\u0002 \u0002(\u0005\u0012\u001b\n\u0013dailySacrificeCount\u0018\u0003 \u0002(\u0005\"*\n\u001cC2S_SacrificeBoxReward_13845\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"B\n\u001cS2C_SacrificeBoxReward_13846\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000esacrificePoint\u0018\u0002 \u0002(\u0005\"-\n\u001dC2S_SacrificeRecordList_13847\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"r\n\u001dS2C_SacrificeRecordList_13848\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012C\n\nrecordList\u0018\u0002 \u0003(\u000b2/.warHorse.com.gzbz.protobuf.SacrificeRecordData\"`\n\u0019S2C_SacrificeRecord_13850\u0012C\n\nrecordList\u0018\u0001 \u0003(\u000b2/.warHorse.com.gzbz.protobuf.SacrificeRecordData\"z\n\u0013SacrificeRecordData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\u0014\n\fresourceType\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nresourceId\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bresourceNum\u0018\u0005 \u0002(\u0005\"\u0012\n\u0010C2S_SkinUi_13861\"$\n\u0010S2C_SkinUi_13862\u0012\u0010\n\bhorseIds\u0018\u0001 \u0003(\u0005\"k\n\u0013C2S_HorseSkin_13863\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006skinId\u0018\u0003 \u0002(\u0005\"{\n\u0013S2C_HorseSkin_13864\u00126\n\bcodeType\u0018\u0001 \u0002(\u000e2$.warHorse.com.gzbz.protobuf.CodeType\u0012\u000e\n\u0006result\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006skinId\u0018\u0004 \u0002(\u0005\"\u0016\n\u0014C2S_WatchHorse_13871\"&\n\u0014S2C_WatchHorse_13872\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u0015\n\u0013C2S_UpdateIds_13873\"<\n\u0013S2C_UpdateIds_13874\u0012\u0013\n\u000bnewHorseIds\u0018\u0002 \u0003(\u0005\u0012\u0010\n\bhorseIds\u0018\u0001 \u0003(\u0005\";\n\u0015C2S_ChangeHorse_13881\u0012\u0010\n\bfromHero\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdestHero\u0018\u0002 \u0002(\u0005\";\n\u0015S2C_ChangeHorse_13882\u0012\u0010\n\bfromHero\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bdestHero\u0018\u0002 \u0002(\u0005\"$\n\u0010C2S_Awaken_13883\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"$\n\u0010S2C_Awaken_13884\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\";\n\u0016C2S_UseHorseItem_13885\u0012\u0010\n\bitemCode\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0002 \u0002(\u0005\";\n\u0016S2C_UseHorseItem_13886\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0011\n\thorseCode\u0018\u0002 \u0002(\u0005\"*\n\u0015C2S_HorseReback_13887\u0012\u0011\n\thorseCode\u0018\u0001 \u0002(\u0005\"'\n\u0015S2C_HorseReback_13888\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\b*1\n\bCodeType\u0012\u0012\n\u000eCODE_YPTE_HERO\u0010\u0001\u0012\u0011\n\rCODE_YPTE_BAG\u0010\u0002B\"\n\u0011com.gzbz.protobufB\u000bWarHorseMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_descriptor, new String[0]);
      internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_descriptor, new String[0]);
      internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_descriptor, new String[]{"HeroCode", "ItemCode"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_descriptor, new String[]{"Result", "HeroCode"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_descriptor, new String[]{"HeroCode"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_descriptor, new String[]{"Result", "HeroCode"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_descriptor, new String[]{"CodeType", "Code", "Type"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_descriptor, new String[]{"CodeType", "Result", "Code"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_descriptor, new String[]{"CodeType", "Code", "Position", "Type"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_descriptor, new String[]{"CodeType", "Result", "Code", "Position"});
      internal_static_warHorse_com_gzbz_protobuf_LvUpItem_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_warHorse_com_gzbz_protobuf_LvUpItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_LvUpItem_descriptor, new String[]{"ItemId", "Num"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_descriptor, new String[]{"CodeType", "Code", "Lv", "Items"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_descriptor, new String[]{"CodeType", "Result", "Code"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_descriptor, new String[]{"CodeType", "MainCode", "SlaveCode"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_descriptor, new String[]{"CodeType", "Result", "MainCode", "SlaveCode", "SlaveSkillIndex", "SlaveSkillId", "MainSkillIndex", "MainSkillId"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_descriptor, new String[]{"CodeType", "MainCode", "SlaveCodes", "ItemNum"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_descriptor, new String[]{"CodeType", "Result", "MainCode", "SlaveCodes"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_descriptor, new String[]{"CodeType", "MainCode", "SlaveCode", "Type"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_descriptor, new String[]{"CodeType", "Result", "MainCode", "SlaveCode", "Type"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_descriptor, new String[]{"ItemCode", "Num"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_descriptor, new String[]{"Result"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_descriptor, new String[0]);
      internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_descriptor, new String[]{"SacrificeCount", "SacrificePoint", "GotBoxes", "SacrificeFreeCount", "DailySacrificeCount"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_descriptor, new String[]{"Type"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_descriptor, new String[]{"Type", "SacrificeCount", "DailySacrificeCount"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_descriptor, new String[]{"Id"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_descriptor, new String[]{"Id", "SacrificePoint"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_descriptor, new String[]{"Type"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_descriptor, new String[]{"Type", "RecordList"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_descriptor, new String[]{"RecordList"});
      internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_descriptor, new String[]{"PlayerId", "PlayerName", "ResourceType", "ResourceId", "ResourceNum"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_descriptor, new String[0]);
      internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_descriptor, new String[]{"HorseIds"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_descriptor, new String[]{"CodeType", "Code", "SkinId"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_descriptor, new String[]{"CodeType", "Result", "Code", "SkinId"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_descriptor, new String[0]);
      internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_descriptor, new String[]{"Result"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_descriptor, new String[0]);
      internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_descriptor, new String[]{"NewHorseIds", "HorseIds"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_descriptor, new String[]{"FromHero", "DestHero"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_descriptor, new String[]{"FromHero", "DestHero"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(41);
      internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_descriptor, new String[]{"HeroCode"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(42);
      internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_descriptor, new String[]{"HeroCode"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(43);
      internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_descriptor, new String[]{"ItemCode", "SkillId"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(44);
      internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_descriptor, new String[]{"Result", "HorseCode"});
      internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(45);
      internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_descriptor, new String[]{"HorseCode"});
      internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(46);
      internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_descriptor, new String[]{"Result"});
   }

   public static enum CodeType implements ProtocolMessageEnum {
      CODE_YPTE_HERO(1),
      CODE_YPTE_BAG(2);

      public static final int CODE_YPTE_HERO_VALUE = 1;
      public static final int CODE_YPTE_BAG_VALUE = 2;
      private static final Internal.EnumLiteMap<CodeType> internalValueMap = new Internal.EnumLiteMap<CodeType>() {
         public CodeType findValueByNumber(int number) {
            return WarHorseMsg.CodeType.forNumber(number);
         }
      };
      private static final CodeType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static CodeType valueOf(int value) {
         return forNumber(value);
      }

      public static CodeType forNumber(int value) {
         switch (value) {
            case 1:
               return CODE_YPTE_HERO;
            case 2:
               return CODE_YPTE_BAG;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CodeType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)WarHorseMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static CodeType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private CodeType(int value) {
         this.value = value;
      }
   }

   public static final class C2S_OpenMainUi_13801 extends GeneratedMessageV3 implements C2S_OpenMainUi_13801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenMainUi_13801 DEFAULT_INSTANCE = new C2S_OpenMainUi_13801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenMainUi_13801> PARSER = new AbstractParser<C2S_OpenMainUi_13801>() {
         public C2S_OpenMainUi_13801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenMainUi_13801(input, extensionRegistry);
         }
      };

      private C2S_OpenMainUi_13801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenMainUi_13801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenMainUi_13801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenMainUi_13801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenMainUi_13801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenMainUi_13801)) {
            return super.equals(obj);
         } else {
            C2S_OpenMainUi_13801 other = (C2S_OpenMainUi_13801)obj;
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

      public static C2S_OpenMainUi_13801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_13801)PARSER.parseFrom(data);
      }

      public static C2S_OpenMainUi_13801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_13801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMainUi_13801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_13801)PARSER.parseFrom(data);
      }

      public static C2S_OpenMainUi_13801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_13801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMainUi_13801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_13801)PARSER.parseFrom(data);
      }

      public static C2S_OpenMainUi_13801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_13801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMainUi_13801 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenMainUi_13801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenMainUi_13801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMainUi_13801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenMainUi_13801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenMainUi_13801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenMainUi_13801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMainUi_13801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenMainUi_13801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenMainUi_13801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenMainUi_13801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMainUi_13801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenMainUi_13801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenMainUi_13801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenMainUi_13801> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenMainUi_13801> getParserForType() {
         return PARSER;
      }

      public C2S_OpenMainUi_13801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenMainUi_13801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenMainUi_13801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_OpenMainUi_13801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_OpenMainUi_13801_descriptor;
         }

         public C2S_OpenMainUi_13801 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_OpenMainUi_13801.getDefaultInstance();
         }

         public C2S_OpenMainUi_13801 build() {
            C2S_OpenMainUi_13801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenMainUi_13801 buildPartial() {
            C2S_OpenMainUi_13801 result = new C2S_OpenMainUi_13801(this);
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
            if (other instanceof C2S_OpenMainUi_13801) {
               return this.mergeFrom((C2S_OpenMainUi_13801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenMainUi_13801 other) {
            if (other == WarHorseMsg.C2S_OpenMainUi_13801.getDefaultInstance()) {
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
            C2S_OpenMainUi_13801 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenMainUi_13801)WarHorseMsg.C2S_OpenMainUi_13801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenMainUi_13801)e.getUnfinishedMessage();
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

   public static final class S2C_OpenMainUi_13802 extends GeneratedMessageV3 implements S2C_OpenMainUi_13802OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_OpenMainUi_13802 DEFAULT_INSTANCE = new S2C_OpenMainUi_13802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenMainUi_13802> PARSER = new AbstractParser<S2C_OpenMainUi_13802>() {
         public S2C_OpenMainUi_13802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenMainUi_13802(input, extensionRegistry);
         }
      };

      private S2C_OpenMainUi_13802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenMainUi_13802() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenMainUi_13802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenMainUi_13802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenMainUi_13802.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenMainUi_13802)) {
            return super.equals(obj);
         } else {
            S2C_OpenMainUi_13802 other = (S2C_OpenMainUi_13802)obj;
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

      public static S2C_OpenMainUi_13802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_13802)PARSER.parseFrom(data);
      }

      public static S2C_OpenMainUi_13802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_13802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMainUi_13802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_13802)PARSER.parseFrom(data);
      }

      public static S2C_OpenMainUi_13802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_13802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMainUi_13802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_13802)PARSER.parseFrom(data);
      }

      public static S2C_OpenMainUi_13802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_13802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMainUi_13802 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenMainUi_13802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenMainUi_13802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMainUi_13802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenMainUi_13802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenMainUi_13802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenMainUi_13802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMainUi_13802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenMainUi_13802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenMainUi_13802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenMainUi_13802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMainUi_13802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenMainUi_13802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenMainUi_13802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenMainUi_13802> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenMainUi_13802> getParserForType() {
         return PARSER;
      }

      public S2C_OpenMainUi_13802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenMainUi_13802OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenMainUi_13802.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_OpenMainUi_13802.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_OpenMainUi_13802_descriptor;
         }

         public S2C_OpenMainUi_13802 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_OpenMainUi_13802.getDefaultInstance();
         }

         public S2C_OpenMainUi_13802 build() {
            S2C_OpenMainUi_13802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenMainUi_13802 buildPartial() {
            S2C_OpenMainUi_13802 result = new S2C_OpenMainUi_13802(this);
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
            if (other instanceof S2C_OpenMainUi_13802) {
               return this.mergeFrom((S2C_OpenMainUi_13802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenMainUi_13802 other) {
            if (other == WarHorseMsg.S2C_OpenMainUi_13802.getDefaultInstance()) {
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
            S2C_OpenMainUi_13802 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenMainUi_13802)WarHorseMsg.S2C_OpenMainUi_13802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenMainUi_13802)e.getUnfinishedMessage();
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

   public static final class C2S_WearHorse_13803 extends GeneratedMessageV3 implements C2S_WearHorse_13803OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_WearHorse_13803 DEFAULT_INSTANCE = new C2S_WearHorse_13803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WearHorse_13803> PARSER = new AbstractParser<C2S_WearHorse_13803>() {
         public C2S_WearHorse_13803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WearHorse_13803(input, extensionRegistry);
         }
      };

      private C2S_WearHorse_13803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WearHorse_13803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WearHorse_13803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WearHorse_13803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearHorse_13803.class, Builder.class);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WearHorse_13803)) {
            return super.equals(obj);
         } else {
            C2S_WearHorse_13803 other = (C2S_WearHorse_13803)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WearHorse_13803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WearHorse_13803)PARSER.parseFrom(data);
      }

      public static C2S_WearHorse_13803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearHorse_13803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearHorse_13803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WearHorse_13803)PARSER.parseFrom(data);
      }

      public static C2S_WearHorse_13803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearHorse_13803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearHorse_13803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WearHorse_13803)PARSER.parseFrom(data);
      }

      public static C2S_WearHorse_13803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearHorse_13803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearHorse_13803 parseFrom(InputStream input) throws IOException {
         return (C2S_WearHorse_13803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearHorse_13803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearHorse_13803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearHorse_13803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WearHorse_13803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WearHorse_13803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearHorse_13803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearHorse_13803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WearHorse_13803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearHorse_13803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearHorse_13803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WearHorse_13803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WearHorse_13803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WearHorse_13803> parser() {
         return PARSER;
      }

      public Parser<C2S_WearHorse_13803> getParserForType() {
         return PARSER;
      }

      public C2S_WearHorse_13803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WearHorse_13803OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearHorse_13803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_WearHorse_13803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WearHorse_13803_descriptor;
         }

         public C2S_WearHorse_13803 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_WearHorse_13803.getDefaultInstance();
         }

         public C2S_WearHorse_13803 build() {
            C2S_WearHorse_13803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WearHorse_13803 buildPartial() {
            C2S_WearHorse_13803 result = new C2S_WearHorse_13803(this);
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
            if (other instanceof C2S_WearHorse_13803) {
               return this.mergeFrom((C2S_WearHorse_13803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WearHorse_13803 other) {
            if (other == WarHorseMsg.C2S_WearHorse_13803.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
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
            } else {
               return this.hasItemCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WearHorse_13803 parsedMessage = null;

            try {
               parsedMessage = (C2S_WearHorse_13803)WarHorseMsg.C2S_WearHorse_13803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WearHorse_13803)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_WearHorse_13804 extends GeneratedMessageV3 implements S2C_WearHorse_13804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final S2C_WearHorse_13804 DEFAULT_INSTANCE = new S2C_WearHorse_13804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WearHorse_13804> PARSER = new AbstractParser<S2C_WearHorse_13804>() {
         public S2C_WearHorse_13804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WearHorse_13804(input, extensionRegistry);
         }
      };

      private S2C_WearHorse_13804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WearHorse_13804() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WearHorse_13804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WearHorse_13804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearHorse_13804.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
         } else if (!this.hasResult()) {
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
            output.writeInt32(1, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
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
         } else if (!(obj instanceof S2C_WearHorse_13804)) {
            return super.equals(obj);
         } else {
            S2C_WearHorse_13804 other = (S2C_WearHorse_13804)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
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

      public static S2C_WearHorse_13804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WearHorse_13804)PARSER.parseFrom(data);
      }

      public static S2C_WearHorse_13804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearHorse_13804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearHorse_13804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WearHorse_13804)PARSER.parseFrom(data);
      }

      public static S2C_WearHorse_13804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearHorse_13804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearHorse_13804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WearHorse_13804)PARSER.parseFrom(data);
      }

      public static S2C_WearHorse_13804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearHorse_13804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearHorse_13804 parseFrom(InputStream input) throws IOException {
         return (S2C_WearHorse_13804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearHorse_13804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearHorse_13804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearHorse_13804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WearHorse_13804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WearHorse_13804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearHorse_13804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearHorse_13804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WearHorse_13804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearHorse_13804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearHorse_13804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WearHorse_13804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WearHorse_13804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WearHorse_13804> parser() {
         return PARSER;
      }

      public Parser<S2C_WearHorse_13804> getParserForType() {
         return PARSER;
      }

      public S2C_WearHorse_13804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WearHorse_13804OrBuilder {
         private int bitField0_;
         private int result_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearHorse_13804.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_WearHorse_13804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WearHorse_13804_descriptor;
         }

         public S2C_WearHorse_13804 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_WearHorse_13804.getDefaultInstance();
         }

         public S2C_WearHorse_13804 build() {
            S2C_WearHorse_13804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WearHorse_13804 buildPartial() {
            S2C_WearHorse_13804 result = new S2C_WearHorse_13804(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_WearHorse_13804) {
               return this.mergeFrom((S2C_WearHorse_13804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WearHorse_13804 other) {
            if (other == WarHorseMsg.S2C_WearHorse_13804.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WearHorse_13804 parsedMessage = null;

            try {
               parsedMessage = (S2C_WearHorse_13804)WarHorseMsg.S2C_WearHorse_13804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WearHorse_13804)e.getUnfinishedMessage();
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

   public static final class C2S_UndressHorse_13805 extends GeneratedMessageV3 implements C2S_UndressHorse_13805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_UndressHorse_13805 DEFAULT_INSTANCE = new C2S_UndressHorse_13805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UndressHorse_13805> PARSER = new AbstractParser<C2S_UndressHorse_13805>() {
         public C2S_UndressHorse_13805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UndressHorse_13805(input, extensionRegistry);
         }
      };

      private C2S_UndressHorse_13805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UndressHorse_13805() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UndressHorse_13805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UndressHorse_13805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressHorse_13805.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UndressHorse_13805)) {
            return super.equals(obj);
         } else {
            C2S_UndressHorse_13805 other = (C2S_UndressHorse_13805)obj;
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

      public static C2S_UndressHorse_13805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UndressHorse_13805)PARSER.parseFrom(data);
      }

      public static C2S_UndressHorse_13805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressHorse_13805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressHorse_13805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UndressHorse_13805)PARSER.parseFrom(data);
      }

      public static C2S_UndressHorse_13805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressHorse_13805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressHorse_13805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UndressHorse_13805)PARSER.parseFrom(data);
      }

      public static C2S_UndressHorse_13805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressHorse_13805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressHorse_13805 parseFrom(InputStream input) throws IOException {
         return (C2S_UndressHorse_13805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressHorse_13805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressHorse_13805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressHorse_13805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UndressHorse_13805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UndressHorse_13805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressHorse_13805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressHorse_13805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UndressHorse_13805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressHorse_13805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressHorse_13805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UndressHorse_13805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UndressHorse_13805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UndressHorse_13805> parser() {
         return PARSER;
      }

      public Parser<C2S_UndressHorse_13805> getParserForType() {
         return PARSER;
      }

      public C2S_UndressHorse_13805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UndressHorse_13805OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressHorse_13805.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_UndressHorse_13805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UndressHorse_13805_descriptor;
         }

         public C2S_UndressHorse_13805 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_UndressHorse_13805.getDefaultInstance();
         }

         public C2S_UndressHorse_13805 build() {
            C2S_UndressHorse_13805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UndressHorse_13805 buildPartial() {
            C2S_UndressHorse_13805 result = new C2S_UndressHorse_13805(this);
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
            if (other instanceof C2S_UndressHorse_13805) {
               return this.mergeFrom((C2S_UndressHorse_13805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UndressHorse_13805 other) {
            if (other == WarHorseMsg.C2S_UndressHorse_13805.getDefaultInstance()) {
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
            C2S_UndressHorse_13805 parsedMessage = null;

            try {
               parsedMessage = (C2S_UndressHorse_13805)WarHorseMsg.C2S_UndressHorse_13805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UndressHorse_13805)e.getUnfinishedMessage();
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

   public static final class S2C_UndressHorse_13806 extends GeneratedMessageV3 implements S2C_UndressHorse_13806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final S2C_UndressHorse_13806 DEFAULT_INSTANCE = new S2C_UndressHorse_13806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UndressHorse_13806> PARSER = new AbstractParser<S2C_UndressHorse_13806>() {
         public S2C_UndressHorse_13806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UndressHorse_13806(input, extensionRegistry);
         }
      };

      private S2C_UndressHorse_13806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UndressHorse_13806() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UndressHorse_13806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UndressHorse_13806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressHorse_13806.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
         } else if (!this.hasResult()) {
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
            output.writeInt32(1, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.result_);
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
         } else if (!(obj instanceof S2C_UndressHorse_13806)) {
            return super.equals(obj);
         } else {
            S2C_UndressHorse_13806 other = (S2C_UndressHorse_13806)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
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

      public static S2C_UndressHorse_13806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UndressHorse_13806)PARSER.parseFrom(data);
      }

      public static S2C_UndressHorse_13806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressHorse_13806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressHorse_13806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UndressHorse_13806)PARSER.parseFrom(data);
      }

      public static S2C_UndressHorse_13806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressHorse_13806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressHorse_13806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UndressHorse_13806)PARSER.parseFrom(data);
      }

      public static S2C_UndressHorse_13806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressHorse_13806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressHorse_13806 parseFrom(InputStream input) throws IOException {
         return (S2C_UndressHorse_13806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressHorse_13806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressHorse_13806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressHorse_13806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UndressHorse_13806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UndressHorse_13806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressHorse_13806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressHorse_13806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UndressHorse_13806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressHorse_13806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressHorse_13806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UndressHorse_13806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UndressHorse_13806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UndressHorse_13806> parser() {
         return PARSER;
      }

      public Parser<S2C_UndressHorse_13806> getParserForType() {
         return PARSER;
      }

      public S2C_UndressHorse_13806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UndressHorse_13806OrBuilder {
         private int bitField0_;
         private int result_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressHorse_13806.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_UndressHorse_13806.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UndressHorse_13806_descriptor;
         }

         public S2C_UndressHorse_13806 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_UndressHorse_13806.getDefaultInstance();
         }

         public S2C_UndressHorse_13806 build() {
            S2C_UndressHorse_13806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UndressHorse_13806 buildPartial() {
            S2C_UndressHorse_13806 result = new S2C_UndressHorse_13806(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_UndressHorse_13806) {
               return this.mergeFrom((S2C_UndressHorse_13806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UndressHorse_13806 other) {
            if (other == WarHorseMsg.S2C_UndressHorse_13806.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            if (!this.hasResult()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UndressHorse_13806 parsedMessage = null;

            try {
               parsedMessage = (S2C_UndressHorse_13806)WarHorseMsg.S2C_UndressHorse_13806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UndressHorse_13806)e.getUnfinishedMessage();
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

   public static final class C2S_LockHorse_13807 extends GeneratedMessageV3 implements C2S_LockHorse_13807OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int TYPE_FIELD_NUMBER = 3;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_LockHorse_13807 DEFAULT_INSTANCE = new C2S_LockHorse_13807();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LockHorse_13807> PARSER = new AbstractParser<C2S_LockHorse_13807>() {
         public C2S_LockHorse_13807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LockHorse_13807(input, extensionRegistry);
         }
      };

      private C2S_LockHorse_13807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LockHorse_13807() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LockHorse_13807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LockHorse_13807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LockHorse_13807.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
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
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LockHorse_13807)) {
            return super.equals(obj);
         } else {
            C2S_LockHorse_13807 other = (C2S_LockHorse_13807)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LockHorse_13807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LockHorse_13807)PARSER.parseFrom(data);
      }

      public static C2S_LockHorse_13807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockHorse_13807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockHorse_13807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LockHorse_13807)PARSER.parseFrom(data);
      }

      public static C2S_LockHorse_13807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockHorse_13807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockHorse_13807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LockHorse_13807)PARSER.parseFrom(data);
      }

      public static C2S_LockHorse_13807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockHorse_13807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockHorse_13807 parseFrom(InputStream input) throws IOException {
         return (C2S_LockHorse_13807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LockHorse_13807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockHorse_13807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LockHorse_13807 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LockHorse_13807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LockHorse_13807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockHorse_13807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LockHorse_13807 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LockHorse_13807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LockHorse_13807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockHorse_13807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LockHorse_13807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LockHorse_13807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LockHorse_13807> parser() {
         return PARSER;
      }

      public Parser<C2S_LockHorse_13807> getParserForType() {
         return PARSER;
      }

      public C2S_LockHorse_13807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LockHorse_13807OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int code_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LockHorse_13807.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_LockHorse_13807.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorse_13807_descriptor;
         }

         public C2S_LockHorse_13807 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_LockHorse_13807.getDefaultInstance();
         }

         public C2S_LockHorse_13807 build() {
            C2S_LockHorse_13807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LockHorse_13807 buildPartial() {
            C2S_LockHorse_13807 result = new C2S_LockHorse_13807(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_LockHorse_13807) {
               return this.mergeFrom((C2S_LockHorse_13807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LockHorse_13807 other) {
            if (other == WarHorseMsg.C2S_LockHorse_13807.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LockHorse_13807 parsedMessage = null;

            try {
               parsedMessage = (C2S_LockHorse_13807)WarHorseMsg.C2S_LockHorse_13807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LockHorse_13807)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 4;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -5;
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

   public static final class S2C_LockHorse_13808 extends GeneratedMessageV3 implements S2C_LockHorse_13808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 3;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2C_LockHorse_13808 DEFAULT_INSTANCE = new S2C_LockHorse_13808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LockHorse_13808> PARSER = new AbstractParser<S2C_LockHorse_13808>() {
         public S2C_LockHorse_13808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LockHorse_13808(input, extensionRegistry);
         }
      };

      private S2C_LockHorse_13808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LockHorse_13808() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LockHorse_13808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LockHorse_13808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LockHorse_13808.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
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
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.code_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LockHorse_13808)) {
            return super.equals(obj);
         } else {
            S2C_LockHorse_13808 other = (S2C_LockHorse_13808)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LockHorse_13808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LockHorse_13808)PARSER.parseFrom(data);
      }

      public static S2C_LockHorse_13808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockHorse_13808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockHorse_13808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LockHorse_13808)PARSER.parseFrom(data);
      }

      public static S2C_LockHorse_13808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockHorse_13808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockHorse_13808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LockHorse_13808)PARSER.parseFrom(data);
      }

      public static S2C_LockHorse_13808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockHorse_13808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockHorse_13808 parseFrom(InputStream input) throws IOException {
         return (S2C_LockHorse_13808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LockHorse_13808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockHorse_13808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LockHorse_13808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LockHorse_13808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LockHorse_13808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockHorse_13808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LockHorse_13808 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LockHorse_13808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LockHorse_13808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockHorse_13808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LockHorse_13808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LockHorse_13808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LockHorse_13808> parser() {
         return PARSER;
      }

      public Parser<S2C_LockHorse_13808> getParserForType() {
         return PARSER;
      }

      public S2C_LockHorse_13808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LockHorse_13808OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int result_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LockHorse_13808.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_LockHorse_13808.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorse_13808_descriptor;
         }

         public S2C_LockHorse_13808 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_LockHorse_13808.getDefaultInstance();
         }

         public S2C_LockHorse_13808 build() {
            S2C_LockHorse_13808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LockHorse_13808 buildPartial() {
            S2C_LockHorse_13808 result = new S2C_LockHorse_13808(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof S2C_LockHorse_13808) {
               return this.mergeFrom((S2C_LockHorse_13808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LockHorse_13808 other) {
            if (other == WarHorseMsg.S2C_LockHorse_13808.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LockHorse_13808 parsedMessage = null;

            try {
               parsedMessage = (S2C_LockHorse_13808)WarHorseMsg.S2C_LockHorse_13808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LockHorse_13808)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 2;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 4;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -5;
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

   public static final class C2S_LockHorseSkill_13809 extends GeneratedMessageV3 implements C2S_LockHorseSkill_13809OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      public static final int TYPE_FIELD_NUMBER = 4;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_LockHorseSkill_13809 DEFAULT_INSTANCE = new C2S_LockHorseSkill_13809();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LockHorseSkill_13809> PARSER = new AbstractParser<C2S_LockHorseSkill_13809>() {
         public C2S_LockHorseSkill_13809 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LockHorseSkill_13809(input, extensionRegistry);
         }
      };

      private C2S_LockHorseSkill_13809(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LockHorseSkill_13809() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LockHorseSkill_13809();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LockHorseSkill_13809(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.position_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LockHorseSkill_13809.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
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
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.position_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.position_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LockHorseSkill_13809)) {
            return super.equals(obj);
         } else {
            C2S_LockHorseSkill_13809 other = (C2S_LockHorseSkill_13809)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPosition();
            }

            if (this.hasType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LockHorseSkill_13809 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LockHorseSkill_13809)PARSER.parseFrom(data);
      }

      public static C2S_LockHorseSkill_13809 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockHorseSkill_13809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockHorseSkill_13809 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LockHorseSkill_13809)PARSER.parseFrom(data);
      }

      public static C2S_LockHorseSkill_13809 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockHorseSkill_13809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockHorseSkill_13809 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LockHorseSkill_13809)PARSER.parseFrom(data);
      }

      public static C2S_LockHorseSkill_13809 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LockHorseSkill_13809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LockHorseSkill_13809 parseFrom(InputStream input) throws IOException {
         return (C2S_LockHorseSkill_13809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LockHorseSkill_13809 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockHorseSkill_13809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LockHorseSkill_13809 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LockHorseSkill_13809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LockHorseSkill_13809 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockHorseSkill_13809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LockHorseSkill_13809 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LockHorseSkill_13809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LockHorseSkill_13809 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LockHorseSkill_13809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LockHorseSkill_13809 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LockHorseSkill_13809 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LockHorseSkill_13809> parser() {
         return PARSER;
      }

      public Parser<C2S_LockHorseSkill_13809> getParserForType() {
         return PARSER;
      }

      public C2S_LockHorseSkill_13809 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LockHorseSkill_13809OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int code_;
         private int position_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LockHorseSkill_13809.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_LockHorseSkill_13809.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.position_ = 0;
            this.bitField0_ &= -5;
            this.type_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LockHorseSkill_13809_descriptor;
         }

         public C2S_LockHorseSkill_13809 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_LockHorseSkill_13809.getDefaultInstance();
         }

         public C2S_LockHorseSkill_13809 build() {
            C2S_LockHorseSkill_13809 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LockHorseSkill_13809 buildPartial() {
            C2S_LockHorseSkill_13809 result = new C2S_LockHorseSkill_13809(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.position_ = this.position_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_LockHorseSkill_13809) {
               return this.mergeFrom((C2S_LockHorseSkill_13809)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LockHorseSkill_13809 other) {
            if (other == WarHorseMsg.C2S_LockHorseSkill_13809.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
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
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else if (!this.hasPosition()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LockHorseSkill_13809 parsedMessage = null;

            try {
               parsedMessage = (C2S_LockHorseSkill_13809)WarHorseMsg.C2S_LockHorseSkill_13809.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LockHorseSkill_13809)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
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

         public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 8;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -9;
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

   public static final class S2C_LockHorseSkill_13810 extends GeneratedMessageV3 implements S2C_LockHorseSkill_13810OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 3;
      private int code_;
      public static final int POSITION_FIELD_NUMBER = 4;
      private int position_;
      private byte memoizedIsInitialized;
      private static final S2C_LockHorseSkill_13810 DEFAULT_INSTANCE = new S2C_LockHorseSkill_13810();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LockHorseSkill_13810> PARSER = new AbstractParser<S2C_LockHorseSkill_13810>() {
         public S2C_LockHorseSkill_13810 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LockHorseSkill_13810(input, extensionRegistry);
         }
      };

      private S2C_LockHorseSkill_13810(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LockHorseSkill_13810() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LockHorseSkill_13810();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LockHorseSkill_13810(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.code_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LockHorseSkill_13810.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
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
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.code_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.position_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.code_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LockHorseSkill_13810)) {
            return super.equals(obj);
         } else {
            S2C_LockHorseSkill_13810 other = (S2C_LockHorseSkill_13810)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPosition();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LockHorseSkill_13810 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LockHorseSkill_13810)PARSER.parseFrom(data);
      }

      public static S2C_LockHorseSkill_13810 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockHorseSkill_13810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockHorseSkill_13810 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LockHorseSkill_13810)PARSER.parseFrom(data);
      }

      public static S2C_LockHorseSkill_13810 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockHorseSkill_13810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockHorseSkill_13810 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LockHorseSkill_13810)PARSER.parseFrom(data);
      }

      public static S2C_LockHorseSkill_13810 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LockHorseSkill_13810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LockHorseSkill_13810 parseFrom(InputStream input) throws IOException {
         return (S2C_LockHorseSkill_13810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LockHorseSkill_13810 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockHorseSkill_13810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LockHorseSkill_13810 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LockHorseSkill_13810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LockHorseSkill_13810 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockHorseSkill_13810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LockHorseSkill_13810 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LockHorseSkill_13810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LockHorseSkill_13810 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LockHorseSkill_13810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LockHorseSkill_13810 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LockHorseSkill_13810 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LockHorseSkill_13810> parser() {
         return PARSER;
      }

      public Parser<S2C_LockHorseSkill_13810> getParserForType() {
         return PARSER;
      }

      public S2C_LockHorseSkill_13810 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LockHorseSkill_13810OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int result_;
         private int code_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LockHorseSkill_13810.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_LockHorseSkill_13810.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.bitField0_ &= -5;
            this.position_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LockHorseSkill_13810_descriptor;
         }

         public S2C_LockHorseSkill_13810 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_LockHorseSkill_13810.getDefaultInstance();
         }

         public S2C_LockHorseSkill_13810 build() {
            S2C_LockHorseSkill_13810 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LockHorseSkill_13810 buildPartial() {
            S2C_LockHorseSkill_13810 result = new S2C_LockHorseSkill_13810(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.position_ = this.position_;
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
            if (other instanceof S2C_LockHorseSkill_13810) {
               return this.mergeFrom((S2C_LockHorseSkill_13810)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LockHorseSkill_13810 other) {
            if (other == WarHorseMsg.S2C_LockHorseSkill_13810.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LockHorseSkill_13810 parsedMessage = null;

            try {
               parsedMessage = (S2C_LockHorseSkill_13810)WarHorseMsg.S2C_LockHorseSkill_13810.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LockHorseSkill_13810)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 2;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 4;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -5;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 8;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -9;
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

   public static final class LvUpItem extends GeneratedMessageV3 implements LvUpItemOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMID_FIELD_NUMBER = 1;
      private int itemId_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final LvUpItem DEFAULT_INSTANCE = new LvUpItem();
      /** @deprecated */
      @Deprecated
      public static final Parser<LvUpItem> PARSER = new AbstractParser<LvUpItem>() {
         public LvUpItem parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new LvUpItem(input, extensionRegistry);
         }
      };

      private LvUpItem(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private LvUpItem() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new LvUpItem();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private LvUpItem(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_LvUpItem_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_LvUpItem_fieldAccessorTable.ensureFieldAccessorsInitialized(LvUpItem.class, Builder.class);
      }

      public boolean hasItemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemId() {
         return this.itemId_;
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
         } else if (!this.hasItemId()) {
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
            output.writeInt32(1, this.itemId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemId_);
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
         } else if (!(obj instanceof LvUpItem)) {
            return super.equals(obj);
         } else {
            LvUpItem other = (LvUpItem)obj;
            if (this.hasItemId() != other.hasItemId()) {
               return false;
            } else if (this.hasItemId() && this.getItemId() != other.getItemId()) {
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
            if (this.hasItemId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemId();
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

      public static LvUpItem parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (LvUpItem)PARSER.parseFrom(data);
      }

      public static LvUpItem parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LvUpItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LvUpItem parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (LvUpItem)PARSER.parseFrom(data);
      }

      public static LvUpItem parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LvUpItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LvUpItem parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (LvUpItem)PARSER.parseFrom(data);
      }

      public static LvUpItem parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LvUpItem)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LvUpItem parseFrom(InputStream input) throws IOException {
         return (LvUpItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static LvUpItem parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LvUpItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static LvUpItem parseDelimitedFrom(InputStream input) throws IOException {
         return (LvUpItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static LvUpItem parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LvUpItem)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static LvUpItem parseFrom(CodedInputStream input) throws IOException {
         return (LvUpItem)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static LvUpItem parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LvUpItem)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(LvUpItem prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static LvUpItem getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<LvUpItem> parser() {
         return PARSER;
      }

      public Parser<LvUpItem> getParserForType() {
         return PARSER;
      }

      public LvUpItem getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LvUpItemOrBuilder {
         private int bitField0_;
         private int itemId_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_LvUpItem_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_LvUpItem_fieldAccessorTable.ensureFieldAccessorsInitialized(LvUpItem.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.LvUpItem.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemId_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_LvUpItem_descriptor;
         }

         public LvUpItem getDefaultInstanceForType() {
            return WarHorseMsg.LvUpItem.getDefaultInstance();
         }

         public LvUpItem build() {
            LvUpItem result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public LvUpItem buildPartial() {
            LvUpItem result = new LvUpItem(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemId_ = this.itemId_;
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
            if (other instanceof LvUpItem) {
               return this.mergeFrom((LvUpItem)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(LvUpItem other) {
            if (other == WarHorseMsg.LvUpItem.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemId()) {
                  this.setItemId(other.getItemId());
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
            if (!this.hasItemId()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            LvUpItem parsedMessage = null;

            try {
               parsedMessage = (LvUpItem)WarHorseMsg.LvUpItem.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (LvUpItem)e.getUnfinishedMessage();
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

   public static final class C2S_LvUp_13811 extends GeneratedMessageV3 implements C2S_LvUp_13811OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int ITEMS_FIELD_NUMBER = 4;
      private List<LvUpItem> items_;
      private byte memoizedIsInitialized;
      private static final C2S_LvUp_13811 DEFAULT_INSTANCE = new C2S_LvUp_13811();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LvUp_13811> PARSER = new AbstractParser<C2S_LvUp_13811>() {
         public C2S_LvUp_13811 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LvUp_13811(input, extensionRegistry);
         }
      };

      private C2S_LvUp_13811(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LvUp_13811() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LvUp_13811();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LvUp_13811(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lv_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.items_.add(input.readMessage(WarHorseMsg.LvUpItem.PARSER, extensionRegistry));
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
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LvUp_13811.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public List<LvUpItem> getItemsList() {
         return this.items_;
      }

      public List<? extends LvUpItemOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public LvUpItem getItems(int index) {
         return (LvUpItem)this.items_.get(index);
      }

      public LvUpItemOrBuilder getItemsOrBuilder(int index) {
         return (LvUpItemOrBuilder)this.items_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.items_.get(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.items_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LvUp_13811)) {
            return super.equals(obj);
         } else {
            C2S_LvUp_13811 other = (C2S_LvUp_13811)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (!this.getItemsList().equals(other.getItemsList())) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LvUp_13811 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LvUp_13811)PARSER.parseFrom(data);
      }

      public static C2S_LvUp_13811 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LvUp_13811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LvUp_13811 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LvUp_13811)PARSER.parseFrom(data);
      }

      public static C2S_LvUp_13811 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LvUp_13811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LvUp_13811 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LvUp_13811)PARSER.parseFrom(data);
      }

      public static C2S_LvUp_13811 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LvUp_13811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LvUp_13811 parseFrom(InputStream input) throws IOException {
         return (C2S_LvUp_13811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LvUp_13811 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LvUp_13811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LvUp_13811 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LvUp_13811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LvUp_13811 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LvUp_13811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LvUp_13811 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LvUp_13811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LvUp_13811 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LvUp_13811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LvUp_13811 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LvUp_13811 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LvUp_13811> parser() {
         return PARSER;
      }

      public Parser<C2S_LvUp_13811> getParserForType() {
         return PARSER;
      }

      public C2S_LvUp_13811 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LvUp_13811OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int code_;
         private int lv_;
         private List<LvUpItem> items_;
         private RepeatedFieldBuilderV3<LvUpItem, LvUpItem.Builder, LvUpItemOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LvUp_13811.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_LvUp_13811.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_LvUp_13811_descriptor;
         }

         public C2S_LvUp_13811 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_LvUp_13811.getDefaultInstance();
         }

         public C2S_LvUp_13811 build() {
            C2S_LvUp_13811 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LvUp_13811 buildPartial() {
            C2S_LvUp_13811 result = new C2S_LvUp_13811(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 4;
            }

            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -9;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
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
            if (other instanceof C2S_LvUp_13811) {
               return this.mergeFrom((C2S_LvUp_13811)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LvUp_13811 other) {
            if (other == WarHorseMsg.C2S_LvUp_13811.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -9;
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
                     this.bitField0_ &= -9;
                     this.itemsBuilder_ = WarHorseMsg.C2S_LvUp_13811.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
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
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemsCount(); ++i) {
                  if (!this.getItems(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LvUp_13811 parsedMessage = null;

            try {
               parsedMessage = (C2S_LvUp_13811)WarHorseMsg.C2S_LvUp_13811.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LvUp_13811)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 4;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 8;
            }

         }

         public List<LvUpItem> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public LvUpItem getItems(int index) {
            return this.itemsBuilder_ == null ? (LvUpItem)this.items_.get(index) : (LvUpItem)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, LvUpItem value) {
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

         public Builder setItems(int index, LvUpItem.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(LvUpItem value) {
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

         public Builder addItems(int index, LvUpItem value) {
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

         public Builder addItems(LvUpItem.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, LvUpItem.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends LvUpItem> values) {
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
               this.bitField0_ &= -9;
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

         public LvUpItem.Builder getItemsBuilder(int index) {
            return (LvUpItem.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public LvUpItemOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (LvUpItemOrBuilder)this.items_.get(index) : (LvUpItemOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends LvUpItemOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public LvUpItem.Builder addItemsBuilder() {
            return (LvUpItem.Builder)this.getItemsFieldBuilder().addBuilder(WarHorseMsg.LvUpItem.getDefaultInstance());
         }

         public LvUpItem.Builder addItemsBuilder(int index) {
            return (LvUpItem.Builder)this.getItemsFieldBuilder().addBuilder(index, WarHorseMsg.LvUpItem.getDefaultInstance());
         }

         public List<LvUpItem.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<LvUpItem, LvUpItem.Builder, LvUpItemOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class S2C_LvUp_13812 extends GeneratedMessageV3 implements S2C_LvUp_13812OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 3;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2C_LvUp_13812 DEFAULT_INSTANCE = new S2C_LvUp_13812();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LvUp_13812> PARSER = new AbstractParser<S2C_LvUp_13812>() {
         public S2C_LvUp_13812 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LvUp_13812(input, extensionRegistry);
         }
      };

      private S2C_LvUp_13812(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LvUp_13812() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LvUp_13812();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LvUp_13812(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LvUp_13812.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
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
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.code_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LvUp_13812)) {
            return super.equals(obj);
         } else {
            S2C_LvUp_13812 other = (S2C_LvUp_13812)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LvUp_13812 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LvUp_13812)PARSER.parseFrom(data);
      }

      public static S2C_LvUp_13812 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LvUp_13812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LvUp_13812 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LvUp_13812)PARSER.parseFrom(data);
      }

      public static S2C_LvUp_13812 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LvUp_13812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LvUp_13812 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LvUp_13812)PARSER.parseFrom(data);
      }

      public static S2C_LvUp_13812 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LvUp_13812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LvUp_13812 parseFrom(InputStream input) throws IOException {
         return (S2C_LvUp_13812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LvUp_13812 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LvUp_13812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LvUp_13812 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LvUp_13812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LvUp_13812 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LvUp_13812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LvUp_13812 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LvUp_13812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LvUp_13812 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LvUp_13812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LvUp_13812 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LvUp_13812 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LvUp_13812> parser() {
         return PARSER;
      }

      public Parser<S2C_LvUp_13812> getParserForType() {
         return PARSER;
      }

      public S2C_LvUp_13812 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LvUp_13812OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int result_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LvUp_13812.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_LvUp_13812.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_LvUp_13812_descriptor;
         }

         public S2C_LvUp_13812 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_LvUp_13812.getDefaultInstance();
         }

         public S2C_LvUp_13812 build() {
            S2C_LvUp_13812 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LvUp_13812 buildPartial() {
            S2C_LvUp_13812 result = new S2C_LvUp_13812(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof S2C_LvUp_13812) {
               return this.mergeFrom((S2C_LvUp_13812)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LvUp_13812 other) {
            if (other == WarHorseMsg.S2C_LvUp_13812.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LvUp_13812 parsedMessage = null;

            try {
               parsedMessage = (S2C_LvUp_13812)WarHorseMsg.S2C_LvUp_13812.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LvUp_13812)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 2;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 4;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -5;
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

   public static final class C2S_Merge_13813 extends GeneratedMessageV3 implements C2S_Merge_13813OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int MAINCODE_FIELD_NUMBER = 2;
      private int mainCode_;
      public static final int SLAVECODE_FIELD_NUMBER = 3;
      private int slaveCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Merge_13813 DEFAULT_INSTANCE = new C2S_Merge_13813();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Merge_13813> PARSER = new AbstractParser<C2S_Merge_13813>() {
         public C2S_Merge_13813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Merge_13813(input, extensionRegistry);
         }
      };

      private C2S_Merge_13813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Merge_13813() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Merge_13813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Merge_13813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.mainCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.slaveCode_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Merge_13813.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public boolean hasSlaveCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSlaveCode() {
         return this.slaveCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.mainCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.slaveCode_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.mainCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.slaveCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Merge_13813)) {
            return super.equals(obj);
         } else {
            C2S_Merge_13813 other = (C2S_Merge_13813)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (this.hasSlaveCode() != other.hasSlaveCode()) {
               return false;
            } else if (this.hasSlaveCode() && this.getSlaveCode() != other.getSlaveCode()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasMainCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.hasSlaveCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSlaveCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Merge_13813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Merge_13813)PARSER.parseFrom(data);
      }

      public static C2S_Merge_13813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Merge_13813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Merge_13813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Merge_13813)PARSER.parseFrom(data);
      }

      public static C2S_Merge_13813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Merge_13813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Merge_13813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Merge_13813)PARSER.parseFrom(data);
      }

      public static C2S_Merge_13813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Merge_13813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Merge_13813 parseFrom(InputStream input) throws IOException {
         return (C2S_Merge_13813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Merge_13813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Merge_13813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Merge_13813 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Merge_13813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Merge_13813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Merge_13813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Merge_13813 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Merge_13813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Merge_13813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Merge_13813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Merge_13813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Merge_13813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Merge_13813> parser() {
         return PARSER;
      }

      public Parser<C2S_Merge_13813> getParserForType() {
         return PARSER;
      }

      public C2S_Merge_13813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Merge_13813OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int mainCode_;
         private int slaveCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Merge_13813.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_Merge_13813.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.mainCode_ = 0;
            this.bitField0_ &= -3;
            this.slaveCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Merge_13813_descriptor;
         }

         public C2S_Merge_13813 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_Merge_13813.getDefaultInstance();
         }

         public C2S_Merge_13813 build() {
            C2S_Merge_13813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Merge_13813 buildPartial() {
            C2S_Merge_13813 result = new C2S_Merge_13813(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.slaveCode_ = this.slaveCode_;
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
            if (other instanceof C2S_Merge_13813) {
               return this.mergeFrom((C2S_Merge_13813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Merge_13813 other) {
            if (other == WarHorseMsg.C2S_Merge_13813.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (other.hasSlaveCode()) {
                  this.setSlaveCode(other.getSlaveCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasMainCode()) {
               return false;
            } else {
               return this.hasSlaveCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Merge_13813 parsedMessage = null;

            try {
               parsedMessage = (C2S_Merge_13813)WarHorseMsg.C2S_Merge_13813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Merge_13813)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasMainCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 2;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -3;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSlaveCode() {
            return this.slaveCode_;
         }

         public Builder setSlaveCode(int value) {
            this.bitField0_ |= 4;
            this.slaveCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCode() {
            this.bitField0_ &= -5;
            this.slaveCode_ = 0;
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

   public static final class S2C_Merge_13814 extends GeneratedMessageV3 implements S2C_Merge_13814OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      public static final int MAINCODE_FIELD_NUMBER = 3;
      private int mainCode_;
      public static final int SLAVECODE_FIELD_NUMBER = 4;
      private int slaveCode_;
      public static final int SLAVESKILLINDEX_FIELD_NUMBER = 5;
      private int slaveSkillIndex_;
      public static final int SLAVESKILLID_FIELD_NUMBER = 6;
      private int slaveSkillId_;
      public static final int MAINSKILLINDEX_FIELD_NUMBER = 7;
      private int mainSkillIndex_;
      public static final int MAINSKILLID_FIELD_NUMBER = 8;
      private int mainSkillId_;
      private byte memoizedIsInitialized;
      private static final S2C_Merge_13814 DEFAULT_INSTANCE = new S2C_Merge_13814();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Merge_13814> PARSER = new AbstractParser<S2C_Merge_13814>() {
         public S2C_Merge_13814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Merge_13814(input, extensionRegistry);
         }
      };

      private S2C_Merge_13814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Merge_13814() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Merge_13814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Merge_13814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.mainCode_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.slaveCode_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.slaveSkillIndex_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.slaveSkillId_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.mainSkillIndex_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.mainSkillId_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Merge_13814.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public boolean hasSlaveCode() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSlaveCode() {
         return this.slaveCode_;
      }

      public boolean hasSlaveSkillIndex() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getSlaveSkillIndex() {
         return this.slaveSkillIndex_;
      }

      public boolean hasSlaveSkillId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getSlaveSkillId() {
         return this.slaveSkillId_;
      }

      public boolean hasMainSkillIndex() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getMainSkillIndex() {
         return this.mainSkillIndex_;
      }

      public boolean hasMainSkillId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getMainSkillId() {
         return this.mainSkillId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveSkillIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveSkillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMainSkillIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMainSkillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.mainCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.slaveCode_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.slaveSkillIndex_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.slaveSkillId_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.mainSkillIndex_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.mainSkillId_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.mainCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.slaveCode_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.slaveSkillIndex_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.slaveSkillId_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.mainSkillIndex_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.mainSkillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Merge_13814)) {
            return super.equals(obj);
         } else {
            S2C_Merge_13814 other = (S2C_Merge_13814)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (this.hasSlaveCode() != other.hasSlaveCode()) {
               return false;
            } else if (this.hasSlaveCode() && this.getSlaveCode() != other.getSlaveCode()) {
               return false;
            } else if (this.hasSlaveSkillIndex() != other.hasSlaveSkillIndex()) {
               return false;
            } else if (this.hasSlaveSkillIndex() && this.getSlaveSkillIndex() != other.getSlaveSkillIndex()) {
               return false;
            } else if (this.hasSlaveSkillId() != other.hasSlaveSkillId()) {
               return false;
            } else if (this.hasSlaveSkillId() && this.getSlaveSkillId() != other.getSlaveSkillId()) {
               return false;
            } else if (this.hasMainSkillIndex() != other.hasMainSkillIndex()) {
               return false;
            } else if (this.hasMainSkillIndex() && this.getMainSkillIndex() != other.getMainSkillIndex()) {
               return false;
            } else if (this.hasMainSkillId() != other.hasMainSkillId()) {
               return false;
            } else if (this.hasMainSkillId() && this.getMainSkillId() != other.getMainSkillId()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasMainCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.hasSlaveCode()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSlaveCode();
            }

            if (this.hasSlaveSkillIndex()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSlaveSkillIndex();
            }

            if (this.hasSlaveSkillId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getSlaveSkillId();
            }

            if (this.hasMainSkillIndex()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getMainSkillIndex();
            }

            if (this.hasMainSkillId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getMainSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Merge_13814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Merge_13814)PARSER.parseFrom(data);
      }

      public static S2C_Merge_13814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Merge_13814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Merge_13814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Merge_13814)PARSER.parseFrom(data);
      }

      public static S2C_Merge_13814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Merge_13814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Merge_13814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Merge_13814)PARSER.parseFrom(data);
      }

      public static S2C_Merge_13814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Merge_13814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Merge_13814 parseFrom(InputStream input) throws IOException {
         return (S2C_Merge_13814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Merge_13814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Merge_13814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Merge_13814 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Merge_13814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Merge_13814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Merge_13814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Merge_13814 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Merge_13814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Merge_13814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Merge_13814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Merge_13814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Merge_13814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Merge_13814> parser() {
         return PARSER;
      }

      public Parser<S2C_Merge_13814> getParserForType() {
         return PARSER;
      }

      public S2C_Merge_13814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Merge_13814OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int result_;
         private int mainCode_;
         private int slaveCode_;
         private int slaveSkillIndex_;
         private int slaveSkillId_;
         private int mainSkillIndex_;
         private int mainSkillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Merge_13814.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_Merge_13814.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.bitField0_ &= -3;
            this.mainCode_ = 0;
            this.bitField0_ &= -5;
            this.slaveCode_ = 0;
            this.bitField0_ &= -9;
            this.slaveSkillIndex_ = 0;
            this.bitField0_ &= -17;
            this.slaveSkillId_ = 0;
            this.bitField0_ &= -33;
            this.mainSkillIndex_ = 0;
            this.bitField0_ &= -65;
            this.mainSkillId_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Merge_13814_descriptor;
         }

         public S2C_Merge_13814 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_Merge_13814.getDefaultInstance();
         }

         public S2C_Merge_13814 build() {
            S2C_Merge_13814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Merge_13814 buildPartial() {
            S2C_Merge_13814 result = new S2C_Merge_13814(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.slaveCode_ = this.slaveCode_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.slaveSkillIndex_ = this.slaveSkillIndex_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.slaveSkillId_ = this.slaveSkillId_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.mainSkillIndex_ = this.mainSkillIndex_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.mainSkillId_ = this.mainSkillId_;
               to_bitField0_ |= 128;
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
            if (other instanceof S2C_Merge_13814) {
               return this.mergeFrom((S2C_Merge_13814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Merge_13814 other) {
            if (other == WarHorseMsg.S2C_Merge_13814.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (other.hasSlaveCode()) {
                  this.setSlaveCode(other.getSlaveCode());
               }

               if (other.hasSlaveSkillIndex()) {
                  this.setSlaveSkillIndex(other.getSlaveSkillIndex());
               }

               if (other.hasSlaveSkillId()) {
                  this.setSlaveSkillId(other.getSlaveSkillId());
               }

               if (other.hasMainSkillIndex()) {
                  this.setMainSkillIndex(other.getMainSkillIndex());
               }

               if (other.hasMainSkillId()) {
                  this.setMainSkillId(other.getMainSkillId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else if (!this.hasMainCode()) {
               return false;
            } else if (!this.hasSlaveCode()) {
               return false;
            } else if (!this.hasSlaveSkillIndex()) {
               return false;
            } else if (!this.hasSlaveSkillId()) {
               return false;
            } else if (!this.hasMainSkillIndex()) {
               return false;
            } else {
               return this.hasMainSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Merge_13814 parsedMessage = null;

            try {
               parsedMessage = (S2C_Merge_13814)WarHorseMsg.S2C_Merge_13814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Merge_13814)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 2;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMainCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 4;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -5;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveCode() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSlaveCode() {
            return this.slaveCode_;
         }

         public Builder setSlaveCode(int value) {
            this.bitField0_ |= 8;
            this.slaveCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCode() {
            this.bitField0_ &= -9;
            this.slaveCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveSkillIndex() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSlaveSkillIndex() {
            return this.slaveSkillIndex_;
         }

         public Builder setSlaveSkillIndex(int value) {
            this.bitField0_ |= 16;
            this.slaveSkillIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveSkillIndex() {
            this.bitField0_ &= -17;
            this.slaveSkillIndex_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveSkillId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getSlaveSkillId() {
            return this.slaveSkillId_;
         }

         public Builder setSlaveSkillId(int value) {
            this.bitField0_ |= 32;
            this.slaveSkillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveSkillId() {
            this.bitField0_ &= -33;
            this.slaveSkillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMainSkillIndex() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getMainSkillIndex() {
            return this.mainSkillIndex_;
         }

         public Builder setMainSkillIndex(int value) {
            this.bitField0_ |= 64;
            this.mainSkillIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainSkillIndex() {
            this.bitField0_ &= -65;
            this.mainSkillIndex_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMainSkillId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getMainSkillId() {
            return this.mainSkillId_;
         }

         public Builder setMainSkillId(int value) {
            this.bitField0_ |= 128;
            this.mainSkillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainSkillId() {
            this.bitField0_ &= -129;
            this.mainSkillId_ = 0;
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

   public static final class C2S_Artifice_13815 extends GeneratedMessageV3 implements C2S_Artifice_13815OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int MAINCODE_FIELD_NUMBER = 2;
      private int mainCode_;
      public static final int SLAVECODES_FIELD_NUMBER = 3;
      private Internal.IntList slaveCodes_;
      public static final int ITEMNUM_FIELD_NUMBER = 4;
      private int itemNum_;
      private byte memoizedIsInitialized;
      private static final C2S_Artifice_13815 DEFAULT_INSTANCE = new C2S_Artifice_13815();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Artifice_13815> PARSER = new AbstractParser<C2S_Artifice_13815>() {
         public C2S_Artifice_13815 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Artifice_13815(input, extensionRegistry);
         }
      };

      private C2S_Artifice_13815(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Artifice_13815() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
         this.slaveCodes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Artifice_13815();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Artifice_13815(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.mainCode_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.slaveCodes_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.slaveCodes_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.slaveCodes_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.itemNum_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.slaveCodes_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.slaveCodes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Artifice_13815.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public List<Integer> getSlaveCodesList() {
         return this.slaveCodes_;
      }

      public int getSlaveCodesCount() {
         return this.slaveCodes_.size();
      }

      public int getSlaveCodes(int index) {
         return this.slaveCodes_.getInt(index);
      }

      public boolean hasItemNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getItemNum() {
         return this.itemNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.mainCode_);
         }

         for(int i = 0; i < this.slaveCodes_.size(); ++i) {
            output.writeInt32(3, this.slaveCodes_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.itemNum_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.mainCode_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.slaveCodes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.slaveCodes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSlaveCodesList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.itemNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Artifice_13815)) {
            return super.equals(obj);
         } else {
            C2S_Artifice_13815 other = (C2S_Artifice_13815)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (!this.getSlaveCodesList().equals(other.getSlaveCodesList())) {
               return false;
            } else if (this.hasItemNum() != other.hasItemNum()) {
               return false;
            } else if (this.hasItemNum() && this.getItemNum() != other.getItemNum()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasMainCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.getSlaveCodesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSlaveCodesList().hashCode();
            }

            if (this.hasItemNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItemNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Artifice_13815 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Artifice_13815)PARSER.parseFrom(data);
      }

      public static C2S_Artifice_13815 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Artifice_13815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Artifice_13815 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Artifice_13815)PARSER.parseFrom(data);
      }

      public static C2S_Artifice_13815 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Artifice_13815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Artifice_13815 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Artifice_13815)PARSER.parseFrom(data);
      }

      public static C2S_Artifice_13815 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Artifice_13815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Artifice_13815 parseFrom(InputStream input) throws IOException {
         return (C2S_Artifice_13815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Artifice_13815 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Artifice_13815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Artifice_13815 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Artifice_13815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Artifice_13815 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Artifice_13815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Artifice_13815 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Artifice_13815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Artifice_13815 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Artifice_13815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Artifice_13815 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Artifice_13815 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Artifice_13815> parser() {
         return PARSER;
      }

      public Parser<C2S_Artifice_13815> getParserForType() {
         return PARSER;
      }

      public C2S_Artifice_13815 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Artifice_13815OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int mainCode_;
         private Internal.IntList slaveCodes_;
         private int itemNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Artifice_13815.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.slaveCodes_ = WarHorseMsg.C2S_Artifice_13815.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.slaveCodes_ = WarHorseMsg.C2S_Artifice_13815.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_Artifice_13815.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.mainCode_ = 0;
            this.bitField0_ &= -3;
            this.slaveCodes_ = WarHorseMsg.C2S_Artifice_13815.emptyIntList();
            this.bitField0_ &= -5;
            this.itemNum_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Artifice_13815_descriptor;
         }

         public C2S_Artifice_13815 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_Artifice_13815.getDefaultInstance();
         }

         public C2S_Artifice_13815 build() {
            C2S_Artifice_13815 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Artifice_13815 buildPartial() {
            C2S_Artifice_13815 result = new C2S_Artifice_13815(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.slaveCodes_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.slaveCodes_ = this.slaveCodes_;
            if ((from_bitField0_ & 8) != 0) {
               result.itemNum_ = this.itemNum_;
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
            if (other instanceof C2S_Artifice_13815) {
               return this.mergeFrom((C2S_Artifice_13815)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Artifice_13815 other) {
            if (other == WarHorseMsg.C2S_Artifice_13815.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (!other.slaveCodes_.isEmpty()) {
                  if (this.slaveCodes_.isEmpty()) {
                     this.slaveCodes_ = other.slaveCodes_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureSlaveCodesIsMutable();
                     this.slaveCodes_.addAll(other.slaveCodes_);
                  }

                  this.onChanged();
               }

               if (other.hasItemNum()) {
                  this.setItemNum(other.getItemNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCodeType()) {
               return false;
            } else {
               return this.hasMainCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Artifice_13815 parsedMessage = null;

            try {
               parsedMessage = (C2S_Artifice_13815)WarHorseMsg.C2S_Artifice_13815.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Artifice_13815)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasMainCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 2;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -3;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSlaveCodesIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.slaveCodes_ = WarHorseMsg.C2S_Artifice_13815.mutableCopy(this.slaveCodes_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getSlaveCodesList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.slaveCodes_) : this.slaveCodes_);
         }

         public int getSlaveCodesCount() {
            return this.slaveCodes_.size();
         }

         public int getSlaveCodes(int index) {
            return this.slaveCodes_.getInt(index);
         }

         public Builder setSlaveCodes(int index, int value) {
            this.ensureSlaveCodesIsMutable();
            this.slaveCodes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSlaveCodes(int value) {
            this.ensureSlaveCodesIsMutable();
            this.slaveCodes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSlaveCodes(Iterable<? extends Integer> values) {
            this.ensureSlaveCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.slaveCodes_);
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCodes() {
            this.slaveCodes_ = WarHorseMsg.C2S_Artifice_13815.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasItemNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getItemNum() {
            return this.itemNum_;
         }

         public Builder setItemNum(int value) {
            this.bitField0_ |= 8;
            this.itemNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemNum() {
            this.bitField0_ &= -9;
            this.itemNum_ = 0;
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

   public static final class S2C_Artifice_13816 extends GeneratedMessageV3 implements S2C_Artifice_13816OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      public static final int MAINCODE_FIELD_NUMBER = 3;
      private int mainCode_;
      public static final int SLAVECODES_FIELD_NUMBER = 4;
      private Internal.IntList slaveCodes_;
      private byte memoizedIsInitialized;
      private static final S2C_Artifice_13816 DEFAULT_INSTANCE = new S2C_Artifice_13816();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Artifice_13816> PARSER = new AbstractParser<S2C_Artifice_13816>() {
         public S2C_Artifice_13816 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Artifice_13816(input, extensionRegistry);
         }
      };

      private S2C_Artifice_13816(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Artifice_13816() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
         this.slaveCodes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Artifice_13816();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Artifice_13816(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.mainCode_ = input.readInt32();
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.slaveCodes_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.slaveCodes_.addInt(input.readInt32());
                        break;
                     case 34:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.slaveCodes_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.slaveCodes_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.slaveCodes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Artifice_13816.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public List<Integer> getSlaveCodesList() {
         return this.slaveCodes_;
      }

      public int getSlaveCodesCount() {
         return this.slaveCodes_.size();
      }

      public int getSlaveCodes(int index) {
         return this.slaveCodes_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.mainCode_);
         }

         for(int i = 0; i < this.slaveCodes_.size(); ++i) {
            output.writeInt32(4, this.slaveCodes_.getInt(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.mainCode_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.slaveCodes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.slaveCodes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSlaveCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Artifice_13816)) {
            return super.equals(obj);
         } else {
            S2C_Artifice_13816 other = (S2C_Artifice_13816)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (!this.getSlaveCodesList().equals(other.getSlaveCodesList())) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasMainCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.getSlaveCodesCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSlaveCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Artifice_13816 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Artifice_13816)PARSER.parseFrom(data);
      }

      public static S2C_Artifice_13816 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Artifice_13816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Artifice_13816 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Artifice_13816)PARSER.parseFrom(data);
      }

      public static S2C_Artifice_13816 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Artifice_13816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Artifice_13816 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Artifice_13816)PARSER.parseFrom(data);
      }

      public static S2C_Artifice_13816 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Artifice_13816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Artifice_13816 parseFrom(InputStream input) throws IOException {
         return (S2C_Artifice_13816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Artifice_13816 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Artifice_13816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Artifice_13816 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Artifice_13816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Artifice_13816 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Artifice_13816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Artifice_13816 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Artifice_13816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Artifice_13816 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Artifice_13816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Artifice_13816 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Artifice_13816 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Artifice_13816> parser() {
         return PARSER;
      }

      public Parser<S2C_Artifice_13816> getParserForType() {
         return PARSER;
      }

      public S2C_Artifice_13816 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Artifice_13816OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int result_;
         private int mainCode_;
         private Internal.IntList slaveCodes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Artifice_13816.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.slaveCodes_ = WarHorseMsg.S2C_Artifice_13816.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.slaveCodes_ = WarHorseMsg.S2C_Artifice_13816.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_Artifice_13816.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.bitField0_ &= -3;
            this.mainCode_ = 0;
            this.bitField0_ &= -5;
            this.slaveCodes_ = WarHorseMsg.S2C_Artifice_13816.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Artifice_13816_descriptor;
         }

         public S2C_Artifice_13816 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_Artifice_13816.getDefaultInstance();
         }

         public S2C_Artifice_13816 build() {
            S2C_Artifice_13816 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Artifice_13816 buildPartial() {
            S2C_Artifice_13816 result = new S2C_Artifice_13816(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.slaveCodes_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.slaveCodes_ = this.slaveCodes_;
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
            if (other instanceof S2C_Artifice_13816) {
               return this.mergeFrom((S2C_Artifice_13816)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Artifice_13816 other) {
            if (other == WarHorseMsg.S2C_Artifice_13816.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (!other.slaveCodes_.isEmpty()) {
                  if (this.slaveCodes_.isEmpty()) {
                     this.slaveCodes_ = other.slaveCodes_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureSlaveCodesIsMutable();
                     this.slaveCodes_.addAll(other.slaveCodes_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else {
               return this.hasMainCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Artifice_13816 parsedMessage = null;

            try {
               parsedMessage = (S2C_Artifice_13816)WarHorseMsg.S2C_Artifice_13816.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Artifice_13816)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 2;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMainCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 4;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -5;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSlaveCodesIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.slaveCodes_ = WarHorseMsg.S2C_Artifice_13816.mutableCopy(this.slaveCodes_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getSlaveCodesList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.slaveCodes_) : this.slaveCodes_);
         }

         public int getSlaveCodesCount() {
            return this.slaveCodes_.size();
         }

         public int getSlaveCodes(int index) {
            return this.slaveCodes_.getInt(index);
         }

         public Builder setSlaveCodes(int index, int value) {
            this.ensureSlaveCodesIsMutable();
            this.slaveCodes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSlaveCodes(int value) {
            this.ensureSlaveCodesIsMutable();
            this.slaveCodes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSlaveCodes(Iterable<? extends Integer> values) {
            this.ensureSlaveCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.slaveCodes_);
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCodes() {
            this.slaveCodes_ = WarHorseMsg.S2C_Artifice_13816.emptyIntList();
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

   public static final class C2S_Inherit_13817 extends GeneratedMessageV3 implements C2S_Inherit_13817OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int MAINCODE_FIELD_NUMBER = 2;
      private int mainCode_;
      public static final int SLAVECODE_FIELD_NUMBER = 3;
      private int slaveCode_;
      public static final int TYPE_FIELD_NUMBER = 4;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Inherit_13817 DEFAULT_INSTANCE = new C2S_Inherit_13817();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Inherit_13817> PARSER = new AbstractParser<C2S_Inherit_13817>() {
         public C2S_Inherit_13817 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Inherit_13817(input, extensionRegistry);
         }
      };

      private C2S_Inherit_13817(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Inherit_13817() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Inherit_13817();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Inherit_13817(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.mainCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.slaveCode_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Inherit_13817.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public boolean hasSlaveCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSlaveCode() {
         return this.slaveCode_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.mainCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.slaveCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.mainCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.slaveCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Inherit_13817)) {
            return super.equals(obj);
         } else {
            C2S_Inherit_13817 other = (C2S_Inherit_13817)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (this.hasSlaveCode() != other.hasSlaveCode()) {
               return false;
            } else if (this.hasSlaveCode() && this.getSlaveCode() != other.getSlaveCode()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasMainCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.hasSlaveCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSlaveCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Inherit_13817 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Inherit_13817)PARSER.parseFrom(data);
      }

      public static C2S_Inherit_13817 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Inherit_13817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Inherit_13817 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Inherit_13817)PARSER.parseFrom(data);
      }

      public static C2S_Inherit_13817 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Inherit_13817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Inherit_13817 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Inherit_13817)PARSER.parseFrom(data);
      }

      public static C2S_Inherit_13817 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Inherit_13817)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Inherit_13817 parseFrom(InputStream input) throws IOException {
         return (C2S_Inherit_13817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Inherit_13817 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Inherit_13817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Inherit_13817 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Inherit_13817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Inherit_13817 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Inherit_13817)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Inherit_13817 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Inherit_13817)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Inherit_13817 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Inherit_13817)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Inherit_13817 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Inherit_13817 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Inherit_13817> parser() {
         return PARSER;
      }

      public Parser<C2S_Inherit_13817> getParserForType() {
         return PARSER;
      }

      public C2S_Inherit_13817 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Inherit_13817OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int mainCode_;
         private int slaveCode_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Inherit_13817.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_Inherit_13817.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.mainCode_ = 0;
            this.bitField0_ &= -3;
            this.slaveCode_ = 0;
            this.bitField0_ &= -5;
            this.type_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Inherit_13817_descriptor;
         }

         public C2S_Inherit_13817 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_Inherit_13817.getDefaultInstance();
         }

         public C2S_Inherit_13817 build() {
            C2S_Inherit_13817 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Inherit_13817 buildPartial() {
            C2S_Inherit_13817 result = new C2S_Inherit_13817(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.slaveCode_ = this.slaveCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof C2S_Inherit_13817) {
               return this.mergeFrom((C2S_Inherit_13817)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Inherit_13817 other) {
            if (other == WarHorseMsg.C2S_Inherit_13817.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (other.hasSlaveCode()) {
                  this.setSlaveCode(other.getSlaveCode());
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
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasMainCode()) {
               return false;
            } else {
               return this.hasSlaveCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Inherit_13817 parsedMessage = null;

            try {
               parsedMessage = (C2S_Inherit_13817)WarHorseMsg.C2S_Inherit_13817.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Inherit_13817)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasMainCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 2;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -3;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSlaveCode() {
            return this.slaveCode_;
         }

         public Builder setSlaveCode(int value) {
            this.bitField0_ |= 4;
            this.slaveCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCode() {
            this.bitField0_ &= -5;
            this.slaveCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 8;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -9;
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

   public static final class S2C_Inherit_13818 extends GeneratedMessageV3 implements S2C_Inherit_13818OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      public static final int MAINCODE_FIELD_NUMBER = 3;
      private int mainCode_;
      public static final int SLAVECODE_FIELD_NUMBER = 4;
      private int slaveCode_;
      public static final int TYPE_FIELD_NUMBER = 5;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_Inherit_13818 DEFAULT_INSTANCE = new S2C_Inherit_13818();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Inherit_13818> PARSER = new AbstractParser<S2C_Inherit_13818>() {
         public S2C_Inherit_13818 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Inherit_13818(input, extensionRegistry);
         }
      };

      private S2C_Inherit_13818(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Inherit_13818() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Inherit_13818();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Inherit_13818(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.mainCode_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.slaveCode_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Inherit_13818.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasMainCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMainCode() {
         return this.mainCode_;
      }

      public boolean hasSlaveCode() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSlaveCode() {
         return this.slaveCode_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 16) != 0;
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
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMainCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.mainCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.slaveCode_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.mainCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.slaveCode_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Inherit_13818)) {
            return super.equals(obj);
         } else {
            S2C_Inherit_13818 other = (S2C_Inherit_13818)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasMainCode() != other.hasMainCode()) {
               return false;
            } else if (this.hasMainCode() && this.getMainCode() != other.getMainCode()) {
               return false;
            } else if (this.hasSlaveCode() != other.hasSlaveCode()) {
               return false;
            } else if (this.hasSlaveCode() && this.getSlaveCode() != other.getSlaveCode()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasMainCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMainCode();
            }

            if (this.hasSlaveCode()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSlaveCode();
            }

            if (this.hasType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Inherit_13818 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Inherit_13818)PARSER.parseFrom(data);
      }

      public static S2C_Inherit_13818 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Inherit_13818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Inherit_13818 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Inherit_13818)PARSER.parseFrom(data);
      }

      public static S2C_Inherit_13818 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Inherit_13818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Inherit_13818 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Inherit_13818)PARSER.parseFrom(data);
      }

      public static S2C_Inherit_13818 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Inherit_13818)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Inherit_13818 parseFrom(InputStream input) throws IOException {
         return (S2C_Inherit_13818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Inherit_13818 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Inherit_13818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Inherit_13818 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Inherit_13818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Inherit_13818 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Inherit_13818)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Inherit_13818 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Inherit_13818)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Inherit_13818 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Inherit_13818)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Inherit_13818 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Inherit_13818 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Inherit_13818> parser() {
         return PARSER;
      }

      public Parser<S2C_Inherit_13818> getParserForType() {
         return PARSER;
      }

      public S2C_Inherit_13818 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Inherit_13818OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int result_;
         private int mainCode_;
         private int slaveCode_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Inherit_13818.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_Inherit_13818.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.bitField0_ &= -3;
            this.mainCode_ = 0;
            this.bitField0_ &= -5;
            this.slaveCode_ = 0;
            this.bitField0_ &= -9;
            this.type_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Inherit_13818_descriptor;
         }

         public S2C_Inherit_13818 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_Inherit_13818.getDefaultInstance();
         }

         public S2C_Inherit_13818 build() {
            S2C_Inherit_13818 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Inherit_13818 buildPartial() {
            S2C_Inherit_13818 result = new S2C_Inherit_13818(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.mainCode_ = this.mainCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.slaveCode_ = this.slaveCode_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.type_ = this.type_;
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
            if (other instanceof S2C_Inherit_13818) {
               return this.mergeFrom((S2C_Inherit_13818)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Inherit_13818 other) {
            if (other == WarHorseMsg.S2C_Inherit_13818.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasMainCode()) {
                  this.setMainCode(other.getMainCode());
               }

               if (other.hasSlaveCode()) {
                  this.setSlaveCode(other.getSlaveCode());
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
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else if (!this.hasMainCode()) {
               return false;
            } else {
               return this.hasSlaveCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Inherit_13818 parsedMessage = null;

            try {
               parsedMessage = (S2C_Inherit_13818)WarHorseMsg.S2C_Inherit_13818.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Inherit_13818)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 2;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMainCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMainCode() {
            return this.mainCode_;
         }

         public Builder setMainCode(int value) {
            this.bitField0_ |= 4;
            this.mainCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainCode() {
            this.bitField0_ &= -5;
            this.mainCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveCode() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSlaveCode() {
            return this.slaveCode_;
         }

         public Builder setSlaveCode(int value) {
            this.bitField0_ |= 8;
            this.slaveCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveCode() {
            this.bitField0_ &= -9;
            this.slaveCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 16;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -17;
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

   public static final class C2S_ComposeHorse_13831 extends GeneratedMessageV3 implements C2S_ComposeHorse_13831OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private int itemCode_;
      public static final int NUM_FIELD_NUMBER = 2;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_ComposeHorse_13831 DEFAULT_INSTANCE = new C2S_ComposeHorse_13831();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ComposeHorse_13831> PARSER = new AbstractParser<C2S_ComposeHorse_13831>() {
         public C2S_ComposeHorse_13831 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ComposeHorse_13831(input, extensionRegistry);
         }
      };

      private C2S_ComposeHorse_13831(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ComposeHorse_13831() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ComposeHorse_13831();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ComposeHorse_13831(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ComposeHorse_13831.class, Builder.class);
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
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
         } else if (!this.hasItemCode()) {
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
            output.writeInt32(1, this.itemCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemCode_);
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
         } else if (!(obj instanceof C2S_ComposeHorse_13831)) {
            return super.equals(obj);
         } else {
            C2S_ComposeHorse_13831 other = (C2S_ComposeHorse_13831)obj;
            if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
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
            if (this.hasItemCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemCode();
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

      public static C2S_ComposeHorse_13831 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ComposeHorse_13831)PARSER.parseFrom(data);
      }

      public static C2S_ComposeHorse_13831 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeHorse_13831)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeHorse_13831 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ComposeHorse_13831)PARSER.parseFrom(data);
      }

      public static C2S_ComposeHorse_13831 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeHorse_13831)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeHorse_13831 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ComposeHorse_13831)PARSER.parseFrom(data);
      }

      public static C2S_ComposeHorse_13831 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeHorse_13831)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeHorse_13831 parseFrom(InputStream input) throws IOException {
         return (C2S_ComposeHorse_13831)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ComposeHorse_13831 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeHorse_13831)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ComposeHorse_13831 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ComposeHorse_13831)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ComposeHorse_13831 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeHorse_13831)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ComposeHorse_13831 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ComposeHorse_13831)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ComposeHorse_13831 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeHorse_13831)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ComposeHorse_13831 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ComposeHorse_13831 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ComposeHorse_13831> parser() {
         return PARSER;
      }

      public Parser<C2S_ComposeHorse_13831> getParserForType() {
         return PARSER;
      }

      public C2S_ComposeHorse_13831 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ComposeHorse_13831OrBuilder {
         private int bitField0_;
         private int itemCode_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ComposeHorse_13831.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_ComposeHorse_13831.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = 0;
            this.bitField0_ &= -2;
            this.num_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ComposeHorse_13831_descriptor;
         }

         public C2S_ComposeHorse_13831 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_ComposeHorse_13831.getDefaultInstance();
         }

         public C2S_ComposeHorse_13831 build() {
            C2S_ComposeHorse_13831 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ComposeHorse_13831 buildPartial() {
            C2S_ComposeHorse_13831 result = new C2S_ComposeHorse_13831(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemCode_ = this.itemCode_;
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
            if (other instanceof C2S_ComposeHorse_13831) {
               return this.mergeFrom((C2S_ComposeHorse_13831)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ComposeHorse_13831 other) {
            if (other == WarHorseMsg.C2S_ComposeHorse_13831.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
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
            if (!this.hasItemCode()) {
               return false;
            } else {
               return this.hasNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ComposeHorse_13831 parsedMessage = null;

            try {
               parsedMessage = (C2S_ComposeHorse_13831)WarHorseMsg.C2S_ComposeHorse_13831.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ComposeHorse_13831)e.getUnfinishedMessage();
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

   public static final class S2C_ComposeHorse_13832 extends GeneratedMessageV3 implements S2C_ComposeHorse_13832OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ComposeHorse_13832 DEFAULT_INSTANCE = new S2C_ComposeHorse_13832();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ComposeHorse_13832> PARSER = new AbstractParser<S2C_ComposeHorse_13832>() {
         public S2C_ComposeHorse_13832 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ComposeHorse_13832(input, extensionRegistry);
         }
      };

      private S2C_ComposeHorse_13832(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ComposeHorse_13832() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ComposeHorse_13832();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ComposeHorse_13832(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ComposeHorse_13832.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ComposeHorse_13832)) {
            return super.equals(obj);
         } else {
            S2C_ComposeHorse_13832 other = (S2C_ComposeHorse_13832)obj;
            if (this.hasResult() != other.hasResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ComposeHorse_13832 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ComposeHorse_13832)PARSER.parseFrom(data);
      }

      public static S2C_ComposeHorse_13832 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeHorse_13832)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeHorse_13832 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ComposeHorse_13832)PARSER.parseFrom(data);
      }

      public static S2C_ComposeHorse_13832 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeHorse_13832)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeHorse_13832 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ComposeHorse_13832)PARSER.parseFrom(data);
      }

      public static S2C_ComposeHorse_13832 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeHorse_13832)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeHorse_13832 parseFrom(InputStream input) throws IOException {
         return (S2C_ComposeHorse_13832)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ComposeHorse_13832 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeHorse_13832)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ComposeHorse_13832 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ComposeHorse_13832)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ComposeHorse_13832 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeHorse_13832)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ComposeHorse_13832 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ComposeHorse_13832)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ComposeHorse_13832 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeHorse_13832)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ComposeHorse_13832 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ComposeHorse_13832 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ComposeHorse_13832> parser() {
         return PARSER;
      }

      public Parser<S2C_ComposeHorse_13832> getParserForType() {
         return PARSER;
      }

      public S2C_ComposeHorse_13832 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ComposeHorse_13832OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ComposeHorse_13832.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_ComposeHorse_13832.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ComposeHorse_13832_descriptor;
         }

         public S2C_ComposeHorse_13832 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_ComposeHorse_13832.getDefaultInstance();
         }

         public S2C_ComposeHorse_13832 build() {
            S2C_ComposeHorse_13832 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ComposeHorse_13832 buildPartial() {
            S2C_ComposeHorse_13832 result = new S2C_ComposeHorse_13832(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_ComposeHorse_13832) {
               return this.mergeFrom((S2C_ComposeHorse_13832)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ComposeHorse_13832 other) {
            if (other == WarHorseMsg.S2C_ComposeHorse_13832.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            S2C_ComposeHorse_13832 parsedMessage = null;

            try {
               parsedMessage = (S2C_ComposeHorse_13832)WarHorseMsg.S2C_ComposeHorse_13832.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ComposeHorse_13832)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SacrificeInfo_13841 extends GeneratedMessageV3 implements C2S_SacrificeInfo_13841OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SacrificeInfo_13841 DEFAULT_INSTANCE = new C2S_SacrificeInfo_13841();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SacrificeInfo_13841> PARSER = new AbstractParser<C2S_SacrificeInfo_13841>() {
         public C2S_SacrificeInfo_13841 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SacrificeInfo_13841(input, extensionRegistry);
         }
      };

      private C2S_SacrificeInfo_13841(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SacrificeInfo_13841() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SacrificeInfo_13841();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SacrificeInfo_13841(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeInfo_13841.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SacrificeInfo_13841)) {
            return super.equals(obj);
         } else {
            C2S_SacrificeInfo_13841 other = (C2S_SacrificeInfo_13841)obj;
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

      public static C2S_SacrificeInfo_13841 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeInfo_13841)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeInfo_13841 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeInfo_13841)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeInfo_13841 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeInfo_13841)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeInfo_13841 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeInfo_13841)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeInfo_13841 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeInfo_13841)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeInfo_13841 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeInfo_13841)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeInfo_13841 parseFrom(InputStream input) throws IOException {
         return (C2S_SacrificeInfo_13841)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeInfo_13841 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeInfo_13841)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeInfo_13841 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SacrificeInfo_13841)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SacrificeInfo_13841 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeInfo_13841)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeInfo_13841 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SacrificeInfo_13841)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeInfo_13841 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeInfo_13841)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SacrificeInfo_13841 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SacrificeInfo_13841 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SacrificeInfo_13841> parser() {
         return PARSER;
      }

      public Parser<C2S_SacrificeInfo_13841> getParserForType() {
         return PARSER;
      }

      public C2S_SacrificeInfo_13841 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SacrificeInfo_13841OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeInfo_13841.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_SacrificeInfo_13841.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeInfo_13841_descriptor;
         }

         public C2S_SacrificeInfo_13841 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_SacrificeInfo_13841.getDefaultInstance();
         }

         public C2S_SacrificeInfo_13841 build() {
            C2S_SacrificeInfo_13841 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SacrificeInfo_13841 buildPartial() {
            C2S_SacrificeInfo_13841 result = new C2S_SacrificeInfo_13841(this);
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
            if (other instanceof C2S_SacrificeInfo_13841) {
               return this.mergeFrom((C2S_SacrificeInfo_13841)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SacrificeInfo_13841 other) {
            if (other == WarHorseMsg.C2S_SacrificeInfo_13841.getDefaultInstance()) {
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
            C2S_SacrificeInfo_13841 parsedMessage = null;

            try {
               parsedMessage = (C2S_SacrificeInfo_13841)WarHorseMsg.C2S_SacrificeInfo_13841.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SacrificeInfo_13841)e.getUnfinishedMessage();
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

   public static final class S2C_SacrificeInfo_13842 extends GeneratedMessageV3 implements S2C_SacrificeInfo_13842OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SACRIFICECOUNT_FIELD_NUMBER = 1;
      private int sacrificeCount_;
      public static final int SACRIFICEPOINT_FIELD_NUMBER = 2;
      private int sacrificePoint_;
      public static final int GOTBOXES_FIELD_NUMBER = 3;
      private Internal.IntList gotBoxes_;
      public static final int SACRIFICEFREECOUNT_FIELD_NUMBER = 4;
      private int sacrificeFreeCount_;
      public static final int DAILYSACRIFICECOUNT_FIELD_NUMBER = 5;
      private int dailySacrificeCount_;
      private byte memoizedIsInitialized;
      private static final S2C_SacrificeInfo_13842 DEFAULT_INSTANCE = new S2C_SacrificeInfo_13842();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SacrificeInfo_13842> PARSER = new AbstractParser<S2C_SacrificeInfo_13842>() {
         public S2C_SacrificeInfo_13842 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SacrificeInfo_13842(input, extensionRegistry);
         }
      };

      private S2C_SacrificeInfo_13842(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SacrificeInfo_13842() {
         this.memoizedIsInitialized = -1;
         this.gotBoxes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SacrificeInfo_13842();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SacrificeInfo_13842(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sacrificeCount_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.sacrificePoint_ = input.readInt32();
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
                        this.sacrificeFreeCount_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 8;
                        this.dailySacrificeCount_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeInfo_13842.class, Builder.class);
      }

      public boolean hasSacrificeCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSacrificeCount() {
         return this.sacrificeCount_;
      }

      public boolean hasSacrificePoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSacrificePoint() {
         return this.sacrificePoint_;
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

      public boolean hasSacrificeFreeCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSacrificeFreeCount() {
         return this.sacrificeFreeCount_;
      }

      public boolean hasDailySacrificeCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDailySacrificeCount() {
         return this.dailySacrificeCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSacrificeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSacrificePoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSacrificeFreeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailySacrificeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.sacrificeCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.sacrificePoint_);
         }

         for(int i = 0; i < this.gotBoxes_.size(); ++i) {
            output.writeInt32(3, this.gotBoxes_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.sacrificeFreeCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.dailySacrificeCount_);
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
               size += CodedOutputStream.computeInt32Size(1, this.sacrificeCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.sacrificePoint_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotBoxes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotBoxes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotBoxesList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.sacrificeFreeCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dailySacrificeCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SacrificeInfo_13842)) {
            return super.equals(obj);
         } else {
            S2C_SacrificeInfo_13842 other = (S2C_SacrificeInfo_13842)obj;
            if (this.hasSacrificeCount() != other.hasSacrificeCount()) {
               return false;
            } else if (this.hasSacrificeCount() && this.getSacrificeCount() != other.getSacrificeCount()) {
               return false;
            } else if (this.hasSacrificePoint() != other.hasSacrificePoint()) {
               return false;
            } else if (this.hasSacrificePoint() && this.getSacrificePoint() != other.getSacrificePoint()) {
               return false;
            } else if (!this.getGotBoxesList().equals(other.getGotBoxesList())) {
               return false;
            } else if (this.hasSacrificeFreeCount() != other.hasSacrificeFreeCount()) {
               return false;
            } else if (this.hasSacrificeFreeCount() && this.getSacrificeFreeCount() != other.getSacrificeFreeCount()) {
               return false;
            } else if (this.hasDailySacrificeCount() != other.hasDailySacrificeCount()) {
               return false;
            } else if (this.hasDailySacrificeCount() && this.getDailySacrificeCount() != other.getDailySacrificeCount()) {
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
            if (this.hasSacrificeCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSacrificeCount();
            }

            if (this.hasSacrificePoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSacrificePoint();
            }

            if (this.getGotBoxesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGotBoxesList().hashCode();
            }

            if (this.hasSacrificeFreeCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSacrificeFreeCount();
            }

            if (this.hasDailySacrificeCount()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDailySacrificeCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SacrificeInfo_13842 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeInfo_13842)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeInfo_13842 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeInfo_13842)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeInfo_13842 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeInfo_13842)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeInfo_13842 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeInfo_13842)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeInfo_13842 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeInfo_13842)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeInfo_13842 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeInfo_13842)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeInfo_13842 parseFrom(InputStream input) throws IOException {
         return (S2C_SacrificeInfo_13842)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeInfo_13842 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeInfo_13842)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeInfo_13842 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SacrificeInfo_13842)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SacrificeInfo_13842 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeInfo_13842)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeInfo_13842 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SacrificeInfo_13842)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeInfo_13842 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeInfo_13842)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SacrificeInfo_13842 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SacrificeInfo_13842 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SacrificeInfo_13842> parser() {
         return PARSER;
      }

      public Parser<S2C_SacrificeInfo_13842> getParserForType() {
         return PARSER;
      }

      public S2C_SacrificeInfo_13842 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SacrificeInfo_13842OrBuilder {
         private int bitField0_;
         private int sacrificeCount_;
         private int sacrificePoint_;
         private Internal.IntList gotBoxes_;
         private int sacrificeFreeCount_;
         private int dailySacrificeCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeInfo_13842.class, Builder.class);
         }

         private Builder() {
            this.gotBoxes_ = WarHorseMsg.S2C_SacrificeInfo_13842.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotBoxes_ = WarHorseMsg.S2C_SacrificeInfo_13842.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_SacrificeInfo_13842.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.sacrificeCount_ = 0;
            this.bitField0_ &= -2;
            this.sacrificePoint_ = 0;
            this.bitField0_ &= -3;
            this.gotBoxes_ = WarHorseMsg.S2C_SacrificeInfo_13842.emptyIntList();
            this.bitField0_ &= -5;
            this.sacrificeFreeCount_ = 0;
            this.bitField0_ &= -9;
            this.dailySacrificeCount_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeInfo_13842_descriptor;
         }

         public S2C_SacrificeInfo_13842 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_SacrificeInfo_13842.getDefaultInstance();
         }

         public S2C_SacrificeInfo_13842 build() {
            S2C_SacrificeInfo_13842 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SacrificeInfo_13842 buildPartial() {
            S2C_SacrificeInfo_13842 result = new S2C_SacrificeInfo_13842(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.sacrificeCount_ = this.sacrificeCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sacrificePoint_ = this.sacrificePoint_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.gotBoxes_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.gotBoxes_ = this.gotBoxes_;
            if ((from_bitField0_ & 8) != 0) {
               result.sacrificeFreeCount_ = this.sacrificeFreeCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dailySacrificeCount_ = this.dailySacrificeCount_;
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
            if (other instanceof S2C_SacrificeInfo_13842) {
               return this.mergeFrom((S2C_SacrificeInfo_13842)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SacrificeInfo_13842 other) {
            if (other == WarHorseMsg.S2C_SacrificeInfo_13842.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSacrificeCount()) {
                  this.setSacrificeCount(other.getSacrificeCount());
               }

               if (other.hasSacrificePoint()) {
                  this.setSacrificePoint(other.getSacrificePoint());
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

               if (other.hasSacrificeFreeCount()) {
                  this.setSacrificeFreeCount(other.getSacrificeFreeCount());
               }

               if (other.hasDailySacrificeCount()) {
                  this.setDailySacrificeCount(other.getDailySacrificeCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSacrificeCount()) {
               return false;
            } else if (!this.hasSacrificePoint()) {
               return false;
            } else if (!this.hasSacrificeFreeCount()) {
               return false;
            } else {
               return this.hasDailySacrificeCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SacrificeInfo_13842 parsedMessage = null;

            try {
               parsedMessage = (S2C_SacrificeInfo_13842)WarHorseMsg.S2C_SacrificeInfo_13842.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SacrificeInfo_13842)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSacrificeCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSacrificeCount() {
            return this.sacrificeCount_;
         }

         public Builder setSacrificeCount(int value) {
            this.bitField0_ |= 1;
            this.sacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificeCount() {
            this.bitField0_ &= -2;
            this.sacrificeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSacrificePoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSacrificePoint() {
            return this.sacrificePoint_;
         }

         public Builder setSacrificePoint(int value) {
            this.bitField0_ |= 2;
            this.sacrificePoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificePoint() {
            this.bitField0_ &= -3;
            this.sacrificePoint_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotBoxesIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.gotBoxes_ = WarHorseMsg.S2C_SacrificeInfo_13842.mutableCopy(this.gotBoxes_);
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
            this.gotBoxes_ = WarHorseMsg.S2C_SacrificeInfo_13842.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasSacrificeFreeCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSacrificeFreeCount() {
            return this.sacrificeFreeCount_;
         }

         public Builder setSacrificeFreeCount(int value) {
            this.bitField0_ |= 8;
            this.sacrificeFreeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificeFreeCount() {
            this.bitField0_ &= -9;
            this.sacrificeFreeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailySacrificeCount() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDailySacrificeCount() {
            return this.dailySacrificeCount_;
         }

         public Builder setDailySacrificeCount(int value) {
            this.bitField0_ |= 16;
            this.dailySacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailySacrificeCount() {
            this.bitField0_ &= -17;
            this.dailySacrificeCount_ = 0;
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

   public static final class C2S_DoSacrifice_13843 extends GeneratedMessageV3 implements C2S_DoSacrifice_13843OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_DoSacrifice_13843 DEFAULT_INSTANCE = new C2S_DoSacrifice_13843();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DoSacrifice_13843> PARSER = new AbstractParser<C2S_DoSacrifice_13843>() {
         public C2S_DoSacrifice_13843 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DoSacrifice_13843(input, extensionRegistry);
         }
      };

      private C2S_DoSacrifice_13843(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DoSacrifice_13843() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DoSacrifice_13843();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DoSacrifice_13843(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DoSacrifice_13843.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DoSacrifice_13843)) {
            return super.equals(obj);
         } else {
            C2S_DoSacrifice_13843 other = (C2S_DoSacrifice_13843)obj;
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

      public static C2S_DoSacrifice_13843 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DoSacrifice_13843)PARSER.parseFrom(data);
      }

      public static C2S_DoSacrifice_13843 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DoSacrifice_13843)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DoSacrifice_13843 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DoSacrifice_13843)PARSER.parseFrom(data);
      }

      public static C2S_DoSacrifice_13843 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DoSacrifice_13843)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DoSacrifice_13843 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DoSacrifice_13843)PARSER.parseFrom(data);
      }

      public static C2S_DoSacrifice_13843 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DoSacrifice_13843)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DoSacrifice_13843 parseFrom(InputStream input) throws IOException {
         return (C2S_DoSacrifice_13843)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DoSacrifice_13843 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DoSacrifice_13843)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DoSacrifice_13843 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DoSacrifice_13843)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DoSacrifice_13843 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DoSacrifice_13843)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DoSacrifice_13843 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DoSacrifice_13843)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DoSacrifice_13843 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DoSacrifice_13843)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DoSacrifice_13843 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DoSacrifice_13843 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DoSacrifice_13843> parser() {
         return PARSER;
      }

      public Parser<C2S_DoSacrifice_13843> getParserForType() {
         return PARSER;
      }

      public C2S_DoSacrifice_13843 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DoSacrifice_13843OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DoSacrifice_13843.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_DoSacrifice_13843.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_DoSacrifice_13843_descriptor;
         }

         public C2S_DoSacrifice_13843 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_DoSacrifice_13843.getDefaultInstance();
         }

         public C2S_DoSacrifice_13843 build() {
            C2S_DoSacrifice_13843 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DoSacrifice_13843 buildPartial() {
            C2S_DoSacrifice_13843 result = new C2S_DoSacrifice_13843(this);
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
            if (other instanceof C2S_DoSacrifice_13843) {
               return this.mergeFrom((C2S_DoSacrifice_13843)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DoSacrifice_13843 other) {
            if (other == WarHorseMsg.C2S_DoSacrifice_13843.getDefaultInstance()) {
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
            C2S_DoSacrifice_13843 parsedMessage = null;

            try {
               parsedMessage = (C2S_DoSacrifice_13843)WarHorseMsg.C2S_DoSacrifice_13843.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DoSacrifice_13843)e.getUnfinishedMessage();
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

   public static final class S2C_DoSacrifice_13844 extends GeneratedMessageV3 implements S2C_DoSacrifice_13844OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int SACRIFICECOUNT_FIELD_NUMBER = 2;
      private int sacrificeCount_;
      public static final int DAILYSACRIFICECOUNT_FIELD_NUMBER = 3;
      private int dailySacrificeCount_;
      private byte memoizedIsInitialized;
      private static final S2C_DoSacrifice_13844 DEFAULT_INSTANCE = new S2C_DoSacrifice_13844();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DoSacrifice_13844> PARSER = new AbstractParser<S2C_DoSacrifice_13844>() {
         public S2C_DoSacrifice_13844 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DoSacrifice_13844(input, extensionRegistry);
         }
      };

      private S2C_DoSacrifice_13844(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DoSacrifice_13844() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DoSacrifice_13844();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DoSacrifice_13844(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sacrificeCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.dailySacrificeCount_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DoSacrifice_13844.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasSacrificeCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSacrificeCount() {
         return this.sacrificeCount_;
      }

      public boolean hasDailySacrificeCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDailySacrificeCount() {
         return this.dailySacrificeCount_;
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
         } else if (!this.hasSacrificeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailySacrificeCount()) {
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
            output.writeInt32(2, this.sacrificeCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.dailySacrificeCount_);
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
               size += CodedOutputStream.computeInt32Size(2, this.sacrificeCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dailySacrificeCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DoSacrifice_13844)) {
            return super.equals(obj);
         } else {
            S2C_DoSacrifice_13844 other = (S2C_DoSacrifice_13844)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasSacrificeCount() != other.hasSacrificeCount()) {
               return false;
            } else if (this.hasSacrificeCount() && this.getSacrificeCount() != other.getSacrificeCount()) {
               return false;
            } else if (this.hasDailySacrificeCount() != other.hasDailySacrificeCount()) {
               return false;
            } else if (this.hasDailySacrificeCount() && this.getDailySacrificeCount() != other.getDailySacrificeCount()) {
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

            if (this.hasSacrificeCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSacrificeCount();
            }

            if (this.hasDailySacrificeCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDailySacrificeCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DoSacrifice_13844 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DoSacrifice_13844)PARSER.parseFrom(data);
      }

      public static S2C_DoSacrifice_13844 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DoSacrifice_13844)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DoSacrifice_13844 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DoSacrifice_13844)PARSER.parseFrom(data);
      }

      public static S2C_DoSacrifice_13844 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DoSacrifice_13844)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DoSacrifice_13844 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DoSacrifice_13844)PARSER.parseFrom(data);
      }

      public static S2C_DoSacrifice_13844 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DoSacrifice_13844)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DoSacrifice_13844 parseFrom(InputStream input) throws IOException {
         return (S2C_DoSacrifice_13844)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DoSacrifice_13844 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DoSacrifice_13844)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DoSacrifice_13844 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DoSacrifice_13844)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DoSacrifice_13844 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DoSacrifice_13844)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DoSacrifice_13844 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DoSacrifice_13844)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DoSacrifice_13844 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DoSacrifice_13844)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DoSacrifice_13844 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DoSacrifice_13844 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DoSacrifice_13844> parser() {
         return PARSER;
      }

      public Parser<S2C_DoSacrifice_13844> getParserForType() {
         return PARSER;
      }

      public S2C_DoSacrifice_13844 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DoSacrifice_13844OrBuilder {
         private int bitField0_;
         private int type_;
         private int sacrificeCount_;
         private int dailySacrificeCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DoSacrifice_13844.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_DoSacrifice_13844.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.sacrificeCount_ = 0;
            this.bitField0_ &= -3;
            this.dailySacrificeCount_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_DoSacrifice_13844_descriptor;
         }

         public S2C_DoSacrifice_13844 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_DoSacrifice_13844.getDefaultInstance();
         }

         public S2C_DoSacrifice_13844 build() {
            S2C_DoSacrifice_13844 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DoSacrifice_13844 buildPartial() {
            S2C_DoSacrifice_13844 result = new S2C_DoSacrifice_13844(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sacrificeCount_ = this.sacrificeCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dailySacrificeCount_ = this.dailySacrificeCount_;
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
            if (other instanceof S2C_DoSacrifice_13844) {
               return this.mergeFrom((S2C_DoSacrifice_13844)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DoSacrifice_13844 other) {
            if (other == WarHorseMsg.S2C_DoSacrifice_13844.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasSacrificeCount()) {
                  this.setSacrificeCount(other.getSacrificeCount());
               }

               if (other.hasDailySacrificeCount()) {
                  this.setDailySacrificeCount(other.getDailySacrificeCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasSacrificeCount()) {
               return false;
            } else {
               return this.hasDailySacrificeCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DoSacrifice_13844 parsedMessage = null;

            try {
               parsedMessage = (S2C_DoSacrifice_13844)WarHorseMsg.S2C_DoSacrifice_13844.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DoSacrifice_13844)e.getUnfinishedMessage();
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

         public boolean hasSacrificeCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSacrificeCount() {
            return this.sacrificeCount_;
         }

         public Builder setSacrificeCount(int value) {
            this.bitField0_ |= 2;
            this.sacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificeCount() {
            this.bitField0_ &= -3;
            this.sacrificeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDailySacrificeCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDailySacrificeCount() {
            return this.dailySacrificeCount_;
         }

         public Builder setDailySacrificeCount(int value) {
            this.bitField0_ |= 4;
            this.dailySacrificeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailySacrificeCount() {
            this.bitField0_ &= -5;
            this.dailySacrificeCount_ = 0;
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

   public static final class C2S_SacrificeBoxReward_13845 extends GeneratedMessageV3 implements C2S_SacrificeBoxReward_13845OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_SacrificeBoxReward_13845 DEFAULT_INSTANCE = new C2S_SacrificeBoxReward_13845();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SacrificeBoxReward_13845> PARSER = new AbstractParser<C2S_SacrificeBoxReward_13845>() {
         public C2S_SacrificeBoxReward_13845 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SacrificeBoxReward_13845(input, extensionRegistry);
         }
      };

      private C2S_SacrificeBoxReward_13845(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SacrificeBoxReward_13845() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SacrificeBoxReward_13845();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SacrificeBoxReward_13845(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeBoxReward_13845.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SacrificeBoxReward_13845)) {
            return super.equals(obj);
         } else {
            C2S_SacrificeBoxReward_13845 other = (C2S_SacrificeBoxReward_13845)obj;
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

      public static C2S_SacrificeBoxReward_13845 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeBoxReward_13845)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeBoxReward_13845 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeBoxReward_13845)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeBoxReward_13845 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeBoxReward_13845)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeBoxReward_13845 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeBoxReward_13845)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeBoxReward_13845 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeBoxReward_13845)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeBoxReward_13845 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeBoxReward_13845)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeBoxReward_13845 parseFrom(InputStream input) throws IOException {
         return (C2S_SacrificeBoxReward_13845)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeBoxReward_13845 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeBoxReward_13845)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeBoxReward_13845 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SacrificeBoxReward_13845)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SacrificeBoxReward_13845 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeBoxReward_13845)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeBoxReward_13845 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SacrificeBoxReward_13845)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeBoxReward_13845 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeBoxReward_13845)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SacrificeBoxReward_13845 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SacrificeBoxReward_13845 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SacrificeBoxReward_13845> parser() {
         return PARSER;
      }

      public Parser<C2S_SacrificeBoxReward_13845> getParserForType() {
         return PARSER;
      }

      public C2S_SacrificeBoxReward_13845 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SacrificeBoxReward_13845OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeBoxReward_13845.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_SacrificeBoxReward_13845.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeBoxReward_13845_descriptor;
         }

         public C2S_SacrificeBoxReward_13845 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_SacrificeBoxReward_13845.getDefaultInstance();
         }

         public C2S_SacrificeBoxReward_13845 build() {
            C2S_SacrificeBoxReward_13845 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SacrificeBoxReward_13845 buildPartial() {
            C2S_SacrificeBoxReward_13845 result = new C2S_SacrificeBoxReward_13845(this);
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
            if (other instanceof C2S_SacrificeBoxReward_13845) {
               return this.mergeFrom((C2S_SacrificeBoxReward_13845)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SacrificeBoxReward_13845 other) {
            if (other == WarHorseMsg.C2S_SacrificeBoxReward_13845.getDefaultInstance()) {
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
            C2S_SacrificeBoxReward_13845 parsedMessage = null;

            try {
               parsedMessage = (C2S_SacrificeBoxReward_13845)WarHorseMsg.C2S_SacrificeBoxReward_13845.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SacrificeBoxReward_13845)e.getUnfinishedMessage();
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

   public static final class S2C_SacrificeBoxReward_13846 extends GeneratedMessageV3 implements S2C_SacrificeBoxReward_13846OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int SACRIFICEPOINT_FIELD_NUMBER = 2;
      private int sacrificePoint_;
      private byte memoizedIsInitialized;
      private static final S2C_SacrificeBoxReward_13846 DEFAULT_INSTANCE = new S2C_SacrificeBoxReward_13846();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SacrificeBoxReward_13846> PARSER = new AbstractParser<S2C_SacrificeBoxReward_13846>() {
         public S2C_SacrificeBoxReward_13846 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SacrificeBoxReward_13846(input, extensionRegistry);
         }
      };

      private S2C_SacrificeBoxReward_13846(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SacrificeBoxReward_13846() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SacrificeBoxReward_13846();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SacrificeBoxReward_13846(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sacrificePoint_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeBoxReward_13846.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasSacrificePoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSacrificePoint() {
         return this.sacrificePoint_;
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
         } else if (!this.hasSacrificePoint()) {
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
            output.writeInt32(2, this.sacrificePoint_);
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
               size += CodedOutputStream.computeInt32Size(2, this.sacrificePoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SacrificeBoxReward_13846)) {
            return super.equals(obj);
         } else {
            S2C_SacrificeBoxReward_13846 other = (S2C_SacrificeBoxReward_13846)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasSacrificePoint() != other.hasSacrificePoint()) {
               return false;
            } else if (this.hasSacrificePoint() && this.getSacrificePoint() != other.getSacrificePoint()) {
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

            if (this.hasSacrificePoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSacrificePoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeBoxReward_13846)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeBoxReward_13846)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeBoxReward_13846)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeBoxReward_13846)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeBoxReward_13846)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeBoxReward_13846)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(InputStream input) throws IOException {
         return (S2C_SacrificeBoxReward_13846)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeBoxReward_13846)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeBoxReward_13846 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SacrificeBoxReward_13846)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SacrificeBoxReward_13846 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeBoxReward_13846)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SacrificeBoxReward_13846)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeBoxReward_13846 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeBoxReward_13846)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SacrificeBoxReward_13846 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SacrificeBoxReward_13846 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SacrificeBoxReward_13846> parser() {
         return PARSER;
      }

      public Parser<S2C_SacrificeBoxReward_13846> getParserForType() {
         return PARSER;
      }

      public S2C_SacrificeBoxReward_13846 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SacrificeBoxReward_13846OrBuilder {
         private int bitField0_;
         private int id_;
         private int sacrificePoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeBoxReward_13846.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_SacrificeBoxReward_13846.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.sacrificePoint_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeBoxReward_13846_descriptor;
         }

         public S2C_SacrificeBoxReward_13846 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_SacrificeBoxReward_13846.getDefaultInstance();
         }

         public S2C_SacrificeBoxReward_13846 build() {
            S2C_SacrificeBoxReward_13846 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SacrificeBoxReward_13846 buildPartial() {
            S2C_SacrificeBoxReward_13846 result = new S2C_SacrificeBoxReward_13846(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sacrificePoint_ = this.sacrificePoint_;
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
            if (other instanceof S2C_SacrificeBoxReward_13846) {
               return this.mergeFrom((S2C_SacrificeBoxReward_13846)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SacrificeBoxReward_13846 other) {
            if (other == WarHorseMsg.S2C_SacrificeBoxReward_13846.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasSacrificePoint()) {
                  this.setSacrificePoint(other.getSacrificePoint());
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
               return this.hasSacrificePoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SacrificeBoxReward_13846 parsedMessage = null;

            try {
               parsedMessage = (S2C_SacrificeBoxReward_13846)WarHorseMsg.S2C_SacrificeBoxReward_13846.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SacrificeBoxReward_13846)e.getUnfinishedMessage();
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

         public boolean hasSacrificePoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSacrificePoint() {
            return this.sacrificePoint_;
         }

         public Builder setSacrificePoint(int value) {
            this.bitField0_ |= 2;
            this.sacrificePoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSacrificePoint() {
            this.bitField0_ &= -3;
            this.sacrificePoint_ = 0;
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

   public static final class C2S_SacrificeRecordList_13847 extends GeneratedMessageV3 implements C2S_SacrificeRecordList_13847OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_SacrificeRecordList_13847 DEFAULT_INSTANCE = new C2S_SacrificeRecordList_13847();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SacrificeRecordList_13847> PARSER = new AbstractParser<C2S_SacrificeRecordList_13847>() {
         public C2S_SacrificeRecordList_13847 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SacrificeRecordList_13847(input, extensionRegistry);
         }
      };

      private C2S_SacrificeRecordList_13847(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SacrificeRecordList_13847() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SacrificeRecordList_13847();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SacrificeRecordList_13847(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeRecordList_13847.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SacrificeRecordList_13847)) {
            return super.equals(obj);
         } else {
            C2S_SacrificeRecordList_13847 other = (C2S_SacrificeRecordList_13847)obj;
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

      public static C2S_SacrificeRecordList_13847 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRecordList_13847)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeRecordList_13847 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRecordList_13847)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeRecordList_13847 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRecordList_13847)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeRecordList_13847 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRecordList_13847)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeRecordList_13847 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRecordList_13847)PARSER.parseFrom(data);
      }

      public static C2S_SacrificeRecordList_13847 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SacrificeRecordList_13847)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SacrificeRecordList_13847 parseFrom(InputStream input) throws IOException {
         return (C2S_SacrificeRecordList_13847)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeRecordList_13847 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeRecordList_13847)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeRecordList_13847 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SacrificeRecordList_13847)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SacrificeRecordList_13847 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeRecordList_13847)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SacrificeRecordList_13847 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SacrificeRecordList_13847)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SacrificeRecordList_13847 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SacrificeRecordList_13847)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SacrificeRecordList_13847 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SacrificeRecordList_13847 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SacrificeRecordList_13847> parser() {
         return PARSER;
      }

      public Parser<C2S_SacrificeRecordList_13847> getParserForType() {
         return PARSER;
      }

      public C2S_SacrificeRecordList_13847 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SacrificeRecordList_13847OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SacrificeRecordList_13847.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_SacrificeRecordList_13847.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SacrificeRecordList_13847_descriptor;
         }

         public C2S_SacrificeRecordList_13847 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_SacrificeRecordList_13847.getDefaultInstance();
         }

         public C2S_SacrificeRecordList_13847 build() {
            C2S_SacrificeRecordList_13847 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SacrificeRecordList_13847 buildPartial() {
            C2S_SacrificeRecordList_13847 result = new C2S_SacrificeRecordList_13847(this);
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
            if (other instanceof C2S_SacrificeRecordList_13847) {
               return this.mergeFrom((C2S_SacrificeRecordList_13847)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SacrificeRecordList_13847 other) {
            if (other == WarHorseMsg.C2S_SacrificeRecordList_13847.getDefaultInstance()) {
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
            C2S_SacrificeRecordList_13847 parsedMessage = null;

            try {
               parsedMessage = (C2S_SacrificeRecordList_13847)WarHorseMsg.C2S_SacrificeRecordList_13847.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SacrificeRecordList_13847)e.getUnfinishedMessage();
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

   public static final class S2C_SacrificeRecordList_13848 extends GeneratedMessageV3 implements S2C_SacrificeRecordList_13848OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int RECORDLIST_FIELD_NUMBER = 2;
      private List<SacrificeRecordData> recordList_;
      private byte memoizedIsInitialized;
      private static final S2C_SacrificeRecordList_13848 DEFAULT_INSTANCE = new S2C_SacrificeRecordList_13848();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SacrificeRecordList_13848> PARSER = new AbstractParser<S2C_SacrificeRecordList_13848>() {
         public S2C_SacrificeRecordList_13848 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SacrificeRecordList_13848(input, extensionRegistry);
         }
      };

      private S2C_SacrificeRecordList_13848(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SacrificeRecordList_13848() {
         this.memoizedIsInitialized = -1;
         this.recordList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SacrificeRecordList_13848();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SacrificeRecordList_13848(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.recordList_.add(input.readMessage(WarHorseMsg.SacrificeRecordData.PARSER, extensionRegistry));
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeRecordList_13848.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<SacrificeRecordData> getRecordListList() {
         return this.recordList_;
      }

      public List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList() {
         return this.recordList_;
      }

      public int getRecordListCount() {
         return this.recordList_.size();
      }

      public SacrificeRecordData getRecordList(int index) {
         return (SacrificeRecordData)this.recordList_.get(index);
      }

      public SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index) {
         return (SacrificeRecordDataOrBuilder)this.recordList_.get(index);
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
         } else if (!(obj instanceof S2C_SacrificeRecordList_13848)) {
            return super.equals(obj);
         } else {
            S2C_SacrificeRecordList_13848 other = (S2C_SacrificeRecordList_13848)obj;
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

      public static S2C_SacrificeRecordList_13848 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecordList_13848)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeRecordList_13848 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecordList_13848)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeRecordList_13848 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecordList_13848)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeRecordList_13848 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecordList_13848)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeRecordList_13848 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecordList_13848)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeRecordList_13848 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecordList_13848)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeRecordList_13848 parseFrom(InputStream input) throws IOException {
         return (S2C_SacrificeRecordList_13848)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeRecordList_13848 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeRecordList_13848)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeRecordList_13848 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SacrificeRecordList_13848)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SacrificeRecordList_13848 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeRecordList_13848)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeRecordList_13848 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SacrificeRecordList_13848)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeRecordList_13848 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeRecordList_13848)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SacrificeRecordList_13848 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SacrificeRecordList_13848 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SacrificeRecordList_13848> parser() {
         return PARSER;
      }

      public Parser<S2C_SacrificeRecordList_13848> getParserForType() {
         return PARSER;
      }

      public S2C_SacrificeRecordList_13848 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SacrificeRecordList_13848OrBuilder {
         private int bitField0_;
         private int type_;
         private List<SacrificeRecordData> recordList_;
         private RepeatedFieldBuilderV3<SacrificeRecordData, SacrificeRecordData.Builder, SacrificeRecordDataOrBuilder> recordListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeRecordList_13848.class, Builder.class);
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
            if (WarHorseMsg.S2C_SacrificeRecordList_13848.alwaysUseFieldBuilders) {
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
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecordList_13848_descriptor;
         }

         public S2C_SacrificeRecordList_13848 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_SacrificeRecordList_13848.getDefaultInstance();
         }

         public S2C_SacrificeRecordList_13848 build() {
            S2C_SacrificeRecordList_13848 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SacrificeRecordList_13848 buildPartial() {
            S2C_SacrificeRecordList_13848 result = new S2C_SacrificeRecordList_13848(this);
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
            if (other instanceof S2C_SacrificeRecordList_13848) {
               return this.mergeFrom((S2C_SacrificeRecordList_13848)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SacrificeRecordList_13848 other) {
            if (other == WarHorseMsg.S2C_SacrificeRecordList_13848.getDefaultInstance()) {
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
                     this.recordListBuilder_ = WarHorseMsg.S2C_SacrificeRecordList_13848.alwaysUseFieldBuilders ? this.getRecordListFieldBuilder() : null;
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
            S2C_SacrificeRecordList_13848 parsedMessage = null;

            try {
               parsedMessage = (S2C_SacrificeRecordList_13848)WarHorseMsg.S2C_SacrificeRecordList_13848.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SacrificeRecordList_13848)e.getUnfinishedMessage();
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

         public List<SacrificeRecordData> getRecordListList() {
            return this.recordListBuilder_ == null ? Collections.unmodifiableList(this.recordList_) : this.recordListBuilder_.getMessageList();
         }

         public int getRecordListCount() {
            return this.recordListBuilder_ == null ? this.recordList_.size() : this.recordListBuilder_.getCount();
         }

         public SacrificeRecordData getRecordList(int index) {
            return this.recordListBuilder_ == null ? (SacrificeRecordData)this.recordList_.get(index) : (SacrificeRecordData)this.recordListBuilder_.getMessage(index);
         }

         public Builder setRecordList(int index, SacrificeRecordData value) {
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

         public Builder setRecordList(int index, SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(SacrificeRecordData value) {
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

         public Builder addRecordList(int index, SacrificeRecordData value) {
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

         public Builder addRecordList(SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(int index, SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordList(Iterable<? extends SacrificeRecordData> values) {
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

         public SacrificeRecordData.Builder getRecordListBuilder(int index) {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().getBuilder(index);
         }

         public SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index) {
            return this.recordListBuilder_ == null ? (SacrificeRecordDataOrBuilder)this.recordList_.get(index) : (SacrificeRecordDataOrBuilder)this.recordListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList() {
            return this.recordListBuilder_ != null ? this.recordListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordList_);
         }

         public SacrificeRecordData.Builder addRecordListBuilder() {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(WarHorseMsg.SacrificeRecordData.getDefaultInstance());
         }

         public SacrificeRecordData.Builder addRecordListBuilder(int index) {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(index, WarHorseMsg.SacrificeRecordData.getDefaultInstance());
         }

         public List<SacrificeRecordData.Builder> getRecordListBuilderList() {
            return this.getRecordListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SacrificeRecordData, SacrificeRecordData.Builder, SacrificeRecordDataOrBuilder> getRecordListFieldBuilder() {
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

   public static final class S2C_SacrificeRecord_13850 extends GeneratedMessageV3 implements S2C_SacrificeRecord_13850OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDLIST_FIELD_NUMBER = 1;
      private List<SacrificeRecordData> recordList_;
      private byte memoizedIsInitialized;
      private static final S2C_SacrificeRecord_13850 DEFAULT_INSTANCE = new S2C_SacrificeRecord_13850();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SacrificeRecord_13850> PARSER = new AbstractParser<S2C_SacrificeRecord_13850>() {
         public S2C_SacrificeRecord_13850 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SacrificeRecord_13850(input, extensionRegistry);
         }
      };

      private S2C_SacrificeRecord_13850(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SacrificeRecord_13850() {
         this.memoizedIsInitialized = -1;
         this.recordList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SacrificeRecord_13850();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SacrificeRecord_13850(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.recordList_.add(input.readMessage(WarHorseMsg.SacrificeRecordData.PARSER, extensionRegistry));
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeRecord_13850.class, Builder.class);
      }

      public List<SacrificeRecordData> getRecordListList() {
         return this.recordList_;
      }

      public List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList() {
         return this.recordList_;
      }

      public int getRecordListCount() {
         return this.recordList_.size();
      }

      public SacrificeRecordData getRecordList(int index) {
         return (SacrificeRecordData)this.recordList_.get(index);
      }

      public SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index) {
         return (SacrificeRecordDataOrBuilder)this.recordList_.get(index);
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
         } else if (!(obj instanceof S2C_SacrificeRecord_13850)) {
            return super.equals(obj);
         } else {
            S2C_SacrificeRecord_13850 other = (S2C_SacrificeRecord_13850)obj;
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

      public static S2C_SacrificeRecord_13850 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecord_13850)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeRecord_13850 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecord_13850)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeRecord_13850 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecord_13850)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeRecord_13850 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecord_13850)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeRecord_13850 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecord_13850)PARSER.parseFrom(data);
      }

      public static S2C_SacrificeRecord_13850 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SacrificeRecord_13850)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SacrificeRecord_13850 parseFrom(InputStream input) throws IOException {
         return (S2C_SacrificeRecord_13850)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeRecord_13850 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeRecord_13850)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeRecord_13850 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SacrificeRecord_13850)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SacrificeRecord_13850 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeRecord_13850)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SacrificeRecord_13850 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SacrificeRecord_13850)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SacrificeRecord_13850 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SacrificeRecord_13850)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SacrificeRecord_13850 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SacrificeRecord_13850 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SacrificeRecord_13850> parser() {
         return PARSER;
      }

      public Parser<S2C_SacrificeRecord_13850> getParserForType() {
         return PARSER;
      }

      public S2C_SacrificeRecord_13850 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SacrificeRecord_13850OrBuilder {
         private int bitField0_;
         private List<SacrificeRecordData> recordList_;
         private RepeatedFieldBuilderV3<SacrificeRecordData, SacrificeRecordData.Builder, SacrificeRecordDataOrBuilder> recordListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SacrificeRecord_13850.class, Builder.class);
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
            if (WarHorseMsg.S2C_SacrificeRecord_13850.alwaysUseFieldBuilders) {
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
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SacrificeRecord_13850_descriptor;
         }

         public S2C_SacrificeRecord_13850 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_SacrificeRecord_13850.getDefaultInstance();
         }

         public S2C_SacrificeRecord_13850 build() {
            S2C_SacrificeRecord_13850 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SacrificeRecord_13850 buildPartial() {
            S2C_SacrificeRecord_13850 result = new S2C_SacrificeRecord_13850(this);
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
            if (other instanceof S2C_SacrificeRecord_13850) {
               return this.mergeFrom((S2C_SacrificeRecord_13850)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SacrificeRecord_13850 other) {
            if (other == WarHorseMsg.S2C_SacrificeRecord_13850.getDefaultInstance()) {
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
                     this.recordListBuilder_ = WarHorseMsg.S2C_SacrificeRecord_13850.alwaysUseFieldBuilders ? this.getRecordListFieldBuilder() : null;
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
            S2C_SacrificeRecord_13850 parsedMessage = null;

            try {
               parsedMessage = (S2C_SacrificeRecord_13850)WarHorseMsg.S2C_SacrificeRecord_13850.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SacrificeRecord_13850)e.getUnfinishedMessage();
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

         public List<SacrificeRecordData> getRecordListList() {
            return this.recordListBuilder_ == null ? Collections.unmodifiableList(this.recordList_) : this.recordListBuilder_.getMessageList();
         }

         public int getRecordListCount() {
            return this.recordListBuilder_ == null ? this.recordList_.size() : this.recordListBuilder_.getCount();
         }

         public SacrificeRecordData getRecordList(int index) {
            return this.recordListBuilder_ == null ? (SacrificeRecordData)this.recordList_.get(index) : (SacrificeRecordData)this.recordListBuilder_.getMessage(index);
         }

         public Builder setRecordList(int index, SacrificeRecordData value) {
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

         public Builder setRecordList(int index, SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(SacrificeRecordData value) {
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

         public Builder addRecordList(int index, SacrificeRecordData value) {
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

         public Builder addRecordList(SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(int index, SacrificeRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordList(Iterable<? extends SacrificeRecordData> values) {
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

         public SacrificeRecordData.Builder getRecordListBuilder(int index) {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().getBuilder(index);
         }

         public SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index) {
            return this.recordListBuilder_ == null ? (SacrificeRecordDataOrBuilder)this.recordList_.get(index) : (SacrificeRecordDataOrBuilder)this.recordListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList() {
            return this.recordListBuilder_ != null ? this.recordListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordList_);
         }

         public SacrificeRecordData.Builder addRecordListBuilder() {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(WarHorseMsg.SacrificeRecordData.getDefaultInstance());
         }

         public SacrificeRecordData.Builder addRecordListBuilder(int index) {
            return (SacrificeRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(index, WarHorseMsg.SacrificeRecordData.getDefaultInstance());
         }

         public List<SacrificeRecordData.Builder> getRecordListBuilderList() {
            return this.getRecordListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SacrificeRecordData, SacrificeRecordData.Builder, SacrificeRecordDataOrBuilder> getRecordListFieldBuilder() {
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

   public static final class SacrificeRecordData extends GeneratedMessageV3 implements SacrificeRecordDataOrBuilder {
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
      private static final SacrificeRecordData DEFAULT_INSTANCE = new SacrificeRecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<SacrificeRecordData> PARSER = new AbstractParser<SacrificeRecordData>() {
         public SacrificeRecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SacrificeRecordData(input, extensionRegistry);
         }
      };

      private SacrificeRecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SacrificeRecordData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SacrificeRecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SacrificeRecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(SacrificeRecordData.class, Builder.class);
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
         } else if (!(obj instanceof SacrificeRecordData)) {
            return super.equals(obj);
         } else {
            SacrificeRecordData other = (SacrificeRecordData)obj;
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

      public static SacrificeRecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data);
      }

      public static SacrificeRecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SacrificeRecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data);
      }

      public static SacrificeRecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SacrificeRecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data);
      }

      public static SacrificeRecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SacrificeRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SacrificeRecordData parseFrom(InputStream input) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SacrificeRecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SacrificeRecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SacrificeRecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SacrificeRecordData parseFrom(CodedInputStream input) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SacrificeRecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SacrificeRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SacrificeRecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SacrificeRecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SacrificeRecordData> parser() {
         return PARSER;
      }

      public Parser<SacrificeRecordData> getParserForType() {
         return PARSER;
      }

      public SacrificeRecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SacrificeRecordDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int resourceType_;
         private int resourceId_;
         private int resourceNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(SacrificeRecordData.class, Builder.class);
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
            if (WarHorseMsg.SacrificeRecordData.alwaysUseFieldBuilders) {
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
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_SacrificeRecordData_descriptor;
         }

         public SacrificeRecordData getDefaultInstanceForType() {
            return WarHorseMsg.SacrificeRecordData.getDefaultInstance();
         }

         public SacrificeRecordData build() {
            SacrificeRecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SacrificeRecordData buildPartial() {
            SacrificeRecordData result = new SacrificeRecordData(this);
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
            if (other instanceof SacrificeRecordData) {
               return this.mergeFrom((SacrificeRecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SacrificeRecordData other) {
            if (other == WarHorseMsg.SacrificeRecordData.getDefaultInstance()) {
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
            SacrificeRecordData parsedMessage = null;

            try {
               parsedMessage = (SacrificeRecordData)WarHorseMsg.SacrificeRecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SacrificeRecordData)e.getUnfinishedMessage();
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
            this.playerName_ = WarHorseMsg.SacrificeRecordData.getDefaultInstance().getPlayerName();
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

   public static final class C2S_SkinUi_13861 extends GeneratedMessageV3 implements C2S_SkinUi_13861OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SkinUi_13861 DEFAULT_INSTANCE = new C2S_SkinUi_13861();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SkinUi_13861> PARSER = new AbstractParser<C2S_SkinUi_13861>() {
         public C2S_SkinUi_13861 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SkinUi_13861(input, extensionRegistry);
         }
      };

      private C2S_SkinUi_13861(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SkinUi_13861() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SkinUi_13861();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SkinUi_13861(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkinUi_13861.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SkinUi_13861)) {
            return super.equals(obj);
         } else {
            C2S_SkinUi_13861 other = (C2S_SkinUi_13861)obj;
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

      public static C2S_SkinUi_13861 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SkinUi_13861)PARSER.parseFrom(data);
      }

      public static C2S_SkinUi_13861 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkinUi_13861)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkinUi_13861 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SkinUi_13861)PARSER.parseFrom(data);
      }

      public static C2S_SkinUi_13861 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkinUi_13861)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkinUi_13861 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SkinUi_13861)PARSER.parseFrom(data);
      }

      public static C2S_SkinUi_13861 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkinUi_13861)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkinUi_13861 parseFrom(InputStream input) throws IOException {
         return (C2S_SkinUi_13861)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkinUi_13861 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkinUi_13861)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkinUi_13861 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SkinUi_13861)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SkinUi_13861 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkinUi_13861)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkinUi_13861 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SkinUi_13861)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkinUi_13861 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkinUi_13861)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SkinUi_13861 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SkinUi_13861 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SkinUi_13861> parser() {
         return PARSER;
      }

      public Parser<C2S_SkinUi_13861> getParserForType() {
         return PARSER;
      }

      public C2S_SkinUi_13861 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SkinUi_13861OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkinUi_13861.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_SkinUi_13861.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_SkinUi_13861_descriptor;
         }

         public C2S_SkinUi_13861 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_SkinUi_13861.getDefaultInstance();
         }

         public C2S_SkinUi_13861 build() {
            C2S_SkinUi_13861 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SkinUi_13861 buildPartial() {
            C2S_SkinUi_13861 result = new C2S_SkinUi_13861(this);
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
            if (other instanceof C2S_SkinUi_13861) {
               return this.mergeFrom((C2S_SkinUi_13861)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SkinUi_13861 other) {
            if (other == WarHorseMsg.C2S_SkinUi_13861.getDefaultInstance()) {
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
            C2S_SkinUi_13861 parsedMessage = null;

            try {
               parsedMessage = (C2S_SkinUi_13861)WarHorseMsg.C2S_SkinUi_13861.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SkinUi_13861)e.getUnfinishedMessage();
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

   public static final class S2C_SkinUi_13862 extends GeneratedMessageV3 implements S2C_SkinUi_13862OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int HORSEIDS_FIELD_NUMBER = 1;
      private Internal.IntList horseIds_;
      private byte memoizedIsInitialized;
      private static final S2C_SkinUi_13862 DEFAULT_INSTANCE = new S2C_SkinUi_13862();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SkinUi_13862> PARSER = new AbstractParser<S2C_SkinUi_13862>() {
         public S2C_SkinUi_13862 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SkinUi_13862(input, extensionRegistry);
         }
      };

      private S2C_SkinUi_13862(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SkinUi_13862() {
         this.memoizedIsInitialized = -1;
         this.horseIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SkinUi_13862();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SkinUi_13862(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.horseIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.horseIds_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.horseIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.horseIds_.addInt(input.readInt32());
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
                  this.horseIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkinUi_13862.class, Builder.class);
      }

      public List<Integer> getHorseIdsList() {
         return this.horseIds_;
      }

      public int getHorseIdsCount() {
         return this.horseIds_.size();
      }

      public int getHorseIds(int index) {
         return this.horseIds_.getInt(index);
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
         for(int i = 0; i < this.horseIds_.size(); ++i) {
            output.writeInt32(1, this.horseIds_.getInt(i));
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

            for(int i = 0; i < this.horseIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.horseIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHorseIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SkinUi_13862)) {
            return super.equals(obj);
         } else {
            S2C_SkinUi_13862 other = (S2C_SkinUi_13862)obj;
            if (!this.getHorseIdsList().equals(other.getHorseIdsList())) {
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
            if (this.getHorseIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHorseIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SkinUi_13862 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SkinUi_13862)PARSER.parseFrom(data);
      }

      public static S2C_SkinUi_13862 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkinUi_13862)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkinUi_13862 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SkinUi_13862)PARSER.parseFrom(data);
      }

      public static S2C_SkinUi_13862 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkinUi_13862)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkinUi_13862 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SkinUi_13862)PARSER.parseFrom(data);
      }

      public static S2C_SkinUi_13862 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkinUi_13862)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkinUi_13862 parseFrom(InputStream input) throws IOException {
         return (S2C_SkinUi_13862)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkinUi_13862 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkinUi_13862)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkinUi_13862 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SkinUi_13862)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SkinUi_13862 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkinUi_13862)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkinUi_13862 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SkinUi_13862)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkinUi_13862 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkinUi_13862)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SkinUi_13862 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SkinUi_13862 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SkinUi_13862> parser() {
         return PARSER;
      }

      public Parser<S2C_SkinUi_13862> getParserForType() {
         return PARSER;
      }

      public S2C_SkinUi_13862 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SkinUi_13862OrBuilder {
         private int bitField0_;
         private Internal.IntList horseIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkinUi_13862.class, Builder.class);
         }

         private Builder() {
            this.horseIds_ = WarHorseMsg.S2C_SkinUi_13862.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.horseIds_ = WarHorseMsg.S2C_SkinUi_13862.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_SkinUi_13862.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.horseIds_ = WarHorseMsg.S2C_SkinUi_13862.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_SkinUi_13862_descriptor;
         }

         public S2C_SkinUi_13862 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_SkinUi_13862.getDefaultInstance();
         }

         public S2C_SkinUi_13862 build() {
            S2C_SkinUi_13862 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SkinUi_13862 buildPartial() {
            S2C_SkinUi_13862 result = new S2C_SkinUi_13862(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.horseIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.horseIds_ = this.horseIds_;
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
            if (other instanceof S2C_SkinUi_13862) {
               return this.mergeFrom((S2C_SkinUi_13862)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SkinUi_13862 other) {
            if (other == WarHorseMsg.S2C_SkinUi_13862.getDefaultInstance()) {
               return this;
            } else {
               if (!other.horseIds_.isEmpty()) {
                  if (this.horseIds_.isEmpty()) {
                     this.horseIds_ = other.horseIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureHorseIdsIsMutable();
                     this.horseIds_.addAll(other.horseIds_);
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
            S2C_SkinUi_13862 parsedMessage = null;

            try {
               parsedMessage = (S2C_SkinUi_13862)WarHorseMsg.S2C_SkinUi_13862.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SkinUi_13862)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHorseIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.horseIds_ = WarHorseMsg.S2C_SkinUi_13862.mutableCopy(this.horseIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getHorseIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.horseIds_) : this.horseIds_);
         }

         public int getHorseIdsCount() {
            return this.horseIds_.size();
         }

         public int getHorseIds(int index) {
            return this.horseIds_.getInt(index);
         }

         public Builder setHorseIds(int index, int value) {
            this.ensureHorseIdsIsMutable();
            this.horseIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHorseIds(int value) {
            this.ensureHorseIdsIsMutable();
            this.horseIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHorseIds(Iterable<? extends Integer> values) {
            this.ensureHorseIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.horseIds_);
            this.onChanged();
            return this;
         }

         public Builder clearHorseIds() {
            this.horseIds_ = WarHorseMsg.S2C_SkinUi_13862.emptyIntList();
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

   public static final class C2S_HorseSkin_13863 extends GeneratedMessageV3 implements C2S_HorseSkin_13863OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int SKINID_FIELD_NUMBER = 3;
      private int skinId_;
      private byte memoizedIsInitialized;
      private static final C2S_HorseSkin_13863 DEFAULT_INSTANCE = new C2S_HorseSkin_13863();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HorseSkin_13863> PARSER = new AbstractParser<C2S_HorseSkin_13863>() {
         public C2S_HorseSkin_13863 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HorseSkin_13863(input, extensionRegistry);
         }
      };

      private C2S_HorseSkin_13863(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HorseSkin_13863() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HorseSkin_13863();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HorseSkin_13863(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.skinId_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HorseSkin_13863.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasSkinId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSkinId() {
         return this.skinId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkinId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.skinId_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.skinId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HorseSkin_13863)) {
            return super.equals(obj);
         } else {
            C2S_HorseSkin_13863 other = (C2S_HorseSkin_13863)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasSkinId() != other.hasSkinId()) {
               return false;
            } else if (this.hasSkinId() && this.getSkinId() != other.getSkinId()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasSkinId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSkinId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HorseSkin_13863 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HorseSkin_13863)PARSER.parseFrom(data);
      }

      public static C2S_HorseSkin_13863 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HorseSkin_13863)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HorseSkin_13863 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HorseSkin_13863)PARSER.parseFrom(data);
      }

      public static C2S_HorseSkin_13863 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HorseSkin_13863)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HorseSkin_13863 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HorseSkin_13863)PARSER.parseFrom(data);
      }

      public static C2S_HorseSkin_13863 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HorseSkin_13863)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HorseSkin_13863 parseFrom(InputStream input) throws IOException {
         return (C2S_HorseSkin_13863)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HorseSkin_13863 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HorseSkin_13863)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HorseSkin_13863 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HorseSkin_13863)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HorseSkin_13863 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HorseSkin_13863)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HorseSkin_13863 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HorseSkin_13863)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HorseSkin_13863 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HorseSkin_13863)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HorseSkin_13863 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HorseSkin_13863 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HorseSkin_13863> parser() {
         return PARSER;
      }

      public Parser<C2S_HorseSkin_13863> getParserForType() {
         return PARSER;
      }

      public C2S_HorseSkin_13863 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HorseSkin_13863OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int code_;
         private int skinId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HorseSkin_13863.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_HorseSkin_13863.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.skinId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseSkin_13863_descriptor;
         }

         public C2S_HorseSkin_13863 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_HorseSkin_13863.getDefaultInstance();
         }

         public C2S_HorseSkin_13863 build() {
            C2S_HorseSkin_13863 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HorseSkin_13863 buildPartial() {
            C2S_HorseSkin_13863 result = new C2S_HorseSkin_13863(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.skinId_ = this.skinId_;
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
            if (other instanceof C2S_HorseSkin_13863) {
               return this.mergeFrom((C2S_HorseSkin_13863)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HorseSkin_13863 other) {
            if (other == WarHorseMsg.C2S_HorseSkin_13863.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasSkinId()) {
                  this.setSkinId(other.getSkinId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasSkinId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HorseSkin_13863 parsedMessage = null;

            try {
               parsedMessage = (C2S_HorseSkin_13863)WarHorseMsg.C2S_HorseSkin_13863.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HorseSkin_13863)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkinId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSkinId() {
            return this.skinId_;
         }

         public Builder setSkinId(int value) {
            this.bitField0_ |= 4;
            this.skinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkinId() {
            this.bitField0_ &= -5;
            this.skinId_ = 0;
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

   public static final class S2C_HorseSkin_13864 extends GeneratedMessageV3 implements S2C_HorseSkin_13864OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODETYPE_FIELD_NUMBER = 1;
      private int codeType_;
      public static final int RESULT_FIELD_NUMBER = 2;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 3;
      private int code_;
      public static final int SKINID_FIELD_NUMBER = 4;
      private int skinId_;
      private byte memoizedIsInitialized;
      private static final S2C_HorseSkin_13864 DEFAULT_INSTANCE = new S2C_HorseSkin_13864();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HorseSkin_13864> PARSER = new AbstractParser<S2C_HorseSkin_13864>() {
         public S2C_HorseSkin_13864 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HorseSkin_13864(input, extensionRegistry);
         }
      };

      private S2C_HorseSkin_13864(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HorseSkin_13864() {
         this.memoizedIsInitialized = -1;
         this.codeType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HorseSkin_13864();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HorseSkin_13864(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CodeType value = WarHorseMsg.CodeType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.codeType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.code_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.skinId_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HorseSkin_13864.class, Builder.class);
      }

      public boolean hasCodeType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CodeType getCodeType() {
         CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
         return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasSkinId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSkinId() {
         return this.skinId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCodeType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkinId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.codeType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.result_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.code_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.skinId_);
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
               size += CodedOutputStream.computeEnumSize(1, this.codeType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.result_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.code_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.skinId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HorseSkin_13864)) {
            return super.equals(obj);
         } else {
            S2C_HorseSkin_13864 other = (S2C_HorseSkin_13864)obj;
            if (this.hasCodeType() != other.hasCodeType()) {
               return false;
            } else if (this.hasCodeType() && this.codeType_ != other.codeType_) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasSkinId() != other.hasSkinId()) {
               return false;
            } else if (this.hasSkinId() && this.getSkinId() != other.getSkinId()) {
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
            if (this.hasCodeType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.codeType_;
            }

            if (this.hasResult()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasSkinId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSkinId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HorseSkin_13864 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HorseSkin_13864)PARSER.parseFrom(data);
      }

      public static S2C_HorseSkin_13864 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HorseSkin_13864)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HorseSkin_13864 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HorseSkin_13864)PARSER.parseFrom(data);
      }

      public static S2C_HorseSkin_13864 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HorseSkin_13864)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HorseSkin_13864 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HorseSkin_13864)PARSER.parseFrom(data);
      }

      public static S2C_HorseSkin_13864 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HorseSkin_13864)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HorseSkin_13864 parseFrom(InputStream input) throws IOException {
         return (S2C_HorseSkin_13864)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HorseSkin_13864 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HorseSkin_13864)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HorseSkin_13864 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HorseSkin_13864)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HorseSkin_13864 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HorseSkin_13864)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HorseSkin_13864 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HorseSkin_13864)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HorseSkin_13864 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HorseSkin_13864)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HorseSkin_13864 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HorseSkin_13864 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HorseSkin_13864> parser() {
         return PARSER;
      }

      public Parser<S2C_HorseSkin_13864> getParserForType() {
         return PARSER;
      }

      public S2C_HorseSkin_13864 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HorseSkin_13864OrBuilder {
         private int bitField0_;
         private int codeType_;
         private int result_;
         private int code_;
         private int skinId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HorseSkin_13864.class, Builder.class);
         }

         private Builder() {
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codeType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_HorseSkin_13864.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codeType_ = 1;
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.bitField0_ &= -3;
            this.code_ = 0;
            this.bitField0_ &= -5;
            this.skinId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseSkin_13864_descriptor;
         }

         public S2C_HorseSkin_13864 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_HorseSkin_13864.getDefaultInstance();
         }

         public S2C_HorseSkin_13864 build() {
            S2C_HorseSkin_13864 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HorseSkin_13864 buildPartial() {
            S2C_HorseSkin_13864 result = new S2C_HorseSkin_13864(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.codeType_ = this.codeType_;
            if ((from_bitField0_ & 2) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.skinId_ = this.skinId_;
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
            if (other instanceof S2C_HorseSkin_13864) {
               return this.mergeFrom((S2C_HorseSkin_13864)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HorseSkin_13864 other) {
            if (other == WarHorseMsg.S2C_HorseSkin_13864.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCodeType()) {
                  this.setCodeType(other.getCodeType());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasSkinId()) {
                  this.setSkinId(other.getSkinId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCodeType()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasSkinId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HorseSkin_13864 parsedMessage = null;

            try {
               parsedMessage = (S2C_HorseSkin_13864)WarHorseMsg.S2C_HorseSkin_13864.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HorseSkin_13864)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCodeType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CodeType getCodeType() {
            CodeType result = WarHorseMsg.CodeType.valueOf(this.codeType_);
            return result == null ? WarHorseMsg.CodeType.CODE_YPTE_HERO : result;
         }

         public Builder setCodeType(CodeType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.codeType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCodeType() {
            this.bitField0_ &= -2;
            this.codeType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 2;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 4;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -5;
            this.code_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkinId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSkinId() {
            return this.skinId_;
         }

         public Builder setSkinId(int value) {
            this.bitField0_ |= 8;
            this.skinId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkinId() {
            this.bitField0_ &= -9;
            this.skinId_ = 0;
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

   public static final class C2S_WatchHorse_13871 extends GeneratedMessageV3 implements C2S_WatchHorse_13871OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WatchHorse_13871 DEFAULT_INSTANCE = new C2S_WatchHorse_13871();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WatchHorse_13871> PARSER = new AbstractParser<C2S_WatchHorse_13871>() {
         public C2S_WatchHorse_13871 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WatchHorse_13871(input, extensionRegistry);
         }
      };

      private C2S_WatchHorse_13871(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WatchHorse_13871() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WatchHorse_13871();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WatchHorse_13871(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchHorse_13871.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WatchHorse_13871)) {
            return super.equals(obj);
         } else {
            C2S_WatchHorse_13871 other = (C2S_WatchHorse_13871)obj;
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

      public static C2S_WatchHorse_13871 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WatchHorse_13871)PARSER.parseFrom(data);
      }

      public static C2S_WatchHorse_13871 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchHorse_13871)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchHorse_13871 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WatchHorse_13871)PARSER.parseFrom(data);
      }

      public static C2S_WatchHorse_13871 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchHorse_13871)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchHorse_13871 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WatchHorse_13871)PARSER.parseFrom(data);
      }

      public static C2S_WatchHorse_13871 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WatchHorse_13871)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WatchHorse_13871 parseFrom(InputStream input) throws IOException {
         return (C2S_WatchHorse_13871)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchHorse_13871 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchHorse_13871)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchHorse_13871 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WatchHorse_13871)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WatchHorse_13871 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchHorse_13871)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WatchHorse_13871 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WatchHorse_13871)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WatchHorse_13871 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WatchHorse_13871)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WatchHorse_13871 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WatchHorse_13871 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WatchHorse_13871> parser() {
         return PARSER;
      }

      public Parser<C2S_WatchHorse_13871> getParserForType() {
         return PARSER;
      }

      public C2S_WatchHorse_13871 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WatchHorse_13871OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WatchHorse_13871.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_WatchHorse_13871.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_WatchHorse_13871_descriptor;
         }

         public C2S_WatchHorse_13871 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_WatchHorse_13871.getDefaultInstance();
         }

         public C2S_WatchHorse_13871 build() {
            C2S_WatchHorse_13871 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WatchHorse_13871 buildPartial() {
            C2S_WatchHorse_13871 result = new C2S_WatchHorse_13871(this);
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
            if (other instanceof C2S_WatchHorse_13871) {
               return this.mergeFrom((C2S_WatchHorse_13871)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WatchHorse_13871 other) {
            if (other == WarHorseMsg.C2S_WatchHorse_13871.getDefaultInstance()) {
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
            C2S_WatchHorse_13871 parsedMessage = null;

            try {
               parsedMessage = (C2S_WatchHorse_13871)WarHorseMsg.C2S_WatchHorse_13871.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WatchHorse_13871)e.getUnfinishedMessage();
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

   public static final class S2C_WatchHorse_13872 extends GeneratedMessageV3 implements S2C_WatchHorse_13872OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_WatchHorse_13872 DEFAULT_INSTANCE = new S2C_WatchHorse_13872();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WatchHorse_13872> PARSER = new AbstractParser<S2C_WatchHorse_13872>() {
         public S2C_WatchHorse_13872 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WatchHorse_13872(input, extensionRegistry);
         }
      };

      private S2C_WatchHorse_13872(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WatchHorse_13872() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WatchHorse_13872();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WatchHorse_13872(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchHorse_13872.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WatchHorse_13872)) {
            return super.equals(obj);
         } else {
            S2C_WatchHorse_13872 other = (S2C_WatchHorse_13872)obj;
            if (this.hasResult() != other.hasResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WatchHorse_13872 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WatchHorse_13872)PARSER.parseFrom(data);
      }

      public static S2C_WatchHorse_13872 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchHorse_13872)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchHorse_13872 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WatchHorse_13872)PARSER.parseFrom(data);
      }

      public static S2C_WatchHorse_13872 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchHorse_13872)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchHorse_13872 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WatchHorse_13872)PARSER.parseFrom(data);
      }

      public static S2C_WatchHorse_13872 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WatchHorse_13872)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WatchHorse_13872 parseFrom(InputStream input) throws IOException {
         return (S2C_WatchHorse_13872)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchHorse_13872 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchHorse_13872)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchHorse_13872 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WatchHorse_13872)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WatchHorse_13872 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchHorse_13872)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WatchHorse_13872 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WatchHorse_13872)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WatchHorse_13872 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WatchHorse_13872)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WatchHorse_13872 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WatchHorse_13872 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WatchHorse_13872> parser() {
         return PARSER;
      }

      public Parser<S2C_WatchHorse_13872> getParserForType() {
         return PARSER;
      }

      public S2C_WatchHorse_13872 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WatchHorse_13872OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WatchHorse_13872.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_WatchHorse_13872.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_WatchHorse_13872_descriptor;
         }

         public S2C_WatchHorse_13872 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_WatchHorse_13872.getDefaultInstance();
         }

         public S2C_WatchHorse_13872 build() {
            S2C_WatchHorse_13872 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WatchHorse_13872 buildPartial() {
            S2C_WatchHorse_13872 result = new S2C_WatchHorse_13872(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_WatchHorse_13872) {
               return this.mergeFrom((S2C_WatchHorse_13872)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WatchHorse_13872 other) {
            if (other == WarHorseMsg.S2C_WatchHorse_13872.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            S2C_WatchHorse_13872 parsedMessage = null;

            try {
               parsedMessage = (S2C_WatchHorse_13872)WarHorseMsg.S2C_WatchHorse_13872.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WatchHorse_13872)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_UpdateIds_13873 extends GeneratedMessageV3 implements C2S_UpdateIds_13873OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UpdateIds_13873 DEFAULT_INSTANCE = new C2S_UpdateIds_13873();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpdateIds_13873> PARSER = new AbstractParser<C2S_UpdateIds_13873>() {
         public C2S_UpdateIds_13873 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpdateIds_13873(input, extensionRegistry);
         }
      };

      private C2S_UpdateIds_13873(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpdateIds_13873() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpdateIds_13873();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpdateIds_13873(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateIds_13873.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UpdateIds_13873)) {
            return super.equals(obj);
         } else {
            C2S_UpdateIds_13873 other = (C2S_UpdateIds_13873)obj;
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

      public static C2S_UpdateIds_13873 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpdateIds_13873)PARSER.parseFrom(data);
      }

      public static C2S_UpdateIds_13873 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateIds_13873)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateIds_13873 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpdateIds_13873)PARSER.parseFrom(data);
      }

      public static C2S_UpdateIds_13873 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateIds_13873)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateIds_13873 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpdateIds_13873)PARSER.parseFrom(data);
      }

      public static C2S_UpdateIds_13873 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateIds_13873)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateIds_13873 parseFrom(InputStream input) throws IOException {
         return (C2S_UpdateIds_13873)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateIds_13873 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateIds_13873)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateIds_13873 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpdateIds_13873)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpdateIds_13873 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateIds_13873)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateIds_13873 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpdateIds_13873)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateIds_13873 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateIds_13873)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpdateIds_13873 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpdateIds_13873 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpdateIds_13873> parser() {
         return PARSER;
      }

      public Parser<C2S_UpdateIds_13873> getParserForType() {
         return PARSER;
      }

      public C2S_UpdateIds_13873 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpdateIds_13873OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateIds_13873.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_UpdateIds_13873.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UpdateIds_13873_descriptor;
         }

         public C2S_UpdateIds_13873 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_UpdateIds_13873.getDefaultInstance();
         }

         public C2S_UpdateIds_13873 build() {
            C2S_UpdateIds_13873 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpdateIds_13873 buildPartial() {
            C2S_UpdateIds_13873 result = new C2S_UpdateIds_13873(this);
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
            if (other instanceof C2S_UpdateIds_13873) {
               return this.mergeFrom((C2S_UpdateIds_13873)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpdateIds_13873 other) {
            if (other == WarHorseMsg.C2S_UpdateIds_13873.getDefaultInstance()) {
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
            C2S_UpdateIds_13873 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpdateIds_13873)WarHorseMsg.C2S_UpdateIds_13873.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpdateIds_13873)e.getUnfinishedMessage();
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

   public static final class S2C_UpdateIds_13874 extends GeneratedMessageV3 implements S2C_UpdateIds_13874OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int NEWHORSEIDS_FIELD_NUMBER = 2;
      private Internal.IntList newHorseIds_;
      public static final int HORSEIDS_FIELD_NUMBER = 1;
      private Internal.IntList horseIds_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateIds_13874 DEFAULT_INSTANCE = new S2C_UpdateIds_13874();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateIds_13874> PARSER = new AbstractParser<S2C_UpdateIds_13874>() {
         public S2C_UpdateIds_13874 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateIds_13874(input, extensionRegistry);
         }
      };

      private S2C_UpdateIds_13874(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateIds_13874() {
         this.memoizedIsInitialized = -1;
         this.newHorseIds_ = emptyIntList();
         this.horseIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateIds_13874();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateIds_13874(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.horseIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.horseIds_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.horseIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.newHorseIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.newHorseIds_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.newHorseIds_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.newHorseIds_.addInt(input.readInt32());
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
                     this.horseIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.horseIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 1) != 0) {
                  this.newHorseIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateIds_13874.class, Builder.class);
      }

      public List<Integer> getNewHorseIdsList() {
         return this.newHorseIds_;
      }

      public int getNewHorseIdsCount() {
         return this.newHorseIds_.size();
      }

      public int getNewHorseIds(int index) {
         return this.newHorseIds_.getInt(index);
      }

      public List<Integer> getHorseIdsList() {
         return this.horseIds_;
      }

      public int getHorseIdsCount() {
         return this.horseIds_.size();
      }

      public int getHorseIds(int index) {
         return this.horseIds_.getInt(index);
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
         for(int i = 0; i < this.horseIds_.size(); ++i) {
            output.writeInt32(1, this.horseIds_.getInt(i));
         }

         for(int i = 0; i < this.newHorseIds_.size(); ++i) {
            output.writeInt32(2, this.newHorseIds_.getInt(i));
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

            for(int i = 0; i < this.horseIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.horseIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHorseIdsList().size();
            dataSize = 0;

            for(int i = 0; i < this.newHorseIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.newHorseIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getNewHorseIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateIds_13874)) {
            return super.equals(obj);
         } else {
            S2C_UpdateIds_13874 other = (S2C_UpdateIds_13874)obj;
            if (!this.getNewHorseIdsList().equals(other.getNewHorseIdsList())) {
               return false;
            } else if (!this.getHorseIdsList().equals(other.getHorseIdsList())) {
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
            if (this.getNewHorseIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNewHorseIdsList().hashCode();
            }

            if (this.getHorseIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHorseIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateIds_13874 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateIds_13874)PARSER.parseFrom(data);
      }

      public static S2C_UpdateIds_13874 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateIds_13874)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateIds_13874 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateIds_13874)PARSER.parseFrom(data);
      }

      public static S2C_UpdateIds_13874 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateIds_13874)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateIds_13874 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateIds_13874)PARSER.parseFrom(data);
      }

      public static S2C_UpdateIds_13874 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateIds_13874)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateIds_13874 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateIds_13874)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateIds_13874 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateIds_13874)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateIds_13874 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateIds_13874)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateIds_13874 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateIds_13874)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateIds_13874 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateIds_13874)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateIds_13874 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateIds_13874)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateIds_13874 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateIds_13874 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateIds_13874> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateIds_13874> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateIds_13874 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateIds_13874OrBuilder {
         private int bitField0_;
         private Internal.IntList newHorseIds_;
         private Internal.IntList horseIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateIds_13874.class, Builder.class);
         }

         private Builder() {
            this.newHorseIds_ = WarHorseMsg.S2C_UpdateIds_13874.emptyIntList();
            this.horseIds_ = WarHorseMsg.S2C_UpdateIds_13874.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.newHorseIds_ = WarHorseMsg.S2C_UpdateIds_13874.emptyIntList();
            this.horseIds_ = WarHorseMsg.S2C_UpdateIds_13874.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_UpdateIds_13874.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.newHorseIds_ = WarHorseMsg.S2C_UpdateIds_13874.emptyIntList();
            this.bitField0_ &= -2;
            this.horseIds_ = WarHorseMsg.S2C_UpdateIds_13874.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UpdateIds_13874_descriptor;
         }

         public S2C_UpdateIds_13874 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_UpdateIds_13874.getDefaultInstance();
         }

         public S2C_UpdateIds_13874 build() {
            S2C_UpdateIds_13874 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateIds_13874 buildPartial() {
            S2C_UpdateIds_13874 result = new S2C_UpdateIds_13874(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.newHorseIds_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.newHorseIds_ = this.newHorseIds_;
            if ((this.bitField0_ & 2) != 0) {
               this.horseIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.horseIds_ = this.horseIds_;
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
            if (other instanceof S2C_UpdateIds_13874) {
               return this.mergeFrom((S2C_UpdateIds_13874)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateIds_13874 other) {
            if (other == WarHorseMsg.S2C_UpdateIds_13874.getDefaultInstance()) {
               return this;
            } else {
               if (!other.newHorseIds_.isEmpty()) {
                  if (this.newHorseIds_.isEmpty()) {
                     this.newHorseIds_ = other.newHorseIds_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureNewHorseIdsIsMutable();
                     this.newHorseIds_.addAll(other.newHorseIds_);
                  }

                  this.onChanged();
               }

               if (!other.horseIds_.isEmpty()) {
                  if (this.horseIds_.isEmpty()) {
                     this.horseIds_ = other.horseIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHorseIdsIsMutable();
                     this.horseIds_.addAll(other.horseIds_);
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
            S2C_UpdateIds_13874 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateIds_13874)WarHorseMsg.S2C_UpdateIds_13874.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateIds_13874)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureNewHorseIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.newHorseIds_ = WarHorseMsg.S2C_UpdateIds_13874.mutableCopy(this.newHorseIds_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getNewHorseIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.newHorseIds_) : this.newHorseIds_);
         }

         public int getNewHorseIdsCount() {
            return this.newHorseIds_.size();
         }

         public int getNewHorseIds(int index) {
            return this.newHorseIds_.getInt(index);
         }

         public Builder setNewHorseIds(int index, int value) {
            this.ensureNewHorseIdsIsMutable();
            this.newHorseIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addNewHorseIds(int value) {
            this.ensureNewHorseIdsIsMutable();
            this.newHorseIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllNewHorseIds(Iterable<? extends Integer> values) {
            this.ensureNewHorseIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.newHorseIds_);
            this.onChanged();
            return this;
         }

         public Builder clearNewHorseIds() {
            this.newHorseIds_ = WarHorseMsg.S2C_UpdateIds_13874.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         private void ensureHorseIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.horseIds_ = WarHorseMsg.S2C_UpdateIds_13874.mutableCopy(this.horseIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHorseIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.horseIds_) : this.horseIds_);
         }

         public int getHorseIdsCount() {
            return this.horseIds_.size();
         }

         public int getHorseIds(int index) {
            return this.horseIds_.getInt(index);
         }

         public Builder setHorseIds(int index, int value) {
            this.ensureHorseIdsIsMutable();
            this.horseIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHorseIds(int value) {
            this.ensureHorseIdsIsMutable();
            this.horseIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHorseIds(Iterable<? extends Integer> values) {
            this.ensureHorseIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.horseIds_);
            this.onChanged();
            return this;
         }

         public Builder clearHorseIds() {
            this.horseIds_ = WarHorseMsg.S2C_UpdateIds_13874.emptyIntList();
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

   public static final class C2S_ChangeHorse_13881 extends GeneratedMessageV3 implements C2S_ChangeHorse_13881OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FROMHERO_FIELD_NUMBER = 1;
      private int fromHero_;
      public static final int DESTHERO_FIELD_NUMBER = 2;
      private int destHero_;
      private byte memoizedIsInitialized;
      private static final C2S_ChangeHorse_13881 DEFAULT_INSTANCE = new C2S_ChangeHorse_13881();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChangeHorse_13881> PARSER = new AbstractParser<C2S_ChangeHorse_13881>() {
         public C2S_ChangeHorse_13881 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChangeHorse_13881(input, extensionRegistry);
         }
      };

      private C2S_ChangeHorse_13881(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChangeHorse_13881() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChangeHorse_13881();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChangeHorse_13881(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fromHero_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.destHero_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChangeHorse_13881.class, Builder.class);
      }

      public boolean hasFromHero() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFromHero() {
         return this.fromHero_;
      }

      public boolean hasDestHero() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestHero() {
         return this.destHero_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFromHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fromHero_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.destHero_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fromHero_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.destHero_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ChangeHorse_13881)) {
            return super.equals(obj);
         } else {
            C2S_ChangeHorse_13881 other = (C2S_ChangeHorse_13881)obj;
            if (this.hasFromHero() != other.hasFromHero()) {
               return false;
            } else if (this.hasFromHero() && this.getFromHero() != other.getFromHero()) {
               return false;
            } else if (this.hasDestHero() != other.hasDestHero()) {
               return false;
            } else if (this.hasDestHero() && this.getDestHero() != other.getDestHero()) {
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
            if (this.hasFromHero()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFromHero();
            }

            if (this.hasDestHero()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestHero();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ChangeHorse_13881 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChangeHorse_13881)PARSER.parseFrom(data);
      }

      public static C2S_ChangeHorse_13881 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChangeHorse_13881)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChangeHorse_13881 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChangeHorse_13881)PARSER.parseFrom(data);
      }

      public static C2S_ChangeHorse_13881 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChangeHorse_13881)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChangeHorse_13881 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChangeHorse_13881)PARSER.parseFrom(data);
      }

      public static C2S_ChangeHorse_13881 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChangeHorse_13881)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChangeHorse_13881 parseFrom(InputStream input) throws IOException {
         return (C2S_ChangeHorse_13881)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChangeHorse_13881 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChangeHorse_13881)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChangeHorse_13881 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChangeHorse_13881)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChangeHorse_13881 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChangeHorse_13881)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChangeHorse_13881 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChangeHorse_13881)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChangeHorse_13881 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChangeHorse_13881)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChangeHorse_13881 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChangeHorse_13881 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChangeHorse_13881> parser() {
         return PARSER;
      }

      public Parser<C2S_ChangeHorse_13881> getParserForType() {
         return PARSER;
      }

      public C2S_ChangeHorse_13881 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChangeHorse_13881OrBuilder {
         private int bitField0_;
         private int fromHero_;
         private int destHero_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChangeHorse_13881.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_ChangeHorse_13881.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fromHero_ = 0;
            this.bitField0_ &= -2;
            this.destHero_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_ChangeHorse_13881_descriptor;
         }

         public C2S_ChangeHorse_13881 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_ChangeHorse_13881.getDefaultInstance();
         }

         public C2S_ChangeHorse_13881 build() {
            C2S_ChangeHorse_13881 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChangeHorse_13881 buildPartial() {
            C2S_ChangeHorse_13881 result = new C2S_ChangeHorse_13881(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fromHero_ = this.fromHero_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destHero_ = this.destHero_;
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
            if (other instanceof C2S_ChangeHorse_13881) {
               return this.mergeFrom((C2S_ChangeHorse_13881)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChangeHorse_13881 other) {
            if (other == WarHorseMsg.C2S_ChangeHorse_13881.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFromHero()) {
                  this.setFromHero(other.getFromHero());
               }

               if (other.hasDestHero()) {
                  this.setDestHero(other.getDestHero());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFromHero()) {
               return false;
            } else {
               return this.hasDestHero();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ChangeHorse_13881 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChangeHorse_13881)WarHorseMsg.C2S_ChangeHorse_13881.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChangeHorse_13881)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFromHero() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFromHero() {
            return this.fromHero_;
         }

         public Builder setFromHero(int value) {
            this.bitField0_ |= 1;
            this.fromHero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFromHero() {
            this.bitField0_ &= -2;
            this.fromHero_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestHero() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDestHero() {
            return this.destHero_;
         }

         public Builder setDestHero(int value) {
            this.bitField0_ |= 2;
            this.destHero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestHero() {
            this.bitField0_ &= -3;
            this.destHero_ = 0;
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

   public static final class S2C_ChangeHorse_13882 extends GeneratedMessageV3 implements S2C_ChangeHorse_13882OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FROMHERO_FIELD_NUMBER = 1;
      private int fromHero_;
      public static final int DESTHERO_FIELD_NUMBER = 2;
      private int destHero_;
      private byte memoizedIsInitialized;
      private static final S2C_ChangeHorse_13882 DEFAULT_INSTANCE = new S2C_ChangeHorse_13882();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChangeHorse_13882> PARSER = new AbstractParser<S2C_ChangeHorse_13882>() {
         public S2C_ChangeHorse_13882 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChangeHorse_13882(input, extensionRegistry);
         }
      };

      private S2C_ChangeHorse_13882(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChangeHorse_13882() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChangeHorse_13882();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChangeHorse_13882(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fromHero_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.destHero_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChangeHorse_13882.class, Builder.class);
      }

      public boolean hasFromHero() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFromHero() {
         return this.fromHero_;
      }

      public boolean hasDestHero() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDestHero() {
         return this.destHero_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFromHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestHero()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fromHero_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.destHero_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fromHero_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.destHero_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChangeHorse_13882)) {
            return super.equals(obj);
         } else {
            S2C_ChangeHorse_13882 other = (S2C_ChangeHorse_13882)obj;
            if (this.hasFromHero() != other.hasFromHero()) {
               return false;
            } else if (this.hasFromHero() && this.getFromHero() != other.getFromHero()) {
               return false;
            } else if (this.hasDestHero() != other.hasDestHero()) {
               return false;
            } else if (this.hasDestHero() && this.getDestHero() != other.getDestHero()) {
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
            if (this.hasFromHero()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFromHero();
            }

            if (this.hasDestHero()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDestHero();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChangeHorse_13882 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChangeHorse_13882)PARSER.parseFrom(data);
      }

      public static S2C_ChangeHorse_13882 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangeHorse_13882)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangeHorse_13882 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChangeHorse_13882)PARSER.parseFrom(data);
      }

      public static S2C_ChangeHorse_13882 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangeHorse_13882)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangeHorse_13882 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChangeHorse_13882)PARSER.parseFrom(data);
      }

      public static S2C_ChangeHorse_13882 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangeHorse_13882)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangeHorse_13882 parseFrom(InputStream input) throws IOException {
         return (S2C_ChangeHorse_13882)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChangeHorse_13882 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangeHorse_13882)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChangeHorse_13882 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChangeHorse_13882)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChangeHorse_13882 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangeHorse_13882)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChangeHorse_13882 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChangeHorse_13882)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChangeHorse_13882 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangeHorse_13882)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChangeHorse_13882 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChangeHorse_13882 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChangeHorse_13882> parser() {
         return PARSER;
      }

      public Parser<S2C_ChangeHorse_13882> getParserForType() {
         return PARSER;
      }

      public S2C_ChangeHorse_13882 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChangeHorse_13882OrBuilder {
         private int bitField0_;
         private int fromHero_;
         private int destHero_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChangeHorse_13882.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_ChangeHorse_13882.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fromHero_ = 0;
            this.bitField0_ &= -2;
            this.destHero_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_ChangeHorse_13882_descriptor;
         }

         public S2C_ChangeHorse_13882 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_ChangeHorse_13882.getDefaultInstance();
         }

         public S2C_ChangeHorse_13882 build() {
            S2C_ChangeHorse_13882 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChangeHorse_13882 buildPartial() {
            S2C_ChangeHorse_13882 result = new S2C_ChangeHorse_13882(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fromHero_ = this.fromHero_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.destHero_ = this.destHero_;
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
            if (other instanceof S2C_ChangeHorse_13882) {
               return this.mergeFrom((S2C_ChangeHorse_13882)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChangeHorse_13882 other) {
            if (other == WarHorseMsg.S2C_ChangeHorse_13882.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFromHero()) {
                  this.setFromHero(other.getFromHero());
               }

               if (other.hasDestHero()) {
                  this.setDestHero(other.getDestHero());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFromHero()) {
               return false;
            } else {
               return this.hasDestHero();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChangeHorse_13882 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChangeHorse_13882)WarHorseMsg.S2C_ChangeHorse_13882.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChangeHorse_13882)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFromHero() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFromHero() {
            return this.fromHero_;
         }

         public Builder setFromHero(int value) {
            this.bitField0_ |= 1;
            this.fromHero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFromHero() {
            this.bitField0_ &= -2;
            this.fromHero_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestHero() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDestHero() {
            return this.destHero_;
         }

         public Builder setDestHero(int value) {
            this.bitField0_ |= 2;
            this.destHero_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestHero() {
            this.bitField0_ &= -3;
            this.destHero_ = 0;
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

   public static final class C2S_Awaken_13883 extends GeneratedMessageV3 implements C2S_Awaken_13883OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Awaken_13883 DEFAULT_INSTANCE = new C2S_Awaken_13883();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Awaken_13883> PARSER = new AbstractParser<C2S_Awaken_13883>() {
         public C2S_Awaken_13883 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Awaken_13883(input, extensionRegistry);
         }
      };

      private C2S_Awaken_13883(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Awaken_13883() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Awaken_13883();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Awaken_13883(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Awaken_13883.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Awaken_13883)) {
            return super.equals(obj);
         } else {
            C2S_Awaken_13883 other = (C2S_Awaken_13883)obj;
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

      public static C2S_Awaken_13883 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Awaken_13883)PARSER.parseFrom(data);
      }

      public static C2S_Awaken_13883 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Awaken_13883)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Awaken_13883 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Awaken_13883)PARSER.parseFrom(data);
      }

      public static C2S_Awaken_13883 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Awaken_13883)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Awaken_13883 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Awaken_13883)PARSER.parseFrom(data);
      }

      public static C2S_Awaken_13883 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Awaken_13883)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Awaken_13883 parseFrom(InputStream input) throws IOException {
         return (C2S_Awaken_13883)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Awaken_13883 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Awaken_13883)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Awaken_13883 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Awaken_13883)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Awaken_13883 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Awaken_13883)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Awaken_13883 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Awaken_13883)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Awaken_13883 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Awaken_13883)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Awaken_13883 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Awaken_13883 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Awaken_13883> parser() {
         return PARSER;
      }

      public Parser<C2S_Awaken_13883> getParserForType() {
         return PARSER;
      }

      public C2S_Awaken_13883 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Awaken_13883OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Awaken_13883.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_Awaken_13883.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_Awaken_13883_descriptor;
         }

         public C2S_Awaken_13883 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_Awaken_13883.getDefaultInstance();
         }

         public C2S_Awaken_13883 build() {
            C2S_Awaken_13883 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Awaken_13883 buildPartial() {
            C2S_Awaken_13883 result = new C2S_Awaken_13883(this);
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
            if (other instanceof C2S_Awaken_13883) {
               return this.mergeFrom((C2S_Awaken_13883)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Awaken_13883 other) {
            if (other == WarHorseMsg.C2S_Awaken_13883.getDefaultInstance()) {
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
            C2S_Awaken_13883 parsedMessage = null;

            try {
               parsedMessage = (C2S_Awaken_13883)WarHorseMsg.C2S_Awaken_13883.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Awaken_13883)e.getUnfinishedMessage();
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

   public static final class S2C_Awaken_13884 extends GeneratedMessageV3 implements S2C_Awaken_13884OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final S2C_Awaken_13884 DEFAULT_INSTANCE = new S2C_Awaken_13884();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Awaken_13884> PARSER = new AbstractParser<S2C_Awaken_13884>() {
         public S2C_Awaken_13884 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Awaken_13884(input, extensionRegistry);
         }
      };

      private S2C_Awaken_13884(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Awaken_13884() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Awaken_13884();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Awaken_13884(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Awaken_13884.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Awaken_13884)) {
            return super.equals(obj);
         } else {
            S2C_Awaken_13884 other = (S2C_Awaken_13884)obj;
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

      public static S2C_Awaken_13884 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Awaken_13884)PARSER.parseFrom(data);
      }

      public static S2C_Awaken_13884 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Awaken_13884)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Awaken_13884 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Awaken_13884)PARSER.parseFrom(data);
      }

      public static S2C_Awaken_13884 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Awaken_13884)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Awaken_13884 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Awaken_13884)PARSER.parseFrom(data);
      }

      public static S2C_Awaken_13884 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Awaken_13884)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Awaken_13884 parseFrom(InputStream input) throws IOException {
         return (S2C_Awaken_13884)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Awaken_13884 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Awaken_13884)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Awaken_13884 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Awaken_13884)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Awaken_13884 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Awaken_13884)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Awaken_13884 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Awaken_13884)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Awaken_13884 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Awaken_13884)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Awaken_13884 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Awaken_13884 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Awaken_13884> parser() {
         return PARSER;
      }

      public Parser<S2C_Awaken_13884> getParserForType() {
         return PARSER;
      }

      public S2C_Awaken_13884 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Awaken_13884OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Awaken_13884.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_Awaken_13884.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_Awaken_13884_descriptor;
         }

         public S2C_Awaken_13884 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_Awaken_13884.getDefaultInstance();
         }

         public S2C_Awaken_13884 build() {
            S2C_Awaken_13884 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Awaken_13884 buildPartial() {
            S2C_Awaken_13884 result = new S2C_Awaken_13884(this);
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
            if (other instanceof S2C_Awaken_13884) {
               return this.mergeFrom((S2C_Awaken_13884)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Awaken_13884 other) {
            if (other == WarHorseMsg.S2C_Awaken_13884.getDefaultInstance()) {
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
            S2C_Awaken_13884 parsedMessage = null;

            try {
               parsedMessage = (S2C_Awaken_13884)WarHorseMsg.S2C_Awaken_13884.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Awaken_13884)e.getUnfinishedMessage();
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

   public static final class C2S_UseHorseItem_13885 extends GeneratedMessageV3 implements C2S_UseHorseItem_13885OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private int itemCode_;
      public static final int SKILLID_FIELD_NUMBER = 2;
      private int skillId_;
      private byte memoizedIsInitialized;
      private static final C2S_UseHorseItem_13885 DEFAULT_INSTANCE = new C2S_UseHorseItem_13885();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UseHorseItem_13885> PARSER = new AbstractParser<C2S_UseHorseItem_13885>() {
         public C2S_UseHorseItem_13885 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UseHorseItem_13885(input, extensionRegistry);
         }
      };

      private C2S_UseHorseItem_13885(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UseHorseItem_13885() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UseHorseItem_13885();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UseHorseItem_13885(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.skillId_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseHorseItem_13885.class, Builder.class);
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
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
            output.writeInt32(1, this.itemCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.skillId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.skillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UseHorseItem_13885)) {
            return super.equals(obj);
         } else {
            C2S_UseHorseItem_13885 other = (C2S_UseHorseItem_13885)obj;
            if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
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

            if (this.hasSkillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UseHorseItem_13885 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UseHorseItem_13885)PARSER.parseFrom(data);
      }

      public static C2S_UseHorseItem_13885 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseHorseItem_13885)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseHorseItem_13885 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UseHorseItem_13885)PARSER.parseFrom(data);
      }

      public static C2S_UseHorseItem_13885 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseHorseItem_13885)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseHorseItem_13885 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UseHorseItem_13885)PARSER.parseFrom(data);
      }

      public static C2S_UseHorseItem_13885 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseHorseItem_13885)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseHorseItem_13885 parseFrom(InputStream input) throws IOException {
         return (C2S_UseHorseItem_13885)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseHorseItem_13885 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseHorseItem_13885)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseHorseItem_13885 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UseHorseItem_13885)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UseHorseItem_13885 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseHorseItem_13885)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseHorseItem_13885 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UseHorseItem_13885)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseHorseItem_13885 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseHorseItem_13885)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UseHorseItem_13885 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UseHorseItem_13885 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UseHorseItem_13885> parser() {
         return PARSER;
      }

      public Parser<C2S_UseHorseItem_13885> getParserForType() {
         return PARSER;
      }

      public C2S_UseHorseItem_13885 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UseHorseItem_13885OrBuilder {
         private int bitField0_;
         private int itemCode_;
         private int skillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseHorseItem_13885.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_UseHorseItem_13885.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = 0;
            this.bitField0_ &= -2;
            this.skillId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_UseHorseItem_13885_descriptor;
         }

         public C2S_UseHorseItem_13885 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_UseHorseItem_13885.getDefaultInstance();
         }

         public C2S_UseHorseItem_13885 build() {
            C2S_UseHorseItem_13885 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UseHorseItem_13885 buildPartial() {
            C2S_UseHorseItem_13885 result = new C2S_UseHorseItem_13885(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.skillId_ = this.skillId_;
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
            if (other instanceof C2S_UseHorseItem_13885) {
               return this.mergeFrom((C2S_UseHorseItem_13885)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UseHorseItem_13885 other) {
            if (other == WarHorseMsg.C2S_UseHorseItem_13885.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
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
               return this.hasSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UseHorseItem_13885 parsedMessage = null;

            try {
               parsedMessage = (C2S_UseHorseItem_13885)WarHorseMsg.C2S_UseHorseItem_13885.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UseHorseItem_13885)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_UseHorseItem_13886 extends GeneratedMessageV3 implements S2C_UseHorseItem_13886OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int HORSECODE_FIELD_NUMBER = 2;
      private int horseCode_;
      private byte memoizedIsInitialized;
      private static final S2C_UseHorseItem_13886 DEFAULT_INSTANCE = new S2C_UseHorseItem_13886();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UseHorseItem_13886> PARSER = new AbstractParser<S2C_UseHorseItem_13886>() {
         public S2C_UseHorseItem_13886 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UseHorseItem_13886(input, extensionRegistry);
         }
      };

      private S2C_UseHorseItem_13886(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UseHorseItem_13886() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UseHorseItem_13886();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UseHorseItem_13886(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.horseCode_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UseHorseItem_13886.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasHorseCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHorseCode() {
         return this.horseCode_;
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
         } else if (!this.hasHorseCode()) {
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
            output.writeInt32(2, this.horseCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.horseCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UseHorseItem_13886)) {
            return super.equals(obj);
         } else {
            S2C_UseHorseItem_13886 other = (S2C_UseHorseItem_13886)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasHorseCode() != other.hasHorseCode()) {
               return false;
            } else if (this.hasHorseCode() && this.getHorseCode() != other.getHorseCode()) {
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

            if (this.hasHorseCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHorseCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UseHorseItem_13886 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UseHorseItem_13886)PARSER.parseFrom(data);
      }

      public static S2C_UseHorseItem_13886 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseHorseItem_13886)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseHorseItem_13886 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UseHorseItem_13886)PARSER.parseFrom(data);
      }

      public static S2C_UseHorseItem_13886 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseHorseItem_13886)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseHorseItem_13886 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UseHorseItem_13886)PARSER.parseFrom(data);
      }

      public static S2C_UseHorseItem_13886 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseHorseItem_13886)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseHorseItem_13886 parseFrom(InputStream input) throws IOException {
         return (S2C_UseHorseItem_13886)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UseHorseItem_13886 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseHorseItem_13886)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UseHorseItem_13886 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UseHorseItem_13886)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UseHorseItem_13886 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseHorseItem_13886)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UseHorseItem_13886 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UseHorseItem_13886)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UseHorseItem_13886 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseHorseItem_13886)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UseHorseItem_13886 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UseHorseItem_13886 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UseHorseItem_13886> parser() {
         return PARSER;
      }

      public Parser<S2C_UseHorseItem_13886> getParserForType() {
         return PARSER;
      }

      public S2C_UseHorseItem_13886 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UseHorseItem_13886OrBuilder {
         private int bitField0_;
         private int result_;
         private int horseCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UseHorseItem_13886.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_UseHorseItem_13886.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.horseCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_UseHorseItem_13886_descriptor;
         }

         public S2C_UseHorseItem_13886 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_UseHorseItem_13886.getDefaultInstance();
         }

         public S2C_UseHorseItem_13886 build() {
            S2C_UseHorseItem_13886 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UseHorseItem_13886 buildPartial() {
            S2C_UseHorseItem_13886 result = new S2C_UseHorseItem_13886(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.horseCode_ = this.horseCode_;
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
            if (other instanceof S2C_UseHorseItem_13886) {
               return this.mergeFrom((S2C_UseHorseItem_13886)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UseHorseItem_13886 other) {
            if (other == WarHorseMsg.S2C_UseHorseItem_13886.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasHorseCode()) {
                  this.setHorseCode(other.getHorseCode());
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
               return this.hasHorseCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UseHorseItem_13886 parsedMessage = null;

            try {
               parsedMessage = (S2C_UseHorseItem_13886)WarHorseMsg.S2C_UseHorseItem_13886.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UseHorseItem_13886)e.getUnfinishedMessage();
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

         public boolean hasHorseCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHorseCode() {
            return this.horseCode_;
         }

         public Builder setHorseCode(int value) {
            this.bitField0_ |= 2;
            this.horseCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHorseCode() {
            this.bitField0_ &= -3;
            this.horseCode_ = 0;
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

   public static final class C2S_HorseReback_13887 extends GeneratedMessageV3 implements C2S_HorseReback_13887OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HORSECODE_FIELD_NUMBER = 1;
      private int horseCode_;
      private byte memoizedIsInitialized;
      private static final C2S_HorseReback_13887 DEFAULT_INSTANCE = new C2S_HorseReback_13887();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HorseReback_13887> PARSER = new AbstractParser<C2S_HorseReback_13887>() {
         public C2S_HorseReback_13887 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HorseReback_13887(input, extensionRegistry);
         }
      };

      private C2S_HorseReback_13887(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HorseReback_13887() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HorseReback_13887();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HorseReback_13887(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.horseCode_ = input.readInt32();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HorseReback_13887.class, Builder.class);
      }

      public boolean hasHorseCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHorseCode() {
         return this.horseCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHorseCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.horseCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.horseCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HorseReback_13887)) {
            return super.equals(obj);
         } else {
            C2S_HorseReback_13887 other = (C2S_HorseReback_13887)obj;
            if (this.hasHorseCode() != other.hasHorseCode()) {
               return false;
            } else if (this.hasHorseCode() && this.getHorseCode() != other.getHorseCode()) {
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
            if (this.hasHorseCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHorseCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HorseReback_13887 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HorseReback_13887)PARSER.parseFrom(data);
      }

      public static C2S_HorseReback_13887 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HorseReback_13887)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HorseReback_13887 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HorseReback_13887)PARSER.parseFrom(data);
      }

      public static C2S_HorseReback_13887 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HorseReback_13887)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HorseReback_13887 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HorseReback_13887)PARSER.parseFrom(data);
      }

      public static C2S_HorseReback_13887 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HorseReback_13887)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HorseReback_13887 parseFrom(InputStream input) throws IOException {
         return (C2S_HorseReback_13887)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HorseReback_13887 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HorseReback_13887)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HorseReback_13887 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HorseReback_13887)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HorseReback_13887 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HorseReback_13887)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HorseReback_13887 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HorseReback_13887)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HorseReback_13887 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HorseReback_13887)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HorseReback_13887 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HorseReback_13887 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HorseReback_13887> parser() {
         return PARSER;
      }

      public Parser<C2S_HorseReback_13887> getParserForType() {
         return PARSER;
      }

      public C2S_HorseReback_13887 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HorseReback_13887OrBuilder {
         private int bitField0_;
         private int horseCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HorseReback_13887.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.C2S_HorseReback_13887.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.horseCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_C2S_HorseReback_13887_descriptor;
         }

         public C2S_HorseReback_13887 getDefaultInstanceForType() {
            return WarHorseMsg.C2S_HorseReback_13887.getDefaultInstance();
         }

         public C2S_HorseReback_13887 build() {
            C2S_HorseReback_13887 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HorseReback_13887 buildPartial() {
            C2S_HorseReback_13887 result = new C2S_HorseReback_13887(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.horseCode_ = this.horseCode_;
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
            if (other instanceof C2S_HorseReback_13887) {
               return this.mergeFrom((C2S_HorseReback_13887)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HorseReback_13887 other) {
            if (other == WarHorseMsg.C2S_HorseReback_13887.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHorseCode()) {
                  this.setHorseCode(other.getHorseCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHorseCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HorseReback_13887 parsedMessage = null;

            try {
               parsedMessage = (C2S_HorseReback_13887)WarHorseMsg.C2S_HorseReback_13887.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HorseReback_13887)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHorseCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHorseCode() {
            return this.horseCode_;
         }

         public Builder setHorseCode(int value) {
            this.bitField0_ |= 1;
            this.horseCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHorseCode() {
            this.bitField0_ &= -2;
            this.horseCode_ = 0;
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

   public static final class S2C_HorseReback_13888 extends GeneratedMessageV3 implements S2C_HorseReback_13888OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private boolean result_;
      private byte memoizedIsInitialized;
      private static final S2C_HorseReback_13888 DEFAULT_INSTANCE = new S2C_HorseReback_13888();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HorseReback_13888> PARSER = new AbstractParser<S2C_HorseReback_13888>() {
         public S2C_HorseReback_13888 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HorseReback_13888(input, extensionRegistry);
         }
      };

      private S2C_HorseReback_13888(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HorseReback_13888() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HorseReback_13888();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HorseReback_13888(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.result_ = input.readBool();
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
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HorseReback_13888.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getResult() {
         return this.result_;
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
            output.writeBool(1, this.result_);
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
               size += CodedOutputStream.computeBoolSize(1, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HorseReback_13888)) {
            return super.equals(obj);
         } else {
            S2C_HorseReback_13888 other = (S2C_HorseReback_13888)obj;
            if (this.hasResult() != other.hasResult()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getResult());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HorseReback_13888 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HorseReback_13888)PARSER.parseFrom(data);
      }

      public static S2C_HorseReback_13888 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HorseReback_13888)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HorseReback_13888 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HorseReback_13888)PARSER.parseFrom(data);
      }

      public static S2C_HorseReback_13888 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HorseReback_13888)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HorseReback_13888 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HorseReback_13888)PARSER.parseFrom(data);
      }

      public static S2C_HorseReback_13888 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HorseReback_13888)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HorseReback_13888 parseFrom(InputStream input) throws IOException {
         return (S2C_HorseReback_13888)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HorseReback_13888 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HorseReback_13888)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HorseReback_13888 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HorseReback_13888)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HorseReback_13888 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HorseReback_13888)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HorseReback_13888 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HorseReback_13888)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HorseReback_13888 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HorseReback_13888)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HorseReback_13888 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HorseReback_13888 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HorseReback_13888> parser() {
         return PARSER;
      }

      public Parser<S2C_HorseReback_13888> getParserForType() {
         return PARSER;
      }

      public S2C_HorseReback_13888 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HorseReback_13888OrBuilder {
         private int bitField0_;
         private boolean result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HorseReback_13888.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarHorseMsg.S2C_HorseReback_13888.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarHorseMsg.internal_static_warHorse_com_gzbz_protobuf_S2C_HorseReback_13888_descriptor;
         }

         public S2C_HorseReback_13888 getDefaultInstanceForType() {
            return WarHorseMsg.S2C_HorseReback_13888.getDefaultInstance();
         }

         public S2C_HorseReback_13888 build() {
            S2C_HorseReback_13888 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HorseReback_13888 buildPartial() {
            S2C_HorseReback_13888 result = new S2C_HorseReback_13888(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
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
            if (other instanceof S2C_HorseReback_13888) {
               return this.mergeFrom((S2C_HorseReback_13888)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HorseReback_13888 other) {
            if (other == WarHorseMsg.S2C_HorseReback_13888.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
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
            S2C_HorseReback_13888 parsedMessage = null;

            try {
               parsedMessage = (S2C_HorseReback_13888)WarHorseMsg.S2C_HorseReback_13888.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HorseReback_13888)e.getUnfinishedMessage();
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

         public boolean getResult() {
            return this.result_;
         }

         public Builder setResult(boolean value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = false;
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

   public interface C2S_Artifice_13815OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasMainCode();

      int getMainCode();

      List<Integer> getSlaveCodesList();

      int getSlaveCodesCount();

      int getSlaveCodes(int index);

      boolean hasItemNum();

      int getItemNum();
   }

   public interface C2S_Awaken_13883OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_ChangeHorse_13881OrBuilder extends MessageOrBuilder {
      boolean hasFromHero();

      int getFromHero();

      boolean hasDestHero();

      int getDestHero();
   }

   public interface C2S_ComposeHorse_13831OrBuilder extends MessageOrBuilder {
      boolean hasItemCode();

      int getItemCode();

      boolean hasNum();

      int getNum();
   }

   public interface C2S_DoSacrifice_13843OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_HorseReback_13887OrBuilder extends MessageOrBuilder {
      boolean hasHorseCode();

      int getHorseCode();
   }

   public interface C2S_HorseSkin_13863OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasCode();

      int getCode();

      boolean hasSkinId();

      int getSkinId();
   }

   public interface C2S_Inherit_13817OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasMainCode();

      int getMainCode();

      boolean hasSlaveCode();

      int getSlaveCode();

      boolean hasType();

      int getType();
   }

   public interface C2S_LockHorseSkill_13809OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasCode();

      int getCode();

      boolean hasPosition();

      int getPosition();

      boolean hasType();

      int getType();
   }

   public interface C2S_LockHorse_13807OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasCode();

      int getCode();

      boolean hasType();

      int getType();
   }

   public interface C2S_LvUp_13811OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasCode();

      int getCode();

      boolean hasLv();

      int getLv();

      List<LvUpItem> getItemsList();

      LvUpItem getItems(int index);

      int getItemsCount();

      List<? extends LvUpItemOrBuilder> getItemsOrBuilderList();

      LvUpItemOrBuilder getItemsOrBuilder(int index);
   }

   public interface C2S_Merge_13813OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasMainCode();

      int getMainCode();

      boolean hasSlaveCode();

      int getSlaveCode();
   }

   public interface C2S_OpenMainUi_13801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SacrificeBoxReward_13845OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_SacrificeInfo_13841OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SacrificeRecordList_13847OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_SkinUi_13861OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_UndressHorse_13805OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_UpdateIds_13873OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_UseHorseItem_13885OrBuilder extends MessageOrBuilder {
      boolean hasItemCode();

      int getItemCode();

      boolean hasSkillId();

      int getSkillId();
   }

   public interface C2S_WatchHorse_13871OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WearHorse_13803OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();
   }

   public interface LvUpItemOrBuilder extends MessageOrBuilder {
      boolean hasItemId();

      int getItemId();

      boolean hasNum();

      int getNum();
   }

   public interface S2C_Artifice_13816OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasResult();

      int getResult();

      boolean hasMainCode();

      int getMainCode();

      List<Integer> getSlaveCodesList();

      int getSlaveCodesCount();

      int getSlaveCodes(int index);
   }

   public interface S2C_Awaken_13884OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface S2C_ChangeHorse_13882OrBuilder extends MessageOrBuilder {
      boolean hasFromHero();

      int getFromHero();

      boolean hasDestHero();

      int getDestHero();
   }

   public interface S2C_ComposeHorse_13832OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_DoSacrifice_13844OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasSacrificeCount();

      int getSacrificeCount();

      boolean hasDailySacrificeCount();

      int getDailySacrificeCount();
   }

   public interface S2C_HorseReback_13888OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      boolean getResult();
   }

   public interface S2C_HorseSkin_13864OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();

      boolean hasSkinId();

      int getSkinId();
   }

   public interface S2C_Inherit_13818OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasResult();

      int getResult();

      boolean hasMainCode();

      int getMainCode();

      boolean hasSlaveCode();

      int getSlaveCode();

      boolean hasType();

      int getType();
   }

   public interface S2C_LockHorseSkill_13810OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();

      boolean hasPosition();

      int getPosition();
   }

   public interface S2C_LockHorse_13808OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();
   }

   public interface S2C_LvUp_13812OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();
   }

   public interface S2C_Merge_13814OrBuilder extends MessageOrBuilder {
      boolean hasCodeType();

      CodeType getCodeType();

      boolean hasResult();

      int getResult();

      boolean hasMainCode();

      int getMainCode();

      boolean hasSlaveCode();

      int getSlaveCode();

      boolean hasSlaveSkillIndex();

      int getSlaveSkillIndex();

      boolean hasSlaveSkillId();

      int getSlaveSkillId();

      boolean hasMainSkillIndex();

      int getMainSkillIndex();

      boolean hasMainSkillId();

      int getMainSkillId();
   }

   public interface S2C_OpenMainUi_13802OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_SacrificeBoxReward_13846OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasSacrificePoint();

      int getSacrificePoint();
   }

   public interface S2C_SacrificeInfo_13842OrBuilder extends MessageOrBuilder {
      boolean hasSacrificeCount();

      int getSacrificeCount();

      boolean hasSacrificePoint();

      int getSacrificePoint();

      List<Integer> getGotBoxesList();

      int getGotBoxesCount();

      int getGotBoxes(int index);

      boolean hasSacrificeFreeCount();

      int getSacrificeFreeCount();

      boolean hasDailySacrificeCount();

      int getDailySacrificeCount();
   }

   public interface S2C_SacrificeRecordList_13848OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<SacrificeRecordData> getRecordListList();

      SacrificeRecordData getRecordList(int index);

      int getRecordListCount();

      List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList();

      SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index);
   }

   public interface S2C_SacrificeRecord_13850OrBuilder extends MessageOrBuilder {
      List<SacrificeRecordData> getRecordListList();

      SacrificeRecordData getRecordList(int index);

      int getRecordListCount();

      List<? extends SacrificeRecordDataOrBuilder> getRecordListOrBuilderList();

      SacrificeRecordDataOrBuilder getRecordListOrBuilder(int index);
   }

   public interface S2C_SkinUi_13862OrBuilder extends MessageOrBuilder {
      List<Integer> getHorseIdsList();

      int getHorseIdsCount();

      int getHorseIds(int index);
   }

   public interface S2C_UndressHorse_13806OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface S2C_UpdateIds_13874OrBuilder extends MessageOrBuilder {
      List<Integer> getNewHorseIdsList();

      int getNewHorseIdsCount();

      int getNewHorseIds(int index);

      List<Integer> getHorseIdsList();

      int getHorseIdsCount();

      int getHorseIds(int index);
   }

   public interface S2C_UseHorseItem_13886OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasHorseCode();

      int getHorseCode();
   }

   public interface S2C_WatchHorse_13872OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_WearHorse_13804OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface SacrificeRecordDataOrBuilder extends MessageOrBuilder {
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
}
