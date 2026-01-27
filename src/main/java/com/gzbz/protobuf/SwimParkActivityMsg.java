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
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SwimParkActivityMsg {
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private SwimParkActivityMsg() {
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
      String[] descriptorData = new String[]{"\n\u0016SwimParkActivity.proto\u0012\"swimParkActivity.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"\u0018\n\u0016C2S_ActivityInfo_16501\"K\n\u0016S2C_ActivityInfo_16502\u0012\u0017\n\u000factivityOpenDay\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010severActivityDay\u0018\u0002 \u0002(\u0005\"X\n\nDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"c\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\"\u0018\n\u0016C2S_LuckDrawInfo_16503\"Ö\u0001\n\u0016S2C_LuckDrawInfo_16504\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bhadRewardId\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bstagEndTime\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000blotterStage\u0018\u0006 \u0002(\u0005\u0012\u000f\n\u0007fancyId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\u001e\n\u000eC2S_Draw_16505\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u00ad\u0001\n\u000eS2C_Draw_16506\u0012\u0011\n\tdrawTimes\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0003(\u0005\u0012\u0012\n\nrecruitNum\u0018\u0004 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0005 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bisHaveFancy\u0018\u0006 \u0001(\b\u0012\u0010\n\btargetId\u0018\u0007 \u0002(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\b \u0002(\u0005\"\"\n\u0014C2S_OpenReward_16507\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\"\n\u0014S2C_OpenReward_16508\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"\u0016\n\u0014C2S_DrawRecord_16509\"X\n\u0014S2C_DrawRecord_16510\u0012@\n\bmyRecrod\u0018\u0001 \u0003(\u000b2..swimParkActivity.com.gzbz.protobuf.DrawRecord\"\u001d\n\u000eC2S_Pray_16521\u0012\u000b\n\u0003idx\u0018\u0001 \u0002(\u0005\".\n\u000eS2C_Pray_16522\u0012\u000f\n\u0007prayNum\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003idx\u0018\u0002 \u0002(\u0005\"N\n\u0018S2C_PrayTaskNotify_16524\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"4\n\u0012S2C_PrayInfo_16526\u0012\u000f\n\u0007prayNum\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005count\u0018\u0002 \u0003(\u0005\"L\n\u0016S2C_PrayTaskList_16528\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u001f\n\u001dC2S_LampRiddleTotalInfo_16553\"`\n\u001dS2C_LampRiddleTotalInfo_16554\u0012\u0012\n\ngotRewards\u0018\u0001 \u0003(\u0005\u0012\u0015\n\rstageRecharge\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fstageEndTime\u0018\u0003 \u0002(\u0003\"5\n!C2S_ReceiveLampRiddleReward_16555\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"\u0019\n\u0017C2S_WineTotalInfo_16556\"É\u0001\n\u0017S2C_WineTotalInfo_16557\u0012\u0016\n\u000eunlockStageNum\u0018\u0001 \u0002(\u0005\u0012\u001b\n\u0013canReceiveRewardIds\u0018\u0002 \u0003(\u0005\u0012\u001b\n\u0013hasReceiveRewardIds\u0018\u0003 \u0003(\u0005\u0012\\\n\u0017nextUnlockReceiveReward\u0018\u0004 \u0003(\u000b2;.swimParkActivity.com.gzbz.protobuf.NextUnlockReceiveReward\"=\n\u0017NextUnlockReceiveReward\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bprogress\u0018\u0002 \u0002(\u0001\"/\n\u001bC2S_ReceiveWineReward_16558\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\")\n\u0015C2S_FancyReward_16559\u0012\u0010\n\btargetId\u0018\u0001 \u0002(\u0005\"9\n\u0015S2C_FancyReward_16560\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"\u001c\n\u001aC2S_ServerDrawRecord_16561\"h\n\u001aS2C_ServerDrawRecord_16562\u0012J\n\fserverRecord\u0018\u0001 \u0003(\u000b24.swimParkActivity.com.gzbz.protobuf.ServerDrawRecordB*\n\u0011com.gzbz.protobufB\u0013SwimParkActivityMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_descriptor, new String[0]);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_descriptor, new String[]{"ActivityOpenDay", "SeverActivityDay"});
      internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_descriptor, new String[0]);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_descriptor, new String[]{"DrawTimes", "HadRewardId", "StagEndTime", "RecruitNum", "SeniorRewards", "LotterStage", "FancyId", "FancyGroupDrawTimes"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_descriptor, new String[]{"Type"});
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_descriptor, new String[]{"DrawTimes", "Id", "RecruitNum", "SeniorNum", "IsHaveFancy", "TargetId", "FancyGroupDrawTimes"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_descriptor, new String[]{"Id"});
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_descriptor, new String[]{"Id"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_descriptor, new String[0]);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_descriptor, new String[]{"MyRecrod"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_descriptor, new String[]{"Idx"});
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_descriptor, new String[]{"PrayNum", "Idx"});
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_descriptor, new String[]{"Task"});
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_descriptor, new String[]{"PrayNum", "Count"});
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_descriptor, new String[]{"Task"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_descriptor, new String[0]);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_descriptor, new String[]{"GotRewards", "StageRecharge", "StageEndTime"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_descriptor, new String[]{"RewardId"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_descriptor, new String[0]);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_descriptor, new String[]{"UnlockStageNum", "CanReceiveRewardIds", "HasReceiveRewardIds", "NextUnlockReceiveReward"});
      internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor, new String[]{"RewardId", "Progress"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_descriptor, new String[]{"RewardId"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_descriptor, new String[]{"TargetId"});
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_descriptor, new String[]{"Result", "TargetId"});
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_descriptor, new String[0]);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_descriptor, new String[]{"ServerRecord"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
   }

   public static final class C2S_ActivityInfo_16501 extends GeneratedMessageV3 implements C2S_ActivityInfo_16501OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_16501 DEFAULT_INSTANCE = new C2S_ActivityInfo_16501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_16501> PARSER = new AbstractParser<C2S_ActivityInfo_16501>() {
         public C2S_ActivityInfo_16501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_16501(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_16501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_16501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_16501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_16501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_16501.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_16501)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_16501 other = (C2S_ActivityInfo_16501)obj;
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

      public static C2S_ActivityInfo_16501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16501)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_16501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_16501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16501)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_16501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_16501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16501)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_16501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_16501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_16501 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_16501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_16501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_16501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_16501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_16501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_16501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_16501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_16501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_16501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_16501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_16501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_16501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_16501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_16501> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_16501> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_16501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_16501OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_16501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_ActivityInfo_16501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ActivityInfo_16501_descriptor;
         }

         public C2S_ActivityInfo_16501 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_ActivityInfo_16501.getDefaultInstance();
         }

         public C2S_ActivityInfo_16501 build() {
            C2S_ActivityInfo_16501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_16501 buildPartial() {
            C2S_ActivityInfo_16501 result = new C2S_ActivityInfo_16501(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ActivityInfo_16501) {
               return this.mergeFrom((C2S_ActivityInfo_16501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_16501 other) {
            if (other == SwimParkActivityMsg.C2S_ActivityInfo_16501.getDefaultInstance()) {
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
            C2S_ActivityInfo_16501 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_16501)SwimParkActivityMsg.C2S_ActivityInfo_16501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_16501)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_16502 extends GeneratedMessageV3 implements S2C_ActivityInfo_16502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACTIVITYOPENDAY_FIELD_NUMBER = 1;
      private int activityOpenDay_;
      public static final int SEVERACTIVITYDAY_FIELD_NUMBER = 2;
      private int severActivityDay_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_16502 DEFAULT_INSTANCE = new S2C_ActivityInfo_16502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_16502> PARSER = new AbstractParser<S2C_ActivityInfo_16502>() {
         public S2C_ActivityInfo_16502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_16502(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_16502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_16502() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_16502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_16502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.activityOpenDay_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.severActivityDay_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_16502.class, Builder.class);
      }

      public boolean hasActivityOpenDay() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getActivityOpenDay() {
         return this.activityOpenDay_;
      }

      public boolean hasSeverActivityDay() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSeverActivityDay() {
         return this.severActivityDay_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasActivityOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSeverActivityDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.activityOpenDay_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.severActivityDay_);
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
               size += CodedOutputStream.computeInt32Size(1, this.activityOpenDay_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.severActivityDay_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_16502)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_16502 other = (S2C_ActivityInfo_16502)obj;
            if (this.hasActivityOpenDay() != other.hasActivityOpenDay()) {
               return false;
            } else if (this.hasActivityOpenDay() && this.getActivityOpenDay() != other.getActivityOpenDay()) {
               return false;
            } else if (this.hasSeverActivityDay() != other.hasSeverActivityDay()) {
               return false;
            } else if (this.hasSeverActivityDay() && this.getSeverActivityDay() != other.getSeverActivityDay()) {
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
            if (this.hasActivityOpenDay()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getActivityOpenDay();
            }

            if (this.hasSeverActivityDay()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSeverActivityDay();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_16502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16502)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_16502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_16502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16502)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_16502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_16502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16502)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_16502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_16502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_16502 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_16502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_16502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_16502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_16502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_16502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_16502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_16502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_16502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_16502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_16502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_16502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_16502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_16502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_16502> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_16502> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_16502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_16502OrBuilder {
         private int bitField0_;
         private int activityOpenDay_;
         private int severActivityDay_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_16502.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_ActivityInfo_16502.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.activityOpenDay_ = 0;
            this.bitField0_ &= -2;
            this.severActivityDay_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ActivityInfo_16502_descriptor;
         }

         public S2C_ActivityInfo_16502 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_ActivityInfo_16502.getDefaultInstance();
         }

         public S2C_ActivityInfo_16502 build() {
            S2C_ActivityInfo_16502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_16502 buildPartial() {
            S2C_ActivityInfo_16502 result = new S2C_ActivityInfo_16502(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.activityOpenDay_ = this.activityOpenDay_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.severActivityDay_ = this.severActivityDay_;
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
            if (other instanceof S2C_ActivityInfo_16502) {
               return this.mergeFrom((S2C_ActivityInfo_16502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_16502 other) {
            if (other == SwimParkActivityMsg.S2C_ActivityInfo_16502.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasActivityOpenDay()) {
                  this.setActivityOpenDay(other.getActivityOpenDay());
               }

               if (other.hasSeverActivityDay()) {
                  this.setSeverActivityDay(other.getSeverActivityDay());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasActivityOpenDay()) {
               return false;
            } else {
               return this.hasSeverActivityDay();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_16502 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_16502)SwimParkActivityMsg.S2C_ActivityInfo_16502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_16502)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasActivityOpenDay() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getActivityOpenDay() {
            return this.activityOpenDay_;
         }

         public Builder setActivityOpenDay(int value) {
            this.bitField0_ |= 1;
            this.activityOpenDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityOpenDay() {
            this.bitField0_ &= -2;
            this.activityOpenDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSeverActivityDay() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSeverActivityDay() {
            return this.severActivityDay_;
         }

         public Builder setSeverActivityDay(int value) {
            this.bitField0_ |= 2;
            this.severActivityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSeverActivityDay() {
            this.bitField0_ &= -3;
            this.severActivityDay_ = 0;
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

   public static final class DrawRecord extends GeneratedMessageV3 implements DrawRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CREATETIME_FIELD_NUMBER = 1;
      private int createTime_;
      public static final int ITEMINFO_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> itemInfo_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final DrawRecord DEFAULT_INSTANCE = new DrawRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<DrawRecord> PARSER = new AbstractParser<DrawRecord>() {
         public DrawRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new DrawRecord(input, extensionRegistry);
         }
      };

      private DrawRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private DrawRecord() {
         this.memoizedIsInitialized = -1;
         this.itemInfo_ = Collections.emptyList();
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new DrawRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private DrawRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.createTime_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.itemInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.itemInfo_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.itemInfo_ = Collections.unmodifiableList(this.itemInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecord.class, Builder.class);
      }

      public boolean hasCreateTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCreateTime() {
         return this.createTime_;
      }

      public List<CommonMsg.ItemInfo> getItemInfoList() {
         return this.itemInfo_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList() {
         return this.itemInfo_;
      }

      public int getItemInfoCount() {
         return this.itemInfo_.size();
      }

      public CommonMsg.ItemInfo getItemInfo(int index) {
         return (CommonMsg.ItemInfo)this.itemInfo_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.itemInfo_.get(index);
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCreateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemInfoCount(); ++i) {
               if (!this.getItemInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.createTime_);
         }

         for(int i = 0; i < this.itemInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.itemInfo_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
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
               size += CodedOutputStream.computeInt32Size(1, this.createTime_);
            }

            for(int i = 0; i < this.itemInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.itemInfo_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof DrawRecord)) {
            return super.equals(obj);
         } else {
            DrawRecord other = (DrawRecord)obj;
            if (this.hasCreateTime() != other.hasCreateTime()) {
               return false;
            } else if (this.hasCreateTime() && this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else if (!this.getItemInfoList().equals(other.getItemInfoList())) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
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
            if (this.hasCreateTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCreateTime();
            }

            if (this.getItemInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemInfoList().hashCode();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static DrawRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data);
      }

      public static DrawRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data);
      }

      public static DrawRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data);
      }

      public static DrawRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (DrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static DrawRecord parseFrom(InputStream input) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DrawRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static DrawRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static DrawRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static DrawRecord parseFrom(CodedInputStream input) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static DrawRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (DrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(DrawRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static DrawRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<DrawRecord> parser() {
         return PARSER;
      }

      public Parser<DrawRecord> getParserForType() {
         return PARSER;
      }

      public DrawRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DrawRecordOrBuilder {
         private int bitField0_;
         private int createTime_;
         private List<CommonMsg.ItemInfo> itemInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemInfoBuilder_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecord.class, Builder.class);
         }

         private Builder() {
            this.itemInfo_ = Collections.emptyList();
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemInfo_ = Collections.emptyList();
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.DrawRecord.alwaysUseFieldBuilders) {
               this.getItemInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.createTime_ = 0;
            this.bitField0_ &= -2;
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.itemInfoBuilder_.clear();
            }

            this.playerName_ = "";
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_DrawRecord_descriptor;
         }

         public DrawRecord getDefaultInstanceForType() {
            return SwimParkActivityMsg.DrawRecord.getDefaultInstance();
         }

         public DrawRecord build() {
            DrawRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public DrawRecord buildPartial() {
            DrawRecord result = new DrawRecord(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.createTime_ = this.createTime_;
               to_bitField0_ |= 1;
            }

            if (this.itemInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.itemInfo_ = Collections.unmodifiableList(this.itemInfo_);
                  this.bitField0_ &= -3;
               }

               result.itemInfo_ = this.itemInfo_;
            } else {
               result.itemInfo_ = this.itemInfoBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof DrawRecord) {
               return this.mergeFrom((DrawRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(DrawRecord other) {
            if (other == SwimParkActivityMsg.DrawRecord.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCreateTime()) {
                  this.setCreateTime(other.getCreateTime());
               }

               if (this.itemInfoBuilder_ == null) {
                  if (!other.itemInfo_.isEmpty()) {
                     if (this.itemInfo_.isEmpty()) {
                        this.itemInfo_ = other.itemInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureItemInfoIsMutable();
                        this.itemInfo_.addAll(other.itemInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.itemInfo_.isEmpty()) {
                  if (this.itemInfoBuilder_.isEmpty()) {
                     this.itemInfoBuilder_.dispose();
                     this.itemInfoBuilder_ = null;
                     this.itemInfo_ = other.itemInfo_;
                     this.bitField0_ &= -3;
                     this.itemInfoBuilder_ = SwimParkActivityMsg.DrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
                  } else {
                     this.itemInfoBuilder_.addAllMessages(other.itemInfo_);
                  }
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCreateTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemInfoCount(); ++i) {
                  if (!this.getItemInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            DrawRecord parsedMessage = null;

            try {
               parsedMessage = (DrawRecord)SwimParkActivityMsg.DrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (DrawRecord)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCreateTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCreateTime() {
            return this.createTime_;
         }

         public Builder setCreateTime(int value) {
            this.bitField0_ |= 1;
            this.createTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateTime() {
            this.bitField0_ &= -2;
            this.createTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.itemInfo_ = new ArrayList(this.itemInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getItemInfoList() {
            return this.itemInfoBuilder_ == null ? Collections.unmodifiableList(this.itemInfo_) : this.itemInfoBuilder_.getMessageList();
         }

         public int getItemInfoCount() {
            return this.itemInfoBuilder_ == null ? this.itemInfo_.size() : this.itemInfoBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItemInfo(int index) {
            return this.itemInfoBuilder_ == null ? (CommonMsg.ItemInfo)this.itemInfo_.get(index) : (CommonMsg.ItemInfo)this.itemInfoBuilder_.getMessage(index);
         }

         public Builder setItemInfo(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfoIsMutable();
               this.itemInfo_.set(index, value);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItemInfo(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfo(CommonMsg.ItemInfo value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(value);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItemInfo(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(index, value);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItemInfo(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfo(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItemInfo(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemInfo_);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItemInfo() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.itemInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeItemInfo(int index) {
            if (this.itemInfoBuilder_ == null) {
               this.ensureItemInfoIsMutable();
               this.itemInfo_.remove(index);
               this.onChanged();
            } else {
               this.itemInfoBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemInfoBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index) {
            return this.itemInfoBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.itemInfo_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList() {
            return this.itemInfoBuilder_ != null ? this.itemInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.itemInfo_);
         }

         public CommonMsg.ItemInfo.Builder addItemInfoBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfoFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemInfoBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfoFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemInfoBuilderList() {
            return this.getItemInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemInfoFieldBuilder() {
            if (this.itemInfoBuilder_ == null) {
               this.itemInfoBuilder_ = new RepeatedFieldBuilderV3(this.itemInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.itemInfo_ = null;
            }

            return this.itemInfoBuilder_;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 4) != 0;
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
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -5;
            this.playerName_ = SwimParkActivityMsg.DrawRecord.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
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

   public static final class ServerDrawRecord extends GeneratedMessageV3 implements ServerDrawRecordOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CREATETIME_FIELD_NUMBER = 1;
      private int createTime_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemID_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int SERVERID_FIELD_NUMBER = 4;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final ServerDrawRecord DEFAULT_INSTANCE = new ServerDrawRecord();
      /** @deprecated */
      @Deprecated
      public static final Parser<ServerDrawRecord> PARSER = new AbstractParser<ServerDrawRecord>() {
         public ServerDrawRecord parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ServerDrawRecord(input, extensionRegistry);
         }
      };

      private ServerDrawRecord(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ServerDrawRecord() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ServerDrawRecord();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ServerDrawRecord(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.createTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemID_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.serverId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
      }

      public boolean hasCreateTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCreateTime() {
         return this.createTime_;
      }

      public boolean hasBelovedItemID() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemID() {
         return this.belovedItemID_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 4) != 0;
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

      public boolean hasServerId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCreateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemID()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.createTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemID_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.createTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemID_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ServerDrawRecord)) {
            return super.equals(obj);
         } else {
            ServerDrawRecord other = (ServerDrawRecord)obj;
            if (this.hasCreateTime() != other.hasCreateTime()) {
               return false;
            } else if (this.hasCreateTime() && this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else if (this.hasBelovedItemID() != other.hasBelovedItemID()) {
               return false;
            } else if (this.hasBelovedItemID() && this.getBelovedItemID() != other.getBelovedItemID()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
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
            if (this.hasCreateTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCreateTime();
            }

            if (this.hasBelovedItemID()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemID();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ServerDrawRecord parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data);
      }

      public static ServerDrawRecord parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ServerDrawRecord parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data);
      }

      public static ServerDrawRecord parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ServerDrawRecord parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data);
      }

      public static ServerDrawRecord parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ServerDrawRecord)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ServerDrawRecord parseFrom(InputStream input) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ServerDrawRecord parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ServerDrawRecord parseDelimitedFrom(InputStream input) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ServerDrawRecord parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ServerDrawRecord parseFrom(CodedInputStream input) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ServerDrawRecord parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ServerDrawRecord)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ServerDrawRecord prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ServerDrawRecord getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ServerDrawRecord> parser() {
         return PARSER;
      }

      public Parser<ServerDrawRecord> getParserForType() {
         return PARSER;
      }

      public ServerDrawRecord getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServerDrawRecordOrBuilder {
         private int bitField0_;
         private int createTime_;
         private int belovedItemID_;
         private Object playerName_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (SwimParkActivityMsg.ServerDrawRecord.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.createTime_ = 0;
            this.bitField0_ &= -2;
            this.belovedItemID_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.serverId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return SwimParkActivityMsg.ServerDrawRecord.getDefaultInstance();
         }

         public ServerDrawRecord build() {
            ServerDrawRecord result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ServerDrawRecord buildPartial() {
            ServerDrawRecord result = new ServerDrawRecord(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.createTime_ = this.createTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemID_ = this.belovedItemID_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 8) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof ServerDrawRecord) {
               return this.mergeFrom((ServerDrawRecord)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ServerDrawRecord other) {
            if (other == SwimParkActivityMsg.ServerDrawRecord.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCreateTime()) {
                  this.setCreateTime(other.getCreateTime());
               }

               if (other.hasBelovedItemID()) {
                  this.setBelovedItemID(other.getBelovedItemID());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCreateTime()) {
               return false;
            } else if (!this.hasBelovedItemID()) {
               return false;
            } else {
               return this.hasServerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ServerDrawRecord parsedMessage = null;

            try {
               parsedMessage = (ServerDrawRecord)SwimParkActivityMsg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ServerDrawRecord)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCreateTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCreateTime() {
            return this.createTime_;
         }

         public Builder setCreateTime(int value) {
            this.bitField0_ |= 1;
            this.createTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateTime() {
            this.bitField0_ &= -2;
            this.createTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBelovedItemID() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemID() {
            return this.belovedItemID_;
         }

         public Builder setBelovedItemID(int value) {
            this.bitField0_ |= 2;
            this.belovedItemID_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemID() {
            this.bitField0_ &= -3;
            this.belovedItemID_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 4) != 0;
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
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -5;
            this.playerName_ = SwimParkActivityMsg.ServerDrawRecord.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 8;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -9;
            this.serverId_ = 0;
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

   public static final class C2S_LuckDrawInfo_16503 extends GeneratedMessageV3 implements C2S_LuckDrawInfo_16503OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckDrawInfo_16503 DEFAULT_INSTANCE = new C2S_LuckDrawInfo_16503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckDrawInfo_16503> PARSER = new AbstractParser<C2S_LuckDrawInfo_16503>() {
         public C2S_LuckDrawInfo_16503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckDrawInfo_16503(input, extensionRegistry);
         }
      };

      private C2S_LuckDrawInfo_16503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckDrawInfo_16503() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckDrawInfo_16503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckDrawInfo_16503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_16503.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckDrawInfo_16503)) {
            return super.equals(obj);
         } else {
            C2S_LuckDrawInfo_16503 other = (C2S_LuckDrawInfo_16503)obj;
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

      public static C2S_LuckDrawInfo_16503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16503)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_16503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16503)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_16503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16503)PARSER.parseFrom(data);
      }

      public static C2S_LuckDrawInfo_16503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckDrawInfo_16503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16503 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_16503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_16503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_16503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckDrawInfo_16503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_16503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_16503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckDrawInfo_16503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckDrawInfo_16503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckDrawInfo_16503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckDrawInfo_16503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckDrawInfo_16503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckDrawInfo_16503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckDrawInfo_16503> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckDrawInfo_16503> getParserForType() {
         return PARSER;
      }

      public C2S_LuckDrawInfo_16503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckDrawInfo_16503OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckDrawInfo_16503.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_LuckDrawInfo_16503.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LuckDrawInfo_16503_descriptor;
         }

         public C2S_LuckDrawInfo_16503 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_LuckDrawInfo_16503.getDefaultInstance();
         }

         public C2S_LuckDrawInfo_16503 build() {
            C2S_LuckDrawInfo_16503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckDrawInfo_16503 buildPartial() {
            C2S_LuckDrawInfo_16503 result = new C2S_LuckDrawInfo_16503(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LuckDrawInfo_16503) {
               return this.mergeFrom((C2S_LuckDrawInfo_16503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckDrawInfo_16503 other) {
            if (other == SwimParkActivityMsg.C2S_LuckDrawInfo_16503.getDefaultInstance()) {
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
            C2S_LuckDrawInfo_16503 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckDrawInfo_16503)SwimParkActivityMsg.C2S_LuckDrawInfo_16503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckDrawInfo_16503)e.getUnfinishedMessage();
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

   public static final class S2C_LuckDrawInfo_16504 extends GeneratedMessageV3 implements S2C_LuckDrawInfo_16504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAWTIMES_FIELD_NUMBER = 1;
      private int drawTimes_;
      public static final int HADREWARDID_FIELD_NUMBER = 2;
      private Internal.IntList hadRewardId_;
      public static final int STAGENDTIME_FIELD_NUMBER = 3;
      private long stagEndTime_;
      public static final int RECRUITNUM_FIELD_NUMBER = 4;
      private int recruitNum_;
      public static final int SENIORREWARDS_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> seniorRewards_;
      public static final int LOTTERSTAGE_FIELD_NUMBER = 6;
      private int lotterStage_;
      public static final int FANCYID_FIELD_NUMBER = 7;
      private int fancyId_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 8;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckDrawInfo_16504 DEFAULT_INSTANCE = new S2C_LuckDrawInfo_16504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckDrawInfo_16504> PARSER = new AbstractParser<S2C_LuckDrawInfo_16504>() {
         public S2C_LuckDrawInfo_16504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckDrawInfo_16504(input, extensionRegistry);
         }
      };

      private S2C_LuckDrawInfo_16504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckDrawInfo_16504() {
         this.memoizedIsInitialized = -1;
         this.hadRewardId_ = emptyIntList();
         this.seniorRewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckDrawInfo_16504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckDrawInfo_16504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.drawTimes_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.hadRewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.hadRewardId_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.hadRewardId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.stagEndTime_ = input.readInt64();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.recruitNum_ = input.readInt32();
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.seniorRewards_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.seniorRewards_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.lotterStage_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 16;
                        this.fancyId_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 32;
                        this.fancyGroupDrawTimes_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.hadRewardId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.hadRewardId_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_16504.class, Builder.class);
      }

      public boolean hasDrawTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDrawTimes() {
         return this.drawTimes_;
      }

      public List<Integer> getHadRewardIdList() {
         return this.hadRewardId_;
      }

      public int getHadRewardIdCount() {
         return this.hadRewardId_.size();
      }

      public int getHadRewardId(int index) {
         return this.hadRewardId_.getInt(index);
      }

      public boolean hasStagEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getStagEndTime() {
         return this.stagEndTime_;
      }

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRecruitNum() {
         return this.recruitNum_;
      }

      public List<CommonMsg.MapDataII> getSeniorRewardsList() {
         return this.seniorRewards_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList() {
         return this.seniorRewards_;
      }

      public int getSeniorRewardsCount() {
         return this.seniorRewards_.size();
      }

      public CommonMsg.MapDataII getSeniorRewards(int index) {
         return (CommonMsg.MapDataII)this.seniorRewards_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.seniorRewards_.get(index);
      }

      public boolean hasLotterStage() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLotterStage() {
         return this.lotterStage_;
      }

      public boolean hasFancyId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getFancyId() {
         return this.fancyId_;
      }

      public boolean hasFancyGroupDrawTimes() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getFancyGroupDrawTimes() {
         return this.fancyGroupDrawTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStagEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecruitNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLotterStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFancyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFancyGroupDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSeniorRewardsCount(); ++i) {
               if (!this.getSeniorRewards(i).isInitialized()) {
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
            output.writeInt32(1, this.drawTimes_);
         }

         for(int i = 0; i < this.hadRewardId_.size(); ++i) {
            output.writeInt32(2, this.hadRewardId_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(3, this.stagEndTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.recruitNum_);
         }

         for(int i = 0; i < this.seniorRewards_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.seniorRewards_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.lotterStage_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.fancyId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(8, this.fancyGroupDrawTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.drawTimes_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.hadRewardId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.hadRewardId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHadRewardIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.stagEndTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.recruitNum_);
            }

            for(int i = 0; i < this.seniorRewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.seniorRewards_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.lotterStage_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.fancyId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.fancyGroupDrawTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckDrawInfo_16504)) {
            return super.equals(obj);
         } else {
            S2C_LuckDrawInfo_16504 other = (S2C_LuckDrawInfo_16504)obj;
            if (this.hasDrawTimes() != other.hasDrawTimes()) {
               return false;
            } else if (this.hasDrawTimes() && this.getDrawTimes() != other.getDrawTimes()) {
               return false;
            } else if (!this.getHadRewardIdList().equals(other.getHadRewardIdList())) {
               return false;
            } else if (this.hasStagEndTime() != other.hasStagEndTime()) {
               return false;
            } else if (this.hasStagEndTime() && this.getStagEndTime() != other.getStagEndTime()) {
               return false;
            } else if (this.hasRecruitNum() != other.hasRecruitNum()) {
               return false;
            } else if (this.hasRecruitNum() && this.getRecruitNum() != other.getRecruitNum()) {
               return false;
            } else if (!this.getSeniorRewardsList().equals(other.getSeniorRewardsList())) {
               return false;
            } else if (this.hasLotterStage() != other.hasLotterStage()) {
               return false;
            } else if (this.hasLotterStage() && this.getLotterStage() != other.getLotterStage()) {
               return false;
            } else if (this.hasFancyId() != other.hasFancyId()) {
               return false;
            } else if (this.hasFancyId() && this.getFancyId() != other.getFancyId()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() != other.hasFancyGroupDrawTimes()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() && this.getFancyGroupDrawTimes() != other.getFancyGroupDrawTimes()) {
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
            if (this.hasDrawTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDrawTimes();
            }

            if (this.getHadRewardIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHadRewardIdList().hashCode();
            }

            if (this.hasStagEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getStagEndTime());
            }

            if (this.hasRecruitNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRecruitNum();
            }

            if (this.getSeniorRewardsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSeniorRewardsList().hashCode();
            }

            if (this.hasLotterStage()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLotterStage();
            }

            if (this.hasFancyId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getFancyId();
            }

            if (this.hasFancyGroupDrawTimes()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getFancyGroupDrawTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16504)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16504)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16504)PARSER.parseFrom(data);
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckDrawInfo_16504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_16504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_16504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckDrawInfo_16504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_16504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_16504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckDrawInfo_16504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckDrawInfo_16504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckDrawInfo_16504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckDrawInfo_16504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckDrawInfo_16504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckDrawInfo_16504> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckDrawInfo_16504> getParserForType() {
         return PARSER;
      }

      public S2C_LuckDrawInfo_16504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckDrawInfo_16504OrBuilder {
         private int bitField0_;
         private int drawTimes_;
         private Internal.IntList hadRewardId_;
         private long stagEndTime_;
         private int recruitNum_;
         private List<CommonMsg.MapDataII> seniorRewards_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorRewardsBuilder_;
         private int lotterStage_;
         private int fancyId_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckDrawInfo_16504.class, Builder.class);
         }

         private Builder() {
            this.hadRewardId_ = SwimParkActivityMsg.S2C_LuckDrawInfo_16504.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.hadRewardId_ = SwimParkActivityMsg.S2C_LuckDrawInfo_16504.emptyIntList();
            this.seniorRewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_LuckDrawInfo_16504.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.hadRewardId_ = SwimParkActivityMsg.S2C_LuckDrawInfo_16504.emptyIntList();
            this.bitField0_ &= -3;
            this.stagEndTime_ = 0L;
            this.bitField0_ &= -5;
            this.recruitNum_ = 0;
            this.bitField0_ &= -9;
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewards_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.seniorRewardsBuilder_.clear();
            }

            this.lotterStage_ = 0;
            this.bitField0_ &= -33;
            this.fancyId_ = 0;
            this.bitField0_ &= -65;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LuckDrawInfo_16504_descriptor;
         }

         public S2C_LuckDrawInfo_16504 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_LuckDrawInfo_16504.getDefaultInstance();
         }

         public S2C_LuckDrawInfo_16504 build() {
            S2C_LuckDrawInfo_16504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckDrawInfo_16504 buildPartial() {
            S2C_LuckDrawInfo_16504 result = new S2C_LuckDrawInfo_16504(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.drawTimes_ = this.drawTimes_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.hadRewardId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.hadRewardId_ = this.hadRewardId_;
            if ((from_bitField0_ & 4) != 0) {
               result.stagEndTime_ = this.stagEndTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.recruitNum_ = this.recruitNum_;
               to_bitField0_ |= 4;
            }

            if (this.seniorRewardsBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
                  this.bitField0_ &= -17;
               }

               result.seniorRewards_ = this.seniorRewards_;
            } else {
               result.seniorRewards_ = this.seniorRewardsBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.lotterStage_ = this.lotterStage_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.fancyId_ = this.fancyId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.fancyGroupDrawTimes_ = this.fancyGroupDrawTimes_;
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
            if (other instanceof S2C_LuckDrawInfo_16504) {
               return this.mergeFrom((S2C_LuckDrawInfo_16504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckDrawInfo_16504 other) {
            if (other == SwimParkActivityMsg.S2C_LuckDrawInfo_16504.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDrawTimes()) {
                  this.setDrawTimes(other.getDrawTimes());
               }

               if (!other.hadRewardId_.isEmpty()) {
                  if (this.hadRewardId_.isEmpty()) {
                     this.hadRewardId_ = other.hadRewardId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHadRewardIdIsMutable();
                     this.hadRewardId_.addAll(other.hadRewardId_);
                  }

                  this.onChanged();
               }

               if (other.hasStagEndTime()) {
                  this.setStagEndTime(other.getStagEndTime());
               }

               if (other.hasRecruitNum()) {
                  this.setRecruitNum(other.getRecruitNum());
               }

               if (this.seniorRewardsBuilder_ == null) {
                  if (!other.seniorRewards_.isEmpty()) {
                     if (this.seniorRewards_.isEmpty()) {
                        this.seniorRewards_ = other.seniorRewards_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureSeniorRewardsIsMutable();
                        this.seniorRewards_.addAll(other.seniorRewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.seniorRewards_.isEmpty()) {
                  if (this.seniorRewardsBuilder_.isEmpty()) {
                     this.seniorRewardsBuilder_.dispose();
                     this.seniorRewardsBuilder_ = null;
                     this.seniorRewards_ = other.seniorRewards_;
                     this.bitField0_ &= -17;
                     this.seniorRewardsBuilder_ = SwimParkActivityMsg.S2C_LuckDrawInfo_16504.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
                  } else {
                     this.seniorRewardsBuilder_.addAllMessages(other.seniorRewards_);
                  }
               }

               if (other.hasLotterStage()) {
                  this.setLotterStage(other.getLotterStage());
               }

               if (other.hasFancyId()) {
                  this.setFancyId(other.getFancyId());
               }

               if (other.hasFancyGroupDrawTimes()) {
                  this.setFancyGroupDrawTimes(other.getFancyGroupDrawTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDrawTimes()) {
               return false;
            } else if (!this.hasStagEndTime()) {
               return false;
            } else if (!this.hasRecruitNum()) {
               return false;
            } else if (!this.hasLotterStage()) {
               return false;
            } else if (!this.hasFancyId()) {
               return false;
            } else if (!this.hasFancyGroupDrawTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getSeniorRewardsCount(); ++i) {
                  if (!this.getSeniorRewards(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LuckDrawInfo_16504 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckDrawInfo_16504)SwimParkActivityMsg.S2C_LuckDrawInfo_16504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckDrawInfo_16504)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDrawTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDrawTimes() {
            return this.drawTimes_;
         }

         public Builder setDrawTimes(int value) {
            this.bitField0_ |= 1;
            this.drawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawTimes() {
            this.bitField0_ &= -2;
            this.drawTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHadRewardIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.hadRewardId_ = SwimParkActivityMsg.S2C_LuckDrawInfo_16504.mutableCopy(this.hadRewardId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHadRewardIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.hadRewardId_) : this.hadRewardId_);
         }

         public int getHadRewardIdCount() {
            return this.hadRewardId_.size();
         }

         public int getHadRewardId(int index) {
            return this.hadRewardId_.getInt(index);
         }

         public Builder setHadRewardId(int index, int value) {
            this.ensureHadRewardIdIsMutable();
            this.hadRewardId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHadRewardId(int value) {
            this.ensureHadRewardIdIsMutable();
            this.hadRewardId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHadRewardId(Iterable<? extends Integer> values) {
            this.ensureHadRewardIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hadRewardId_);
            this.onChanged();
            return this;
         }

         public Builder clearHadRewardId() {
            this.hadRewardId_ = SwimParkActivityMsg.S2C_LuckDrawInfo_16504.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasStagEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getStagEndTime() {
            return this.stagEndTime_;
         }

         public Builder setStagEndTime(long value) {
            this.bitField0_ |= 4;
            this.stagEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStagEndTime() {
            this.bitField0_ &= -5;
            this.stagEndTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasRecruitNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getRecruitNum() {
            return this.recruitNum_;
         }

         public Builder setRecruitNum(int value) {
            this.bitField0_ |= 8;
            this.recruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitNum() {
            this.bitField0_ &= -9;
            this.recruitNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSeniorRewardsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.seniorRewards_ = new ArrayList(this.seniorRewards_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.MapDataII> getSeniorRewardsList() {
            return this.seniorRewardsBuilder_ == null ? Collections.unmodifiableList(this.seniorRewards_) : this.seniorRewardsBuilder_.getMessageList();
         }

         public int getSeniorRewardsCount() {
            return this.seniorRewardsBuilder_ == null ? this.seniorRewards_.size() : this.seniorRewardsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getSeniorRewards(int index) {
            return this.seniorRewardsBuilder_ == null ? (CommonMsg.MapDataII)this.seniorRewards_.get(index) : (CommonMsg.MapDataII)this.seniorRewardsBuilder_.getMessage(index);
         }

         public Builder setSeniorRewards(int index, CommonMsg.MapDataII value) {
            if (this.seniorRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.set(index, value);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSeniorRewards(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorRewards(CommonMsg.MapDataII value) {
            if (this.seniorRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(value);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSeniorRewards(int index, CommonMsg.MapDataII value) {
            if (this.seniorRewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(index, value);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSeniorRewards(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorRewards(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSeniorRewards(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.seniorRewards_);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSeniorRewards() {
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewards_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removeSeniorRewards(int index) {
            if (this.seniorRewardsBuilder_ == null) {
               this.ensureSeniorRewardsIsMutable();
               this.seniorRewards_.remove(index);
               this.onChanged();
            } else {
               this.seniorRewardsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getSeniorRewardsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorRewardsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index) {
            return this.seniorRewardsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.seniorRewards_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.seniorRewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList() {
            return this.seniorRewardsBuilder_ != null ? this.seniorRewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.seniorRewards_);
         }

         public CommonMsg.MapDataII.Builder addSeniorRewardsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getSeniorRewardsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addSeniorRewardsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorRewardsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getSeniorRewardsBuilderList() {
            return this.getSeniorRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getSeniorRewardsFieldBuilder() {
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewardsBuilder_ = new RepeatedFieldBuilderV3(this.seniorRewards_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.seniorRewards_ = null;
            }

            return this.seniorRewardsBuilder_;
         }

         public boolean hasLotterStage() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLotterStage() {
            return this.lotterStage_;
         }

         public Builder setLotterStage(int value) {
            this.bitField0_ |= 32;
            this.lotterStage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLotterStage() {
            this.bitField0_ &= -33;
            this.lotterStage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFancyId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getFancyId() {
            return this.fancyId_;
         }

         public Builder setFancyId(int value) {
            this.bitField0_ |= 64;
            this.fancyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyId() {
            this.bitField0_ &= -65;
            this.fancyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFancyGroupDrawTimes() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getFancyGroupDrawTimes() {
            return this.fancyGroupDrawTimes_;
         }

         public Builder setFancyGroupDrawTimes(int value) {
            this.bitField0_ |= 128;
            this.fancyGroupDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyGroupDrawTimes() {
            this.bitField0_ &= -129;
            this.fancyGroupDrawTimes_ = 0;
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

   public static final class C2S_Draw_16505 extends GeneratedMessageV3 implements C2S_Draw_16505OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Draw_16505 DEFAULT_INSTANCE = new C2S_Draw_16505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Draw_16505> PARSER = new AbstractParser<C2S_Draw_16505>() {
         public C2S_Draw_16505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Draw_16505(input, extensionRegistry);
         }
      };

      private C2S_Draw_16505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Draw_16505() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Draw_16505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Draw_16505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_16505.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Draw_16505)) {
            return super.equals(obj);
         } else {
            C2S_Draw_16505 other = (C2S_Draw_16505)obj;
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

      public static C2S_Draw_16505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Draw_16505)PARSER.parseFrom(data);
      }

      public static C2S_Draw_16505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_16505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_16505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Draw_16505)PARSER.parseFrom(data);
      }

      public static C2S_Draw_16505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_16505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_16505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Draw_16505)PARSER.parseFrom(data);
      }

      public static C2S_Draw_16505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Draw_16505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Draw_16505 parseFrom(InputStream input) throws IOException {
         return (C2S_Draw_16505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_16505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_16505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_16505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Draw_16505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Draw_16505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_16505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Draw_16505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Draw_16505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Draw_16505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Draw_16505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Draw_16505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Draw_16505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Draw_16505> parser() {
         return PARSER;
      }

      public Parser<C2S_Draw_16505> getParserForType() {
         return PARSER;
      }

      public C2S_Draw_16505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Draw_16505OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Draw_16505.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_Draw_16505.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Draw_16505_descriptor;
         }

         public C2S_Draw_16505 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_Draw_16505.getDefaultInstance();
         }

         public C2S_Draw_16505 build() {
            C2S_Draw_16505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Draw_16505 buildPartial() {
            C2S_Draw_16505 result = new C2S_Draw_16505(this);
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
            if (other instanceof C2S_Draw_16505) {
               return this.mergeFrom((C2S_Draw_16505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Draw_16505 other) {
            if (other == SwimParkActivityMsg.C2S_Draw_16505.getDefaultInstance()) {
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
            C2S_Draw_16505 parsedMessage = null;

            try {
               parsedMessage = (C2S_Draw_16505)SwimParkActivityMsg.C2S_Draw_16505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Draw_16505)e.getUnfinishedMessage();
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

   public static final class S2C_Draw_16506 extends GeneratedMessageV3 implements S2C_Draw_16506OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DRAWTIMES_FIELD_NUMBER = 1;
      private int drawTimes_;
      public static final int ID_FIELD_NUMBER = 2;
      private Internal.IntList id_;
      public static final int RECRUITNUM_FIELD_NUMBER = 4;
      private int recruitNum_;
      public static final int SENIORNUM_FIELD_NUMBER = 5;
      private List<CommonMsg.MapDataII> seniorNum_;
      public static final int ISHAVEFANCY_FIELD_NUMBER = 6;
      private boolean isHaveFancy_;
      public static final int TARGETID_FIELD_NUMBER = 7;
      private int targetId_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 8;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_Draw_16506 DEFAULT_INSTANCE = new S2C_Draw_16506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Draw_16506> PARSER = new AbstractParser<S2C_Draw_16506>() {
         public S2C_Draw_16506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Draw_16506(input, extensionRegistry);
         }
      };

      private S2C_Draw_16506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Draw_16506() {
         this.memoizedIsInitialized = -1;
         this.id_ = emptyIntList();
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Draw_16506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Draw_16506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.drawTimes_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.id_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.id_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.recruitNum_ = input.readInt32();
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.seniorNum_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.seniorNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 48:
                        this.bitField0_ |= 4;
                        this.isHaveFancy_ = input.readBool();
                        continue;
                     case 56:
                        this.bitField0_ |= 8;
                        this.targetId_ = input.readInt32();
                        continue;
                     case 64:
                        this.bitField0_ |= 16;
                        this.fancyGroupDrawTimes_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.id_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.id_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_16506.class, Builder.class);
      }

      public boolean hasDrawTimes() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDrawTimes() {
         return this.drawTimes_;
      }

      public List<Integer> getIdList() {
         return this.id_;
      }

      public int getIdCount() {
         return this.id_.size();
      }

      public int getId(int index) {
         return this.id_.getInt(index);
      }

      public boolean hasRecruitNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRecruitNum() {
         return this.recruitNum_;
      }

      public List<CommonMsg.MapDataII> getSeniorNumList() {
         return this.seniorNum_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList() {
         return this.seniorNum_;
      }

      public int getSeniorNumCount() {
         return this.seniorNum_.size();
      }

      public CommonMsg.MapDataII getSeniorNum(int index) {
         return (CommonMsg.MapDataII)this.seniorNum_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.seniorNum_.get(index);
      }

      public boolean hasIsHaveFancy() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsHaveFancy() {
         return this.isHaveFancy_;
      }

      public boolean hasTargetId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
      }

      public boolean hasFancyGroupDrawTimes() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getFancyGroupDrawTimes() {
         return this.fancyGroupDrawTimes_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecruitNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTargetId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFancyGroupDrawTimes()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSeniorNumCount(); ++i) {
               if (!this.getSeniorNum(i).isInitialized()) {
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
            output.writeInt32(1, this.drawTimes_);
         }

         for(int i = 0; i < this.id_.size(); ++i) {
            output.writeInt32(2, this.id_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.recruitNum_);
         }

         for(int i = 0; i < this.seniorNum_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.seniorNum_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(6, this.isHaveFancy_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(7, this.targetId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(8, this.fancyGroupDrawTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.drawTimes_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.id_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.id_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.recruitNum_);
            }

            for(int i = 0; i < this.seniorNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.seniorNum_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.isHaveFancy_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.targetId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.fancyGroupDrawTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Draw_16506)) {
            return super.equals(obj);
         } else {
            S2C_Draw_16506 other = (S2C_Draw_16506)obj;
            if (this.hasDrawTimes() != other.hasDrawTimes()) {
               return false;
            } else if (this.hasDrawTimes() && this.getDrawTimes() != other.getDrawTimes()) {
               return false;
            } else if (!this.getIdList().equals(other.getIdList())) {
               return false;
            } else if (this.hasRecruitNum() != other.hasRecruitNum()) {
               return false;
            } else if (this.hasRecruitNum() && this.getRecruitNum() != other.getRecruitNum()) {
               return false;
            } else if (!this.getSeniorNumList().equals(other.getSeniorNumList())) {
               return false;
            } else if (this.hasIsHaveFancy() != other.hasIsHaveFancy()) {
               return false;
            } else if (this.hasIsHaveFancy() && this.getIsHaveFancy() != other.getIsHaveFancy()) {
               return false;
            } else if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() != other.hasFancyGroupDrawTimes()) {
               return false;
            } else if (this.hasFancyGroupDrawTimes() && this.getFancyGroupDrawTimes() != other.getFancyGroupDrawTimes()) {
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
            if (this.hasDrawTimes()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDrawTimes();
            }

            if (this.getIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdList().hashCode();
            }

            if (this.hasRecruitNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRecruitNum();
            }

            if (this.getSeniorNumCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSeniorNumList().hashCode();
            }

            if (this.hasIsHaveFancy()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHaveFancy());
            }

            if (this.hasTargetId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTargetId();
            }

            if (this.hasFancyGroupDrawTimes()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getFancyGroupDrawTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Draw_16506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Draw_16506)PARSER.parseFrom(data);
      }

      public static S2C_Draw_16506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_16506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_16506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Draw_16506)PARSER.parseFrom(data);
      }

      public static S2C_Draw_16506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_16506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_16506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Draw_16506)PARSER.parseFrom(data);
      }

      public static S2C_Draw_16506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Draw_16506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Draw_16506 parseFrom(InputStream input) throws IOException {
         return (S2C_Draw_16506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_16506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_16506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_16506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Draw_16506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Draw_16506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_16506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Draw_16506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Draw_16506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Draw_16506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Draw_16506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Draw_16506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Draw_16506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Draw_16506> parser() {
         return PARSER;
      }

      public Parser<S2C_Draw_16506> getParserForType() {
         return PARSER;
      }

      public S2C_Draw_16506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Draw_16506OrBuilder {
         private int bitField0_;
         private int drawTimes_;
         private Internal.IntList id_;
         private int recruitNum_;
         private List<CommonMsg.MapDataII> seniorNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorNumBuilder_;
         private boolean isHaveFancy_;
         private int targetId_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Draw_16506.class, Builder.class);
         }

         private Builder() {
            this.id_ = SwimParkActivityMsg.S2C_Draw_16506.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.id_ = SwimParkActivityMsg.S2C_Draw_16506.emptyIntList();
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_Draw_16506.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.drawTimes_ = 0;
            this.bitField0_ &= -2;
            this.id_ = SwimParkActivityMsg.S2C_Draw_16506.emptyIntList();
            this.bitField0_ &= -3;
            this.recruitNum_ = 0;
            this.bitField0_ &= -5;
            if (this.seniorNumBuilder_ == null) {
               this.seniorNum_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.seniorNumBuilder_.clear();
            }

            this.isHaveFancy_ = false;
            this.bitField0_ &= -17;
            this.targetId_ = 0;
            this.bitField0_ &= -33;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Draw_16506_descriptor;
         }

         public S2C_Draw_16506 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_Draw_16506.getDefaultInstance();
         }

         public S2C_Draw_16506 build() {
            S2C_Draw_16506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Draw_16506 buildPartial() {
            S2C_Draw_16506 result = new S2C_Draw_16506(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.drawTimes_ = this.drawTimes_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.id_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.id_ = this.id_;
            if ((from_bitField0_ & 4) != 0) {
               result.recruitNum_ = this.recruitNum_;
               to_bitField0_ |= 2;
            }

            if (this.seniorNumBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
                  this.bitField0_ &= -9;
               }

               result.seniorNum_ = this.seniorNum_;
            } else {
               result.seniorNum_ = this.seniorNumBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.isHaveFancy_ = this.isHaveFancy_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.targetId_ = this.targetId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.fancyGroupDrawTimes_ = this.fancyGroupDrawTimes_;
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
            if (other instanceof S2C_Draw_16506) {
               return this.mergeFrom((S2C_Draw_16506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Draw_16506 other) {
            if (other == SwimParkActivityMsg.S2C_Draw_16506.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDrawTimes()) {
                  this.setDrawTimes(other.getDrawTimes());
               }

               if (!other.id_.isEmpty()) {
                  if (this.id_.isEmpty()) {
                     this.id_ = other.id_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureIdIsMutable();
                     this.id_.addAll(other.id_);
                  }

                  this.onChanged();
               }

               if (other.hasRecruitNum()) {
                  this.setRecruitNum(other.getRecruitNum());
               }

               if (this.seniorNumBuilder_ == null) {
                  if (!other.seniorNum_.isEmpty()) {
                     if (this.seniorNum_.isEmpty()) {
                        this.seniorNum_ = other.seniorNum_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureSeniorNumIsMutable();
                        this.seniorNum_.addAll(other.seniorNum_);
                     }

                     this.onChanged();
                  }
               } else if (!other.seniorNum_.isEmpty()) {
                  if (this.seniorNumBuilder_.isEmpty()) {
                     this.seniorNumBuilder_.dispose();
                     this.seniorNumBuilder_ = null;
                     this.seniorNum_ = other.seniorNum_;
                     this.bitField0_ &= -9;
                     this.seniorNumBuilder_ = SwimParkActivityMsg.S2C_Draw_16506.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
                  } else {
                     this.seniorNumBuilder_.addAllMessages(other.seniorNum_);
                  }
               }

               if (other.hasIsHaveFancy()) {
                  this.setIsHaveFancy(other.getIsHaveFancy());
               }

               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
               }

               if (other.hasFancyGroupDrawTimes()) {
                  this.setFancyGroupDrawTimes(other.getFancyGroupDrawTimes());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDrawTimes()) {
               return false;
            } else if (!this.hasRecruitNum()) {
               return false;
            } else if (!this.hasTargetId()) {
               return false;
            } else if (!this.hasFancyGroupDrawTimes()) {
               return false;
            } else {
               for(int i = 0; i < this.getSeniorNumCount(); ++i) {
                  if (!this.getSeniorNum(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Draw_16506 parsedMessage = null;

            try {
               parsedMessage = (S2C_Draw_16506)SwimParkActivityMsg.S2C_Draw_16506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Draw_16506)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDrawTimes() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getDrawTimes() {
            return this.drawTimes_;
         }

         public Builder setDrawTimes(int value) {
            this.bitField0_ |= 1;
            this.drawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDrawTimes() {
            this.bitField0_ &= -2;
            this.drawTimes_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.id_ = SwimParkActivityMsg.S2C_Draw_16506.mutableCopy(this.id_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.id_) : this.id_);
         }

         public int getIdCount() {
            return this.id_.size();
         }

         public int getId(int index) {
            return this.id_.getInt(index);
         }

         public Builder setId(int index, int value) {
            this.ensureIdIsMutable();
            this.id_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addId(int value) {
            this.ensureIdIsMutable();
            this.id_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllId(Iterable<? extends Integer> values) {
            this.ensureIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.id_);
            this.onChanged();
            return this;
         }

         public Builder clearId() {
            this.id_ = SwimParkActivityMsg.S2C_Draw_16506.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasRecruitNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRecruitNum() {
            return this.recruitNum_;
         }

         public Builder setRecruitNum(int value) {
            this.bitField0_ |= 4;
            this.recruitNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecruitNum() {
            this.bitField0_ &= -5;
            this.recruitNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSeniorNumIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.seniorNum_ = new ArrayList(this.seniorNum_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.MapDataII> getSeniorNumList() {
            return this.seniorNumBuilder_ == null ? Collections.unmodifiableList(this.seniorNum_) : this.seniorNumBuilder_.getMessageList();
         }

         public int getSeniorNumCount() {
            return this.seniorNumBuilder_ == null ? this.seniorNum_.size() : this.seniorNumBuilder_.getCount();
         }

         public CommonMsg.MapDataII getSeniorNum(int index) {
            return this.seniorNumBuilder_ == null ? (CommonMsg.MapDataII)this.seniorNum_.get(index) : (CommonMsg.MapDataII)this.seniorNumBuilder_.getMessage(index);
         }

         public Builder setSeniorNum(int index, CommonMsg.MapDataII value) {
            if (this.seniorNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorNumIsMutable();
               this.seniorNum_.set(index, value);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSeniorNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorNumBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorNum(CommonMsg.MapDataII value) {
            if (this.seniorNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(value);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSeniorNum(int index, CommonMsg.MapDataII value) {
            if (this.seniorNumBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(index, value);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSeniorNum(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSeniorNum(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSeniorNum(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.seniorNum_);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSeniorNum() {
            if (this.seniorNumBuilder_ == null) {
               this.seniorNum_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.seniorNumBuilder_.clear();
            }

            return this;
         }

         public Builder removeSeniorNum(int index) {
            if (this.seniorNumBuilder_ == null) {
               this.ensureSeniorNumIsMutable();
               this.seniorNum_.remove(index);
               this.onChanged();
            } else {
               this.seniorNumBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getSeniorNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorNumFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index) {
            return this.seniorNumBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.seniorNum_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.seniorNumBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList() {
            return this.seniorNumBuilder_ != null ? this.seniorNumBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.seniorNum_);
         }

         public CommonMsg.MapDataII.Builder addSeniorNumBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getSeniorNumFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addSeniorNumBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSeniorNumFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getSeniorNumBuilderList() {
            return this.getSeniorNumFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getSeniorNumFieldBuilder() {
            if (this.seniorNumBuilder_ == null) {
               this.seniorNumBuilder_ = new RepeatedFieldBuilderV3(this.seniorNum_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.seniorNum_ = null;
            }

            return this.seniorNumBuilder_;
         }

         public boolean hasIsHaveFancy() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getIsHaveFancy() {
            return this.isHaveFancy_;
         }

         public Builder setIsHaveFancy(boolean value) {
            this.bitField0_ |= 16;
            this.isHaveFancy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHaveFancy() {
            this.bitField0_ &= -17;
            this.isHaveFancy_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasTargetId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 32;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -33;
            this.targetId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFancyGroupDrawTimes() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getFancyGroupDrawTimes() {
            return this.fancyGroupDrawTimes_;
         }

         public Builder setFancyGroupDrawTimes(int value) {
            this.bitField0_ |= 64;
            this.fancyGroupDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyGroupDrawTimes() {
            this.bitField0_ &= -65;
            this.fancyGroupDrawTimes_ = 0;
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

   public static final class C2S_OpenReward_16507 extends GeneratedMessageV3 implements C2S_OpenReward_16507OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenReward_16507 DEFAULT_INSTANCE = new C2S_OpenReward_16507();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenReward_16507> PARSER = new AbstractParser<C2S_OpenReward_16507>() {
         public C2S_OpenReward_16507 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenReward_16507(input, extensionRegistry);
         }
      };

      private C2S_OpenReward_16507(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenReward_16507() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenReward_16507();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenReward_16507(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_16507.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenReward_16507)) {
            return super.equals(obj);
         } else {
            C2S_OpenReward_16507 other = (C2S_OpenReward_16507)obj;
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

      public static C2S_OpenReward_16507 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16507)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_16507 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_16507 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16507)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_16507 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_16507 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16507)PARSER.parseFrom(data);
      }

      public static C2S_OpenReward_16507 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenReward_16507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenReward_16507 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_16507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_16507 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_16507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_16507 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenReward_16507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_16507 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_16507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenReward_16507 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenReward_16507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenReward_16507 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenReward_16507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenReward_16507 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenReward_16507 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenReward_16507> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenReward_16507> getParserForType() {
         return PARSER;
      }

      public C2S_OpenReward_16507 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenReward_16507OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenReward_16507.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_OpenReward_16507.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_OpenReward_16507_descriptor;
         }

         public C2S_OpenReward_16507 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_OpenReward_16507.getDefaultInstance();
         }

         public C2S_OpenReward_16507 build() {
            C2S_OpenReward_16507 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenReward_16507 buildPartial() {
            C2S_OpenReward_16507 result = new C2S_OpenReward_16507(this);
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
            if (other instanceof C2S_OpenReward_16507) {
               return this.mergeFrom((C2S_OpenReward_16507)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenReward_16507 other) {
            if (other == SwimParkActivityMsg.C2S_OpenReward_16507.getDefaultInstance()) {
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
            C2S_OpenReward_16507 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenReward_16507)SwimParkActivityMsg.C2S_OpenReward_16507.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenReward_16507)e.getUnfinishedMessage();
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

   public static final class S2C_OpenReward_16508 extends GeneratedMessageV3 implements S2C_OpenReward_16508OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenReward_16508 DEFAULT_INSTANCE = new S2C_OpenReward_16508();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenReward_16508> PARSER = new AbstractParser<S2C_OpenReward_16508>() {
         public S2C_OpenReward_16508 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenReward_16508(input, extensionRegistry);
         }
      };

      private S2C_OpenReward_16508(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenReward_16508() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenReward_16508();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenReward_16508(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_16508.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenReward_16508)) {
            return super.equals(obj);
         } else {
            S2C_OpenReward_16508 other = (S2C_OpenReward_16508)obj;
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

      public static S2C_OpenReward_16508 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16508)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_16508 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_16508 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16508)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_16508 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_16508 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16508)PARSER.parseFrom(data);
      }

      public static S2C_OpenReward_16508 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenReward_16508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenReward_16508 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_16508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_16508 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_16508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_16508 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenReward_16508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_16508 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_16508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenReward_16508 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenReward_16508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenReward_16508 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenReward_16508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenReward_16508 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenReward_16508 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenReward_16508> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenReward_16508> getParserForType() {
         return PARSER;
      }

      public S2C_OpenReward_16508 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenReward_16508OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenReward_16508.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_OpenReward_16508.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_OpenReward_16508_descriptor;
         }

         public S2C_OpenReward_16508 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_OpenReward_16508.getDefaultInstance();
         }

         public S2C_OpenReward_16508 build() {
            S2C_OpenReward_16508 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenReward_16508 buildPartial() {
            S2C_OpenReward_16508 result = new S2C_OpenReward_16508(this);
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
            if (other instanceof S2C_OpenReward_16508) {
               return this.mergeFrom((S2C_OpenReward_16508)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenReward_16508 other) {
            if (other == SwimParkActivityMsg.S2C_OpenReward_16508.getDefaultInstance()) {
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
            S2C_OpenReward_16508 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenReward_16508)SwimParkActivityMsg.S2C_OpenReward_16508.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenReward_16508)e.getUnfinishedMessage();
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

   public static final class C2S_DrawRecord_16509 extends GeneratedMessageV3 implements C2S_DrawRecord_16509OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_16509 DEFAULT_INSTANCE = new C2S_DrawRecord_16509();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_16509> PARSER = new AbstractParser<C2S_DrawRecord_16509>() {
         public C2S_DrawRecord_16509 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_16509(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_16509(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_16509() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_16509();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_16509(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_16509.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_16509)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_16509 other = (C2S_DrawRecord_16509)obj;
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

      public static C2S_DrawRecord_16509 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16509)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_16509 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_16509 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16509)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_16509 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_16509 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16509)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_16509 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_16509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_16509 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_16509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_16509 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_16509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_16509 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_16509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_16509 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_16509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_16509 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_16509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_16509 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_16509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_16509 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_16509 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_16509> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_16509> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_16509 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_16509OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_16509.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_DrawRecord_16509.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_DrawRecord_16509_descriptor;
         }

         public C2S_DrawRecord_16509 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_DrawRecord_16509.getDefaultInstance();
         }

         public C2S_DrawRecord_16509 build() {
            C2S_DrawRecord_16509 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_16509 buildPartial() {
            C2S_DrawRecord_16509 result = new C2S_DrawRecord_16509(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DrawRecord_16509) {
               return this.mergeFrom((C2S_DrawRecord_16509)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_16509 other) {
            if (other == SwimParkActivityMsg.C2S_DrawRecord_16509.getDefaultInstance()) {
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
            C2S_DrawRecord_16509 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_16509)SwimParkActivityMsg.C2S_DrawRecord_16509.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_16509)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_16510 extends GeneratedMessageV3 implements S2C_DrawRecord_16510OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECROD_FIELD_NUMBER = 1;
      private List<DrawRecord> myRecrod_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_16510 DEFAULT_INSTANCE = new S2C_DrawRecord_16510();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_16510> PARSER = new AbstractParser<S2C_DrawRecord_16510>() {
         public S2C_DrawRecord_16510 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_16510(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_16510(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_16510() {
         this.memoizedIsInitialized = -1;
         this.myRecrod_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_16510();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_16510(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.myRecrod_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.myRecrod_.add(input.readMessage(SwimParkActivityMsg.DrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.myRecrod_ = Collections.unmodifiableList(this.myRecrod_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_16510.class, Builder.class);
      }

      public List<DrawRecord> getMyRecrodList() {
         return this.myRecrod_;
      }

      public List<? extends DrawRecordOrBuilder> getMyRecrodOrBuilderList() {
         return this.myRecrod_;
      }

      public int getMyRecrodCount() {
         return this.myRecrod_.size();
      }

      public DrawRecord getMyRecrod(int index) {
         return (DrawRecord)this.myRecrod_.get(index);
      }

      public DrawRecordOrBuilder getMyRecrodOrBuilder(int index) {
         return (DrawRecordOrBuilder)this.myRecrod_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMyRecrodCount(); ++i) {
               if (!this.getMyRecrod(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.myRecrod_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.myRecrod_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.myRecrod_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.myRecrod_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DrawRecord_16510)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_16510 other = (S2C_DrawRecord_16510)obj;
            if (!this.getMyRecrodList().equals(other.getMyRecrodList())) {
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
            if (this.getMyRecrodCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMyRecrodList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DrawRecord_16510 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16510)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_16510 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_16510 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16510)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_16510 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_16510 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16510)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_16510 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_16510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_16510 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_16510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_16510 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_16510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_16510 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_16510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_16510 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_16510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_16510 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_16510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_16510 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_16510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_16510 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_16510 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_16510> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_16510> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_16510 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_16510OrBuilder {
         private int bitField0_;
         private List<DrawRecord> myRecrod_;
         private RepeatedFieldBuilderV3<DrawRecord, DrawRecord.Builder, DrawRecordOrBuilder> myRecrodBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_16510.class, Builder.class);
         }

         private Builder() {
            this.myRecrod_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.myRecrod_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_DrawRecord_16510.alwaysUseFieldBuilders) {
               this.getMyRecrodFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.myRecrodBuilder_ == null) {
               this.myRecrod_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.myRecrodBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_DrawRecord_16510_descriptor;
         }

         public S2C_DrawRecord_16510 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_DrawRecord_16510.getDefaultInstance();
         }

         public S2C_DrawRecord_16510 build() {
            S2C_DrawRecord_16510 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_16510 buildPartial() {
            S2C_DrawRecord_16510 result = new S2C_DrawRecord_16510(this);
            int from_bitField0_ = this.bitField0_;
            if (this.myRecrodBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.myRecrod_ = Collections.unmodifiableList(this.myRecrod_);
                  this.bitField0_ &= -2;
               }

               result.myRecrod_ = this.myRecrod_;
            } else {
               result.myRecrod_ = this.myRecrodBuilder_.build();
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
            if (other instanceof S2C_DrawRecord_16510) {
               return this.mergeFrom((S2C_DrawRecord_16510)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_16510 other) {
            if (other == SwimParkActivityMsg.S2C_DrawRecord_16510.getDefaultInstance()) {
               return this;
            } else {
               if (this.myRecrodBuilder_ == null) {
                  if (!other.myRecrod_.isEmpty()) {
                     if (this.myRecrod_.isEmpty()) {
                        this.myRecrod_ = other.myRecrod_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMyRecrodIsMutable();
                        this.myRecrod_.addAll(other.myRecrod_);
                     }

                     this.onChanged();
                  }
               } else if (!other.myRecrod_.isEmpty()) {
                  if (this.myRecrodBuilder_.isEmpty()) {
                     this.myRecrodBuilder_.dispose();
                     this.myRecrodBuilder_ = null;
                     this.myRecrod_ = other.myRecrod_;
                     this.bitField0_ &= -2;
                     this.myRecrodBuilder_ = SwimParkActivityMsg.S2C_DrawRecord_16510.alwaysUseFieldBuilders ? this.getMyRecrodFieldBuilder() : null;
                  } else {
                     this.myRecrodBuilder_.addAllMessages(other.myRecrod_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMyRecrodCount(); ++i) {
               if (!this.getMyRecrod(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DrawRecord_16510 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_16510)SwimParkActivityMsg.S2C_DrawRecord_16510.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_16510)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMyRecrodIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.myRecrod_ = new ArrayList(this.myRecrod_);
               this.bitField0_ |= 1;
            }

         }

         public List<DrawRecord> getMyRecrodList() {
            return this.myRecrodBuilder_ == null ? Collections.unmodifiableList(this.myRecrod_) : this.myRecrodBuilder_.getMessageList();
         }

         public int getMyRecrodCount() {
            return this.myRecrodBuilder_ == null ? this.myRecrod_.size() : this.myRecrodBuilder_.getCount();
         }

         public DrawRecord getMyRecrod(int index) {
            return this.myRecrodBuilder_ == null ? (DrawRecord)this.myRecrod_.get(index) : (DrawRecord)this.myRecrodBuilder_.getMessage(index);
         }

         public Builder setMyRecrod(int index, DrawRecord value) {
            if (this.myRecrodBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecrodIsMutable();
               this.myRecrod_.set(index, value);
               this.onChanged();
            } else {
               this.myRecrodBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMyRecrod(int index, DrawRecord.Builder builderForValue) {
            if (this.myRecrodBuilder_ == null) {
               this.ensureMyRecrodIsMutable();
               this.myRecrod_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecrodBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecrod(DrawRecord value) {
            if (this.myRecrodBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecrodIsMutable();
               this.myRecrod_.add(value);
               this.onChanged();
            } else {
               this.myRecrodBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMyRecrod(int index, DrawRecord value) {
            if (this.myRecrodBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMyRecrodIsMutable();
               this.myRecrod_.add(index, value);
               this.onChanged();
            } else {
               this.myRecrodBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMyRecrod(DrawRecord.Builder builderForValue) {
            if (this.myRecrodBuilder_ == null) {
               this.ensureMyRecrodIsMutable();
               this.myRecrod_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.myRecrodBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMyRecrod(int index, DrawRecord.Builder builderForValue) {
            if (this.myRecrodBuilder_ == null) {
               this.ensureMyRecrodIsMutable();
               this.myRecrod_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.myRecrodBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMyRecrod(Iterable<? extends DrawRecord> values) {
            if (this.myRecrodBuilder_ == null) {
               this.ensureMyRecrodIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.myRecrod_);
               this.onChanged();
            } else {
               this.myRecrodBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMyRecrod() {
            if (this.myRecrodBuilder_ == null) {
               this.myRecrod_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.myRecrodBuilder_.clear();
            }

            return this;
         }

         public Builder removeMyRecrod(int index) {
            if (this.myRecrodBuilder_ == null) {
               this.ensureMyRecrodIsMutable();
               this.myRecrod_.remove(index);
               this.onChanged();
            } else {
               this.myRecrodBuilder_.remove(index);
            }

            return this;
         }

         public DrawRecord.Builder getMyRecrodBuilder(int index) {
            return (DrawRecord.Builder)this.getMyRecrodFieldBuilder().getBuilder(index);
         }

         public DrawRecordOrBuilder getMyRecrodOrBuilder(int index) {
            return this.myRecrodBuilder_ == null ? (DrawRecordOrBuilder)this.myRecrod_.get(index) : (DrawRecordOrBuilder)this.myRecrodBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends DrawRecordOrBuilder> getMyRecrodOrBuilderList() {
            return this.myRecrodBuilder_ != null ? this.myRecrodBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.myRecrod_);
         }

         public DrawRecord.Builder addMyRecrodBuilder() {
            return (DrawRecord.Builder)this.getMyRecrodFieldBuilder().addBuilder(SwimParkActivityMsg.DrawRecord.getDefaultInstance());
         }

         public DrawRecord.Builder addMyRecrodBuilder(int index) {
            return (DrawRecord.Builder)this.getMyRecrodFieldBuilder().addBuilder(index, SwimParkActivityMsg.DrawRecord.getDefaultInstance());
         }

         public List<DrawRecord.Builder> getMyRecrodBuilderList() {
            return this.getMyRecrodFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<DrawRecord, DrawRecord.Builder, DrawRecordOrBuilder> getMyRecrodFieldBuilder() {
            if (this.myRecrodBuilder_ == null) {
               this.myRecrodBuilder_ = new RepeatedFieldBuilderV3(this.myRecrod_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.myRecrod_ = null;
            }

            return this.myRecrodBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Pray_16521 extends GeneratedMessageV3 implements C2S_Pray_16521OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int IDX_FIELD_NUMBER = 1;
      private int idx_;
      private byte memoizedIsInitialized;
      private static final C2S_Pray_16521 DEFAULT_INSTANCE = new C2S_Pray_16521();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Pray_16521> PARSER = new AbstractParser<C2S_Pray_16521>() {
         public C2S_Pray_16521 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Pray_16521(input, extensionRegistry);
         }
      };

      private C2S_Pray_16521(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Pray_16521() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Pray_16521();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Pray_16521(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.idx_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_16521.class, Builder.class);
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.idx_);
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
               size += CodedOutputStream.computeInt32Size(1, this.idx_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Pray_16521)) {
            return super.equals(obj);
         } else {
            C2S_Pray_16521 other = (C2S_Pray_16521)obj;
            if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
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
            if (this.hasIdx()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdx();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Pray_16521 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Pray_16521)PARSER.parseFrom(data);
      }

      public static C2S_Pray_16521 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_16521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_16521 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Pray_16521)PARSER.parseFrom(data);
      }

      public static C2S_Pray_16521 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_16521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_16521 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Pray_16521)PARSER.parseFrom(data);
      }

      public static C2S_Pray_16521 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_16521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_16521 parseFrom(InputStream input) throws IOException {
         return (C2S_Pray_16521)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_16521 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_16521)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_16521 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Pray_16521)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Pray_16521 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_16521)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_16521 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Pray_16521)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_16521 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_16521)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Pray_16521 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Pray_16521 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Pray_16521> parser() {
         return PARSER;
      }

      public Parser<C2S_Pray_16521> getParserForType() {
         return PARSER;
      }

      public C2S_Pray_16521 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Pray_16521OrBuilder {
         private int bitField0_;
         private int idx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_16521.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_Pray_16521.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.idx_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_Pray_16521_descriptor;
         }

         public C2S_Pray_16521 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_Pray_16521.getDefaultInstance();
         }

         public C2S_Pray_16521 build() {
            C2S_Pray_16521 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Pray_16521 buildPartial() {
            C2S_Pray_16521 result = new C2S_Pray_16521(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.idx_ = this.idx_;
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
            if (other instanceof C2S_Pray_16521) {
               return this.mergeFrom((C2S_Pray_16521)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Pray_16521 other) {
            if (other == SwimParkActivityMsg.C2S_Pray_16521.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIdx();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Pray_16521 parsedMessage = null;

            try {
               parsedMessage = (C2S_Pray_16521)SwimParkActivityMsg.C2S_Pray_16521.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Pray_16521)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 1;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -2;
            this.idx_ = 0;
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

   public static final class S2C_Pray_16522 extends GeneratedMessageV3 implements S2C_Pray_16522OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYNUM_FIELD_NUMBER = 1;
      private int prayNum_;
      public static final int IDX_FIELD_NUMBER = 2;
      private int idx_;
      private byte memoizedIsInitialized;
      private static final S2C_Pray_16522 DEFAULT_INSTANCE = new S2C_Pray_16522();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Pray_16522> PARSER = new AbstractParser<S2C_Pray_16522>() {
         public S2C_Pray_16522 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Pray_16522(input, extensionRegistry);
         }
      };

      private S2C_Pray_16522(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Pray_16522() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Pray_16522();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Pray_16522(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.idx_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_16522.class, Builder.class);
      }

      public boolean hasPrayNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayNum() {
         return this.prayNum_;
      }

      public boolean hasIdx() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getIdx() {
         return this.idx_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIdx()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.idx_);
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
               size += CodedOutputStream.computeInt32Size(1, this.prayNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.idx_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Pray_16522)) {
            return super.equals(obj);
         } else {
            S2C_Pray_16522 other = (S2C_Pray_16522)obj;
            if (this.hasPrayNum() != other.hasPrayNum()) {
               return false;
            } else if (this.hasPrayNum() && this.getPrayNum() != other.getPrayNum()) {
               return false;
            } else if (this.hasIdx() != other.hasIdx()) {
               return false;
            } else if (this.hasIdx() && this.getIdx() != other.getIdx()) {
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
            if (this.hasPrayNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayNum();
            }

            if (this.hasIdx()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIdx();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Pray_16522 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Pray_16522)PARSER.parseFrom(data);
      }

      public static S2C_Pray_16522 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_16522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_16522 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Pray_16522)PARSER.parseFrom(data);
      }

      public static S2C_Pray_16522 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_16522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_16522 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Pray_16522)PARSER.parseFrom(data);
      }

      public static S2C_Pray_16522 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_16522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_16522 parseFrom(InputStream input) throws IOException {
         return (S2C_Pray_16522)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_16522 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_16522)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_16522 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Pray_16522)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Pray_16522 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_16522)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_16522 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Pray_16522)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_16522 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_16522)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Pray_16522 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Pray_16522 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Pray_16522> parser() {
         return PARSER;
      }

      public Parser<S2C_Pray_16522> getParserForType() {
         return PARSER;
      }

      public S2C_Pray_16522 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Pray_16522OrBuilder {
         private int bitField0_;
         private int prayNum_;
         private int idx_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_16522.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_Pray_16522.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayNum_ = 0;
            this.bitField0_ &= -2;
            this.idx_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_Pray_16522_descriptor;
         }

         public S2C_Pray_16522 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_Pray_16522.getDefaultInstance();
         }

         public S2C_Pray_16522 build() {
            S2C_Pray_16522 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Pray_16522 buildPartial() {
            S2C_Pray_16522 result = new S2C_Pray_16522(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayNum_ = this.prayNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.idx_ = this.idx_;
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
            if (other instanceof S2C_Pray_16522) {
               return this.mergeFrom((S2C_Pray_16522)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Pray_16522 other) {
            if (other == SwimParkActivityMsg.S2C_Pray_16522.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayNum()) {
                  this.setPrayNum(other.getPrayNum());
               }

               if (other.hasIdx()) {
                  this.setIdx(other.getIdx());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPrayNum()) {
               return false;
            } else {
               return this.hasIdx();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Pray_16522 parsedMessage = null;

            try {
               parsedMessage = (S2C_Pray_16522)SwimParkActivityMsg.S2C_Pray_16522.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Pray_16522)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayNum() {
            return this.prayNum_;
         }

         public Builder setPrayNum(int value) {
            this.bitField0_ |= 1;
            this.prayNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayNum() {
            this.bitField0_ &= -2;
            this.prayNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIdx() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getIdx() {
            return this.idx_;
         }

         public Builder setIdx(int value) {
            this.bitField0_ |= 2;
            this.idx_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIdx() {
            this.bitField0_ &= -3;
            this.idx_ = 0;
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

   public static final class S2C_PrayTaskNotify_16524 extends GeneratedMessageV3 implements S2C_PrayTaskNotify_16524OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayTaskNotify_16524 DEFAULT_INSTANCE = new S2C_PrayTaskNotify_16524();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayTaskNotify_16524> PARSER = new AbstractParser<S2C_PrayTaskNotify_16524>() {
         public S2C_PrayTaskNotify_16524 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayTaskNotify_16524(input, extensionRegistry);
         }
      };

      private S2C_PrayTaskNotify_16524(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayTaskNotify_16524() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayTaskNotify_16524();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayTaskNotify_16524(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_16524.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public ActivityMsg.TaskData getTask(int index) {
         return (ActivityMsg.TaskData)this.task_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayTaskNotify_16524)) {
            return super.equals(obj);
         } else {
            S2C_PrayTaskNotify_16524 other = (S2C_PrayTaskNotify_16524)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16524)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16524)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16524)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_16524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_16524)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_16524)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16524 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_16524)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_16524 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_16524)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayTaskNotify_16524)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_16524 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_16524)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayTaskNotify_16524 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayTaskNotify_16524 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayTaskNotify_16524> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayTaskNotify_16524> getParserForType() {
         return PARSER;
      }

      public S2C_PrayTaskNotify_16524 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayTaskNotify_16524OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_16524.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_PrayTaskNotify_16524.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskNotify_16524_descriptor;
         }

         public S2C_PrayTaskNotify_16524 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_PrayTaskNotify_16524.getDefaultInstance();
         }

         public S2C_PrayTaskNotify_16524 build() {
            S2C_PrayTaskNotify_16524 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayTaskNotify_16524 buildPartial() {
            S2C_PrayTaskNotify_16524 result = new S2C_PrayTaskNotify_16524(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_PrayTaskNotify_16524) {
               return this.mergeFrom((S2C_PrayTaskNotify_16524)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayTaskNotify_16524 other) {
            if (other == SwimParkActivityMsg.S2C_PrayTaskNotify_16524.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = SwimParkActivityMsg.S2C_PrayTaskNotify_16524.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrayTaskNotify_16524 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayTaskNotify_16524)SwimParkActivityMsg.S2C_PrayTaskNotify_16524.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayTaskNotify_16524)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskData)this.task_.get(index) : (ActivityMsg.TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.task_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_PrayInfo_16526 extends GeneratedMessageV3 implements S2C_PrayInfo_16526OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRAYNUM_FIELD_NUMBER = 1;
      private int prayNum_;
      public static final int COUNT_FIELD_NUMBER = 2;
      private Internal.IntList count_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayInfo_16526 DEFAULT_INSTANCE = new S2C_PrayInfo_16526();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayInfo_16526> PARSER = new AbstractParser<S2C_PrayInfo_16526>() {
         public S2C_PrayInfo_16526 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayInfo_16526(input, extensionRegistry);
         }
      };

      private S2C_PrayInfo_16526(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayInfo_16526() {
         this.memoizedIsInitialized = -1;
         this.count_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayInfo_16526();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayInfo_16526(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.prayNum_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.count_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.count_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.count_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.count_.addInt(input.readInt32());
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
                  this.count_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayInfo_16526.class, Builder.class);
      }

      public boolean hasPrayNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPrayNum() {
         return this.prayNum_;
      }

      public List<Integer> getCountList() {
         return this.count_;
      }

      public int getCountCount() {
         return this.count_.size();
      }

      public int getCount(int index) {
         return this.count_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPrayNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.prayNum_);
         }

         for(int i = 0; i < this.count_.size(); ++i) {
            output.writeInt32(2, this.count_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.prayNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.count_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.count_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCountList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayInfo_16526)) {
            return super.equals(obj);
         } else {
            S2C_PrayInfo_16526 other = (S2C_PrayInfo_16526)obj;
            if (this.hasPrayNum() != other.hasPrayNum()) {
               return false;
            } else if (this.hasPrayNum() && this.getPrayNum() != other.getPrayNum()) {
               return false;
            } else if (!this.getCountList().equals(other.getCountList())) {
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
            if (this.hasPrayNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPrayNum();
            }

            if (this.getCountCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCountList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayInfo_16526 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16526)PARSER.parseFrom(data);
      }

      public static S2C_PrayInfo_16526 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayInfo_16526 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16526)PARSER.parseFrom(data);
      }

      public static S2C_PrayInfo_16526 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayInfo_16526 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16526)PARSER.parseFrom(data);
      }

      public static S2C_PrayInfo_16526 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayInfo_16526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayInfo_16526 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayInfo_16526)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayInfo_16526 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayInfo_16526)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayInfo_16526 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayInfo_16526)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayInfo_16526 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayInfo_16526)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayInfo_16526 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayInfo_16526)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayInfo_16526 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayInfo_16526)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayInfo_16526 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayInfo_16526 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayInfo_16526> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayInfo_16526> getParserForType() {
         return PARSER;
      }

      public S2C_PrayInfo_16526 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayInfo_16526OrBuilder {
         private int bitField0_;
         private int prayNum_;
         private Internal.IntList count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayInfo_16526.class, Builder.class);
         }

         private Builder() {
            this.count_ = SwimParkActivityMsg.S2C_PrayInfo_16526.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.count_ = SwimParkActivityMsg.S2C_PrayInfo_16526.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_PrayInfo_16526.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.prayNum_ = 0;
            this.bitField0_ &= -2;
            this.count_ = SwimParkActivityMsg.S2C_PrayInfo_16526.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayInfo_16526_descriptor;
         }

         public S2C_PrayInfo_16526 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_PrayInfo_16526.getDefaultInstance();
         }

         public S2C_PrayInfo_16526 build() {
            S2C_PrayInfo_16526 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayInfo_16526 buildPartial() {
            S2C_PrayInfo_16526 result = new S2C_PrayInfo_16526(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.prayNum_ = this.prayNum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.count_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.count_ = this.count_;
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
            if (other instanceof S2C_PrayInfo_16526) {
               return this.mergeFrom((S2C_PrayInfo_16526)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayInfo_16526 other) {
            if (other == SwimParkActivityMsg.S2C_PrayInfo_16526.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPrayNum()) {
                  this.setPrayNum(other.getPrayNum());
               }

               if (!other.count_.isEmpty()) {
                  if (this.count_.isEmpty()) {
                     this.count_ = other.count_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureCountIsMutable();
                     this.count_.addAll(other.count_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPrayNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrayInfo_16526 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayInfo_16526)SwimParkActivityMsg.S2C_PrayInfo_16526.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayInfo_16526)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPrayNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPrayNum() {
            return this.prayNum_;
         }

         public Builder setPrayNum(int value) {
            this.bitField0_ |= 1;
            this.prayNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrayNum() {
            this.bitField0_ &= -2;
            this.prayNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCountIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.count_ = SwimParkActivityMsg.S2C_PrayInfo_16526.mutableCopy(this.count_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getCountList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.count_) : this.count_);
         }

         public int getCountCount() {
            return this.count_.size();
         }

         public int getCount(int index) {
            return this.count_.getInt(index);
         }

         public Builder setCount(int index, int value) {
            this.ensureCountIsMutable();
            this.count_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCount(int value) {
            this.ensureCountIsMutable();
            this.count_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCount(Iterable<? extends Integer> values) {
            this.ensureCountIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.count_);
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.count_ = SwimParkActivityMsg.S2C_PrayInfo_16526.emptyIntList();
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

   public static final class S2C_PrayTaskList_16528 extends GeneratedMessageV3 implements S2C_PrayTaskList_16528OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayTaskList_16528 DEFAULT_INSTANCE = new S2C_PrayTaskList_16528();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayTaskList_16528> PARSER = new AbstractParser<S2C_PrayTaskList_16528>() {
         public S2C_PrayTaskList_16528 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayTaskList_16528(input, extensionRegistry);
         }
      };

      private S2C_PrayTaskList_16528(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayTaskList_16528() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayTaskList_16528();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayTaskList_16528(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.task_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.task_.add(input.readMessage(ActivityMsg.TaskData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.task_ = Collections.unmodifiableList(this.task_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskList_16528.class, Builder.class);
      }

      public List<ActivityMsg.TaskData> getTaskList() {
         return this.task_;
      }

      public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
         return this.task_;
      }

      public int getTaskCount() {
         return this.task_.size();
      }

      public ActivityMsg.TaskData getTask(int index) {
         return (ActivityMsg.TaskData)this.task_.get(index);
      }

      public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
         return (ActivityMsg.TaskDataOrBuilder)this.task_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.task_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.task_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.task_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.task_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PrayTaskList_16528)) {
            return super.equals(obj);
         } else {
            S2C_PrayTaskList_16528 other = (S2C_PrayTaskList_16528)obj;
            if (!this.getTaskList().equals(other.getTaskList())) {
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
            if (this.getTaskCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PrayTaskList_16528 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16528)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_16528 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16528)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_16528 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16528)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_16528 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16528)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_16528 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16528)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_16528 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_16528)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_16528 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskList_16528)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_16528 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_16528)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskList_16528 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskList_16528)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_16528 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_16528)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskList_16528 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayTaskList_16528)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_16528 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_16528)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayTaskList_16528 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayTaskList_16528 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayTaskList_16528> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayTaskList_16528> getParserForType() {
         return PARSER;
      }

      public S2C_PrayTaskList_16528 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayTaskList_16528OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskList_16528.class, Builder.class);
         }

         private Builder() {
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.task_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_PrayTaskList_16528.alwaysUseFieldBuilders) {
               this.getTaskFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_PrayTaskList_16528_descriptor;
         }

         public S2C_PrayTaskList_16528 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_PrayTaskList_16528.getDefaultInstance();
         }

         public S2C_PrayTaskList_16528 build() {
            S2C_PrayTaskList_16528 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayTaskList_16528 buildPartial() {
            S2C_PrayTaskList_16528 result = new S2C_PrayTaskList_16528(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.task_ = Collections.unmodifiableList(this.task_);
                  this.bitField0_ &= -2;
               }

               result.task_ = this.task_;
            } else {
               result.task_ = this.taskBuilder_.build();
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
            if (other instanceof S2C_PrayTaskList_16528) {
               return this.mergeFrom((S2C_PrayTaskList_16528)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayTaskList_16528 other) {
            if (other == SwimParkActivityMsg.S2C_PrayTaskList_16528.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskBuilder_ == null) {
                  if (!other.task_.isEmpty()) {
                     if (this.task_.isEmpty()) {
                        this.task_ = other.task_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskIsMutable();
                        this.task_.addAll(other.task_);
                     }

                     this.onChanged();
                  }
               } else if (!other.task_.isEmpty()) {
                  if (this.taskBuilder_.isEmpty()) {
                     this.taskBuilder_.dispose();
                     this.taskBuilder_ = null;
                     this.task_ = other.task_;
                     this.bitField0_ &= -2;
                     this.taskBuilder_ = SwimParkActivityMsg.S2C_PrayTaskList_16528.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
                  } else {
                     this.taskBuilder_.addAllMessages(other.task_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskCount(); ++i) {
               if (!this.getTask(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PrayTaskList_16528 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayTaskList_16528)SwimParkActivityMsg.S2C_PrayTaskList_16528.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayTaskList_16528)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.task_ = new ArrayList(this.task_);
               this.bitField0_ |= 1;
            }

         }

         public List<ActivityMsg.TaskData> getTaskList() {
            return this.taskBuilder_ == null ? Collections.unmodifiableList(this.task_) : this.taskBuilder_.getMessageList();
         }

         public int getTaskCount() {
            return this.taskBuilder_ == null ? this.task_.size() : this.taskBuilder_.getCount();
         }

         public ActivityMsg.TaskData getTask(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskData)this.task_.get(index) : (ActivityMsg.TaskData)this.taskBuilder_.getMessage(index);
         }

         public Builder setTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.set(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData value) {
            if (this.taskBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskIsMutable();
               this.task_.add(index, value);
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTask(ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTask(int index, ActivityMsg.TaskData.Builder builderForValue) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTask(Iterable<? extends ActivityMsg.TaskData> values) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.task_);
               this.onChanged();
            } else {
               this.taskBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTask() {
            if (this.taskBuilder_ == null) {
               this.task_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskBuilder_.clear();
            }

            return this;
         }

         public Builder removeTask(int index) {
            if (this.taskBuilder_ == null) {
               this.ensureTaskIsMutable();
               this.task_.remove(index);
               this.onChanged();
            } else {
               this.taskBuilder_.remove(index);
            }

            return this;
         }

         public ActivityMsg.TaskData.Builder getTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().getBuilder(index);
         }

         public ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index) {
            return this.taskBuilder_ == null ? (ActivityMsg.TaskDataOrBuilder)this.task_.get(index) : (ActivityMsg.TaskDataOrBuilder)this.taskBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList() {
            return this.taskBuilder_ != null ? this.taskBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.task_);
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder() {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(ActivityMsg.TaskData.getDefaultInstance());
         }

         public ActivityMsg.TaskData.Builder addTaskBuilder(int index) {
            return (ActivityMsg.TaskData.Builder)this.getTaskFieldBuilder().addBuilder(index, ActivityMsg.TaskData.getDefaultInstance());
         }

         public List<ActivityMsg.TaskData.Builder> getTaskBuilderList() {
            return this.getTaskFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> getTaskFieldBuilder() {
            if (this.taskBuilder_ == null) {
               this.taskBuilder_ = new RepeatedFieldBuilderV3(this.task_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.task_ = null;
            }

            return this.taskBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LampRiddleTotalInfo_16553 extends GeneratedMessageV3 implements C2S_LampRiddleTotalInfo_16553OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LampRiddleTotalInfo_16553 DEFAULT_INSTANCE = new C2S_LampRiddleTotalInfo_16553();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LampRiddleTotalInfo_16553> PARSER = new AbstractParser<C2S_LampRiddleTotalInfo_16553>() {
         public C2S_LampRiddleTotalInfo_16553 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LampRiddleTotalInfo_16553(input, extensionRegistry);
         }
      };

      private C2S_LampRiddleTotalInfo_16553(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LampRiddleTotalInfo_16553() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LampRiddleTotalInfo_16553();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LampRiddleTotalInfo_16553(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LampRiddleTotalInfo_16553.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LampRiddleTotalInfo_16553)) {
            return super.equals(obj);
         } else {
            C2S_LampRiddleTotalInfo_16553 other = (C2S_LampRiddleTotalInfo_16553)obj;
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

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_16553)PARSER.parseFrom(data);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_16553)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_16553)PARSER.parseFrom(data);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_16553)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_16553)PARSER.parseFrom(data);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LampRiddleTotalInfo_16553)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(InputStream input) throws IOException {
         return (C2S_LampRiddleTotalInfo_16553)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LampRiddleTotalInfo_16553)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LampRiddleTotalInfo_16553)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LampRiddleTotalInfo_16553)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LampRiddleTotalInfo_16553)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LampRiddleTotalInfo_16553 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LampRiddleTotalInfo_16553)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LampRiddleTotalInfo_16553 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LampRiddleTotalInfo_16553 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LampRiddleTotalInfo_16553> parser() {
         return PARSER;
      }

      public Parser<C2S_LampRiddleTotalInfo_16553> getParserForType() {
         return PARSER;
      }

      public C2S_LampRiddleTotalInfo_16553 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LampRiddleTotalInfo_16553OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LampRiddleTotalInfo_16553.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_LampRiddleTotalInfo_16553.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_LampRiddleTotalInfo_16553_descriptor;
         }

         public C2S_LampRiddleTotalInfo_16553 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_LampRiddleTotalInfo_16553.getDefaultInstance();
         }

         public C2S_LampRiddleTotalInfo_16553 build() {
            C2S_LampRiddleTotalInfo_16553 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LampRiddleTotalInfo_16553 buildPartial() {
            C2S_LampRiddleTotalInfo_16553 result = new C2S_LampRiddleTotalInfo_16553(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LampRiddleTotalInfo_16553) {
               return this.mergeFrom((C2S_LampRiddleTotalInfo_16553)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LampRiddleTotalInfo_16553 other) {
            if (other == SwimParkActivityMsg.C2S_LampRiddleTotalInfo_16553.getDefaultInstance()) {
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
            C2S_LampRiddleTotalInfo_16553 parsedMessage = null;

            try {
               parsedMessage = (C2S_LampRiddleTotalInfo_16553)SwimParkActivityMsg.C2S_LampRiddleTotalInfo_16553.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LampRiddleTotalInfo_16553)e.getUnfinishedMessage();
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

   public static final class S2C_LampRiddleTotalInfo_16554 extends GeneratedMessageV3 implements S2C_LampRiddleTotalInfo_16554OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTREWARDS_FIELD_NUMBER = 1;
      private Internal.IntList gotRewards_;
      public static final int STAGERECHARGE_FIELD_NUMBER = 2;
      private int stageRecharge_;
      public static final int STAGEENDTIME_FIELD_NUMBER = 3;
      private long stageEndTime_;
      private byte memoizedIsInitialized;
      private static final S2C_LampRiddleTotalInfo_16554 DEFAULT_INSTANCE = new S2C_LampRiddleTotalInfo_16554();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LampRiddleTotalInfo_16554> PARSER = new AbstractParser<S2C_LampRiddleTotalInfo_16554>() {
         public S2C_LampRiddleTotalInfo_16554 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LampRiddleTotalInfo_16554(input, extensionRegistry);
         }
      };

      private S2C_LampRiddleTotalInfo_16554(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LampRiddleTotalInfo_16554() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LampRiddleTotalInfo_16554();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LampRiddleTotalInfo_16554(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.gotRewards_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRewards_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.stageRecharge_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.stageEndTime_ = input.readInt64();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.gotRewards_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.gotRewards_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LampRiddleTotalInfo_16554.class, Builder.class);
      }

      public List<Integer> getGotRewardsList() {
         return this.gotRewards_;
      }

      public int getGotRewardsCount() {
         return this.gotRewards_.size();
      }

      public int getGotRewards(int index) {
         return this.gotRewards_.getInt(index);
      }

      public boolean hasStageRecharge() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStageRecharge() {
         return this.stageRecharge_;
      }

      public boolean hasStageEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getStageEndTime() {
         return this.stageEndTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStageRecharge()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStageEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.gotRewards_.size(); ++i) {
            output.writeInt32(1, this.gotRewards_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.stageRecharge_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(3, this.stageEndTime_);
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

            for(int i = 0; i < this.gotRewards_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRewards_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRewardsList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.stageRecharge_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.stageEndTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LampRiddleTotalInfo_16554)) {
            return super.equals(obj);
         } else {
            S2C_LampRiddleTotalInfo_16554 other = (S2C_LampRiddleTotalInfo_16554)obj;
            if (!this.getGotRewardsList().equals(other.getGotRewardsList())) {
               return false;
            } else if (this.hasStageRecharge() != other.hasStageRecharge()) {
               return false;
            } else if (this.hasStageRecharge() && this.getStageRecharge() != other.getStageRecharge()) {
               return false;
            } else if (this.hasStageEndTime() != other.hasStageEndTime()) {
               return false;
            } else if (this.hasStageEndTime() && this.getStageEndTime() != other.getStageEndTime()) {
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
            if (this.getGotRewardsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGotRewardsList().hashCode();
            }

            if (this.hasStageRecharge()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStageRecharge();
            }

            if (this.hasStageEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getStageEndTime());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_16554)PARSER.parseFrom(data);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_16554)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_16554)PARSER.parseFrom(data);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_16554)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_16554)PARSER.parseFrom(data);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LampRiddleTotalInfo_16554)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(InputStream input) throws IOException {
         return (S2C_LampRiddleTotalInfo_16554)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LampRiddleTotalInfo_16554)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LampRiddleTotalInfo_16554)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LampRiddleTotalInfo_16554)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LampRiddleTotalInfo_16554)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LampRiddleTotalInfo_16554 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LampRiddleTotalInfo_16554)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LampRiddleTotalInfo_16554 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LampRiddleTotalInfo_16554 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LampRiddleTotalInfo_16554> parser() {
         return PARSER;
      }

      public Parser<S2C_LampRiddleTotalInfo_16554> getParserForType() {
         return PARSER;
      }

      public S2C_LampRiddleTotalInfo_16554 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LampRiddleTotalInfo_16554OrBuilder {
         private int bitField0_;
         private Internal.IntList gotRewards_;
         private int stageRecharge_;
         private long stageEndTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LampRiddleTotalInfo_16554.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotRewards_ = SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.emptyIntList();
            this.bitField0_ &= -2;
            this.stageRecharge_ = 0;
            this.bitField0_ &= -3;
            this.stageEndTime_ = 0L;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_LampRiddleTotalInfo_16554_descriptor;
         }

         public S2C_LampRiddleTotalInfo_16554 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.getDefaultInstance();
         }

         public S2C_LampRiddleTotalInfo_16554 build() {
            S2C_LampRiddleTotalInfo_16554 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LampRiddleTotalInfo_16554 buildPartial() {
            S2C_LampRiddleTotalInfo_16554 result = new S2C_LampRiddleTotalInfo_16554(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.gotRewards_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.gotRewards_ = this.gotRewards_;
            if ((from_bitField0_ & 2) != 0) {
               result.stageRecharge_ = this.stageRecharge_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stageEndTime_ = this.stageEndTime_;
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
            if (other instanceof S2C_LampRiddleTotalInfo_16554) {
               return this.mergeFrom((S2C_LampRiddleTotalInfo_16554)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LampRiddleTotalInfo_16554 other) {
            if (other == SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.getDefaultInstance()) {
               return this;
            } else {
               if (!other.gotRewards_.isEmpty()) {
                  if (this.gotRewards_.isEmpty()) {
                     this.gotRewards_ = other.gotRewards_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureGotRewardsIsMutable();
                     this.gotRewards_.addAll(other.gotRewards_);
                  }

                  this.onChanged();
               }

               if (other.hasStageRecharge()) {
                  this.setStageRecharge(other.getStageRecharge());
               }

               if (other.hasStageEndTime()) {
                  this.setStageEndTime(other.getStageEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStageRecharge()) {
               return false;
            } else {
               return this.hasStageEndTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LampRiddleTotalInfo_16554 parsedMessage = null;

            try {
               parsedMessage = (S2C_LampRiddleTotalInfo_16554)SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LampRiddleTotalInfo_16554)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGotRewardsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.gotRewards_ = SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.mutableCopy(this.gotRewards_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getGotRewardsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.gotRewards_) : this.gotRewards_);
         }

         public int getGotRewardsCount() {
            return this.gotRewards_.size();
         }

         public int getGotRewards(int index) {
            return this.gotRewards_.getInt(index);
         }

         public Builder setGotRewards(int index, int value) {
            this.ensureGotRewardsIsMutable();
            this.gotRewards_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotRewards(int value) {
            this.ensureGotRewardsIsMutable();
            this.gotRewards_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotRewards(Iterable<? extends Integer> values) {
            this.ensureGotRewardsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotRewards_);
            this.onChanged();
            return this;
         }

         public Builder clearGotRewards() {
            this.gotRewards_ = SwimParkActivityMsg.S2C_LampRiddleTotalInfo_16554.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasStageRecharge() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStageRecharge() {
            return this.stageRecharge_;
         }

         public Builder setStageRecharge(int value) {
            this.bitField0_ |= 2;
            this.stageRecharge_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageRecharge() {
            this.bitField0_ &= -3;
            this.stageRecharge_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStageEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getStageEndTime() {
            return this.stageEndTime_;
         }

         public Builder setStageEndTime(long value) {
            this.bitField0_ |= 4;
            this.stageEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStageEndTime() {
            this.bitField0_ &= -5;
            this.stageEndTime_ = 0L;
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

   public static final class C2S_ReceiveLampRiddleReward_16555 extends GeneratedMessageV3 implements C2S_ReceiveLampRiddleReward_16555OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveLampRiddleReward_16555 DEFAULT_INSTANCE = new C2S_ReceiveLampRiddleReward_16555();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveLampRiddleReward_16555> PARSER = new AbstractParser<C2S_ReceiveLampRiddleReward_16555>() {
         public C2S_ReceiveLampRiddleReward_16555 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveLampRiddleReward_16555(input, extensionRegistry);
         }
      };

      private C2S_ReceiveLampRiddleReward_16555(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveLampRiddleReward_16555() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveLampRiddleReward_16555();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveLampRiddleReward_16555(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveLampRiddleReward_16555.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveLampRiddleReward_16555)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveLampRiddleReward_16555 other = (C2S_ReceiveLampRiddleReward_16555)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_16555)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_16555)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_16555)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_16555)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_16555)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveLampRiddleReward_16555)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveLampRiddleReward_16555)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveLampRiddleReward_16555)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveLampRiddleReward_16555)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveLampRiddleReward_16555)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveLampRiddleReward_16555)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveLampRiddleReward_16555 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveLampRiddleReward_16555)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveLampRiddleReward_16555 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveLampRiddleReward_16555 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveLampRiddleReward_16555> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveLampRiddleReward_16555> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveLampRiddleReward_16555 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveLampRiddleReward_16555OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveLampRiddleReward_16555.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_ReceiveLampRiddleReward_16555.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveLampRiddleReward_16555_descriptor;
         }

         public C2S_ReceiveLampRiddleReward_16555 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_ReceiveLampRiddleReward_16555.getDefaultInstance();
         }

         public C2S_ReceiveLampRiddleReward_16555 build() {
            C2S_ReceiveLampRiddleReward_16555 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveLampRiddleReward_16555 buildPartial() {
            C2S_ReceiveLampRiddleReward_16555 result = new C2S_ReceiveLampRiddleReward_16555(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_ReceiveLampRiddleReward_16555) {
               return this.mergeFrom((C2S_ReceiveLampRiddleReward_16555)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveLampRiddleReward_16555 other) {
            if (other == SwimParkActivityMsg.C2S_ReceiveLampRiddleReward_16555.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRewardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveLampRiddleReward_16555 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveLampRiddleReward_16555)SwimParkActivityMsg.C2S_ReceiveLampRiddleReward_16555.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveLampRiddleReward_16555)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
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

   public static final class C2S_WineTotalInfo_16556 extends GeneratedMessageV3 implements C2S_WineTotalInfo_16556OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WineTotalInfo_16556 DEFAULT_INSTANCE = new C2S_WineTotalInfo_16556();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WineTotalInfo_16556> PARSER = new AbstractParser<C2S_WineTotalInfo_16556>() {
         public C2S_WineTotalInfo_16556 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WineTotalInfo_16556(input, extensionRegistry);
         }
      };

      private C2S_WineTotalInfo_16556(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WineTotalInfo_16556() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WineTotalInfo_16556();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WineTotalInfo_16556(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WineTotalInfo_16556.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WineTotalInfo_16556)) {
            return super.equals(obj);
         } else {
            C2S_WineTotalInfo_16556 other = (C2S_WineTotalInfo_16556)obj;
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

      public static C2S_WineTotalInfo_16556 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_16556)PARSER.parseFrom(data);
      }

      public static C2S_WineTotalInfo_16556 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_16556)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WineTotalInfo_16556 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_16556)PARSER.parseFrom(data);
      }

      public static C2S_WineTotalInfo_16556 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_16556)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WineTotalInfo_16556 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_16556)PARSER.parseFrom(data);
      }

      public static C2S_WineTotalInfo_16556 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WineTotalInfo_16556)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WineTotalInfo_16556 parseFrom(InputStream input) throws IOException {
         return (C2S_WineTotalInfo_16556)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WineTotalInfo_16556 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WineTotalInfo_16556)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WineTotalInfo_16556 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WineTotalInfo_16556)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WineTotalInfo_16556 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WineTotalInfo_16556)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WineTotalInfo_16556 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WineTotalInfo_16556)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WineTotalInfo_16556 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WineTotalInfo_16556)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WineTotalInfo_16556 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WineTotalInfo_16556 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WineTotalInfo_16556> parser() {
         return PARSER;
      }

      public Parser<C2S_WineTotalInfo_16556> getParserForType() {
         return PARSER;
      }

      public C2S_WineTotalInfo_16556 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WineTotalInfo_16556OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WineTotalInfo_16556.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_WineTotalInfo_16556.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_WineTotalInfo_16556_descriptor;
         }

         public C2S_WineTotalInfo_16556 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_WineTotalInfo_16556.getDefaultInstance();
         }

         public C2S_WineTotalInfo_16556 build() {
            C2S_WineTotalInfo_16556 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WineTotalInfo_16556 buildPartial() {
            C2S_WineTotalInfo_16556 result = new C2S_WineTotalInfo_16556(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WineTotalInfo_16556) {
               return this.mergeFrom((C2S_WineTotalInfo_16556)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WineTotalInfo_16556 other) {
            if (other == SwimParkActivityMsg.C2S_WineTotalInfo_16556.getDefaultInstance()) {
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
            C2S_WineTotalInfo_16556 parsedMessage = null;

            try {
               parsedMessage = (C2S_WineTotalInfo_16556)SwimParkActivityMsg.C2S_WineTotalInfo_16556.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WineTotalInfo_16556)e.getUnfinishedMessage();
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

   public static final class S2C_WineTotalInfo_16557 extends GeneratedMessageV3 implements S2C_WineTotalInfo_16557OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UNLOCKSTAGENUM_FIELD_NUMBER = 1;
      private int unlockStageNum_;
      public static final int CANRECEIVEREWARDIDS_FIELD_NUMBER = 2;
      private Internal.IntList canReceiveRewardIds_;
      public static final int HASRECEIVEREWARDIDS_FIELD_NUMBER = 3;
      private Internal.IntList hasReceiveRewardIds_;
      public static final int NEXTUNLOCKRECEIVEREWARD_FIELD_NUMBER = 4;
      private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
      private byte memoizedIsInitialized;
      private static final S2C_WineTotalInfo_16557 DEFAULT_INSTANCE = new S2C_WineTotalInfo_16557();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WineTotalInfo_16557> PARSER = new AbstractParser<S2C_WineTotalInfo_16557>() {
         public S2C_WineTotalInfo_16557 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WineTotalInfo_16557(input, extensionRegistry);
         }
      };

      private S2C_WineTotalInfo_16557(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WineTotalInfo_16557() {
         this.memoizedIsInitialized = -1;
         this.canReceiveRewardIds_ = emptyIntList();
         this.hasReceiveRewardIds_ = emptyIntList();
         this.nextUnlockReceiveReward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WineTotalInfo_16557();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WineTotalInfo_16557(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unlockStageNum_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.canReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.canReceiveRewardIds_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.canReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.hasReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.hasReceiveRewardIds_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.hasReceiveRewardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.hasReceiveRewardIds_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.nextUnlockReceiveReward_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.nextUnlockReceiveReward_.add(input.readMessage(SwimParkActivityMsg.NextUnlockReceiveReward.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.canReceiveRewardIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.canReceiveRewardIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.hasReceiveRewardIds_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.nextUnlockReceiveReward_ = Collections.unmodifiableList(this.nextUnlockReceiveReward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WineTotalInfo_16557.class, Builder.class);
      }

      public boolean hasUnlockStageNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUnlockStageNum() {
         return this.unlockStageNum_;
      }

      public List<Integer> getCanReceiveRewardIdsList() {
         return this.canReceiveRewardIds_;
      }

      public int getCanReceiveRewardIdsCount() {
         return this.canReceiveRewardIds_.size();
      }

      public int getCanReceiveRewardIds(int index) {
         return this.canReceiveRewardIds_.getInt(index);
      }

      public List<Integer> getHasReceiveRewardIdsList() {
         return this.hasReceiveRewardIds_;
      }

      public int getHasReceiveRewardIdsCount() {
         return this.hasReceiveRewardIds_.size();
      }

      public int getHasReceiveRewardIds(int index) {
         return this.hasReceiveRewardIds_.getInt(index);
      }

      public List<NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
         return this.nextUnlockReceiveReward_;
      }

      public List<? extends NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardOrBuilderList() {
         return this.nextUnlockReceiveReward_;
      }

      public int getNextUnlockReceiveRewardCount() {
         return this.nextUnlockReceiveReward_.size();
      }

      public NextUnlockReceiveReward getNextUnlockReceiveReward(int index) {
         return (NextUnlockReceiveReward)this.nextUnlockReceiveReward_.get(index);
      }

      public NextUnlockReceiveRewardOrBuilder getNextUnlockReceiveRewardOrBuilder(int index) {
         return (NextUnlockReceiveRewardOrBuilder)this.nextUnlockReceiveReward_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUnlockStageNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getNextUnlockReceiveRewardCount(); ++i) {
               if (!this.getNextUnlockReceiveReward(i).isInitialized()) {
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
            output.writeInt32(1, this.unlockStageNum_);
         }

         for(int i = 0; i < this.canReceiveRewardIds_.size(); ++i) {
            output.writeInt32(2, this.canReceiveRewardIds_.getInt(i));
         }

         for(int i = 0; i < this.hasReceiveRewardIds_.size(); ++i) {
            output.writeInt32(3, this.hasReceiveRewardIds_.getInt(i));
         }

         for(int i = 0; i < this.nextUnlockReceiveReward_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.nextUnlockReceiveReward_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.unlockStageNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.canReceiveRewardIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.canReceiveRewardIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCanReceiveRewardIdsList().size();
            dataSize = 0;

            for(int i = 0; i < this.hasReceiveRewardIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.hasReceiveRewardIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHasReceiveRewardIdsList().size();

            for(int i = 0; i < this.nextUnlockReceiveReward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.nextUnlockReceiveReward_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WineTotalInfo_16557)) {
            return super.equals(obj);
         } else {
            S2C_WineTotalInfo_16557 other = (S2C_WineTotalInfo_16557)obj;
            if (this.hasUnlockStageNum() != other.hasUnlockStageNum()) {
               return false;
            } else if (this.hasUnlockStageNum() && this.getUnlockStageNum() != other.getUnlockStageNum()) {
               return false;
            } else if (!this.getCanReceiveRewardIdsList().equals(other.getCanReceiveRewardIdsList())) {
               return false;
            } else if (!this.getHasReceiveRewardIdsList().equals(other.getHasReceiveRewardIdsList())) {
               return false;
            } else if (!this.getNextUnlockReceiveRewardList().equals(other.getNextUnlockReceiveRewardList())) {
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
            if (this.hasUnlockStageNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUnlockStageNum();
            }

            if (this.getCanReceiveRewardIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCanReceiveRewardIdsList().hashCode();
            }

            if (this.getHasReceiveRewardIdsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHasReceiveRewardIdsList().hashCode();
            }

            if (this.getNextUnlockReceiveRewardCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getNextUnlockReceiveRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WineTotalInfo_16557 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_16557)PARSER.parseFrom(data);
      }

      public static S2C_WineTotalInfo_16557 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_16557)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WineTotalInfo_16557 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_16557)PARSER.parseFrom(data);
      }

      public static S2C_WineTotalInfo_16557 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_16557)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WineTotalInfo_16557 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_16557)PARSER.parseFrom(data);
      }

      public static S2C_WineTotalInfo_16557 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WineTotalInfo_16557)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WineTotalInfo_16557 parseFrom(InputStream input) throws IOException {
         return (S2C_WineTotalInfo_16557)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WineTotalInfo_16557 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WineTotalInfo_16557)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WineTotalInfo_16557 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WineTotalInfo_16557)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WineTotalInfo_16557 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WineTotalInfo_16557)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WineTotalInfo_16557 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WineTotalInfo_16557)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WineTotalInfo_16557 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WineTotalInfo_16557)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WineTotalInfo_16557 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WineTotalInfo_16557 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WineTotalInfo_16557> parser() {
         return PARSER;
      }

      public Parser<S2C_WineTotalInfo_16557> getParserForType() {
         return PARSER;
      }

      public S2C_WineTotalInfo_16557 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WineTotalInfo_16557OrBuilder {
         private int bitField0_;
         private int unlockStageNum_;
         private Internal.IntList canReceiveRewardIds_;
         private Internal.IntList hasReceiveRewardIds_;
         private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> nextUnlockReceiveRewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WineTotalInfo_16557.class, Builder.class);
         }

         private Builder() {
            this.canReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.emptyIntList();
            this.hasReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.canReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.emptyIntList();
            this.hasReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_WineTotalInfo_16557.alwaysUseFieldBuilders) {
               this.getNextUnlockReceiveRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockStageNum_ = 0;
            this.bitField0_ &= -2;
            this.canReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.emptyIntList();
            this.bitField0_ &= -3;
            this.hasReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.emptyIntList();
            this.bitField0_ &= -5;
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.nextUnlockReceiveReward_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.nextUnlockReceiveRewardBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_WineTotalInfo_16557_descriptor;
         }

         public S2C_WineTotalInfo_16557 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_WineTotalInfo_16557.getDefaultInstance();
         }

         public S2C_WineTotalInfo_16557 build() {
            S2C_WineTotalInfo_16557 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WineTotalInfo_16557 buildPartial() {
            S2C_WineTotalInfo_16557 result = new S2C_WineTotalInfo_16557(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.unlockStageNum_ = this.unlockStageNum_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.canReceiveRewardIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.canReceiveRewardIds_ = this.canReceiveRewardIds_;
            if ((this.bitField0_ & 4) != 0) {
               this.hasReceiveRewardIds_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.hasReceiveRewardIds_ = this.hasReceiveRewardIds_;
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.nextUnlockReceiveReward_ = Collections.unmodifiableList(this.nextUnlockReceiveReward_);
                  this.bitField0_ &= -9;
               }

               result.nextUnlockReceiveReward_ = this.nextUnlockReceiveReward_;
            } else {
               result.nextUnlockReceiveReward_ = this.nextUnlockReceiveRewardBuilder_.build();
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
            if (other instanceof S2C_WineTotalInfo_16557) {
               return this.mergeFrom((S2C_WineTotalInfo_16557)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WineTotalInfo_16557 other) {
            if (other == SwimParkActivityMsg.S2C_WineTotalInfo_16557.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUnlockStageNum()) {
                  this.setUnlockStageNum(other.getUnlockStageNum());
               }

               if (!other.canReceiveRewardIds_.isEmpty()) {
                  if (this.canReceiveRewardIds_.isEmpty()) {
                     this.canReceiveRewardIds_ = other.canReceiveRewardIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureCanReceiveRewardIdsIsMutable();
                     this.canReceiveRewardIds_.addAll(other.canReceiveRewardIds_);
                  }

                  this.onChanged();
               }

               if (!other.hasReceiveRewardIds_.isEmpty()) {
                  if (this.hasReceiveRewardIds_.isEmpty()) {
                     this.hasReceiveRewardIds_ = other.hasReceiveRewardIds_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureHasReceiveRewardIdsIsMutable();
                     this.hasReceiveRewardIds_.addAll(other.hasReceiveRewardIds_);
                  }

                  this.onChanged();
               }

               if (this.nextUnlockReceiveRewardBuilder_ == null) {
                  if (!other.nextUnlockReceiveReward_.isEmpty()) {
                     if (this.nextUnlockReceiveReward_.isEmpty()) {
                        this.nextUnlockReceiveReward_ = other.nextUnlockReceiveReward_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureNextUnlockReceiveRewardIsMutable();
                        this.nextUnlockReceiveReward_.addAll(other.nextUnlockReceiveReward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.nextUnlockReceiveReward_.isEmpty()) {
                  if (this.nextUnlockReceiveRewardBuilder_.isEmpty()) {
                     this.nextUnlockReceiveRewardBuilder_.dispose();
                     this.nextUnlockReceiveRewardBuilder_ = null;
                     this.nextUnlockReceiveReward_ = other.nextUnlockReceiveReward_;
                     this.bitField0_ &= -9;
                     this.nextUnlockReceiveRewardBuilder_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.alwaysUseFieldBuilders ? this.getNextUnlockReceiveRewardFieldBuilder() : null;
                  } else {
                     this.nextUnlockReceiveRewardBuilder_.addAllMessages(other.nextUnlockReceiveReward_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUnlockStageNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getNextUnlockReceiveRewardCount(); ++i) {
                  if (!this.getNextUnlockReceiveReward(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WineTotalInfo_16557 parsedMessage = null;

            try {
               parsedMessage = (S2C_WineTotalInfo_16557)SwimParkActivityMsg.S2C_WineTotalInfo_16557.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WineTotalInfo_16557)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUnlockStageNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUnlockStageNum() {
            return this.unlockStageNum_;
         }

         public Builder setUnlockStageNum(int value) {
            this.bitField0_ |= 1;
            this.unlockStageNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnlockStageNum() {
            this.bitField0_ &= -2;
            this.unlockStageNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCanReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.canReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.mutableCopy(this.canReceiveRewardIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getCanReceiveRewardIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.canReceiveRewardIds_) : this.canReceiveRewardIds_);
         }

         public int getCanReceiveRewardIdsCount() {
            return this.canReceiveRewardIds_.size();
         }

         public int getCanReceiveRewardIds(int index) {
            return this.canReceiveRewardIds_.getInt(index);
         }

         public Builder setCanReceiveRewardIds(int index, int value) {
            this.ensureCanReceiveRewardIdsIsMutable();
            this.canReceiveRewardIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCanReceiveRewardIds(int value) {
            this.ensureCanReceiveRewardIdsIsMutable();
            this.canReceiveRewardIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCanReceiveRewardIds(Iterable<? extends Integer> values) {
            this.ensureCanReceiveRewardIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.canReceiveRewardIds_);
            this.onChanged();
            return this;
         }

         public Builder clearCanReceiveRewardIds() {
            this.canReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureHasReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hasReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.mutableCopy(this.hasReceiveRewardIds_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getHasReceiveRewardIdsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.hasReceiveRewardIds_) : this.hasReceiveRewardIds_);
         }

         public int getHasReceiveRewardIdsCount() {
            return this.hasReceiveRewardIds_.size();
         }

         public int getHasReceiveRewardIds(int index) {
            return this.hasReceiveRewardIds_.getInt(index);
         }

         public Builder setHasReceiveRewardIds(int index, int value) {
            this.ensureHasReceiveRewardIdsIsMutable();
            this.hasReceiveRewardIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHasReceiveRewardIds(int value) {
            this.ensureHasReceiveRewardIdsIsMutable();
            this.hasReceiveRewardIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHasReceiveRewardIds(Iterable<? extends Integer> values) {
            this.ensureHasReceiveRewardIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hasReceiveRewardIds_);
            this.onChanged();
            return this;
         }

         public Builder clearHasReceiveRewardIds() {
            this.hasReceiveRewardIds_ = SwimParkActivityMsg.S2C_WineTotalInfo_16557.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         private void ensureNextUnlockReceiveRewardIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.nextUnlockReceiveReward_ = new ArrayList(this.nextUnlockReceiveReward_);
               this.bitField0_ |= 8;
            }

         }

         public List<NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
            return this.nextUnlockReceiveRewardBuilder_ == null ? Collections.unmodifiableList(this.nextUnlockReceiveReward_) : this.nextUnlockReceiveRewardBuilder_.getMessageList();
         }

         public int getNextUnlockReceiveRewardCount() {
            return this.nextUnlockReceiveRewardBuilder_ == null ? this.nextUnlockReceiveReward_.size() : this.nextUnlockReceiveRewardBuilder_.getCount();
         }

         public NextUnlockReceiveReward getNextUnlockReceiveReward(int index) {
            return this.nextUnlockReceiveRewardBuilder_ == null ? (NextUnlockReceiveReward)this.nextUnlockReceiveReward_.get(index) : (NextUnlockReceiveReward)this.nextUnlockReceiveRewardBuilder_.getMessage(index);
         }

         public Builder setNextUnlockReceiveReward(int index, NextUnlockReceiveReward value) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.set(index, value);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setNextUnlockReceiveReward(int index, NextUnlockReceiveReward.Builder builderForValue) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(NextUnlockReceiveReward value) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(value);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(int index, NextUnlockReceiveReward value) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(index, value);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(NextUnlockReceiveReward.Builder builderForValue) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addNextUnlockReceiveReward(int index, NextUnlockReceiveReward.Builder builderForValue) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllNextUnlockReceiveReward(Iterable<? extends NextUnlockReceiveReward> values) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.nextUnlockReceiveReward_);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearNextUnlockReceiveReward() {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.nextUnlockReceiveReward_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeNextUnlockReceiveReward(int index) {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.ensureNextUnlockReceiveRewardIsMutable();
               this.nextUnlockReceiveReward_.remove(index);
               this.onChanged();
            } else {
               this.nextUnlockReceiveRewardBuilder_.remove(index);
            }

            return this;
         }

         public NextUnlockReceiveReward.Builder getNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().getBuilder(index);
         }

         public NextUnlockReceiveRewardOrBuilder getNextUnlockReceiveRewardOrBuilder(int index) {
            return this.nextUnlockReceiveRewardBuilder_ == null ? (NextUnlockReceiveRewardOrBuilder)this.nextUnlockReceiveReward_.get(index) : (NextUnlockReceiveRewardOrBuilder)this.nextUnlockReceiveRewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardOrBuilderList() {
            return this.nextUnlockReceiveRewardBuilder_ != null ? this.nextUnlockReceiveRewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.nextUnlockReceiveReward_);
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder() {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(SwimParkActivityMsg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(index, SwimParkActivityMsg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public List<NextUnlockReceiveReward.Builder> getNextUnlockReceiveRewardBuilderList() {
            return this.getNextUnlockReceiveRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardFieldBuilder() {
            if (this.nextUnlockReceiveRewardBuilder_ == null) {
               this.nextUnlockReceiveRewardBuilder_ = new RepeatedFieldBuilderV3(this.nextUnlockReceiveReward_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.nextUnlockReceiveReward_ = null;
            }

            return this.nextUnlockReceiveRewardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class NextUnlockReceiveReward extends GeneratedMessageV3 implements NextUnlockReceiveRewardOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      public static final int PROGRESS_FIELD_NUMBER = 2;
      private double progress_;
      private byte memoizedIsInitialized;
      private static final NextUnlockReceiveReward DEFAULT_INSTANCE = new NextUnlockReceiveReward();
      /** @deprecated */
      @Deprecated
      public static final Parser<NextUnlockReceiveReward> PARSER = new AbstractParser<NextUnlockReceiveReward>() {
         public NextUnlockReceiveReward parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new NextUnlockReceiveReward(input, extensionRegistry);
         }
      };

      private NextUnlockReceiveReward(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private NextUnlockReceiveReward() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new NextUnlockReceiveReward();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private NextUnlockReceiveReward(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardId_ = input.readInt32();
                        break;
                     case 17:
                        this.bitField0_ |= 2;
                        this.progress_ = input.readDouble();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public boolean hasProgress() {
         return (this.bitField0_ & 2) != 0;
      }

      public double getProgress() {
         return this.progress_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasProgress()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeDouble(2, this.progress_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeDoubleSize(2, this.progress_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof NextUnlockReceiveReward)) {
            return super.equals(obj);
         } else {
            NextUnlockReceiveReward other = (NextUnlockReceiveReward)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
               return false;
            } else if (this.hasProgress() != other.hasProgress()) {
               return false;
            } else if (this.hasProgress() && Double.doubleToLongBits(this.getProgress()) != Double.doubleToLongBits(other.getProgress())) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            if (this.hasProgress()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getProgress()));
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static NextUnlockReceiveReward parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data);
      }

      public static NextUnlockReceiveReward parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data);
      }

      public static NextUnlockReceiveReward parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data);
      }

      public static NextUnlockReceiveReward parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NextUnlockReceiveReward)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(InputStream input) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NextUnlockReceiveReward parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseDelimitedFrom(InputStream input) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static NextUnlockReceiveReward parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static NextUnlockReceiveReward parseFrom(CodedInputStream input) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NextUnlockReceiveReward parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NextUnlockReceiveReward)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(NextUnlockReceiveReward prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static NextUnlockReceiveReward getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<NextUnlockReceiveReward> parser() {
         return PARSER;
      }

      public Parser<NextUnlockReceiveReward> getParserForType() {
         return PARSER;
      }

      public NextUnlockReceiveReward getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NextUnlockReceiveRewardOrBuilder {
         private int bitField0_;
         private int rewardId_;
         private double progress_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.NextUnlockReceiveReward.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            this.progress_ = (double)0.0F;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         public NextUnlockReceiveReward getDefaultInstanceForType() {
            return SwimParkActivityMsg.NextUnlockReceiveReward.getDefaultInstance();
         }

         public NextUnlockReceiveReward build() {
            NextUnlockReceiveReward result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public NextUnlockReceiveReward buildPartial() {
            NextUnlockReceiveReward result = new NextUnlockReceiveReward(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.progress_ = this.progress_;
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
            if (other instanceof NextUnlockReceiveReward) {
               return this.mergeFrom((NextUnlockReceiveReward)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(NextUnlockReceiveReward other) {
            if (other == SwimParkActivityMsg.NextUnlockReceiveReward.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               if (other.hasProgress()) {
                  this.setProgress(other.getProgress());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRewardId()) {
               return false;
            } else {
               return this.hasProgress();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            NextUnlockReceiveReward parsedMessage = null;

            try {
               parsedMessage = (NextUnlockReceiveReward)SwimParkActivityMsg.NextUnlockReceiveReward.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (NextUnlockReceiveReward)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasProgress() {
            return (this.bitField0_ & 2) != 0;
         }

         public double getProgress() {
            return this.progress_;
         }

         public Builder setProgress(double value) {
            this.bitField0_ |= 2;
            this.progress_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearProgress() {
            this.bitField0_ &= -3;
            this.progress_ = (double)0.0F;
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

   public static final class C2S_ReceiveWineReward_16558 extends GeneratedMessageV3 implements C2S_ReceiveWineReward_16558OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveWineReward_16558 DEFAULT_INSTANCE = new C2S_ReceiveWineReward_16558();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveWineReward_16558> PARSER = new AbstractParser<C2S_ReceiveWineReward_16558>() {
         public C2S_ReceiveWineReward_16558 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveWineReward_16558(input, extensionRegistry);
         }
      };

      private C2S_ReceiveWineReward_16558(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveWineReward_16558() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveWineReward_16558();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveWineReward_16558(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveWineReward_16558.class, Builder.class);
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveWineReward_16558)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveWineReward_16558 other = (C2S_ReceiveWineReward_16558)obj;
            if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
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
            if (this.hasRewardId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_16558)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_16558)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_16558)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_16558)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_16558)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveWineReward_16558)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveWineReward_16558)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWineReward_16558)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_16558 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveWineReward_16558)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWineReward_16558 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWineReward_16558)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveWineReward_16558)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveWineReward_16558 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveWineReward_16558)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveWineReward_16558 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveWineReward_16558 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveWineReward_16558> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveWineReward_16558> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveWineReward_16558 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveWineReward_16558OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveWineReward_16558.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_ReceiveWineReward_16558.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ReceiveWineReward_16558_descriptor;
         }

         public C2S_ReceiveWineReward_16558 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_ReceiveWineReward_16558.getDefaultInstance();
         }

         public C2S_ReceiveWineReward_16558 build() {
            C2S_ReceiveWineReward_16558 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveWineReward_16558 buildPartial() {
            C2S_ReceiveWineReward_16558 result = new C2S_ReceiveWineReward_16558(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardId_ = this.rewardId_;
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
            if (other instanceof C2S_ReceiveWineReward_16558) {
               return this.mergeFrom((C2S_ReceiveWineReward_16558)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveWineReward_16558 other) {
            if (other == SwimParkActivityMsg.C2S_ReceiveWineReward_16558.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRewardId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveWineReward_16558 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveWineReward_16558)SwimParkActivityMsg.C2S_ReceiveWineReward_16558.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveWineReward_16558)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 1;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -2;
            this.rewardId_ = 0;
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

   public static final class C2S_FancyReward_16559 extends GeneratedMessageV3 implements C2S_FancyReward_16559OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TARGETID_FIELD_NUMBER = 1;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_16559 DEFAULT_INSTANCE = new C2S_FancyReward_16559();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_16559> PARSER = new AbstractParser<C2S_FancyReward_16559>() {
         public C2S_FancyReward_16559 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_16559(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_16559(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_16559() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_16559();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_16559(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.targetId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_16559.class, Builder.class);
      }

      public boolean hasTargetId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTargetId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.targetId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.targetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FancyReward_16559)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_16559 other = (C2S_FancyReward_16559)obj;
            if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
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
            if (this.hasTargetId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTargetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FancyReward_16559 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16559)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_16559 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16559)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_16559 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16559)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_16559 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16559)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_16559 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16559)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_16559 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_16559)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_16559 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_16559)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_16559 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_16559)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_16559 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_16559)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_16559 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_16559)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_16559 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_16559)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_16559 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_16559)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_16559 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_16559 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_16559> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_16559> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_16559 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_16559OrBuilder {
         private int bitField0_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_16559.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_FancyReward_16559.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.targetId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_FancyReward_16559_descriptor;
         }

         public C2S_FancyReward_16559 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_FancyReward_16559.getDefaultInstance();
         }

         public C2S_FancyReward_16559 build() {
            C2S_FancyReward_16559 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_16559 buildPartial() {
            C2S_FancyReward_16559 result = new C2S_FancyReward_16559(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.targetId_ = this.targetId_;
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
            if (other instanceof C2S_FancyReward_16559) {
               return this.mergeFrom((C2S_FancyReward_16559)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_16559 other) {
            if (other == SwimParkActivityMsg.C2S_FancyReward_16559.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTargetId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FancyReward_16559 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_16559)SwimParkActivityMsg.C2S_FancyReward_16559.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_16559)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTargetId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 1;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -2;
            this.targetId_ = 0;
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

   public static final class S2C_FancyReward_16560 extends GeneratedMessageV3 implements S2C_FancyReward_16560OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_16560 DEFAULT_INSTANCE = new S2C_FancyReward_16560();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_16560> PARSER = new AbstractParser<S2C_FancyReward_16560>() {
         public S2C_FancyReward_16560 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_16560(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_16560(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_16560() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_16560();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_16560(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.targetId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_16560.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTargetId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
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
         } else if (!this.hasTargetId()) {
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
            output.writeInt32(2, this.targetId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.targetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FancyReward_16560)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_16560 other = (S2C_FancyReward_16560)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
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

            if (this.hasTargetId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTargetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FancyReward_16560 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16560)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_16560 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16560)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_16560 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16560)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_16560 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16560)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_16560 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16560)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_16560 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_16560)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_16560 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_16560)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_16560 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_16560)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_16560 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_16560)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_16560 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_16560)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_16560 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_16560)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_16560 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_16560)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_16560 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_16560 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_16560> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_16560> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_16560 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_16560OrBuilder {
         private int bitField0_;
         private int result_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_16560.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_FancyReward_16560.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.targetId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_FancyReward_16560_descriptor;
         }

         public S2C_FancyReward_16560 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_FancyReward_16560.getDefaultInstance();
         }

         public S2C_FancyReward_16560 build() {
            S2C_FancyReward_16560 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_16560 buildPartial() {
            S2C_FancyReward_16560 result = new S2C_FancyReward_16560(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.targetId_ = this.targetId_;
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
            if (other instanceof S2C_FancyReward_16560) {
               return this.mergeFrom((S2C_FancyReward_16560)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_16560 other) {
            if (other == SwimParkActivityMsg.S2C_FancyReward_16560.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
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
               return this.hasTargetId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FancyReward_16560 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_16560)SwimParkActivityMsg.S2C_FancyReward_16560.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_16560)e.getUnfinishedMessage();
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

         public boolean hasTargetId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 2;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -3;
            this.targetId_ = 0;
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

   public static final class C2S_ServerDrawRecord_16561 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_16561OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_16561 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_16561();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_16561> PARSER = new AbstractParser<C2S_ServerDrawRecord_16561>() {
         public C2S_ServerDrawRecord_16561 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_16561(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_16561(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_16561() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_16561();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_16561(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_16561.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_16561)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_16561 other = (C2S_ServerDrawRecord_16561)obj;
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

      public static C2S_ServerDrawRecord_16561 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16561)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_16561 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16561)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16561 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16561)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_16561 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16561)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16561 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16561)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_16561 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_16561)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16561 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_16561)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_16561 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_16561)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16561 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_16561)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_16561 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_16561)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_16561 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_16561)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_16561 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_16561)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_16561 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_16561 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_16561> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_16561> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_16561 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_16561OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_16561.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.C2S_ServerDrawRecord_16561.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_C2S_ServerDrawRecord_16561_descriptor;
         }

         public C2S_ServerDrawRecord_16561 getDefaultInstanceForType() {
            return SwimParkActivityMsg.C2S_ServerDrawRecord_16561.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_16561 build() {
            C2S_ServerDrawRecord_16561 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_16561 buildPartial() {
            C2S_ServerDrawRecord_16561 result = new C2S_ServerDrawRecord_16561(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ServerDrawRecord_16561) {
               return this.mergeFrom((C2S_ServerDrawRecord_16561)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_16561 other) {
            if (other == SwimParkActivityMsg.C2S_ServerDrawRecord_16561.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_16561 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_16561)SwimParkActivityMsg.C2S_ServerDrawRecord_16561.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_16561)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_16562 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_16562OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_16562 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_16562();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_16562> PARSER = new AbstractParser<S2C_ServerDrawRecord_16562>() {
         public S2C_ServerDrawRecord_16562 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_16562(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_16562(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_16562() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_16562();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_16562(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.serverRecord_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.serverRecord_.add(input.readMessage(SwimParkActivityMsg.ServerDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.serverRecord_ = Collections.unmodifiableList(this.serverRecord_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_16562.class, Builder.class);
      }

      public List<ServerDrawRecord> getServerRecordList() {
         return this.serverRecord_;
      }

      public List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList() {
         return this.serverRecord_;
      }

      public int getServerRecordCount() {
         return this.serverRecord_.size();
      }

      public ServerDrawRecord getServerRecord(int index) {
         return (ServerDrawRecord)this.serverRecord_.get(index);
      }

      public ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index) {
         return (ServerDrawRecordOrBuilder)this.serverRecord_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getServerRecordCount(); ++i) {
               if (!this.getServerRecord(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.serverRecord_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.serverRecord_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.serverRecord_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.serverRecord_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ServerDrawRecord_16562)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_16562 other = (S2C_ServerDrawRecord_16562)obj;
            if (!this.getServerRecordList().equals(other.getServerRecordList())) {
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
            if (this.getServerRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16562)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16562)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16562)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16562)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16562)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_16562)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_16562)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_16562)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16562 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_16562)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_16562 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_16562)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_16562)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_16562 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_16562)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_16562 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_16562 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_16562> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_16562> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_16562 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_16562OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_16562.class, Builder.class);
         }

         private Builder() {
            this.serverRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.serverRecord_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (SwimParkActivityMsg.S2C_ServerDrawRecord_16562.alwaysUseFieldBuilders) {
               this.getServerRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.serverRecordBuilder_ == null) {
               this.serverRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.serverRecordBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return SwimParkActivityMsg.internal_static_swimParkActivity_com_gzbz_protobuf_S2C_ServerDrawRecord_16562_descriptor;
         }

         public S2C_ServerDrawRecord_16562 getDefaultInstanceForType() {
            return SwimParkActivityMsg.S2C_ServerDrawRecord_16562.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_16562 build() {
            S2C_ServerDrawRecord_16562 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_16562 buildPartial() {
            S2C_ServerDrawRecord_16562 result = new S2C_ServerDrawRecord_16562(this);
            int from_bitField0_ = this.bitField0_;
            if (this.serverRecordBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.serverRecord_ = Collections.unmodifiableList(this.serverRecord_);
                  this.bitField0_ &= -2;
               }

               result.serverRecord_ = this.serverRecord_;
            } else {
               result.serverRecord_ = this.serverRecordBuilder_.build();
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
            if (other instanceof S2C_ServerDrawRecord_16562) {
               return this.mergeFrom((S2C_ServerDrawRecord_16562)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_16562 other) {
            if (other == SwimParkActivityMsg.S2C_ServerDrawRecord_16562.getDefaultInstance()) {
               return this;
            } else {
               if (this.serverRecordBuilder_ == null) {
                  if (!other.serverRecord_.isEmpty()) {
                     if (this.serverRecord_.isEmpty()) {
                        this.serverRecord_ = other.serverRecord_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureServerRecordIsMutable();
                        this.serverRecord_.addAll(other.serverRecord_);
                     }

                     this.onChanged();
                  }
               } else if (!other.serverRecord_.isEmpty()) {
                  if (this.serverRecordBuilder_.isEmpty()) {
                     this.serverRecordBuilder_.dispose();
                     this.serverRecordBuilder_ = null;
                     this.serverRecord_ = other.serverRecord_;
                     this.bitField0_ &= -2;
                     this.serverRecordBuilder_ = SwimParkActivityMsg.S2C_ServerDrawRecord_16562.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
                  } else {
                     this.serverRecordBuilder_.addAllMessages(other.serverRecord_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getServerRecordCount(); ++i) {
               if (!this.getServerRecord(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ServerDrawRecord_16562 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_16562)SwimParkActivityMsg.S2C_ServerDrawRecord_16562.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_16562)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureServerRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.serverRecord_ = new ArrayList(this.serverRecord_);
               this.bitField0_ |= 1;
            }

         }

         public List<ServerDrawRecord> getServerRecordList() {
            return this.serverRecordBuilder_ == null ? Collections.unmodifiableList(this.serverRecord_) : this.serverRecordBuilder_.getMessageList();
         }

         public int getServerRecordCount() {
            return this.serverRecordBuilder_ == null ? this.serverRecord_.size() : this.serverRecordBuilder_.getCount();
         }

         public ServerDrawRecord getServerRecord(int index) {
            return this.serverRecordBuilder_ == null ? (ServerDrawRecord)this.serverRecord_.get(index) : (ServerDrawRecord)this.serverRecordBuilder_.getMessage(index);
         }

         public Builder setServerRecord(int index, ServerDrawRecord value) {
            if (this.serverRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureServerRecordIsMutable();
               this.serverRecord_.set(index, value);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setServerRecord(int index, ServerDrawRecord.Builder builderForValue) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               this.serverRecord_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.serverRecordBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addServerRecord(ServerDrawRecord value) {
            if (this.serverRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureServerRecordIsMutable();
               this.serverRecord_.add(value);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addServerRecord(int index, ServerDrawRecord value) {
            if (this.serverRecordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureServerRecordIsMutable();
               this.serverRecord_.add(index, value);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addServerRecord(ServerDrawRecord.Builder builderForValue) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               this.serverRecord_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addServerRecord(int index, ServerDrawRecord.Builder builderForValue) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               this.serverRecord_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllServerRecord(Iterable<? extends ServerDrawRecord> values) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.serverRecord_);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearServerRecord() {
            if (this.serverRecordBuilder_ == null) {
               this.serverRecord_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.serverRecordBuilder_.clear();
            }

            return this;
         }

         public Builder removeServerRecord(int index) {
            if (this.serverRecordBuilder_ == null) {
               this.ensureServerRecordIsMutable();
               this.serverRecord_.remove(index);
               this.onChanged();
            } else {
               this.serverRecordBuilder_.remove(index);
            }

            return this;
         }

         public ServerDrawRecord.Builder getServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().getBuilder(index);
         }

         public ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index) {
            return this.serverRecordBuilder_ == null ? (ServerDrawRecordOrBuilder)this.serverRecord_.get(index) : (ServerDrawRecordOrBuilder)this.serverRecordBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList() {
            return this.serverRecordBuilder_ != null ? this.serverRecordBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.serverRecord_);
         }

         public ServerDrawRecord.Builder addServerRecordBuilder() {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(SwimParkActivityMsg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, SwimParkActivityMsg.ServerDrawRecord.getDefaultInstance());
         }

         public List<ServerDrawRecord.Builder> getServerRecordBuilderList() {
            return this.getServerRecordFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> getServerRecordFieldBuilder() {
            if (this.serverRecordBuilder_ == null) {
               this.serverRecordBuilder_ = new RepeatedFieldBuilderV3(this.serverRecord_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.serverRecord_ = null;
            }

            return this.serverRecordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_ActivityInfo_16501OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawRecord_16509OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Draw_16505OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_FancyReward_16559OrBuilder extends MessageOrBuilder {
      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_LampRiddleTotalInfo_16553OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LuckDrawInfo_16503OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenReward_16507OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_Pray_16521OrBuilder extends MessageOrBuilder {
      boolean hasIdx();

      int getIdx();
   }

   public interface C2S_ReceiveLampRiddleReward_16555OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ReceiveWineReward_16558OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ServerDrawRecord_16561OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_WineTotalInfo_16556OrBuilder extends MessageOrBuilder {
   }

   public interface DrawRecordOrBuilder extends MessageOrBuilder {
      boolean hasCreateTime();

      int getCreateTime();

      List<CommonMsg.ItemInfo> getItemInfoList();

      CommonMsg.ItemInfo getItemInfo(int index);

      int getItemInfoCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfoOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemInfoOrBuilder(int index);

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface NextUnlockReceiveRewardOrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();

      boolean hasProgress();

      double getProgress();
   }

   public interface S2C_ActivityInfo_16502OrBuilder extends MessageOrBuilder {
      boolean hasActivityOpenDay();

      int getActivityOpenDay();

      boolean hasSeverActivityDay();

      int getSeverActivityDay();
   }

   public interface S2C_DrawRecord_16510OrBuilder extends MessageOrBuilder {
      List<DrawRecord> getMyRecrodList();

      DrawRecord getMyRecrod(int index);

      int getMyRecrodCount();

      List<? extends DrawRecordOrBuilder> getMyRecrodOrBuilderList();

      DrawRecordOrBuilder getMyRecrodOrBuilder(int index);
   }

   public interface S2C_Draw_16506OrBuilder extends MessageOrBuilder {
      boolean hasDrawTimes();

      int getDrawTimes();

      List<Integer> getIdList();

      int getIdCount();

      int getId(int index);

      boolean hasRecruitNum();

      int getRecruitNum();

      List<CommonMsg.MapDataII> getSeniorNumList();

      CommonMsg.MapDataII getSeniorNum(int index);

      int getSeniorNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index);

      boolean hasIsHaveFancy();

      boolean getIsHaveFancy();

      boolean hasTargetId();

      int getTargetId();

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_FancyReward_16560OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface S2C_LampRiddleTotalInfo_16554OrBuilder extends MessageOrBuilder {
      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);

      boolean hasStageRecharge();

      int getStageRecharge();

      boolean hasStageEndTime();

      long getStageEndTime();
   }

   public interface S2C_LuckDrawInfo_16504OrBuilder extends MessageOrBuilder {
      boolean hasDrawTimes();

      int getDrawTimes();

      List<Integer> getHadRewardIdList();

      int getHadRewardIdCount();

      int getHadRewardId(int index);

      boolean hasStagEndTime();

      long getStagEndTime();

      boolean hasRecruitNum();

      int getRecruitNum();

      List<CommonMsg.MapDataII> getSeniorRewardsList();

      CommonMsg.MapDataII getSeniorRewards(int index);

      int getSeniorRewardsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index);

      boolean hasLotterStage();

      int getLotterStage();

      boolean hasFancyId();

      int getFancyId();

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_OpenReward_16508OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface S2C_PrayInfo_16526OrBuilder extends MessageOrBuilder {
      boolean hasPrayNum();

      int getPrayNum();

      List<Integer> getCountList();

      int getCountCount();

      int getCount(int index);
   }

   public interface S2C_PrayTaskList_16528OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_PrayTaskNotify_16524OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_Pray_16522OrBuilder extends MessageOrBuilder {
      boolean hasPrayNum();

      int getPrayNum();

      boolean hasIdx();

      int getIdx();
   }

   public interface S2C_ServerDrawRecord_16562OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_WineTotalInfo_16557OrBuilder extends MessageOrBuilder {
      boolean hasUnlockStageNum();

      int getUnlockStageNum();

      List<Integer> getCanReceiveRewardIdsList();

      int getCanReceiveRewardIdsCount();

      int getCanReceiveRewardIds(int index);

      List<Integer> getHasReceiveRewardIdsList();

      int getHasReceiveRewardIdsCount();

      int getHasReceiveRewardIds(int index);

      List<NextUnlockReceiveReward> getNextUnlockReceiveRewardList();

      NextUnlockReceiveReward getNextUnlockReceiveReward(int index);

      int getNextUnlockReceiveRewardCount();

      List<? extends NextUnlockReceiveRewardOrBuilder> getNextUnlockReceiveRewardOrBuilderList();

      NextUnlockReceiveRewardOrBuilder getNextUnlockReceiveRewardOrBuilder(int index);
   }

   public interface ServerDrawRecordOrBuilder extends MessageOrBuilder {
      boolean hasCreateTime();

      int getCreateTime();

      boolean hasBelovedItemID();

      int getBelovedItemID();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasServerId();

      int getServerId();
   }
}
