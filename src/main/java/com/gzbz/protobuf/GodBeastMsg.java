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

public final class GodBeastMsg {
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private GodBeastMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eGodBeast.proto\u0012\u001agodBeast.com.gzbz.protobuf\u001a\fcommon.proto\"\u001d\n\u001bC2S_GodBeastHatchInfo_21601\"Y\n\u001bS2C_GodBeastHatchInfo_21602\u0012\u0010\n\bhatchNum\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rdailyHatchNum\u0018\u0002 \u0002(\u0005\u0012\u0011\n\teggBuyNum\u0018\u0003 \u0002(\u0005\"'\n\u0017C2S_GodBeastHatch_21603\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"P\n\u0017S2C_GodBeastHatch_21604\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bhatchNum\u0018\u0002 \u0002(\u0003\u0012\u0015\n\rdailyHatchNum\u0018\u0003 \u0002(\u0005\"<\n\u0016C2S_GodBeastLvUp_21605\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\"\u0018\n\u0016S2C_GodBeastLvUp_21606\"d\n\u0018C2S_GodBeastStarUp_21607\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012$\n\tcostItems\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\"\u001a\n\u0018S2C_GodBeastStarUp_21608\"R\n\u001bC2S_LearnPassiveSkill_21609\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007skillId\u0018\u0003 \u0002(\u0005\"\u001d\n\u001bS2C_LearnPassiveSkill_21610\"A\n\u001bC2S_ResetPassiveSkill_21611\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\"\u001d\n\u001bS2C_ResetPassiveSkill_21612\"]\n\u0018C2S_LearnAttrSkill_21613\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\f\n\u0004slot\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0004 \u0002(\u0005\"\u001a\n\u0018S2C_LearnAttrSkill_21614\"L\n\u0018C2S_ResetAttrSkill_21615\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\f\n\u0004slot\u0018\u0003 \u0002(\u0005\"\u001a\n\u0018S2C_ResetAttrSkill_21616\"S\n\u0015C2S_UseGodBeast_21617\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000buseItemCode\u0018\u0002 \u0001(\u0005\u0012\u0013\n\u000buseHeroCode\u0018\u0003 \u0001(\u0005\"\u0017\n\u0015S2C_UseGodBeast_21618\"+\n\u0017C2S_NoUseGodBeast_21619\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017S2C_NoUseGodBeast_21620\"X\n\u0018C2S_ChangeGodBeast_21621\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\u0018\n\u0010targetGodBeastId\u0018\u0003 \u0002(\u0005\"\u001a\n\u0018S2C_ChangeGodBeast_21622\"=\n\u0017C2S_ResetGodBeast_21623\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\"\u0019\n\u0017S2C_ResetGodBeast_21624\"/\n\u001bC2S_DecomposeGodBeast_21625\u0012\u0010\n\bitemCode\u0018\u0002 \u0003(\u0005\"\u001d\n\u001bS2C_DecomposeGodBeast_21626\"x\n\u0019C2S_InheritGodBeast_21627\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\u0014\n\fcostItemCode\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007develop\u0018\u0004 \u0001(\b\u0012\u0010\n\baptitude\u0018\u0005 \u0001(\b\"\u001b\n\u0019S2C_InheritGodBeast_21628\"V\n\u0010GodBeastTaskInfo\u0012\u001a\n\u0004task\u0018\u0001 \u0002(\u000b2\f.common.Task\u0012\u0013\n\u000bcompleteNum\u0018\u0002 \u0002(\u0005\u0012\u0011\n\ttaskScore\u0018\u0003 \u0002(\u0005\"\u0014\n\u0012C2S_TaskList_21629\"\\\n\u0012S2C_TaskList_21630\u0012F\n\u0010godBeastTaskInfo\u0018\u0001 \u0003(\u000b2,.godBeast.com.gzbz.protobuf.GodBeastTaskInfo\"^\n\u0014S2C_TaskNotice_21631\u0012F\n\u0010godBeastTaskInfo\u0018\u0001 \u0002(\u000b2,.godBeast.com.gzbz.protobuf.GodBeastTaskInfo\"&\n\u0018C2S_RecScoreReward_21632\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\")\n\u0018S2C_RecScoreReward_21633\u0012\r\n\u0005recId\u0018\u0001 \u0003(\u0005\"\u001d\n\u001bC2S_GetRecScoreReward_21634\"C\n\u001bS2C_GetRecScoreReward_21635\u0012\r\n\u0005recId\u0018\u0001 \u0003(\u0005\u0012\u0015\n\rnextResetTime\u0018\u0002 \u0001(\u0003\"\u0016\n\u0014C2S_NoticeInfo_21636\"(\n\u0014S2C_NoticeInfo_21637\u0012\u0010\n\bunlockId\u0018\u0001 \u0003(\u0005\"\u001d\n\u001bC2S_NoticePointUnlock_21638\"/\n\u001bS2C_NoticePointUnlock_21639\u0012\u0010\n\bunlockId\u0018\u0001 \u0003(\u0005\"\u001b\n\u0019C2S_HatchRecordList_21640\"¦\u0001\n\u0019S2C_HatchRecordList_21641\u0012E\n\u0010playerRecordList\u0018\u0001 \u0003(\u000b2+.godBeast.com.gzbz.protobuf.HatchRecordData\u0012B\n\rallRecordList\u0018\u0002 \u0003(\u000b2+.godBeast.com.gzbz.protobuf.HatchRecordData\"\\\n\u0019S2C_HatchRecordList_21642\u0012?\n\nrecordList\u0018\u0001 \u0003(\u000b2+.godBeast.com.gzbz.protobuf.HatchRecordData\"\u0098\u0001\n\u000fHatchRecordData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\u0014\n\fresourceType\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nresourceId\u0018\u0004 \u0002(\u0005\u0012\u0013\n\u000bresourceNum\u0018\u0005 \u0002(\u0005\u0012\u000f\n\u0007recTime\u0018\u0006 \u0002(\u0003\u0012\u000f\n\u0007scoreId\u0018\u0007 \u0001(\u0005\"J\n\u0016C2S_GodBeastLock_21643\u0012\u0010\n\bheroCode\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bitemCode\u0018\u0002 \u0001(\u0005\u0012\f\n\u0004type\u0018\u0003 \u0002(\u0005\"\u0018\n\u0016S2C_GodBeastLock_21644\"\u001a\n\u0018C2S_GodBeastBuyEgg_21645\"-\n\u0018S2C_GodBeastBuyEgg_21646\u0012\u0011\n\teggBuyNum\u0018\u0001 \u0002(\u0005B\"\n\u0011com.gzbz.protobufB\u000bGodBeastMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_descriptor, new String[]{"HatchNum", "DailyHatchNum", "EggBuyNum"});
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_descriptor, new String[]{"Type"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_descriptor, new String[]{"Type", "HatchNum", "DailyHatchNum"});
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_descriptor, new String[]{"HeroCode", "ItemCode"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_descriptor, new String[]{"HeroCode", "ItemCode", "CostItems"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_descriptor, new String[]{"HeroCode", "ItemCode", "SkillId"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_descriptor, new String[]{"HeroCode", "ItemCode"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_descriptor, new String[]{"HeroCode", "ItemCode", "Slot", "SkillId"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_descriptor, new String[]{"HeroCode", "ItemCode", "Slot"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_descriptor, new String[]{"HeroCode", "UseItemCode", "UseHeroCode"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_descriptor, new String[]{"HeroCode"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_descriptor, new String[]{"HeroCode", "ItemCode", "TargetGodBeastId"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_descriptor, new String[]{"HeroCode", "ItemCode"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_descriptor, new String[]{"ItemCode"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_descriptor, new String[]{"HeroCode", "ItemCode", "CostItemCode", "Develop", "Aptitude"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_descriptor, new String[]{"Task", "CompleteNum", "TaskScore"});
      internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_descriptor, new String[]{"GodBeastTaskInfo"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_descriptor, new String[]{"GodBeastTaskInfo"});
      internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_descriptor, new String[]{"Id"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_descriptor, new String[]{"RecId"});
      internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_descriptor, new String[]{"RecId", "NextResetTime"});
      internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_descriptor, new String[]{"UnlockId"});
      internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_descriptor, new String[]{"UnlockId"});
      internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(41);
      internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_descriptor, new String[]{"PlayerRecordList", "AllRecordList"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(42);
      internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_descriptor, new String[]{"RecordList"});
      internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(43);
      internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_descriptor, new String[]{"PlayerId", "PlayerName", "ResourceType", "ResourceId", "ResourceNum", "RecTime", "ScoreId"});
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(44);
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_descriptor, new String[]{"HeroCode", "ItemCode", "Type"});
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(45);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(46);
      internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_descriptor, new String[0]);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(47);
      internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_descriptor, new String[]{"EggBuyNum"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_GodBeastHatchInfo_21601 extends GeneratedMessageV3 implements C2S_GodBeastHatchInfo_21601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GodBeastHatchInfo_21601 DEFAULT_INSTANCE = new C2S_GodBeastHatchInfo_21601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GodBeastHatchInfo_21601> PARSER = new AbstractParser<C2S_GodBeastHatchInfo_21601>() {
         public C2S_GodBeastHatchInfo_21601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GodBeastHatchInfo_21601(input, extensionRegistry);
         }
      };

      private C2S_GodBeastHatchInfo_21601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GodBeastHatchInfo_21601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GodBeastHatchInfo_21601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GodBeastHatchInfo_21601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastHatchInfo_21601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GodBeastHatchInfo_21601)) {
            return super.equals(obj);
         } else {
            C2S_GodBeastHatchInfo_21601 other = (C2S_GodBeastHatchInfo_21601)obj;
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

      public static C2S_GodBeastHatchInfo_21601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatchInfo_21601)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastHatchInfo_21601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatchInfo_21601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastHatchInfo_21601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatchInfo_21601)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastHatchInfo_21601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatchInfo_21601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastHatchInfo_21601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatchInfo_21601)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastHatchInfo_21601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatchInfo_21601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastHatchInfo_21601 parseFrom(InputStream input) throws IOException {
         return (C2S_GodBeastHatchInfo_21601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastHatchInfo_21601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastHatchInfo_21601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastHatchInfo_21601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GodBeastHatchInfo_21601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GodBeastHatchInfo_21601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastHatchInfo_21601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastHatchInfo_21601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GodBeastHatchInfo_21601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastHatchInfo_21601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastHatchInfo_21601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GodBeastHatchInfo_21601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GodBeastHatchInfo_21601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GodBeastHatchInfo_21601> parser() {
         return PARSER;
      }

      public Parser<C2S_GodBeastHatchInfo_21601> getParserForType() {
         return PARSER;
      }

      public C2S_GodBeastHatchInfo_21601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GodBeastHatchInfo_21601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastHatchInfo_21601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_GodBeastHatchInfo_21601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatchInfo_21601_descriptor;
         }

         public C2S_GodBeastHatchInfo_21601 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_GodBeastHatchInfo_21601.getDefaultInstance();
         }

         public C2S_GodBeastHatchInfo_21601 build() {
            C2S_GodBeastHatchInfo_21601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GodBeastHatchInfo_21601 buildPartial() {
            C2S_GodBeastHatchInfo_21601 result = new C2S_GodBeastHatchInfo_21601(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GodBeastHatchInfo_21601) {
               return this.mergeFrom((C2S_GodBeastHatchInfo_21601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GodBeastHatchInfo_21601 other) {
            if (other == GodBeastMsg.C2S_GodBeastHatchInfo_21601.getDefaultInstance()) {
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
            C2S_GodBeastHatchInfo_21601 parsedMessage = null;

            try {
               parsedMessage = (C2S_GodBeastHatchInfo_21601)GodBeastMsg.C2S_GodBeastHatchInfo_21601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GodBeastHatchInfo_21601)e.getUnfinishedMessage();
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

   public static final class S2C_GodBeastHatchInfo_21602 extends GeneratedMessageV3 implements S2C_GodBeastHatchInfo_21602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HATCHNUM_FIELD_NUMBER = 1;
      private long hatchNum_;
      public static final int DAILYHATCHNUM_FIELD_NUMBER = 2;
      private int dailyHatchNum_;
      public static final int EGGBUYNUM_FIELD_NUMBER = 3;
      private int eggBuyNum_;
      private byte memoizedIsInitialized;
      private static final S2C_GodBeastHatchInfo_21602 DEFAULT_INSTANCE = new S2C_GodBeastHatchInfo_21602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GodBeastHatchInfo_21602> PARSER = new AbstractParser<S2C_GodBeastHatchInfo_21602>() {
         public S2C_GodBeastHatchInfo_21602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GodBeastHatchInfo_21602(input, extensionRegistry);
         }
      };

      private S2C_GodBeastHatchInfo_21602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GodBeastHatchInfo_21602() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GodBeastHatchInfo_21602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GodBeastHatchInfo_21602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hatchNum_ = input.readInt64();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.dailyHatchNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.eggBuyNum_ = input.readInt32();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastHatchInfo_21602.class, Builder.class);
      }

      public boolean hasHatchNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getHatchNum() {
         return this.hatchNum_;
      }

      public boolean hasDailyHatchNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDailyHatchNum() {
         return this.dailyHatchNum_;
      }

      public boolean hasEggBuyNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEggBuyNum() {
         return this.eggBuyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHatchNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyHatchNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEggBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.hatchNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.dailyHatchNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.eggBuyNum_);
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
               size += CodedOutputStream.computeInt64Size(1, this.hatchNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.dailyHatchNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.eggBuyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GodBeastHatchInfo_21602)) {
            return super.equals(obj);
         } else {
            S2C_GodBeastHatchInfo_21602 other = (S2C_GodBeastHatchInfo_21602)obj;
            if (this.hasHatchNum() != other.hasHatchNum()) {
               return false;
            } else if (this.hasHatchNum() && this.getHatchNum() != other.getHatchNum()) {
               return false;
            } else if (this.hasDailyHatchNum() != other.hasDailyHatchNum()) {
               return false;
            } else if (this.hasDailyHatchNum() && this.getDailyHatchNum() != other.getDailyHatchNum()) {
               return false;
            } else if (this.hasEggBuyNum() != other.hasEggBuyNum()) {
               return false;
            } else if (this.hasEggBuyNum() && this.getEggBuyNum() != other.getEggBuyNum()) {
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
            if (this.hasHatchNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getHatchNum());
            }

            if (this.hasDailyHatchNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDailyHatchNum();
            }

            if (this.hasEggBuyNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEggBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatchInfo_21602)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatchInfo_21602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatchInfo_21602)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatchInfo_21602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatchInfo_21602)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatchInfo_21602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(InputStream input) throws IOException {
         return (S2C_GodBeastHatchInfo_21602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastHatchInfo_21602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastHatchInfo_21602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GodBeastHatchInfo_21602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GodBeastHatchInfo_21602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastHatchInfo_21602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GodBeastHatchInfo_21602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastHatchInfo_21602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastHatchInfo_21602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GodBeastHatchInfo_21602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GodBeastHatchInfo_21602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GodBeastHatchInfo_21602> parser() {
         return PARSER;
      }

      public Parser<S2C_GodBeastHatchInfo_21602> getParserForType() {
         return PARSER;
      }

      public S2C_GodBeastHatchInfo_21602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GodBeastHatchInfo_21602OrBuilder {
         private int bitField0_;
         private long hatchNum_;
         private int dailyHatchNum_;
         private int eggBuyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastHatchInfo_21602.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_GodBeastHatchInfo_21602.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.hatchNum_ = 0L;
            this.bitField0_ &= -2;
            this.dailyHatchNum_ = 0;
            this.bitField0_ &= -3;
            this.eggBuyNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatchInfo_21602_descriptor;
         }

         public S2C_GodBeastHatchInfo_21602 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_GodBeastHatchInfo_21602.getDefaultInstance();
         }

         public S2C_GodBeastHatchInfo_21602 build() {
            S2C_GodBeastHatchInfo_21602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GodBeastHatchInfo_21602 buildPartial() {
            S2C_GodBeastHatchInfo_21602 result = new S2C_GodBeastHatchInfo_21602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.hatchNum_ = this.hatchNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dailyHatchNum_ = this.dailyHatchNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.eggBuyNum_ = this.eggBuyNum_;
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
            if (other instanceof S2C_GodBeastHatchInfo_21602) {
               return this.mergeFrom((S2C_GodBeastHatchInfo_21602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GodBeastHatchInfo_21602 other) {
            if (other == GodBeastMsg.S2C_GodBeastHatchInfo_21602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHatchNum()) {
                  this.setHatchNum(other.getHatchNum());
               }

               if (other.hasDailyHatchNum()) {
                  this.setDailyHatchNum(other.getDailyHatchNum());
               }

               if (other.hasEggBuyNum()) {
                  this.setEggBuyNum(other.getEggBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHatchNum()) {
               return false;
            } else if (!this.hasDailyHatchNum()) {
               return false;
            } else {
               return this.hasEggBuyNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GodBeastHatchInfo_21602 parsedMessage = null;

            try {
               parsedMessage = (S2C_GodBeastHatchInfo_21602)GodBeastMsg.S2C_GodBeastHatchInfo_21602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GodBeastHatchInfo_21602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHatchNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getHatchNum() {
            return this.hatchNum_;
         }

         public Builder setHatchNum(long value) {
            this.bitField0_ |= 1;
            this.hatchNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchNum() {
            this.bitField0_ &= -2;
            this.hatchNum_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasDailyHatchNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDailyHatchNum() {
            return this.dailyHatchNum_;
         }

         public Builder setDailyHatchNum(int value) {
            this.bitField0_ |= 2;
            this.dailyHatchNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyHatchNum() {
            this.bitField0_ &= -3;
            this.dailyHatchNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEggBuyNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEggBuyNum() {
            return this.eggBuyNum_;
         }

         public Builder setEggBuyNum(int value) {
            this.bitField0_ |= 4;
            this.eggBuyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEggBuyNum() {
            this.bitField0_ &= -5;
            this.eggBuyNum_ = 0;
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

   public static final class C2S_GodBeastHatch_21603 extends GeneratedMessageV3 implements C2S_GodBeastHatch_21603OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_GodBeastHatch_21603 DEFAULT_INSTANCE = new C2S_GodBeastHatch_21603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GodBeastHatch_21603> PARSER = new AbstractParser<C2S_GodBeastHatch_21603>() {
         public C2S_GodBeastHatch_21603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GodBeastHatch_21603(input, extensionRegistry);
         }
      };

      private C2S_GodBeastHatch_21603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GodBeastHatch_21603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GodBeastHatch_21603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GodBeastHatch_21603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastHatch_21603.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GodBeastHatch_21603)) {
            return super.equals(obj);
         } else {
            C2S_GodBeastHatch_21603 other = (C2S_GodBeastHatch_21603)obj;
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

      public static C2S_GodBeastHatch_21603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatch_21603)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastHatch_21603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatch_21603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastHatch_21603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatch_21603)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastHatch_21603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatch_21603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastHatch_21603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatch_21603)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastHatch_21603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastHatch_21603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastHatch_21603 parseFrom(InputStream input) throws IOException {
         return (C2S_GodBeastHatch_21603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastHatch_21603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastHatch_21603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastHatch_21603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GodBeastHatch_21603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GodBeastHatch_21603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastHatch_21603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastHatch_21603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GodBeastHatch_21603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastHatch_21603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastHatch_21603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GodBeastHatch_21603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GodBeastHatch_21603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GodBeastHatch_21603> parser() {
         return PARSER;
      }

      public Parser<C2S_GodBeastHatch_21603> getParserForType() {
         return PARSER;
      }

      public C2S_GodBeastHatch_21603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GodBeastHatch_21603OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastHatch_21603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_GodBeastHatch_21603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastHatch_21603_descriptor;
         }

         public C2S_GodBeastHatch_21603 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_GodBeastHatch_21603.getDefaultInstance();
         }

         public C2S_GodBeastHatch_21603 build() {
            C2S_GodBeastHatch_21603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GodBeastHatch_21603 buildPartial() {
            C2S_GodBeastHatch_21603 result = new C2S_GodBeastHatch_21603(this);
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
            if (other instanceof C2S_GodBeastHatch_21603) {
               return this.mergeFrom((C2S_GodBeastHatch_21603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GodBeastHatch_21603 other) {
            if (other == GodBeastMsg.C2S_GodBeastHatch_21603.getDefaultInstance()) {
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
            C2S_GodBeastHatch_21603 parsedMessage = null;

            try {
               parsedMessage = (C2S_GodBeastHatch_21603)GodBeastMsg.C2S_GodBeastHatch_21603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GodBeastHatch_21603)e.getUnfinishedMessage();
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

   public static final class S2C_GodBeastHatch_21604 extends GeneratedMessageV3 implements S2C_GodBeastHatch_21604OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int HATCHNUM_FIELD_NUMBER = 2;
      private long hatchNum_;
      public static final int DAILYHATCHNUM_FIELD_NUMBER = 3;
      private int dailyHatchNum_;
      private byte memoizedIsInitialized;
      private static final S2C_GodBeastHatch_21604 DEFAULT_INSTANCE = new S2C_GodBeastHatch_21604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GodBeastHatch_21604> PARSER = new AbstractParser<S2C_GodBeastHatch_21604>() {
         public S2C_GodBeastHatch_21604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GodBeastHatch_21604(input, extensionRegistry);
         }
      };

      private S2C_GodBeastHatch_21604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GodBeastHatch_21604() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GodBeastHatch_21604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GodBeastHatch_21604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.hatchNum_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.dailyHatchNum_ = input.readInt32();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastHatch_21604.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasHatchNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getHatchNum() {
         return this.hatchNum_;
      }

      public boolean hasDailyHatchNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDailyHatchNum() {
         return this.dailyHatchNum_;
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
         } else if (!this.hasHatchNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyHatchNum()) {
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
            output.writeInt64(2, this.hatchNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.dailyHatchNum_);
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
               size += CodedOutputStream.computeInt64Size(2, this.hatchNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dailyHatchNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GodBeastHatch_21604)) {
            return super.equals(obj);
         } else {
            S2C_GodBeastHatch_21604 other = (S2C_GodBeastHatch_21604)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasHatchNum() != other.hasHatchNum()) {
               return false;
            } else if (this.hasHatchNum() && this.getHatchNum() != other.getHatchNum()) {
               return false;
            } else if (this.hasDailyHatchNum() != other.hasDailyHatchNum()) {
               return false;
            } else if (this.hasDailyHatchNum() && this.getDailyHatchNum() != other.getDailyHatchNum()) {
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

            if (this.hasHatchNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getHatchNum());
            }

            if (this.hasDailyHatchNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDailyHatchNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GodBeastHatch_21604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatch_21604)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastHatch_21604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatch_21604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastHatch_21604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatch_21604)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastHatch_21604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatch_21604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastHatch_21604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatch_21604)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastHatch_21604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastHatch_21604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastHatch_21604 parseFrom(InputStream input) throws IOException {
         return (S2C_GodBeastHatch_21604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastHatch_21604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastHatch_21604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastHatch_21604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GodBeastHatch_21604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GodBeastHatch_21604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastHatch_21604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastHatch_21604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GodBeastHatch_21604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastHatch_21604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastHatch_21604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GodBeastHatch_21604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GodBeastHatch_21604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GodBeastHatch_21604> parser() {
         return PARSER;
      }

      public Parser<S2C_GodBeastHatch_21604> getParserForType() {
         return PARSER;
      }

      public S2C_GodBeastHatch_21604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GodBeastHatch_21604OrBuilder {
         private int bitField0_;
         private int type_;
         private long hatchNum_;
         private int dailyHatchNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastHatch_21604.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_GodBeastHatch_21604.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.hatchNum_ = 0L;
            this.bitField0_ &= -3;
            this.dailyHatchNum_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastHatch_21604_descriptor;
         }

         public S2C_GodBeastHatch_21604 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_GodBeastHatch_21604.getDefaultInstance();
         }

         public S2C_GodBeastHatch_21604 build() {
            S2C_GodBeastHatch_21604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GodBeastHatch_21604 buildPartial() {
            S2C_GodBeastHatch_21604 result = new S2C_GodBeastHatch_21604(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hatchNum_ = this.hatchNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dailyHatchNum_ = this.dailyHatchNum_;
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
            if (other instanceof S2C_GodBeastHatch_21604) {
               return this.mergeFrom((S2C_GodBeastHatch_21604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GodBeastHatch_21604 other) {
            if (other == GodBeastMsg.S2C_GodBeastHatch_21604.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasHatchNum()) {
                  this.setHatchNum(other.getHatchNum());
               }

               if (other.hasDailyHatchNum()) {
                  this.setDailyHatchNum(other.getDailyHatchNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasHatchNum()) {
               return false;
            } else {
               return this.hasDailyHatchNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GodBeastHatch_21604 parsedMessage = null;

            try {
               parsedMessage = (S2C_GodBeastHatch_21604)GodBeastMsg.S2C_GodBeastHatch_21604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GodBeastHatch_21604)e.getUnfinishedMessage();
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

         public boolean hasHatchNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getHatchNum() {
            return this.hatchNum_;
         }

         public Builder setHatchNum(long value) {
            this.bitField0_ |= 2;
            this.hatchNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHatchNum() {
            this.bitField0_ &= -3;
            this.hatchNum_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasDailyHatchNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDailyHatchNum() {
            return this.dailyHatchNum_;
         }

         public Builder setDailyHatchNum(int value) {
            this.bitField0_ |= 4;
            this.dailyHatchNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyHatchNum() {
            this.bitField0_ &= -5;
            this.dailyHatchNum_ = 0;
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

   public static final class C2S_GodBeastLvUp_21605 extends GeneratedMessageV3 implements C2S_GodBeastLvUp_21605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_GodBeastLvUp_21605 DEFAULT_INSTANCE = new C2S_GodBeastLvUp_21605();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GodBeastLvUp_21605> PARSER = new AbstractParser<C2S_GodBeastLvUp_21605>() {
         public C2S_GodBeastLvUp_21605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GodBeastLvUp_21605(input, extensionRegistry);
         }
      };

      private C2S_GodBeastLvUp_21605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GodBeastLvUp_21605() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GodBeastLvUp_21605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GodBeastLvUp_21605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastLvUp_21605.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GodBeastLvUp_21605)) {
            return super.equals(obj);
         } else {
            C2S_GodBeastLvUp_21605 other = (C2S_GodBeastLvUp_21605)obj;
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

      public static C2S_GodBeastLvUp_21605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLvUp_21605)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastLvUp_21605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLvUp_21605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastLvUp_21605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLvUp_21605)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastLvUp_21605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLvUp_21605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastLvUp_21605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLvUp_21605)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastLvUp_21605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLvUp_21605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastLvUp_21605 parseFrom(InputStream input) throws IOException {
         return (C2S_GodBeastLvUp_21605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastLvUp_21605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastLvUp_21605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastLvUp_21605 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GodBeastLvUp_21605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GodBeastLvUp_21605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastLvUp_21605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastLvUp_21605 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GodBeastLvUp_21605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastLvUp_21605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastLvUp_21605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GodBeastLvUp_21605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GodBeastLvUp_21605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GodBeastLvUp_21605> parser() {
         return PARSER;
      }

      public Parser<C2S_GodBeastLvUp_21605> getParserForType() {
         return PARSER;
      }

      public C2S_GodBeastLvUp_21605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GodBeastLvUp_21605OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastLvUp_21605.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_GodBeastLvUp_21605.alwaysUseFieldBuilders) {
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
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLvUp_21605_descriptor;
         }

         public C2S_GodBeastLvUp_21605 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_GodBeastLvUp_21605.getDefaultInstance();
         }

         public C2S_GodBeastLvUp_21605 build() {
            C2S_GodBeastLvUp_21605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GodBeastLvUp_21605 buildPartial() {
            C2S_GodBeastLvUp_21605 result = new C2S_GodBeastLvUp_21605(this);
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
            if (other instanceof C2S_GodBeastLvUp_21605) {
               return this.mergeFrom((C2S_GodBeastLvUp_21605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GodBeastLvUp_21605 other) {
            if (other == GodBeastMsg.C2S_GodBeastLvUp_21605.getDefaultInstance()) {
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GodBeastLvUp_21605 parsedMessage = null;

            try {
               parsedMessage = (C2S_GodBeastLvUp_21605)GodBeastMsg.C2S_GodBeastLvUp_21605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GodBeastLvUp_21605)e.getUnfinishedMessage();
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

   public static final class S2C_GodBeastLvUp_21606 extends GeneratedMessageV3 implements S2C_GodBeastLvUp_21606OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_GodBeastLvUp_21606 DEFAULT_INSTANCE = new S2C_GodBeastLvUp_21606();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GodBeastLvUp_21606> PARSER = new AbstractParser<S2C_GodBeastLvUp_21606>() {
         public S2C_GodBeastLvUp_21606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GodBeastLvUp_21606(input, extensionRegistry);
         }
      };

      private S2C_GodBeastLvUp_21606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GodBeastLvUp_21606() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GodBeastLvUp_21606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GodBeastLvUp_21606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastLvUp_21606.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GodBeastLvUp_21606)) {
            return super.equals(obj);
         } else {
            S2C_GodBeastLvUp_21606 other = (S2C_GodBeastLvUp_21606)obj;
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

      public static S2C_GodBeastLvUp_21606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLvUp_21606)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastLvUp_21606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLvUp_21606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastLvUp_21606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLvUp_21606)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastLvUp_21606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLvUp_21606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastLvUp_21606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLvUp_21606)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastLvUp_21606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLvUp_21606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastLvUp_21606 parseFrom(InputStream input) throws IOException {
         return (S2C_GodBeastLvUp_21606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastLvUp_21606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastLvUp_21606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastLvUp_21606 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GodBeastLvUp_21606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GodBeastLvUp_21606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastLvUp_21606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastLvUp_21606 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GodBeastLvUp_21606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastLvUp_21606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastLvUp_21606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GodBeastLvUp_21606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GodBeastLvUp_21606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GodBeastLvUp_21606> parser() {
         return PARSER;
      }

      public Parser<S2C_GodBeastLvUp_21606> getParserForType() {
         return PARSER;
      }

      public S2C_GodBeastLvUp_21606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GodBeastLvUp_21606OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastLvUp_21606.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_GodBeastLvUp_21606.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLvUp_21606_descriptor;
         }

         public S2C_GodBeastLvUp_21606 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_GodBeastLvUp_21606.getDefaultInstance();
         }

         public S2C_GodBeastLvUp_21606 build() {
            S2C_GodBeastLvUp_21606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GodBeastLvUp_21606 buildPartial() {
            S2C_GodBeastLvUp_21606 result = new S2C_GodBeastLvUp_21606(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_GodBeastLvUp_21606) {
               return this.mergeFrom((S2C_GodBeastLvUp_21606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GodBeastLvUp_21606 other) {
            if (other == GodBeastMsg.S2C_GodBeastLvUp_21606.getDefaultInstance()) {
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
            S2C_GodBeastLvUp_21606 parsedMessage = null;

            try {
               parsedMessage = (S2C_GodBeastLvUp_21606)GodBeastMsg.S2C_GodBeastLvUp_21606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GodBeastLvUp_21606)e.getUnfinishedMessage();
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

   public static final class C2S_GodBeastStarUp_21607 extends GeneratedMessageV3 implements C2S_GodBeastStarUp_21607OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int COSTITEMS_FIELD_NUMBER = 3;
      private List<CommonMsg.MapDataII> costItems_;
      private byte memoizedIsInitialized;
      private static final C2S_GodBeastStarUp_21607 DEFAULT_INSTANCE = new C2S_GodBeastStarUp_21607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GodBeastStarUp_21607> PARSER = new AbstractParser<C2S_GodBeastStarUp_21607>() {
         public C2S_GodBeastStarUp_21607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GodBeastStarUp_21607(input, extensionRegistry);
         }
      };

      private C2S_GodBeastStarUp_21607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GodBeastStarUp_21607() {
         this.memoizedIsInitialized = -1;
         this.costItems_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GodBeastStarUp_21607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GodBeastStarUp_21607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.costItems_ = new ArrayList();
                           mutable_bitField0_ |= 4;
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.costItems_ = Collections.unmodifiableList(this.costItems_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastStarUp_21607.class, Builder.class);
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
         }

         for(int i = 0; i < this.costItems_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.costItems_.get(i));
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

            for(int i = 0; i < this.costItems_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.costItems_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GodBeastStarUp_21607)) {
            return super.equals(obj);
         } else {
            C2S_GodBeastStarUp_21607 other = (C2S_GodBeastStarUp_21607)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.getCostItemsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCostItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastStarUp_21607)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastStarUp_21607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastStarUp_21607)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastStarUp_21607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastStarUp_21607)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastStarUp_21607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(InputStream input) throws IOException {
         return (C2S_GodBeastStarUp_21607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastStarUp_21607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastStarUp_21607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GodBeastStarUp_21607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GodBeastStarUp_21607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastStarUp_21607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GodBeastStarUp_21607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastStarUp_21607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastStarUp_21607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GodBeastStarUp_21607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GodBeastStarUp_21607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GodBeastStarUp_21607> parser() {
         return PARSER;
      }

      public Parser<C2S_GodBeastStarUp_21607> getParserForType() {
         return PARSER;
      }

      public C2S_GodBeastStarUp_21607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GodBeastStarUp_21607OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;
         private List<CommonMsg.MapDataII> costItems_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> costItemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastStarUp_21607.class, Builder.class);
         }

         private Builder() {
            this.costItems_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.costItems_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_GodBeastStarUp_21607.alwaysUseFieldBuilders) {
               this.getCostItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            if (this.costItemsBuilder_ == null) {
               this.costItems_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.costItemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastStarUp_21607_descriptor;
         }

         public C2S_GodBeastStarUp_21607 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_GodBeastStarUp_21607.getDefaultInstance();
         }

         public C2S_GodBeastStarUp_21607 build() {
            C2S_GodBeastStarUp_21607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GodBeastStarUp_21607 buildPartial() {
            C2S_GodBeastStarUp_21607 result = new C2S_GodBeastStarUp_21607(this);
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

            if (this.costItemsBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.costItems_ = Collections.unmodifiableList(this.costItems_);
                  this.bitField0_ &= -5;
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
            if (other instanceof C2S_GodBeastStarUp_21607) {
               return this.mergeFrom((C2S_GodBeastStarUp_21607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GodBeastStarUp_21607 other) {
            if (other == GodBeastMsg.C2S_GodBeastStarUp_21607.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (this.costItemsBuilder_ == null) {
                  if (!other.costItems_.isEmpty()) {
                     if (this.costItems_.isEmpty()) {
                        this.costItems_ = other.costItems_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.costItemsBuilder_ = GodBeastMsg.C2S_GodBeastStarUp_21607.alwaysUseFieldBuilders ? this.getCostItemsFieldBuilder() : null;
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
            for(int i = 0; i < this.getCostItemsCount(); ++i) {
               if (!this.getCostItems(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GodBeastStarUp_21607 parsedMessage = null;

            try {
               parsedMessage = (C2S_GodBeastStarUp_21607)GodBeastMsg.C2S_GodBeastStarUp_21607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GodBeastStarUp_21607)e.getUnfinishedMessage();
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

         private void ensureCostItemsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.costItems_ = new ArrayList(this.costItems_);
               this.bitField0_ |= 4;
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
               this.bitField0_ &= -5;
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
               this.costItemsBuilder_ = new RepeatedFieldBuilderV3(this.costItems_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class S2C_GodBeastStarUp_21608 extends GeneratedMessageV3 implements S2C_GodBeastStarUp_21608OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_GodBeastStarUp_21608 DEFAULT_INSTANCE = new S2C_GodBeastStarUp_21608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GodBeastStarUp_21608> PARSER = new AbstractParser<S2C_GodBeastStarUp_21608>() {
         public S2C_GodBeastStarUp_21608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GodBeastStarUp_21608(input, extensionRegistry);
         }
      };

      private S2C_GodBeastStarUp_21608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GodBeastStarUp_21608() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GodBeastStarUp_21608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GodBeastStarUp_21608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastStarUp_21608.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GodBeastStarUp_21608)) {
            return super.equals(obj);
         } else {
            S2C_GodBeastStarUp_21608 other = (S2C_GodBeastStarUp_21608)obj;
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

      public static S2C_GodBeastStarUp_21608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastStarUp_21608)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastStarUp_21608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastStarUp_21608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastStarUp_21608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastStarUp_21608)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastStarUp_21608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastStarUp_21608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastStarUp_21608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastStarUp_21608)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastStarUp_21608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastStarUp_21608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastStarUp_21608 parseFrom(InputStream input) throws IOException {
         return (S2C_GodBeastStarUp_21608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastStarUp_21608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastStarUp_21608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastStarUp_21608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GodBeastStarUp_21608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GodBeastStarUp_21608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastStarUp_21608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastStarUp_21608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GodBeastStarUp_21608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastStarUp_21608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastStarUp_21608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GodBeastStarUp_21608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GodBeastStarUp_21608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GodBeastStarUp_21608> parser() {
         return PARSER;
      }

      public Parser<S2C_GodBeastStarUp_21608> getParserForType() {
         return PARSER;
      }

      public S2C_GodBeastStarUp_21608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GodBeastStarUp_21608OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastStarUp_21608.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_GodBeastStarUp_21608.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastStarUp_21608_descriptor;
         }

         public S2C_GodBeastStarUp_21608 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_GodBeastStarUp_21608.getDefaultInstance();
         }

         public S2C_GodBeastStarUp_21608 build() {
            S2C_GodBeastStarUp_21608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GodBeastStarUp_21608 buildPartial() {
            S2C_GodBeastStarUp_21608 result = new S2C_GodBeastStarUp_21608(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_GodBeastStarUp_21608) {
               return this.mergeFrom((S2C_GodBeastStarUp_21608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GodBeastStarUp_21608 other) {
            if (other == GodBeastMsg.S2C_GodBeastStarUp_21608.getDefaultInstance()) {
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
            S2C_GodBeastStarUp_21608 parsedMessage = null;

            try {
               parsedMessage = (S2C_GodBeastStarUp_21608)GodBeastMsg.S2C_GodBeastStarUp_21608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GodBeastStarUp_21608)e.getUnfinishedMessage();
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

   public static final class C2S_LearnPassiveSkill_21609 extends GeneratedMessageV3 implements C2S_LearnPassiveSkill_21609OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int SKILLID_FIELD_NUMBER = 3;
      private int skillId_;
      private byte memoizedIsInitialized;
      private static final C2S_LearnPassiveSkill_21609 DEFAULT_INSTANCE = new C2S_LearnPassiveSkill_21609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LearnPassiveSkill_21609> PARSER = new AbstractParser<C2S_LearnPassiveSkill_21609>() {
         public C2S_LearnPassiveSkill_21609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LearnPassiveSkill_21609(input, extensionRegistry);
         }
      };

      private C2S_LearnPassiveSkill_21609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LearnPassiveSkill_21609() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LearnPassiveSkill_21609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LearnPassiveSkill_21609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 4;
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnPassiveSkill_21609.class, Builder.class);
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

      public boolean hasSkillId() {
         return (this.bitField0_ & 4) != 0;
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.skillId_);
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
               size += CodedOutputStream.computeInt32Size(3, this.skillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LearnPassiveSkill_21609)) {
            return super.equals(obj);
         } else {
            C2S_LearnPassiveSkill_21609 other = (C2S_LearnPassiveSkill_21609)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasSkillId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LearnPassiveSkill_21609)PARSER.parseFrom(data);
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnPassiveSkill_21609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LearnPassiveSkill_21609)PARSER.parseFrom(data);
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnPassiveSkill_21609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LearnPassiveSkill_21609)PARSER.parseFrom(data);
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnPassiveSkill_21609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(InputStream input) throws IOException {
         return (C2S_LearnPassiveSkill_21609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnPassiveSkill_21609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnPassiveSkill_21609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LearnPassiveSkill_21609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LearnPassiveSkill_21609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnPassiveSkill_21609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LearnPassiveSkill_21609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnPassiveSkill_21609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnPassiveSkill_21609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LearnPassiveSkill_21609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LearnPassiveSkill_21609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LearnPassiveSkill_21609> parser() {
         return PARSER;
      }

      public Parser<C2S_LearnPassiveSkill_21609> getParserForType() {
         return PARSER;
      }

      public C2S_LearnPassiveSkill_21609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LearnPassiveSkill_21609OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;
         private int skillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnPassiveSkill_21609.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_LearnPassiveSkill_21609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.skillId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnPassiveSkill_21609_descriptor;
         }

         public C2S_LearnPassiveSkill_21609 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_LearnPassiveSkill_21609.getDefaultInstance();
         }

         public C2S_LearnPassiveSkill_21609 build() {
            C2S_LearnPassiveSkill_21609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LearnPassiveSkill_21609 buildPartial() {
            C2S_LearnPassiveSkill_21609 result = new C2S_LearnPassiveSkill_21609(this);
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
               result.skillId_ = this.skillId_;
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
            if (other instanceof C2S_LearnPassiveSkill_21609) {
               return this.mergeFrom((C2S_LearnPassiveSkill_21609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LearnPassiveSkill_21609 other) {
            if (other == GodBeastMsg.C2S_LearnPassiveSkill_21609.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

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
            return this.hasSkillId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LearnPassiveSkill_21609 parsedMessage = null;

            try {
               parsedMessage = (C2S_LearnPassiveSkill_21609)GodBeastMsg.C2S_LearnPassiveSkill_21609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LearnPassiveSkill_21609)e.getUnfinishedMessage();
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

         public boolean hasSkillId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 4;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -5;
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

   public static final class S2C_LearnPassiveSkill_21610 extends GeneratedMessageV3 implements S2C_LearnPassiveSkill_21610OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_LearnPassiveSkill_21610 DEFAULT_INSTANCE = new S2C_LearnPassiveSkill_21610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LearnPassiveSkill_21610> PARSER = new AbstractParser<S2C_LearnPassiveSkill_21610>() {
         public S2C_LearnPassiveSkill_21610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LearnPassiveSkill_21610(input, extensionRegistry);
         }
      };

      private S2C_LearnPassiveSkill_21610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LearnPassiveSkill_21610() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LearnPassiveSkill_21610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LearnPassiveSkill_21610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnPassiveSkill_21610.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LearnPassiveSkill_21610)) {
            return super.equals(obj);
         } else {
            S2C_LearnPassiveSkill_21610 other = (S2C_LearnPassiveSkill_21610)obj;
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

      public static S2C_LearnPassiveSkill_21610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LearnPassiveSkill_21610)PARSER.parseFrom(data);
      }

      public static S2C_LearnPassiveSkill_21610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnPassiveSkill_21610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnPassiveSkill_21610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LearnPassiveSkill_21610)PARSER.parseFrom(data);
      }

      public static S2C_LearnPassiveSkill_21610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnPassiveSkill_21610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnPassiveSkill_21610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LearnPassiveSkill_21610)PARSER.parseFrom(data);
      }

      public static S2C_LearnPassiveSkill_21610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnPassiveSkill_21610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnPassiveSkill_21610 parseFrom(InputStream input) throws IOException {
         return (S2C_LearnPassiveSkill_21610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnPassiveSkill_21610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnPassiveSkill_21610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnPassiveSkill_21610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LearnPassiveSkill_21610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LearnPassiveSkill_21610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnPassiveSkill_21610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnPassiveSkill_21610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LearnPassiveSkill_21610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnPassiveSkill_21610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnPassiveSkill_21610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LearnPassiveSkill_21610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LearnPassiveSkill_21610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LearnPassiveSkill_21610> parser() {
         return PARSER;
      }

      public Parser<S2C_LearnPassiveSkill_21610> getParserForType() {
         return PARSER;
      }

      public S2C_LearnPassiveSkill_21610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LearnPassiveSkill_21610OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnPassiveSkill_21610.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_LearnPassiveSkill_21610.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnPassiveSkill_21610_descriptor;
         }

         public S2C_LearnPassiveSkill_21610 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_LearnPassiveSkill_21610.getDefaultInstance();
         }

         public S2C_LearnPassiveSkill_21610 build() {
            S2C_LearnPassiveSkill_21610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LearnPassiveSkill_21610 buildPartial() {
            S2C_LearnPassiveSkill_21610 result = new S2C_LearnPassiveSkill_21610(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_LearnPassiveSkill_21610) {
               return this.mergeFrom((S2C_LearnPassiveSkill_21610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LearnPassiveSkill_21610 other) {
            if (other == GodBeastMsg.S2C_LearnPassiveSkill_21610.getDefaultInstance()) {
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
            S2C_LearnPassiveSkill_21610 parsedMessage = null;

            try {
               parsedMessage = (S2C_LearnPassiveSkill_21610)GodBeastMsg.S2C_LearnPassiveSkill_21610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LearnPassiveSkill_21610)e.getUnfinishedMessage();
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

   public static final class C2S_ResetPassiveSkill_21611 extends GeneratedMessageV3 implements C2S_ResetPassiveSkill_21611OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetPassiveSkill_21611 DEFAULT_INSTANCE = new C2S_ResetPassiveSkill_21611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetPassiveSkill_21611> PARSER = new AbstractParser<C2S_ResetPassiveSkill_21611>() {
         public C2S_ResetPassiveSkill_21611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetPassiveSkill_21611(input, extensionRegistry);
         }
      };

      private C2S_ResetPassiveSkill_21611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetPassiveSkill_21611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetPassiveSkill_21611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetPassiveSkill_21611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetPassiveSkill_21611.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ResetPassiveSkill_21611)) {
            return super.equals(obj);
         } else {
            C2S_ResetPassiveSkill_21611 other = (C2S_ResetPassiveSkill_21611)obj;
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

      public static C2S_ResetPassiveSkill_21611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetPassiveSkill_21611)PARSER.parseFrom(data);
      }

      public static C2S_ResetPassiveSkill_21611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetPassiveSkill_21611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetPassiveSkill_21611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetPassiveSkill_21611)PARSER.parseFrom(data);
      }

      public static C2S_ResetPassiveSkill_21611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetPassiveSkill_21611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetPassiveSkill_21611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetPassiveSkill_21611)PARSER.parseFrom(data);
      }

      public static C2S_ResetPassiveSkill_21611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetPassiveSkill_21611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetPassiveSkill_21611 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetPassiveSkill_21611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetPassiveSkill_21611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetPassiveSkill_21611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetPassiveSkill_21611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetPassiveSkill_21611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetPassiveSkill_21611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetPassiveSkill_21611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetPassiveSkill_21611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetPassiveSkill_21611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetPassiveSkill_21611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetPassiveSkill_21611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetPassiveSkill_21611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetPassiveSkill_21611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetPassiveSkill_21611> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetPassiveSkill_21611> getParserForType() {
         return PARSER;
      }

      public C2S_ResetPassiveSkill_21611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetPassiveSkill_21611OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetPassiveSkill_21611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_ResetPassiveSkill_21611.alwaysUseFieldBuilders) {
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
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetPassiveSkill_21611_descriptor;
         }

         public C2S_ResetPassiveSkill_21611 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_ResetPassiveSkill_21611.getDefaultInstance();
         }

         public C2S_ResetPassiveSkill_21611 build() {
            C2S_ResetPassiveSkill_21611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetPassiveSkill_21611 buildPartial() {
            C2S_ResetPassiveSkill_21611 result = new C2S_ResetPassiveSkill_21611(this);
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
            if (other instanceof C2S_ResetPassiveSkill_21611) {
               return this.mergeFrom((C2S_ResetPassiveSkill_21611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetPassiveSkill_21611 other) {
            if (other == GodBeastMsg.C2S_ResetPassiveSkill_21611.getDefaultInstance()) {
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ResetPassiveSkill_21611 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetPassiveSkill_21611)GodBeastMsg.C2S_ResetPassiveSkill_21611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetPassiveSkill_21611)e.getUnfinishedMessage();
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

   public static final class S2C_ResetPassiveSkill_21612 extends GeneratedMessageV3 implements S2C_ResetPassiveSkill_21612OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_ResetPassiveSkill_21612 DEFAULT_INSTANCE = new S2C_ResetPassiveSkill_21612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetPassiveSkill_21612> PARSER = new AbstractParser<S2C_ResetPassiveSkill_21612>() {
         public S2C_ResetPassiveSkill_21612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetPassiveSkill_21612(input, extensionRegistry);
         }
      };

      private S2C_ResetPassiveSkill_21612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetPassiveSkill_21612() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetPassiveSkill_21612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetPassiveSkill_21612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetPassiveSkill_21612.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ResetPassiveSkill_21612)) {
            return super.equals(obj);
         } else {
            S2C_ResetPassiveSkill_21612 other = (S2C_ResetPassiveSkill_21612)obj;
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

      public static S2C_ResetPassiveSkill_21612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetPassiveSkill_21612)PARSER.parseFrom(data);
      }

      public static S2C_ResetPassiveSkill_21612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetPassiveSkill_21612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetPassiveSkill_21612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetPassiveSkill_21612)PARSER.parseFrom(data);
      }

      public static S2C_ResetPassiveSkill_21612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetPassiveSkill_21612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetPassiveSkill_21612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetPassiveSkill_21612)PARSER.parseFrom(data);
      }

      public static S2C_ResetPassiveSkill_21612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetPassiveSkill_21612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetPassiveSkill_21612 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetPassiveSkill_21612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetPassiveSkill_21612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetPassiveSkill_21612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetPassiveSkill_21612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetPassiveSkill_21612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetPassiveSkill_21612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetPassiveSkill_21612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetPassiveSkill_21612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetPassiveSkill_21612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetPassiveSkill_21612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetPassiveSkill_21612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetPassiveSkill_21612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetPassiveSkill_21612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetPassiveSkill_21612> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetPassiveSkill_21612> getParserForType() {
         return PARSER;
      }

      public S2C_ResetPassiveSkill_21612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetPassiveSkill_21612OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetPassiveSkill_21612.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_ResetPassiveSkill_21612.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetPassiveSkill_21612_descriptor;
         }

         public S2C_ResetPassiveSkill_21612 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_ResetPassiveSkill_21612.getDefaultInstance();
         }

         public S2C_ResetPassiveSkill_21612 build() {
            S2C_ResetPassiveSkill_21612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetPassiveSkill_21612 buildPartial() {
            S2C_ResetPassiveSkill_21612 result = new S2C_ResetPassiveSkill_21612(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_ResetPassiveSkill_21612) {
               return this.mergeFrom((S2C_ResetPassiveSkill_21612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetPassiveSkill_21612 other) {
            if (other == GodBeastMsg.S2C_ResetPassiveSkill_21612.getDefaultInstance()) {
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
            S2C_ResetPassiveSkill_21612 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetPassiveSkill_21612)GodBeastMsg.S2C_ResetPassiveSkill_21612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetPassiveSkill_21612)e.getUnfinishedMessage();
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

   public static final class C2S_LearnAttrSkill_21613 extends GeneratedMessageV3 implements C2S_LearnAttrSkill_21613OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int SLOT_FIELD_NUMBER = 3;
      private int slot_;
      public static final int SKILLID_FIELD_NUMBER = 4;
      private int skillId_;
      private byte memoizedIsInitialized;
      private static final C2S_LearnAttrSkill_21613 DEFAULT_INSTANCE = new C2S_LearnAttrSkill_21613();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LearnAttrSkill_21613> PARSER = new AbstractParser<C2S_LearnAttrSkill_21613>() {
         public C2S_LearnAttrSkill_21613 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LearnAttrSkill_21613(input, extensionRegistry);
         }
      };

      private C2S_LearnAttrSkill_21613(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LearnAttrSkill_21613() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LearnAttrSkill_21613();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LearnAttrSkill_21613(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 4;
                        this.slot_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnAttrSkill_21613.class, Builder.class);
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

      public boolean hasSlot() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSlot() {
         return this.slot_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasSlot()) {
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.slot_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.skillId_);
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
               size += CodedOutputStream.computeInt32Size(3, this.slot_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.skillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LearnAttrSkill_21613)) {
            return super.equals(obj);
         } else {
            C2S_LearnAttrSkill_21613 other = (C2S_LearnAttrSkill_21613)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasSlot() != other.hasSlot()) {
               return false;
            } else if (this.hasSlot() && this.getSlot() != other.getSlot()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
            }

            if (this.hasSlot()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSlot();
            }

            if (this.hasSkillId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LearnAttrSkill_21613)PARSER.parseFrom(data);
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnAttrSkill_21613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LearnAttrSkill_21613)PARSER.parseFrom(data);
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnAttrSkill_21613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LearnAttrSkill_21613)PARSER.parseFrom(data);
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnAttrSkill_21613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(InputStream input) throws IOException {
         return (C2S_LearnAttrSkill_21613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnAttrSkill_21613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnAttrSkill_21613 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LearnAttrSkill_21613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LearnAttrSkill_21613 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnAttrSkill_21613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LearnAttrSkill_21613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnAttrSkill_21613 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnAttrSkill_21613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LearnAttrSkill_21613 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LearnAttrSkill_21613 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LearnAttrSkill_21613> parser() {
         return PARSER;
      }

      public Parser<C2S_LearnAttrSkill_21613> getParserForType() {
         return PARSER;
      }

      public C2S_LearnAttrSkill_21613 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LearnAttrSkill_21613OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;
         private int slot_;
         private int skillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnAttrSkill_21613.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_LearnAttrSkill_21613.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.slot_ = 0;
            this.bitField0_ &= -5;
            this.skillId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_LearnAttrSkill_21613_descriptor;
         }

         public C2S_LearnAttrSkill_21613 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_LearnAttrSkill_21613.getDefaultInstance();
         }

         public C2S_LearnAttrSkill_21613 build() {
            C2S_LearnAttrSkill_21613 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LearnAttrSkill_21613 buildPartial() {
            C2S_LearnAttrSkill_21613 result = new C2S_LearnAttrSkill_21613(this);
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
               result.slot_ = this.slot_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.skillId_ = this.skillId_;
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
            if (other instanceof C2S_LearnAttrSkill_21613) {
               return this.mergeFrom((C2S_LearnAttrSkill_21613)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LearnAttrSkill_21613 other) {
            if (other == GodBeastMsg.C2S_LearnAttrSkill_21613.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasSlot()) {
                  this.setSlot(other.getSlot());
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
            if (!this.hasSlot()) {
               return false;
            } else {
               return this.hasSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LearnAttrSkill_21613 parsedMessage = null;

            try {
               parsedMessage = (C2S_LearnAttrSkill_21613)GodBeastMsg.C2S_LearnAttrSkill_21613.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LearnAttrSkill_21613)e.getUnfinishedMessage();
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

         public boolean hasSlot() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSlot() {
            return this.slot_;
         }

         public Builder setSlot(int value) {
            this.bitField0_ |= 4;
            this.slot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlot() {
            this.bitField0_ &= -5;
            this.slot_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 8;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -9;
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

   public static final class S2C_LearnAttrSkill_21614 extends GeneratedMessageV3 implements S2C_LearnAttrSkill_21614OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_LearnAttrSkill_21614 DEFAULT_INSTANCE = new S2C_LearnAttrSkill_21614();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LearnAttrSkill_21614> PARSER = new AbstractParser<S2C_LearnAttrSkill_21614>() {
         public S2C_LearnAttrSkill_21614 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LearnAttrSkill_21614(input, extensionRegistry);
         }
      };

      private S2C_LearnAttrSkill_21614(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LearnAttrSkill_21614() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LearnAttrSkill_21614();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LearnAttrSkill_21614(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnAttrSkill_21614.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LearnAttrSkill_21614)) {
            return super.equals(obj);
         } else {
            S2C_LearnAttrSkill_21614 other = (S2C_LearnAttrSkill_21614)obj;
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

      public static S2C_LearnAttrSkill_21614 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LearnAttrSkill_21614)PARSER.parseFrom(data);
      }

      public static S2C_LearnAttrSkill_21614 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnAttrSkill_21614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnAttrSkill_21614 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LearnAttrSkill_21614)PARSER.parseFrom(data);
      }

      public static S2C_LearnAttrSkill_21614 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnAttrSkill_21614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnAttrSkill_21614 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LearnAttrSkill_21614)PARSER.parseFrom(data);
      }

      public static S2C_LearnAttrSkill_21614 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnAttrSkill_21614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnAttrSkill_21614 parseFrom(InputStream input) throws IOException {
         return (S2C_LearnAttrSkill_21614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnAttrSkill_21614 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnAttrSkill_21614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnAttrSkill_21614 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LearnAttrSkill_21614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LearnAttrSkill_21614 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnAttrSkill_21614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnAttrSkill_21614 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LearnAttrSkill_21614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnAttrSkill_21614 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnAttrSkill_21614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LearnAttrSkill_21614 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LearnAttrSkill_21614 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LearnAttrSkill_21614> parser() {
         return PARSER;
      }

      public Parser<S2C_LearnAttrSkill_21614> getParserForType() {
         return PARSER;
      }

      public S2C_LearnAttrSkill_21614 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LearnAttrSkill_21614OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnAttrSkill_21614.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_LearnAttrSkill_21614.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_LearnAttrSkill_21614_descriptor;
         }

         public S2C_LearnAttrSkill_21614 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_LearnAttrSkill_21614.getDefaultInstance();
         }

         public S2C_LearnAttrSkill_21614 build() {
            S2C_LearnAttrSkill_21614 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LearnAttrSkill_21614 buildPartial() {
            S2C_LearnAttrSkill_21614 result = new S2C_LearnAttrSkill_21614(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_LearnAttrSkill_21614) {
               return this.mergeFrom((S2C_LearnAttrSkill_21614)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LearnAttrSkill_21614 other) {
            if (other == GodBeastMsg.S2C_LearnAttrSkill_21614.getDefaultInstance()) {
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
            S2C_LearnAttrSkill_21614 parsedMessage = null;

            try {
               parsedMessage = (S2C_LearnAttrSkill_21614)GodBeastMsg.S2C_LearnAttrSkill_21614.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LearnAttrSkill_21614)e.getUnfinishedMessage();
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

   public static final class C2S_ResetAttrSkill_21615 extends GeneratedMessageV3 implements C2S_ResetAttrSkill_21615OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int SLOT_FIELD_NUMBER = 3;
      private int slot_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetAttrSkill_21615 DEFAULT_INSTANCE = new C2S_ResetAttrSkill_21615();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetAttrSkill_21615> PARSER = new AbstractParser<C2S_ResetAttrSkill_21615>() {
         public C2S_ResetAttrSkill_21615 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetAttrSkill_21615(input, extensionRegistry);
         }
      };

      private C2S_ResetAttrSkill_21615(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetAttrSkill_21615() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetAttrSkill_21615();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetAttrSkill_21615(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 4;
                        this.slot_ = input.readInt32();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetAttrSkill_21615.class, Builder.class);
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

      public boolean hasSlot() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSlot() {
         return this.slot_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSlot()) {
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
            output.writeInt32(3, this.slot_);
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
               size += CodedOutputStream.computeInt32Size(3, this.slot_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ResetAttrSkill_21615)) {
            return super.equals(obj);
         } else {
            C2S_ResetAttrSkill_21615 other = (C2S_ResetAttrSkill_21615)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasSlot() != other.hasSlot()) {
               return false;
            } else if (this.hasSlot() && this.getSlot() != other.getSlot()) {
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

            if (this.hasSlot()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSlot();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetAttrSkill_21615)PARSER.parseFrom(data);
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetAttrSkill_21615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetAttrSkill_21615)PARSER.parseFrom(data);
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetAttrSkill_21615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetAttrSkill_21615)PARSER.parseFrom(data);
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetAttrSkill_21615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetAttrSkill_21615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetAttrSkill_21615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetAttrSkill_21615 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetAttrSkill_21615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetAttrSkill_21615 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetAttrSkill_21615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetAttrSkill_21615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetAttrSkill_21615 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetAttrSkill_21615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetAttrSkill_21615 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetAttrSkill_21615 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetAttrSkill_21615> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetAttrSkill_21615> getParserForType() {
         return PARSER;
      }

      public C2S_ResetAttrSkill_21615 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetAttrSkill_21615OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;
         private int slot_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetAttrSkill_21615.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_ResetAttrSkill_21615.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.slot_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetAttrSkill_21615_descriptor;
         }

         public C2S_ResetAttrSkill_21615 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_ResetAttrSkill_21615.getDefaultInstance();
         }

         public C2S_ResetAttrSkill_21615 build() {
            C2S_ResetAttrSkill_21615 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetAttrSkill_21615 buildPartial() {
            C2S_ResetAttrSkill_21615 result = new C2S_ResetAttrSkill_21615(this);
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
               result.slot_ = this.slot_;
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
            if (other instanceof C2S_ResetAttrSkill_21615) {
               return this.mergeFrom((C2S_ResetAttrSkill_21615)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetAttrSkill_21615 other) {
            if (other == GodBeastMsg.C2S_ResetAttrSkill_21615.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasSlot()) {
                  this.setSlot(other.getSlot());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSlot();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ResetAttrSkill_21615 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetAttrSkill_21615)GodBeastMsg.C2S_ResetAttrSkill_21615.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetAttrSkill_21615)e.getUnfinishedMessage();
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

         public boolean hasSlot() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSlot() {
            return this.slot_;
         }

         public Builder setSlot(int value) {
            this.bitField0_ |= 4;
            this.slot_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlot() {
            this.bitField0_ &= -5;
            this.slot_ = 0;
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

   public static final class S2C_ResetAttrSkill_21616 extends GeneratedMessageV3 implements S2C_ResetAttrSkill_21616OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_ResetAttrSkill_21616 DEFAULT_INSTANCE = new S2C_ResetAttrSkill_21616();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetAttrSkill_21616> PARSER = new AbstractParser<S2C_ResetAttrSkill_21616>() {
         public S2C_ResetAttrSkill_21616 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetAttrSkill_21616(input, extensionRegistry);
         }
      };

      private S2C_ResetAttrSkill_21616(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetAttrSkill_21616() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetAttrSkill_21616();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetAttrSkill_21616(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetAttrSkill_21616.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ResetAttrSkill_21616)) {
            return super.equals(obj);
         } else {
            S2C_ResetAttrSkill_21616 other = (S2C_ResetAttrSkill_21616)obj;
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

      public static S2C_ResetAttrSkill_21616 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetAttrSkill_21616)PARSER.parseFrom(data);
      }

      public static S2C_ResetAttrSkill_21616 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetAttrSkill_21616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetAttrSkill_21616 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetAttrSkill_21616)PARSER.parseFrom(data);
      }

      public static S2C_ResetAttrSkill_21616 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetAttrSkill_21616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetAttrSkill_21616 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetAttrSkill_21616)PARSER.parseFrom(data);
      }

      public static S2C_ResetAttrSkill_21616 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetAttrSkill_21616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetAttrSkill_21616 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetAttrSkill_21616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetAttrSkill_21616 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetAttrSkill_21616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetAttrSkill_21616 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetAttrSkill_21616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetAttrSkill_21616 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetAttrSkill_21616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetAttrSkill_21616 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetAttrSkill_21616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetAttrSkill_21616 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetAttrSkill_21616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetAttrSkill_21616 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetAttrSkill_21616 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetAttrSkill_21616> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetAttrSkill_21616> getParserForType() {
         return PARSER;
      }

      public S2C_ResetAttrSkill_21616 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetAttrSkill_21616OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetAttrSkill_21616.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_ResetAttrSkill_21616.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetAttrSkill_21616_descriptor;
         }

         public S2C_ResetAttrSkill_21616 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_ResetAttrSkill_21616.getDefaultInstance();
         }

         public S2C_ResetAttrSkill_21616 build() {
            S2C_ResetAttrSkill_21616 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetAttrSkill_21616 buildPartial() {
            S2C_ResetAttrSkill_21616 result = new S2C_ResetAttrSkill_21616(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_ResetAttrSkill_21616) {
               return this.mergeFrom((S2C_ResetAttrSkill_21616)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetAttrSkill_21616 other) {
            if (other == GodBeastMsg.S2C_ResetAttrSkill_21616.getDefaultInstance()) {
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
            S2C_ResetAttrSkill_21616 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetAttrSkill_21616)GodBeastMsg.S2C_ResetAttrSkill_21616.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetAttrSkill_21616)e.getUnfinishedMessage();
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

   public static final class C2S_UseGodBeast_21617 extends GeneratedMessageV3 implements C2S_UseGodBeast_21617OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int USEITEMCODE_FIELD_NUMBER = 2;
      private int useItemCode_;
      public static final int USEHEROCODE_FIELD_NUMBER = 3;
      private int useHeroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_UseGodBeast_21617 DEFAULT_INSTANCE = new C2S_UseGodBeast_21617();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UseGodBeast_21617> PARSER = new AbstractParser<C2S_UseGodBeast_21617>() {
         public C2S_UseGodBeast_21617 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UseGodBeast_21617(input, extensionRegistry);
         }
      };

      private C2S_UseGodBeast_21617(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UseGodBeast_21617() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UseGodBeast_21617();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UseGodBeast_21617(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.useItemCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.useHeroCode_ = input.readInt32();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseGodBeast_21617.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasUseItemCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUseItemCode() {
         return this.useItemCode_;
      }

      public boolean hasUseHeroCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getUseHeroCode() {
         return this.useHeroCode_;
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
            output.writeInt32(2, this.useItemCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.useHeroCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.useItemCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.useHeroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UseGodBeast_21617)) {
            return super.equals(obj);
         } else {
            C2S_UseGodBeast_21617 other = (C2S_UseGodBeast_21617)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasUseItemCode() != other.hasUseItemCode()) {
               return false;
            } else if (this.hasUseItemCode() && this.getUseItemCode() != other.getUseItemCode()) {
               return false;
            } else if (this.hasUseHeroCode() != other.hasUseHeroCode()) {
               return false;
            } else if (this.hasUseHeroCode() && this.getUseHeroCode() != other.getUseHeroCode()) {
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

            if (this.hasUseItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUseItemCode();
            }

            if (this.hasUseHeroCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUseHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UseGodBeast_21617 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UseGodBeast_21617)PARSER.parseFrom(data);
      }

      public static C2S_UseGodBeast_21617 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseGodBeast_21617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseGodBeast_21617 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UseGodBeast_21617)PARSER.parseFrom(data);
      }

      public static C2S_UseGodBeast_21617 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseGodBeast_21617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseGodBeast_21617 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UseGodBeast_21617)PARSER.parseFrom(data);
      }

      public static C2S_UseGodBeast_21617 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseGodBeast_21617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseGodBeast_21617 parseFrom(InputStream input) throws IOException {
         return (C2S_UseGodBeast_21617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseGodBeast_21617 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseGodBeast_21617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseGodBeast_21617 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UseGodBeast_21617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UseGodBeast_21617 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseGodBeast_21617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseGodBeast_21617 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UseGodBeast_21617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseGodBeast_21617 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseGodBeast_21617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UseGodBeast_21617 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UseGodBeast_21617 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UseGodBeast_21617> parser() {
         return PARSER;
      }

      public Parser<C2S_UseGodBeast_21617> getParserForType() {
         return PARSER;
      }

      public C2S_UseGodBeast_21617 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UseGodBeast_21617OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int useItemCode_;
         private int useHeroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseGodBeast_21617.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_UseGodBeast_21617.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.useItemCode_ = 0;
            this.bitField0_ &= -3;
            this.useHeroCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_UseGodBeast_21617_descriptor;
         }

         public C2S_UseGodBeast_21617 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_UseGodBeast_21617.getDefaultInstance();
         }

         public C2S_UseGodBeast_21617 build() {
            C2S_UseGodBeast_21617 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UseGodBeast_21617 buildPartial() {
            C2S_UseGodBeast_21617 result = new C2S_UseGodBeast_21617(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.useItemCode_ = this.useItemCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.useHeroCode_ = this.useHeroCode_;
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
            if (other instanceof C2S_UseGodBeast_21617) {
               return this.mergeFrom((C2S_UseGodBeast_21617)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UseGodBeast_21617 other) {
            if (other == GodBeastMsg.C2S_UseGodBeast_21617.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasUseItemCode()) {
                  this.setUseItemCode(other.getUseItemCode());
               }

               if (other.hasUseHeroCode()) {
                  this.setUseHeroCode(other.getUseHeroCode());
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
            C2S_UseGodBeast_21617 parsedMessage = null;

            try {
               parsedMessage = (C2S_UseGodBeast_21617)GodBeastMsg.C2S_UseGodBeast_21617.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UseGodBeast_21617)e.getUnfinishedMessage();
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

         public boolean hasUseItemCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUseItemCode() {
            return this.useItemCode_;
         }

         public Builder setUseItemCode(int value) {
            this.bitField0_ |= 2;
            this.useItemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseItemCode() {
            this.bitField0_ &= -3;
            this.useItemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUseHeroCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getUseHeroCode() {
            return this.useHeroCode_;
         }

         public Builder setUseHeroCode(int value) {
            this.bitField0_ |= 4;
            this.useHeroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseHeroCode() {
            this.bitField0_ &= -5;
            this.useHeroCode_ = 0;
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

   public static final class S2C_UseGodBeast_21618 extends GeneratedMessageV3 implements S2C_UseGodBeast_21618OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_UseGodBeast_21618 DEFAULT_INSTANCE = new S2C_UseGodBeast_21618();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UseGodBeast_21618> PARSER = new AbstractParser<S2C_UseGodBeast_21618>() {
         public S2C_UseGodBeast_21618 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UseGodBeast_21618(input, extensionRegistry);
         }
      };

      private S2C_UseGodBeast_21618(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UseGodBeast_21618() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UseGodBeast_21618();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UseGodBeast_21618(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UseGodBeast_21618.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UseGodBeast_21618)) {
            return super.equals(obj);
         } else {
            S2C_UseGodBeast_21618 other = (S2C_UseGodBeast_21618)obj;
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

      public static S2C_UseGodBeast_21618 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UseGodBeast_21618)PARSER.parseFrom(data);
      }

      public static S2C_UseGodBeast_21618 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseGodBeast_21618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseGodBeast_21618 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UseGodBeast_21618)PARSER.parseFrom(data);
      }

      public static S2C_UseGodBeast_21618 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseGodBeast_21618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseGodBeast_21618 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UseGodBeast_21618)PARSER.parseFrom(data);
      }

      public static S2C_UseGodBeast_21618 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseGodBeast_21618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseGodBeast_21618 parseFrom(InputStream input) throws IOException {
         return (S2C_UseGodBeast_21618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UseGodBeast_21618 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseGodBeast_21618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UseGodBeast_21618 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UseGodBeast_21618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UseGodBeast_21618 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseGodBeast_21618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UseGodBeast_21618 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UseGodBeast_21618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UseGodBeast_21618 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseGodBeast_21618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UseGodBeast_21618 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UseGodBeast_21618 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UseGodBeast_21618> parser() {
         return PARSER;
      }

      public Parser<S2C_UseGodBeast_21618> getParserForType() {
         return PARSER;
      }

      public S2C_UseGodBeast_21618 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UseGodBeast_21618OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UseGodBeast_21618.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_UseGodBeast_21618.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_UseGodBeast_21618_descriptor;
         }

         public S2C_UseGodBeast_21618 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_UseGodBeast_21618.getDefaultInstance();
         }

         public S2C_UseGodBeast_21618 build() {
            S2C_UseGodBeast_21618 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UseGodBeast_21618 buildPartial() {
            S2C_UseGodBeast_21618 result = new S2C_UseGodBeast_21618(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_UseGodBeast_21618) {
               return this.mergeFrom((S2C_UseGodBeast_21618)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UseGodBeast_21618 other) {
            if (other == GodBeastMsg.S2C_UseGodBeast_21618.getDefaultInstance()) {
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
            S2C_UseGodBeast_21618 parsedMessage = null;

            try {
               parsedMessage = (S2C_UseGodBeast_21618)GodBeastMsg.S2C_UseGodBeast_21618.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UseGodBeast_21618)e.getUnfinishedMessage();
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

   public static final class C2S_NoUseGodBeast_21619 extends GeneratedMessageV3 implements C2S_NoUseGodBeast_21619OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_NoUseGodBeast_21619 DEFAULT_INSTANCE = new C2S_NoUseGodBeast_21619();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NoUseGodBeast_21619> PARSER = new AbstractParser<C2S_NoUseGodBeast_21619>() {
         public C2S_NoUseGodBeast_21619 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NoUseGodBeast_21619(input, extensionRegistry);
         }
      };

      private C2S_NoUseGodBeast_21619(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NoUseGodBeast_21619() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NoUseGodBeast_21619();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NoUseGodBeast_21619(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoUseGodBeast_21619.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NoUseGodBeast_21619)) {
            return super.equals(obj);
         } else {
            C2S_NoUseGodBeast_21619 other = (C2S_NoUseGodBeast_21619)obj;
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

      public static C2S_NoUseGodBeast_21619 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NoUseGodBeast_21619)PARSER.parseFrom(data);
      }

      public static C2S_NoUseGodBeast_21619 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoUseGodBeast_21619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoUseGodBeast_21619 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NoUseGodBeast_21619)PARSER.parseFrom(data);
      }

      public static C2S_NoUseGodBeast_21619 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoUseGodBeast_21619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoUseGodBeast_21619 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NoUseGodBeast_21619)PARSER.parseFrom(data);
      }

      public static C2S_NoUseGodBeast_21619 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoUseGodBeast_21619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoUseGodBeast_21619 parseFrom(InputStream input) throws IOException {
         return (C2S_NoUseGodBeast_21619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoUseGodBeast_21619 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoUseGodBeast_21619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoUseGodBeast_21619 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NoUseGodBeast_21619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NoUseGodBeast_21619 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoUseGodBeast_21619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoUseGodBeast_21619 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NoUseGodBeast_21619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoUseGodBeast_21619 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoUseGodBeast_21619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NoUseGodBeast_21619 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NoUseGodBeast_21619 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NoUseGodBeast_21619> parser() {
         return PARSER;
      }

      public Parser<C2S_NoUseGodBeast_21619> getParserForType() {
         return PARSER;
      }

      public C2S_NoUseGodBeast_21619 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NoUseGodBeast_21619OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoUseGodBeast_21619.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_NoUseGodBeast_21619.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoUseGodBeast_21619_descriptor;
         }

         public C2S_NoUseGodBeast_21619 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_NoUseGodBeast_21619.getDefaultInstance();
         }

         public C2S_NoUseGodBeast_21619 build() {
            C2S_NoUseGodBeast_21619 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NoUseGodBeast_21619 buildPartial() {
            C2S_NoUseGodBeast_21619 result = new C2S_NoUseGodBeast_21619(this);
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
            if (other instanceof C2S_NoUseGodBeast_21619) {
               return this.mergeFrom((C2S_NoUseGodBeast_21619)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NoUseGodBeast_21619 other) {
            if (other == GodBeastMsg.C2S_NoUseGodBeast_21619.getDefaultInstance()) {
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
            C2S_NoUseGodBeast_21619 parsedMessage = null;

            try {
               parsedMessage = (C2S_NoUseGodBeast_21619)GodBeastMsg.C2S_NoUseGodBeast_21619.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NoUseGodBeast_21619)e.getUnfinishedMessage();
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

   public static final class S2C_NoUseGodBeast_21620 extends GeneratedMessageV3 implements S2C_NoUseGodBeast_21620OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_NoUseGodBeast_21620 DEFAULT_INSTANCE = new S2C_NoUseGodBeast_21620();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NoUseGodBeast_21620> PARSER = new AbstractParser<S2C_NoUseGodBeast_21620>() {
         public S2C_NoUseGodBeast_21620 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NoUseGodBeast_21620(input, extensionRegistry);
         }
      };

      private S2C_NoUseGodBeast_21620(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NoUseGodBeast_21620() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NoUseGodBeast_21620();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NoUseGodBeast_21620(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoUseGodBeast_21620.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NoUseGodBeast_21620)) {
            return super.equals(obj);
         } else {
            S2C_NoUseGodBeast_21620 other = (S2C_NoUseGodBeast_21620)obj;
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

      public static S2C_NoUseGodBeast_21620 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NoUseGodBeast_21620)PARSER.parseFrom(data);
      }

      public static S2C_NoUseGodBeast_21620 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoUseGodBeast_21620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoUseGodBeast_21620 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NoUseGodBeast_21620)PARSER.parseFrom(data);
      }

      public static S2C_NoUseGodBeast_21620 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoUseGodBeast_21620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoUseGodBeast_21620 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NoUseGodBeast_21620)PARSER.parseFrom(data);
      }

      public static S2C_NoUseGodBeast_21620 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoUseGodBeast_21620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoUseGodBeast_21620 parseFrom(InputStream input) throws IOException {
         return (S2C_NoUseGodBeast_21620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoUseGodBeast_21620 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoUseGodBeast_21620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoUseGodBeast_21620 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NoUseGodBeast_21620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NoUseGodBeast_21620 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoUseGodBeast_21620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoUseGodBeast_21620 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NoUseGodBeast_21620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoUseGodBeast_21620 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoUseGodBeast_21620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NoUseGodBeast_21620 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NoUseGodBeast_21620 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NoUseGodBeast_21620> parser() {
         return PARSER;
      }

      public Parser<S2C_NoUseGodBeast_21620> getParserForType() {
         return PARSER;
      }

      public S2C_NoUseGodBeast_21620 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NoUseGodBeast_21620OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoUseGodBeast_21620.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_NoUseGodBeast_21620.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoUseGodBeast_21620_descriptor;
         }

         public S2C_NoUseGodBeast_21620 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_NoUseGodBeast_21620.getDefaultInstance();
         }

         public S2C_NoUseGodBeast_21620 build() {
            S2C_NoUseGodBeast_21620 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NoUseGodBeast_21620 buildPartial() {
            S2C_NoUseGodBeast_21620 result = new S2C_NoUseGodBeast_21620(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_NoUseGodBeast_21620) {
               return this.mergeFrom((S2C_NoUseGodBeast_21620)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NoUseGodBeast_21620 other) {
            if (other == GodBeastMsg.S2C_NoUseGodBeast_21620.getDefaultInstance()) {
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
            S2C_NoUseGodBeast_21620 parsedMessage = null;

            try {
               parsedMessage = (S2C_NoUseGodBeast_21620)GodBeastMsg.S2C_NoUseGodBeast_21620.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NoUseGodBeast_21620)e.getUnfinishedMessage();
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

   public static final class C2S_ChangeGodBeast_21621 extends GeneratedMessageV3 implements C2S_ChangeGodBeast_21621OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int TARGETGODBEASTID_FIELD_NUMBER = 3;
      private int targetGodBeastId_;
      private byte memoizedIsInitialized;
      private static final C2S_ChangeGodBeast_21621 DEFAULT_INSTANCE = new C2S_ChangeGodBeast_21621();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChangeGodBeast_21621> PARSER = new AbstractParser<C2S_ChangeGodBeast_21621>() {
         public C2S_ChangeGodBeast_21621 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChangeGodBeast_21621(input, extensionRegistry);
         }
      };

      private C2S_ChangeGodBeast_21621(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChangeGodBeast_21621() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChangeGodBeast_21621();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChangeGodBeast_21621(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 4;
                        this.targetGodBeastId_ = input.readInt32();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChangeGodBeast_21621.class, Builder.class);
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

      public boolean hasTargetGodBeastId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTargetGodBeastId() {
         return this.targetGodBeastId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTargetGodBeastId()) {
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
            output.writeInt32(3, this.targetGodBeastId_);
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
               size += CodedOutputStream.computeInt32Size(3, this.targetGodBeastId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ChangeGodBeast_21621)) {
            return super.equals(obj);
         } else {
            C2S_ChangeGodBeast_21621 other = (C2S_ChangeGodBeast_21621)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasTargetGodBeastId() != other.hasTargetGodBeastId()) {
               return false;
            } else if (this.hasTargetGodBeastId() && this.getTargetGodBeastId() != other.getTargetGodBeastId()) {
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

            if (this.hasTargetGodBeastId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTargetGodBeastId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChangeGodBeast_21621)PARSER.parseFrom(data);
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChangeGodBeast_21621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChangeGodBeast_21621)PARSER.parseFrom(data);
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChangeGodBeast_21621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChangeGodBeast_21621)PARSER.parseFrom(data);
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChangeGodBeast_21621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(InputStream input) throws IOException {
         return (C2S_ChangeGodBeast_21621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChangeGodBeast_21621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChangeGodBeast_21621 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChangeGodBeast_21621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChangeGodBeast_21621 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChangeGodBeast_21621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChangeGodBeast_21621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChangeGodBeast_21621 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChangeGodBeast_21621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChangeGodBeast_21621 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChangeGodBeast_21621 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChangeGodBeast_21621> parser() {
         return PARSER;
      }

      public Parser<C2S_ChangeGodBeast_21621> getParserForType() {
         return PARSER;
      }

      public C2S_ChangeGodBeast_21621 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChangeGodBeast_21621OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;
         private int targetGodBeastId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChangeGodBeast_21621.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_ChangeGodBeast_21621.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.targetGodBeastId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ChangeGodBeast_21621_descriptor;
         }

         public C2S_ChangeGodBeast_21621 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_ChangeGodBeast_21621.getDefaultInstance();
         }

         public C2S_ChangeGodBeast_21621 build() {
            C2S_ChangeGodBeast_21621 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChangeGodBeast_21621 buildPartial() {
            C2S_ChangeGodBeast_21621 result = new C2S_ChangeGodBeast_21621(this);
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
               result.targetGodBeastId_ = this.targetGodBeastId_;
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
            if (other instanceof C2S_ChangeGodBeast_21621) {
               return this.mergeFrom((C2S_ChangeGodBeast_21621)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChangeGodBeast_21621 other) {
            if (other == GodBeastMsg.C2S_ChangeGodBeast_21621.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasTargetGodBeastId()) {
                  this.setTargetGodBeastId(other.getTargetGodBeastId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTargetGodBeastId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ChangeGodBeast_21621 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChangeGodBeast_21621)GodBeastMsg.C2S_ChangeGodBeast_21621.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChangeGodBeast_21621)e.getUnfinishedMessage();
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

         public boolean hasTargetGodBeastId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTargetGodBeastId() {
            return this.targetGodBeastId_;
         }

         public Builder setTargetGodBeastId(int value) {
            this.bitField0_ |= 4;
            this.targetGodBeastId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetGodBeastId() {
            this.bitField0_ &= -5;
            this.targetGodBeastId_ = 0;
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

   public static final class S2C_ChangeGodBeast_21622 extends GeneratedMessageV3 implements S2C_ChangeGodBeast_21622OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_ChangeGodBeast_21622 DEFAULT_INSTANCE = new S2C_ChangeGodBeast_21622();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChangeGodBeast_21622> PARSER = new AbstractParser<S2C_ChangeGodBeast_21622>() {
         public S2C_ChangeGodBeast_21622 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChangeGodBeast_21622(input, extensionRegistry);
         }
      };

      private S2C_ChangeGodBeast_21622(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChangeGodBeast_21622() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChangeGodBeast_21622();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChangeGodBeast_21622(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChangeGodBeast_21622.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ChangeGodBeast_21622)) {
            return super.equals(obj);
         } else {
            S2C_ChangeGodBeast_21622 other = (S2C_ChangeGodBeast_21622)obj;
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

      public static S2C_ChangeGodBeast_21622 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChangeGodBeast_21622)PARSER.parseFrom(data);
      }

      public static S2C_ChangeGodBeast_21622 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangeGodBeast_21622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangeGodBeast_21622 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChangeGodBeast_21622)PARSER.parseFrom(data);
      }

      public static S2C_ChangeGodBeast_21622 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangeGodBeast_21622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangeGodBeast_21622 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChangeGodBeast_21622)PARSER.parseFrom(data);
      }

      public static S2C_ChangeGodBeast_21622 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangeGodBeast_21622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangeGodBeast_21622 parseFrom(InputStream input) throws IOException {
         return (S2C_ChangeGodBeast_21622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChangeGodBeast_21622 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangeGodBeast_21622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChangeGodBeast_21622 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChangeGodBeast_21622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChangeGodBeast_21622 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangeGodBeast_21622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChangeGodBeast_21622 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChangeGodBeast_21622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChangeGodBeast_21622 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangeGodBeast_21622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChangeGodBeast_21622 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChangeGodBeast_21622 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChangeGodBeast_21622> parser() {
         return PARSER;
      }

      public Parser<S2C_ChangeGodBeast_21622> getParserForType() {
         return PARSER;
      }

      public S2C_ChangeGodBeast_21622 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChangeGodBeast_21622OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChangeGodBeast_21622.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_ChangeGodBeast_21622.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ChangeGodBeast_21622_descriptor;
         }

         public S2C_ChangeGodBeast_21622 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_ChangeGodBeast_21622.getDefaultInstance();
         }

         public S2C_ChangeGodBeast_21622 build() {
            S2C_ChangeGodBeast_21622 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChangeGodBeast_21622 buildPartial() {
            S2C_ChangeGodBeast_21622 result = new S2C_ChangeGodBeast_21622(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_ChangeGodBeast_21622) {
               return this.mergeFrom((S2C_ChangeGodBeast_21622)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChangeGodBeast_21622 other) {
            if (other == GodBeastMsg.S2C_ChangeGodBeast_21622.getDefaultInstance()) {
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
            S2C_ChangeGodBeast_21622 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChangeGodBeast_21622)GodBeastMsg.S2C_ChangeGodBeast_21622.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChangeGodBeast_21622)e.getUnfinishedMessage();
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

   public static final class C2S_ResetGodBeast_21623 extends GeneratedMessageV3 implements C2S_ResetGodBeast_21623OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetGodBeast_21623 DEFAULT_INSTANCE = new C2S_ResetGodBeast_21623();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetGodBeast_21623> PARSER = new AbstractParser<C2S_ResetGodBeast_21623>() {
         public C2S_ResetGodBeast_21623 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetGodBeast_21623(input, extensionRegistry);
         }
      };

      private C2S_ResetGodBeast_21623(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetGodBeast_21623() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetGodBeast_21623();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetGodBeast_21623(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetGodBeast_21623.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ResetGodBeast_21623)) {
            return super.equals(obj);
         } else {
            C2S_ResetGodBeast_21623 other = (C2S_ResetGodBeast_21623)obj;
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

      public static C2S_ResetGodBeast_21623 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetGodBeast_21623)PARSER.parseFrom(data);
      }

      public static C2S_ResetGodBeast_21623 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetGodBeast_21623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetGodBeast_21623 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetGodBeast_21623)PARSER.parseFrom(data);
      }

      public static C2S_ResetGodBeast_21623 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetGodBeast_21623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetGodBeast_21623 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetGodBeast_21623)PARSER.parseFrom(data);
      }

      public static C2S_ResetGodBeast_21623 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetGodBeast_21623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetGodBeast_21623 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetGodBeast_21623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetGodBeast_21623 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetGodBeast_21623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetGodBeast_21623 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetGodBeast_21623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetGodBeast_21623 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetGodBeast_21623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetGodBeast_21623 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetGodBeast_21623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetGodBeast_21623 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetGodBeast_21623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetGodBeast_21623 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetGodBeast_21623 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetGodBeast_21623> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetGodBeast_21623> getParserForType() {
         return PARSER;
      }

      public C2S_ResetGodBeast_21623 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetGodBeast_21623OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetGodBeast_21623.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_ResetGodBeast_21623.alwaysUseFieldBuilders) {
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
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_ResetGodBeast_21623_descriptor;
         }

         public C2S_ResetGodBeast_21623 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_ResetGodBeast_21623.getDefaultInstance();
         }

         public C2S_ResetGodBeast_21623 build() {
            C2S_ResetGodBeast_21623 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetGodBeast_21623 buildPartial() {
            C2S_ResetGodBeast_21623 result = new C2S_ResetGodBeast_21623(this);
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
            if (other instanceof C2S_ResetGodBeast_21623) {
               return this.mergeFrom((C2S_ResetGodBeast_21623)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetGodBeast_21623 other) {
            if (other == GodBeastMsg.C2S_ResetGodBeast_21623.getDefaultInstance()) {
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ResetGodBeast_21623 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetGodBeast_21623)GodBeastMsg.C2S_ResetGodBeast_21623.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetGodBeast_21623)e.getUnfinishedMessage();
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

   public static final class S2C_ResetGodBeast_21624 extends GeneratedMessageV3 implements S2C_ResetGodBeast_21624OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_ResetGodBeast_21624 DEFAULT_INSTANCE = new S2C_ResetGodBeast_21624();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetGodBeast_21624> PARSER = new AbstractParser<S2C_ResetGodBeast_21624>() {
         public S2C_ResetGodBeast_21624 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetGodBeast_21624(input, extensionRegistry);
         }
      };

      private S2C_ResetGodBeast_21624(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetGodBeast_21624() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetGodBeast_21624();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetGodBeast_21624(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetGodBeast_21624.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ResetGodBeast_21624)) {
            return super.equals(obj);
         } else {
            S2C_ResetGodBeast_21624 other = (S2C_ResetGodBeast_21624)obj;
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

      public static S2C_ResetGodBeast_21624 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetGodBeast_21624)PARSER.parseFrom(data);
      }

      public static S2C_ResetGodBeast_21624 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetGodBeast_21624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetGodBeast_21624 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetGodBeast_21624)PARSER.parseFrom(data);
      }

      public static S2C_ResetGodBeast_21624 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetGodBeast_21624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetGodBeast_21624 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetGodBeast_21624)PARSER.parseFrom(data);
      }

      public static S2C_ResetGodBeast_21624 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetGodBeast_21624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetGodBeast_21624 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetGodBeast_21624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetGodBeast_21624 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetGodBeast_21624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetGodBeast_21624 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetGodBeast_21624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetGodBeast_21624 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetGodBeast_21624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetGodBeast_21624 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetGodBeast_21624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetGodBeast_21624 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetGodBeast_21624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetGodBeast_21624 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetGodBeast_21624 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetGodBeast_21624> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetGodBeast_21624> getParserForType() {
         return PARSER;
      }

      public S2C_ResetGodBeast_21624 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetGodBeast_21624OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetGodBeast_21624.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_ResetGodBeast_21624.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_ResetGodBeast_21624_descriptor;
         }

         public S2C_ResetGodBeast_21624 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_ResetGodBeast_21624.getDefaultInstance();
         }

         public S2C_ResetGodBeast_21624 build() {
            S2C_ResetGodBeast_21624 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetGodBeast_21624 buildPartial() {
            S2C_ResetGodBeast_21624 result = new S2C_ResetGodBeast_21624(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_ResetGodBeast_21624) {
               return this.mergeFrom((S2C_ResetGodBeast_21624)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetGodBeast_21624 other) {
            if (other == GodBeastMsg.S2C_ResetGodBeast_21624.getDefaultInstance()) {
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
            S2C_ResetGodBeast_21624 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetGodBeast_21624)GodBeastMsg.S2C_ResetGodBeast_21624.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetGodBeast_21624)e.getUnfinishedMessage();
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

   public static final class C2S_DecomposeGodBeast_21625 extends GeneratedMessageV3 implements C2S_DecomposeGodBeast_21625OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private Internal.IntList itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_DecomposeGodBeast_21625 DEFAULT_INSTANCE = new C2S_DecomposeGodBeast_21625();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DecomposeGodBeast_21625> PARSER = new AbstractParser<C2S_DecomposeGodBeast_21625>() {
         public C2S_DecomposeGodBeast_21625 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DecomposeGodBeast_21625(input, extensionRegistry);
         }
      };

      private C2S_DecomposeGodBeast_21625(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DecomposeGodBeast_21625() {
         this.memoizedIsInitialized = -1;
         this.itemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DecomposeGodBeast_21625();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DecomposeGodBeast_21625(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.itemCode_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.itemCode_.addInt(input.readInt32());
                        break;
                     case 18:
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DecomposeGodBeast_21625.class, Builder.class);
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
            output.writeInt32(2, this.itemCode_.getInt(i));
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
         } else if (!(obj instanceof C2S_DecomposeGodBeast_21625)) {
            return super.equals(obj);
         } else {
            C2S_DecomposeGodBeast_21625 other = (C2S_DecomposeGodBeast_21625)obj;
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
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DecomposeGodBeast_21625)PARSER.parseFrom(data);
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DecomposeGodBeast_21625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DecomposeGodBeast_21625)PARSER.parseFrom(data);
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DecomposeGodBeast_21625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DecomposeGodBeast_21625)PARSER.parseFrom(data);
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DecomposeGodBeast_21625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(InputStream input) throws IOException {
         return (C2S_DecomposeGodBeast_21625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DecomposeGodBeast_21625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DecomposeGodBeast_21625 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DecomposeGodBeast_21625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DecomposeGodBeast_21625 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DecomposeGodBeast_21625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DecomposeGodBeast_21625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DecomposeGodBeast_21625 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DecomposeGodBeast_21625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DecomposeGodBeast_21625 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DecomposeGodBeast_21625 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DecomposeGodBeast_21625> parser() {
         return PARSER;
      }

      public Parser<C2S_DecomposeGodBeast_21625> getParserForType() {
         return PARSER;
      }

      public C2S_DecomposeGodBeast_21625 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DecomposeGodBeast_21625OrBuilder {
         private int bitField0_;
         private Internal.IntList itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DecomposeGodBeast_21625.class, Builder.class);
         }

         private Builder() {
            this.itemCode_ = GodBeastMsg.C2S_DecomposeGodBeast_21625.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCode_ = GodBeastMsg.C2S_DecomposeGodBeast_21625.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_DecomposeGodBeast_21625.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = GodBeastMsg.C2S_DecomposeGodBeast_21625.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_DecomposeGodBeast_21625_descriptor;
         }

         public C2S_DecomposeGodBeast_21625 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_DecomposeGodBeast_21625.getDefaultInstance();
         }

         public C2S_DecomposeGodBeast_21625 build() {
            C2S_DecomposeGodBeast_21625 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DecomposeGodBeast_21625 buildPartial() {
            C2S_DecomposeGodBeast_21625 result = new C2S_DecomposeGodBeast_21625(this);
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
            if (other instanceof C2S_DecomposeGodBeast_21625) {
               return this.mergeFrom((C2S_DecomposeGodBeast_21625)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DecomposeGodBeast_21625 other) {
            if (other == GodBeastMsg.C2S_DecomposeGodBeast_21625.getDefaultInstance()) {
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
            C2S_DecomposeGodBeast_21625 parsedMessage = null;

            try {
               parsedMessage = (C2S_DecomposeGodBeast_21625)GodBeastMsg.C2S_DecomposeGodBeast_21625.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DecomposeGodBeast_21625)e.getUnfinishedMessage();
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
               this.itemCode_ = GodBeastMsg.C2S_DecomposeGodBeast_21625.mutableCopy(this.itemCode_);
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
            this.itemCode_ = GodBeastMsg.C2S_DecomposeGodBeast_21625.emptyIntList();
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

   public static final class S2C_DecomposeGodBeast_21626 extends GeneratedMessageV3 implements S2C_DecomposeGodBeast_21626OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_DecomposeGodBeast_21626 DEFAULT_INSTANCE = new S2C_DecomposeGodBeast_21626();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DecomposeGodBeast_21626> PARSER = new AbstractParser<S2C_DecomposeGodBeast_21626>() {
         public S2C_DecomposeGodBeast_21626 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DecomposeGodBeast_21626(input, extensionRegistry);
         }
      };

      private S2C_DecomposeGodBeast_21626(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DecomposeGodBeast_21626() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DecomposeGodBeast_21626();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DecomposeGodBeast_21626(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DecomposeGodBeast_21626.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DecomposeGodBeast_21626)) {
            return super.equals(obj);
         } else {
            S2C_DecomposeGodBeast_21626 other = (S2C_DecomposeGodBeast_21626)obj;
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

      public static S2C_DecomposeGodBeast_21626 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DecomposeGodBeast_21626)PARSER.parseFrom(data);
      }

      public static S2C_DecomposeGodBeast_21626 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DecomposeGodBeast_21626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DecomposeGodBeast_21626 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DecomposeGodBeast_21626)PARSER.parseFrom(data);
      }

      public static S2C_DecomposeGodBeast_21626 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DecomposeGodBeast_21626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DecomposeGodBeast_21626 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DecomposeGodBeast_21626)PARSER.parseFrom(data);
      }

      public static S2C_DecomposeGodBeast_21626 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DecomposeGodBeast_21626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DecomposeGodBeast_21626 parseFrom(InputStream input) throws IOException {
         return (S2C_DecomposeGodBeast_21626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DecomposeGodBeast_21626 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DecomposeGodBeast_21626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DecomposeGodBeast_21626 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DecomposeGodBeast_21626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DecomposeGodBeast_21626 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DecomposeGodBeast_21626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DecomposeGodBeast_21626 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DecomposeGodBeast_21626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DecomposeGodBeast_21626 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DecomposeGodBeast_21626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DecomposeGodBeast_21626 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DecomposeGodBeast_21626 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DecomposeGodBeast_21626> parser() {
         return PARSER;
      }

      public Parser<S2C_DecomposeGodBeast_21626> getParserForType() {
         return PARSER;
      }

      public S2C_DecomposeGodBeast_21626 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DecomposeGodBeast_21626OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DecomposeGodBeast_21626.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_DecomposeGodBeast_21626.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_DecomposeGodBeast_21626_descriptor;
         }

         public S2C_DecomposeGodBeast_21626 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_DecomposeGodBeast_21626.getDefaultInstance();
         }

         public S2C_DecomposeGodBeast_21626 build() {
            S2C_DecomposeGodBeast_21626 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DecomposeGodBeast_21626 buildPartial() {
            S2C_DecomposeGodBeast_21626 result = new S2C_DecomposeGodBeast_21626(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_DecomposeGodBeast_21626) {
               return this.mergeFrom((S2C_DecomposeGodBeast_21626)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DecomposeGodBeast_21626 other) {
            if (other == GodBeastMsg.S2C_DecomposeGodBeast_21626.getDefaultInstance()) {
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
            S2C_DecomposeGodBeast_21626 parsedMessage = null;

            try {
               parsedMessage = (S2C_DecomposeGodBeast_21626)GodBeastMsg.S2C_DecomposeGodBeast_21626.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DecomposeGodBeast_21626)e.getUnfinishedMessage();
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

   public static final class C2S_InheritGodBeast_21627 extends GeneratedMessageV3 implements C2S_InheritGodBeast_21627OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int COSTITEMCODE_FIELD_NUMBER = 3;
      private int costItemCode_;
      public static final int DEVELOP_FIELD_NUMBER = 4;
      private boolean develop_;
      public static final int APTITUDE_FIELD_NUMBER = 5;
      private boolean aptitude_;
      private byte memoizedIsInitialized;
      private static final C2S_InheritGodBeast_21627 DEFAULT_INSTANCE = new C2S_InheritGodBeast_21627();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_InheritGodBeast_21627> PARSER = new AbstractParser<C2S_InheritGodBeast_21627>() {
         public C2S_InheritGodBeast_21627 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_InheritGodBeast_21627(input, extensionRegistry);
         }
      };

      private C2S_InheritGodBeast_21627(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_InheritGodBeast_21627() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_InheritGodBeast_21627();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_InheritGodBeast_21627(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 4;
                        this.costItemCode_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.develop_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.aptitude_ = input.readBool();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_InheritGodBeast_21627.class, Builder.class);
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

      public boolean hasCostItemCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCostItemCode() {
         return this.costItemCode_;
      }

      public boolean hasDevelop() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getDevelop() {
         return this.develop_;
      }

      public boolean hasAptitude() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getAptitude() {
         return this.aptitude_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCostItemCode()) {
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
            output.writeInt32(3, this.costItemCode_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(4, this.develop_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.aptitude_);
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
               size += CodedOutputStream.computeInt32Size(3, this.costItemCode_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.develop_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.aptitude_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_InheritGodBeast_21627)) {
            return super.equals(obj);
         } else {
            C2S_InheritGodBeast_21627 other = (C2S_InheritGodBeast_21627)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasCostItemCode() != other.hasCostItemCode()) {
               return false;
            } else if (this.hasCostItemCode() && this.getCostItemCode() != other.getCostItemCode()) {
               return false;
            } else if (this.hasDevelop() != other.hasDevelop()) {
               return false;
            } else if (this.hasDevelop() && this.getDevelop() != other.getDevelop()) {
               return false;
            } else if (this.hasAptitude() != other.hasAptitude()) {
               return false;
            } else if (this.hasAptitude() && this.getAptitude() != other.getAptitude()) {
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

            if (this.hasCostItemCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCostItemCode();
            }

            if (this.hasDevelop()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getDevelop());
            }

            if (this.hasAptitude()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getAptitude());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_InheritGodBeast_21627 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_InheritGodBeast_21627)PARSER.parseFrom(data);
      }

      public static C2S_InheritGodBeast_21627 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_InheritGodBeast_21627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_InheritGodBeast_21627 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_InheritGodBeast_21627)PARSER.parseFrom(data);
      }

      public static C2S_InheritGodBeast_21627 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_InheritGodBeast_21627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_InheritGodBeast_21627 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_InheritGodBeast_21627)PARSER.parseFrom(data);
      }

      public static C2S_InheritGodBeast_21627 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_InheritGodBeast_21627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_InheritGodBeast_21627 parseFrom(InputStream input) throws IOException {
         return (C2S_InheritGodBeast_21627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_InheritGodBeast_21627 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_InheritGodBeast_21627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_InheritGodBeast_21627 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_InheritGodBeast_21627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_InheritGodBeast_21627 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_InheritGodBeast_21627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_InheritGodBeast_21627 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_InheritGodBeast_21627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_InheritGodBeast_21627 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_InheritGodBeast_21627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_InheritGodBeast_21627 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_InheritGodBeast_21627 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_InheritGodBeast_21627> parser() {
         return PARSER;
      }

      public Parser<C2S_InheritGodBeast_21627> getParserForType() {
         return PARSER;
      }

      public C2S_InheritGodBeast_21627 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_InheritGodBeast_21627OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;
         private int costItemCode_;
         private boolean develop_;
         private boolean aptitude_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_InheritGodBeast_21627.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_InheritGodBeast_21627.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.costItemCode_ = 0;
            this.bitField0_ &= -5;
            this.develop_ = false;
            this.bitField0_ &= -9;
            this.aptitude_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_InheritGodBeast_21627_descriptor;
         }

         public C2S_InheritGodBeast_21627 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_InheritGodBeast_21627.getDefaultInstance();
         }

         public C2S_InheritGodBeast_21627 build() {
            C2S_InheritGodBeast_21627 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_InheritGodBeast_21627 buildPartial() {
            C2S_InheritGodBeast_21627 result = new C2S_InheritGodBeast_21627(this);
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
               result.costItemCode_ = this.costItemCode_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.develop_ = this.develop_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.aptitude_ = this.aptitude_;
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
            if (other instanceof C2S_InheritGodBeast_21627) {
               return this.mergeFrom((C2S_InheritGodBeast_21627)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_InheritGodBeast_21627 other) {
            if (other == GodBeastMsg.C2S_InheritGodBeast_21627.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasCostItemCode()) {
                  this.setCostItemCode(other.getCostItemCode());
               }

               if (other.hasDevelop()) {
                  this.setDevelop(other.getDevelop());
               }

               if (other.hasAptitude()) {
                  this.setAptitude(other.getAptitude());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCostItemCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_InheritGodBeast_21627 parsedMessage = null;

            try {
               parsedMessage = (C2S_InheritGodBeast_21627)GodBeastMsg.C2S_InheritGodBeast_21627.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_InheritGodBeast_21627)e.getUnfinishedMessage();
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

         public boolean hasCostItemCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCostItemCode() {
            return this.costItemCode_;
         }

         public Builder setCostItemCode(int value) {
            this.bitField0_ |= 4;
            this.costItemCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCostItemCode() {
            this.bitField0_ &= -5;
            this.costItemCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDevelop() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getDevelop() {
            return this.develop_;
         }

         public Builder setDevelop(boolean value) {
            this.bitField0_ |= 8;
            this.develop_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDevelop() {
            this.bitField0_ &= -9;
            this.develop_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasAptitude() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getAptitude() {
            return this.aptitude_;
         }

         public Builder setAptitude(boolean value) {
            this.bitField0_ |= 16;
            this.aptitude_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAptitude() {
            this.bitField0_ &= -17;
            this.aptitude_ = false;
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

   public static final class S2C_InheritGodBeast_21628 extends GeneratedMessageV3 implements S2C_InheritGodBeast_21628OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_InheritGodBeast_21628 DEFAULT_INSTANCE = new S2C_InheritGodBeast_21628();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_InheritGodBeast_21628> PARSER = new AbstractParser<S2C_InheritGodBeast_21628>() {
         public S2C_InheritGodBeast_21628 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_InheritGodBeast_21628(input, extensionRegistry);
         }
      };

      private S2C_InheritGodBeast_21628(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_InheritGodBeast_21628() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_InheritGodBeast_21628();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_InheritGodBeast_21628(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_InheritGodBeast_21628.class, Builder.class);
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
         } else if (!(obj instanceof S2C_InheritGodBeast_21628)) {
            return super.equals(obj);
         } else {
            S2C_InheritGodBeast_21628 other = (S2C_InheritGodBeast_21628)obj;
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

      public static S2C_InheritGodBeast_21628 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_InheritGodBeast_21628)PARSER.parseFrom(data);
      }

      public static S2C_InheritGodBeast_21628 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_InheritGodBeast_21628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_InheritGodBeast_21628 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_InheritGodBeast_21628)PARSER.parseFrom(data);
      }

      public static S2C_InheritGodBeast_21628 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_InheritGodBeast_21628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_InheritGodBeast_21628 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_InheritGodBeast_21628)PARSER.parseFrom(data);
      }

      public static S2C_InheritGodBeast_21628 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_InheritGodBeast_21628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_InheritGodBeast_21628 parseFrom(InputStream input) throws IOException {
         return (S2C_InheritGodBeast_21628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_InheritGodBeast_21628 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_InheritGodBeast_21628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_InheritGodBeast_21628 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_InheritGodBeast_21628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_InheritGodBeast_21628 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_InheritGodBeast_21628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_InheritGodBeast_21628 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_InheritGodBeast_21628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_InheritGodBeast_21628 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_InheritGodBeast_21628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_InheritGodBeast_21628 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_InheritGodBeast_21628 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_InheritGodBeast_21628> parser() {
         return PARSER;
      }

      public Parser<S2C_InheritGodBeast_21628> getParserForType() {
         return PARSER;
      }

      public S2C_InheritGodBeast_21628 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_InheritGodBeast_21628OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_InheritGodBeast_21628.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_InheritGodBeast_21628.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_InheritGodBeast_21628_descriptor;
         }

         public S2C_InheritGodBeast_21628 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_InheritGodBeast_21628.getDefaultInstance();
         }

         public S2C_InheritGodBeast_21628 build() {
            S2C_InheritGodBeast_21628 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_InheritGodBeast_21628 buildPartial() {
            S2C_InheritGodBeast_21628 result = new S2C_InheritGodBeast_21628(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_InheritGodBeast_21628) {
               return this.mergeFrom((S2C_InheritGodBeast_21628)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_InheritGodBeast_21628 other) {
            if (other == GodBeastMsg.S2C_InheritGodBeast_21628.getDefaultInstance()) {
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
            S2C_InheritGodBeast_21628 parsedMessage = null;

            try {
               parsedMessage = (S2C_InheritGodBeast_21628)GodBeastMsg.S2C_InheritGodBeast_21628.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_InheritGodBeast_21628)e.getUnfinishedMessage();
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

   public static final class GodBeastTaskInfo extends GeneratedMessageV3 implements GodBeastTaskInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASK_FIELD_NUMBER = 1;
      private CommonMsg.Task task_;
      public static final int COMPLETENUM_FIELD_NUMBER = 2;
      private int completeNum_;
      public static final int TASKSCORE_FIELD_NUMBER = 3;
      private int taskScore_;
      private byte memoizedIsInitialized;
      private static final GodBeastTaskInfo DEFAULT_INSTANCE = new GodBeastTaskInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<GodBeastTaskInfo> PARSER = new AbstractParser<GodBeastTaskInfo>() {
         public GodBeastTaskInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new GodBeastTaskInfo(input, extensionRegistry);
         }
      };

      private GodBeastTaskInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private GodBeastTaskInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new GodBeastTaskInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private GodBeastTaskInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.Task.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.task_.toBuilder();
                        }

                        this.task_ = (CommonMsg.Task)input.readMessage(CommonMsg.Task.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.task_);
                           this.task_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.completeNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.taskScore_ = input.readInt32();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GodBeastTaskInfo.class, Builder.class);
      }

      public boolean hasTask() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.Task getTask() {
         return this.task_ == null ? CommonMsg.Task.getDefaultInstance() : this.task_;
      }

      public CommonMsg.TaskOrBuilder getTaskOrBuilder() {
         return this.task_ == null ? CommonMsg.Task.getDefaultInstance() : this.task_;
      }

      public boolean hasCompleteNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCompleteNum() {
         return this.completeNum_;
      }

      public boolean hasTaskScore() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTaskScore() {
         return this.taskScore_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTask()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCompleteNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTaskScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getTask().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getTask());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.completeNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.taskScore_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getTask());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.completeNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.taskScore_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof GodBeastTaskInfo)) {
            return super.equals(obj);
         } else {
            GodBeastTaskInfo other = (GodBeastTaskInfo)obj;
            if (this.hasTask() != other.hasTask()) {
               return false;
            } else if (this.hasTask() && !this.getTask().equals(other.getTask())) {
               return false;
            } else if (this.hasCompleteNum() != other.hasCompleteNum()) {
               return false;
            } else if (this.hasCompleteNum() && this.getCompleteNum() != other.getCompleteNum()) {
               return false;
            } else if (this.hasTaskScore() != other.hasTaskScore()) {
               return false;
            } else if (this.hasTaskScore() && this.getTaskScore() != other.getTaskScore()) {
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
            if (this.hasTask()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTask().hashCode();
            }

            if (this.hasCompleteNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCompleteNum();
            }

            if (this.hasTaskScore()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTaskScore();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static GodBeastTaskInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (GodBeastTaskInfo)PARSER.parseFrom(data);
      }

      public static GodBeastTaskInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GodBeastTaskInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GodBeastTaskInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (GodBeastTaskInfo)PARSER.parseFrom(data);
      }

      public static GodBeastTaskInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GodBeastTaskInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GodBeastTaskInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (GodBeastTaskInfo)PARSER.parseFrom(data);
      }

      public static GodBeastTaskInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (GodBeastTaskInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static GodBeastTaskInfo parseFrom(InputStream input) throws IOException {
         return (GodBeastTaskInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GodBeastTaskInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GodBeastTaskInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static GodBeastTaskInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (GodBeastTaskInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static GodBeastTaskInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GodBeastTaskInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static GodBeastTaskInfo parseFrom(CodedInputStream input) throws IOException {
         return (GodBeastTaskInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static GodBeastTaskInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (GodBeastTaskInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(GodBeastTaskInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static GodBeastTaskInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<GodBeastTaskInfo> parser() {
         return PARSER;
      }

      public Parser<GodBeastTaskInfo> getParserForType() {
         return PARSER;
      }

      public GodBeastTaskInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GodBeastTaskInfoOrBuilder {
         private int bitField0_;
         private CommonMsg.Task task_;
         private SingleFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskBuilder_;
         private int completeNum_;
         private int taskScore_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GodBeastTaskInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.GodBeastTaskInfo.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = null;
            } else {
               this.taskBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.completeNum_ = 0;
            this.bitField0_ &= -3;
            this.taskScore_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_GodBeastTaskInfo_descriptor;
         }

         public GodBeastTaskInfo getDefaultInstanceForType() {
            return GodBeastMsg.GodBeastTaskInfo.getDefaultInstance();
         }

         public GodBeastTaskInfo build() {
            GodBeastTaskInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public GodBeastTaskInfo buildPartial() {
            GodBeastTaskInfo result = new GodBeastTaskInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.taskBuilder_ == null) {
                  result.task_ = this.task_;
               } else {
                  result.task_ = (CommonMsg.Task)this.taskBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.completeNum_ = this.completeNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.taskScore_ = this.taskScore_;
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
            if (other instanceof GodBeastTaskInfo) {
               return this.mergeFrom((GodBeastTaskInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(GodBeastTaskInfo other) {
            if (other == GodBeastMsg.GodBeastTaskInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTask()) {
                  this.mergeTask(other.getTask());
               }

               if (other.hasCompleteNum()) {
                  this.setCompleteNum(other.getCompleteNum());
               }

               if (other.hasTaskScore()) {
                  this.setTaskScore(other.getTaskScore());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTask()) {
               return false;
            } else if (!this.hasCompleteNum()) {
               return false;
            } else if (!this.hasTaskScore()) {
               return false;
            } else {
               return this.getTask().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            GodBeastTaskInfo parsedMessage = null;

            try {
               parsedMessage = (GodBeastTaskInfo)GodBeastMsg.GodBeastTaskInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (GodBeastTaskInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTask() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.Task getTask() {
            if (this.taskBuilder_ == null) {
               return this.task_ == null ? CommonMsg.Task.getDefaultInstance() : this.task_;
            } else {
               return (CommonMsg.Task)this.taskBuilder_.getMessage();
            }
         }

         public Builder setTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.task_ = value;
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setTask(CommonMsg.Task.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.task_ = builderForValue.build();
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeTask(CommonMsg.Task value) {
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.task_ != null && this.task_ != CommonMsg.Task.getDefaultInstance()) {
                  this.task_ = CommonMsg.Task.newBuilder(this.task_).mergeFrom(value).buildPartial();
               } else {
                  this.task_ = value;
               }

               this.onChanged();
            } else {
               this.taskBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = null;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.Task.Builder getTaskBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.Task.Builder)this.getTaskFieldBuilder().getBuilder();
         }

         public CommonMsg.TaskOrBuilder getTaskOrBuilder() {
            if (this.taskBuilder_ != null) {
               return (CommonMsg.TaskOrBuilder)this.taskBuilder_.getMessageOrBuilder();
            } else {
               return this.task_ == null ? CommonMsg.Task.getDefaultInstance() : this.task_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new SingleFieldBuilderV3(this.getTask(), this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public boolean hasCompleteNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCompleteNum() {
            return this.completeNum_;
         }

         public Builder setCompleteNum(int value) {
            this.bitField0_ |= 2;
            this.completeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCompleteNum() {
            this.bitField0_ &= -3;
            this.completeNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTaskScore() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTaskScore() {
            return this.taskScore_;
         }

         public Builder setTaskScore(int value) {
            this.bitField0_ |= 4;
            this.taskScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskScore() {
            this.bitField0_ &= -5;
            this.taskScore_ = 0;
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

   public static final class C2S_TaskList_21629 extends GeneratedMessageV3 implements C2S_TaskList_21629OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TaskList_21629 DEFAULT_INSTANCE = new C2S_TaskList_21629();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TaskList_21629> PARSER = new AbstractParser<C2S_TaskList_21629>() {
         public C2S_TaskList_21629 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TaskList_21629(input, extensionRegistry);
         }
      };

      private C2S_TaskList_21629(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TaskList_21629() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TaskList_21629();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TaskList_21629(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_21629.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TaskList_21629)) {
            return super.equals(obj);
         } else {
            C2S_TaskList_21629 other = (C2S_TaskList_21629)obj;
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

      public static C2S_TaskList_21629 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_21629)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_21629 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_21629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_21629 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_21629)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_21629 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_21629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_21629 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TaskList_21629)PARSER.parseFrom(data);
      }

      public static C2S_TaskList_21629 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TaskList_21629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TaskList_21629 parseFrom(InputStream input) throws IOException {
         return (C2S_TaskList_21629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_21629 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_21629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_21629 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TaskList_21629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TaskList_21629 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_21629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TaskList_21629 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TaskList_21629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TaskList_21629 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TaskList_21629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TaskList_21629 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TaskList_21629 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TaskList_21629> parser() {
         return PARSER;
      }

      public Parser<C2S_TaskList_21629> getParserForType() {
         return PARSER;
      }

      public C2S_TaskList_21629 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TaskList_21629OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TaskList_21629.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_TaskList_21629.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_TaskList_21629_descriptor;
         }

         public C2S_TaskList_21629 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_TaskList_21629.getDefaultInstance();
         }

         public C2S_TaskList_21629 build() {
            C2S_TaskList_21629 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TaskList_21629 buildPartial() {
            C2S_TaskList_21629 result = new C2S_TaskList_21629(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TaskList_21629) {
               return this.mergeFrom((C2S_TaskList_21629)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TaskList_21629 other) {
            if (other == GodBeastMsg.C2S_TaskList_21629.getDefaultInstance()) {
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
            C2S_TaskList_21629 parsedMessage = null;

            try {
               parsedMessage = (C2S_TaskList_21629)GodBeastMsg.C2S_TaskList_21629.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TaskList_21629)e.getUnfinishedMessage();
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

   public static final class S2C_TaskList_21630 extends GeneratedMessageV3 implements S2C_TaskList_21630OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GODBEASTTASKINFO_FIELD_NUMBER = 1;
      private List<GodBeastTaskInfo> godBeastTaskInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskList_21630 DEFAULT_INSTANCE = new S2C_TaskList_21630();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskList_21630> PARSER = new AbstractParser<S2C_TaskList_21630>() {
         public S2C_TaskList_21630 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskList_21630(input, extensionRegistry);
         }
      };

      private S2C_TaskList_21630(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskList_21630() {
         this.memoizedIsInitialized = -1;
         this.godBeastTaskInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskList_21630();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskList_21630(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.godBeastTaskInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.godBeastTaskInfo_.add(input.readMessage(GodBeastMsg.GodBeastTaskInfo.PARSER, extensionRegistry));
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
                  this.godBeastTaskInfo_ = Collections.unmodifiableList(this.godBeastTaskInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskList_21630.class, Builder.class);
      }

      public List<GodBeastTaskInfo> getGodBeastTaskInfoList() {
         return this.godBeastTaskInfo_;
      }

      public List<? extends GodBeastTaskInfoOrBuilder> getGodBeastTaskInfoOrBuilderList() {
         return this.godBeastTaskInfo_;
      }

      public int getGodBeastTaskInfoCount() {
         return this.godBeastTaskInfo_.size();
      }

      public GodBeastTaskInfo getGodBeastTaskInfo(int index) {
         return (GodBeastTaskInfo)this.godBeastTaskInfo_.get(index);
      }

      public GodBeastTaskInfoOrBuilder getGodBeastTaskInfoOrBuilder(int index) {
         return (GodBeastTaskInfoOrBuilder)this.godBeastTaskInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGodBeastTaskInfoCount(); ++i) {
               if (!this.getGodBeastTaskInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.godBeastTaskInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.godBeastTaskInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.godBeastTaskInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.godBeastTaskInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskList_21630)) {
            return super.equals(obj);
         } else {
            S2C_TaskList_21630 other = (S2C_TaskList_21630)obj;
            if (!this.getGodBeastTaskInfoList().equals(other.getGodBeastTaskInfoList())) {
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
            if (this.getGodBeastTaskInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGodBeastTaskInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskList_21630 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_21630)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_21630 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_21630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_21630 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_21630)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_21630 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_21630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_21630 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskList_21630)PARSER.parseFrom(data);
      }

      public static S2C_TaskList_21630 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskList_21630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskList_21630 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskList_21630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskList_21630 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_21630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskList_21630 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskList_21630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskList_21630 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_21630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskList_21630 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskList_21630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskList_21630 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskList_21630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskList_21630 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskList_21630 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskList_21630> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskList_21630> getParserForType() {
         return PARSER;
      }

      public S2C_TaskList_21630 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskList_21630OrBuilder {
         private int bitField0_;
         private List<GodBeastTaskInfo> godBeastTaskInfo_;
         private RepeatedFieldBuilderV3<GodBeastTaskInfo, GodBeastTaskInfo.Builder, GodBeastTaskInfoOrBuilder> godBeastTaskInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskList_21630.class, Builder.class);
         }

         private Builder() {
            this.godBeastTaskInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.godBeastTaskInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_TaskList_21630.alwaysUseFieldBuilders) {
               this.getGodBeastTaskInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.godBeastTaskInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.godBeastTaskInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskList_21630_descriptor;
         }

         public S2C_TaskList_21630 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_TaskList_21630.getDefaultInstance();
         }

         public S2C_TaskList_21630 build() {
            S2C_TaskList_21630 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskList_21630 buildPartial() {
            S2C_TaskList_21630 result = new S2C_TaskList_21630(this);
            int from_bitField0_ = this.bitField0_;
            if (this.godBeastTaskInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.godBeastTaskInfo_ = Collections.unmodifiableList(this.godBeastTaskInfo_);
                  this.bitField0_ &= -2;
               }

               result.godBeastTaskInfo_ = this.godBeastTaskInfo_;
            } else {
               result.godBeastTaskInfo_ = this.godBeastTaskInfoBuilder_.build();
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
            if (other instanceof S2C_TaskList_21630) {
               return this.mergeFrom((S2C_TaskList_21630)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskList_21630 other) {
            if (other == GodBeastMsg.S2C_TaskList_21630.getDefaultInstance()) {
               return this;
            } else {
               if (this.godBeastTaskInfoBuilder_ == null) {
                  if (!other.godBeastTaskInfo_.isEmpty()) {
                     if (this.godBeastTaskInfo_.isEmpty()) {
                        this.godBeastTaskInfo_ = other.godBeastTaskInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGodBeastTaskInfoIsMutable();
                        this.godBeastTaskInfo_.addAll(other.godBeastTaskInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.godBeastTaskInfo_.isEmpty()) {
                  if (this.godBeastTaskInfoBuilder_.isEmpty()) {
                     this.godBeastTaskInfoBuilder_.dispose();
                     this.godBeastTaskInfoBuilder_ = null;
                     this.godBeastTaskInfo_ = other.godBeastTaskInfo_;
                     this.bitField0_ &= -2;
                     this.godBeastTaskInfoBuilder_ = GodBeastMsg.S2C_TaskList_21630.alwaysUseFieldBuilders ? this.getGodBeastTaskInfoFieldBuilder() : null;
                  } else {
                     this.godBeastTaskInfoBuilder_.addAllMessages(other.godBeastTaskInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGodBeastTaskInfoCount(); ++i) {
               if (!this.getGodBeastTaskInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskList_21630 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskList_21630)GodBeastMsg.S2C_TaskList_21630.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskList_21630)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGodBeastTaskInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.godBeastTaskInfo_ = new ArrayList(this.godBeastTaskInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<GodBeastTaskInfo> getGodBeastTaskInfoList() {
            return this.godBeastTaskInfoBuilder_ == null ? Collections.unmodifiableList(this.godBeastTaskInfo_) : this.godBeastTaskInfoBuilder_.getMessageList();
         }

         public int getGodBeastTaskInfoCount() {
            return this.godBeastTaskInfoBuilder_ == null ? this.godBeastTaskInfo_.size() : this.godBeastTaskInfoBuilder_.getCount();
         }

         public GodBeastTaskInfo getGodBeastTaskInfo(int index) {
            return this.godBeastTaskInfoBuilder_ == null ? (GodBeastTaskInfo)this.godBeastTaskInfo_.get(index) : (GodBeastTaskInfo)this.godBeastTaskInfoBuilder_.getMessage(index);
         }

         public Builder setGodBeastTaskInfo(int index, GodBeastTaskInfo value) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGodBeastTaskInfoIsMutable();
               this.godBeastTaskInfo_.set(index, value);
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGodBeastTaskInfo(int index, GodBeastTaskInfo.Builder builderForValue) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.ensureGodBeastTaskInfoIsMutable();
               this.godBeastTaskInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGodBeastTaskInfo(GodBeastTaskInfo value) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGodBeastTaskInfoIsMutable();
               this.godBeastTaskInfo_.add(value);
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGodBeastTaskInfo(int index, GodBeastTaskInfo value) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGodBeastTaskInfoIsMutable();
               this.godBeastTaskInfo_.add(index, value);
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGodBeastTaskInfo(GodBeastTaskInfo.Builder builderForValue) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.ensureGodBeastTaskInfoIsMutable();
               this.godBeastTaskInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGodBeastTaskInfo(int index, GodBeastTaskInfo.Builder builderForValue) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.ensureGodBeastTaskInfoIsMutable();
               this.godBeastTaskInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGodBeastTaskInfo(Iterable<? extends GodBeastTaskInfo> values) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.ensureGodBeastTaskInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.godBeastTaskInfo_);
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGodBeastTaskInfo() {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.godBeastTaskInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeGodBeastTaskInfo(int index) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.ensureGodBeastTaskInfoIsMutable();
               this.godBeastTaskInfo_.remove(index);
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.remove(index);
            }

            return this;
         }

         public GodBeastTaskInfo.Builder getGodBeastTaskInfoBuilder(int index) {
            return (GodBeastTaskInfo.Builder)this.getGodBeastTaskInfoFieldBuilder().getBuilder(index);
         }

         public GodBeastTaskInfoOrBuilder getGodBeastTaskInfoOrBuilder(int index) {
            return this.godBeastTaskInfoBuilder_ == null ? (GodBeastTaskInfoOrBuilder)this.godBeastTaskInfo_.get(index) : (GodBeastTaskInfoOrBuilder)this.godBeastTaskInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends GodBeastTaskInfoOrBuilder> getGodBeastTaskInfoOrBuilderList() {
            return this.godBeastTaskInfoBuilder_ != null ? this.godBeastTaskInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.godBeastTaskInfo_);
         }

         public GodBeastTaskInfo.Builder addGodBeastTaskInfoBuilder() {
            return (GodBeastTaskInfo.Builder)this.getGodBeastTaskInfoFieldBuilder().addBuilder(GodBeastMsg.GodBeastTaskInfo.getDefaultInstance());
         }

         public GodBeastTaskInfo.Builder addGodBeastTaskInfoBuilder(int index) {
            return (GodBeastTaskInfo.Builder)this.getGodBeastTaskInfoFieldBuilder().addBuilder(index, GodBeastMsg.GodBeastTaskInfo.getDefaultInstance());
         }

         public List<GodBeastTaskInfo.Builder> getGodBeastTaskInfoBuilderList() {
            return this.getGodBeastTaskInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<GodBeastTaskInfo, GodBeastTaskInfo.Builder, GodBeastTaskInfoOrBuilder> getGodBeastTaskInfoFieldBuilder() {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.godBeastTaskInfoBuilder_ = new RepeatedFieldBuilderV3(this.godBeastTaskInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.godBeastTaskInfo_ = null;
            }

            return this.godBeastTaskInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_TaskNotice_21631 extends GeneratedMessageV3 implements S2C_TaskNotice_21631OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GODBEASTTASKINFO_FIELD_NUMBER = 1;
      private GodBeastTaskInfo godBeastTaskInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskNotice_21631 DEFAULT_INSTANCE = new S2C_TaskNotice_21631();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskNotice_21631> PARSER = new AbstractParser<S2C_TaskNotice_21631>() {
         public S2C_TaskNotice_21631 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskNotice_21631(input, extensionRegistry);
         }
      };

      private S2C_TaskNotice_21631(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskNotice_21631() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskNotice_21631();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskNotice_21631(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        GodBeastTaskInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.godBeastTaskInfo_.toBuilder();
                        }

                        this.godBeastTaskInfo_ = (GodBeastTaskInfo)input.readMessage(GodBeastMsg.GodBeastTaskInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.godBeastTaskInfo_);
                           this.godBeastTaskInfo_ = subBuilder.buildPartial();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotice_21631.class, Builder.class);
      }

      public boolean hasGodBeastTaskInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public GodBeastTaskInfo getGodBeastTaskInfo() {
         return this.godBeastTaskInfo_ == null ? GodBeastMsg.GodBeastTaskInfo.getDefaultInstance() : this.godBeastTaskInfo_;
      }

      public GodBeastTaskInfoOrBuilder getGodBeastTaskInfoOrBuilder() {
         return this.godBeastTaskInfo_ == null ? GodBeastMsg.GodBeastTaskInfo.getDefaultInstance() : this.godBeastTaskInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGodBeastTaskInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGodBeastTaskInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGodBeastTaskInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGodBeastTaskInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskNotice_21631)) {
            return super.equals(obj);
         } else {
            S2C_TaskNotice_21631 other = (S2C_TaskNotice_21631)obj;
            if (this.hasGodBeastTaskInfo() != other.hasGodBeastTaskInfo()) {
               return false;
            } else if (this.hasGodBeastTaskInfo() && !this.getGodBeastTaskInfo().equals(other.getGodBeastTaskInfo())) {
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
            if (this.hasGodBeastTaskInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGodBeastTaskInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskNotice_21631 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_21631)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotice_21631 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_21631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotice_21631 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_21631)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotice_21631 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_21631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotice_21631 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_21631)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotice_21631 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotice_21631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotice_21631 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskNotice_21631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotice_21631 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotice_21631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotice_21631 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskNotice_21631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskNotice_21631 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotice_21631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotice_21631 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskNotice_21631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotice_21631 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotice_21631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskNotice_21631 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskNotice_21631 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskNotice_21631> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskNotice_21631> getParserForType() {
         return PARSER;
      }

      public S2C_TaskNotice_21631 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskNotice_21631OrBuilder {
         private int bitField0_;
         private GodBeastTaskInfo godBeastTaskInfo_;
         private SingleFieldBuilderV3<GodBeastTaskInfo, GodBeastTaskInfo.Builder, GodBeastTaskInfoOrBuilder> godBeastTaskInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotice_21631.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_TaskNotice_21631.alwaysUseFieldBuilders) {
               this.getGodBeastTaskInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.godBeastTaskInfo_ = null;
            } else {
               this.godBeastTaskInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_TaskNotice_21631_descriptor;
         }

         public S2C_TaskNotice_21631 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_TaskNotice_21631.getDefaultInstance();
         }

         public S2C_TaskNotice_21631 build() {
            S2C_TaskNotice_21631 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskNotice_21631 buildPartial() {
            S2C_TaskNotice_21631 result = new S2C_TaskNotice_21631(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.godBeastTaskInfoBuilder_ == null) {
                  result.godBeastTaskInfo_ = this.godBeastTaskInfo_;
               } else {
                  result.godBeastTaskInfo_ = (GodBeastTaskInfo)this.godBeastTaskInfoBuilder_.build();
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
            if (other instanceof S2C_TaskNotice_21631) {
               return this.mergeFrom((S2C_TaskNotice_21631)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskNotice_21631 other) {
            if (other == GodBeastMsg.S2C_TaskNotice_21631.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGodBeastTaskInfo()) {
                  this.mergeGodBeastTaskInfo(other.getGodBeastTaskInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGodBeastTaskInfo()) {
               return false;
            } else {
               return this.getGodBeastTaskInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskNotice_21631 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskNotice_21631)GodBeastMsg.S2C_TaskNotice_21631.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskNotice_21631)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGodBeastTaskInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public GodBeastTaskInfo getGodBeastTaskInfo() {
            if (this.godBeastTaskInfoBuilder_ == null) {
               return this.godBeastTaskInfo_ == null ? GodBeastMsg.GodBeastTaskInfo.getDefaultInstance() : this.godBeastTaskInfo_;
            } else {
               return (GodBeastTaskInfo)this.godBeastTaskInfoBuilder_.getMessage();
            }
         }

         public Builder setGodBeastTaskInfo(GodBeastTaskInfo value) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.godBeastTaskInfo_ = value;
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGodBeastTaskInfo(GodBeastTaskInfo.Builder builderForValue) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.godBeastTaskInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGodBeastTaskInfo(GodBeastTaskInfo value) {
            if (this.godBeastTaskInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.godBeastTaskInfo_ != null && this.godBeastTaskInfo_ != GodBeastMsg.GodBeastTaskInfo.getDefaultInstance()) {
                  this.godBeastTaskInfo_ = GodBeastMsg.GodBeastTaskInfo.newBuilder(this.godBeastTaskInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.godBeastTaskInfo_ = value;
               }

               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGodBeastTaskInfo() {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.godBeastTaskInfo_ = null;
               this.onChanged();
            } else {
               this.godBeastTaskInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public GodBeastTaskInfo.Builder getGodBeastTaskInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (GodBeastTaskInfo.Builder)this.getGodBeastTaskInfoFieldBuilder().getBuilder();
         }

         public GodBeastTaskInfoOrBuilder getGodBeastTaskInfoOrBuilder() {
            if (this.godBeastTaskInfoBuilder_ != null) {
               return (GodBeastTaskInfoOrBuilder)this.godBeastTaskInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.godBeastTaskInfo_ == null ? GodBeastMsg.GodBeastTaskInfo.getDefaultInstance() : this.godBeastTaskInfo_;
            }
         }

         private SingleFieldBuilderV3<GodBeastTaskInfo, GodBeastTaskInfo.Builder, GodBeastTaskInfoOrBuilder> getGodBeastTaskInfoFieldBuilder() {
            if (this.godBeastTaskInfoBuilder_ == null) {
               this.godBeastTaskInfoBuilder_ = new SingleFieldBuilderV3(this.getGodBeastTaskInfo(), this.getParentForChildren(), this.isClean());
               this.godBeastTaskInfo_ = null;
            }

            return this.godBeastTaskInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RecScoreReward_21632 extends GeneratedMessageV3 implements C2S_RecScoreReward_21632OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_RecScoreReward_21632 DEFAULT_INSTANCE = new C2S_RecScoreReward_21632();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecScoreReward_21632> PARSER = new AbstractParser<C2S_RecScoreReward_21632>() {
         public C2S_RecScoreReward_21632 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecScoreReward_21632(input, extensionRegistry);
         }
      };

      private C2S_RecScoreReward_21632(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecScoreReward_21632() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecScoreReward_21632();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecScoreReward_21632(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecScoreReward_21632.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RecScoreReward_21632)) {
            return super.equals(obj);
         } else {
            C2S_RecScoreReward_21632 other = (C2S_RecScoreReward_21632)obj;
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

      public static C2S_RecScoreReward_21632 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_21632)PARSER.parseFrom(data);
      }

      public static C2S_RecScoreReward_21632 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_21632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecScoreReward_21632 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_21632)PARSER.parseFrom(data);
      }

      public static C2S_RecScoreReward_21632 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_21632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecScoreReward_21632 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_21632)PARSER.parseFrom(data);
      }

      public static C2S_RecScoreReward_21632 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecScoreReward_21632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecScoreReward_21632 parseFrom(InputStream input) throws IOException {
         return (C2S_RecScoreReward_21632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecScoreReward_21632 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecScoreReward_21632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecScoreReward_21632 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecScoreReward_21632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecScoreReward_21632 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecScoreReward_21632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecScoreReward_21632 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecScoreReward_21632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecScoreReward_21632 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecScoreReward_21632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecScoreReward_21632 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecScoreReward_21632 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecScoreReward_21632> parser() {
         return PARSER;
      }

      public Parser<C2S_RecScoreReward_21632> getParserForType() {
         return PARSER;
      }

      public C2S_RecScoreReward_21632 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecScoreReward_21632OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecScoreReward_21632.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_RecScoreReward_21632.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_RecScoreReward_21632_descriptor;
         }

         public C2S_RecScoreReward_21632 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_RecScoreReward_21632.getDefaultInstance();
         }

         public C2S_RecScoreReward_21632 build() {
            C2S_RecScoreReward_21632 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecScoreReward_21632 buildPartial() {
            C2S_RecScoreReward_21632 result = new C2S_RecScoreReward_21632(this);
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
            if (other instanceof C2S_RecScoreReward_21632) {
               return this.mergeFrom((C2S_RecScoreReward_21632)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecScoreReward_21632 other) {
            if (other == GodBeastMsg.C2S_RecScoreReward_21632.getDefaultInstance()) {
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
            C2S_RecScoreReward_21632 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecScoreReward_21632)GodBeastMsg.C2S_RecScoreReward_21632.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecScoreReward_21632)e.getUnfinishedMessage();
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

   public static final class S2C_RecScoreReward_21633 extends GeneratedMessageV3 implements S2C_RecScoreReward_21633OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECID_FIELD_NUMBER = 1;
      private Internal.IntList recId_;
      private byte memoizedIsInitialized;
      private static final S2C_RecScoreReward_21633 DEFAULT_INSTANCE = new S2C_RecScoreReward_21633();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecScoreReward_21633> PARSER = new AbstractParser<S2C_RecScoreReward_21633>() {
         public S2C_RecScoreReward_21633 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecScoreReward_21633(input, extensionRegistry);
         }
      };

      private S2C_RecScoreReward_21633(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecScoreReward_21633() {
         this.memoizedIsInitialized = -1;
         this.recId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecScoreReward_21633();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecScoreReward_21633(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.recId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.recId_.addInt(input.readInt32());
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
                  this.recId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecScoreReward_21633.class, Builder.class);
      }

      public List<Integer> getRecIdList() {
         return this.recId_;
      }

      public int getRecIdCount() {
         return this.recId_.size();
      }

      public int getRecId(int index) {
         return this.recId_.getInt(index);
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
         for(int i = 0; i < this.recId_.size(); ++i) {
            output.writeInt32(1, this.recId_.getInt(i));
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

            for(int i = 0; i < this.recId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecScoreReward_21633)) {
            return super.equals(obj);
         } else {
            S2C_RecScoreReward_21633 other = (S2C_RecScoreReward_21633)obj;
            if (!this.getRecIdList().equals(other.getRecIdList())) {
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
            if (this.getRecIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecScoreReward_21633 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_21633)PARSER.parseFrom(data);
      }

      public static S2C_RecScoreReward_21633 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_21633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecScoreReward_21633 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_21633)PARSER.parseFrom(data);
      }

      public static S2C_RecScoreReward_21633 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_21633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecScoreReward_21633 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_21633)PARSER.parseFrom(data);
      }

      public static S2C_RecScoreReward_21633 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecScoreReward_21633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecScoreReward_21633 parseFrom(InputStream input) throws IOException {
         return (S2C_RecScoreReward_21633)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecScoreReward_21633 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecScoreReward_21633)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecScoreReward_21633 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecScoreReward_21633)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecScoreReward_21633 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecScoreReward_21633)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecScoreReward_21633 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecScoreReward_21633)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecScoreReward_21633 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecScoreReward_21633)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecScoreReward_21633 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecScoreReward_21633 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecScoreReward_21633> parser() {
         return PARSER;
      }

      public Parser<S2C_RecScoreReward_21633> getParserForType() {
         return PARSER;
      }

      public S2C_RecScoreReward_21633 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecScoreReward_21633OrBuilder {
         private int bitField0_;
         private Internal.IntList recId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecScoreReward_21633.class, Builder.class);
         }

         private Builder() {
            this.recId_ = GodBeastMsg.S2C_RecScoreReward_21633.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recId_ = GodBeastMsg.S2C_RecScoreReward_21633.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_RecScoreReward_21633.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recId_ = GodBeastMsg.S2C_RecScoreReward_21633.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_RecScoreReward_21633_descriptor;
         }

         public S2C_RecScoreReward_21633 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_RecScoreReward_21633.getDefaultInstance();
         }

         public S2C_RecScoreReward_21633 build() {
            S2C_RecScoreReward_21633 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecScoreReward_21633 buildPartial() {
            S2C_RecScoreReward_21633 result = new S2C_RecScoreReward_21633(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.recId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.recId_ = this.recId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_RecScoreReward_21633) {
               return this.mergeFrom((S2C_RecScoreReward_21633)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecScoreReward_21633 other) {
            if (other == GodBeastMsg.S2C_RecScoreReward_21633.getDefaultInstance()) {
               return this;
            } else {
               if (!other.recId_.isEmpty()) {
                  if (this.recId_.isEmpty()) {
                     this.recId_ = other.recId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRecIdIsMutable();
                     this.recId_.addAll(other.recId_);
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
            S2C_RecScoreReward_21633 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecScoreReward_21633)GodBeastMsg.S2C_RecScoreReward_21633.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecScoreReward_21633)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recId_ = GodBeastMsg.S2C_RecScoreReward_21633.mutableCopy(this.recId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRecIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.recId_) : this.recId_);
         }

         public int getRecIdCount() {
            return this.recId_.size();
         }

         public int getRecId(int index) {
            return this.recId_.getInt(index);
         }

         public Builder setRecId(int index, int value) {
            this.ensureRecIdIsMutable();
            this.recId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecId(int value) {
            this.ensureRecIdIsMutable();
            this.recId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecId(Iterable<? extends Integer> values) {
            this.ensureRecIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recId_);
            this.onChanged();
            return this;
         }

         public Builder clearRecId() {
            this.recId_ = GodBeastMsg.S2C_RecScoreReward_21633.emptyIntList();
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

   public static final class C2S_GetRecScoreReward_21634 extends GeneratedMessageV3 implements C2S_GetRecScoreReward_21634OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GetRecScoreReward_21634 DEFAULT_INSTANCE = new C2S_GetRecScoreReward_21634();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetRecScoreReward_21634> PARSER = new AbstractParser<C2S_GetRecScoreReward_21634>() {
         public C2S_GetRecScoreReward_21634 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetRecScoreReward_21634(input, extensionRegistry);
         }
      };

      private C2S_GetRecScoreReward_21634(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetRecScoreReward_21634() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetRecScoreReward_21634();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetRecScoreReward_21634(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetRecScoreReward_21634.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetRecScoreReward_21634)) {
            return super.equals(obj);
         } else {
            C2S_GetRecScoreReward_21634 other = (C2S_GetRecScoreReward_21634)obj;
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

      public static C2S_GetRecScoreReward_21634 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetRecScoreReward_21634)PARSER.parseFrom(data);
      }

      public static C2S_GetRecScoreReward_21634 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetRecScoreReward_21634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetRecScoreReward_21634 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetRecScoreReward_21634)PARSER.parseFrom(data);
      }

      public static C2S_GetRecScoreReward_21634 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetRecScoreReward_21634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetRecScoreReward_21634 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetRecScoreReward_21634)PARSER.parseFrom(data);
      }

      public static C2S_GetRecScoreReward_21634 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetRecScoreReward_21634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetRecScoreReward_21634 parseFrom(InputStream input) throws IOException {
         return (C2S_GetRecScoreReward_21634)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetRecScoreReward_21634 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetRecScoreReward_21634)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetRecScoreReward_21634 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetRecScoreReward_21634)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetRecScoreReward_21634 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetRecScoreReward_21634)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetRecScoreReward_21634 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetRecScoreReward_21634)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetRecScoreReward_21634 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetRecScoreReward_21634)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetRecScoreReward_21634 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetRecScoreReward_21634 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetRecScoreReward_21634> parser() {
         return PARSER;
      }

      public Parser<C2S_GetRecScoreReward_21634> getParserForType() {
         return PARSER;
      }

      public C2S_GetRecScoreReward_21634 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetRecScoreReward_21634OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetRecScoreReward_21634.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_GetRecScoreReward_21634.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GetRecScoreReward_21634_descriptor;
         }

         public C2S_GetRecScoreReward_21634 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_GetRecScoreReward_21634.getDefaultInstance();
         }

         public C2S_GetRecScoreReward_21634 build() {
            C2S_GetRecScoreReward_21634 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetRecScoreReward_21634 buildPartial() {
            C2S_GetRecScoreReward_21634 result = new C2S_GetRecScoreReward_21634(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GetRecScoreReward_21634) {
               return this.mergeFrom((C2S_GetRecScoreReward_21634)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetRecScoreReward_21634 other) {
            if (other == GodBeastMsg.C2S_GetRecScoreReward_21634.getDefaultInstance()) {
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
            C2S_GetRecScoreReward_21634 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetRecScoreReward_21634)GodBeastMsg.C2S_GetRecScoreReward_21634.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetRecScoreReward_21634)e.getUnfinishedMessage();
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

   public static final class S2C_GetRecScoreReward_21635 extends GeneratedMessageV3 implements S2C_GetRecScoreReward_21635OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECID_FIELD_NUMBER = 1;
      private Internal.IntList recId_;
      public static final int NEXTRESETTIME_FIELD_NUMBER = 2;
      private long nextResetTime_;
      private byte memoizedIsInitialized;
      private static final S2C_GetRecScoreReward_21635 DEFAULT_INSTANCE = new S2C_GetRecScoreReward_21635();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetRecScoreReward_21635> PARSER = new AbstractParser<S2C_GetRecScoreReward_21635>() {
         public S2C_GetRecScoreReward_21635 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetRecScoreReward_21635(input, extensionRegistry);
         }
      };

      private S2C_GetRecScoreReward_21635(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetRecScoreReward_21635() {
         this.memoizedIsInitialized = -1;
         this.recId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetRecScoreReward_21635();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetRecScoreReward_21635(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.recId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recId_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.recId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.nextResetTime_ = input.readInt64();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.recId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.recId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetRecScoreReward_21635.class, Builder.class);
      }

      public List<Integer> getRecIdList() {
         return this.recId_;
      }

      public int getRecIdCount() {
         return this.recId_.size();
      }

      public int getRecId(int index) {
         return this.recId_.getInt(index);
      }

      public boolean hasNextResetTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getNextResetTime() {
         return this.nextResetTime_;
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
         for(int i = 0; i < this.recId_.size(); ++i) {
            output.writeInt32(1, this.recId_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(2, this.nextResetTime_);
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

            for(int i = 0; i < this.recId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.recId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getRecIdList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.nextResetTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetRecScoreReward_21635)) {
            return super.equals(obj);
         } else {
            S2C_GetRecScoreReward_21635 other = (S2C_GetRecScoreReward_21635)obj;
            if (!this.getRecIdList().equals(other.getRecIdList())) {
               return false;
            } else if (this.hasNextResetTime() != other.hasNextResetTime()) {
               return false;
            } else if (this.hasNextResetTime() && this.getNextResetTime() != other.getNextResetTime()) {
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
            if (this.getRecIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecIdList().hashCode();
            }

            if (this.hasNextResetTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getNextResetTime());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetRecScoreReward_21635)PARSER.parseFrom(data);
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetRecScoreReward_21635)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetRecScoreReward_21635)PARSER.parseFrom(data);
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetRecScoreReward_21635)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetRecScoreReward_21635)PARSER.parseFrom(data);
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetRecScoreReward_21635)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(InputStream input) throws IOException {
         return (S2C_GetRecScoreReward_21635)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetRecScoreReward_21635)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetRecScoreReward_21635 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetRecScoreReward_21635)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetRecScoreReward_21635 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetRecScoreReward_21635)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetRecScoreReward_21635)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetRecScoreReward_21635 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetRecScoreReward_21635)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetRecScoreReward_21635 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetRecScoreReward_21635 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetRecScoreReward_21635> parser() {
         return PARSER;
      }

      public Parser<S2C_GetRecScoreReward_21635> getParserForType() {
         return PARSER;
      }

      public S2C_GetRecScoreReward_21635 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetRecScoreReward_21635OrBuilder {
         private int bitField0_;
         private Internal.IntList recId_;
         private long nextResetTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetRecScoreReward_21635.class, Builder.class);
         }

         private Builder() {
            this.recId_ = GodBeastMsg.S2C_GetRecScoreReward_21635.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recId_ = GodBeastMsg.S2C_GetRecScoreReward_21635.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_GetRecScoreReward_21635.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recId_ = GodBeastMsg.S2C_GetRecScoreReward_21635.emptyIntList();
            this.bitField0_ &= -2;
            this.nextResetTime_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GetRecScoreReward_21635_descriptor;
         }

         public S2C_GetRecScoreReward_21635 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_GetRecScoreReward_21635.getDefaultInstance();
         }

         public S2C_GetRecScoreReward_21635 build() {
            S2C_GetRecScoreReward_21635 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetRecScoreReward_21635 buildPartial() {
            S2C_GetRecScoreReward_21635 result = new S2C_GetRecScoreReward_21635(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.recId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.recId_ = this.recId_;
            if ((from_bitField0_ & 2) != 0) {
               result.nextResetTime_ = this.nextResetTime_;
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
            if (other instanceof S2C_GetRecScoreReward_21635) {
               return this.mergeFrom((S2C_GetRecScoreReward_21635)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetRecScoreReward_21635 other) {
            if (other == GodBeastMsg.S2C_GetRecScoreReward_21635.getDefaultInstance()) {
               return this;
            } else {
               if (!other.recId_.isEmpty()) {
                  if (this.recId_.isEmpty()) {
                     this.recId_ = other.recId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRecIdIsMutable();
                     this.recId_.addAll(other.recId_);
                  }

                  this.onChanged();
               }

               if (other.hasNextResetTime()) {
                  this.setNextResetTime(other.getNextResetTime());
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
            S2C_GetRecScoreReward_21635 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetRecScoreReward_21635)GodBeastMsg.S2C_GetRecScoreReward_21635.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetRecScoreReward_21635)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recId_ = GodBeastMsg.S2C_GetRecScoreReward_21635.mutableCopy(this.recId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getRecIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.recId_) : this.recId_);
         }

         public int getRecIdCount() {
            return this.recId_.size();
         }

         public int getRecId(int index) {
            return this.recId_.getInt(index);
         }

         public Builder setRecId(int index, int value) {
            this.ensureRecIdIsMutable();
            this.recId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addRecId(int value) {
            this.ensureRecIdIsMutable();
            this.recId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllRecId(Iterable<? extends Integer> values) {
            this.ensureRecIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recId_);
            this.onChanged();
            return this;
         }

         public Builder clearRecId() {
            this.recId_ = GodBeastMsg.S2C_GetRecScoreReward_21635.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasNextResetTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getNextResetTime() {
            return this.nextResetTime_;
         }

         public Builder setNextResetTime(long value) {
            this.bitField0_ |= 2;
            this.nextResetTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNextResetTime() {
            this.bitField0_ &= -3;
            this.nextResetTime_ = 0L;
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

   public static final class C2S_NoticeInfo_21636 extends GeneratedMessageV3 implements C2S_NoticeInfo_21636OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_NoticeInfo_21636 DEFAULT_INSTANCE = new C2S_NoticeInfo_21636();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NoticeInfo_21636> PARSER = new AbstractParser<C2S_NoticeInfo_21636>() {
         public C2S_NoticeInfo_21636 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NoticeInfo_21636(input, extensionRegistry);
         }
      };

      private C2S_NoticeInfo_21636(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NoticeInfo_21636() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NoticeInfo_21636();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NoticeInfo_21636(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticeInfo_21636.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NoticeInfo_21636)) {
            return super.equals(obj);
         } else {
            C2S_NoticeInfo_21636 other = (C2S_NoticeInfo_21636)obj;
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

      public static C2S_NoticeInfo_21636 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_21636)PARSER.parseFrom(data);
      }

      public static C2S_NoticeInfo_21636 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_21636)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticeInfo_21636 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_21636)PARSER.parseFrom(data);
      }

      public static C2S_NoticeInfo_21636 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_21636)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticeInfo_21636 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_21636)PARSER.parseFrom(data);
      }

      public static C2S_NoticeInfo_21636 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticeInfo_21636)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticeInfo_21636 parseFrom(InputStream input) throws IOException {
         return (C2S_NoticeInfo_21636)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticeInfo_21636 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticeInfo_21636)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticeInfo_21636 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NoticeInfo_21636)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NoticeInfo_21636 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticeInfo_21636)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticeInfo_21636 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NoticeInfo_21636)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticeInfo_21636 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticeInfo_21636)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NoticeInfo_21636 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NoticeInfo_21636 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NoticeInfo_21636> parser() {
         return PARSER;
      }

      public Parser<C2S_NoticeInfo_21636> getParserForType() {
         return PARSER;
      }

      public C2S_NoticeInfo_21636 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NoticeInfo_21636OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticeInfo_21636.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_NoticeInfo_21636.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticeInfo_21636_descriptor;
         }

         public C2S_NoticeInfo_21636 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_NoticeInfo_21636.getDefaultInstance();
         }

         public C2S_NoticeInfo_21636 build() {
            C2S_NoticeInfo_21636 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NoticeInfo_21636 buildPartial() {
            C2S_NoticeInfo_21636 result = new C2S_NoticeInfo_21636(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_NoticeInfo_21636) {
               return this.mergeFrom((C2S_NoticeInfo_21636)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NoticeInfo_21636 other) {
            if (other == GodBeastMsg.C2S_NoticeInfo_21636.getDefaultInstance()) {
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
            C2S_NoticeInfo_21636 parsedMessage = null;

            try {
               parsedMessage = (C2S_NoticeInfo_21636)GodBeastMsg.C2S_NoticeInfo_21636.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NoticeInfo_21636)e.getUnfinishedMessage();
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

   public static final class S2C_NoticeInfo_21637 extends GeneratedMessageV3 implements S2C_NoticeInfo_21637OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int UNLOCKID_FIELD_NUMBER = 1;
      private Internal.IntList unlockId_;
      private byte memoizedIsInitialized;
      private static final S2C_NoticeInfo_21637 DEFAULT_INSTANCE = new S2C_NoticeInfo_21637();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NoticeInfo_21637> PARSER = new AbstractParser<S2C_NoticeInfo_21637>() {
         public S2C_NoticeInfo_21637 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NoticeInfo_21637(input, extensionRegistry);
         }
      };

      private S2C_NoticeInfo_21637(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NoticeInfo_21637() {
         this.memoizedIsInitialized = -1;
         this.unlockId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NoticeInfo_21637();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NoticeInfo_21637(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.unlockId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.unlockId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.unlockId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.unlockId_.addInt(input.readInt32());
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
                  this.unlockId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticeInfo_21637.class, Builder.class);
      }

      public List<Integer> getUnlockIdList() {
         return this.unlockId_;
      }

      public int getUnlockIdCount() {
         return this.unlockId_.size();
      }

      public int getUnlockId(int index) {
         return this.unlockId_.getInt(index);
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
         for(int i = 0; i < this.unlockId_.size(); ++i) {
            output.writeInt32(1, this.unlockId_.getInt(i));
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

            for(int i = 0; i < this.unlockId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.unlockId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getUnlockIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NoticeInfo_21637)) {
            return super.equals(obj);
         } else {
            S2C_NoticeInfo_21637 other = (S2C_NoticeInfo_21637)obj;
            if (!this.getUnlockIdList().equals(other.getUnlockIdList())) {
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
            if (this.getUnlockIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnlockIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NoticeInfo_21637 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_21637)PARSER.parseFrom(data);
      }

      public static S2C_NoticeInfo_21637 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_21637)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticeInfo_21637 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_21637)PARSER.parseFrom(data);
      }

      public static S2C_NoticeInfo_21637 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_21637)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticeInfo_21637 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_21637)PARSER.parseFrom(data);
      }

      public static S2C_NoticeInfo_21637 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticeInfo_21637)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticeInfo_21637 parseFrom(InputStream input) throws IOException {
         return (S2C_NoticeInfo_21637)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticeInfo_21637 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticeInfo_21637)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticeInfo_21637 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NoticeInfo_21637)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NoticeInfo_21637 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticeInfo_21637)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticeInfo_21637 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NoticeInfo_21637)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticeInfo_21637 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticeInfo_21637)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NoticeInfo_21637 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NoticeInfo_21637 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NoticeInfo_21637> parser() {
         return PARSER;
      }

      public Parser<S2C_NoticeInfo_21637> getParserForType() {
         return PARSER;
      }

      public S2C_NoticeInfo_21637 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NoticeInfo_21637OrBuilder {
         private int bitField0_;
         private Internal.IntList unlockId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticeInfo_21637.class, Builder.class);
         }

         private Builder() {
            this.unlockId_ = GodBeastMsg.S2C_NoticeInfo_21637.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unlockId_ = GodBeastMsg.S2C_NoticeInfo_21637.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_NoticeInfo_21637.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockId_ = GodBeastMsg.S2C_NoticeInfo_21637.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticeInfo_21637_descriptor;
         }

         public S2C_NoticeInfo_21637 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_NoticeInfo_21637.getDefaultInstance();
         }

         public S2C_NoticeInfo_21637 build() {
            S2C_NoticeInfo_21637 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NoticeInfo_21637 buildPartial() {
            S2C_NoticeInfo_21637 result = new S2C_NoticeInfo_21637(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.unlockId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.unlockId_ = this.unlockId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_NoticeInfo_21637) {
               return this.mergeFrom((S2C_NoticeInfo_21637)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NoticeInfo_21637 other) {
            if (other == GodBeastMsg.S2C_NoticeInfo_21637.getDefaultInstance()) {
               return this;
            } else {
               if (!other.unlockId_.isEmpty()) {
                  if (this.unlockId_.isEmpty()) {
                     this.unlockId_ = other.unlockId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureUnlockIdIsMutable();
                     this.unlockId_.addAll(other.unlockId_);
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
            S2C_NoticeInfo_21637 parsedMessage = null;

            try {
               parsedMessage = (S2C_NoticeInfo_21637)GodBeastMsg.S2C_NoticeInfo_21637.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NoticeInfo_21637)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureUnlockIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.unlockId_ = GodBeastMsg.S2C_NoticeInfo_21637.mutableCopy(this.unlockId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getUnlockIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.unlockId_) : this.unlockId_);
         }

         public int getUnlockIdCount() {
            return this.unlockId_.size();
         }

         public int getUnlockId(int index) {
            return this.unlockId_.getInt(index);
         }

         public Builder setUnlockId(int index, int value) {
            this.ensureUnlockIdIsMutable();
            this.unlockId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addUnlockId(int value) {
            this.ensureUnlockIdIsMutable();
            this.unlockId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllUnlockId(Iterable<? extends Integer> values) {
            this.ensureUnlockIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.unlockId_);
            this.onChanged();
            return this;
         }

         public Builder clearUnlockId() {
            this.unlockId_ = GodBeastMsg.S2C_NoticeInfo_21637.emptyIntList();
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

   public static final class C2S_NoticePointUnlock_21638 extends GeneratedMessageV3 implements C2S_NoticePointUnlock_21638OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_NoticePointUnlock_21638 DEFAULT_INSTANCE = new C2S_NoticePointUnlock_21638();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NoticePointUnlock_21638> PARSER = new AbstractParser<C2S_NoticePointUnlock_21638>() {
         public C2S_NoticePointUnlock_21638 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NoticePointUnlock_21638(input, extensionRegistry);
         }
      };

      private C2S_NoticePointUnlock_21638(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NoticePointUnlock_21638() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NoticePointUnlock_21638();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NoticePointUnlock_21638(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticePointUnlock_21638.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NoticePointUnlock_21638)) {
            return super.equals(obj);
         } else {
            C2S_NoticePointUnlock_21638 other = (C2S_NoticePointUnlock_21638)obj;
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

      public static C2S_NoticePointUnlock_21638 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_21638)PARSER.parseFrom(data);
      }

      public static C2S_NoticePointUnlock_21638 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_21638)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_21638 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_21638)PARSER.parseFrom(data);
      }

      public static C2S_NoticePointUnlock_21638 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_21638)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_21638 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_21638)PARSER.parseFrom(data);
      }

      public static C2S_NoticePointUnlock_21638 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticePointUnlock_21638)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_21638 parseFrom(InputStream input) throws IOException {
         return (C2S_NoticePointUnlock_21638)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticePointUnlock_21638 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticePointUnlock_21638)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_21638 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NoticePointUnlock_21638)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NoticePointUnlock_21638 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticePointUnlock_21638)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticePointUnlock_21638 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NoticePointUnlock_21638)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticePointUnlock_21638 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticePointUnlock_21638)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NoticePointUnlock_21638 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NoticePointUnlock_21638 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NoticePointUnlock_21638> parser() {
         return PARSER;
      }

      public Parser<C2S_NoticePointUnlock_21638> getParserForType() {
         return PARSER;
      }

      public C2S_NoticePointUnlock_21638 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NoticePointUnlock_21638OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticePointUnlock_21638.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_NoticePointUnlock_21638.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_NoticePointUnlock_21638_descriptor;
         }

         public C2S_NoticePointUnlock_21638 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_NoticePointUnlock_21638.getDefaultInstance();
         }

         public C2S_NoticePointUnlock_21638 build() {
            C2S_NoticePointUnlock_21638 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NoticePointUnlock_21638 buildPartial() {
            C2S_NoticePointUnlock_21638 result = new C2S_NoticePointUnlock_21638(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_NoticePointUnlock_21638) {
               return this.mergeFrom((C2S_NoticePointUnlock_21638)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NoticePointUnlock_21638 other) {
            if (other == GodBeastMsg.C2S_NoticePointUnlock_21638.getDefaultInstance()) {
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
            C2S_NoticePointUnlock_21638 parsedMessage = null;

            try {
               parsedMessage = (C2S_NoticePointUnlock_21638)GodBeastMsg.C2S_NoticePointUnlock_21638.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NoticePointUnlock_21638)e.getUnfinishedMessage();
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

   public static final class S2C_NoticePointUnlock_21639 extends GeneratedMessageV3 implements S2C_NoticePointUnlock_21639OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int UNLOCKID_FIELD_NUMBER = 1;
      private Internal.IntList unlockId_;
      private byte memoizedIsInitialized;
      private static final S2C_NoticePointUnlock_21639 DEFAULT_INSTANCE = new S2C_NoticePointUnlock_21639();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NoticePointUnlock_21639> PARSER = new AbstractParser<S2C_NoticePointUnlock_21639>() {
         public S2C_NoticePointUnlock_21639 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NoticePointUnlock_21639(input, extensionRegistry);
         }
      };

      private S2C_NoticePointUnlock_21639(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NoticePointUnlock_21639() {
         this.memoizedIsInitialized = -1;
         this.unlockId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NoticePointUnlock_21639();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NoticePointUnlock_21639(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.unlockId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.unlockId_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.unlockId_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.unlockId_.addInt(input.readInt32());
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
                  this.unlockId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticePointUnlock_21639.class, Builder.class);
      }

      public List<Integer> getUnlockIdList() {
         return this.unlockId_;
      }

      public int getUnlockIdCount() {
         return this.unlockId_.size();
      }

      public int getUnlockId(int index) {
         return this.unlockId_.getInt(index);
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
         for(int i = 0; i < this.unlockId_.size(); ++i) {
            output.writeInt32(1, this.unlockId_.getInt(i));
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

            for(int i = 0; i < this.unlockId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.unlockId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getUnlockIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NoticePointUnlock_21639)) {
            return super.equals(obj);
         } else {
            S2C_NoticePointUnlock_21639 other = (S2C_NoticePointUnlock_21639)obj;
            if (!this.getUnlockIdList().equals(other.getUnlockIdList())) {
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
            if (this.getUnlockIdCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnlockIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_21639)PARSER.parseFrom(data);
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_21639)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_21639)PARSER.parseFrom(data);
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_21639)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_21639)PARSER.parseFrom(data);
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePointUnlock_21639)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(InputStream input) throws IOException {
         return (S2C_NoticePointUnlock_21639)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePointUnlock_21639)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_21639 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NoticePointUnlock_21639)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NoticePointUnlock_21639 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePointUnlock_21639)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NoticePointUnlock_21639)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticePointUnlock_21639 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePointUnlock_21639)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NoticePointUnlock_21639 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NoticePointUnlock_21639 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NoticePointUnlock_21639> parser() {
         return PARSER;
      }

      public Parser<S2C_NoticePointUnlock_21639> getParserForType() {
         return PARSER;
      }

      public S2C_NoticePointUnlock_21639 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NoticePointUnlock_21639OrBuilder {
         private int bitField0_;
         private Internal.IntList unlockId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticePointUnlock_21639.class, Builder.class);
         }

         private Builder() {
            this.unlockId_ = GodBeastMsg.S2C_NoticePointUnlock_21639.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unlockId_ = GodBeastMsg.S2C_NoticePointUnlock_21639.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_NoticePointUnlock_21639.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockId_ = GodBeastMsg.S2C_NoticePointUnlock_21639.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_NoticePointUnlock_21639_descriptor;
         }

         public S2C_NoticePointUnlock_21639 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_NoticePointUnlock_21639.getDefaultInstance();
         }

         public S2C_NoticePointUnlock_21639 build() {
            S2C_NoticePointUnlock_21639 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NoticePointUnlock_21639 buildPartial() {
            S2C_NoticePointUnlock_21639 result = new S2C_NoticePointUnlock_21639(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.unlockId_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.unlockId_ = this.unlockId_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_NoticePointUnlock_21639) {
               return this.mergeFrom((S2C_NoticePointUnlock_21639)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NoticePointUnlock_21639 other) {
            if (other == GodBeastMsg.S2C_NoticePointUnlock_21639.getDefaultInstance()) {
               return this;
            } else {
               if (!other.unlockId_.isEmpty()) {
                  if (this.unlockId_.isEmpty()) {
                     this.unlockId_ = other.unlockId_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureUnlockIdIsMutable();
                     this.unlockId_.addAll(other.unlockId_);
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
            S2C_NoticePointUnlock_21639 parsedMessage = null;

            try {
               parsedMessage = (S2C_NoticePointUnlock_21639)GodBeastMsg.S2C_NoticePointUnlock_21639.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NoticePointUnlock_21639)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureUnlockIdIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.unlockId_ = GodBeastMsg.S2C_NoticePointUnlock_21639.mutableCopy(this.unlockId_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getUnlockIdList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.unlockId_) : this.unlockId_);
         }

         public int getUnlockIdCount() {
            return this.unlockId_.size();
         }

         public int getUnlockId(int index) {
            return this.unlockId_.getInt(index);
         }

         public Builder setUnlockId(int index, int value) {
            this.ensureUnlockIdIsMutable();
            this.unlockId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addUnlockId(int value) {
            this.ensureUnlockIdIsMutable();
            this.unlockId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllUnlockId(Iterable<? extends Integer> values) {
            this.ensureUnlockIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.unlockId_);
            this.onChanged();
            return this;
         }

         public Builder clearUnlockId() {
            this.unlockId_ = GodBeastMsg.S2C_NoticePointUnlock_21639.emptyIntList();
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

   public static final class C2S_HatchRecordList_21640 extends GeneratedMessageV3 implements C2S_HatchRecordList_21640OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HatchRecordList_21640 DEFAULT_INSTANCE = new C2S_HatchRecordList_21640();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HatchRecordList_21640> PARSER = new AbstractParser<C2S_HatchRecordList_21640>() {
         public C2S_HatchRecordList_21640 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HatchRecordList_21640(input, extensionRegistry);
         }
      };

      private C2S_HatchRecordList_21640(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HatchRecordList_21640() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HatchRecordList_21640();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HatchRecordList_21640(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HatchRecordList_21640.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HatchRecordList_21640)) {
            return super.equals(obj);
         } else {
            C2S_HatchRecordList_21640 other = (C2S_HatchRecordList_21640)obj;
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

      public static C2S_HatchRecordList_21640 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HatchRecordList_21640)PARSER.parseFrom(data);
      }

      public static C2S_HatchRecordList_21640 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchRecordList_21640)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchRecordList_21640 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HatchRecordList_21640)PARSER.parseFrom(data);
      }

      public static C2S_HatchRecordList_21640 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchRecordList_21640)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchRecordList_21640 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HatchRecordList_21640)PARSER.parseFrom(data);
      }

      public static C2S_HatchRecordList_21640 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HatchRecordList_21640)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HatchRecordList_21640 parseFrom(InputStream input) throws IOException {
         return (C2S_HatchRecordList_21640)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HatchRecordList_21640 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchRecordList_21640)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HatchRecordList_21640 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HatchRecordList_21640)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HatchRecordList_21640 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchRecordList_21640)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HatchRecordList_21640 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HatchRecordList_21640)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HatchRecordList_21640 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HatchRecordList_21640)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HatchRecordList_21640 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HatchRecordList_21640 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HatchRecordList_21640> parser() {
         return PARSER;
      }

      public Parser<C2S_HatchRecordList_21640> getParserForType() {
         return PARSER;
      }

      public C2S_HatchRecordList_21640 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HatchRecordList_21640OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HatchRecordList_21640.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_HatchRecordList_21640.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_HatchRecordList_21640_descriptor;
         }

         public C2S_HatchRecordList_21640 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_HatchRecordList_21640.getDefaultInstance();
         }

         public C2S_HatchRecordList_21640 build() {
            C2S_HatchRecordList_21640 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HatchRecordList_21640 buildPartial() {
            C2S_HatchRecordList_21640 result = new C2S_HatchRecordList_21640(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_HatchRecordList_21640) {
               return this.mergeFrom((C2S_HatchRecordList_21640)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HatchRecordList_21640 other) {
            if (other == GodBeastMsg.C2S_HatchRecordList_21640.getDefaultInstance()) {
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
            C2S_HatchRecordList_21640 parsedMessage = null;

            try {
               parsedMessage = (C2S_HatchRecordList_21640)GodBeastMsg.C2S_HatchRecordList_21640.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HatchRecordList_21640)e.getUnfinishedMessage();
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

   public static final class S2C_HatchRecordList_21641 extends GeneratedMessageV3 implements S2C_HatchRecordList_21641OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PLAYERRECORDLIST_FIELD_NUMBER = 1;
      private List<HatchRecordData> playerRecordList_;
      public static final int ALLRECORDLIST_FIELD_NUMBER = 2;
      private List<HatchRecordData> allRecordList_;
      private byte memoizedIsInitialized;
      private static final S2C_HatchRecordList_21641 DEFAULT_INSTANCE = new S2C_HatchRecordList_21641();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HatchRecordList_21641> PARSER = new AbstractParser<S2C_HatchRecordList_21641>() {
         public S2C_HatchRecordList_21641 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HatchRecordList_21641(input, extensionRegistry);
         }
      };

      private S2C_HatchRecordList_21641(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HatchRecordList_21641() {
         this.memoizedIsInitialized = -1;
         this.playerRecordList_ = Collections.emptyList();
         this.allRecordList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HatchRecordList_21641();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HatchRecordList_21641(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.playerRecordList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.playerRecordList_.add(input.readMessage(GodBeastMsg.HatchRecordData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.allRecordList_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.allRecordList_.add(input.readMessage(GodBeastMsg.HatchRecordData.PARSER, extensionRegistry));
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
                  this.playerRecordList_ = Collections.unmodifiableList(this.playerRecordList_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.allRecordList_ = Collections.unmodifiableList(this.allRecordList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchRecordList_21641.class, Builder.class);
      }

      public List<HatchRecordData> getPlayerRecordListList() {
         return this.playerRecordList_;
      }

      public List<? extends HatchRecordDataOrBuilder> getPlayerRecordListOrBuilderList() {
         return this.playerRecordList_;
      }

      public int getPlayerRecordListCount() {
         return this.playerRecordList_.size();
      }

      public HatchRecordData getPlayerRecordList(int index) {
         return (HatchRecordData)this.playerRecordList_.get(index);
      }

      public HatchRecordDataOrBuilder getPlayerRecordListOrBuilder(int index) {
         return (HatchRecordDataOrBuilder)this.playerRecordList_.get(index);
      }

      public List<HatchRecordData> getAllRecordListList() {
         return this.allRecordList_;
      }

      public List<? extends HatchRecordDataOrBuilder> getAllRecordListOrBuilderList() {
         return this.allRecordList_;
      }

      public int getAllRecordListCount() {
         return this.allRecordList_.size();
      }

      public HatchRecordData getAllRecordList(int index) {
         return (HatchRecordData)this.allRecordList_.get(index);
      }

      public HatchRecordDataOrBuilder getAllRecordListOrBuilder(int index) {
         return (HatchRecordDataOrBuilder)this.allRecordList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPlayerRecordListCount(); ++i) {
               if (!this.getPlayerRecordList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getAllRecordListCount(); ++i) {
               if (!this.getAllRecordList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.playerRecordList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.playerRecordList_.get(i));
         }

         for(int i = 0; i < this.allRecordList_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.allRecordList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.playerRecordList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.playerRecordList_.get(i));
            }

            for(int i = 0; i < this.allRecordList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.allRecordList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HatchRecordList_21641)) {
            return super.equals(obj);
         } else {
            S2C_HatchRecordList_21641 other = (S2C_HatchRecordList_21641)obj;
            if (!this.getPlayerRecordListList().equals(other.getPlayerRecordListList())) {
               return false;
            } else if (!this.getAllRecordListList().equals(other.getAllRecordListList())) {
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
            if (this.getPlayerRecordListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerRecordListList().hashCode();
            }

            if (this.getAllRecordListCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAllRecordListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HatchRecordList_21641 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21641)PARSER.parseFrom(data);
      }

      public static S2C_HatchRecordList_21641 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21641)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchRecordList_21641 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21641)PARSER.parseFrom(data);
      }

      public static S2C_HatchRecordList_21641 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21641)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchRecordList_21641 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21641)PARSER.parseFrom(data);
      }

      public static S2C_HatchRecordList_21641 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21641)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchRecordList_21641 parseFrom(InputStream input) throws IOException {
         return (S2C_HatchRecordList_21641)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchRecordList_21641 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchRecordList_21641)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchRecordList_21641 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HatchRecordList_21641)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HatchRecordList_21641 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchRecordList_21641)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchRecordList_21641 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HatchRecordList_21641)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchRecordList_21641 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchRecordList_21641)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HatchRecordList_21641 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HatchRecordList_21641 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HatchRecordList_21641> parser() {
         return PARSER;
      }

      public Parser<S2C_HatchRecordList_21641> getParserForType() {
         return PARSER;
      }

      public S2C_HatchRecordList_21641 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HatchRecordList_21641OrBuilder {
         private int bitField0_;
         private List<HatchRecordData> playerRecordList_;
         private RepeatedFieldBuilderV3<HatchRecordData, HatchRecordData.Builder, HatchRecordDataOrBuilder> playerRecordListBuilder_;
         private List<HatchRecordData> allRecordList_;
         private RepeatedFieldBuilderV3<HatchRecordData, HatchRecordData.Builder, HatchRecordDataOrBuilder> allRecordListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchRecordList_21641.class, Builder.class);
         }

         private Builder() {
            this.playerRecordList_ = Collections.emptyList();
            this.allRecordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerRecordList_ = Collections.emptyList();
            this.allRecordList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_HatchRecordList_21641.alwaysUseFieldBuilders) {
               this.getPlayerRecordListFieldBuilder();
               this.getAllRecordListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.playerRecordListBuilder_ == null) {
               this.playerRecordList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.playerRecordListBuilder_.clear();
            }

            if (this.allRecordListBuilder_ == null) {
               this.allRecordList_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.allRecordListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21641_descriptor;
         }

         public S2C_HatchRecordList_21641 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_HatchRecordList_21641.getDefaultInstance();
         }

         public S2C_HatchRecordList_21641 build() {
            S2C_HatchRecordList_21641 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HatchRecordList_21641 buildPartial() {
            S2C_HatchRecordList_21641 result = new S2C_HatchRecordList_21641(this);
            int from_bitField0_ = this.bitField0_;
            if (this.playerRecordListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.playerRecordList_ = Collections.unmodifiableList(this.playerRecordList_);
                  this.bitField0_ &= -2;
               }

               result.playerRecordList_ = this.playerRecordList_;
            } else {
               result.playerRecordList_ = this.playerRecordListBuilder_.build();
            }

            if (this.allRecordListBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.allRecordList_ = Collections.unmodifiableList(this.allRecordList_);
                  this.bitField0_ &= -3;
               }

               result.allRecordList_ = this.allRecordList_;
            } else {
               result.allRecordList_ = this.allRecordListBuilder_.build();
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
            if (other instanceof S2C_HatchRecordList_21641) {
               return this.mergeFrom((S2C_HatchRecordList_21641)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HatchRecordList_21641 other) {
            if (other == GodBeastMsg.S2C_HatchRecordList_21641.getDefaultInstance()) {
               return this;
            } else {
               if (this.playerRecordListBuilder_ == null) {
                  if (!other.playerRecordList_.isEmpty()) {
                     if (this.playerRecordList_.isEmpty()) {
                        this.playerRecordList_ = other.playerRecordList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePlayerRecordListIsMutable();
                        this.playerRecordList_.addAll(other.playerRecordList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.playerRecordList_.isEmpty()) {
                  if (this.playerRecordListBuilder_.isEmpty()) {
                     this.playerRecordListBuilder_.dispose();
                     this.playerRecordListBuilder_ = null;
                     this.playerRecordList_ = other.playerRecordList_;
                     this.bitField0_ &= -2;
                     this.playerRecordListBuilder_ = GodBeastMsg.S2C_HatchRecordList_21641.alwaysUseFieldBuilders ? this.getPlayerRecordListFieldBuilder() : null;
                  } else {
                     this.playerRecordListBuilder_.addAllMessages(other.playerRecordList_);
                  }
               }

               if (this.allRecordListBuilder_ == null) {
                  if (!other.allRecordList_.isEmpty()) {
                     if (this.allRecordList_.isEmpty()) {
                        this.allRecordList_ = other.allRecordList_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureAllRecordListIsMutable();
                        this.allRecordList_.addAll(other.allRecordList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.allRecordList_.isEmpty()) {
                  if (this.allRecordListBuilder_.isEmpty()) {
                     this.allRecordListBuilder_.dispose();
                     this.allRecordListBuilder_ = null;
                     this.allRecordList_ = other.allRecordList_;
                     this.bitField0_ &= -3;
                     this.allRecordListBuilder_ = GodBeastMsg.S2C_HatchRecordList_21641.alwaysUseFieldBuilders ? this.getAllRecordListFieldBuilder() : null;
                  } else {
                     this.allRecordListBuilder_.addAllMessages(other.allRecordList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPlayerRecordListCount(); ++i) {
               if (!this.getPlayerRecordList(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getAllRecordListCount(); ++i) {
               if (!this.getAllRecordList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HatchRecordList_21641 parsedMessage = null;

            try {
               parsedMessage = (S2C_HatchRecordList_21641)GodBeastMsg.S2C_HatchRecordList_21641.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HatchRecordList_21641)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePlayerRecordListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.playerRecordList_ = new ArrayList(this.playerRecordList_);
               this.bitField0_ |= 1;
            }

         }

         public List<HatchRecordData> getPlayerRecordListList() {
            return this.playerRecordListBuilder_ == null ? Collections.unmodifiableList(this.playerRecordList_) : this.playerRecordListBuilder_.getMessageList();
         }

         public int getPlayerRecordListCount() {
            return this.playerRecordListBuilder_ == null ? this.playerRecordList_.size() : this.playerRecordListBuilder_.getCount();
         }

         public HatchRecordData getPlayerRecordList(int index) {
            return this.playerRecordListBuilder_ == null ? (HatchRecordData)this.playerRecordList_.get(index) : (HatchRecordData)this.playerRecordListBuilder_.getMessage(index);
         }

         public Builder setPlayerRecordList(int index, HatchRecordData value) {
            if (this.playerRecordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerRecordListIsMutable();
               this.playerRecordList_.set(index, value);
               this.onChanged();
            } else {
               this.playerRecordListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPlayerRecordList(int index, HatchRecordData.Builder builderForValue) {
            if (this.playerRecordListBuilder_ == null) {
               this.ensurePlayerRecordListIsMutable();
               this.playerRecordList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerRecordListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerRecordList(HatchRecordData value) {
            if (this.playerRecordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerRecordListIsMutable();
               this.playerRecordList_.add(value);
               this.onChanged();
            } else {
               this.playerRecordListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPlayerRecordList(int index, HatchRecordData value) {
            if (this.playerRecordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePlayerRecordListIsMutable();
               this.playerRecordList_.add(index, value);
               this.onChanged();
            } else {
               this.playerRecordListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPlayerRecordList(HatchRecordData.Builder builderForValue) {
            if (this.playerRecordListBuilder_ == null) {
               this.ensurePlayerRecordListIsMutable();
               this.playerRecordList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.playerRecordListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPlayerRecordList(int index, HatchRecordData.Builder builderForValue) {
            if (this.playerRecordListBuilder_ == null) {
               this.ensurePlayerRecordListIsMutable();
               this.playerRecordList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.playerRecordListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPlayerRecordList(Iterable<? extends HatchRecordData> values) {
            if (this.playerRecordListBuilder_ == null) {
               this.ensurePlayerRecordListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.playerRecordList_);
               this.onChanged();
            } else {
               this.playerRecordListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPlayerRecordList() {
            if (this.playerRecordListBuilder_ == null) {
               this.playerRecordList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.playerRecordListBuilder_.clear();
            }

            return this;
         }

         public Builder removePlayerRecordList(int index) {
            if (this.playerRecordListBuilder_ == null) {
               this.ensurePlayerRecordListIsMutable();
               this.playerRecordList_.remove(index);
               this.onChanged();
            } else {
               this.playerRecordListBuilder_.remove(index);
            }

            return this;
         }

         public HatchRecordData.Builder getPlayerRecordListBuilder(int index) {
            return (HatchRecordData.Builder)this.getPlayerRecordListFieldBuilder().getBuilder(index);
         }

         public HatchRecordDataOrBuilder getPlayerRecordListOrBuilder(int index) {
            return this.playerRecordListBuilder_ == null ? (HatchRecordDataOrBuilder)this.playerRecordList_.get(index) : (HatchRecordDataOrBuilder)this.playerRecordListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HatchRecordDataOrBuilder> getPlayerRecordListOrBuilderList() {
            return this.playerRecordListBuilder_ != null ? this.playerRecordListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.playerRecordList_);
         }

         public HatchRecordData.Builder addPlayerRecordListBuilder() {
            return (HatchRecordData.Builder)this.getPlayerRecordListFieldBuilder().addBuilder(GodBeastMsg.HatchRecordData.getDefaultInstance());
         }

         public HatchRecordData.Builder addPlayerRecordListBuilder(int index) {
            return (HatchRecordData.Builder)this.getPlayerRecordListFieldBuilder().addBuilder(index, GodBeastMsg.HatchRecordData.getDefaultInstance());
         }

         public List<HatchRecordData.Builder> getPlayerRecordListBuilderList() {
            return this.getPlayerRecordListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HatchRecordData, HatchRecordData.Builder, HatchRecordDataOrBuilder> getPlayerRecordListFieldBuilder() {
            if (this.playerRecordListBuilder_ == null) {
               this.playerRecordListBuilder_ = new RepeatedFieldBuilderV3(this.playerRecordList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.playerRecordList_ = null;
            }

            return this.playerRecordListBuilder_;
         }

         private void ensureAllRecordListIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.allRecordList_ = new ArrayList(this.allRecordList_);
               this.bitField0_ |= 2;
            }

         }

         public List<HatchRecordData> getAllRecordListList() {
            return this.allRecordListBuilder_ == null ? Collections.unmodifiableList(this.allRecordList_) : this.allRecordListBuilder_.getMessageList();
         }

         public int getAllRecordListCount() {
            return this.allRecordListBuilder_ == null ? this.allRecordList_.size() : this.allRecordListBuilder_.getCount();
         }

         public HatchRecordData getAllRecordList(int index) {
            return this.allRecordListBuilder_ == null ? (HatchRecordData)this.allRecordList_.get(index) : (HatchRecordData)this.allRecordListBuilder_.getMessage(index);
         }

         public Builder setAllRecordList(int index, HatchRecordData value) {
            if (this.allRecordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordListIsMutable();
               this.allRecordList_.set(index, value);
               this.onChanged();
            } else {
               this.allRecordListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAllRecordList(int index, HatchRecordData.Builder builderForValue) {
            if (this.allRecordListBuilder_ == null) {
               this.ensureAllRecordListIsMutable();
               this.allRecordList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordList(HatchRecordData value) {
            if (this.allRecordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordListIsMutable();
               this.allRecordList_.add(value);
               this.onChanged();
            } else {
               this.allRecordListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAllRecordList(int index, HatchRecordData value) {
            if (this.allRecordListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAllRecordListIsMutable();
               this.allRecordList_.add(index, value);
               this.onChanged();
            } else {
               this.allRecordListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAllRecordList(HatchRecordData.Builder builderForValue) {
            if (this.allRecordListBuilder_ == null) {
               this.ensureAllRecordListIsMutable();
               this.allRecordList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordList(int index, HatchRecordData.Builder builderForValue) {
            if (this.allRecordListBuilder_ == null) {
               this.ensureAllRecordListIsMutable();
               this.allRecordList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.allRecordListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAllRecordList(Iterable<? extends HatchRecordData> values) {
            if (this.allRecordListBuilder_ == null) {
               this.ensureAllRecordListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.allRecordList_);
               this.onChanged();
            } else {
               this.allRecordListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAllRecordList() {
            if (this.allRecordListBuilder_ == null) {
               this.allRecordList_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.allRecordListBuilder_.clear();
            }

            return this;
         }

         public Builder removeAllRecordList(int index) {
            if (this.allRecordListBuilder_ == null) {
               this.ensureAllRecordListIsMutable();
               this.allRecordList_.remove(index);
               this.onChanged();
            } else {
               this.allRecordListBuilder_.remove(index);
            }

            return this;
         }

         public HatchRecordData.Builder getAllRecordListBuilder(int index) {
            return (HatchRecordData.Builder)this.getAllRecordListFieldBuilder().getBuilder(index);
         }

         public HatchRecordDataOrBuilder getAllRecordListOrBuilder(int index) {
            return this.allRecordListBuilder_ == null ? (HatchRecordDataOrBuilder)this.allRecordList_.get(index) : (HatchRecordDataOrBuilder)this.allRecordListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HatchRecordDataOrBuilder> getAllRecordListOrBuilderList() {
            return this.allRecordListBuilder_ != null ? this.allRecordListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.allRecordList_);
         }

         public HatchRecordData.Builder addAllRecordListBuilder() {
            return (HatchRecordData.Builder)this.getAllRecordListFieldBuilder().addBuilder(GodBeastMsg.HatchRecordData.getDefaultInstance());
         }

         public HatchRecordData.Builder addAllRecordListBuilder(int index) {
            return (HatchRecordData.Builder)this.getAllRecordListFieldBuilder().addBuilder(index, GodBeastMsg.HatchRecordData.getDefaultInstance());
         }

         public List<HatchRecordData.Builder> getAllRecordListBuilderList() {
            return this.getAllRecordListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HatchRecordData, HatchRecordData.Builder, HatchRecordDataOrBuilder> getAllRecordListFieldBuilder() {
            if (this.allRecordListBuilder_ == null) {
               this.allRecordListBuilder_ = new RepeatedFieldBuilderV3(this.allRecordList_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.allRecordList_ = null;
            }

            return this.allRecordListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_HatchRecordList_21642 extends GeneratedMessageV3 implements S2C_HatchRecordList_21642OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDLIST_FIELD_NUMBER = 1;
      private List<HatchRecordData> recordList_;
      private byte memoizedIsInitialized;
      private static final S2C_HatchRecordList_21642 DEFAULT_INSTANCE = new S2C_HatchRecordList_21642();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HatchRecordList_21642> PARSER = new AbstractParser<S2C_HatchRecordList_21642>() {
         public S2C_HatchRecordList_21642 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HatchRecordList_21642(input, extensionRegistry);
         }
      };

      private S2C_HatchRecordList_21642(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HatchRecordList_21642() {
         this.memoizedIsInitialized = -1;
         this.recordList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HatchRecordList_21642();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HatchRecordList_21642(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.recordList_.add(input.readMessage(GodBeastMsg.HatchRecordData.PARSER, extensionRegistry));
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchRecordList_21642.class, Builder.class);
      }

      public List<HatchRecordData> getRecordListList() {
         return this.recordList_;
      }

      public List<? extends HatchRecordDataOrBuilder> getRecordListOrBuilderList() {
         return this.recordList_;
      }

      public int getRecordListCount() {
         return this.recordList_.size();
      }

      public HatchRecordData getRecordList(int index) {
         return (HatchRecordData)this.recordList_.get(index);
      }

      public HatchRecordDataOrBuilder getRecordListOrBuilder(int index) {
         return (HatchRecordDataOrBuilder)this.recordList_.get(index);
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
         } else if (!(obj instanceof S2C_HatchRecordList_21642)) {
            return super.equals(obj);
         } else {
            S2C_HatchRecordList_21642 other = (S2C_HatchRecordList_21642)obj;
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

      public static S2C_HatchRecordList_21642 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21642)PARSER.parseFrom(data);
      }

      public static S2C_HatchRecordList_21642 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21642)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchRecordList_21642 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21642)PARSER.parseFrom(data);
      }

      public static S2C_HatchRecordList_21642 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21642)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchRecordList_21642 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21642)PARSER.parseFrom(data);
      }

      public static S2C_HatchRecordList_21642 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HatchRecordList_21642)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HatchRecordList_21642 parseFrom(InputStream input) throws IOException {
         return (S2C_HatchRecordList_21642)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchRecordList_21642 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchRecordList_21642)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchRecordList_21642 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HatchRecordList_21642)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HatchRecordList_21642 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchRecordList_21642)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HatchRecordList_21642 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HatchRecordList_21642)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HatchRecordList_21642 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HatchRecordList_21642)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HatchRecordList_21642 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HatchRecordList_21642 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HatchRecordList_21642> parser() {
         return PARSER;
      }

      public Parser<S2C_HatchRecordList_21642> getParserForType() {
         return PARSER;
      }

      public S2C_HatchRecordList_21642 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HatchRecordList_21642OrBuilder {
         private int bitField0_;
         private List<HatchRecordData> recordList_;
         private RepeatedFieldBuilderV3<HatchRecordData, HatchRecordData.Builder, HatchRecordDataOrBuilder> recordListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HatchRecordList_21642.class, Builder.class);
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
            if (GodBeastMsg.S2C_HatchRecordList_21642.alwaysUseFieldBuilders) {
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
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_HatchRecordList_21642_descriptor;
         }

         public S2C_HatchRecordList_21642 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_HatchRecordList_21642.getDefaultInstance();
         }

         public S2C_HatchRecordList_21642 build() {
            S2C_HatchRecordList_21642 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HatchRecordList_21642 buildPartial() {
            S2C_HatchRecordList_21642 result = new S2C_HatchRecordList_21642(this);
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
            if (other instanceof S2C_HatchRecordList_21642) {
               return this.mergeFrom((S2C_HatchRecordList_21642)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HatchRecordList_21642 other) {
            if (other == GodBeastMsg.S2C_HatchRecordList_21642.getDefaultInstance()) {
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
                     this.recordListBuilder_ = GodBeastMsg.S2C_HatchRecordList_21642.alwaysUseFieldBuilders ? this.getRecordListFieldBuilder() : null;
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
            S2C_HatchRecordList_21642 parsedMessage = null;

            try {
               parsedMessage = (S2C_HatchRecordList_21642)GodBeastMsg.S2C_HatchRecordList_21642.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HatchRecordList_21642)e.getUnfinishedMessage();
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

         public List<HatchRecordData> getRecordListList() {
            return this.recordListBuilder_ == null ? Collections.unmodifiableList(this.recordList_) : this.recordListBuilder_.getMessageList();
         }

         public int getRecordListCount() {
            return this.recordListBuilder_ == null ? this.recordList_.size() : this.recordListBuilder_.getCount();
         }

         public HatchRecordData getRecordList(int index) {
            return this.recordListBuilder_ == null ? (HatchRecordData)this.recordList_.get(index) : (HatchRecordData)this.recordListBuilder_.getMessage(index);
         }

         public Builder setRecordList(int index, HatchRecordData value) {
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

         public Builder setRecordList(int index, HatchRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(HatchRecordData value) {
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

         public Builder addRecordList(int index, HatchRecordData value) {
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

         public Builder addRecordList(HatchRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordList(int index, HatchRecordData.Builder builderForValue) {
            if (this.recordListBuilder_ == null) {
               this.ensureRecordListIsMutable();
               this.recordList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordList(Iterable<? extends HatchRecordData> values) {
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

         public HatchRecordData.Builder getRecordListBuilder(int index) {
            return (HatchRecordData.Builder)this.getRecordListFieldBuilder().getBuilder(index);
         }

         public HatchRecordDataOrBuilder getRecordListOrBuilder(int index) {
            return this.recordListBuilder_ == null ? (HatchRecordDataOrBuilder)this.recordList_.get(index) : (HatchRecordDataOrBuilder)this.recordListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HatchRecordDataOrBuilder> getRecordListOrBuilderList() {
            return this.recordListBuilder_ != null ? this.recordListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordList_);
         }

         public HatchRecordData.Builder addRecordListBuilder() {
            return (HatchRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(GodBeastMsg.HatchRecordData.getDefaultInstance());
         }

         public HatchRecordData.Builder addRecordListBuilder(int index) {
            return (HatchRecordData.Builder)this.getRecordListFieldBuilder().addBuilder(index, GodBeastMsg.HatchRecordData.getDefaultInstance());
         }

         public List<HatchRecordData.Builder> getRecordListBuilderList() {
            return this.getRecordListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HatchRecordData, HatchRecordData.Builder, HatchRecordDataOrBuilder> getRecordListFieldBuilder() {
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

   public static final class HatchRecordData extends GeneratedMessageV3 implements HatchRecordDataOrBuilder {
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
      public static final int RECTIME_FIELD_NUMBER = 6;
      private long recTime_;
      public static final int SCOREID_FIELD_NUMBER = 7;
      private int scoreId_;
      private byte memoizedIsInitialized;
      private static final HatchRecordData DEFAULT_INSTANCE = new HatchRecordData();
      /** @deprecated */
      @Deprecated
      public static final Parser<HatchRecordData> PARSER = new AbstractParser<HatchRecordData>() {
         public HatchRecordData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HatchRecordData(input, extensionRegistry);
         }
      };

      private HatchRecordData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HatchRecordData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HatchRecordData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HatchRecordData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 48:
                        this.bitField0_ |= 32;
                        this.recTime_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.scoreId_ = input.readInt32();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(HatchRecordData.class, Builder.class);
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

      public boolean hasRecTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getRecTime() {
         return this.recTime_;
      }

      public boolean hasScoreId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getScoreId() {
         return this.scoreId_;
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
         } else if (!this.hasRecTime()) {
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

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.recTime_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.scoreId_);
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

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.recTime_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.scoreId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HatchRecordData)) {
            return super.equals(obj);
         } else {
            HatchRecordData other = (HatchRecordData)obj;
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
            } else if (this.hasRecTime() != other.hasRecTime()) {
               return false;
            } else if (this.hasRecTime() && this.getRecTime() != other.getRecTime()) {
               return false;
            } else if (this.hasScoreId() != other.hasScoreId()) {
               return false;
            } else if (this.hasScoreId() && this.getScoreId() != other.getScoreId()) {
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

            if (this.hasRecTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getRecTime());
            }

            if (this.hasScoreId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getScoreId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HatchRecordData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HatchRecordData)PARSER.parseFrom(data);
      }

      public static HatchRecordData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HatchRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HatchRecordData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HatchRecordData)PARSER.parseFrom(data);
      }

      public static HatchRecordData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HatchRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HatchRecordData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HatchRecordData)PARSER.parseFrom(data);
      }

      public static HatchRecordData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HatchRecordData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HatchRecordData parseFrom(InputStream input) throws IOException {
         return (HatchRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HatchRecordData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HatchRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HatchRecordData parseDelimitedFrom(InputStream input) throws IOException {
         return (HatchRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HatchRecordData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HatchRecordData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HatchRecordData parseFrom(CodedInputStream input) throws IOException {
         return (HatchRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HatchRecordData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HatchRecordData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HatchRecordData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HatchRecordData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HatchRecordData> parser() {
         return PARSER;
      }

      public Parser<HatchRecordData> getParserForType() {
         return PARSER;
      }

      public HatchRecordData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HatchRecordDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private Object playerName_;
         private int resourceType_;
         private int resourceId_;
         private int resourceNum_;
         private long recTime_;
         private int scoreId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_fieldAccessorTable.ensureFieldAccessorsInitialized(HatchRecordData.class, Builder.class);
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
            if (GodBeastMsg.HatchRecordData.alwaysUseFieldBuilders) {
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
            this.recTime_ = 0L;
            this.bitField0_ &= -33;
            this.scoreId_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_HatchRecordData_descriptor;
         }

         public HatchRecordData getDefaultInstanceForType() {
            return GodBeastMsg.HatchRecordData.getDefaultInstance();
         }

         public HatchRecordData build() {
            HatchRecordData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HatchRecordData buildPartial() {
            HatchRecordData result = new HatchRecordData(this);
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

            if ((from_bitField0_ & 32) != 0) {
               result.recTime_ = this.recTime_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.scoreId_ = this.scoreId_;
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
            if (other instanceof HatchRecordData) {
               return this.mergeFrom((HatchRecordData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HatchRecordData other) {
            if (other == GodBeastMsg.HatchRecordData.getDefaultInstance()) {
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

               if (other.hasRecTime()) {
                  this.setRecTime(other.getRecTime());
               }

               if (other.hasScoreId()) {
                  this.setScoreId(other.getScoreId());
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
            } else if (!this.hasResourceNum()) {
               return false;
            } else {
               return this.hasRecTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HatchRecordData parsedMessage = null;

            try {
               parsedMessage = (HatchRecordData)GodBeastMsg.HatchRecordData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HatchRecordData)e.getUnfinishedMessage();
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
            this.playerName_ = GodBeastMsg.HatchRecordData.getDefaultInstance().getPlayerName();
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

         public boolean hasRecTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getRecTime() {
            return this.recTime_;
         }

         public Builder setRecTime(long value) {
            this.bitField0_ |= 32;
            this.recTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecTime() {
            this.bitField0_ &= -33;
            this.recTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasScoreId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getScoreId() {
            return this.scoreId_;
         }

         public Builder setScoreId(int value) {
            this.bitField0_ |= 64;
            this.scoreId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScoreId() {
            this.bitField0_ &= -65;
            this.scoreId_ = 0;
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

   public static final class C2S_GodBeastLock_21643 extends GeneratedMessageV3 implements C2S_GodBeastLock_21643OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int ITEMCODE_FIELD_NUMBER = 2;
      private int itemCode_;
      public static final int TYPE_FIELD_NUMBER = 3;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_GodBeastLock_21643 DEFAULT_INSTANCE = new C2S_GodBeastLock_21643();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GodBeastLock_21643> PARSER = new AbstractParser<C2S_GodBeastLock_21643>() {
         public C2S_GodBeastLock_21643 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GodBeastLock_21643(input, extensionRegistry);
         }
      };

      private C2S_GodBeastLock_21643(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GodBeastLock_21643() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GodBeastLock_21643();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GodBeastLock_21643(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastLock_21643.class, Builder.class);
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.itemCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.itemCode_);
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
         } else if (!(obj instanceof C2S_GodBeastLock_21643)) {
            return super.equals(obj);
         } else {
            C2S_GodBeastLock_21643 other = (C2S_GodBeastLock_21643)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasItemCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemCode();
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

      public static C2S_GodBeastLock_21643 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLock_21643)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastLock_21643 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLock_21643)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastLock_21643 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLock_21643)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastLock_21643 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLock_21643)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastLock_21643 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLock_21643)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastLock_21643 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastLock_21643)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastLock_21643 parseFrom(InputStream input) throws IOException {
         return (C2S_GodBeastLock_21643)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastLock_21643 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastLock_21643)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastLock_21643 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GodBeastLock_21643)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GodBeastLock_21643 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastLock_21643)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastLock_21643 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GodBeastLock_21643)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastLock_21643 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastLock_21643)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GodBeastLock_21643 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GodBeastLock_21643 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GodBeastLock_21643> parser() {
         return PARSER;
      }

      public Parser<C2S_GodBeastLock_21643> getParserForType() {
         return PARSER;
      }

      public C2S_GodBeastLock_21643 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GodBeastLock_21643OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int itemCode_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastLock_21643.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_GodBeastLock_21643.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.itemCode_ = 0;
            this.bitField0_ &= -3;
            this.type_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastLock_21643_descriptor;
         }

         public C2S_GodBeastLock_21643 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_GodBeastLock_21643.getDefaultInstance();
         }

         public C2S_GodBeastLock_21643 build() {
            C2S_GodBeastLock_21643 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GodBeastLock_21643 buildPartial() {
            C2S_GodBeastLock_21643 result = new C2S_GodBeastLock_21643(this);
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
            if (other instanceof C2S_GodBeastLock_21643) {
               return this.mergeFrom((C2S_GodBeastLock_21643)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GodBeastLock_21643 other) {
            if (other == GodBeastMsg.C2S_GodBeastLock_21643.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
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
            return this.hasType();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GodBeastLock_21643 parsedMessage = null;

            try {
               parsedMessage = (C2S_GodBeastLock_21643)GodBeastMsg.C2S_GodBeastLock_21643.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GodBeastLock_21643)e.getUnfinishedMessage();
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

   public static final class S2C_GodBeastLock_21644 extends GeneratedMessageV3 implements S2C_GodBeastLock_21644OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_GodBeastLock_21644 DEFAULT_INSTANCE = new S2C_GodBeastLock_21644();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GodBeastLock_21644> PARSER = new AbstractParser<S2C_GodBeastLock_21644>() {
         public S2C_GodBeastLock_21644 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GodBeastLock_21644(input, extensionRegistry);
         }
      };

      private S2C_GodBeastLock_21644(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GodBeastLock_21644() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GodBeastLock_21644();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GodBeastLock_21644(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastLock_21644.class, Builder.class);
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
         } else if (!(obj instanceof S2C_GodBeastLock_21644)) {
            return super.equals(obj);
         } else {
            S2C_GodBeastLock_21644 other = (S2C_GodBeastLock_21644)obj;
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

      public static S2C_GodBeastLock_21644 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLock_21644)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastLock_21644 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLock_21644)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastLock_21644 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLock_21644)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastLock_21644 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLock_21644)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastLock_21644 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLock_21644)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastLock_21644 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastLock_21644)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastLock_21644 parseFrom(InputStream input) throws IOException {
         return (S2C_GodBeastLock_21644)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastLock_21644 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastLock_21644)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastLock_21644 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GodBeastLock_21644)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GodBeastLock_21644 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastLock_21644)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastLock_21644 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GodBeastLock_21644)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastLock_21644 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastLock_21644)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GodBeastLock_21644 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GodBeastLock_21644 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GodBeastLock_21644> parser() {
         return PARSER;
      }

      public Parser<S2C_GodBeastLock_21644> getParserForType() {
         return PARSER;
      }

      public S2C_GodBeastLock_21644 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GodBeastLock_21644OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastLock_21644.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_GodBeastLock_21644.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastLock_21644_descriptor;
         }

         public S2C_GodBeastLock_21644 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_GodBeastLock_21644.getDefaultInstance();
         }

         public S2C_GodBeastLock_21644 build() {
            S2C_GodBeastLock_21644 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GodBeastLock_21644 buildPartial() {
            S2C_GodBeastLock_21644 result = new S2C_GodBeastLock_21644(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_GodBeastLock_21644) {
               return this.mergeFrom((S2C_GodBeastLock_21644)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GodBeastLock_21644 other) {
            if (other == GodBeastMsg.S2C_GodBeastLock_21644.getDefaultInstance()) {
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
            S2C_GodBeastLock_21644 parsedMessage = null;

            try {
               parsedMessage = (S2C_GodBeastLock_21644)GodBeastMsg.S2C_GodBeastLock_21644.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GodBeastLock_21644)e.getUnfinishedMessage();
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

   public static final class C2S_GodBeastBuyEgg_21645 extends GeneratedMessageV3 implements C2S_GodBeastBuyEgg_21645OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GodBeastBuyEgg_21645 DEFAULT_INSTANCE = new C2S_GodBeastBuyEgg_21645();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GodBeastBuyEgg_21645> PARSER = new AbstractParser<C2S_GodBeastBuyEgg_21645>() {
         public C2S_GodBeastBuyEgg_21645 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GodBeastBuyEgg_21645(input, extensionRegistry);
         }
      };

      private C2S_GodBeastBuyEgg_21645(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GodBeastBuyEgg_21645() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GodBeastBuyEgg_21645();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GodBeastBuyEgg_21645(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastBuyEgg_21645.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GodBeastBuyEgg_21645)) {
            return super.equals(obj);
         } else {
            C2S_GodBeastBuyEgg_21645 other = (C2S_GodBeastBuyEgg_21645)obj;
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

      public static C2S_GodBeastBuyEgg_21645 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastBuyEgg_21645)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastBuyEgg_21645 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastBuyEgg_21645)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastBuyEgg_21645 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastBuyEgg_21645)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastBuyEgg_21645 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastBuyEgg_21645)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastBuyEgg_21645 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GodBeastBuyEgg_21645)PARSER.parseFrom(data);
      }

      public static C2S_GodBeastBuyEgg_21645 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GodBeastBuyEgg_21645)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GodBeastBuyEgg_21645 parseFrom(InputStream input) throws IOException {
         return (C2S_GodBeastBuyEgg_21645)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastBuyEgg_21645 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastBuyEgg_21645)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastBuyEgg_21645 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GodBeastBuyEgg_21645)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GodBeastBuyEgg_21645 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastBuyEgg_21645)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GodBeastBuyEgg_21645 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GodBeastBuyEgg_21645)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GodBeastBuyEgg_21645 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GodBeastBuyEgg_21645)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GodBeastBuyEgg_21645 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GodBeastBuyEgg_21645 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GodBeastBuyEgg_21645> parser() {
         return PARSER;
      }

      public Parser<C2S_GodBeastBuyEgg_21645> getParserForType() {
         return PARSER;
      }

      public C2S_GodBeastBuyEgg_21645 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GodBeastBuyEgg_21645OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GodBeastBuyEgg_21645.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.C2S_GodBeastBuyEgg_21645.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_C2S_GodBeastBuyEgg_21645_descriptor;
         }

         public C2S_GodBeastBuyEgg_21645 getDefaultInstanceForType() {
            return GodBeastMsg.C2S_GodBeastBuyEgg_21645.getDefaultInstance();
         }

         public C2S_GodBeastBuyEgg_21645 build() {
            C2S_GodBeastBuyEgg_21645 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GodBeastBuyEgg_21645 buildPartial() {
            C2S_GodBeastBuyEgg_21645 result = new C2S_GodBeastBuyEgg_21645(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_GodBeastBuyEgg_21645) {
               return this.mergeFrom((C2S_GodBeastBuyEgg_21645)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GodBeastBuyEgg_21645 other) {
            if (other == GodBeastMsg.C2S_GodBeastBuyEgg_21645.getDefaultInstance()) {
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
            C2S_GodBeastBuyEgg_21645 parsedMessage = null;

            try {
               parsedMessage = (C2S_GodBeastBuyEgg_21645)GodBeastMsg.C2S_GodBeastBuyEgg_21645.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GodBeastBuyEgg_21645)e.getUnfinishedMessage();
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

   public static final class S2C_GodBeastBuyEgg_21646 extends GeneratedMessageV3 implements S2C_GodBeastBuyEgg_21646OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EGGBUYNUM_FIELD_NUMBER = 1;
      private int eggBuyNum_;
      private byte memoizedIsInitialized;
      private static final S2C_GodBeastBuyEgg_21646 DEFAULT_INSTANCE = new S2C_GodBeastBuyEgg_21646();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GodBeastBuyEgg_21646> PARSER = new AbstractParser<S2C_GodBeastBuyEgg_21646>() {
         public S2C_GodBeastBuyEgg_21646 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GodBeastBuyEgg_21646(input, extensionRegistry);
         }
      };

      private S2C_GodBeastBuyEgg_21646(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GodBeastBuyEgg_21646() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GodBeastBuyEgg_21646();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GodBeastBuyEgg_21646(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.eggBuyNum_ = input.readInt32();
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
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastBuyEgg_21646.class, Builder.class);
      }

      public boolean hasEggBuyNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEggBuyNum() {
         return this.eggBuyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEggBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.eggBuyNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.eggBuyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GodBeastBuyEgg_21646)) {
            return super.equals(obj);
         } else {
            S2C_GodBeastBuyEgg_21646 other = (S2C_GodBeastBuyEgg_21646)obj;
            if (this.hasEggBuyNum() != other.hasEggBuyNum()) {
               return false;
            } else if (this.hasEggBuyNum() && this.getEggBuyNum() != other.getEggBuyNum()) {
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
            if (this.hasEggBuyNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEggBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastBuyEgg_21646)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastBuyEgg_21646)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastBuyEgg_21646)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastBuyEgg_21646)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GodBeastBuyEgg_21646)PARSER.parseFrom(data);
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GodBeastBuyEgg_21646)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(InputStream input) throws IOException {
         return (S2C_GodBeastBuyEgg_21646)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastBuyEgg_21646)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastBuyEgg_21646 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GodBeastBuyEgg_21646)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GodBeastBuyEgg_21646 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastBuyEgg_21646)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GodBeastBuyEgg_21646)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GodBeastBuyEgg_21646 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GodBeastBuyEgg_21646)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GodBeastBuyEgg_21646 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GodBeastBuyEgg_21646 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GodBeastBuyEgg_21646> parser() {
         return PARSER;
      }

      public Parser<S2C_GodBeastBuyEgg_21646> getParserForType() {
         return PARSER;
      }

      public S2C_GodBeastBuyEgg_21646 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GodBeastBuyEgg_21646OrBuilder {
         private int bitField0_;
         private int eggBuyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GodBeastBuyEgg_21646.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GodBeastMsg.S2C_GodBeastBuyEgg_21646.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.eggBuyNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GodBeastMsg.internal_static_godBeast_com_gzbz_protobuf_S2C_GodBeastBuyEgg_21646_descriptor;
         }

         public S2C_GodBeastBuyEgg_21646 getDefaultInstanceForType() {
            return GodBeastMsg.S2C_GodBeastBuyEgg_21646.getDefaultInstance();
         }

         public S2C_GodBeastBuyEgg_21646 build() {
            S2C_GodBeastBuyEgg_21646 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GodBeastBuyEgg_21646 buildPartial() {
            S2C_GodBeastBuyEgg_21646 result = new S2C_GodBeastBuyEgg_21646(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.eggBuyNum_ = this.eggBuyNum_;
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
            if (other instanceof S2C_GodBeastBuyEgg_21646) {
               return this.mergeFrom((S2C_GodBeastBuyEgg_21646)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GodBeastBuyEgg_21646 other) {
            if (other == GodBeastMsg.S2C_GodBeastBuyEgg_21646.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEggBuyNum()) {
                  this.setEggBuyNum(other.getEggBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEggBuyNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GodBeastBuyEgg_21646 parsedMessage = null;

            try {
               parsedMessage = (S2C_GodBeastBuyEgg_21646)GodBeastMsg.S2C_GodBeastBuyEgg_21646.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GodBeastBuyEgg_21646)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEggBuyNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEggBuyNum() {
            return this.eggBuyNum_;
         }

         public Builder setEggBuyNum(int value) {
            this.bitField0_ |= 1;
            this.eggBuyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEggBuyNum() {
            this.bitField0_ &= -2;
            this.eggBuyNum_ = 0;
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

   public interface C2S_ChangeGodBeast_21621OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();

      boolean hasTargetGodBeastId();

      int getTargetGodBeastId();
   }

   public interface C2S_DecomposeGodBeast_21625OrBuilder extends MessageOrBuilder {
      List<Integer> getItemCodeList();

      int getItemCodeCount();

      int getItemCode(int index);
   }

   public interface C2S_GetRecScoreReward_21634OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GodBeastBuyEgg_21645OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GodBeastHatchInfo_21601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GodBeastHatch_21603OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_GodBeastLock_21643OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();

      boolean hasType();

      int getType();
   }

   public interface C2S_GodBeastLvUp_21605OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();
   }

   public interface C2S_GodBeastStarUp_21607OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();

      List<CommonMsg.MapDataII> getCostItemsList();

      CommonMsg.MapDataII getCostItems(int index);

      int getCostItemsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getCostItemsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getCostItemsOrBuilder(int index);
   }

   public interface C2S_HatchRecordList_21640OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_InheritGodBeast_21627OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();

      boolean hasCostItemCode();

      int getCostItemCode();

      boolean hasDevelop();

      boolean getDevelop();

      boolean hasAptitude();

      boolean getAptitude();
   }

   public interface C2S_LearnAttrSkill_21613OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();

      boolean hasSlot();

      int getSlot();

      boolean hasSkillId();

      int getSkillId();
   }

   public interface C2S_LearnPassiveSkill_21609OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();

      boolean hasSkillId();

      int getSkillId();
   }

   public interface C2S_NoUseGodBeast_21619OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_NoticeInfo_21636OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_NoticePointUnlock_21638OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RecScoreReward_21632OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_ResetAttrSkill_21615OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();

      boolean hasSlot();

      int getSlot();
   }

   public interface C2S_ResetGodBeast_21623OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();
   }

   public interface C2S_ResetPassiveSkill_21611OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasItemCode();

      int getItemCode();
   }

   public interface C2S_TaskList_21629OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_UseGodBeast_21617OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasUseItemCode();

      int getUseItemCode();

      boolean hasUseHeroCode();

      int getUseHeroCode();
   }

   public interface GodBeastTaskInfoOrBuilder extends MessageOrBuilder {
      boolean hasTask();

      CommonMsg.Task getTask();

      CommonMsg.TaskOrBuilder getTaskOrBuilder();

      boolean hasCompleteNum();

      int getCompleteNum();

      boolean hasTaskScore();

      int getTaskScore();
   }

   public interface HatchRecordDataOrBuilder extends MessageOrBuilder {
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

      boolean hasRecTime();

      long getRecTime();

      boolean hasScoreId();

      int getScoreId();
   }

   public interface S2C_ChangeGodBeast_21622OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_DecomposeGodBeast_21626OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_GetRecScoreReward_21635OrBuilder extends MessageOrBuilder {
      List<Integer> getRecIdList();

      int getRecIdCount();

      int getRecId(int index);

      boolean hasNextResetTime();

      long getNextResetTime();
   }

   public interface S2C_GodBeastBuyEgg_21646OrBuilder extends MessageOrBuilder {
      boolean hasEggBuyNum();

      int getEggBuyNum();
   }

   public interface S2C_GodBeastHatchInfo_21602OrBuilder extends MessageOrBuilder {
      boolean hasHatchNum();

      long getHatchNum();

      boolean hasDailyHatchNum();

      int getDailyHatchNum();

      boolean hasEggBuyNum();

      int getEggBuyNum();
   }

   public interface S2C_GodBeastHatch_21604OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasHatchNum();

      long getHatchNum();

      boolean hasDailyHatchNum();

      int getDailyHatchNum();
   }

   public interface S2C_GodBeastLock_21644OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_GodBeastLvUp_21606OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_GodBeastStarUp_21608OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_HatchRecordList_21641OrBuilder extends MessageOrBuilder {
      List<HatchRecordData> getPlayerRecordListList();

      HatchRecordData getPlayerRecordList(int index);

      int getPlayerRecordListCount();

      List<? extends HatchRecordDataOrBuilder> getPlayerRecordListOrBuilderList();

      HatchRecordDataOrBuilder getPlayerRecordListOrBuilder(int index);

      List<HatchRecordData> getAllRecordListList();

      HatchRecordData getAllRecordList(int index);

      int getAllRecordListCount();

      List<? extends HatchRecordDataOrBuilder> getAllRecordListOrBuilderList();

      HatchRecordDataOrBuilder getAllRecordListOrBuilder(int index);
   }

   public interface S2C_HatchRecordList_21642OrBuilder extends MessageOrBuilder {
      List<HatchRecordData> getRecordListList();

      HatchRecordData getRecordList(int index);

      int getRecordListCount();

      List<? extends HatchRecordDataOrBuilder> getRecordListOrBuilderList();

      HatchRecordDataOrBuilder getRecordListOrBuilder(int index);
   }

   public interface S2C_InheritGodBeast_21628OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_LearnAttrSkill_21614OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_LearnPassiveSkill_21610OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_NoUseGodBeast_21620OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_NoticeInfo_21637OrBuilder extends MessageOrBuilder {
      List<Integer> getUnlockIdList();

      int getUnlockIdCount();

      int getUnlockId(int index);
   }

   public interface S2C_NoticePointUnlock_21639OrBuilder extends MessageOrBuilder {
      List<Integer> getUnlockIdList();

      int getUnlockIdCount();

      int getUnlockId(int index);
   }

   public interface S2C_RecScoreReward_21633OrBuilder extends MessageOrBuilder {
      List<Integer> getRecIdList();

      int getRecIdCount();

      int getRecId(int index);
   }

   public interface S2C_ResetAttrSkill_21616OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ResetGodBeast_21624OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ResetPassiveSkill_21612OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_TaskList_21630OrBuilder extends MessageOrBuilder {
      List<GodBeastTaskInfo> getGodBeastTaskInfoList();

      GodBeastTaskInfo getGodBeastTaskInfo(int index);

      int getGodBeastTaskInfoCount();

      List<? extends GodBeastTaskInfoOrBuilder> getGodBeastTaskInfoOrBuilderList();

      GodBeastTaskInfoOrBuilder getGodBeastTaskInfoOrBuilder(int index);
   }

   public interface S2C_TaskNotice_21631OrBuilder extends MessageOrBuilder {
      boolean hasGodBeastTaskInfo();

      GodBeastTaskInfo getGodBeastTaskInfo();

      GodBeastTaskInfoOrBuilder getGodBeastTaskInfoOrBuilder();
   }

   public interface S2C_UseGodBeast_21618OrBuilder extends MessageOrBuilder {
   }
}
