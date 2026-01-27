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

public final class YuanXiao2022Msg {
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private YuanXiao2022Msg() {
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
      String[] descriptorData = new String[]{"\n\u0012YuanXiao2022.proto\u0012\u001eYuanXiao2022.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u000eActivity.proto\"c\n\u0010ServerDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rbelovedItemID\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0010\n\bserverId\u0018\u0004 \u0002(\u0005\"X\n\nDrawRecord\u0012\u0012\n\ncreateTime\u0018\u0001 \u0002(\u0005\u0012\"\n\bitemInfo\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\"\u0018\n\u0016C2S_ActivityInfo_18301\"{\n\u0016S2C_ActivityInfo_18302\u0012\u0011\n\tmakeCount\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tfirstMake\u0018\u0002 \u0002(\b\u0012\u000f\n\u0007openDay\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bactivityDay\u0018\u0004 \u0002(\u0005\u0012\u0015\n\rsmashEggStage\u0018\u0005 \u0002(\u0005\"\u001a\n\u0018C2S_AddUpTotalInfo_18303\"[\n\u0018S2C_AddUpTotalInfo_18304\u0012\u0012\n\ngotRewards\u0018\u0001 \u0003(\u0005\u0012\u0015\n\rstageRecharge\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fstageEndTime\u0018\u0003 \u0002(\u0003\"0\n\u001cC2S_ReceiveAddUpReward_18305\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\"\u0010\n\u000eC2S_Pray_18306\":\n\u000eS2C_Pray_18307\u0012\u0012\n\nfavorCount\u0018\u0001 \u0002(\u0005\u0012\u0014\n\freceiveState\u0018\u0002 \u0002(\u0005\"N\n\u0018S2C_PrayTaskNotify_18308\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"L\n\u0016S2C_PrayTaskList_18310\u00122\n\u0004task\u0018\u0001 \u0003(\u000b2$.activity.com.gzbz.protobuf.TaskData\"\u001e\n\u001cC2S_ReceiveFavorReward_18311\".\n\u000eC2S_Make_18321\u0012\r\n\u0005score\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005guest\u0018\u0002 \u0003(\u0005\"T\n\u000eS2C_Make_18322\u0012\r\n\u0005score\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005guest\u0018\u0002 \u0003(\u0005\u0012\u0011\n\tmakeCount\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tfirstMake\u0018\u0004 \u0002(\b\"*\n\u0015C2S_FancyReward_17231\u0012\u0011\n\titemIndex\u0018\u0001 \u0002(\u0005\":\n\u0015S2C_FancyReward_17232\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0011\n\titemIndex\u0018\u0002 \u0002(\u0005\"!\n\u0012C2S_SmashEgg_17233\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"\u0091\u0001\n\u0012S2C_SmashEgg_17234\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012$\n\tseniorNum\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bsmashEggNum\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bisHaveFancy\u0018\u0004 \u0001(\b\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\u0005 \u0002(\u0005\",\n\u0018C2S_TakeLuckReward_17235\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\";\n\u0018S2C_TakeLuckReward_17236\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007takedId\u0018\u0002 \u0003(\u0005\"\u0015\n\u0013C2S_OpenEggUi_17237\"\u0095\u0001\n\u0013S2C_OpenEggUi_17238\u0012\u000f\n\u0007fancyId\u0018\u0001 \u0002(\u0005\u0012(\n\rseniorRewards\u0018\u0002 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0013\n\u000bsmashEggNum\u0018\u0003 \u0002(\u0005\u0012\u0011\n\ttakedLuck\u0018\u0004 \u0003(\u0005\u0012\u001b\n\u0013fancyGroupDrawTimes\u0018\u0005 \u0002(\u0005\"\u001c\n\u001aC2S_ServerDrawRecord_17239\"d\n\u001aS2C_ServerDrawRecord_17240\u0012F\n\fserverRecord\u0018\u0001 \u0003(\u000b20.YuanXiao2022.com.gzbz.protobuf.ServerDrawRecord\"\u0016\n\u0014C2S_DrawRecord_17241\"T\n\u0014S2C_DrawRecord_17242\u0012<\n\bmyRecrod\u0018\u0001 \u0003(\u000b2*.YuanXiao2022.com.gzbz.protobuf.DrawRecord\"\u001e\n\u001cC2S_StillCostTotalInfo_18356\"Ê\u0001\n\u001cS2C_StillCostTotalInfo_18357\u0012\u0016\n\u000eunlockStageNum\u0018\u0001 \u0002(\u0005\u0012\u001b\n\u0013canReceiveRewardIds\u0018\u0002 \u0003(\u0005\u0012\u001b\n\u0013hasReceiveRewardIds\u0018\u0003 \u0003(\u0005\u0012X\n\u0017nextUnlockReceiveReward\u0018\u0004 \u0003(\u000b27.YuanXiao2022.com.gzbz.protobuf.NextUnlockReceiveReward\"=\n\u0017NextUnlockReceiveReward\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bprogress\u0018\u0002 \u0002(\u0001\"4\n C2S_ReceiveStillCostReward_18358\u0012\u0010\n\brewardId\u0018\u0001 \u0002(\u0005B&\n\u0011com.gzbz.protobufB\u000fYuanXiao2022MsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), ActivityMsg.getDescriptor()});
      internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_descriptor, new String[]{"CreateTime", "BelovedItemID", "PlayerName", "ServerId"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_descriptor, new String[]{"CreateTime", "ItemInfo", "PlayerName"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_descriptor, new String[0]);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_descriptor, new String[]{"MakeCount", "FirstMake", "OpenDay", "ActivityDay", "SmashEggStage"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_descriptor, new String[0]);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_descriptor, new String[]{"GotRewards", "StageRecharge", "StageEndTime"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_descriptor, new String[]{"RewardId"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_descriptor, new String[0]);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_descriptor, new String[]{"FavorCount", "ReceiveState"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_descriptor, new String[]{"Task"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_descriptor, new String[]{"Task"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_descriptor, new String[0]);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_descriptor, new String[]{"Score", "Guest"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_descriptor, new String[]{"Score", "Guest", "MakeCount", "FirstMake"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_descriptor, new String[]{"ItemIndex"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_descriptor, new String[]{"Result", "ItemIndex"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_descriptor, new String[]{"Num"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_descriptor, new String[]{"Result", "SeniorNum", "SmashEggNum", "IsHaveFancy", "FancyGroupDrawTimes"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_descriptor, new String[]{"RewardId"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_descriptor, new String[]{"Result", "TakedId"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_descriptor, new String[0]);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_descriptor, new String[]{"FancyId", "SeniorRewards", "SmashEggNum", "TakedLuck", "FancyGroupDrawTimes"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_descriptor, new String[0]);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_descriptor, new String[]{"ServerRecord"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_descriptor, new String[0]);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_descriptor, new String[]{"MyRecrod"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_descriptor, new String[0]);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_descriptor, new String[]{"UnlockStageNum", "CanReceiveRewardIds", "HasReceiveRewardIds", "NextUnlockReceiveReward"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor, new String[]{"RewardId", "Progress"});
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_descriptor, new String[]{"RewardId"});
      CommonMsg.getDescriptor();
      ActivityMsg.getDescriptor();
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerDrawRecord.class, Builder.class);
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
            if (YuanXiao2022Msg.ServerDrawRecord.alwaysUseFieldBuilders) {
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_ServerDrawRecord_descriptor;
         }

         public ServerDrawRecord getDefaultInstanceForType() {
            return YuanXiao2022Msg.ServerDrawRecord.getDefaultInstance();
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
            if (other == YuanXiao2022Msg.ServerDrawRecord.getDefaultInstance()) {
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
               parsedMessage = (ServerDrawRecord)YuanXiao2022Msg.ServerDrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = YuanXiao2022Msg.ServerDrawRecord.getDefaultInstance().getPlayerName();
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecord.class, Builder.class);
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_fieldAccessorTable.ensureFieldAccessorsInitialized(DrawRecord.class, Builder.class);
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
            if (YuanXiao2022Msg.DrawRecord.alwaysUseFieldBuilders) {
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_DrawRecord_descriptor;
         }

         public DrawRecord getDefaultInstanceForType() {
            return YuanXiao2022Msg.DrawRecord.getDefaultInstance();
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
            if (other == YuanXiao2022Msg.DrawRecord.getDefaultInstance()) {
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
                     this.itemInfoBuilder_ = YuanXiao2022Msg.DrawRecord.alwaysUseFieldBuilders ? this.getItemInfoFieldBuilder() : null;
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
               parsedMessage = (DrawRecord)YuanXiao2022Msg.DrawRecord.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.playerName_ = YuanXiao2022Msg.DrawRecord.getDefaultInstance().getPlayerName();
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

   public static final class C2S_ActivityInfo_18301 extends GeneratedMessageV3 implements C2S_ActivityInfo_18301OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ActivityInfo_18301 DEFAULT_INSTANCE = new C2S_ActivityInfo_18301();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivityInfo_18301> PARSER = new AbstractParser<C2S_ActivityInfo_18301>() {
         public C2S_ActivityInfo_18301 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivityInfo_18301(input, extensionRegistry);
         }
      };

      private C2S_ActivityInfo_18301(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivityInfo_18301() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivityInfo_18301();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivityInfo_18301(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_18301.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ActivityInfo_18301)) {
            return super.equals(obj);
         } else {
            C2S_ActivityInfo_18301 other = (C2S_ActivityInfo_18301)obj;
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

      public static C2S_ActivityInfo_18301 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18301)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_18301 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_18301 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18301)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_18301 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_18301 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18301)PARSER.parseFrom(data);
      }

      public static C2S_ActivityInfo_18301 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivityInfo_18301)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivityInfo_18301 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_18301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_18301 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_18301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_18301 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivityInfo_18301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_18301 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_18301)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivityInfo_18301 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivityInfo_18301)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivityInfo_18301 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivityInfo_18301)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivityInfo_18301 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivityInfo_18301 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivityInfo_18301> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivityInfo_18301> getParserForType() {
         return PARSER;
      }

      public C2S_ActivityInfo_18301 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivityInfo_18301OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivityInfo_18301.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_ActivityInfo_18301.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ActivityInfo_18301_descriptor;
         }

         public C2S_ActivityInfo_18301 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_ActivityInfo_18301.getDefaultInstance();
         }

         public C2S_ActivityInfo_18301 build() {
            C2S_ActivityInfo_18301 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivityInfo_18301 buildPartial() {
            C2S_ActivityInfo_18301 result = new C2S_ActivityInfo_18301(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ActivityInfo_18301) {
               return this.mergeFrom((C2S_ActivityInfo_18301)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivityInfo_18301 other) {
            if (other == YuanXiao2022Msg.C2S_ActivityInfo_18301.getDefaultInstance()) {
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
            C2S_ActivityInfo_18301 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivityInfo_18301)YuanXiao2022Msg.C2S_ActivityInfo_18301.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivityInfo_18301)e.getUnfinishedMessage();
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

   public static final class S2C_ActivityInfo_18302 extends GeneratedMessageV3 implements S2C_ActivityInfo_18302OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAKECOUNT_FIELD_NUMBER = 1;
      private int makeCount_;
      public static final int FIRSTMAKE_FIELD_NUMBER = 2;
      private boolean firstMake_;
      public static final int OPENDAY_FIELD_NUMBER = 3;
      private int openDay_;
      public static final int ACTIVITYDAY_FIELD_NUMBER = 4;
      private int activityDay_;
      public static final int SMASHEGGSTAGE_FIELD_NUMBER = 5;
      private int smashEggStage_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivityInfo_18302 DEFAULT_INSTANCE = new S2C_ActivityInfo_18302();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivityInfo_18302> PARSER = new AbstractParser<S2C_ActivityInfo_18302>() {
         public S2C_ActivityInfo_18302 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivityInfo_18302(input, extensionRegistry);
         }
      };

      private S2C_ActivityInfo_18302(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivityInfo_18302() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivityInfo_18302();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivityInfo_18302(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.makeCount_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.firstMake_ = input.readBool();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.openDay_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.activityDay_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.smashEggStage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_18302.class, Builder.class);
      }

      public boolean hasMakeCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMakeCount() {
         return this.makeCount_;
      }

      public boolean hasFirstMake() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getFirstMake() {
         return this.firstMake_;
      }

      public boolean hasOpenDay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getOpenDay() {
         return this.openDay_;
      }

      public boolean hasActivityDay() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getActivityDay() {
         return this.activityDay_;
      }

      public boolean hasSmashEggStage() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getSmashEggStage() {
         return this.smashEggStage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMakeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFirstMake()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpenDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActivityDay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSmashEggStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.makeCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.firstMake_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.openDay_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.activityDay_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.smashEggStage_);
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
               size += CodedOutputStream.computeInt32Size(1, this.makeCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.firstMake_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.openDay_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.activityDay_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.smashEggStage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivityInfo_18302)) {
            return super.equals(obj);
         } else {
            S2C_ActivityInfo_18302 other = (S2C_ActivityInfo_18302)obj;
            if (this.hasMakeCount() != other.hasMakeCount()) {
               return false;
            } else if (this.hasMakeCount() && this.getMakeCount() != other.getMakeCount()) {
               return false;
            } else if (this.hasFirstMake() != other.hasFirstMake()) {
               return false;
            } else if (this.hasFirstMake() && this.getFirstMake() != other.getFirstMake()) {
               return false;
            } else if (this.hasOpenDay() != other.hasOpenDay()) {
               return false;
            } else if (this.hasOpenDay() && this.getOpenDay() != other.getOpenDay()) {
               return false;
            } else if (this.hasActivityDay() != other.hasActivityDay()) {
               return false;
            } else if (this.hasActivityDay() && this.getActivityDay() != other.getActivityDay()) {
               return false;
            } else if (this.hasSmashEggStage() != other.hasSmashEggStage()) {
               return false;
            } else if (this.hasSmashEggStage() && this.getSmashEggStage() != other.getSmashEggStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMakeCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMakeCount();
            }

            if (this.hasFirstMake()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getFirstMake());
            }

            if (this.hasOpenDay()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getOpenDay();
            }

            if (this.hasActivityDay()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getActivityDay();
            }

            if (this.hasSmashEggStage()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getSmashEggStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivityInfo_18302 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18302)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_18302 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_18302 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18302)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_18302 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_18302 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18302)PARSER.parseFrom(data);
      }

      public static S2C_ActivityInfo_18302 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivityInfo_18302)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivityInfo_18302 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_18302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_18302 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_18302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_18302 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivityInfo_18302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_18302 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_18302)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivityInfo_18302 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivityInfo_18302)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivityInfo_18302 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivityInfo_18302)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivityInfo_18302 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivityInfo_18302 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivityInfo_18302> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivityInfo_18302> getParserForType() {
         return PARSER;
      }

      public S2C_ActivityInfo_18302 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivityInfo_18302OrBuilder {
         private int bitField0_;
         private int makeCount_;
         private boolean firstMake_;
         private int openDay_;
         private int activityDay_;
         private int smashEggStage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivityInfo_18302.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.S2C_ActivityInfo_18302.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.makeCount_ = 0;
            this.bitField0_ &= -2;
            this.firstMake_ = false;
            this.bitField0_ &= -3;
            this.openDay_ = 0;
            this.bitField0_ &= -5;
            this.activityDay_ = 0;
            this.bitField0_ &= -9;
            this.smashEggStage_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ActivityInfo_18302_descriptor;
         }

         public S2C_ActivityInfo_18302 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_ActivityInfo_18302.getDefaultInstance();
         }

         public S2C_ActivityInfo_18302 build() {
            S2C_ActivityInfo_18302 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivityInfo_18302 buildPartial() {
            S2C_ActivityInfo_18302 result = new S2C_ActivityInfo_18302(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.makeCount_ = this.makeCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.firstMake_ = this.firstMake_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.openDay_ = this.openDay_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.activityDay_ = this.activityDay_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.smashEggStage_ = this.smashEggStage_;
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
            if (other instanceof S2C_ActivityInfo_18302) {
               return this.mergeFrom((S2C_ActivityInfo_18302)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivityInfo_18302 other) {
            if (other == YuanXiao2022Msg.S2C_ActivityInfo_18302.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMakeCount()) {
                  this.setMakeCount(other.getMakeCount());
               }

               if (other.hasFirstMake()) {
                  this.setFirstMake(other.getFirstMake());
               }

               if (other.hasOpenDay()) {
                  this.setOpenDay(other.getOpenDay());
               }

               if (other.hasActivityDay()) {
                  this.setActivityDay(other.getActivityDay());
               }

               if (other.hasSmashEggStage()) {
                  this.setSmashEggStage(other.getSmashEggStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasMakeCount()) {
               return false;
            } else if (!this.hasFirstMake()) {
               return false;
            } else if (!this.hasOpenDay()) {
               return false;
            } else if (!this.hasActivityDay()) {
               return false;
            } else {
               return this.hasSmashEggStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivityInfo_18302 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivityInfo_18302)YuanXiao2022Msg.S2C_ActivityInfo_18302.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivityInfo_18302)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMakeCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMakeCount() {
            return this.makeCount_;
         }

         public Builder setMakeCount(int value) {
            this.bitField0_ |= 1;
            this.makeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMakeCount() {
            this.bitField0_ &= -2;
            this.makeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFirstMake() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getFirstMake() {
            return this.firstMake_;
         }

         public Builder setFirstMake(boolean value) {
            this.bitField0_ |= 2;
            this.firstMake_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFirstMake() {
            this.bitField0_ &= -3;
            this.firstMake_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasOpenDay() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getOpenDay() {
            return this.openDay_;
         }

         public Builder setOpenDay(int value) {
            this.bitField0_ |= 4;
            this.openDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenDay() {
            this.bitField0_ &= -5;
            this.openDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActivityDay() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getActivityDay() {
            return this.activityDay_;
         }

         public Builder setActivityDay(int value) {
            this.bitField0_ |= 8;
            this.activityDay_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActivityDay() {
            this.bitField0_ &= -9;
            this.activityDay_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSmashEggStage() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getSmashEggStage() {
            return this.smashEggStage_;
         }

         public Builder setSmashEggStage(int value) {
            this.bitField0_ |= 16;
            this.smashEggStage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSmashEggStage() {
            this.bitField0_ &= -17;
            this.smashEggStage_ = 0;
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

   public static final class C2S_AddUpTotalInfo_18303 extends GeneratedMessageV3 implements C2S_AddUpTotalInfo_18303OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_AddUpTotalInfo_18303 DEFAULT_INSTANCE = new C2S_AddUpTotalInfo_18303();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AddUpTotalInfo_18303> PARSER = new AbstractParser<C2S_AddUpTotalInfo_18303>() {
         public C2S_AddUpTotalInfo_18303 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AddUpTotalInfo_18303(input, extensionRegistry);
         }
      };

      private C2S_AddUpTotalInfo_18303(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AddUpTotalInfo_18303() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AddUpTotalInfo_18303();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AddUpTotalInfo_18303(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpTotalInfo_18303.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AddUpTotalInfo_18303)) {
            return super.equals(obj);
         } else {
            C2S_AddUpTotalInfo_18303 other = (C2S_AddUpTotalInfo_18303)obj;
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

      public static C2S_AddUpTotalInfo_18303 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_18303)PARSER.parseFrom(data);
      }

      public static C2S_AddUpTotalInfo_18303 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_18303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_18303 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_18303)PARSER.parseFrom(data);
      }

      public static C2S_AddUpTotalInfo_18303 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_18303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_18303 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_18303)PARSER.parseFrom(data);
      }

      public static C2S_AddUpTotalInfo_18303 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AddUpTotalInfo_18303)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_18303 parseFrom(InputStream input) throws IOException {
         return (C2S_AddUpTotalInfo_18303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpTotalInfo_18303 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpTotalInfo_18303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_18303 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AddUpTotalInfo_18303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AddUpTotalInfo_18303 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpTotalInfo_18303)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AddUpTotalInfo_18303 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AddUpTotalInfo_18303)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AddUpTotalInfo_18303 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AddUpTotalInfo_18303)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AddUpTotalInfo_18303 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AddUpTotalInfo_18303 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AddUpTotalInfo_18303> parser() {
         return PARSER;
      }

      public Parser<C2S_AddUpTotalInfo_18303> getParserForType() {
         return PARSER;
      }

      public C2S_AddUpTotalInfo_18303 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AddUpTotalInfo_18303OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AddUpTotalInfo_18303.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_AddUpTotalInfo_18303.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_AddUpTotalInfo_18303_descriptor;
         }

         public C2S_AddUpTotalInfo_18303 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_AddUpTotalInfo_18303.getDefaultInstance();
         }

         public C2S_AddUpTotalInfo_18303 build() {
            C2S_AddUpTotalInfo_18303 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AddUpTotalInfo_18303 buildPartial() {
            C2S_AddUpTotalInfo_18303 result = new C2S_AddUpTotalInfo_18303(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_AddUpTotalInfo_18303) {
               return this.mergeFrom((C2S_AddUpTotalInfo_18303)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AddUpTotalInfo_18303 other) {
            if (other == YuanXiao2022Msg.C2S_AddUpTotalInfo_18303.getDefaultInstance()) {
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
            C2S_AddUpTotalInfo_18303 parsedMessage = null;

            try {
               parsedMessage = (C2S_AddUpTotalInfo_18303)YuanXiao2022Msg.C2S_AddUpTotalInfo_18303.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AddUpTotalInfo_18303)e.getUnfinishedMessage();
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

   public static final class S2C_AddUpTotalInfo_18304 extends GeneratedMessageV3 implements S2C_AddUpTotalInfo_18304OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOTREWARDS_FIELD_NUMBER = 1;
      private Internal.IntList gotRewards_;
      public static final int STAGERECHARGE_FIELD_NUMBER = 2;
      private int stageRecharge_;
      public static final int STAGEENDTIME_FIELD_NUMBER = 3;
      private long stageEndTime_;
      private byte memoizedIsInitialized;
      private static final S2C_AddUpTotalInfo_18304 DEFAULT_INSTANCE = new S2C_AddUpTotalInfo_18304();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AddUpTotalInfo_18304> PARSER = new AbstractParser<S2C_AddUpTotalInfo_18304>() {
         public S2C_AddUpTotalInfo_18304 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AddUpTotalInfo_18304(input, extensionRegistry);
         }
      };

      private S2C_AddUpTotalInfo_18304(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AddUpTotalInfo_18304() {
         this.memoizedIsInitialized = -1;
         this.gotRewards_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AddUpTotalInfo_18304();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AddUpTotalInfo_18304(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddUpTotalInfo_18304.class, Builder.class);
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
         } else if (!(obj instanceof S2C_AddUpTotalInfo_18304)) {
            return super.equals(obj);
         } else {
            S2C_AddUpTotalInfo_18304 other = (S2C_AddUpTotalInfo_18304)obj;
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

      public static S2C_AddUpTotalInfo_18304 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_18304)PARSER.parseFrom(data);
      }

      public static S2C_AddUpTotalInfo_18304 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_18304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_18304 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_18304)PARSER.parseFrom(data);
      }

      public static S2C_AddUpTotalInfo_18304 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_18304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_18304 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_18304)PARSER.parseFrom(data);
      }

      public static S2C_AddUpTotalInfo_18304 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddUpTotalInfo_18304)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_18304 parseFrom(InputStream input) throws IOException {
         return (S2C_AddUpTotalInfo_18304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddUpTotalInfo_18304 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpTotalInfo_18304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_18304 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AddUpTotalInfo_18304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AddUpTotalInfo_18304 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpTotalInfo_18304)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddUpTotalInfo_18304 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AddUpTotalInfo_18304)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddUpTotalInfo_18304 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddUpTotalInfo_18304)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AddUpTotalInfo_18304 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AddUpTotalInfo_18304 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AddUpTotalInfo_18304> parser() {
         return PARSER;
      }

      public Parser<S2C_AddUpTotalInfo_18304> getParserForType() {
         return PARSER;
      }

      public S2C_AddUpTotalInfo_18304 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AddUpTotalInfo_18304OrBuilder {
         private int bitField0_;
         private Internal.IntList gotRewards_;
         private int stageRecharge_;
         private long stageEndTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddUpTotalInfo_18304.class, Builder.class);
         }

         private Builder() {
            this.gotRewards_ = YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRewards_ = YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.gotRewards_ = YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.emptyIntList();
            this.bitField0_ &= -2;
            this.stageRecharge_ = 0;
            this.bitField0_ &= -3;
            this.stageEndTime_ = 0L;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_AddUpTotalInfo_18304_descriptor;
         }

         public S2C_AddUpTotalInfo_18304 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.getDefaultInstance();
         }

         public S2C_AddUpTotalInfo_18304 build() {
            S2C_AddUpTotalInfo_18304 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AddUpTotalInfo_18304 buildPartial() {
            S2C_AddUpTotalInfo_18304 result = new S2C_AddUpTotalInfo_18304(this);
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
            if (other instanceof S2C_AddUpTotalInfo_18304) {
               return this.mergeFrom((S2C_AddUpTotalInfo_18304)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AddUpTotalInfo_18304 other) {
            if (other == YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.getDefaultInstance()) {
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
            S2C_AddUpTotalInfo_18304 parsedMessage = null;

            try {
               parsedMessage = (S2C_AddUpTotalInfo_18304)YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AddUpTotalInfo_18304)e.getUnfinishedMessage();
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
               this.gotRewards_ = YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.mutableCopy(this.gotRewards_);
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
            this.gotRewards_ = YuanXiao2022Msg.S2C_AddUpTotalInfo_18304.emptyIntList();
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

   public static final class C2S_ReceiveAddUpReward_18305 extends GeneratedMessageV3 implements C2S_ReceiveAddUpReward_18305OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveAddUpReward_18305 DEFAULT_INSTANCE = new C2S_ReceiveAddUpReward_18305();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveAddUpReward_18305> PARSER = new AbstractParser<C2S_ReceiveAddUpReward_18305>() {
         public C2S_ReceiveAddUpReward_18305 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveAddUpReward_18305(input, extensionRegistry);
         }
      };

      private C2S_ReceiveAddUpReward_18305(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveAddUpReward_18305() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveAddUpReward_18305();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveAddUpReward_18305(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAddUpReward_18305.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveAddUpReward_18305)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveAddUpReward_18305 other = (C2S_ReceiveAddUpReward_18305)obj;
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

      public static C2S_ReceiveAddUpReward_18305 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18305)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAddUpReward_18305 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18305 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18305)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAddUpReward_18305 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18305 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18305)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveAddUpReward_18305 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveAddUpReward_18305)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18305 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAddUpReward_18305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAddUpReward_18305 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAddUpReward_18305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18305 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveAddUpReward_18305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAddUpReward_18305 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAddUpReward_18305)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveAddUpReward_18305 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveAddUpReward_18305)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveAddUpReward_18305 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveAddUpReward_18305)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveAddUpReward_18305 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveAddUpReward_18305 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveAddUpReward_18305> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveAddUpReward_18305> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveAddUpReward_18305 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveAddUpReward_18305OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveAddUpReward_18305.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_ReceiveAddUpReward_18305.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveAddUpReward_18305_descriptor;
         }

         public C2S_ReceiveAddUpReward_18305 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_ReceiveAddUpReward_18305.getDefaultInstance();
         }

         public C2S_ReceiveAddUpReward_18305 build() {
            C2S_ReceiveAddUpReward_18305 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveAddUpReward_18305 buildPartial() {
            C2S_ReceiveAddUpReward_18305 result = new C2S_ReceiveAddUpReward_18305(this);
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
            if (other instanceof C2S_ReceiveAddUpReward_18305) {
               return this.mergeFrom((C2S_ReceiveAddUpReward_18305)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveAddUpReward_18305 other) {
            if (other == YuanXiao2022Msg.C2S_ReceiveAddUpReward_18305.getDefaultInstance()) {
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
            C2S_ReceiveAddUpReward_18305 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveAddUpReward_18305)YuanXiao2022Msg.C2S_ReceiveAddUpReward_18305.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveAddUpReward_18305)e.getUnfinishedMessage();
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

   public static final class C2S_Pray_18306 extends GeneratedMessageV3 implements C2S_Pray_18306OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Pray_18306 DEFAULT_INSTANCE = new C2S_Pray_18306();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Pray_18306> PARSER = new AbstractParser<C2S_Pray_18306>() {
         public C2S_Pray_18306 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Pray_18306(input, extensionRegistry);
         }
      };

      private C2S_Pray_18306(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Pray_18306() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Pray_18306();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Pray_18306(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_18306.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Pray_18306)) {
            return super.equals(obj);
         } else {
            C2S_Pray_18306 other = (C2S_Pray_18306)obj;
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

      public static C2S_Pray_18306 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Pray_18306)PARSER.parseFrom(data);
      }

      public static C2S_Pray_18306 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_18306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_18306 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Pray_18306)PARSER.parseFrom(data);
      }

      public static C2S_Pray_18306 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_18306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_18306 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Pray_18306)PARSER.parseFrom(data);
      }

      public static C2S_Pray_18306 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Pray_18306)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Pray_18306 parseFrom(InputStream input) throws IOException {
         return (C2S_Pray_18306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_18306 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_18306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_18306 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Pray_18306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Pray_18306 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_18306)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Pray_18306 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Pray_18306)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Pray_18306 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Pray_18306)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Pray_18306 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Pray_18306 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Pray_18306> parser() {
         return PARSER;
      }

      public Parser<C2S_Pray_18306> getParserForType() {
         return PARSER;
      }

      public C2S_Pray_18306 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Pray_18306OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Pray_18306.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_Pray_18306.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Pray_18306_descriptor;
         }

         public C2S_Pray_18306 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_Pray_18306.getDefaultInstance();
         }

         public C2S_Pray_18306 build() {
            C2S_Pray_18306 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Pray_18306 buildPartial() {
            C2S_Pray_18306 result = new C2S_Pray_18306(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Pray_18306) {
               return this.mergeFrom((C2S_Pray_18306)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Pray_18306 other) {
            if (other == YuanXiao2022Msg.C2S_Pray_18306.getDefaultInstance()) {
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
            C2S_Pray_18306 parsedMessage = null;

            try {
               parsedMessage = (C2S_Pray_18306)YuanXiao2022Msg.C2S_Pray_18306.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Pray_18306)e.getUnfinishedMessage();
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

   public static final class S2C_Pray_18307 extends GeneratedMessageV3 implements S2C_Pray_18307OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FAVORCOUNT_FIELD_NUMBER = 1;
      private int favorCount_;
      public static final int RECEIVESTATE_FIELD_NUMBER = 2;
      private int receiveState_;
      private byte memoizedIsInitialized;
      private static final S2C_Pray_18307 DEFAULT_INSTANCE = new S2C_Pray_18307();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Pray_18307> PARSER = new AbstractParser<S2C_Pray_18307>() {
         public S2C_Pray_18307 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Pray_18307(input, extensionRegistry);
         }
      };

      private S2C_Pray_18307(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Pray_18307() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Pray_18307();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Pray_18307(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.favorCount_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.receiveState_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_18307.class, Builder.class);
      }

      public boolean hasFavorCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFavorCount() {
         return this.favorCount_;
      }

      public boolean hasReceiveState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getReceiveState() {
         return this.receiveState_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFavorCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReceiveState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.favorCount_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.receiveState_);
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
               size += CodedOutputStream.computeInt32Size(1, this.favorCount_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.receiveState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Pray_18307)) {
            return super.equals(obj);
         } else {
            S2C_Pray_18307 other = (S2C_Pray_18307)obj;
            if (this.hasFavorCount() != other.hasFavorCount()) {
               return false;
            } else if (this.hasFavorCount() && this.getFavorCount() != other.getFavorCount()) {
               return false;
            } else if (this.hasReceiveState() != other.hasReceiveState()) {
               return false;
            } else if (this.hasReceiveState() && this.getReceiveState() != other.getReceiveState()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFavorCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFavorCount();
            }

            if (this.hasReceiveState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getReceiveState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Pray_18307 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Pray_18307)PARSER.parseFrom(data);
      }

      public static S2C_Pray_18307 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_18307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_18307 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Pray_18307)PARSER.parseFrom(data);
      }

      public static S2C_Pray_18307 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_18307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_18307 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Pray_18307)PARSER.parseFrom(data);
      }

      public static S2C_Pray_18307 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Pray_18307)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Pray_18307 parseFrom(InputStream input) throws IOException {
         return (S2C_Pray_18307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_18307 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_18307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_18307 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Pray_18307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Pray_18307 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_18307)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Pray_18307 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Pray_18307)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Pray_18307 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Pray_18307)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Pray_18307 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Pray_18307 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Pray_18307> parser() {
         return PARSER;
      }

      public Parser<S2C_Pray_18307> getParserForType() {
         return PARSER;
      }

      public S2C_Pray_18307 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Pray_18307OrBuilder {
         private int bitField0_;
         private int favorCount_;
         private int receiveState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Pray_18307.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.S2C_Pray_18307.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.favorCount_ = 0;
            this.bitField0_ &= -2;
            this.receiveState_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Pray_18307_descriptor;
         }

         public S2C_Pray_18307 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_Pray_18307.getDefaultInstance();
         }

         public S2C_Pray_18307 build() {
            S2C_Pray_18307 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Pray_18307 buildPartial() {
            S2C_Pray_18307 result = new S2C_Pray_18307(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.favorCount_ = this.favorCount_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.receiveState_ = this.receiveState_;
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
            if (other instanceof S2C_Pray_18307) {
               return this.mergeFrom((S2C_Pray_18307)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Pray_18307 other) {
            if (other == YuanXiao2022Msg.S2C_Pray_18307.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFavorCount()) {
                  this.setFavorCount(other.getFavorCount());
               }

               if (other.hasReceiveState()) {
                  this.setReceiveState(other.getReceiveState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFavorCount()) {
               return false;
            } else {
               return this.hasReceiveState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Pray_18307 parsedMessage = null;

            try {
               parsedMessage = (S2C_Pray_18307)YuanXiao2022Msg.S2C_Pray_18307.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Pray_18307)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFavorCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFavorCount() {
            return this.favorCount_;
         }

         public Builder setFavorCount(int value) {
            this.bitField0_ |= 1;
            this.favorCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFavorCount() {
            this.bitField0_ &= -2;
            this.favorCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasReceiveState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getReceiveState() {
            return this.receiveState_;
         }

         public Builder setReceiveState(int value) {
            this.bitField0_ |= 2;
            this.receiveState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReceiveState() {
            this.bitField0_ &= -3;
            this.receiveState_ = 0;
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

   public static final class S2C_PrayTaskNotify_18308 extends GeneratedMessageV3 implements S2C_PrayTaskNotify_18308OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayTaskNotify_18308 DEFAULT_INSTANCE = new S2C_PrayTaskNotify_18308();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayTaskNotify_18308> PARSER = new AbstractParser<S2C_PrayTaskNotify_18308>() {
         public S2C_PrayTaskNotify_18308 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayTaskNotify_18308(input, extensionRegistry);
         }
      };

      private S2C_PrayTaskNotify_18308(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayTaskNotify_18308() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayTaskNotify_18308();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayTaskNotify_18308(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_18308.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PrayTaskNotify_18308)) {
            return super.equals(obj);
         } else {
            S2C_PrayTaskNotify_18308 other = (S2C_PrayTaskNotify_18308)obj;
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

      public static S2C_PrayTaskNotify_18308 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_18308)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_18308 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_18308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_18308 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_18308)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_18308 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_18308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_18308 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_18308)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskNotify_18308 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskNotify_18308)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_18308 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_18308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_18308 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_18308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_18308 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskNotify_18308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_18308 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_18308)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskNotify_18308 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayTaskNotify_18308)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskNotify_18308 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskNotify_18308)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayTaskNotify_18308 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayTaskNotify_18308 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayTaskNotify_18308> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayTaskNotify_18308> getParserForType() {
         return PARSER;
      }

      public S2C_PrayTaskNotify_18308 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayTaskNotify_18308OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskNotify_18308.class, Builder.class);
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
            if (YuanXiao2022Msg.S2C_PrayTaskNotify_18308.alwaysUseFieldBuilders) {
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskNotify_18308_descriptor;
         }

         public S2C_PrayTaskNotify_18308 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_PrayTaskNotify_18308.getDefaultInstance();
         }

         public S2C_PrayTaskNotify_18308 build() {
            S2C_PrayTaskNotify_18308 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayTaskNotify_18308 buildPartial() {
            S2C_PrayTaskNotify_18308 result = new S2C_PrayTaskNotify_18308(this);
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
            if (other instanceof S2C_PrayTaskNotify_18308) {
               return this.mergeFrom((S2C_PrayTaskNotify_18308)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayTaskNotify_18308 other) {
            if (other == YuanXiao2022Msg.S2C_PrayTaskNotify_18308.getDefaultInstance()) {
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
                     this.taskBuilder_ = YuanXiao2022Msg.S2C_PrayTaskNotify_18308.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_PrayTaskNotify_18308 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayTaskNotify_18308)YuanXiao2022Msg.S2C_PrayTaskNotify_18308.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayTaskNotify_18308)e.getUnfinishedMessage();
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

   public static final class S2C_PrayTaskList_18310 extends GeneratedMessageV3 implements S2C_PrayTaskList_18310OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASK_FIELD_NUMBER = 1;
      private List<ActivityMsg.TaskData> task_;
      private byte memoizedIsInitialized;
      private static final S2C_PrayTaskList_18310 DEFAULT_INSTANCE = new S2C_PrayTaskList_18310();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PrayTaskList_18310> PARSER = new AbstractParser<S2C_PrayTaskList_18310>() {
         public S2C_PrayTaskList_18310 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PrayTaskList_18310(input, extensionRegistry);
         }
      };

      private S2C_PrayTaskList_18310(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PrayTaskList_18310() {
         this.memoizedIsInitialized = -1;
         this.task_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PrayTaskList_18310();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PrayTaskList_18310(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskList_18310.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PrayTaskList_18310)) {
            return super.equals(obj);
         } else {
            S2C_PrayTaskList_18310 other = (S2C_PrayTaskList_18310)obj;
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

      public static S2C_PrayTaskList_18310 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_18310)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_18310 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_18310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_18310 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_18310)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_18310 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_18310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_18310 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_18310)PARSER.parseFrom(data);
      }

      public static S2C_PrayTaskList_18310 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PrayTaskList_18310)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PrayTaskList_18310 parseFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskList_18310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_18310 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_18310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskList_18310 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PrayTaskList_18310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_18310 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_18310)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PrayTaskList_18310 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PrayTaskList_18310)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PrayTaskList_18310 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PrayTaskList_18310)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PrayTaskList_18310 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PrayTaskList_18310 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PrayTaskList_18310> parser() {
         return PARSER;
      }

      public Parser<S2C_PrayTaskList_18310> getParserForType() {
         return PARSER;
      }

      public S2C_PrayTaskList_18310 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PrayTaskList_18310OrBuilder {
         private int bitField0_;
         private List<ActivityMsg.TaskData> task_;
         private RepeatedFieldBuilderV3<ActivityMsg.TaskData, ActivityMsg.TaskData.Builder, ActivityMsg.TaskDataOrBuilder> taskBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PrayTaskList_18310.class, Builder.class);
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
            if (YuanXiao2022Msg.S2C_PrayTaskList_18310.alwaysUseFieldBuilders) {
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_PrayTaskList_18310_descriptor;
         }

         public S2C_PrayTaskList_18310 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_PrayTaskList_18310.getDefaultInstance();
         }

         public S2C_PrayTaskList_18310 build() {
            S2C_PrayTaskList_18310 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PrayTaskList_18310 buildPartial() {
            S2C_PrayTaskList_18310 result = new S2C_PrayTaskList_18310(this);
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
            if (other instanceof S2C_PrayTaskList_18310) {
               return this.mergeFrom((S2C_PrayTaskList_18310)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PrayTaskList_18310 other) {
            if (other == YuanXiao2022Msg.S2C_PrayTaskList_18310.getDefaultInstance()) {
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
                     this.taskBuilder_ = YuanXiao2022Msg.S2C_PrayTaskList_18310.alwaysUseFieldBuilders ? this.getTaskFieldBuilder() : null;
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
            S2C_PrayTaskList_18310 parsedMessage = null;

            try {
               parsedMessage = (S2C_PrayTaskList_18310)YuanXiao2022Msg.S2C_PrayTaskList_18310.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PrayTaskList_18310)e.getUnfinishedMessage();
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

   public static final class C2S_ReceiveFavorReward_18311 extends GeneratedMessageV3 implements C2S_ReceiveFavorReward_18311OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveFavorReward_18311 DEFAULT_INSTANCE = new C2S_ReceiveFavorReward_18311();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveFavorReward_18311> PARSER = new AbstractParser<C2S_ReceiveFavorReward_18311>() {
         public C2S_ReceiveFavorReward_18311 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveFavorReward_18311(input, extensionRegistry);
         }
      };

      private C2S_ReceiveFavorReward_18311(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveFavorReward_18311() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveFavorReward_18311();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveFavorReward_18311(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveFavorReward_18311.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveFavorReward_18311)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveFavorReward_18311 other = (C2S_ReceiveFavorReward_18311)obj;
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

      public static C2S_ReceiveFavorReward_18311 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFavorReward_18311)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveFavorReward_18311 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFavorReward_18311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveFavorReward_18311 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFavorReward_18311)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveFavorReward_18311 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFavorReward_18311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveFavorReward_18311 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFavorReward_18311)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveFavorReward_18311 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveFavorReward_18311)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveFavorReward_18311 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveFavorReward_18311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveFavorReward_18311 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveFavorReward_18311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveFavorReward_18311 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveFavorReward_18311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveFavorReward_18311 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveFavorReward_18311)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveFavorReward_18311 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveFavorReward_18311)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveFavorReward_18311 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveFavorReward_18311)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveFavorReward_18311 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveFavorReward_18311 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveFavorReward_18311> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveFavorReward_18311> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveFavorReward_18311 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveFavorReward_18311OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveFavorReward_18311.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_ReceiveFavorReward_18311.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveFavorReward_18311_descriptor;
         }

         public C2S_ReceiveFavorReward_18311 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_ReceiveFavorReward_18311.getDefaultInstance();
         }

         public C2S_ReceiveFavorReward_18311 build() {
            C2S_ReceiveFavorReward_18311 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveFavorReward_18311 buildPartial() {
            C2S_ReceiveFavorReward_18311 result = new C2S_ReceiveFavorReward_18311(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ReceiveFavorReward_18311) {
               return this.mergeFrom((C2S_ReceiveFavorReward_18311)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveFavorReward_18311 other) {
            if (other == YuanXiao2022Msg.C2S_ReceiveFavorReward_18311.getDefaultInstance()) {
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
            C2S_ReceiveFavorReward_18311 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveFavorReward_18311)YuanXiao2022Msg.C2S_ReceiveFavorReward_18311.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveFavorReward_18311)e.getUnfinishedMessage();
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

   public static final class C2S_Make_18321 extends GeneratedMessageV3 implements C2S_Make_18321OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SCORE_FIELD_NUMBER = 1;
      private int score_;
      public static final int GUEST_FIELD_NUMBER = 2;
      private Internal.IntList guest_;
      private byte memoizedIsInitialized;
      private static final C2S_Make_18321 DEFAULT_INSTANCE = new C2S_Make_18321();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Make_18321> PARSER = new AbstractParser<C2S_Make_18321>() {
         public C2S_Make_18321 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Make_18321(input, extensionRegistry);
         }
      };

      private C2S_Make_18321(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Make_18321() {
         this.memoizedIsInitialized = -1;
         this.guest_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Make_18321();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Make_18321(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.score_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.guest_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.guest_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.guest_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.guest_.addInt(input.readInt32());
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
                  this.guest_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Make_18321.class, Builder.class);
      }

      public boolean hasScore() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public List<Integer> getGuestList() {
         return this.guest_;
      }

      public int getGuestCount() {
         return this.guest_.size();
      }

      public int getGuest(int index) {
         return this.guest_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.score_);
         }

         for(int i = 0; i < this.guest_.size(); ++i) {
            output.writeInt32(2, this.guest_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.score_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.guest_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.guest_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGuestList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Make_18321)) {
            return super.equals(obj);
         } else {
            C2S_Make_18321 other = (C2S_Make_18321)obj;
            if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (!this.getGuestList().equals(other.getGuestList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasScore()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getScore();
            }

            if (this.getGuestCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGuestList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Make_18321 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Make_18321)PARSER.parseFrom(data);
      }

      public static C2S_Make_18321 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Make_18321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Make_18321 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Make_18321)PARSER.parseFrom(data);
      }

      public static C2S_Make_18321 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Make_18321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Make_18321 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Make_18321)PARSER.parseFrom(data);
      }

      public static C2S_Make_18321 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Make_18321)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Make_18321 parseFrom(InputStream input) throws IOException {
         return (C2S_Make_18321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Make_18321 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Make_18321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Make_18321 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Make_18321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Make_18321 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Make_18321)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Make_18321 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Make_18321)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Make_18321 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Make_18321)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Make_18321 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Make_18321 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Make_18321> parser() {
         return PARSER;
      }

      public Parser<C2S_Make_18321> getParserForType() {
         return PARSER;
      }

      public C2S_Make_18321 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Make_18321OrBuilder {
         private int bitField0_;
         private int score_;
         private Internal.IntList guest_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Make_18321.class, Builder.class);
         }

         private Builder() {
            this.guest_ = YuanXiao2022Msg.C2S_Make_18321.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.guest_ = YuanXiao2022Msg.C2S_Make_18321.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_Make_18321.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.score_ = 0;
            this.bitField0_ &= -2;
            this.guest_ = YuanXiao2022Msg.C2S_Make_18321.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_Make_18321_descriptor;
         }

         public C2S_Make_18321 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_Make_18321.getDefaultInstance();
         }

         public C2S_Make_18321 build() {
            C2S_Make_18321 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Make_18321 buildPartial() {
            C2S_Make_18321 result = new C2S_Make_18321(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.guest_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.guest_ = this.guest_;
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
            if (other instanceof C2S_Make_18321) {
               return this.mergeFrom((C2S_Make_18321)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Make_18321 other) {
            if (other == YuanXiao2022Msg.C2S_Make_18321.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (!other.guest_.isEmpty()) {
                  if (this.guest_.isEmpty()) {
                     this.guest_ = other.guest_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGuestIsMutable();
                     this.guest_.addAll(other.guest_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasScore();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Make_18321 parsedMessage = null;

            try {
               parsedMessage = (C2S_Make_18321)YuanXiao2022Msg.C2S_Make_18321.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Make_18321)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 1;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -2;
            this.score_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGuestIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.guest_ = YuanXiao2022Msg.C2S_Make_18321.mutableCopy(this.guest_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGuestList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.guest_) : this.guest_);
         }

         public int getGuestCount() {
            return this.guest_.size();
         }

         public int getGuest(int index) {
            return this.guest_.getInt(index);
         }

         public Builder setGuest(int index, int value) {
            this.ensureGuestIsMutable();
            this.guest_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGuest(int value) {
            this.ensureGuestIsMutable();
            this.guest_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGuest(Iterable<? extends Integer> values) {
            this.ensureGuestIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.guest_);
            this.onChanged();
            return this;
         }

         public Builder clearGuest() {
            this.guest_ = YuanXiao2022Msg.C2S_Make_18321.emptyIntList();
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

   public static final class S2C_Make_18322 extends GeneratedMessageV3 implements S2C_Make_18322OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SCORE_FIELD_NUMBER = 1;
      private int score_;
      public static final int GUEST_FIELD_NUMBER = 2;
      private Internal.IntList guest_;
      public static final int MAKECOUNT_FIELD_NUMBER = 3;
      private int makeCount_;
      public static final int FIRSTMAKE_FIELD_NUMBER = 4;
      private boolean firstMake_;
      private byte memoizedIsInitialized;
      private static final S2C_Make_18322 DEFAULT_INSTANCE = new S2C_Make_18322();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Make_18322> PARSER = new AbstractParser<S2C_Make_18322>() {
         public S2C_Make_18322 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Make_18322(input, extensionRegistry);
         }
      };

      private S2C_Make_18322(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Make_18322() {
         this.memoizedIsInitialized = -1;
         this.guest_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Make_18322();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Make_18322(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.score_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.guest_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.guest_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.guest_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.makeCount_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.firstMake_ = input.readBool();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.guest_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.guest_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Make_18322.class, Builder.class);
      }

      public boolean hasScore() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public List<Integer> getGuestList() {
         return this.guest_;
      }

      public int getGuestCount() {
         return this.guest_.size();
      }

      public int getGuest(int index) {
         return this.guest_.getInt(index);
      }

      public boolean hasMakeCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMakeCount() {
         return this.makeCount_;
      }

      public boolean hasFirstMake() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getFirstMake() {
         return this.firstMake_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMakeCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFirstMake()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.score_);
         }

         for(int i = 0; i < this.guest_.size(); ++i) {
            output.writeInt32(2, this.guest_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.makeCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(4, this.firstMake_);
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
               size += CodedOutputStream.computeInt32Size(1, this.score_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.guest_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.guest_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGuestList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.makeCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.firstMake_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Make_18322)) {
            return super.equals(obj);
         } else {
            S2C_Make_18322 other = (S2C_Make_18322)obj;
            if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (!this.getGuestList().equals(other.getGuestList())) {
               return false;
            } else if (this.hasMakeCount() != other.hasMakeCount()) {
               return false;
            } else if (this.hasMakeCount() && this.getMakeCount() != other.getMakeCount()) {
               return false;
            } else if (this.hasFirstMake() != other.hasFirstMake()) {
               return false;
            } else if (this.hasFirstMake() && this.getFirstMake() != other.getFirstMake()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasScore()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getScore();
            }

            if (this.getGuestCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGuestList().hashCode();
            }

            if (this.hasMakeCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMakeCount();
            }

            if (this.hasFirstMake()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getFirstMake());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Make_18322 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Make_18322)PARSER.parseFrom(data);
      }

      public static S2C_Make_18322 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Make_18322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Make_18322 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Make_18322)PARSER.parseFrom(data);
      }

      public static S2C_Make_18322 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Make_18322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Make_18322 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Make_18322)PARSER.parseFrom(data);
      }

      public static S2C_Make_18322 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Make_18322)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Make_18322 parseFrom(InputStream input) throws IOException {
         return (S2C_Make_18322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Make_18322 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Make_18322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Make_18322 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Make_18322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Make_18322 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Make_18322)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Make_18322 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Make_18322)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Make_18322 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Make_18322)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Make_18322 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Make_18322 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Make_18322> parser() {
         return PARSER;
      }

      public Parser<S2C_Make_18322> getParserForType() {
         return PARSER;
      }

      public S2C_Make_18322 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Make_18322OrBuilder {
         private int bitField0_;
         private int score_;
         private Internal.IntList guest_;
         private int makeCount_;
         private boolean firstMake_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Make_18322.class, Builder.class);
         }

         private Builder() {
            this.guest_ = YuanXiao2022Msg.S2C_Make_18322.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.guest_ = YuanXiao2022Msg.S2C_Make_18322.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.S2C_Make_18322.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.score_ = 0;
            this.bitField0_ &= -2;
            this.guest_ = YuanXiao2022Msg.S2C_Make_18322.emptyIntList();
            this.bitField0_ &= -3;
            this.makeCount_ = 0;
            this.bitField0_ &= -5;
            this.firstMake_ = false;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_Make_18322_descriptor;
         }

         public S2C_Make_18322 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_Make_18322.getDefaultInstance();
         }

         public S2C_Make_18322 build() {
            S2C_Make_18322 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Make_18322 buildPartial() {
            S2C_Make_18322 result = new S2C_Make_18322(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.guest_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.guest_ = this.guest_;
            if ((from_bitField0_ & 4) != 0) {
               result.makeCount_ = this.makeCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.firstMake_ = this.firstMake_;
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
            if (other instanceof S2C_Make_18322) {
               return this.mergeFrom((S2C_Make_18322)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Make_18322 other) {
            if (other == YuanXiao2022Msg.S2C_Make_18322.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (!other.guest_.isEmpty()) {
                  if (this.guest_.isEmpty()) {
                     this.guest_ = other.guest_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGuestIsMutable();
                     this.guest_.addAll(other.guest_);
                  }

                  this.onChanged();
               }

               if (other.hasMakeCount()) {
                  this.setMakeCount(other.getMakeCount());
               }

               if (other.hasFirstMake()) {
                  this.setFirstMake(other.getFirstMake());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasScore()) {
               return false;
            } else if (!this.hasMakeCount()) {
               return false;
            } else {
               return this.hasFirstMake();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Make_18322 parsedMessage = null;

            try {
               parsedMessage = (S2C_Make_18322)YuanXiao2022Msg.S2C_Make_18322.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Make_18322)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasScore() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 1;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -2;
            this.score_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGuestIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.guest_ = YuanXiao2022Msg.S2C_Make_18322.mutableCopy(this.guest_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGuestList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.guest_) : this.guest_);
         }

         public int getGuestCount() {
            return this.guest_.size();
         }

         public int getGuest(int index) {
            return this.guest_.getInt(index);
         }

         public Builder setGuest(int index, int value) {
            this.ensureGuestIsMutable();
            this.guest_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGuest(int value) {
            this.ensureGuestIsMutable();
            this.guest_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGuest(Iterable<? extends Integer> values) {
            this.ensureGuestIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.guest_);
            this.onChanged();
            return this;
         }

         public Builder clearGuest() {
            this.guest_ = YuanXiao2022Msg.S2C_Make_18322.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasMakeCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMakeCount() {
            return this.makeCount_;
         }

         public Builder setMakeCount(int value) {
            this.bitField0_ |= 4;
            this.makeCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMakeCount() {
            this.bitField0_ &= -5;
            this.makeCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFirstMake() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getFirstMake() {
            return this.firstMake_;
         }

         public Builder setFirstMake(boolean value) {
            this.bitField0_ |= 8;
            this.firstMake_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFirstMake() {
            this.bitField0_ &= -9;
            this.firstMake_ = false;
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

   public static final class C2S_FancyReward_17231 extends GeneratedMessageV3 implements C2S_FancyReward_17231OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMINDEX_FIELD_NUMBER = 1;
      private int itemIndex_;
      private byte memoizedIsInitialized;
      private static final C2S_FancyReward_17231 DEFAULT_INSTANCE = new C2S_FancyReward_17231();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FancyReward_17231> PARSER = new AbstractParser<C2S_FancyReward_17231>() {
         public C2S_FancyReward_17231 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FancyReward_17231(input, extensionRegistry);
         }
      };

      private C2S_FancyReward_17231(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FancyReward_17231() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FancyReward_17231();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FancyReward_17231(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.itemIndex_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_17231.class, Builder.class);
      }

      public boolean hasItemIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemIndex() {
         return this.itemIndex_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasItemIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.itemIndex_);
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
               size += CodedOutputStream.computeInt32Size(1, this.itemIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FancyReward_17231)) {
            return super.equals(obj);
         } else {
            C2S_FancyReward_17231 other = (C2S_FancyReward_17231)obj;
            if (this.hasItemIndex() != other.hasItemIndex()) {
               return false;
            } else if (this.hasItemIndex() && this.getItemIndex() != other.getItemIndex()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasItemIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getItemIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FancyReward_17231 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17231)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_17231 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17231)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_17231 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17231)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_17231 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17231)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_17231 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17231)PARSER.parseFrom(data);
      }

      public static C2S_FancyReward_17231 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FancyReward_17231)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FancyReward_17231 parseFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_17231)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_17231 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_17231)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_17231 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FancyReward_17231)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_17231 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_17231)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FancyReward_17231 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FancyReward_17231)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FancyReward_17231 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FancyReward_17231)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FancyReward_17231 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FancyReward_17231 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FancyReward_17231> parser() {
         return PARSER;
      }

      public Parser<C2S_FancyReward_17231> getParserForType() {
         return PARSER;
      }

      public C2S_FancyReward_17231 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FancyReward_17231OrBuilder {
         private int bitField0_;
         private int itemIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FancyReward_17231.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_FancyReward_17231.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemIndex_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_FancyReward_17231_descriptor;
         }

         public C2S_FancyReward_17231 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_FancyReward_17231.getDefaultInstance();
         }

         public C2S_FancyReward_17231 build() {
            C2S_FancyReward_17231 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FancyReward_17231 buildPartial() {
            C2S_FancyReward_17231 result = new C2S_FancyReward_17231(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemIndex_ = this.itemIndex_;
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
            if (other instanceof C2S_FancyReward_17231) {
               return this.mergeFrom((C2S_FancyReward_17231)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FancyReward_17231 other) {
            if (other == YuanXiao2022Msg.C2S_FancyReward_17231.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemIndex()) {
                  this.setItemIndex(other.getItemIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasItemIndex();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_FancyReward_17231 parsedMessage = null;

            try {
               parsedMessage = (C2S_FancyReward_17231)YuanXiao2022Msg.C2S_FancyReward_17231.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FancyReward_17231)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasItemIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getItemIndex() {
            return this.itemIndex_;
         }

         public Builder setItemIndex(int value) {
            this.bitField0_ |= 1;
            this.itemIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemIndex() {
            this.bitField0_ &= -2;
            this.itemIndex_ = 0;
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

   public static final class S2C_FancyReward_17232 extends GeneratedMessageV3 implements S2C_FancyReward_17232OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ITEMINDEX_FIELD_NUMBER = 2;
      private int itemIndex_;
      private byte memoizedIsInitialized;
      private static final S2C_FancyReward_17232 DEFAULT_INSTANCE = new S2C_FancyReward_17232();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FancyReward_17232> PARSER = new AbstractParser<S2C_FancyReward_17232>() {
         public S2C_FancyReward_17232 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FancyReward_17232(input, extensionRegistry);
         }
      };

      private S2C_FancyReward_17232(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FancyReward_17232() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FancyReward_17232();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FancyReward_17232(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.itemIndex_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_17232.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasItemIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getItemIndex() {
         return this.itemIndex_;
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
         } else if (!this.hasItemIndex()) {
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
            output.writeInt32(2, this.itemIndex_);
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
               size += CodedOutputStream.computeInt32Size(2, this.itemIndex_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FancyReward_17232)) {
            return super.equals(obj);
         } else {
            S2C_FancyReward_17232 other = (S2C_FancyReward_17232)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasItemIndex() != other.hasItemIndex()) {
               return false;
            } else if (this.hasItemIndex() && this.getItemIndex() != other.getItemIndex()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasItemIndex()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItemIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FancyReward_17232 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17232)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_17232 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17232)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_17232 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17232)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_17232 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17232)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_17232 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17232)PARSER.parseFrom(data);
      }

      public static S2C_FancyReward_17232 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FancyReward_17232)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FancyReward_17232 parseFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_17232)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_17232 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_17232)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_17232 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FancyReward_17232)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_17232 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_17232)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FancyReward_17232 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FancyReward_17232)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FancyReward_17232 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FancyReward_17232)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FancyReward_17232 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FancyReward_17232 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FancyReward_17232> parser() {
         return PARSER;
      }

      public Parser<S2C_FancyReward_17232> getParserForType() {
         return PARSER;
      }

      public S2C_FancyReward_17232 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FancyReward_17232OrBuilder {
         private int bitField0_;
         private int result_;
         private int itemIndex_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FancyReward_17232.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.S2C_FancyReward_17232.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.itemIndex_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_FancyReward_17232_descriptor;
         }

         public S2C_FancyReward_17232 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_FancyReward_17232.getDefaultInstance();
         }

         public S2C_FancyReward_17232 build() {
            S2C_FancyReward_17232 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FancyReward_17232 buildPartial() {
            S2C_FancyReward_17232 result = new S2C_FancyReward_17232(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.itemIndex_ = this.itemIndex_;
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
            if (other instanceof S2C_FancyReward_17232) {
               return this.mergeFrom((S2C_FancyReward_17232)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FancyReward_17232 other) {
            if (other == YuanXiao2022Msg.S2C_FancyReward_17232.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasItemIndex()) {
                  this.setItemIndex(other.getItemIndex());
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
               return this.hasItemIndex();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FancyReward_17232 parsedMessage = null;

            try {
               parsedMessage = (S2C_FancyReward_17232)YuanXiao2022Msg.S2C_FancyReward_17232.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FancyReward_17232)e.getUnfinishedMessage();
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

         public boolean hasItemIndex() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getItemIndex() {
            return this.itemIndex_;
         }

         public Builder setItemIndex(int value) {
            this.bitField0_ |= 2;
            this.itemIndex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearItemIndex() {
            this.bitField0_ &= -3;
            this.itemIndex_ = 0;
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

   public static final class C2S_SmashEgg_17233 extends GeneratedMessageV3 implements C2S_SmashEgg_17233OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_SmashEgg_17233 DEFAULT_INSTANCE = new C2S_SmashEgg_17233();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SmashEgg_17233> PARSER = new AbstractParser<C2S_SmashEgg_17233>() {
         public C2S_SmashEgg_17233 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SmashEgg_17233(input, extensionRegistry);
         }
      };

      private C2S_SmashEgg_17233(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SmashEgg_17233() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SmashEgg_17233();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SmashEgg_17233(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SmashEgg_17233.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SmashEgg_17233)) {
            return super.equals(obj);
         } else {
            C2S_SmashEgg_17233 other = (C2S_SmashEgg_17233)obj;
            if (this.hasNum() != other.hasNum()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SmashEgg_17233 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17233)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_17233 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17233)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_17233 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17233)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_17233 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17233)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_17233 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17233)PARSER.parseFrom(data);
      }

      public static C2S_SmashEgg_17233 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SmashEgg_17233)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SmashEgg_17233 parseFrom(InputStream input) throws IOException {
         return (C2S_SmashEgg_17233)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_17233 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_17233)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SmashEgg_17233 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SmashEgg_17233)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_17233 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_17233)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SmashEgg_17233 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SmashEgg_17233)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SmashEgg_17233 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SmashEgg_17233)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SmashEgg_17233 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SmashEgg_17233 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SmashEgg_17233> parser() {
         return PARSER;
      }

      public Parser<C2S_SmashEgg_17233> getParserForType() {
         return PARSER;
      }

      public C2S_SmashEgg_17233 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SmashEgg_17233OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SmashEgg_17233.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_SmashEgg_17233.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_SmashEgg_17233_descriptor;
         }

         public C2S_SmashEgg_17233 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_SmashEgg_17233.getDefaultInstance();
         }

         public C2S_SmashEgg_17233 build() {
            C2S_SmashEgg_17233 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SmashEgg_17233 buildPartial() {
            C2S_SmashEgg_17233 result = new C2S_SmashEgg_17233(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_SmashEgg_17233) {
               return this.mergeFrom((C2S_SmashEgg_17233)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SmashEgg_17233 other) {
            if (other == YuanXiao2022Msg.C2S_SmashEgg_17233.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SmashEgg_17233 parsedMessage = null;

            try {
               parsedMessage = (C2S_SmashEgg_17233)YuanXiao2022Msg.C2S_SmashEgg_17233.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SmashEgg_17233)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 1;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -2;
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

   public static final class S2C_SmashEgg_17234 extends GeneratedMessageV3 implements S2C_SmashEgg_17234OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int SENIORNUM_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> seniorNum_;
      public static final int SMASHEGGNUM_FIELD_NUMBER = 3;
      private int smashEggNum_;
      public static final int ISHAVEFANCY_FIELD_NUMBER = 4;
      private boolean isHaveFancy_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 5;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_SmashEgg_17234 DEFAULT_INSTANCE = new S2C_SmashEgg_17234();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SmashEgg_17234> PARSER = new AbstractParser<S2C_SmashEgg_17234>() {
         public S2C_SmashEgg_17234 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SmashEgg_17234(input, extensionRegistry);
         }
      };

      private S2C_SmashEgg_17234(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SmashEgg_17234() {
         this.memoizedIsInitialized = -1;
         this.seniorNum_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SmashEgg_17234();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SmashEgg_17234(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.seniorNum_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.seniorNum_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.smashEggNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.isHaveFancy_ = input.readBool();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.fancyGroupDrawTimes_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SmashEgg_17234.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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

      public boolean hasSmashEggNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSmashEggNum() {
         return this.smashEggNum_;
      }

      public boolean hasIsHaveFancy() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIsHaveFancy() {
         return this.isHaveFancy_;
      }

      public boolean hasFancyGroupDrawTimes() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSmashEggNum()) {
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
            output.writeInt32(1, this.result_);
         }

         for(int i = 0; i < this.seniorNum_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.seniorNum_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.smashEggNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(4, this.isHaveFancy_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.fancyGroupDrawTimes_);
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

            for(int i = 0; i < this.seniorNum_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.seniorNum_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.smashEggNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(4, this.isHaveFancy_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.fancyGroupDrawTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SmashEgg_17234)) {
            return super.equals(obj);
         } else {
            S2C_SmashEgg_17234 other = (S2C_SmashEgg_17234)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getSeniorNumList().equals(other.getSeniorNumList())) {
               return false;
            } else if (this.hasSmashEggNum() != other.hasSmashEggNum()) {
               return false;
            } else if (this.hasSmashEggNum() && this.getSmashEggNum() != other.getSmashEggNum()) {
               return false;
            } else if (this.hasIsHaveFancy() != other.hasIsHaveFancy()) {
               return false;
            } else if (this.hasIsHaveFancy() && this.getIsHaveFancy() != other.getIsHaveFancy()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.getSeniorNumCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSeniorNumList().hashCode();
            }

            if (this.hasSmashEggNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSmashEggNum();
            }

            if (this.hasIsHaveFancy()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHaveFancy());
            }

            if (this.hasFancyGroupDrawTimes()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFancyGroupDrawTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SmashEgg_17234 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17234)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_17234 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17234)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_17234 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17234)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_17234 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17234)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_17234 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17234)PARSER.parseFrom(data);
      }

      public static S2C_SmashEgg_17234 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SmashEgg_17234)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SmashEgg_17234 parseFrom(InputStream input) throws IOException {
         return (S2C_SmashEgg_17234)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_17234 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_17234)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SmashEgg_17234 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SmashEgg_17234)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_17234 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_17234)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SmashEgg_17234 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SmashEgg_17234)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SmashEgg_17234 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SmashEgg_17234)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SmashEgg_17234 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SmashEgg_17234 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SmashEgg_17234> parser() {
         return PARSER;
      }

      public Parser<S2C_SmashEgg_17234> getParserForType() {
         return PARSER;
      }

      public S2C_SmashEgg_17234 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SmashEgg_17234OrBuilder {
         private int bitField0_;
         private int result_;
         private List<CommonMsg.MapDataII> seniorNum_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorNumBuilder_;
         private int smashEggNum_;
         private boolean isHaveFancy_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SmashEgg_17234.class, Builder.class);
         }

         private Builder() {
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.seniorNum_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.S2C_SmashEgg_17234.alwaysUseFieldBuilders) {
               this.getSeniorNumFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.seniorNumBuilder_ == null) {
               this.seniorNum_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.seniorNumBuilder_.clear();
            }

            this.smashEggNum_ = 0;
            this.bitField0_ &= -5;
            this.isHaveFancy_ = false;
            this.bitField0_ &= -9;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_SmashEgg_17234_descriptor;
         }

         public S2C_SmashEgg_17234 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_SmashEgg_17234.getDefaultInstance();
         }

         public S2C_SmashEgg_17234 build() {
            S2C_SmashEgg_17234 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SmashEgg_17234 buildPartial() {
            S2C_SmashEgg_17234 result = new S2C_SmashEgg_17234(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if (this.seniorNumBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.seniorNum_ = Collections.unmodifiableList(this.seniorNum_);
                  this.bitField0_ &= -3;
               }

               result.seniorNum_ = this.seniorNum_;
            } else {
               result.seniorNum_ = this.seniorNumBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.smashEggNum_ = this.smashEggNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.isHaveFancy_ = this.isHaveFancy_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.fancyGroupDrawTimes_ = this.fancyGroupDrawTimes_;
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
            if (other instanceof S2C_SmashEgg_17234) {
               return this.mergeFrom((S2C_SmashEgg_17234)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SmashEgg_17234 other) {
            if (other == YuanXiao2022Msg.S2C_SmashEgg_17234.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (this.seniorNumBuilder_ == null) {
                  if (!other.seniorNum_.isEmpty()) {
                     if (this.seniorNum_.isEmpty()) {
                        this.seniorNum_ = other.seniorNum_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.seniorNumBuilder_ = YuanXiao2022Msg.S2C_SmashEgg_17234.alwaysUseFieldBuilders ? this.getSeniorNumFieldBuilder() : null;
                  } else {
                     this.seniorNumBuilder_.addAllMessages(other.seniorNum_);
                  }
               }

               if (other.hasSmashEggNum()) {
                  this.setSmashEggNum(other.getSmashEggNum());
               }

               if (other.hasIsHaveFancy()) {
                  this.setIsHaveFancy(other.getIsHaveFancy());
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
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasSmashEggNum()) {
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
            S2C_SmashEgg_17234 parsedMessage = null;

            try {
               parsedMessage = (S2C_SmashEgg_17234)YuanXiao2022Msg.S2C_SmashEgg_17234.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SmashEgg_17234)e.getUnfinishedMessage();
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

         private void ensureSeniorNumIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.seniorNum_ = new ArrayList(this.seniorNum_);
               this.bitField0_ |= 2;
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
               this.bitField0_ &= -3;
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
               this.seniorNumBuilder_ = new RepeatedFieldBuilderV3(this.seniorNum_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.seniorNum_ = null;
            }

            return this.seniorNumBuilder_;
         }

         public boolean hasSmashEggNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSmashEggNum() {
            return this.smashEggNum_;
         }

         public Builder setSmashEggNum(int value) {
            this.bitField0_ |= 4;
            this.smashEggNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSmashEggNum() {
            this.bitField0_ &= -5;
            this.smashEggNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsHaveFancy() {
            return (this.bitField0_ & 8) != 0;
         }

         public boolean getIsHaveFancy() {
            return this.isHaveFancy_;
         }

         public Builder setIsHaveFancy(boolean value) {
            this.bitField0_ |= 8;
            this.isHaveFancy_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHaveFancy() {
            this.bitField0_ &= -9;
            this.isHaveFancy_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasFancyGroupDrawTimes() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getFancyGroupDrawTimes() {
            return this.fancyGroupDrawTimes_;
         }

         public Builder setFancyGroupDrawTimes(int value) {
            this.bitField0_ |= 16;
            this.fancyGroupDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyGroupDrawTimes() {
            this.bitField0_ &= -17;
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

   public static final class C2S_TakeLuckReward_17235 extends GeneratedMessageV3 implements C2S_TakeLuckReward_17235OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeLuckReward_17235 DEFAULT_INSTANCE = new C2S_TakeLuckReward_17235();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeLuckReward_17235> PARSER = new AbstractParser<C2S_TakeLuckReward_17235>() {
         public C2S_TakeLuckReward_17235 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeLuckReward_17235(input, extensionRegistry);
         }
      };

      private C2S_TakeLuckReward_17235(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeLuckReward_17235() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeLuckReward_17235();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeLuckReward_17235(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeLuckReward_17235.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakeLuckReward_17235)) {
            return super.equals(obj);
         } else {
            C2S_TakeLuckReward_17235 other = (C2S_TakeLuckReward_17235)obj;
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

      public static C2S_TakeLuckReward_17235 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17235)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_17235 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17235)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17235 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17235)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_17235 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17235)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17235 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17235)PARSER.parseFrom(data);
      }

      public static C2S_TakeLuckReward_17235 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeLuckReward_17235)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17235 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeLuckReward_17235)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_17235 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_17235)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17235 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeLuckReward_17235)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_17235 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_17235)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeLuckReward_17235 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeLuckReward_17235)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeLuckReward_17235 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeLuckReward_17235)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeLuckReward_17235 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeLuckReward_17235 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeLuckReward_17235> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeLuckReward_17235> getParserForType() {
         return PARSER;
      }

      public C2S_TakeLuckReward_17235 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeLuckReward_17235OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeLuckReward_17235.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_TakeLuckReward_17235.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_TakeLuckReward_17235_descriptor;
         }

         public C2S_TakeLuckReward_17235 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_TakeLuckReward_17235.getDefaultInstance();
         }

         public C2S_TakeLuckReward_17235 build() {
            C2S_TakeLuckReward_17235 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeLuckReward_17235 buildPartial() {
            C2S_TakeLuckReward_17235 result = new C2S_TakeLuckReward_17235(this);
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
            if (other instanceof C2S_TakeLuckReward_17235) {
               return this.mergeFrom((C2S_TakeLuckReward_17235)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeLuckReward_17235 other) {
            if (other == YuanXiao2022Msg.C2S_TakeLuckReward_17235.getDefaultInstance()) {
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
            C2S_TakeLuckReward_17235 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeLuckReward_17235)YuanXiao2022Msg.C2S_TakeLuckReward_17235.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeLuckReward_17235)e.getUnfinishedMessage();
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

   public static final class S2C_TakeLuckReward_17236 extends GeneratedMessageV3 implements S2C_TakeLuckReward_17236OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TAKEDID_FIELD_NUMBER = 2;
      private Internal.IntList takedId_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeLuckReward_17236 DEFAULT_INSTANCE = new S2C_TakeLuckReward_17236();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeLuckReward_17236> PARSER = new AbstractParser<S2C_TakeLuckReward_17236>() {
         public S2C_TakeLuckReward_17236 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeLuckReward_17236(input, extensionRegistry);
         }
      };

      private S2C_TakeLuckReward_17236(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeLuckReward_17236() {
         this.memoizedIsInitialized = -1;
         this.takedId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeLuckReward_17236();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeLuckReward_17236(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.takedId_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedId_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.takedId_.addInt(input.readInt32());
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
                  this.takedId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeLuckReward_17236.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public List<Integer> getTakedIdList() {
         return this.takedId_;
      }

      public int getTakedIdCount() {
         return this.takedId_.size();
      }

      public int getTakedId(int index) {
         return this.takedId_.getInt(index);
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

         for(int i = 0; i < this.takedId_.size(); ++i) {
            output.writeInt32(2, this.takedId_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.takedId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedIdList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeLuckReward_17236)) {
            return super.equals(obj);
         } else {
            S2C_TakeLuckReward_17236 other = (S2C_TakeLuckReward_17236)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getTakedIdList().equals(other.getTakedIdList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.getTakedIdCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTakedIdList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeLuckReward_17236 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17236)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_17236 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17236)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17236 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17236)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_17236 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17236)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17236 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17236)PARSER.parseFrom(data);
      }

      public static S2C_TakeLuckReward_17236 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeLuckReward_17236)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17236 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeLuckReward_17236)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_17236 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_17236)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17236 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeLuckReward_17236)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_17236 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_17236)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeLuckReward_17236 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeLuckReward_17236)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeLuckReward_17236 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeLuckReward_17236)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeLuckReward_17236 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeLuckReward_17236 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeLuckReward_17236> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeLuckReward_17236> getParserForType() {
         return PARSER;
      }

      public S2C_TakeLuckReward_17236 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeLuckReward_17236OrBuilder {
         private int bitField0_;
         private int result_;
         private Internal.IntList takedId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeLuckReward_17236.class, Builder.class);
         }

         private Builder() {
            this.takedId_ = YuanXiao2022Msg.S2C_TakeLuckReward_17236.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.takedId_ = YuanXiao2022Msg.S2C_TakeLuckReward_17236.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.S2C_TakeLuckReward_17236.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.takedId_ = YuanXiao2022Msg.S2C_TakeLuckReward_17236.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_TakeLuckReward_17236_descriptor;
         }

         public S2C_TakeLuckReward_17236 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_TakeLuckReward_17236.getDefaultInstance();
         }

         public S2C_TakeLuckReward_17236 build() {
            S2C_TakeLuckReward_17236 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeLuckReward_17236 buildPartial() {
            S2C_TakeLuckReward_17236 result = new S2C_TakeLuckReward_17236(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.takedId_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.takedId_ = this.takedId_;
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
            if (other instanceof S2C_TakeLuckReward_17236) {
               return this.mergeFrom((S2C_TakeLuckReward_17236)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeLuckReward_17236 other) {
            if (other == YuanXiao2022Msg.S2C_TakeLuckReward_17236.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (!other.takedId_.isEmpty()) {
                  if (this.takedId_.isEmpty()) {
                     this.takedId_ = other.takedId_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTakedIdIsMutable();
                     this.takedId_.addAll(other.takedId_);
                  }

                  this.onChanged();
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
            S2C_TakeLuckReward_17236 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeLuckReward_17236)YuanXiao2022Msg.S2C_TakeLuckReward_17236.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeLuckReward_17236)e.getUnfinishedMessage();
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

         private void ensureTakedIdIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.takedId_ = YuanXiao2022Msg.S2C_TakeLuckReward_17236.mutableCopy(this.takedId_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getTakedIdList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.takedId_) : this.takedId_);
         }

         public int getTakedIdCount() {
            return this.takedId_.size();
         }

         public int getTakedId(int index) {
            return this.takedId_.getInt(index);
         }

         public Builder setTakedId(int index, int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedId(int value) {
            this.ensureTakedIdIsMutable();
            this.takedId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedId(Iterable<? extends Integer> values) {
            this.ensureTakedIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedId_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedId() {
            this.takedId_ = YuanXiao2022Msg.S2C_TakeLuckReward_17236.emptyIntList();
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

   public static final class C2S_OpenEggUi_17237 extends GeneratedMessageV3 implements C2S_OpenEggUi_17237OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenEggUi_17237 DEFAULT_INSTANCE = new C2S_OpenEggUi_17237();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenEggUi_17237> PARSER = new AbstractParser<C2S_OpenEggUi_17237>() {
         public C2S_OpenEggUi_17237 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenEggUi_17237(input, extensionRegistry);
         }
      };

      private C2S_OpenEggUi_17237(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenEggUi_17237() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenEggUi_17237();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenEggUi_17237(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenEggUi_17237.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenEggUi_17237)) {
            return super.equals(obj);
         } else {
            C2S_OpenEggUi_17237 other = (C2S_OpenEggUi_17237)obj;
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

      public static C2S_OpenEggUi_17237 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17237)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_17237 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17237)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_17237 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17237)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_17237 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17237)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_17237 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17237)PARSER.parseFrom(data);
      }

      public static C2S_OpenEggUi_17237 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenEggUi_17237)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenEggUi_17237 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenEggUi_17237)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_17237 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_17237)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenEggUi_17237 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenEggUi_17237)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_17237 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_17237)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenEggUi_17237 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenEggUi_17237)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenEggUi_17237 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenEggUi_17237)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenEggUi_17237 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenEggUi_17237 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenEggUi_17237> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenEggUi_17237> getParserForType() {
         return PARSER;
      }

      public C2S_OpenEggUi_17237 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenEggUi_17237OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenEggUi_17237.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_OpenEggUi_17237.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_OpenEggUi_17237_descriptor;
         }

         public C2S_OpenEggUi_17237 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_OpenEggUi_17237.getDefaultInstance();
         }

         public C2S_OpenEggUi_17237 build() {
            C2S_OpenEggUi_17237 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenEggUi_17237 buildPartial() {
            C2S_OpenEggUi_17237 result = new C2S_OpenEggUi_17237(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenEggUi_17237) {
               return this.mergeFrom((C2S_OpenEggUi_17237)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenEggUi_17237 other) {
            if (other == YuanXiao2022Msg.C2S_OpenEggUi_17237.getDefaultInstance()) {
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
            C2S_OpenEggUi_17237 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenEggUi_17237)YuanXiao2022Msg.C2S_OpenEggUi_17237.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenEggUi_17237)e.getUnfinishedMessage();
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

   public static final class S2C_OpenEggUi_17238 extends GeneratedMessageV3 implements S2C_OpenEggUi_17238OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FANCYID_FIELD_NUMBER = 1;
      private int fancyId_;
      public static final int SENIORREWARDS_FIELD_NUMBER = 2;
      private List<CommonMsg.MapDataII> seniorRewards_;
      public static final int SMASHEGGNUM_FIELD_NUMBER = 3;
      private int smashEggNum_;
      public static final int TAKEDLUCK_FIELD_NUMBER = 4;
      private Internal.IntList takedLuck_;
      public static final int FANCYGROUPDRAWTIMES_FIELD_NUMBER = 5;
      private int fancyGroupDrawTimes_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenEggUi_17238 DEFAULT_INSTANCE = new S2C_OpenEggUi_17238();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenEggUi_17238> PARSER = new AbstractParser<S2C_OpenEggUi_17238>() {
         public S2C_OpenEggUi_17238 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenEggUi_17238(input, extensionRegistry);
         }
      };

      private S2C_OpenEggUi_17238(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenEggUi_17238() {
         this.memoizedIsInitialized = -1;
         this.seniorRewards_ = Collections.emptyList();
         this.takedLuck_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenEggUi_17238();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenEggUi_17238(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.fancyId_ = input.readInt32();
                        continue;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.seniorRewards_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.seniorRewards_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 24:
                        this.bitField0_ |= 2;
                        this.smashEggNum_ = input.readInt32();
                        continue;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.takedLuck_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.takedLuck_.addInt(input.readInt32());
                        continue;
                     case 34:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.takedLuck_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.fancyGroupDrawTimes_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.takedLuck_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.takedLuck_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenEggUi_17238.class, Builder.class);
      }

      public boolean hasFancyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFancyId() {
         return this.fancyId_;
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

      public boolean hasSmashEggNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSmashEggNum() {
         return this.smashEggNum_;
      }

      public List<Integer> getTakedLuckList() {
         return this.takedLuck_;
      }

      public int getTakedLuckCount() {
         return this.takedLuck_.size();
      }

      public int getTakedLuck(int index) {
         return this.takedLuck_.getInt(index);
      }

      public boolean hasFancyGroupDrawTimes() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasFancyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSmashEggNum()) {
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
            output.writeInt32(1, this.fancyId_);
         }

         for(int i = 0; i < this.seniorRewards_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.seniorRewards_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.smashEggNum_);
         }

         for(int i = 0; i < this.takedLuck_.size(); ++i) {
            output.writeInt32(4, this.takedLuck_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.fancyGroupDrawTimes_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fancyId_);
            }

            for(int i = 0; i < this.seniorRewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.seniorRewards_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.smashEggNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.takedLuck_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.takedLuck_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getTakedLuckList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.fancyGroupDrawTimes_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenEggUi_17238)) {
            return super.equals(obj);
         } else {
            S2C_OpenEggUi_17238 other = (S2C_OpenEggUi_17238)obj;
            if (this.hasFancyId() != other.hasFancyId()) {
               return false;
            } else if (this.hasFancyId() && this.getFancyId() != other.getFancyId()) {
               return false;
            } else if (!this.getSeniorRewardsList().equals(other.getSeniorRewardsList())) {
               return false;
            } else if (this.hasSmashEggNum() != other.hasSmashEggNum()) {
               return false;
            } else if (this.hasSmashEggNum() && this.getSmashEggNum() != other.getSmashEggNum()) {
               return false;
            } else if (!this.getTakedLuckList().equals(other.getTakedLuckList())) {
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
            if (this.hasFancyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFancyId();
            }

            if (this.getSeniorRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSeniorRewardsList().hashCode();
            }

            if (this.hasSmashEggNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSmashEggNum();
            }

            if (this.getTakedLuckCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getTakedLuckList().hashCode();
            }

            if (this.hasFancyGroupDrawTimes()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getFancyGroupDrawTimes();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenEggUi_17238 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17238)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_17238 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17238)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_17238 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17238)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_17238 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17238)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_17238 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17238)PARSER.parseFrom(data);
      }

      public static S2C_OpenEggUi_17238 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenEggUi_17238)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenEggUi_17238 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenEggUi_17238)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_17238 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_17238)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenEggUi_17238 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenEggUi_17238)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_17238 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_17238)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenEggUi_17238 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenEggUi_17238)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenEggUi_17238 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenEggUi_17238)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenEggUi_17238 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenEggUi_17238 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenEggUi_17238> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenEggUi_17238> getParserForType() {
         return PARSER;
      }

      public S2C_OpenEggUi_17238 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenEggUi_17238OrBuilder {
         private int bitField0_;
         private int fancyId_;
         private List<CommonMsg.MapDataII> seniorRewards_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> seniorRewardsBuilder_;
         private int smashEggNum_;
         private Internal.IntList takedLuck_;
         private int fancyGroupDrawTimes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenEggUi_17238.class, Builder.class);
         }

         private Builder() {
            this.seniorRewards_ = Collections.emptyList();
            this.takedLuck_ = YuanXiao2022Msg.S2C_OpenEggUi_17238.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.seniorRewards_ = Collections.emptyList();
            this.takedLuck_ = YuanXiao2022Msg.S2C_OpenEggUi_17238.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.S2C_OpenEggUi_17238.alwaysUseFieldBuilders) {
               this.getSeniorRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.fancyId_ = 0;
            this.bitField0_ &= -2;
            if (this.seniorRewardsBuilder_ == null) {
               this.seniorRewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.seniorRewardsBuilder_.clear();
            }

            this.smashEggNum_ = 0;
            this.bitField0_ &= -5;
            this.takedLuck_ = YuanXiao2022Msg.S2C_OpenEggUi_17238.emptyIntList();
            this.bitField0_ &= -9;
            this.fancyGroupDrawTimes_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_OpenEggUi_17238_descriptor;
         }

         public S2C_OpenEggUi_17238 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_OpenEggUi_17238.getDefaultInstance();
         }

         public S2C_OpenEggUi_17238 build() {
            S2C_OpenEggUi_17238 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenEggUi_17238 buildPartial() {
            S2C_OpenEggUi_17238 result = new S2C_OpenEggUi_17238(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fancyId_ = this.fancyId_;
               to_bitField0_ |= 1;
            }

            if (this.seniorRewardsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.seniorRewards_ = Collections.unmodifiableList(this.seniorRewards_);
                  this.bitField0_ &= -3;
               }

               result.seniorRewards_ = this.seniorRewards_;
            } else {
               result.seniorRewards_ = this.seniorRewardsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.smashEggNum_ = this.smashEggNum_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.takedLuck_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.takedLuck_ = this.takedLuck_;
            if ((from_bitField0_ & 16) != 0) {
               result.fancyGroupDrawTimes_ = this.fancyGroupDrawTimes_;
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
            if (other instanceof S2C_OpenEggUi_17238) {
               return this.mergeFrom((S2C_OpenEggUi_17238)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenEggUi_17238 other) {
            if (other == YuanXiao2022Msg.S2C_OpenEggUi_17238.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFancyId()) {
                  this.setFancyId(other.getFancyId());
               }

               if (this.seniorRewardsBuilder_ == null) {
                  if (!other.seniorRewards_.isEmpty()) {
                     if (this.seniorRewards_.isEmpty()) {
                        this.seniorRewards_ = other.seniorRewards_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.seniorRewardsBuilder_ = YuanXiao2022Msg.S2C_OpenEggUi_17238.alwaysUseFieldBuilders ? this.getSeniorRewardsFieldBuilder() : null;
                  } else {
                     this.seniorRewardsBuilder_.addAllMessages(other.seniorRewards_);
                  }
               }

               if (other.hasSmashEggNum()) {
                  this.setSmashEggNum(other.getSmashEggNum());
               }

               if (!other.takedLuck_.isEmpty()) {
                  if (this.takedLuck_.isEmpty()) {
                     this.takedLuck_ = other.takedLuck_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureTakedLuckIsMutable();
                     this.takedLuck_.addAll(other.takedLuck_);
                  }

                  this.onChanged();
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
            if (!this.hasFancyId()) {
               return false;
            } else if (!this.hasSmashEggNum()) {
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
            S2C_OpenEggUi_17238 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenEggUi_17238)YuanXiao2022Msg.S2C_OpenEggUi_17238.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenEggUi_17238)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFancyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFancyId() {
            return this.fancyId_;
         }

         public Builder setFancyId(int value) {
            this.bitField0_ |= 1;
            this.fancyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyId() {
            this.bitField0_ &= -2;
            this.fancyId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSeniorRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.seniorRewards_ = new ArrayList(this.seniorRewards_);
               this.bitField0_ |= 2;
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
               this.bitField0_ &= -3;
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
               this.seniorRewardsBuilder_ = new RepeatedFieldBuilderV3(this.seniorRewards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.seniorRewards_ = null;
            }

            return this.seniorRewardsBuilder_;
         }

         public boolean hasSmashEggNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSmashEggNum() {
            return this.smashEggNum_;
         }

         public Builder setSmashEggNum(int value) {
            this.bitField0_ |= 4;
            this.smashEggNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSmashEggNum() {
            this.bitField0_ &= -5;
            this.smashEggNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTakedLuckIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.takedLuck_ = YuanXiao2022Msg.S2C_OpenEggUi_17238.mutableCopy(this.takedLuck_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getTakedLuckList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.takedLuck_) : this.takedLuck_);
         }

         public int getTakedLuckCount() {
            return this.takedLuck_.size();
         }

         public int getTakedLuck(int index) {
            return this.takedLuck_.getInt(index);
         }

         public Builder setTakedLuck(int index, int value) {
            this.ensureTakedLuckIsMutable();
            this.takedLuck_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addTakedLuck(int value) {
            this.ensureTakedLuckIsMutable();
            this.takedLuck_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllTakedLuck(Iterable<? extends Integer> values) {
            this.ensureTakedLuckIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.takedLuck_);
            this.onChanged();
            return this;
         }

         public Builder clearTakedLuck() {
            this.takedLuck_ = YuanXiao2022Msg.S2C_OpenEggUi_17238.emptyIntList();
            this.bitField0_ &= -9;
            this.onChanged();
            return this;
         }

         public boolean hasFancyGroupDrawTimes() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getFancyGroupDrawTimes() {
            return this.fancyGroupDrawTimes_;
         }

         public Builder setFancyGroupDrawTimes(int value) {
            this.bitField0_ |= 16;
            this.fancyGroupDrawTimes_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFancyGroupDrawTimes() {
            this.bitField0_ &= -17;
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

   public static final class C2S_ServerDrawRecord_17239 extends GeneratedMessageV3 implements C2S_ServerDrawRecord_17239OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ServerDrawRecord_17239 DEFAULT_INSTANCE = new C2S_ServerDrawRecord_17239();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ServerDrawRecord_17239> PARSER = new AbstractParser<C2S_ServerDrawRecord_17239>() {
         public C2S_ServerDrawRecord_17239 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ServerDrawRecord_17239(input, extensionRegistry);
         }
      };

      private C2S_ServerDrawRecord_17239(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ServerDrawRecord_17239() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ServerDrawRecord_17239();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ServerDrawRecord_17239(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_17239.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ServerDrawRecord_17239)) {
            return super.equals(obj);
         } else {
            C2S_ServerDrawRecord_17239 other = (C2S_ServerDrawRecord_17239)obj;
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

      public static C2S_ServerDrawRecord_17239 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17239)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_17239 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17239)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17239 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17239)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_17239 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17239)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17239 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17239)PARSER.parseFrom(data);
      }

      public static C2S_ServerDrawRecord_17239 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ServerDrawRecord_17239)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17239 parseFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_17239)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_17239 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_17239)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17239 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ServerDrawRecord_17239)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_17239 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_17239)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ServerDrawRecord_17239 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ServerDrawRecord_17239)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ServerDrawRecord_17239 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ServerDrawRecord_17239)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ServerDrawRecord_17239 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ServerDrawRecord_17239 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ServerDrawRecord_17239> parser() {
         return PARSER;
      }

      public Parser<C2S_ServerDrawRecord_17239> getParserForType() {
         return PARSER;
      }

      public C2S_ServerDrawRecord_17239 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ServerDrawRecord_17239OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ServerDrawRecord_17239.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_ServerDrawRecord_17239.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ServerDrawRecord_17239_descriptor;
         }

         public C2S_ServerDrawRecord_17239 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_ServerDrawRecord_17239.getDefaultInstance();
         }

         public C2S_ServerDrawRecord_17239 build() {
            C2S_ServerDrawRecord_17239 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ServerDrawRecord_17239 buildPartial() {
            C2S_ServerDrawRecord_17239 result = new C2S_ServerDrawRecord_17239(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ServerDrawRecord_17239) {
               return this.mergeFrom((C2S_ServerDrawRecord_17239)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ServerDrawRecord_17239 other) {
            if (other == YuanXiao2022Msg.C2S_ServerDrawRecord_17239.getDefaultInstance()) {
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
            C2S_ServerDrawRecord_17239 parsedMessage = null;

            try {
               parsedMessage = (C2S_ServerDrawRecord_17239)YuanXiao2022Msg.C2S_ServerDrawRecord_17239.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ServerDrawRecord_17239)e.getUnfinishedMessage();
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

   public static final class S2C_ServerDrawRecord_17240 extends GeneratedMessageV3 implements S2C_ServerDrawRecord_17240OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SERVERRECORD_FIELD_NUMBER = 1;
      private List<ServerDrawRecord> serverRecord_;
      private byte memoizedIsInitialized;
      private static final S2C_ServerDrawRecord_17240 DEFAULT_INSTANCE = new S2C_ServerDrawRecord_17240();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ServerDrawRecord_17240> PARSER = new AbstractParser<S2C_ServerDrawRecord_17240>() {
         public S2C_ServerDrawRecord_17240 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ServerDrawRecord_17240(input, extensionRegistry);
         }
      };

      private S2C_ServerDrawRecord_17240(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ServerDrawRecord_17240() {
         this.memoizedIsInitialized = -1;
         this.serverRecord_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ServerDrawRecord_17240();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ServerDrawRecord_17240(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.serverRecord_.add(input.readMessage(YuanXiao2022Msg.ServerDrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_17240.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ServerDrawRecord_17240)) {
            return super.equals(obj);
         } else {
            S2C_ServerDrawRecord_17240 other = (S2C_ServerDrawRecord_17240)obj;
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

      public static S2C_ServerDrawRecord_17240 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17240)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_17240 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17240)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17240 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17240)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_17240 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17240)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17240 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17240)PARSER.parseFrom(data);
      }

      public static S2C_ServerDrawRecord_17240 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ServerDrawRecord_17240)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17240 parseFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_17240)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_17240 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_17240)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17240 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ServerDrawRecord_17240)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_17240 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_17240)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ServerDrawRecord_17240 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ServerDrawRecord_17240)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ServerDrawRecord_17240 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ServerDrawRecord_17240)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ServerDrawRecord_17240 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ServerDrawRecord_17240 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ServerDrawRecord_17240> parser() {
         return PARSER;
      }

      public Parser<S2C_ServerDrawRecord_17240> getParserForType() {
         return PARSER;
      }

      public S2C_ServerDrawRecord_17240 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ServerDrawRecord_17240OrBuilder {
         private int bitField0_;
         private List<ServerDrawRecord> serverRecord_;
         private RepeatedFieldBuilderV3<ServerDrawRecord, ServerDrawRecord.Builder, ServerDrawRecordOrBuilder> serverRecordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ServerDrawRecord_17240.class, Builder.class);
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
            if (YuanXiao2022Msg.S2C_ServerDrawRecord_17240.alwaysUseFieldBuilders) {
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_ServerDrawRecord_17240_descriptor;
         }

         public S2C_ServerDrawRecord_17240 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_ServerDrawRecord_17240.getDefaultInstance();
         }

         public S2C_ServerDrawRecord_17240 build() {
            S2C_ServerDrawRecord_17240 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ServerDrawRecord_17240 buildPartial() {
            S2C_ServerDrawRecord_17240 result = new S2C_ServerDrawRecord_17240(this);
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
            if (other instanceof S2C_ServerDrawRecord_17240) {
               return this.mergeFrom((S2C_ServerDrawRecord_17240)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ServerDrawRecord_17240 other) {
            if (other == YuanXiao2022Msg.S2C_ServerDrawRecord_17240.getDefaultInstance()) {
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
                     this.serverRecordBuilder_ = YuanXiao2022Msg.S2C_ServerDrawRecord_17240.alwaysUseFieldBuilders ? this.getServerRecordFieldBuilder() : null;
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
            S2C_ServerDrawRecord_17240 parsedMessage = null;

            try {
               parsedMessage = (S2C_ServerDrawRecord_17240)YuanXiao2022Msg.S2C_ServerDrawRecord_17240.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ServerDrawRecord_17240)e.getUnfinishedMessage();
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
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(YuanXiao2022Msg.ServerDrawRecord.getDefaultInstance());
         }

         public ServerDrawRecord.Builder addServerRecordBuilder(int index) {
            return (ServerDrawRecord.Builder)this.getServerRecordFieldBuilder().addBuilder(index, YuanXiao2022Msg.ServerDrawRecord.getDefaultInstance());
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

   public static final class C2S_DrawRecord_17241 extends GeneratedMessageV3 implements C2S_DrawRecord_17241OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DrawRecord_17241 DEFAULT_INSTANCE = new C2S_DrawRecord_17241();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DrawRecord_17241> PARSER = new AbstractParser<C2S_DrawRecord_17241>() {
         public C2S_DrawRecord_17241 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DrawRecord_17241(input, extensionRegistry);
         }
      };

      private C2S_DrawRecord_17241(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DrawRecord_17241() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DrawRecord_17241();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DrawRecord_17241(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_17241.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DrawRecord_17241)) {
            return super.equals(obj);
         } else {
            C2S_DrawRecord_17241 other = (C2S_DrawRecord_17241)obj;
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

      public static C2S_DrawRecord_17241 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17241)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_17241 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17241)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_17241 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17241)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_17241 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17241)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_17241 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17241)PARSER.parseFrom(data);
      }

      public static C2S_DrawRecord_17241 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DrawRecord_17241)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DrawRecord_17241 parseFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_17241)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_17241 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_17241)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_17241 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DrawRecord_17241)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_17241 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_17241)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DrawRecord_17241 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DrawRecord_17241)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DrawRecord_17241 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DrawRecord_17241)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DrawRecord_17241 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DrawRecord_17241 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DrawRecord_17241> parser() {
         return PARSER;
      }

      public Parser<C2S_DrawRecord_17241> getParserForType() {
         return PARSER;
      }

      public C2S_DrawRecord_17241 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DrawRecord_17241OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DrawRecord_17241.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_DrawRecord_17241.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_DrawRecord_17241_descriptor;
         }

         public C2S_DrawRecord_17241 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_DrawRecord_17241.getDefaultInstance();
         }

         public C2S_DrawRecord_17241 build() {
            C2S_DrawRecord_17241 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DrawRecord_17241 buildPartial() {
            C2S_DrawRecord_17241 result = new C2S_DrawRecord_17241(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DrawRecord_17241) {
               return this.mergeFrom((C2S_DrawRecord_17241)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DrawRecord_17241 other) {
            if (other == YuanXiao2022Msg.C2S_DrawRecord_17241.getDefaultInstance()) {
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
            C2S_DrawRecord_17241 parsedMessage = null;

            try {
               parsedMessage = (C2S_DrawRecord_17241)YuanXiao2022Msg.C2S_DrawRecord_17241.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DrawRecord_17241)e.getUnfinishedMessage();
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

   public static final class S2C_DrawRecord_17242 extends GeneratedMessageV3 implements S2C_DrawRecord_17242OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MYRECROD_FIELD_NUMBER = 1;
      private List<DrawRecord> myRecrod_;
      private byte memoizedIsInitialized;
      private static final S2C_DrawRecord_17242 DEFAULT_INSTANCE = new S2C_DrawRecord_17242();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DrawRecord_17242> PARSER = new AbstractParser<S2C_DrawRecord_17242>() {
         public S2C_DrawRecord_17242 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DrawRecord_17242(input, extensionRegistry);
         }
      };

      private S2C_DrawRecord_17242(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DrawRecord_17242() {
         this.memoizedIsInitialized = -1;
         this.myRecrod_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DrawRecord_17242();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DrawRecord_17242(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.myRecrod_.add(input.readMessage(YuanXiao2022Msg.DrawRecord.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_17242.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DrawRecord_17242)) {
            return super.equals(obj);
         } else {
            S2C_DrawRecord_17242 other = (S2C_DrawRecord_17242)obj;
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

      public static S2C_DrawRecord_17242 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17242)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_17242 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17242)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_17242 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17242)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_17242 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17242)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_17242 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17242)PARSER.parseFrom(data);
      }

      public static S2C_DrawRecord_17242 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DrawRecord_17242)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DrawRecord_17242 parseFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_17242)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_17242 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_17242)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_17242 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DrawRecord_17242)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_17242 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_17242)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DrawRecord_17242 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DrawRecord_17242)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DrawRecord_17242 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DrawRecord_17242)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DrawRecord_17242 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DrawRecord_17242 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DrawRecord_17242> parser() {
         return PARSER;
      }

      public Parser<S2C_DrawRecord_17242> getParserForType() {
         return PARSER;
      }

      public S2C_DrawRecord_17242 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DrawRecord_17242OrBuilder {
         private int bitField0_;
         private List<DrawRecord> myRecrod_;
         private RepeatedFieldBuilderV3<DrawRecord, DrawRecord.Builder, DrawRecordOrBuilder> myRecrodBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DrawRecord_17242.class, Builder.class);
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
            if (YuanXiao2022Msg.S2C_DrawRecord_17242.alwaysUseFieldBuilders) {
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_DrawRecord_17242_descriptor;
         }

         public S2C_DrawRecord_17242 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_DrawRecord_17242.getDefaultInstance();
         }

         public S2C_DrawRecord_17242 build() {
            S2C_DrawRecord_17242 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DrawRecord_17242 buildPartial() {
            S2C_DrawRecord_17242 result = new S2C_DrawRecord_17242(this);
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
            if (other instanceof S2C_DrawRecord_17242) {
               return this.mergeFrom((S2C_DrawRecord_17242)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DrawRecord_17242 other) {
            if (other == YuanXiao2022Msg.S2C_DrawRecord_17242.getDefaultInstance()) {
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
                     this.myRecrodBuilder_ = YuanXiao2022Msg.S2C_DrawRecord_17242.alwaysUseFieldBuilders ? this.getMyRecrodFieldBuilder() : null;
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
            S2C_DrawRecord_17242 parsedMessage = null;

            try {
               parsedMessage = (S2C_DrawRecord_17242)YuanXiao2022Msg.S2C_DrawRecord_17242.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DrawRecord_17242)e.getUnfinishedMessage();
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
            return (DrawRecord.Builder)this.getMyRecrodFieldBuilder().addBuilder(YuanXiao2022Msg.DrawRecord.getDefaultInstance());
         }

         public DrawRecord.Builder addMyRecrodBuilder(int index) {
            return (DrawRecord.Builder)this.getMyRecrodFieldBuilder().addBuilder(index, YuanXiao2022Msg.DrawRecord.getDefaultInstance());
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

   public static final class C2S_StillCostTotalInfo_18356 extends GeneratedMessageV3 implements C2S_StillCostTotalInfo_18356OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_StillCostTotalInfo_18356 DEFAULT_INSTANCE = new C2S_StillCostTotalInfo_18356();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StillCostTotalInfo_18356> PARSER = new AbstractParser<C2S_StillCostTotalInfo_18356>() {
         public C2S_StillCostTotalInfo_18356 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StillCostTotalInfo_18356(input, extensionRegistry);
         }
      };

      private C2S_StillCostTotalInfo_18356(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StillCostTotalInfo_18356() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StillCostTotalInfo_18356();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StillCostTotalInfo_18356(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StillCostTotalInfo_18356.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StillCostTotalInfo_18356)) {
            return super.equals(obj);
         } else {
            C2S_StillCostTotalInfo_18356 other = (C2S_StillCostTotalInfo_18356)obj;
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

      public static C2S_StillCostTotalInfo_18356 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StillCostTotalInfo_18356)PARSER.parseFrom(data);
      }

      public static C2S_StillCostTotalInfo_18356 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StillCostTotalInfo_18356)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StillCostTotalInfo_18356 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StillCostTotalInfo_18356)PARSER.parseFrom(data);
      }

      public static C2S_StillCostTotalInfo_18356 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StillCostTotalInfo_18356)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StillCostTotalInfo_18356 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StillCostTotalInfo_18356)PARSER.parseFrom(data);
      }

      public static C2S_StillCostTotalInfo_18356 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StillCostTotalInfo_18356)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StillCostTotalInfo_18356 parseFrom(InputStream input) throws IOException {
         return (C2S_StillCostTotalInfo_18356)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StillCostTotalInfo_18356 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StillCostTotalInfo_18356)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StillCostTotalInfo_18356 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StillCostTotalInfo_18356)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StillCostTotalInfo_18356 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StillCostTotalInfo_18356)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StillCostTotalInfo_18356 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StillCostTotalInfo_18356)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StillCostTotalInfo_18356 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StillCostTotalInfo_18356)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StillCostTotalInfo_18356 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StillCostTotalInfo_18356 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StillCostTotalInfo_18356> parser() {
         return PARSER;
      }

      public Parser<C2S_StillCostTotalInfo_18356> getParserForType() {
         return PARSER;
      }

      public C2S_StillCostTotalInfo_18356 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StillCostTotalInfo_18356OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StillCostTotalInfo_18356.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_StillCostTotalInfo_18356.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_StillCostTotalInfo_18356_descriptor;
         }

         public C2S_StillCostTotalInfo_18356 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_StillCostTotalInfo_18356.getDefaultInstance();
         }

         public C2S_StillCostTotalInfo_18356 build() {
            C2S_StillCostTotalInfo_18356 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StillCostTotalInfo_18356 buildPartial() {
            C2S_StillCostTotalInfo_18356 result = new C2S_StillCostTotalInfo_18356(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_StillCostTotalInfo_18356) {
               return this.mergeFrom((C2S_StillCostTotalInfo_18356)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StillCostTotalInfo_18356 other) {
            if (other == YuanXiao2022Msg.C2S_StillCostTotalInfo_18356.getDefaultInstance()) {
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
            C2S_StillCostTotalInfo_18356 parsedMessage = null;

            try {
               parsedMessage = (C2S_StillCostTotalInfo_18356)YuanXiao2022Msg.C2S_StillCostTotalInfo_18356.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StillCostTotalInfo_18356)e.getUnfinishedMessage();
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

   public static final class S2C_StillCostTotalInfo_18357 extends GeneratedMessageV3 implements S2C_StillCostTotalInfo_18357OrBuilder {
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
      private static final S2C_StillCostTotalInfo_18357 DEFAULT_INSTANCE = new S2C_StillCostTotalInfo_18357();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StillCostTotalInfo_18357> PARSER = new AbstractParser<S2C_StillCostTotalInfo_18357>() {
         public S2C_StillCostTotalInfo_18357 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StillCostTotalInfo_18357(input, extensionRegistry);
         }
      };

      private S2C_StillCostTotalInfo_18357(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StillCostTotalInfo_18357() {
         this.memoizedIsInitialized = -1;
         this.canReceiveRewardIds_ = emptyIntList();
         this.hasReceiveRewardIds_ = emptyIntList();
         this.nextUnlockReceiveReward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StillCostTotalInfo_18357();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StillCostTotalInfo_18357(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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

                        this.nextUnlockReceiveReward_.add(input.readMessage(YuanXiao2022Msg.NextUnlockReceiveReward.PARSER, extensionRegistry));
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StillCostTotalInfo_18357.class, Builder.class);
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
         } else if (!(obj instanceof S2C_StillCostTotalInfo_18357)) {
            return super.equals(obj);
         } else {
            S2C_StillCostTotalInfo_18357 other = (S2C_StillCostTotalInfo_18357)obj;
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

      public static S2C_StillCostTotalInfo_18357 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StillCostTotalInfo_18357)PARSER.parseFrom(data);
      }

      public static S2C_StillCostTotalInfo_18357 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StillCostTotalInfo_18357)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StillCostTotalInfo_18357 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StillCostTotalInfo_18357)PARSER.parseFrom(data);
      }

      public static S2C_StillCostTotalInfo_18357 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StillCostTotalInfo_18357)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StillCostTotalInfo_18357 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StillCostTotalInfo_18357)PARSER.parseFrom(data);
      }

      public static S2C_StillCostTotalInfo_18357 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StillCostTotalInfo_18357)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StillCostTotalInfo_18357 parseFrom(InputStream input) throws IOException {
         return (S2C_StillCostTotalInfo_18357)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StillCostTotalInfo_18357 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StillCostTotalInfo_18357)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StillCostTotalInfo_18357 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StillCostTotalInfo_18357)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StillCostTotalInfo_18357 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StillCostTotalInfo_18357)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StillCostTotalInfo_18357 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StillCostTotalInfo_18357)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StillCostTotalInfo_18357 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StillCostTotalInfo_18357)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StillCostTotalInfo_18357 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StillCostTotalInfo_18357 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StillCostTotalInfo_18357> parser() {
         return PARSER;
      }

      public Parser<S2C_StillCostTotalInfo_18357> getParserForType() {
         return PARSER;
      }

      public S2C_StillCostTotalInfo_18357 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StillCostTotalInfo_18357OrBuilder {
         private int bitField0_;
         private int unlockStageNum_;
         private Internal.IntList canReceiveRewardIds_;
         private Internal.IntList hasReceiveRewardIds_;
         private List<NextUnlockReceiveReward> nextUnlockReceiveReward_;
         private RepeatedFieldBuilderV3<NextUnlockReceiveReward, NextUnlockReceiveReward.Builder, NextUnlockReceiveRewardOrBuilder> nextUnlockReceiveRewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StillCostTotalInfo_18357.class, Builder.class);
         }

         private Builder() {
            this.canReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.emptyIntList();
            this.hasReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.canReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.emptyIntList();
            this.hasReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.emptyIntList();
            this.nextUnlockReceiveReward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.alwaysUseFieldBuilders) {
               this.getNextUnlockReceiveRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.unlockStageNum_ = 0;
            this.bitField0_ &= -2;
            this.canReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.emptyIntList();
            this.bitField0_ &= -3;
            this.hasReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.emptyIntList();
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_S2C_StillCostTotalInfo_18357_descriptor;
         }

         public S2C_StillCostTotalInfo_18357 getDefaultInstanceForType() {
            return YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.getDefaultInstance();
         }

         public S2C_StillCostTotalInfo_18357 build() {
            S2C_StillCostTotalInfo_18357 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StillCostTotalInfo_18357 buildPartial() {
            S2C_StillCostTotalInfo_18357 result = new S2C_StillCostTotalInfo_18357(this);
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
            if (other instanceof S2C_StillCostTotalInfo_18357) {
               return this.mergeFrom((S2C_StillCostTotalInfo_18357)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StillCostTotalInfo_18357 other) {
            if (other == YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.getDefaultInstance()) {
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
                     this.nextUnlockReceiveRewardBuilder_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.alwaysUseFieldBuilders ? this.getNextUnlockReceiveRewardFieldBuilder() : null;
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
            S2C_StillCostTotalInfo_18357 parsedMessage = null;

            try {
               parsedMessage = (S2C_StillCostTotalInfo_18357)YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StillCostTotalInfo_18357)e.getUnfinishedMessage();
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
               this.canReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.mutableCopy(this.canReceiveRewardIds_);
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
            this.canReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureHasReceiveRewardIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.hasReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.mutableCopy(this.hasReceiveRewardIds_);
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
            this.hasReceiveRewardIds_ = YuanXiao2022Msg.S2C_StillCostTotalInfo_18357.emptyIntList();
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
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(YuanXiao2022Msg.NextUnlockReceiveReward.getDefaultInstance());
         }

         public NextUnlockReceiveReward.Builder addNextUnlockReceiveRewardBuilder(int index) {
            return (NextUnlockReceiveReward.Builder)this.getNextUnlockReceiveRewardFieldBuilder().addBuilder(index, YuanXiao2022Msg.NextUnlockReceiveReward.getDefaultInstance());
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_fieldAccessorTable.ensureFieldAccessorsInitialized(NextUnlockReceiveReward.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.NextUnlockReceiveReward.alwaysUseFieldBuilders) {
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
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_NextUnlockReceiveReward_descriptor;
         }

         public NextUnlockReceiveReward getDefaultInstanceForType() {
            return YuanXiao2022Msg.NextUnlockReceiveReward.getDefaultInstance();
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
            if (other == YuanXiao2022Msg.NextUnlockReceiveReward.getDefaultInstance()) {
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
               parsedMessage = (NextUnlockReceiveReward)YuanXiao2022Msg.NextUnlockReceiveReward.PARSER.parsePartialFrom(input, extensionRegistry);
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

   public static final class C2S_ReceiveStillCostReward_18358 extends GeneratedMessageV3 implements C2S_ReceiveStillCostReward_18358OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDID_FIELD_NUMBER = 1;
      private int rewardId_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveStillCostReward_18358 DEFAULT_INSTANCE = new C2S_ReceiveStillCostReward_18358();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveStillCostReward_18358> PARSER = new AbstractParser<C2S_ReceiveStillCostReward_18358>() {
         public C2S_ReceiveStillCostReward_18358 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveStillCostReward_18358(input, extensionRegistry);
         }
      };

      private C2S_ReceiveStillCostReward_18358(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveStillCostReward_18358() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveStillCostReward_18358();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveStillCostReward_18358(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveStillCostReward_18358.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ReceiveStillCostReward_18358)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveStillCostReward_18358 other = (C2S_ReceiveStillCostReward_18358)obj;
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

      public static C2S_ReceiveStillCostReward_18358 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveStillCostReward_18358)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveStillCostReward_18358 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveStillCostReward_18358)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveStillCostReward_18358 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveStillCostReward_18358)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveStillCostReward_18358 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveStillCostReward_18358)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveStillCostReward_18358 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveStillCostReward_18358)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveStillCostReward_18358 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveStillCostReward_18358)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveStillCostReward_18358 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveStillCostReward_18358)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveStillCostReward_18358 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveStillCostReward_18358)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveStillCostReward_18358 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveStillCostReward_18358)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveStillCostReward_18358 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveStillCostReward_18358)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveStillCostReward_18358 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveStillCostReward_18358)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveStillCostReward_18358 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveStillCostReward_18358)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveStillCostReward_18358 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveStillCostReward_18358 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveStillCostReward_18358> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveStillCostReward_18358> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveStillCostReward_18358 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveStillCostReward_18358OrBuilder {
         private int bitField0_;
         private int rewardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveStillCostReward_18358.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (YuanXiao2022Msg.C2S_ReceiveStillCostReward_18358.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return YuanXiao2022Msg.internal_static_YuanXiao2022_com_gzbz_protobuf_C2S_ReceiveStillCostReward_18358_descriptor;
         }

         public C2S_ReceiveStillCostReward_18358 getDefaultInstanceForType() {
            return YuanXiao2022Msg.C2S_ReceiveStillCostReward_18358.getDefaultInstance();
         }

         public C2S_ReceiveStillCostReward_18358 build() {
            C2S_ReceiveStillCostReward_18358 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveStillCostReward_18358 buildPartial() {
            C2S_ReceiveStillCostReward_18358 result = new C2S_ReceiveStillCostReward_18358(this);
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
            if (other instanceof C2S_ReceiveStillCostReward_18358) {
               return this.mergeFrom((C2S_ReceiveStillCostReward_18358)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveStillCostReward_18358 other) {
            if (other == YuanXiao2022Msg.C2S_ReceiveStillCostReward_18358.getDefaultInstance()) {
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
            C2S_ReceiveStillCostReward_18358 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveStillCostReward_18358)YuanXiao2022Msg.C2S_ReceiveStillCostReward_18358.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveStillCostReward_18358)e.getUnfinishedMessage();
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

   public interface C2S_ActivityInfo_18301OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_AddUpTotalInfo_18303OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DrawRecord_17241OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FancyReward_17231OrBuilder extends MessageOrBuilder {
      boolean hasItemIndex();

      int getItemIndex();
   }

   public interface C2S_Make_18321OrBuilder extends MessageOrBuilder {
      boolean hasScore();

      int getScore();

      List<Integer> getGuestList();

      int getGuestCount();

      int getGuest(int index);
   }

   public interface C2S_OpenEggUi_17237OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Pray_18306OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ReceiveAddUpReward_18305OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ReceiveFavorReward_18311OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ReceiveStillCostReward_18358OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
   }

   public interface C2S_ServerDrawRecord_17239OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SmashEgg_17233OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_StillCostTotalInfo_18356OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TakeLuckReward_17235OrBuilder extends MessageOrBuilder {
      boolean hasRewardId();

      int getRewardId();
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

   public interface S2C_ActivityInfo_18302OrBuilder extends MessageOrBuilder {
      boolean hasMakeCount();

      int getMakeCount();

      boolean hasFirstMake();

      boolean getFirstMake();

      boolean hasOpenDay();

      int getOpenDay();

      boolean hasActivityDay();

      int getActivityDay();

      boolean hasSmashEggStage();

      int getSmashEggStage();
   }

   public interface S2C_AddUpTotalInfo_18304OrBuilder extends MessageOrBuilder {
      List<Integer> getGotRewardsList();

      int getGotRewardsCount();

      int getGotRewards(int index);

      boolean hasStageRecharge();

      int getStageRecharge();

      boolean hasStageEndTime();

      long getStageEndTime();
   }

   public interface S2C_DrawRecord_17242OrBuilder extends MessageOrBuilder {
      List<DrawRecord> getMyRecrodList();

      DrawRecord getMyRecrod(int index);

      int getMyRecrodCount();

      List<? extends DrawRecordOrBuilder> getMyRecrodOrBuilderList();

      DrawRecordOrBuilder getMyRecrodOrBuilder(int index);
   }

   public interface S2C_FancyReward_17232OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasItemIndex();

      int getItemIndex();
   }

   public interface S2C_Make_18322OrBuilder extends MessageOrBuilder {
      boolean hasScore();

      int getScore();

      List<Integer> getGuestList();

      int getGuestCount();

      int getGuest(int index);

      boolean hasMakeCount();

      int getMakeCount();

      boolean hasFirstMake();

      boolean getFirstMake();
   }

   public interface S2C_OpenEggUi_17238OrBuilder extends MessageOrBuilder {
      boolean hasFancyId();

      int getFancyId();

      List<CommonMsg.MapDataII> getSeniorRewardsList();

      CommonMsg.MapDataII getSeniorRewards(int index);

      int getSeniorRewardsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorRewardsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorRewardsOrBuilder(int index);

      boolean hasSmashEggNum();

      int getSmashEggNum();

      List<Integer> getTakedLuckList();

      int getTakedLuckCount();

      int getTakedLuck(int index);

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_PrayTaskList_18310OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_PrayTaskNotify_18308OrBuilder extends MessageOrBuilder {
      List<ActivityMsg.TaskData> getTaskList();

      ActivityMsg.TaskData getTask(int index);

      int getTaskCount();

      List<? extends ActivityMsg.TaskDataOrBuilder> getTaskOrBuilderList();

      ActivityMsg.TaskDataOrBuilder getTaskOrBuilder(int index);
   }

   public interface S2C_Pray_18307OrBuilder extends MessageOrBuilder {
      boolean hasFavorCount();

      int getFavorCount();

      boolean hasReceiveState();

      int getReceiveState();
   }

   public interface S2C_ServerDrawRecord_17240OrBuilder extends MessageOrBuilder {
      List<ServerDrawRecord> getServerRecordList();

      ServerDrawRecord getServerRecord(int index);

      int getServerRecordCount();

      List<? extends ServerDrawRecordOrBuilder> getServerRecordOrBuilderList();

      ServerDrawRecordOrBuilder getServerRecordOrBuilder(int index);
   }

   public interface S2C_SmashEgg_17234OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<CommonMsg.MapDataII> getSeniorNumList();

      CommonMsg.MapDataII getSeniorNum(int index);

      int getSeniorNumCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSeniorNumOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSeniorNumOrBuilder(int index);

      boolean hasSmashEggNum();

      int getSmashEggNum();

      boolean hasIsHaveFancy();

      boolean getIsHaveFancy();

      boolean hasFancyGroupDrawTimes();

      int getFancyGroupDrawTimes();
   }

   public interface S2C_StillCostTotalInfo_18357OrBuilder extends MessageOrBuilder {
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

   public interface S2C_TakeLuckReward_17236OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<Integer> getTakedIdList();

      int getTakedIdCount();

      int getTakedId(int index);
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
